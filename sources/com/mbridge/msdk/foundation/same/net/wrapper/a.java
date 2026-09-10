package com.mbridge.msdk.foundation.same.net.wrapper;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a extends c {
    public a(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.foundation.same.net.wrapper.c
    public void addExtraParams(String str, e eVar) {
        try {
            int iA = v0.a();
            String strC = v0.c();
            if (eVar != null) {
                eVar.a("misk_spt", String.valueOf(iA));
                if (!TextUtils.isEmpty(strC)) {
                    eVar.a("misk_spt_det", strC);
                }
            }
        } catch (Exception e10) {
            q0.a("CampaignRequest", e10.getMessage());
        } finally {
            super.addExtraParams(str, eVar);
        }
    }
}
