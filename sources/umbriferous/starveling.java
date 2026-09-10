package umbriferous;

import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import rollout.EventMetadata;
import saneness.yaounde;

/* JADX INFO: compiled from: SessionReportingCoordinator.java */
/* JADX INFO: loaded from: classes3.dex */
public class starveling {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final preprohormone f39205attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final kattegat f39206beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final CrashlyticsWorkers f39207competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final glycolate.saneness f39208dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final rollout.kowloon f39209marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final spissatus.marial f39210saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final rollout.beachfront f39211wireman;

    public starveling(preprohormone preprohormoneVar, spissatus.marial marialVar, glycolate.saneness sanenessVar, rollout.beachfront beachfrontVar, rollout.kowloon kowloonVar, kattegat kattegatVar, CrashlyticsWorkers crashlyticsWorkers) {
        this.f39205attabal = preprohormoneVar;
        this.f39210saneness = marialVar;
        this.f39208dern = sanenessVar;
        this.f39211wireman = beachfrontVar;
        this.f39209marial = kowloonVar;
        this.f39206beachfront = kattegatVar;
        this.f39207competently = crashlyticsWorkers;
    }

    public static /* synthetic */ void attabal(starveling starvelingVar, amount.sealless.marial.wireman wiremanVar, EventMetadata eventMetadata, boolean z) {
        starvelingVar.getClass();
        gelandelaufer.competently.beachfront().saneness("disk worker: log non-fatal event to persistence");
        starvelingVar.f39210saneness.gintrap(wiremanVar, eventMetadata.getSessionId(), z);
    }

    public static starveling cutely(Context context, kattegat kattegatVar, spissatus.competently competentlyVar, attabal attabalVar, rollout.beachfront beachfrontVar, rollout.kowloon kowloonVar, yod.wireman wiremanVar, reeve.impromptu impromptuVar, seminary seminaryVar, formularize formularizeVar, CrashlyticsWorkers crashlyticsWorkers) {
        return new starveling(new preprohormone(context, kattegatVar, attabalVar, wiremanVar, impromptuVar), new spissatus.marial(competentlyVar, impromptuVar, formularizeVar), glycolate.saneness.saneness(context, impromptuVar, seminaryVar), beachfrontVar, kowloonVar, kattegatVar, crashlyticsWorkers);
    }

    public static amount.sealless.attabal impromptu(ApplicationExitInfo applicationExitInfo) {
        String strTaiyuan = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                strTaiyuan = taiyuan(traceInputStream);
            }
        } catch (IOException e) {
            gelandelaufer.competently.beachfront().apical("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e);
        }
        return amount.sealless.attabal.attabal().dern(applicationExitInfo.getImportance()).marial(applicationExitInfo.getProcessName()).competently(applicationExitInfo.getReason()).taiyuan(applicationExitInfo.getTimestamp()).wireman(applicationExitInfo.getPid()).beachfront(applicationExitInfo.getPss()).impromptu(applicationExitInfo.getRss()).cutely(strTaiyuan).attabal();
    }

    public static List<amount.sealless.dern> kowloon(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(amount.sealless.dern.attabal().saneness(entry.getKey()).dern(entry.getValue()).attabal());
        }
        Collections.sort(arrayList, new Comparator() { // from class: umbriferous.creditor
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((amount.sealless.dern) obj).saneness().compareTo(((amount.sealless.dern) obj2).saneness());
            }
        });
        return Collections.unmodifiableList(arrayList);
    }

    public static String taiyuan(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public void adultoid(Throwable th, Thread thread, String str, long j) {
        gelandelaufer.competently.beachfront().taiyuan("Persisting fatal event for session " + str);
        graveside(th, thread, AppMeasurement.CRASH_ORIGIN, new EventMetadata(str, j), true);
    }

    public final cord apical(cord cordVar) {
        if (cordVar.saneness().impromptu() != null && cordVar.saneness().competently() != null) {
            return cordVar;
        }
        FirebaseInstallationId firebaseInstallationIdWireman = this.f39206beachfront.wireman(true);
        return cord.attabal(cordVar.saneness().graveside(firebaseInstallationIdWireman.getFid()).molybdenite(firebaseInstallationIdWireman.getAuthToken()), cordVar.wireman(), cordVar.dern());
    }

    public boolean arytenoidectomy() {
        return this.f39210saneness.polloi();
    }

    public final amount.sealless.marial.wireman beachfront(amount.sealless.marial.wireman wiremanVar, Map<String, String> map) {
        return competently(marial(wiremanVar, this.f39211wireman, this.f39209marial, map), this.f39209marial);
    }

    public final amount.sealless.marial.wireman competently(amount.sealless.marial.wireman wiremanVar, rollout.kowloon kowloonVar) {
        List<amount.sealless.marial.wireman.AbstractC0023marial> listImpromptu = kowloonVar.impromptu();
        if (listImpromptu.isEmpty()) {
            return wiremanVar;
        }
        amount.sealless.marial.wireman.saneness sanenessVarImpromptu = wiremanVar.impromptu();
        sanenessVarImpromptu.marial(amount.sealless.marial.wireman.beachfront.attabal().saneness(listImpromptu).attabal());
        return sanenessVarImpromptu.attabal();
    }

    public Task<Void> cord(Executor executor, String str) {
        List<cord> listAdultoid = this.f39210saneness.adultoid();
        ArrayList arrayList = new ArrayList();
        for (cord cordVar : listAdultoid) {
            if (str == null || str.equals(cordVar.wireman())) {
                arrayList.add(this.f39208dern.dern(apical(cordVar), str != null).continueWith(executor, new Continuation() { // from class: umbriferous.privatdozent
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        return Boolean.valueOf(this.f39190attabal.molybdenite(task));
                    }
                }));
            }
        }
        return Tasks.whenAll(arrayList);
    }

    public void dovishness(Throwable th, Thread thread, EventMetadata eventMetadata) {
        gelandelaufer.competently.beachfront().taiyuan("Persisting non-fatal event for session " + eventMetadata.getSessionId());
        graveside(th, thread, "error", eventMetadata, false);
    }

    public void formularize(String str, List<merc> list, amount.sealless.attabal attabalVar) {
        gelandelaufer.competently.beachfront().saneness("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator<merc> it = list.iterator();
        while (it.hasNext()) {
            amount.sealless.wireman.saneness sanenessVarAttabal = it.next().attabal();
            if (sanenessVarAttabal != null) {
                arrayList.add(sanenessVarAttabal);
            }
        }
        this.f39210saneness.formularize(str, amount.sealless.wireman.attabal().saneness(Collections.unmodifiableList(arrayList)).attabal(), attabalVar);
    }

    public void gintrap(String str, List<ApplicationExitInfo> list, rollout.beachfront beachfrontVar, rollout.kowloon kowloonVar) {
        ApplicationExitInfo applicationExitInfoTriweekly = triweekly(str, list);
        if (applicationExitInfoTriweekly == null) {
            gelandelaufer.competently.beachfront().taiyuan("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        amount.sealless.marial.wireman wiremanVarDern = this.f39205attabal.dern(impromptu(applicationExitInfoTriweekly));
        gelandelaufer.competently.beachfront().saneness("Persisting anr for session " + str);
        this.f39210saneness.gintrap(competently(wireman(wiremanVarDern, beachfrontVar, kowloonVar), kowloonVar), str, true);
    }

    public final void graveside(Throwable th, Thread thread, String str, final EventMetadata eventMetadata, boolean z) {
        final boolean zEquals = str.equals(AppMeasurement.CRASH_ORIGIN);
        final amount.sealless.marial.wireman wiremanVarBeachfront = beachfront(this.f39205attabal.wireman(th, thread, str, eventMetadata.getTimestamp(), 4, 8, z), eventMetadata.attabal());
        if (z) {
            this.f39210saneness.gintrap(wiremanVarBeachfront, eventMetadata.getSessionId(), zEquals);
        } else {
            this.f39207competently.diskWrite.wireman(new Runnable() { // from class: umbriferous.saran
                @Override // java.lang.Runnable
                public final void run() {
                    starveling.attabal(this.f39198kowloon, wiremanVarBeachfront, eventMetadata, zEquals);
                }
            });
        }
    }

    public void impassible(long j, String str) {
        this.f39210saneness.apical(str, j);
    }

    public final amount.sealless.marial.wireman marial(amount.sealless.marial.wireman wiremanVar, rollout.beachfront beachfrontVar, rollout.kowloon kowloonVar, Map<String, String> map) {
        amount.sealless.marial.wireman.saneness sanenessVarImpromptu = wiremanVar.impromptu();
        String strDern = beachfrontVar.dern();
        if (strDern != null) {
            sanenessVarImpromptu.wireman(amount.sealless.marial.wireman.AbstractC0024wireman.attabal().saneness(strDern).attabal());
        } else {
            gelandelaufer.competently.beachfront().taiyuan("No log data to include with this event.");
        }
        List<amount.sealless.dern> listKowloon = kowloon(kowloonVar.beachfront(map));
        List<amount.sealless.dern> listKowloon2 = kowloon(kowloonVar.competently());
        if (!listKowloon.isEmpty() || !listKowloon2.isEmpty()) {
            sanenessVarImpromptu.saneness(wiremanVar.saneness().taiyuan().marial(listKowloon).competently(listKowloon2).attabal());
        }
        return sanenessVarImpromptu.attabal();
    }

    public final boolean molybdenite(Task<cord> task) {
        if (!task.isSuccessful()) {
            gelandelaufer.competently.beachfront().formularize("Crashlytics report could not be enqueued to DataTransport", task.getException());
            return false;
        }
        cord result = task.getResult();
        gelandelaufer.competently.beachfront().saneness("Crashlytics report successfully enqueued to DataTransport: " + result.wireman());
        File fileDern = result.dern();
        if (fileDern.delete()) {
            gelandelaufer.competently.beachfront().saneness("Deleted report file: " + fileDern.getPath());
            return true;
        }
        gelandelaufer.competently.beachfront().apical("Crashlytics could not delete report file: " + fileDern.getPath());
        return true;
    }

    public SortedSet<String> monoploid() {
        return this.f39210saneness.arytenoidectomy();
    }

    public void polloi(String str, long j) {
        this.f39210saneness.rotuma(this.f39205attabal.marial(str, j));
    }

    public Task<Void> preprohormone(Executor executor) {
        return cord(executor, null);
    }

    public void rotuma() {
        this.f39210saneness.taiyuan();
    }

    public final ApplicationExitInfo triweekly(String str, List<ApplicationExitInfo> list) {
        long jMonoploid = this.f39210saneness.monoploid(str);
        Iterator<ApplicationExitInfo> it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoAttabal = yaounde.attabal(it.next());
            if (applicationExitInfoAttabal.getTimestamp() < jMonoploid) {
                return null;
            }
            if (applicationExitInfoAttabal.getReason() == 6) {
                return applicationExitInfoAttabal;
            }
        }
        return null;
    }

    public final amount.sealless.marial.wireman wireman(amount.sealless.marial.wireman wiremanVar, rollout.beachfront beachfrontVar, rollout.kowloon kowloonVar) {
        return marial(wiremanVar, beachfrontVar, kowloonVar, Collections.EMPTY_MAP);
    }
}
