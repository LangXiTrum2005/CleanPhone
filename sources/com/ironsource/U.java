package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class U implements InterfaceC0701zg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0461m9 f27256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f27257c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a extends kotlin.jvm.internal.o implements jk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27258a = new a();

        public a() {
            super(0);
        }

        @Override // jk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C0600u5.f30795a.r();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b extends kotlin.jvm.internal.o implements jk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27259a = new b();

        public b() {
            super(0);
        }

        @Override // jk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C0600u5.f30795a.o();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class c extends kotlin.jvm.internal.o implements jk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f27260a = new c();

        public c() {
            super(0);
        }

        @Override // jk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C0600u5.f30795a.n();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class d extends kotlin.jvm.internal.o implements jk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f27261a = new d();

        public d() {
            super(0);
        }

        @Override // jk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C0600u5.f30795a.q();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class e extends kotlin.jvm.internal.o implements jk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f27262a = new e();

        public e() {
            super(0);
        }

        @Override // jk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C0600u5.f30795a.o();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class f extends kotlin.jvm.internal.o implements jk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f27263a = new f();

        public f() {
            super(0);
        }

        @Override // jk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C0600u5.f30795a.g();
        }
    }

    public U(String adm, InterfaceC0461m9 interfaceC0461m9, boolean z10) {
        kotlin.jvm.internal.n.f(adm, "adm");
        this.f27255a = adm;
        this.f27256b = interfaceC0461m9;
        this.f27257c = z10;
    }

    @Override // com.ironsource.InterfaceC0701zg
    public void a() throws C0555re {
        a(this.f27257c, a.f27258a);
        a(this.f27256b != null, b.f27259a);
        InterfaceC0461m9 interfaceC0461m9 = this.f27256b;
        if (interfaceC0461m9 != null) {
            if (interfaceC0461m9.f() == EnumC0515p9.NonBidder) {
                a(this.f27255a.length() == 0, c.f27260a);
            }
            if (interfaceC0461m9.f() == EnumC0515p9.Bidder) {
                a(this.f27255a.length() > 0, d.f27261a);
            }
            a(interfaceC0461m9.f() != EnumC0515p9.NotSupported, e.f27262a);
            a(interfaceC0461m9.e().length() > 0, f.f27263a);
        }
    }
}
