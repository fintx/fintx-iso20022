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
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;

/**
 * @author bluecreator(qiang.x.wang@gmail.com)
 *
 */
public final class Signatures {
    private Signatures() {
        throw new AssertionError("No HttpClient instances for you!");
    }

    private static Comparator comp = new Comparator() {

        public boolean compatible(String algorithm1, String algorithm2) {
            if (-1 != algorithm1.replaceAll("-", "").indexOf(algorithm2)) {
                return true;
            } else {
                return false;
            }
        }

    };

    public static void setComparator(Comparator comp) {
        if (null != comp) {
            Signatures.comp = comp;
        } else {
            throw new NullPointerException("comp should not be null");
        }

    }

    // ----Signature
    public static byte[] sign(PrivateKey privateKey, byte[] data, Algorithm algorithm) {
        return sign(privateKey, data, algorithm.getCode());
    }

    public static byte[] sign(PrivateKey privateKey, byte[] data, X509Certificate certificate) throws Exception {
        return sign(privateKey, data, certificate.getSigAlgName());
    }

    private static byte[] sign(PrivateKey privateKey, byte[] data, String algorithm) {
        if (privateKey == null || data == null || algorithm == null) {
            throw new RuntimeException("privateKey, data or algorithm is null");
        }
        if (comp.compatible(privateKey.getAlgorithm(), algorithm)) {
            throw new RuntimeException("privateKey and Signature algorithm not compatible!");
        }
        try {
            Signature signature = Signature.getInstance(algorithm);

            signature.initSign(privateKey);

            signature.update(data);

            return signature.sign();

        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                throw (RuntimeException) e;
            } else {
                throw new RuntimeException(e);
            }
        }
    }

    public static boolean verify(PublicKey publicKey, byte[] sig, byte[] data, Algorithm algorithm) {
        return verify(publicKey, sig, data, algorithm.getCode());
    }

    public static boolean verify(PublicKey publicKey, byte[] sig, byte[] data, X509Certificate certificate) {
        return verify(publicKey, sig, data, certificate.getSigAlgName());
    }

    private static boolean verify(PublicKey publicKey, byte[] sig, byte[] data, String algorithm) {
        if (publicKey == null || sig == null || data == null || algorithm == null) {
            throw new RuntimeException("publicKey or signature or data or algorithm is null");
        }
        if (comp.compatible(publicKey.getAlgorithm(), algorithm)) {
            throw new RuntimeException("privateKey and Signature algorithm not compatible!");
        }
        try {
            Signature signature = Signature.getInstance(algorithm);

            signature.initVerify(publicKey);

            signature.update(data);

            return signature.verify(sig);
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                throw (RuntimeException) e;
            } else {
                throw new RuntimeException(e);
            }
        }
    }

    public static boolean verify(PublicKey publicKey, byte[] sig, InputStream in, Algorithm algorithm) {
        return verify(publicKey, sig, in, algorithm.getCode());
    }

    public static boolean verify(PublicKey publicKey, byte[] sig, InputStream in, X509Certificate certificate) {
        return verify(publicKey, sig, in, certificate.getSigAlgName());
    }

    private static boolean verify(PublicKey publicKey, byte[] sig, InputStream in, String algorithm) {
        if (publicKey == null || sig == null || in == null || algorithm == null) {
            throw new RuntimeException("publicKey or signature or data or algorithm is null");
        }
        if (comp.compatible(publicKey.getAlgorithm(), algorithm)) {
            throw new RuntimeException("publicKey and Signature algorithm not compatible!");
        }
        try {
            Signature signature = Signature.getInstance(algorithm);

            signature.initVerify(publicKey);

            byte[] buffer = new byte[2048];
            int length = -1;
            while ((length = in.read(buffer)) != -1) {
                signature.update(buffer, 0, length);
            }
            return signature.verify(sig);
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
     *         NONEwithRSA The RSA signature algorithm, which does not use a digesting algorithm (for example, MD5/SHA1) before performing the RSA operation.
     *         For more information about the RSA Signature algorithms, see PKCS #1. MD2withRSA MD5withRSA The MD2/MD5 with RSA Encryption signature algorithm,
     *         which uses the MD2/MD5 digest algorithm and RSA to create and verify RSA digital signatures as defined in PKCS #1.
     * 
     *         SHA1withRSA SHA224withRSA SHA256withRSA SHA384withRSA SHA512withRSA The signature algorithm with SHA-* and the RSA encryption algorithm as
     *         defined in the OSI Interoperability Workshop, using the padding conventions described in PKCS #1.
     * 
     *         NONEwithDSA The Digital Signature Algorithm as defined in FIPS PUB 186-2. The data must be exactly 20 bytes in length. This algorithm is also
     *         known as rawDSA.
     * 
     *         SHA1withDSA SHA224withDSA SHA256withDSA The DSA signature algorithms that use the SHA-1, SHA-224, or SHA-256 digest algorithms to create and
     *         verify digital signatures as defined in FIPS PUB 186-3.
     * 
     *         NONEwithECDSA SHA1withECDSA SHA224withECDSA SHA256withECDSA SHA384withECDSA SHA512withECDSA (ECDSA) The ECDSA signature algorithms as defined in
     *         ANSI X9.62. Note:"ECDSA" is an ambiguous name for the "SHA1withECDSA" algorithm and should not be used. The formal name "SHA1withECDSA" should be
     *         used instead.
     * 
     *         <digest>with<encryption> Use this to form a name for a signature algorithm with a particular message digest (such as MD2 or MD5) and algorithm
     *         (such as RSA or DSA), just as was done for the explicitly defined standard names in this section (MD2withRSA, and so on). For the new signature
     *         schemes defined in PKCS #1 v 2.0, for which the <digest>with<encryption> form is insufficient, <digest>with<encryption>and<mgf> can be used to
     *         form a name. Here, <mgf> should be replaced by a mask generation function such as MGF1. Example: MD5withRSAandMGF1.
     *
     */

    public enum Algorithm {
        NONEwithRSA, SHA1withRSA, SHA224withRSA, SHA256withRSA, SHA384withRSA, SHA512withRSA, NONEwithDSA, SHA1withDSA, SHA224withDSA, SHA256withDSA,
        NONEwithECDSA, SHA1withECDSA, SHA224withECDSA, SHA256withECDSA, SHA384withECDSA, SHA512withECDSA, ECDSA;
        public String getCode() {
            return name();
        }

        public String getDigestAlgorithm() {
            int indexOfWith = this.name().indexOf("with");
            if (-1 != indexOfWith) {
                return this.name().substring(0, indexOfWith);
            } else {
                return "SHA1"; // ECDSA
            }

        }

        public String getCipherAlgorithm() {
            int indexOfWith = this.name().indexOf("with");
            int indexOfAnd = this.name().indexOf("and");
            if (-1 != indexOfWith) {
                if (-1 != indexOfAnd) {
                    return this.name().substring(indexOfWith + 4, indexOfAnd);
                } else {
                    return this.name().substring(indexOfWith + 4);
                }
            } else {
                return this.name();// ECDSA
            }

        }

        public String getMaskFunction() {
            int indexOfAnd = this.name().indexOf("and");
            if (-1 != indexOfAnd) {

                return this.name().substring(indexOfAnd + 3);
            } else {
                return "";// TODO should return the default mask generation function
            }

        }

    }

    public interface Comparator {
        public boolean compatible(String algorithm1, String algorithm2);
    }

}
