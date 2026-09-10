package com.mbridge.msdk.newreward.function.command.receiver.showreceiver;

import android.view.ViewGroup;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.newreward.player.view.moreoffer.TemplateMoreOffer;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class d implements com.mbridge.msdk.newreward.function.command.receiver.a {
    @Override // com.mbridge.msdk.newreward.function.command.receiver.a
    public void a(com.mbridge.msdk.newreward.function.command.b bVar, com.mbridge.msdk.newreward.adapter.req.b bVar2) {
        if (bVar != null) {
            try {
                if (bVar.b() instanceof Map) {
                    Map map = (Map) bVar.b();
                    int iIntValue = ((Integer) map.get("add_temple")).intValue();
                    ViewGroup viewGroup = (ViewGroup) map.get("parent_temple");
                    int iIntValue2 = ((Integer) map.get("more_offer_type")).intValue();
                    if (iIntValue != 295) {
                        return;
                    }
                    new TemplateMoreOffer(viewGroup.getContext(), bVar2, iIntValue2).show(viewGroup);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }
}
