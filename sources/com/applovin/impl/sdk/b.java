package com.applovin.impl.sdk;

import com.applovin.impl.j7;
import com.applovin.impl.u1;
import com.applovin.impl.z4;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f9389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f9390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference f9391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j7 f9392d;

    private b(u1 u1Var, a.InterfaceC0015a interfaceC0015a, l lVar) {
        this.f9390b = new WeakReference(u1Var);
        this.f9391c = new WeakReference(interfaceC0015a);
        this.f9389a = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        d();
        this.f9389a.f().a(this);
    }

    public u1 b() {
        return (u1) this.f9390b.get();
    }

    public void d() {
        a();
        u1 u1VarB = b();
        if (u1VarB == null) {
            return;
        }
        u1VarB.setExpired();
        a.InterfaceC0015a interfaceC0015a = (a.InterfaceC0015a) this.f9391c.get();
        if (interfaceC0015a == null) {
            return;
        }
        interfaceC0015a.onAdExpired(u1VarB);
    }

    public static b a(u1 u1Var, a.InterfaceC0015a interfaceC0015a, l lVar) {
        b bVar = new b(u1Var, interfaceC0015a, lVar);
        bVar.a(u1Var.getTimeToLiveMillis());
        return bVar;
    }

    public void a(long j10) {
        a();
        if (((Boolean) this.f9389a.a(z4.f10141f1)).booleanValue() || !this.f9389a.o0().isApplicationPaused()) {
            this.f9392d = j7.a(j10, this.f9389a, new androidx.fragment.app.n(this, 9));
        }
    }

    public void a() {
        j7 j7Var = this.f9392d;
        if (j7Var != null) {
            j7Var.a();
            this.f9392d = null;
        }
    }
}
