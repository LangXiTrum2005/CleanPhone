package com.badlogic.gdx.math;

import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Pool;

/* JADX INFO: loaded from: classes.dex */
public class Bresenham2 {
    private final Array<GridPoint2> points = new Array<>();
    private final Pool<GridPoint2> pool = new Pool<GridPoint2>() { // from class: com.badlogic.gdx.math.Bresenham2.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.badlogic.gdx.utils.Pool
        public GridPoint2 newObject() {
            return new GridPoint2();
        }
    };

    public Array<GridPoint2> line(GridPoint2 gridPoint2, GridPoint2 gridPoint3) {
        return line(gridPoint2.x, gridPoint2.y, gridPoint3.x, gridPoint3.y);
    }

    public Array<GridPoint2> line(int i, int i2, int i3, int i4) {
        this.pool.freeAll(this.points);
        this.points.clear();
        return line(i, i2, i3, i4, this.pool, this.points);
    }

    public Array<GridPoint2> line(int i, int i2, int i3, int i4, Pool<GridPoint2> pool, Array<GridPoint2> array) {
        int i5;
        int i6;
        int i7;
        int i8 = i3 - i;
        int i9 = i4 - i2;
        if (i8 < 0) {
            i5 = -1;
            i6 = -1;
        } else if (i8 > 0) {
            i5 = 1;
            i6 = 1;
        } else {
            i5 = 0;
            i6 = 0;
        }
        int i10 = i9 < 0 ? -1 : i9 > 0 ? 1 : 0;
        int iAbs = Math.abs(i8);
        int iAbs2 = Math.abs(i9);
        if (iAbs < iAbs2) {
            iAbs = Math.abs(i9);
            iAbs2 = Math.abs(i8);
            i7 = i9 >= 0 ? i9 > 0 ? 1 : 0 : -1;
            i6 = 0;
        } else {
            i7 = 0;
        }
        int i11 = iAbs2 << 1;
        int i12 = iAbs << 1;
        int i13 = 0;
        for (int i14 = 0; i14 <= iAbs; i14++) {
            GridPoint2 gridPoint2Obtain = pool.obtain();
            gridPoint2Obtain.set(i, i2);
            array.add(gridPoint2Obtain);
            i13 += i11;
            if (i13 > iAbs) {
                i13 -= i12;
                i += i5;
                i2 += i10;
            } else {
                i += i6;
                i2 += i7;
            }
        }
        return array;
    }
}
