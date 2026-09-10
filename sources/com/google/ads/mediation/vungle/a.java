package com.google.ads.mediation.vungle;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements VungleInitializer.VungleInitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InitializationCompleteCallback f791a;

    public a(InitializationCompleteCallback initializationCompleteCallback) {
        this.f791a = initializationCompleteCallback;
    }

    @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
    public final void onInitializeError(AdError adError) {
        adError.toString();
        this.f791a.onInitializationFailed(adError.toString());
    }

    @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
    public final void onInitializeSuccess() {
        this.f791a.onInitializationSucceeded();
    }
}
