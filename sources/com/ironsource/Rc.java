package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Rc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27147b;

    public Rc(String url, String str) {
        kotlin.jvm.internal.n.f(url, "url");
        this.f27146a = url;
        this.f27147b = str;
    }

    public final String a() {
        return this.f27146a;
    }

    public final String b() {
        return this.f27147b;
    }

    public final String c() {
        return this.f27147b;
    }

    public final String d() {
        return this.f27146a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rc)) {
            return false;
        }
        Rc rc2 = (Rc) obj;
        return kotlin.jvm.internal.n.a(this.f27146a, rc2.f27146a) && kotlin.jvm.internal.n.a(this.f27147b, rc2.f27147b);
    }

    public int hashCode() {
        int iHashCode = this.f27146a.hashCode() * 31;
        String str = this.f27147b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return l1.d.h("OpenUrl(url=", this.f27146a, ", packageName=", this.f27147b, ")");
    }

    public /* synthetic */ Rc(String str, String str2, int i10, kotlin.jvm.internal.g gVar) {
        this(str, (i10 & 2) != 0 ? "" : str2);
    }

    public final Rc a(String url, String str) {
        kotlin.jvm.internal.n.f(url, "url");
        return new Rc(url, str);
    }

    public static /* synthetic */ Rc a(Rc rc2, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = rc2.f27146a;
        }
        if ((i10 & 2) != 0) {
            str2 = rc2.f27147b;
        }
        return rc2.a(str, str2);
    }
}
