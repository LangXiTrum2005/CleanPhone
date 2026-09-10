package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cm {

    public static final class a extends cm {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f642a;
        public final int b;
        final int c;
        private final long d;
        private final long e;

        public a(long j, long j2, int i, long j3, int i2) {
            super((byte) 0);
            this.d = j;
            this.f642a = j2;
            this.b = i;
            this.e = j3;
            this.c = i2;
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.cm
        public long a() {
            return this.d;
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.cm
        public long b() {
            return this.e;
        }
    }

    public static final class b extends cm {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f643a;
        private final long b;
        private final long c;

        public b(long j, long j2, long j3) {
            super((byte) 0);
            this.b = j;
            this.f643a = j2;
            this.c = j3;
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.cm
        public long a() {
            return this.b;
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.cm
        public long b() {
            return this.c;
        }
    }

    public static final class c extends cm {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f644a;
        private final long b;
        private final long c;

        public c(long j, long j2, long j3) {
            super((byte) 0);
            this.b = j;
            this.f644a = j2;
            this.c = j3;
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.cm
        public long a() {
            return this.b;
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.cm
        public long b() {
            return this.c;
        }
    }

    public static final class d extends cm {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte f645a;
        private final long b;
        private final long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j, br brVar, long j2) {
            super((byte) 0);
            AbstractC2995aW.q(brVar, "primitiveType");
            this.b = j;
            this.c = j2;
            this.f645a = (byte) brVar.ordinal();
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.cm
        public long a() {
            return this.b;
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.cm
        public long b() {
            return this.c;
        }

        public final br c() {
            return br.values()[this.f645a];
        }
    }

    private cm() {
    }

    public /* synthetic */ cm(byte b2) {
        this();
    }

    public abstract long a();

    public abstract long b();
}
