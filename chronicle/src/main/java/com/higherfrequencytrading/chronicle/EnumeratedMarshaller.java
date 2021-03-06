/*
 * Copyright 2013 Peter Lawrey
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.higherfrequencytrading.chronicle;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author peter.lawrey
 */
public interface EnumeratedMarshaller<E> {
    @NotNull
    public Class<E> classMarshaled();

    public void write(@NotNull Excerpt excerpt, E e);

    @Nullable
    public E read(@NotNull Excerpt excerpt);

    @Nullable
    public E parse(@NotNull Excerpt excerpt, @NotNull StopCharTester tester);
}
