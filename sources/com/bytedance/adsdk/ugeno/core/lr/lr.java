package com.bytedance.adsdk.ugeno.core.lr;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.core.aw;
import com.bytedance.adsdk.ugeno.core.qt;
import com.bytedance.adsdk.ugeno.core.vr;
import com.bytedance.adsdk.ugeno.xha.jbs;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lr implements jbs.ri {
    private Handler di = new jbs(Looper.getMainLooper(), this);
    private com.bytedance.adsdk.ugeno.lr.ik fi;
    private Context ik;
    private aw ka;
    private vr lr;
    private int ri;

    public lr(Context context, aw awVar, com.bytedance.adsdk.ugeno.lr.ik ikVar) {
        this.ik = context;
        this.ka = awVar;
        this.fi = ikVar;
    }

    public void ri(vr vrVar) {
        this.lr = vrVar;
    }

    public void ri() {
        aw awVar = this.ka;
        if (awVar == null) {
            return;
        }
        try {
            int i = Integer.parseInt(com.bytedance.adsdk.ugeno.ik.lr.ri(awVar.ik().optString("delay"), this.fi.co()));
            this.ri = i;
            this.di.sendEmptyMessageDelayed(1001, i);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.xha.jbs.ri
    public void ri(Message message) {
        if (message.what != 1001) {
            return;
        }
        JSONObject jSONObjectIk = this.ka.ik();
        if (TextUtils.equals(jSONObjectIk.optString("type"), "onAnimation")) {
            String strOptString = jSONObjectIk.optString("nodeId");
            com.bytedance.adsdk.ugeno.lr.ik ikVar = this.fi;
            com.bytedance.adsdk.ugeno.lr.ik ikVarFi = ikVar.lr(ikVar).fi(strOptString);
            new qt(ikVarFi.sf(), com.bytedance.adsdk.ugeno.core.ri.ri(jSONObjectIk.optJSONObject("animatorSet"), ikVarFi)).ri();
        } else {
            vr vrVar = this.lr;
            if (vrVar != null) {
                aw awVar = this.ka;
                com.bytedance.adsdk.ugeno.lr.ik ikVar2 = this.fi;
                vrVar.ri(awVar, ikVar2, ikVar2);
            }
        }
        this.di.removeMessages(1001);
    }
}
