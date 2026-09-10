package x2;

import defpackage.e;
import i1.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f53570b;

    public a(int i10, String str) {
        this.f53569a = i10;
        this.f53570b = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Ait(controlCode=");
        sb2.append(this.f53569a);
        sb2.append(",url=");
        return e.q(this.f53570b, ")", sb2);
    }
}
