package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class rs implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ws f19650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vs f19651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ms f19652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f19653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f19654f;

    public /* synthetic */ rs(ws wsVar, vs vsVar, ms msVar, ArrayList arrayList, long j10, int i10) {
        this.f19649a = i10;
        this.f19651c = vsVar;
        this.f19652d = msVar;
        this.f19653e = arrayList;
        this.f19654f = j10;
        this.f19650b = wsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string;
        switch (this.f19649a) {
            case 0:
                zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
                ws wsVar = this.f19650b;
                synchronized (wsVar.f21596d) {
                    try {
                        zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                        vs vsVar = this.f19651c;
                        if (((AtomicInteger) vsVar.f18848b).get() != -1 && ((AtomicInteger) vsVar.f18848b).get() != 1) {
                            if (((Boolean) zzba.zzc().a(am.L8)).booleanValue()) {
                                vsVar.s("SdkJavascriptFactory.loadJavascriptEngine.Runnable", new TimeoutException("Unable to fully load JS engine."));
                            } else {
                                vsVar.r();
                            }
                            l00.f16613f.execute(new qs(this.f19652d, 0));
                            String strValueOf = String.valueOf(zzba.zzc().a(am.f12125e));
                            int i10 = ((AtomicInteger) vsVar.f18848b).get();
                            int i11 = wsVar.f21595c;
                            ArrayList arrayList = this.f19653e;
                            if (arrayList.isEmpty()) {
                                string = ". Still waiting for the engine to be loaded";
                            } else {
                                String strValueOf2 = String.valueOf(arrayList.get(0));
                                StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 88);
                                sb2.append(". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ");
                                sb2.append(strValueOf2);
                                string = sb2.toString();
                            }
                            ((p9.b) zzt.zzk()).getClass();
                            long jCurrentTimeMillis = System.currentTimeMillis() - this.f19654f;
                            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 107 + String.valueOf(i10).length() + 36 + String.valueOf(i11).length() + string.length() + 39 + String.valueOf(jCurrentTimeMillis).length() + 26);
                            sb3.append("Could not finish the full JS engine loading in ");
                            sb3.append(strValueOf);
                            sb3.append(" ms. JS engine session reference status(fullLoadTimeout) is ");
                            sb3.append(i10);
                            sb3.append(". Update status(fullLoadTimeout) is ");
                            sb3.append(i11);
                            sb3.append(string);
                            sb3.append(" ms. Total latency(fullLoadTimeout) is ");
                            sb3.append(jCurrentTimeMillis);
                            sb3.append(" ms at timeout. Rejecting.");
                            zze.zza(sb3.toString());
                            zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                            return;
                        }
                        zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            default:
                ws wsVar2 = this.f19650b;
                vs vsVar2 = this.f19651c;
                ms msVar = this.f19652d;
                ArrayList arrayList2 = this.f19653e;
                long j10 = this.f19654f;
                zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
                synchronized (wsVar2.f21596d) {
                    try {
                        zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                        if (((AtomicInteger) vsVar2.f18848b).get() != -1 && ((AtomicInteger) vsVar2.f18848b).get() != 1) {
                            if (((Boolean) zzba.zzc().a(am.L8)).booleanValue()) {
                                vsVar2.s("SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener", new TimeoutException("Unable to receive /jsLoaded GMSG."));
                            } else {
                                vsVar2.r();
                            }
                            l00.f16613f.execute(new qs(msVar, 1));
                            String strValueOf3 = String.valueOf(zzba.zzc().a(am.f12108d));
                            int i12 = ((AtomicInteger) vsVar2.f18848b).get();
                            int i13 = wsVar2.f21595c;
                            String strValueOf4 = String.valueOf(arrayList2.get(0));
                            ((p9.b) zzt.zzk()).getClass();
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - j10;
                            StringBuilder sb4 = new StringBuilder(strValueOf3.length() + 94 + String.valueOf(i12).length() + 39 + String.valueOf(i13).length() + 57 + strValueOf4.length() + 42 + String.valueOf(jCurrentTimeMillis2).length() + 15);
                            sb4.append("Could not receive /jsLoaded in ");
                            sb4.append(strValueOf3);
                            sb4.append(" ms. JS engine session reference status(onEngLoadedTimeout) is ");
                            sb4.append(i12);
                            sb4.append(". Update status(onEngLoadedTimeout) is ");
                            sb4.append(i13);
                            sb4.append(". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is ");
                            sb4.append(strValueOf4);
                            sb4.append(" ms. Total latency(onEngLoadedTimeout) is ");
                            sb4.append(jCurrentTimeMillis2);
                            sb4.append(" ms. Rejecting.");
                            zze.zza(sb4.toString());
                            zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                            return;
                        }
                        zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
                        return;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
        }
    }
}
