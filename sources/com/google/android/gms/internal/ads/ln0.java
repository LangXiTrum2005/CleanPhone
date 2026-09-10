package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.provider.MediaStore;
import android.provider.Settings;
import android.util.Log;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.B5;
import com.ironsource.O6;
import com.unity3d.services.UnityAdsConstants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ln0 implements gd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f17072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f17073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f17074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f17075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f17076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f17077h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f17078i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f17079j;

    public ln0(Context context, VersionInfoParcel versionInfoParcel, m00 m00Var, du0 du0Var, b30 b30Var, ou0 ou0Var, boolean z10, rq rqVar, zl0 zl0Var, yh0 yh0Var) {
        this.f17071b = context;
        this.f17072c = versionInfoParcel;
        this.f17073d = m00Var;
        this.f17074e = du0Var;
        this.f17075f = b30Var;
        this.f17076g = ou0Var;
        this.f17077h = rqVar;
        this.f17070a = z10;
        this.f17078i = zl0Var;
        this.f17079j = yh0Var;
    }

    public void a(int i10, long j10) {
        if (i10 == 0) {
            new pd.f("Unable to fetch the latest version of the template.");
            g();
        } else {
            ((ScheduledExecutorService) this.f17076g).schedule(new p1(this, i10, j10, 1), ((Random) this.f17077h).nextInt(4), TimeUnit.SECONDS);
        }
    }

    public void b(InputStream inputStream) throws IOException {
        boolean zIsEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, B5.O));
        String strH = "";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            strH = wi.d.h(strH, line);
            if (line.contains("}")) {
                int iIndexOf = strH.indexOf(123);
                int iLastIndexOf = strH.lastIndexOf(125);
                strH = (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? "" : strH.substring(iIndexOf, iLastIndexOf + 1);
                if (strH.isEmpty()) {
                    continue;
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(strH);
                        if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                            qd.j jVar = (qd.j) this.f17075f;
                            new pd.f("The server is temporarily unavailable. Try again in a few minutes.");
                            jVar.a();
                            break;
                        }
                        synchronized (this) {
                            zIsEmpty = ((LinkedHashSet) this.f17071b).isEmpty();
                        }
                        if (zIsEmpty) {
                            break;
                        }
                        if (jSONObject.has("latestTemplateVersionNumber")) {
                            long j10 = ((qd.g) this.f17073d).f48971g.f49007a.getLong("last_template_version", 0L);
                            long j11 = jSONObject.getLong("latestTemplateVersionNumber");
                            if (j11 > j10) {
                                a(3, j11);
                            }
                        }
                        if (jSONObject.has("retryIntervalSeconds")) {
                            i(jSONObject.getInt("retryIntervalSeconds"));
                        }
                        strH = "";
                    } catch (JSONException e10) {
                        new pd.c("Unable to parse config update message.", e10.getCause());
                        g();
                        Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e10);
                    }
                }
            }
        }
        bufferedReader.close();
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public void c(boolean z10, Context context, ka0 ka0Var) {
        boolean z11;
        float f10;
        boolean z12;
        rq rqVar = (rq) this.f17077h;
        bd0 bd0Var = (bd0) zw1.H((m00) this.f17073d);
        b30 b30Var = (b30) this.f17075f;
        b30Var.M(true);
        boolean z13 = this.f17070a;
        boolean z14 = false;
        boolean zA = z13 ? rqVar.a(false) : false;
        zzt.zzc();
        boolean zZzL = zzs.zzL((Context) this.f17071b);
        if (z13) {
            synchronized (rqVar) {
                z12 = rqVar.f19637b;
            }
            if (z12) {
                z14 = true;
                z11 = z14;
            } else {
                z11 = false;
                z14 = true;
            }
        } else {
            z11 = z14;
        }
        if (z14) {
            synchronized (rqVar) {
                f10 = rqVar.f19638c;
            }
        } else {
            f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f11 = f10;
        du0 du0Var = (du0) this.f17074e;
        zzl zzlVar = new zzl(zA, zZzL, z11, f11, -1, z10, du0Var.O, false);
        if (ka0Var != null) {
            ka0Var.X0();
        }
        zzt.zzb();
        dd0 dd0Var = (dd0) ((h50) bd0Var).f15165p0.zzb();
        int i10 = du0Var.Q;
        VersionInfoParcel versionInfoParcel = (VersionInfoParcel) this.f17072c;
        String str = du0Var.B;
        hu0 hu0Var = du0Var.f13708s;
        zzn.zza(context, new AdOverlayInfoParcel(null, dd0Var, null, b30Var, i10, versionInfoParcel, str, zzlVar, hu0Var.f15395b, hu0Var.f15394a, ((ou0) this.f17076g).f18366g, ka0Var, du0Var.b() ? (zl0) this.f17078i : null, b30Var.zzn()), true, (yh0) this.f17079j);
    }

    public void d() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f17072c;
        if (httpURLConnection == null) {
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = httpURLConnection.getInputStream();
                    b(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (Throwable th2) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e10) {
                            Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e10);
                        }
                    }
                    throw th2;
                }
            } catch (IOException e11) {
                if (!this.f17070a) {
                    Log.d("FirebaseRemoteConfig", "Real-time connection was closed due to an exception.", e11);
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (IOException e12) {
            Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e12);
        }
    }

    public void e(r1.b bVar) {
        if (!this.f17070a || bVar.equals((r1.b) this.f17077h)) {
            return;
        }
        this.f17077h = bVar;
        r1.u uVar = (r1.u) ((k3.j) this.f17072c).f44293b;
        uVar.f();
        r1.b bVar2 = uVar.f49364g;
        if (bVar2 == null || bVar.equals(bVar2)) {
            return;
        }
        uVar.f49364g = bVar;
        mk0 mk0Var = uVar.f49362e;
        if (mk0Var != null) {
            mk0Var.e(-1, new r1.q(3));
        }
    }

    public void f(Uri uri, String str, Long l, Long l10, int i10) {
        HashMap mapN = xj.b0.N(new wj.f(O6.H, "android"), new wj.f("uri", String.valueOf(uri)), new wj.f("type", str), new wj.f("mediaType", Integer.valueOf(i10)));
        if (l != null) {
            mapN.put("id", l);
        }
        if (l10 != null) {
            mapN.put("galleryId", l10);
        }
        l8.a.a(mapN);
        ((xi.p) this.f17079j).a("change", mapN, null);
    }

    public synchronized void g() {
        Iterator it = ((LinkedHashSet) this.f17071b).iterator();
        while (it.hasNext()) {
            ((qd.j) it.next()).a();
        }
    }

    public void h(d8.d dVar, Uri uri) {
        ((Context) this.f17071b).getContentResolver().registerContentObserver(uri, true, dVar);
        dVar.getClass();
        kotlin.jvm.internal.n.f(uri, "<set-?>");
    }

    public synchronized void i(int i10) {
        ((p9.b) this.f17078i).getClass();
        Date date = new Date(new Date(System.currentTimeMillis()).getTime() + (((long) i10) * 1000));
        qd.m mVar = (qd.m) this.f17079j;
        synchronized (mVar.f49010d) {
            mVar.f49007a.edit().putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public void j(Runnable runnable) {
        ((Handler) ((q81) this.f17072c).zza()).post(new r71(this, runnable, 1));
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public du0 zzb() {
        return (du0) this.f17074e;
    }

    public ln0() {
        this.f17071b = new HashMap();
        this.f17072c = new HashMap();
        this.f17073d = new HashMap();
        this.f17074e = new HashSet();
        this.f17075f = new HashSet();
        this.f17076g = new HashSet();
        this.f17077h = new HashMap();
        this.f17078i = new HashSet();
        this.f17079j = new WeakHashMap();
    }

    public ln0(Context context, tf1 tf1Var, Intent intent) {
        this.f17075f = new ArrayList();
        this.f17071b = context;
        this.f17073d = tf1Var;
        this.f17074e = "OverlayDisplayService";
        this.f17076g = intent;
        this.f17072c = x10.d(new tt0((byte) 0, 6));
        this.f17077h = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.q71
            @Override // android.os.IBinder.DeathRecipient
            public final /* synthetic */ void binderDied() {
                ln0 ln0Var = this.f18967a;
                ((tf1) ln0Var.f17073d).b("%s : Binder has died.", (String) ln0Var.f17074e);
                ArrayList arrayList = (ArrayList) ln0Var.f17075f;
                synchronized (arrayList) {
                    arrayList.clear();
                }
            }
        };
    }

    public ln0(Context applicationContext, xi.f messenger, Handler handler) {
        kotlin.jvm.internal.n.f(applicationContext, "applicationContext");
        kotlin.jvm.internal.n.f(messenger, "messenger");
        this.f17071b = applicationContext;
        this.f17072c = new d8.d(this, 3, handler);
        this.f17073d = new d8.d(this, 1, handler);
        this.f17074e = new d8.d(this, 2, handler);
        g8.f.f41737a.getClass();
        this.f17075f = g8.e.a();
        this.f17076g = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        this.f17077h = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        this.f17078i = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        this.f17079j = new xi.p(messenger, "com.fluttercandies/photo_manager/notify");
    }

    public ln0(HttpURLConnection httpURLConnection, qd.g gVar, qd.b bVar, LinkedHashSet linkedHashSet, qd.j jVar, ScheduledExecutorService scheduledExecutorService, qd.m mVar) {
        this.f17072c = httpURLConnection;
        this.f17073d = gVar;
        this.f17074e = bVar;
        this.f17071b = linkedHashSet;
        this.f17075f = jVar;
        this.f17076g = scheduledExecutorService;
        this.f17077h = new Random();
        this.f17070a = false;
        this.f17079j = mVar;
        this.f17078i = p9.b.f48278a;
    }

    public ln0(Context context, k3.j jVar, i1.e eVar, AudioDeviceInfo audioDeviceInfo) {
        ln0 ln0Var;
        Context applicationContext = context.getApplicationContext();
        this.f17071b = applicationContext;
        this.f17072c = jVar;
        this.f17079j = eVar;
        this.f17078i = audioDeviceInfo;
        String str = l1.y.f44830a;
        Looper looperMyLooper = Looper.myLooper();
        n02 n02Var = null;
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.f17073d = handler;
        this.f17074e = new m02(this, 1);
        this.f17075f = new q7.c(this, 15);
        r1.b bVar = r1.b.f49250c;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        if (uriFor != null) {
            ln0Var = this;
            n02Var = new n02(ln0Var, handler, applicationContext.getContentResolver(), uriFor, 1);
        } else {
            ln0Var = this;
        }
        ln0Var.f17076g = n02Var;
    }
}
