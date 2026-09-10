package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.ve, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0627ve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<IronSource.a> f30868c;

    public C0627ve(String appKey, String str, List<IronSource.a> legacyAdFormats) {
        kotlin.jvm.internal.n.f(appKey, "appKey");
        kotlin.jvm.internal.n.f(legacyAdFormats, "legacyAdFormats");
        this.f30866a = appKey;
        this.f30867b = str;
        this.f30868c = legacyAdFormats;
    }

    public final String a() {
        return this.f30866a;
    }

    public final String b() {
        return this.f30867b;
    }

    public final List<IronSource.a> c() {
        return this.f30868c;
    }

    public final String d() {
        return this.f30866a;
    }

    public final List<IronSource.a> e() {
        return this.f30868c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0627ve)) {
            return false;
        }
        C0627ve c0627ve = (C0627ve) obj;
        return kotlin.jvm.internal.n.a(this.f30866a, c0627ve.f30866a) && kotlin.jvm.internal.n.a(this.f30867b, c0627ve.f30867b) && kotlin.jvm.internal.n.a(this.f30868c, c0627ve.f30868c);
    }

    public final String f() {
        return this.f30867b;
    }

    public int hashCode() {
        int iHashCode = this.f30866a.hashCode() * 31;
        String str = this.f30867b;
        return this.f30868c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.f30866a;
        String str2 = this.f30867b;
        List<IronSource.a> list = this.f30868c;
        StringBuilder sbV = defpackage.e.v("SdkInitRequest(appKey=", str, ", userId=", str2, ", legacyAdFormats=");
        sbV.append(list);
        sbV.append(")");
        return sbV.toString();
    }

    public final C0627ve a(String appKey, String str, List<IronSource.a> legacyAdFormats) {
        kotlin.jvm.internal.n.f(appKey, "appKey");
        kotlin.jvm.internal.n.f(legacyAdFormats, "legacyAdFormats");
        return new C0627ve(appKey, str, legacyAdFormats);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C0627ve a(C0627ve c0627ve, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c0627ve.f30866a;
        }
        if ((i10 & 2) != 0) {
            str2 = c0627ve.f30867b;
        }
        if ((i10 & 4) != 0) {
            list = c0627ve.f30868c;
        }
        return c0627ve.a(str, str2, list);
    }

    public final void a(List<? extends IronSource.a> adFormats) {
        kotlin.jvm.internal.n.f(adFormats, "adFormats");
        this.f30868c.clear();
        this.f30868c.addAll(adFormats);
    }

    public /* synthetic */ C0627ve(String str, String str2, List list, int i10, kotlin.jvm.internal.g gVar) {
        this(str, (i10 & 2) != 0 ? null : str2, list);
    }
}
