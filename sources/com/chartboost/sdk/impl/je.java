package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.security.ProviderInstaller;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class je implements ProviderInstaller.ProviderInstallListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lh f14260b;

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        public final void a() {
            try {
                ProviderInstaller.installIfNeededAsync(je.this.f14259a, je.this);
            } catch (Exception e2) {
                za.b("ProviderInstaller", e2);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public je(Context context, lh uiPoster) {
        Intrinsics.f(context, "context");
        Intrinsics.f(uiPoster, "uiPoster");
        this.f14259a = context;
        this.f14260b = uiPoster;
    }

    public final boolean b() {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.f14259a) == 0;
        } catch (Exception e2) {
            za.b("GoogleApiAvailability error", e2);
            return false;
        }
    }

    @Override // com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
    public void onProviderInstallFailed(int i2, Intent intent) {
        za.e(androidx.datastore.preferences.protobuf.a.k("ProviderInstaller onProviderInstallFailed: ", i2, " ProviderInstaller is unable to install an updated Provider, your device's security provider might be vulnerable to known exploits. Your app should behave as if all HTTP communication is unencrypted."), null, 2, null);
    }

    @Override // com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
    public void onProviderInstalled() {
        za.b("ProviderInstaller onProviderInstalled", (Throwable) null, 2, (Object) null);
    }

    public final void a() {
        if (b()) {
            this.f14260b.a(new a());
        }
    }
}
