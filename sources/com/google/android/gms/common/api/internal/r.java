package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.j2;
import com.google.android.gms.internal.measurement.u6;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements j9.j, j9.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.c f11752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f11753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f11754d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f11757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c0 f11758h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f11759i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f11762m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList f11751a = new LinkedList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f11755e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f11756f = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f11760j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ConnectionResult f11761k = null;
    public int l = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public r(e eVar, j9.i iVar) {
        this.f11762m = eVar;
        u6 u6Var = eVar.f11705n;
        Looper looper = u6Var.getLooper();
        g9.k kVarA = iVar.a();
        com.google.android.gms.internal.consent_sdk.x xVar = new com.google.android.gms.internal.consent_sdk.x((String) kVarA.f41771c, (String) kVarA.f41772d, (x.f) kVarA.f41770b);
        com.bumptech.glide.d dVar = (com.bumptech.glide.d) iVar.f43743d.f39976b;
        k9.c0.h(dVar);
        j9.c cVarB = dVar.b(iVar.f43740a, looper, xVar, iVar.f43744e, this, this);
        r9.a aVar = iVar.f43742c;
        if (aVar == null || !(cVarB instanceof k9.f)) {
            String str = iVar.f43741b;
            if (str != null && (cVarB instanceof k9.f)) {
                ((k9.f) cVarB).setAttributionTag(str);
            }
        } else {
            ((k9.f) cVarB).setAttributionSourceWrapper(aVar);
        }
        this.f11752b = cVarB;
        this.f11753c = iVar.f43745f;
        this.f11754d = new n();
        this.f11757g = iVar.f43747h;
        if (!cVarB.requiresSignIn()) {
            this.f11758h = null;
            return;
        }
        Context context = eVar.f11697e;
        g9.k kVarA2 = iVar.a();
        this.f11758h = new c0(context, u6Var, new com.google.android.gms.internal.consent_sdk.x((String) kVarA2.f41771c, (String) kVarA2.f41772d, (x.f) kVarA2.f41770b));
    }

    public final void a() {
        j9.c cVar = this.f11752b;
        e eVar = this.f11762m;
        k9.c0.c(eVar.f11705n);
        this.f11761k = null;
        i(ConnectionResult.f11639f);
        if (this.f11759i) {
            u6 u6Var = eVar.f11705n;
            a aVar = this.f11753c;
            u6Var.removeMessages(11, aVar);
            eVar.f11705n.removeMessages(9, aVar);
            this.f11759i = false;
        }
        Iterator it = this.f11756f.values().iterator();
        while (it.hasNext()) {
            bc.s sVar = ((a0) it.next()).f11671a;
            if (j((i9.c[]) sVar.f5582c) != null) {
                it.remove();
            } else {
                try {
                    ((v9.e) ((bo.e) sVar.f5583d).f5777b).accept(cVar, new TaskCompletionSource());
                } catch (DeadObjectException unused) {
                    q(3);
                    cVar.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException | RuntimeException e10) {
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e10);
                    it.remove();
                }
            }
        }
        d();
        h();
    }

    public final void b(int i10) {
        k9.c0.c(this.f11762m.f11705n);
        this.f11761k = null;
        this.f11759i = true;
        String lastDisconnectMessage = ((k9.f) this.f11752b).getLastDisconnectMessage();
        n nVar = this.f11754d;
        nVar.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (lastDisconnectMessage != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(lastDisconnectMessage);
        }
        nVar.a(true, new Status(20, sb2.toString(), null, null));
        a aVar = this.f11753c;
        e eVar = this.f11762m;
        u6 u6Var = eVar.f11705n;
        u6Var.sendMessageDelayed(Message.obtain(u6Var, 9, aVar), 5000L);
        u6 u6Var2 = eVar.f11705n;
        u6Var2.sendMessageDelayed(Message.obtain(u6Var2, 11, aVar), UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
        SparseIntArray sparseIntArray = (SparseIntArray) eVar.f11699g.f39976b;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        Iterator it = this.f11756f.values().iterator();
        while (it.hasNext()) {
            ((a0) it.next()).getClass();
        }
    }

    public final boolean c(ConnectionResult connectionResult) {
        synchronized (e.f11691r) {
            try {
                e eVar = this.f11762m;
                if (eVar.f11703k == null || !eVar.l.contains(this.f11753c)) {
                    return false;
                }
                o oVar = eVar.f11703k;
                int i10 = this.f11757g;
                oVar.getClass();
                h0 h0Var = new h0(connectionResult, i10);
                AtomicReference atomicReference = oVar.f11742b;
                do {
                    if (atomicReference.compareAndSet(null, h0Var)) {
                        oVar.f11743c.post(new i0(oVar, h0Var));
                        break;
                    }
                } while (atomicReference.get() == null);
                eVar.f11698f.h(eVar.f11697e, connectionResult, true);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.f11751a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            g0 g0Var = (g0) arrayList.get(i10);
            if (!((k9.f) this.f11752b).isConnected()) {
                return;
            }
            if (e(g0Var)) {
                linkedList.remove(g0Var);
            }
        }
    }

    public final boolean e(g0 g0Var) {
        if (!(g0Var instanceof y)) {
            n nVar = this.f11754d;
            j9.c cVar = this.f11752b;
            g0Var.c(nVar, cVar.requiresSignIn());
            try {
                g0Var.d(this);
                return true;
            } catch (DeadObjectException unused) {
                q(1);
                cVar.disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        y yVar = (y) g0Var;
        i9.c cVarJ = j(yVar.f(this));
        if (cVarJ == null) {
            n nVar2 = this.f11754d;
            j9.c cVar2 = this.f11752b;
            g0Var.c(nVar2, cVar2.requiresSignIn());
            try {
                g0Var.d(this);
                return true;
            } catch (DeadObjectException unused2) {
                q(1);
                cVar2.disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.f11752b.getClass().getName();
        String str = cVarJ.f42921a;
        long jB = cVarJ.b();
        int length = name.length();
        StringBuilder sb2 = new StringBuilder(length + 53 + String.valueOf(str).length() + 2 + String.valueOf(jB).length() + 2);
        d5.u.r(sb2, name, " could not execute call because it requires feature (", str, ", ");
        sb2.append(jB);
        sb2.append(").");
        Log.w("GoogleApiManager", sb2.toString());
        e eVar = this.f11762m;
        if (!eVar.f11706o || !yVar.g(this)) {
            yVar.b(new j9.p(cVarJ));
            return true;
        }
        int iH = yVar.h(this);
        s sVar = new s(this.f11753c, cVarJ);
        ArrayList arrayList = this.f11760j;
        int iIndexOf = arrayList.indexOf(sVar);
        if (iIndexOf >= 0) {
            s sVar2 = (s) arrayList.get(iIndexOf);
            eVar.f11705n.removeMessages(15, sVar2);
            eVar.f11705n.sendMessageDelayed(Message.obtain(eVar.f11705n, 15, sVar2), 5000L);
            return false;
        }
        arrayList.add(sVar);
        eVar.f11705n.sendMessageDelayed(Message.obtain(eVar.f11705n, 15, sVar), 5000L);
        eVar.f11705n.sendMessageDelayed(Message.obtain(eVar.f11705n, 16, sVar), UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
        ConnectionResult connectionResult = new ConnectionResult(1, 2, null, null, Integer.valueOf(iH));
        if (c(connectionResult)) {
            String str2 = cVarJ.f42921a;
            long jB2 = cVarJ.b();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 61 + String.valueOf(jB2).length());
            wi.d.m(sb3, "A dialog should be displayed for missing feature: ", str2, ", version: ");
            sb3.append(jB2);
            Log.w("GoogleApiManager", sb3.toString());
            return false;
        }
        if (!eVar.g(connectionResult, this.f11757g)) {
            return false;
        }
        String str3 = cVarJ.f42921a;
        long jB3 = cVarJ.b();
        StringBuilder sb4 = new StringBuilder(String.valueOf(str3).length() + 55 + String.valueOf(jB3).length());
        wi.d.m(sb4, "Notification displayed for missing feature: ", str3, ", version: ");
        sb4.append(jB3);
        Log.w("GoogleApiManager", sb4.toString());
        return false;
    }

    public final void f(Status status, Exception exc, boolean z10) {
        k9.c0.c(this.f11762m.f11705n);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f11751a.iterator();
        while (it.hasNext()) {
            g0 g0Var = (g0) it.next();
            if (!z10 || g0Var.f11714a == 2) {
                if (status != null) {
                    g0Var.a(status);
                } else {
                    g0Var.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void g(Status status) {
        k9.c0.c(this.f11762m.f11705n);
        f(status, null, false);
    }

    public final void h() {
        e eVar = this.f11762m;
        u6 u6Var = eVar.f11705n;
        a aVar = this.f11753c;
        u6Var.removeMessages(12, aVar);
        u6 u6Var2 = eVar.f11705n;
        u6Var2.sendMessageDelayed(u6Var2.obtainMessage(12, aVar), eVar.f11693a);
    }

    public final void i(ConnectionResult connectionResult) {
        HashSet hashSet = this.f11755e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (k9.c0.l(connectionResult, ConnectionResult.f11639f)) {
                ((k9.f) this.f11752b).getEndpointPackageName();
            }
            throw null;
        }
    }

    public final i9.c j(i9.c[] cVarArr) {
        if (cVarArr != null && cVarArr.length != 0) {
            i9.c[] availableFeatures = ((k9.f) this.f11752b).getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new i9.c[0];
            }
            x.e eVar = new x.e(availableFeatures.length);
            for (i9.c cVar : availableFeatures) {
                eVar.put(cVar.f42921a, Long.valueOf(cVar.b()));
            }
            for (i9.c cVar2 : cVarArr) {
                Long l = (Long) eVar.get(cVar2.f42921a);
                if (l == null || l.longValue() < cVar2.b()) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    public final void k(ConnectionResult connectionResult) {
        k9.c0.c(this.f11762m.f11705n);
        j9.c cVar = this.f11752b;
        String name = cVar.getClass().getName();
        String strValueOf = String.valueOf(connectionResult);
        cVar.disconnect(d5.u.h(new StringBuilder(name.length() + 25 + strValueOf.length()), "onSignInFailed for ", name, " with ", strValueOf));
        l(connectionResult, null);
    }

    public final void l(ConnectionResult connectionResult, RuntimeException runtimeException) {
        ia.a aVar;
        e eVar = this.f11762m;
        k9.c0.c(eVar.f11705n);
        c0 c0Var = this.f11758h;
        if (c0Var != null && (aVar = c0Var.f11686g) != null) {
            aVar.disconnect();
        }
        k9.c0.c(this.f11762m.f11705n);
        this.f11761k = null;
        SparseIntArray sparseIntArray = (SparseIntArray) eVar.f11699g.f39976b;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        i(connectionResult);
        if ((this.f11752b instanceof m9.e) && connectionResult.f11641b != 24) {
            eVar.f11694b = true;
            u6 u6Var = eVar.f11705n;
            u6Var.sendMessageDelayed(u6Var.obtainMessage(19), 300000L);
        }
        int i10 = connectionResult.f11641b;
        if (i10 == 4) {
            g(e.f11690q);
            return;
        }
        if (i10 == 25) {
            g(e.c(this.f11753c, connectionResult));
            return;
        }
        LinkedList linkedList = this.f11751a;
        if (linkedList.isEmpty()) {
            this.f11761k = connectionResult;
            return;
        }
        if (runtimeException != null) {
            k9.c0.c(eVar.f11705n);
            f(null, runtimeException, false);
            return;
        }
        if (!eVar.f11706o) {
            g(e.c(this.f11753c, connectionResult));
            return;
        }
        a aVar2 = this.f11753c;
        f(e.c(aVar2, connectionResult), null, true);
        if (linkedList.isEmpty() || c(connectionResult) || eVar.g(connectionResult, this.f11757g)) {
            return;
        }
        if (connectionResult.f11641b == 18) {
            this.f11759i = true;
        }
        if (!this.f11759i) {
            g(e.c(aVar2, connectionResult));
        } else {
            u6 u6Var2 = eVar.f11705n;
            u6Var2.sendMessageDelayed(Message.obtain(u6Var2, 9, aVar2), 5000L);
        }
    }

    public final void m(g0 g0Var) {
        k9.c0.c(this.f11762m.f11705n);
        boolean zIsConnected = ((k9.f) this.f11752b).isConnected();
        LinkedList linkedList = this.f11751a;
        if (zIsConnected) {
            if (e(g0Var)) {
                h();
                return;
            } else {
                linkedList.add(g0Var);
                return;
            }
        }
        linkedList.add(g0Var);
        ConnectionResult connectionResult = this.f11761k;
        if (connectionResult == null || connectionResult.f11641b == 0 || connectionResult.f11642c == null) {
            o();
        } else {
            l(connectionResult, null);
        }
    }

    public final void n() {
        k9.c0.c(this.f11762m.f11705n);
        Status status = e.f11689p;
        g(status);
        this.f11754d.a(false, status);
        for (i iVar : (i[]) this.f11756f.keySet().toArray(new i[0])) {
            m(new e0(iVar, new TaskCompletionSource()));
        }
        i(new ConnectionResult(4, null, null));
        k9.f fVar = (k9.f) this.f11752b;
        if (fVar.isConnected()) {
            fVar.onUserSignOut(new s4.i(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void o() {
        e eVar = this.f11762m;
        k9.c0.c(eVar.f11705n);
        j9.c cVar = this.f11752b;
        k9.f fVar = (k9.f) cVar;
        if (fVar.isConnected() || fVar.isConnecting()) {
            return;
        }
        try {
            int iB1 = eVar.f11699g.b1(eVar.f11697e, cVar);
            if (iB1 != 0) {
                ConnectionResult connectionResult = new ConnectionResult(iB1, null, null);
                String name = cVar.getClass().getName();
                String string = connectionResult.toString();
                StringBuilder sb2 = new StringBuilder(name.length() + 35 + string.length());
                sb2.append("The service for ");
                sb2.append(name);
                sb2.append(" is not available: ");
                sb2.append(string);
                Log.w("GoogleApiManager", sb2.toString());
                l(connectionResult, null);
                return;
            }
            t tVar = new t(eVar, cVar, this.f11753c);
            if (cVar.requiresSignIn()) {
                c0 c0Var = this.f11758h;
                k9.c0.h(c0Var);
                ia.a aVar = c0Var.f11686g;
                if (aVar != null) {
                    aVar.disconnect();
                }
                com.google.android.gms.internal.consent_sdk.x xVar = c0Var.f11685f;
                xVar.f23265f = Integer.valueOf(System.identityHashCode(c0Var));
                j2 j2Var = c0Var.f11683d;
                Context context = c0Var.f11681b;
                Handler handler = c0Var.f11682c;
                c0Var.f11686g = (ia.a) j2Var.b(context, handler.getLooper(), xVar, (ha.a) xVar.f23264e, c0Var, c0Var);
                c0Var.f11687h = tVar;
                Set set = c0Var.f11684e;
                if (set == null || set.isEmpty()) {
                    handler.post(new androidx.lifecycle.a0(c0Var));
                } else {
                    ia.a aVar2 = c0Var.f11686g;
                    aVar2.getClass();
                    aVar2.connect(new k9.m((k9.f) aVar2));
                }
            }
            try {
                fVar.connect(tVar);
            } catch (SecurityException e10) {
                l(new ConnectionResult(10, null, null), e10);
            }
        } catch (IllegalStateException e11) {
            l(new ConnectionResult(10, null, null), e11);
        }
    }

    @Override // j9.j
    public final void onConnected() {
        e eVar = this.f11762m;
        if (Looper.myLooper() == eVar.f11705n.getLooper()) {
            a();
        } else {
            eVar.f11705n.post(new androidx.lifecycle.a0(this, 4));
        }
    }

    @Override // j9.j
    public final void q(int i10) {
        e eVar = this.f11762m;
        if (Looper.myLooper() == eVar.f11705n.getLooper()) {
            b(i10);
        } else {
            eVar.f11705n.post(new q(i10, 0, this));
        }
    }

    @Override // j9.k
    public final void r(ConnectionResult connectionResult) {
        l(connectionResult, null);
    }
}
