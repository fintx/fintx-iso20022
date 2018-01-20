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

import javax.crypto.Mac;
import javax.crypto.SecretKey;

/**
 * ##Message Authentication Codes (MAC): like MessageDigests, these also generate hash values, but are first initialized with keys to protect the integrity of
 * messages.
 * 
 * @author bluecreator(qiang.x.wang@gmail.com)
 *
 */
public class Macs {

    private Macs() {
        throw new AssertionError("No Macs instance for you!");
    }

    public static byte[] mac(SecretKey secretKey, byte[] data) {

        return mac(secretKey, data);
    }

    private static byte[] mac(Key key, byte[] data) {
        if (key == null || data == null) {
            throw new RuntimeException("secretKey or data or algorithm is null");
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
            Mac mac = Mac.getInstance(key.getAlgorithm());
            // 7.初始化密码器，第一个参数为加密(Encrypt_mode)或者解密解密(Decrypt_mode)操作，第二个参数为使用的KEY
            mac.init(key);
            // 8.获取加密内容的字节数组(这里要设置为utf-8)不然内容中如果有中文和英文混合中文就会解密为乱码
            // byte [] byte_encode=content.getBytes("utf-8");
            // 9.根据密码器的初始化方式--加密：将数据加密
            return mac.doFinal(data);
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

}
