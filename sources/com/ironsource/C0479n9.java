package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.n9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0479n9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f29837c;

    public C0479n9() {
        this(null, 0, null, 7, null);
    }

    public final String a() {
        return this.f29835a;
    }

    public final int b() {
        return this.f29836b;
    }

    public final String c() {
        return this.f29837c;
    }

    public final String d() {
        return this.f29837c;
    }

    public final String e() {
        return this.f29835a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0479n9)) {
            return false;
        }
        C0479n9 c0479n9 = (C0479n9) obj;
        return kotlin.jvm.internal.n.a(this.f29835a, c0479n9.f29835a) && this.f29836b == c0479n9.f29836b && kotlin.jvm.internal.n.a(this.f29837c, c0479n9.f29837c);
    }

    public final int f() {
        return this.f29836b;
    }

    public int hashCode() {
        int iF = wi.d.f(this.f29836b, this.f29835a.hashCode() * 31, 31);
        String str = this.f29837c;
        return iF + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f29835a;
        int i10 = this.f29836b;
        String str2 = this.f29837c;
        StringBuilder sb2 = new StringBuilder("InstanceInformation(instanceId=");
        sb2.append(str);
        sb2.append(", instanceType=");
        sb2.append(i10);
        sb2.append(", dynamicDemandSourceId=");
        return defpackage.e.q(str2, ")", sb2);
    }

    public C0479n9(String instanceId, int i10, String str) {
        kotlin.jvm.internal.n.f(instanceId, "instanceId");
        this.f29835a = instanceId;
        this.f29836b = i10;
        this.f29837c = str;
    }

    public final C0479n9 a(String instanceId, int i10, String str) {
        kotlin.jvm.internal.n.f(instanceId, "instanceId");
        return new C0479n9(instanceId, i10, str);
    }

    public static /* synthetic */ C0479n9 a(C0479n9 c0479n9, String str, int i10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = c0479n9.f29835a;
        }
        if ((i11 & 2) != 0) {
            i10 = c0479n9.f29836b;
        }
        if ((i11 & 4) != 0) {
            str2 = c0479n9.f29837c;
        }
        return c0479n9.a(str, i10, str2);
    }

    public /* synthetic */ C0479n9(String str, int i10, String str2, int i11, kotlin.jvm.internal.g gVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? "" : str2);
    }
}
