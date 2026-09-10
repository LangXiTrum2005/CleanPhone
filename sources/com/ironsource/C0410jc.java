package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.ironsource.jc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0410jc {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f28993e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile C0410jc f28994f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Ld f28995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f28996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f28997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private N3 f28998d;

    /* JADX INFO: renamed from: com.ironsource.jc$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final C0410jc a() {
            C0410jc c0410jc;
            C0410jc c0410jc2 = C0410jc.f28994f;
            if (c0410jc2 != null) {
                return c0410jc2;
            }
            synchronized (this) {
                c0410jc = C0410jc.f28994f;
                if (c0410jc == null) {
                    c0410jc = new C0410jc(null);
                    C0410jc.f28994f = c0410jc;
                }
            }
            return c0410jc;
        }

        private a() {
        }

        public final InterfaceC0346g1 a(IronSource.a adFormat) {
            kotlin.jvm.internal.n.f(adFormat, "adFormat");
            C0410jc c0410jc = C0410jc.f28994f;
            N3 n3B = c0410jc != null ? c0410jc.b() : null;
            C0410jc c0410jc2 = C0410jc.f28994f;
            Ld ldE = c0410jc2 != null ? c0410jc2.e() : null;
            if (n3B != null && ldE != null) {
                return new C0419k3(n3B, ldE, adFormat);
            }
            return new C0386i5();
        }
    }

    public /* synthetic */ C0410jc(kotlin.jvm.internal.g gVar) {
        this();
    }

    public static final C0410jc d() {
        return f28993e.a();
    }

    public final N3 b() {
        return this.f28998d;
    }

    public final AtomicBoolean c() {
        return this.f28996b;
    }

    public final Ld e() {
        return this.f28995a;
    }

    public final String f() {
        return this.f28997c;
    }

    public final void g() {
        this.f28996b.set(true);
    }

    private C0410jc() {
        this.f28996b = new AtomicBoolean(false);
        this.f28997c = "";
    }

    public final void a(Ld ld2) {
        this.f28995a = ld2;
    }

    public final void a(String str) {
        kotlin.jvm.internal.n.f(str, "<set-?>");
        this.f28997c = str;
    }

    public final void a(N3 n3) {
        this.f28998d = n3;
    }
}
