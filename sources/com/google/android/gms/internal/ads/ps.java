package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ps implements oq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18788a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f18790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f18791d;

    public ps(ws wsVar, ms msVar, zzbv zzbvVar) {
        this.f18789b = msVar;
        this.f18790c = zzbvVar;
        this.f18791d = wsVar;
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final void b(Object obj, Map map) {
        switch (this.f18788a) {
            case 0:
                zze.zza("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
                ws wsVar = (ws) this.f18791d;
                synchronized (wsVar.f21596d) {
                    try {
                        zze.zza("loadJavascriptEngine > /requestReload handler: Lock acquired");
                        zzo.zzh("JS Engine is requesting an update");
                        if (wsVar.f21595c == 0) {
                            zzo.zzh("Starting reload.");
                            wsVar.f21595c = 2;
                            wsVar.d();
                        }
                        ((ms) this.f18789b).k("/requestReload", (oq) ((zzbv) this.f18790c).zza());
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                zze.zza("loadJavascriptEngine > /requestReload handler: Lock released");
                return;
            default:
                String str = (String) map.get("asset");
                try {
                    ((ip) this.f18789b).K0((ap) ((dx1) this.f18791d).zzb(), str);
                    return;
                } catch (RemoteException e10) {
                    String strJ = q4.a.j(new StringBuilder(String.valueOf(str).length() + 40), "Failed to call onCustomClick for asset ", str, ".");
                    int i10 = zze.zza;
                    zzo.zzj(strJ, e10);
                    return;
                }
        }
    }

    public ps(ne0 ne0Var, je0 je0Var, ng0 ng0Var, dx1 dx1Var) {
        this.f18789b = (ip) ne0Var.f17787g.get(je0Var.g());
        this.f18790c = ng0Var;
        this.f18791d = dx1Var;
    }
}
