/*
 * This file is part of RClasses - https://github.com/FlorianMichael/RClasses
 * Copyright (C) 2023 FlorianMichael/EnZaXD and contributors
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.florianmichael.rclasses.common.model.os;

/**
 * This class represents the architecture of the operating system.
 */
public class OSArchitecture {

    public final boolean amd64;
    public final boolean x86;
    public final boolean arm64;
    public final boolean arm;
    public final boolean ia64;
    public final boolean mips64;
    public final boolean mips;
    public final boolean ppc64;
    public final boolean s390x;
    public final boolean sparc;
    public final boolean s390;

    public OSArchitecture(String archString) {
        archString = archString.toLowerCase();
        amd64 = archString.contains("amd64");
        x86 = archString.contains("x86_64") || archString.contains("x86-64") || archString.contains("x64");
        arm = archString.contains("arm");
        arm64 = archString.contains("arm64");
        ia64 = archString.contains("ia64");
        mips64 = archString.contains("mips64");
        ppc64 = archString.contains("ppc64");
        s390x = archString.contains("s390x");
        mips = archString.contains("mips");
        sparc = archString.contains("sparc");
        s390 = archString.contains("s390");
    }

    public boolean is64Bit() {
        return arm64 || amd64 || mips64 || ppc64 || sparc || ia64;
    }
}
