package com.bytedance.adsdk.ugeno;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.core.fs;
import com.bytedance.adsdk.ugeno.mml.mo;
import com.bytedance.adsdk.ugeno.mml.tvp;
import com.bytedance.adsdk.ugeno.wd.jpc;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ud extends com.bytedance.adsdk.ugeno.ud.qdl<com.bytedance.adsdk.ugeno.mo.ud> implements com.bytedance.adsdk.ugeno.mo.lnr {
    private boolean auu;
    private float ca;
    private int dps;
    private int eta;
    private String fge;
    private float gsp;
    private boolean gsv;
    private float hcs;
    private boolean hd;
    private float hr;
    private boolean hvi;
    private boolean iw;
    private JSONArray kj;
    private float kr;
    private boolean lme;
    private float nts;
    private float od;
    private int oz;
    private int se;
    private String syy;
    private String tdy;
    private boolean uvi;
    private int vc;
    private float vm;
    private int vr;
    private float xx;
    private float ygv;

    public ud(Context context) {
        super(context);
        this.dps = 0;
        this.iw = true;
        this.lme = true;
        this.kr = 500.0f;
        this.xx = 2000.0f;
        this.syy = "slide";
        this.tdy = "dot";
        this.ca = 8.0f;
        this.gsp = 8.0f;
        this.ygv = 50.0f;
        this.hr = 90.0f;
        this.hd = false;
        this.se = Color.parseColor("#666666");
        this.vc = Color.parseColor("#ffffff");
        this.fge = "row";
        this.hcs = 1.0f;
        this.od = 0.0f;
        this.vm = 0.0f;
        this.nts = 0.0f;
        this.eta = 0;
        this.vr = 0;
        this.auu = true;
        this.gsv = false;
        this.hvi = true;
        float fQdl = jpc.qdl(this.ud, 8.0f);
        this.ca = fQdl;
        this.gsp = fQdl;
    }

    private void jpc(int i2) {
        tvp tvpVar = this.xdk;
        if (tvpVar == null) {
            return;
        }
        tvpVar.qdl("SwiperView://slide", Integer.valueOf(this.oz), Integer.valueOf(i2), Integer.valueOf(!this.uvi ? 1 : 0));
    }

    private void taz() {
        for (int i2 = 0; i2 < ((com.bytedance.adsdk.ugeno.ud.qdl) this).qdl.size(); i2++) {
            com.bytedance.adsdk.ugeno.ud.lnr<View> lnrVar = ((com.bytedance.adsdk.ugeno.ud.qdl) this).qdl.get(i2);
            if (lnrVar != null) {
                fs fsVar = new fs(this.ud);
                qdl(fsVar);
                fsVar.qdl(this.zvv);
                ((com.bytedance.adsdk.ugeno.mo.ud) this.mzz).qdl(fsVar.qdl(lnrVar.rc(), this.mml, (JSONObject) null));
            }
        }
    }

    private int tid() {
        if (this.eta == 1) {
            List<com.bytedance.adsdk.ugeno.ud.lnr<View>> list = ((com.bytedance.adsdk.ugeno.ud.qdl) this).qdl;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
        JSONArray jSONArray = this.kj;
        if (jSONArray != null) {
            return jSONArray.length();
        }
        return 0;
    }

    private void wd(int i2) {
        if (this.xdk == null) {
            return;
        }
        if (this.oz == 0 && i2 == tid() - 1) {
            this.xdk.qdl("SwiperView://reloop", 1);
            Log.d("BaseSwiper", "onPageSelected: reloop monitor FIRST_TO_LAST");
        }
        if (this.oz == tid() - 1 && i2 == 0) {
            this.xdk.qdl("SwiperView://reloop", 0);
            Log.d("BaseSwiper", "onPageSelected: reloop monitor LAST_TO_FIRST");
        }
    }

    private void zlt() {
        List<com.bytedance.adsdk.ugeno.ud.lnr<View>> list = ((com.bytedance.adsdk.ugeno.ud.qdl) this).qdl;
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.adsdk.ugeno.ud.lnr<View> lnrVar = ((com.bytedance.adsdk.ugeno.ud.qdl) this).qdl.get(0);
        if (this.kj == null) {
            return;
        }
        for (int i2 = 0; i2 < this.kj.length(); i2++) {
            fs fsVar = new fs(this.ud);
            qdl(fsVar);
            fsVar.qdl(this.zvv);
            try {
                JSONObject jSONObjectOptJSONObject = this.kj.optJSONObject(i2);
                if (jSONObjectOptJSONObject != null) {
                    if (jSONObjectOptJSONObject.has("$chunk")) {
                        this.mml.put("$item", jSONObjectOptJSONObject.optJSONArray("$chunk"));
                    } else {
                        this.mml.put("$item", jSONObjectOptJSONObject);
                    }
                    ((com.bytedance.adsdk.ugeno.mo.ud) this.mzz).qdl(fsVar.qdl(lnrVar.rc(), this.mml, (JSONObject) null));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void lnr() {
        ((com.bytedance.adsdk.ugeno.mo.ud) this.mzz).exu(((com.bytedance.adsdk.ugeno.mo.ud) this.mzz).getCurrentItem() + 1);
    }

    public void mml() {
        ((com.bytedance.adsdk.ugeno.mo.ud) this.mzz).exu(((com.bytedance.adsdk.ugeno.mo.ud) this.mzz).getCurrentItem() - 1);
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public View qdl() {
        com.bytedance.adsdk.ugeno.mo.ud udVar = new com.bytedance.adsdk.ugeno.mo.ud(this.ud);
        this.mzz = udVar;
        udVar.qdl((mml) this);
        return this.mzz;
    }

    @Override // com.bytedance.adsdk.ugeno.ud.qdl, com.bytedance.adsdk.ugeno.ud.lnr
    public void ud() {
        super.ud();
        ((com.bytedance.adsdk.ugeno.mo.ud) this.mzz).lnr((int) this.kr).mzz(this.gsv).qdl(this.tdy).qdl(this.ca).ud(this.gsp).lnr(this.ygv).mml(this.hr).ud(this.fge).qdl(this.dps).ud().mml(this.iw).qdl(this.lme).ud((int) this.kr).mml((int) this.xx).ud(this.auu).lnr(this.hd).mo(this.se).mzz(this.vc).jpc((int) this.vm).tvp((int) this.nts).wd((int) this.od).mzz(this.hcs).lnr(this.syy).exu(this.vr);
        ((com.bytedance.adsdk.ugeno.mo.ud) this.mzz).setOnPageChangeListener(this);
        if (this.eta == 1) {
            taz();
        } else {
            zlt();
        }
        ((com.bytedance.adsdk.ugeno.mo.ud) this.mzz).lnr();
    }

    @Override // com.bytedance.adsdk.ugeno.ud.qdl
    public void qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar) {
        if (lnrVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.ud.qdl) this).qdl.add(lnrVar);
    }

    @Override // com.bytedance.adsdk.ugeno.ud.qdl
    public void qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, ViewGroup.LayoutParams layoutParams) {
        if (lnrVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.ud.qdl) this).qdl.add(lnrVar);
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public void qdl(String str, String str2) {
        super.qdl(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "startIndex":
                this.vr = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0);
                break;
            case "indicatorColor":
                this.se = com.bytedance.adsdk.ugeno.wd.qdl.qdl(str2, this.se);
                break;
            case "indicatorStyle":
                this.tdy = str2;
                break;
            case "indicatorWidth":
                this.ca = jpc.qdl(this.ud, com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 8.0f));
                break;
            case "indicatorHeight":
                this.gsp = jpc.qdl(this.ud, com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 8.0f));
                break;
            case "nextMargin":
                this.nts = jpc.qdl(this.ud, com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f));
                break;
            case "driveMode":
                this.eta = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0);
                break;
            case "effect":
                this.syy = str2;
                break;
            case "direction":
                if (TextUtils.equals(str2, "vertical")) {
                    this.dps = 1;
                    break;
                } else {
                    this.dps = 0;
                    break;
                }
                break;
            case "disableOnInteraction":
                this.gsv = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, false);
                break;
            case "indicator":
                this.hd = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, false);
                break;
            case "indicatorX":
                this.ygv = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 50.0f);
                break;
            case "indicatorY":
                this.hr = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 90.0f);
                break;
            case "previousMargin":
                this.vm = jpc.qdl(this.ud, com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f));
                break;
            case "loop":
                this.iw = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, true);
                break;
            case "delay":
                this.xx = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 2000.0f);
                break;
            case "speed":
                this.kr = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 500.0f);
                break;
            case "indicatorDirection":
                this.fge = str2;
                break;
            case "allowTouchMove":
                this.auu = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, true);
                break;
            case "pageCount":
                this.hcs = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 1.0f);
                break;
            case "pageMargin":
                this.od = jpc.qdl(this.ud, com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f));
                break;
            case "indicatorSelectedColor":
                this.vc = com.bytedance.adsdk.ugeno.wd.qdl.qdl(str2, this.vc);
                break;
            case "autoplay":
                this.lme = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, true);
                break;
            case "dataList":
                this.kj = com.bytedance.adsdk.ugeno.wd.ud.qdl(str2, (JSONArray) null);
                break;
        }
    }

    public void qdl(int i2) {
        if (((com.bytedance.adsdk.ugeno.mo.ud) this.mzz).getCurrentItem() != i2) {
            ((com.bytedance.adsdk.ugeno.mo.ud) this.mzz).exu(i2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.mo.lnr
    public void qdl(boolean z2, int i2, float f, int i3) {
        Log.d("BaseSwiper", "onPageScrolled: loop=" + z2 + "; position=" + i2 + "; positionOffset=" + f + "; positionOffsetPixels=" + i3);
        qdl(z2, i2, f);
    }

    @Override // com.bytedance.adsdk.ugeno.mo.lnr
    public void qdl(boolean z2, int i2, int i3, boolean z3, boolean z4) {
        if (this.oz != i2) {
            wd(i2);
            jpc(i2);
            this.oz = i2;
        }
        Log.d("BaseSwiper", "onPageSelected: loop=" + z2 + "; position=" + i2 + "; loopPosition=" + i3 + "; isFirst=" + z3 + "; isLast=" + z4);
    }

    @Override // com.bytedance.adsdk.ugeno.mo.lnr
    public void qdl(boolean z2, int i2) {
        if (i2 == 0) {
            if (!z2) {
                this.hvi = true;
            }
            this.uvi = false;
        } else if (i2 == 1) {
            this.uvi = true;
        }
        Log.d("BaseSwiper", "onPageScrollStateChanged: loop=" + z2 + "; state=" + i2);
    }

    private void qdl(boolean z2, int i2, float f) {
        if (this.xdk != null && !z2 && i2 == tid() - 1 && f == 0.0f && this.hvi) {
            this.xdk.qdl("SwiperView://finish", new Object[0]);
            Log.d("BaseSwiper", "onPageScrolled: finish monitor");
            this.hvi = false;
        }
    }

    private void qdl(fs fsVar) {
        if (this.gsv) {
            fsVar.qdl(new com.bytedance.adsdk.ugeno.core.mzz() { // from class: com.bytedance.adsdk.ugeno.ud.1
                @Override // com.bytedance.adsdk.ugeno.core.mzz
                public void qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, String str, List<mo.qdl> list) {
                    if ((TextUtils.equals(str, "tap") || TextUtils.equals(str, "slide") || TextUtils.equals(str, "touchStart") || TextUtils.equals(str, "touchEnd")) && ((com.bytedance.adsdk.ugeno.ud.lnr) ud.this).mzz != null) {
                        ((com.bytedance.adsdk.ugeno.mo.ud) ((com.bytedance.adsdk.ugeno.ud.lnr) ud.this).mzz).mo();
                    }
                }
            });
        }
    }
}
