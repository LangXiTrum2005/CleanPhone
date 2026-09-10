package com.smartdigimkt.c3;

/* JADX INFO: loaded from: classes5.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.smartdigimkt.s0.c f34109a;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static h f34110a = new h();

        private b() {
        }
    }

    public static h a() {
        return b.f34110a;
    }

    private void b() {
        if (com.smartdigimkt.u.a.f().d() != null) {
            this.f34109a = new com.smartdigimkt.s0.c(com.smartdigimkt.u.a.f().d());
        }
    }

    private h() {
        b();
    }

    public void a(com.smartdigimkt.s0.a aVar) {
        com.smartdigimkt.s0.c cVar = this.f34109a;
        if (cVar != null) {
            cVar.b(aVar);
        }
    }
}
