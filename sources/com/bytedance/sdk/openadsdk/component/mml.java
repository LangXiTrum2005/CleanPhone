package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import com.bytedance.sdk.component.jpc.jpc;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.koa;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.rdp;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.rc;
import com.bytedance.sdk.openadsdk.utils.uw;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class mml extends PAGAppOpenAd {
    private boolean jpc;
    private final AdSlot lnr;
    private com.bytedance.sdk.openadsdk.qdl.mml.ud mml;
    private final Context qdl;
    private boolean tvp;
    private final ljh ud;
    private final boolean wd;
    private final AtomicBoolean mzz = new AtomicBoolean(false);
    private final String mo = uw.qdl();

    public mml(Context context, ljh ljhVar, boolean z2, AdSlot adSlot) {
        this.qdl = context;
        this.ud = ljhVar;
        this.wd = z2;
        this.lnr = adSlot;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        ljh ljhVar = this.ud;
        if (ljhVar == null || ljhVar.dsy() == null) {
            return null;
        }
        try {
            return this.ud.dsy().get(str);
        } catch (Throwable th) {
            aaj.lnr("TTAppOpenAdImpl", th.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        ljh ljhVar = this.ud;
        if (ljhVar != null) {
            return ljhVar.dsy();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        if (this.tvp) {
            return;
        }
        rc.qdl(this.ud, d, str, str2);
        this.tvp = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionCallback(PAGAppOpenAdInteractionCallback pAGAppOpenAdInteractionCallback) {
        this.mml = new mzz(pAGAppOpenAdInteractionCallback);
        qdl();
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionListener(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.mml = new mzz(pAGAppOpenAdInteractionListener);
        qdl();
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void show(Activity activity) {
        int rotation;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        if (this.mzz.getAndSet(true)) {
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Cannot be called in a child thread ---- TTAppOpenAdImpl.showAppOpenAd");
        }
        IPMiBroadcastReceiver.qdl(this.qdl, this.ud);
        Context contextQdl = activity != null ? activity : this.qdl;
        if (contextQdl == null) {
            contextQdl = yt.qdl();
        }
        try {
            rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        } catch (Exception unused) {
            rotation = 0;
        }
        Intent intent = new Intent(contextQdl, (Class<?>) TTAppOpenAdActivity.class);
        intent.putExtra("orientation_angle", rotation);
        intent.putExtra("ad_source", this.wd ? 1 : 2);
        boolean zTvp = com.bytedance.sdk.openadsdk.jyq.qdl.tvp();
        intent.putExtra("enable_new_arch", zTvp);
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, this.ud.rdz().toString());
            intent.putExtra(TTAdConstant.MULTI_PROCESS_META_MD5, this.mo);
        } else {
            koa.qdl().mzz();
            intent.putExtra("meta_index", koa.qdl().qdl(this.ud));
            if (zTvp) {
                intent.putExtra("single_process_listener_key", this.mo);
                koa.qdl().qdl(this.mo, this.mml);
            } else {
                koa.qdl().qdl(this.mml);
            }
            this.mml = null;
        }
        intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
        com.bytedance.sdk.component.utils.ud.qdl(contextQdl, intent, new com.bytedance.sdk.component.utils.ud.InterfaceC0095ud() { // from class: com.bytedance.sdk.openadsdk.component.mml.2
            @Override // com.bytedance.sdk.component.utils.ud.InterfaceC0095ud
            public void qdl() {
            }

            @Override // com.bytedance.sdk.component.utils.ud.InterfaceC0095ud
            public void qdl(Throwable th) {
            }
        });
        rdp.ud().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.mml.3
            @Override // java.lang.Runnable
            public void run() {
                if (mml.this.lnr != null) {
                    try {
                        if (mml.this.ud == null || ljh.wd(mml.this.ud) || mml.this.ud.ilu()) {
                            return;
                        }
                        mo moVarQdl = mo.qdl(mml.this.qdl);
                        moVarQdl.mo(Integer.parseInt(mml.this.lnr.getCodeId()));
                        moVarQdl.qdl(mml.this.lnr);
                    } catch (Throwable unused2) {
                    }
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        if (this.jpc) {
            return;
        }
        rc.qdl(this.ud, d);
        this.jpc = true;
    }

    private void qdl() {
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            fco.lnr(new jpc("AppOpenAd_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.mml.1
                @Override // java.lang.Runnable
                public void run() {
                    IListenerManager iListenerManagerAsInterface;
                    com.bytedance.sdk.openadsdk.multipro.aidl.qdl qdlVarQdl = com.bytedance.sdk.openadsdk.multipro.aidl.qdl.qdl();
                    if (mml.this.mml == null || (iListenerManagerAsInterface = IListenerManager.Stub.asInterface(qdlVarQdl.qdl(7))) == null) {
                        return;
                    }
                    try {
                        iListenerManagerAsInterface.registerAppOpenAdListener(mml.this.mo, new com.bytedance.sdk.openadsdk.multipro.aidl.ud.qdl(mml.this.mml));
                        mml.this.mml = null;
                    } catch (RemoteException e2) {
                        aaj.lnr("TTAppOpenAdImpl", e2.getMessage());
                    }
                }
            }, 5);
        }
    }
}
