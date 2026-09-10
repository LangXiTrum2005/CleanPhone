package retrocession;

import java.util.concurrent.Executor;
import javax.inject.Provider;

/* JADX INFO: compiled from: WorkInitializer_Factory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class graveside implements delouse.saneness<molybdenite> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Provider<Executor> f36403attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Provider<adultoid> f36404dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Provider<com.google.android.datatransport.runtime.scheduling.persistence.wireman> f36405saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Provider<cocoon.attabal> f36406wireman;

    public graveside(Provider<Executor> provider, Provider<com.google.android.datatransport.runtime.scheduling.persistence.wireman> provider2, Provider<adultoid> provider3, Provider<cocoon.attabal> provider4) {
        this.f36403attabal = provider;
        this.f36405saneness = provider2;
        this.f36404dern = provider3;
        this.f36406wireman = provider4;
    }

    public static graveside attabal(Provider<Executor> provider, Provider<com.google.android.datatransport.runtime.scheduling.persistence.wireman> provider2, Provider<adultoid> provider3, Provider<cocoon.attabal> provider4) {
        return new graveside(provider, provider2, provider3, provider4);
    }

    public static molybdenite dern(Executor executor, com.google.android.datatransport.runtime.scheduling.persistence.wireman wiremanVar, adultoid adultoidVar, cocoon.attabal attabalVar) {
        return new molybdenite(executor, wiremanVar, adultoidVar, attabalVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public molybdenite get() {
        return dern(this.f36403attabal.get(), this.f36405saneness.get(), this.f36404dern.get(), this.f36406wireman.get());
    }
}
