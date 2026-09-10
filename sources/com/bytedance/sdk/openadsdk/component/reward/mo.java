package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.os.SystemClock;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.activity.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialExpressActivity;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.koa;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.rc;
import com.bytedance.sdk.openadsdk.utils.uw;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class mo extends PAGInterstitialAd {
    private boolean jpc;
    private com.bytedance.sdk.openadsdk.qdl.lnr.ud lnr;
    private final Context qdl;
    private boolean tvp;
    private final com.bytedance.sdk.openadsdk.core.model.qdl ud;
    private final AtomicBoolean mzz = new AtomicBoolean(false);
    private boolean mo = false;
    private boolean mml = false;
    private final String wd = uw.qdl();

    public mo(Context context, com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
        this.qdl = context;
        this.ud = qdlVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        com.bytedance.sdk.openadsdk.core.model.qdl qdlVar = this.ud;
        if (qdlVar == null || qdlVar.mo() == null || this.ud.mo().dsy() == null) {
            return null;
        }
        try {
            return this.ud.mo().dsy().get(str);
        } catch (Throwable th) {
            aaj.lnr("TTFullScreenVideoAdImpl", th.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        com.bytedance.sdk.openadsdk.core.model.qdl qdlVar = this.ud;
        if (qdlVar == null || qdlVar.mo() == null) {
            return null;
        }
        return this.ud.mo().dsy();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        if (this.tvp) {
            return;
        }
        rc.qdl(this.ud.mo(), d, str, str2);
        this.tvp = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionCallback(PAGInterstitialAdInteractionCallback pAGInterstitialAdInteractionCallback) {
        this.lnr = new com.bytedance.sdk.openadsdk.component.lnr.qdl(pAGInterstitialAdInteractionCallback);
        qdl(1);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionListener(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.lnr = new com.bytedance.sdk.openadsdk.component.lnr.qdl(pAGInterstitialAdInteractionListener);
        qdl(1);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void show(Activity activity) {
        Intent intent;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        com.bytedance.sdk.openadsdk.core.model.qdl qdlVar = this.ud;
        if (qdlVar != null && qdlVar.mzz()) {
            final ljh ljhVarMo = this.ud.mo();
            if (!com.bykv.vk.openvk.qdl.qdl.ud.ud.qdl.qdl()) {
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVarMo, "fullscreen_interstitial_ad", "showFullScreenVideoAd error2: not main looper");
                throw new IllegalStateException("Cannot be called in a child thread —— TTFullScreenVideoAd.showFullScreenVideoAd");
            }
            List<ljh> listMml = this.ud.mml();
            if (listMml != null) {
                Iterator<ljh> it = listMml.iterator();
                while (it.hasNext()) {
                    IPMiBroadcastReceiver.qdl(this.qdl, it.next());
                }
            }
            if (!this.mzz.get()) {
                this.mzz.set(true);
                if (ljhVarMo == null || (ljhVarMo.tdy() == null && ljhVarMo.vm() == null)) {
                    com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVarMo, "fullscreen_interstitial_ad", "materialMeta error ");
                    return;
                }
                Context contextQdl = activity == null ? this.qdl : activity;
                if (contextQdl == null) {
                    contextQdl = yt.qdl();
                }
                if (jpc.qdl(this.ud)) {
                    intent = new Intent(contextQdl, (Class<?>) TTAdActivity.class);
                } else if (qdl(ljhVarMo)) {
                    intent = com.bytedance.sdk.openadsdk.component.reward.ud.jpc.qdl(ljhVarMo) ? new Intent(contextQdl, (Class<?>) TTInterstitialExpressActivity.class) : new Intent(contextQdl, (Class<?>) TTFullScreenExpressVideoActivity.class);
                } else {
                    intent = com.bytedance.sdk.openadsdk.component.reward.ud.jpc.qdl(ljhVarMo) ? new Intent(contextQdl, (Class<?>) TTInterstitialActivity.class) : new Intent(contextQdl, (Class<?>) TTFullScreenVideoActivity.class);
                }
                Intent intent2 = intent;
                intent2.putExtra("start_show_time", SystemClock.elapsedRealtime());
                boolean zTvp = com.bytedance.sdk.openadsdk.jyq.qdl.tvp();
                com.bytedance.sdk.openadsdk.component.reward.qdl.ud.qdl(intent2, activity, this.mml, this.ud, this.wd);
                intent2.putExtra("is_verity_playable", this.mo);
                intent2.putExtra("enable_new_arch", zTvp);
                if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                    if (zTvp) {
                        koa.qdl().qdl(this.wd, this.lnr);
                    } else {
                        koa.qdl().qdl(this.lnr);
                    }
                    this.lnr = null;
                }
                final boolean z2 = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("start_activity_async", 0) == 1;
                if (z2) {
                    com.bytedance.sdk.openadsdk.yt.lnr.qdl(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.component.reward.mo.1
                        @Override // com.bytedance.sdk.openadsdk.yt.mml
                        public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                            com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVar2 = new com.bytedance.sdk.openadsdk.yt.ud.qdl();
                            qdlVar2.ud("start_activity");
                            qdlVar2.mml("fullscreen_interstitial_ad");
                            return qdlVar2;
                        }
                    });
                }
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                com.bytedance.sdk.component.utils.ud.qdl(contextQdl, intent2, new com.bytedance.sdk.component.utils.ud.InterfaceC0095ud() { // from class: com.bytedance.sdk.openadsdk.component.reward.mo.2
                    @Override // com.bytedance.sdk.component.utils.ud.InterfaceC0095ud
                    public void qdl() {
                        if (mo.this.mo) {
                            try {
                                com.bytedance.sdk.openadsdk.bjy.lnr.qdl().qdl(ljhVarMo.tdy().fs());
                            } catch (Throwable unused) {
                            }
                        }
                        if (z2) {
                            com.bytedance.sdk.openadsdk.yt.lnr.ud(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.component.reward.mo.2.1
                                @Override // com.bytedance.sdk.openadsdk.yt.mml
                                public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                                    com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVar2 = new com.bytedance.sdk.openadsdk.yt.ud.qdl();
                                    qdlVar2.ud("start_activity");
                                    qdlVar2.mml("fullscreen_interstitial_ad");
                                    return qdlVar2;
                                }
                            });
                            final long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            com.bytedance.sdk.openadsdk.bjy.lnr.qdl("start_activity_action", false, new com.bytedance.sdk.openadsdk.bjy.ud() { // from class: com.bytedance.sdk.openadsdk.component.reward.mo.2.2
                                @Override // com.bytedance.sdk.openadsdk.bjy.ud
                                public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("duration", jElapsedRealtime2);
                                    return com.bytedance.sdk.openadsdk.bjy.qdl.mml.ud().qdl("start_activity_action").ud(jSONObject.toString());
                                }
                            });
                        }
                    }

                    @Override // com.bytedance.sdk.component.utils.ud.InterfaceC0095ud
                    public void qdl(Throwable th) {
                        if (mo.this.mo) {
                            try {
                                com.bytedance.sdk.openadsdk.bjy.lnr.qdl().qdl(ljhVarMo.tdy().fs(), -1, th != null ? th.getMessage() : "playable tool error open");
                            } catch (Throwable unused) {
                            }
                        }
                        com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVarMo, "fullscreen_interstitial_ad", "activity start  fail ");
                        if (z2) {
                            com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.component.reward.mo.2.3
                                @Override // com.bytedance.sdk.openadsdk.yt.mml
                                public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                                    com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVar2 = new com.bytedance.sdk.openadsdk.yt.ud.qdl();
                                    qdlVar2.ud("start_activity");
                                    qdlVar2.mml("fullscreen_interstitial_ad");
                                    return qdlVar2;
                                }
                            });
                        }
                    }
                }, true);
                qdl.qdl(this.ud.mo(), this.mml, false);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        if (this.jpc) {
            return;
        }
        rc.qdl(this.ud.mo(), d);
        this.jpc = true;
    }

    public void qdl(boolean z2) {
        this.mo = z2;
    }

    public void qdl() {
        if (this.mzz.get()) {
            return;
        }
        this.mml = true;
    }

    private static boolean qdl(ljh ljhVar) {
        if (ljhVar == null) {
            return false;
        }
        return ljhVar.mo();
    }

    private void qdl(final int i2) {
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            fco.lnr(new com.bytedance.sdk.component.jpc.jpc("FullScreen_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.reward.mo.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.qdl qdlVarQdl = com.bytedance.sdk.openadsdk.multipro.aidl.qdl.qdl();
                    if (i2 != 1 || mo.this.lnr == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.multipro.aidl.ud.lnr lnrVar = new com.bytedance.sdk.openadsdk.multipro.aidl.ud.lnr(mo.this.lnr);
                    IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(qdlVarQdl.qdl(1));
                    if (iListenerManagerAsInterface != null) {
                        try {
                            iListenerManagerAsInterface.registerFullVideoListener(mo.this.wd, lnrVar);
                        } catch (RemoteException e2) {
                            aaj.lnr("TTFullScreenVideoAdImpl", e2.getMessage());
                        }
                    }
                }
            }, 5);
        }
    }
}
