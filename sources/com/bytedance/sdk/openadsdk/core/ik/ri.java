package com.bytedance.sdk.openadsdk.core.ik;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.ig;
import com.bytedance.sdk.openadsdk.core.jbs.ac;
import com.bytedance.sdk.openadsdk.core.jbs.mj;
import com.bytedance.sdk.openadsdk.core.model.co;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.jbs;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.bytedance.sdk.openadsdk.utils.slm;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends lr {
    private boolean dzy;
    private boolean ik;
    private boolean lr;
    private int pv;
    private boolean ri;
    private WeakReference<InterfaceC0250ri> xd;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ik.ri$ri, reason: collision with other inner class name */
    public interface InterfaceC0250ri {
        long getVideoProgress();
    }

    public ri(Context context, wjv wjvVar, String str, int i) {
        super(context, wjvVar, str, i);
        this.ri = true;
        this.lr = false;
        this.ik = false;
        this.dzy = false;
    }

    private boolean jbs() {
        wjv wjvVar = ((lr) this).di;
        if (wjvVar == null || mj()) {
            return false;
        }
        if (wjvVar.vz() != 5 && wjvVar.vz() != 15) {
            return false;
        }
        if (this.pv == 0) {
            this.pv = wjvVar.lji();
        }
        lr();
        ri();
        ik();
        if (this.pv == 5 && xha() && ri() && !lr() && !ik()) {
            return false;
        }
        int i = this.pv;
        return i == 1 || i == 2 || i == 5;
    }

    private boolean mj() {
        return this instanceof mj;
    }

    private boolean xha() {
        wjv wjvVar = ((lr) this).di;
        return wjv.fi(wjvVar) && wjvVar.ud() == 1;
    }

    public boolean ik() {
        return false;
    }

    public void ka(boolean z) {
        this.dzy = z;
    }

    public boolean lr() {
        return false;
    }

    public void ri(boolean z) {
        this.ri = z;
    }

    private boolean ik(View view) {
        if (view == null) {
            return false;
        }
        if ((view instanceof com.bytedance.sdk.openadsdk.core.bgr.lr.di) || view.getId() == slm.adz || view.getId() == slm.kt || view.getId() == slm.feb || view.getId() == slm.zyn || view.getId() == slm.tnn || view.getId() == 520093726 || view.getId() == slm.bzf) {
            return true;
        }
        if (view instanceof ViewGroup) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    break;
                }
                if (ik(viewGroup.getChildAt(i))) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public void lr(boolean z) {
        this.lr = z;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0214  */
    /* JADX WARN: Code duplicated, block: B:167:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:173:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:175:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:177:0x0300  */
    /* JADX WARN: Code duplicated, block: B:178:0x0303  */
    /* JADX WARN: Code duplicated, block: B:184:0x0314  */
    /* JADX WARN: Code duplicated, block: B:186:0x031c  */
    /* JADX WARN: Code duplicated, block: B:187:0x031f  */
    /* JADX WARN: Code duplicated, block: B:190:0x0328  */
    /* JADX WARN: Code duplicated, block: B:192:0x0332  */
    /* JADX WARN: Code duplicated, block: B:202:0x0352  */
    /* JADX WARN: Code duplicated, block: B:204:0x0358  */
    /* JADX WARN: Code duplicated, block: B:205:0x035c  */
    /* JADX WARN: Code duplicated, block: B:211:0x036a  */
    /* JADX WARN: Code duplicated, block: B:214:0x038a  */
    /* JADX WARN: Code duplicated, block: B:216:0x0392  */
    /* JADX WARN: Code duplicated, block: B:217:0x0395  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fc  */
    @Override // com.bytedance.sdk.openadsdk.core.ik.lr, com.bytedance.sdk.openadsdk.core.ik.ik
    public void ri(View view, float f, float f2, float f3, float f4, SparseArray<ik.ri> sparseArray, boolean z) {
        String str;
        com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi;
        boolean z2;
        JSONObject jSONObject;
        int i;
        JSONObject jSONObject2;
        int i2;
        View view2;
        Object tag;
        Activity activityRi;
        Context context;
        boolean z3;
        int i3;
        String strSmj;
        int i4;
        if (!ri(view, 2, f, f2, f3, f4, sparseArray, z)) {
            wjv wjvVar = ((lr) this).di;
            wjvVar.vr(true);
            wjvVar.qx();
            if (!wjvVar.ac()) {
                wjvVar.ka(true);
            }
            if (wjv.fi(wjvVar)) {
                com.bytedance.sdk.openadsdk.ka.ik.lr(wjvVar, ((lr) this).xha, wjvVar.hp());
            }
            if (this.aw != null) {
                if (this.slm == null) {
                    this.slm = new HashMap();
                }
                this.slm.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(this.aw.di()));
            }
            int iJu = wjvVar.ju();
            wjvVar.ta(0);
            com.bytedance.sdk.openadsdk.ihz.ri.ri.ik ikVar = this.vr;
            if (ikVar != null) {
                ikVar.ri(iJu > 0 ? iJu : 0);
            }
            Map<String, Object> map = this.slm;
            if (map != null) {
                map.remove("dsp_click_type");
                this.slm.remove("click_probability_jump");
                this.slm.remove("auto_click");
            }
            boolean zZz = wjvVar.zz();
            if (iJu > 0) {
                if (this.slm == null) {
                    this.slm = new HashMap();
                }
                if (zZz && iJu < 11) {
                    this.slm.put("dsp_click_type", Integer.valueOf(iJu));
                }
                if (iJu >= 11 && wjvVar.yv() == 0) {
                    this.slm.put("click_probability_jump", Integer.valueOf(jbs.ri(iJu)));
                }
            }
            com.bytedance.sdk.openadsdk.core.model.ka kaVarQc = wjvVar.qc();
            if (zZz || kaVarQc != null) {
                WeakReference<InterfaceC0250ri> weakReference = this.xd;
                long videoProgress = (weakReference == null || weakReference.get() == null) ? 0L : this.xd.get().getVideoProgress();
                if (!zZz && kaVarQc != null && (kaVarRi = kaVarQc.ri()) != null) {
                    kaVarRi.xha(videoProgress);
                }
                if (zZz) {
                    if (view != null) {
                        Object tag2 = view.getTag(570425345);
                        if (tag2 instanceof String) {
                            str = (String) tag2;
                        } else {
                            str = "VAST_ACTION_BUTTON";
                        }
                    } else {
                        str = "VAST_ACTION_BUTTON";
                    }
                    com.bytedance.sdk.openadsdk.core.aw.ri riVarSr = wjvVar.sr();
                    if (riVarSr != null) {
                        riVarSr.fi(str);
                        if (!TextUtils.isEmpty(str)) {
                            ri(str);
                        }
                        if ("VAST_ICON".equals(str)) {
                            com.bytedance.sdk.openadsdk.core.aw.lr lrVarLr = riVarSr.lr();
                            if (lrVarLr != null) {
                                lrVarLr.ri(videoProgress);
                            }
                        } else if ("VAST_END_CARD".equals(str)) {
                            com.bytedance.sdk.openadsdk.core.aw.ik ikVarIk = riVarSr.ik();
                            if (ikVarIk != null) {
                                ikVarIk.ri(videoProgress);
                            }
                        } else {
                            com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi2 = riVarSr.ri();
                            if (kaVarRi2 != null) {
                                kaVarRi2.xha(videoProgress);
                            }
                        }
                    }
                }
            }
            if (jbs() && ik(view) && !this.ik) {
                super.ri(view, f, f2, f3, f4, sparseArray, z);
                return;
            }
            if (((lr) this).ka == null) {
                ((lr) this).ka = nr.ri();
            }
            if (((lr) this).ka != null && ri(view, z)) {
                JSONObject jSONObjectRi = ac.ri(view);
                com.bytedance.sdk.openadsdk.core.model.slm slmVar = ((lr) this).fi;
                if (slmVar != null) {
                    int i5 = slmVar.mj;
                    JSONObject jSONObject3 = slmVar.jbs;
                    JSONObject jSONObject4 = slmVar.aw;
                    i = i5;
                    z2 = slmVar.bgr;
                    jSONObject = jSONObject3;
                    jSONObject2 = jSONObject4;
                } else {
                    z2 = false;
                    jSONObject = jSONObjectRi;
                    i = -1;
                    jSONObject2 = null;
                }
                long j = this.ay;
                long j2 = this.fr;
                WeakReference<View> weakReference2 = this.jbs;
                co coVarRi = ri(f, f2, f3, f4, sparseArray, j, j2, weakReference2 == null ? ka() : weakReference2.get(), fi(), qd.mj(((lr) this).ka), qd.qt(((lr) this).ka), qd.jbs(((lr) this).ka), i, jSONObject, jSONObject2);
                this.qt = coVarRi;
                if (z2) {
                    com.bytedance.sdk.openadsdk.ka.ik.ri("click", wjvVar, coVarRi, ((lr) this).xha, true, this.slm, z ? 1 : 2);
                    return;
                }
                int iAdz = wjvVar.adz();
                if (iAdz == 2 || iAdz == 3) {
                    if (iAdz == 3) {
                        strSmj = wjvVar.smj();
                        if (!TextUtils.isEmpty(strSmj) && strSmj.contains("play.google.com/store")) {
                            if (com.bytedance.sdk.openadsdk.ihz.ri.ri.lr.ri(((lr) this).ka, strSmj, strSmj.substring(strSmj.indexOf("?id=") + 4), ((lr) this).xha, wjvVar)) {
                                if (this.ri) {
                                    co coVar = this.qt;
                                    String str2 = ((lr) this).xha;
                                    Map<String, Object> map2 = this.slm;
                                    if (z) {
                                        i4 = 1;
                                    } else {
                                        i4 = 2;
                                    }
                                    com.bytedance.sdk.openadsdk.ka.ik.ri("click", wjvVar, coVar, str2, true, map2, i4);
                                }
                                view2 = view;
                            }
                        }
                    }
                    if (this.f18121co == null || this.lr) {
                        co coVar2 = this.qt;
                        String str3 = ((lr) this).xha;
                        Map<String, Object> map3 = this.slm;
                        if (z) {
                            i2 = 1;
                        } else {
                            i2 = 2;
                        }
                        com.bytedance.sdk.openadsdk.ka.ik.ri("click_button", wjvVar, coVar2, str3, true, map3, i2);
                    }
                    if (view != null) {
                        view2 = view;
                        try {
                            tag = view2.getTag(520093762);
                        } catch (Exception unused) {
                        }
                    } else {
                        view2 = view;
                        tag = null;
                    }
                    if ((view2 == null && (view2.getId() == 520093726 || (view2 instanceof com.bytedance.sdk.openadsdk.core.bgr.lr.di))) || Boolean.TRUE.equals(tag)) {
                        ig.ri(true);
                    }
                    activityRi = view2 != null ? com.bytedance.sdk.component.utils.lr.ri(view2) : null;
                    if (activityRi == null) {
                        context = ((lr) this).ka;
                    } else {
                        context = activityRi;
                    }
                    if (com.bytedance.sdk.openadsdk.core.model.ac.ik(wjvVar) || !this.dzy) {
                        boolean zRi = ig.ri(context, wjvVar, this.mj, this.f18121co, this.bu, ((lr) this).xha, this.vr, true, iJu);
                        wjvVar.di(SystemClock.elapsedRealtime());
                        ig.ri(false);
                        z3 = zRi;
                    } else {
                        z3 = false;
                    }
                    if (this.ri) {
                        co coVar3 = this.qt;
                        String str4 = ((lr) this).xha;
                        Map<String, Object> map4 = this.slm;
                        if (z) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                        com.bytedance.sdk.openadsdk.ka.ik.ri("click", wjvVar, coVar3, str4, z3, map4, i3);
                    }
                } else {
                    if (iAdz != 4) {
                        if (iAdz == 5) {
                            String strLr = lr(((lr) this).xha);
                            if (!TextUtils.isEmpty(strLr)) {
                                com.bytedance.sdk.openadsdk.ka.ik.ri("click_call", wjvVar, this.qt, strLr, true, this.slm, z ? 1 : 2);
                            }
                            com.bytedance.sdk.openadsdk.ka.ik.ri("click", wjvVar, this.qt, ((lr) this).xha, com.bytedance.sdk.openadsdk.utils.ig.lr(view.getContext(), wjvVar.eqw()), this.slm, z ? 1 : 2);
                        } else if (iAdz != 8) {
                            view2 = view;
                            iAdz = -1;
                        } else {
                            if (iAdz == 3) {
                                strSmj = wjvVar.smj();
                                if (!TextUtils.isEmpty(strSmj)) {
                                    if (com.bytedance.sdk.openadsdk.ihz.ri.ri.lr.ri(((lr) this).ka, strSmj, strSmj.substring(strSmj.indexOf("?id=") + 4), ((lr) this).xha, wjvVar)) {
                                        if (this.ri) {
                                            co coVar4 = this.qt;
                                            String str5 = ((lr) this).xha;
                                            Map<String, Object> map5 = this.slm;
                                            if (z) {
                                                i4 = 1;
                                            } else {
                                                i4 = 2;
                                            }
                                            com.bytedance.sdk.openadsdk.ka.ik.ri("click", wjvVar, coVar4, str5, true, map5, i4);
                                        }
                                    }
                                }
                            }
                            if (this.f18121co == null) {
                                co coVar5 = this.qt;
                                String str6 = ((lr) this).xha;
                                Map<String, Object> map6 = this.slm;
                                if (z) {
                                    i2 = 1;
                                } else {
                                    i2 = 2;
                                }
                                com.bytedance.sdk.openadsdk.ka.ik.ri("click_button", wjvVar, coVar5, str6, true, map6, i2);
                            } else {
                                co coVar6 = this.qt;
                                String str7 = ((lr) this).xha;
                                Map<String, Object> map7 = this.slm;
                                if (z) {
                                    i2 = 1;
                                } else {
                                    i2 = 2;
                                }
                                com.bytedance.sdk.openadsdk.ka.ik.ri("click_button", wjvVar, coVar6, str7, true, map7, i2);
                            }
                            if (view != null) {
                                view2 = view;
                                tag = view2.getTag(520093762);
                            } else {
                                view2 = view;
                                tag = null;
                            }
                            if (view2 == null) {
                                ig.ri(true);
                            } else {
                                ig.ri(true);
                            }
                            if (view2 != null) {
                            }
                            if (activityRi == null) {
                                context = ((lr) this).ka;
                            } else {
                                context = activityRi;
                            }
                            if (com.bytedance.sdk.openadsdk.core.model.ac.ik(wjvVar)) {
                                boolean zRi2 = ig.ri(context, wjvVar, this.mj, this.f18121co, this.bu, ((lr) this).xha, this.vr, true, iJu);
                                wjvVar.di(SystemClock.elapsedRealtime());
                                ig.ri(false);
                                z3 = zRi2;
                            } else {
                                boolean zRi3 = ig.ri(context, wjvVar, this.mj, this.f18121co, this.bu, ((lr) this).xha, this.vr, true, iJu);
                                wjvVar.di(SystemClock.elapsedRealtime());
                                ig.ri(false);
                                z3 = zRi3;
                            }
                            if (this.ri) {
                                co coVar7 = this.qt;
                                String str8 = ((lr) this).xha;
                                Map<String, Object> map8 = this.slm;
                                if (z) {
                                    i3 = 1;
                                } else {
                                    i3 = 2;
                                }
                                com.bytedance.sdk.openadsdk.ka.ik.ri("click", wjvVar, coVar7, str8, z3, map8, i3);
                            }
                        }
                    } else if (!dw.lr(wjvVar) || (this.f18121co == null && this.bu == null)) {
                        com.bytedance.sdk.openadsdk.ihz.ri.ri.ik ikVar2 = this.vr;
                        if (ikVar2 != null) {
                            ikVar2.ri(wjvVar);
                            Map<String, Object> map9 = this.slm;
                            if (wjvVar.ac() && !wjvVar.tan()) {
                                map9.put("auto_click", Boolean.TRUE);
                                wjvVar.fi(false);
                            }
                            if (this.ri) {
                                com.bytedance.sdk.openadsdk.ka.ik.ri("click", wjvVar, this.qt, ((lr) this).xha, true, map9, z ? 1 : 2);
                            }
                        }
                    } else {
                        activityRi = view != null ? com.bytedance.sdk.component.utils.lr.ri(view) : null;
                        boolean zRi4 = ig.ri(activityRi == null ? ((lr) this).ka : activityRi, wjvVar, this.mj, this.f18121co, this.bu, ((lr) this).xha, this.vr, true, iJu);
                        if (this.ri) {
                            com.bytedance.sdk.openadsdk.ka.ik.ri("click", wjvVar, this.qt, ((lr) this).xha, zRi4, this.slm, z ? 1 : 2);
                        }
                    }
                    view2 = view;
                }
                lr.ri riVar = this.sf;
                if (riVar != null) {
                    riVar.ri(view2, iAdz);
                }
            }
        }
    }

    private String lr(String str) {
        str.getClass();
        switch (str) {
            case "banner_ad":
                return "banner_call";
            case "open_ad":
                return "open_ad";
            case "embeded_ad":
                return "feed_call";
            case "interaction":
                return "interaction_call";
            case "slide_banner_ad":
                return "banner_call";
            default:
                return "";
        }
    }

    public void ik(boolean z) {
        this.ik = z;
    }

    public boolean ri() {
        wjv wjvVar = ((lr) this).di;
        if (wjvVar == null) {
            return true;
        }
        int iLr = nr.ka().lr(wjvVar.ur());
        int iIk = com.bytedance.sdk.component.utils.nr.ik(nr.ri());
        if (iLr == 1) {
            return com.bytedance.sdk.openadsdk.utils.ig.ka(iIk);
        }
        if (iLr == 2) {
            return com.bytedance.sdk.openadsdk.utils.ig.fi(iIk) || com.bytedance.sdk.openadsdk.utils.ig.ka(iIk) || com.bytedance.sdk.openadsdk.utils.ig.di(iIk);
        }
        if (iLr != 3) {
            return iLr != 5 || com.bytedance.sdk.openadsdk.utils.ig.ka(iIk) || com.bytedance.sdk.openadsdk.utils.ig.di(iIk);
        }
        return false;
    }

    public void ri(InterfaceC0250ri interfaceC0250ri) {
        this.xd = new WeakReference<>(interfaceC0250ri);
    }
}
