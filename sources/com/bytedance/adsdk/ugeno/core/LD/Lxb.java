package com.bytedance.adsdk.ugeno.core.LD;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.core.ebl;
import com.bytedance.adsdk.ugeno.core.nBu;
import com.bytedance.adsdk.ugeno.core.sLN;
import com.bytedance.adsdk.ugeno.ebl.QAg;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Lxb implements QAg.Lxb {
    private com.bytedance.adsdk.ugeno.LD.lk JXs;
    private sLN LD;
    private int Lxb;
    private nBu ZU;
    private Handler lc = new QAg(Looper.getMainLooper(), this);
    private Context lk;

    public Lxb(Context context, nBu nbu, com.bytedance.adsdk.ugeno.LD.lk lkVar) {
        this.lk = context;
        this.ZU = nbu;
        this.JXs = lkVar;
    }

    public void Lxb(sLN sln) {
        this.LD = sln;
    }

    public void Lxb() {
        nBu nbu = this.ZU;
        if (nbu == null) {
            return;
        }
        try {
            int i = Integer.parseInt(com.bytedance.adsdk.ugeno.lk.LD.Lxb(nbu.lk().optString("delay"), this.JXs.nBu()));
            this.Lxb = i;
            this.lc.sendEmptyMessageDelayed(1001, i);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ebl.QAg.Lxb
    public void Lxb(Message message) {
        if (message.what != 1001) {
            return;
        }
        JSONObject jSONObjectLk = this.ZU.lk();
        if (TextUtils.equals(jSONObjectLk.optString("type"), "onAnimation")) {
            String strOptString = jSONObjectLk.optString("nodeId");
            com.bytedance.adsdk.ugeno.LD.lk lkVar = this.JXs;
            com.bytedance.adsdk.ugeno.LD.lk lkVarLk = lkVar.LD(lkVar).lk(strOptString);
            new ebl(lkVarLk.QAg(), com.bytedance.adsdk.ugeno.core.Lxb.Lxb(jSONObjectLk.optJSONObject("animatorSet"), lkVarLk)).Lxb();
        } else {
            sLN sln = this.LD;
            if (sln != null) {
                nBu nbu = this.ZU;
                com.bytedance.adsdk.ugeno.LD.lk lkVar2 = this.JXs;
                sln.Lxb(nbu, lkVar2, lkVar2);
            }
        }
        this.lc.removeMessages(1001);
    }
}
