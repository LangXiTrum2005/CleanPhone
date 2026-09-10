package com.bytedance.sdk.openadsdk.core.co.fi.lr;

import android.content.Context;
import com.bytedance.adsdk.ugeno.ka.sf;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends com.bytedance.adsdk.ugeno.ka.ka.ik {
    private boolean sf;

    public ri(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.ka.ka.ik
    public boolean ri(Object... objArr) {
        Map<String, String> map = this.fi;
        if (map != null && !map.isEmpty()) {
            try {
                Object obj = objArr[0];
                if (obj == null) {
                    return false;
                }
                int iRi = com.bytedance.adsdk.ugeno.xha.ik.ri(obj.toString(), -1);
                if (this.fi.containsKey("remainingSeconds")) {
                    int iRi2 = com.bytedance.adsdk.ugeno.xha.ik.ri(this.fi.get("remainingSeconds"), -1);
                    if (iRi >= 0 && iRi2 >= 0 && iRi == iRi2 && !this.sf) {
                        this.sf = true;
                        sf sfVar = this.ri;
                        if (sfVar != null) {
                            sfVar.ri(this.lr, this.di, this.ik.lr());
                        }
                    }
                }
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
