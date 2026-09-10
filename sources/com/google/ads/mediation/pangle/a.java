package com.google.ads.mediation.pangle;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements PangleInitializer.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InitializationCompleteCallback f773a;

    public a(InitializationCompleteCallback initializationCompleteCallback) {
        this.f773a = initializationCompleteCallback;
    }

    @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
    public final void onInitializeError(AdError adError) {
        adError.toString();
        this.f773a.onInitializationFailed(adError.getMessage());
    }

    @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
    public final void onInitializeSuccess() {
        this.f773a.onInitializationSucceeded();
    }
}
