package com.bytedance.adsdk.ugeno.mml;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class tvp implements rq {
    private boolean jpc;
    private com.bytedance.adsdk.ugeno.ud.lnr lnr;
    private com.bytedance.adsdk.ugeno.core.mzz mml;
    private com.bytedance.adsdk.ugeno.core.ud.qdl mo;
    private exu mzz;
    private qdl qdl;
    private boolean tvp;
    private Map<String, List<com.bytedance.adsdk.ugeno.mml.mml.lnr>> ud;
    private boolean wd;

    public static class qdl {
        public Map<String, List<com.bytedance.adsdk.ugeno.mml.mml.lnr>> qdl;
        public Map<String, com.bytedance.adsdk.ugeno.mml.mml.lnr> ud;

        public qdl(Map<String, List<com.bytedance.adsdk.ugeno.mml.mml.lnr>> map, Map<String, com.bytedance.adsdk.ugeno.mml.mml.lnr> map2) {
            this.qdl = map;
            this.ud = map2;
        }
    }

    public tvp(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, qdl qdlVar) {
        this.lnr = lnrVar;
        this.qdl = qdlVar;
        if (qdlVar != null) {
            this.ud = qdlVar.qdl;
        }
        if (lnrVar != null && lnrVar.jjk() && this.mo == null) {
            this.mo = new com.bytedance.adsdk.ugeno.core.ud.qdl();
        }
    }

    public void lnr() {
        List<com.bytedance.adsdk.ugeno.mml.mml.lnr> value;
        qdl qdlVar = this.qdl;
        if (qdlVar == null) {
            return;
        }
        for (Map.Entry<String, List<com.bytedance.adsdk.ugeno.mml.mml.lnr>> entry : qdlVar.qdl.entrySet()) {
            if (entry != null && (value = entry.getValue()) != null && !value.isEmpty()) {
                for (com.bytedance.adsdk.ugeno.mml.mml.lnr lnrVar : value) {
                    if (lnrVar instanceof com.bytedance.adsdk.ugeno.mml.mml.mml) {
                        lnrVar.qdl(this);
                        lnrVar.qdl(new Object[0]);
                    }
                }
            }
        }
    }

    public void mml() {
        List<com.bytedance.adsdk.ugeno.mml.mml.lnr> listQdl = qdl("animateState");
        if (listQdl == null || listQdl.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.mml.mml.lnr lnrVar : listQdl) {
            if (lnrVar != null) {
                lnrVar.qdl(this);
                lnrVar.qdl(new Object[0]);
            }
        }
    }

    public void mzz() {
        List<com.bytedance.adsdk.ugeno.mml.mml.lnr> listQdl = qdl("timer");
        if (listQdl == null || listQdl.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.mml.mml.lnr lnrVar : listQdl) {
            if (lnrVar != null) {
                lnrVar.qdl(this);
                lnrVar.qdl(new Object[0]);
            }
        }
    }

    public void qdl(com.bytedance.adsdk.ugeno.core.mzz mzzVar) {
        this.mml = mzzVar;
    }

    public void ud() {
        List<com.bytedance.adsdk.ugeno.mml.mml.lnr> listQdl = qdl("twist");
        if (listQdl == null || listQdl.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.mml.mml.lnr lnrVar : listQdl) {
            if (lnrVar != null) {
                lnrVar.qdl(this);
                lnrVar.qdl(new Object[0]);
            }
        }
    }

    public void qdl(exu exuVar) {
        this.mzz = exuVar;
    }

    public void qdl() {
        List<com.bytedance.adsdk.ugeno.mml.mml.lnr> listQdl = qdl("shake");
        if (listQdl == null || listQdl.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.mml.mml.lnr lnrVar : listQdl) {
            if (lnrVar != null) {
                lnrVar.qdl(this);
                lnrVar.qdl(new Object[0]);
            }
        }
    }

    public com.bytedance.adsdk.ugeno.mml.mml.lnr ud(String str) {
        Map<String, com.bytedance.adsdk.ugeno.mml.mml.lnr> map;
        if (this.qdl == null || TextUtils.isEmpty(str) || (map = this.qdl.ud) == null) {
            return null;
        }
        return map.get(str);
    }

    public boolean qdl(MotionEvent motionEvent) {
        List<com.bytedance.adsdk.ugeno.mml.mml.lnr> listQdl = qdl("touchStart");
        if (listQdl != null && !listQdl.isEmpty()) {
            for (com.bytedance.adsdk.ugeno.mml.mml.lnr lnrVar : listQdl) {
                if (lnrVar instanceof com.bytedance.adsdk.ugeno.mml.mml.fs) {
                    lnrVar.qdl(this);
                    lnrVar.qdl(motionEvent);
                }
            }
        }
        List<com.bytedance.adsdk.ugeno.mml.mml.lnr> listQdl2 = qdl("touchEnd");
        List<com.bytedance.adsdk.ugeno.mml.mml.lnr> listQdl3 = qdl("tap");
        List<com.bytedance.adsdk.ugeno.mml.mml.lnr> listQdl4 = qdl("slide");
        if (listQdl != null && !listQdl.isEmpty()) {
            for (com.bytedance.adsdk.ugeno.mml.mml.lnr lnrVar2 : listQdl2) {
                if (lnrVar2 instanceof com.bytedance.adsdk.ugeno.mml.mml.rq) {
                    lnrVar2.qdl(this);
                    this.tvp = lnrVar2.qdl(motionEvent);
                }
            }
        }
        if ((listQdl3 != null && !listQdl3.isEmpty()) || (listQdl4 != null && !listQdl4.isEmpty())) {
            if (this.tvp && motionEvent.getAction() == 1) {
                return true;
            }
            com.bytedance.adsdk.ugeno.core.ud.qdl qdlVar = this.mo;
            if (qdlVar != null) {
                if (qdlVar.qdl(motionEvent)) {
                    Log.d("GesThrough_UGEveFacade", "mockEvent，skip");
                    return false;
                }
                this.mo.qdl(this.lnr, motionEvent);
            }
            if (listQdl3 != null && !listQdl3.isEmpty()) {
                for (com.bytedance.adsdk.ugeno.mml.mml.lnr lnrVar3 : listQdl3) {
                    if (lnrVar3 instanceof com.bytedance.adsdk.ugeno.mml.mml.tvp) {
                        ((com.bytedance.adsdk.ugeno.mml.mml.tvp) lnrVar3).qdl(this.mzz);
                        lnrVar3.qdl(this);
                        this.wd = lnrVar3.qdl(motionEvent);
                    }
                }
            }
            int action = motionEvent.getAction();
            if ((action == 1 || action == 3) && this.wd) {
                return true;
            }
            if (listQdl4 != null && !listQdl4.isEmpty()) {
                for (com.bytedance.adsdk.ugeno.mml.mml.lnr lnrVar4 : listQdl4) {
                    if (lnrVar4 instanceof com.bytedance.adsdk.ugeno.mml.mml.mzz) {
                        lnrVar4.qdl(this);
                        this.jpc = lnrVar4.qdl(motionEvent);
                    }
                }
            }
            if ((action == 1 || action == 3) && !this.wd && !this.jpc && this.mo != null) {
                Log.d("GesThrough_UGEveFacade", "Non-tap event & not satisfy slide requirements, need gesture through");
                this.mo.qdl(this.lnr);
            }
            return this.wd || this.jpc;
        }
        return this.tvp;
    }

    private void qdl(String str, List<mo.qdl> list) {
        com.bytedance.adsdk.ugeno.mml.ud.qdl qdlVarQdl;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (mo.qdl qdlVar : list) {
            if (qdlVar != null && (qdlVarQdl = com.bytedance.adsdk.ugeno.mml.ud.qdl.C0064qdl.qdl(this.lnr, str, qdlVar)) != null) {
                qdlVarQdl.qdl();
                qdlVarQdl.ud();
            }
        }
    }

    public List<com.bytedance.adsdk.ugeno.mml.mml.lnr> qdl(String str) {
        Map<String, List<com.bytedance.adsdk.ugeno.mml.mml.lnr>> map = this.ud;
        if (map == null || map.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.ud.get(str);
    }

    public void qdl(String str, Object... objArr) {
        com.bytedance.adsdk.ugeno.mml.mml.lnr lnrVarUd = ud(str);
        if (lnrVarUd != null) {
            lnrVarUd.qdl(this);
            lnrVarUd.qdl(objArr);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.mml.rq
    public void qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, String str, List<mo.qdl> list) {
        com.bytedance.adsdk.ugeno.core.mzz mzzVar = this.mml;
        if (mzzVar != null) {
            mzzVar.qdl(lnrVar, str, list);
        }
        qdl(str, list);
    }

    public static tvp qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, String str) {
        com.bytedance.adsdk.ugeno.mml.mml.lnr lnrVarQdl;
        if (lnrVar != null && !TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() <= 0) {
                    return null;
                }
                qdl qdlVar = new qdl(new HashMap(), new HashMap());
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject != null && (lnrVarQdl = com.bytedance.adsdk.ugeno.mml.mml.lnr.qdl.qdl(lnrVar.rq().getContext(), lnrVar, jSONObjectOptJSONObject, lnrVar.fs())) != null) {
                        if (qdlVar.qdl.containsKey(lnrVarQdl.mml())) {
                            List<com.bytedance.adsdk.ugeno.mml.mml.lnr> list = qdlVar.qdl.get(lnrVarQdl.mml());
                            if (list == null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(lnrVarQdl);
                                qdlVar.qdl.put(lnrVarQdl.mml(), arrayList);
                            } else {
                                list.add(lnrVarQdl);
                            }
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(lnrVarQdl);
                            qdlVar.qdl.put(lnrVarQdl.mml(), arrayList2);
                        }
                        qdlVar.ud.put(lnrVarQdl.mzz(), lnrVarQdl);
                    }
                }
                return new tvp(lnrVar, qdlVar);
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
