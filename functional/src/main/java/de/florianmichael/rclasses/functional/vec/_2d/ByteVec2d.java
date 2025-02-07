/*
 * This file is part of RClasses - https://github.com/FlorianMichael/RClasses
 * Copyright (C) 2023 FlorianMichael/EnZaXD and contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.florianmichael.rclasses.functional.vec._2d;

/**
 * This class represents a 2-dimensional vector with two {@code byte} values.
 */
public abstract class ByteVec2d {

    public abstract byte getX();
    public abstract byte getY();

    public abstract void setX(final byte x);
    public abstract void setY(final byte y);

    @Override
    public String toString() {
        return "ByteVec2d{" +
                "x=" + this.getX() +
                ", y=" + this.getY() +
                "}";
    }
}
