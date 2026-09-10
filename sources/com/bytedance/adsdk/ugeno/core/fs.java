package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.p004ironsource.m5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class fs {
    private tvp aaj;
    private boolean bjy;
    private float exc;
    private float jl;
    private com.bytedance.adsdk.ugeno.mml.exu jpc;
    private List<String> jtx;
    private com.bytedance.adsdk.ugeno.ud.lnr<View> lnr;
    private jpc mml;
    private jl mo;
    private bjy mzz;
    private Context qdl;
    private com.bytedance.adsdk.ugeno.mml.qdl.qdl rdp;
    private rq rq;
    private String to;
    private wd tvp;
    private JSONObject ud;
    private jtx wd;
    private mzz yt;
    private boolean fs = true;
    private boolean exu = false;

    public fs(Context context) {
        this.qdl = context;
    }

    public void qdl(String str, rq rqVar) {
        this.rq = rqVar;
        this.to = str;
        if (rqVar != null) {
            this.ud = rqVar.qdl();
        }
    }

    public com.bytedance.adsdk.ugeno.ud.lnr<View> ud(wd.qdl qdlVar, com.bytedance.adsdk.ugeno.ud.lnr<View> lnrVar) {
        List<wd.qdl> listLnr;
        com.bytedance.adsdk.ugeno.ud.qdl.C0070qdl c0070qdl = null;
        if (!wd.mml(qdlVar)) {
            return null;
        }
        String strLnr = qdlVar.lnr();
        ud udVarQdl = mml.qdl(strLnr);
        if (udVarQdl == null) {
            Log.d("UGTemplateEngine", "not found component ".concat(String.valueOf(strLnr)));
            this.bjy = true;
            if (this.jtx == null) {
                this.jtx = new ArrayList();
            }
            this.jtx.add(strLnr);
            return null;
        }
        com.bytedance.adsdk.ugeno.ud.lnr lnrVarQdl = udVarQdl.qdl(this.qdl);
        if (lnrVarQdl == null) {
            return null;
        }
        lnrVarQdl.tvp(com.bytedance.adsdk.ugeno.lnr.ud.qdl(qdlVar.qdl(), this.ud));
        lnrVarQdl.to(strLnr);
        lnrVarQdl.lnr(qdlVar.mml());
        lnrVarQdl.qdl(qdlVar);
        lnrVarQdl.qdl(this.rq);
        if (lnrVar instanceof com.bytedance.adsdk.ugeno.ud.qdl) {
            com.bytedance.adsdk.ugeno.ud.qdl qdlVar2 = (com.bytedance.adsdk.ugeno.ud.qdl) lnrVar;
            lnrVarQdl.qdl(qdlVar2);
            c0070qdl = qdlVar2.to();
        }
        Iterator<String> itKeys = qdlVar.mml().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strQdl = com.bytedance.adsdk.ugeno.lnr.ud.qdl(qdlVar.mml().optString(next), this.ud);
            lnrVarQdl.qdl(next, strQdl);
            if (c0070qdl != null) {
                c0070qdl.qdl(this.qdl, next, strQdl);
            }
        }
        if (lnrVarQdl instanceof com.bytedance.adsdk.ugeno.ud.qdl) {
            List<wd.qdl> listMzz = qdlVar.mzz();
            if (listMzz == null || listMzz.size() <= 0) {
                if (TextUtils.equals(lnrVarQdl.hzv(), "RecyclerLayout") && (listLnr = this.tvp.lnr()) != null && listLnr.size() > 0) {
                    Iterator<wd.qdl> it = listLnr.iterator();
                    while (it.hasNext()) {
                        com.bytedance.adsdk.ugeno.ud.lnr<View> lnrVarUd = ud(it.next(), (com.bytedance.adsdk.ugeno.ud.lnr<View>) lnrVarQdl);
                        if (lnrVarUd != null && lnrVarUd.gy()) {
                            ((com.bytedance.adsdk.ugeno.ud.qdl) lnrVarQdl).qdl(lnrVarUd);
                        }
                    }
                }
                return lnrVarQdl;
            }
            if (TextUtils.equals(lnrVarQdl.hzv(), "Swiper") && listMzz.size() != 1) {
                Log.e("UGTemplateEngine", "Swiper must be only one widget");
            }
            Iterator<wd.qdl> it2 = listMzz.iterator();
            while (it2.hasNext()) {
                com.bytedance.adsdk.ugeno.ud.lnr<View> lnrVarUd2 = ud(it2.next(), (com.bytedance.adsdk.ugeno.ud.lnr<View>) lnrVarQdl);
                if (lnrVarUd2 != null && lnrVarUd2.gy()) {
                    ((com.bytedance.adsdk.ugeno.ud.qdl) lnrVarQdl).qdl(lnrVarUd2);
                }
            }
        }
        if (c0070qdl != null) {
            lnrVarQdl.qdl(c0070qdl.qdl());
        }
        this.lnr = lnrVarQdl;
        return lnrVarQdl;
    }

    public com.bytedance.adsdk.ugeno.ud.lnr<View> qdl(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.ud = jSONObject2;
        jl jlVar = this.mo;
        if (jlVar != null) {
            jlVar.qdl();
        }
        wd wdVar = new wd(jSONObject, jSONObject2, jSONObject3);
        this.tvp = wdVar;
        wdVar.qdl(this.jl, this.exc);
        this.rdp = new com.bytedance.adsdk.ugeno.mml.qdl.qdl();
        if (!(this.mzz instanceof com.bytedance.adsdk.ugeno.core.qdl.ud)) {
            this.lnr = qdl(this.tvp.qdl(), (com.bytedance.adsdk.ugeno.ud.lnr<View>) null);
            if (this.aaj == null) {
                jl jlVar2 = this.mo;
                if (jlVar2 != null) {
                    jlVar2.ud();
                    this.lnr.qdl(this.mo);
                    this.mo.lnr();
                }
                qdl(this.lnr);
                if (this.mo != null) {
                    yt ytVar = new yt();
                    ytVar.qdl(0);
                    ytVar.qdl(this.lnr);
                    this.mo.qdl(ytVar);
                }
                return this.lnr;
            }
            throw null;
        }
        this.tvp.ud();
        throw null;
    }

    public com.bytedance.adsdk.ugeno.ud.lnr<View> qdl(wd.qdl qdlVar, JSONObject jSONObject, JSONObject jSONObject2) {
        this.ud = jSONObject;
        jl jlVar = this.mo;
        if (jlVar != null) {
            jlVar.qdl();
        }
        this.rdp = new com.bytedance.adsdk.ugeno.mml.qdl.qdl();
        if (!(this.mzz instanceof com.bytedance.adsdk.ugeno.core.qdl.ud)) {
            this.lnr = qdl(qdlVar, (com.bytedance.adsdk.ugeno.ud.lnr<View>) null);
            jl jlVar2 = this.mo;
            if (jlVar2 != null) {
                jlVar2.ud();
                this.lnr.qdl(this.mo);
            }
            qdl(this.lnr);
            return this.lnr;
        }
        throw null;
    }

    public com.bytedance.adsdk.ugeno.ud.lnr<View> qdl(wd.qdl qdlVar, com.bytedance.adsdk.ugeno.ud.lnr<View> lnrVar) {
        ud udVar;
        com.bytedance.adsdk.ugeno.ud.qdl.C0070qdl c0070qdl;
        List<wd.qdl> listLnr;
        if (!wd.mml(qdlVar)) {
            return null;
        }
        String strLnr = qdlVar.lnr();
        ud udVarQdl = mml.qdl(strLnr);
        if (udVarQdl == null) {
            this.bjy = true;
            if (this.jtx == null) {
                udVar = udVarQdl;
                this.jtx = new ArrayList();
            }
            udVar = udVarQdl;
            this.jtx.add(strLnr);
            strLnr = "View";
            qdlVar.qdl("View");
            ud udVarQdl2 = mml.qdl("View");
            Log.d("UGTemplateEngine", "unknown component; use view widget");
            udVar = udVarQdl2;
            if (udVarQdl2 == null) {
                Log.d("UGTemplateEngine", "not found component ".concat("View"));
                return null;
            }
        }
        udVar = udVarQdl;
        com.bytedance.adsdk.ugeno.ud.lnr lnrVarQdl = udVar.qdl(this.qdl);
        if (lnrVarQdl == null) {
            return null;
        }
        JSONObject jSONObjectMml = qdlVar.mml();
        lnrVarQdl.tvp(com.bytedance.adsdk.ugeno.lnr.ud.qdl(qdlVar.qdl(), this.ud));
        lnrVarQdl.to(strLnr);
        lnrVarQdl.lnr(jSONObjectMml);
        lnrVarQdl.qdl(qdlVar);
        lnrVarQdl.ud(this.ud);
        wd wdVar = this.tvp;
        if (wdVar == null) {
            lnrVarQdl.qdl(true);
        } else {
            lnrVarQdl.qdl(wdVar.mml());
        }
        lnrVarQdl.qdl(this.rq);
        lnrVarQdl.qdl(this.rdp);
        Iterator<String> itKeys = jSONObjectMml.keys();
        if (lnrVar instanceof com.bytedance.adsdk.ugeno.ud.qdl) {
            com.bytedance.adsdk.ugeno.ud.qdl qdlVar2 = (com.bytedance.adsdk.ugeno.ud.qdl) lnrVar;
            c0070qdl = qdlVar2.to();
            lnrVarQdl.qdl(qdlVar2);
        } else {
            c0070qdl = null;
        }
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strQdl = com.bytedance.adsdk.ugeno.lnr.ud.qdl(jSONObjectMml.optString(next), this.ud);
            lnrVarQdl.qdl(next, strQdl);
            if (this.aaj != null) {
                throw null;
            }
            if (c0070qdl != null) {
                c0070qdl.qdl(this.qdl, next, strQdl);
            }
        }
        if (c0070qdl != null) {
            lnrVarQdl.qdl(c0070qdl.qdl());
        }
        if (lnrVarQdl instanceof com.bytedance.adsdk.ugeno.ud.qdl) {
            List<wd.qdl> listMzz = qdlVar.mzz();
            if (listMzz != null && listMzz.size() > 0) {
                if (TextUtils.equals(lnrVarQdl.hzv(), "Swiper") && listMzz.size() != 1) {
                    Log.e("UGTemplateEngine", "Swiper must be only one widget");
                }
                try {
                    Collections.sort(listMzz, new Comparator<wd.qdl>() { // from class: com.bytedance.adsdk.ugeno.core.fs.1
                        @Override // java.util.Comparator
                        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
                        public int compare(wd.qdl qdlVar3, wd.qdl qdlVar4) {
                            return qdlVar3.mml().optInt(m5.f25676u, 0) - qdlVar4.mml().optInt(m5.f25676u, 0);
                        }
                    });
                } catch (Throwable unused) {
                }
                Iterator<wd.qdl> it = listMzz.iterator();
                while (it.hasNext()) {
                    com.bytedance.adsdk.ugeno.ud.lnr<View> lnrVarQdl2 = qdl(it.next(), (com.bytedance.adsdk.ugeno.ud.lnr<View>) lnrVarQdl);
                    if (lnrVarQdl2 != null && !lnrVarQdl2.xi()) {
                        ((com.bytedance.adsdk.ugeno.ud.qdl) lnrVarQdl).qdl(lnrVarQdl2, lnrVarQdl2.vu());
                    }
                }
            } else {
                if (TextUtils.equals(lnrVarQdl.hzv(), "RecyclerLayout") && (listLnr = this.tvp.lnr()) != null && listLnr.size() > 0) {
                    Iterator<wd.qdl> it2 = listLnr.iterator();
                    while (it2.hasNext()) {
                        com.bytedance.adsdk.ugeno.ud.lnr<View> lnrVarQdl3 = qdl(it2.next(), (com.bytedance.adsdk.ugeno.ud.lnr<View>) lnrVarQdl);
                        if (lnrVarQdl3 != null && lnrVarQdl3.gy()) {
                            ((com.bytedance.adsdk.ugeno.ud.qdl) lnrVarQdl).qdl(lnrVarQdl3);
                        }
                    }
                }
                return lnrVarQdl;
            }
        }
        this.lnr = lnrVarQdl;
        return lnrVarQdl;
    }

    public void ud(JSONObject jSONObject) {
        jl jlVar = this.mo;
        if (jlVar != null) {
            jlVar.lnr();
        }
        this.ud = jSONObject;
        qdl(this.lnr, jSONObject);
        qdl(this.lnr);
        if (this.mo != null) {
            yt ytVar = new yt();
            ytVar.qdl(0);
            ytVar.qdl(this.lnr);
            this.mo.qdl(ytVar);
        }
    }

    private void ud(com.bytedance.adsdk.ugeno.ud.lnr lnrVar) {
        try {
            if (!lnrVar.kdv() || lnrVar.rc() == null || lnrVar.rc().mo() == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("i18n", lnrVar.rc().mo());
            this.ud.put("xNode", jSONObject);
        } catch (Exception unused) {
        }
    }

    public void ud(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.ud.lnr<View>> listTvp;
        if (lnrVar == null) {
            return;
        }
        lnrVar.ud(str, objArr);
        if (!(lnrVar instanceof com.bytedance.adsdk.ugeno.ud.qdl) || (listTvp = ((com.bytedance.adsdk.ugeno.ud.qdl) lnrVar).tvp()) == null || listTvp.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.adsdk.ugeno.ud.lnr<View>> it = listTvp.iterator();
        while (it.hasNext()) {
            ud(it.next(), str, objArr);
        }
    }

    public List<String> ud() {
        return this.jtx;
    }

    private void ud(JSONObject jSONObject, com.bytedance.adsdk.ugeno.ud.lnr lnrVar) {
        List<com.bytedance.adsdk.ugeno.ud.lnr<View>> listTvp;
        if (lnrVar == null) {
            return;
        }
        this.ud = jSONObject;
        lnrVar.ud(jSONObject);
        lnrVar.qdl(this.rq);
        com.bytedance.adsdk.ugeno.ud.qdl.C0070qdl c0070qdl = lnrVar.ekw() != null ? lnrVar.ekw().to() : null;
        Iterator<String> itKeys = lnrVar.xmv().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strQdl = com.bytedance.adsdk.ugeno.lnr.ud.qdl(lnrVar.xmv().optString(next), jSONObject);
            lnrVar.qdl(next, strQdl);
            if (c0070qdl != null) {
                c0070qdl.qdl(this.qdl, next, strQdl);
            }
        }
        if ((lnrVar instanceof com.bytedance.adsdk.ugeno.ud.qdl) && (listTvp = ((com.bytedance.adsdk.ugeno.ud.qdl) lnrVar).tvp()) != null && !listTvp.isEmpty()) {
            Iterator<com.bytedance.adsdk.ugeno.ud.lnr<View>> it = listTvp.iterator();
            while (it.hasNext()) {
                ud(jSONObject, it.next());
            }
        }
        if (c0070qdl != null) {
            lnrVar.qdl(c0070qdl.qdl());
        }
    }

    public com.bytedance.adsdk.ugeno.ud.lnr<View> qdl(JSONObject jSONObject) {
        jl jlVar = this.mo;
        if (jlVar != null) {
            jlVar.qdl();
        }
        wd wdVar = new wd(jSONObject, this.ud);
        this.tvp = wdVar;
        if (!(this.mzz instanceof com.bytedance.adsdk.ugeno.core.qdl.ud)) {
            this.lnr = ud(wdVar.qdl(), (com.bytedance.adsdk.ugeno.ud.lnr<View>) null);
            jl jlVar2 = this.mo;
            if (jlVar2 != null) {
                jlVar2.ud();
                this.lnr.qdl(this.mo);
            }
            return this.lnr;
        }
        wdVar.ud();
        throw null;
    }

    public void qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, JSONObject jSONObject) {
        if (lnrVar == null) {
            return;
        }
        if (lnrVar instanceof com.bytedance.adsdk.ugeno.ud.qdl) {
            lnrVar.qdl(jSONObject);
            List<com.bytedance.adsdk.ugeno.ud.lnr<View>> listTvp = ((com.bytedance.adsdk.ugeno.ud.qdl) lnrVar).tvp();
            if (listTvp == null || listTvp.size() <= 0) {
                return;
            }
            Iterator<com.bytedance.adsdk.ugeno.ud.lnr<View>> it = listTvp.iterator();
            while (it.hasNext()) {
                qdl(it.next(), jSONObject);
            }
            return;
        }
        lnrVar.qdl(jSONObject);
    }

    private void qdl(com.bytedance.adsdk.ugeno.ud.lnr<View> lnrVar) {
        List<com.bytedance.adsdk.ugeno.ud.lnr<View>> listTvp;
        if (lnrVar == null) {
            return;
        }
        JSONObject jSONObjectXmv = lnrVar.xmv();
        Iterator<String> itKeys = jSONObjectXmv.keys();
        com.bytedance.adsdk.ugeno.ud.qdl qdlVarEkw = lnrVar.ekw();
        com.bytedance.adsdk.ugeno.ud.qdl.C0070qdl c0070qdl = qdlVarEkw != null ? qdlVarEkw.to() : null;
        ud(lnrVar);
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strQdl = com.bytedance.adsdk.ugeno.lnr.ud.qdl(jSONObjectXmv.optString(next), this.ud);
            lnrVar.qdl(next, strQdl);
            if (c0070qdl != null) {
                c0070qdl.qdl(this.qdl, next, strQdl);
            }
        }
        lnrVar.qdl(this.mml);
        lnrVar.qdl(this.mzz);
        lnrVar.qdl(this.wd);
        tvp tvpVar = this.aaj;
        if (tvpVar != null) {
            lnrVar.qdl(tvpVar);
        }
        mzz mzzVar = this.yt;
        if (mzzVar != null) {
            lnrVar.qdl(mzzVar);
        }
        com.bytedance.adsdk.ugeno.mml.exu exuVar = this.jpc;
        if (exuVar != null) {
            lnrVar.qdl(exuVar);
        }
        if ((lnrVar instanceof com.bytedance.adsdk.ugeno.ud.qdl) && (listTvp = ((com.bytedance.adsdk.ugeno.ud.qdl) lnrVar).tvp()) != null && listTvp.size() > 0) {
            Iterator<com.bytedance.adsdk.ugeno.ud.lnr<View>> it = listTvp.iterator();
            while (it.hasNext()) {
                qdl(it.next());
            }
        }
        if (c0070qdl != null) {
            lnrVar.qdl(c0070qdl.qdl());
        }
        lnrVar.ud();
    }

    public void qdl(bjy bjyVar) {
        com.bytedance.adsdk.ugeno.core.qdl.qdl qdlVarMzz = com.bytedance.adsdk.ugeno.mzz.qdl().mzz();
        if (qdlVarMzz == null) {
            this.mzz = bjyVar;
        } else {
            if (qdlVarMzz.qdl(bjyVar) == null) {
                this.mzz = bjyVar;
                return;
            }
            throw null;
        }
    }

    public void qdl(jtx jtxVar) {
        this.wd = jtxVar;
    }

    public void qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.ud.lnr<View>> listTvp;
        if (lnrVar == null) {
            return;
        }
        lnrVar.qdl(str, objArr);
        if (!(lnrVar instanceof com.bytedance.adsdk.ugeno.ud.qdl) || (listTvp = ((com.bytedance.adsdk.ugeno.ud.qdl) lnrVar).tvp()) == null || listTvp.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.adsdk.ugeno.ud.lnr<View>> it = listTvp.iterator();
        while (it.hasNext()) {
            qdl(it.next(), str, objArr);
        }
    }

    public boolean qdl() {
        return this.bjy;
    }

    public void qdl(mzz mzzVar) {
        this.yt = mzzVar;
    }

    public void qdl(JSONObject jSONObject, com.bytedance.adsdk.ugeno.ud.lnr lnrVar) {
        ud(jSONObject, lnrVar);
        qdl((com.bytedance.adsdk.ugeno.ud.lnr<View>) lnrVar);
    }

    public void qdl(com.bytedance.adsdk.ugeno.mml.exu exuVar) {
        this.jpc = exuVar;
    }
}
