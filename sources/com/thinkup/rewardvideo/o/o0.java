package com.thinkup.rewardvideo.o;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.exoplayer2.video.a;
import com.smartdigimkt.v0.k;
import com.thinkup.core.api.TUCommonImpressionListener;
import com.thinkup.core.api.TUNetworkConfirmInfo;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.ooo.o00;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o0 implements TUCommonImpressionListener {
    private final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final om f42651n;
    private final boolean o;
    private volatile boolean o0 = false;
    private volatile boolean oo = false;
    private int om = -1;

    public o0(om omVar, boolean z2, int i2) {
        this.f42651n = omVar;
        this.o = z2;
        this.m = i2;
    }

    private boolean m() {
        return this.om == 0;
    }

    private boolean o() {
        return this.m == 1;
    }

    @Override // com.thinkup.core.api.TUCommonImpressionListener
    public void onAdClick() {
        if (!this.o || this.f42651n == null) {
            return;
        }
        if (!o()) {
            onAdReward();
        }
        this.f42651n.onRewardedVideoAdPlayClicked();
    }

    @Override // com.thinkup.core.api.TUCommonImpressionListener
    public void onAdDismiss() {
        if (this.o) {
            if (!this.o0) {
                this.o0 = true;
                om omVar = this.f42651n;
                if (omVar != null) {
                    omVar.onRewardedVideoAdPlayEnd();
                }
            }
            if (!m() || o()) {
                onAdReward();
            } else if (!this.oo) {
                o("reward_none_for_click");
            }
            om omVar2 = this.f42651n;
            if (omVar2 != null) {
                omVar2.onRewardedVideoAdClosed();
            }
        }
    }

    @Override // com.thinkup.core.api.TUCommonImpressionListener
    public void onAdImpression() {
        om omVar;
        if (!this.o || (omVar = this.f42651n) == null) {
            return;
        }
        omVar.onRewardedVideoAdPlayStart();
    }

    @Override // com.thinkup.core.api.TUCommonImpressionListener
    public void onAdReward() {
        if (this.oo) {
            return;
        }
        this.oo = true;
        om omVar = this.f42651n;
        if (omVar != null) {
            omVar.onReward();
        }
        if (m()) {
            o("reward_in_close");
        }
    }

    @Override // com.thinkup.core.api.TUCommonImpressionListener
    public void onAdRewardFailed() {
        if (this.f42651n == null || this.oo) {
            return;
        }
        this.oo = true;
        this.f42651n.onRewardFailed();
    }

    @Override // com.thinkup.core.api.TUCommonImpressionListener
    public void onAdShowFail(String str, String str2) {
        om omVar;
        if (!this.o || (omVar = this.f42651n) == null) {
            return;
        }
        omVar.onRewardedVideoAdPlayFailed(str, str2);
    }

    @Override // com.thinkup.core.api.TUCommonImpressionListener
    public void onAdVideoPlayEnd() {
        if (!this.o || this.f42651n == null || this.o0) {
            return;
        }
        this.o0 = true;
        this.f42651n.onRewardedVideoAdPlayEnd();
    }

    @Override // com.thinkup.core.api.TUCommonImpressionListener
    public void onAdVideoPlayStart() {
    }

    @Override // com.thinkup.core.api.TUCommonImpressionListener
    public void onDeeplinkCallback(boolean z2) {
        om omVar = this.f42651n;
        if (omVar != null) {
            omVar.onDeeplinkCallback(z2);
        }
    }

    @Override // com.thinkup.core.api.TUCommonImpressionListener
    public void onDownloadConfirm(Context context, TUNetworkConfirmInfo tUNetworkConfirmInfo) {
        om omVar = this.f42651n;
        if (omVar != null) {
            omVar.onDownloadConfirm(context, tUNetworkConfirmInfo);
        }
    }

    public final void o(int i2) {
        this.om = i2;
    }

    private static void o(String str) {
        String string;
        Context contextOn = o0n.m().on();
        if (contextOn == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            string = contextOn.getString(o00.o(contextOn, str, k.f38992h));
        } catch (Throwable unused) {
            string = null;
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        o0n.m().m(new a(16, contextOn, string));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o(Context context, String str) {
        try {
            Toast.makeText(context, str, 1).show();
        } catch (Throwable unused) {
        }
    }
}
