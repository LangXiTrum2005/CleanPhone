package n5;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p5.a f46549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l5.a f46550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.internal.consent_sdk.d f46551c;

    static {
        d5.o.i("WMFgUpdater");
    }

    public o(WorkDatabase workDatabase, e5.b bVar, g9.k kVar) {
        this.f46550b = bVar;
        this.f46549a = kVar;
        this.f46551c = workDatabase.n();
    }
}
