package g8;

import d5.u;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f41728c;

    public c(String str, String str2, String str3) {
        this.f41726a = str;
        this.f41727b = str2;
        this.f41728c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return n.a(this.f41726a, cVar.f41726a) && n.a(this.f41727b, cVar.f41727b) && n.a(this.f41728c, cVar.f41728c);
    }

    public final int hashCode() {
        return this.f41728c.hashCode() + u.e(this.f41726a.hashCode() * 31, 31, this.f41727b);
    }

    public final String toString() {
        return defpackage.e.q(this.f41728c, ")", defpackage.e.v("GalleryInfo(path=", this.f41726a, ", galleryId=", this.f41727b, ", galleryName="));
    }
}
