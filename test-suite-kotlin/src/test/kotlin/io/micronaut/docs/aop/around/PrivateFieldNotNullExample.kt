/*
 * Copyright 2017-2020 original authors
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
package io.micronaut.docs.aop.around

import jakarta.inject.Singleton
import java.util.concurrent.CompletableFuture

@Singleton
open class PrivateFieldNotNullExample {

    @NotNull
    open fun doWork(taskName: String?) =
        CompletableFuture.supplyAsync {
            println("$prefix$taskName")
            taskName
        }.get()

    companion object {
        private val prefix = "Doing job: "
    }
}
