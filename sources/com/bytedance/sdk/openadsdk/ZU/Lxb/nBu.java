package com.bytedance.sdk.openadsdk.ZU.Lxb;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.settings.VVE;
import com.bytedance.sdk.openadsdk.core.tD;
import com.bytedance.sdk.openadsdk.utils.eK;
import com.bytedance.sdk.openadsdk.utils.hg;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class nBu implements com.bytedance.sdk.component.lc.Lxb.LD.lk {
    private final lk LD = lk.Lxb();
    public tD<com.bytedance.sdk.openadsdk.ZU.Lxb> Lxb;

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb>> ZU(List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> list) {
        HashMap<String, List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb>> map = new HashMap<>();
        new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb = list.get(i);
            JSONObject jSONObjectEbl = lxb.ebl();
            if (jSONObjectEbl != null) {
                String strOptString = jSONObjectEbl.optString("app_log_url");
                List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> arrayList = map.get(strOptString);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    map.put(strOptString, arrayList);
                }
                arrayList.add(lxb);
            }
        }
        return map;
    }

    private boolean lk(List<com.bytedance.sdk.openadsdk.ZU.Lxb> list) {
        JSONObject jSONObjectLk;
        if (list == null || list.size() == 0 || (jSONObjectLk = list.get(0).lk()) == null) {
            return true;
        }
        return TextUtils.isEmpty(jSONObjectLk.optString("app_log_url"));
    }

    public com.bytedance.sdk.openadsdk.ZU.JXs LD(List<com.bytedance.sdk.openadsdk.STP.lk.lk.Lxb> list) {
        if (this.Lxb == null) {
            this.Lxb = kqm.lk();
        }
        if (list != null && list.size() != 0 && com.bytedance.sdk.openadsdk.core.settings.sLN.Lxb()) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<com.bytedance.sdk.openadsdk.STP.lk.lk.Lxb> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().LD);
                }
                jSONObject.put("stats_list", jSONArray);
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = jCurrentTimeMillis / 1000;
                jSONObject.put("ts", j);
                jSONObject.put("ts_ms", jCurrentTimeMillis);
                String strZU = com.bytedance.sdk.openadsdk.core.QAg.LD().ZU();
                if (strZU == null) {
                    strZU = "";
                }
                StringBuilder sb = new StringBuilder(eK.Lxb());
                sb.append("-");
                sb.append(jCurrentTimeMillis);
                jSONObject.put("req_sign", com.bytedance.sdk.component.utils.JXs.Lxb(strZU + j + BuildConfig.VERSION_NAME));
                jSONObject.put("req_uniq", com.bytedance.sdk.component.utils.JXs.Lxb(sb.toString()));
                return this.Lxb.LD(jSONObject);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.LD.lk
    public void Lxb(final List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> list, @Nullable final com.bytedance.sdk.component.lc.Lxb.LD.LD ld) {
        com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb;
        if (list == null || list.isEmpty() || !kqm.ZU().Iyd() || (lxb = list.get(0)) == null) {
            return;
        }
        byte bZU = lxb.ZU();
        final ArrayList arrayList = new ArrayList();
        if (bZU == 0) {
            com.bytedance.sdk.openadsdk.VVE.lk.Lxb(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.ZU.Lxb.nBu.1
                @Override // com.bytedance.sdk.openadsdk.VVE.ZU
                public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                    return AbstractC3950lJ.l("applog");
                }
            });
            hg.Lxb(new com.bytedance.sdk.component.OY.lk.LD(7, "upload_ad_event") { // from class: com.bytedance.sdk.openadsdk.ZU.Lxb.nBu.2
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it;
                    try {
                        it = nBu.this.ZU(list).entrySet().iterator();
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.sLN.Lxb("OverSeaEventUploadImp", th.getMessage());
                        it = null;
                    }
                    if (it == null) {
                        com.bytedance.sdk.component.lc.Lxb.LD.LD ld2 = ld;
                        if (ld2 != null) {
                            ld2.Lxb(arrayList);
                            return;
                        }
                        return;
                    }
                    while (it.hasNext()) {
                        try {
                            Lxb.Lxb(Lxb.ZU);
                            List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> list2 = (List) ((Map.Entry) it.next()).getValue();
                            ArrayList arrayList2 = new ArrayList();
                            for (com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb2 : list2) {
                                arrayList2.add(new com.bytedance.sdk.openadsdk.ZU.Lxb(lxb2.lk(), lxb2.ebl()));
                            }
                            com.bytedance.sdk.openadsdk.ZU.JXs jXsLxb = nBu.this.Lxb(arrayList2);
                            if (ld != null && jXsLxb != null) {
                                boolean z = jXsLxb.ZU;
                                if (nBu.this.Lxb(arrayList2, jXsLxb)) {
                                    z = true;
                                }
                                arrayList.add(new com.bytedance.sdk.component.lc.Lxb.LD.lk.Lxb(new com.bytedance.sdk.component.lc.Lxb.LD.lk.LD(jXsLxb.Lxb, jXsLxb.LD, jXsLxb.lk, z, ""), list2));
                                if (jXsLxb.LD == 200) {
                                    Lxb.Lxb(Lxb.ZU, true);
                                    com.bytedance.sdk.openadsdk.VVE.lk.LD(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.ZU.Lxb.nBu.2.1
                                        @Override // com.bytedance.sdk.openadsdk.VVE.ZU
                                        public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                                            return AbstractC3950lJ.l("applog");
                                        }
                                    });
                                } else if (z) {
                                    Lxb.Lxb(Lxb.ZU, false);
                                    com.bytedance.sdk.openadsdk.VVE.lk.lk(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.ZU.Lxb.nBu.2.2
                                        @Override // com.bytedance.sdk.openadsdk.VVE.ZU
                                        public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                                            return AbstractC3950lJ.l("applog");
                                        }
                                    });
                                } else {
                                    com.bytedance.sdk.openadsdk.VVE.lk.lk(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.ZU.Lxb.nBu.2.3
                                        @Override // com.bytedance.sdk.openadsdk.VVE.ZU
                                        public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                                            return AbstractC3950lJ.l("applog");
                                        }
                                    });
                                }
                            }
                            if (ld != null && jXsLxb == null) {
                                com.bytedance.sdk.openadsdk.VVE.lk.lk(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.ZU.Lxb.nBu.2.4
                                    @Override // com.bytedance.sdk.openadsdk.VVE.ZU
                                    public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                                        return AbstractC3950lJ.l("applog");
                                    }
                                });
                            }
                        } catch (Throwable th2) {
                            com.bytedance.sdk.component.utils.sLN.Lxb("OverSeaEventUploadImp", th2.getMessage());
                        }
                    }
                    com.bytedance.sdk.component.lc.Lxb.LD.LD ld3 = ld;
                    if (ld3 != null) {
                        ld3.Lxb(arrayList);
                    }
                }
            });
            return;
        }
        if (bZU == 1) {
            final ArrayList arrayList2 = new ArrayList();
            for (com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb2 : list) {
                arrayList2.add(new com.bytedance.sdk.openadsdk.STP.lk.lk.Lxb(lxb2.lk(), lxb2.ebl()));
            }
            Lxb.Lxb(Lxb.JXs);
            if (arrayList2.size() > 0) {
                com.bytedance.sdk.openadsdk.VVE.lk.Lxb(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.ZU.Lxb.nBu.3
                    @Override // com.bytedance.sdk.openadsdk.VVE.ZU
                    public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                        return AbstractC3950lJ.l("stats");
                    }
                });
                hg.Lxb(new com.bytedance.sdk.component.OY.lk.LD(6, "upload_stats_event") { // from class: com.bytedance.sdk.openadsdk.ZU.Lxb.nBu.4
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.ZU.JXs jXsLD = nBu.this.LD(arrayList2);
                        if (ld != null && jXsLD != null) {
                            arrayList.add(new com.bytedance.sdk.component.lc.Lxb.LD.lk.Lxb(new com.bytedance.sdk.component.lc.Lxb.LD.lk.LD(jXsLD.Lxb, jXsLD.LD, jXsLD.lk, jXsLD.ZU, ""), list));
                            ld.Lxb(arrayList);
                            if (jXsLD.LD == 200) {
                                Lxb.Lxb(Lxb.JXs, true);
                                com.bytedance.sdk.openadsdk.VVE.lk.LD(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.ZU.Lxb.nBu.4.1
                                    @Override // com.bytedance.sdk.openadsdk.VVE.ZU
                                    public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                                        return AbstractC3950lJ.l("stats");
                                    }
                                });
                            } else if (jXsLD.ZU) {
                                Lxb.Lxb(Lxb.JXs, false);
                                com.bytedance.sdk.openadsdk.VVE.lk.lk(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.ZU.Lxb.nBu.4.2
                                    @Override // com.bytedance.sdk.openadsdk.VVE.ZU
                                    public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                                        return AbstractC3950lJ.l("stats");
                                    }
                                });
                            } else {
                                com.bytedance.sdk.openadsdk.VVE.lk.lk(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.ZU.Lxb.nBu.4.3
                                    @Override // com.bytedance.sdk.openadsdk.VVE.ZU
                                    public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                                        return AbstractC3950lJ.l("stats");
                                    }
                                });
                            }
                        }
                        if (ld == null || jXsLD != null) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.VVE.lk.lk(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.ZU.Lxb.nBu.4.4
                            @Override // com.bytedance.sdk.openadsdk.VVE.ZU
                            public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                                return AbstractC3950lJ.l("stats");
                            }
                        });
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Lxb(List<com.bytedance.sdk.openadsdk.ZU.Lxb> list, com.bytedance.sdk.openadsdk.ZU.JXs jXs) {
        int i;
        return !lk(list) && (i = jXs.LD) >= 400 && i < 500;
    }

    public com.bytedance.sdk.openadsdk.ZU.JXs Lxb(List<com.bytedance.sdk.openadsdk.ZU.Lxb> list) {
        if (this.Lxb == null) {
            this.Lxb = kqm.lk();
        }
        if (this.Lxb == null) {
            return null;
        }
        int iAe = VVE.TA().ae();
        if (3 == iAe) {
            return this.Lxb.Lxb(this.LD.Lxb(this.LD.Lxb(list, false), System.currentTimeMillis(), this.LD.LD(), true), this.LD.Lxb(list), true);
        }
        if (2 == iAe) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObjectLD = this.LD.LD();
            this.Lxb.Lxb(this.LD.Lxb(this.LD.Lxb(list, true), jCurrentTimeMillis, jSONObjectLD, true), this.LD.Lxb(list), true);
            return this.Lxb.Lxb(this.LD.Lxb(this.LD.LD(list), jCurrentTimeMillis, jSONObjectLD, false), this.LD.Lxb(list), false);
        }
        return this.Lxb.Lxb(this.LD.Lxb(list, System.currentTimeMillis(), this.LD.LD(), false), this.LD.Lxb(list), false);
    }
}
