package com.chartboost.sdk.impl;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class se implements qe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f15135a;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i1 f15136b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ vg f15137c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i1 i1Var, vg vgVar) {
            super(0);
            this.f15136b = i1Var;
            this.f15137c = vgVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ze invoke() {
            return new ze(new d9(this.f15136b.getContext()), this.f15137c.a());
        }
    }

    public se(i1 androidComponent, vg trackerComponent) {
        Intrinsics.f(androidComponent, "androidComponent");
        Intrinsics.f(trackerComponent, "trackerComponent");
        this.f15135a = LazyKt.b(new a(androidComponent, trackerComponent));
    }

    @Override // com.chartboost.sdk.impl.qe
    public ye a() {
        return (ye) this.f15135a.getX();
    }
}
