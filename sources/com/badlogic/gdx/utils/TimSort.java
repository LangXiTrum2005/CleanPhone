package com.badlogic.gdx.utils;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
class TimSort<T> {
    private static final boolean DEBUG = false;
    private static final int INITIAL_TMP_STORAGE_LENGTH = 256;
    private static final int MIN_GALLOP = 7;
    private static final int MIN_MERGE = 32;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private T[] f205a;
    private Comparator<? super T> c;
    private int minGallop;
    private final int[] runBase;
    private final int[] runLen;
    private int stackSize;
    private T[] tmp;
    private int tmpCount;

    public TimSort() {
        this.minGallop = 7;
        this.stackSize = 0;
        this.tmp = (T[]) new Object[256];
        this.runBase = new int[40];
        this.runLen = new int[40];
    }

    private static <T> void binarySort(T[] tArr, int i, int i2, int i3, Comparator<? super T> comparator) {
        if (i3 == i) {
            i3++;
        }
        while (i3 < i2) {
            T t = tArr[i3];
            int i4 = i;
            int i5 = i3;
            while (i4 < i5) {
                int i6 = (i4 + i5) >>> 1;
                if (comparator.compare(t, tArr[i6]) < 0) {
                    i5 = i6;
                } else {
                    i4 = i6 + 1;
                }
            }
            int i7 = i3 - i4;
            if (i7 == 1) {
                tArr[i4 + 1] = tArr[i4];
            } else if (i7 != 2) {
                System.arraycopy(tArr, i4, tArr, i4 + 1, i7);
            } else {
                tArr[i4 + 2] = tArr[i4 + 1];
                tArr[i4 + 1] = tArr[i4];
            }
            tArr[i4] = t;
            i3++;
        }
    }

    private static <T> int countRunAndMakeAscending(T[] tArr, int i, int i2, Comparator<? super T> comparator) {
        int i3 = i + 1;
        if (i3 == i2) {
            return 1;
        }
        int i4 = i + 2;
        if (comparator.compare(tArr[i3], tArr[i]) < 0) {
            while (i4 < i2 && comparator.compare(tArr[i4], tArr[i4 - 1]) < 0) {
                i4++;
            }
            reverseRange(tArr, i, i4);
        } else {
            while (i4 < i2 && comparator.compare(tArr[i4], tArr[i4 - 1]) >= 0) {
                i4++;
            }
        }
        return i4 - i;
    }

    private T[] ensureCapacity(int i) {
        this.tmpCount = Math.max(this.tmpCount, i);
        if (this.tmp.length < i) {
            int i2 = (i >> 1) | i;
            int i3 = i2 | (i2 >> 2);
            int i4 = i3 | (i3 >> 4);
            int i5 = i4 | (i4 >> 8);
            int i6 = (i5 | (i5 >> 16)) + 1;
            if (i6 >= 0) {
                i = Math.min(i6, this.f205a.length >>> 1);
            }
            this.tmp = (T[]) new Object[i];
        }
        return this.tmp;
    }

    private static <T> int gallopLeft(T t, T[] tArr, int i, int i2, int i3, Comparator<? super T> comparator) {
        int i4;
        int i5;
        int i6 = i + i3;
        if (comparator.compare(t, tArr[i6]) > 0) {
            int i7 = i2 - i3;
            int i8 = 0;
            int i9 = 1;
            while (i9 < i7 && comparator.compare(t, tArr[i6 + i9]) > 0) {
                int i10 = (i9 << 1) + 1;
                if (i10 <= 0) {
                    i8 = i9;
                    i9 = i7;
                } else {
                    int i11 = i9;
                    i9 = i10;
                    i8 = i11;
                }
            }
            if (i9 <= i7) {
                i7 = i9;
            }
            i4 = i8 + i3;
            i5 = i7 + i3;
        } else {
            int i12 = i3 + 1;
            int i13 = 0;
            int i14 = 1;
            while (i14 < i12 && comparator.compare(t, tArr[i6 - i14]) <= 0) {
                int i15 = (i14 << 1) + 1;
                if (i15 <= 0) {
                    i13 = i14;
                    i14 = i12;
                } else {
                    int i16 = i14;
                    i14 = i15;
                    i13 = i16;
                }
            }
            if (i14 <= i12) {
                i12 = i14;
            }
            int i17 = i3 - i12;
            int i18 = i3 - i13;
            i4 = i17;
            i5 = i18;
        }
        int i19 = i4 + 1;
        while (i19 < i5) {
            int i20 = ((i5 - i19) >>> 1) + i19;
            if (comparator.compare(t, tArr[i + i20]) > 0) {
                i19 = i20 + 1;
            } else {
                i5 = i20;
            }
        }
        return i5;
    }

    private static <T> int gallopRight(T t, T[] tArr, int i, int i2, int i3, Comparator<? super T> comparator) {
        int i4;
        int i5;
        int i6 = i + i3;
        if (comparator.compare(t, tArr[i6]) < 0) {
            int i7 = i3 + 1;
            int i8 = 0;
            int i9 = 1;
            while (i9 < i7 && comparator.compare(t, tArr[i6 - i9]) < 0) {
                int i10 = (i9 << 1) + 1;
                if (i10 <= 0) {
                    i8 = i9;
                    i9 = i7;
                } else {
                    int i11 = i9;
                    i9 = i10;
                    i8 = i11;
                }
            }
            if (i9 <= i7) {
                i7 = i9;
            }
            i5 = i3 - i7;
            i4 = i3 - i8;
        } else {
            int i12 = i2 - i3;
            int i13 = 0;
            int i14 = 1;
            while (i14 < i12 && comparator.compare(t, tArr[i6 + i14]) >= 0) {
                int i15 = (i14 << 1) + 1;
                if (i15 <= 0) {
                    i13 = i14;
                    i14 = i12;
                } else {
                    int i16 = i14;
                    i14 = i15;
                    i13 = i16;
                }
            }
            if (i14 <= i12) {
                i12 = i14;
            }
            int i17 = i13 + i3;
            i4 = i3 + i12;
            i5 = i17;
        }
        int i18 = i5 + 1;
        while (i18 < i4) {
            int i19 = ((i4 - i18) >>> 1) + i18;
            if (comparator.compare(t, tArr[i + i19]) < 0) {
                i4 = i19;
            } else {
                i18 = i19 + 1;
            }
        }
        return i4;
    }

    private void mergeAt(int i) {
        int[] iArr = this.runBase;
        int i2 = iArr[i];
        int[] iArr2 = this.runLen;
        int i3 = iArr2[i];
        int i4 = i + 1;
        int i5 = iArr[i4];
        int i6 = iArr2[i4];
        iArr2[i] = i3 + i6;
        int i7 = this.stackSize;
        if (i == i7 - 3) {
            int i8 = i + 2;
            iArr[i4] = iArr[i8];
            iArr2[i4] = iArr2[i8];
        }
        this.stackSize = i7 - 1;
        T[] tArr = this.f205a;
        int iGallopRight = gallopRight(tArr[i5], tArr, i2, i3, 0, this.c);
        int i9 = i2 + iGallopRight;
        int i10 = i3 - iGallopRight;
        if (i10 == 0) {
            return;
        }
        T[] tArr2 = this.f205a;
        int iGallopLeft = gallopLeft(tArr2[(i9 + i10) - 1], tArr2, i5, i6, i6 - 1, this.c);
        if (iGallopLeft == 0) {
            return;
        }
        if (i10 <= iGallopLeft) {
            mergeLo(i9, i10, i5, iGallopLeft);
        } else {
            mergeHi(i9, i10, i5, iGallopLeft);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    private void mergeCollapse() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        while (true) {
            int i = this.stackSize;
            if (i <= 1) {
                return;
            }
            int i2 = i - 2;
            if (i2 >= 1) {
                int[] iArr4 = this.runLen;
                if (iArr4[i - 3] > iArr4[i2] + iArr4[i - 1]) {
                    if (i2 >= 2) {
                        iArr2 = this.runLen;
                        if (iArr2[i - 4] <= iArr2[i2] + iArr2[i - 3]) {
                            iArr3 = this.runLen;
                            if (iArr3[i - 3] < iArr3[i - 1]) {
                                i2 = i - 3;
                            }
                        }
                    }
                    iArr = this.runLen;
                    if (iArr[i2] > iArr[i - 1]) {
                        return;
                    }
                } else {
                    iArr3 = this.runLen;
                    if (iArr3[i - 3] < iArr3[i - 1]) {
                        i2 = i - 3;
                    }
                }
            } else {
                if (i2 >= 2) {
                    iArr2 = this.runLen;
                    if (iArr2[i - 4] <= iArr2[i2] + iArr2[i - 3]) {
                        iArr3 = this.runLen;
                        if (iArr3[i - 3] < iArr3[i - 1]) {
                            i2 = i - 3;
                        }
                    }
                }
                iArr = this.runLen;
                if (iArr[i2] > iArr[i - 1]) {
                    return;
                }
            }
            mergeAt(i2);
        }
    }

    private void mergeForceCollapse() {
        while (true) {
            int i = this.stackSize;
            if (i <= 1) {
                return;
            }
            int i2 = i - 2;
            if (i2 > 0) {
                int[] iArr = this.runLen;
                if (iArr[i - 3] < iArr[i - 1]) {
                    i2 = i - 3;
                }
            }
            mergeAt(i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:55:0x0124  */
    /* JADX WARN: Code duplicated, block: B:57:0x0129  */
    /* JADX WARN: Code duplicated, block: B:58:0x012b  */
    /* JADX WARN: Code duplicated, block: B:60:0x012e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0130  */
    /* JADX WARN: Code duplicated, block: B:65:0x0136  */
    /* JADX WARN: Code duplicated, block: B:67:0x0141 A[LOOP:2: B:25:0x007e->B:67:0x0141, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0134 A[SYNTHETIC] */
    private void mergeHi(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int iGallopLeft;
        int i9;
        boolean z;
        boolean z2;
        int i10;
        int i11;
        int i12 = i4;
        T[] tArr = this.f205a;
        T[] tArrEnsureCapacity = ensureCapacity(i12);
        System.arraycopy(tArr, i3, tArrEnsureCapacity, 0, i12);
        int i13 = i + i2;
        int i14 = i13 - 1;
        int i15 = i12 - 1;
        int i16 = i3 + i12;
        int i17 = i16 - 1;
        int i18 = i16 - 2;
        int i19 = i13 - 2;
        tArr[i17] = tArr[i14];
        int i20 = i2 - 1;
        if (i20 == 0) {
            System.arraycopy(tArrEnsureCapacity, 0, tArr, i18 - i15, i12);
            return;
        }
        if (i12 == 1) {
            int i21 = i18 - i20;
            System.arraycopy(tArr, (i19 - i20) + 1, tArr, i21 + 1, i20);
            tArr[i21] = tArrEnsureCapacity[i15];
            return;
        }
        Comparator<? super T> comparator = this.c;
        int i22 = this.minGallop;
        loop0: while (true) {
            int i23 = 0;
            int i24 = 0;
            do {
                if (comparator.compare(tArrEnsureCapacity[i15], tArr[i19]) < 0) {
                    i5 = i18 - 1;
                    int i25 = i19 - 1;
                    tArr[i18] = tArr[i19];
                    i24++;
                    i20--;
                    if (i20 == 0) {
                        i19 = i25;
                        break loop0;
                    } else {
                        i18 = i5;
                        i19 = i25;
                        i23 = 0;
                    }
                } else {
                    int i26 = i18 - 1;
                    int i27 = i15 - 1;
                    tArr[i18] = tArrEnsureCapacity[i15];
                    i23++;
                    i12--;
                    if (i12 == 1) {
                        i5 = i26;
                        i15 = i27;
                        break loop0;
                    } else {
                        i18 = i26;
                        i15 = i27;
                        i24 = 0;
                    }
                }
            } while ((i24 | i23) < i22);
            i5 = i18;
            int i28 = i12;
            int i29 = i19;
            int i30 = i20;
            int i31 = i15;
            int i32 = i22;
            while (true) {
                int iGallopRight = i30 - gallopRight(tArrEnsureCapacity[i31], tArr, i, i30, i30 - 1, comparator);
                if (iGallopRight != 0) {
                    i5 -= iGallopRight;
                    i19 = i29 - iGallopRight;
                    i20 = i30 - iGallopRight;
                    System.arraycopy(tArr, i19 + 1, tArr, i5 + 1, iGallopRight);
                    if (i20 == 0) {
                        i12 = i28;
                        i15 = i31;
                    } else {
                        i29 = i19;
                        i30 = i20;
                        i6 = i5 - 1;
                        i7 = i31 - 1;
                        tArr[i5] = tArrEnsureCapacity[i31];
                        i8 = i28 - 1;
                        if (i8 == 1) {
                            i12 = i8;
                            i19 = i29;
                            i20 = i30;
                            i22 = i32;
                            i5 = i6;
                            i15 = i7;
                            break loop0;
                        }
                        iGallopLeft = i8 - gallopLeft(tArr[i29], tArrEnsureCapacity, 0, i8, i28 - 2, comparator);
                        if (iGallopLeft != 0) {
                            i10 = i6 - iGallopLeft;
                            i15 = i7 - iGallopLeft;
                            i11 = i8 - iGallopLeft;
                            System.arraycopy(tArrEnsureCapacity, i15 + 1, tArr, i10 + 1, iGallopLeft);
                            if (i11 <= 1) {
                                i5 = i10;
                                i12 = i11;
                                i19 = i29;
                                i20 = i30;
                            } else {
                                i6 = i10;
                                i8 = i11;
                                i31 = i15;
                            }
                        } else {
                            i31 = i7;
                        }
                        i9 = i6 - 1;
                        i19 = i29 - 1;
                        tArr[i6] = tArr[i29];
                        i30--;
                        if (i30 == 0) {
                            i20 = i30;
                            i15 = i31;
                            i22 = i32;
                            int i33 = i8;
                            i5 = i9;
                            i12 = i33;
                            break loop0;
                        }
                        i32--;
                        if (iGallopRight >= 7) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (iGallopLeft >= 7) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2 && !z) {
                            if (i32 < 0) {
                                i32 = 0;
                            }
                            i22 = i32 + 2;
                            i18 = i9;
                            i12 = i8;
                            i20 = i30;
                            i15 = i31;
                        } else {
                            i29 = i19;
                            i28 = i8;
                            i5 = i9;
                        }
                    }
                    i22 = i32;
                    break loop0;
                }
                i6 = i5 - 1;
                i7 = i31 - 1;
                tArr[i5] = tArrEnsureCapacity[i31];
                i8 = i28 - 1;
                if (i8 == 1) {
                    i12 = i8;
                    i19 = i29;
                    i20 = i30;
                    i22 = i32;
                    i5 = i6;
                    i15 = i7;
                    break loop0;
                }
                iGallopLeft = i8 - gallopLeft(tArr[i29], tArrEnsureCapacity, 0, i8, i28 - 2, comparator);
                if (iGallopLeft != 0) {
                    i10 = i6 - iGallopLeft;
                    i15 = i7 - iGallopLeft;
                    i11 = i8 - iGallopLeft;
                    System.arraycopy(tArrEnsureCapacity, i15 + 1, tArr, i10 + 1, iGallopLeft);
                    if (i11 <= 1) {
                        i5 = i10;
                        i12 = i11;
                        i19 = i29;
                        i20 = i30;
                        i22 = i32;
                        break loop0;
                    }
                    i6 = i10;
                    i8 = i11;
                    i31 = i15;
                } else {
                    i31 = i7;
                }
                i9 = i6 - 1;
                i19 = i29 - 1;
                tArr[i6] = tArr[i29];
                i30--;
                if (i30 == 0) {
                    i20 = i30;
                    i15 = i31;
                    i22 = i32;
                    int i34 = i8;
                    i5 = i9;
                    i12 = i34;
                    break loop0;
                }
                i32--;
                if (iGallopRight >= 7) {
                    z = true;
                } else {
                    z = false;
                }
                if (iGallopLeft >= 7) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 && !z) {
                    if (i32 < 0) {
                        i32 = 0;
                    }
                    i22 = i32 + 2;
                    i18 = i9;
                    i12 = i8;
                    i20 = i30;
                    i15 = i31;
                } else {
                    i29 = i19;
                    i28 = i8;
                    i5 = i9;
                }
            }
        }
        if (i22 < 1) {
            i22 = 1;
        }
        this.minGallop = i22;
        if (i12 == 1) {
            int i35 = i5 - i20;
            System.arraycopy(tArr, (i19 - i20) + 1, tArr, i35 + 1, i20);
            tArr[i35] = tArrEnsureCapacity[i15];
        } else {
            if (i12 == 0) {
                throw new IllegalArgumentException("Comparison method violates its general contract!");
            }
            System.arraycopy(tArrEnsureCapacity, 0, tArr, i5 - (i12 - 1), i12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    /* JADX WARN: Code duplicated, block: B:32:0x0098 A[PHI: r9 r13 r14
  0x0098: PHI (r9v4 int) = (r9v3 int), (r9v10 int) binds: [B:27:0x007b, B:31:0x0095] A[DONT_GENERATE, DONT_INLINE]
  0x0098: PHI (r13v7 int) = (r13v6 int), (r13v9 int) binds: [B:27:0x007b, B:31:0x0095] A[DONT_GENERATE, DONT_INLINE]
  0x0098: PHI (r14v6 int) = (r14v5 int), (r14v10 int) binds: [B:27:0x007b, B:31:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:55:0x0106  */
    /* JADX WARN: Code duplicated, block: B:57:0x010b  */
    /* JADX WARN: Code duplicated, block: B:58:0x010d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0110  */
    /* JADX WARN: Code duplicated, block: B:61:0x0112  */
    /* JADX WARN: Code duplicated, block: B:65:0x0118  */
    /* JADX WARN: Code duplicated, block: B:67:0x0124 A[LOOP:2: B:26:0x006f->B:67:0x0124, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x0129 A[LOOP:1: B:12:0x0033->B:68:0x0129, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x011a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0116 A[SYNTHETIC] */
    private void mergeLo(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iGallopRight;
        int i13;
        int iGallopLeft;
        int i14;
        int i15;
        boolean z;
        boolean z2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21 = i2;
        T[] tArr = this.f205a;
        T[] tArrEnsureCapacity = ensureCapacity(i21);
        System.arraycopy(tArr, i, tArrEnsureCapacity, 0, i21);
        int i22 = i + 1;
        int i23 = i3 + 1;
        tArr[i] = tArr[i3];
        int i24 = i4 - 1;
        if (i24 == 0) {
            System.arraycopy(tArrEnsureCapacity, 0, tArr, i22, i21);
            return;
        }
        int i25 = 1;
        if (i21 == 1) {
            System.arraycopy(tArr, i23, tArr, i22, i24);
            tArr[i22 + i24] = tArrEnsureCapacity[0];
            return;
        }
        Comparator<? super T> comparator = this.c;
        int i26 = this.minGallop;
        int i27 = 0;
        loop0: while (true) {
            int i28 = 0;
            int i29 = 0;
            while (true) {
                if (comparator.compare(tArr[i23], tArrEnsureCapacity[i27]) < 0) {
                    i5 = i22 + 1;
                    int i30 = i23 + 1;
                    tArr[i22] = tArr[i23];
                    i29 += i25;
                    i24--;
                    if (i24 == 0) {
                        i23 = i30;
                    } else {
                        i22 = i5;
                        i23 = i30;
                        i28 = 0;
                        if ((i28 | i29) >= i26) {
                            i7 = i24;
                            i8 = i21;
                            i9 = i22;
                            i10 = i23;
                            i11 = i26;
                            while (true) {
                                i12 = i27;
                                iGallopRight = gallopRight(tArr[i10], tArrEnsureCapacity, i27, i8, 0, comparator);
                                if (iGallopRight != 0) {
                                    System.arraycopy(tArrEnsureCapacity, i12, tArr, i9, iGallopRight);
                                    i18 = i9 + iGallopRight;
                                    i19 = i12 + iGallopRight;
                                    i20 = i8 - iGallopRight;
                                    if (i20 <= i25) {
                                        i27 = i19;
                                        i21 = i20;
                                        i23 = i10;
                                        i26 = i11;
                                        i6 = 1;
                                        int i31 = i7;
                                        i5 = i18;
                                        i24 = i31;
                                        break loop0;
                                    }
                                    i9 = i18;
                                    i12 = i19;
                                    i8 = i20;
                                    i13 = i9 + 1;
                                    i23 = i10 + 1;
                                    tArr[i9] = tArr[i10];
                                    i7--;
                                    if (i7 == 0) {
                                        i27 = i12;
                                        i24 = i7;
                                        i21 = i8;
                                        i6 = 1;
                                        i5 = i13;
                                        i26 = i11;
                                        break loop0;
                                    }
                                    i10 = i23;
                                    iGallopLeft = gallopLeft(tArrEnsureCapacity[i12], tArr, i23, i7, 0, comparator);
                                    if (iGallopLeft != 0) {
                                        System.arraycopy(tArr, i10, tArr, i13, iGallopLeft);
                                        i16 = i13 + iGallopLeft;
                                        i23 = i10 + iGallopLeft;
                                        i17 = i7 - iGallopLeft;
                                        if (i17 == 0) {
                                            i5 = i16;
                                            i24 = i17;
                                            i27 = i12;
                                            i21 = i8;
                                            i26 = i11;
                                        } else {
                                            i14 = i16;
                                            i7 = i17;
                                            i10 = i23;
                                        }
                                    } else {
                                        i14 = i13;
                                    }
                                    i15 = i14 + 1;
                                    i27 = i12 + 1;
                                    tArr[i14] = tArrEnsureCapacity[i12];
                                    i8--;
                                    i6 = 1;
                                    if (i8 == 1) {
                                        i24 = i7;
                                        i23 = i10;
                                        i26 = i11;
                                        i5 = i15;
                                        i21 = i8;
                                        break loop0;
                                    }
                                    i11--;
                                    if (iGallopRight >= 7) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (iGallopLeft >= 7) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (!z2 && !z) {
                                        if (i11 < 0) {
                                            i11 = 0;
                                        }
                                        i26 = i11 + 2;
                                        i22 = i15;
                                        i24 = i7;
                                        i21 = i8;
                                        i23 = i10;
                                        i25 = 1;
                                    } else {
                                        i9 = i15;
                                        i25 = 1;
                                    }
                                } else {
                                    i13 = i9 + 1;
                                    i23 = i10 + 1;
                                    tArr[i9] = tArr[i10];
                                    i7--;
                                    if (i7 == 0) {
                                        i27 = i12;
                                        i24 = i7;
                                        i21 = i8;
                                        i6 = 1;
                                        i5 = i13;
                                        i26 = i11;
                                        break loop0;
                                    }
                                    i10 = i23;
                                    iGallopLeft = gallopLeft(tArrEnsureCapacity[i12], tArr, i23, i7, 0, comparator);
                                    if (iGallopLeft != 0) {
                                        System.arraycopy(tArr, i10, tArr, i13, iGallopLeft);
                                        i16 = i13 + iGallopLeft;
                                        i23 = i10 + iGallopLeft;
                                        i17 = i7 - iGallopLeft;
                                        if (i17 == 0) {
                                            i5 = i16;
                                            i24 = i17;
                                            i27 = i12;
                                            i21 = i8;
                                            i26 = i11;
                                        } else {
                                            i14 = i16;
                                            i7 = i17;
                                            i10 = i23;
                                        }
                                    } else {
                                        i14 = i13;
                                    }
                                    i15 = i14 + 1;
                                    i27 = i12 + 1;
                                    tArr[i14] = tArrEnsureCapacity[i12];
                                    i8--;
                                    i6 = 1;
                                    if (i8 == 1) {
                                        i24 = i7;
                                        i23 = i10;
                                        i26 = i11;
                                        i5 = i15;
                                        i21 = i8;
                                        break loop0;
                                    }
                                    i11--;
                                    if (iGallopRight >= 7) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (iGallopLeft >= 7) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (!z2 && !z) {
                                        if (i11 < 0) {
                                            i11 = 0;
                                        }
                                        i26 = i11 + 2;
                                        i22 = i15;
                                        i24 = i7;
                                        i21 = i8;
                                        i23 = i10;
                                        i25 = 1;
                                    } else {
                                        i9 = i15;
                                        i25 = 1;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int i32 = i22 + 1;
                    int i33 = i27 + 1;
                    tArr[i22] = tArrEnsureCapacity[i27];
                    i28 += i25;
                    i21--;
                    if (i21 == i25) {
                        i5 = i32;
                        i27 = i33;
                    } else {
                        i22 = i32;
                        i27 = i33;
                        i29 = 0;
                        if ((i28 | i29) >= i26) {
                            i7 = i24;
                            i8 = i21;
                            i9 = i22;
                            i10 = i23;
                            i11 = i26;
                            while (true) {
                                i12 = i27;
                                iGallopRight = gallopRight(tArr[i10], tArrEnsureCapacity, i27, i8, 0, comparator);
                                if (iGallopRight != 0) {
                                    System.arraycopy(tArrEnsureCapacity, i12, tArr, i9, iGallopRight);
                                    i18 = i9 + iGallopRight;
                                    i19 = i12 + iGallopRight;
                                    i20 = i8 - iGallopRight;
                                    if (i20 <= i25) {
                                        i27 = i19;
                                        i21 = i20;
                                        i23 = i10;
                                        i26 = i11;
                                        i6 = 1;
                                        int i34 = i7;
                                        i5 = i18;
                                        i24 = i34;
                                        break loop0;
                                    }
                                    i9 = i18;
                                    i12 = i19;
                                    i8 = i20;
                                    i13 = i9 + 1;
                                    i23 = i10 + 1;
                                    tArr[i9] = tArr[i10];
                                    i7--;
                                    if (i7 == 0) {
                                        i27 = i12;
                                        i24 = i7;
                                        i21 = i8;
                                        i6 = 1;
                                        i5 = i13;
                                        i26 = i11;
                                        break loop0;
                                    }
                                    i10 = i23;
                                    iGallopLeft = gallopLeft(tArrEnsureCapacity[i12], tArr, i23, i7, 0, comparator);
                                    if (iGallopLeft != 0) {
                                        System.arraycopy(tArr, i10, tArr, i13, iGallopLeft);
                                        i16 = i13 + iGallopLeft;
                                        i23 = i10 + iGallopLeft;
                                        i17 = i7 - iGallopLeft;
                                        if (i17 == 0) {
                                            i5 = i16;
                                            i24 = i17;
                                            i27 = i12;
                                            i21 = i8;
                                            i26 = i11;
                                        } else {
                                            i14 = i16;
                                            i7 = i17;
                                            i10 = i23;
                                        }
                                    } else {
                                        i14 = i13;
                                    }
                                    i15 = i14 + 1;
                                    i27 = i12 + 1;
                                    tArr[i14] = tArrEnsureCapacity[i12];
                                    i8--;
                                    i6 = 1;
                                    if (i8 == 1) {
                                        i24 = i7;
                                        i23 = i10;
                                        i26 = i11;
                                        i5 = i15;
                                        i21 = i8;
                                        break loop0;
                                    }
                                    i11--;
                                    if (iGallopRight >= 7) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (iGallopLeft >= 7) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (!z2 && !z) {
                                        if (i11 < 0) {
                                            i11 = 0;
                                        }
                                        i26 = i11 + 2;
                                        i22 = i15;
                                        i24 = i7;
                                        i21 = i8;
                                        i23 = i10;
                                        i25 = 1;
                                    } else {
                                        i9 = i15;
                                        i25 = 1;
                                    }
                                } else {
                                    i13 = i9 + 1;
                                    i23 = i10 + 1;
                                    tArr[i9] = tArr[i10];
                                    i7--;
                                    if (i7 == 0) {
                                        i27 = i12;
                                        i24 = i7;
                                        i21 = i8;
                                        i6 = 1;
                                        i5 = i13;
                                        i26 = i11;
                                        break loop0;
                                    }
                                    i10 = i23;
                                    iGallopLeft = gallopLeft(tArrEnsureCapacity[i12], tArr, i23, i7, 0, comparator);
                                    if (iGallopLeft != 0) {
                                        System.arraycopy(tArr, i10, tArr, i13, iGallopLeft);
                                        i16 = i13 + iGallopLeft;
                                        i23 = i10 + iGallopLeft;
                                        i17 = i7 - iGallopLeft;
                                        if (i17 == 0) {
                                            i5 = i16;
                                            i24 = i17;
                                            i27 = i12;
                                            i21 = i8;
                                            i26 = i11;
                                        } else {
                                            i14 = i16;
                                            i7 = i17;
                                            i10 = i23;
                                        }
                                    } else {
                                        i14 = i13;
                                    }
                                    i15 = i14 + 1;
                                    i27 = i12 + 1;
                                    tArr[i14] = tArrEnsureCapacity[i12];
                                    i8--;
                                    i6 = 1;
                                    if (i8 == 1) {
                                        i24 = i7;
                                        i23 = i10;
                                        i26 = i11;
                                        i5 = i15;
                                        i21 = i8;
                                        break loop0;
                                    }
                                    i11--;
                                    if (iGallopRight >= 7) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (iGallopLeft >= 7) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (!z2 && !z) {
                                        if (i11 < 0) {
                                            i11 = 0;
                                        }
                                        i26 = i11 + 2;
                                        i22 = i15;
                                        i24 = i7;
                                        i21 = i8;
                                        i23 = i10;
                                        i25 = 1;
                                    } else {
                                        i9 = i15;
                                        i25 = 1;
                                    }
                                }
                            }
                        }
                    }
                }
                i6 = 1;
                break loop0;
            }
        }
        if (i26 < i6) {
            i26 = 1;
        }
        this.minGallop = i26;
        if (i21 == i6) {
            System.arraycopy(tArr, i23, tArr, i5, i24);
            tArr[i5 + i24] = tArrEnsureCapacity[i27];
        } else {
            if (i21 == 0) {
                throw new IllegalArgumentException("Comparison method violates its general contract!");
            }
            System.arraycopy(tArrEnsureCapacity, i27, tArr, i5, i21);
        }
    }

    private static int minRunLength(int i) {
        int i2 = 0;
        while (i >= 32) {
            i2 |= i & 1;
            i >>= 1;
        }
        return i + i2;
    }

    private void pushRun(int i, int i2) {
        int[] iArr = this.runBase;
        int i3 = this.stackSize;
        iArr[i3] = i;
        this.runLen[i3] = i2;
        this.stackSize = i3 + 1;
    }

    private static void rangeCheck(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException(AbstractC3950lJ.q("fromIndex(", i2, ") > toIndex(", i3, ")"));
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(i2);
        }
        if (i3 > i) {
            throw new ArrayIndexOutOfBoundsException(i3);
        }
    }

    private static void reverseRange(Object[] objArr, int i, int i2) {
        int i3 = i2 - 1;
        while (i < i3) {
            Object obj = objArr[i];
            objArr[i] = objArr[i3];
            objArr[i3] = obj;
            i3--;
            i++;
        }
    }

    public static <T> void sort(T[] tArr, Comparator<? super T> comparator) {
        sort(tArr, 0, tArr.length, comparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void doSort(T[] tArr, Comparator<T> comparator, int i, int i2) {
        this.stackSize = 0;
        rangeCheck(tArr.length, i, i2);
        int i3 = i2 - i;
        if (i3 < 2) {
            return;
        }
        if (i3 < 32) {
            binarySort(tArr, i, i2, countRunAndMakeAscending(tArr, i, i2, comparator) + i, comparator);
            return;
        }
        this.f205a = tArr;
        this.c = comparator;
        this.tmpCount = 0;
        int iMinRunLength = minRunLength(i3);
        do {
            int iCountRunAndMakeAscending = countRunAndMakeAscending(tArr, i, i2, comparator);
            if (iCountRunAndMakeAscending < iMinRunLength) {
                int i4 = i3 <= iMinRunLength ? i3 : iMinRunLength;
                binarySort(tArr, i, i + i4, iCountRunAndMakeAscending + i, comparator);
                iCountRunAndMakeAscending = i4;
            }
            pushRun(i, iCountRunAndMakeAscending);
            mergeCollapse();
            i += iCountRunAndMakeAscending;
            i3 -= iCountRunAndMakeAscending;
        } while (i3 != 0);
        mergeForceCollapse();
        this.f205a = null;
        this.c = null;
        T[] tArr2 = this.tmp;
        int i5 = this.tmpCount;
        for (int i6 = 0; i6 < i5; i6++) {
            tArr2[i6] = null;
        }
    }

    public static <T> void sort(T[] tArr, int i, int i2, Comparator<? super T> comparator) {
        if (comparator == null) {
            Arrays.sort(tArr, i, i2);
            return;
        }
        rangeCheck(tArr.length, i, i2);
        int i3 = i2 - i;
        if (i3 < 2) {
            return;
        }
        if (i3 < 32) {
            binarySort(tArr, i, i2, countRunAndMakeAscending(tArr, i, i2, comparator) + i, comparator);
            return;
        }
        TimSort timSort = new TimSort(tArr, comparator);
        int iMinRunLength = minRunLength(i3);
        do {
            int iCountRunAndMakeAscending = countRunAndMakeAscending(tArr, i, i2, comparator);
            if (iCountRunAndMakeAscending < iMinRunLength) {
                int i4 = i3 <= iMinRunLength ? i3 : iMinRunLength;
                binarySort(tArr, i, i + i4, iCountRunAndMakeAscending + i, comparator);
                iCountRunAndMakeAscending = i4;
            }
            timSort.pushRun(i, iCountRunAndMakeAscending);
            timSort.mergeCollapse();
            i += iCountRunAndMakeAscending;
            i3 -= iCountRunAndMakeAscending;
        } while (i3 != 0);
        timSort.mergeForceCollapse();
    }

    private TimSort(T[] tArr, Comparator<? super T> comparator) {
        this.minGallop = 7;
        this.stackSize = 0;
        this.f205a = tArr;
        this.c = comparator;
        int length = tArr.length;
        this.tmp = (T[]) new Object[length < 512 ? length >>> 1 : 256];
        int i = length < 120 ? 5 : length < 1542 ? 10 : length < 119151 ? 19 : 40;
        this.runBase = new int[i];
        this.runLen = new int[i];
    }
}
