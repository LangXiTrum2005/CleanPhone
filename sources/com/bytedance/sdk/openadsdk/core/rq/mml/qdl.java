package com.bytedance.sdk.openadsdk.core.rq.mml;

import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.bjy;
import com.bytedance.adsdk.ugeno.core.exu;
import com.bytedance.adsdk.ugeno.core.fs;
import com.bytedance.adsdk.ugeno.core.jtx;
import com.bytedance.adsdk.ugeno.mml.mo;
import com.bytedance.adsdk.ugeno.ud.lnr;
import com.bytedance.sdk.openadsdk.core.rq.wd.mml;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.p004ironsource.d9;
import com.p004ironsource.ne;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class qdl implements bjy, jtx {
    private InterfaceC0124qdl lnr;
    private jtx mml;
    private final Context qdl;
    private lnr<View> ud;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.rq.mml.qdl$qdl, reason: collision with other inner class name */
    public interface InterfaceC0124qdl {
        void qdl(exu exuVar);
    }

    public qdl(Context context) {
        this.qdl = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(JSONObject jSONObject, JSONObject jSONObject2, mml mmlVar) {
        try {
            fs fsVar = new fs(this.qdl);
            lnr<View> lnrVarQdl = fsVar.qdl(jSONObject);
            this.ud = lnrVarQdl;
            if (lnrVarQdl == null) {
                if (mmlVar != null) {
                    mmlVar.qdl(3000, "ugen render fail");
                    return;
                }
                return;
            }
            View viewRq = lnrVarQdl.rq();
            if (viewRq != null) {
                viewRq.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.rq.mml.qdl.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                    }
                });
            }
            fsVar.qdl((bjy) this);
            fsVar.qdl((jtx) this);
            if (jSONObject2 != null) {
                try {
                    jSONObject2.put("language", com.bytedance.sdk.openadsdk.core.fs.ud());
                    jSONObject2.put(ne.f26256E, d9.d);
                } catch (JSONException unused) {
                }
            }
            fsVar.ud(jSONObject2);
            if (mmlVar != null) {
                mmlVar.qdl(this.ud);
            }
        } catch (Exception e2) {
            if (mmlVar != null) {
                mmlVar.qdl(3000, "ugen render fail exception is" + e2.getMessage());
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.bjy
    public void qdl(lnr lnrVar, String str, mo.qdl qdlVar) {
    }

    public void qdl(final JSONObject jSONObject, final JSONObject jSONObject2, final mml mmlVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ud(jSONObject, jSONObject2, mmlVar);
        } else {
            fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.rq.mml.qdl.1
                @Override // java.lang.Runnable
                public void run() {
                    qdl.this.ud(jSONObject, jSONObject2, mmlVar);
                }
            });
        }
    }

    public void qdl(InterfaceC0124qdl interfaceC0124qdl) {
        this.lnr = interfaceC0124qdl;
    }

    public void qdl(jtx jtxVar) {
        this.mml = jtxVar;
    }

    @Override // com.bytedance.adsdk.ugeno.core.bjy
    public void qdl(exu exuVar, bjy.ud udVar, bjy.qdl qdlVar) {
        InterfaceC0124qdl interfaceC0124qdl;
        if (exuVar == null) {
            return;
        }
        if ((exuVar.ud() == 1 || exuVar.ud() == 4) && (interfaceC0124qdl = this.lnr) != null) {
            interfaceC0124qdl.qdl(exuVar);
        }
        if (udVar == null || exuVar.mml() == null) {
            return;
        }
        udVar.qdl(exuVar.mml());
    }

    @Override // com.bytedance.adsdk.ugeno.core.jtx
    public void qdl(lnr lnrVar, MotionEvent motionEvent) {
        jtx jtxVar = this.mml;
        if (jtxVar != null) {
            jtxVar.qdl(lnrVar, motionEvent);
        }
    }
}
