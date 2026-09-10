package androidx.work.impl.utils;

import android.os.Build;
import android.support.v4.media.a;
import android.text.TextUtils;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.Operation;
import androidx.work.WorkInfo;
import androidx.work.WorkRequest;
import androidx.work.impl.OperationImpl;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.model.Dependency;
import androidx.work.impl.model.WorkName;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTag;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class EnqueueRunnable implements Runnable {
    public static final String Z = Logger.e("EnqueueRunnable");
    public final WorkContinuationImpl X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final OperationImpl f8803Y = new OperationImpl();

    public EnqueueRunnable(WorkContinuationImpl workContinuationImpl) {
        this.X = workContinuationImpl;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:61:0x0103  */
    /* JADX WARN: Code duplicated, block: B:63:0x0109  */
    /* JADX WARN: Code duplicated, block: B:64:0x010c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0119  */
    /* JADX WARN: Code duplicated, block: B:69:0x012b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0155  */
    /* JADX WARN: Code duplicated, block: B:77:0x015b  */
    /* JADX WARN: Code duplicated, block: B:78:0x015d  */
    /* JADX WARN: Code duplicated, block: B:81:0x016a  */
    /* JADX WARN: Code duplicated, block: B:83:0x016e A[LOOP:4: B:82:0x016c->B:83:0x016e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x019b A[LOOP:5: B:85:0x0195->B:87:0x019b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x01b4  */
    public static boolean a(WorkContinuationImpl workContinuationImpl) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        WorkSpec workSpec;
        boolean z7;
        boolean z8;
        UUID uuid;
        Iterator it;
        int length;
        int i2;
        String str;
        boolean z9;
        boolean z10 = false;
        String[] strArr = (String[]) WorkContinuationImpl.a(workContinuationImpl).toArray(new String[0]);
        long jCurrentTimeMillis = System.currentTimeMillis();
        final WorkManagerImpl workManagerImpl = workContinuationImpl.f8665a;
        WorkDatabase workDatabase = workManagerImpl.f8686c;
        boolean z11 = strArr != null && strArr.length > 0;
        WorkInfo.State state = WorkInfo.State.Z;
        WorkInfo.State state2 = WorkInfo.State.g0;
        WorkInfo.State state3 = WorkInfo.State.e0;
        if (z11) {
            int length2 = strArr.length;
            int i3 = 0;
            z2 = false;
            z3 = false;
            z4 = true;
            while (true) {
                if (i3 < length2) {
                    String str2 = strArr[i3];
                    WorkSpec workSpecI = workDatabase.s().i(str2);
                    if (workSpecI == null) {
                        Logger.c().b(Z, a.n("Prerequisite ", str2, " doesn't exist; not enqueuing"), new Throwable[0]);
                        z6 = false;
                    } else {
                        WorkInfo.State state4 = workSpecI.f8777b;
                        z4 &= state4 == state;
                        if (state4 == state3) {
                            z3 = true;
                        } else if (state4 == state2) {
                            z2 = true;
                        }
                        i3++;
                        z10 = false;
                    }
                }
                z9 = true;
                workContinuationImpl.f8668e = z9;
                return z6;
            }
        }
        z2 = false;
        z3 = false;
        z4 = true;
        boolean zIsEmpty = TextUtils.isEmpty(null);
        WorkInfo.State state5 = WorkInfo.State.X;
        if (zIsEmpty || z11) {
            z5 = zIsEmpty;
            z6 = false;
            for (WorkRequest workRequest : workContinuationImpl.f8666b) {
                workSpec = workRequest.f8645b;
                if (z11 || z4) {
                    if (workSpec.c()) {
                        workSpec.f8783n = 0L;
                    } else {
                        workSpec.f8783n = jCurrentTimeMillis;
                    }
                    if (Build.VERSION.SDK_INT <= 25) {
                        Constraints constraints = workSpec.j;
                        str = workSpec.f8778c;
                        z7 = z6;
                        if (!str.equals(ConstraintTrackingWorker.class.getName()) && (constraints.d || constraints.f8609e)) {
                            Data.Builder builder = new Data.Builder();
                            builder.b(workSpec.f8779e.f8620a);
                            builder.f8621a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
                            workSpec.f8778c = ConstraintTrackingWorker.class.getName();
                            workSpec.f8779e = builder.a();
                        }
                    } else {
                        z7 = z6;
                    }
                    if (workSpec.f8777b == state5) {
                        z8 = true;
                    } else {
                        z8 = z7;
                    }
                    workDatabase.s().e(workSpec);
                    uuid = workRequest.f8644a;
                    if (z11) {
                        length = strArr.length;
                        i2 = 0;
                        while (i2 < length) {
                            workDatabase.n().a(new Dependency(uuid.toString(), strArr[i2]));
                            i2++;
                            z8 = z8;
                            strArr = strArr;
                        }
                    }
                    String[] strArr2 = strArr;
                    boolean z12 = z8;
                    it = workRequest.f8646c.iterator();
                    while (it.hasNext()) {
                        workDatabase.t().b(new WorkTag((String) it.next(), uuid.toString()));
                    }
                    if (!z5) {
                        workDatabase.q().a(new WorkName(uuid.toString()));
                    }
                    jCurrentTimeMillis = jCurrentTimeMillis;
                    z6 = z12;
                    strArr = strArr2;
                } else if (z3) {
                    workSpec.f8777b = state3;
                } else if (z2) {
                    workSpec.f8777b = state2;
                } else {
                    workSpec.f8777b = WorkInfo.State.f0;
                }
                if (Build.VERSION.SDK_INT <= 25) {
                    Constraints constraints2 = workSpec.j;
                    str = workSpec.f8778c;
                    z7 = z6;
                    if (!str.equals(ConstraintTrackingWorker.class.getName())) {
                        Data.Builder builder2 = new Data.Builder();
                        builder2.b(workSpec.f8779e.f8620a);
                        builder2.f8621a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
                        workSpec.f8778c = ConstraintTrackingWorker.class.getName();
                        workSpec.f8779e = builder2.a();
                    }
                } else {
                    z7 = z6;
                }
                if (workSpec.f8777b == state5) {
                    z8 = true;
                } else {
                    z8 = z7;
                }
                workDatabase.s().e(workSpec);
                uuid = workRequest.f8644a;
                if (z11) {
                    length = strArr.length;
                    i2 = 0;
                    while (i2 < length) {
                        workDatabase.n().a(new Dependency(uuid.toString(), strArr[i2]));
                        i2++;
                        z8 = z8;
                        strArr = strArr;
                    }
                }
                String[] strArr3 = strArr;
                boolean z13 = z8;
                it = workRequest.f8646c.iterator();
                while (it.hasNext()) {
                    workDatabase.t().b(new WorkTag((String) it.next(), uuid.toString()));
                }
                if (!z5) {
                    workDatabase.q().a(new WorkName(uuid.toString()));
                }
                jCurrentTimeMillis = jCurrentTimeMillis;
                z6 = z13;
                strArr = strArr3;
            }
            z9 = true;
        } else {
            ArrayList arrayListP = workDatabase.s().p();
            if (arrayListP.isEmpty()) {
                z5 = zIsEmpty;
                z6 = false;
            } else {
                Iterator it2 = arrayListP.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        WorkInfo.State state6 = ((WorkSpec.IdAndState) it2.next()).f8786b;
                        if (state6 != state5) {
                            boolean z14 = zIsEmpty;
                            if (state6 != WorkInfo.State.f8642Y) {
                                zIsEmpty = z14;
                            }
                        }
                        z9 = true;
                        z6 = false;
                    } else {
                        z5 = zIsEmpty;
                        new CancelWorkRunnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable.3
                            public AnonymousClass3() {
                            }

                            @Override // androidx.work.impl.utils.CancelWorkRunnable
                            public final void d() {
                                WorkManagerImpl workManagerImpl2 = workManagerImpl;
                                WorkDatabase workDatabase2 = workManagerImpl2.f8686c;
                                workDatabase2.c();
                                try {
                                    Iterator it3 = workDatabase2.s().l().iterator();
                                    while (it3.hasNext()) {
                                        CancelWorkRunnable.a(workManagerImpl2, (String) it3.next());
                                    }
                                    workDatabase2.l();
                                } finally {
                                    workDatabase2.f();
                                }
                            }
                        }.run();
                        WorkSpecDao workSpecDaoS = workDatabase.s();
                        Iterator it3 = arrayListP.iterator();
                        while (it3.hasNext()) {
                            workSpecDaoS.a(((WorkSpec.IdAndState) it3.next()).f8785a);
                        }
                        z6 = true;
                    }
                }
            }
            while (r5.hasNext()) {
                workSpec = workRequest.f8645b;
                if (z11) {
                    if (workSpec.c()) {
                        workSpec.f8783n = jCurrentTimeMillis;
                    } else {
                        workSpec.f8783n = 0L;
                    }
                } else if (workSpec.c()) {
                    workSpec.f8783n = jCurrentTimeMillis;
                } else {
                    workSpec.f8783n = 0L;
                }
                if (Build.VERSION.SDK_INT <= 25) {
                    Constraints constraints3 = workSpec.j;
                    str = workSpec.f8778c;
                    z7 = z6;
                    if (!str.equals(ConstraintTrackingWorker.class.getName())) {
                        Data.Builder builder3 = new Data.Builder();
                        builder3.b(workSpec.f8779e.f8620a);
                        builder3.f8621a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
                        workSpec.f8778c = ConstraintTrackingWorker.class.getName();
                        workSpec.f8779e = builder3.a();
                    }
                } else {
                    z7 = z6;
                }
                if (workSpec.f8777b == state5) {
                    z8 = true;
                } else {
                    z8 = z7;
                }
                workDatabase.s().e(workSpec);
                uuid = workRequest.f8644a;
                if (z11) {
                    length = strArr.length;
                    i2 = 0;
                    while (i2 < length) {
                        workDatabase.n().a(new Dependency(uuid.toString(), strArr[i2]));
                        i2++;
                        z8 = z8;
                        strArr = strArr;
                    }
                }
                String[] strArr4 = strArr;
                boolean z15 = z8;
                it = workRequest.f8646c.iterator();
                while (it.hasNext()) {
                    workDatabase.t().b(new WorkTag((String) it.next(), uuid.toString()));
                }
                if (!z5) {
                    workDatabase.q().a(new WorkName(uuid.toString()));
                }
                jCurrentTimeMillis = jCurrentTimeMillis;
                z6 = z15;
                strArr = strArr4;
            }
            z9 = true;
        }
        workContinuationImpl.f8668e = z9;
        return z6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        OperationImpl operationImpl = this.f8803Y;
        WorkContinuationImpl workContinuationImpl = this.X;
        WorkManagerImpl workManagerImpl = workContinuationImpl.f8665a;
        try {
            HashSet hashSet = new HashSet();
            hashSet.addAll(workContinuationImpl.f8667c);
            HashSet hashSetA = WorkContinuationImpl.a(workContinuationImpl);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(workContinuationImpl.f8667c);
                    z2 = false;
                    break;
                } else if (hashSetA.contains((String) it.next())) {
                    z2 = true;
                    break;
                }
            }
            if (z2) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", workContinuationImpl));
            }
            WorkDatabase workDatabase = workManagerImpl.f8686c;
            workDatabase.c();
            try {
                boolean zA = a(workContinuationImpl);
                workDatabase.l();
                workDatabase.f();
                if (zA) {
                    PackageManagerHelper.a(workManagerImpl.f8684a, RescheduleReceiver.class, true);
                    Schedulers.a(workManagerImpl.f8685b, workManagerImpl.f8686c, workManagerImpl.f8687e);
                }
                operationImpl.a(Operation.f8633a);
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        } catch (Throwable th2) {
            operationImpl.a(new Operation.State.FAILURE(th2));
        }
    }
}
