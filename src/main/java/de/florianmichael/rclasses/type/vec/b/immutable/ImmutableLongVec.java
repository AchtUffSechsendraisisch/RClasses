package de.florianmichael.rclasses.type.vec.b.immutable;

import de.florianmichael.rclasses.type.vec.b.LongVec;

public final class ImmutableLongVec extends LongVec {
    private final long x, y, z;


    @SuppressWarnings("all")
    ImmutableLongVec() {
        this(0, 0, 0);
    }


    public ImmutableLongVec(final long x, final long y, final long z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public @Override long getX() {
        return this.x;
    }

    public @Override long getY() {
        return this.y;
    }

    public @Override long getZ() {
        return this.z;
    }

    public @Override void setX(final long x) {
    }

    public @Override void setY(final long y) {
    }

    public @Override void setZ(final long z) {
    }


    public @Override String toString() {
        return String.format(
                "ImmutableLongVec{x=%d, y=%d, z=%d}",
                this.getX(),
                this.getY(),
                this.getZ()
        );
    }
}
