import java.io.UnsupportedEncodingException;

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

/**
 * @author bluecreator(qiang.x.wang@gmail.com)
 *
 */
public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        toArray(new int[10]);
        String s;
        try {
            //?? UTF8下汉子占3个字节  而char是两个字节
            //If the char value specified by the index is a surrogate, the surrogate value is returned
            s = new String("起来，不原做".getBytes(),"UTF8");
            System.out.println(s.length()+"  "+s.charAt(1));
            int i="SHA1withECDSA".indexOf("with");
            System.out.println(i);
            System.out.println("SHA1withECDSA".substring(0, i));
            System.out.println("SHA1withECDSA".substring(i+4));
            System.out.println("SHA-256".replaceAll("-", "").indexOf("SHA1"));
            int i0="MD5withRSAandMGF1".indexOf("with");
            int i1="MD5withRSAandMGF1".indexOf("and");
            System.out.println("MD5withRSAandMGF1".substring(i0+4,i1));
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

    }
    public static <T> T toArray(final T items) {
        return items;
    }


}
