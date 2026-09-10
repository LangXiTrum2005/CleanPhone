package com.google.android.gms.common.api.internal;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import android.widget.ProgressBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.ads.n3;
import com.google.android.gms.internal.measurement.ee;
import com.google.android.gms.internal.measurement.h6;
import com.google.android.gms.internal.measurement.he;
import com.google.android.gms.internal.measurement.nd;
import com.google.android.gms.internal.measurement.q6;
import com.google.android.gms.internal.measurement.rd;
import com.google.android.gms.internal.measurement.u1;
import com.google.android.gms.internal.measurement.u6;
import com.google.android.gms.internal.measurement.ud;
import com.google.android.gms.internal.measurement.vd;
import com.google.android.gms.internal.measurement.z0;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import k9.p0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11721c;

    public /* synthetic */ i0(i9.i iVar, q6 q6Var) {
        this.f11719a = 2;
        this.f11720b = iVar;
        this.f11721c = q6Var;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0155 A[Catch: all -> 0x0153, TryCatch #0 {all -> 0x0153, blocks: (B:58:0x0135, B:60:0x0139, B:62:0x013d, B:67:0x014a, B:72:0x0155, B:73:0x0160), top: B:137:0x0135 }] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        k9.j jVar;
        boolean z10;
        boolean z11;
        k9.j p0Var;
        switch (this.f11719a) {
            case 0:
                o oVar = (o) this.f11721c;
                if (oVar.f11741a) {
                    h0 h0Var = (h0) this.f11720b;
                    ConnectionResult connectionResult = h0Var.f11716b;
                    if (connectionResult.f11641b != 0 && connectionResult.f11642c != null) {
                        h hVar = oVar.mLifecycleFragment;
                        Activity activity = oVar.getActivity();
                        PendingIntent pendingIntent = connectionResult.f11642c;
                        k9.c0.h(pendingIntent);
                        int i10 = h0Var.f11715a;
                        int i11 = GoogleApiActivity.f11645b;
                        Intent intent = new Intent(activity, (Class<?>) GoogleApiActivity.class);
                        intent.putExtra("pending_intent", pendingIntent);
                        intent.putExtra("failing_client_id", i10);
                        intent.putExtra("notify_manager", false);
                        hVar.startActivityForResult(intent, 1);
                        return;
                    }
                    Activity activity2 = oVar.getActivity();
                    int i12 = connectionResult.f11641b;
                    i9.d dVar = oVar.f11744d;
                    if (dVar.b(activity2, i12, null) != null) {
                        dVar.f(oVar.getActivity(), oVar.mLifecycleFragment, connectionResult.f11641b, oVar);
                        return;
                    }
                    if (connectionResult.f11641b != 18) {
                        int i13 = h0Var.f11715a;
                        oVar.f11742b.set(null);
                        oVar.f11746f.h(connectionResult, i13);
                        return;
                    }
                    Activity activity3 = oVar.getActivity();
                    ProgressBar progressBar = new ProgressBar(activity3, null, R.attr.progressBarStyleLarge);
                    progressBar.setIndeterminate(true);
                    progressBar.setVisibility(0);
                    AlertDialog.Builder builder = new AlertDialog.Builder(activity3);
                    builder.setView(progressBar);
                    builder.setMessage(k9.s.b(activity3, 18));
                    builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                    AlertDialog alertDialogCreate = builder.create();
                    i9.d.i(activity3, alertDialogCreate, "GooglePlayServicesUpdatingDialog", oVar);
                    Context applicationContext = oVar.getActivity().getApplicationContext();
                    n nVar = new n(this, alertDialogCreate);
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addDataScheme("package");
                    w wVar = new w(nVar);
                    b0.b.h(applicationContext, wVar, intentFilter, 2);
                    wVar.f11775b = applicationContext;
                    if (i9.h.c(applicationContext)) {
                        return;
                    }
                    o oVar2 = (o) this.f11721c;
                    oVar2.f11742b.set(null);
                    u6 u6Var = oVar2.f11746f.f11705n;
                    u6Var.sendMessage(u6Var.obtainMessage(3));
                    if (alertDialogCreate.isShowing()) {
                        alertDialogCreate.dismiss();
                    }
                    synchronized (wVar) {
                        try {
                            Context context = wVar.f11775b;
                            if (context != null) {
                                context.unregisterReceiver(wVar);
                            }
                            wVar.f11775b = null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
                return;
            case 1:
                ConnectionResult connectionResult2 = (ConnectionResult) this.f11720b;
                t tVar = (t) this.f11721c;
                e eVar = (e) tVar.f11770f;
                j9.c cVar = (j9.c) tVar.f11766b;
                r rVar = (r) eVar.f11702j.get((a) tVar.f11767c);
                if (rVar == null) {
                    return;
                }
                if (!connectionResult2.b()) {
                    rVar.l(connectionResult2, null);
                    return;
                }
                tVar.f11765a = true;
                if (cVar.requiresSignIn()) {
                    if (!tVar.f11765a || (jVar = (k9.j) tVar.f11768d) == null) {
                        return;
                    }
                    ((k9.f) cVar).getRemoteService(jVar, (Set) tVar.f11769e);
                    return;
                }
                try {
                    k9.i iVar = (k9.i) cVar;
                    ((k9.f) cVar).getRemoteService(null, iVar.requiresSignIn() ? iVar.F : Collections.EMPTY_SET);
                    return;
                } catch (SecurityException e10) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
                    cVar.disconnect("Failed to get service from broker.");
                    rVar.l(new ConnectionResult(10, null, null), null);
                    return;
                }
            case 2:
                i9.i iVar2 = (i9.i) this.f11720b;
                q6 q6Var = (q6) this.f11721c;
                i iVar3 = (i) iVar2.f42937a;
                if (iVar3 == null) {
                    return;
                }
                h6 h6Var = iVar3.f11717a;
                q6Var.getClass();
                try {
                    byte[] bArr = (byte[]) q6Var.f23891b;
                    z0 z0Var = z0.f24189a;
                    int i14 = com.google.android.gms.internal.measurement.n0.f23760a;
                    vd vdVarV = vd.v(bArr, z0.f24190b);
                    boolean z12 = false;
                    for (rd rdVar : ((ee) h6Var.f23541c).f23430f) {
                        List listU = vdVarV.u();
                        rdVar.getClass();
                        q6 q6Var2 = ud.f24037i;
                        q6Var2.getClass();
                        if (listU == null || listU.isEmpty()) {
                            z10 = false;
                        } else {
                            Iterator it = listU.iterator();
                            z10 = false;
                            while (it.hasNext()) {
                                nd ndVar = (nd) ((ConcurrentHashMap) q6Var2.f23891b).get((String) it.next());
                                if (ndVar != null) {
                                    ud udVar = ndVar.f23780a;
                                    if (udVar.f24043e) {
                                        bo.e eVar2 = udVar.f24039a;
                                        if (eVar2 != null && (eVar2.f5776a || ((n3) eVar2.f5780e).f17624a == 3 || udVar.f24046h.N())) {
                                            synchronized (udVar) {
                                                try {
                                                    bo.e eVar3 = udVar.f24039a;
                                                    if (eVar3 != null) {
                                                        if (eVar3.f5776a) {
                                                            udVar.f24039a = null;
                                                            ((AtomicInteger) udVar.f24045g.f23891b).incrementAndGet();
                                                        } else if ((((n3) eVar3.f5780e).f17624a == 3) || udVar.f24046h.N()) {
                                                            udVar.f24039a = null;
                                                            ((AtomicInteger) udVar.f24045g.f23891b).incrementAndGet();
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    throw th3;
                                                }
                                            }
                                        }
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    z10 |= z11;
                                }
                            }
                        }
                        if (z10 && !z12) {
                            ((he) h6Var.f23540b).zza();
                            z12 = true;
                        }
                    }
                    return;
                } catch (u1 unused) {
                    return;
                }
            default:
                c0 c0Var = (c0) this.f11721c;
                ia.f fVar = (ia.f) this.f11720b;
                c0Var.getClass();
                ConnectionResult connectionResult3 = fVar.f42976b;
                if (connectionResult3.b()) {
                    k9.w wVar2 = fVar.f42977c;
                    k9.c0.h(wVar2);
                    ConnectionResult connectionResult4 = wVar2.f44523c;
                    if (!connectionResult4.b()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(connectionResult4)), new Exception());
                        c0Var.f11687h.g(connectionResult4);
                        c0Var.f11686g.disconnect();
                        return;
                    }
                    t tVar2 = c0Var.f11687h;
                    IBinder iBinder = wVar2.f44522b;
                    if (iBinder == null) {
                        p0Var = null;
                    } else {
                        int i15 = k9.a.f44397b;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        p0Var = iInterfaceQueryLocalInterface instanceof k9.j ? (k9.j) iInterfaceQueryLocalInterface : new p0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 5);
                    }
                    Set<Scope> set = c0Var.f11684e;
                    tVar2.getClass();
                    if (p0Var == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        tVar2.g(new ConnectionResult(4, null, null));
                    } else {
                        tVar2.f11768d = p0Var;
                        tVar2.f11769e = set;
                        if (tVar2.f11765a) {
                            ((k9.f) ((j9.c) tVar2.f11766b)).getRemoteService(p0Var, set);
                        }
                    }
                } else {
                    c0Var.f11687h.g(connectionResult3);
                }
                c0Var.f11686g.disconnect();
                return;
        }
    }

    public /* synthetic */ i0(Object obj, l9.a aVar, int i10) {
        this.f11719a = i10;
        this.f11720b = aVar;
        this.f11721c = obj;
    }

    public i0(o oVar, h0 h0Var) {
        this.f11719a = 0;
        Objects.requireNonNull(oVar);
        this.f11721c = oVar;
        this.f11720b = h0Var;
    }
}
