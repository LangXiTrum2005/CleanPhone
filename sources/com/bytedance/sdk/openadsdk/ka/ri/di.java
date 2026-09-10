package com.bytedance.sdk.openadsdk.ka.ri;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.wjv;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.su;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class di implements com.bytedance.sdk.component.di.ri.lr.ik {
    private final ri lr = ri.ri();
    public wjv<com.bytedance.sdk.openadsdk.ka.ri> ri;

    private boolean ik(List<com.bytedance.sdk.openadsdk.ka.ri> list) {
        JSONObject jSONObjectIk;
        if (list == null || list.size() == 0 || (jSONObjectIk = list.get(0).ik()) == null) {
            return true;
        }
        return TextUtils.isEmpty(jSONObjectIk.optString("app_log_url"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, List<com.bytedance.sdk.component.di.ri.ka.ri>> ka(List<com.bytedance.sdk.component.di.ri.ka.ri> list) {
        HashMap<String, List<com.bytedance.sdk.component.di.ri.ka.ri>> map = new HashMap<>();
        new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            com.bytedance.sdk.component.di.ri.ka.ri riVar = list.get(i);
            JSONObject jSONObjectDi = riVar.di();
            if (jSONObjectDi != null) {
                String strOptString = jSONObjectDi.optString("app_log_url");
                List<com.bytedance.sdk.component.di.ri.ka.ri> arrayList = map.get(strOptString);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    map.put(strOptString, arrayList);
                }
                arrayList.add(riVar);
            }
        }
        return map;
    }

    public com.bytedance.sdk.openadsdk.ka.fi lr(List<com.bytedance.sdk.openadsdk.slm.lr.ka.ri> list) {
        if (this.ri == null) {
            this.ri = nr.ik();
        }
        if (list != null && list.size() != 0 && com.bytedance.sdk.openadsdk.core.settings.xha.ri()) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                Iterator<com.bytedance.sdk.openadsdk.slm.lr.ka.ri> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().lr);
                }
                jSONObject.put("stats_list", jSONArray);
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = jCurrentTimeMillis / 1000;
                jSONObject.put("ts", j);
                jSONObject.put("ts_ms", jCurrentTimeMillis);
                String strKa = com.bytedance.sdk.openadsdk.core.qt.lr().ka();
                if (strKa == null) {
                    strKa = "";
                }
                StringBuilder sb = new StringBuilder(su.ri());
                sb.append("-");
                sb.append(jCurrentTimeMillis);
                jSONObject.put("req_sign", com.bytedance.sdk.component.utils.fi.ri(strKa + j + BuildConfig.VERSION_NAME));
                jSONObject.put("req_uniq", com.bytedance.sdk.component.utils.fi.ri(sb.toString()));
                return this.ri.lr(jSONObject);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.di.ri.lr.ik
    public void ri(final List<com.bytedance.sdk.component.di.ri.ka.ri> list, final com.bytedance.sdk.component.di.ri.lr.lr lrVar) {
        com.bytedance.sdk.component.di.ri.ka.ri riVar;
        if (list == null || list.isEmpty() || com.bytedance.sdk.openadsdk.core.qt.lr.ri().fi() || (riVar = list.get(0)) == null) {
            return;
        }
        byte bKa = riVar.ka();
        final ArrayList arrayList = new ArrayList();
        if (bKa == 0) {
            com.bytedance.sdk.openadsdk.nr.ik.ri(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.ka.ri.di.1
                @Override // com.bytedance.sdk.openadsdk.nr.ka
                public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                    com.bytedance.sdk.openadsdk.nr.lr.ri riVar2 = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                    riVar2.lr("applog");
                    return riVar2;
                }
            });
            dzy.fi(new com.bytedance.sdk.component.mj.lr.ik("upload_ad_event", 7) { // from class: com.bytedance.sdk.openadsdk.ka.ri.di.2
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it;
                    try {
                        it = di.this.ka(list).entrySet().iterator();
                    } catch (Throwable th) {
                        ac.ik("OverSeaEventUploadImp", th.getMessage());
                        it = null;
                    }
                    Iterator it2 = it;
                    if (it2 == null) {
                        com.bytedance.sdk.component.di.ri.lr.lr lrVar2 = lrVar;
                        if (lrVar2 != null) {
                            lrVar2.ri(arrayList);
                            return;
                        }
                        return;
                    }
                    while (it2.hasNext()) {
                        try {
                            List<com.bytedance.sdk.component.di.ri.ka.ri> list2 = (List) ((Map.Entry) it2.next()).getValue();
                            ArrayList arrayList2 = new ArrayList();
                            for (com.bytedance.sdk.component.di.ri.ka.ri riVar2 : list2) {
                                arrayList2.add(new com.bytedance.sdk.openadsdk.ka.ri(riVar2.ik(), riVar2.di()));
                            }
                            com.bytedance.sdk.openadsdk.ka.fi fiVarRi = di.this.ri(arrayList2);
                            if (lrVar != null && fiVarRi != null) {
                                boolean z = fiVarRi.ka;
                                if (di.this.ri(arrayList2, fiVarRi)) {
                                    z = true;
                                }
                                boolean z2 = z;
                                arrayList.add(new com.bytedance.sdk.component.di.ri.lr.lr.ri(new com.bytedance.sdk.component.di.ri.lr.lr.lr(fiVarRi.ri, fiVarRi.lr, fiVarRi.ik, z2, ""), list2));
                                if (fiVarRi.lr == 200) {
                                    com.bytedance.sdk.openadsdk.nr.ik.lr(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.ka.ri.di.2.1
                                        @Override // com.bytedance.sdk.openadsdk.nr.ka
                                        public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                                            com.bytedance.sdk.openadsdk.nr.lr.ri riVar3 = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                                            riVar3.lr("applog");
                                            return riVar3;
                                        }
                                    });
                                } else if (z2) {
                                    com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.ka.ri.di.2.2
                                        @Override // com.bytedance.sdk.openadsdk.nr.ka
                                        public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                                            com.bytedance.sdk.openadsdk.nr.lr.ri riVar3 = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                                            riVar3.lr("applog");
                                            return riVar3;
                                        }
                                    });
                                } else {
                                    com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.ka.ri.di.2.3
                                        @Override // com.bytedance.sdk.openadsdk.nr.ka
                                        public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                                            com.bytedance.sdk.openadsdk.nr.lr.ri riVar3 = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                                            riVar3.lr("applog");
                                            return riVar3;
                                        }
                                    });
                                }
                            }
                            if (lrVar != null && fiVarRi == null) {
                                com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.ka.ri.di.2.4
                                    @Override // com.bytedance.sdk.openadsdk.nr.ka
                                    public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                                        com.bytedance.sdk.openadsdk.nr.lr.ri riVar3 = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                                        riVar3.lr("applog");
                                        return riVar3;
                                    }
                                });
                            }
                        } catch (Throwable th2) {
                            ac.ik("OverSeaEventUploadImp", th2.getMessage());
                        }
                    }
                    com.bytedance.sdk.component.di.ri.lr.lr lrVar3 = lrVar;
                    if (lrVar3 != null) {
                        lrVar3.ri(arrayList);
                    }
                }
            });
            return;
        }
        if (bKa == 1) {
            if (com.bytedance.sdk.openadsdk.slm.ik.lr()) {
                if (lrVar != null) {
                    arrayList.add(new com.bytedance.sdk.component.di.ri.lr.lr.ri(new com.bytedance.sdk.component.di.ri.lr.lr.lr(true, 200, "", false, ""), list));
                    lrVar.ri(arrayList);
                    return;
                }
                return;
            }
            final ArrayList arrayList2 = new ArrayList();
            for (com.bytedance.sdk.component.di.ri.ka.ri riVar2 : list) {
                arrayList2.add(new com.bytedance.sdk.openadsdk.slm.lr.ka.ri(riVar2.ik(), riVar2.di()));
            }
            if (arrayList2.size() > 0) {
                com.bytedance.sdk.openadsdk.nr.ik.ri(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.ka.ri.di.3
                    @Override // com.bytedance.sdk.openadsdk.nr.ka
                    public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                        com.bytedance.sdk.openadsdk.nr.lr.ri riVar3 = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                        riVar3.lr("stats");
                        return riVar3;
                    }
                });
                dzy.fi(new com.bytedance.sdk.component.mj.lr.ik("upload_stats_event", 6) { // from class: com.bytedance.sdk.openadsdk.ka.ri.di.4
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.ka.fi fiVarLr = di.this.lr(arrayList2);
                        if (lrVar != null && fiVarLr != null) {
                            arrayList.add(new com.bytedance.sdk.component.di.ri.lr.lr.ri(new com.bytedance.sdk.component.di.ri.lr.lr.lr(fiVarLr.ri, fiVarLr.lr, fiVarLr.ik, fiVarLr.ka, ""), list));
                            lrVar.ri(arrayList);
                            if (fiVarLr.lr == 200) {
                                com.bytedance.sdk.openadsdk.nr.ik.lr(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.ka.ri.di.4.1
                                    @Override // com.bytedance.sdk.openadsdk.nr.ka
                                    public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                                        com.bytedance.sdk.openadsdk.nr.lr.ri riVar3 = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                                        riVar3.lr("stats");
                                        return riVar3;
                                    }
                                });
                            } else if (fiVarLr.ka) {
                                com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.ka.ri.di.4.2
                                    @Override // com.bytedance.sdk.openadsdk.nr.ka
                                    public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                                        com.bytedance.sdk.openadsdk.nr.lr.ri riVar3 = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                                        riVar3.lr("stats");
                                        return riVar3;
                                    }
                                });
                            } else {
                                com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.ka.ri.di.4.3
                                    @Override // com.bytedance.sdk.openadsdk.nr.ka
                                    public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                                        com.bytedance.sdk.openadsdk.nr.lr.ri riVar3 = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                                        riVar3.lr("stats");
                                        return riVar3;
                                    }
                                });
                            }
                        }
                        if (lrVar == null || fiVarLr != null) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.ka.ri.di.4.4
                            @Override // com.bytedance.sdk.openadsdk.nr.ka
                            public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                                com.bytedance.sdk.openadsdk.nr.lr.ri riVar3 = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                                riVar3.lr("stats");
                                return riVar3;
                            }
                        });
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ri(List<com.bytedance.sdk.openadsdk.ka.ri> list, com.bytedance.sdk.openadsdk.ka.fi fiVar) {
        int i;
        return !ik(list) && (i = fiVar.lr) >= 400 && i < 500;
    }

    public com.bytedance.sdk.openadsdk.ka.fi ri(List<com.bytedance.sdk.openadsdk.ka.ri> list) {
        if (this.ri == null) {
            this.ri = nr.ik();
        }
        if (this.ri == null) {
            return null;
        }
        return this.ri.ri(this.lr.ri(this.lr.ik(list), System.currentTimeMillis(), this.lr.lr()), this.lr.ri(list), this.lr.lr(list));
    }
}
