package kamptulicon;

import java.util.concurrent.Executor;
import javax.inject.Provider;
import retrocession.adultoid;

/* JADX INFO: compiled from: DefaultScheduler_Factory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class wireman implements delouse.saneness<dern> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Provider<Executor> f29101attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Provider<adultoid> f29102dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Provider<cocoon.attabal> f29103marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Provider<vaporizer.wireman> f29104saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Provider<com.google.android.datatransport.runtime.scheduling.persistence.wireman> f29105wireman;

    public wireman(Provider<Executor> provider, Provider<vaporizer.wireman> provider2, Provider<adultoid> provider3, Provider<com.google.android.datatransport.runtime.scheduling.persistence.wireman> provider4, Provider<cocoon.attabal> provider5) {
        this.f29101attabal = provider;
        this.f29104saneness = provider2;
        this.f29102dern = provider3;
        this.f29105wireman = provider4;
        this.f29103marial = provider5;
    }

    public static wireman attabal(Provider<Executor> provider, Provider<vaporizer.wireman> provider2, Provider<adultoid> provider3, Provider<com.google.android.datatransport.runtime.scheduling.persistence.wireman> provider4, Provider<cocoon.attabal> provider5) {
        return new wireman(provider, provider2, provider3, provider4, provider5);
    }

    public static dern dern(Executor executor, vaporizer.wireman wiremanVar, adultoid adultoidVar, com.google.android.datatransport.runtime.scheduling.persistence.wireman wiremanVar2, cocoon.attabal attabalVar) {
        return new dern(executor, wiremanVar, adultoidVar, wiremanVar2, attabalVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public dern get() {
        return dern(this.f29101attabal.get(), this.f29104saneness.get(), this.f29102dern.get(), this.f29105wireman.get(), this.f29103marial.get());
    }
}
