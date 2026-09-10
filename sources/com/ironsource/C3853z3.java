package com.ironsource;

import p002kotlin.Result;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.z3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3853z3 implements InterfaceC3634m7 {
    private final Boolean a;
    private final Integer b;
    private final H3 c;

    public C3853z3(Boolean bool, Integer num, H3 h3) {
        this.a = bool;
        this.b = num;
        this.c = h3;
    }

    private final Object a(H3 h3) {
        return new A3(this.a, this.b, h3).a();
    }

    @Override // com.ironsource.InterfaceC3634m7
    public Object b() {
        Integer num;
        H3 h3 = H3.Second;
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(a(h3));
        if (thM3354exceptionOrNullimpl != null) {
            return Result.m3351constructorimpl(p002kotlin.dern.attabal(thM3354exceptionOrNullimpl));
        }
        return Result.m3351constructorimpl((!Intrinsics.wireman(this.a, Boolean.TRUE) || (num = this.b) == null) ? null : new Rc(h3.a(num), null, 2, null));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    @Override // com.ironsource.InterfaceC3634m7
    public Object c() {
        C3535gf c3535gf;
        Integer num;
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(a(this.c));
        if (thM3354exceptionOrNullimpl != null) {
            return Result.m3351constructorimpl(p002kotlin.dern.attabal(thM3354exceptionOrNullimpl));
        }
        if (!Intrinsics.wireman(this.a, Boolean.TRUE) || (num = this.b) == null) {
            c3535gf = null;
        } else {
            int iIntValue = num.intValue();
            H3 h3 = this.c;
            if (h3 != null) {
                c3535gf = new C3535gf(iIntValue, h3);
            } else {
                c3535gf = null;
            }
        }
        return Result.m3351constructorimpl(c3535gf);
    }

    public final Boolean d() {
        return this.a;
    }

    public final Integer e() {
        return this.b;
    }

    public final H3 f() {
        return this.c;
    }

    @Override // com.ironsource.InterfaceC3634m7
    public Object a() {
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(new K4(this.a).a());
        if (thM3354exceptionOrNullimpl != null) {
            return Result.m3351constructorimpl(p002kotlin.dern.attabal(thM3354exceptionOrNullimpl));
        }
        Boolean bool = this.a;
        return Result.m3351constructorimpl(bool != null ? new J4(bool.booleanValue()) : null);
    }

    public /* synthetic */ C3853z3(Boolean bool, Integer num, H3 h3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : h3);
    }
}
