/**
 *  Copyright 2017 FinTx
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fintx.crypto;

import java.io.FileInputStream;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * @author bluecreator(qiang.x.wang@gmail.com)
 *
 */
public class Keys {
    private Keys() {
        throw new AssertionError("No Keys instances for you!");
    }

    public SecretKey generateSecretKey(int size, byte[] seed, String algorithm) {
       
        try {
            //1.构造密钥生成器，指定为AES算法,不区分大小写
            KeyGenerator keygen = KeyGenerator.getInstance(algorithm);
          //2.根据ecnodeRules规则初始化密钥生成器
            //生成一个128位的随机源,根据传入的字节数组
            if (null == seed) {
                keygen.init(size);
            } else {
                keygen.init(size, new SecureRandom(seed));
            }

            //3.产生原始对称密钥
            return keygen.generateKey();
            //4.获得原始对称密钥的字节数组
            // return original_key.getEncoded();
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            throw new RuntimeException(e);
        }
    }

    public static SecretKey getSecretKey(byte[] raw, Ciphers.SymmetricAlgorithm algorithm) {
        return getSecretKey(raw, algorithm.getCode());
    }

    private static SecretKey getSecretKey(byte[] raw, String algorithm) {
        return new SecretKeySpec(raw, algorithm);
    }
    
    public static SecretKey getSecretKey(KeyStore ks, String alias, String password) throws Exception, NoSuchAlgorithmException {
        // 获得对称密钥
        return (SecretKey) ks.getKey(alias, password.toCharArray());
    }

    /**
     * 由KeyStore获得私钥
     *
     * @param keyStorePath 密钥库路径
     * @param alias 别名
     * @param password 密码
     * @return PrivateKey 私钥
     * @throws Exception
     */
    public static PrivateKey getPrivateKey(KeyStore ks, String alias, String password) throws Exception {
        // 获得私钥
        return (PrivateKey) ks.getKey(alias, password.toCharArray());
    }

    /**
     * 由KeyStore获得私钥
     *
     * @param keyStorePath 密钥库路径
     * @param alias 别名
     * @param password 密码
     * @return PrivateKey 私钥
     * @throws Exception
     */
    public static PublicKey getPublicKey(KeyStore ks, String alias, String password) throws Exception {
        // 获得私钥
        return (PublicKey) ks.getKey(alias, password.toCharArray());
    }

    /**
     * 由Certificate获得公钥
     *
     * @param certificatePath 证书路径
     * @return PublicKey 公钥
     * @throws Exception
     */
    public static PublicKey getPublicKey(Certificate certificate) throws Exception {
        // 获得证书
        // Certificate certificate = getCertificate(is);
        // 获得公钥
        return certificate.getPublicKey();
    }

    /**
     * 获得Certificate
     *
     * @param certificatePath 证书路径
     * @return Certificate 证书
     */
    public static Certificate getCertificate(InputStream is) throws Exception {
        // 实例化证书工厂
        CertificateFactory certificateFactory = CertificateFactory.getInstance(CertificateFactoryTypes.X509.code);
        // 生成证书
        Certificate certificate = certificateFactory.generateCertificate(is);
        // 关闭证书文件流
        is.close();
        return certificate;
    }

    /**
     * 获得Certificate
     *
     * @param certificatePath 证书路径
     * @return Certificate 证书
     */
    public static Certificate getCertificate(String certificatePath) throws Exception {
        // 实例化证书工厂
        CertificateFactory certificateFactory = CertificateFactory.getInstance(CertificateFactoryTypes.X509.code);
        // 取得证书文件流
        FileInputStream is = new FileInputStream(certificatePath);
        // 生成证书
        Certificate certificate = certificateFactory.generateCertificate(is);
        // 关闭证书文件流
        is.close();
        return certificate;
    }

    /**
     * 获得Certificate
     *
     * @param keyStorePath 密钥库路径
     * @param alias 别名
     * @param password 密码
     * @return Certificate 证书
     * @throws Exception
     */
    public static Certificate getCertificate(KeyStore ks, String alias, String password) throws Exception {
        if (null == ks || null == alias || null == password) {
            throw new RuntimeException("key or data or algorithm is null");
        }
        // 获得证书
        return ks.getCertificate(alias);
    }

    /**
     * 获得KeyStore
     *
     * @param keyStorePath 密钥库路径
     * @param password 密码
     * @return KeyStore 密钥库
     * @throws Exception
     */
    public static KeyStore getKeyStore(InputStream is, String password) throws Exception {
        // 实例化密钥库
        KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
        // 加载密钥库
        ks.load(is, password.toCharArray());
        // 关闭密钥库文件流
        is.close();
        return ks;
    }

    public static enum CertificateFactoryTypes {
        X509("X.509");
        private String code;

        CertificateFactoryTypes(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }
    }

}
