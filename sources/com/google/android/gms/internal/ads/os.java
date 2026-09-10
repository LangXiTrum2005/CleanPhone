package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class os implements oq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f18352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vs f18353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ms f18354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws f18355d;

    public os(ws wsVar, long j10, vs vsVar, ms msVar) {
        this.f18352a = j10;
        this.f18353b = vsVar;
        this.f18354c = msVar;
        this.f18355d = wsVar;
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final void b(Object obj, Map map) {
        ((p9.b) zzt.zzk()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f18352a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 42);
        sb2.append("onGmsg /jsLoaded. JsLoaded latency is ");
        sb2.append(jCurrentTimeMillis);
        sb2.append(" ms.");
        zze.zza(sb2.toString());
        zze.zza("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        ws wsVar = this.f18355d;
        synchronized (wsVar.f21596d) {
            zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            vs vsVar = this.f18353b;
            if (((AtomicInteger) vsVar.f18848b).get() != -1 && ((AtomicInteger) vsVar.f18848b).get() != 1) {
                wsVar.f21595c = 0;
                ms msVar = this.f18354c;
                msVar.z("/log", nq.f17892c);
                msVar.z("/result", nq.f17899j);
                ((m00) vsVar.f18847a).zzc(msVar);
                wsVar.f21601i = vsVar;
                zze.zza("Successfully loaded JS Engine.");
                zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
