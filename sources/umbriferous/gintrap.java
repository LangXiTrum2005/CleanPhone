package umbriferous;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: CrashlyticsCore.java */
/* JADX INFO: loaded from: classes3.dex */
public class gintrap {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final spissatus.competently f39098apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final gelandelaufer.formularize f39099arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f39100attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public rotuma f39101beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public rotuma f39102competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final kattegat f39103cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final trm f39104dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final evenfall.saneness f39105formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public final arcticology.attabal f39106impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public boolean f39107impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final gelandelaufer.attabal f39108kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final CrashlyticsWorkers f39110monoploid;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final iiion.beachfront f39111saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public kowloon f39112taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public final formularize f39113triweekly;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final long f39109marial = System.currentTimeMillis();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final seminary f39114wireman = new seminary();

    public gintrap(iiion.beachfront beachfrontVar, kattegat kattegatVar, gelandelaufer.attabal attabalVar, trm trmVar, evenfall.saneness sanenessVar, arcticology.attabal attabalVar2, spissatus.competently competentlyVar, formularize formularizeVar, gelandelaufer.formularize formularizeVar2, CrashlyticsWorkers crashlyticsWorkers) {
        this.f39111saneness = beachfrontVar;
        this.f39104dern = trmVar;
        this.f39100attabal = beachfrontVar.apical();
        this.f39103cutely = kattegatVar;
        this.f39108kowloon = attabalVar;
        this.f39105formularize = sanenessVar;
        this.f39106impassible = attabalVar2;
        this.f39098apical = competentlyVar;
        this.f39113triweekly = formularizeVar;
        this.f39099arytenoidectomy = formularizeVar2;
        this.f39110monoploid = crashlyticsWorkers;
    }

    public static String formularize() {
        return "19.4.2";
    }

    public static boolean impassible(String str, boolean z) {
        if (z) {
            return !TextUtils.isEmpty(str);
        }
        gelandelaufer.competently.beachfront().taiyuan("Configured not to require a build ID.");
        return true;
    }

    public final void apical(final reeve.impromptu impromptuVar) {
        Future<?> futureSubmit = this.f39110monoploid.common.dern().submit(new Runnable() { // from class: umbriferous.molybdenite
            @Override // java.lang.Runnable
            public final void run() {
                this.f39168kowloon.taiyuan(impromptuVar);
            }
        });
        gelandelaufer.competently.beachfront().saneness("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            gelandelaufer.competently.beachfront().marial("Crashlytics was interrupted during initialization.", e);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            gelandelaufer.competently.beachfront().marial("Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            gelandelaufer.competently.beachfront().marial("Crashlytics timed out during initialization.", e3);
        }
    }

    public void arytenoidectomy() {
        CrashlyticsWorkers.dern();
        try {
            if (this.f39101beachfront.wireman()) {
                return;
            }
            gelandelaufer.competently.beachfront().apical("Initialization marker file was not properly removed.");
        } catch (Exception e) {
            gelandelaufer.competently.beachfront().marial("Problem encountered deleting Crashlytics initialization marker.", e);
        }
    }

    public final void competently() {
        try {
            this.f39107impromptu = Boolean.TRUE.equals((Boolean) this.f39110monoploid.common.dern().submit(new Callable() { // from class: umbriferous.polloi
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(this.f39181kowloon.f39112taiyuan.polloi());
                }
            }).get(3L, TimeUnit.SECONDS));
        } catch (Exception unused) {
            this.f39107impromptu = false;
        }
    }

    public Task<Void> cutely(final reeve.impromptu impromptuVar) {
        return this.f39110monoploid.common.wireman(new Runnable() { // from class: umbriferous.arytenoidectomy
            @Override // java.lang.Runnable
            public final void run() {
                this.f39070kowloon.taiyuan(impromptuVar);
            }
        });
    }

    public boolean impromptu() {
        return this.f39101beachfront.dern();
    }

    public void kowloon(final Throwable th, final Map<String, String> map) {
        this.f39110monoploid.common.wireman(new Runnable() { // from class: umbriferous.monoploid
            @Override // java.lang.Runnable
            public final void run() {
                this.f39170kowloon.f39112taiyuan.splinterproof(Thread.currentThread(), th, map);
            }
        });
    }

    public void molybdenite(Boolean bool) {
        this.f39104dern.impromptu(bool);
    }

    public void monoploid() {
        CrashlyticsWorkers.dern();
        this.f39101beachfront.attabal();
        gelandelaufer.competently.beachfront().taiyuan("Initialization marker file was created.");
    }

    public boolean polloi(attabal attabalVar, reeve.impromptu impromptuVar) {
        if (!impassible(attabalVar.f39077saneness, CommonUtils.taiyuan(this.f39100attabal, "com.crashlytics.RequireBuildId", true))) {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        String strDern = new impromptu().dern();
        try {
            this.f39102competently = new rotuma("crash_marker", this.f39098apical);
            this.f39101beachfront = new rotuma("initialization_marker", this.f39098apical);
            rollout.kowloon kowloonVar = new rollout.kowloon(strDern, this.f39098apical, this.f39110monoploid);
            rollout.beachfront beachfrontVar = new rollout.beachfront(this.f39098apical);
            yod.attabal attabalVar2 = new yod.attabal(1024, new yod.dern(10));
            this.f39099arytenoidectomy.saneness(kowloonVar);
            this.f39112taiyuan = new kowloon(this.f39100attabal, this.f39103cutely, this.f39104dern, this.f39098apical, this.f39102competently, attabalVar, kowloonVar, beachfrontVar, starveling.cutely(this.f39100attabal, this.f39103cutely, this.f39098apical, attabalVar, beachfrontVar, kowloonVar, attabalVar2, impromptuVar, this.f39114wireman, this.f39113triweekly, this.f39110monoploid), this.f39108kowloon, this.f39106impassible, this.f39113triweekly, this.f39110monoploid);
            boolean zImpromptu = impromptu();
            competently();
            this.f39112taiyuan.gintrap(strDern, Thread.getDefaultUncaughtExceptionHandler(), impromptuVar);
            if (!zImpromptu || !CommonUtils.wireman(this.f39100attabal)) {
                gelandelaufer.competently.beachfront().saneness("Successfully configured exception handler.");
                return true;
            }
            gelandelaufer.competently.beachfront().saneness("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            apical(impromptuVar);
            return false;
        } catch (Exception e) {
            gelandelaufer.competently.beachfront().marial("Crashlytics was not started due to an exception during initialization", e);
            this.f39112taiyuan = null;
            return false;
        }
    }

    public final void taiyuan(reeve.impromptu impromptuVar) {
        CrashlyticsWorkers.dern();
        monoploid();
        try {
            try {
                this.f39105formularize.attabal(new evenfall.attabal() { // from class: umbriferous.graveside
                    @Override // evenfall.attabal
                    public final void attabal(String str) {
                        this.f39115attabal.triweekly(str);
                    }
                });
                this.f39112taiyuan.starveling();
                if (!impromptuVar.saneness().f36185saneness.f36187attabal) {
                    gelandelaufer.competently.beachfront().saneness("Collection of crash reports disabled in Crashlytics settings.");
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.f39112taiyuan.preprohormone(impromptuVar)) {
                    gelandelaufer.competently.beachfront().apical("Previous sessions could not be finalized.");
                }
                this.f39112taiyuan.walach(impromptuVar.attabal());
                arytenoidectomy();
            } catch (Exception e) {
                gelandelaufer.competently.beachfront().marial("Crashlytics encountered a problem during asynchronous initialization.", e);
                arytenoidectomy();
            }
        } catch (Throwable th) {
            arytenoidectomy();
            throw th;
        }
    }

    public void triweekly(final String str) {
        final long jCurrentTimeMillis = System.currentTimeMillis() - this.f39109marial;
        this.f39110monoploid.common.wireman(new Runnable() { // from class: umbriferous.adultoid
            @Override // java.lang.Runnable
            public final void run() {
                gintrap gintrapVar = this.f39062kowloon;
                gintrapVar.f39110monoploid.diskWrite.wireman(new Runnable() { // from class: umbriferous.dovishness
                    @Override // java.lang.Runnable
                    public final void run() {
                        gintrapVar.f39112taiyuan.overspeculate(j, str);
                    }
                });
            }
        });
    }
}
