package com.efs.sdk.memleaksdk.monitor.internal;

/* JADX INFO: loaded from: classes2.dex */
public class ai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ai f459a;
    public static final ai b;
    public static final ai c;

    public static class a extends ai {
        private a() {
            super((byte) 0);
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ai
        public float a(long j) {
            return j;
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ai
        public float b(long j) {
            return (j / 1024.0f) / 1024.0f;
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static class b extends ai {
        private b() {
            super((byte) 0);
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ai
        public float a(long j) {
            return j * 1024.0f;
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ai
        public float b(long j) {
            return j / 1024.0f;
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    public static class c extends ai {
        private c() {
            super((byte) 0);
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ai
        public float a(long j) {
            return j * 1024.0f * 1024.0f;
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ai
        public float b(long j) {
            return j;
        }

        public /* synthetic */ c(byte b) {
            this();
        }
    }

    static {
        byte b2 = 0;
        f459a = new a(b2);
        b = new b(b2);
        c = new c(b2);
    }

    private ai() {
    }

    public /* synthetic */ ai(byte b2) {
        this();
    }

    public float a(long j) {
        return 0.0f;
    }

    public float b(long j) {
        return 0.0f;
    }

    public float a(int i) {
        return a(i);
    }
}
