package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.activity.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.aH;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.settings.VVE;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.KPU;
import com.bytedance.sdk.openadsdk.utils.eK;
import com.bytedance.sdk.openadsdk.utils.hg;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PK;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
class OY extends PAGRewardedAd {
    private boolean JXs;
    private final com.bytedance.sdk.openadsdk.core.model.Lxb LD;
    private final Context Lxb;
    private boolean OY;
    private boolean QAg;
    private com.bytedance.sdk.openadsdk.Lxb.JXs.Lxb ZU;
    private final AdSlot lk;
    private final AtomicBoolean lc = new AtomicBoolean(false);
    private final String ebl = eK.Lxb();

    public OY(Context context, com.bytedance.sdk.openadsdk.core.model.Lxb lxb, AdSlot adSlot) {
        this.Lxb = context;
        this.LD = lxb;
        this.lk = adSlot;
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
            com.bytedance.sdk.component.utils.sLN.Lxb("TTRewardVideoAdImpl", th.getMessage());
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

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionCallback(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback) {
        this.ZU = new QAg(pAGRewardedAdInteractionCallback);
        Lxb(0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionListener(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener) {
        this.ZU = new QAg(pAGRewardedAdInteractionListener);
        Lxb(0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void show(@Nullable Activity activity) {
        Intent intent;
        if (activity != null && activity.isFinishing()) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTRewardVideoAdImpl", "showRewardVideoAd error1: activity is finishing");
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
            com.bytedance.sdk.component.utils.sLN.Lxb("TTRewardVideoAdImpl", "showRewardVideoAd error2: not main looper");
            throw new IllegalStateException("Cannot be called in a child thread —— TTRewardVideoAd.showRewardVideoAd");
        }
        List<tD> listZU = this.LD.ZU();
        if (listZU != null) {
            Iterator<tD> it = listZU.iterator();
            while (it.hasNext()) {
                IPMiBroadcastReceiver.Lxb(this.Lxb, it.next());
            }
        }
        if (this.lc.compareAndSet(false, true)) {
            if (tDVarLc == null || tDVarLc.JJ() == null) {
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVarLc, "fullscreen_interstitial_ad", "materialMeta error ");
                return;
            }
            Context contextLxb = activity == null ? this.Lxb : activity;
            if (contextLxb == null) {
                contextLxb = kqm.Lxb();
            }
            if (VVE.TA().bm() && Lxb(this.LD)) {
                intent = new Intent(contextLxb, (Class<?>) TTAdActivity.class);
            } else if (zEbl || Lxb(tDVarLc)) {
                Intent intent2 = new Intent(contextLxb, (Class<?>) TTRewardExpressVideoActivity.class);
                intent = intent2;
            } else {
                intent = new Intent(contextLxb, (Class<?>) TTRewardVideoActivity.class);
            }
            com.bytedance.sdk.openadsdk.component.reward.Lxb.LD.Lxb(intent, activity, this.JXs, this.LD, this.ebl);
            intent.putExtra("media_extra", this.lk.getMediaExtra());
            intent.putExtra("user_id", this.lk.getUserID());
            intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
            if (!com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
                aH.Lxb().Lxb(this.ZU);
                this.ZU = null;
            }
            com.bytedance.sdk.component.utils.LD.Lxb(contextLxb, intent, new com.bytedance.sdk.component.utils.LD.InterfaceC0067LD() { // from class: com.bytedance.sdk.openadsdk.component.reward.OY.1
                @Override // com.bytedance.sdk.component.utils.LD.InterfaceC0067LD
                public void Lxb() {
                }

                @Override // com.bytedance.sdk.component.utils.LD.InterfaceC0067LD
                public void Lxb(Throwable th) {
                    com.bytedance.sdk.component.utils.sLN.Lxb("TTRewardVideoAdImpl", "show reward video error: ", th);
                    com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVarLc, "fullscreen_interstitial_ad", "activity start  fail ");
                }
            }, true);
            if (zEbl) {
                return;
            }
            Lxb.Lxb(this.LD.lc(), this.JXs, true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        if (this.OY) {
            return;
        }
        KPU.Lxb(this.LD.lc(), d);
        this.OY = true;
    }

    public void Lxb() {
        if (this.lc.get()) {
            return;
        }
        this.JXs = true;
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
            hg.lk(new com.bytedance.sdk.component.OY.OY("Reward_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.reward.OY.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.Lxb Lxb = com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.Lxb();
                    if (i != 0 || OY.this.ZU == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.multipro.aidl.LD.ZU zu = new com.bytedance.sdk.openadsdk.multipro.aidl.LD.ZU(OY.this.ZU);
                    IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(Lxb.Lxb(0));
                    if (iListenerManagerAsInterface != null) {
                        try {
                            iListenerManagerAsInterface.registerRewardVideoListener(OY.this.ebl, zu);
                        } catch (RemoteException e) {
                            com.bytedance.sdk.component.utils.sLN.Lxb("TTRewardVideoAdImpl", e.getMessage());
                        }
                    }
                }
            }, 5);
        }
    }

    public static boolean Lxb(com.bytedance.sdk.openadsdk.core.model.Lxb lxb) {
        tD tDVarLc;
        KG kgJJ;
        String str;
        if (lxb == null || (tDVarLc = lxb.lc()) == null || com.bytedance.sdk.openadsdk.core.model.kqm.lk(tDVarLc)) {
            return false;
        }
        String strLxb = com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("rviv_new_arch_not_support_style", (String) null);
        if (TextUtils.isEmpty(strLxb)) {
            return true;
        }
        try {
            JSONArray jSONArray = new JSONArray(strLxb);
            for (int i = 0; i < jSONArray.length(); i++) {
                int i2 = jSONArray.getInt(i);
                if (i2 != 0) {
                    if (tDVarLc.kqm() == i2) {
                        return false;
                    }
                    if (i2 == 8 && (kgJJ = tDVarLc.JJ()) != null && (str = kgJJ.h) != null && Uri.parse(str).getQueryParameterNames().contains("show_landingpage")) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Exception unused) {
            return true;
        }
    }
}
