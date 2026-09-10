package com.ironsource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3610l1 {

    /* JADX INFO: renamed from: com.ironsource.l1$a */
    public static final class a {
        public static final C0401a a = new C0401a(null);

        /* JADX INFO: renamed from: com.ironsource.l1$a$a, reason: collision with other inner class name */
        public static final class C0401a {
            public /* synthetic */ C0401a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC3610l1 a(C3664o1.j errorCode, C3664o1.k errorReason) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                return new b(403, p002kotlin.collections.adultoid.polloi(errorCode, errorReason));
            }

            public final InterfaceC3610l1 b(InterfaceC3682p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(404, p002kotlin.collections.adultoid.polloi(Arrays.copyOf(entity, entity.length)));
            }

            public final InterfaceC3610l1 c(InterfaceC3682p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(409, p002kotlin.collections.adultoid.polloi(Arrays.copyOf(entity, entity.length)));
            }

            public final InterfaceC3610l1 d(InterfaceC3682p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(401, p002kotlin.collections.adultoid.polloi(Arrays.copyOf(entity, entity.length)));
            }

            public final InterfaceC3610l1 e(InterfaceC3682p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(408, p002kotlin.collections.adultoid.polloi(Arrays.copyOf(entity, entity.length)));
            }

            public final InterfaceC3610l1 f(InterfaceC3682p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(405, p002kotlin.collections.adultoid.polloi(Arrays.copyOf(entity, entity.length)));
            }

            private C0401a() {
            }

            public final InterfaceC3610l1 a() {
                return new b(406, new ArrayList());
            }

            public final InterfaceC3610l1 a(InterfaceC3682p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(407, p002kotlin.collections.adultoid.polloi(Arrays.copyOf(entity, entity.length)));
            }

            public final InterfaceC3610l1 a(boolean z) {
                if (z) {
                    return new b(410, new ArrayList());
                }
                return new b(411, new ArrayList());
            }
        }

        /* JADX INFO: renamed from: com.ironsource.l1$a$b */
        public static final class b {
            public static final b a = new b();
            public static final int b = 401;
            public static final int c = 403;
            public static final int d = 404;
            public static final int e = 405;
            public static final int f = 406;
            public static final int g = 407;
            public static final int h = 408;
            public static final int i = 409;
            public static final int j = 410;
            public static final int k = 411;

            private b() {
            }
        }

        public static final InterfaceC3610l1 a() {
            return a.a();
        }

        public static final InterfaceC3610l1 b(InterfaceC3682p1... interfaceC3682p1Arr) {
            return a.b(interfaceC3682p1Arr);
        }

        public static final InterfaceC3610l1 c(InterfaceC3682p1... interfaceC3682p1Arr) {
            return a.c(interfaceC3682p1Arr);
        }

        public static final InterfaceC3610l1 d(InterfaceC3682p1... interfaceC3682p1Arr) {
            return a.d(interfaceC3682p1Arr);
        }

        public static final InterfaceC3610l1 e(InterfaceC3682p1... interfaceC3682p1Arr) {
            return a.e(interfaceC3682p1Arr);
        }

        public static final InterfaceC3610l1 f(InterfaceC3682p1... interfaceC3682p1Arr) {
            return a.f(interfaceC3682p1Arr);
        }

        public static final InterfaceC3610l1 a(InterfaceC3682p1... interfaceC3682p1Arr) {
            return a.a(interfaceC3682p1Arr);
        }

        public static final InterfaceC3610l1 a(boolean z) {
            return a.a(z);
        }

        public static final InterfaceC3610l1 a(C3664o1.j jVar, C3664o1.k kVar) {
            return a.a(jVar, kVar);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l1$b */
    public static final class b implements InterfaceC3610l1 {
        private final int a;
        private final List<InterfaceC3682p1> b;

        public b(int i, List<InterfaceC3682p1> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "arrayList");
            this.a = i;
            this.b = arrayList;
        }

        @Override // com.ironsource.InterfaceC3610l1
        public void a(InterfaceC3732s1 analytics) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            analytics.a(this.a, this.b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l1$c */
    public static final class c {
        public static final a a = new a(null);

        /* JADX INFO: renamed from: com.ironsource.l1$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC3610l1 a() {
                return new b(201, new ArrayList());
            }

            public final InterfaceC3610l1 b() {
                return new b(206, new ArrayList());
            }

            private a() {
            }

            public final InterfaceC3610l1 a(C3664o1.l ext1) {
                Intrinsics.checkNotNullParameter(ext1, "ext1");
                return new b(207, p002kotlin.collections.adultoid.polloi(ext1));
            }

            public final InterfaceC3610l1 a(InterfaceC3682p1 duration) {
                Intrinsics.checkNotNullParameter(duration, "duration");
                return new b(202, p002kotlin.collections.adultoid.polloi(duration));
            }

            public final InterfaceC3610l1 a(C3664o1.j errorCode, C3664o1.k errorReason, C3664o1.f duration) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                Intrinsics.checkNotNullParameter(duration, "duration");
                return new b(203, p002kotlin.collections.adultoid.polloi(errorCode, errorReason, duration));
            }

            public final InterfaceC3610l1 a(InterfaceC3682p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(204, p002kotlin.collections.adultoid.polloi(Arrays.copyOf(entity, entity.length)));
            }
        }

        /* JADX INFO: renamed from: com.ironsource.l1$c$b */
        public static final class b {
            public static final b a = new b();
            public static final int b = 201;
            public static final int c = 202;
            public static final int d = 203;
            public static final int e = 204;
            public static final int f = 205;
            public static final int g = 206;
            public static final int h = 207;

            private b() {
            }
        }

        public static final InterfaceC3610l1 a(InterfaceC3682p1... interfaceC3682p1Arr) {
            return a.a(interfaceC3682p1Arr);
        }

        public static final InterfaceC3610l1 b() {
            return a.b();
        }

        public static final InterfaceC3610l1 a() {
            return a.a();
        }

        public static final InterfaceC3610l1 a(C3664o1.j jVar, C3664o1.k kVar, C3664o1.f fVar) {
            return a.a(jVar, kVar, fVar);
        }

        public static final InterfaceC3610l1 a(InterfaceC3682p1 interfaceC3682p1) {
            return a.a(interfaceC3682p1);
        }

        public static final InterfaceC3610l1 a(C3664o1.l lVar) {
            return a.a(lVar);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l1$d */
    public static final class d {
        public static final a a = new a(null);

        /* JADX INFO: renamed from: com.ironsource.l1$d$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC3610l1 a() {
                return new b(101, new ArrayList());
            }

            public final InterfaceC3610l1 b(InterfaceC3682p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(110, p002kotlin.collections.adultoid.polloi(Arrays.copyOf(entity, entity.length)));
            }

            public final b c() {
                return new b(105, new ArrayList());
            }

            private a() {
            }

            public final InterfaceC3610l1 a(InterfaceC3682p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(102, p002kotlin.collections.adultoid.polloi(Arrays.copyOf(entity, entity.length)));
            }

            public final InterfaceC3610l1 b() {
                return new b(112, new ArrayList());
            }

            public final InterfaceC3610l1 a(C3664o1.f duration) {
                Intrinsics.checkNotNullParameter(duration, "duration");
                return new b(103, p002kotlin.collections.adultoid.polloi(duration));
            }

            public final InterfaceC3610l1 a(C3664o1.j errorCode, C3664o1.k errorReason, C3664o1.f duration, C3664o1.l loaderState) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                Intrinsics.checkNotNullParameter(duration, "duration");
                Intrinsics.checkNotNullParameter(loaderState, "loaderState");
                return new b(104, p002kotlin.collections.adultoid.polloi(errorCode, errorReason, duration, loaderState));
            }

            public final InterfaceC3610l1 a(C3664o1.j errorCode, C3664o1.k errorReason) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                return new b(109, p002kotlin.collections.adultoid.polloi(errorCode, errorReason));
            }

            public final InterfaceC3610l1 a(InterfaceC3682p1 ext1) {
                Intrinsics.checkNotNullParameter(ext1, "ext1");
                return new b(111, p002kotlin.collections.adultoid.polloi(ext1));
            }

            public final InterfaceC3610l1 a(C3664o1.k errorReason) {
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                return new b(113, p002kotlin.collections.adultoid.polloi(errorReason));
            }
        }

        /* JADX INFO: renamed from: com.ironsource.l1$d$b */
        public static final class b {
            public static final b a = new b();
            public static final int b = 101;
            public static final int c = 102;
            public static final int d = 103;
            public static final int e = 104;
            public static final int f = 105;
            public static final int g = 109;
            public static final int h = 110;
            public static final int i = 111;
            public static final int j = 112;
            public static final int k = 113;

            private b() {
            }
        }

        public static final InterfaceC3610l1 a() {
            return a.a();
        }

        public static final InterfaceC3610l1 b() {
            return a.b();
        }

        public static final b c() {
            return a.c();
        }

        public static final InterfaceC3610l1 a(InterfaceC3682p1... interfaceC3682p1Arr) {
            return a.a(interfaceC3682p1Arr);
        }

        public static final InterfaceC3610l1 b(InterfaceC3682p1... interfaceC3682p1Arr) {
            return a.b(interfaceC3682p1Arr);
        }

        public static final InterfaceC3610l1 a(C3664o1.j jVar, C3664o1.k kVar) {
            return a.a(jVar, kVar);
        }

        public static final InterfaceC3610l1 a(C3664o1.j jVar, C3664o1.k kVar, C3664o1.f fVar, C3664o1.l lVar) {
            return a.a(jVar, kVar, fVar, lVar);
        }

        public static final InterfaceC3610l1 a(InterfaceC3682p1 interfaceC3682p1) {
            return a.a(interfaceC3682p1);
        }

        public static final InterfaceC3610l1 a(C3664o1.f fVar) {
            return a.a(fVar);
        }

        public static final InterfaceC3610l1 a(C3664o1.k kVar) {
            return a.a(kVar);
        }
    }

    void a(InterfaceC3732s1 interfaceC3732s1);
}
