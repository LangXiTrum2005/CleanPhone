package com.chartboost.sdk.impl;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class j1 implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Application f14207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f14208c;
    public final Lazy d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lazy f14209e;
    public final Lazy f;
    public final Lazy g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f14210h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Lazy f14211i;
    public final Lazy j;
    public final Lazy k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Lazy f14212l;
    public final Lazy m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Lazy f14213n;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f14214b = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h1 invoke() {
            return h1.b();
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f14215b = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b2 invoke() {
            return new b2();
        }
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ContentResolver invoke() {
            return j1.this.getContext().getContentResolver();
        }
    }

    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z5 invoke() {
            return new z5(j1.this.getContext(), j1.this.j());
        }
    }

    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f6 invoke() {
            return new f6(j1.this.m(), j1.this.l(), null, null, 12, null);
        }
    }

    public static final class f extends Lambda implements Function0 {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DisplayMetrics invoke() {
            return j1.this.getContext().getResources().getDisplayMetrics();
        }
    }

    public static final class g extends Lambda implements Function0 {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final hf invoke() {
            Resources resources = j1.this.getContext().getResources();
            Intrinsics.e(resources, "getResources(...)");
            return new hf(resources);
        }
    }

    public static final class h extends Lambda implements Function0 {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            return j1.this.getContext().getSharedPreferences("cbPrefs", 0);
        }
    }

    public static final class i extends Lambda implements Function0 {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final wf invoke() {
            return new wf(j1.this.i());
        }
    }

    public static final class j extends Lambda implements Function0 {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            return j1.this.getContext().getSharedPreferences("cbPrefsTracking", 0);
        }
    }

    public static final class k extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final k f14224b = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final mh invoke() {
            return new mh();
        }
    }

    public static final class l extends Lambda implements Function0 {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WindowManager invoke() {
            Object systemService = j1.this.getContext().getSystemService("window");
            Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            return (WindowManager) systemService;
        }
    }

    public j1(Context context, Application app) {
        Intrinsics.f(context, "context");
        Intrinsics.f(app, "app");
        this.f14206a = context;
        this.f14207b = app;
        this.f14208c = LazyKt.b(new h());
        this.d = LazyKt.b(new j());
        this.f14209e = LazyKt.b(a.f14214b);
        this.f = LazyKt.b(k.f14224b);
        this.g = LazyKt.b(b.f14215b);
        this.f14210h = LazyKt.b(new g());
        this.f14211i = LazyKt.b(new i());
        this.j = LazyKt.b(new l());
        this.k = LazyKt.b(new f());
        this.f14212l = LazyKt.b(new e());
        this.m = LazyKt.b(new d());
        this.f14213n = LazyKt.b(new c());
    }

    @Override // com.chartboost.sdk.impl.i1
    public b2 a() {
        return (b2) this.g.getX();
    }

    @Override // com.chartboost.sdk.impl.i1
    public ContentResolver b() {
        Object x = this.f14213n.getX();
        Intrinsics.e(x, "getValue(...)");
        return (ContentResolver) x;
    }

    @Override // com.chartboost.sdk.impl.i1
    public lh c() {
        return (lh) this.f.getX();
    }

    @Override // com.chartboost.sdk.impl.i1
    public wf d() {
        return (wf) this.f14211i.getX();
    }

    @Override // com.chartboost.sdk.impl.i1
    public h1 e() {
        Object x = this.f14209e.getX();
        Intrinsics.e(x, "getValue(...)");
        return (h1) x;
    }

    @Override // com.chartboost.sdk.impl.i1
    public z5 f() {
        return (z5) this.m.getX();
    }

    @Override // com.chartboost.sdk.impl.i1
    public Application g() {
        return this.f14207b;
    }

    @Override // com.chartboost.sdk.impl.i1
    public Context getContext() {
        return this.f14206a;
    }

    @Override // com.chartboost.sdk.impl.i1
    public SharedPreferences h() {
        Object x = this.d.getX();
        Intrinsics.e(x, "getValue(...)");
        return (SharedPreferences) x;
    }

    @Override // com.chartboost.sdk.impl.i1
    public SharedPreferences i() {
        Object x = this.f14208c.getX();
        Intrinsics.e(x, "getValue(...)");
        return (SharedPreferences) x;
    }

    @Override // com.chartboost.sdk.impl.i1
    public f6 j() {
        return (f6) this.f14212l.getX();
    }

    @Override // com.chartboost.sdk.impl.i1
    public hf k() {
        return (hf) this.f14210h.getX();
    }

    public DisplayMetrics l() {
        Object x = this.k.getX();
        Intrinsics.e(x, "getValue(...)");
        return (DisplayMetrics) x;
    }

    public WindowManager m() {
        return (WindowManager) this.j.getX();
    }
}
