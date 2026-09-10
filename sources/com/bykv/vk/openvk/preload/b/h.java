package com.bykv.vk.openvk.preload.b;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Class<? extends d> f310a;
    private com.bykv.vk.openvk.preload.b.b.a b;
    private Object[] c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Class<? extends d> f311a;
        private com.bykv.vk.openvk.preload.b.b.a b;
        private Object[] c;

        private a() {
        }

        public static a a() {
            return new a();
        }

        public final h b() {
            return new h(this, (byte) 0);
        }

        public final a a(Class<? extends d> cls) {
            if (cls != null) {
                this.f311a = cls;
                return this;
            }
            throw new IllegalArgumentException("interceptor class == null");
        }

        public final a a(com.bykv.vk.openvk.preload.b.b.a aVar) {
            this.b = aVar;
            return this;
        }

        public final a a(Object... objArr) {
            this.c = objArr;
            return this;
        }
    }

    public /* synthetic */ h(a aVar, byte b) {
        this(aVar);
    }

    public final com.bykv.vk.openvk.preload.b.b.a a() {
        return this.b;
    }

    public final Object[] b() {
        return this.c;
    }

    private h(a aVar) {
        this.f310a = aVar.f311a;
        this.b = aVar.b;
        this.c = aVar.c;
        if (this.f310a == null) {
            throw new IllegalArgumentException("Interceptor class == null");
        }
    }
}
