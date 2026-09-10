package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class QAg {
    private boolean IeN;
    private JSONObject JVA;
    private sLN JXs;
    private JSONObject LD;
    private Context Lxb;
    private JXs OY;
    private String QAg;
    private com.bytedance.adsdk.ugeno.ZU.Lxb.Lxb STP;
    private List<String> VVE;
    private lc ZU;
    private NXR ebl;
    private IeN lc;
    private com.bytedance.adsdk.ugeno.LD.lk<View> lk;
    private OY nBu;
    private boolean sLN = true;
    private boolean NXR = false;

    public QAg(Context context) {
        this.Lxb = context;
    }

    public com.bytedance.adsdk.ugeno.LD.lk<View> LD(JXs.Lxb lxb, com.bytedance.adsdk.ugeno.LD.lk<View> lkVar) {
        List<JXs.Lxb> listLk;
        com.bytedance.adsdk.ugeno.LD.Lxb.C0029Lxb c0029LxbLk = null;
        if (!JXs.Lxb(lxb)) {
            return null;
        }
        String strLk = lxb.lk();
        LD ldLxb = ZU.Lxb(strLk);
        if (ldLxb == null) {
            "not found component ".concat(String.valueOf(strLk));
            this.IeN = true;
            if (this.VVE == null) {
                this.VVE = new ArrayList();
            }
            this.VVE.add(strLk);
            return null;
        }
        com.bytedance.adsdk.ugeno.LD.lk lkVarLxb = ldLxb.Lxb(this.Lxb);
        if (lkVarLxb == null) {
            return null;
        }
        lkVarLxb.JXs(com.bytedance.adsdk.ugeno.lk.LD.Lxb(lxb.Lxb(), this.LD));
        lkVarLxb.lc(strLk);
        lkVarLxb.LD(lxb.ZU());
        lkVarLxb.Lxb(lxb);
        lkVarLxb.Lxb(this.nBu);
        if (lkVar instanceof com.bytedance.adsdk.ugeno.LD.Lxb) {
            com.bytedance.adsdk.ugeno.LD.Lxb lxb2 = (com.bytedance.adsdk.ugeno.LD.Lxb) lkVar;
            lkVarLxb.Lxb(lxb2);
            c0029LxbLk = lxb2.lk();
        }
        Iterator<String> itKeys = lxb.ZU().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strLxb = com.bytedance.adsdk.ugeno.lk.LD.Lxb(lxb.ZU().optString(next), this.LD);
            lkVarLxb.Lxb(next, strLxb);
            if (c0029LxbLk != null) {
                c0029LxbLk.Lxb(this.Lxb, next, strLxb);
            }
        }
        if (lkVarLxb instanceof com.bytedance.adsdk.ugeno.LD.Lxb) {
            List<JXs.Lxb> listJXs = lxb.JXs();
            if (listJXs == null || listJXs.size() <= 0) {
                if (TextUtils.equals(lkVarLxb.xan(), "RecyclerLayout") && (listLk = this.OY.lk()) != null && listLk.size() > 0) {
                    Iterator<JXs.Lxb> it = listLk.iterator();
                    while (it.hasNext()) {
                        com.bytedance.adsdk.ugeno.LD.lk<View> lkVarLD = LD(it.next(), lkVarLxb);
                        if (lkVarLD != null && lkVarLD.nJ()) {
                            ((com.bytedance.adsdk.ugeno.LD.Lxb) lkVarLxb).Lxb(lkVarLD);
                        }
                    }
                }
                return lkVarLxb;
            }
            if (TextUtils.equals(lkVarLxb.xan(), "Swiper")) {
                listJXs.size();
            }
            Iterator<JXs.Lxb> it2 = listJXs.iterator();
            while (it2.hasNext()) {
                com.bytedance.adsdk.ugeno.LD.lk<View> lkVarLD2 = LD(it2.next(), lkVarLxb);
                if (lkVarLD2 != null && lkVarLD2.nJ()) {
                    ((com.bytedance.adsdk.ugeno.LD.Lxb) lkVarLxb).Lxb(lkVarLD2);
                }
            }
        }
        if (c0029LxbLk != null) {
            lkVarLxb.Lxb(c0029LxbLk.Lxb());
        }
        this.lk = lkVarLxb;
        return lkVarLxb;
    }

    public void Lxb(String str, OY oy) {
        this.nBu = oy;
        this.QAg = str;
        if (oy != null) {
            this.LD = oy.Lxb();
        }
    }

    public com.bytedance.adsdk.ugeno.LD.lk<View> Lxb(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.LD = jSONObject2;
        IeN ieN = this.lc;
        if (ieN != null) {
            ieN.Lxb();
        }
        this.OY = new JXs(jSONObject, jSONObject2, jSONObject3);
        this.STP = new com.bytedance.adsdk.ugeno.ZU.Lxb.Lxb();
        sLN sln = this.JXs;
        if (sln instanceof com.bytedance.adsdk.ugeno.core.Lxb.Lxb) {
            ((com.bytedance.adsdk.ugeno.core.Lxb.Lxb) sln).Lxb(this.OY.LD());
        }
        this.lk = Lxb(this.OY.Lxb(), (com.bytedance.adsdk.ugeno.LD.lk<View>) null);
        IeN ieN2 = this.lc;
        if (ieN2 != null) {
            ieN2.LD();
            this.lk.Lxb(this.lc);
        }
        Lxb(this.lk);
        return this.lk;
    }

    public com.bytedance.adsdk.ugeno.LD.lk<View> Lxb(JXs.Lxb lxb, com.bytedance.adsdk.ugeno.LD.lk<View> lkVar) {
        LD ld;
        List<JXs.Lxb> listLk;
        com.bytedance.adsdk.ugeno.LD.Lxb.C0029Lxb c0029LxbLk = null;
        if (!JXs.Lxb(lxb)) {
            return null;
        }
        String strLk = lxb.lk();
        LD ldLxb = ZU.Lxb(strLk);
        if (ldLxb == null) {
            this.IeN = true;
            if (this.VVE == null) {
                ld = ldLxb;
                this.VVE = new ArrayList();
            }
            ld = ldLxb;
            this.VVE.add(strLk);
            strLk = "View";
            lxb.Lxb("View");
            LD ldLxb2 = ZU.Lxb("View");
            ld = ldLxb2;
            if (ldLxb2 == null) {
                "not found component ".concat("View");
                return null;
            }
        }
        ld = ldLxb;
        com.bytedance.adsdk.ugeno.LD.lk lkVarLxb = ld.Lxb(this.Lxb);
        if (lkVarLxb == null) {
            return null;
        }
        JSONObject jSONObjectZU = lxb.ZU();
        lkVarLxb.JXs(com.bytedance.adsdk.ugeno.lk.LD.Lxb(lxb.Lxb(), this.LD));
        lkVarLxb.lc(strLk);
        lkVarLxb.LD(jSONObjectZU);
        lkVarLxb.Lxb(lxb);
        lkVarLxb.Lxb(this.OY.ZU());
        lkVarLxb.Lxb(this.nBu);
        lkVarLxb.Lxb(this.STP);
        Iterator<String> itKeys = jSONObjectZU.keys();
        if (lkVar instanceof com.bytedance.adsdk.ugeno.LD.Lxb) {
            com.bytedance.adsdk.ugeno.LD.Lxb lxb2 = (com.bytedance.adsdk.ugeno.LD.Lxb) lkVar;
            c0029LxbLk = lxb2.lk();
            lkVarLxb.Lxb(lxb2);
        }
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strLxb = com.bytedance.adsdk.ugeno.lk.LD.Lxb(jSONObjectZU.optString(next), this.LD);
            lkVarLxb.Lxb(next, strLxb);
            if (c0029LxbLk != null) {
                c0029LxbLk.Lxb(this.Lxb, next, strLxb);
            }
        }
        if (c0029LxbLk != null) {
            lkVarLxb.Lxb(c0029LxbLk.Lxb());
        }
        if (lkVarLxb instanceof com.bytedance.adsdk.ugeno.LD.Lxb) {
            List<JXs.Lxb> listJXs = lxb.JXs();
            if (listJXs != null && listJXs.size() > 0) {
                if (TextUtils.equals(lkVarLxb.xan(), "Swiper")) {
                    listJXs.size();
                }
                Iterator<JXs.Lxb> it = listJXs.iterator();
                while (it.hasNext()) {
                    com.bytedance.adsdk.ugeno.LD.lk<View> lkVarLxb2 = Lxb(it.next(), (com.bytedance.adsdk.ugeno.LD.lk<View>) lkVarLxb);
                    if (lkVarLxb2 != null && !lkVarLxb2.sRq()) {
                        ((com.bytedance.adsdk.ugeno.LD.Lxb) lkVarLxb).Lxb(lkVarLxb2, lkVarLxb2.CSn());
                    }
                }
            } else {
                if (TextUtils.equals(lkVarLxb.xan(), "RecyclerLayout") && (listLk = this.OY.lk()) != null && listLk.size() > 0) {
                    Iterator<JXs.Lxb> it2 = listLk.iterator();
                    while (it2.hasNext()) {
                        com.bytedance.adsdk.ugeno.LD.lk<View> lkVarLxb3 = Lxb(it2.next(), (com.bytedance.adsdk.ugeno.LD.lk<View>) lkVarLxb);
                        if (lkVarLxb3 != null && lkVarLxb3.nJ()) {
                            ((com.bytedance.adsdk.ugeno.LD.Lxb) lkVarLxb).Lxb(lkVarLxb3);
                        }
                    }
                }
                return lkVarLxb;
            }
        }
        this.lk = lkVarLxb;
        return lkVarLxb;
    }

    public void LD(JSONObject jSONObject) {
        IeN ieN = this.lc;
        if (ieN != null) {
            ieN.lk();
        }
        this.LD = jSONObject;
        Lxb(this.lk, jSONObject);
        Lxb(this.lk);
        if (this.lc != null) {
            STP stp = new STP();
            stp.Lxb(0);
            stp.Lxb(this.lk);
            this.lc.Lxb(stp);
        }
    }

    private void LD(com.bytedance.adsdk.ugeno.LD.lk lkVar) {
        try {
            if (!lkVar.KPU() || lkVar.foI() == null || lkVar.foI().lc() == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("i18n", lkVar.foI().lc());
            this.LD.put("xNode", jSONObject);
        } catch (Exception unused) {
        }
    }

    public List<String> LD() {
        return this.VVE;
    }

    public com.bytedance.adsdk.ugeno.LD.lk<View> Lxb(JSONObject jSONObject) {
        IeN ieN = this.lc;
        if (ieN != null) {
            ieN.Lxb();
        }
        JXs jXs = new JXs(jSONObject, this.LD);
        this.OY = jXs;
        sLN sln = this.JXs;
        if (sln instanceof com.bytedance.adsdk.ugeno.core.Lxb.Lxb) {
            ((com.bytedance.adsdk.ugeno.core.Lxb.Lxb) sln).Lxb(jXs.LD());
        }
        this.lk = LD(this.OY.Lxb(), null);
        IeN ieN2 = this.lc;
        if (ieN2 != null) {
            ieN2.LD();
            this.lk.Lxb(this.lc);
        }
        return this.lk;
    }

    public void Lxb(com.bytedance.adsdk.ugeno.LD.lk lkVar, JSONObject jSONObject) {
        if (lkVar == null) {
            return;
        }
        if (lkVar instanceof com.bytedance.adsdk.ugeno.LD.Lxb) {
            lkVar.Lxb(jSONObject);
            List<com.bytedance.adsdk.ugeno.LD.lk<View>> listLxb = ((com.bytedance.adsdk.ugeno.LD.Lxb) lkVar).Lxb();
            if (listLxb == null || listLxb.size() <= 0) {
                return;
            }
            Iterator<com.bytedance.adsdk.ugeno.LD.lk<View>> it = listLxb.iterator();
            while (it.hasNext()) {
                Lxb(it.next(), jSONObject);
            }
            return;
        }
        lkVar.Lxb(jSONObject);
    }

    private void Lxb(com.bytedance.adsdk.ugeno.LD.lk<View> lkVar) {
        List<com.bytedance.adsdk.ugeno.LD.lk<View>> listLxb;
        if (lkVar == null) {
            return;
        }
        JSONObject jSONObjectHD = lkVar.HD();
        Iterator<String> itKeys = jSONObjectHD.keys();
        com.bytedance.adsdk.ugeno.LD.Lxb lxbIvz = lkVar.Ivz();
        com.bytedance.adsdk.ugeno.LD.Lxb.C0029Lxb c0029LxbLk = lxbIvz != null ? lxbIvz.lk() : null;
        LD(lkVar);
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strLxb = com.bytedance.adsdk.ugeno.lk.LD.Lxb(jSONObjectHD.optString(next), this.LD);
            lkVar.Lxb(next, strLxb);
            if (c0029LxbLk != null) {
                c0029LxbLk.Lxb(this.Lxb, next, strLxb);
            }
        }
        lkVar.Lxb(this.ZU);
        lkVar.Lxb(this.JXs);
        lkVar.Lxb(this.ebl);
        if ((lkVar instanceof com.bytedance.adsdk.ugeno.LD.Lxb) && (listLxb = ((com.bytedance.adsdk.ugeno.LD.Lxb) lkVar).Lxb()) != null && listLxb.size() > 0) {
            Iterator<com.bytedance.adsdk.ugeno.LD.lk<View>> it = listLxb.iterator();
            while (it.hasNext()) {
                Lxb(it.next());
            }
        }
        if (c0029LxbLk != null) {
            lkVar.Lxb(c0029LxbLk.Lxb());
        }
        lkVar.LD();
    }

    public void Lxb(sLN sln) {
        com.bytedance.adsdk.ugeno.core.Lxb.Lxb lxb = new com.bytedance.adsdk.ugeno.core.Lxb.Lxb(sln);
        lxb.Lxb(this.JVA);
        lxb.Lxb(this.sLN);
        lxb.LD(this.NXR);
        JXs jXs = this.OY;
        if (jXs != null) {
            lxb.Lxb(jXs.LD());
        }
        this.JXs = lxb;
    }

    public void Lxb(NXR nxr) {
        this.ebl = nxr;
    }

    public boolean Lxb() {
        return this.IeN;
    }
}
