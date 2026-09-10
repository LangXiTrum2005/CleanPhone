package ca;

import android.os.Bundle;
import android.os.SystemClock;
import com.adjust.sdk.t0;
import ea.g2;
import ea.i4;
import ea.j1;
import ea.l4;
import ea.m1;
import ea.p2;
import ea.s0;
import ea.w2;
import ea.y;
import ea.z2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import k9.c0;
import x.e;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1 f5962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f5963b;

    public a(m1 m1Var) {
        c0.h(m1Var);
        this.f5962a = m1Var;
        p2 p2Var = m1Var.f39593m;
        m1.g(p2Var);
        this.f5963b = p2Var;
    }

    @Override // ea.q2
    public final void a(String str, Bundle bundle, String str2) {
        this.f5963b.K0(str, bundle, str2);
    }

    @Override // ea.q2
    public final void b(String str) {
        m1 m1Var = this.f5962a;
        y yVar = m1Var.f39594n;
        m1.e(yVar);
        m1Var.f39592k.getClass();
        yVar.H0(SystemClock.elapsedRealtime(), str);
    }

    @Override // ea.q2
    public final Map c(String str, String str2, boolean z10) {
        p2 p2Var = this.f5963b;
        m1 m1Var = (m1) p2Var.f3623a;
        j1 j1Var = m1Var.f39588g;
        s0 s0Var = m1Var.f39587f;
        m1.h(j1Var);
        if (j1Var.M0()) {
            m1.h(s0Var);
            s0Var.f39753f.b("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (fd.b.e()) {
            m1.h(s0Var);
            s0Var.f39753f.b("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        j1 j1Var2 = m1Var.f39588g;
        m1.h(j1Var2);
        j1Var2.Q0(atomicReference, 5000L, "get user properties", new g2(p2Var, atomicReference, str, str2, z10));
        List<i4> list = (List) atomicReference.get();
        if (list == null) {
            m1.h(s0Var);
            s0Var.f39753f.c(Boolean.valueOf(z10), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        e eVar = new e(list.size());
        for (i4 i4Var : list) {
            Object objZza = i4Var.zza();
            if (objZza != null) {
                eVar.put(i4Var.f39485b, objZza);
            }
        }
        return eVar;
    }

    @Override // ea.q2
    public final void d(String str, Bundle bundle, String str2) {
        p2 p2Var = this.f5962a.f39593m;
        m1.g(p2Var);
        p2Var.U0(str, bundle, str2);
    }

    @Override // ea.q2
    public final List e(String str, String str2) {
        p2 p2Var = this.f5963b;
        m1 m1Var = (m1) p2Var.f3623a;
        j1 j1Var = m1Var.f39588g;
        s0 s0Var = m1Var.f39587f;
        m1.h(j1Var);
        if (j1Var.M0()) {
            m1.h(s0Var);
            s0Var.f39753f.b("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (fd.b.e()) {
            m1.h(s0Var);
            s0Var.f39753f.b("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        j1 j1Var2 = m1Var.f39588g;
        m1.h(j1Var2);
        j1Var2.Q0(atomicReference, 5000L, "get conditional user properties", new t0(p2Var, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return l4.z1(list);
        }
        m1.h(s0Var);
        s0Var.f39753f.c(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // ea.q2
    public final int g(String str) {
        p2 p2Var = this.f5963b;
        p2Var.getClass();
        c0.e(str);
        ((m1) p2Var.f3623a).getClass();
        return 25;
    }

    @Override // ea.q2
    public final String zzh() {
        z2 z2Var = ((m1) this.f5963b.f3623a).l;
        m1.g(z2Var);
        w2 w2Var = z2Var.f39949c;
        if (w2Var != null) {
            return w2Var.f39862a;
        }
        return null;
    }

    @Override // ea.q2
    public final String zzi() {
        z2 z2Var = ((m1) this.f5963b.f3623a).l;
        m1.g(z2Var);
        w2 w2Var = z2Var.f39949c;
        if (w2Var != null) {
            return w2Var.f39863b;
        }
        return null;
    }

    @Override // ea.q2
    public final String zzj() {
        return (String) this.f5963b.f39689g.get();
    }

    @Override // ea.q2
    public final String zzk() {
        return this.f5963b.V0();
    }

    @Override // ea.q2
    public final long zzl() {
        l4 l4Var = this.f5962a.f39590i;
        m1.f(l4Var);
        return l4Var.D1();
    }

    @Override // ea.q2
    public final void zzn(String str) {
        m1 m1Var = this.f5962a;
        y yVar = m1Var.f39594n;
        m1.e(yVar);
        m1Var.f39592k.getClass();
        yVar.I0(SystemClock.elapsedRealtime(), str);
    }

    @Override // ea.q2
    public final void zzo(Bundle bundle) {
        p2 p2Var = this.f5963b;
        ((m1) p2Var.f3623a).f39592k.getClass();
        p2Var.T0(bundle, System.currentTimeMillis());
    }
}
