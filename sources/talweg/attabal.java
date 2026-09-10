package talweg;

import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;
import ocellation.monoploid;

/* JADX INFO: compiled from: CancelWorkRunnable.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class attabal implements Runnable {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final overassessment.dern f38598kowloon = new overassessment.dern();

    /* JADX INFO: renamed from: talweg.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CancelWorkRunnable.java */
    public class C0806attabal extends attabal {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ overassessment.taiyuan f38599arytenoidectomy;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final /* synthetic */ UUID f38600monoploid;

        public C0806attabal(overassessment.taiyuan taiyuanVar, UUID uuid) {
            this.f38599arytenoidectomy = taiyuanVar;
            this.f38600monoploid = uuid;
        }

        @Override // talweg.attabal
        public void impromptu() {
            WorkDatabase workDatabaseKowloon = this.f38599arytenoidectomy.kowloon();
            workDatabaseKowloon.dern();
            try {
                attabal(this.f38599arytenoidectomy, this.f38600monoploid.toString());
                workDatabaseKowloon.polloi();
                workDatabaseKowloon.competently();
                competently(this.f38599arytenoidectomy);
            } catch (Throwable th) {
                workDatabaseKowloon.competently();
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: CancelWorkRunnable.java */
    public class dern extends attabal {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ overassessment.taiyuan f38601arytenoidectomy;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final /* synthetic */ String f38602monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public final /* synthetic */ boolean f38603polloi;

        public dern(overassessment.taiyuan taiyuanVar, String str, boolean z) {
            this.f38601arytenoidectomy = taiyuanVar;
            this.f38602monoploid = str;
            this.f38603polloi = z;
        }

        @Override // talweg.attabal
        public void impromptu() {
            WorkDatabase workDatabaseKowloon = this.f38601arytenoidectomy.kowloon();
            workDatabaseKowloon.dern();
            try {
                Iterator<String> it = workDatabaseKowloon.stratoscope().marial(this.f38602monoploid).iterator();
                while (it.hasNext()) {
                    attabal(this.f38601arytenoidectomy, it.next());
                }
                workDatabaseKowloon.polloi();
                workDatabaseKowloon.competently();
                if (this.f38603polloi) {
                    competently(this.f38601arytenoidectomy);
                }
            } catch (Throwable th) {
                workDatabaseKowloon.competently();
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: CancelWorkRunnable.java */
    public class saneness extends attabal {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ overassessment.taiyuan f38604arytenoidectomy;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final /* synthetic */ String f38605monoploid;

        public saneness(overassessment.taiyuan taiyuanVar, String str) {
            this.f38604arytenoidectomy = taiyuanVar;
            this.f38605monoploid = str;
        }

        @Override // talweg.attabal
        public void impromptu() {
            WorkDatabase workDatabaseKowloon = this.f38604arytenoidectomy.kowloon();
            workDatabaseKowloon.dern();
            try {
                Iterator<String> it = workDatabaseKowloon.stratoscope().impromptu(this.f38605monoploid).iterator();
                while (it.hasNext()) {
                    attabal(this.f38604arytenoidectomy, it.next());
                }
                workDatabaseKowloon.polloi();
                workDatabaseKowloon.competently();
                competently(this.f38604arytenoidectomy);
            } catch (Throwable th) {
                workDatabaseKowloon.competently();
                throw th;
            }
        }
    }

    public static attabal dern(String str, overassessment.taiyuan taiyuanVar, boolean z) {
        return new dern(taiyuanVar, str, z);
    }

    public static attabal saneness(UUID uuid, overassessment.taiyuan taiyuanVar) {
        return new C0806attabal(taiyuanVar, uuid);
    }

    public static attabal wireman(String str, overassessment.taiyuan taiyuanVar) {
        return new saneness(taiyuanVar, str);
    }

    public void attabal(overassessment.taiyuan taiyuanVar, String str) {
        beachfront(taiyuanVar.kowloon(), str);
        taiyuanVar.impassible().formularize(str);
        Iterator<overassessment.marial> it = taiyuanVar.triweekly().iterator();
        while (it.hasNext()) {
            it.next().attabal(str);
        }
    }

    public final void beachfront(WorkDatabase workDatabase, String str) {
        monoploid monoploidVarStratoscope = workDatabase.stratoscope();
        ocellation.saneness sanenessVarGraveside = workDatabase.graveside();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            WorkInfo.State stateBeachfront = monoploidVarStratoscope.beachfront(str2);
            if (stateBeachfront != WorkInfo.State.SUCCEEDED && stateBeachfront != WorkInfo.State.FAILED) {
                monoploidVarStratoscope.saneness(WorkInfo.State.CANCELLED, str2);
            }
            linkedList.addAll(sanenessVarGraveside.attabal(str2));
        }
    }

    public void competently(overassessment.taiyuan taiyuanVar) {
        overassessment.beachfront.saneness(taiyuanVar.taiyuan(), taiyuanVar.kowloon(), taiyuanVar.triweekly());
    }

    public abstract void impromptu();

    public androidx.work.impassible marial() {
        return this.f38598kowloon;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            impromptu();
            this.f38598kowloon.attabal(androidx.work.impassible.f14050attabal);
        } catch (Throwable th) {
            this.f38598kowloon.attabal(new androidx.work.impassible.saneness.attabal(th));
        }
    }
}
