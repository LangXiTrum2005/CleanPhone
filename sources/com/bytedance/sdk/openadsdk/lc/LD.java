package com.bytedance.sdk.openadsdk.lc;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.work.WorkRequest;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.STP.Lxb.ZU;
import com.bytedance.sdk.openadsdk.STP.lk;
import com.bytedance.sdk.openadsdk.core.STP;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.Ivz;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    private static volatile LD Lxb;
    private final ConcurrentHashMap<String, com.bytedance.sdk.openadsdk.IeN.Lxb> LD = new ConcurrentHashMap<>();
    private com.bytedance.sdk.openadsdk.IeN.Lxb lk = null;
    private volatile boolean ZU = false;
    private volatile HandlerThread JXs = null;
    private volatile Handler lc = null;
    private String ebl = "";
    private int OY = 0;
    private volatile long QAg = 0;
    private final Runnable nBu = new Runnable() { // from class: com.bytedance.sdk.openadsdk.lc.LD.6
        @Override // java.lang.Runnable
        public void run() {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    if (Lxb.Lxb().JXs()) {
                        Set<String> setKeySet = LD.this.LD.keySet();
                        if (setKeySet.size() > LD.this.OY) {
                            LD.this.OY = setKeySet.size();
                        }
                        HashSet hashSet = new HashSet(5);
                        ArrayList arrayList = new ArrayList(setKeySet.size());
                        arrayList.addAll(LD.this.LD.values());
                        Collections.sort(arrayList);
                        for (int i = 0; i < arrayList.size() && i < 5; i++) {
                            hashSet.add(((com.bytedance.sdk.openadsdk.IeN.Lxb) arrayList.get(i)).LD());
                        }
                        try {
                            for (String str : setKeySet) {
                                com.bytedance.sdk.openadsdk.IeN.Lxb lxb = (com.bytedance.sdk.openadsdk.IeN.Lxb) LD.this.LD.get(str);
                                if (lxb != null) {
                                    JSONObject jSONObjectLxb = lxb.Lxb(jSONObject2);
                                    if (hashSet.contains(str)) {
                                        jSONObject.put(str, jSONObjectLxb);
                                    }
                                }
                            }
                            jSONObject.put("common", jSONObject2);
                        } catch (JSONException e) {
                            sLN.LD(e.getMessage());
                        }
                    } else {
                        try {
                            if (LD.this.lk != null) {
                                jSONObject.put("common", LD.this.lk.Lxb(jSONObject2));
                            }
                        } catch (JSONException e2) {
                            sLN.LD(e2.getMessage());
                        }
                    }
                } catch (Throwable th) {
                    sLN.LD(th.getMessage());
                }
                LD.this.ebl = jSONObject.toString();
                LD ld = LD.this;
                ld.Lxb(ld.nBu, Lxb.Lxb().ZU());
            } catch (OutOfMemoryError e3) {
                sLN.LD(e3.getMessage());
            }
        }
    };

    private LD() {
    }

    private void JXs() {
        if (this.ZU) {
            return;
        }
        this.ZU = true;
        Lxb(this.nBu, Lxb.Lxb().ZU());
    }

    private void ZU() {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.QAg > WorkRequest.MIN_BACKOFF_MILLIS) {
            lk.Lxb("track_feature_result", false, new com.bytedance.sdk.openadsdk.STP.LD() { // from class: com.bytedance.sdk.openadsdk.lc.LD.1
                @Override // com.bytedance.sdk.openadsdk.STP.LD
                @Nullable
                public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                    LD.this.QAg = jElapsedRealtime;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, String.valueOf(LD.this.OY));
                    return ZU.LD().Lxb("track_feature_result").LD(jSONObject.toString());
                }
            });
        }
    }

    private Handler lk() {
        if (this.JXs == null || !this.JXs.isAlive()) {
            synchronized (STP.class) {
                try {
                    if (this.JXs == null || !this.JXs.isAlive()) {
                        this.JXs = new HandlerThread("csj_feature", -1);
                        this.JXs.start();
                        this.lc = new Handler(this.JXs.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (this.lc == null) {
            synchronized (STP.class) {
                try {
                    if (this.lc == null) {
                        this.lc = new Handler(this.JXs.getLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.lc;
    }

    public void LD() {
        try {
            if (Lxb.Lxb().lk()) {
                Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lc.LD.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!Lxb.Lxb().JXs()) {
                            if (LD.this.lk != null) {
                                LD.this.lk.Lxb();
                            }
                        } else {
                            Iterator it = LD.this.LD.keySet().iterator();
                            while (it.hasNext()) {
                                com.bytedance.sdk.openadsdk.IeN.Lxb lxb = (com.bytedance.sdk.openadsdk.IeN.Lxb) LD.this.LD.get((String) it.next());
                                if (lxb != null) {
                                    lxb.Lxb();
                                }
                            }
                        }
                    }
                });
            }
        } catch (OutOfMemoryError e) {
            sLN.LD(e.getMessage());
        }
    }

    private void Lxb(Runnable runnable) {
        if (Ivz.Lxb || runnable == null) {
            return;
        }
        try {
            lk().post(runnable);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(Runnable runnable, long j) {
        if (Ivz.Lxb || runnable == null) {
            return;
        }
        try {
            lk().postDelayed(runnable, j);
        } catch (Throwable unused) {
        }
    }

    public static LD Lxb() {
        if (Lxb == null) {
            synchronized (com.bytedance.sdk.openadsdk.core.lk.class) {
                try {
                    if (Lxb == null) {
                        Lxb = new LD();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Lxb;
    }

    public void Lxb(JSONObject jSONObject) {
        if (Lxb.Lxb().lk()) {
            try {
                jSONObject.put("feature_data", this.ebl);
                ZU();
            } catch (JSONException e) {
                sLN.LD(e.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(@NonNull String str, @NonNull String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && Lxb.Lxb().lk()) {
                JXs();
                if (Lxb.Lxb().JXs()) {
                    com.bytedance.sdk.openadsdk.IeN.Lxb lxb = this.LD.get(str2);
                    if (lxb == null) {
                        lxb = new com.bytedance.sdk.openadsdk.IeN.Lxb(str2);
                    }
                    lxb.Lxb(str, str3);
                    this.LD.put(str2, lxb);
                    return;
                }
                if (this.lk == null) {
                    this.lk = new com.bytedance.sdk.openadsdk.IeN.Lxb(str2);
                }
                this.lk.Lxb(str, str3);
            }
        } catch (OutOfMemoryError e) {
            sLN.LD(e.getMessage());
        }
    }

    public void Lxb(@NonNull final String str, @NonNull final String str2, final String str3, String str4) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !Lxb.Lxb().lk()) {
            return;
        }
        if (!"show".equals(str) && !CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str) && !"dislike".equals(str)) {
            if (Lxb.Lxb().brP()) {
                if (TextUtils.isEmpty(str4)) {
                    return;
                }
                if (!"rewarded_video".equals(str4) && !"fullscreen_interstitial_ad".equals(str4) && !"open_ad".equals(str4)) {
                    return;
                }
            }
            if ("feed_play".equals(str) || "feed_pause".equals(str) || "feed_continue".equals(str) || "feed_over".equals(str) || "feed_break".equals(str) || "play_error".equals(str)) {
                Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lc.LD.3
                    @Override // java.lang.Runnable
                    public void run() {
                        LD.this.Lxb(str, str2, str3);
                    }
                });
                return;
            }
            return;
        }
        Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lc.LD.2
            @Override // java.lang.Runnable
            public void run() {
                LD.this.Lxb(str, str2, str3);
            }
        });
    }

    public void Lxb(@NonNull final String str, final tD tDVar) {
        if (!TextUtils.isEmpty(str) && Lxb.Lxb().lk() && tD.JXs(tDVar)) {
            if (!Lxb.Lxb().brP() || tDVar.op() == 8 || tDVar.op() == 7 || tDVar.op() == 3) {
                if ("videoPercent30".equals(str) || "videoForceBreak".equals(str)) {
                    Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lc.LD.4
                        @Override // java.lang.Runnable
                        public void run() {
                            String strRO = tDVar.rO();
                            String strXNP = tDVar.xNP();
                            if (TextUtils.isEmpty(strRO)) {
                                return;
                            }
                            LD.this.Lxb(str, strRO, strXNP);
                        }
                    });
                }
            }
        }
    }

    public void Lxb(@NonNull final String str, final tD tDVar, final String str2) {
        if (TextUtils.isEmpty(str) || !Lxb.Lxb().lk()) {
            return;
        }
        if ("landingStart".equals(str) || "landingFinish".equals(str) || "landingContinue".equals(str) || "landingPause".equals(str)) {
            Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lc.LD.5
                @Override // java.lang.Runnable
                public void run() {
                    tD tDVar2 = tDVar;
                    if (tDVar2 == null || TextUtils.isEmpty(tDVar2.rO())) {
                        return;
                    }
                    LD.this.Lxb(str, tDVar.rO(), tDVar.xNP() + str2);
                }
            });
        }
    }
}
