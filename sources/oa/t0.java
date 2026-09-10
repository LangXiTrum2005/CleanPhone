package oa;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class t0 implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f47314a;

    public t0(Object[] objArr) {
        this.f47314a = objArr;
    }

    public Object readResolve() {
        return u0.w(this.f47314a);
    }
}
