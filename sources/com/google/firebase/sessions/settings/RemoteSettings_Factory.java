package com.google.firebase.sessions.settings;

import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.TimeProvider;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class RemoteSettings_Factory implements Factory<RemoteSettings> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f21163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f21164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f21165c;
    public final Provider d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider f21166e;

    public RemoteSettings_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f21163a = provider;
        this.f21164b = provider2;
        this.f21165c = provider3;
        this.d = provider4;
        this.f21166e = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new RemoteSettings((TimeProvider) this.f21163a.get(), (FirebaseInstallationsApi) this.f21164b.get(), (ApplicationInfo) this.f21165c.get(), (CrashlyticsSettingsFetcher) this.d.get(), (SettingsCache) this.f21166e.get());
    }
}
