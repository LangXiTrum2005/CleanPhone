package com.bytedance.sdk.openadsdk.core.co.ka;

import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.aw;
import com.bytedance.adsdk.ugeno.core.co;
import com.bytedance.adsdk.ugeno.core.slm;
import com.bytedance.adsdk.ugeno.core.vr;
import com.bytedance.adsdk.ugeno.ka.di;
import com.bytedance.adsdk.ugeno.lr.ik;
import com.bytedance.sdk.openadsdk.core.co.xha.ka;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.ironsource.L6;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri implements slm, vr {
    private InterfaceC0243ri ik;
    private slm ka;
    private ik<View> lr;
    private final Context ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.ka.ri$ri, reason: collision with other inner class name */
    public interface InterfaceC0243ri {
        void ri(aw awVar);
    }

    public ri(Context context) {
        this.ri = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr(JSONObject jSONObject, JSONObject jSONObject2, ka kaVar) {
        try {
            co coVar = new co(this.ri);
            ik<View> ikVarRi = coVar.ri(jSONObject);
            this.lr = ikVarRi;
            if (ikVarRi == null) {
                if (kaVar != null) {
                    kaVar.ri(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, "ugen render fail");
                    return;
                }
                return;
            }
            View viewSf = ikVarRi.sf();
            if (viewSf != null) {
                viewSf.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.co.ka.ri.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                    }
                });
            }
            coVar.ri((vr) this);
            coVar.ri((slm) this);
            if (jSONObject2 != null) {
                try {
                    jSONObject2.put("language", com.bytedance.sdk.openadsdk.core.aw.lr());
                    jSONObject2.put(L6.F, X3.d);
                } catch (JSONException unused) {
                }
            }
            coVar.lr(jSONObject2);
            if (kaVar != null) {
                kaVar.ri(this.lr);
            }
        } catch (Exception e) {
            if (kaVar != null) {
                kaVar.ri(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, "ugen render fail exception is" + e.getMessage());
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.vr
    public void ri(ik ikVar, String str, di.ri riVar) {
    }

    public void ri(final JSONObject jSONObject, final JSONObject jSONObject2, final ka kaVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            lr(jSONObject, jSONObject2, kaVar);
        } else {
            dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.co.ka.ri.1
                @Override // java.lang.Runnable
                public void run() {
                    ri.this.lr(jSONObject, jSONObject2, kaVar);
                }
            });
        }
    }

    public void ri(InterfaceC0243ri interfaceC0243ri) {
        this.ik = interfaceC0243ri;
    }

    public void ri(slm slmVar) {
        this.ka = slmVar;
    }

    @Override // com.bytedance.adsdk.ugeno.core.vr
    public void ri(aw awVar, vr.lr lrVar, vr.ri riVar) {
        InterfaceC0243ri interfaceC0243ri;
        if (awVar == null) {
            return;
        }
        if ((awVar.lr() == 1 || awVar.lr() == 4) && (interfaceC0243ri = this.ik) != null) {
            interfaceC0243ri.ri(awVar);
        }
        if (lrVar == null || awVar.ka() == null) {
            return;
        }
        lrVar.ri(awVar.ka());
    }

    @Override // com.bytedance.adsdk.ugeno.core.slm
    public void ri(ik ikVar, MotionEvent motionEvent) {
        slm slmVar = this.ka;
        if (slmVar != null) {
            slmVar.ri(ikVar, motionEvent);
        }
    }
}
