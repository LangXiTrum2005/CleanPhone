package com.startapp.simple.bloomfilter.algo;

import android.support.v4.media.a;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class OpenBitSet implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int PAGE_COUNT_LIMIT = 100;
    public static final int PAGE_SIZE = 4096;
    private static final long serialVersionUID = -901334831550831262L;
    private final long[][] bits;
    private final int pageCount;
    private int wlen;

    public OpenBitSet(long j) {
        int iBits2words = bits2words(j);
        this.wlen = iBits2words;
        int i2 = iBits2words % 4096;
        int i3 = iBits2words / 4096;
        int i4 = (i2 == 0 ? 0 : 1) + i3;
        this.pageCount = i4;
        if (i4 > 100) {
            throw new RuntimeException(a.h(i4, "HighPageCountException pageCount = "));
        }
        this.bits = new long[i4][];
        for (int i5 = 0; i5 < i3; i5++) {
            this.bits[i5] = new long[4096];
        }
        if (i2 != 0) {
            long[][] jArr = this.bits;
            jArr[jArr.length - 1] = new long[i2];
        }
    }

    private int bits2words(long j) {
        return (int) (((j - 1) >>> 6) + 1);
    }

    private void ensureCapacity(long j) {
        ensureCapacityWords(bits2words(j));
    }

    private void ensureCapacityWords(int i2) {
    }

    private int expandingWordNum(long j) {
        int i2 = (int) (j >> 6);
        if (i2 >= this.wlen) {
            ensureCapacity(j + 1);
            this.wlen = i2 + 1;
        }
        return i2;
    }

    public int getNumWords() {
        return this.wlen;
    }

    public long[] getPage(int i2) {
        return this.bits[i2];
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public boolean indexInBits(long j) {
        int i2 = (int) (j >> 6);
        return i2 < this.wlen && ((1 << (((int) j) & 63)) & this.bits[i2 / 4096][i2 % 4096]) != 0;
    }

    public void set(long j) {
        int iExpandingWordNum = expandingWordNum(j);
        long[] jArr = this.bits[iExpandingWordNum / 4096];
        int i2 = iExpandingWordNum % 4096;
        jArr[i2] = (1 << (((int) j) & 63)) | jArr[i2];
    }

    public long size() {
        return ((long) this.wlen) << 6;
    }
}
