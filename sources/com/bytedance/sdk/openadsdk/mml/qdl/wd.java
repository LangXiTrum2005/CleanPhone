package com.bytedance.sdk.openadsdk.mml.qdl;

import android.text.TextUtils;
import com.applovin.impl.Z;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.oth;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.uw;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class wd implements com.bytedance.sdk.component.mo.qdl.ud.lnr {
    public oth<com.bytedance.sdk.openadsdk.mml.qdl> qdl;
    private final qdl ud = qdl.qdl();

    private boolean lnr(List<com.bytedance.sdk.openadsdk.mml.qdl> list) {
        JSONObject jSONObjectLnr;
        if (list == null || list.size() == 0 || (jSONObjectLnr = list.get(0).lnr()) == null) {
            return true;
        }
        return TextUtils.isEmpty(jSONObjectLnr.optString("app_log_url"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, List<com.bytedance.sdk.component.mo.qdl.mml.qdl>> mml(List<com.bytedance.sdk.component.mo.qdl.mml.qdl> list) {
        HashMap<String, List<com.bytedance.sdk.component.mo.qdl.mml.qdl>> map = new HashMap<>();
        new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar = list.get(i2);
            JSONObject jSONObjectWd = qdlVar.wd();
            if (jSONObjectWd != null) {
                String strOptString = jSONObjectWd.optString("app_log_url");
                List<com.bytedance.sdk.component.mo.qdl.mml.qdl> arrayList = map.get(strOptString);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    map.put(strOptString, arrayList);
                }
                arrayList.add(qdlVar);
            }
        }
        return map;
    }

    public com.bytedance.sdk.openadsdk.mml.mzz ud(List<com.bytedance.sdk.openadsdk.bjy.lnr.mml.qdl> list) {
        if (this.qdl == null) {
            this.qdl = yt.lnr();
        }
        if (list != null && list.size() != 0 && com.bytedance.sdk.openadsdk.core.settings.wd.qdl()) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<com.bytedance.sdk.openadsdk.bjy.lnr.mml.qdl> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().ud);
                }
                jSONObject.put("stats_list", jSONArray);
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = jCurrentTimeMillis / 1000;
                jSONObject.put("ts", j);
                jSONObject.put("ts_ms", jCurrentTimeMillis);
                String strMml = com.bytedance.sdk.openadsdk.core.tvp.ud().mml();
                if (strMml == null) {
                    strMml = "";
                }
                StringBuilder sb = new StringBuilder(uw.qdl());
                sb.append(TokenBuilder.TOKEN_DELIMITER);
                sb.append(jCurrentTimeMillis);
                jSONObject.put("req_sign", com.bytedance.sdk.component.utils.mzz.qdl(strMml + j + BuildConfig.VERSION_NAME));
                jSONObject.put("req_uniq", com.bytedance.sdk.component.utils.mzz.qdl(sb.toString()));
                return this.qdl.ud(jSONObject);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.ud.lnr
    public void qdl(final List<com.bytedance.sdk.component.mo.qdl.mml.qdl> list, final com.bytedance.sdk.component.mo.qdl.ud.ud udVar) {
        com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar;
        if (list == null || list.isEmpty() || !yt.mml().mlb() || (qdlVar = list.get(0)) == null) {
            return;
        }
        byte bMml = qdlVar.mml();
        final ArrayList arrayList = new ArrayList();
        if (bMml == 0) {
            com.bytedance.sdk.openadsdk.yt.lnr.qdl(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.mml.qdl.wd.1
                @Override // com.bytedance.sdk.openadsdk.yt.mml
                public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                    return Z.i("applog");
                }
            });
            fco.qdl(new com.bytedance.sdk.component.jpc.lnr.ud(7, "upload_ad_event") { // from class: com.bytedance.sdk.openadsdk.mml.qdl.wd.2
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it;
                    try {
                        it = wd.this.mml(list).entrySet().iterator();
                    } catch (Throwable th) {
                        aaj.lnr("OverSeaEventUploadImp", th.getMessage());
                        it = null;
                    }
                    Iterator it2 = it;
                    if (it2 == null) {
                        com.bytedance.sdk.component.mo.qdl.ud.ud udVar2 = udVar;
                        if (udVar2 != null) {
                            udVar2.qdl(arrayList);
                            return;
                        }
                        return;
                    }
                    while (it2.hasNext()) {
                        try {
                            List<com.bytedance.sdk.component.mo.qdl.mml.qdl> list2 = (List) ((Map.Entry) it2.next()).getValue();
                            ArrayList arrayList2 = new ArrayList();
                            for (com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar2 : list2) {
                                arrayList2.add(new com.bytedance.sdk.openadsdk.mml.qdl(qdlVar2.lnr(), qdlVar2.wd()));
                            }
                            com.bytedance.sdk.openadsdk.mml.mzz mzzVarQdl = wd.this.qdl(arrayList2);
                            if (udVar != null && mzzVarQdl != null) {
                                boolean z2 = mzzVarQdl.mml;
                                if (wd.this.qdl(arrayList2, mzzVarQdl)) {
                                    z2 = true;
                                }
                                boolean z3 = z2;
                                arrayList.add(new com.bytedance.sdk.component.mo.qdl.ud.lnr.qdl(new com.bytedance.sdk.component.mo.qdl.ud.lnr.ud(mzzVarQdl.qdl, mzzVarQdl.ud, mzzVarQdl.lnr, z3, ""), list2));
                                if (mzzVarQdl.ud == 200) {
                                    com.bytedance.sdk.openadsdk.yt.lnr.ud(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.mml.qdl.wd.2.1
                                        @Override // com.bytedance.sdk.openadsdk.yt.mml
                                        public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                                            return Z.i("applog");
                                        }
                                    });
                                } else if (z3) {
                                    com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.mml.qdl.wd.2.2
                                        @Override // com.bytedance.sdk.openadsdk.yt.mml
                                        public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                                            return Z.i("applog");
                                        }
                                    });
                                } else {
                                    com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.mml.qdl.wd.2.3
                                        @Override // com.bytedance.sdk.openadsdk.yt.mml
                                        public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                                            return Z.i("applog");
                                        }
                                    });
                                }
                            }
                            if (udVar != null && mzzVarQdl == null) {
                                com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.mml.qdl.wd.2.4
                                    @Override // com.bytedance.sdk.openadsdk.yt.mml
                                    public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                                        return Z.i("applog");
                                    }
                                });
                            }
                        } catch (Throwable th2) {
                            aaj.lnr("OverSeaEventUploadImp", th2.getMessage());
                        }
                    }
                    com.bytedance.sdk.component.mo.qdl.ud.ud udVar3 = udVar;
                    if (udVar3 != null) {
                        udVar3.qdl(arrayList);
                    }
                }
            });
            return;
        }
        if (bMml == 1) {
            final ArrayList arrayList2 = new ArrayList();
            for (com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar2 : list) {
                arrayList2.add(new com.bytedance.sdk.openadsdk.bjy.lnr.mml.qdl(qdlVar2.lnr(), qdlVar2.wd()));
            }
            if (arrayList2.size() > 0) {
                com.bytedance.sdk.openadsdk.yt.lnr.qdl(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.mml.qdl.wd.3
                    @Override // com.bytedance.sdk.openadsdk.yt.mml
                    public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                        return Z.i("stats");
                    }
                });
                fco.qdl(new com.bytedance.sdk.component.jpc.lnr.ud(6, "upload_stats_event") { // from class: com.bytedance.sdk.openadsdk.mml.qdl.wd.4
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.mml.mzz mzzVarUd = wd.this.ud(arrayList2);
                        if (udVar != null && mzzVarUd != null) {
                            arrayList.add(new com.bytedance.sdk.component.mo.qdl.ud.lnr.qdl(new com.bytedance.sdk.component.mo.qdl.ud.lnr.ud(mzzVarUd.qdl, mzzVarUd.ud, mzzVarUd.lnr, mzzVarUd.mml, ""), list));
                            udVar.qdl(arrayList);
                            if (mzzVarUd.ud == 200) {
                                com.bytedance.sdk.openadsdk.yt.lnr.ud(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.mml.qdl.wd.4.1
                                    @Override // com.bytedance.sdk.openadsdk.yt.mml
                                    public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                                        return Z.i("stats");
                                    }
                                });
                            } else if (mzzVarUd.mml) {
                                com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.mml.qdl.wd.4.2
                                    @Override // com.bytedance.sdk.openadsdk.yt.mml
                                    public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                                        return Z.i("stats");
                                    }
                                });
                            } else {
                                com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.mml.qdl.wd.4.3
                                    @Override // com.bytedance.sdk.openadsdk.yt.mml
                                    public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                                        return Z.i("stats");
                                    }
                                });
                            }
                        }
                        if (udVar == null || mzzVarUd != null) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.mml.qdl.wd.4.4
                            @Override // com.bytedance.sdk.openadsdk.yt.mml
                            public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                                return Z.i("stats");
                            }
                        });
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean qdl(List<com.bytedance.sdk.openadsdk.mml.qdl> list, com.bytedance.sdk.openadsdk.mml.mzz mzzVar) {
        int i2;
        return !lnr(list) && (i2 = mzzVar.ud) >= 400 && i2 < 500;
    }

    public com.bytedance.sdk.openadsdk.mml.mzz qdl(List<com.bytedance.sdk.openadsdk.mml.qdl> list) {
        if (this.qdl == null) {
            this.qdl = yt.lnr();
        }
        if (this.qdl == null) {
            return null;
        }
        int iGg = com.bytedance.sdk.openadsdk.core.settings.rq.lnr().gg();
        if (3 == iGg) {
            return this.qdl.qdl(this.ud.qdl(this.ud.qdl(list, false), System.currentTimeMillis(), this.ud.ud(), true), this.ud.qdl(list), true);
        }
        if (2 == iGg) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObjectUd = this.ud.ud();
            this.qdl.qdl(this.ud.qdl(this.ud.qdl(list, true), jCurrentTimeMillis, jSONObjectUd, true), this.ud.qdl(list), true);
            return this.qdl.qdl(this.ud.qdl(this.ud.ud(list), jCurrentTimeMillis, jSONObjectUd, false), this.ud.qdl(list), false);
        }
        return this.qdl.qdl(this.ud.qdl(list, System.currentTimeMillis(), this.ud.ud(), false), this.ud.qdl(list), false);
    }
}
