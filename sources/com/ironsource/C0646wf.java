package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.wf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0646wf implements InterfaceC0531q7, InterfaceC0531q7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0510p4 f30968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Q8 f30969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, C0592tf> f30970c;

    /* JADX INFO: renamed from: com.ironsource.wf$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f30971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f30972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f30973c;

        public a(int i10, long j10, Long l) {
            this.f30971a = i10;
            this.f30972b = j10;
            this.f30973c = l;
        }

        public final int a() {
            return this.f30971a;
        }

        public final long b() {
            return this.f30972b;
        }

        public final Long c() {
            return this.f30973c;
        }

        public final int d() {
            return this.f30971a;
        }

        public final long e() {
            return this.f30972b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f30971a == aVar.f30971a && this.f30972b == aVar.f30972b && kotlin.jvm.internal.n.a(this.f30973c, aVar.f30973c);
        }

        public final Long f() {
            return this.f30973c;
        }

        public int hashCode() {
            int iJ = com.applovin.impl.ca.j(this.f30972b, Integer.hashCode(this.f30971a) * 31, 31);
            Long l = this.f30973c;
            return iJ + (l == null ? 0 : l.hashCode());
        }

        public String toString() {
            return "ShowCountCappingInfo(currentNumberOfShows=" + this.f30971a + ", currentTime=" + this.f30972b + ", currentTimeThreshold=" + this.f30973c + ")";
        }

        public final a a(int i10, long j10, Long l) {
            return new a(i10, j10, l);
        }

        public static /* synthetic */ a a(a aVar, int i10, long j10, Long l, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = aVar.f30971a;
            }
            if ((i11 & 2) != 0) {
                j10 = aVar.f30972b;
            }
            if ((i11 & 4) != 0) {
                l = aVar.f30973c;
            }
            return aVar.a(i10, j10, l);
        }

        public final void a(int i10) {
            this.f30971a = i10;
        }

        public final void a(long j10) {
            this.f30972b = j10;
        }

        public final void a(Long l) {
            this.f30973c = l;
        }
    }

    public C0646wf(InterfaceC0510p4 currentTimeProvider, Q8 serviceDataRepository) {
        kotlin.jvm.internal.n.f(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.n.f(serviceDataRepository, "serviceDataRepository");
        this.f30968a = currentTimeProvider;
        this.f30969b = serviceDataRepository;
        this.f30970c = new LinkedHashMap();
    }

    private final a c(String str) {
        return new a(this.f30969b.a(str), this.f30968a.a(), this.f30969b.b(str));
    }

    public final Map<String, C0592tf> a() {
        return this.f30970c;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    @Override // com.ironsource.InterfaceC0531q7.a
    public void b(String identifier) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        C0592tf c0592tf = this.f30970c.get(identifier);
        if (c0592tf == null) {
            return;
        }
        a aVarC = c(identifier);
        if (aVarC.d() != 0) {
            long jE = aVarC.e();
            Long lF = aVarC.f();
            if (jE >= (lF != null ? lF.longValue() : 0L)) {
                this.f30969b.a(H3.a(c0592tf.b(), null, 1, null) + aVarC.e(), identifier);
                aVarC.a(0);
            }
        } else {
            this.f30969b.a(H3.a(c0592tf.b(), null, 1, null) + aVarC.e(), identifier);
            aVarC.a(0);
        }
        aVarC.a(aVarC.d() + 1);
        this.f30969b.a(aVarC.d(), identifier);
    }

    @Override // com.ironsource.InterfaceC0531q7
    public G3 a(String identifier) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        C0592tf c0592tf = this.f30970c.get(identifier);
        if (c0592tf == null) {
            return new G3(false, null, 2, null);
        }
        return a(c0592tf, identifier) ? new G3(true, I3.ShowCount) : new G3(false, null, 2, null);
    }

    private final boolean a(C0592tf c0592tf, String str) {
        a aVarC = c(str);
        Long lF = aVarC.f();
        if (lF != null) {
            long jLongValue = lF.longValue();
            if (aVarC.d() >= c0592tf.a() && this.f30968a.a() < jLongValue) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC0531q7.a
    public Object a(String identifier, I3 cappingType, InterfaceC0495o7 cappingConfig) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        kotlin.jvm.internal.n.f(cappingType, "cappingType");
        kotlin.jvm.internal.n.f(cappingConfig, "cappingConfig");
        Object objC = cappingConfig.c();
        boolean z10 = objC instanceof wj.g;
        wj.r rVar = wj.r.f53297a;
        if (z10) {
            Throwable thA = wj.h.a(objC);
            if (thA != null) {
                return t9.e.c(thA);
            }
        } else {
            C0592tf c0592tf = (C0592tf) objC;
            if (c0592tf != null) {
                this.f30970c.put(identifier, c0592tf);
                return rVar;
            }
        }
        return rVar;
    }
}
