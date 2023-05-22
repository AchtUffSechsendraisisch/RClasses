/*
 * This file is part of RClasses - https://github.com/FlorianMichael/RClasses
 * Copyright (C) 2023 FlorianMichael/EnZaXD and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.florianmichael.rclasses.type.functional.consumers.single.number;

import java.util.function.Consumer;

@FunctionalInterface
public interface IntConsumer extends Consumer<Integer> {
    void acceptInt(final int value);

    @Deprecated
    default @Override void accept(final Integer value) {
        this.acceptInt(value);
    }

    default IntConsumer andThenInt(final IntConsumer after) {
        return (value) -> {
            this.acceptInt(value);
            after.acceptInt(value);
        };
    }

    @Deprecated
    default @Override Consumer<Integer> andThen(final Consumer<? super Integer> after) {
        return (value) -> {
            this.acceptInt(value);
            after.accept(value);
        };
    }
}