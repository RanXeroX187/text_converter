/*
 * Copyright (c) 2017 by Tran Le Duy
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

package com.duy.sharedcode.tools;

import android.support.annotation.NonNull;

import org.apache.commons.codec.binary.Base32;

/**
 * Created by Duy on 11-Jul-17.
 */

public class Base32Tool implements Encoder, Decoder {
    @NonNull
    @Override
    public String encode(@NonNull String text) {
        Base32 base32 = new Base32();
        return new String(base32.encode(text.getBytes()));
    }

    @NonNull
    @Override
    public String decode(@NonNull String text) {
        Base32 base32 = new Base32();
        return new String(base32.decode(text.getBytes()));
    }
}