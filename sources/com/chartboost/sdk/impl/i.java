package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f14128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Mediation f14129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w3 f14130c;
    public final Lazy d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c0 f14131e;
    public final k0 f;
    public final lh g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f14132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ScheduledExecutorService f14133i;
    public final uf j;
    public final b2 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f14134l;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y f14136c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y yVar) {
            super(0);
            this.f14136c = yVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 invoke() {
            return new h0(i.this.f14130c.d(), i.this.f14130c.a(), this.f14136c, i.this.f14130c.l(), i.this.f14130c.j(), i.this.f14129b, i.this.f14130c.h(), i.this.f14130c.b());
        }
    }

    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AtomicReference invoke() {
            return i.this.f14130c.a().b();
        }
    }

    public i(y adType, Function0 get, Mediation mediation, w3 dependencyContainer) {
        Intrinsics.f(adType, "adType");
        Intrinsics.f(get, "get");
        Intrinsics.f(dependencyContainer, "dependencyContainer");
        this.f14128a = get;
        this.f14129b = mediation;
        this.f14130c = dependencyContainer;
        this.d = LazyKt.b(new a(adType));
        this.f14131e = b().b();
        this.f = b().c();
        this.g = dependencyContainer.d().c();
        this.f14132h = LazyKt.b(new b());
        this.f14133i = dependencyContainer.g().b();
        this.j = dependencyContainer.a().k();
        this.k = dependencyContainer.d().a();
        this.f14134l = new f(dependencyContainer.d()).a();
    }

    public final AtomicReference c() {
        return (AtomicReference) this.f14132h.getX();
    }

    public final Object a() {
        return ((Function9) this.f14128a.invoke()).invoke(this.f14131e, this.f, this.g, c(), this.f14133i, this.f14134l, this.j, this.k, this.f14130c.b().a());
    }

    public final h0 b() {
        return (h0) this.d.getX();
    }

    public /* synthetic */ i(y yVar, Function0 function0, Mediation mediation, w3 w3Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(yVar, function0, mediation, (i2 & 8) != 0 ? w3.f15454b : w3Var);
    }
}
