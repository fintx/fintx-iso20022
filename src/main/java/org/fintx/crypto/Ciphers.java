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

import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/**
 * @author bluecreator(qiang.x.wang@gmail.com)
 *
 */
public class Ciphers {
    private Ciphers() {
        throw new AssertionError("No Ciphers instance for you!");
    }

    public static byte[] encrypt(SecretKey secretKey, byte[] data) {

        return encrypt(secretKey, data);
    }

    public static byte[] encrypt(PublicKey secretKey, byte[] data) {
        return encrypt(secretKey, data);
    }

    public static byte[] encrypt(PrivateKey secretKey, byte[] data) {
        return encrypt(secretKey, data);
    }

    private static byte[] encrypt(Key key, byte[] data) {
        if (key == null || data == null) {
            throw new RuntimeException("secretKey or data is null");
        }
        try {
            // //1.构造密钥生成器，指定为AES算法,不区分大小写
            // KeyGenerator keygen=KeyGenerator.getInstance("AES");
            // //2.根据ecnodeRules规则初始化密钥生成器
            // //生成一个128位的随机源,根据传入的字节数组
            // keygen.init(128, new SecureRandom(encodeRules.getBytes()));
            // //3.产生原始对称密钥
            // SecretKey original_key=keygen.generateKey();
            // //4.获得原始对称密钥的字节数组
            // byte [] raw=original_key.getEncoded();
            // //5.根据字节数组生成AES密钥
            // SecretKey key=new SecretKeySpec(raw, "AES");
            // 6.根据指定算法AES自成密码器
            Cipher cipher = Cipher.getInstance(key.getAlgorithm());
            // 7.初始化密码器，第一个参数为加密(Encrypt_mode)或者解密解密(Decrypt_mode)操作，第二个参数为使用的KEY
            cipher.init(Cipher.ENCRYPT_MODE, key);
            // 8.获取加密内容的字节数组(这里要设置为utf-8)不然内容中如果有中文和英文混合中文就会解密为乱码
            // byte [] byte_encode=content.getBytes("utf-8");
            // 9.根据密码器的初始化方式--加密：将数据加密
            return cipher.doFinal(data);
            // 10.将加密后的数据转换为字符串
            // 这里用Base64Encoder中会找不到包
            // 解决办法：
            // 在项目的Build path中先移除JRE System Library，再添加库JRE System Library，重新编译后就一切正常了。
            // String AES_encode=new String(Base64.getEncoder().encode(byte_AES));
            // 11.将字符串返回
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                throw (RuntimeException) e;
            } else {
                throw new RuntimeException(e);
            }
        }
    }

    public static byte[] decrypt(SecretKey secretKey, byte[] data) {
        return decrypt(secretKey, data);
    }

    public static byte[] decrypt(PublicKey secretKey, byte[] data) {
        return decrypt(secretKey, data);
    }

    public static byte[] decrypt(PrivateKey secretKey, byte[] data) {
        return decrypt(secretKey, data);
    }

    private static byte[] decrypt(Key key, byte[] data) {
        if (key == null || data == null) {
            throw new RuntimeException("key or data is null");
        }
        try {
            // //1.构造密钥生成器，指定为AES算法,不区分大小写
            // KeyGenerator keygen=KeyGenerator.getInstance("AES");
            // //2.根据ecnodeRules规则初始化密钥生成器
            // //生成一个128位的随机源,根据传入的字节数组
            // keygen.init(128, new SecureRandom(encodeRules.getBytes()));
            // //3.产生原始对称密钥
            // SecretKey original_key=keygen.generateKey();
            // //4.获得原始对称密钥的字节数组
            // byte [] raw=original_key.getEncoded();
            // //5.根据字节数组生成AES密钥
            // SecretKey key=new SecretKeySpec(raw, "AES");
            // 6.根据指定算法AES自成密码器
            Cipher cipher = Cipher.getInstance(key.getAlgorithm());
            // 7.初始化密码器，第一个参数为加密(Encrypt_mode)或者解密解密(Decrypt_mode)操作，第二个参数为使用的KEY
            cipher.init(Cipher.DECRYPT_MODE, key);
            // 8.获取加密内容的字节数组(这里要设置为utf-8)不然内容中如果有中文和英文混合中文就会解密为乱码
            // byte [] byte_encode=content.getBytes("utf-8");
            // 9.根据密码器的初始化方式--加密：将数据加密
            return cipher.doFinal(data);
            // 10.将加密后的数据转换为字符串
            // 这里用Base64Encoder中会找不到包
            // 解决办法：
            // 在项目的Build path中先移除JRE System Library，再添加库JRE System Library，重新编译后就一切正常了。
            // String AES_encode=new String(Base64.getEncoder().encode(byte_AES));
            // 11.将字符串返回
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                throw (RuntimeException) e;
            } else {
                throw new RuntimeException(e);
            }
        }

    }

    /**
     * 
     * @author bluecreator(qiang.x.wang@gmail.com)
     * 
     *         AES Advanced Encryption Standard as specified by NIST in FIPS 197. Also known as the Rijndael algorithm by Joan Daemen and Vincent Rijmen, AES is
     *         a 128-bit block cipher supporting keys of 128, 192, and 256 bits. To use the AES cipher with only one valid key size, use the format AES_<n>,
     *         where <n> can be 128, 192, or 256.
     * 
     *         AESWrap The AES key wrapping algorithm as described in RFC 3394. To use the AESWrap cipher with only one valid key size, use the format
     *         AESWrap_<n>, where <n> can be 128, 192, or 256.
     * 
     *         ARCFOUR A stream cipher believed to be fully interoperable with the RC4 cipher developed by Ron Rivest. For more information, see K. Kaukonen and
     *         R. Thayer, "A Stream Cipher Encryption Algorithm 'Arcfour'", Internet Draft (expired), draft-kaukonen-cipher-arcfour-03.txt. Blowfish The
     * 
     *         Blowfish block cipher designed by Bruce Schneier.
     * 
     *         DES The Digital Encryption Standard as described in FIPS PUB 46-3.
     * 
     *         DESede Triple DES Encryption (also known as DES-EDE, 3DES, or Triple-DES). Data is encrypted using the DES algorithm three separate times. It is
     *         first encrypted using the first subkey, then decrypted with the second subkey, and encrypted with the third subkey.
     * 
     *         DESedeWrap The DESede key wrapping algorithm as described in RFC 3217 .
     * 
     *         ECIES Elliptic Curve Integrated Encryption Scheme
     * 
     *         PBEWith<digest>And<encryption> PBEWith<prf>And<encryption> The password-based encryption algorithm found in (PKCS5), using the specified message
     *         digest (<digest>) or pseudo-random function (<prf>) and encryption algorithm (<encryption>). Examples: ##PBEWithMD5AndDES: The password-based
     *         encryption algorithm as defined in RSA Laboratories, "PKCS #5: Password-Based Encryption Standard," version 1.5, Nov 1993. Note that this
     *         algorithm implies CBC as the cipher mode and PKCS5Padding as the padding scheme and cannot be used with any other cipher modes or padding
     *         schemes. ##PBEWithHmacSHA256AndAES_128: The password-based encryption algorithm as defined in RSA Laboratories, "PKCS #5: Password-Based
     *         Cryptography Standard," version 2.0, September 2000 .
     * 
     *         RC2 Variable-key-size encryption algorithms developed by Ron Rivest for RSA Data Security, Inc.
     * 
     *         RC4 Variable-key-size encryption algorithms developed by Ron Rivest for RSA Data Security, Inc. (See note prior for ARCFOUR.)
     * 
     *         RC5 Variable-key-size encryption algorithms developed by Ron Rivest for RSA Data Security, Inc.
     * 
     *         RSA The RSA encryption algorithm as defined in PKCS #1
     *
     * 
     */

    public enum SymmetricAlgorithm {
        AES, AES_128, AES_192, AES_256, AESWrap, AESWrap_128, AESWrap_192, AESWrap_256, ARCFOUR, Blowfish, DES, DESede, DESedeWrap, RC2, RC4, RC5;

        public String getCode() {
            return name();
        }
    }

    public enum AsymmetricAlgorithm {
        RSA;
        public String getCode() {
            return name();
        }
    }

    public enum AlgorithmMode {
        MD2(""), MD5(""), SHA1("SHA-1"), SHA224("SHA-224"), SHA256("SHA-256"), SHA384("SHA-384"), SHA512("SHA-512");

        private String code;

        AlgorithmMode(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }
    }

    public enum AlgorithmPadding {
        MD2(""), MD5(""), SHA1("SHA-1"), SHA224("SHA-224"), SHA256("SHA-256"), SHA384("SHA-384"), SHA512("SHA-512");

        private String code;

        AlgorithmPadding(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }
    }

}
