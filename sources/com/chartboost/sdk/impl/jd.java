package com.chartboost.sdk.impl;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class jd implements fd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f14252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f14253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f14254c;

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gd invoke() {
            return new gd(jd.this.a(), jd.this.c());
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i1 f14256b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m1 f14257c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i1 i1Var, m1 m1Var) {
            super(0);
            this.f14256b = i1Var;
            this.f14257c = m1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final id invoke() {
            return new id(this.f14256b.getContext(), this.f14256b.d(), this.f14256b.k(), this.f14257c.b(), null, 16, null);
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f14258b = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kd invoke() {
            return new kd();
        }
    }

    public jd(i1 androidComponent, m1 applicationComponent) {
        Intrinsics.f(androidComponent, "androidComponent");
        Intrinsics.f(applicationComponent, "applicationComponent");
        this.f14252a = LazyKt.b(new b(androidComponent, applicationComponent));
        this.f14253b = LazyKt.b(c.f14258b);
        this.f14254c = LazyKt.b(new a());
    }

    @Override // com.chartboost.sdk.impl.fd
    public id a() {
        return (id) this.f14252a.getX();
    }

    @Override // com.chartboost.sdk.impl.fd
    public gd b() {
        return (gd) this.f14254c.getX();
    }

    public kd c() {
        return (kd) this.f14253b.getX();
    }
}
