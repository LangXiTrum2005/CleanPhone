package ethene;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: compiled from: ShuffleOrder.java */
/* JADX INFO: loaded from: classes.dex */
public interface oilcan {

    /* JADX INFO: compiled from: ShuffleOrder.java */
    public static class attabal implements oilcan {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Random f26049attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int[] f26050dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int[] f26051saneness;

        public attabal(int i) {
            this(i, new Random());
        }

        public static int[] saneness(int i, Random random) {
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                int iNextInt = random.nextInt(i3);
                iArr[i2] = iArr[iNextInt];
                iArr[iNextInt] = i2;
                i2 = i3;
            }
            return iArr;
        }

        @Override // ethene.oilcan
        public oilcan attabal(int i, int i2) {
            int i3 = i2 - i;
            int[] iArr = new int[this.f26051saneness.length - i3];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.f26051saneness;
                if (i4 >= iArr2.length) {
                    return new attabal(iArr, new Random(this.f26049attabal.nextLong()));
                }
                int i6 = iArr2[i4];
                if (i6 < i || i6 >= i2) {
                    int i7 = i4 - i5;
                    if (i6 >= i) {
                        i6 -= i3;
                    }
                    iArr[i7] = i6;
                } else {
                    i5++;
                }
                i4++;
            }
        }

        @Override // ethene.oilcan
        public oilcan cloneAndClear() {
            return new attabal(0, new Random(this.f26049attabal.nextLong()));
        }

        @Override // ethene.oilcan
        public oilcan cloneAndInsert(int i, int i2) {
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int i3 = 0;
            int i4 = 0;
            while (i4 < i2) {
                iArr[i4] = this.f26049attabal.nextInt(this.f26051saneness.length + 1);
                int i5 = i4 + 1;
                int iNextInt = this.f26049attabal.nextInt(i5);
                iArr2[i4] = iArr2[iNextInt];
                iArr2[iNextInt] = i4 + i;
                i4 = i5;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f26051saneness.length + i2];
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int[] iArr4 = this.f26051saneness;
                if (i3 >= iArr4.length + i2) {
                    return new attabal(iArr3, new Random(this.f26049attabal.nextLong()));
                }
                if (i6 >= i2 || i7 != iArr[i6]) {
                    int i8 = i7 + 1;
                    int i9 = iArr4[i7];
                    iArr3[i3] = i9;
                    if (i9 >= i) {
                        iArr3[i3] = i9 + i2;
                    }
                    i7 = i8;
                } else {
                    iArr3[i3] = iArr2[i6];
                    i6++;
                }
                i3++;
            }
        }

        @Override // ethene.oilcan
        public int getFirstIndex() {
            int[] iArr = this.f26051saneness;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // ethene.oilcan
        public int getLastIndex() {
            int[] iArr = this.f26051saneness;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // ethene.oilcan
        public int getLength() {
            return this.f26051saneness.length;
        }

        @Override // ethene.oilcan
        public int getNextIndex(int i) {
            int i2 = this.f26050dern[i] + 1;
            int[] iArr = this.f26051saneness;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }

        @Override // ethene.oilcan
        public int getPreviousIndex(int i) {
            int i2 = this.f26050dern[i] - 1;
            if (i2 >= 0) {
                return this.f26051saneness[i2];
            }
            return -1;
        }

        public attabal(int i, Random random) {
            this(saneness(i, random), random);
        }

        public attabal(int[] iArr, Random random) {
            this.f26051saneness = iArr;
            this.f26049attabal = random;
            this.f26050dern = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f26050dern[iArr[i]] = i;
            }
        }
    }

    oilcan attabal(int i, int i2);

    oilcan cloneAndClear();

    oilcan cloneAndInsert(int i, int i2);

    int getFirstIndex();

    int getLastIndex();

    int getLength();

    int getNextIndex(int i);

    int getPreviousIndex(int i);
}
