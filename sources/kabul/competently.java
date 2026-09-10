package kabul;

import android.content.Context;

/* JADX INFO: compiled from: Trackers.java */
/* JADX INFO: loaded from: classes.dex */
public class competently {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static competently f29018marial;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public attabal f29019attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public marial f29020dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public saneness f29021saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public beachfront f29022wireman;

    public competently(Context context, arugula.attabal attabalVar) {
        Context applicationContext = context.getApplicationContext();
        this.f29019attabal = new attabal(applicationContext, attabalVar);
        this.f29021saneness = new saneness(applicationContext, attabalVar);
        this.f29020dern = new marial(applicationContext, attabalVar);
        this.f29022wireman = new beachfront(applicationContext, attabalVar);
    }

    public static synchronized competently dern(Context context, arugula.attabal attabalVar) {
        try {
            if (f29018marial == null) {
                f29018marial = new competently(context, attabalVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f29018marial;
    }

    public attabal attabal() {
        return this.f29019attabal;
    }

    public beachfront marial() {
        return this.f29022wireman;
    }

    public saneness saneness() {
        return this.f29021saneness;
    }

    public marial wireman() {
        return this.f29020dern;
    }
}
