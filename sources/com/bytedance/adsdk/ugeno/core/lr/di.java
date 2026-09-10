package com.bytedance.adsdk.ugeno.core.lr;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.adsdk.ugeno.core.aw;
import com.bytedance.adsdk.ugeno.core.vr;
import com.bytedance.adsdk.ugeno.xha.jbs;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class di implements jbs.ri {
    private com.bytedance.adsdk.ugeno.lr.ik di;
    private aw fi;
    private vr ik;
    private Context ka;
    private int lr;
    private boolean ri;
    private Handler xha = new jbs(Looper.getMainLooper(), this);

    public di(Context context, aw awVar, com.bytedance.adsdk.ugeno.lr.ik ikVar) {
        this.ka = context;
        this.fi = awVar;
        this.di = ikVar;
    }

    public void ri(vr vrVar) {
        this.ik = vrVar;
    }

    public void ri() {
        aw awVar = this.fi;
        if (awVar == null) {
            return;
        }
        JSONObject jSONObjectIk = awVar.ik();
        try {
            this.lr = Integer.parseInt(com.bytedance.adsdk.ugeno.ik.lr.ri(jSONObjectIk.optString("interval", "8000"), this.di.co()));
            this.ri = jSONObjectIk.optBoolean("repeat");
            this.xha.sendEmptyMessageDelayed(1001, this.lr);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.xha.jbs.ri
    public void ri(Message message) {
        if (message.what != 1001) {
            return;
        }
        vr vrVar = this.ik;
        if (vrVar != null) {
            aw awVar = this.fi;
            com.bytedance.adsdk.ugeno.lr.ik ikVar = this.di;
            vrVar.ri(awVar, ikVar, ikVar);
        }
        if (this.ri) {
            this.xha.sendEmptyMessageDelayed(1001, this.lr);
        } else {
            this.xha.removeMessages(1001);
        }
    }
}
