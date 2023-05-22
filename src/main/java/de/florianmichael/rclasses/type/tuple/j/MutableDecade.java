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

package de.florianmichael.rclasses.type.tuple.j;

public final class MutableDecade<A, B, C, D, E, F, G, H, I, J> extends Decade<A, B, C, D, E, F, G, H, I, J> {
    private A first;
    private B second;
    private C third;
    private D fourth;
    private E fifth;
    private F sixth;
    private G seventh;
    private H eight;
    private I ninth;
    private J tenth;


    @SuppressWarnings("all")
    MutableDecade() {
        this(null, null, null, null, null, null, null, null, null, null);
    }


    public MutableDecade(final A first, final B second,
                         final C third, final D fourth,
                         final E fifth, final F sixth,
                         final G seventh, final H eight,
                         final I ninth, final J tenth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
        this.seventh = seventh;
        this.eight = eight;
        this.ninth = ninth;
        this.tenth = tenth;
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

    public @Override F getSixth() {
        return this.sixth;
    }

    public @Override G getSeventh() {
        return this.seventh;
    }

    public @Override H getEight() {
        return this.eight;
    }

    public @Override I getNinth() {
        return this.ninth;
    }

    public @Override J getTenth() {
        return this.tenth;
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

    public @Override void setSixth(final F sixth) {
        this.sixth = sixth;
    }

    public @Override void setSeventh(final G seventh) {
        this.seventh = seventh;
    }

    public @Override void setEight(final H eight) {
        this.eight = eight;
    }

    public @Override void setNinth(final I ninth) {
        this.ninth = ninth;
    }

    public @Override void setTenth(final J tenth) {
        this.tenth = tenth;
    }


    public @Override String toString() {
        return String.format(
                "MutableDecade{first=%s, second=%s, third=%s, fourth=%s, fifth=%s, sixth=%s, seventh=%s, eight=%s, ninth=%s, tenth=%s}",
                this.getFirst(),
                this.getSecond(),
                this.getThird(),
                this.getFourth(),
                this.getFifth(),
                this.getSixth(),
                this.getSeventh(),
                this.getEight(),
                this.getNinth(),
                this.getTenth()
        );
    }
}
