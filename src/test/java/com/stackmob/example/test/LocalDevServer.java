/**
 * Copyright 2012 StackMob
 *
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

package com.stackmob.example.test;

import com.stackmob.core.jar.JarEntryObject;
import com.stackmob.example.EntryPointExtender;
import com.stackmob.customcode.dev.server.CustomCodeServer;

public class LocalDevServer {
    public static void main(String[] args) {
        JarEntryObject entryObject = new EntryPointExtender();
        CustomCodeServer.serve(entryObject, "254649b7-5226-4aab-98b5-8df3157c2976", "13ffba4c-7f89-4874-946c-5c6b1557f9ad", 8080);
    }
}
