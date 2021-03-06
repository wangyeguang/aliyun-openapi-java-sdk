/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class PutConfigItemsForFlatRequest extends RpcAcsRequest<PutConfigItemsForFlatResponse> {
	
	public PutConfigItemsForFlatRequest() {
		super("CloudCallCenter", "2017-07-05", "PutConfigItemsForFlat", "CloudCallCenter", "innerAPI");
	}

	private String instanceId;

	private List<String> configItems;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public List<String> getConfigItems() {
		return this.configItems;
	}

	public void setConfigItems(List<String> configItems) {
		this.configItems = configItems;	
		if (configItems != null) {
			for (int i = 0; i < configItems.size(); i++) {
				putQueryParameter("ConfigItem." + (i + 1) , configItems.get(i));
			}
		}	
	}

	@Override
	public Class<PutConfigItemsForFlatResponse> getResponseClass() {
		return PutConfigItemsForFlatResponse.class;
	}

}
