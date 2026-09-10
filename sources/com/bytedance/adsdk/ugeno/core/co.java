package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.ironsource.C3700q2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class co {
    private jbs ac;
    private com.bytedance.adsdk.ugeno.ka.ri.ri bgr;
    private fi bu;
    private nr di;
    private vr fi;
    private com.bytedance.adsdk.ugeno.lr.ik<View> ik;
    private xha jbs;
    private mj ka;
    private JSONObject lr;
    private com.bytedance.adsdk.ugeno.ka.aw mj;
    private float nr;
    private String qt;
    private Context ri;
    private sf sf;
    private List<String> slm;
    private float tan;
    private boolean vr;
    private slm xha;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private boolean f18010co = true;
    private boolean aw = false;

    public co(Context context) {
        this.ri = context;
    }

    public com.bytedance.adsdk.ugeno.lr.ik<View> lr(xha.ri riVar, com.bytedance.adsdk.ugeno.lr.ik<View> ikVar) {
        List<xha.ri> listIk;
        com.bytedance.adsdk.ugeno.lr.ri.C0193ri c0193riQt = null;
        if (!xha.ka(riVar)) {
            return null;
        }
        String strIk = riVar.ik();
        lr lrVarRi = ka.ri(strIk);
        if (lrVarRi == null) {
            "not found component ".concat(String.valueOf(strIk));
            this.vr = true;
            if (this.slm == null) {
                this.slm = new ArrayList();
            }
            this.slm.add(strIk);
            return null;
        }
        com.bytedance.adsdk.ugeno.lr.ik ikVarRi = lrVarRi.ri(this.ri);
        if (ikVarRi == null) {
            return null;
        }
        ikVarRi.jbs(com.bytedance.adsdk.ugeno.ik.lr.ri(riVar.ri(), this.lr));
        ikVarRi.qt(strIk);
        ikVarRi.ik(riVar.ka());
        ikVarRi.ri(riVar);
        ikVarRi.ri(this.sf);
        if (ikVar instanceof com.bytedance.adsdk.ugeno.lr.ri) {
            com.bytedance.adsdk.ugeno.lr.ri riVar2 = (com.bytedance.adsdk.ugeno.lr.ri) ikVar;
            ikVarRi.ri(riVar2);
            c0193riQt = riVar2.qt();
        }
        Iterator<String> itKeys = riVar.ka().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strRi = com.bytedance.adsdk.ugeno.ik.lr.ri(riVar.ka().optString(next), this.lr);
            ikVarRi.ri(next, strRi);
            if (c0193riQt != null) {
                c0193riQt.ri(this.ri, next, strRi);
            }
        }
        if (ikVarRi instanceof com.bytedance.adsdk.ugeno.lr.ri) {
            List<xha.ri> listFi = riVar.fi();
            if (listFi == null || listFi.size() <= 0) {
                if (TextUtils.equals(ikVarRi.dzy(), "RecyclerLayout") && (listIk = this.jbs.ik()) != null && listIk.size() > 0) {
                    Iterator<xha.ri> it = listIk.iterator();
                    while (it.hasNext()) {
                        com.bytedance.adsdk.ugeno.lr.ik<View> ikVarLr = lr(it.next(), (com.bytedance.adsdk.ugeno.lr.ik<View>) ikVarRi);
                        if (ikVarLr != null && ikVarLr.qd()) {
                            ((com.bytedance.adsdk.ugeno.lr.ri) ikVarRi).ri(ikVarLr);
                        }
                    }
                }
                return ikVarRi;
            }
            if (TextUtils.equals(ikVarRi.dzy(), "Swiper")) {
                listFi.size();
            }
            Iterator<xha.ri> it2 = listFi.iterator();
            while (it2.hasNext()) {
                com.bytedance.adsdk.ugeno.lr.ik<View> ikVarLr2 = lr(it2.next(), (com.bytedance.adsdk.ugeno.lr.ik<View>) ikVarRi);
                if (ikVarLr2 != null && ikVarLr2.qd()) {
                    ((com.bytedance.adsdk.ugeno.lr.ri) ikVarRi).ri(ikVarLr2);
                }
            }
        }
        if (c0193riQt != null) {
            ikVarRi.ri(c0193riQt.ri());
        }
        this.ik = ikVarRi;
        return ikVarRi;
    }

    public void ri(String str, sf sfVar) {
        this.sf = sfVar;
        this.qt = str;
        if (sfVar != null) {
            this.lr = sfVar.ri();
        }
    }

    public com.bytedance.adsdk.ugeno.lr.ik<View> ri(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.lr = jSONObject2;
        nr nrVar = this.di;
        if (nrVar != null) {
            nrVar.ri();
        }
        xha xhaVar = new xha(jSONObject, jSONObject2, jSONObject3);
        this.jbs = xhaVar;
        xhaVar.ri(this.nr, this.tan);
        this.bgr = new com.bytedance.adsdk.ugeno.ka.ri.ri();
        if (!(this.fi instanceof com.bytedance.adsdk.ugeno.core.ri.lr)) {
            this.ik = ri(this.jbs.ri(), (com.bytedance.adsdk.ugeno.lr.ik<View>) null);
            if (this.ac == null) {
                nr nrVar2 = this.di;
                if (nrVar2 != null) {
                    nrVar2.lr();
                    this.ik.ri(this.di);
                    this.di.ik();
                }
                ri(this.ik);
                if (this.di != null) {
                    bu buVar = new bu();
                    buVar.ri(0);
                    buVar.ri(this.ik);
                    this.di.ri(buVar);
                }
                return this.ik;
            }
            throw null;
        }
        this.jbs.lr();
        throw null;
    }

    public com.bytedance.adsdk.ugeno.lr.ik<View> ri(xha.ri riVar, JSONObject jSONObject, JSONObject jSONObject2) {
        this.lr = jSONObject;
        nr nrVar = this.di;
        if (nrVar != null) {
            nrVar.ri();
        }
        this.bgr = new com.bytedance.adsdk.ugeno.ka.ri.ri();
        if (!(this.fi instanceof com.bytedance.adsdk.ugeno.core.ri.lr)) {
            this.ik = ri(riVar, (com.bytedance.adsdk.ugeno.lr.ik<View>) null);
            nr nrVar2 = this.di;
            if (nrVar2 != null) {
                nrVar2.lr();
                this.ik.ri(this.di);
            }
            ri(this.ik);
            return this.ik;
        }
        throw null;
    }

    public com.bytedance.adsdk.ugeno.lr.ik<View> ri(xha.ri riVar, com.bytedance.adsdk.ugeno.lr.ik<View> ikVar) {
        lr lrVar;
        com.bytedance.adsdk.ugeno.lr.ri.C0193ri c0193riQt;
        List<xha.ri> listIk;
        if (!xha.ka(riVar)) {
            return null;
        }
        String strIk = riVar.ik();
        lr lrVarRi = ka.ri(strIk);
        if (lrVarRi == null) {
            this.vr = true;
            if (this.slm == null) {
                lrVar = lrVarRi;
                this.slm = new ArrayList();
            }
            lrVar = lrVarRi;
            this.slm.add(strIk);
            strIk = "View";
            riVar.ri("View");
            lr lrVarRi2 = ka.ri("View");
            lrVar = lrVarRi2;
            if (lrVarRi2 == null) {
                "not found component ".concat("View");
                return null;
            }
        }
        lrVar = lrVarRi;
        com.bytedance.adsdk.ugeno.lr.ik ikVarRi = lrVar.ri(this.ri);
        if (ikVarRi == null) {
            return null;
        }
        JSONObject jSONObjectKa = riVar.ka();
        ikVarRi.jbs(com.bytedance.adsdk.ugeno.ik.lr.ri(riVar.ri(), this.lr));
        ikVarRi.qt(strIk);
        ikVarRi.ik(jSONObjectKa);
        ikVarRi.ri(riVar);
        ikVarRi.lr(this.lr);
        xha xhaVar = this.jbs;
        if (xhaVar == null) {
            ikVarRi.ri(true);
        } else {
            ikVarRi.ri(xhaVar.ka());
        }
        ikVarRi.ri(this.sf);
        ikVarRi.ri(this.bgr);
        Iterator<String> itKeys = jSONObjectKa.keys();
        if (ikVar instanceof com.bytedance.adsdk.ugeno.lr.ri) {
            com.bytedance.adsdk.ugeno.lr.ri riVar2 = (com.bytedance.adsdk.ugeno.lr.ri) ikVar;
            c0193riQt = riVar2.qt();
            ikVarRi.ri(riVar2);
        } else {
            c0193riQt = null;
        }
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strRi = com.bytedance.adsdk.ugeno.ik.lr.ri(jSONObjectKa.optString(next), this.lr);
            ikVarRi.ri(next, strRi);
            if (this.ac != null) {
                throw null;
            }
            if (c0193riQt != null) {
                c0193riQt.ri(this.ri, next, strRi);
            }
        }
        if (c0193riQt != null) {
            ikVarRi.ri(c0193riQt.ri());
        }
        if (ikVarRi instanceof com.bytedance.adsdk.ugeno.lr.ri) {
            List<xha.ri> listFi = riVar.fi();
            if (listFi != null && listFi.size() > 0) {
                if (TextUtils.equals(ikVarRi.dzy(), "Swiper")) {
                    listFi.size();
                }
                try {
                    Collections.sort(listFi, new Comparator<xha.ri>() { // from class: com.bytedance.adsdk.ugeno.core.co.1
                        @Override // java.util.Comparator
                        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
                        public int compare(xha.ri riVar3, xha.ri riVar4) {
                            return riVar3.ka().optInt(C3700q2.u, 0) - riVar4.ka().optInt(C3700q2.u, 0);
                        }
                    });
                } catch (Throwable unused) {
                }
                Iterator<xha.ri> it = listFi.iterator();
                while (it.hasNext()) {
                    com.bytedance.adsdk.ugeno.lr.ik<View> ikVarRi2 = ri(it.next(), (com.bytedance.adsdk.ugeno.lr.ik<View>) ikVarRi);
                    if (ikVarRi2 != null && !ikVarRi2.siy()) {
                        ((com.bytedance.adsdk.ugeno.lr.ri) ikVarRi).ri(ikVarRi2, ikVarRi2.dw());
                    }
                }
            } else {
                if (TextUtils.equals(ikVarRi.dzy(), "RecyclerLayout") && (listIk = this.jbs.ik()) != null && listIk.size() > 0) {
                    Iterator<xha.ri> it2 = listIk.iterator();
                    while (it2.hasNext()) {
                        com.bytedance.adsdk.ugeno.lr.ik<View> ikVarRi3 = ri(it2.next(), (com.bytedance.adsdk.ugeno.lr.ik<View>) ikVarRi);
                        if (ikVarRi3 != null && ikVarRi3.qd()) {
                            ((com.bytedance.adsdk.ugeno.lr.ri) ikVarRi).ri(ikVarRi3);
                        }
                    }
                }
                return ikVarRi;
            }
        }
        this.ik = ikVarRi;
        return ikVarRi;
    }

    public void lr(JSONObject jSONObject) {
        nr nrVar = this.di;
        if (nrVar != null) {
            nrVar.ik();
        }
        this.lr = jSONObject;
        ri(this.ik, jSONObject);
        ri(this.ik);
        if (this.di != null) {
            bu buVar = new bu();
            buVar.ri(0);
            buVar.ri(this.ik);
            this.di.ri(buVar);
        }
    }

    private void lr(com.bytedance.adsdk.ugeno.lr.ik ikVar) {
        try {
            if (!ikVar.hcw() || ikVar.ory() == null || ikVar.ory().di() == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("i18n", ikVar.ory().di());
            this.lr.put("xNode", jSONObject);
        } catch (Exception unused) {
        }
    }

    public List<String> lr() {
        return this.slm;
    }

    private void lr(JSONObject jSONObject, com.bytedance.adsdk.ugeno.lr.ik ikVar) {
        List<com.bytedance.adsdk.ugeno.lr.ik<View>> listJbs;
        if (ikVar == null) {
            return;
        }
        this.lr = jSONObject;
        ikVar.lr(jSONObject);
        ikVar.ri(this.sf);
        com.bytedance.adsdk.ugeno.lr.ri.C0193ri c0193riQt = ikVar.oh() != null ? ikVar.oh().qt() : null;
        Iterator<String> itKeys = ikVar.su().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strRi = com.bytedance.adsdk.ugeno.ik.lr.ri(ikVar.su().optString(next), jSONObject);
            ikVar.ri(next, strRi);
            if (c0193riQt != null) {
                c0193riQt.ri(this.ri, next, strRi);
            }
        }
        if ((ikVar instanceof com.bytedance.adsdk.ugeno.lr.ri) && (listJbs = ((com.bytedance.adsdk.ugeno.lr.ri) ikVar).jbs()) != null && !listJbs.isEmpty()) {
            Iterator<com.bytedance.adsdk.ugeno.lr.ik<View>> it = listJbs.iterator();
            while (it.hasNext()) {
                lr(jSONObject, it.next());
            }
        }
        if (c0193riQt != null) {
            ikVar.ri(c0193riQt.ri());
        }
    }

    public com.bytedance.adsdk.ugeno.lr.ik<View> ri(JSONObject jSONObject) {
        nr nrVar = this.di;
        if (nrVar != null) {
            nrVar.ri();
        }
        xha xhaVar = new xha(jSONObject, this.lr);
        this.jbs = xhaVar;
        if (!(this.fi instanceof com.bytedance.adsdk.ugeno.core.ri.lr)) {
            this.ik = lr(xhaVar.ri(), (com.bytedance.adsdk.ugeno.lr.ik<View>) null);
            nr nrVar2 = this.di;
            if (nrVar2 != null) {
                nrVar2.lr();
                this.ik.ri(this.di);
            }
            return this.ik;
        }
        xhaVar.lr();
        throw null;
    }

    public void ri(com.bytedance.adsdk.ugeno.lr.ik ikVar, JSONObject jSONObject) {
        if (ikVar == null) {
            return;
        }
        if (ikVar instanceof com.bytedance.adsdk.ugeno.lr.ri) {
            ikVar.ri(jSONObject);
            List<com.bytedance.adsdk.ugeno.lr.ik<View>> listJbs = ((com.bytedance.adsdk.ugeno.lr.ri) ikVar).jbs();
            if (listJbs == null || listJbs.size() <= 0) {
                return;
            }
            Iterator<com.bytedance.adsdk.ugeno.lr.ik<View>> it = listJbs.iterator();
            while (it.hasNext()) {
                ri(it.next(), jSONObject);
            }
            return;
        }
        ikVar.ri(jSONObject);
    }

    private void ri(com.bytedance.adsdk.ugeno.lr.ik<View> ikVar) {
        List<com.bytedance.adsdk.ugeno.lr.ik<View>> listJbs;
        if (ikVar == null) {
            return;
        }
        JSONObject jSONObjectSu = ikVar.su();
        Iterator<String> itKeys = jSONObjectSu.keys();
        com.bytedance.adsdk.ugeno.lr.ri riVarOh = ikVar.oh();
        com.bytedance.adsdk.ugeno.lr.ri.C0193ri c0193riQt = riVarOh != null ? riVarOh.qt() : null;
        lr(ikVar);
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strRi = com.bytedance.adsdk.ugeno.ik.lr.ri(jSONObjectSu.optString(next), this.lr);
            ikVar.ri(next, strRi);
            if (c0193riQt != null) {
                c0193riQt.ri(this.ri, next, strRi);
            }
        }
        ikVar.ri(this.ka);
        ikVar.ri(this.fi);
        ikVar.ri(this.xha);
        jbs jbsVar = this.ac;
        if (jbsVar != null) {
            ikVar.ri(jbsVar);
        }
        fi fiVar = this.bu;
        if (fiVar != null) {
            ikVar.ri(fiVar);
        }
        com.bytedance.adsdk.ugeno.ka.aw awVar = this.mj;
        if (awVar != null) {
            ikVar.ri(awVar);
        }
        if ((ikVar instanceof com.bytedance.adsdk.ugeno.lr.ri) && (listJbs = ((com.bytedance.adsdk.ugeno.lr.ri) ikVar).jbs()) != null && listJbs.size() > 0) {
            Iterator<com.bytedance.adsdk.ugeno.lr.ik<View>> it = listJbs.iterator();
            while (it.hasNext()) {
                ri(it.next());
            }
        }
        if (c0193riQt != null) {
            ikVar.ri(c0193riQt.ri());
        }
        ikVar.lr();
    }

    public void ri(vr vrVar) {
        com.bytedance.adsdk.ugeno.core.ri.ri riVarFi = com.bytedance.adsdk.ugeno.fi.ri().fi();
        if (riVarFi == null) {
            this.fi = vrVar;
        } else {
            if (riVarFi.ri(vrVar) == null) {
                this.fi = vrVar;
                return;
            }
            throw null;
        }
    }

    public void ri(slm slmVar) {
        this.xha = slmVar;
    }

    public void ri(com.bytedance.adsdk.ugeno.lr.ik ikVar, String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.lr.ik<View>> listJbs;
        if (ikVar == null) {
            return;
        }
        ikVar.ri(str, objArr);
        if (!(ikVar instanceof com.bytedance.adsdk.ugeno.lr.ri) || (listJbs = ((com.bytedance.adsdk.ugeno.lr.ri) ikVar).jbs()) == null || listJbs.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.adsdk.ugeno.lr.ik<View>> it = listJbs.iterator();
        while (it.hasNext()) {
            ri(it.next(), str, objArr);
        }
    }

    public boolean ri() {
        return this.vr;
    }

    public void ri(fi fiVar) {
        this.bu = fiVar;
    }

    public void ri(JSONObject jSONObject, com.bytedance.adsdk.ugeno.lr.ik ikVar) {
        lr(jSONObject, ikVar);
        ri((com.bytedance.adsdk.ugeno.lr.ik<View>) ikVar);
    }

    public void ri(com.bytedance.adsdk.ugeno.ka.aw awVar) {
        this.mj = awVar;
    }
}
