package xj;

import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends f implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int[] f53862a;

    public l(int[] iArr) {
        this.f53862a = iArr;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0024 A[RETURN] */
    @Override // xj.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f53862a;
        kotlin.jvm.internal.n.f(iArr, "<this>");
        int length = iArr.length;
        int i10 = 0;
        while (i10 < length) {
            if (iIntValue == iArr[i10]) {
                if (i10 >= 0) {
                    return true;
                }
                return false;
            }
            i10++;
        }
        i10 = -1;
        if (i10 >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return Integer.valueOf(this.f53862a[i10]);
    }

    @Override // xj.a
    public final int getSize() {
        return this.f53862a.length;
    }

    @Override // xj.f, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f53862a;
        kotlin.jvm.internal.n.f(iArr, "<this>");
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (iIntValue == iArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    @Override // xj.a, java.util.Collection
    public final boolean isEmpty() {
        return this.f53862a.length == 0;
    }

    @Override // xj.f, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f53862a;
        kotlin.jvm.internal.n.f(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (iIntValue == iArr[length]) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }
}
