package com.badlogic.gdx.utils;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class Bits {
    long[] bits;

    public Bits() {
        this.bits = new long[]{0};
    }

    private void checkCapacity(int i) {
        long[] jArr = this.bits;
        if (i >= jArr.length) {
            long[] jArr2 = new long[i + 1];
            System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
            this.bits = jArr2;
        }
    }

    public void and(Bits bits) {
        int iMin = Math.min(this.bits.length, bits.bits.length);
        for (int i = 0; iMin > i; i++) {
            long[] jArr = this.bits;
            jArr[i] = jArr[i] & bits.bits[i];
        }
        long[] jArr2 = this.bits;
        if (jArr2.length > iMin) {
            int length = jArr2.length;
            while (length > iMin) {
                this.bits[iMin] = 0;
                iMin++;
            }
        }
    }

    public void andNot(Bits bits) {
        int length = this.bits.length;
        int length2 = bits.bits.length;
        for (int i = 0; i < length && i < length2; i++) {
            long[] jArr = this.bits;
            jArr[i] = jArr[i] & (~bits.bits[i]);
        }
    }

    public void clear(int i) {
        int i2 = i >>> 6;
        long[] jArr = this.bits;
        if (i2 >= jArr.length) {
            return;
        }
        jArr[i2] = jArr[i2] & (~(1 << (i & 63)));
    }

    public boolean containsAll(Bits bits) {
        long[] jArr = this.bits;
        long[] jArr2 = bits.bits;
        int length = jArr2.length;
        int length2 = jArr.length;
        for (int i = length2; i < length; i++) {
            if (jArr2[i] != 0) {
                return false;
            }
        }
        for (int iMin = Math.min(length2, length) - 1; iMin >= 0; iMin--) {
            long j = jArr[iMin];
            long j2 = jArr2[iMin];
            if ((j & j2) != j2) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Bits bits = (Bits) obj;
        long[] jArr = bits.bits;
        int iMin = Math.min(this.bits.length, jArr.length);
        for (int i = 0; iMin > i; i++) {
            if (this.bits[i] != jArr[i]) {
                return false;
            }
        }
        return this.bits.length == jArr.length || length() == bits.length();
    }

    public void flip(int i) {
        int i2 = i >>> 6;
        checkCapacity(i2);
        long[] jArr = this.bits;
        jArr[i2] = jArr[i2] ^ (1 << (i & 63));
    }

    public boolean get(int i) {
        int i2 = i >>> 6;
        long[] jArr = this.bits;
        return i2 < jArr.length && (jArr[i2] & (1 << (i & 63))) != 0;
    }

    public boolean getAndClear(int i) {
        int i2 = i >>> 6;
        long[] jArr = this.bits;
        if (i2 >= jArr.length) {
            return false;
        }
        long j = jArr[i2];
        long j2 = (~(1 << (i & 63))) & j;
        jArr[i2] = j2;
        return j2 != j;
    }

    public boolean getAndSet(int i) {
        int i2 = i >>> 6;
        checkCapacity(i2);
        long[] jArr = this.bits;
        long j = jArr[i2];
        long j2 = (1 << (i & 63)) | j;
        jArr[i2] = j2;
        return j2 == j;
    }

    public int hashCode() {
        int length = length() >>> 6;
        int i = 0;
        for (int i2 = 0; length >= i2; i2++) {
            int i3 = i * EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
            long j = this.bits[i2];
            i = i3 + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    public boolean intersects(Bits bits) {
        long[] jArr = this.bits;
        long[] jArr2 = bits.bits;
        for (int iMin = Math.min(jArr.length, jArr2.length) - 1; iMin >= 0; iMin--) {
            if ((jArr[iMin] & jArr2[iMin]) != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        for (long j : this.bits) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    public int length() {
        long[] jArr = this.bits;
        for (int length = jArr.length - 1; length >= 0; length--) {
            long j = jArr[length];
            if (j != 0) {
                for (int i = 63; i >= 0; i--) {
                    if (((1 << (i & 63)) & j) != 0) {
                        return (length << 6) + i + 1;
                    }
                }
            }
        }
        return 0;
    }

    public int nextClearBit(int i) {
        int length;
        long[] jArr = this.bits;
        int i2 = i >>> 6;
        int length2 = jArr.length;
        if (i2 < length2) {
            long j = jArr[i2];
            int i3 = i & 63;
            while (i3 < 64) {
                if (((1 << (i3 & 63)) & j) == 0) {
                    return (i2 << 6) + i3;
                }
                i3++;
            }
            while (true) {
                i2++;
                if (i2 >= length2) {
                    length = jArr.length;
                    break;
                }
                if (i2 == 0) {
                    return i2 << 6;
                }
                long j2 = jArr[i2];
                i3 = 0;
                while (i3 < 64) {
                    if (((1 << (i3 & 63)) & j2) == 0) {
                        return (i2 << 6) + i3;
                    }
                    i3++;
                }
            }
        } else {
            length = jArr.length;
        }
        return length << 6;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0038  */
    /* JADX WARN: Code duplicated, block: B:24:0x0042 A[LOOP:2: B:20:0x0036->B:24:0x0042, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x002f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0035 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0022 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0029 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0029 A[SYNTHETIC] */
    public int nextSetBit(int i) {
        long j;
        int i2;
        long[] jArr = this.bits;
        int i3 = i >>> 6;
        int length = jArr.length;
        if (i3 >= length) {
            return -1;
        }
        long j2 = jArr[i3];
        if (j2 != 0) {
            i2 = i & 63;
            while (i2 < 64) {
                if (((1 << (i2 & 63)) & j2) == 0) {
                    i2++;
                }
            }
            while (true) {
                i3++;
                if (i3 < length) {
                    return -1;
                }
                if (i3 != 0) {
                    j = jArr[i3];
                    if (j != 0) {
                        i2 = 0;
                        while (i2 < 64) {
                            if (((1 << (i2 & 63)) & j) != 0) {
                                i2++;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        } else {
            while (true) {
                i3++;
                if (i3 < length) {
                    return -1;
                }
                if (i3 != 0) {
                    j = jArr[i3];
                    if (j != 0) {
                        i2 = 0;
                        while (i2 < 64) {
                            if (((1 << (i2 & 63)) & j) != 0) {
                                i2++;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return (i3 << 6) + i2;
    }

    public boolean notEmpty() {
        return !isEmpty();
    }

    public int numBits() {
        return this.bits.length << 6;
    }

    public void or(Bits bits) {
        int iMin = Math.min(this.bits.length, bits.bits.length);
        for (int i = 0; iMin > i; i++) {
            long[] jArr = this.bits;
            jArr[i] = jArr[i] | bits.bits[i];
        }
        long[] jArr2 = bits.bits;
        if (iMin < jArr2.length) {
            checkCapacity(jArr2.length);
            int length = bits.bits.length;
            while (length > iMin) {
                this.bits[iMin] = bits.bits[iMin];
                iMin++;
            }
        }
    }

    public void set(int i) {
        int i2 = i >>> 6;
        checkCapacity(i2);
        long[] jArr = this.bits;
        jArr[i2] = jArr[i2] | (1 << (i & 63));
    }

    public void xor(Bits bits) {
        int iMin = Math.min(this.bits.length, bits.bits.length);
        for (int i = 0; iMin > i; i++) {
            long[] jArr = this.bits;
            jArr[i] = jArr[i] ^ bits.bits[i];
        }
        long[] jArr2 = bits.bits;
        if (iMin < jArr2.length) {
            checkCapacity(jArr2.length);
            int length = bits.bits.length;
            while (length > iMin) {
                this.bits[iMin] = bits.bits[iMin];
                iMin++;
            }
        }
    }

    public Bits(int i) {
        this.bits = new long[]{0};
        checkCapacity(i >>> 6);
    }

    public void clear() {
        Arrays.fill(this.bits, 0L);
    }

    public Bits(Bits bits) {
        this.bits = new long[]{0};
        long[] jArr = new long[bits.bits.length];
        this.bits = jArr;
        long[] jArr2 = bits.bits;
        System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
    }
}
