package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.jf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3588jf implements InterfaceC3670o7, InterfaceC3670o7.a {
    private final InterfaceC3667o4 a;
    private final O8 b;
    private final Map<String, C3535gf> c;

    /* JADX INFO: renamed from: com.ironsource.jf$a */
    public static final class a {
        private int a;
        private long b;
        private Long c;

        public a(int i, long j, Long l) {
            this.a = i;
            this.b = j;
            this.c = l;
        }

        public final int a() {
            return this.a;
        }

        public final long b() {
            return this.b;
        }

        public final Long c() {
            return this.c;
        }

        public final int d() {
            return this.a;
        }

        public final long e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && Intrinsics.wireman(this.c, aVar.c);
        }

        public final Long f() {
            return this.c;
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.a) * 31) + Long.hashCode(this.b)) * 31;
            Long l = this.c;
            return iHashCode + (l == null ? 0 : l.hashCode());
        }

        public String toString() {
            return "ShowCountCappingInfo(currentNumberOfShows=" + this.a + ", currentTime=" + this.b + ", currentTimeThreshold=" + this.c + ")";
        }

        public final a a(int i, long j, Long l) {
            return new a(i, j, l);
        }

        public static /* synthetic */ a a(a aVar, int i, long j, Long l, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = aVar.a;
            }
            if ((i2 & 2) != 0) {
                j = aVar.b;
            }
            if ((i2 & 4) != 0) {
                l = aVar.c;
            }
            return aVar.a(i, j, l);
        }

        public final void a(int i) {
            this.a = i;
        }

        public final void a(long j) {
            this.b = j;
        }

        public final void a(Long l) {
            this.c = l;
        }
    }

    public C3588jf(InterfaceC3667o4 currentTimeProvider, O8 serviceDataRepository) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(serviceDataRepository, "serviceDataRepository");
        this.a = currentTimeProvider;
        this.b = serviceDataRepository;
        this.c = new LinkedHashMap();
    }

    private final a c(String str) {
        return new a(this.b.a(str), this.a.a(), this.b.b(str));
    }

    public final Map<String, C3535gf> a() {
        return this.c;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    @Override // com.ironsource.InterfaceC3670o7.a
    public void b(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        C3535gf c3535gf = this.c.get(identifier);
        if (c3535gf == null) {
            return;
        }
        a aVarC = c(identifier);
        if (aVarC.d() != 0) {
            long jE = aVarC.e();
            Long lF = aVarC.f();
            if (jE >= (lF != null ? lF.longValue() : 0L)) {
                this.b.a(aVarC.e() + H3.a(c3535gf.b(), null, 1, null), identifier);
                aVarC.a(0);
            }
        } else {
            this.b.a(aVarC.e() + H3.a(c3535gf.b(), null, 1, null), identifier);
            aVarC.a(0);
        }
        aVarC.a(aVarC.d() + 1);
        this.b.a(aVarC.d(), identifier);
    }

    @Override // com.ironsource.InterfaceC3670o7
    public G3 a(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        C3535gf c3535gf = this.c.get(identifier);
        if (c3535gf == null) {
            return new G3(false, null, 2, null);
        }
        return a(c3535gf, identifier) ? new G3(true, I3.ShowCount) : new G3(false, null, 2, null);
    }

    private final boolean a(C3535gf c3535gf, String str) {
        a aVarC = c(str);
        Long lF = aVarC.f();
        if (lF != null) {
            long jLongValue = lF.longValue();
            if (aVarC.d() >= c3535gf.a() && this.a.a() < jLongValue) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC3670o7.a
    public Object a(String identifier, I3 cappingType, InterfaceC3634m7 cappingConfig) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        Object objC = cappingConfig.c();
        if (Result.m3357isSuccessimpl(objC)) {
            C3535gf c3535gf = (C3535gf) objC;
            if (c3535gf != null) {
                this.c.put(identifier, c3535gf);
            }
            return Result.m3351constructorimpl(Unit.f29295attabal);
        }
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objC);
        if (thM3354exceptionOrNullimpl != null) {
            return Result.m3351constructorimpl(p002kotlin.dern.attabal(thM3354exceptionOrNullimpl));
        }
        return Result.m3351constructorimpl(Unit.f29295attabal);
    }
}
