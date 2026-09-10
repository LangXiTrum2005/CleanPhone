package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.z3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0688z3 implements InterfaceC0495o7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f31331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f31332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final H3 f31333c;

    public C0688z3(Boolean bool, Integer num, H3 h7) {
        this.f31331a = bool;
        this.f31332b = num;
        this.f31333c = h7;
    }

    private final Object a(H3 h7) {
        return new A3(this.f31331a, this.f31332b, h7).a();
    }

    @Override // com.ironsource.InterfaceC0495o7
    public Object b() {
        Integer num;
        H3 h7 = H3.Second;
        Throwable thA = wj.h.a(a(h7));
        if (thA != null) {
            return t9.e.c(thA);
        }
        if (!kotlin.jvm.internal.n.a(this.f31331a, Boolean.TRUE) || (num = this.f31332b) == null) {
            return null;
        }
        return new Wc(h7.a(num), null, 2, null);
    }

    @Override // com.ironsource.InterfaceC0495o7
    public Object c() {
        Integer num;
        Throwable thA = wj.h.a(a(this.f31333c));
        if (thA != null) {
            return t9.e.c(thA);
        }
        if (!kotlin.jvm.internal.n.a(this.f31331a, Boolean.TRUE) || (num = this.f31332b) == null) {
            return null;
        }
        int iIntValue = num.intValue();
        H3 h7 = this.f31333c;
        if (h7 != null) {
            return new C0592tf(iIntValue, h7);
        }
        return null;
    }

    public final Boolean d() {
        return this.f31331a;
    }

    public final Integer e() {
        return this.f31332b;
    }

    public final H3 f() {
        return this.f31333c;
    }

    @Override // com.ironsource.InterfaceC0495o7
    public Object a() {
        Throwable thA = wj.h.a(new L4(this.f31331a).a());
        if (thA != null) {
            return t9.e.c(thA);
        }
        Boolean bool = this.f31331a;
        if (bool != null) {
            return new K4(bool.booleanValue());
        }
        return null;
    }

    public /* synthetic */ C0688z3(Boolean bool, Integer num, H3 h7, int i10, kotlin.jvm.internal.g gVar) {
        this(bool, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : h7);
    }
}
