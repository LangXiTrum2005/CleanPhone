package androidx.collection;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/collection/CircularIntArray;", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CircularIntArray {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f3736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3738c;
    public int d;

    public CircularIntArray() {
        int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.d = iHighestOneBit - 1;
        this.f3736a = new int[iHighestOneBit];
    }

    public final void a(int i2) {
        int[] iArr = this.f3736a;
        int i3 = this.f3738c;
        iArr[i3] = i2;
        int i4 = this.d & (i3 + 1);
        this.f3738c = i4;
        int i5 = this.f3737b;
        if (i4 == i5) {
            int length = iArr.length;
            int i6 = length - i5;
            int i7 = length << 1;
            if (i7 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i7];
            ArraysKt.n(0, i5, length, iArr, iArr2);
            ArraysKt.n(i6, 0, this.f3737b, this.f3736a, iArr2);
            this.f3736a = iArr2;
            this.f3737b = 0;
            this.f3738c = length;
            this.d = i7 - 1;
        }
    }

    public final int b() {
        int i2 = this.f3737b;
        if (i2 == this.f3738c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.f3736a[i2];
        this.f3737b = (i2 + 1) & this.d;
        return i3;
    }
}
