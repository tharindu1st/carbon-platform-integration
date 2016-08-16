/*
<<<<<<< HEAD
*Copyright (c) 2005-2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
=======
*Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
>>>>>>> 3f9558b2230118e65976f5b9c54fa2aaf6ba7d92
*
*WSO2 Inc. licenses this file to you under the Apache License,
*Version 2.0 (the "License"); you may not use this file except
*in compliance with the License.
*You may obtain a copy of the License at
*
*http://www.apache.org/licenses/LICENSE-2.0
*
*Unless required by applicable law or agreed to in writing,
*software distributed under the License is distributed on an
*"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
*KIND, either express or implied.  See the License for the
*specific language governing permissions and limitations
*under the License.
*/

package org.wso2.carbon.automation.distributed.extentions;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.wso2.carbon.authenticator.stub.LoginAuthenticationExceptionException;
import org.wso2.carbon.automation.distributed.commons.BaseManager;
import org.wso2.carbon.automation.distributed.exceptions.AutomationFrameworkException;
import java.io.IOException;


/**
 * This extension class serves as container management extension.
 */
public class DistributedPlatformExtension extends ExecutionListenerExtension {

    private static final Log log = LogFactory.getLog(DistributedPlatformExtension.class);

    @Override
    public void initiate()
            throws AutomationFrameworkException {

        log.info("Executing DistributedPlatformExtension pluggable module");

        try {
            new BaseManager();
        } catch (IOException | GitAPIException | InterruptedException e) {
            log.error("Error found while initiating DistributedPlatformExtensio " + e.getMessage());
        } catch (LoginAuthenticationExceptionException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onExecutionStart() throws AutomationFrameworkException {
        System.out.println("Test");

    }

    @Override
    public void onExecutionFinish() throws AutomationFrameworkException {
        System.out.println("Test");


    }
}


