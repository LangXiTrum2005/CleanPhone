package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.ag, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0253ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28233a;

    public C0253ag() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String a() {
        return this.f28233a;
    }

    public final String b() {
        return this.f28233a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0253ag) && kotlin.jvm.internal.n.a(this.f28233a, ((C0253ag) obj).f28233a);
    }

    public int hashCode() {
        String str = this.f28233a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return defpackage.e.o("TestSuiteSettings(controllerUrl=", this.f28233a, ")");
    }

    public C0253ag(String str) {
        this.f28233a = str;
    }

    public final C0253ag a(String str) {
        return new C0253ag(str);
    }

    public final void b(String str) {
        this.f28233a = str;
    }

    public /* synthetic */ C0253ag(String str, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? null : str);
    }

    public static /* synthetic */ C0253ag a(C0253ag c0253ag, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c0253ag.f28233a;
        }
        return c0253ag.a(str);
    }
}
