/***************************************************************
Copyright � 2012 52�North Initiative for Geospatial Open Source Software GmbH

 Author: < >

 Contact: Andreas Wytzisk, 
 52�North Initiative for Geospatial Open Source SoftwareGmbH, 
 Martin-Luther-King-Weg 24,
 48155 Muenster, Germany, 
 info@52north.org

 This program is free software; you can redistribute it and/or
 modify it under the terms of the GNU General Public License
 version 2 as published by the Free Software Foundation.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; even without the implied WARRANTY OF
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program (see gnu-gpl v2.txt). If not, write to
 the Free Software Foundation, Inc., 59 Temple Place - Suite 330,
 Boston, MA 02111-1307, USA or visit the Free
 Software Foundation�s web page, http://www.fsf.org.

 ***************************************************************/
package org.n52.wps.aviation.spatialrelation;

import org.n52.wps.aviation.AlgorithmPublicName;
import org.n52.wps.aviation.SpatialAnalysisProvider;
import org.n52.wps.io.data.IData;

@AlgorithmPublicName({"Intersects"})
public class AIXMIntersects extends AbstractSpatialRelationAlgorithm {

	@Override
	protected boolean computeSpatialRelation(SpatialAnalysisProvider provider,
			IData feature1, IData feature2) {
		return provider.intersects(feature1, feature2);
	}
	
}