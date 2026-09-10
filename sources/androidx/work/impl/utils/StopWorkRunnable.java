package androidx.work.impl.utils;

import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.impl.Processor;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpecDao;

/* JADX INFO: loaded from: classes.dex */
public class StopWorkRunnable implements Runnable {
    public static final String e0 = Logger.e("StopWorkRunnable");
    public final WorkManagerImpl X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f8813Y;
    public final boolean Z;

    public StopWorkRunnable(WorkManagerImpl workManagerImpl, String str, boolean z2) {
        this.X = workManagerImpl;
        this.f8813Y = str;
        this.Z = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zContainsKey;
        boolean zJ;
        WorkManagerImpl workManagerImpl = this.X;
        WorkDatabase workDatabase = workManagerImpl.f8686c;
        Processor processor = workManagerImpl.f;
        WorkSpecDao workSpecDaoS = workDatabase.s();
        workDatabase.c();
        try {
            String str = this.f8813Y;
            synchronized (processor.l0) {
                zContainsKey = processor.g0.containsKey(str);
            }
            if (this.Z) {
                zJ = this.X.f.i(this.f8813Y);
            } else {
                if (!zContainsKey && workSpecDaoS.h(this.f8813Y) == WorkInfo.State.f8642Y) {
                    workSpecDaoS.b(WorkInfo.State.X, this.f8813Y);
                }
                zJ = this.X.f.j(this.f8813Y);
            }
            Logger.c().a(e0, "StopWorkRunnable for " + this.f8813Y + "; Processor.stopWork = " + zJ, new Throwable[0]);
            workDatabase.l();
            workDatabase.f();
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
