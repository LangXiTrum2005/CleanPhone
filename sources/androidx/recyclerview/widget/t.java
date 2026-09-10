package androidx.recyclerview.widget;

import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4931a;

    public t(b bVar) {
        this.f4931a = bVar;
    }

    public static int a(int i10, int i11) {
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            i12++;
            if (i12 == i11) {
                i13++;
                i12 = 0;
            } else if (i12 > i11) {
                i13++;
                i12 = 1;
            }
        }
        return i12 + 1 > i11 ? i13 + 1 : i13;
    }

    public void b() {
        ((SparseIntArray) this.f4931a).clear();
    }

    public t() {
        this.f4931a = new SparseIntArray();
    }
}
