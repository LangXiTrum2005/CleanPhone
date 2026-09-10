package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.ConnectionResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ok0 extends sk0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f18293h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f18294i;

    public ok0(Context context, k00 k00Var, int i10) {
        this.f18292g = i10;
        switch (i10) {
            case 1:
                this.f18293h = context;
                this.f18294i = k00Var;
                this.f19991f = new hj(context, zzt.zzs().zza(), this, this, 2);
                break;
            default:
                this.f18293h = context;
                this.f18294i = k00Var;
                this.f19991f = new hj(context, zzt.zzs().zza(), this, this, 2);
                break;
        }
    }

    public ListenableFuture c(mx mxVar) {
        synchronized (this.f19987b) {
            try {
                if (this.f19988c) {
                    return this.f19986a;
                }
                this.f19988c = true;
                this.f19990e = mxVar;
                this.f19991f.checkAvailabilityAndConnect();
                m00 m00Var = this.f19986a;
                m00Var.addListener(new x60(this, 14), l00.f16615h);
                sk0.b(this.f18293h, m00Var, this.f18294i);
                return m00Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // k9.b
    public final void d(Bundle bundle) {
        switch (this.f18292g) {
            case 0:
                synchronized (this.f19987b) {
                    try {
                        if (!this.f19989d) {
                            this.f19989d = true;
                            try {
                                try {
                                    ((gx) this.f19991f.getService()).B0(this.f19990e, ((Boolean) zzba.zzc().a(am.Ge)).booleanValue() ? new rk0(this.f19986a, this.f19990e) : new qk0(this));
                                } catch (Throwable th2) {
                                    zzt.zzh().d("RemoteAdRequestClientTask.onConnected", th2);
                                    this.f19986a.zzd(new yk0(1));
                                }
                            } catch (RemoteException | IllegalArgumentException unused) {
                                this.f19986a.zzd(new yk0(1));
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return;
            default:
                synchronized (this.f19987b) {
                    try {
                        if (!this.f19989d) {
                            this.f19989d = true;
                            try {
                                ((gx) this.f19991f.getService()).V0(this.f19990e, ((Boolean) zzba.zzc().a(am.Ge)).booleanValue() ? new rk0(this.f19986a, this.f19990e) : new qk0(this));
                            } catch (RemoteException | IllegalArgumentException unused2) {
                                this.f19986a.zzd(new yk0(1));
                            } catch (Throwable th4) {
                                zzt.zzh().d("RemoteSignalsClientTask.onConnected", th4);
                                this.f19986a.zzd(new yk0(1));
                            }
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                    break;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.sk0, k9.c
    public void r(ConnectionResult connectionResult) {
        switch (this.f18292g) {
            case 0:
                int i10 = zze.zza;
                zzo.zzd("Cannot connect to remote service, fallback to local instance.");
                this.f19986a.zzd(new yk0(1));
                break;
            default:
                super.r(connectionResult);
                break;
        }
    }
}
