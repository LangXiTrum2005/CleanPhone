package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.crashreport.ANRRemoteConfig;

/* JADX INFO: loaded from: classes6.dex */
public final class x3 implements InterfaceC3394e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ANRRemoteConfig f41665a;

    public x3(ANRRemoteConfig aNRRemoteConfig) {
        this.f41665a = aNRRemoteConfig;
    }

    @Override // com.startapp.sdk.internal.InterfaceC3394e
    public final long a(long j) {
        return this.f41665a.b() - j;
    }
}
