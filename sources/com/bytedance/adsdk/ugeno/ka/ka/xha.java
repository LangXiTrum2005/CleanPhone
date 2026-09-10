package com.bytedance.adsdk.ugeno.ka.ka;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class xha extends ik {
    public xha(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.ka.ka.ik
    public boolean ri(Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            int iRi = com.bytedance.adsdk.ugeno.xha.ik.ri(String.valueOf(objArr[0]), 0);
            Map<String, String> map = this.fi;
            if (map == null || map.isEmpty() || iRi == com.bytedance.adsdk.ugeno.xha.ik.ri(this.fi.get("type"), 0)) {
                this.ri.ri(this.lr, this.di, this.ik.lr());
            }
        }
        return false;
    }
}
