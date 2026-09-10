package com.mbridge.msdk.newreward.function.command.receiver.concretereceiver;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class k implements com.mbridge.msdk.newreward.function.command.receiver.e {
    public Object a(Object obj) {
        List<CampaignEx> listB;
        com.mbridge.msdk.newreward.function.model.a aVarG;
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map == null) {
            return null;
        }
        com.mbridge.msdk.newreward.adapter.e eVar = (com.mbridge.msdk.newreward.adapter.e) map.get("adapter_model");
        com.mbridge.msdk.newreward.function.model.a aVarG2 = ((com.mbridge.msdk.newreward.adapter.e) map.get("queue_first_adapter_model")).g();
        if (aVarG2 != null && (listB = aVarG2.b()) != null && listB.size() != 0) {
            String encryptPrice = listB.get(0).getEncryptPrice();
            if (!TextUtils.isEmpty(encryptPrice) && (aVarG = eVar.g()) != null && aVarG.b() != null && aVarG.b().size() != 0) {
                List<CampaignEx> listB2 = eVar.g().b();
                HashMap map2 = new HashMap();
                map2.put("encrypt_p=", "encrypt_p=" + encryptPrice);
                map2.put("irlfa=", "irlfa=1");
                for (CampaignEx campaignEx : listB2) {
                    for (Map.Entry entry : map2.entrySet()) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        if (campaignEx != null) {
                            campaignEx.setImpressionURL(campaignEx.getImpressionURL().replaceAll(str, str2));
                            campaignEx.setOnlyImpressionURL(campaignEx.getOnlyImpressionURL().replaceAll(str, str2));
                        }
                    }
                }
                return map;
            }
        }
        return null;
    }
}
