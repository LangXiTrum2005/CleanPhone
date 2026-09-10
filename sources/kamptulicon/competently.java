package kamptulicon;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import javax.inject.Provider;

/* JADX INFO: compiled from: SchedulingConfigModule_ConfigFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class competently implements delouse.saneness<SchedulerConfig> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Provider<bramley.attabal> f29087attabal;

    public competently(Provider<bramley.attabal> provider) {
        this.f29087attabal = provider;
    }

    public static SchedulerConfig attabal(bramley.attabal attabalVar) {
        return (SchedulerConfig) delouse.wireman.wireman(beachfront.attabal(attabalVar));
    }

    public static competently saneness(Provider<bramley.attabal> provider) {
        return new competently(provider);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public SchedulerConfig get() {
        return attabal(this.f29087attabal.get());
    }
}
