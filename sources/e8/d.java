package e8;

import android.graphics.Bitmap;
import defpackage.e;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bitmap.CompressFormat f39179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f39181e;

    public d(int i10, int i11, Bitmap.CompressFormat format, int i12, long j10) {
        n.f(format, "format");
        this.f39177a = i10;
        this.f39178b = i11;
        this.f39179c = format;
        this.f39180d = i12;
        this.f39181e = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f39177a == dVar.f39177a && this.f39178b == dVar.f39178b && this.f39179c == dVar.f39179c && this.f39180d == dVar.f39180d && this.f39181e == dVar.f39181e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f39181e) + wi.d.f(this.f39180d, (this.f39179c.hashCode() + wi.d.f(this.f39178b, Integer.hashCode(this.f39177a) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbL = l1.d.l("ThumbLoadOption(width=", this.f39177a, ", height=", this.f39178b, ", format=");
        sbL.append(this.f39179c);
        sbL.append(", quality=");
        sbL.append(this.f39180d);
        sbL.append(", frame=");
        return e.r(sbL, this.f39181e, ")");
    }
}
