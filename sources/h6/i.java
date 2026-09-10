package h6;

import a7.p;
import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f42236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap.Config f42238c;

    public i(e eVar) {
        this.f42236a = eVar;
    }

    @Override // h6.g
    public final void a() {
        this.f42236a.D0(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f42237b == iVar.f42237b && p.b(this.f42238c, iVar.f42238c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f42237b * 31;
        Bitmap.Config config = this.f42238c;
        return i10 + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return j.c(this.f42237b, this.f42238c);
    }
}
