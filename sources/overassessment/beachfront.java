package overassessment;

import android.content.Context;
import androidx.work.apical;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import java.util.List;
import ocellation.arytenoidectomy;
import ocellation.monoploid;

/* JADX INFO: compiled from: Schedulers.java */
/* JADX INFO: loaded from: classes.dex */
public class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final String f34851attabal = apical.beachfront("Schedulers");

    public static marial attabal(Context context, taiyuan taiyuanVar) {
        transitional.competently competentlyVar = new transitional.competently(context, taiyuanVar);
        talweg.wireman.attabal(context, SystemJobService.class, true);
        apical.dern().attabal(f34851attabal, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        return competentlyVar;
    }

    public static void saneness(androidx.work.attabal attabalVar, WorkDatabase workDatabase, List<marial> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        monoploid monoploidVarStratoscope = workDatabase.stratoscope();
        workDatabase.dern();
        try {
            List<arytenoidectomy> listTriweekly = monoploidVarStratoscope.triweekly(attabalVar.impromptu());
            List<arytenoidectomy> listCutely = monoploidVarStratoscope.cutely(200);
            if (listTriweekly != null && listTriweekly.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator<arytenoidectomy> it = listTriweekly.iterator();
                while (it.hasNext()) {
                    monoploidVarStratoscope.formularize(it.next().f33999attabal, jCurrentTimeMillis);
                }
            }
            workDatabase.polloi();
            workDatabase.competently();
            if (listTriweekly != null && listTriweekly.size() > 0) {
                arytenoidectomy[] arytenoidectomyVarArr = (arytenoidectomy[]) listTriweekly.toArray(new arytenoidectomy[listTriweekly.size()]);
                for (marial marialVar : list) {
                    if (marialVar.dern()) {
                        marialVar.beachfront(arytenoidectomyVarArr);
                    }
                }
            }
            if (listCutely == null || listCutely.size() <= 0) {
                return;
            }
            arytenoidectomy[] arytenoidectomyVarArr2 = (arytenoidectomy[]) listCutely.toArray(new arytenoidectomy[listCutely.size()]);
            for (marial marialVar2 : list) {
                if (!marialVar2.dern()) {
                    marialVar2.beachfront(arytenoidectomyVarArr2);
                }
            }
        } catch (Throwable th) {
            workDatabase.competently();
            throw th;
        }
    }
}
