package com.bytedance.adsdk.ugeno.ka.ka;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class mj extends ik {
    private int aw;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private int f18021co;
    private int sf;

    public mj(Context context) {
        super(context);
        this.sf = -1;
        this.f18021co = -1;
        this.aw = -1;
    }

    @Override // com.bytedance.adsdk.ugeno.ka.ka.ik
    public boolean ri(Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            int iRi = com.bytedance.adsdk.ugeno.xha.ik.ri(String.valueOf(objArr[0]), -1);
            int iRi2 = com.bytedance.adsdk.ugeno.xha.ik.ri(String.valueOf(objArr[1]), -1);
            int iRi3 = com.bytedance.adsdk.ugeno.xha.ik.ri(String.valueOf(objArr[2]), -1);
            Map<String, String> map = this.fi;
            if (map == null || map.isEmpty()) {
                HashMap map2 = new HashMap();
                map2.put("fromIndex", Integer.valueOf(iRi));
                map2.put("toIndex", Integer.valueOf(iRi2));
                map2.put("type", Integer.valueOf(iRi3));
                Iterator<com.bytedance.adsdk.ugeno.ka.di.ri> it = this.ik.lr().iterator();
                while (it.hasNext()) {
                    it.next().lr(map2);
                }
                this.ri.ri(this.lr, this.di, this.ik.lr());
            } else {
                this.sf = com.bytedance.adsdk.ugeno.xha.ik.ri(this.fi.get("fromIndex"), -1);
                this.f18021co = com.bytedance.adsdk.ugeno.xha.ik.ri(this.fi.get("toIndex"), -1);
                int iRi4 = com.bytedance.adsdk.ugeno.xha.ik.ri(this.fi.get("type"), -1);
                this.aw = iRi4;
                if (iRi == this.sf && iRi2 == this.f18021co && iRi3 == iRi4) {
                    this.ri.ri(this.lr, this.di, this.ik.lr());
                }
            }
        }
        return false;
    }
}
