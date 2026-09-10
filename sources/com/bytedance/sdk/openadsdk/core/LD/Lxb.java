package com.bytedance.sdk.openadsdk.core.LD;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.IeN;
import com.bytedance.sdk.openadsdk.core.OY.OY;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.core.model.nBu;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.xan;
import com.bytedance.sdk.openadsdk.utils.STP;
import com.bytedance.sdk.openadsdk.utils.le;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb extends LD {
    private int BcA;
    private boolean LD;
    private boolean Lxb;
    private boolean le;
    private boolean lk;
    private WeakReference<InterfaceC0093Lxb> nJ;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.LD.Lxb$Lxb, reason: collision with other inner class name */
    public interface InterfaceC0093Lxb {
        long getVideoProgress();
    }

    public Lxb(@NonNull Context context, @NonNull tD tDVar, @NonNull String str, int i) {
        super(context, tDVar, str, i);
        this.Lxb = true;
        this.LD = false;
        this.lk = false;
        this.le = false;
    }

    private boolean OY() {
        return tD.JXs(((LD) this).lc) && ((LD) this).lc.CSn() == 1;
    }

    private boolean QAg() {
        return this instanceof OY;
    }

    private boolean ZU(View view) {
        if (view == null) {
            return false;
        }
        if ((view instanceof com.bytedance.sdk.openadsdk.core.NXR.LD.lc) || view.getId() == STP.TA || view.getId() == STP.dR || view.getId() == STP.NDz || view.getId() == STP.JJ || view.getId() == STP.VU || view.getId() == 520093726 || view.getId() == STP.nH) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        int i = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                return false;
            }
            if (ZU(viewGroup.getChildAt(i))) {
                return true;
            }
            i++;
        }
    }

    private boolean nBu() {
        if (((LD) this).lc == null || QAg()) {
            return false;
        }
        if (((LD) this).lc.FGm() != 5 && ((LD) this).lc.FGm() != 15) {
            return false;
        }
        if (this.BcA == 0) {
            this.BcA = ((LD) this).lc.lJ();
        }
        LD();
        Lxb();
        lk();
        if (this.BcA == 5 && OY() && Lxb() && !LD() && !lk()) {
            return false;
        }
        int i = this.BcA;
        return i == 1 || i == 2 || i == 5;
    }

    public boolean LD() {
        return false;
    }

    public void Lxb(boolean z) {
        this.Lxb = z;
    }

    public boolean lk() {
        return false;
    }

    public void LD(boolean z) {
        this.LD = z;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0255  */
    /* JADX WARN: Code duplicated, block: B:160:0x0334  */
    /* JADX WARN: Code duplicated, block: B:173:0x0378  */
    /* JADX WARN: Code duplicated, block: B:175:0x037c  */
    /* JADX WARN: Code duplicated, block: B:177:0x0380  */
    /* JADX WARN: Code duplicated, block: B:179:0x038a  */
    /* JADX WARN: Code duplicated, block: B:180:0x038c  */
    /* JADX WARN: Code duplicated, block: B:185:0x039e A[Catch: Exception -> 0x03a3, TryCatch #0 {Exception -> 0x03a3, blocks: (B:183:0x0395, B:185:0x039e, B:191:0x03b4, B:189:0x03a5), top: B:214:0x0395 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x03a5 A[Catch: Exception -> 0x03a3, TryCatch #0 {Exception -> 0x03a3, blocks: (B:183:0x0395, B:185:0x039e, B:191:0x03b4, B:189:0x03a5), top: B:214:0x0395 }] */
    /* JADX WARN: Code duplicated, block: B:191:0x03b4 A[Catch: Exception -> 0x03a3, TRY_LEAVE, TryCatch #0 {Exception -> 0x03a3, blocks: (B:183:0x0395, B:185:0x039e, B:191:0x03b4, B:189:0x03a5), top: B:214:0x0395 }] */
    /* JADX WARN: Code duplicated, block: B:193:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:195:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:196:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:199:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:202:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:205:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:207:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:208:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:214:0x0395 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e9  */
    @Override // com.bytedance.sdk.openadsdk.core.LD.LD, com.bytedance.sdk.openadsdk.core.LD.lk
    public void Lxb(View view, float f, float f2, float f3, float f4, SparseArray<lk.Lxb> sparseArray, boolean z) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        int i;
        boolean z2;
        View view2;
        int i2;
        Activity activityLxb;
        Context context;
        boolean z3;
        int i3;
        String strSv;
        String str;
        if (Lxb(view, 2, f, f2, f3, f4, sparseArray, z)) {
            return;
        }
        ((LD) this).lc.JXs(true);
        ((LD) this).lc.BK();
        if (!((LD) this).lc.JXs()) {
            ((LD) this).lc.Lxb(true);
        }
        if (tD.JXs(((LD) this).lc)) {
            tD tDVar = ((LD) this).lc;
            com.bytedance.sdk.openadsdk.ZU.lk.LD(tDVar, ((LD) this).ebl, tDVar.mhk());
        }
        if (this.STP != null) {
            if (this.kqm == null) {
                this.kqm = new HashMap();
            }
            this.kqm.put("duration", Long.valueOf(this.STP.JXs()));
        }
        int iLRt = ((LD) this).lc.LRt();
        ((LD) this).lc.CG(0);
        com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc lcVar = this.VVE;
        if (lcVar != null) {
            lcVar.Lxb(iLRt > 0 ? iLRt : 0);
        }
        Map<String, Object> map = this.kqm;
        if (map != null) {
            map.remove("dsp_click_type");
            this.kqm.remove("click_probability_jump");
            this.kqm.remove("auto_click");
        }
        if (iLRt > 0) {
            if (this.kqm == null) {
                this.kqm = new HashMap();
            }
            if (((LD) this).lc.chu() && iLRt < 11) {
                this.kqm.put("dsp_click_type", Integer.valueOf(iLRt));
            }
            if (iLRt >= 11 && ((LD) this).lc.qK() == 0) {
                this.kqm.put("click_probability_jump", Integer.valueOf(com.bytedance.sdk.openadsdk.core.model.lc.Lxb(iLRt)));
            }
        }
        if (((LD) this).lc.chu()) {
            if (view != null) {
                Object tag = view.getTag(570425345);
                if (tag instanceof String) {
                    str = (String) tag;
                } else {
                    str = "VAST_ACTION_BUTTON";
                }
            } else {
                str = "VAST_ACTION_BUTTON";
            }
            ((LD) this).lc.SlV().JXs(str);
            if (!TextUtils.isEmpty(str)) {
                Lxb(str);
            }
            WeakReference<InterfaceC0093Lxb> weakReference = this.nJ;
            long videoProgress = (weakReference == null || weakReference.get() == null) ? 0L : this.nJ.get().getVideoProgress();
            if ("VAST_ICON".equals(str)) {
                if (((LD) this).lc.SlV().LD() != null) {
                    ((LD) this).lc.SlV().LD().Lxb(videoProgress);
                }
            } else if (!"VAST_END_CARD".equals(str)) {
                ((LD) this).lc.SlV().Lxb().ebl(videoProgress);
            } else if (((LD) this).lc.SlV().lk() != null) {
                ((LD) this).lc.SlV().lk().Lxb(videoProgress);
            }
        }
        if (nBu() && ZU(view) && !this.lk) {
            super.Lxb(view, f, f2, f3, f4, sparseArray, z);
            return;
        }
        if (this.ZU == null) {
            this.ZU = kqm.Lxb();
        }
        if (this.ZU != null && Lxb(view, z)) {
            JSONObject jSONObjectLxb = com.bytedance.sdk.openadsdk.core.OY.tD.Lxb(view);
            com.bytedance.sdk.openadsdk.core.model.STP stp = this.JXs;
            if (stp != null) {
                int i4 = stp.sLN;
                JSONObject jSONObject3 = stp.NXR;
                JSONObject jSONObject4 = stp.kqm;
                i = i4;
                z2 = stp.brP;
                jSONObject = jSONObject3;
                jSONObject2 = jSONObject4;
            } else {
                jSONObject = jSONObjectLxb;
                jSONObject2 = null;
                i = -1;
                z2 = false;
            }
            long j = this.CSn;
            long j2 = this.id;
            WeakReference<View> weakReference2 = this.QAg;
            View viewZU = weakReference2 == null ? ZU() : weakReference2.get();
            WeakReference<View> weakReference3 = this.nBu;
            nBu nbuLxb = Lxb(f, f2, f3, f4, sparseArray, j, j2, viewZU, weakReference3 == null ? JXs() : weakReference3.get(), lc(), le.JXs(this.ZU), le.ebl(this.ZU), le.lc(this.ZU), i, jSONObject, jSONObject2);
            this.JVA = nbuLxb;
            if (z2) {
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(CampaignEx.JSON_NATIVE_VIDEO_CLICK, ((LD) this).lc, nbuLxb, ((LD) this).ebl, true, this.kqm, z ? 1 : 2);
                return;
            }
            int iSRq = ((LD) this).lc.sRq();
            if (iSRq == 2 || iSRq == 3) {
                view2 = view;
                if (iSRq == 3) {
                    strSv = ((LD) this).lc.Sv();
                    if (TextUtils.isEmpty(strSv) && strSv.contains("play.google.com/store")) {
                        if (!com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.ZU.Lxb(this.ZU, strSv, strSv.substring(strSv.indexOf("?id=") + 4), ((LD) this).ebl, ((LD) this).lc)) {
                            if (this.NXR == null) {
                                tD tDVar2 = ((LD) this).lc;
                                nBu nbu = this.JVA;
                                String str2 = ((LD) this).ebl;
                                Map<String, Object> map2 = this.kqm;
                                if (z) {
                                    i2 = 1;
                                } else {
                                    i2 = 2;
                                }
                                com.bytedance.sdk.openadsdk.ZU.lk.Lxb("click_button", tDVar2, nbu, str2, true, map2, i2);
                            } else {
                                tD tDVar3 = ((LD) this).lc;
                                nBu nbu2 = this.JVA;
                                String str3 = ((LD) this).ebl;
                                Map<String, Object> map3 = this.kqm;
                                if (z) {
                                    i2 = 1;
                                } else {
                                    i2 = 2;
                                }
                                com.bytedance.sdk.openadsdk.ZU.lk.Lxb("click_button", tDVar3, nbu2, str3, true, map3, i2);
                            }
                            if (view2 != null) {
                                if (view.getId() != 520093726) {
                                }
                                xan.Lxb(true);
                            } else if (((Boolean) view2.getTag(520093762)).booleanValue()) {
                                xan.Lxb(true);
                            }
                            if (view2 != null) {
                            }
                            if (activityLxb == null) {
                                context = this.ZU;
                            } else {
                                context = activityLxb;
                            }
                            if (com.bytedance.sdk.openadsdk.core.model.kqm.lk(((LD) this).lc)) {
                                boolean zLxb = xan.Lxb(context, ((LD) this).lc, this.OY, this.NXR, this.brP, ((LD) this).ebl, this.VVE, true, iLRt);
                                xan.Lxb(false);
                                z3 = zLxb;
                            } else {
                                boolean zLxb2 = xan.Lxb(context, ((LD) this).lc, this.OY, this.NXR, this.brP, ((LD) this).ebl, this.VVE, true, iLRt);
                                xan.Lxb(false);
                                z3 = zLxb2;
                            }
                            if (this.Lxb) {
                                tD tDVar4 = ((LD) this).lc;
                                nBu nbu3 = this.JVA;
                                String str4 = ((LD) this).ebl;
                                Map<String, Object> map4 = this.kqm;
                                if (z) {
                                    i3 = 1;
                                } else {
                                    i3 = 2;
                                }
                                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(CampaignEx.JSON_NATIVE_VIDEO_CLICK, tDVar4, nbu3, str4, z3, map4, i3);
                            }
                        } else if (this.Lxb) {
                            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(CampaignEx.JSON_NATIVE_VIDEO_CLICK, ((LD) this).lc, this.JVA, ((LD) this).ebl, true, this.kqm, z ? 1 : 2);
                        }
                    } else {
                        if (this.NXR == null || this.LD) {
                            tD tDVar5 = ((LD) this).lc;
                            nBu nbu4 = this.JVA;
                            String str5 = ((LD) this).ebl;
                            Map<String, Object> map5 = this.kqm;
                            if (z) {
                                i2 = 1;
                            } else {
                                i2 = 2;
                            }
                            com.bytedance.sdk.openadsdk.ZU.lk.Lxb("click_button", tDVar5, nbu4, str5, true, map5, i2);
                        }
                        if (view2 != null) {
                            try {
                                if (view.getId() != 520093726 || (view2 instanceof com.bytedance.sdk.openadsdk.core.NXR.LD.lc)) {
                                    xan.Lxb(true);
                                } else if (((Boolean) view2.getTag(520093762)).booleanValue()) {
                                    xan.Lxb(true);
                                }
                            } catch (Exception unused) {
                            }
                        } else if (((Boolean) view2.getTag(520093762)).booleanValue()) {
                            xan.Lxb(true);
                        }
                        activityLxb = view2 != null ? com.bytedance.sdk.component.utils.LD.Lxb(view) : null;
                        if (activityLxb == null) {
                            context = this.ZU;
                        } else {
                            context = activityLxb;
                        }
                        if (com.bytedance.sdk.openadsdk.core.model.kqm.lk(((LD) this).lc) || !this.le) {
                            boolean zLxb3 = xan.Lxb(context, ((LD) this).lc, this.OY, this.NXR, this.brP, ((LD) this).ebl, this.VVE, true, iLRt);
                            xan.Lxb(false);
                            z3 = zLxb3;
                        } else {
                            z3 = false;
                        }
                        if (this.Lxb) {
                            tD tDVar6 = ((LD) this).lc;
                            nBu nbu5 = this.JVA;
                            String str6 = ((LD) this).ebl;
                            Map<String, Object> map6 = this.kqm;
                            if (z) {
                                i3 = 1;
                            } else {
                                i3 = 2;
                            }
                            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(CampaignEx.JSON_NATIVE_VIDEO_CLICK, tDVar6, nbu5, str6, z3, map6, i3);
                        }
                    }
                } else {
                    if (this.NXR == null) {
                        tD tDVar7 = ((LD) this).lc;
                        nBu nbu6 = this.JVA;
                        String str7 = ((LD) this).ebl;
                        Map<String, Object> map7 = this.kqm;
                        if (z) {
                            i2 = 1;
                        } else {
                            i2 = 2;
                        }
                        com.bytedance.sdk.openadsdk.ZU.lk.Lxb("click_button", tDVar7, nbu6, str7, true, map7, i2);
                    } else {
                        tD tDVar8 = ((LD) this).lc;
                        nBu nbu7 = this.JVA;
                        String str8 = ((LD) this).ebl;
                        Map<String, Object> map8 = this.kqm;
                        if (z) {
                            i2 = 1;
                        } else {
                            i2 = 2;
                        }
                        com.bytedance.sdk.openadsdk.ZU.lk.Lxb("click_button", tDVar8, nbu7, str8, true, map8, i2);
                    }
                    if (view2 != null) {
                        if (view.getId() != 520093726) {
                        }
                        xan.Lxb(true);
                    } else if (((Boolean) view2.getTag(520093762)).booleanValue()) {
                        xan.Lxb(true);
                    }
                    if (view2 != null) {
                    }
                    if (activityLxb == null) {
                        context = this.ZU;
                    } else {
                        context = activityLxb;
                    }
                    if (com.bytedance.sdk.openadsdk.core.model.kqm.lk(((LD) this).lc)) {
                        boolean zLxb4 = xan.Lxb(context, ((LD) this).lc, this.OY, this.NXR, this.brP, ((LD) this).ebl, this.VVE, true, iLRt);
                        xan.Lxb(false);
                        z3 = zLxb4;
                    } else {
                        boolean zLxb5 = xan.Lxb(context, ((LD) this).lc, this.OY, this.NXR, this.brP, ((LD) this).ebl, this.VVE, true, iLRt);
                        xan.Lxb(false);
                        z3 = zLxb5;
                    }
                    if (this.Lxb) {
                        tD tDVar9 = ((LD) this).lc;
                        nBu nbu8 = this.JVA;
                        String str9 = ((LD) this).ebl;
                        Map<String, Object> map9 = this.kqm;
                        if (z) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(CampaignEx.JSON_NATIVE_VIDEO_CLICK, tDVar9, nbu8, str9, z3, map9, i3);
                    }
                }
            } else if (iSRq != 4) {
                if (iSRq == 5) {
                    String strLD = LD(((LD) this).ebl);
                    if (!TextUtils.isEmpty(strLD)) {
                        com.bytedance.sdk.openadsdk.ZU.lk.Lxb("click_call", ((LD) this).lc, this.JVA, strLD, true, this.kqm, z ? 1 : 2);
                    }
                    com.bytedance.sdk.openadsdk.ZU.lk.Lxb(CampaignEx.JSON_NATIVE_VIDEO_CLICK, ((LD) this).lc, this.JVA, ((LD) this).ebl, nJ.lk(view.getContext(), ((LD) this).lc.Nu()), this.kqm, z ? 1 : 2);
                    view2 = view;
                } else if (iSRq != 8) {
                    view2 = view;
                    iSRq = -1;
                } else {
                    view2 = view;
                    if (iSRq == 3) {
                        strSv = ((LD) this).lc.Sv();
                        if (TextUtils.isEmpty(strSv)) {
                            if (this.NXR == null) {
                                tD tDVar10 = ((LD) this).lc;
                                nBu nbu9 = this.JVA;
                                String str10 = ((LD) this).ebl;
                                Map<String, Object> map10 = this.kqm;
                                if (z) {
                                    i2 = 1;
                                } else {
                                    i2 = 2;
                                }
                                com.bytedance.sdk.openadsdk.ZU.lk.Lxb("click_button", tDVar10, nbu9, str10, true, map10, i2);
                            } else {
                                tD tDVar11 = ((LD) this).lc;
                                nBu nbu10 = this.JVA;
                                String str11 = ((LD) this).ebl;
                                Map<String, Object> map11 = this.kqm;
                                if (z) {
                                    i2 = 1;
                                } else {
                                    i2 = 2;
                                }
                                com.bytedance.sdk.openadsdk.ZU.lk.Lxb("click_button", tDVar11, nbu10, str11, true, map11, i2);
                            }
                            if (view2 != null) {
                                if (view.getId() != 520093726) {
                                }
                                xan.Lxb(true);
                            } else if (((Boolean) view2.getTag(520093762)).booleanValue()) {
                                xan.Lxb(true);
                            }
                            if (view2 != null) {
                            }
                            if (activityLxb == null) {
                                context = this.ZU;
                            } else {
                                context = activityLxb;
                            }
                            if (com.bytedance.sdk.openadsdk.core.model.kqm.lk(((LD) this).lc)) {
                                boolean zLxb6 = xan.Lxb(context, ((LD) this).lc, this.OY, this.NXR, this.brP, ((LD) this).ebl, this.VVE, true, iLRt);
                                xan.Lxb(false);
                                z3 = zLxb6;
                            } else {
                                boolean zLxb7 = xan.Lxb(context, ((LD) this).lc, this.OY, this.NXR, this.brP, ((LD) this).ebl, this.VVE, true, iLRt);
                                xan.Lxb(false);
                                z3 = zLxb7;
                            }
                            if (this.Lxb) {
                                tD tDVar12 = ((LD) this).lc;
                                nBu nbu11 = this.JVA;
                                String str12 = ((LD) this).ebl;
                                Map<String, Object> map12 = this.kqm;
                                if (z) {
                                    i3 = 1;
                                } else {
                                    i3 = 2;
                                }
                                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(CampaignEx.JSON_NATIVE_VIDEO_CLICK, tDVar12, nbu11, str12, z3, map12, i3);
                            }
                        } else {
                            if (this.NXR == null) {
                                tD tDVar13 = ((LD) this).lc;
                                nBu nbu12 = this.JVA;
                                String str13 = ((LD) this).ebl;
                                Map<String, Object> map13 = this.kqm;
                                if (z) {
                                    i2 = 1;
                                } else {
                                    i2 = 2;
                                }
                                com.bytedance.sdk.openadsdk.ZU.lk.Lxb("click_button", tDVar13, nbu12, str13, true, map13, i2);
                            } else {
                                tD tDVar14 = ((LD) this).lc;
                                nBu nbu13 = this.JVA;
                                String str14 = ((LD) this).ebl;
                                Map<String, Object> map14 = this.kqm;
                                if (z) {
                                    i2 = 1;
                                } else {
                                    i2 = 2;
                                }
                                com.bytedance.sdk.openadsdk.ZU.lk.Lxb("click_button", tDVar14, nbu13, str14, true, map14, i2);
                            }
                            if (view2 != null) {
                                if (view.getId() != 520093726) {
                                }
                                xan.Lxb(true);
                            } else if (((Boolean) view2.getTag(520093762)).booleanValue()) {
                                xan.Lxb(true);
                            }
                            if (view2 != null) {
                            }
                            if (activityLxb == null) {
                                context = this.ZU;
                            } else {
                                context = activityLxb;
                            }
                            if (com.bytedance.sdk.openadsdk.core.model.kqm.lk(((LD) this).lc)) {
                                boolean zLxb8 = xan.Lxb(context, ((LD) this).lc, this.OY, this.NXR, this.brP, ((LD) this).ebl, this.VVE, true, iLRt);
                                xan.Lxb(false);
                                z3 = zLxb8;
                            } else {
                                boolean zLxb9 = xan.Lxb(context, ((LD) this).lc, this.OY, this.NXR, this.brP, ((LD) this).ebl, this.VVE, true, iLRt);
                                xan.Lxb(false);
                                z3 = zLxb9;
                            }
                            if (this.Lxb) {
                                tD tDVar15 = ((LD) this).lc;
                                nBu nbu14 = this.JVA;
                                String str15 = ((LD) this).ebl;
                                Map<String, Object> map15 = this.kqm;
                                if (z) {
                                    i3 = 1;
                                } else {
                                    i3 = 2;
                                }
                                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(CampaignEx.JSON_NATIVE_VIDEO_CLICK, tDVar15, nbu14, str15, z3, map15, i3);
                            }
                        }
                    } else {
                        if (this.NXR == null) {
                            tD tDVar16 = ((LD) this).lc;
                            nBu nbu15 = this.JVA;
                            String str16 = ((LD) this).ebl;
                            Map<String, Object> map16 = this.kqm;
                            if (z) {
                                i2 = 1;
                            } else {
                                i2 = 2;
                            }
                            com.bytedance.sdk.openadsdk.ZU.lk.Lxb("click_button", tDVar16, nbu15, str16, true, map16, i2);
                        } else {
                            tD tDVar17 = ((LD) this).lc;
                            nBu nbu16 = this.JVA;
                            String str17 = ((LD) this).ebl;
                            Map<String, Object> map17 = this.kqm;
                            if (z) {
                                i2 = 1;
                            } else {
                                i2 = 2;
                            }
                            com.bytedance.sdk.openadsdk.ZU.lk.Lxb("click_button", tDVar17, nbu16, str17, true, map17, i2);
                        }
                        if (view2 != null) {
                            if (view.getId() != 520093726) {
                            }
                            xan.Lxb(true);
                        } else if (((Boolean) view2.getTag(520093762)).booleanValue()) {
                            xan.Lxb(true);
                        }
                        if (view2 != null) {
                        }
                        if (activityLxb == null) {
                            context = this.ZU;
                        } else {
                            context = activityLxb;
                        }
                        if (com.bytedance.sdk.openadsdk.core.model.kqm.lk(((LD) this).lc)) {
                            boolean zLxb10 = xan.Lxb(context, ((LD) this).lc, this.OY, this.NXR, this.brP, ((LD) this).ebl, this.VVE, true, iLRt);
                            xan.Lxb(false);
                            z3 = zLxb10;
                        } else {
                            boolean zLxb11 = xan.Lxb(context, ((LD) this).lc, this.OY, this.NXR, this.brP, ((LD) this).ebl, this.VVE, true, iLRt);
                            xan.Lxb(false);
                            z3 = zLxb11;
                        }
                        if (this.Lxb) {
                            tD tDVar18 = ((LD) this).lc;
                            nBu nbu17 = this.JVA;
                            String str18 = ((LD) this).ebl;
                            Map<String, Object> map18 = this.kqm;
                            if (z) {
                                i3 = 1;
                            } else {
                                i3 = 2;
                            }
                            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(CampaignEx.JSON_NATIVE_VIDEO_CLICK, tDVar18, nbu17, str18, z3, map18, i3);
                        }
                    }
                }
            } else if (!eK.LD(((LD) this).lc) || (this.NXR == null && this.brP == null)) {
                view2 = view;
                com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc lcVar2 = this.VVE;
                if (lcVar2 != null) {
                    lcVar2.ZU();
                    Map<String, Object> map19 = this.kqm;
                    if (((LD) this).lc.JXs() && !((LD) this).lc.ZU()) {
                        map19.put("auto_click", Boolean.TRUE);
                        ((LD) this).lc.LD(false);
                    }
                    if (this.Lxb) {
                        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(CampaignEx.JSON_NATIVE_VIDEO_CLICK, ((LD) this).lc, this.JVA, ((LD) this).ebl, true, map19, z ? 1 : 2);
                    }
                }
            } else {
                view2 = view;
                activityLxb = view2 != null ? com.bytedance.sdk.component.utils.LD.Lxb(view) : null;
                boolean zLxb12 = xan.Lxb(activityLxb == null ? this.ZU : activityLxb, ((LD) this).lc, this.OY, this.NXR, this.brP, ((LD) this).ebl, this.VVE, true, iLRt);
                if (this.Lxb) {
                    com.bytedance.sdk.openadsdk.ZU.lk.Lxb(CampaignEx.JSON_NATIVE_VIDEO_CLICK, ((LD) this).lc, this.JVA, ((LD) this).ebl, zLxb12, this.kqm, z ? 1 : 2);
                }
            }
            LD.Lxb lxb = this.sLN;
            if (lxb != null) {
                lxb.Lxb(view2, iSRq);
            }
        }
    }

    public void lk(boolean z) {
        this.lk = z;
    }

    private String LD(String str) {
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

    public void ZU(boolean z) {
        this.le = z;
    }

    public boolean Lxb() {
        tD tDVar = ((LD) this).lc;
        if (tDVar == null) {
            return true;
        }
        int iLD = kqm.ZU().LD(tDVar.Td());
        int iLk = IeN.lk(kqm.Lxb());
        if (iLD == 1) {
            return nJ.ZU(iLk);
        }
        if (iLD == 2) {
            return nJ.JXs(iLk) || nJ.ZU(iLk) || nJ.lc(iLk);
        }
        if (iLD != 3) {
            return iLD != 5 || nJ.ZU(iLk) || nJ.lc(iLk);
        }
        return false;
    }

    public void Lxb(InterfaceC0093Lxb interfaceC0093Lxb) {
        this.nJ = new WeakReference<>(interfaceC0093Lxb);
    }
}
