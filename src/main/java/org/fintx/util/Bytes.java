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
package org.fintx.util;

/**
 * @author bluecreator(qiang.x.wang@gmail.com)
 *
 */
public class Bytes {
    private static final char[] HEX_CHARS = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
//    public static byte[] hex2byte(String inbuf) {
//        int len = inbuf.length() / 2;
//        byte[] outbuf = new byte[len];
//
//        for (int i = 0; i < len; i++) {
//            String tmpbuf = inbuf.substring(i * 2, i * 2 + 2);
//
//            outbuf[i] = ((byte) Integer.parseInt(tmpbuf, 16));
//        }
//
//        return outbuf;
//    }
//
//    public static String byte2hex(byte[] inbuf) {
//        StringBuffer strBuf = new StringBuffer();
//
//        for (int i = 0; i < inbuf.length; i++) {
//            String byteStr = Integer.toHexString(inbuf[i] & 0xFF);
//            if (byteStr.length() != 2) {
//                strBuf.append('0').append(byteStr);
//            } else {
//                strBuf.append(byteStr);
//            }
//        }
//
//        return new String(strBuf);
//    }
//    
    public static byte[] int2bytes(final int num) {
        byte[] bytes = new byte[4];
        for (int ix = 0; ix < 4; ++ix) {
            int offset = 32 - (ix + 1) * 8;
            bytes[ix] = (byte) ((num >> offset) & 0xff);
        }
        return bytes;
    }

    public static int bytes2int(final byte[] bytes) {
        if (bytes.length > 4) {
            throw new RuntimeException("byteNum is too long for a int type:" + bytes.length);
        }
        int num = 0;
        for (int ix = 0; ix < bytes.length; ++ix) {
            num <<= 8;
            num |= (bytes[ix] & 0xff);
        }
        return num;
    }

    public static byte[] long2bytes(final long num) {
        byte[] bytes = new byte[8];
        for (int ix = 0; ix < 8; ++ix) {
            int offset = 64 - (ix + 1) * 8;
            bytes[ix] = (byte) ((num >> offset) & 0xff);
        }
        return bytes;
    }

    public static long bytes2long(final byte[] bytes) {
        if (bytes.length > 8) {
            throw new RuntimeException("byteNum is too long for a long type:" + bytes.length);
        }
        long num = 0;
        for (int ix = 0; ix < bytes.length; ++ix) {
            num <<= 8;
            num |= (bytes[ix] & 0xff); // byte become 64bit since the index 1 with higher bit 1? & 0xff make higher bit 0
        }
        return num;
    }
    
    /**
     * Converts byte array into a hexadecimal string representation.
     * 
     * @param bytes the byte array
     * @return a string
     */
    public static String byte2hex(byte[] bytes) {
        char[] chars = new char[bytes.length * 2];
        int i = 0;
        for (byte b : bytes) {
            chars[i++] = HEX_CHARS[b >> 4 & 0xf];
            chars[i++] = HEX_CHARS[b & 0xf];
        }
        return new String(chars);
    }
    
    /**
     * Parse the hexadecimal string (base16 encoding) to byte array.
     * 
     * @param s the hexadecimal string
     * @return
     */
    public static byte[] hex2byte(final String hex) {
        if (!isValidHex(hex)) {
            throw new IllegalArgumentException("invalid hexadecimal representation of an UniqueId: [" + hex + "]");
        }
        int len = hex.length() / 2;
        byte[] b = new byte[len];
        for (int i = 0; i < b.length; i++) {
            b[i] = (byte) Integer.parseInt(hex.substring(i * 2, i * 2 + 2), 16);
        }
        return b;
    }
    
    /**
     * Checks if a string could be an {@code UniqueId}.
     *
     * @param idString hexString (base16) or base64String, a potential UniqueId as a String.
     * @return whether the string could be an object id
     * @throws IllegalArgumentException if hexString is null
     */
    public static boolean isValidHex(final String idString) {
        if (idString == null) {
            throw new IllegalArgumentException("Argument should not be null!");
        }
        
        for (int i = 0; i < idString.length(); i++) {
            char c = idString.charAt(i);
            if (c >= '0' && c <= '9') {
                continue;
            } else if (c >= 'a' && c <= 'f') {
                continue;
            } else if (c >= 'A' && c <= 'F') {
                continue;
            } else {
                return false;
            }
        }

      return true;

    }

}
