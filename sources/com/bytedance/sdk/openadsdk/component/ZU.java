package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.OY.OY;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.STP;
import com.bytedance.sdk.openadsdk.core.aH;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.settings.VVE;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.KPU;
import com.bytedance.sdk.openadsdk.utils.eK;
import com.bytedance.sdk.openadsdk.utils.hg;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class ZU extends PAGAppOpenAd {
    private final tD LD;
    private final Context Lxb;
    private boolean OY;
    private boolean QAg;
    private com.bytedance.sdk.openadsdk.Lxb.ZU.LD ZU;
    private final boolean ebl;
    private final AdSlot lk;
    private final AtomicBoolean JXs = new AtomicBoolean(false);
    private final String lc = eK.Lxb();

    public ZU(Context context, @NonNull tD tDVar, boolean z, AdSlot adSlot) {
        this.Lxb = context;
        this.LD = tDVar;
        this.ebl = z;
        this.lk = adSlot;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        tD tDVar = this.LD;
        if (tDVar == null || tDVar.Hu() == null) {
            return null;
        }
        try {
            return this.LD.Hu().get(str);
        } catch (Throwable th) {
            sLN.Lxb("TTAppOpenAdImpl", th.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        tD tDVar = this.LD;
        if (tDVar != null) {
            return tDVar.Hu();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        if (this.QAg) {
            return;
        }
        KPU.Lxb(this.LD, d, str, str2);
        this.QAg = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionCallback(PAGAppOpenAdInteractionCallback pAGAppOpenAdInteractionCallback) {
        this.ZU = new JXs(pAGAppOpenAdInteractionCallback);
        Lxb();
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionListener(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.ZU = new JXs(pAGAppOpenAdInteractionListener);
        Lxb();
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void show(Activity activity) {
        int rotation;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        if (this.JXs.getAndSet(true)) {
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            sLN.Lxb("TTAppOpenAdImpl", "showTTAppOpenAd error: not main looper");
            throw new IllegalStateException("Cannot be called in a child thread ---- TTAppOpenAdImpl.showAppOpenAd");
        }
        IPMiBroadcastReceiver.Lxb(this.Lxb, this.LD);
        Context contextLxb = activity != null ? activity : this.Lxb;
        if (contextLxb == null) {
            contextLxb = kqm.Lxb();
        }
        try {
            rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        } catch (Exception unused) {
            rotation = 0;
        }
        Intent intent = new Intent(contextLxb, (Class<?>) TTAppOpenAdActivity.class);
        intent.putExtra("orientation_angle", rotation);
        intent.putExtra("ad_source", this.ebl ? 1 : 2);
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, this.LD.JD().toString());
            intent.putExtra(TTAdConstant.MULTI_PROCESS_META_MD5, this.lc);
        } else {
            aH.Lxb().lc();
            aH.Lxb().Lxb(this.LD);
            aH.Lxb().Lxb(this.ZU);
            this.ZU = null;
        }
        intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
        com.bytedance.sdk.component.utils.LD.Lxb(contextLxb, intent, new com.bytedance.sdk.component.utils.LD.InterfaceC0067LD() { // from class: com.bytedance.sdk.openadsdk.component.ZU.2
            @Override // com.bytedance.sdk.component.utils.LD.InterfaceC0067LD
            public void Lxb() {
            }

            @Override // com.bytedance.sdk.component.utils.LD.InterfaceC0067LD
            public void Lxb(Throwable th) {
            }
        });
        STP.LD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.ZU.3
            @Override // java.lang.Runnable
            public void run() {
                if (ZU.this.lk != null) {
                    try {
                        if (VVE.TA().CSn(ZU.this.lk.getCodeId()) != 1 || tD.lc(ZU.this.LD)) {
                            return;
                        }
                        lc lcVarLxb = lc.Lxb(ZU.this.Lxb);
                        lcVarLxb.ebl(Integer.parseInt(ZU.this.lk.getCodeId()));
                        lcVarLxb.Lxb(ZU.this.lk);
                    } catch (Throwable unused2) {
                    }
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        if (this.OY) {
            return;
        }
        KPU.Lxb(this.LD, d);
        this.OY = true;
    }

    private void Lxb() {
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            hg.lk(new OY("AppOpenAd_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.ZU.1
                @Override // java.lang.Runnable
                public void run() {
                    IListenerManager iListenerManagerAsInterface;
                    com.bytedance.sdk.openadsdk.multipro.aidl.Lxb Lxb = com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.Lxb();
                    if (ZU.this.ZU == null || (iListenerManagerAsInterface = IListenerManager.Stub.asInterface(Lxb.Lxb(7))) == null) {
                        return;
                    }
                    try {
                        iListenerManagerAsInterface.registerAppOpenAdListener(ZU.this.lc, new com.bytedance.sdk.openadsdk.multipro.aidl.LD.Lxb(ZU.this.ZU));
                        ZU.this.ZU = null;
                    } catch (RemoteException e) {
                        sLN.Lxb("TTAppOpenAdImpl", e.getMessage());
                    }
                }
            }, 5);
        }
    }
}
