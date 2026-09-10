package com.mbridge.msdk.playercommon.exoplayer2.util;

import defpackage.e;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class LongArray {
    private static final int DEFAULT_INITIAL_CAPACITY = 32;
    private int size;
    private long[] values;

    public LongArray() {
        this(32);
    }

    public void add(long j10) {
        int i10 = this.size;
        long[] jArr = this.values;
        if (i10 == jArr.length) {
            this.values = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.values;
        int i11 = this.size;
        this.size = i11 + 1;
        jArr2[i11] = j10;
    }

    public long get(int i10) {
        if (i10 >= 0 && i10 < this.size) {
            return this.values[i10];
        }
        StringBuilder sbU = e.u(i10, "Invalid index ", ", size is ");
        sbU.append(this.size);
        throw new IndexOutOfBoundsException(sbU.toString());
    }

    public int size() {
        return this.size;
    }

    public long[] toArray() {
        return Arrays.copyOf(this.values, this.size);
    }

    public LongArray(int i10) {
        this.values = new long[i10];
    }
}
