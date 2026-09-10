package com.google.android.exoplayer2.source;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public interface ShuffleOrder {

    public static class DefaultShuffleOrder implements ShuffleOrder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Random f18406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f18407b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f18408c;

        public DefaultShuffleOrder() {
            this(new Random());
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public final ShuffleOrder cloneAndClear() {
            return new DefaultShuffleOrder(new Random(this.f18406a.nextLong()));
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public final ShuffleOrder cloneAndInsert(int i2, int i3) {
            int[] iArr;
            Random random;
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            int i4 = 0;
            while (true) {
                iArr = this.f18407b;
                random = this.f18406a;
                if (i4 >= i3) {
                    break;
                }
                iArr2[i4] = random.nextInt(iArr.length + 1);
                int i5 = i4 + 1;
                int iNextInt = random.nextInt(i5);
                iArr3[i4] = iArr3[iNextInt];
                iArr3[iNextInt] = i4 + i2;
                i4 = i5;
            }
            Arrays.sort(iArr2);
            int[] iArr4 = new int[iArr.length + i3];
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < iArr.length + i3; i8++) {
                if (i6 >= i3 || i7 != iArr2[i6]) {
                    int i9 = i7 + 1;
                    int i10 = iArr[i7];
                    iArr4[i8] = i10;
                    if (i10 >= i2) {
                        iArr4[i8] = i10 + i3;
                    }
                    i7 = i9;
                } else {
                    iArr4[i8] = iArr3[i6];
                    i6++;
                }
            }
            return new DefaultShuffleOrder(iArr4, new Random(random.nextLong()));
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public final ShuffleOrder cloneAndRemove(int i2) {
            int[] iArr = this.f18407b;
            int[] iArr2 = new int[iArr.length - i2];
            int i3 = 0;
            for (int i4 = 0; i4 < iArr.length; i4++) {
                int i5 = iArr[i4];
                if (i5 < 0 || i5 >= i2) {
                    int i6 = i4 - i3;
                    if (i5 >= 0) {
                        i5 -= i2;
                    }
                    iArr2[i6] = i5;
                } else {
                    i3++;
                }
            }
            return new DefaultShuffleOrder(iArr2, new Random(this.f18406a.nextLong()));
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public final int getFirstIndex() {
            int[] iArr = this.f18407b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public final int getLastIndex() {
            int[] iArr = this.f18407b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public final int getLength() {
            return this.f18407b.length;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public final int getNextIndex(int i2) {
            int i3 = this.f18408c[i2] + 1;
            int[] iArr = this.f18407b;
            if (i3 < iArr.length) {
                return iArr[i3];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public final int getPreviousIndex(int i2) {
            int i3 = this.f18408c[i2] - 1;
            if (i3 >= 0) {
                return this.f18407b[i3];
            }
            return -1;
        }

        public DefaultShuffleOrder(int[] iArr, Random random) {
            this.f18407b = iArr;
            this.f18406a = random;
            this.f18408c = new int[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                this.f18408c[iArr[i2]] = i2;
            }
        }

        public DefaultShuffleOrder(Random random) {
            this(new int[0], random);
        }
    }

    public static final class UnshuffledShuffleOrder implements ShuffleOrder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18409a;

        public UnshuffledShuffleOrder(int i2) {
            this.f18409a = i2;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public final ShuffleOrder cloneAndClear() {
            return new UnshuffledShuffleOrder(0);
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public final ShuffleOrder cloneAndInsert(int i2, int i3) {
            return new UnshuffledShuffleOrder(this.f18409a + i3);
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public final ShuffleOrder cloneAndRemove(int i2) {
            return new UnshuffledShuffleOrder(this.f18409a - i2);
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public final int getFirstIndex() {
            return this.f18409a > 0 ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public final int getLastIndex() {
            int i2 = this.f18409a;
            if (i2 > 0) {
                return i2 - 1;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public final int getLength() {
            return this.f18409a;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public final int getNextIndex(int i2) {
            int i3 = i2 + 1;
            if (i3 < this.f18409a) {
                return i3;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.ShuffleOrder
        public final int getPreviousIndex(int i2) {
            int i3 = i2 - 1;
            if (i3 >= 0) {
                return i3;
            }
            return -1;
        }
    }

    ShuffleOrder cloneAndClear();

    ShuffleOrder cloneAndInsert(int i2, int i3);

    ShuffleOrder cloneAndRemove(int i2);

    int getFirstIndex();

    int getLastIndex();

    int getLength();

    int getNextIndex(int i2);

    int getPreviousIndex(int i2);
}
