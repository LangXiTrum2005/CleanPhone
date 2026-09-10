package e5;

import androidx.work.impl.WorkDatabase;
import com.google.android.gms.internal.ads.j60;
import d5.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f39086a = o.i("Schedulers");

    public static void a(j60 j60Var, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        com.google.android.gms.internal.consent_sdk.d dVarN = workDatabase.n();
        workDatabase.c();
        try {
            ArrayList arrayListE = dVarN.e(j60Var.f15995c);
            ArrayList arrayListC = dVarN.c();
            if (arrayListE.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = arrayListE.iterator();
                while (it.hasNext()) {
                    dVarN.p(jCurrentTimeMillis, ((m5.i) it.next()).f45882a);
                }
            }
            workDatabase.h();
            workDatabase.f();
            if (arrayListE.size() > 0) {
                m5.i[] iVarArr = (m5.i[]) arrayListE.toArray(new m5.i[arrayListE.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    c cVar = (c) it2.next();
                    if (cVar.d()) {
                        cVar.a(iVarArr);
                    }
                }
            }
            if (arrayListC.size() > 0) {
                m5.i[] iVarArr2 = (m5.i[]) arrayListC.toArray(new m5.i[arrayListC.size()]);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    c cVar2 = (c) it3.next();
                    if (!cVar2.d()) {
                        cVar2.a(iVarArr2);
                    }
                }
            }
        } catch (Throwable th2) {
            workDatabase.f();
            throw th2;
        }
    }
}
