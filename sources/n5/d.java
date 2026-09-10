package n5;

import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import d5.t;
import eb.d0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import m0.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f46513c = d5.o.i("EnqueueRunnable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e5.e f46514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f46515b = new d0(10);

    public d(e5.e eVar) {
        this.f46514a = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:108:0x0221  */
    /* JADX WARN: Code duplicated, block: B:145:0x024b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0159  */
    /* JADX WARN: Code duplicated, block: B:79:0x0179  */
    /* JADX WARN: Code duplicated, block: B:81:0x0181  */
    /* JADX WARN: Code duplicated, block: B:82:0x0184  */
    /* JADX WARN: Code duplicated, block: B:85:0x018d  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:92:0x01af  */
    public static boolean a(e5.e eVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        List<d5.p> list;
        WorkDatabase workDatabase;
        boolean z13;
        boolean z14;
        m5.i iVar;
        UUID uuid;
        WorkDatabase_Impl workDatabase_Impl;
        WorkDatabase_Impl workDatabase_Impl2;
        WorkDatabase_Impl workDatabase_Impl3;
        int length;
        int i10;
        WorkDatabase_Impl workDatabase_Impl4;
        HashSet hashSetP = e5.e.P(eVar);
        e5.l lVar = eVar.f39088c;
        List list2 = eVar.f39089d;
        boolean z15 = false;
        String[] strArr = (String[]) hashSetP.toArray(new String[0]);
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase2 = lVar.f39111c;
        boolean z16 = strArr != null && strArr.length > 0;
        if (z16) {
            int length2 = strArr.length;
            int i11 = 0;
            z10 = false;
            z11 = false;
            z12 = true;
            while (true) {
                if (i11 < length2) {
                    String str = strArr[i11];
                    m5.i iVarL = workDatabase2.n().l(str);
                    if (iVarL == null) {
                        d5.o.g().f(f46513c, defpackage.e.o("Prerequisite ", str, " doesn't exist; not enqueuing"), new Throwable[0]);
                    } else {
                        int i12 = iVarL.f45883b;
                        z12 &= i12 == 3;
                        if (i12 == 4) {
                            z11 = true;
                        } else if (i12 == 6) {
                            z10 = true;
                        }
                        i11++;
                    }
                }
                eVar.f39092g = true;
                return z15;
            }
        }
        z10 = false;
        z11 = false;
        z12 = true;
        boolean zIsEmpty = TextUtils.isEmpty(null);
        if (!zIsEmpty && !z16) {
            WorkDatabase_Impl workDatabase_Impl5 = (WorkDatabase_Impl) workDatabase2.n().f22981a;
            g4.h hVarB = g4.h.b(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
            hVarB.h(1);
            workDatabase_Impl5.b();
            Cursor cursorG = workDatabase_Impl5.g(hVarB);
            try {
                int iW = com.bumptech.glide.d.w(cursorG, "id");
                int iW2 = com.bumptech.glide.d.w(cursorG, "state");
                list = list2;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    m5.h hVar = new m5.h();
                    WorkDatabase workDatabase3 = workDatabase2;
                    hVar.f45880a = cursorG.getString(iW);
                    hVar.f45881b = j1.f.A(cursorG.getInt(iW2));
                    arrayList.add(hVar);
                    workDatabase2 = workDatabase3;
                }
                workDatabase = workDatabase2;
                cursorG.close();
                hVarB.k();
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            int i13 = ((m5.h) it.next()).f45881b;
                            if (i13 == 1 || i13 == 2) {
                                z15 = false;
                            }
                        } else {
                            new b(lVar, 1).run();
                            com.google.android.gms.internal.consent_sdk.d dVarN = workDatabase.n();
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                String str2 = ((m5.h) it2.next()).f45880a;
                                WorkDatabase_Impl workDatabase_Impl6 = (WorkDatabase_Impl) dVarN.f22981a;
                                workDatabase_Impl6.b();
                                m5.e eVar2 = (m5.e) dVarN.f22983c;
                                l4.f fVarA = eVar2.a();
                                if (str2 == null) {
                                    fVarA.k(1);
                                } else {
                                    fVarA.n(1, str2);
                                }
                                workDatabase_Impl6.c();
                                try {
                                    fVarA.t();
                                    workDatabase_Impl6.h();
                                    workDatabase_Impl6.f();
                                    eVar2.c(fVarA);
                                } catch (Throwable th2) {
                                    workDatabase_Impl6.f();
                                    eVar2.c(fVarA);
                                    throw th2;
                                }
                            }
                            z13 = true;
                        }
                        eVar.f39092g = true;
                        return z15;
                    }
                }
                z14 = z13;
                for (d5.p pVar : list) {
                    iVar = pVar.f38705b;
                    uuid = pVar.f38704a;
                    if (z16 || z12) {
                        if (iVar.c()) {
                            iVar.f45894n = 0L;
                        } else {
                            iVar.f45894n = jCurrentTimeMillis;
                        }
                    } else if (z11) {
                        iVar.f45883b = 4;
                    } else if (z10) {
                        iVar.f45883b = 6;
                    } else {
                        iVar.f45883b = 5;
                    }
                    if (iVar.f45883b == 1) {
                        z14 = true;
                    }
                    com.google.android.gms.internal.consent_sdk.d dVarN2 = workDatabase.n();
                    workDatabase_Impl = (WorkDatabase_Impl) dVarN2.f22981a;
                    workDatabase_Impl.b();
                    workDatabase_Impl.c();
                    try {
                        ((m5.b) dVarN2.f22982b).e(iVar);
                        workDatabase_Impl.h();
                        workDatabase_Impl.f();
                        if (z16) {
                            length = strArr.length;
                            i10 = 0;
                            while (i10 < length) {
                                String[] strArr2 = strArr;
                                m5.a aVar = new m5.a(uuid.toString(), strArr[i10]);
                                s1 s1VarI = workDatabase.i();
                                workDatabase_Impl4 = (WorkDatabase_Impl) s1VarI.f45751b;
                                workDatabase_Impl4.b();
                                workDatabase_Impl4.c();
                                try {
                                    ((m5.b) s1VarI.f45752c).e(aVar);
                                    workDatabase_Impl4.h();
                                    workDatabase_Impl4.f();
                                    i10++;
                                    strArr = strArr2;
                                } catch (Throwable th3) {
                                    workDatabase_Impl4.f();
                                    throw th3;
                                }
                            }
                        }
                        String[] strArr3 = strArr;
                        for (String str3 : pVar.f38706c) {
                            m5.k kVarO = workDatabase.o();
                            m5.j jVar = new m5.j(str3, uuid.toString());
                            workDatabase_Impl3 = (WorkDatabase_Impl) kVarO.f45902b;
                            workDatabase_Impl3.b();
                            workDatabase_Impl3.c();
                            try {
                                ((m5.b) kVarO.f45903c).e(jVar);
                                workDatabase_Impl3.h();
                                workDatabase_Impl3.f();
                            } catch (Throwable th4) {
                                workDatabase_Impl3.f();
                                throw th4;
                            }
                        }
                        if (!zIsEmpty) {
                            s1 s1VarL = workDatabase.l();
                            m5.f fVar = new m5.f(uuid.toString());
                            workDatabase_Impl2 = (WorkDatabase_Impl) s1VarL.f45751b;
                            workDatabase_Impl2.b();
                            workDatabase_Impl2.c();
                            try {
                                ((m5.b) s1VarL.f45752c).e(fVar);
                                workDatabase_Impl2.h();
                                workDatabase_Impl2.f();
                            } catch (Throwable th5) {
                                workDatabase_Impl2.f();
                                throw th5;
                            }
                        }
                        strArr = strArr3;
                    } catch (Throwable th6) {
                        workDatabase_Impl.f();
                        throw th6;
                    }
                }
                z15 = z14;
                eVar.f39092g = true;
                return z15;
            } catch (Throwable th7) {
                cursorG.close();
                hVarB.k();
                throw th7;
            }
        }
        list = list2;
        workDatabase = workDatabase2;
        z13 = false;
        z14 = z13;
        while (r3.hasNext()) {
            iVar = pVar.f38705b;
            uuid = pVar.f38704a;
            if (z16) {
                if (iVar.c()) {
                    iVar.f45894n = jCurrentTimeMillis;
                } else {
                    iVar.f45894n = 0L;
                }
            } else if (iVar.c()) {
                iVar.f45894n = jCurrentTimeMillis;
            } else {
                iVar.f45894n = 0L;
            }
            if (iVar.f45883b == 1) {
                z14 = true;
            }
            com.google.android.gms.internal.consent_sdk.d dVarN3 = workDatabase.n();
            workDatabase_Impl = (WorkDatabase_Impl) dVarN3.f22981a;
            workDatabase_Impl.b();
            workDatabase_Impl.c();
            ((m5.b) dVarN3.f22982b).e(iVar);
            workDatabase_Impl.h();
            workDatabase_Impl.f();
            if (z16) {
                length = strArr.length;
                i10 = 0;
                while (i10 < length) {
                    String[] strArr4 = strArr;
                    m5.a aVar2 = new m5.a(uuid.toString(), strArr[i10]);
                    s1 s1VarI2 = workDatabase.i();
                    workDatabase_Impl4 = (WorkDatabase_Impl) s1VarI2.f45751b;
                    workDatabase_Impl4.b();
                    workDatabase_Impl4.c();
                    ((m5.b) s1VarI2.f45752c).e(aVar2);
                    workDatabase_Impl4.h();
                    workDatabase_Impl4.f();
                    i10++;
                    strArr = strArr4;
                }
            }
            String[] strArr5 = strArr;
            while (r1.hasNext()) {
                m5.k kVarO2 = workDatabase.o();
                m5.j jVar2 = new m5.j(str3, uuid.toString());
                workDatabase_Impl3 = (WorkDatabase_Impl) kVarO2.f45902b;
                workDatabase_Impl3.b();
                workDatabase_Impl3.c();
                ((m5.b) kVarO2.f45903c).e(jVar2);
                workDatabase_Impl3.h();
                workDatabase_Impl3.f();
            }
            if (!zIsEmpty) {
                s1 s1VarL2 = workDatabase.l();
                m5.f fVar2 = new m5.f(uuid.toString());
                workDatabase_Impl2 = (WorkDatabase_Impl) s1VarL2.f45751b;
                workDatabase_Impl2.b();
                workDatabase_Impl2.c();
                ((m5.b) s1VarL2.f45752c).e(fVar2);
                workDatabase_Impl2.h();
                workDatabase_Impl2.f();
            }
            strArr = strArr5;
        }
        z15 = z14;
        eVar.f39092g = true;
        return z15;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        d0 d0Var = this.f46515b;
        e5.e eVar = this.f46514a;
        e5.l lVar = eVar.f39088c;
        try {
            HashSet hashSet = new HashSet();
            hashSet.addAll(eVar.f39090e);
            HashSet hashSetP = e5.e.P(eVar);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(eVar.f39090e);
                    z10 = false;
                    break;
                } else if (hashSetP.contains((String) it.next())) {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                throw new IllegalStateException("WorkContinuation has cycles (" + eVar + ")");
            }
            WorkDatabase workDatabase = lVar.f39111c;
            workDatabase.c();
            try {
                boolean zA = a(eVar);
                workDatabase.h();
                workDatabase.f();
                if (zA) {
                    g.a(lVar.f39109a, RescheduleReceiver.class, true);
                    e5.d.a(lVar.f39110b, lVar.f39111c, lVar.f39113e);
                }
                d0Var.Z0(t.f38708b9);
            } catch (Throwable th2) {
                workDatabase.f();
                throw th2;
            }
        } catch (Throwable th3) {
            d0Var.Z0(new d5.q(th3));
        }
    }
}
