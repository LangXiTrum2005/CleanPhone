package talweg;

import android.os.Build;
import android.text.TextUtils;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.molybdenite;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ocellation.arytenoidectomy;
import ocellation.monoploid;

/* JADX INFO: compiled from: EnqueueRunnable.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness implements Runnable {

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final String f38649monoploid = androidx.work.apical.beachfront("EnqueueRunnable");

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final overassessment.dern f38650arytenoidectomy = new overassessment.dern();

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final overassessment.competently f38651kowloon;

    public saneness(overassessment.competently competentlyVar) {
        this.f38651kowloon = competentlyVar;
    }

    public static void competently(arytenoidectomy arytenoidectomyVar) {
        androidx.work.saneness sanenessVar = arytenoidectomyVar.f34002cutely;
        String str = arytenoidectomyVar.f34003dern;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (sanenessVar.beachfront() || sanenessVar.taiyuan()) {
            androidx.work.wireman.attabal attabalVar = new androidx.work.wireman.attabal();
            attabalVar.dern(arytenoidectomyVar.f34008marial).competently("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            arytenoidectomyVar.f34003dern = ConstraintTrackingWorker.class.getName();
            arytenoidectomyVar.f34008marial = attabalVar.attabal();
        }
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0135 A[PHI: r0 r8 r11 r12 r13
  0x0135: PHI (r0v1 java.lang.String[]) = 
  (r0v0 java.lang.String[])
  (r0v0 java.lang.String[])
  (r0v0 java.lang.String[])
  (r0v13 java.lang.String[])
  (r0v13 java.lang.String[])
 binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:81:0x0134, B:80:0x0132] A[DONT_GENERATE, DONT_INLINE]
  0x0135: PHI (r8v2 boolean) = (r8v1 boolean), (r8v1 boolean), (r8v1 boolean), (r8v5 boolean), (r8v6 boolean) binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:81:0x0134, B:80:0x0132] A[DONT_GENERATE, DONT_INLINE]
  0x0135: PHI (r11v2 boolean) = (r11v1 boolean), (r11v1 boolean), (r11v1 boolean), (r11v4 boolean), (r11v4 boolean) binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:81:0x0134, B:80:0x0132] A[DONT_GENERATE, DONT_INLINE]
  0x0135: PHI (r12v2 boolean) = (r12v1 boolean), (r12v1 boolean), (r12v1 boolean), (r12v5 boolean), (r12v5 boolean) binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:81:0x0134, B:80:0x0132] A[DONT_GENERATE, DONT_INLINE]
  0x0135: PHI (r13v2 boolean) = (r13v1 boolean), (r13v1 boolean), (r13v1 boolean), (r13v5 boolean), (r13v5 boolean) binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:81:0x0134, B:80:0x0132] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean dern(overassessment.taiyuan taiyuanVar, List<? extends molybdenite> list, String[] strArr, String str, ExistingWorkPolicy existingWorkPolicy) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String[] strArr2 = strArr;
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabaseKowloon = taiyuanVar.kowloon();
        boolean z5 = strArr2 != null && strArr2.length > 0;
        if (z5) {
            z = false;
            z2 = false;
            z3 = true;
            for (String str2 : strArr2) {
                arytenoidectomy arytenoidectomyVarCompetently = workDatabaseKowloon.stratoscope().competently(str2);
                if (arytenoidectomyVarCompetently == null) {
                    androidx.work.apical.dern().saneness(f38649monoploid, String.format("Prerequisite %s doesn't exist; not enqueuing", str2), new Throwable[0]);
                    return false;
                }
                WorkInfo.State state = arytenoidectomyVarCompetently.f34011saneness;
                z3 &= state == WorkInfo.State.SUCCEEDED;
                if (state == WorkInfo.State.FAILED) {
                    z2 = true;
                } else if (state == WorkInfo.State.CANCELLED) {
                    z = true;
                }
            }
        } else {
            z = false;
            z2 = false;
            z3 = true;
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (zIsEmpty || z5) {
            z4 = false;
        } else {
            List<arytenoidectomy.saneness> listImpassible = workDatabaseKowloon.stratoscope().impassible(str);
            if (listImpassible.isEmpty()) {
                z4 = false;
            } else if (existingWorkPolicy == ExistingWorkPolicy.APPEND || existingWorkPolicy == ExistingWorkPolicy.APPEND_OR_REPLACE) {
                ocellation.saneness sanenessVarGraveside = workDatabaseKowloon.graveside();
                List arrayList = new ArrayList();
                for (arytenoidectomy.saneness sanenessVar : listImpassible) {
                    if (!sanenessVarGraveside.wireman(sanenessVar.f34021attabal)) {
                        WorkInfo.State state2 = sanenessVar.f34022saneness;
                        boolean z6 = (state2 == WorkInfo.State.SUCCEEDED) & z3;
                        if (state2 == WorkInfo.State.FAILED) {
                            z2 = true;
                        } else if (state2 == WorkInfo.State.CANCELLED) {
                            z = true;
                        }
                        arrayList.add(sanenessVar.f34021attabal);
                        z3 = z6;
                    }
                }
                if (existingWorkPolicy == ExistingWorkPolicy.APPEND_OR_REPLACE && (z || z2)) {
                    monoploid monoploidVarStratoscope = workDatabaseKowloon.stratoscope();
                    Iterator<arytenoidectomy.saneness> it = monoploidVarStratoscope.impassible(str).iterator();
                    while (it.hasNext()) {
                        monoploidVarStratoscope.attabal(it.next().f34021attabal);
                    }
                    arrayList = Collections.EMPTY_LIST;
                    z = false;
                    z2 = false;
                }
                strArr2 = (String[]) arrayList.toArray(strArr2);
                z5 = strArr2.length > 0;
                z4 = false;
            } else {
                if (existingWorkPolicy == ExistingWorkPolicy.KEEP) {
                    Iterator<arytenoidectomy.saneness> it2 = listImpassible.iterator();
                    while (it2.hasNext()) {
                        WorkInfo.State state3 = it2.next().f34022saneness;
                        if (state3 == WorkInfo.State.ENQUEUED || state3 == WorkInfo.State.RUNNING) {
                            return false;
                        }
                    }
                }
                attabal.dern(str, taiyuanVar, false).run();
                monoploid monoploidVarStratoscope2 = workDatabaseKowloon.stratoscope();
                Iterator<arytenoidectomy.saneness> it3 = listImpassible.iterator();
                while (it3.hasNext()) {
                    monoploidVarStratoscope2.attabal(it3.next().f34021attabal);
                }
                z4 = true;
            }
        }
        Iterator<? extends molybdenite> it4 = list.iterator();
        while (it4.hasNext()) {
            molybdenite next = it4.next();
            arytenoidectomy arytenoidectomyVarDern = next.dern();
            if (!z5 || z3) {
                if (arytenoidectomyVarDern.wireman()) {
                    arytenoidectomyVarDern.f34013triweekly = 0L;
                } else {
                    arytenoidectomyVarDern.f34013triweekly = jCurrentTimeMillis;
                }
            } else if (z2) {
                arytenoidectomyVarDern.f34011saneness = WorkInfo.State.FAILED;
            } else if (z) {
                arytenoidectomyVarDern.f34011saneness = WorkInfo.State.CANCELLED;
            } else {
                arytenoidectomyVarDern.f34011saneness = WorkInfo.State.BLOCKED;
            }
            if (Build.VERSION.SDK_INT <= 25) {
                competently(arytenoidectomyVarDern);
            }
            if (arytenoidectomyVarDern.f34011saneness == WorkInfo.State.ENQUEUED) {
                z4 = true;
            }
            workDatabaseKowloon.stratoscope().monoploid(arytenoidectomyVarDern);
            if (z5) {
                int length = strArr2.length;
                int i = 0;
                while (i < length) {
                    workDatabaseKowloon.graveside().dern(new ocellation.attabal(next.attabal(), strArr2[i]));
                    i++;
                    strArr2 = strArr2;
                    it4 = it4;
                }
            }
            String[] strArr3 = strArr2;
            Iterator<? extends molybdenite> it5 = it4;
            Iterator<String> it6 = next.saneness().iterator();
            while (it6.hasNext()) {
                workDatabaseKowloon.trm().attabal(new ocellation.molybdenite(it6.next(), next.attabal()));
            }
            if (!zIsEmpty) {
                workDatabaseKowloon.cord().saneness(new ocellation.cutely(str, next.attabal()));
            }
            strArr2 = strArr3;
            it4 = it5;
        }
        return z4;
    }

    public static boolean marial(overassessment.competently competentlyVar) {
        List<overassessment.competently> listMarial = competentlyVar.marial();
        boolean z = false;
        if (listMarial != null) {
            boolean zMarial = false;
            for (overassessment.competently competentlyVar2 : listMarial) {
                if (competentlyVar2.cutely()) {
                    androidx.work.apical.dern().impromptu(f38649monoploid, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", competentlyVar2.dern())), new Throwable[0]);
                } else {
                    zMarial |= marial(competentlyVar2);
                }
            }
            z = zMarial;
        }
        return saneness(competentlyVar) | z;
    }

    public static boolean saneness(overassessment.competently competentlyVar) {
        boolean zDern = dern(competentlyVar.competently(), competentlyVar.beachfront(), (String[]) overassessment.competently.formularize(competentlyVar).toArray(new String[0]), competentlyVar.wireman(), competentlyVar.saneness());
        competentlyVar.apical();
        return zDern;
    }

    public boolean attabal() {
        WorkDatabase workDatabaseKowloon = this.f38651kowloon.competently().kowloon();
        workDatabaseKowloon.dern();
        try {
            boolean zMarial = marial(this.f38651kowloon);
            workDatabaseKowloon.polloi();
            return zMarial;
        } finally {
            workDatabaseKowloon.competently();
        }
    }

    public void beachfront() {
        overassessment.taiyuan taiyuanVarCompetently = this.f38651kowloon.competently();
        overassessment.beachfront.saneness(taiyuanVarCompetently.taiyuan(), taiyuanVarCompetently.kowloon(), taiyuanVarCompetently.triweekly());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f38651kowloon.impromptu()) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f38651kowloon));
            }
            if (attabal()) {
                wireman.attabal(this.f38651kowloon.competently().impromptu(), RescheduleReceiver.class, true);
                beachfront();
            }
            this.f38650arytenoidectomy.attabal(androidx.work.impassible.f14050attabal);
        } catch (Throwable th) {
            this.f38650arytenoidectomy.attabal(new androidx.work.impassible.saneness.attabal(th));
        }
    }

    public androidx.work.impassible wireman() {
        return this.f38650arytenoidectomy;
    }
}
