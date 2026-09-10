package h3;

import n2.x;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f42135b = new h(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f42136c = new h(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42137a;

    public h(boolean z10) {
        this.f42137a = z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IncorrectFragmentation{expected=");
        sb2.append(!this.f42137a);
        sb2.append("}");
        return sb2.toString();
    }
}
