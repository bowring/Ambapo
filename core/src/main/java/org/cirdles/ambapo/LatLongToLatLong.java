/*
 * Copyright 2006-2017 CIRDLES.org.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.cirdles.ambapo;

import java.math.BigDecimal;

/**
 *
 * @author evc1996
 */
public class LatLongToLatLong {
    
    public static Coordinate convert(BigDecimal latitude, BigDecimal longitude, String fromDatumString, String toDatumString) throws Exception
    {
        UTM utm = LatLongToUTM.convert(latitude, longitude, fromDatumString);
        Coordinate coordinate = UTMToLatLong.convert(utm, toDatumString);
        
        return coordinate;
    }
}
