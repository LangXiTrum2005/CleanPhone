package n5;

import androidx.work.impl.WorkDatabase;
import d5.t;
import eb.d0;
import java.util.Iterator;
import java.util.LinkedList;
import m0.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f46512a = new d0(10);

    public static void a(e5.l lVar, String str) {
        WorkDatabase workDatabase = lVar.f39111c;
        com.google.android.gms.internal.consent_sdk.d dVarN = workDatabase.n();
        s1 s1VarI = workDatabase.i();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int i10 = dVarN.i(str2);
            if (i10 != 3 && i10 != 4) {
                dVarN.t(6, str2);
            }
            linkedList.addAll(s1VarI.l(str2));
        }
        e5.b bVar = lVar.f39114f;
        synchronized (bVar.f39085k) {
            try {
                d5.o.g().e(e5.b.l, "Processor cancelling " + str, new Throwable[0]);
                bVar.f39083i.add(str);
                e5.m mVar = (e5.m) bVar.f39080f.remove(str);
                boolean z10 = mVar != null;
                if (mVar == null) {
                    mVar = (e5.m) bVar.f39081g.remove(str);
                }
                e5.b.b(str, mVar);
                if (z10) {
                    bVar.h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = lVar.f39113e.iterator();
        while (it.hasNext()) {
            ((e5.c) it.next()).b(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        d0 d0Var = this.f46512a;
        try {
            b();
            d0Var.Z0(t.f38708b9);
        } catch (Throwable th2) {
            d0Var.Z0(new d5.q(th2));
        }
    }
}
