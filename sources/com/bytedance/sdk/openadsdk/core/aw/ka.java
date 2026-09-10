package com.bytedance.sdk.openadsdk.core.aw;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.ri.ri.ri.ik.attabal;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ka {
    private boolean ac;
    private wjv bu;
    private String ihz;
    private boolean nr;
    private long slm;
    private boolean tan;
    private String uq;
    private boolean vr;
    private final AtomicBoolean aw = new AtomicBoolean(false);
    private final AtomicBoolean bgr = new AtomicBoolean(false);
    public List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> ri = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> lr = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> ik = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> ka = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> fi = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> di = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> xha = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> mj = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> jbs = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> qt = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.aw.lr.lr> sf = new ArrayList();

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.aw.lr.ri> f18101co = new ArrayList();

    public void co(List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> list) {
        this.qt.addAll(list);
    }

    public void di(long j) {
        if (!ri(j, this.xha, null, this.vr ? null : new com.bytedance.sdk.openadsdk.core.aw.lr.ik.lr("skip", this.bu)) || this.vr) {
            return;
        }
        com.bytedance.sdk.openadsdk.ka.ik.lr(this.bu, this.ihz, "track_skip", (JSONObject) null);
    }

    public void fi(long j) {
        if (this.bgr.compareAndSet(false, true)) {
            ri(j, this.di, (com.bytedance.sdk.openadsdk.core.aw.ri.ri) null);
        }
    }

    public void ik(long j) {
        if (!ri(j, this.ka, null, this.vr ? null : new com.bytedance.sdk.openadsdk.core.aw.lr.ik.lr(CampaignEx.JSON_NATIVE_VIDEO_RESUME, this.bu, j)) || this.vr) {
            return;
        }
        com.bytedance.sdk.openadsdk.ka.ik.lr(this.bu, this.ihz, "track_resume", (JSONObject) null);
    }

    public void jbs(long j) {
        if (!ri(j, this.qt, null, this.vr ? null : new com.bytedance.sdk.openadsdk.core.aw.lr.ik.lr(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE, this.bu, j)) || this.vr) {
            return;
        }
        com.bytedance.sdk.openadsdk.ka.ik.lr(this.bu, this.ihz, "track_unmute", (JSONObject) null);
    }

    public void ka(long j) {
        if (!ri(j, this.fi, null, new com.bytedance.sdk.openadsdk.core.aw.lr.ik.lr(this.vr ? "video_progress" : CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, this.bu, 1.0f)) || this.vr) {
            return;
        }
        com.bytedance.sdk.openadsdk.ka.ik.lr(this.bu, this.ihz, "track_complete", (JSONObject) null);
    }

    public void lr(long j) {
        if (!ri(j, this.ik, null, this.vr ? null : new com.bytedance.sdk.openadsdk.core.aw.lr.ik.lr(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, this.bu, j)) || this.vr) {
            return;
        }
        com.bytedance.sdk.openadsdk.ka.ik.lr(this.bu, this.ihz, "track_pause", (JSONObject) null);
    }

    public void mj(long j) {
        if (!ri(j, this.jbs, null, this.vr ? null : new com.bytedance.sdk.openadsdk.core.aw.lr.ik.lr(CampaignEx.JSON_NATIVE_VIDEO_MUTE, this.bu, j)) || this.vr) {
            return;
        }
        com.bytedance.sdk.openadsdk.ka.ik.lr(this.bu, this.ihz, "track_mute", (JSONObject) null);
    }

    public void qt(List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> list) {
        this.ri.addAll(list);
    }

    public void ri(com.bytedance.sdk.openadsdk.core.aw.ri.ri riVar) {
        if (!ri(-1L, this.ri, riVar, this.vr ? null : new com.bytedance.sdk.openadsdk.core.aw.lr.ik.lr("error", this.bu, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) || this.vr) {
            return;
        }
        com.bytedance.sdk.openadsdk.ka.ik.lr(this.bu, this.ihz, "track_error", (JSONObject) null);
    }

    public void sf(List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> list) {
        this.jbs.addAll(list);
    }

    public void xha(long j) {
        if (!ri(j, this.mj, null, new com.bytedance.sdk.openadsdk.core.aw.lr.ik.lr(this.vr ? "click" : "clickTracking", this.bu)) || this.vr) {
            return;
        }
        com.bytedance.sdk.openadsdk.ka.ik.lr(this.bu, this.ihz, "track_video_click", (JSONObject) null);
    }

    public void fi(List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> list) {
        this.di.addAll(list);
    }

    public void di(List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> list) {
        this.xha.addAll(list);
    }

    public void ik(List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> list) {
        this.ka.addAll(list);
    }

    public void jbs(List<com.bytedance.sdk.openadsdk.core.aw.lr.ri> list) {
        this.f18101co.addAll(list);
        Collections.sort(this.f18101co);
    }

    public void ka(List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> list) {
        this.fi.addAll(list);
    }

    public void lr(List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> list) {
        this.ik.addAll(list);
    }

    public void mj(List<com.bytedance.sdk.openadsdk.core.aw.lr.lr> list) {
        this.sf.addAll(list);
        Collections.sort(this.sf);
    }

    public void ri(long j) {
        if (this.aw.compareAndSet(false, true)) {
            if (!ri(j, this.lr, null, new com.bytedance.sdk.openadsdk.core.aw.lr.ik.lr(this.vr ? "show_impression" : "impression", this.bu)) || this.vr) {
                return;
            }
            com.bytedance.sdk.openadsdk.ka.ik.lr(this.bu, this.ihz, "track_impression", (JSONObject) null);
        }
    }

    public void xha(List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> list) {
        this.mj.addAll(list);
    }

    public void ri(long j, long j2, di diVar) {
        com.bytedance.sdk.openadsdk.core.aw.lr.ik.lr lrVar;
        if (System.currentTimeMillis() - this.slm >= 1000 && j >= 0 && j2 > 0) {
            this.slm = System.currentTimeMillis();
            float f = j / j2;
            List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> listRi = ri(j, f);
            float f2 = 0.25f;
            if (f >= 0.25f && !this.nr) {
                ri("firstQuartile");
                this.nr = true;
                if (diVar != null) {
                    ri(diVar, 6);
                }
                if (!this.vr) {
                    lrVar = new com.bytedance.sdk.openadsdk.core.aw.lr.ik.lr("firstQuartile", this.bu, 0.25f);
                    f = f2;
                }
                f = f2;
                lrVar = null;
            } else {
                f2 = 0.5f;
                if (f >= 0.5f && !this.tan) {
                    ri(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT);
                    this.tan = true;
                    if (diVar != null) {
                        ri(diVar, 7);
                    }
                    if (!this.vr) {
                        lrVar = new com.bytedance.sdk.openadsdk.core.aw.lr.ik.lr(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT, this.bu, 0.5f);
                        f = f2;
                    }
                    f = f2;
                    lrVar = null;
                } else {
                    f2 = 0.75f;
                    if (f < 0.75f || this.ac) {
                        lrVar = null;
                    } else {
                        ri("thirdQuartile");
                        this.ac = true;
                        if (diVar != null) {
                            ri(diVar, 8);
                        }
                        if (!this.vr) {
                            lrVar = new com.bytedance.sdk.openadsdk.core.aw.lr.ik.lr("thirdQuartile", this.bu, 0.75f);
                            f = f2;
                        }
                        f = f2;
                        lrVar = null;
                    }
                }
            }
            if (f < 0.03f) {
                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            if (!this.vr && !listRi.isEmpty()) {
                com.bytedance.sdk.openadsdk.core.aw.lr.ik ikVar = listRi.get(0);
                if ((ikVar instanceof com.bytedance.sdk.openadsdk.core.aw.lr.ri) && ((com.bytedance.sdk.openadsdk.core.aw.lr.ri) ikVar).ri() == 0) {
                    com.bytedance.sdk.openadsdk.ka.ik.lr(this.bu, this.ihz, "track_start", (JSONObject) null);
                    lrVar = new com.bytedance.sdk.openadsdk.core.aw.lr.ik.lr("start", this.bu, f);
                }
            }
            if (listRi.isEmpty()) {
                return;
            }
            if (lrVar == null) {
                lrVar = new com.bytedance.sdk.openadsdk.core.aw.lr.ik.lr("video_progress", this.bu, f);
            }
            ri(j, listRi, null, lrVar);
        }
    }

    private void ri(final di diVar, final int i) {
        com.bytedance.sdk.component.utils.jbs.lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.aw.ka.1
            @Override // java.lang.Runnable
            public void run() {
                di diVar2 = diVar;
                if (diVar2 != null) {
                    diVar2.ri(i);
                }
            }
        });
    }

    private void ri(String str) {
        try {
            if (this.vr) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(NotificationCompat.CATEGORY_EVENT, str);
                com.bytedance.sdk.openadsdk.ka.ik.lr(this.bu, this.ihz, "vast_play_track", jSONObject);
            } else if ("firstQuartile".equals(str)) {
                com.bytedance.sdk.openadsdk.ka.ik.lr(this.bu, this.ihz, "track_first_quartile", (JSONObject) null);
            } else if (CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT.equals(str)) {
                com.bytedance.sdk.openadsdk.ka.ik.lr(this.bu, this.ihz, "track_midpoint", (JSONObject) null);
            } else if ("thirdQuartile".equals(str)) {
                com.bytedance.sdk.openadsdk.ka.ik.lr(this.bu, this.ihz, "track_third_quartile", (JSONObject) null);
            }
        } catch (Throwable unused) {
        }
    }

    private boolean ri(long j, List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> list, com.bytedance.sdk.openadsdk.core.aw.ri.ri riVar, com.bytedance.sdk.openadsdk.core.aw.lr.ik.lr lrVar) {
        attabal attabalVarEu;
        wjv wjvVar = this.bu;
        String strSupplicat = null;
        if (wjvVar != null && (attabalVarEu = wjvVar.eu()) != null) {
            strSupplicat = attabalVarEu.supplicat();
        }
        return com.bytedance.sdk.openadsdk.core.aw.lr.ik.ri(this.bu, list, riVar, j, strSupplicat, lrVar, ri());
    }

    private String ri() {
        if (this.uq == null) {
            this.uq = UUID.randomUUID().toString();
        }
        return this.uq;
    }

    private boolean ri(long j, List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> list, com.bytedance.sdk.openadsdk.core.aw.ri.ri riVar) {
        return ri(j, list, riVar, null);
    }

    public List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> ri(long j, float f) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.sf.size(); i++) {
            com.bytedance.sdk.openadsdk.core.aw.lr.lr lrVar = this.sf.get(i);
            if (lrVar.ri(f)) {
                arrayList.add(lrVar);
            }
        }
        for (int i2 = 0; i2 < this.f18101co.size(); i2++) {
            com.bytedance.sdk.openadsdk.core.aw.lr.ri riVar = this.f18101co.get(i2);
            if (riVar.ri(j)) {
                arrayList.add(riVar);
            }
        }
        return arrayList;
    }

    public void ri(List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> list) {
        this.lr.addAll(list);
    }

    public void ri(JSONObject jSONObject) {
        qt(com.bytedance.sdk.openadsdk.core.aw.lr.ik.ri(jSONObject.optJSONArray("errorTrackers")));
        ri(com.bytedance.sdk.openadsdk.core.aw.lr.ik.ri(jSONObject.optJSONArray(InMobiNetworkValues.IMPRESSION_TRACKERS)));
        lr(com.bytedance.sdk.openadsdk.core.aw.lr.ik.ri(jSONObject.optJSONArray("pauseTrackers"), true));
        ik(com.bytedance.sdk.openadsdk.core.aw.lr.ik.ri(jSONObject.optJSONArray("resumeTrackers"), true));
        ka(com.bytedance.sdk.openadsdk.core.aw.lr.ik.ri(jSONObject.optJSONArray("completeTrackers")));
        fi(com.bytedance.sdk.openadsdk.core.aw.lr.ik.ri(jSONObject.optJSONArray("closeTrackers")));
        di(com.bytedance.sdk.openadsdk.core.aw.lr.ik.ri(jSONObject.optJSONArray("skipTrackers")));
        xha(com.bytedance.sdk.openadsdk.core.aw.lr.ik.ri(jSONObject.optJSONArray("clickTrackers")));
        sf(com.bytedance.sdk.openadsdk.core.aw.lr.ik.ri(jSONObject.optJSONArray("muteTrackers"), true));
        co(com.bytedance.sdk.openadsdk.core.aw.lr.ik.ri(jSONObject.optJSONArray("unMuteTrackers"), true));
        mj(com.bytedance.sdk.openadsdk.core.aw.lr.ik.lr(jSONObject.optJSONArray("fractionalTrackers")));
        jbs(com.bytedance.sdk.openadsdk.core.aw.lr.ik.ik(jSONObject.optJSONArray("absoluteTrackers")));
    }

    public void ri(wjv wjvVar) {
        this.bu = wjvVar;
        this.ihz = wjvVar.fi();
        this.vr = wjvVar.zz();
    }

    public void ri(String str, long j) {
        if (TextUtils.isEmpty(str) || j < 0) {
            return;
        }
        jbs(Collections.singletonList(new com.bytedance.sdk.openadsdk.core.aw.lr.ri.C0230ri(str, j).ri()));
    }

    public void ri(String str, float f) {
        if (TextUtils.isEmpty(str) || f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        mj(Collections.singletonList(new com.bytedance.sdk.openadsdk.core.aw.lr.lr.ri(str, f).ri()));
    }

    public void ri(ka kaVar) {
        qt(kaVar.ri);
        ri(kaVar.lr);
        lr(kaVar.ik);
        ik(kaVar.ka);
        ka(kaVar.fi);
        fi(kaVar.di);
        di(kaVar.xha);
        xha(kaVar.mj);
        sf(kaVar.jbs);
        co(kaVar.qt);
        mj(kaVar.sf);
        jbs(kaVar.f18101co);
    }
}
