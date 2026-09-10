package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.concurrent.atomic.AtomicBoolean;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ec, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3496ec {
    public static final a e = new a(null);
    private static volatile C3496ec f;
    private C3846yd a;
    private final AtomicBoolean b;
    private String c;
    private N3 d;

    /* JADX INFO: renamed from: com.ironsource.ec$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3496ec a() {
            C3496ec c3496ec;
            C3496ec c3496ec2 = C3496ec.f;
            if (c3496ec2 != null) {
                return c3496ec2;
            }
            synchronized (this) {
                c3496ec = C3496ec.f;
                if (c3496ec == null) {
                    c3496ec = new C3496ec(null);
                    C3496ec.f = c3496ec;
                }
            }
            return c3496ec;
        }

        private a() {
        }

        public final InterfaceC3521g1 a(IronSource.a adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            C3496ec c3496ec = C3496ec.f;
            N3 n3B = c3496ec != null ? c3496ec.b() : null;
            C3496ec c3496ec2 = C3496ec.f;
            C3846yd c3846ydE = c3496ec2 != null ? c3496ec2.e() : null;
            if (n3B != null && c3846ydE != null) {
                return new C3594k3(n3B, c3846ydE, adFormat);
            }
            return new C3543h5();
        }
    }

    public /* synthetic */ C3496ec(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final C3496ec d() {
        return e.a();
    }

    public final N3 b() {
        return this.d;
    }

    public final AtomicBoolean c() {
        return this.b;
    }

    public final C3846yd e() {
        return this.a;
    }

    public final String f() {
        return this.c;
    }

    public final void g() {
        this.b.set(true);
    }

    private C3496ec() {
        this.b = new AtomicBoolean(false);
        this.c = "";
    }

    public final void a(C3846yd c3846yd) {
        this.a = c3846yd;
    }

    public final void a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.c = str;
    }

    public final void a(N3 n3) {
        this.d = n3;
    }
}
