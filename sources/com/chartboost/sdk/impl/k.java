package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k {

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f14295b = new a();

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.k$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0167a extends AdaptedFunctionReference implements Function9 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0167a f14296b = new C0167a();

            public C0167a() {
                super(z1.class);
            }

            @Override // kotlin.jvm.functions.Function9
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final z1 invoke(c0 p0, k0 p1, lh p2, AtomicReference p3, ScheduledExecutorService p4, e p5, uf p6, b2 p7, z6 p8) {
                Intrinsics.f(p0, "p0");
                Intrinsics.f(p1, "p1");
                Intrinsics.f(p2, "p2");
                Intrinsics.f(p3, "p3");
                Intrinsics.f(p4, "p4");
                Intrinsics.f(p5, "p5");
                Intrinsics.f(p6, "p6");
                Intrinsics.f(p7, "p7");
                Intrinsics.f(p8, "p8");
                return new z1(p0, p1, p2, p3, p4, p5, p6, p7, p8, null, 512, null);
            }
        }

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Function9 invoke() {
            return C0167a.f14296b;
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f14297b = new b();

        public /* synthetic */ class a extends AdaptedFunctionReference implements Function9 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f14298b = new a();

            public a() {
                super(oa.class);
            }

            @Override // kotlin.jvm.functions.Function9
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final oa invoke(c0 p0, k0 p1, lh p2, AtomicReference p3, ScheduledExecutorService p4, e p5, uf p6, b2 p7, z6 p8) {
                Intrinsics.f(p0, "p0");
                Intrinsics.f(p1, "p1");
                Intrinsics.f(p2, "p2");
                Intrinsics.f(p3, "p3");
                Intrinsics.f(p4, "p4");
                Intrinsics.f(p5, "p5");
                Intrinsics.f(p6, "p6");
                Intrinsics.f(p7, "p7");
                Intrinsics.f(p8, "p8");
                return new oa(p0, p1, p2, p3, p4, p5, p6, p7, p8, null, 512, null);
            }
        }

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Function9 invoke() {
            return a.f14298b;
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f14299b = new c();

        public /* synthetic */ class a extends AdaptedFunctionReference implements Function9 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f14300b = new a();

            public a() {
                super(jf.class);
            }

            @Override // kotlin.jvm.functions.Function9
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final jf invoke(c0 p0, k0 p1, lh p2, AtomicReference p3, ScheduledExecutorService p4, e p5, uf p6, b2 p7, z6 p8) {
                Intrinsics.f(p0, "p0");
                Intrinsics.f(p1, "p1");
                Intrinsics.f(p2, "p2");
                Intrinsics.f(p3, "p3");
                Intrinsics.f(p4, "p4");
                Intrinsics.f(p5, "p5");
                Intrinsics.f(p6, "p6");
                Intrinsics.f(p7, "p7");
                Intrinsics.f(p8, "p8");
                return new jf(p0, p1, p2, p3, p4, p5, p6, p7, p8, null, 512, null);
            }
        }

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Function9 invoke() {
            return a.f14300b;
        }
    }

    public static final z1 a(Mediation mediation) {
        return (z1) new i(y.a.g, a.f14295b, mediation, null, 8, null).a();
    }

    public static final oa b(Mediation mediation) {
        return (oa) new i(y.b.g, b.f14297b, mediation, null, 8, null).a();
    }

    public static final jf c(Mediation mediation) {
        return (jf) new i(y.c.g, c.f14299b, mediation, null, 8, null).a();
    }
}
