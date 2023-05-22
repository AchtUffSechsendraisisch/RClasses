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

package de.florianmichael.rclasses.type.tuple.e;


public final class MutableQuintet<A, B, C, D, E> extends Quintet<A, B, C, D, E> {
    private A first;
    private B second;
    private C third;
    private D fourth;
    private E fifth;


    @SuppressWarnings("all")
    MutableQuintet() {
        this(null, null, null, null, null);
    }


    public MutableQuintet(final A first, final B second,
                          final C third, final D fourth, final E fifth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
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

    public @Override D getFourth() {
        return this.fourth;
    }

    public @Override E getFifth() {
        return this.fifth;
    }

    public @Override void setFirst(final A first) {
        this.first = first;
    }

    public @Override void setSecond(final B second) {
        this.second = second;
    }

    public @Override void setThird(final C third) {
        this.third = third;
    }

    public @Override void setFourth(final D fourth) {
        this.fourth = fourth;
    }

    public @Override void setFifth(final E fifth) {
        this.fifth = fifth;
    }


    public @Override String toString() {
        return String.format(
                "MutableQuintet{first=%s, second=%s, third=%s, fourth=%s, fifth=%s}",
                this.getFirst(),
                this.getSecond(),
                this.getThird(),
                this.getFourth(),
                this.getFifth()
        );
    }
}
