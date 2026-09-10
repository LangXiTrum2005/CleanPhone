package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdTransActivity;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.vr;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.ory;
import com.bytedance.sdk.openadsdk.utils.su;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class ka extends PAGAppOpenAd {
    private final AdSlot ik;
    private boolean jbs;
    private com.bytedance.sdk.openadsdk.ri.ka.lr ka;
    private final wjv lr;
    private boolean mj;
    private final Context ri;
    private final boolean xha;
    private final AtomicBoolean fi = new AtomicBoolean(false);
    private final String di = su.ri();

    public ka(Context context, wjv wjvVar, boolean z, AdSlot adSlot) {
        this.ri = context;
        this.lr = wjvVar;
        this.xha = z;
        this.ik = adSlot;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        wjv wjvVar = this.lr;
        if (wjvVar == null || wjvVar.iyl() == null) {
            return null;
        }
        try {
            return this.lr.iyl().get(str);
        } catch (Throwable th) {
            ac.ik("TTAppOpenAdImpl", th.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        wjv wjvVar = this.lr;
        if (wjvVar != null) {
            return wjvVar.iyl();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public boolean isReady() {
        return this.lr != null && System.currentTimeMillis() / 1000 <= this.lr.cem();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        if (this.jbs) {
            return;
        }
        ory.ri(this.lr, d, str, str2);
        this.jbs = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionCallback(PAGAppOpenAdInteractionCallback pAGAppOpenAdInteractionCallback) {
        this.ka = new fi(pAGAppOpenAdInteractionCallback);
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionListener(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.ka = new fi(pAGAppOpenAdInteractionListener);
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void show(Activity activity) {
        int rotation;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        if (this.fi.getAndSet(true)) {
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Cannot be called in a child thread ---- TTAppOpenAdImpl.showAppOpenAd");
        }
        IPBroadcastReceiver.lr(this.ri, this.lr);
        Context contextRi = activity != null ? activity : this.ri;
        if (contextRi == null) {
            contextRi = nr.ri();
        }
        try {
            rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        } catch (Exception unused) {
            rotation = 0;
        }
        Intent intent = this.lr.hcw() ? new Intent(contextRi, (Class<?>) TTAppOpenAdTransActivity.class) : new Intent(contextRi, (Class<?>) TTAppOpenAdActivity.class);
        intent.putExtra("orientation_angle", rotation);
        intent.putExtra("ad_source", this.xha ? 1 : 2);
        boolean zJbs = com.bytedance.sdk.openadsdk.wjv.fi.jbs();
        intent.putExtra("enable_new_arch", zJbs);
        dw.ri().fi();
        intent.putExtra("meta_index", dw.ri().ri(this.lr));
        if (zJbs) {
            intent.putExtra("single_process_listener_key", this.di);
            dw.ri().ri(this.di, this.ka);
        } else {
            dw.ri().ri(this.ka);
        }
        this.ka = null;
        intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
        AdSlot adSlot = this.ik;
        if (adSlot != null) {
            long cacheTime = adSlot.getCacheTime();
            if (cacheTime == 0 && this.lr.eb() != null) {
                cacheTime = this.lr.eb().getCacheTime();
            }
            intent.putExtra("cache_time", cacheTime);
        }
        com.bytedance.sdk.component.utils.lr.ri(contextRi, intent, new com.bytedance.sdk.component.utils.lr.InterfaceC0216lr() { // from class: com.bytedance.sdk.openadsdk.component.ka.1
            @Override // com.bytedance.sdk.component.utils.lr.InterfaceC0216lr
            public void ri() {
            }

            @Override // com.bytedance.sdk.component.utils.lr.InterfaceC0216lr
            public void ri(Throwable th) {
            }
        });
        vr.lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.ka.2
            @Override // java.lang.Runnable
            public void run() {
                if (ka.this.ik != null) {
                    try {
                        if (ka.this.lr == null || wjv.di(ka.this.lr) || ka.this.lr.bl()) {
                            return;
                        }
                        di.ri(ka.this.ri).ri(Integer.parseInt(ka.this.ik.getCodeId()), ka.this.lr.jf());
                    } catch (Throwable unused2) {
                    }
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        if (this.mj) {
            return;
        }
        ory.ri(this.lr, d);
        this.mj = true;
    }
}
