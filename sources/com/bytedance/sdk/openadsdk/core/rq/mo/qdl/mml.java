package com.bytedance.sdk.openadsdk.core.rq.mo.qdl;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.model.ekw;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.core.rq.mo.wd;
import com.bytedance.sdk.openadsdk.core.tvp.bch;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mml extends wd {
    private static Boolean xmv;
    private final ud uw;

    public mml(Context context, ljh ljhVar, boolean z2, com.bytedance.sdk.openadsdk.core.rq.mo.qdl qdlVar, ViewGroup viewGroup, float f, float f2, boolean z3, String str) {
        super(context, ljhVar, z2, qdlVar, viewGroup);
        this.uw = ud.qdl.qdl(ljhVar, qdlVar);
        this.oth = str;
        qdl(f, f2, z3, ljhVar, str);
    }

    private boolean exu() {
        return this.mzz != null && rdp() && vu.lnr(this.mzz);
    }

    private void qdl(float f, float f2, boolean z2, ljh ljhVar, String str) {
        JSONObject jSONObjectQdl = com.bytedance.sdk.openadsdk.core.tvp.qdl.ud.qdl(f, f2, z2, ljhVar, str);
        this.bch = jSONObjectQdl;
        if (jSONObjectQdl == null) {
            return;
        }
        try {
            JSONObject jSONObjectOptJSONObject = jSONObjectQdl.optJSONObject("xSize");
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.put("imageModeRatio", fs());
            }
            JSONObject jSONObjectOptJSONObject2 = this.bch.optJSONObject("xAdInfo");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.put("isVideoImageMode", ljh.mzz(this.mzz));
                jSONObjectOptJSONObject2.put("feed_draw_purePlayable", exu());
                jSONObjectOptJSONObject2.put("isFeedDraw", rdp());
            }
            ud udVar = this.uw;
            if (udVar != null) {
                udVar.qdl(this.bch);
            }
        } catch (Exception unused) {
        }
    }

    private boolean rdp() {
        ljh ljhVar = this.mzz;
        if (ljhVar == null) {
            return false;
        }
        int iOk = ljhVar.ok();
        boolean z2 = iOk == 7 || iOk == 8;
        int iTaz = this.mzz.taz();
        return z2 && (iTaz == 43 || iTaz == 44);
    }

    public float fs() {
        ljh ljhVar = this.mzz;
        if (ljhVar == null) {
            return 1.0f;
        }
        int iVxg = ljhVar.vxg();
        if (iVxg == 3) {
            return 1.91f;
        }
        if (iVxg == 5) {
            return 1.78f;
        }
        if (iVxg == 15 || iVxg == 173) {
            return 0.5625f;
        }
        if (iVxg != 33 && iVxg != 50) {
            if (iVxg == 1010) {
                return 1.2f;
            }
            if (iVxg == 1011) {
                return 6.4f;
            }
            if (iVxg == 1012) {
                return 3.2f;
            }
        }
        return 1.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.mo.wd, com.bytedance.sdk.openadsdk.core.rq.mo.mml
    public com.bytedance.adsdk.ugeno.ud.lnr jpc() {
        com.bytedance.adsdk.ugeno.ud.lnr<View> lnrVar = this.lnr;
        if (lnrVar == null) {
            return null;
        }
        return lnrVar.wd("VideoV3");
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.mo.mml, com.bytedance.sdk.component.adexpress.ud.mml
    public int lnr() {
        return 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.mo.wd, com.bytedance.sdk.openadsdk.core.rq.mo.mml
    public JSONObject qdl() {
        ud udVar = this.uw;
        if (udVar != null) {
            try {
                return new JSONObject(udVar.qdl());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.mo.wd
    public JSONObject qdl(ekw ekwVar) {
        ud udVar = this.uw;
        if (udVar != null) {
            return udVar.ud();
        }
        return null;
    }

    public static boolean qdl(String str) {
        if (xmv == null) {
            xmv = Boolean.valueOf(com.bytedance.sdk.openadsdk.jyq.qdl.qdl("express_backup_type", 0) == 1);
        }
        return xmv.booleanValue() && (TextUtils.equals(str, "fullscreen_interstitial_ad") || TextUtils.equals(str, "rewarded_video") || bch.ud(str));
    }
}
