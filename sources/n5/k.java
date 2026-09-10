package n5;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f46533d = d5.o.i("StopWorkRunnable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e5.l f46534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f46536c;

    public k(e5.l lVar, String str, boolean z10) {
        this.f46534a = lVar;
        this.f46535b = str;
        this.f46536c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zContainsKey;
        boolean zJ;
        e5.l lVar = this.f46534a;
        WorkDatabase workDatabase = lVar.f39111c;
        e5.b bVar = lVar.f39114f;
        com.google.android.gms.internal.consent_sdk.d dVarN = workDatabase.n();
        workDatabase.c();
        try {
            String str = this.f46535b;
            synchronized (bVar.f39085k) {
                zContainsKey = bVar.f39080f.containsKey(str);
            }
            if (this.f46536c) {
                zJ = this.f46534a.f39114f.i(this.f46535b);
            } else {
                if (!zContainsKey && dVarN.i(this.f46535b) == 2) {
                    dVarN.t(1, this.f46535b);
                }
                zJ = this.f46534a.f39114f.j(this.f46535b);
            }
            d5.o.g().e(f46533d, "StopWorkRunnable for " + this.f46535b + "; Processor.stopWork = " + zJ, new Throwable[0]);
            workDatabase.h();
            workDatabase.f();
        } catch (Throwable th2) {
            workDatabase.f();
            throw th2;
        }
    }
}
