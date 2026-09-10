package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.activity.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialExpressActivity;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.aH;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.settings.VVE;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.KPU;
import com.bytedance.sdk.openadsdk.utils.eK;
import com.bytedance.sdk.openadsdk.utils.hg;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PK;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
class lc extends PAGInterstitialAd {
    private final com.bytedance.sdk.openadsdk.core.model.Lxb LD;
    private final Context Lxb;
    private boolean OY;
    private boolean QAg;
    private com.bytedance.sdk.openadsdk.Lxb.lk.LD lk;
    private final AtomicBoolean JXs = new AtomicBoolean(false);
    private boolean lc = false;
    private boolean ZU = false;
    private final String ebl = eK.Lxb();

    public lc(Context context, com.bytedance.sdk.openadsdk.core.model.Lxb lxb) {
        this.Lxb = context;
        this.LD = lxb;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        com.bytedance.sdk.openadsdk.core.model.Lxb lxb = this.LD;
        if (lxb == null || lxb.lc() == null || this.LD.lc().Hu() == null) {
            return null;
        }
        try {
            return this.LD.lc().Hu().get(str);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTFullScreenVideoAdImpl", th.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        com.bytedance.sdk.openadsdk.core.model.Lxb lxb = this.LD;
        if (lxb == null || lxb.lc() == null) {
            return null;
        }
        return this.LD.lc().Hu();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        if (this.QAg) {
            return;
        }
        KPU.Lxb(this.LD.lc(), d, str, str2);
        this.QAg = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionCallback(PAGInterstitialAdInteractionCallback pAGInterstitialAdInteractionCallback) {
        this.lk = new com.bytedance.sdk.openadsdk.component.lk.Lxb(pAGInterstitialAdInteractionCallback);
        Lxb(1);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionListener(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.lk = new com.bytedance.sdk.openadsdk.component.lk.Lxb(pAGInterstitialAdInteractionListener);
        Lxb(1);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void show(Activity activity) {
        Intent intent;
        Intent intent2;
        if (activity != null && activity.isFinishing()) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTFullScreenVideoAdImpl", "showFullScreenVideoAd error1: activity is finishing");
            activity = null;
        }
        com.bytedance.sdk.openadsdk.core.model.Lxb lxb = this.LD;
        if (lxb == null || !lxb.JXs()) {
            return;
        }
        boolean zEbl = this.LD.ebl();
        final tD tDVarLc = this.LD.lc();
        if (!PK.a()) {
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVarLc, "fullscreen_interstitial_ad", "showFullScreenVideoAd error2: not main looper");
            com.bytedance.sdk.component.utils.sLN.Lxb("TTFullScreenVideoAdImpl", "showFullScreenVideoAd error2: not main looper");
            throw new IllegalStateException("Cannot be called in a child thread —— TTFullScreenVideoAd.showFullScreenVideoAd");
        }
        List<tD> listZU = this.LD.ZU();
        if (listZU != null) {
            Iterator<tD> it = listZU.iterator();
            while (it.hasNext()) {
                IPMiBroadcastReceiver.Lxb(this.Lxb, it.next());
            }
        }
        if (this.JXs.get()) {
            return;
        }
        this.JXs.set(true);
        if (tDVarLc == null || (tDVarLc.JJ() == null && tDVarLc.uxf() == null)) {
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVarLc, "fullscreen_interstitial_ad", "materialMeta error ");
            return;
        }
        Context contextLxb = activity == null ? this.Lxb : activity;
        if (contextLxb == null) {
            contextLxb = kqm.Lxb();
        }
        if (VVE.TA().bm() && OY.Lxb(this.LD)) {
            intent = new Intent(contextLxb, (Class<?>) TTAdActivity.class);
        } else {
            if (zEbl) {
                intent2 = new Intent(contextLxb, (Class<?>) TTFullScreenExpressVideoActivity.class);
            } else if (!Lxb(tDVarLc)) {
                intent = com.bytedance.sdk.openadsdk.component.reward.LD.QAg.Lxb(tDVarLc) ? new Intent(contextLxb, (Class<?>) TTInterstitialActivity.class) : new Intent(contextLxb, (Class<?>) TTFullScreenVideoActivity.class);
            } else if (com.bytedance.sdk.openadsdk.component.reward.LD.QAg.Lxb(tDVarLc)) {
                intent = new Intent(contextLxb, (Class<?>) TTInterstitialExpressActivity.class);
            } else {
                intent2 = new Intent(contextLxb, (Class<?>) TTFullScreenExpressVideoActivity.class);
            }
            intent = intent2;
        }
        intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
        com.bytedance.sdk.openadsdk.component.reward.Lxb.LD.Lxb(intent, activity, this.ZU, this.LD, this.ebl);
        intent.putExtra("is_verity_playable", this.lc);
        if (!com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            aH.Lxb().Lxb(this.lk);
            this.lk = null;
        }
        com.bytedance.sdk.component.utils.LD.Lxb(contextLxb, intent, new com.bytedance.sdk.component.utils.LD.InterfaceC0067LD() { // from class: com.bytedance.sdk.openadsdk.component.reward.lc.1
            @Override // com.bytedance.sdk.component.utils.LD.InterfaceC0067LD
            public void Lxb() {
                if (lc.this.lc) {
                    try {
                        com.bytedance.sdk.openadsdk.STP.lk.Lxb().Lxb(tDVarLc.JJ().h);
                    } catch (Throwable unused) {
                    }
                }
            }

            @Override // com.bytedance.sdk.component.utils.LD.InterfaceC0067LD
            public void Lxb(Throwable th) {
                com.bytedance.sdk.component.utils.sLN.Lxb("TTFullScreenVideoAdImpl", "show full screen video error: ", th);
                if (lc.this.lc) {
                    try {
                        com.bytedance.sdk.openadsdk.STP.lk.Lxb().Lxb(tDVarLc.JJ().h, -1, th != null ? th.getMessage() : "playable tool error open");
                    } catch (Throwable unused) {
                    }
                }
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVarLc, "fullscreen_interstitial_ad", "activity start  fail ");
            }
        }, true);
        if (zEbl) {
            return;
        }
        Lxb.Lxb(this.LD.lc(), this.ZU, false);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        if (this.OY) {
            return;
        }
        KPU.Lxb(this.LD.lc(), d);
        this.OY = true;
    }

    public void Lxb(boolean z) {
        this.lc = z;
    }

    public void Lxb() {
        if (this.JXs.get()) {
            return;
        }
        this.ZU = true;
    }

    private static boolean Lxb(tD tDVar) {
        if (tDVar == null) {
            return false;
        }
        int iKqm = tDVar.kqm();
        return (tDVar.eK() != 2 || iKqm == 5 || iKqm == 33 || iKqm == 6 || iKqm == 19 || iKqm == 12) ? false : true;
    }

    private void Lxb(final int i) {
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            hg.lk(new com.bytedance.sdk.component.OY.OY("FullScreen_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.reward.lc.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.Lxb Lxb = com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.Lxb();
                    if (i != 1 || lc.this.lk == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.multipro.aidl.LD.lk lkVar = new com.bytedance.sdk.openadsdk.multipro.aidl.LD.lk(lc.this.lk);
                    IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(Lxb.Lxb(1));
                    if (iListenerManagerAsInterface != null) {
                        try {
                            iListenerManagerAsInterface.registerFullVideoListener(lc.this.ebl, lkVar);
                        } catch (RemoteException e) {
                            com.bytedance.sdk.component.utils.sLN.Lxb("TTFullScreenVideoAdImpl", e.getMessage());
                        }
                    }
                }
            }, 5);
        }
    }
}
