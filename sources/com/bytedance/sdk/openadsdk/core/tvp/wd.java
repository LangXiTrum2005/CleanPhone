package com.bytedance.sdk.openadsdk.core.tvp;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.core.model.bqt;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.mrf;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class wd {
    private com.bytedance.sdk.openadsdk.core.model.ljh jpc;
    private final Context lnr;
    private PAGBannerAdLoadListener mml;
    private AdSlot qdl;
    private final AtomicBoolean mzz = new AtomicBoolean(false);
    private int mo = 5;
    private final mrf wd = mrf.lnr();
    private final com.bytedance.sdk.openadsdk.core.oth ud = com.bytedance.sdk.openadsdk.core.yt.lnr();

    private wd(Context context) {
        if (context != null) {
            this.lnr = context.getApplicationContext();
        } else {
            this.lnr = com.bytedance.sdk.openadsdk.core.yt.qdl();
        }
    }

    public static wd qdl(Context context) {
        return new wd(context);
    }

    public void qdl(AdSlot adSlot, int i2, com.bytedance.sdk.openadsdk.common.mo moVar) {
        this.wd.mzz();
        if (this.mzz.get()) {
            return;
        }
        this.mo = i2;
        this.mzz.set(true);
        this.qdl = adSlot;
        if (moVar instanceof PAGBannerAdLoadListener) {
            this.mml = (PAGBannerAdLoadListener) moVar;
        }
        qdl(adSlot);
    }

    private void qdl(final AdSlot adSlot) {
        if (adSlot == null) {
            return;
        }
        bqt bqtVar = new bqt();
        bqtVar.tvp = 2;
        if (com.bytedance.sdk.openadsdk.utils.ud.qdl()) {
            this.ud.qdl(adSlot, bqtVar, this.mo, (com.bytedance.sdk.openadsdk.core.aaj) new com.bytedance.sdk.openadsdk.core.jyq() { // from class: com.bytedance.sdk.openadsdk.core.tvp.wd.1
                @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.oth.qdl
                public void qdl(int i2, String str) {
                    wd.this.qdl(i2, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.oth.qdl
                public void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, com.bytedance.sdk.openadsdk.core.model.lnr lnrVar) {
                    wd.this.qdl(qdlVar, lnrVar, adSlot);
                }
            });
        } else {
            this.ud.qdl(adSlot, bqtVar, this.mo, new com.bytedance.sdk.openadsdk.core.oth.qdl() { // from class: com.bytedance.sdk.openadsdk.core.tvp.wd.2
                @Override // com.bytedance.sdk.openadsdk.core.oth.qdl
                public void qdl(int i2, String str) {
                    wd.this.qdl(i2, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.oth.qdl
                public void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, com.bytedance.sdk.openadsdk.core.model.lnr lnrVar) {
                    wd.this.qdl(qdlVar, lnrVar, adSlot);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, com.bytedance.sdk.openadsdk.core.model.lnr lnrVar, AdSlot adSlot) {
        if (qdlVar.mml() != null && !qdlVar.mml().isEmpty()) {
            com.bytedance.sdk.openadsdk.core.model.ljh ljhVarRq = qdlVar.rq();
            this.jpc = ljhVarRq;
            qdl(ljhVarRq, adSlot);
            if (com.bytedance.sdk.component.utils.bjy.mml()) {
                Log.e("ExpressAdLoadManager", "onAdLoad: net work response duration = " + this.wd.mml() + "run in  " + Thread.currentThread().getName());
            }
            if (this.mzz.getAndSet(false)) {
                fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.tvp.wd.3
                    @Override // java.lang.Runnable
                    public void run() {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        if (wd.this.jpc != null) {
                            wd wdVar = wd.this;
                            wdVar.qdl(wdVar.jpc, jElapsedRealtime);
                        }
                    }
                });
                return;
            }
            return;
        }
        qdl(-3, com.bytedance.sdk.openadsdk.core.jpc.qdl(-3));
        lnrVar.qdl(-3);
        lnrVar.lnr(8);
        com.bytedance.sdk.openadsdk.core.model.lnr.qdl(lnrVar);
    }

    private void qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, AdSlot adSlot) {
        for (com.bytedance.sdk.openadsdk.core.model.ljh ljhVar2 : ljhVar.gxp()) {
            if (com.bytedance.sdk.openadsdk.core.model.ljh.mzz(ljhVar2) && ljhVar2.tdy() != null && ljhVar2.tdy().rq() != null) {
                if (com.bytedance.sdk.openadsdk.core.yt.mml().mzz(String.valueOf(ljhVar2.fz())) && com.bytedance.sdk.openadsdk.core.yt.mml().ijp()) {
                    com.bytedance.sdk.openadsdk.core.exu.qdl.ud udVarQdl = com.bytedance.sdk.openadsdk.core.model.ljh.qdl(CacheDirFactory.getICacheDir(ljhVar2.lhl()).lnr(), ljhVar2);
                    udVarQdl.qdl("material_meta", ljhVar2);
                    udVarQdl.qdl("ad_slot", adSlot);
                    com.bytedance.sdk.openadsdk.core.exu.mzz.qdl.qdl(udVarQdl, null);
                }
            }
        }
    }

    private PAGBannerAd qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        int width;
        int height;
        PAGBannerSize pAGBannerSizeFl = ljhVar.fl();
        float fMin = Math.min(this.qdl.getExpressViewAcceptedHeight(), 250.0f);
        if (pAGBannerSizeFl != null) {
            width = pAGBannerSizeFl.getWidth();
            height = pAGBannerSizeFl.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        float expressViewAcceptedWidth = width > 0 ? width : this.qdl.getExpressViewAcceptedWidth();
        if (height > 0) {
            fMin = height;
        }
        this.qdl.setExpressViewAccepted(expressViewAcceptedWidth, fMin);
        return new com.bytedance.sdk.openadsdk.core.mml.wd(this.lnr, ljhVar, this.qdl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, long j) {
        if (this.mml != null) {
            PAGBannerAd pAGBannerAdQdl = qdl(ljhVar);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jMml = this.wd.mml();
            if (!TextUtils.isEmpty(this.qdl.getBidAdm())) {
                com.bytedance.sdk.openadsdk.bjy.lnr.qdl(ljhVar, jMml);
            }
            this.mml.onAdLoaded(pAGBannerAdQdl);
            qdl(ljhVar, jMml, j, jElapsedRealtime);
        }
    }

    private void qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, final long j, final long j2, final long j3) {
        try {
            if (!com.bytedance.sdk.openadsdk.core.yt.mml().dk() || !com.bytedance.sdk.openadsdk.jyq.qdl.mml() || this.mo != 1 || ljhVar == null || ljhVar.gxp() == null || ljhVar.gxp().isEmpty() || ljhVar.mml().qdl() == null) {
                return;
            }
            final JSONObject jSONObjectQdl = ljhVar.mml().qdl();
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(System.currentTimeMillis(), ljhVar, jSONObjectQdl.optString("tag", ""), "load_ad_time", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.core.tvp.wd.4
                @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                public JSONObject lnr() {
                    try {
                        long jOptLong = jSONObjectQdl.optLong("callback_start", 0L);
                        long j4 = j2;
                        long j5 = j4 - jOptLong;
                        long j6 = j3 - j4;
                        JSONObject jSONObjectOptJSONObject = jSONObjectQdl.optJSONObject("extra_data");
                        if (jSONObjectOptJSONObject == null) {
                            jSONObjectOptJSONObject = new JSONObject();
                        }
                        jSONObjectOptJSONObject.put("thread_dispatch_duration", j5);
                        jSONObjectOptJSONObject.put("build_banner_ad_duration", j6);
                        jSONObjectOptJSONObject.put("ad_load_duration_full", j);
                        return jSONObjectOptJSONObject;
                    } catch (Throwable unused) {
                        return null;
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                public JSONObject ud() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("duration", jSONObjectQdl.optLong("duration", 0L));
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(int i2, String str) {
        PAGBannerAdLoadListener pAGBannerAdLoadListener;
        if (!this.mzz.getAndSet(false) || (pAGBannerAdLoadListener = this.mml) == null) {
            return;
        }
        pAGBannerAdLoadListener.onError(i2, str);
    }
}
