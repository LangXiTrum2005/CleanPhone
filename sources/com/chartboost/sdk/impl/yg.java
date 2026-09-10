package com.chartboost.sdk.impl;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class yg implements vg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f15642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f15643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f15644c;
    public final Lazy d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lazy f15645e;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lazy f15646b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Lazy lazy) {
            super(0);
            this.f15646b = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w6 invoke() {
            ah ahVarG = ((qf) ((m1) this.f15646b.getX()).b().get()).g();
            return new w6(ahVarG.c(), ahVarG.f());
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lazy f15647b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ yg f15648c;
        public final /* synthetic */ Lazy d;

        public static final class a extends Lambda implements Function0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ yg f15649b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(yg ygVar) {
                super(0);
                this.f15649b = ygVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final w6 invoke() {
                return this.f15649b.b();
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.yg$b$b, reason: collision with other inner class name */
        public static final class C0178b extends Lambda implements Function0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Lazy f15650b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0178b(Lazy lazy) {
                super(0);
                this.f15650b = lazy;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ef invoke() {
                return ((m1) this.f15650b.getX()).u();
            }
        }

        public static final class c extends Lambda implements Function0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Lazy f15651b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Lazy lazy) {
                super(0);
                this.f15651b = lazy;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ah invoke() {
                return ((qf) ((m1) this.f15651b.getX()).b().get()).g();
            }
        }

        public static final class d extends Lambda implements Function0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ yg f15652b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(yg ygVar) {
                super(0);
                this.f15652b = ygVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ih invoke() {
                return this.f15652b.e();
            }
        }

        public static final class e extends Lambda implements Function0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ yg f15653b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(yg ygVar) {
                super(0);
                this.f15653b = ygVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final eh invoke() {
                return this.f15653b.d();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Lazy lazy, yg ygVar, Lazy lazy2) {
            super(0);
            this.f15647b = lazy;
            this.f15648c = ygVar;
            this.d = lazy2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a7 invoke() {
            Lazy lazyB = LazyKt.b(new a(this.f15648c));
            Lazy lazyB2 = LazyKt.b(new C0178b(this.d));
            return new a7(LazyKt.b(new c(this.d)), lazyB, lazyB2, this.f15647b, LazyKt.b(new d(this.f15648c)), LazyKt.b(new e(this.f15648c)));
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f15654b = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final zg invoke() {
            return new zg(null, 1, null);
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lazy f15655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ yg f15656c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Lazy lazy, yg ygVar) {
            super(0);
            this.f15655b = lazy;
            this.f15656c = ygVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final eh invoke() {
            return new eh(((i1) this.f15655b.getX()).h(), this.f15656c.c(), null, 4, null);
        }
    }

    public static final class e extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lazy f15657b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ yg f15658c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Lazy lazy, yg ygVar) {
            super(0);
            this.f15657b = lazy;
            this.f15658c = ygVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ih invoke() {
            return new ih(((m1) this.f15657b.getX()).g(), this.f15658c.d(), null, this.f15658c.a(), ((m1) this.f15657b.getX()).k().d(), 4, null);
        }
    }

    public yg(Lazy androidComponent, Lazy applicationComponent, Lazy privacyApi) {
        Intrinsics.f(androidComponent, "androidComponent");
        Intrinsics.f(applicationComponent, "applicationComponent");
        Intrinsics.f(privacyApi, "privacyApi");
        this.f15642a = LazyKt.b(new b(privacyApi, this, applicationComponent));
        this.f15643b = LazyKt.b(new a(applicationComponent));
        this.f15644c = LazyKt.b(new d(androidComponent, this));
        this.d = LazyKt.b(c.f15654b);
        this.f15645e = LazyKt.b(new e(applicationComponent, this));
    }

    @Override // com.chartboost.sdk.impl.vg
    public z6 a() {
        return (z6) this.f15642a.getX();
    }

    public w6 b() {
        return (w6) this.f15643b.getX();
    }

    public zg c() {
        return (zg) this.d.getX();
    }

    public eh d() {
        return (eh) this.f15644c.getX();
    }

    public ih e() {
        return (ih) this.f15645e.getX();
    }
}
