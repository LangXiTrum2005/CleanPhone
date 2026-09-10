package com.chartboost.sdk.impl;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class lj implements jj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f14429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f14430b;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i1 f14431b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i1 i1Var) {
            super(0);
            this.f14431b = i1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final tb invoke() {
            return new tb(this.f14431b.getContext(), this.f14431b.d(), this.f14431b.k());
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f14432b = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final wb invoke() {
            return new wb();
        }
    }

    public lj(i1 androidComponent) {
        Intrinsics.f(androidComponent, "androidComponent");
        this.f14429a = LazyKt.b(new a(androidComponent));
        this.f14430b = LazyKt.b(b.f14432b);
    }

    @Override // com.chartboost.sdk.impl.jj
    public pj a() {
        return (pj) this.f14430b.getX();
    }

    @Override // com.chartboost.sdk.impl.jj
    public kj b() {
        return (kj) this.f14429a.getX();
    }
}
