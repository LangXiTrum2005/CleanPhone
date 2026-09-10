package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.util.JsonWriter;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.X3;
import com.ironsource.Yf;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hi0 implements AppEventListener, mb0, zza, da0, na0, oa0, ta0, ha0, zv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gi0 f15305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f15306c;

    public hi0(gi0 gi0Var, a50 a50Var) {
        this.f15305b = gi0Var;
        this.f15304a = Collections.singletonList(a50Var);
    }

    @Override // com.google.android.gms.internal.ads.oa0
    public final void C(Context context) {
        Y(oa0.class, X3.i.f27817u0, context);
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void J() {
        Y(da0.class, Yf.f28051g, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zv0
    public final void O(vv0 vv0Var, String str) {
        Y(xv0.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void Q() {
        Y(da0.class, Yf.f28047c, new Object[0]);
    }

    public final void Y(Class cls, String str, Object... objArr) {
        String simpleName = cls.getSimpleName();
        List list = this.f15304a;
        String strConcat = "Event-".concat(simpleName);
        gi0 gi0Var = this.f15305b;
        gi0Var.getClass();
        if (((Boolean) hn.f15331a.o()).booleanValue()) {
            ((p9.b) gi0Var.f14877a).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(jCurrentTimeMillis);
                jsonWriter.name("source").value(strConcat);
                jsonWriter.name(NotificationCompat.CATEGORY_EVENT).value(str);
                jsonWriter.name("components").beginArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    Object obj = objArr[i10];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e10) {
                int i11 = zze.zza;
                zzo.zzg("unable to log", e10);
            }
            String strValueOf = String.valueOf(stringWriter.toString());
            int i12 = zze.zza;
            zzo.zzh("AD-DBG ".concat(strValueOf));
        }
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void Z() {
        Y(da0.class, Yf.f28055k, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.oa0
    public final void a(Context context) {
        Y(oa0.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zv0
    public final void b(vv0 vv0Var, String str) {
        Y(xv0.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zv0
    public final void e(vv0 vv0Var, String str, Throwable th2) {
        Y(xv0.class, "onTaskFailed", str, th2.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void f(sx sxVar, String str, String str2) {
        Y(da0.class, "onRewarded", sxVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.ha0
    public final void j0(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Y(ha0.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.na0
    public final void k() {
        Y(na0.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        Y(zza.class, Yf.f28050f, new Object[0]);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        Y(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final void q0(mx mxVar) {
        ((p9.b) zzt.zzk()).getClass();
        this.f15306c = SystemClock.elapsedRealtime();
        Y(mb0.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zv0
    public final void v(String str) {
        Y(xv0.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.oa0
    public final void zza(Context context) {
        Y(oa0.class, X3.i.t0, context);
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void zze() {
        Y(da0.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void zzf() {
        Y(da0.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final void zzg() {
        ((p9.b) zzt.zzk()).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f15306c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime).length() + 21);
        sb2.append("Ad Request Latency : ");
        sb2.append(jElapsedRealtime);
        zze.zza(sb2.toString());
        Y(ta0.class, Yf.f28054j, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final void z(ju0 ju0Var) {
    }
}
