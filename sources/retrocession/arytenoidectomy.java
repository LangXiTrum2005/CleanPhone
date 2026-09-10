package retrocession;

import android.content.Context;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* JADX INFO: compiled from: Uploader_Factory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class arytenoidectomy implements delouse.saneness<kowloon> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Provider<Context> f36383attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final Provider<cocoon.attabal> f36384beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final Provider<bramley.attabal> f36385competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Provider<com.google.android.datatransport.runtime.scheduling.persistence.wireman> f36386dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final Provider<bramley.attabal> f36387impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Provider<Executor> f36388marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Provider<vaporizer.wireman> f36389saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final Provider<com.google.android.datatransport.runtime.scheduling.persistence.dern> f36390taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Provider<adultoid> f36391wireman;

    public arytenoidectomy(Provider<Context> provider, Provider<vaporizer.wireman> provider2, Provider<com.google.android.datatransport.runtime.scheduling.persistence.wireman> provider3, Provider<adultoid> provider4, Provider<Executor> provider5, Provider<cocoon.attabal> provider6, Provider<bramley.attabal> provider7, Provider<bramley.attabal> provider8, Provider<com.google.android.datatransport.runtime.scheduling.persistence.dern> provider9) {
        this.f36383attabal = provider;
        this.f36389saneness = provider2;
        this.f36386dern = provider3;
        this.f36391wireman = provider4;
        this.f36388marial = provider5;
        this.f36384beachfront = provider6;
        this.f36385competently = provider7;
        this.f36387impromptu = provider8;
        this.f36390taiyuan = provider9;
    }

    public static arytenoidectomy attabal(Provider<Context> provider, Provider<vaporizer.wireman> provider2, Provider<com.google.android.datatransport.runtime.scheduling.persistence.wireman> provider3, Provider<adultoid> provider4, Provider<Executor> provider5, Provider<cocoon.attabal> provider6, Provider<bramley.attabal> provider7, Provider<bramley.attabal> provider8, Provider<com.google.android.datatransport.runtime.scheduling.persistence.dern> provider9) {
        return new arytenoidectomy(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static kowloon dern(Context context, vaporizer.wireman wiremanVar, com.google.android.datatransport.runtime.scheduling.persistence.wireman wiremanVar2, adultoid adultoidVar, Executor executor, cocoon.attabal attabalVar, bramley.attabal attabalVar2, bramley.attabal attabalVar3, com.google.android.datatransport.runtime.scheduling.persistence.dern dernVar) {
        return new kowloon(context, wiremanVar, wiremanVar2, adultoidVar, executor, attabalVar, attabalVar2, attabalVar3, dernVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public kowloon get() {
        return dern(this.f36383attabal.get(), this.f36389saneness.get(), this.f36386dern.get(), this.f36391wireman.get(), this.f36388marial.get(), this.f36384beachfront.get(), this.f36385competently.get(), this.f36387impromptu.get(), this.f36390taiyuan.get());
    }
}
