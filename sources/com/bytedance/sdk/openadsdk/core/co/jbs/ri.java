package com.bytedance.sdk.openadsdk.core.co.jbs;

import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.aw;
import com.bytedance.adsdk.ugeno.core.co;
import com.bytedance.adsdk.ugeno.core.sf;
import com.bytedance.adsdk.ugeno.core.slm;
import com.bytedance.adsdk.ugeno.core.vr;
import com.bytedance.adsdk.ugeno.ka.di;
import com.bytedance.adsdk.ugeno.lr.ik;
import com.bytedance.sdk.openadsdk.core.co.xha.ka;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes2.dex */
public class ri implements slm, vr {
    private ik ik;
    private co lr;
    private Context ri;

    public ri(Context context) {
        this.ri = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, ka kaVar) {
        this.lr = new co(this.ri);
        ri();
        this.lr.ri((vr) this);
        this.lr.ri((slm) this);
        if (jSONObject == null || jSONObject2 == null) {
            if (kaVar != null) {
                kaVar.ri(133, "template or data is null");
                return;
            }
            return;
        }
        try {
            ik<View> ikVarRi = this.lr.ri(jSONObject, jSONObject2, jSONObject3);
            this.ik = ikVarRi;
            if (ikVarRi != null) {
                kaVar.ri(ikVarRi);
            } else if (kaVar != null) {
                kaVar.ri(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, "ugen render fail");
            }
        } catch (NoClassDefFoundError unused) {
            if (kaVar != null) {
                kaVar.ri(138, "ugen render yoga error");
            }
        } catch (UnsatisfiedLinkError unused2) {
            if (kaVar != null) {
                kaVar.ri(Opcodes.F2I, "ugen render yoga error");
            }
        } catch (Throwable unused3) {
            if (kaVar != null) {
                kaVar.ri(138, "ugen render error");
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.vr
    public void ri(aw awVar, vr.lr lrVar, vr.ri riVar) {
    }

    @Override // com.bytedance.adsdk.ugeno.core.slm
    public void ri(ik ikVar, MotionEvent motionEvent) {
    }

    @Override // com.bytedance.adsdk.ugeno.core.vr
    public void ri(ik ikVar, String str, di.ri riVar) {
    }

    public void ri(final JSONObject jSONObject, final JSONObject jSONObject2, final JSONObject jSONObject3, final ka kaVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            lr(jSONObject, jSONObject2, jSONObject3, kaVar);
        } else {
            dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.co.jbs.ri.1
                @Override // java.lang.Runnable
                public void run() {
                    ri.this.lr(jSONObject, jSONObject2, jSONObject3, kaVar);
                }
            });
        }
    }

    private void ri() {
        sf sfVar = new sf();
        sfVar.ri(this.ri);
        this.lr.ri("page", sfVar);
    }
}
