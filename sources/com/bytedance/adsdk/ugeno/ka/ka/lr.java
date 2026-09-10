package com.bytedance.adsdk.ugeno.ka.ka;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends ik implements com.bytedance.adsdk.ugeno.ri.lr {
    private String sf;

    public lr(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.ri.lr
    public void lr() {
        com.bytedance.adsdk.ugeno.ka.sf sfVar;
        if ((TextUtils.equals(this.sf, CampaignEx.JSON_NATIVE_VIDEO_COMPLETE) || TextUtils.isEmpty(this.sf)) && (sfVar = this.ri) != null) {
            sfVar.ri(this.lr, this.di, this.ik.lr());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ka.ka.ik
    public boolean ri(Object... objArr) {
        com.bytedance.adsdk.ugeno.lr.ik ikVar;
        com.bytedance.adsdk.ugeno.lr.ik ikVarLr;
        com.bytedance.adsdk.ugeno.ri.ri riVarCo;
        Map<String, String> map = this.fi;
        if (map != null && map.size() > 0) {
            String str = this.fi.get("name");
            this.sf = this.fi.get("state");
            if (!TextUtils.isEmpty(str) && (ikVarLr = (ikVar = this.lr).lr(ikVar)) != null && (riVarCo = ikVarLr.mj(str).co(str)) != null) {
                riVarCo.ri(this);
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.ri.lr
    public void ri() {
        com.bytedance.adsdk.ugeno.ka.sf sfVar;
        if ((TextUtils.equals(this.sf, "start") || TextUtils.isEmpty(this.sf)) && (sfVar = this.ri) != null) {
            sfVar.ri(this.lr, this.di, this.ik.lr());
        }
    }
}
