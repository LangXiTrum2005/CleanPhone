package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import com.google.android.ump.UserMessagingPlatform;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f23165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f23166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f23167c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f23168d = new AtomicReference();

    public q(c cVar, Executor executor) {
        this.f23165a = cVar;
        this.f23166b = executor;
    }

    public final void a(UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener onConsentFormLoadFailureListener, boolean z10) {
        h0.a();
        r rVar = (r) this.f23167c.get();
        if (rVar == null) {
            onConsentFormLoadFailureListener.onConsentFormLoadFailure(new p1(3, "No available form can be built.").d());
            return;
        }
        c cVar = (c) this.f23165a.zzb();
        cVar.getClass();
        d dVar = cVar.f22964a;
        j7 j7VarA = j7.a(new g6((g6) dVar.f22982b, 4));
        g6 g6Var = new g6(rVar, 8);
        g6 g6Var2 = new g6(7);
        g6 g6Var3 = (g6) dVar.f22982b;
        j7 j7Var = (j7) dVar.f22986f;
        g gVar = (g) dVar.f22989i;
        j7 j7Var2 = (j7) dVar.f22983c;
        j7 j7VarA2 = j7.a(new fc.f(g6Var3, (j7) dVar.f22984d, j7VarA, j7Var2, g6Var, new p(j7VarA, new x(g6Var3, j7VarA, j7Var, gVar, g6Var2, j7Var2)), (j7) dVar.f22987g, 3));
        if (((j7) g6Var2.f23023b) != null) {
            throw new IllegalStateException();
        }
        g6Var2.f23023b = j7VarA2;
        m mVar = (m) g6Var2.zzb();
        mVar.f23088n = z10;
        mVar.a(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener);
    }

    public final void b() {
        r rVar = (r) this.f23167c.get();
        if (rVar == null) {
            Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        c cVar = (c) this.f23165a.zzb();
        cVar.getClass();
        d dVar = cVar.f22964a;
        j7 j7VarA = j7.a(new g6((g6) dVar.f22982b, 4));
        g6 g6Var = new g6(rVar, 8);
        g6 g6Var2 = new g6(7);
        g6 g6Var3 = (g6) dVar.f22982b;
        j7 j7Var = (j7) dVar.f22986f;
        g gVar = (g) dVar.f22989i;
        j7 j7Var2 = (j7) dVar.f22983c;
        j7 j7VarA2 = j7.a(new fc.f(g6Var3, (j7) dVar.f22984d, j7VarA, j7Var2, g6Var, new p(j7VarA, new x(g6Var3, j7VarA, j7Var, gVar, g6Var2, j7Var2)), (j7) dVar.f22987g, 3));
        if (((j7) g6Var2.f23023b) != null) {
            throw new IllegalStateException();
        }
        g6Var2.f23023b = j7VarA2;
        m mVar = (m) g6Var2.zzb();
        mVar.f23087m = true;
        h0.f23034a.post(new n(0, this, mVar));
    }
}
