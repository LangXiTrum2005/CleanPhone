package oa;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class w0 implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator f47338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f47339b;

    public w0(Comparator comparator, Object[] objArr) {
        this.f47338a = comparator;
        this.f47339b = objArr;
    }

    public Object readResolve() {
        v0 v0Var = new v0(this.f47338a);
        v0Var.c(this.f47339b);
        return v0Var.i();
    }
}
