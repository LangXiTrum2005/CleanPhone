package com.mbridge.msdk.newreward.function.command.receiver.concretereceiver;

import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.newreward.function.common.MBridgeSharedPreferenceModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class g implements com.mbridge.msdk.newreward.function.command.receiver.a {
    @Override // com.mbridge.msdk.newreward.function.command.receiver.a
    public void a(com.mbridge.msdk.newreward.function.command.b bVar, com.mbridge.msdk.newreward.adapter.req.b bVar2) {
        try {
            Map map = (Map) bVar.b();
            int iIntValue = ((Integer) map.get("mb_ad_type")).intValue();
            String str = (String) map.get("mb_ad_pid");
            String str2 = (String) map.get("mb_ad_unit_id");
            com.mbridge.msdk.newreward.function.database.c.c().a().a(iIntValue, str, str2, ((Boolean) map.get("mb_ad_is_header_bidding")).booleanValue(), MBridgeSharedPreferenceModel.getInstance().getInteger("vcn_" + str2, 1), new a(bVar2));
        } catch (Exception e) {
            o0.b("RestoreFromDBReceiver", com.umeng.ccg.a.w, e);
        }
    }

    public class a implements com.mbridge.msdk.newreward.function.database.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.newreward.adapter.req.b f1637a;

        public a(com.mbridge.msdk.newreward.adapter.req.b bVar) {
            this.f1637a = bVar;
        }

        @Override // com.mbridge.msdk.newreward.function.database.b
        public void a(List<com.mbridge.msdk.newreward.function.core.campaign.b> list) {
            try {
                com.mbridge.msdk.newreward.adapter.req.b bVar = this.f1637a;
                if (bVar != null) {
                    bVar.reqSuccessful(list);
                }
            } catch (Exception e) {
                o0.b("RestoreFromDBReceiver", com.umeng.ccg.a.w, e);
            }
        }

        @Override // com.mbridge.msdk.newreward.function.database.b
        public void a() {
            try {
                com.mbridge.msdk.newreward.adapter.req.b bVar = this.f1637a;
                if (bVar != null) {
                    bVar.reqFailed(new com.mbridge.msdk.foundation.error.b(880040, "no cached campaign in db"));
                }
            } catch (Exception e) {
                o0.b("RestoreFromDBReceiver", com.umeng.ccg.a.w, e);
            }
        }
    }
}
