package hobby;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: MutableMonitoringRegistry.java */
/* JADX INFO: loaded from: classes3.dex */
public final class rotuma {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final AtomicReference<molybdenite> f27829attabal = new AtomicReference<>();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final rotuma f27828saneness = new rotuma();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final saneness f27827dern = new saneness();

    /* JADX INFO: compiled from: MutableMonitoringRegistry.java */
    public static class saneness implements molybdenite {
        public saneness() {
        }

        @Override // hobby.molybdenite
        public molybdenite.attabal attabal(triweekly triweeklyVar, polloi polloiVar, String str, String str2) {
            return graveside.f27774attabal;
        }
    }

    public static rotuma saneness() {
        return f27828saneness;
    }

    public molybdenite attabal() {
        molybdenite molybdeniteVar = this.f27829attabal.get();
        return molybdeniteVar == null ? f27827dern : molybdeniteVar;
    }
}
