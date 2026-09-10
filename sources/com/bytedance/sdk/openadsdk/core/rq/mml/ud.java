package com.bytedance.sdk.openadsdk.core.rq.mml;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.exu;
import com.bytedance.adsdk.ugeno.core.jtx;
import com.bytedance.adsdk.ugeno.ud.lnr;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.fco;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.exc.qdl.qdl.mml;
import com.bytedance.sdk.openadsdk.exc.qdl.qdl.wd;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.smartdigimkt.q0.b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ud implements jtx, qdl.InterfaceC0124qdl {
    protected static int qdl = 8;
    private boolean aaj = true;
    private float bjy;
    private long exc;
    private View exu;
    private String fs;
    private long jl;
    private String jpc;
    private float jtx;
    private final Activity lnr;
    private final ljh mml;
    private String mo;
    private final com.bytedance.sdk.openadsdk.core.rq.jpc.qdl mzz;
    private float rdp;
    private com.bytedance.sdk.openadsdk.core.rq.wd.qdl rq;
    private final com.bytedance.sdk.openadsdk.core.rq.wd.ud to;
    private JSONObject tvp;
    private qdl ud;
    private String wd;
    private float yt;

    public ud(Activity activity, ljh ljhVar, com.bytedance.sdk.openadsdk.core.rq.jpc.qdl qdlVar, String str, com.bytedance.sdk.openadsdk.core.rq.wd.ud udVar) {
        this.lnr = activity;
        this.fs = str;
        this.mml = ljhVar;
        this.to = udVar;
        this.mzz = qdlVar;
    }

    private void ud() {
        int iYgv = this.mml.ygv();
        if (iYgv != 2 && iYgv != 3) {
            if (iYgv == 4) {
                wd.qdl(this.lnr, this.fs).lnr(this.mml);
                return;
            } else {
                if (iYgv != 5) {
                    return;
                }
                gy.ud(this.lnr, this.mml.nts());
                return;
            }
        }
        if (iYgv == 3) {
            String strOd = this.mml.od();
            if (!TextUtils.isEmpty(strOd) && strOd.contains("play.google.com/store")) {
                if (mml.qdl(this.lnr, strOd, strOd.substring(strOd.indexOf("?id=") + 4), this.fs, this.mml)) {
                    return;
                }
            }
        }
        Activity activity = this.lnr;
        ljh ljhVar = this.mml;
        int iQdl = gy.qdl(this.fs);
        String str = this.fs;
        fco.qdl(activity, ljhVar, iQdl, null, null, str, wd.qdl(this.lnr, str), true, 0);
    }

    public void qdl() {
        if (this.mml == null) {
            this.to.qdl(1, "material is null", "net");
            return;
        }
        if (this.mzz == null) {
            this.to.qdl(1, "material ugen template is null", "net");
            return;
        }
        this.ud = new qdl(this.lnr);
        this.jpc = this.mzz.lnr();
        this.mo = this.mzz.qdl();
        this.wd = this.mzz.ud();
        this.tvp = this.mml.rdz();
        this.to.qdl("endcard");
        com.bytedance.sdk.openadsdk.core.rq.qdl.ud.qdl().qdl("endcard", this.jpc, this.mo, this.wd, "", new com.bytedance.sdk.openadsdk.core.rq.qdl.ud.qdl() { // from class: com.bytedance.sdk.openadsdk.core.rq.mml.ud.1
            @Override // com.bytedance.sdk.openadsdk.core.rq.qdl.ud.qdl
            public void qdl(JSONObject jSONObject, String str) {
                ud udVar = ud.this;
                udVar.qdl(jSONObject, udVar.tvp);
                ud.this.to.ud(str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq.qdl.ud.qdl
            public void qdl(int i2, String str, String str2) {
                ud.this.to.qdl(i2, str, str2);
            }
        });
    }

    public void qdl(View view) {
        this.exu = view;
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.rq.wd.qdl qdlVar) {
        this.rq = qdlVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(JSONObject jSONObject, JSONObject jSONObject2) {
        this.ud.qdl((qdl.InterfaceC0124qdl) this);
        this.ud.qdl((jtx) this);
        this.to.qdl();
        this.ud.qdl(jSONObject, jSONObject2, new com.bytedance.sdk.openadsdk.core.rq.wd.mml() { // from class: com.bytedance.sdk.openadsdk.core.rq.mml.ud.2
            @Override // com.bytedance.sdk.openadsdk.core.rq.wd.mml
            public void qdl(int i2, String str) {
                if (ud.this.to != null) {
                    ud.this.to.qdl(i2, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq.wd.mml
            public void qdl(lnr<View> lnrVar) {
                if (ud.this.to != null) {
                    ud.this.to.qdl(lnrVar);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.mml.qdl.InterfaceC0124qdl
    public void qdl(exu exuVar) {
        String strOptString = exuVar.lnr().optString("type");
        strOptString.getClass();
        switch (strOptString) {
            case "privacy":
                if (this.lnr != null && !TextUtils.isEmpty(yt.mml().cx())) {
                    TTWebsiteActivity.qdl(this.lnr, this.mml, this.fs);
                    break;
                }
                break;
            case "close":
                com.bytedance.sdk.openadsdk.core.rq.wd.qdl qdlVar = this.rq;
                if (qdlVar != null) {
                    qdlVar.ud();
                    break;
                }
                break;
            case "creative":
                if (this.lnr != null && this.mml != null) {
                    ud();
                    ComponentCallbacks2 componentCallbacks2 = this.lnr;
                    if (componentCallbacks2 instanceof com.bytedance.sdk.openadsdk.core.exu.mml.ud) {
                        ((com.bytedance.sdk.openadsdk.core.exu.mml.ud) componentCallbacks2).car();
                    }
                    qdl(exuVar, this.mml);
                    break;
                }
                break;
        }
    }

    private void qdl(exu exuVar, ljh ljhVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("down_x", this.rdp);
            jSONObject.put("down_y", this.bjy);
            jSONObject.put("down_time", this.jl);
            jSONObject.put("up_x", this.jtx);
            jSONObject.put("up_y", this.yt);
            jSONObject.put("up_time", this.exc);
            View viewRq = exuVar.qdl().rq();
            int i2 = 1;
            if (viewRq != null) {
                JSONObject jSONObject2 = new JSONObject();
                int[] iArr = new int[2];
                float width = viewRq.getWidth();
                float height = viewRq.getHeight();
                viewRq.getLocationOnScreen(iArr);
                float f = iArr[0];
                float f2 = iArr[1];
                jSONObject2.put("width", width);
                jSONObject2.put("height", height);
                jSONObject2.put(TtmlNode.LEFT, f);
                jSONObject2.put("top", f2);
                jSONObject.put("rectInfo", jSONObject2);
            }
            View view = this.exu;
            if (view != null) {
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                jSONObject.put("button_x", iArr2[0]);
                jSONObject.put("button_y", iArr2[1]);
                jSONObject.put("button_width", this.exu.getWidth());
                jSONObject.put("button_height", this.exu.getHeight());
            }
            View viewFindViewById = this.lnr.findViewById(R.id.content);
            if (viewFindViewById != null) {
                int[] iArr3 = new int[2];
                viewFindViewById.getLocationOnScreen(iArr3);
                jSONObject.put("ad_x", iArr3[0]);
                jSONObject.put("ad_y", iArr3[1]);
                jSONObject.put("width", viewFindViewById.getWidth());
                jSONObject.put("height", viewFindViewById.getHeight());
            }
            jSONObject.put("click_area_type", exuVar.qdl().hzv());
            jSONObject.put("brick_id", exuVar.qdl().hkc());
            jSONObject.put(b.f37778c0, this.mo);
            jSONObject.put("click_scence", 2);
            if (!this.aaj) {
                i2 = 2;
            }
            jSONObject.put("user_behavior_type", i2);
            com.bytedance.sdk.openadsdk.core.rq.wd.qdl qdlVar = this.rq;
            if (qdlVar != null) {
                jSONObject.put("endcard_type", qdlVar.qdl());
            }
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, this.fs, "click", jSONObject);
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.jtx
    public void qdl(lnr lnrVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.jl = System.currentTimeMillis();
            this.rdp = motionEvent.getRawX();
            this.bjy = motionEvent.getRawY();
            this.aaj = true;
            return;
        }
        if (action != 1) {
            if (action != 2) {
                return;
            }
            if (Math.abs(motionEvent.getRawX() - this.rdp) >= qdl || Math.abs(motionEvent.getRawY() - this.bjy) >= qdl) {
                this.aaj = false;
                return;
            }
            return;
        }
        this.jtx = motionEvent.getRawX();
        this.yt = motionEvent.getRawY();
        if (Math.abs(this.jtx - this.rdp) >= qdl || Math.abs(this.yt - this.bjy) >= qdl) {
            this.aaj = false;
        }
        this.exc = System.currentTimeMillis();
    }
}
