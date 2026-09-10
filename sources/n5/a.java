package n5;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e5.l f46508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UUID f46509c;

    public a(e5.l lVar, UUID uuid) {
        this.f46508b = lVar;
        this.f46509c = uuid;
    }

    @Override // n5.c
    public final void b() {
        e5.l lVar = this.f46508b;
        WorkDatabase workDatabase = lVar.f39111c;
        workDatabase.c();
        try {
            c.a(lVar, this.f46509c.toString());
            workDatabase.h();
            workDatabase.f();
            e5.d.a(lVar.f39110b, lVar.f39111c, lVar.f39113e);
        } catch (Throwable th2) {
            workDatabase.f();
            throw th2;
        }
    }
}
