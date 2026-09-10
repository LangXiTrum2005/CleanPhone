package com.mbridge.msdk.newreward.function.command.receiver.strategy;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.command.concretecommand.a f1665a;
    private com.mbridge.msdk.newreward.function.command.receiver.strategy.a b;
    private com.mbridge.msdk.newreward.function.command.receiver.strategy.b c;
    private d d;
    private boolean e = false;
    private boolean f = false;

    public class a implements com.mbridge.msdk.newreward.adapter.req.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.newreward.adapter.req.b f1666a;

        public a(com.mbridge.msdk.newreward.adapter.req.b bVar) {
            this.f1666a = bVar;
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqFailed(com.mbridge.msdk.foundation.error.b bVar) {
            com.mbridge.msdk.newreward.adapter.req.b bVar2 = this.f1666a;
            if (bVar2 != null) {
                bVar2.reqFailed(bVar);
            }
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqSuccessful(Object obj) {
            com.mbridge.msdk.newreward.adapter.req.b bVar = this.f1666a;
            if (bVar != null) {
                bVar.reqSuccessful(obj);
            }
        }
    }

    public class b implements com.mbridge.msdk.newreward.adapter.req.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f1667a;
        private final com.mbridge.msdk.newreward.adapter.req.b b;

        public b(c cVar, com.mbridge.msdk.newreward.adapter.req.b bVar) {
            this.f1667a = cVar;
            this.b = bVar;
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqFailed(com.mbridge.msdk.foundation.error.b bVar) {
            if (bVar.b() != 1) {
                this.b.reqFailed(bVar);
            } else if (c.this.b.a() && c.this.c.a() && !this.f1667a.f) {
                this.f1667a.f = true;
                this.b.reqFailed(bVar);
            }
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqSuccessful(Object obj) {
            if (this.f1667a.e) {
                return;
            }
            this.f1667a.e = true;
            this.b.reqSuccessful(obj);
        }
    }

    public c(com.mbridge.msdk.newreward.function.command.concretecommand.a aVar) {
        this.f1665a = aVar;
    }

    public void a(e eVar, com.mbridge.msdk.newreward.adapter.req.b bVar) {
        int iD = eVar.d();
        if (iD == 1) {
            if (this.b == null) {
                a();
            }
            this.b.a(eVar, new b(this, bVar));
        } else if (iD == 2) {
            if (this.d == null) {
                this.d = new d();
            }
            this.d.a(eVar, new a(bVar));
        } else {
            if (iD != 3) {
                return;
            }
            if (this.c == null) {
                this.c = new com.mbridge.msdk.newreward.function.command.receiver.strategy.b(this.f1665a);
            }
            this.c.b(eVar, new b(this, bVar));
        }
    }

    private void a() {
        this.b = new com.mbridge.msdk.newreward.function.command.receiver.strategy.a(this.f1665a);
    }

    public boolean a(e eVar) {
        if (eVar.d() == 1) {
            if (this.b == null) {
                a();
            }
            return this.b.a(eVar);
        }
        if (eVar.d() == 2) {
            if (this.d == null) {
                this.d = new d();
            }
            return this.d.a(eVar);
        }
        if (eVar.d() != 3) {
            return false;
        }
        if (this.c == null) {
            this.c = new com.mbridge.msdk.newreward.function.command.receiver.strategy.b(this.f1665a);
        }
        return this.c.a(eVar);
    }
}
