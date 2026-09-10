package com.mbridge.msdk.newreward.adapter.logiccontroller;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.newreward.function.command.c;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class b extends a {
    public b(c cVar) {
        super(cVar);
    }

    private void b(com.mbridge.msdk.foundation.error.b bVar) {
        if (bVar == null || this.d == null) {
            return;
        }
        try {
            if (bVar.j() == -1) {
                this.d.b(System.currentTimeMillis());
            }
            this.d.d(bVar.j() + "");
            com.mbridge.msdk.foundation.same.net.utils.c.b().a(this.d.e() + "_" + this.d.G() + "_" + this.d.R() + "_" + this.d.d(), bVar.j(), bVar.k(), System.currentTimeMillis());
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.adapter.req.b
    public void reqFailed(com.mbridge.msdk.foundation.error.b bVar) {
        b(bVar);
        if (this.d.d0() || this.d.e0() || this.d.Z()) {
            a(this.c, bVar);
        } else {
            a(bVar);
        }
    }

    @Override // com.mbridge.msdk.newreward.adapter.req.b
    public void reqSuccessful(Object obj) {
        Map map = (Map) obj;
        a(((Integer) map.get("type")).intValue(), map.get("object"));
    }
}
