/*
 *  Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package ${package};

import java.util.logging.Logger;

/**
 * This is a sample class.
 */
public class Greeter {
    Logger logger = Logger.getLogger(Greeter.class.getName());

    public void sayHello() {
        logger.info("Hello World !");
    }

    public void sayGoodbye() {
        logger.info("Good Bye !");
    }
}
