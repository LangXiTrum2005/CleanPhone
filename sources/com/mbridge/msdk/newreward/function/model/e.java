package com.mbridge.msdk.newreward.function.model;

import com.mbridge.msdk.newreward.adapter.req.g;
import com.mbridge.msdk.newreward.adapter.req.h;
import com.mbridge.msdk.newreward.adapter.req.j;
import com.mbridge.msdk.newreward.adapter.req.k;
import com.mbridge.msdk.newreward.adapter.req.n;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<String, c> f1709a = new HashMap<>();

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile boolean f1711a;
        private volatile boolean b;

        private c() {
            this.f1711a = false;
            this.b = false;
        }

        public void a(boolean z) {
            this.b = z;
        }

        public void b(boolean z) {
            this.f1711a = z;
        }

        public boolean a() {
            return (this.f1711a || this.b) ? false : true;
        }
    }

    public void b(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.adapter.req.b bVar2) {
        this.f1709a.put(bVar.t(), new c());
        c(bVar, bVar2);
        for (com.mbridge.msdk.newreward.function.core.campaign.a aVar : bVar.g()) {
            f(bVar, bVar2, aVar);
            g(bVar, bVar2, aVar);
            a(bVar, bVar2, aVar);
            c(bVar, bVar2, aVar);
            d(bVar, bVar2, aVar);
            b(bVar, bVar2, aVar);
            e(bVar, bVar2, aVar);
        }
    }

    public void c(com.mbridge.msdk.newreward.function.core.campaign.a aVar, com.mbridge.msdk.newreward.adapter.req.b bVar) {
        try {
            new n().a(aVar, bVar);
        } catch (IOException e) {
            bVar.reqFailed(new com.mbridge.msdk.foundation.error.b(880020, e.getMessage()));
        }
    }

    public void d(com.mbridge.msdk.newreward.function.core.campaign.a aVar, com.mbridge.msdk.newreward.adapter.req.b bVar) {
        try {
            new g().a(aVar, bVar);
        } catch (IOException e) {
            bVar.reqFailed(new com.mbridge.msdk.foundation.error.b(880000, e.getMessage()));
        }
    }

    public void e(com.mbridge.msdk.newreward.function.core.campaign.a aVar, com.mbridge.msdk.newreward.adapter.req.b bVar) {
        try {
            new h().a(aVar, bVar);
        } catch (IOException e) {
            bVar.reqFailed(new com.mbridge.msdk.foundation.error.b(880020, e.getMessage()));
        }
    }

    public void f(com.mbridge.msdk.newreward.function.core.campaign.a aVar, com.mbridge.msdk.newreward.adapter.req.b bVar) {
        try {
            new j().a(aVar, bVar);
        } catch (IOException e) {
            bVar.reqFailed(new com.mbridge.msdk.foundation.error.b(880000, e.getMessage()));
        }
    }

    public void g(com.mbridge.msdk.newreward.function.core.campaign.a aVar, com.mbridge.msdk.newreward.adapter.req.b bVar) {
        try {
            new k().a(aVar, bVar);
        } catch (IOException e) {
            bVar.reqFailed(new com.mbridge.msdk.foundation.error.b(880000, e.getMessage()));
        }
    }

    public void a(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.adapter.req.b bVar2) {
        try {
            new com.mbridge.msdk.newreward.adapter.req.d().a(bVar, bVar2);
        } catch (IOException e) {
            bVar2.reqFailed(new com.mbridge.msdk.foundation.error.b(880020, e.getMessage()));
        }
    }

    private void c(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.adapter.req.b bVar2) {
        a(bVar, new b(bVar, this, bVar2));
    }

    private void d(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.adapter.req.b bVar2, com.mbridge.msdk.newreward.function.core.campaign.a aVar) {
        f(aVar, new b(bVar, this, bVar2));
    }

    private void e(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.adapter.req.b bVar2, com.mbridge.msdk.newreward.function.core.campaign.a aVar) {
        g(aVar, new b(bVar, this, bVar2));
    }

    private void f(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.adapter.req.b bVar2, com.mbridge.msdk.newreward.function.core.campaign.a aVar) {
        c(aVar, new b(bVar, this, bVar2));
    }

    private void g(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.adapter.req.b bVar2, com.mbridge.msdk.newreward.function.core.campaign.a aVar) {
        b(aVar, new b(bVar, this, bVar2));
    }

    private void c(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.adapter.req.b bVar2, com.mbridge.msdk.newreward.function.core.campaign.a aVar) {
        e(aVar, new b(bVar, this, bVar2));
    }

    public void a(com.mbridge.msdk.newreward.function.core.campaign.a aVar, com.mbridge.msdk.newreward.adapter.req.b bVar) {
        try {
            new com.mbridge.msdk.newreward.adapter.req.f().a(aVar, bVar);
        } catch (IOException e) {
            bVar.reqFailed(new com.mbridge.msdk.foundation.error.b(880020, e.getMessage()));
        }
    }

    public static class b implements com.mbridge.msdk.newreward.adapter.req.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.function.core.campaign.b f1710a;
        private final e b;
        private final com.mbridge.msdk.newreward.adapter.req.b c;

        public b(com.mbridge.msdk.newreward.function.core.campaign.b bVar, e eVar, com.mbridge.msdk.newreward.adapter.req.b bVar2) {
            this.f1710a = bVar;
            this.b = eVar;
            this.c = bVar2;
        }

        private void a(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.adapter.req.b bVar2) {
            if ((!this.b.f1709a.containsKey(bVar.t()) || this.b.f1709a.get(bVar.t()) == null || ((c) this.b.f1709a.get(bVar.t())).a()) && bVar.I()) {
                if (this.b.f1709a.containsKey(bVar.t()) && this.b.f1709a.get(bVar.t()) != null) {
                    ((c) this.b.f1709a.get(bVar.t())).b(true);
                }
                com.mbridge.msdk.newreward.function.database.c.c().a().b(bVar.a(), bVar.s(), bVar.E(), bVar.p(), 3, this.f1710a);
                bVar2.reqSuccessful(bVar);
            }
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqFailed(com.mbridge.msdk.foundation.error.b bVar) {
            a(this.f1710a, this.c, bVar);
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqSuccessful(Object obj) {
            a(this.f1710a, this.c);
        }

        private void a(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.adapter.req.b bVar2, com.mbridge.msdk.foundation.error.b bVar3) {
            if (!this.b.f1709a.containsKey(bVar.t()) || this.b.f1709a.get(bVar.t()) == null || ((c) this.b.f1709a.get(bVar.t())).a()) {
                if (bVar.I()) {
                    if (this.b.f1709a.containsKey(bVar.t()) && this.b.f1709a.get(bVar.t()) != null) {
                        ((c) this.b.f1709a.get(bVar.t())).b(true);
                    }
                    com.mbridge.msdk.newreward.function.database.c.c().a().b(bVar.a(), bVar.s(), bVar.E(), bVar.p(), 3, this.f1710a);
                    bVar2.reqSuccessful(bVar);
                    return;
                }
                if (this.b.f1709a.containsKey(bVar.t()) && this.b.f1709a.get(bVar.t()) != null) {
                    ((c) this.b.f1709a.get(bVar.t())).a(true);
                }
                bVar2.reqFailed(bVar3);
            }
        }
    }

    private void a(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.adapter.req.b bVar2, com.mbridge.msdk.newreward.function.core.campaign.a aVar) {
        a(aVar, new b(bVar, this, bVar2));
    }

    public void b(com.mbridge.msdk.newreward.function.core.campaign.a aVar, com.mbridge.msdk.newreward.adapter.req.b bVar) {
        try {
            new com.mbridge.msdk.newreward.adapter.req.e().a(aVar, bVar);
        } catch (IOException e) {
            bVar.reqFailed(new com.mbridge.msdk.foundation.error.b(880020, e.getMessage()));
        }
    }

    private void b(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.adapter.req.b bVar2, com.mbridge.msdk.newreward.function.core.campaign.a aVar) {
        d(aVar, new b(bVar, this, bVar2));
    }
}
