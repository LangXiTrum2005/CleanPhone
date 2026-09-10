package com.bytedance.adsdk.ugeno.core.ud;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.adsdk.ugeno.core.bjy;
import com.bytedance.adsdk.ugeno.core.exu;
import com.bytedance.adsdk.ugeno.wd.tvp;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class mo implements tvp.qdl {
    private bjy lnr;
    private Context mml;
    private com.bytedance.adsdk.ugeno.ud.lnr mo;
    private exu mzz;
    private boolean qdl;
    private int ud;
    private Handler wd = new tvp(Looper.getMainLooper(), this);

    public mo(Context context, exu exuVar, com.bytedance.adsdk.ugeno.ud.lnr lnrVar) {
        this.mml = context;
        this.mzz = exuVar;
        this.mo = lnrVar;
    }

    public void qdl(bjy bjyVar) {
        this.lnr = bjyVar;
    }

    public void qdl() {
        exu exuVar = this.mzz;
        if (exuVar == null) {
            return;
        }
        JSONObject jSONObjectLnr = exuVar.lnr();
        try {
            this.ud = Integer.parseInt(com.bytedance.adsdk.ugeno.lnr.ud.qdl(jSONObjectLnr.optString("interval", "8000"), this.mo.fs()));
            this.qdl = jSONObjectLnr.optBoolean("repeat");
            this.wd.sendEmptyMessageDelayed(1001, this.ud);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.wd.tvp.qdl
    public void qdl(Message message) {
        if (message.what != 1001) {
            return;
        }
        bjy bjyVar = this.lnr;
        if (bjyVar != null) {
            exu exuVar = this.mzz;
            com.bytedance.adsdk.ugeno.ud.lnr lnrVar = this.mo;
            bjyVar.qdl(exuVar, lnrVar, lnrVar);
        }
        if (this.qdl) {
            this.wd.sendEmptyMessageDelayed(1001, this.ud);
        } else {
            this.wd.removeMessages(1001);
        }
    }
}
