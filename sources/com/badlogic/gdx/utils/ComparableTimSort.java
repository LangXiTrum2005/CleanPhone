package com.badlogic.gdx.utils;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;

/* JADX INFO: loaded from: classes.dex */
class ComparableTimSort {
    private static final boolean DEBUG = false;
    private static final int INITIAL_TMP_STORAGE_LENGTH = 256;
    private static final int MIN_GALLOP = 7;
    private static final int MIN_MERGE = 32;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f204a;
    private int minGallop;
    private final int[] runBase;
    private final int[] runLen;
    private int stackSize;
    private Object[] tmp;
    private int tmpCount;

    public ComparableTimSort() {
        this.minGallop = 7;
        this.stackSize = 0;
        this.tmp = new Object[256];
        this.runBase = new int[40];
        this.runLen = new int[40];
    }

    private static void binarySort(Object[] objArr, int i, int i2, int i3) {
        if (i3 == i) {
            i3++;
        }
        while (i3 < i2) {
            Comparable comparable = (Comparable) objArr[i3];
            int i4 = i;
            int i5 = i3;
            while (i4 < i5) {
                int i6 = (i4 + i5) >>> 1;
                if (comparable.compareTo(objArr[i6]) < 0) {
                    i5 = i6;
                } else {
                    i4 = i6 + 1;
                }
            }
            int i7 = i3 - i4;
            if (i7 == 1) {
                objArr[i4 + 1] = objArr[i4];
            } else if (i7 != 2) {
                System.arraycopy(objArr, i4, objArr, i4 + 1, i7);
            } else {
                objArr[i4 + 2] = objArr[i4 + 1];
                objArr[i4 + 1] = objArr[i4];
            }
            objArr[i4] = comparable;
            i3++;
        }
    }

    private static int countRunAndMakeAscending(Object[] objArr, int i, int i2) {
        int i3 = i + 1;
        if (i3 == i2) {
            return 1;
        }
        int i4 = i + 2;
        if (((Comparable) objArr[i3]).compareTo(objArr[i]) < 0) {
            while (i4 < i2 && ((Comparable) objArr[i4]).compareTo(objArr[i4 - 1]) < 0) {
                i4++;
            }
            reverseRange(objArr, i, i4);
        } else {
            while (i4 < i2 && ((Comparable) objArr[i4]).compareTo(objArr[i4 - 1]) >= 0) {
                i4++;
            }
        }
        return i4 - i;
    }

    private Object[] ensureCapacity(int i) {
        this.tmpCount = Math.max(this.tmpCount, i);
        if (this.tmp.length < i) {
            int i2 = (i >> 1) | i;
            int i3 = i2 | (i2 >> 2);
            int i4 = i3 | (i3 >> 4);
            int i5 = i4 | (i4 >> 8);
            int i6 = (i5 | (i5 >> 16)) + 1;
            if (i6 >= 0) {
                i = Math.min(i6, this.f204a.length >>> 1);
            }
            this.tmp = new Object[i];
        }
        return this.tmp;
    }

    private static int gallopLeft(Comparable<Object> comparable, Object[] objArr, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = i + i3;
        if (comparable.compareTo(objArr[i6]) > 0) {
            int i7 = i2 - i3;
            int i8 = 0;
            int i9 = 1;
            while (i9 < i7 && comparable.compareTo(objArr[i6 + i9]) > 0) {
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
            while (i14 < i12 && comparable.compareTo(objArr[i6 - i14]) <= 0) {
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
            if (comparable.compareTo(objArr[i + i20]) > 0) {
                i19 = i20 + 1;
            } else {
                i5 = i20;
            }
        }
        return i5;
    }

    private static int gallopRight(Comparable<Object> comparable, Object[] objArr, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = i + i3;
        if (comparable.compareTo(objArr[i6]) < 0) {
            int i7 = i3 + 1;
            int i8 = 0;
            int i9 = 1;
            while (i9 < i7 && comparable.compareTo(objArr[i6 - i9]) < 0) {
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
            while (i14 < i12 && comparable.compareTo(objArr[i6 + i14]) >= 0) {
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
            if (comparable.compareTo(objArr[i + i19]) < 0) {
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
        Object[] objArr = this.f204a;
        int iGallopRight = gallopRight((Comparable) objArr[i5], objArr, i2, i3, 0);
        int i9 = i2 + iGallopRight;
        int i10 = i3 - iGallopRight;
        if (i10 == 0) {
            return;
        }
        Object[] objArr2 = this.f204a;
        int iGallopLeft = gallopLeft((Comparable) objArr2[(i9 + i10) - 1], objArr2, i5, i6, i6 - 1);
        if (iGallopLeft == 0) {
            return;
        }
        if (i10 <= iGallopLeft) {
            mergeLo(i9, i10, i5, iGallopLeft);
        } else {
            mergeHi(i9, i10, i5, iGallopLeft);
        }
    }

    private void mergeCollapse() {
        while (true) {
            int i = this.stackSize;
            if (i <= 1) {
                return;
            }
            int i2 = i - 2;
            if (i2 > 0) {
                int[] iArr = this.runLen;
                int i3 = iArr[i - 3];
                int i4 = iArr[i2];
                int i5 = iArr[i - 1];
                if (i3 <= i4 + i5) {
                    if (i3 < i5) {
                        i2 = i - 3;
                    }
                    mergeAt(i2);
                }
            }
            int[] iArr2 = this.runLen;
            if (iArr2[i2] > iArr2[i - 1]) {
                return;
            } else {
                mergeAt(i2);
            }
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

    /* JADX WARN: Code duplicated, block: B:29:0x0094 A[PHI: r2 r7 r8
  0x0094: PHI (r2v9 int) = (r2v8 int), (r2v15 int) binds: [B:25:0x0084, B:27:0x0090] A[DONT_GENERATE, DONT_INLINE]
  0x0094: PHI (r7v10 int) = (r7v9 int), (r7v16 int) binds: [B:25:0x0084, B:27:0x0090] A[DONT_GENERATE, DONT_INLINE]
  0x0094: PHI (r8v9 int) = (r8v8 int), (r8v11 int) binds: [B:25:0x0084, B:27:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:54:0x0102  */
    /* JADX WARN: Code duplicated, block: B:55:0x0104  */
    /* JADX WARN: Code duplicated, block: B:57:0x0107  */
    /* JADX WARN: Code duplicated, block: B:58:0x0109  */
    /* JADX WARN: Code duplicated, block: B:62:0x010f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0117 A[LOOP:2: B:24:0x0078->B:64:0x0117, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x010d A[SYNTHETIC] */
    private void mergeHi(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int iGallopLeft;
        int i9;
        int i10;
        boolean z;
        boolean z2;
        int i11;
        int i12;
        int i13 = i4;
        Object[] objArr = this.f204a;
        Object[] objArrEnsureCapacity = ensureCapacity(i13);
        System.arraycopy(objArr, i3, objArrEnsureCapacity, 0, i13);
        int i14 = i + i2;
        int i15 = i14 - 1;
        int i16 = i13 - 1;
        int i17 = i3 + i13;
        int i18 = i17 - 1;
        int i19 = i17 - 2;
        int i20 = i14 - 2;
        objArr[i18] = objArr[i15];
        int i21 = i2 - 1;
        if (i21 == 0) {
            System.arraycopy(objArrEnsureCapacity, 0, objArr, i19 - i16, i13);
            return;
        }
        if (i13 == 1) {
            int i22 = i19 - i21;
            System.arraycopy(objArr, (i20 - i21) + 1, objArr, i22 + 1, i21);
            objArr[i22] = objArrEnsureCapacity[i16];
            return;
        }
        int i23 = this.minGallop;
        loop0: while (true) {
            int i24 = 0;
            int i25 = 0;
            while (true) {
                if (((Comparable) objArrEnsureCapacity[i16]).compareTo(objArr[i20]) >= 0) {
                    i5 = i19 - 1;
                    i6 = i16 - 1;
                    objArr[i19] = objArrEnsureCapacity[i16];
                    i24++;
                    i13--;
                    if (i13 != 1) {
                        i19 = i5;
                        i16 = i6;
                        i25 = 0;
                    }
                    i7 = i5;
                    i16 = i6;
                    break loop0;
                }
                i7 = i19 - 1;
                int i26 = i20 - 1;
                objArr[i19] = objArr[i20];
                i25++;
                i21--;
                if (i21 == 0) {
                    i20 = i26;
                    break loop0;
                } else {
                    i19 = i7;
                    i20 = i26;
                    i24 = 0;
                }
                if ((i25 | i24) >= i23) {
                    while (true) {
                        int iGallopRight = i21 - gallopRight((Comparable) objArrEnsureCapacity[i16], objArr, i, i21, i21 - 1);
                        if (iGallopRight != 0) {
                            i19 -= iGallopRight;
                            i20 -= iGallopRight;
                            i21 -= iGallopRight;
                            System.arraycopy(objArr, i20 + 1, objArr, i19 + 1, iGallopRight);
                            if (i21 == 0) {
                                i7 = i19;
                                break loop0;
                            }
                            i5 = i19 - 1;
                            i6 = i16 - 1;
                            objArr[i19] = objArrEnsureCapacity[i16];
                            i8 = i13 - 1;
                            if (i8 == 1) {
                                i13 = i8;
                                i7 = i5;
                                i16 = i6;
                                break loop0;
                            }
                            iGallopLeft = i8 - gallopLeft((Comparable) objArr[i20], objArrEnsureCapacity, 0, i8, i13 - 2);
                            if (iGallopLeft != 0) {
                                i11 = i5 - iGallopLeft;
                                i12 = i6 - iGallopLeft;
                                i8 -= iGallopLeft;
                                System.arraycopy(objArrEnsureCapacity, i12 + 1, objArr, i11 + 1, iGallopLeft);
                                if (i8 <= 1) {
                                    i13 = i8;
                                    i7 = i11;
                                    i16 = i12;
                                    break loop0;
                                }
                                i5 = i11;
                                i16 = i12;
                            } else {
                                i16 = i6;
                            }
                            i9 = i5 - 1;
                            i10 = i20 - 1;
                            objArr[i5] = objArr[i20];
                            i21--;
                            if (i21 == 0) {
                                i13 = i8;
                                i7 = i9;
                                i20 = i10;
                                break loop0;
                            }
                            i23--;
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
                                if (i23 < 0) {
                                    i23 = 0;
                                }
                                i23 += 2;
                                i13 = i8;
                                i19 = i9;
                                i20 = i10;
                            } else {
                                i13 = i8;
                                i19 = i9;
                                i20 = i10;
                            }
                        } else {
                            i5 = i19 - 1;
                            i6 = i16 - 1;
                            objArr[i19] = objArrEnsureCapacity[i16];
                            i8 = i13 - 1;
                            if (i8 == 1) {
                                i13 = i8;
                                i7 = i5;
                                i16 = i6;
                                break loop0;
                            }
                            iGallopLeft = i8 - gallopLeft((Comparable) objArr[i20], objArrEnsureCapacity, 0, i8, i13 - 2);
                            if (iGallopLeft != 0) {
                                i11 = i5 - iGallopLeft;
                                i12 = i6 - iGallopLeft;
                                i8 -= iGallopLeft;
                                System.arraycopy(objArrEnsureCapacity, i12 + 1, objArr, i11 + 1, iGallopLeft);
                                if (i8 <= 1) {
                                    i13 = i8;
                                    i7 = i11;
                                    i16 = i12;
                                    break loop0;
                                }
                                i5 = i11;
                                i16 = i12;
                            } else {
                                i16 = i6;
                            }
                            i9 = i5 - 1;
                            i10 = i20 - 1;
                            objArr[i5] = objArr[i20];
                            i21--;
                            if (i21 == 0) {
                                i13 = i8;
                                i7 = i9;
                                i20 = i10;
                                break loop0;
                            }
                            i23--;
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
                                if (i23 < 0) {
                                    i23 = 0;
                                }
                                i23 += 2;
                                i13 = i8;
                                i19 = i9;
                                i20 = i10;
                            } else {
                                i13 = i8;
                                i19 = i9;
                                i20 = i10;
                            }
                        }
                    }
                }
            }
        }
        if (i23 < 1) {
            i23 = 1;
        }
        this.minGallop = i23;
        if (i13 == 1) {
            int i27 = i7 - i21;
            System.arraycopy(objArr, (i20 - i21) + 1, objArr, i27 + 1, i21);
            objArr[i27] = objArrEnsureCapacity[i16];
        } else {
            if (i13 == 0) {
                throw new IllegalArgumentException("Comparison method violates its general contract!");
            }
            System.arraycopy(objArrEnsureCapacity, 0, objArr, i7 - (i13 - 1), i13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0076 A[PHI: r3 r5 r13
  0x0076: PHI (r3v6 int) = (r3v5 int), (r3v16 int) binds: [B:25:0x006a, B:27:0x0072] A[DONT_GENERATE, DONT_INLINE]
  0x0076: PHI (r5v10 int) = (r5v9 int), (r5v16 int) binds: [B:25:0x006a, B:27:0x0072] A[DONT_GENERATE, DONT_INLINE]
  0x0076: PHI (r13v9 int) = (r13v8 int), (r13v11 int) binds: [B:25:0x006a, B:27:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    /* JADX WARN: Code duplicated, block: B:34:0x008e  */
    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    /* JADX WARN: Code duplicated, block: B:38:0x009f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00de  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e5 A[LOOP:2: B:24:0x0062->B:64:0x00e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00dc A[SYNTHETIC] */
    private void mergeLo(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int iGallopLeft;
        int i8;
        int i9;
        boolean z;
        boolean z2;
        int i10;
        int i11;
        Object[] objArr = this.f204a;
        Object[] objArrEnsureCapacity = ensureCapacity(i2);
        System.arraycopy(objArr, i, objArrEnsureCapacity, 0, i2);
        int i12 = i + 1;
        int i13 = i3 + 1;
        objArr[i] = objArr[i3];
        int i14 = i4 - 1;
        if (i14 == 0) {
            System.arraycopy(objArrEnsureCapacity, 0, objArr, i12, i2);
            return;
        }
        if (i2 == 1) {
            System.arraycopy(objArr, i13, objArr, i12, i14);
            objArr[i12 + i14] = objArrEnsureCapacity[0];
            return;
        }
        int i15 = this.minGallop;
        int i16 = 0;
        loop0: while (true) {
            int i17 = 0;
            int i18 = 0;
            while (true) {
                if (((Comparable) objArr[i13]).compareTo(objArrEnsureCapacity[i16]) < 0) {
                    i5 = i12 + 1;
                    i6 = i13 + 1;
                    objArr[i12] = objArr[i13];
                    i18++;
                    i14--;
                    if (i14 != 0) {
                        i12 = i5;
                        i13 = i6;
                        i17 = 0;
                    }
                    i13 = i6;
                    break loop0;
                }
                int i19 = i12 + 1;
                int i20 = i16 + 1;
                objArr[i12] = objArrEnsureCapacity[i16];
                i17++;
                i2--;
                if (i2 == 1) {
                    i5 = i19;
                    i16 = i20;
                    break loop0;
                } else {
                    i12 = i19;
                    i16 = i20;
                    i18 = 0;
                }
                if ((i17 | i18) >= i15) {
                    while (true) {
                        int iGallopRight = gallopRight((Comparable) objArr[i13], objArrEnsureCapacity, i16, i2, 0);
                        if (iGallopRight != 0) {
                            System.arraycopy(objArrEnsureCapacity, i16, objArr, i12, iGallopRight);
                            i12 += iGallopRight;
                            i16 += iGallopRight;
                            i2 -= iGallopRight;
                            if (i2 <= 1) {
                                i5 = i12;
                                break loop0;
                            }
                            i7 = i12 + 1;
                            i6 = i13 + 1;
                            objArr[i12] = objArr[i13];
                            i14--;
                            if (i14 == 0) {
                                i5 = i7;
                                i13 = i6;
                                break loop0;
                            }
                            iGallopLeft = gallopLeft((Comparable) objArrEnsureCapacity[i16], objArr, i6, i14, 0);
                            if (iGallopLeft != 0) {
                                System.arraycopy(objArr, i6, objArr, i7, iGallopLeft);
                                i10 = i7 + iGallopLeft;
                                i11 = i6 + iGallopLeft;
                                i14 -= iGallopLeft;
                                if (i14 == 0) {
                                    i5 = i10;
                                    i13 = i11;
                                    break loop0;
                                } else {
                                    i7 = i10;
                                    i13 = i11;
                                }
                            } else {
                                i13 = i6;
                            }
                            i8 = i7 + 1;
                            i9 = i16 + 1;
                            objArr[i7] = objArrEnsureCapacity[i16];
                            i2--;
                            if (i2 == 1) {
                                i5 = i8;
                                i16 = i9;
                                break loop0;
                            }
                            i15--;
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
                                if (i15 < 0) {
                                    i15 = 0;
                                }
                                i15 += 2;
                                i12 = i8;
                                i16 = i9;
                            } else {
                                i12 = i8;
                                i16 = i9;
                            }
                        } else {
                            i7 = i12 + 1;
                            i6 = i13 + 1;
                            objArr[i12] = objArr[i13];
                            i14--;
                            if (i14 == 0) {
                                i5 = i7;
                                i13 = i6;
                                break loop0;
                            }
                            iGallopLeft = gallopLeft((Comparable) objArrEnsureCapacity[i16], objArr, i6, i14, 0);
                            if (iGallopLeft != 0) {
                                System.arraycopy(objArr, i6, objArr, i7, iGallopLeft);
                                i10 = i7 + iGallopLeft;
                                i11 = i6 + iGallopLeft;
                                i14 -= iGallopLeft;
                                if (i14 == 0) {
                                    i5 = i10;
                                    i13 = i11;
                                    break loop0;
                                } else {
                                    i7 = i10;
                                    i13 = i11;
                                }
                            } else {
                                i13 = i6;
                            }
                            i8 = i7 + 1;
                            i9 = i16 + 1;
                            objArr[i7] = objArrEnsureCapacity[i16];
                            i2--;
                            if (i2 == 1) {
                                i5 = i8;
                                i16 = i9;
                                break loop0;
                            }
                            i15--;
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
                                if (i15 < 0) {
                                    i15 = 0;
                                }
                                i15 += 2;
                                i12 = i8;
                                i16 = i9;
                            } else {
                                i12 = i8;
                                i16 = i9;
                            }
                        }
                    }
                }
            }
        }
        if (i15 < 1) {
            i15 = 1;
        }
        this.minGallop = i15;
        if (i2 == 1) {
            System.arraycopy(objArr, i13, objArr, i5, i14);
            objArr[i5 + i14] = objArrEnsureCapacity[i16];
        } else {
            if (i2 == 0) {
                throw new IllegalArgumentException("Comparison method violates its general contract!");
            }
            System.arraycopy(objArrEnsureCapacity, i16, objArr, i5, i2);
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

    public static void sort(Object[] objArr) {
        sort(objArr, 0, objArr.length);
    }

    public void doSort(Object[] objArr, int i, int i2) {
        this.stackSize = 0;
        rangeCheck(objArr.length, i, i2);
        int i3 = i2 - i;
        if (i3 < 2) {
            return;
        }
        if (i3 < 32) {
            binarySort(objArr, i, i2, countRunAndMakeAscending(objArr, i, i2) + i);
            return;
        }
        this.f204a = objArr;
        this.tmpCount = 0;
        int iMinRunLength = minRunLength(i3);
        do {
            int iCountRunAndMakeAscending = countRunAndMakeAscending(objArr, i, i2);
            if (iCountRunAndMakeAscending < iMinRunLength) {
                int i4 = i3 <= iMinRunLength ? i3 : iMinRunLength;
                binarySort(objArr, i, i + i4, iCountRunAndMakeAscending + i);
                iCountRunAndMakeAscending = i4;
            }
            pushRun(i, iCountRunAndMakeAscending);
            mergeCollapse();
            i += iCountRunAndMakeAscending;
            i3 -= iCountRunAndMakeAscending;
        } while (i3 != 0);
        mergeForceCollapse();
        this.f204a = null;
        Object[] objArr2 = this.tmp;
        int i5 = this.tmpCount;
        for (int i6 = 0; i6 < i5; i6++) {
            objArr2[i6] = null;
        }
    }

    public static void sort(Object[] objArr, int i, int i2) {
        rangeCheck(objArr.length, i, i2);
        int i3 = i2 - i;
        if (i3 < 2) {
            return;
        }
        if (i3 < 32) {
            binarySort(objArr, i, i2, countRunAndMakeAscending(objArr, i, i2) + i);
            return;
        }
        ComparableTimSort comparableTimSort = new ComparableTimSort(objArr);
        int iMinRunLength = minRunLength(i3);
        do {
            int iCountRunAndMakeAscending = countRunAndMakeAscending(objArr, i, i2);
            if (iCountRunAndMakeAscending < iMinRunLength) {
                int i4 = i3 <= iMinRunLength ? i3 : iMinRunLength;
                binarySort(objArr, i, i + i4, iCountRunAndMakeAscending + i);
                iCountRunAndMakeAscending = i4;
            }
            comparableTimSort.pushRun(i, iCountRunAndMakeAscending);
            comparableTimSort.mergeCollapse();
            i += iCountRunAndMakeAscending;
            i3 -= iCountRunAndMakeAscending;
        } while (i3 != 0);
        comparableTimSort.mergeForceCollapse();
    }

    private ComparableTimSort(Object[] objArr) {
        this.minGallop = 7;
        this.stackSize = 0;
        this.f204a = objArr;
        int length = objArr.length;
        this.tmp = new Object[length < 512 ? length >>> 1 : 256];
        int i = length < 120 ? 5 : length < 1542 ? 10 : length < 119151 ? 19 : 40;
        this.runBase = new int[i];
        this.runLen = new int[i];
    }
}
