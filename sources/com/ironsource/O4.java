package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface O4 {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {
        ISDemandOnlyBannerLayout a(Activity activity, ISBannerSize iSBannerSize);

        void a(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str);

        void e(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface b {
        void a(Activity activity, String str);

        void a(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener);

        void b(Activity activity, String str, String str2);

        void c(String str);

        boolean d(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface c {
        void a(Activity activity, String str, String str2);

        void a(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener);

        void a(String str);

        void b(Activity activity, String str);

        boolean h(String str);
    }

    String a(Context context);
}
