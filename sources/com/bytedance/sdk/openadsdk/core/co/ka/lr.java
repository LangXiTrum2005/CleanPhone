package com.bytedance.sdk.openadsdk.core.co.ka;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.aw;
import com.bytedance.adsdk.ugeno.core.slm;
import com.bytedance.adsdk.ugeno.lr.ik;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.ihz.ri.ri.ka;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lr implements slm, ri.InterfaceC0243ri {
    protected static int ri = 8;
    private boolean ac = true;
    private View aw;
    private float bgr;
    private float bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private String f18110co;
    private String di;
    private final com.bytedance.sdk.openadsdk.core.co.mj.ri fi;
    private final Activity ik;
    private JSONObject jbs;
    private final wjv ka;
    private ri lr;
    private String mj;
    private long nr;
    private final com.bytedance.sdk.openadsdk.core.co.xha.lr qt;
    private com.bytedance.sdk.openadsdk.core.co.xha.ri sf;
    private float slm;
    private long tan;
    private float vr;
    private String xha;

    public lr(Activity activity, wjv wjvVar, com.bytedance.sdk.openadsdk.core.co.mj.ri riVar, String str, com.bytedance.sdk.openadsdk.core.co.xha.lr lrVar) {
        this.ik = activity;
        this.f18110co = str;
        this.ka = wjvVar;
        this.qt = lrVar;
        this.fi = riVar;
    }

    private void lr() {
        int iAdz = this.ka.adz();
        if (iAdz != 2 && iAdz != 3) {
            if (iAdz == 4) {
                ka.ri(this.ik, this.f18110co).ri(this.ka);
                return;
            } else {
                if (iAdz != 5) {
                    return;
                }
                ig.lr(this.ik, this.ka.eqw());
                return;
            }
        }
        if (iAdz == 3) {
            String strSmj = this.ka.smj();
            if (!TextUtils.isEmpty(strSmj) && strSmj.contains("play.google.com/store")) {
                if (com.bytedance.sdk.openadsdk.ihz.ri.ri.lr.ri(this.ik, strSmj, strSmj.substring(strSmj.indexOf("?id=") + 4), this.f18110co, this.ka)) {
                    return;
                }
            }
        }
        Activity activity = this.ik;
        wjv wjvVar = this.ka;
        int iRi = ig.ri(this.f18110co);
        String str = this.f18110co;
        com.bytedance.sdk.openadsdk.core.ig.ri(activity, wjvVar, iRi, null, null, str, ka.ri(this.ik, str), true, 0);
    }

    public void ri() {
        if (this.ka == null) {
            this.qt.ri(1, "material is null", "net");
            return;
        }
        if (this.fi == null) {
            this.qt.ri(1, "material ugen template is null", "net");
            return;
        }
        this.lr = new ri(this.ik);
        this.mj = this.fi.ik();
        this.di = this.fi.ri();
        this.xha = this.fi.lr();
        this.jbs = this.ka.aw(true);
        this.qt.ri(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
        com.bytedance.sdk.openadsdk.core.co.ri.lr.ri().ri(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, this.mj, this.di, this.xha, "", new com.bytedance.sdk.openadsdk.core.co.ri.lr.ri() { // from class: com.bytedance.sdk.openadsdk.core.co.ka.lr.1
            @Override // com.bytedance.sdk.openadsdk.core.co.ri.lr.ri
            public void ri(JSONObject jSONObject, String str) {
                lr lrVar = lr.this;
                lrVar.ri(jSONObject, lrVar.jbs);
                lr.this.qt.lr(str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.co.ri.lr.ri
            public void ri(int i, String str, String str2) {
                lr.this.qt.ri(i, str, str2);
            }
        });
    }

    public void ri(View view) {
        this.aw = view;
    }

    public void ri(com.bytedance.sdk.openadsdk.core.co.xha.ri riVar) {
        this.sf = riVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(JSONObject jSONObject, JSONObject jSONObject2) {
        this.lr.ri((ri.InterfaceC0243ri) this);
        this.lr.ri((slm) this);
        this.qt.ri();
        this.lr.ri(jSONObject, jSONObject2, new com.bytedance.sdk.openadsdk.core.co.xha.ka() { // from class: com.bytedance.sdk.openadsdk.core.co.ka.lr.2
            @Override // com.bytedance.sdk.openadsdk.core.co.xha.ka
            public void ri(int i, String str) {
                if (lr.this.qt != null) {
                    lr.this.qt.ri(i, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.co.xha.ka
            public void ri(ik<View> ikVar) {
                if (lr.this.qt != null) {
                    lr.this.qt.ri(ikVar);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.co.ka.ri.InterfaceC0243ri
    public void ri(aw awVar) {
        String strOptString = awVar.ik().optString("type");
        strOptString.getClass();
        switch (strOptString) {
            case "privacy":
                if (this.ik != null && !TextUtils.isEmpty(nr.ka().feb())) {
                    TTWebsiteActivity.ri(this.ik, this.ka, this.f18110co);
                    break;
                }
                break;
            case "close":
                com.bytedance.sdk.openadsdk.core.co.xha.ri riVar = this.sf;
                if (riVar != null) {
                    riVar.lr();
                    break;
                }
                break;
            case "creative":
                if (this.ik != null && this.ka != null) {
                    lr();
                    ComponentCallbacks2 componentCallbacks2 = this.ik;
                    if (componentCallbacks2 instanceof com.bytedance.sdk.openadsdk.core.bgr.ka.lr) {
                        ((com.bytedance.sdk.openadsdk.core.bgr.ka.lr) componentCallbacks2).gcp();
                    }
                    ri(awVar, this.ka);
                    break;
                }
                break;
        }
    }

    private void ri(aw awVar, wjv wjvVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("down_x", this.bgr);
            jSONObject.put("down_y", this.vr);
            jSONObject.put("down_time", this.nr);
            jSONObject.put("up_x", this.slm);
            jSONObject.put("up_y", this.bu);
            jSONObject.put("up_time", this.tan);
            View viewSf = awVar.ri().sf();
            int i = 1;
            if (viewSf != null) {
                JSONObject jSONObject2 = new JSONObject();
                int[] iArr = new int[2];
                float width = viewSf.getWidth();
                float height = viewSf.getHeight();
                viewSf.getLocationOnScreen(iArr);
                float f = iArr[0];
                float f2 = iArr[1];
                jSONObject2.put("width", width);
                jSONObject2.put("height", height);
                jSONObject2.put(TtmlNode.LEFT, f);
                jSONObject2.put("top", f2);
                jSONObject.put("rectInfo", jSONObject2);
            }
            View view = this.aw;
            if (view != null) {
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                jSONObject.put("button_x", iArr2[0]);
                jSONObject.put("button_y", iArr2[1]);
                jSONObject.put("button_width", this.aw.getWidth());
                jSONObject.put("button_height", this.aw.getHeight());
            }
            View viewFindViewById = this.ik.findViewById(R.id.content);
            if (viewFindViewById != null) {
                int[] iArr3 = new int[2];
                viewFindViewById.getLocationOnScreen(iArr3);
                jSONObject.put("ad_x", iArr3[0]);
                jSONObject.put("ad_y", iArr3[1]);
                jSONObject.put("width", viewFindViewById.getWidth());
                jSONObject.put("height", viewFindViewById.getHeight());
            }
            jSONObject.put("click_area_type", awVar.ri().dzy());
            jSONObject.put("brick_id", awVar.ri().xd());
            jSONObject.put("endcard_id", this.di);
            jSONObject.put("click_scence", 2);
            if (!this.ac) {
                i = 2;
            }
            jSONObject.put("user_behavior_type", i);
            com.bytedance.sdk.openadsdk.core.co.xha.ri riVar = this.sf;
            if (riVar != null) {
                jSONObject.put("endcard_type", riVar.ri());
            }
            com.bytedance.sdk.openadsdk.ka.ik.ri(wjvVar, this.f18110co, "click", jSONObject);
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.slm
    public void ri(ik ikVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.nr = System.currentTimeMillis();
            this.bgr = motionEvent.getRawX();
            this.vr = motionEvent.getRawY();
            this.ac = true;
            return;
        }
        if (action != 1) {
            if (action != 2) {
                return;
            }
            if (Math.abs(motionEvent.getRawX() - this.bgr) >= ri || Math.abs(motionEvent.getRawY() - this.vr) >= ri) {
                this.ac = false;
                return;
            }
            return;
        }
        this.slm = motionEvent.getRawX();
        this.bu = motionEvent.getRawY();
        if (Math.abs(this.slm - this.bgr) >= ri || Math.abs(this.bu - this.vr) >= ri) {
            this.ac = false;
        }
        this.tan = System.currentTimeMillis();
    }
}
