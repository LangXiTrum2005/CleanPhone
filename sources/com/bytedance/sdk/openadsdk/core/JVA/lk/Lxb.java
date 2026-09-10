package com.bytedance.sdk.openadsdk.core.JVA.lk;

import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.bytedance.adsdk.ugeno.LD.lk;
import com.bytedance.adsdk.ugeno.core.NXR;
import com.bytedance.adsdk.ugeno.core.QAg;
import com.bytedance.adsdk.ugeno.core.nBu;
import com.bytedance.adsdk.ugeno.core.sLN;
import com.bytedance.sdk.openadsdk.core.JVA.JXs.ZU;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.umeng.analytics.pro.bc;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb implements NXR, sLN {
    private lk<View> LD;
    private final Context Lxb;
    private NXR ZU;
    private InterfaceC0092Lxb lk;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.JVA.lk.Lxb$Lxb, reason: collision with other inner class name */
    public interface InterfaceC0092Lxb {
        void Lxb(nBu nbu);
    }

    public Lxb(Context context) {
        this.Lxb = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD(JSONObject jSONObject, JSONObject jSONObject2, ZU zu) {
        try {
            QAg qAg = new QAg(this.Lxb);
            lk<View> lkVarLxb = qAg.Lxb(jSONObject);
            this.LD = lkVarLxb;
            if (lkVarLxb == null) {
                if (zu != null) {
                    zu.Lxb(PathInterpolatorCompat.MAX_NUM_POINTS, "ugen render fail");
                    return;
                }
                return;
            }
            View viewQAg = lkVarLxb.QAg();
            if (viewQAg != null) {
                viewQAg.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.JVA.lk.Lxb.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                    }
                });
            }
            qAg.Lxb((sLN) this);
            qAg.Lxb((NXR) this);
            if (jSONObject2 != null) {
                try {
                    jSONObject2.put(bc.N, com.bytedance.sdk.openadsdk.core.sLN.LD());
                    jSONObject2.put(bc.x, AnalyticsConstants.SDK_TYPE);
                } catch (JSONException unused) {
                }
            }
            qAg.LD(jSONObject2);
            if (zu != null) {
                zu.Lxb(this.LD);
            }
        } catch (Exception e) {
            if (zu != null) {
                zu.Lxb(PathInterpolatorCompat.MAX_NUM_POINTS, "ugen render fail exception is" + e.getMessage());
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.sLN
    public void Lxb(lk lkVar, String str, com.bytedance.adsdk.ugeno.ZU.LD.Lxb lxb) {
    }

    public void Lxb(final JSONObject jSONObject, final JSONObject jSONObject2, final ZU zu) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            LD(jSONObject, jSONObject2, zu);
        } else {
            hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.JVA.lk.Lxb.1
                @Override // java.lang.Runnable
                public void run() {
                    Lxb.this.LD(jSONObject, jSONObject2, zu);
                }
            });
        }
    }

    public void Lxb(InterfaceC0092Lxb interfaceC0092Lxb) {
        this.lk = interfaceC0092Lxb;
    }

    public void Lxb(NXR nxr) {
        this.ZU = nxr;
    }

    @Override // com.bytedance.adsdk.ugeno.core.sLN
    public void Lxb(nBu nbu, sLN.LD ld, sLN.Lxb lxb) {
        InterfaceC0092Lxb interfaceC0092Lxb;
        if (nbu == null) {
            return;
        }
        if ((nbu.LD() == 1 || nbu.LD() == 4) && (interfaceC0092Lxb = this.lk) != null) {
            interfaceC0092Lxb.Lxb(nbu);
        }
        if (ld == null || nbu.ZU() == null) {
            return;
        }
        ld.Lxb(nbu.ZU());
    }

    @Override // com.bytedance.adsdk.ugeno.core.NXR
    public void Lxb(lk lkVar, MotionEvent motionEvent) {
        NXR nxr = this.ZU;
        if (nxr != null) {
            nxr.Lxb(lkVar, motionEvent);
        }
    }
}
