package overassessment;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import androidx.work.apical;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.google.common.util.concurrent.adultoid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import ocellation.arytenoidectomy;
import ocellation.graveside;
import ocellation.monoploid;
import talweg.formularize;
import talweg.impassible;
import talweg.triweekly;

/* JADX INFO: compiled from: WorkerWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public class cutely implements Runnable {

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public static final String f34862supplicat = apical.beachfront("WorkerWrapper");

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public arugula.attabal f34863adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public String f34864arytenoidectomy;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public monoploid f34865cord;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public ocellation.saneness f34866cuirassed;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public androidx.work.attabal f34868gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public ListenableWorker f34869graveside;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public volatile boolean f34870kattegat;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public Context f34871kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public arytenoidectomy f34872molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public List<marial> f34873monoploid;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public String f34874oilcan;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public WorkerParameters.attabal f34875polloi;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public WorkDatabase f34876preprohormone;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public specky.attabal f34877rotuma;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public graveside f34879stratoscope;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public List<String> f34880trm;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public ListenableWorker.attabal f34867dovishness = ListenableWorker.attabal.attabal();

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public androidx.work.impl.utils.futures.attabal<Boolean> f34881yemenite = androidx.work.impl.utils.futures.attabal.graveside();

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public adultoid<ListenableWorker.attabal> f34878sealless = null;

    /* JADX INFO: compiled from: WorkerWrapper.java */
    public class attabal implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ androidx.work.impl.utils.futures.attabal f34882arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ adultoid f34883kowloon;

        public attabal(adultoid adultoidVar, androidx.work.impl.utils.futures.attabal attabalVar) {
            this.f34883kowloon = adultoidVar;
            this.f34882arytenoidectomy = attabalVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f34883kowloon.get();
                apical.dern().attabal(cutely.f34862supplicat, String.format("Starting work for %s", cutely.this.f34872molybdenite.f34003dern), new Throwable[0]);
                cutely cutelyVar = cutely.this;
                cutelyVar.f34878sealless = cutelyVar.f34869graveside.startWork();
                this.f34882arytenoidectomy.polloi(cutely.this.f34878sealless);
            } catch (Throwable th) {
                this.f34882arytenoidectomy.monoploid(th);
            }
        }
    }

    /* JADX INFO: compiled from: WorkerWrapper.java */
    public static class dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public Context f34885attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public WorkDatabase f34886beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public String f34887competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public specky.attabal f34888dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public List<marial> f34889impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public androidx.work.attabal f34890marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public ListenableWorker f34891saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public WorkerParameters.attabal f34892taiyuan = new WorkerParameters.attabal();

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public arugula.attabal f34893wireman;

        public dern(Context context, androidx.work.attabal attabalVar, arugula.attabal attabalVar2, specky.attabal attabalVar3, WorkDatabase workDatabase, String str) {
            this.f34885attabal = context.getApplicationContext();
            this.f34893wireman = attabalVar2;
            this.f34888dern = attabalVar3;
            this.f34890marial = attabalVar;
            this.f34886beachfront = workDatabase;
            this.f34887competently = str;
        }

        public cutely attabal() {
            return new cutely(this);
        }

        public dern dern(List<marial> list) {
            this.f34889impromptu = list;
            return this;
        }

        public dern saneness(WorkerParameters.attabal attabalVar) {
            if (attabalVar != null) {
                this.f34892taiyuan = attabalVar;
            }
            return this;
        }
    }

    /* JADX INFO: compiled from: WorkerWrapper.java */
    public class saneness implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ String f34894arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ androidx.work.impl.utils.futures.attabal f34895kowloon;

        public saneness(androidx.work.impl.utils.futures.attabal attabalVar, String str) {
            this.f34895kowloon = attabalVar;
            this.f34894arytenoidectomy = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    ListenableWorker.attabal attabalVar = (ListenableWorker.attabal) this.f34895kowloon.get();
                    if (attabalVar == null) {
                        apical.dern().saneness(cutely.f34862supplicat, String.format("%s returned a null result. Treating it as a failure.", cutely.this.f34872molybdenite.f34003dern), new Throwable[0]);
                    } else {
                        apical.dern().attabal(cutely.f34862supplicat, String.format("%s returned a %s result.", cutely.this.f34872molybdenite.f34003dern, attabalVar), new Throwable[0]);
                        cutely.this.f34867dovishness = attabalVar;
                    }
                    cutely.this.beachfront();
                } catch (InterruptedException e) {
                    e = e;
                    apical.dern().saneness(cutely.f34862supplicat, String.format("%s failed because it threw an exception/error", this.f34894arytenoidectomy), e);
                    cutely.this.beachfront();
                } catch (CancellationException e2) {
                    apical.dern().wireman(cutely.f34862supplicat, String.format("%s was cancelled", this.f34894arytenoidectomy), e2);
                    cutely.this.beachfront();
                } catch (ExecutionException e3) {
                    e = e3;
                    apical.dern().saneness(cutely.f34862supplicat, String.format("%s failed because it threw an exception/error", this.f34894arytenoidectomy), e);
                    cutely.this.beachfront();
                }
            } catch (Throwable th) {
                cutely.this.beachfront();
                throw th;
            }
        }
    }

    public cutely(dern dernVar) {
        this.f34871kowloon = dernVar.f34885attabal;
        this.f34863adultoid = dernVar.f34893wireman;
        this.f34877rotuma = dernVar.f34888dern;
        this.f34864arytenoidectomy = dernVar.f34887competently;
        this.f34873monoploid = dernVar.f34889impromptu;
        this.f34875polloi = dernVar.f34892taiyuan;
        this.f34869graveside = dernVar.f34891saneness;
        this.f34868gintrap = dernVar.f34890marial;
        WorkDatabase workDatabase = dernVar.f34886beachfront;
        this.f34876preprohormone = workDatabase;
        this.f34865cord = workDatabase.stratoscope();
        this.f34866cuirassed = this.f34876preprohormone.graveside();
        this.f34879stratoscope = this.f34876preprohormone.trm();
    }

    public final void apical() {
        androidx.work.wireman wiremanVarSaneness;
        if (triweekly()) {
            return;
        }
        this.f34876preprohormone.dern();
        try {
            arytenoidectomy arytenoidectomyVarCompetently = this.f34865cord.competently(this.f34864arytenoidectomy);
            this.f34872molybdenite = arytenoidectomyVarCompetently;
            if (arytenoidectomyVarCompetently == null) {
                apical.dern().saneness(f34862supplicat, String.format("Didn't find WorkSpec for id %s", this.f34864arytenoidectomy), new Throwable[0]);
                taiyuan(false);
                this.f34876preprohormone.polloi();
                this.f34876preprohormone.competently();
                return;
            }
            if (arytenoidectomyVarCompetently.f34011saneness != WorkInfo.State.ENQUEUED) {
                cutely();
                this.f34876preprohormone.polloi();
                apical.dern().attabal(f34862supplicat, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f34872molybdenite.f34003dern), new Throwable[0]);
                this.f34876preprohormone.competently();
                return;
            }
            if (arytenoidectomyVarCompetently.wireman() || this.f34872molybdenite.dern()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                arytenoidectomy arytenoidectomyVar = this.f34872molybdenite;
                if (arytenoidectomyVar.f34013triweekly != 0 && jCurrentTimeMillis < arytenoidectomyVar.attabal()) {
                    apical.dern().attabal(f34862supplicat, String.format("Delaying execution for %s because it is being executed before schedule.", this.f34872molybdenite.f34003dern), new Throwable[0]);
                    taiyuan(true);
                    this.f34876preprohormone.polloi();
                    this.f34876preprohormone.competently();
                    return;
                }
            }
            this.f34876preprohormone.polloi();
            this.f34876preprohormone.competently();
            if (this.f34872molybdenite.wireman()) {
                wiremanVarSaneness = this.f34872molybdenite.f34008marial;
            } else {
                androidx.work.impromptu impromptuVarSaneness = this.f34868gintrap.beachfront().saneness(this.f34872molybdenite.f34014wireman);
                if (impromptuVarSaneness == null) {
                    apical.dern().saneness(f34862supplicat, String.format("Could not create Input Merger %s", this.f34872molybdenite.f34014wireman), new Throwable[0]);
                    formularize();
                    return;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f34872molybdenite.f34008marial);
                    arrayList.addAll(this.f34865cord.taiyuan(this.f34864arytenoidectomy));
                    wiremanVarSaneness = impromptuVarSaneness.saneness(arrayList);
                }
            }
            WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f34864arytenoidectomy), wiremanVarSaneness, this.f34880trm, this.f34875polloi, this.f34872molybdenite.f33997apical, this.f34868gintrap.marial(), this.f34863adultoid, this.f34868gintrap.impassible(), new triweekly(this.f34876preprohormone, this.f34863adultoid), new impassible(this.f34876preprohormone, this.f34877rotuma, this.f34863adultoid));
            if (this.f34869graveside == null) {
                this.f34869graveside = this.f34868gintrap.impassible().saneness(this.f34871kowloon, this.f34872molybdenite.f34003dern, workerParameters);
            }
            ListenableWorker listenableWorker = this.f34869graveside;
            if (listenableWorker == null) {
                apical.dern().saneness(f34862supplicat, String.format("Could not create Worker %s", this.f34872molybdenite.f34003dern), new Throwable[0]);
                formularize();
                return;
            }
            if (listenableWorker.isUsed()) {
                apical.dern().saneness(f34862supplicat, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f34872molybdenite.f34003dern), new Throwable[0]);
                formularize();
                return;
            }
            this.f34869graveside.setUsed();
            if (!kowloon()) {
                cutely();
                return;
            }
            if (triweekly()) {
                return;
            }
            androidx.work.impl.utils.futures.attabal attabalVarGraveside = androidx.work.impl.utils.futures.attabal.graveside();
            formularize formularizeVar = new formularize(this.f34871kowloon, this.f34872molybdenite, this.f34869graveside, workerParameters.saneness(), this.f34863adultoid);
            this.f34863adultoid.attabal().execute(formularizeVar);
            adultoid<Void> adultoidVarAttabal = formularizeVar.attabal();
            adultoidVarAttabal.taiyuan(new attabal(adultoidVarAttabal, attabalVarGraveside), this.f34863adultoid.attabal());
            attabalVarGraveside.taiyuan(new saneness(attabalVarGraveside, this.f34874oilcan), this.f34863adultoid.getBackgroundExecutor());
        } catch (Throwable th) {
            this.f34876preprohormone.competently();
            throw th;
        }
    }

    public final String attabal(List<String> list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f34864arytenoidectomy);
        sb.append(", tags={ ");
        boolean z = true;
        for (String str : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    public void beachfront() {
        if (!triweekly()) {
            this.f34876preprohormone.dern();
            try {
                WorkInfo.State stateBeachfront = this.f34865cord.beachfront(this.f34864arytenoidectomy);
                this.f34876preprohormone.cuirassed().attabal(this.f34864arytenoidectomy);
                if (stateBeachfront == null) {
                    taiyuan(false);
                } else if (stateBeachfront == WorkInfo.State.RUNNING) {
                    dern(this.f34867dovishness);
                } else if (!stateBeachfront.isFinished()) {
                    competently();
                }
                this.f34876preprohormone.polloi();
                this.f34876preprohormone.competently();
            } catch (Throwable th) {
                this.f34876preprohormone.competently();
                throw th;
            }
        }
        List<marial> list = this.f34873monoploid;
        if (list != null) {
            Iterator<marial> it = list.iterator();
            while (it.hasNext()) {
                it.next().attabal(this.f34864arytenoidectomy);
            }
            beachfront.saneness(this.f34868gintrap, this.f34876preprohormone, this.f34873monoploid);
        }
    }

    public final void competently() {
        this.f34876preprohormone.dern();
        try {
            this.f34865cord.saneness(WorkInfo.State.ENQUEUED, this.f34864arytenoidectomy);
            this.f34865cord.adultoid(this.f34864arytenoidectomy, System.currentTimeMillis());
            this.f34865cord.formularize(this.f34864arytenoidectomy, -1L);
            this.f34876preprohormone.polloi();
        } finally {
            this.f34876preprohormone.competently();
            taiyuan(true);
        }
    }

    public final void cutely() {
        WorkInfo.State stateBeachfront = this.f34865cord.beachfront(this.f34864arytenoidectomy);
        if (stateBeachfront == WorkInfo.State.RUNNING) {
            apical.dern().attabal(f34862supplicat, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f34864arytenoidectomy), new Throwable[0]);
            taiyuan(true);
        } else {
            apical.dern().attabal(f34862supplicat, String.format("Status for %s is %s; not doing any work", this.f34864arytenoidectomy, stateBeachfront), new Throwable[0]);
            taiyuan(false);
        }
    }

    public final void dern(ListenableWorker.attabal attabalVar) {
        if (attabalVar instanceof ListenableWorker.attabal.dern) {
            apical.dern().wireman(f34862supplicat, String.format("Worker result SUCCESS for %s", this.f34874oilcan), new Throwable[0]);
            if (this.f34872molybdenite.wireman()) {
                impromptu();
                return;
            } else {
                impassible();
                return;
            }
        }
        if (attabalVar instanceof ListenableWorker.attabal.saneness) {
            apical.dern().wireman(f34862supplicat, String.format("Worker result RETRY for %s", this.f34874oilcan), new Throwable[0]);
            competently();
            return;
        }
        apical.dern().wireman(f34862supplicat, String.format("Worker result FAILURE for %s", this.f34874oilcan), new Throwable[0]);
        if (this.f34872molybdenite.wireman()) {
            impromptu();
        } else {
            formularize();
        }
    }

    public void formularize() {
        this.f34876preprohormone.dern();
        try {
            marial(this.f34864arytenoidectomy);
            this.f34865cord.kowloon(this.f34864arytenoidectomy, ((ListenableWorker.attabal.C0108attabal) this.f34867dovishness).marial());
            this.f34876preprohormone.polloi();
        } finally {
            this.f34876preprohormone.competently();
            taiyuan(false);
        }
    }

    public final void impassible() {
        this.f34876preprohormone.dern();
        try {
            this.f34865cord.saneness(WorkInfo.State.SUCCEEDED, this.f34864arytenoidectomy);
            this.f34865cord.kowloon(this.f34864arytenoidectomy, ((ListenableWorker.attabal.dern) this.f34867dovishness).marial());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str : this.f34866cuirassed.attabal(this.f34864arytenoidectomy)) {
                if (this.f34865cord.beachfront(str) == WorkInfo.State.BLOCKED && this.f34866cuirassed.saneness(str)) {
                    apical.dern().wireman(f34862supplicat, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.f34865cord.saneness(WorkInfo.State.ENQUEUED, str);
                    this.f34865cord.adultoid(str, jCurrentTimeMillis);
                }
            }
            this.f34876preprohormone.polloi();
        } finally {
            this.f34876preprohormone.competently();
            taiyuan(false);
        }
    }

    public final void impromptu() {
        this.f34876preprohormone.dern();
        try {
            this.f34865cord.adultoid(this.f34864arytenoidectomy, System.currentTimeMillis());
            this.f34865cord.saneness(WorkInfo.State.ENQUEUED, this.f34864arytenoidectomy);
            this.f34865cord.molybdenite(this.f34864arytenoidectomy);
            this.f34865cord.formularize(this.f34864arytenoidectomy, -1L);
            this.f34876preprohormone.polloi();
        } finally {
            this.f34876preprohormone.competently();
            taiyuan(false);
        }
    }

    public final boolean kowloon() {
        boolean z;
        this.f34876preprohormone.dern();
        try {
            if (this.f34865cord.beachfront(this.f34864arytenoidectomy) == WorkInfo.State.ENQUEUED) {
                this.f34865cord.saneness(WorkInfo.State.RUNNING, this.f34864arytenoidectomy);
                this.f34865cord.graveside(this.f34864arytenoidectomy);
                z = true;
            } else {
                z = false;
            }
            this.f34876preprohormone.polloi();
            return z;
        } finally {
            this.f34876preprohormone.competently();
        }
    }

    public final void marial(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f34865cord.beachfront(str2) != WorkInfo.State.CANCELLED) {
                this.f34865cord.saneness(WorkInfo.State.FAILED, str2);
            }
            linkedList.addAll(this.f34866cuirassed.attabal(str2));
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        List<String> listSaneness = this.f34879stratoscope.saneness(this.f34864arytenoidectomy);
        this.f34880trm = listSaneness;
        this.f34874oilcan = attabal(listSaneness);
        apical();
    }

    public adultoid<Boolean> saneness() {
        return this.f34881yemenite;
    }

    public final void taiyuan(boolean z) {
        ListenableWorker listenableWorker;
        this.f34876preprohormone.dern();
        try {
            if (!this.f34876preprohormone.stratoscope().polloi()) {
                talweg.wireman.attabal(this.f34871kowloon, RescheduleReceiver.class, false);
            }
            if (z) {
                this.f34865cord.saneness(WorkInfo.State.ENQUEUED, this.f34864arytenoidectomy);
                this.f34865cord.formularize(this.f34864arytenoidectomy, -1L);
            }
            if (this.f34872molybdenite != null && (listenableWorker = this.f34869graveside) != null && listenableWorker.isRunInForeground()) {
                this.f34877rotuma.attabal(this.f34864arytenoidectomy);
            }
            this.f34876preprohormone.polloi();
            this.f34876preprohormone.competently();
            this.f34881yemenite.arytenoidectomy(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.f34876preprohormone.competently();
            throw th;
        }
    }

    public final boolean triweekly() {
        if (!this.f34870kattegat) {
            return false;
        }
        apical.dern().attabal(f34862supplicat, String.format("Work interrupted for %s", this.f34874oilcan), new Throwable[0]);
        WorkInfo.State stateBeachfront = this.f34865cord.beachfront(this.f34864arytenoidectomy);
        if (stateBeachfront == null) {
            taiyuan(false);
        } else {
            taiyuan(!stateBeachfront.isFinished());
        }
        return true;
    }

    public void wireman() {
        boolean zIsDone;
        this.f34870kattegat = true;
        triweekly();
        adultoid<ListenableWorker.attabal> adultoidVar = this.f34878sealless;
        if (adultoidVar != null) {
            zIsDone = adultoidVar.isDone();
            this.f34878sealless.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = this.f34869graveside;
        if (listenableWorker != null && !zIsDone) {
            listenableWorker.stop();
        } else {
            apical.dern().attabal(f34862supplicat, String.format("WorkSpec %s is already done. Not interrupting.", this.f34872molybdenite), new Throwable[0]);
        }
    }
}
