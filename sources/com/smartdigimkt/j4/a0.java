package com.smartdigimkt.j4;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public interface a0 {

    public static class a implements a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Random f35936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f35937b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f35938c;

        public a(int i2) {
            this(i2, new Random());
        }

        @Override // com.smartdigimkt.j4.a0
        public int a() {
            return this.f35937b.length;
        }

        @Override // com.smartdigimkt.j4.a0
        public int b() {
            int[] iArr = this.f35937b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // com.smartdigimkt.j4.a0
        public int c(int i2) {
            int i3 = this.f35938c[i2] - 1;
            if (i3 >= 0) {
                return this.f35937b[i3];
            }
            return -1;
        }

        @Override // com.smartdigimkt.j4.a0
        public a0 d() {
            return new a(0, new Random(this.f35936a.nextLong()));
        }

        public a(int i2, long j) {
            this(i2, new Random(j));
        }

        @Override // com.smartdigimkt.j4.a0
        public int a(int i2) {
            int i3 = this.f35938c[i2] + 1;
            int[] iArr = this.f35937b;
            if (i3 < iArr.length) {
                return iArr[i3];
            }
            return -1;
        }

        @Override // com.smartdigimkt.j4.a0
        public a0 b(int i2) {
            int[] iArr = new int[this.f35937b.length - 1];
            int i3 = 0;
            boolean z2 = false;
            while (true) {
                int[] iArr2 = this.f35937b;
                if (i3 >= iArr2.length) {
                    return new a(iArr, new Random(this.f35936a.nextLong()));
                }
                int i4 = iArr2[i3];
                if (i4 == i2) {
                    z2 = true;
                } else {
                    int i5 = z2 ? i3 - 1 : i3;
                    if (i4 > i2) {
                        i4--;
                    }
                    iArr[i5] = i4;
                }
                i3++;
            }
        }

        private a(int i2, Random random) {
            this(a(i2, random), random);
        }

        @Override // com.smartdigimkt.j4.a0
        public int c() {
            int[] iArr = this.f35937b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        private a(int[] iArr, Random random) {
            this.f35937b = iArr;
            this.f35936a = random;
            this.f35938c = new int[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                this.f35938c[iArr[i2]] = i2;
            }
        }

        @Override // com.smartdigimkt.j4.a0
        public a0 a(int i2, int i3) {
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int i4 = 0;
            int i5 = 0;
            while (i5 < i3) {
                iArr[i5] = this.f35936a.nextInt(this.f35937b.length + 1);
                int i6 = i5 + 1;
                int iNextInt = this.f35936a.nextInt(i6);
                iArr2[i5] = iArr2[iNextInt];
                iArr2[iNextInt] = i5 + i2;
                i5 = i6;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f35937b.length + i3];
            int i7 = 0;
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f35937b;
                if (i4 < iArr4.length + i3) {
                    if (i7 < i3 && i8 == iArr[i7]) {
                        iArr3[i4] = iArr2[i7];
                        i7++;
                    } else {
                        int i9 = i8 + 1;
                        int i10 = iArr4[i8];
                        iArr3[i4] = i10;
                        if (i10 >= i2) {
                            iArr3[i4] = i10 + i3;
                        }
                        i8 = i9;
                    }
                    i4++;
                } else {
                    return new a(iArr3, new Random(this.f35936a.nextLong()));
                }
            }
        }

        private static int[] a(int i2, Random random) {
            int[] iArr = new int[i2];
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i3 + 1;
                int iNextInt = random.nextInt(i4);
                iArr[i3] = iArr[iNextInt];
                iArr[iNextInt] = i3;
                i3 = i4;
            }
            return iArr;
        }
    }

    public static final class b implements a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f35939a;

        public b(int i2) {
            this.f35939a = i2;
        }

        @Override // com.smartdigimkt.j4.a0
        public int a() {
            return this.f35939a;
        }

        @Override // com.smartdigimkt.j4.a0
        public int b() {
            return this.f35939a > 0 ? 0 : -1;
        }

        @Override // com.smartdigimkt.j4.a0
        public int c(int i2) {
            int i3 = i2 - 1;
            if (i3 >= 0) {
                return i3;
            }
            return -1;
        }

        @Override // com.smartdigimkt.j4.a0
        public a0 d() {
            return new b(0);
        }

        @Override // com.smartdigimkt.j4.a0
        public int a(int i2) {
            int i3 = i2 + 1;
            if (i3 < this.f35939a) {
                return i3;
            }
            return -1;
        }

        @Override // com.smartdigimkt.j4.a0
        public a0 b(int i2) {
            return new b(this.f35939a - 1);
        }

        @Override // com.smartdigimkt.j4.a0
        public int c() {
            int i2 = this.f35939a;
            if (i2 > 0) {
                return i2 - 1;
            }
            return -1;
        }

        @Override // com.smartdigimkt.j4.a0
        public a0 a(int i2, int i3) {
            return new b(this.f35939a + i3);
        }
    }

    int a();

    int a(int i2);

    a0 a(int i2, int i3);

    int b();

    a0 b(int i2);

    int c();

    int c(int i2);

    a0 d();
}
