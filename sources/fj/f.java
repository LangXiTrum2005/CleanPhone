package fj;

import com.google.android.gms.internal.auth.i;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f40967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f40968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f40969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f40970g;

    public f(String str, String str2, String str3, boolean z10, String str4, List list, List list2) {
        this.f40964a = str;
        this.f40965b = str2;
        this.f40966c = str3;
        this.f40967d = z10;
        this.f40968e = str4;
        this.f40969f = list;
        this.f40970g = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(f.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        f fVar = (f) obj;
        return i.i(this.f40964a, fVar.f40964a) && i.i(this.f40965b, fVar.f40965b) && i.i(this.f40966c, fVar.f40966c) && i.i(Boolean.valueOf(this.f40967d), Boolean.valueOf(fVar.f40967d)) && i.i(this.f40968e, fVar.f40968e) && i.i(this.f40969f, fVar.f40969f) && i.i(this.f40970g, fVar.f40970g);
    }

    public final int hashCode() {
        return i.k(this.f40970g) + ((i.k(this.f40969f) + ((i.k(this.f40968e) + ((i.k(Boolean.valueOf(this.f40967d)) + ((i.k(this.f40966c) + ((i.k(this.f40965b) + ((i.k(this.f40964a) + (f.class.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbV = defpackage.e.v("RecordErrorRequest(exception=", this.f40964a, ", information=", this.f40965b, ", reason=");
        sbV.append(this.f40966c);
        sbV.append(", fatal=");
        sbV.append(this.f40967d);
        sbV.append(", buildId=");
        sbV.append(this.f40968e);
        sbV.append(", loadingUnits=");
        sbV.append(this.f40969f);
        sbV.append(", stackTraceElements=");
        sbV.append(this.f40970g);
        sbV.append(")");
        return sbV.toString();
    }
}
