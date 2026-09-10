package com.bytedance.sdk.openadsdk.core.rq.tvp;

import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.bjy;
import com.bytedance.adsdk.ugeno.core.exu;
import com.bytedance.adsdk.ugeno.core.fs;
import com.bytedance.adsdk.ugeno.core.jtx;
import com.bytedance.adsdk.ugeno.core.rq;
import com.bytedance.adsdk.ugeno.mml.mo;
import com.bytedance.adsdk.ugeno.ud.lnr;
import com.bytedance.sdk.openadsdk.core.rq.wd.mml;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.vungle.ads.internal.protos.Sdk;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class qdl implements bjy, jtx {
    private lnr lnr;
    private Context qdl;
    private fs ud;

    public qdl(Context context) {
        this.qdl = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, mml mmlVar) {
        this.ud = new fs(this.qdl);
        qdl();
        this.ud.qdl((bjy) this);
        this.ud.qdl((jtx) this);
        if (jSONObject == null || jSONObject2 == null) {
            if (mmlVar != null) {
                mmlVar.qdl(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, "template or data is null");
                return;
            }
            return;
        }
        try {
            lnr<View> lnrVarQdl = this.ud.qdl(jSONObject, jSONObject2, jSONObject3);
            this.lnr = lnrVarQdl;
            if (lnrVarQdl != null) {
                mmlVar.qdl(lnrVarQdl);
            } else if (mmlVar != null) {
                mmlVar.qdl(3000, "ugen render fail");
            }
        } catch (NoClassDefFoundError unused) {
            if (mmlVar != null) {
                mmlVar.qdl(138, "ugen render yoga error");
            }
        } catch (UnsatisfiedLinkError unused2) {
            if (mmlVar != null) {
                mmlVar.qdl(139, "ugen render yoga error");
            }
        } catch (Throwable unused3) {
            if (mmlVar != null) {
                mmlVar.qdl(138, "ugen render error");
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.bjy
    public void qdl(exu exuVar, bjy.ud udVar, bjy.qdl qdlVar) {
    }

    @Override // com.bytedance.adsdk.ugeno.core.jtx
    public void qdl(lnr lnrVar, MotionEvent motionEvent) {
    }

    @Override // com.bytedance.adsdk.ugeno.core.bjy
    public void qdl(lnr lnrVar, String str, mo.qdl qdlVar) {
    }

    public void qdl(final JSONObject jSONObject, final JSONObject jSONObject2, final JSONObject jSONObject3, final mml mmlVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ud(jSONObject, jSONObject2, jSONObject3, mmlVar);
        } else {
            fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.rq.tvp.qdl.1
                @Override // java.lang.Runnable
                public void run() {
                    qdl.this.ud(jSONObject, jSONObject2, jSONObject3, mmlVar);
                }
            });
        }
    }

    private void qdl() {
        rq rqVar = new rq();
        rqVar.qdl(this.qdl);
        this.ud.qdl("page", rqVar);
    }
}
