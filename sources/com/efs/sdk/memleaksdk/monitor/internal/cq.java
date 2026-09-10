package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cq {

    public static abstract class a extends cq {

        /* JADX INFO: renamed from: com.efs.sdk.memleaksdk.monitor.internal.cq$a$a, reason: collision with other inner class name */
        public static final class C0133a extends a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f658a;
            private final cq b;
            private final bk.b c;
            private final String d;
            private final bn e;
            private final long f;

            public /* synthetic */ C0133a(long j, cq cqVar, bk.b bVar, String str, bn bnVar, long j2, int i) {
                this(j, cqVar, bVar, str, bnVar, (i & 32) != 0 ? 0L : j2);
            }

            @Override // com.efs.sdk.memleaksdk.monitor.internal.cq
            public long a() {
                return this.f658a;
            }

            @Override // com.efs.sdk.memleaksdk.monitor.internal.cq.a
            public cq b() {
                return this.b;
            }

            @Override // com.efs.sdk.memleaksdk.monitor.internal.cq.a
            public bk.b c() {
                return this.c;
            }

            @Override // com.efs.sdk.memleaksdk.monitor.internal.cq.a
            public String d() {
                return this.d;
            }

            @Override // com.efs.sdk.memleaksdk.monitor.internal.cq.a
            public long e() {
                return this.f;
            }

            @Override // com.efs.sdk.memleaksdk.monitor.internal.cq.b
            public bn f() {
                return this.e;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0133a(long j, cq cqVar, bk.b bVar, String str, bn bnVar, long j2) {
                super((byte) 0);
                AbstractC2995aW.q(cqVar, "parent");
                AbstractC2995aW.q(bVar, "refFromParentType");
                AbstractC2995aW.q(str, "refFromParentName");
                AbstractC2995aW.q(bnVar, "matcher");
                this.f658a = j;
                this.b = cqVar;
                this.c = bVar;
                this.d = str;
                this.e = bnVar;
                this.f = j2;
            }
        }

        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f659a;
            private final cq b;
            private final bk.b c;
            private final String d;
            private final long e;

            public /* synthetic */ b(long j, cq cqVar, bk.b bVar, String str, long j2, int i) {
                this(j, cqVar, bVar, str, (i & 16) != 0 ? 0L : j2);
            }

            @Override // com.efs.sdk.memleaksdk.monitor.internal.cq
            public long a() {
                return this.f659a;
            }

            @Override // com.efs.sdk.memleaksdk.monitor.internal.cq.a
            public cq b() {
                return this.b;
            }

            @Override // com.efs.sdk.memleaksdk.monitor.internal.cq.a
            public bk.b c() {
                return this.c;
            }

            @Override // com.efs.sdk.memleaksdk.monitor.internal.cq.a
            public String d() {
                return this.d;
            }

            @Override // com.efs.sdk.memleaksdk.monitor.internal.cq.a
            public long e() {
                return this.e;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(long j, cq cqVar, bk.b bVar, String str, long j2) {
                super((byte) 0);
                AbstractC2995aW.q(cqVar, "parent");
                AbstractC2995aW.q(bVar, "refFromParentType");
                AbstractC2995aW.q(str, "refFromParentName");
                this.f659a = j;
                this.b = cqVar;
                this.c = bVar;
                this.d = str;
                this.e = j2;
            }
        }

        private a() {
            super((byte) 0);
        }

        public abstract cq b();

        public abstract bk.b c();

        public abstract String d();

        public abstract long e();

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public interface b {
        bn f();
    }

    public static abstract class c extends cq {

        public static final class a extends c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f660a;
            private final ap b;
            private final bn c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j, ap apVar, bn bnVar) {
                super((byte) 0);
                AbstractC2995aW.q(apVar, "gcRoot");
                AbstractC2995aW.q(bnVar, "matcher");
                this.f660a = j;
                this.b = apVar;
                this.c = bnVar;
            }

            @Override // com.efs.sdk.memleaksdk.monitor.internal.cq
            public long a() {
                return this.f660a;
            }

            @Override // com.efs.sdk.memleaksdk.monitor.internal.cq.c
            public ap b() {
                return this.b;
            }

            @Override // com.efs.sdk.memleaksdk.monitor.internal.cq.b
            public bn f() {
                return this.c;
            }
        }

        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f661a;
            private final ap b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(long j, ap apVar) {
                super((byte) 0);
                AbstractC2995aW.q(apVar, "gcRoot");
                this.f661a = j;
                this.b = apVar;
            }

            @Override // com.efs.sdk.memleaksdk.monitor.internal.cq
            public long a() {
                return this.f661a;
            }

            @Override // com.efs.sdk.memleaksdk.monitor.internal.cq.c
            public ap b() {
                return this.b;
            }
        }

        private c() {
            super((byte) 0);
        }

        public abstract ap b();

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    private cq() {
    }

    public /* synthetic */ cq(byte b2) {
        this();
    }

    public abstract long a();
}
