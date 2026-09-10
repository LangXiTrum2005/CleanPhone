package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.activity.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
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
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class jpc extends PAGRewardedAd {
    private boolean jpc;
    private final AdSlot lnr;
    private com.bytedance.sdk.openadsdk.qdl.mzz.qdl mml;
    private boolean mzz;
    private final Context qdl;
    private boolean tvp;
    private final com.bytedance.sdk.openadsdk.core.model.qdl ud;
    private final AtomicBoolean mo = new AtomicBoolean(false);
    private final String wd = uw.qdl();

    public jpc(Context context, com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, AdSlot adSlot) {
        this.qdl = context;
        this.ud = qdlVar;
        this.lnr = adSlot;
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
            aaj.lnr("TTRewardVideoAdImpl", th.getMessage());
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

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionCallback(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback) {
        this.mml = new tvp(pAGRewardedAdInteractionCallback);
        qdl(0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionListener(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener) {
        this.mml = new tvp(pAGRewardedAdInteractionListener);
        qdl(0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
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
                throw new IllegalStateException("Cannot be called in a child thread —— TTRewardVideoAd.showRewardVideoAd");
            }
            List<ljh> listMml = this.ud.mml();
            if (listMml != null) {
                Iterator<ljh> it = listMml.iterator();
                while (it.hasNext()) {
                    IPMiBroadcastReceiver.qdl(this.qdl, it.next());
                }
            }
            if (this.mo.compareAndSet(false, true)) {
                if (ljhVarMo == null || ljhVarMo.tdy() == null) {
                    com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVarMo, "fullscreen_interstitial_ad", "materialMeta error ");
                    return;
                }
                Context contextQdl = activity == null ? this.qdl : activity;
                if (contextQdl == null) {
                    contextQdl = yt.qdl();
                }
                if (qdl(this.ud)) {
                    intent = new Intent(contextQdl, (Class<?>) TTAdActivity.class);
                } else {
                    intent = qdl(ljhVarMo) ? new Intent(contextQdl, (Class<?>) TTRewardExpressVideoActivity.class) : new Intent(contextQdl, (Class<?>) TTRewardVideoActivity.class);
                }
                Intent intent2 = intent;
                boolean zTvp = com.bytedance.sdk.openadsdk.jyq.qdl.tvp();
                com.bytedance.sdk.openadsdk.component.reward.qdl.ud.qdl(intent2, activity, this.mzz, this.ud, this.wd);
                intent2.putExtra("media_extra", this.lnr.getMediaExtra());
                intent2.putExtra("user_id", this.lnr.getUserID());
                intent2.putExtra("start_show_time", SystemClock.elapsedRealtime());
                intent2.putExtra("enable_new_arch", zTvp);
                if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                    Objects.toString(this.mml);
                    if (zTvp) {
                        koa.qdl().qdl(this.wd, this.mml);
                    } else {
                        koa.qdl().qdl(this.mml);
                    }
                    this.mml = null;
                }
                final boolean z2 = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("start_activity_async", 0) == 1;
                if (z2) {
                    com.bytedance.sdk.openadsdk.yt.lnr.qdl(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpc.1
                        @Override // com.bytedance.sdk.openadsdk.yt.mml
                        public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                            com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVar2 = new com.bytedance.sdk.openadsdk.yt.ud.qdl();
                            qdlVar2.ud("start_activity");
                            qdlVar2.mml("rewarded_video");
                            return qdlVar2;
                        }
                    });
                }
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                com.bytedance.sdk.component.utils.ud.qdl(contextQdl, intent2, new com.bytedance.sdk.component.utils.ud.InterfaceC0095ud() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpc.2
                    @Override // com.bytedance.sdk.component.utils.ud.InterfaceC0095ud
                    public void qdl() {
                        if (z2) {
                            com.bytedance.sdk.openadsdk.yt.lnr.ud(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpc.2.1
                                @Override // com.bytedance.sdk.openadsdk.yt.mml
                                public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                                    com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVar2 = new com.bytedance.sdk.openadsdk.yt.ud.qdl();
                                    qdlVar2.ud("start_activity");
                                    qdlVar2.mml("rewarded_video");
                                    return qdlVar2;
                                }
                            });
                            final long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            com.bytedance.sdk.openadsdk.bjy.lnr.qdl("start_activity_action", false, new com.bytedance.sdk.openadsdk.bjy.ud() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpc.2.2
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
                        com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVarMo, "fullscreen_interstitial_ad", "activity start  fail ");
                        if (z2) {
                            com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpc.2.3
                                @Override // com.bytedance.sdk.openadsdk.yt.mml
                                public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                                    com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVar2 = new com.bytedance.sdk.openadsdk.yt.ud.qdl();
                                    qdlVar2.ud("start_activity");
                                    qdlVar2.mml("rewarded_video");
                                    return qdlVar2;
                                }
                            });
                        }
                    }
                }, true);
                qdl.qdl(this.ud.mo(), this.mzz, true);
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

    public void qdl() {
        if (this.mo.get()) {
            return;
        }
        this.mzz = true;
    }

    private static boolean qdl(ljh ljhVar) {
        if (ljhVar == null) {
            return false;
        }
        return ljhVar.mo();
    }

    private void qdl(final int i2) {
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            fco.lnr(new com.bytedance.sdk.component.jpc.jpc("Reward_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.reward.jpc.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.qdl qdlVarQdl = com.bytedance.sdk.openadsdk.multipro.aidl.qdl.qdl();
                    if (i2 != 0 || jpc.this.mml == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.multipro.aidl.ud.mml mmlVar = new com.bytedance.sdk.openadsdk.multipro.aidl.ud.mml(jpc.this.mml);
                    IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(qdlVarQdl.qdl(0));
                    if (iListenerManagerAsInterface != null) {
                        try {
                            iListenerManagerAsInterface.registerRewardVideoListener(jpc.this.wd, mmlVar);
                        } catch (RemoteException e2) {
                            aaj.lnr("TTRewardVideoAdImpl", e2.getMessage());
                        }
                    }
                }
            }, 5);
        }
    }

    public static boolean qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
        ljh ljhVarMo;
        if (qdlVar == null || (ljhVarMo = qdlVar.mo()) == null || com.bytedance.sdk.openadsdk.core.model.aaj.lnr(ljhVarMo)) {
            return false;
        }
        if (ljhVarMo.ax()) {
            return true;
        }
        try {
            String strQdl = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("rviv_new_arch", (String) null);
            if (TextUtils.isEmpty(strQdl)) {
                return false;
            }
            JSONArray jSONArray = new JSONArray(strQdl);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                int i3 = jSONArray.getInt(i2);
                if (ljh.taz(ljhVarMo.taz())) {
                    if (ljhVarMo.ax() && ljhVarMo.taz() == i3) {
                        return true;
                    }
                } else if (ljhVarMo.taz() == i3) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
