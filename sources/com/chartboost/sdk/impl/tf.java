package com.chartboost.sdk.impl;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class tf implements pf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f15206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f15207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f15208c;
    public final Lazy d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lazy f15209e;
    public final Lazy f;
    public final Lazy g;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m1 f15211c;
        public final /* synthetic */ vg d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m1 m1Var, vg vgVar) {
            super(0);
            this.f15211c = m1Var;
            this.d = vgVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g1 invoke() {
            return new g1(tf.this.b(), this.f15211c.g(), this.f15211c.u(), this.d.a(), this.f15211c.k());
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i1 f15212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d7 f15213c;
        public final /* synthetic */ tf d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ m1 f15214e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i1 i1Var, d7 d7Var, tf tfVar, m1 m1Var) {
            super(0);
            this.f15212b = i1Var;
            this.f15213c = d7Var;
            this.d = tfVar;
            this.f15214e = m1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s3 invoke() {
            return new s3(this.f15212b.getContext(), this.f15213c.b(), this.d.b(), this.d.g(), this.f15214e.p());
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m1 f15215b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ vg f15216c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(m1 m1Var, vg vgVar) {
            super(0);
            this.f15215b = m1Var;
            this.f15216c = vgVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ha invoke() {
            return new ha(this.f15215b.g(), this.f15215b.u(), this.f15216c.a(), this.f15215b.m());
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m1 f15217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ vg f15218c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(m1 m1Var, vg vgVar) {
            super(0);
            this.f15217b = m1Var;
            this.f15218c = vgVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ia invoke() {
            return new ia(this.f15217b.g(), this.f15217b.u(), this.f15218c.a(), this.f15217b.m());
        }
    }

    public static final class e extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i1 f15219b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(i1 i1Var) {
            super(0);
            this.f15219b = i1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final je invoke() {
            return new je(this.f15219b.getContext(), this.f15219b.c());
        }
    }

    public static final class f extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i1 f15220b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m1 f15221c;
        public final /* synthetic */ tf d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ fd f15222e;

        public static final class a extends Lambda implements Function0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m1 f15223b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m1 m1Var) {
                super(0);
                this.f15223b = m1Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final dj invoke() {
                return this.f15223b.w();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(i1 i1Var, m1 m1Var, tf tfVar, fd fdVar) {
            super(0);
            this.f15220b = i1Var;
            this.f15221c = m1Var;
            this.d = tfVar;
            this.f15222e = fdVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final rf invoke() {
            return new rf(this.f15220b.getContext(), this.f15220b.i(), this.f15220b.c(), this.f15221c.a(), this.f15221c.b(), this.f15221c.o(), this.f15221c.e(), this.f15221c.k(), this.f15221c.r(), LazyKt.b(new a(this.f15221c)), this.d.e(), this.d.d(), this.f15221c.j(), this.d.f(), this.f15221c.p(), this.f15222e.a(), this.f15221c.q());
        }
    }

    public static final class g extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i1 f15224b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m1 f15225c;
        public final /* synthetic */ fd d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(i1 i1Var, m1 m1Var, fd fdVar) {
            super(0);
            this.f15224b = i1Var;
            this.f15225c = m1Var;
            this.d = fdVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g2 invoke() {
            return new g2(this.f15224b.getContext(), this.f15224b.a(), this.f15225c.p(), this.f15225c.b(), this.d.a());
        }
    }

    public tf(i1 androidComponent, d7 executorComponent, m1 applicationComponent, fd openMeasurementComponent, vg trackerComponent) {
        Intrinsics.f(androidComponent, "androidComponent");
        Intrinsics.f(executorComponent, "executorComponent");
        Intrinsics.f(applicationComponent, "applicationComponent");
        Intrinsics.f(openMeasurementComponent, "openMeasurementComponent");
        Intrinsics.f(trackerComponent, "trackerComponent");
        this.f15206a = LazyKt.b(new b(androidComponent, executorComponent, this, applicationComponent));
        this.f15207b = LazyKt.b(new a(applicationComponent, trackerComponent));
        this.f15208c = LazyKt.b(new f(androidComponent, applicationComponent, this, openMeasurementComponent));
        this.d = LazyKt.b(new d(applicationComponent, trackerComponent));
        this.f15209e = LazyKt.b(new c(applicationComponent, trackerComponent));
        this.f = LazyKt.b(new e(androidComponent));
        this.g = LazyKt.b(new g(androidComponent, applicationComponent, openMeasurementComponent));
    }

    public final ha d() {
        return (ha) this.f15209e.getX();
    }

    public final ia e() {
        return (ia) this.d.getX();
    }

    public final je f() {
        return (je) this.f.getX();
    }

    public g2 g() {
        return (g2) this.g.getX();
    }

    @Override // com.chartboost.sdk.impl.pf
    public g1 a() {
        return (g1) this.f15207b.getX();
    }

    @Override // com.chartboost.sdk.impl.pf
    public rf b() {
        return (rf) this.f15208c.getX();
    }

    @Override // com.chartboost.sdk.impl.pf
    public s3 c() {
        return (s3) this.f15206a.getX();
    }
}
