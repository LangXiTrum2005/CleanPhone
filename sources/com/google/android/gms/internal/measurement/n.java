package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f23758b = new n(s.f23948a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f23759a;

    public n(r rVar) {
        this.f23759a = new AtomicReference(rVar);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final void a(String str, Level level, boolean z10) {
        ((r) this.f23759a.get()).a(str, level, z10);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final w b() {
        return ((r) this.f23759a.get()).b();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final h c() {
        return ((r) this.f23759a.get()).c();
    }
}
