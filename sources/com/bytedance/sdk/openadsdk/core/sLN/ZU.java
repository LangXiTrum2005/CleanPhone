package com.bytedance.sdk.openadsdk.core.sLN;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ZU {
    private boolean DY;
    private final Lxb NXR;
    private String Sfi;
    private long VVE;
    private boolean brP;
    private tD kqm;
    private boolean tD;
    public List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> Lxb = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> LD = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> lk = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> ZU = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> JXs = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> lc = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> ebl = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> OY = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> QAg = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> nBu = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.sLN.LD.LD> JVA = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.sLN.LD.Lxb> sLN = new ArrayList();
    private final AtomicBoolean STP = new AtomicBoolean(false);
    private final AtomicBoolean IeN = new AtomicBoolean(false);

    public ZU(Lxb lxb) {
        this.NXR = lxb;
    }

    public void JVA(List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> list) {
        this.QAg.addAll(list);
    }

    public void JXs(long j) {
        if (this.IeN.compareAndSet(false, true)) {
            Lxb(j, this.lc, (com.bytedance.sdk.openadsdk.core.sLN.Lxb.Lxb) null);
        }
    }

    public void LD(long j) {
        Lxb(j, this.lk, (com.bytedance.sdk.openadsdk.core.sLN.Lxb.Lxb) null);
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.sLN.Lxb.Lxb lxb) {
        Lxb(-1L, this.Lxb, lxb);
    }

    public void OY(long j) {
        Lxb(j, this.QAg, (com.bytedance.sdk.openadsdk.core.sLN.Lxb.Lxb) null);
    }

    public void QAg(long j) {
        Lxb(j, this.nBu, (com.bytedance.sdk.openadsdk.core.sLN.Lxb.Lxb) null);
    }

    public void ZU(long j) {
        Lxb(j, this.JXs, null, new com.bytedance.sdk.openadsdk.core.sLN.LD.lk.LD("video_progress", this.kqm, 1.0f));
    }

    public void ebl(long j) {
        Lxb(j, this.OY, null, new com.bytedance.sdk.openadsdk.core.sLN.LD.lk.LD(CampaignEx.JSON_NATIVE_VIDEO_CLICK, this.kqm));
    }

    public void lc(long j) {
        Lxb(j, this.ebl, (com.bytedance.sdk.openadsdk.core.sLN.Lxb.Lxb) null);
    }

    public void lk(long j) {
        Lxb(j, this.ZU, (com.bytedance.sdk.openadsdk.core.sLN.Lxb.Lxb) null);
    }

    public void nBu(List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> list) {
        this.Lxb.addAll(list);
    }

    public void sLN(List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> list) {
        this.nBu.addAll(list);
    }

    private void LD(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_EVENT, str);
            com.bytedance.sdk.openadsdk.ZU.lk.LD(this.kqm, this.Sfi, "vast_play_track", jSONObject);
        } catch (Throwable unused) {
        }
    }

    public void Lxb(long j) {
        if (this.STP.compareAndSet(false, true)) {
            Lxb(j, this.LD, null, new com.bytedance.sdk.openadsdk.core.sLN.LD.lk.LD("show_impression", this.kqm));
        }
    }

    public void OY(List<com.bytedance.sdk.openadsdk.core.sLN.LD.LD> list) {
        this.JVA.addAll(list);
        Collections.sort(this.JVA);
    }

    public void QAg(List<com.bytedance.sdk.openadsdk.core.sLN.LD.Lxb> list) {
        this.sLN.addAll(list);
        Collections.sort(this.sLN);
    }

    public void ZU(List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> list) {
        this.JXs.addAll(list);
    }

    public void ebl(List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> list) {
        this.OY.addAll(list);
    }

    public void lc(List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> list) {
        this.ebl.addAll(list);
    }

    public void lk(List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> list) {
        this.ZU.addAll(list);
    }

    private JSONArray lk() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<com.bytedance.sdk.openadsdk.core.sLN.LD.Lxb> it = this.sLN.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().Lxb());
        }
        return jSONArray;
    }

    public void JXs(List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> list) {
        this.lc.addAll(list);
    }

    public void Lxb(long j, long j2, lc lcVar) {
        if (System.currentTimeMillis() - this.VVE >= 1000 && j >= 0 && j2 > 0) {
            this.VVE = System.currentTimeMillis();
            float f = j / j2;
            List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> listLxb = Lxb(j, f);
            if (f >= 0.25f && !this.brP) {
                LD("firstQuartile");
                this.brP = true;
                if (lcVar != null) {
                    Lxb(lcVar, 6);
                }
                f = 0.25f;
            } else if (f >= 0.5f && !this.tD) {
                LD(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT);
                this.tD = true;
                if (lcVar != null) {
                    Lxb(lcVar, 7);
                }
                f = 0.5f;
            } else if (f >= 0.75f && !this.DY) {
                LD("thirdQuartile");
                this.DY = true;
                if (lcVar != null) {
                    Lxb(lcVar, 8);
                }
                f = 0.75f;
            }
            if (f < 0.03f) {
                f = 0.0f;
            }
            Lxb(j, listLxb, null, new com.bytedance.sdk.openadsdk.core.sLN.LD.lk.LD("video_progress", this.kqm, f));
        }
    }

    public void LD(List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> list) {
        this.lk.addAll(list);
    }

    private JSONArray LD() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<com.bytedance.sdk.openadsdk.core.sLN.LD.LD> it = this.JVA.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().LD());
        }
        return jSONArray;
    }

    private void Lxb(final lc lcVar, final int i) {
        com.bytedance.sdk.component.utils.ebl.LD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sLN.ZU.1
            @Override // java.lang.Runnable
            public void run() {
                lc lcVar2 = lcVar;
                if (lcVar2 != null) {
                    lcVar2.Lxb(i);
                }
            }
        });
    }

    private void Lxb(long j, List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> list, com.bytedance.sdk.openadsdk.core.sLN.Lxb.Lxb lxb, com.bytedance.sdk.openadsdk.core.sLN.LD.lk.LD ld) {
        Lxb lxb2 = this.NXR;
        com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(list, lxb, j, lxb2 != null ? lxb2.ebl() : null, ld);
    }

    private void Lxb(long j, List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> list, com.bytedance.sdk.openadsdk.core.sLN.Lxb.Lxb lxb) {
        Lxb(j, list, lxb, null);
    }

    public List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> Lxb(long j, float f) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.JVA.size(); i++) {
            com.bytedance.sdk.openadsdk.core.sLN.LD.LD ld = this.JVA.get(i);
            if (ld.Lxb(f)) {
                arrayList.add(ld);
            }
        }
        for (int i2 = 0; i2 < this.sLN.size(); i2++) {
            com.bytedance.sdk.openadsdk.core.sLN.LD.Lxb lxb = this.sLN.get(i2);
            if (lxb.Lxb(j)) {
                arrayList.add(lxb);
            }
        }
        return arrayList;
    }

    public void Lxb(List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> list) {
        this.LD.addAll(list);
    }

    public JSONObject Lxb() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorTrackers", com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(this.Lxb));
        jSONObject.put("impressionTrackers", com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(this.LD));
        jSONObject.put("pauseTrackers", com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(this.lk));
        jSONObject.put("resumeTrackers", com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(this.ZU));
        jSONObject.put("completeTrackers", com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(this.JXs));
        jSONObject.put("closeTrackers", com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(this.lc));
        jSONObject.put("skipTrackers", com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(this.ebl));
        jSONObject.put("clickTrackers", com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(this.OY));
        jSONObject.put("muteTrackers", com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(this.QAg));
        jSONObject.put("unMuteTrackers", com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(this.nBu));
        jSONObject.put("fractionalTrackers", LD());
        jSONObject.put("absoluteTrackers", lk());
        return jSONObject;
    }

    public void Lxb(JSONObject jSONObject) {
        nBu(com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(jSONObject.optJSONArray("errorTrackers")));
        Lxb(com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(jSONObject.optJSONArray("impressionTrackers")));
        LD(com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(jSONObject.optJSONArray("pauseTrackers"), true));
        lk(com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(jSONObject.optJSONArray("resumeTrackers"), true));
        ZU(com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(jSONObject.optJSONArray("completeTrackers")));
        JXs(com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(jSONObject.optJSONArray("closeTrackers")));
        lc(com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(jSONObject.optJSONArray("skipTrackers")));
        ebl(com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(jSONObject.optJSONArray("clickTrackers")));
        JVA(com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(jSONObject.optJSONArray("muteTrackers"), true));
        sLN(com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(jSONObject.optJSONArray("unMuteTrackers"), true));
        OY(com.bytedance.sdk.openadsdk.core.sLN.LD.lk.LD(jSONObject.optJSONArray("fractionalTrackers")));
        QAg(com.bytedance.sdk.openadsdk.core.sLN.LD.lk.lk(jSONObject.optJSONArray("absoluteTrackers")));
    }

    public void Lxb(tD tDVar) {
        this.kqm = tDVar;
    }

    public void Lxb(String str) {
        this.Sfi = str;
    }

    public void Lxb(String str, long j) {
        if (TextUtils.isEmpty(str) || j < 0) {
            return;
        }
        QAg(Collections.singletonList(new com.bytedance.sdk.openadsdk.core.sLN.LD.Lxb.C0109Lxb(str, j).Lxb()));
    }

    public void Lxb(String str, float f) {
        if (TextUtils.isEmpty(str) || f < 0.0f) {
            return;
        }
        OY(Collections.singletonList(new com.bytedance.sdk.openadsdk.core.sLN.LD.LD.Lxb(str, f).Lxb()));
    }

    public void Lxb(ZU zu) {
        nBu(zu.Lxb);
        Lxb(zu.LD);
        LD(zu.lk);
        lk(zu.ZU);
        ZU(zu.JXs);
        JXs(zu.lc);
        lc(zu.ebl);
        ebl(zu.OY);
        JVA(zu.QAg);
        sLN(zu.nBu);
        OY(zu.JVA);
        QAg(zu.sLN);
    }
}
