package androidx.recyclerview.widget;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SparseArray f4957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4958b;

    public final w0 a(int i10) {
        SparseArray sparseArray = this.f4957a;
        w0 w0Var = (w0) sparseArray.get(i10);
        if (w0Var != null) {
            return w0Var;
        }
        w0 w0Var2 = new w0();
        sparseArray.put(i10, w0Var2);
        return w0Var2;
    }
}
