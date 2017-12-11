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

import org.fintx.util.Bytes;

import java.io.InputStream;
import java.security.MessageDigest;

/**
 * @author bluecreator(qiang.x.wang@gmail.com)
 *
 */
public class Digests {
    private Digests() {
        throw new AssertionError("No Digests instance for you!");
    }

    public static String digest(byte[] data, Algorithm algorithm) {
        if (data == null || algorithm == null) {
            throw new RuntimeException("privateKey, data or algorithm is null");
        }
        return null;

    }

    public static String digest(InputStream in, Algorithm algorithm) {
        if (in == null || algorithm == null) {
            throw new RuntimeException("privateKey, data or algorithm is null");
        }
        try {
            MessageDigest md = MessageDigest.getInstance(algorithm.getCode());

            byte[] buffer = new byte[2048];
            int length = -1;
            long s = System.currentTimeMillis();
            while ((length = in.read(buffer)) != -1) {
                md.update(buffer, 0, length);
            }
            byte[] b = md.digest();
            return Bytes.byte2hex(b);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }

    }

    /**
     * 
     * @author bluecreator(qiang.x.wang@gmail.com)
     * 
     *         MD2 The MD2 message digest algorithm as defined in RFC 1319.
     * 
     *         MD5 The MD5 message digest algorithm as defined in RFC 1321.
     * 
     *         SHA-1 SHA-224 SHA-256 SHA-384 SHA-512 Hash algorithms defined in the FIPS PUB 180-4. Secure hash algorithms - SHA-1, SHA-224, SHA-256, SHA-384,
     *         SHA-512 - for computing a condensed representation of electronic data (message). When a message of any length less than 2^64 bits (for SHA-1,
     *         SHA-224, and SHA-256) or less than 2^128 (for SHA-384 and SHA-512) is input to a hash algorithm, the result is an output called a message digest.
     *         A message digest ranges in length from 160 to 512 bits, depending on the algorithm.
     *
     * 
     */
    public enum Algorithm {
        MD2(""), MD5(""), SHA1("SHA-1"), SHA224("SHA-224"), SHA256("SHA-256"), SHA384("SHA-384"), SHA512("SHA-512");

        private String code;

        Algorithm(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }
    }

}
