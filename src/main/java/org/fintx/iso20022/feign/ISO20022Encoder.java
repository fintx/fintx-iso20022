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
package org.fintx.iso20022.feign;


import feign.RequestTemplate;
import feign.codec.EncodeException;
import feign.codec.Encoder;

import java.lang.reflect.Type;

/**
 * @author bluecreator(qiang.x.wang@gmail.com)
 *
 */
public class ISO20022Encoder implements Encoder {
   

    /*
     * (non-Javadoc)
     * 
     * @see feign.codec.Encoder#encode(java.lang.Object, java.lang.reflect.Type, feign.RequestTemplate)
     */
    public void encode(Object obj, Type type, RequestTemplate template) throws EncodeException {

    }

}
