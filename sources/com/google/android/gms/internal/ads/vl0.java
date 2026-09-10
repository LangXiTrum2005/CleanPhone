package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vl0 extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21197a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Timer f21198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f21200d;

    public vl0(zl0 zl0Var, AlertDialog alertDialog, Timer timer, zzm zzmVar) {
        this.f21199c = alertDialog;
        this.f21198b = timer;
        this.f21200d = zzmVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.f21197a) {
            case 0:
                ((AlertDialog) this.f21199c).dismiss();
                this.f21198b.cancel();
                zzm zzmVar = (zzm) this.f21200d;
                if (zzmVar != null) {
                    zzmVar.zzb();
                }
                break;
            default:
                r4.g.d(((oy0) this.f21200d).f18406b, "omidJsSessionService");
                r30 r30Var = ((n30) ((b21) this.f21199c).f12616b).f17626a;
                y01 y01Var = zzs.zza;
                Objects.requireNonNull(r30Var);
                y01Var.post(new m30(r30Var, 0));
                this.f21198b.cancel();
                break;
        }
    }

    public vl0(oy0 oy0Var, b21 b21Var, Timer timer) {
        this.f21199c = b21Var;
        this.f21198b = timer;
        Objects.requireNonNull(oy0Var);
        this.f21200d = oy0Var;
    }
}
