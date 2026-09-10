package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.measurement.u6;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends g implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f11741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f11742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u6 f11743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i9.d f11744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x.f f11745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f11746f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(h hVar, e eVar) {
        super(hVar);
        i9.d dVar = i9.d.f42926e;
        this.f11742b = new AtomicReference(null);
        this.f11743c = new u6(Looper.getMainLooper(), 1);
        this.f11744d = dVar;
        this.f11745e = new x.f(0);
        this.f11746f = eVar;
        this.mLifecycleFragment.g("ConnectionlessLifecycleHelper", this);
    }

    @Override // com.google.android.gms.common.api.internal.g
    public final void onActivityResult(int i10, int i11, Intent intent) {
        AtomicReference atomicReference = this.f11742b;
        h0 h0Var = (h0) atomicReference.get();
        e eVar = this.f11746f;
        if (i10 != 1) {
            if (i10 == 2) {
                int iC = this.f11744d.c(getActivity(), i9.e.f42928a);
                if (iC == 0) {
                    atomicReference.set(null);
                    u6 u6Var = eVar.f11705n;
                    u6Var.sendMessage(u6Var.obtainMessage(3));
                    return;
                } else {
                    if (h0Var == null) {
                        return;
                    }
                    if (h0Var.f11716b.f11641b == 18 && iC == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            atomicReference.set(null);
            u6 u6Var2 = eVar.f11705n;
            u6Var2.sendMessage(u6Var2.obtainMessage(3));
            return;
        } else if (i11 == 0) {
            if (h0Var != null) {
                ConnectionResult connectionResult = new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, h0Var.f11716b.toString());
                int i12 = h0Var.f11715a;
                atomicReference.set(null);
                eVar.h(connectionResult, i12);
                return;
            }
            return;
        }
        if (h0Var != null) {
            ConnectionResult connectionResult2 = h0Var.f11716b;
            int i13 = h0Var.f11715a;
            atomicReference.set(null);
            eVar.h(connectionResult2, i13);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ConnectionResult connectionResult = new ConnectionResult(13, null, null);
        AtomicReference atomicReference = this.f11742b;
        h0 h0Var = (h0) atomicReference.get();
        int i10 = h0Var == null ? -1 : h0Var.f11715a;
        atomicReference.set(null);
        this.f11746f.h(connectionResult, i10);
    }

    @Override // com.google.android.gms.common.api.internal.g
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f11742b.set(bundle.getBoolean("resolving_error", false) ? new h0(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"), null), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.g
    public final void onResume() {
        super.onResume();
        if (this.f11745e.isEmpty()) {
            return;
        }
        this.f11746f.e(this);
    }

    @Override // com.google.android.gms.common.api.internal.g
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        h0 h0Var = (h0) this.f11742b.get();
        if (h0Var == null) {
            return;
        }
        ConnectionResult connectionResult = h0Var.f11716b;
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", h0Var.f11715a);
        bundle.putInt("failed_status", connectionResult.f11641b);
        bundle.putParcelable("failed_resolution", connectionResult.f11642c);
    }

    @Override // com.google.android.gms.common.api.internal.g
    public final void onStart() {
        super.onStart();
        this.f11741a = true;
        if (this.f11745e.isEmpty()) {
            return;
        }
        this.f11746f.e(this);
    }

    @Override // com.google.android.gms.common.api.internal.g
    public final void onStop() {
        this.f11741a = false;
        e eVar = this.f11746f;
        eVar.getClass();
        synchronized (e.f11691r) {
            try {
                if (eVar.f11703k == this) {
                    eVar.f11703k = null;
                    eVar.l.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
