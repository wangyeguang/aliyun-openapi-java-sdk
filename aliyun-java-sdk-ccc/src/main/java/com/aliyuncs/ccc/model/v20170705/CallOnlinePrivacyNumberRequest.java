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

package com.aliyuncs.ccc.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CallOnlinePrivacyNumberRequest extends RpcAcsRequest<CallOnlinePrivacyNumberResponse> {
	
	public CallOnlinePrivacyNumberRequest() {
		super("CCC", "2017-07-05", "CallOnlinePrivacyNumber");
	}

	private String telA;

	private String telB;

	private String instanceId;

	public String getTelA() {
		return this.telA;
	}

	public void setTelA(String telA) {
		this.telA = telA;
		if(telA != null){
			putQueryParameter("TelA", telA);
		}
	}

	public String getTelB() {
		return this.telB;
	}

	public void setTelB(String telB) {
		this.telB = telB;
		if(telB != null){
			putQueryParameter("TelB", telB);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	@Override
	public Class<CallOnlinePrivacyNumberResponse> getResponseClass() {
		return CallOnlinePrivacyNumberResponse.class;
	}

}
