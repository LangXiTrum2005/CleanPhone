package com.chartboost.sdk.impl;

import android.app.Application;
import android.content.Context;
import com.chartboost.sdk.internal.interruption.InterruptionController;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class v5 implements u5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Application f15373c;
    public final Lazy d = LazyKt.b(new a());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lazy f15374e = LazyKt.b(new b());
    public final Lazy f = LazyKt.b(new f());
    public final Lazy g = LazyKt.b(c.f15380b);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f15375h = LazyKt.b(new e());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Lazy f15376i = LazyKt.b(d.f15381b);
    public final Lazy j = LazyKt.b(new i());
    public final Lazy k = LazyKt.b(new h());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Lazy f15377l = LazyKt.b(new g());
    public final Lazy m = LazyKt.b(new j());

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j1 invoke() {
            Context applicationContext = v5.this.g().getApplicationContext();
            Intrinsics.e(applicationContext, "getApplicationContext(...)");
            return new j1(applicationContext, v5.this.g());
        }
    }

    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o1 invoke() {
            return new o1(v5.this.d(), v5.this.h(), v5.this.l(), null, v5.this.b(), 8, null);
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f15380b = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e7 invoke() {
            return new e7();
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f15381b = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m9 invoke() {
            return new m9();
        }
    }

    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final jd invoke() {
            return new jd(v5.this.d(), v5.this.a());
        }
    }

    public static final class f extends Lambda implements Function0 {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ee invoke() {
            return new ee(v5.this.d(), v5.this.b());
        }
    }

    public static final class g extends Lambda implements Function0 {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final se invoke() {
            return new se(v5.this.d(), v5.this.b());
        }
    }

    public static final class h extends Lambda implements Function0 {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final tf invoke() {
            return new tf(v5.this.d(), v5.this.h(), v5.this.a(), v5.this.k(), v5.this.b());
        }
    }

    public static final class i extends Lambda implements Function0 {

        public static final class a extends Lambda implements Function0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v5 f15387b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(v5 v5Var) {
                super(0);
                this.f15387b = v5Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final i1 invoke() {
                return this.f15387b.d();
            }
        }

        public static final class b extends Lambda implements Function0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v5 f15388b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(v5 v5Var) {
                super(0);
                this.f15388b = v5Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final m1 invoke() {
                return this.f15388b.a();
            }
        }

        public static final class c extends Lambda implements Function0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v5 f15389b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(v5 v5Var) {
                super(0);
                this.f15389b = v5Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final be invoke() {
                return this.f15389b.l().a();
            }
        }

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final yg invoke() {
            return new yg(LazyKt.b(new a(v5.this)), LazyKt.b(new b(v5.this)), LazyKt.b(new c(v5.this)));
        }
    }

    public static final class j extends Lambda implements Function0 {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final lj invoke() {
            return new lj(v5.this.d());
        }
    }

    @Override // com.chartboost.sdk.impl.u5
    public vg b() {
        return (vg) this.j.getX();
    }

    @Override // com.chartboost.sdk.impl.u5
    public jj c() {
        return (jj) this.m.getX();
    }

    @Override // com.chartboost.sdk.impl.u5
    public i1 d() {
        return (i1) this.d.getX();
    }

    public String e() {
        String str = this.f15371a;
        return str == null ? "" : str;
    }

    public String f() {
        String str = this.f15372b;
        return str == null ? "" : str;
    }

    public final Application g() {
        Application application = this.f15373c;
        if (application != null) {
            return application;
        }
        za.b("Missing application. Cannot start Chartboost SDK.", (Throwable) null, 2, (Object) null);
        throw new x3();
    }

    public d7 h() {
        return (d7) this.g.getX();
    }

    public l9 i() {
        return (l9) this.f15376i.getX();
    }

    public boolean j() {
        return this.f15373c != null;
    }

    public fd k() {
        return (fd) this.f15375h.getX();
    }

    public de l() {
        return (de) this.f.getX();
    }

    public qe m() {
        return (qe) this.f15377l.getX();
    }

    public pf n() {
        return (pf) this.k.getX();
    }

    public boolean o() {
        String str;
        String str2 = this.f15371a;
        return (str2 == null || str2.length() == 0 || (str = this.f15372b) == null || str.length() == 0) ? false : true;
    }

    @Override // com.chartboost.sdk.impl.u5
    public m1 a() {
        return (m1) this.f15374e.getX();
    }

    public void a(Context context) {
        Intrinsics.f(context, "context");
        Context applicationContext = context.getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application == null) {
            za.b("Failed to initialize Chartboost SDK. Application is null.", (Throwable) null, 2, (Object) null);
            return;
        }
        this.f15373c = application;
        try {
            InterruptionController.a(InterruptionController.f15836a, g(), null, 2, null);
            za.c("InterruptionController initialized.", null, 2, null);
        } catch (Exception e2) {
            za.b("Error initializing InterruptionController.", e2);
        }
    }

    public void a(String appId, String appSignature) {
        Intrinsics.f(appId, "appId");
        Intrinsics.f(appSignature, "appSignature");
        this.f15371a = appId;
        this.f15372b = appSignature;
    }
}
