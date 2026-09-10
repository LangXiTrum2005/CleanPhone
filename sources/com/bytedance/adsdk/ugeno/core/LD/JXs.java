package com.bytedance.adsdk.ugeno.core.LD;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.adsdk.ugeno.core.nBu;
import com.bytedance.adsdk.ugeno.core.sLN;
import com.bytedance.adsdk.ugeno.ebl.QAg;
import com.umeng.analytics.pro.bc;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class JXs implements QAg.Lxb {
    private nBu JXs;
    private int LD;
    private boolean Lxb;
    private Context ZU;
    private Handler ebl = new QAg(Looper.getMainLooper(), this);
    private com.bytedance.adsdk.ugeno.LD.lk lc;
    private sLN lk;

    public JXs(Context context, nBu nbu, com.bytedance.adsdk.ugeno.LD.lk lkVar) {
        this.ZU = context;
        this.JXs = nbu;
        this.lc = lkVar;
    }

    public void Lxb(sLN sln) {
        this.lk = sln;
    }

    public void Lxb() {
        nBu nbu = this.JXs;
        if (nbu == null) {
            return;
        }
        JSONObject jSONObjectLk = nbu.lk();
        try {
            this.LD = Integer.parseInt(com.bytedance.adsdk.ugeno.lk.LD.Lxb(jSONObjectLk.optString(bc.ba, "8000"), this.lc.nBu()));
            this.Lxb = jSONObjectLk.optBoolean("repeat");
            this.ebl.sendEmptyMessageDelayed(1001, this.LD);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ebl.QAg.Lxb
    public void Lxb(Message message) {
        if (message.what != 1001) {
            return;
        }
        sLN sln = this.lk;
        if (sln != null) {
            nBu nbu = this.JXs;
            com.bytedance.adsdk.ugeno.LD.lk lkVar = this.lc;
            sln.Lxb(nbu, lkVar, lkVar);
        }
        if (this.Lxb) {
            this.ebl.sendEmptyMessageDelayed(1001, this.LD);
        } else {
            this.ebl.removeMessages(1001);
        }
    }
}
