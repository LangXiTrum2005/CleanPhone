package com.chartboost.sdk.impl;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1 f13844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f13845b;

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e invoke() {
            return new e(f.this.f13844a.c());
        }
    }

    public f(i1 androidComponent) {
        Intrinsics.f(androidComponent, "androidComponent");
        this.f13844a = androidComponent;
        this.f13845b = LazyKt.b(new a());
    }

    public e a() {
        return (e) this.f13845b.getX();
    }
}
