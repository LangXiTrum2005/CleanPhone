package com.bytedance.sdk.openadsdk.core.co.fi.lr;

import android.content.Context;
import com.bytedance.adsdk.ugeno.ka.sf;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ka extends com.bytedance.adsdk.ugeno.ka.ka.ik {
    private boolean sf;

    public ka(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.ka.ka.ik
    public boolean ri(Object... objArr) {
        Map<String, String> map = this.fi;
        if (map == null || map.isEmpty()) {
            return false;
        }
        long jLongValue = ((Long) objArr[0]).longValue() / 1000;
        long jLongValue2 = ((Long) objArr[1]).longValue() / 1000;
        if (jLongValue <= 0) {
            this.sf = false;
        }
        if (this.fi.containsKey("percent")) {
            float fRi = com.bytedance.adsdk.ugeno.xha.ik.ri(this.fi.get("percent"), -1.0f);
            if (fRi >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && jLongValue >= (fRi / 100.0f) * jLongValue2 && !this.sf) {
                this.sf = true;
                sf sfVar = this.ri;
                if (sfVar != null) {
                    sfVar.ri(this.lr, this.di, this.ik.lr());
                }
            }
        } else if (jLongValue >= com.bytedance.adsdk.ugeno.xha.ik.ri(this.fi.get("interval"), -1) && !this.sf) {
            this.sf = true;
            sf sfVar2 = this.ri;
            if (sfVar2 != null) {
                sfVar2.ri(this.lr, this.di, this.ik.lr());
            }
        }
        return true;
    }
}
