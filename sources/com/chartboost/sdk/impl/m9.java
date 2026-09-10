package com.chartboost.sdk.impl;

import android.view.ViewGroup;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class m9 implements l9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function2 f14463a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f14464b = a.f14467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f14465c = c.f14469b;
    public final Function1 d = b.f14468b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function2 f14466e = e.f14471b;

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f14467b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g9 invoke(o9 impressionDependency) {
            Intrinsics.f(impressionDependency, "impressionDependency");
            return new g9(impressionDependency.b(), impressionDependency.q(), impressionDependency.m(), impressionDependency.e(), impressionDependency.f(), impressionDependency.o(), impressionDependency.k(), impressionDependency.p(), impressionDependency.c(), null, 512, null);
        }
    }

    public static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f14468b = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k9 invoke(o9 impressionDependency) {
            Intrinsics.f(impressionDependency, "impressionDependency");
            return new k9(impressionDependency.b(), impressionDependency.a(), impressionDependency.g(), impressionDependency.c());
        }
    }

    public static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f14469b = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p9 invoke(o9 impressionDependency) {
            Intrinsics.f(impressionDependency, "impressionDependency");
            return new p9(impressionDependency.b(), impressionDependency.n(), impressionDependency.a(), impressionDependency.c(), impressionDependency.j(), impressionDependency.d(), impressionDependency.h(), impressionDependency.p(), impressionDependency.i());
        }
    }

    public static final class d extends Lambda implements Function2 {
        public d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r2 invoke(o9 impressionDependency, ViewGroup viewGroup) {
            Intrinsics.f(impressionDependency, "impressionDependency");
            return new r2(impressionDependency, (i9) m9.this.f14464b.invoke(impressionDependency), (q9) m9.this.f14465c.invoke(impressionDependency), (j9) m9.this.d.invoke(impressionDependency), (aa) m9.this.f14466e.invoke(impressionDependency, viewGroup));
        }
    }

    public static final class e extends Lambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f14471b = new e();

        public e() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y9 invoke(o9 impressionDependency, ViewGroup viewGroup) {
            Intrinsics.f(impressionDependency, "impressionDependency");
            return new y9(impressionDependency.d(), impressionDependency.r(), impressionDependency.h(), viewGroup, impressionDependency.c(), impressionDependency.j(), impressionDependency.k());
        }
    }

    @Override // com.chartboost.sdk.impl.l9
    public Function2 a() {
        return this.f14463a;
    }
}
