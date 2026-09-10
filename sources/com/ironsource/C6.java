package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface C6 {
    void a(Activity activity);

    void a(C0547r6 c0547r6);

    void a(C0547r6 c0547r6, IronSourceError ironSourceError);

    void a(C0547r6 c0547r6, LevelPlayAdInfo levelPlayAdInfo);

    void b(C0547r6 c0547r6, IronSourceError ironSourceError);

    void b(C0547r6 c0547r6, LevelPlayAdInfo levelPlayAdInfo);

    void c(C0547r6 c0547r6, LevelPlayAdInfo levelPlayAdInfo);

    void loadAd();
}
