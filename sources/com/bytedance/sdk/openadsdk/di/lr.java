package com.bytedance.sdk.openadsdk.di;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.mj;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.vr;
import com.bytedance.sdk.openadsdk.slm.ka;
import com.bytedance.sdk.openadsdk.slm.ri.ik;
import com.bytedance.sdk.openadsdk.utils.oh;
import com.ironsource.C3700q2;
import com.ironsource.Ua;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    private static volatile lr ri;
    private final ConcurrentHashMap<String, com.bytedance.sdk.openadsdk.bu.ri> lr = new ConcurrentHashMap<>();
    private com.bytedance.sdk.openadsdk.bu.ri ik = null;
    private volatile boolean ka = false;
    private volatile HandlerThread fi = null;
    private volatile Handler di = null;
    private String xha = "";
    private int mj = 0;
    private volatile long jbs = 0;
    private final Runnable qt = new Runnable() { // from class: com.bytedance.sdk.openadsdk.di.lr.6
        @Override // java.lang.Runnable
        public void run() {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    if (ri.ri().fi()) {
                        Set<String> setKeySet = lr.this.lr.keySet();
                        if (setKeySet.size() > lr.this.mj) {
                            lr.this.mj = setKeySet.size();
                        }
                        HashSet hashSet = new HashSet(5);
                        ArrayList arrayList = new ArrayList(setKeySet.size());
                        arrayList.addAll(lr.this.lr.values());
                        Collections.sort(arrayList);
                        for (int i = 0; i < arrayList.size() && i < 5; i++) {
                            hashSet.add(((com.bytedance.sdk.openadsdk.bu.ri) arrayList.get(i)).lr());
                        }
                        try {
                            for (String str : setKeySet) {
                                com.bytedance.sdk.openadsdk.bu.ri riVar = (com.bytedance.sdk.openadsdk.bu.ri) lr.this.lr.get(str);
                                if (riVar != null) {
                                    JSONObject jSONObjectRi = riVar.ri(jSONObject2);
                                    if (hashSet.contains(str)) {
                                        jSONObject.put(str, jSONObjectRi);
                                    }
                                }
                            }
                            jSONObject.put("common", jSONObject2);
                        } catch (JSONException e) {
                            ac.ik(e.getMessage(), new Object[0]);
                        }
                    } else {
                        try {
                            if (lr.this.ik != null) {
                                jSONObject.put("common", lr.this.ik.ri(jSONObject2));
                            }
                        } catch (JSONException e2) {
                            ac.ik(e2.getMessage(), new Object[0]);
                        }
                    }
                } catch (Throwable th) {
                    ac.ik(th.getMessage(), new Object[0]);
                }
                lr.this.xha = jSONObject.toString();
                lr lrVar = lr.this;
                lrVar.ri(lrVar.qt, ri.ri().ka());
            } catch (OutOfMemoryError e3) {
                ac.ik(e3.getMessage(), new Object[0]);
            }
        }
    };

    private lr() {
    }

    private void fi() {
        if (this.ka) {
            return;
        }
        this.ka = true;
        ri(this.qt, ri.ri().ka());
    }

    private Handler ik() {
        if (this.fi == null || !this.fi.isAlive()) {
            synchronized (vr.class) {
                try {
                    if (this.fi == null || !this.fi.isAlive()) {
                        this.fi = mj.ri("pag_feature", -1);
                        this.di = new Handler(this.fi.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (this.di == null) {
            synchronized (vr.class) {
                try {
                    if (this.di == null) {
                        this.di = new Handler(this.fi.getLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.di;
    }

    private void ka() {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.jbs > Ua.s) {
            ka.ri("track_feature_result", false, new com.bytedance.sdk.openadsdk.slm.lr() { // from class: com.bytedance.sdk.openadsdk.di.lr.1
                @Override // com.bytedance.sdk.openadsdk.slm.lr
                public ik ri() throws Exception {
                    lr.this.jbs = jElapsedRealtime;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, String.valueOf(lr.this.mj));
                    return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("track_feature_result").lr(jSONObject.toString());
                }
            });
        }
    }

    public void lr() {
        try {
            if (ri.ri().ik()) {
                ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.di.lr.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!ri.ri().fi()) {
                            if (lr.this.ik != null) {
                                lr.this.ik.ri();
                            }
                        } else {
                            Iterator it = lr.this.lr.keySet().iterator();
                            while (it.hasNext()) {
                                com.bytedance.sdk.openadsdk.bu.ri riVar = (com.bytedance.sdk.openadsdk.bu.ri) lr.this.lr.get((String) it.next());
                                if (riVar != null) {
                                    riVar.ri();
                                }
                            }
                        }
                    }
                });
            }
        } catch (OutOfMemoryError e) {
            ac.ik(e.getMessage(), new Object[0]);
        }
    }

    private void ri(Runnable runnable) {
        if (oh.ri || runnable == null) {
            return;
        }
        try {
            ik().post(runnable);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(Runnable runnable, long j) {
        if (oh.ri || runnable == null) {
            return;
        }
        try {
            ik().postDelayed(runnable, j);
        } catch (Throwable unused) {
        }
    }

    public static lr ri() {
        if (ri == null) {
            synchronized (com.bytedance.sdk.openadsdk.core.ik.class) {
                try {
                    if (ri == null) {
                        ri = new lr();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ri;
    }

    public void ri(JSONObject jSONObject) {
        if (ri.ri().ik()) {
            try {
                jSONObject.put("feature_data", this.xha);
                ka();
            } catch (JSONException e) {
                ac.ik(e.getMessage(), new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(String str, String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && ri.ri().ik()) {
                fi();
                if (ri.ri().fi()) {
                    com.bytedance.sdk.openadsdk.bu.ri riVar = this.lr.get(str2);
                    if (riVar == null) {
                        riVar = new com.bytedance.sdk.openadsdk.bu.ri(str2);
                    }
                    riVar.ri(str, str3);
                    this.lr.put(str2, riVar);
                    return;
                }
                if (this.ik == null) {
                    this.ik = new com.bytedance.sdk.openadsdk.bu.ri(str2);
                }
                this.ik.ri(str, str3);
            }
        } catch (OutOfMemoryError e) {
            ac.ik(e.getMessage(), new Object[0]);
        }
    }

    public void ri(final String str, final String str2, final String str3, String str4) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !ri.ri().ik()) {
            return;
        }
        if (!C3700q2.v.equals(str) && !"click".equals(str) && !"dislike".equals(str)) {
            if (ri.ri().nr()) {
                if (TextUtils.isEmpty(str4)) {
                    return;
                }
                if (!"rewarded_video".equals(str4) && !"fullscreen_interstitial_ad".equals(str4) && !"open_ad".equals(str4)) {
                    return;
                }
            }
            if ("feed_play".equals(str) || "feed_pause".equals(str) || "feed_continue".equals(str) || "feed_over".equals(str) || "feed_break".equals(str) || "play_error".equals(str)) {
                ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.di.lr.3
                    @Override // java.lang.Runnable
                    public void run() {
                        lr.this.ri(str, str2, str3);
                    }
                });
                return;
            }
            return;
        }
        ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.di.lr.2
            @Override // java.lang.Runnable
            public void run() {
                lr.this.ri(str, str2, str3);
            }
        });
    }

    public void ri(final String str, final wjv wjvVar) {
        if (!TextUtils.isEmpty(str) && ri.ri().ik() && wjv.fi(wjvVar)) {
            if (!ri.ri().nr() || wjvVar.go() == 8 || wjvVar.go() == 7 || wjvVar.go() == 3) {
                if ("videoPercent30".equals(str) || "videoForceBreak".equals(str)) {
                    ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.di.lr.4
                        @Override // java.lang.Runnable
                        public void run() {
                            String strFe = wjvVar.fe();
                            String strJf = wjvVar.jf();
                            if (TextUtils.isEmpty(strFe)) {
                                return;
                            }
                            lr.this.ri(str, strFe, strJf);
                        }
                    });
                }
            }
        }
    }

    public void ri(final String str, final wjv wjvVar, final String str2) {
        if (TextUtils.isEmpty(str) || !ri.ri().ik()) {
            return;
        }
        if ("landingStart".equals(str) || "landingFinish".equals(str) || "landingContinue".equals(str) || "landingPause".equals(str)) {
            ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.di.lr.5
                @Override // java.lang.Runnable
                public void run() {
                    wjv wjvVar2 = wjvVar;
                    if (wjvVar2 == null || TextUtils.isEmpty(wjvVar2.fe())) {
                        return;
                    }
                    lr.this.ri(str, wjvVar.fe(), wjvVar.jf() + str2);
                }
            });
        }
    }
}
