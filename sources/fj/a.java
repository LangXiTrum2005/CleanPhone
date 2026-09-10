package fj;

import com.google.android.gms.internal.auth.i;
import d5.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f40956d;

    public a(String str, String str2, String str3, String str4) {
        this.f40953a = str;
        this.f40954b = str2;
        this.f40955c = str3;
        this.f40956d = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(a.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        a aVar = (a) obj;
        return i.i(this.f40953a, aVar.f40953a) && i.i(this.f40954b, aVar.f40954b) && i.i(this.f40955c, aVar.f40955c) && i.i(this.f40956d, aVar.f40956d);
    }

    public final int hashCode() {
        return i.k(this.f40956d) + ((i.k(this.f40955c) + ((i.k(this.f40954b) + ((i.k(this.f40953a) + (a.class.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return u.h(defpackage.e.v("CrashlyticsStackFrame(className=", this.f40953a, ", method=", this.f40954b, ", file="), this.f40955c, ", line=", this.f40956d, ")");
    }
}
