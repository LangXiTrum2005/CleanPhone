package n5;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e5.l f46511c;

    public /* synthetic */ b(e5.l lVar, int i10) {
        this.f46510b = i10;
        this.f46511c = lVar;
    }

    @Override // n5.c
    public final void b() {
        switch (this.f46510b) {
            case 0:
                e5.l lVar = this.f46511c;
                WorkDatabase workDatabase = lVar.f39111c;
                workDatabase.c();
                try {
                    Iterator it = workDatabase.n().k().iterator();
                    while (it.hasNext()) {
                        c.a(lVar, (String) it.next());
                    }
                    workDatabase.h();
                    workDatabase.f();
                    e5.d.a(lVar.f39110b, lVar.f39111c, lVar.f39113e);
                    return;
                } catch (Throwable th2) {
                    workDatabase.f();
                    throw th2;
                }
            default:
                e5.l lVar2 = this.f46511c;
                WorkDatabase workDatabase2 = lVar2.f39111c;
                workDatabase2.c();
                try {
                    Iterator it2 = workDatabase2.n().j().iterator();
                    while (it2.hasNext()) {
                        c.a(lVar2, (String) it2.next());
                    }
                    workDatabase2.h();
                    return;
                } finally {
                    workDatabase2.f();
                }
        }
    }
}
