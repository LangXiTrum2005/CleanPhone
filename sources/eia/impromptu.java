package eia;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import umbriferous.formularize;
import umbriferous.gintrap;
import umbriferous.kattegat;
import umbriferous.trm;

/* JADX INFO: compiled from: FirebaseCrashlytics.java */
/* JADX INFO: loaded from: classes3.dex */
public class impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final gintrap f25593attabal;

    public impromptu(gintrap gintrapVar) {
        this.f25593attabal = gintrapVar;
    }

    public static impromptu dern(iiion.beachfront beachfrontVar, ingathering.competently competentlyVar, friedmanite.attabal<gelandelaufer.attabal> attabalVar, friedmanite.attabal<anthomaniac.attabal> attabalVar2, friedmanite.attabal<clue.attabal> attabalVar3, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3) {
        Context contextApical = beachfrontVar.apical();
        String packageName = contextApical.getPackageName();
        gelandelaufer.competently.beachfront().competently("Initializing Firebase Crashlytics " + gintrap.formularize() + " for " + packageName);
        CrashlyticsWorkers crashlyticsWorkers = new CrashlyticsWorkers(executorService, executorService2);
        spissatus.competently competentlyVar2 = new spissatus.competently(contextApical);
        trm trmVar = new trm(beachfrontVar);
        kattegat kattegatVar = new kattegat(contextApical, packageName, competentlyVar, trmVar);
        gelandelaufer.wireman wiremanVar = new gelandelaufer.wireman(attabalVar);
        wireman wiremanVar2 = new wireman(attabalVar2);
        formularize formularizeVar = new formularize(trmVar, competentlyVar2);
        FirebaseSessionsDependencies.marial(formularizeVar);
        gintrap gintrapVar = new gintrap(beachfrontVar, kattegatVar, wiremanVar, trmVar, wiremanVar2.marial(), wiremanVar2.wireman(), competentlyVar2, formularizeVar, new gelandelaufer.formularize(attabalVar3), crashlyticsWorkers);
        String strDern = beachfrontVar.kowloon().dern();
        String strImpassible = CommonUtils.impassible(contextApical);
        List<umbriferous.beachfront> listCutely = CommonUtils.cutely(contextApical);
        gelandelaufer.competently.beachfront().saneness("Mapping file ID is: " + strImpassible);
        for (umbriferous.beachfront beachfrontVar2 : listCutely) {
            gelandelaufer.competently.beachfront().saneness(String.format("Build id for %s on %s: %s", beachfrontVar2.dern(), beachfrontVar2.attabal(), beachfrontVar2.saneness()));
        }
        try {
            umbriferous.attabal attabalVarAttabal = umbriferous.attabal.attabal(contextApical, kattegatVar, strDern, strImpassible, listCutely, new gelandelaufer.beachfront(contextApical));
            gelandelaufer.competently.beachfront().taiyuan("Installer package name is: " + attabalVarAttabal.f39078wireman);
            com.google.firebase.crashlytics.internal.settings.attabal attabalVarFormularize = com.google.firebase.crashlytics.internal.settings.attabal.formularize(contextApical, strDern, kattegatVar, new abortive.saneness(), attabalVarAttabal.f39072beachfront, attabalVarAttabal.f39073competently, competentlyVar2, trmVar);
            attabalVarFormularize.kowloon(crashlyticsWorkers).addOnFailureListener(executorService3, new OnFailureListener() { // from class: eia.competently
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    gelandelaufer.competently.beachfront().marial("Error fetching settings.", exc);
                }
            });
            if (gintrapVar.polloi(attabalVarAttabal, attabalVarFormularize)) {
                gintrapVar.cutely(attabalVarFormularize);
            }
            return new impromptu(gintrapVar);
        } catch (PackageManager.NameNotFoundException e) {
            gelandelaufer.competently.beachfront().marial("Error retrieving app package info.", e);
            return null;
        }
    }

    public static impromptu saneness() {
        impromptu impromptuVar = (impromptu) iiion.beachfront.impassible().cutely(impromptu.class);
        if (impromptuVar != null) {
            return impromptuVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public void marial(boolean z) {
        this.f25593attabal.molybdenite(Boolean.valueOf(z));
    }

    public void wireman(Throwable th) {
        if (th == null) {
            gelandelaufer.competently.beachfront().apical("A null value was passed to recordException. Ignoring.");
        } else {
            this.f25593attabal.kowloon(th, Collections.EMPTY_MAP);
        }
    }
}
