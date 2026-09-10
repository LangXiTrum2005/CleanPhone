package lehua;

import javax.inject.Provider;

/* JADX INFO: compiled from: TransportRuntime_Factory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class gintrap implements delouse.saneness<adultoid> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Provider<bramley.attabal> f32679attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Provider<kamptulicon.marial> f32680dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Provider<retrocession.molybdenite> f32681marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Provider<bramley.attabal> f32682saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Provider<retrocession.kowloon> f32683wireman;

    public gintrap(Provider<bramley.attabal> provider, Provider<bramley.attabal> provider2, Provider<kamptulicon.marial> provider3, Provider<retrocession.kowloon> provider4, Provider<retrocession.molybdenite> provider5) {
        this.f32679attabal = provider;
        this.f32682saneness = provider2;
        this.f32680dern = provider3;
        this.f32683wireman = provider4;
        this.f32681marial = provider5;
    }

    public static gintrap attabal(Provider<bramley.attabal> provider, Provider<bramley.attabal> provider2, Provider<kamptulicon.marial> provider3, Provider<retrocession.kowloon> provider4, Provider<retrocession.molybdenite> provider5) {
        return new gintrap(provider, provider2, provider3, provider4, provider5);
    }

    public static adultoid dern(bramley.attabal attabalVar, bramley.attabal attabalVar2, kamptulicon.marial marialVar, retrocession.kowloon kowloonVar, retrocession.molybdenite molybdeniteVar) {
        return new adultoid(attabalVar, attabalVar2, marialVar, kowloonVar, molybdeniteVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public adultoid get() {
        return dern(this.f32679attabal.get(), this.f32682saneness.get(), this.f32680dern.get(), this.f32683wireman.get(), this.f32681marial.get());
    }
}
