package com.bykv.vk.openvk.preload.a;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Class<? extends d> f12869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.a.b.a f12870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f12871c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Class<? extends d> f12872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.a.b.a f12873b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object[] f12874c;

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
                this.f12872a = cls;
                return this;
            }
            throw new IllegalArgumentException("interceptor class == null");
        }

        public final a a(com.bykv.vk.openvk.preload.a.b.a aVar) {
            this.f12873b = aVar;
            return this;
        }

        public final a a(Object... objArr) {
            this.f12874c = objArr;
            return this;
        }
    }

    public /* synthetic */ h(a aVar, byte b2) {
        this(aVar);
    }

    public final com.bykv.vk.openvk.preload.a.b.a a() {
        return this.f12870b;
    }

    public final Object[] b() {
        return this.f12871c;
    }

    private h(a aVar) {
        this.f12869a = aVar.f12872a;
        this.f12870b = aVar.f12873b;
        this.f12871c = aVar.f12874c;
        if (this.f12869a == null) {
            throw new IllegalArgumentException("Interceptor class == null");
        }
    }
}
