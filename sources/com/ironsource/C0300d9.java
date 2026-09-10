package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.d9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0300d9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0510p4 f28454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Mb.a f28455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Long f28456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f28457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Mb f28458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C0282c9 f28459f;

    public C0300d9() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final C0282c9 a() {
        return this.f28459f;
    }

    public final C0282c9 b() {
        Long l = this.f28457d;
        if (l != null) {
            long jLongValue = l.longValue();
            Long l10 = this.f28456c;
            if (l10 != null) {
                long jLongValue2 = l10.longValue();
                Mb mb2 = this.f28458e;
                if (mb2 == null) {
                    return null;
                }
                long jA = this.f28454a.a();
                Mb mb3 = this.f28455b.get();
                C0282c9 c0282c9 = new C0282c9(jA - jLongValue, new C0282c9.a(Math.max(0L, mb3.d() - mb2.d()), Math.max(0L, mb3.e() - mb2.e()), Math.max(0L, mb3.f() - mb2.f())), jLongValue2 / ((long) 1024));
                this.f28459f = c0282c9;
                return c0282c9;
            }
        }
        return null;
    }

    public C0300d9(InterfaceC0510p4 currentTimeProvider, Mb.a memoryInfoProvider) {
        kotlin.jvm.internal.n.f(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.n.f(memoryInfoProvider, "memoryInfoProvider");
        this.f28454a = currentTimeProvider;
        this.f28455b = memoryInfoProvider;
    }

    public final void a(String serverResponse) {
        kotlin.jvm.internal.n.f(serverResponse, "serverResponse");
        this.f28456c = Long.valueOf(serverResponse.length());
        this.f28458e = this.f28455b.get();
        this.f28457d = Long.valueOf(this.f28454a.a());
    }

    public /* synthetic */ C0300d9(InterfaceC0510p4 interfaceC0510p4, Mb.a aVar, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? new InterfaceC0510p4.a() : interfaceC0510p4, (i10 & 2) != 0 ? new Mb.a.C0042a() : aVar);
    }
}
