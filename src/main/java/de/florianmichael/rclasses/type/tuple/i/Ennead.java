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

package de.florianmichael.rclasses.type.tuple.i;


public abstract class Ennead<A, B, C, D, E, F, G, H, I> {

    public abstract A getFirst();

    public abstract B getSecond();

    public abstract C getThird();

    public abstract D getFourth();

    public abstract E getFifth();

    public abstract F getSixth();

    public abstract G getSeventh();

    public abstract H getEight();

    public abstract I getNinth();

    public abstract void setFirst(final A first);

    public abstract void setSecond(final B second);

    public abstract void setThird(final C third);

    public abstract void setFourth(final D third);

    public abstract void setFifth(final E fifth);

    public abstract void setSixth(final F sixth);

    public abstract void setSeventh(final G sixth);

    public abstract void setEight(final H eight);

    public abstract void setNinth(final I ninth);


    public @Override String toString() {
        return String.format(
                "Ennead{first=%s, second=%s, third=%s, fourth=%s, fifth=%s, sixth=%s, seventh=%s, eight=%s, ninth=%s}",
                this.getFirst(),
                this.getSecond(),
                this.getThird(),
                this.getFourth(),
                this.getFifth(),
                this.getSixth(),
                this.getSeventh(),
                this.getEight(),
                this.getNinth()
        );
    }
}
