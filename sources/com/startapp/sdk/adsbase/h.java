package com.startapp.sdk.adsbase;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.nj;
import com.startapp.sdk.internal.u;
import com.startapp.sdk.internal.v;
import com.startapp.sdk.internal.w;
import com.startapp.sdk.internal.w6;
import com.startapp.sdk.internal.y;
import com.startapp.sdk.internal.zb;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StartAppAd f40664a;

    public h(StartAppAd startAppAd) {
        this.f40664a = startAppAd;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            action = "";
        }
        String stringExtra = intent.getStringExtra("dParam");
        if (action.equals("com.startapp.android.ShowFailedDisplayBroadcastListener")) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = Bundle.EMPTY;
            }
            if (extras.containsKey("showFailedReason")) {
                this.f40664a.setNotDisplayedReason((NotDisplayedReason) extras.getSerializable("showFailedReason"));
            }
            StartAppAd startAppAd = this.f40664a;
            y.a(context, startAppAd.j, startAppAd);
            zb.a(context).a(this);
        } else {
            if (action.equals("com.startapp.android.ShowDisplayBroadcastListener")) {
                StartAppAd startAppAd2 = this.f40664a;
                AdDisplayListener adDisplayListener = startAppAd2.j;
                w6.a("onShow", adDisplayListener != null, stringExtra, null);
                h0.a(adDisplayListener != null ? new v(context, adDisplayListener, startAppAd2) : null);
            } else if (action.equals("com.startapp.android.OnClickCallback")) {
                StartAppAd startAppAd3 = this.f40664a;
                AdDisplayListener adDisplayListener2 = startAppAd3.j;
                w6.a("onClicked", adDisplayListener2 != null, stringExtra, null);
                h0.a(adDisplayListener2 != null ? new w(context, adDisplayListener2, startAppAd3) : null);
            } else if (action.equals("com.startapp.android.OnVideoCompleted")) {
                com.startapp.sdk.adsbase.adlisteners.VideoListener videoListener = this.f40664a.f40588i;
                w6.a("onVideoCompleted", videoListener != null, stringExtra, null);
                h0.a(videoListener != null ? new nj(videoListener, context) : null);
            } else {
                StartAppAd startAppAd4 = this.f40664a;
                AdDisplayListener adDisplayListener3 = startAppAd4.j;
                w6.a("adHidden", adDisplayListener3 != null, stringExtra, null);
                h0.a(adDisplayListener3 != null ? new u(context, adDisplayListener3, startAppAd4) : null);
                zb.a(context).a(this);
            }
        }
        this.f40664a.f40586e = null;
    }
}
