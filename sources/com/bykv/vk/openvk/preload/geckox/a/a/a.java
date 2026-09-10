package com.bykv.vk.openvk.preload.geckox.a.a;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f12901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final c f12902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f12903c;

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.a.a.a$a, reason: collision with other inner class name */
    public static final class C0053a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f12904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f12905b = b.f12907a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private c f12906c;

        public final C0053a a() {
            this.f12904a = 20;
            return this;
        }

        public final a b() {
            return new a(this, (byte) 0);
        }

        public final C0053a a(b bVar) {
            if (bVar == null) {
                bVar = b.f12907a;
            }
            this.f12905b = bVar;
            return this;
        }
    }

    public /* synthetic */ a(C0053a c0053a, byte b2) {
        this(c0053a);
    }

    public final b a() {
        return this.f12903c;
    }

    private a(C0053a c0053a) {
        this.f12901a = c0053a.f12904a;
        this.f12903c = c0053a.f12905b;
        this.f12902b = c0053a.f12906c;
    }
}
