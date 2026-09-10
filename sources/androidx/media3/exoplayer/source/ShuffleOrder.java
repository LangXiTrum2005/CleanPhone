package androidx.media3.exoplayer.source;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public interface ShuffleOrder {

    public static class DefaultShuffleOrder implements ShuffleOrder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Random f6442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f6443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f6444c;

        public DefaultShuffleOrder() {
            this(new Random());
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final ShuffleOrder a(int i2) {
            Random random;
            int[] iArr;
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            int i3 = 0;
            while (true) {
                random = this.f6442a;
                iArr = this.f6443b;
                if (i3 >= i2) {
                    break;
                }
                iArr2[i3] = random.nextInt(iArr.length + 1);
                int i4 = i3 + 1;
                int iNextInt = random.nextInt(i4);
                iArr3[i3] = iArr3[iNextInt];
                iArr3[iNextInt] = i3;
                i3 = i4;
            }
            Arrays.sort(iArr2);
            int[] iArr4 = new int[iArr.length + i2];
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < iArr.length + i2; i7++) {
                if (i5 >= i2 || i6 != iArr2[i5]) {
                    int i8 = i6 + 1;
                    int i9 = iArr[i6];
                    iArr4[i7] = i9;
                    if (i9 >= 0) {
                        iArr4[i7] = i9 + i2;
                    }
                    i6 = i8;
                } else {
                    iArr4[i7] = iArr3[i5];
                    i5++;
                }
            }
            return new DefaultShuffleOrder(iArr4, new Random(random.nextLong()));
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final ShuffleOrder cloneAndClear() {
            return new DefaultShuffleOrder(new Random(this.f6442a.nextLong()));
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final ShuffleOrder cloneAndRemove(int i2) {
            int[] iArr = this.f6443b;
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
            return new DefaultShuffleOrder(iArr2, new Random(this.f6442a.nextLong()));
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final int getFirstIndex() {
            int[] iArr = this.f6443b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final int getLastIndex() {
            int[] iArr = this.f6443b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final int getLength() {
            return this.f6443b.length;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final int getNextIndex(int i2) {
            int i3 = this.f6444c[i2] + 1;
            int[] iArr = this.f6443b;
            if (i3 < iArr.length) {
                return iArr[i3];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final int getPreviousIndex(int i2) {
            int i3 = this.f6444c[i2] - 1;
            if (i3 >= 0) {
                return this.f6443b[i3];
            }
            return -1;
        }

        public DefaultShuffleOrder(int[] iArr, Random random) {
            this.f6443b = iArr;
            this.f6442a = random;
            this.f6444c = new int[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                this.f6444c[iArr[i2]] = i2;
            }
        }

        public DefaultShuffleOrder(Random random) {
            this(new int[0], random);
        }
    }

    public static final class UnshuffledShuffleOrder implements ShuffleOrder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6445a;

        public UnshuffledShuffleOrder(int i2) {
            this.f6445a = i2;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final ShuffleOrder a(int i2) {
            return new UnshuffledShuffleOrder(this.f6445a + i2);
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final ShuffleOrder cloneAndClear() {
            return new UnshuffledShuffleOrder(0);
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final ShuffleOrder cloneAndRemove(int i2) {
            return new UnshuffledShuffleOrder(this.f6445a - i2);
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final int getFirstIndex() {
            return this.f6445a > 0 ? 0 : -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final int getLastIndex() {
            int i2 = this.f6445a;
            if (i2 > 0) {
                return i2 - 1;
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final int getLength() {
            return this.f6445a;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final int getNextIndex(int i2) {
            int i3 = i2 + 1;
            if (i3 < this.f6445a) {
                return i3;
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public final int getPreviousIndex(int i2) {
            int i3 = i2 - 1;
            if (i3 >= 0) {
                return i3;
            }
            return -1;
        }
    }

    ShuffleOrder a(int i2);

    ShuffleOrder cloneAndClear();

    ShuffleOrder cloneAndRemove(int i2);

    int getFirstIndex();

    int getLastIndex();

    int getLength();

    int getNextIndex(int i2);

    int getPreviousIndex(int i2);
}
