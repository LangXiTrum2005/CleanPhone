package com.bytedance.adsdk.ugeno;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.core.co;
import com.bytedance.adsdk.ugeno.ka.di;
import com.bytedance.adsdk.ugeno.ka.jbs;
import com.bytedance.adsdk.ugeno.xha.mj;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import org.jacoco.core.data.ExecutionDataWriter;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends com.bytedance.adsdk.ugeno.lr.ri<com.bytedance.adsdk.ugeno.di.lr> implements com.bytedance.adsdk.ugeno.di.ik {
    private float adz;
    private int akr;
    private float amj;
    private float bfa;
    private int bzf;
    private boolean de;
    private JSONArray eqw;
    private String eu;
    private float evm;
    private float ezp;
    private int fb;
    private float fn;
    private boolean jg;
    private float jm;
    private int klz;
    private float rbz;
    private boolean skk;
    private String smj;
    private boolean sz;
    private boolean tn;
    private String tpb;
    private int tq;
    private boolean tyc;
    private int xh;
    private float xlq;
    private boolean zv;
    private float zxp;

    public lr(Context context) {
        super(context);
        this.akr = 0;
        this.de = true;
        this.zv = true;
        this.xlq = 500.0f;
        this.zxp = 2000.0f;
        this.eu = "slide";
        this.tpb = "dot";
        this.jm = 8.0f;
        this.adz = 8.0f;
        this.ezp = 50.0f;
        this.evm = 90.0f;
        this.sz = false;
        this.fb = Color.parseColor("#666666");
        this.bzf = Color.parseColor("#ffffff");
        this.smj = "row";
        this.rbz = 1.0f;
        this.amj = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.bfa = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.fn = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.xh = 0;
        this.tq = 0;
        this.skk = true;
        this.jg = false;
        this.tn = true;
        float fRi = mj.ri(this.lr, 8.0f);
        this.jm = fRi;
        this.adz = fRi;
    }

    private void mj(int i) {
        jbs jbsVar = this.nbc;
        if (jbsVar == null) {
            return;
        }
        jbsVar.ri("SwiperView://slide", Integer.valueOf(this.klz), Integer.valueOf(i), Integer.valueOf(!this.tyc ? 1 : 0));
    }

    private int qh() {
        if (this.xh == 1) {
            List<com.bytedance.adsdk.ugeno.lr.ik<View>> list = ((com.bytedance.adsdk.ugeno.lr.ri) this).ri;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
        JSONArray jSONArray = this.eqw;
        if (jSONArray != null) {
            return jSONArray.length();
        }
        return 0;
    }

    private void rzk() {
        for (int i = 0; i < ((com.bytedance.adsdk.ugeno.lr.ri) this).ri.size(); i++) {
            com.bytedance.adsdk.ugeno.lr.ik<View> ikVar = ((com.bytedance.adsdk.ugeno.lr.ri) this).ri.get(i);
            if (ikVar != null) {
                co coVar = new co(this.lr);
                ri(coVar);
                coVar.ri(this.vt);
                ((com.bytedance.adsdk.ugeno.di.lr) this.fi).ri(coVar.ri(ikVar.ory(), this.ka, (JSONObject) null));
            }
        }
    }

    private void xha(int i) {
        if (this.nbc == null) {
            return;
        }
        if (this.klz == 0 && i == qh() - 1) {
            this.nbc.ri("SwiperView://reloop", 1);
        }
        if (this.klz == qh() - 1 && i == 0) {
            this.nbc.ri("SwiperView://reloop", 0);
        }
    }

    private void xm() {
        List<com.bytedance.adsdk.ugeno.lr.ik<View>> list = ((com.bytedance.adsdk.ugeno.lr.ri) this).ri;
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.adsdk.ugeno.lr.ik<View> ikVar = ((com.bytedance.adsdk.ugeno.lr.ri) this).ri.get(0);
        if (this.eqw == null) {
            return;
        }
        for (int i = 0; i < this.eqw.length(); i++) {
            co coVar = new co(this.lr);
            ri(coVar);
            coVar.ri(this.vt);
            try {
                JSONObject jSONObjectOptJSONObject = this.eqw.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    if (jSONObjectOptJSONObject.has("$chunk")) {
                        this.ka.put("$item", jSONObjectOptJSONObject.optJSONArray("$chunk"));
                    } else {
                        this.ka.put("$item", jSONObjectOptJSONObject);
                    }
                    ((com.bytedance.adsdk.ugeno.di.lr) this.fi).ri(coVar.ri(ikVar.ory(), this.ka, (JSONObject) null));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void ik() {
        ((com.bytedance.adsdk.ugeno.di.lr) this.fi).aw(((com.bytedance.adsdk.ugeno.di.lr) this.fi).getCurrentItem() + 1);
    }

    public void ka() {
        ((com.bytedance.adsdk.ugeno.di.lr) this.fi).aw(((com.bytedance.adsdk.ugeno.di.lr) this.fi).getCurrentItem() - 1);
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ri, com.bytedance.adsdk.ugeno.lr.ik
    public void lr() {
        super.lr();
        ((com.bytedance.adsdk.ugeno.di.lr) this.fi).ik((int) this.xlq).fi(this.jg).ri(this.tpb).ri(this.jm).lr(this.adz).ik(this.ezp).ka(this.evm).lr(this.smj).ri(this.akr).lr().ka(this.de).ri(this.zv).lr((int) this.xlq).ka((int) this.zxp).lr(this.skk).ik(this.sz).di(this.fb).fi(this.bzf).mj((int) this.bfa).jbs((int) this.fn).xha((int) this.amj).fi(this.rbz).ik(this.eu).aw(this.tq);
        ((com.bytedance.adsdk.ugeno.di.lr) this.fi).setOnPageChangeListener(this);
        if (this.xh == 1) {
            rzk();
        } else {
            xm();
        }
        ((com.bytedance.adsdk.ugeno.di.lr) this.fi).ik();
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    public View ri() {
        com.bytedance.adsdk.ugeno.di.lr lrVar = new com.bytedance.adsdk.ugeno.di.lr(this.lr);
        this.fi = lrVar;
        lrVar.ri((ka) this);
        return this.fi;
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ri
    public void ri(com.bytedance.adsdk.ugeno.lr.ik ikVar) {
        if (ikVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.lr.ri) this).ri.add(ikVar);
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ri
    public void ri(com.bytedance.adsdk.ugeno.lr.ik ikVar, ViewGroup.LayoutParams layoutParams) {
        if (ikVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.lr.ri) this).ri.add(ikVar);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.adsdk.ugeno.lr.ik
    public void ri(String str, String str2) {
        super.ri(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1593646704:
                if (str.equals("startIndex")) {
                    b = 0;
                }
                break;
            case -1575751020:
                if (str.equals("indicatorColor")) {
                    b = 1;
                }
                break;
            case -1560813342:
                if (str.equals("indicatorStyle")) {
                    b = 2;
                }
                break;
            case -1557466889:
                if (str.equals("indicatorWidth")) {
                    b = 3;
                }
                break;
            case -1469828074:
                if (str.equals("indicatorHeight")) {
                    b = 4;
                }
                break;
            case -1453344127:
                if (str.equals("nextMargin")) {
                    b = 5;
                }
                break;
            case -1367379379:
                if (str.equals("driveMode")) {
                    b = 6;
                }
                break;
            case -1306084975:
                if (str.equals("effect")) {
                    b = 7;
                }
                break;
            case -962590849:
                if (str.equals("direction")) {
                    b = 8;
                }
                break;
            case -855614293:
                if (str.equals("disableOnInteraction")) {
                    b = 9;
                }
                break;
            case -711999985:
                if (str.equals("indicator")) {
                    b = 10;
                }
                break;
            case -597162967:
                if (str.equals("indicatorX")) {
                    b = 11;
                }
                break;
            case -597162966:
                if (str.equals("indicatorY")) {
                    b = 12;
                }
                break;
            case -202057851:
                if (str.equals("previousMargin")) {
                    b = 13;
                }
                break;
            case 3327652:
                if (str.equals("loop")) {
                    b = 14;
                }
                break;
            case 95467907:
                if (str.equals("delay")) {
                    b = 15;
                }
                break;
            case 109641799:
                if (str.equals("speed")) {
                    b = ExecutionDataWriter.BLOCK_SESSIONINFO;
                }
                break;
            case 195414576:
                if (str.equals("indicatorDirection")) {
                    b = ExecutionDataWriter.BLOCK_EXECUTIONDATA;
                }
                break;
            case 497874535:
                if (str.equals("allowTouchMove")) {
                    b = 18;
                }
                break;
            case 857882560:
                if (str.equals("pageCount")) {
                    b = 19;
                }
                break;
            case 1097821469:
                if (str.equals("pageMargin")) {
                    b = 20;
                }
                break;
            case 1196931001:
                if (str.equals("indicatorSelectedColor")) {
                    b = 21;
                }
                break;
            case 1439562083:
                if (str.equals("autoplay")) {
                    b = 22;
                }
                break;
            case 1788817256:
                if (str.equals("dataList")) {
                    b = 23;
                }
                break;
        }
        switch (b) {
            case 0:
                this.tq = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, 0);
                break;
            case 1:
                this.fb = com.bytedance.adsdk.ugeno.xha.ri.ri(str2, this.fb);
                break;
            case 2:
                this.tpb = str2;
                break;
            case 3:
                this.jm = mj.ri(this.lr, com.bytedance.adsdk.ugeno.xha.ik.ri(str2, 8.0f));
                break;
            case 4:
                this.adz = mj.ri(this.lr, com.bytedance.adsdk.ugeno.xha.ik.ri(str2, 8.0f));
                break;
            case 5:
                this.fn = mj.ri(this.lr, com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case 6:
                this.xh = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, 0);
                break;
            case 7:
                this.eu = str2;
                break;
            case 8:
                if (TextUtils.equals(str2, "vertical")) {
                    this.akr = 1;
                } else {
                    this.akr = 0;
                }
                break;
            case 9:
                this.jg = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, false);
                break;
            case 10:
                this.sz = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, false);
                break;
            case 11:
                this.ezp = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, 50.0f);
                break;
            case 12:
                this.evm = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, 90.0f);
                break;
            case 13:
                this.bfa = mj.ri(this.lr, com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case 14:
                this.de = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, true);
                break;
            case 15:
                this.zxp = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, 2000.0f);
                break;
            case 16:
                this.xlq = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, 500.0f);
                break;
            case 17:
                this.smj = str2;
                break;
            case 18:
                this.skk = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, true);
                break;
            case 19:
                this.rbz = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, 1.0f);
                break;
            case 20:
                this.amj = mj.ri(this.lr, com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case 21:
                this.bzf = com.bytedance.adsdk.ugeno.xha.ri.ri(str2, this.bzf);
                break;
            case 22:
                this.zv = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, true);
                break;
            case 23:
                this.eqw = com.bytedance.adsdk.ugeno.xha.lr.ri(str2, (JSONArray) null);
                break;
        }
    }

    public void ri(int i) {
        if (((com.bytedance.adsdk.ugeno.di.lr) this.fi).getCurrentItem() != i) {
            ((com.bytedance.adsdk.ugeno.di.lr) this.fi).aw(i);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.di.ik
    public void ri(boolean z, int i, float f, int i2) {
        ri(z, i, f);
    }

    @Override // com.bytedance.adsdk.ugeno.di.ik
    public void ri(boolean z, int i, int i2, boolean z2, boolean z3) {
        if (this.klz != i) {
            xha(i);
            mj(i);
            this.klz = i;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.di.ik
    public void ri(boolean z, int i) {
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.tyc = true;
        } else {
            if (!z) {
                this.tn = true;
            }
            this.tyc = false;
        }
    }

    private void ri(boolean z, int i, float f) {
        if (this.nbc != null && !z && i == qh() - 1 && f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.tn) {
            this.nbc.ri("SwiperView://finish", new Object[0]);
            this.tn = false;
        }
    }

    private void ri(co coVar) {
        if (this.jg) {
            coVar.ri(new com.bytedance.adsdk.ugeno.core.fi() { // from class: com.bytedance.adsdk.ugeno.lr.1
                @Override // com.bytedance.adsdk.ugeno.core.fi
                public void ri(com.bytedance.adsdk.ugeno.lr.ik ikVar, String str, List<di.ri> list) {
                    if ((TextUtils.equals(str, "tap") || TextUtils.equals(str, "slide") || TextUtils.equals(str, "touchStart") || TextUtils.equals(str, "touchEnd")) && ((com.bytedance.adsdk.ugeno.lr.ik) lr.this).fi != null) {
                        ((com.bytedance.adsdk.ugeno.di.lr) ((com.bytedance.adsdk.ugeno.lr.ik) lr.this).fi).di();
                    }
                }
            });
        }
    }
}
