package com.mbridge.msdk.newreward.adapter;

import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: loaded from: classes2.dex */
public class g extends a implements b {
    com.mbridge.msdk.newreward.adapter.logiccontroller.a b;

    public g(com.mbridge.msdk.newreward.function.command.c cVar) {
        super(cVar);
    }

    @Override // com.mbridge.msdk.newreward.adapter.b
    public void a(e eVar) {
        if (com.mbridge.msdk.util.b.a()) {
            this.f1561a.e(eVar);
            return;
        }
        try {
            if (eVar.g().a().d() == 501) {
                this.f1561a.e(eVar);
                return;
            }
            if (eVar.g().a().C() == 5002010) {
                this.f1561a.e(eVar);
                return;
            }
            if (com.mbridge.msdk.foundation.same.b.b().a("new_bridge_reward_show")) {
                this.f1561a.a(eVar, "NewShowReceiver");
            } else {
                this.f1561a.e(eVar);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.adapter.b
    public void b(e eVar) {
        com.mbridge.msdk.newreward.adapter.logiccontroller.b bVar = new com.mbridge.msdk.newreward.adapter.logiccontroller.b(this.f1561a);
        this.b = bVar;
        bVar.b(eVar);
    }
}
