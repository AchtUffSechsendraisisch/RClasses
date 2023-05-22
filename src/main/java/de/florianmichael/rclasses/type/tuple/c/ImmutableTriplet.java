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

package de.florianmichael.rclasses.type.tuple.c;


public final class ImmutableTriplet<A, B, C> extends Triplet<A, B, C> {
    private static final UnsupportedOperationException COULD_NOT_SET = new UnsupportedOperationException("immutable pair-values aren't re-assignable!");
    private final A first;
    private final B second;
    private final C third;


    @SuppressWarnings("all")
    ImmutableTriplet() {
        this(null, null, null);
    }


    public ImmutableTriplet(final A first, final B second, final C third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }


    public @Override A getFirst() {
        return this.first;
    }

    public @Override B getSecond() {
        return this.second;
    }

    public @Override C getThird() {
        return this.third;
    }

    public @Override void setFirst(final A first) throws UnsupportedOperationException {
        throw COULD_NOT_SET;
    }

    public @Override void setSecond(final B second) throws UnsupportedOperationException {
        throw COULD_NOT_SET;
    }

    public @Override void setThird(final C third) throws UnsupportedOperationException {
        throw COULD_NOT_SET;
    }


    public @Override String toString() {
        return String.format(
                "ImmutableTriplet{first=%s, second=%s, third=%s}",
                this.getFirst(),
                this.getSecond(),
                this.getThird()
        );
    }
}
