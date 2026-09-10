package com.bytedance.adsdk.ugeno.ka;

import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class jbs implements sf {
    private aw di;
    private com.bytedance.adsdk.ugeno.core.fi fi;
    private Map<String, List<com.bytedance.adsdk.ugeno.ka.ka.ik>> ik;
    private boolean jbs;
    private com.bytedance.adsdk.ugeno.lr.ik ka;
    private Map<String, List<com.bytedance.adsdk.ugeno.ka.ka.ik>> lr;
    private boolean mj;
    private boolean qt;
    private ri ri;
    private com.bytedance.adsdk.ugeno.core.lr.ri xha;

    public static class ri {
        public Map<String, com.bytedance.adsdk.ugeno.ka.ka.ik> ik;
        public Map<String, List<com.bytedance.adsdk.ugeno.ka.ka.ik>> lr;
        public Map<String, List<com.bytedance.adsdk.ugeno.ka.ka.ik>> ri;

        public ri(Map<String, List<com.bytedance.adsdk.ugeno.ka.ka.ik>> map, Map<String, com.bytedance.adsdk.ugeno.ka.ka.ik> map2, Map<String, List<com.bytedance.adsdk.ugeno.ka.ka.ik>> map3) {
            this.ri = map;
            this.ik = map2;
            this.lr = map3;
        }
    }

    public jbs(com.bytedance.adsdk.ugeno.lr.ik ikVar, ri riVar) {
        this.ka = ikVar;
        this.ri = riVar;
        if (riVar != null) {
            this.lr = riVar.ri;
            this.ik = riVar.lr;
        }
        if (ikVar != null && ikVar.whw() && this.xha == null) {
            this.xha = new com.bytedance.adsdk.ugeno.core.lr.ri();
        }
    }

    public void fi() {
        List<com.bytedance.adsdk.ugeno.ka.ka.ik> listRi = ri("timer");
        if (listRi == null || listRi.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.ka.ka.ik ikVar : listRi) {
            if (ikVar != null) {
                ikVar.ri(this);
                ikVar.ri(new Object[0]);
            }
        }
    }

    public void ik() {
        List<com.bytedance.adsdk.ugeno.ka.ka.ik> value;
        ri riVar = this.ri;
        if (riVar == null) {
            return;
        }
        for (Map.Entry<String, List<com.bytedance.adsdk.ugeno.ka.ka.ik>> entry : riVar.ri.entrySet()) {
            if (entry != null && (value = entry.getValue()) != null && !value.isEmpty()) {
                for (com.bytedance.adsdk.ugeno.ka.ka.ik ikVar : value) {
                    if (ikVar instanceof com.bytedance.adsdk.ugeno.ka.ka.ka) {
                        ikVar.ri(this);
                        ikVar.ri(new Object[0]);
                    }
                }
            }
        }
    }

    public void ka() {
        List<com.bytedance.adsdk.ugeno.ka.ka.ik> listRi = ri("animateState");
        if (listRi == null || listRi.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.ka.ka.ik ikVar : listRi) {
            if (ikVar != null) {
                ikVar.ri(this);
                ikVar.ri(new Object[0]);
            }
        }
    }

    public void lr() {
        List<com.bytedance.adsdk.ugeno.ka.ka.ik> listRi = ri("twist");
        if (listRi == null || listRi.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.ka.ka.ik ikVar : listRi) {
            if (ikVar != null) {
                ikVar.ri(this);
                ikVar.ri(new Object[0]);
            }
        }
    }

    public void ri(com.bytedance.adsdk.ugeno.core.fi fiVar) {
        this.fi = fiVar;
    }

    public void ri(aw awVar) {
        this.di = awVar;
    }

    public void ri() {
        List<com.bytedance.adsdk.ugeno.ka.ka.ik> listRi = ri("shake");
        if (listRi == null || listRi.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.ka.ka.ik ikVar : listRi) {
            if (ikVar != null) {
                ikVar.ri(this);
                ikVar.ri(new Object[0]);
            }
        }
    }

    public List<com.bytedance.adsdk.ugeno.ka.ka.ik> lr(String str) {
        Map<String, List<com.bytedance.adsdk.ugeno.ka.ka.ik>> map;
        Map<String, List<com.bytedance.adsdk.ugeno.ka.ka.ik>> map2 = this.ik;
        if (map2 == null || map2.isEmpty() || TextUtils.isEmpty(str) || (map = this.ik) == null || !map.containsKey(str)) {
            return null;
        }
        return this.ik.get(str);
    }

    public boolean ri(MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.core.lr.ri riVar;
        List<com.bytedance.adsdk.ugeno.ka.ka.ik> listRi = ri("touchStart");
        if (listRi != null && !listRi.isEmpty()) {
            for (com.bytedance.adsdk.ugeno.ka.ka.ik ikVar : listRi) {
                if (ikVar instanceof com.bytedance.adsdk.ugeno.ka.ka.co) {
                    ikVar.ri(this);
                    ikVar.ri(motionEvent);
                }
            }
        }
        List<com.bytedance.adsdk.ugeno.ka.ka.ik> listRi2 = ri("touchEnd");
        List<com.bytedance.adsdk.ugeno.ka.ka.ik> listRi3 = ri("tap");
        List<com.bytedance.adsdk.ugeno.ka.ka.ik> listRi4 = ri("slide");
        if (listRi != null && !listRi.isEmpty()) {
            for (com.bytedance.adsdk.ugeno.ka.ka.ik ikVar2 : listRi2) {
                if (ikVar2 instanceof com.bytedance.adsdk.ugeno.ka.ka.sf) {
                    ikVar2.ri(this);
                    this.qt = ikVar2.ri(motionEvent);
                }
            }
        }
        if ((listRi3 != null && !listRi3.isEmpty()) || (listRi4 != null && !listRi4.isEmpty())) {
            if (this.qt && motionEvent.getAction() == 1) {
                return true;
            }
            com.bytedance.adsdk.ugeno.core.lr.ri riVar2 = this.xha;
            if (riVar2 != null) {
                if (riVar2.ri(motionEvent)) {
                    return false;
                }
                this.xha.ri(this.ka, motionEvent);
            }
            if (listRi3 != null && !listRi3.isEmpty()) {
                for (com.bytedance.adsdk.ugeno.ka.ka.ik ikVar3 : listRi3) {
                    if (ikVar3 instanceof com.bytedance.adsdk.ugeno.ka.ka.jbs) {
                        ((com.bytedance.adsdk.ugeno.ka.ka.jbs) ikVar3).ri(this.di);
                        ikVar3.ri(this);
                        this.mj = ikVar3.ri(motionEvent);
                    }
                }
            }
            int action = motionEvent.getAction();
            if ((action == 1 || action == 3) && this.mj) {
                return true;
            }
            if (listRi4 != null && !listRi4.isEmpty()) {
                for (com.bytedance.adsdk.ugeno.ka.ka.ik ikVar4 : listRi4) {
                    if (ikVar4 instanceof com.bytedance.adsdk.ugeno.ka.ka.fi) {
                        ikVar4.ri(this);
                        this.jbs = ikVar4.ri(motionEvent);
                    }
                }
            }
            if ((action == 1 || action == 3) && !this.mj && !this.jbs && (riVar = this.xha) != null) {
                riVar.ri(this.ka);
            }
            return this.mj || this.jbs;
        }
        return this.qt;
    }

    private void ri(String str, List<di.ri> list) {
        com.bytedance.adsdk.ugeno.ka.lr.ri riVarRi;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (di.ri riVar : list) {
            if (riVar != null && (riVarRi = com.bytedance.adsdk.ugeno.ka.lr.ri.C0192ri.ri(this.ka, str, riVar)) != null) {
                riVarRi.ri();
                riVarRi.lr();
            }
        }
    }

    public List<com.bytedance.adsdk.ugeno.ka.ka.ik> ri(String str) {
        Map<String, List<com.bytedance.adsdk.ugeno.ka.ka.ik>> map;
        Map<String, List<com.bytedance.adsdk.ugeno.ka.ka.ik>> map2 = this.lr;
        if (((map2 == null || map2.isEmpty()) && ((map = this.ik) == null || map.isEmpty())) || TextUtils.isEmpty(str)) {
            return null;
        }
        Map<String, List<com.bytedance.adsdk.ugeno.ka.ka.ik>> map3 = this.lr;
        if (map3 != null && map3.containsKey(str)) {
            return this.lr.get(str);
        }
        Map<String, List<com.bytedance.adsdk.ugeno.ka.ka.ik>> map4 = this.ik;
        if (map4 != null && map4.containsKey(str)) {
            return this.ik.get(str);
        }
        return null;
    }

    public void ri(String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.ka.ka.ik> listLr = lr(str);
        if (listLr == null || listLr.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.ka.ka.ik ikVar : listLr) {
            ikVar.ri(this);
            ikVar.ri(objArr);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ka.sf
    public void ri(com.bytedance.adsdk.ugeno.lr.ik ikVar, String str, List<di.ri> list) {
        com.bytedance.adsdk.ugeno.core.fi fiVar = this.fi;
        if (fiVar != null) {
            fiVar.ri(ikVar, str, list);
        }
        ri(str, list);
    }

    public static jbs ri(com.bytedance.adsdk.ugeno.lr.ik ikVar, String str) {
        com.bytedance.adsdk.ugeno.ka.ka.ik ikVarRi;
        if (ikVar != null && !TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() <= 0) {
                    return null;
                }
                ri riVar = new ri(new HashMap(), new HashMap(), new HashMap());
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null && (ikVarRi = com.bytedance.adsdk.ugeno.ka.ka.ik.ri.ri(ikVar.sf().getContext(), ikVar, jSONObjectOptJSONObject, ikVar.co())) != null) {
                        if (riVar.ri.containsKey(ikVarRi.ka())) {
                            List<com.bytedance.adsdk.ugeno.ka.ka.ik> list = riVar.ri.get(ikVarRi.ka());
                            if (list == null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(ikVarRi);
                                riVar.ri.put(ikVarRi.ka(), arrayList);
                                riVar.lr.put(ikVarRi.di(), arrayList);
                            } else {
                                list.add(ikVarRi);
                            }
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(ikVarRi);
                            riVar.ri.put(ikVarRi.ka(), arrayList2);
                            riVar.lr.put(ikVarRi.di(), arrayList2);
                        }
                        riVar.ik.put(ikVarRi.fi(), ikVarRi);
                    }
                }
                return new jbs(ikVar, riVar);
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
