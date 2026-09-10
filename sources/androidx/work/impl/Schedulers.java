package androidx.work.impl;

import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Schedulers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f8664a = Logger.e("Schedulers");

    public static void a(Configuration configuration, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        WorkSpecDao workSpecDaoS = workDatabase.s();
        workDatabase.c();
        try {
            ArrayList arrayListO = workSpecDaoS.o(configuration.f8603h);
            ArrayList arrayListM = workSpecDaoS.m();
            if (arrayListO.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = arrayListO.iterator();
                while (it.hasNext()) {
                    workSpecDaoS.c(jCurrentTimeMillis, ((WorkSpec) it.next()).f8776a);
                }
            }
            workDatabase.l();
            workDatabase.f();
            if (arrayListO.size() > 0) {
                WorkSpec[] workSpecArr = (WorkSpec[]) arrayListO.toArray(new WorkSpec[arrayListO.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Scheduler scheduler = (Scheduler) it2.next();
                    if (scheduler.d()) {
                        scheduler.c(workSpecArr);
                    }
                }
            }
            if (arrayListM.size() > 0) {
                WorkSpec[] workSpecArr2 = (WorkSpec[]) arrayListM.toArray(new WorkSpec[arrayListM.size()]);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    Scheduler scheduler2 = (Scheduler) it3.next();
                    if (!scheduler2.d()) {
                        scheduler2.c(workSpecArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
