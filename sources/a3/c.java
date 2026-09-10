package a3;

import com.google.android.gms.internal.ads.o6;
import defpackage.e;
import i1.b0;
import java.util.Arrays;
import l1.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f3378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3380c;

    public c(String str, byte[] bArr, String str2) {
        this.f3378a = bArr;
        this.f3379b = str;
        this.f3380c = str2;
    }

    @Override // i1.b0
    public final void b(o6 o6Var) {
        String str = this.f3379b;
        if (str != null) {
            o6Var.f18151a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f3378a, ((c) obj).f3378a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3378a);
    }

    public final String toString() {
        return d.i(e.v("ICY: title=\"", this.f3379b, "\", url=\"", this.f3380c, "\", rawMetadata.length=\""), this.f3378a.length, "\"");
    }
}
