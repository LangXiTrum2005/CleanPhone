package com.bytedance.adsdk.ugeno.mml.mml;

import android.content.Context;
import androidx.datastore.preferences.protobuf.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class jpc extends lnr {
    private int exu;
    private int fs;
    private int rq;

    public jpc(Context context) {
        super(context);
        this.rq = -1;
        this.fs = -1;
        this.exu = -1;
    }

    @Override // com.bytedance.adsdk.ugeno.mml.mml.lnr
    public boolean qdl(Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            int iQdl = com.bytedance.adsdk.ugeno.wd.lnr.qdl(String.valueOf(objArr[0]), -1);
            int iQdl2 = com.bytedance.adsdk.ugeno.wd.lnr.qdl(String.valueOf(objArr[1]), -1);
            int iQdl3 = com.bytedance.adsdk.ugeno.wd.lnr.qdl(String.valueOf(objArr[2]), -1);
            Map<String, String> map = this.mzz;
            if (map == null || map.isEmpty()) {
                HashMap map2 = new HashMap();
                a.v(iQdl, map2, "fromIndex", iQdl2, "toIndex");
                map2.put("type", Integer.valueOf(iQdl3));
                Iterator<com.bytedance.adsdk.ugeno.mml.mo.qdl> it = this.lnr.ud().iterator();
                while (it.hasNext()) {
                    it.next().ud(map2);
                }
                this.qdl.qdl(this.ud, this.mo, this.lnr.ud());
            } else {
                this.rq = com.bytedance.adsdk.ugeno.wd.lnr.qdl(this.mzz.get("fromIndex"), -1);
                this.fs = com.bytedance.adsdk.ugeno.wd.lnr.qdl(this.mzz.get("toIndex"), -1);
                int iQdl4 = com.bytedance.adsdk.ugeno.wd.lnr.qdl(this.mzz.get("type"), -1);
                this.exu = iQdl4;
                if (iQdl == this.rq && iQdl2 == this.fs && iQdl3 == iQdl4) {
                    this.qdl.qdl(this.ud, this.mo, this.lnr.ud());
                }
            }
        }
        return false;
    }
}
