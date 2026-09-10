package kamptulicon;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import javax.inject.Provider;
import retrocession.adultoid;

/* JADX INFO: compiled from: SchedulingModule_WorkSchedulerFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class taiyuan implements delouse.saneness<adultoid> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Provider<Context> f29097attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Provider<SchedulerConfig> f29098dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Provider<com.google.android.datatransport.runtime.scheduling.persistence.wireman> f29099saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Provider<bramley.attabal> f29100wireman;

    public taiyuan(Provider<Context> provider, Provider<com.google.android.datatransport.runtime.scheduling.persistence.wireman> provider2, Provider<SchedulerConfig> provider3, Provider<bramley.attabal> provider4) {
        this.f29097attabal = provider;
        this.f29099saneness = provider2;
        this.f29098dern = provider3;
        this.f29100wireman = provider4;
    }

    public static taiyuan attabal(Provider<Context> provider, Provider<com.google.android.datatransport.runtime.scheduling.persistence.wireman> provider2, Provider<SchedulerConfig> provider3, Provider<bramley.attabal> provider4) {
        return new taiyuan(provider, provider2, provider3, provider4);
    }

    public static adultoid dern(Context context, com.google.android.datatransport.runtime.scheduling.persistence.wireman wiremanVar, SchedulerConfig schedulerConfig, bramley.attabal attabalVar) {
        return (adultoid) delouse.wireman.wireman(impromptu.attabal(context, wiremanVar, schedulerConfig, attabalVar));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public adultoid get() {
        return dern(this.f29097attabal.get(), this.f29099saneness.get(), this.f29098dern.get(), this.f29100wireman.get());
    }
}
