package bc;

import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f5554c = new j(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5556b;

    public j(int i10, int i11) {
        this.f5555a = i10;
        this.f5556b = i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j.class.getSimpleName());
        sb2.append("[position = ");
        sb2.append(this.f5555a);
        sb2.append(", length = ");
        return l1.d.i(sb2, this.f5556b, X3.j.f27836e);
    }
}
