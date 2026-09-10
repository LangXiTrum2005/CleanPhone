package r1;

import com.google.android.gms.internal.ads.f6;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f49256d = new f6().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f49257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f49258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f49259c;

    public c(f6 f6Var) {
        this.f49257a = f6Var.f14258a;
        this.f49258b = f6Var.f14259b;
        this.f49259c = f6Var.f14260c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f49257a == cVar.f49257a && this.f49258b == cVar.f49258b && this.f49259c == cVar.f49259c;
    }

    public final int hashCode() {
        return ((this.f49257a ? 1 : 0) << 2) + ((this.f49258b ? 1 : 0) << 1) + (this.f49259c ? 1 : 0);
    }
}
