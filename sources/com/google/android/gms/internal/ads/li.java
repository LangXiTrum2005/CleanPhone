package com.google.android.gms.internal.ads;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.KeyguardManager;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class li extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f16997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pb f16998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f17001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f17002h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f17003i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f17004j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f17005k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f17006m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f17007n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f17008o;

    public li() {
        pb pbVar = new pb(4, false);
        this.f16995a = false;
        this.f16996b = false;
        this.f16998d = pbVar;
        this.f16997c = new Object();
        this.f17000f = ((Long) ym.f22307d.o()).intValue();
        this.f17001g = ((Long) ym.f22304a.o()).intValue();
        this.f17002h = ((Long) ym.f22308e.o()).intValue();
        this.f17003i = ((Long) ym.f22306c.o()).intValue();
        this.f17004j = ((Integer) zzba.zzc().a(am.L0)).intValue();
        this.f17005k = ((Integer) zzba.zzc().a(am.M0)).intValue();
        this.l = ((Integer) zzba.zzc().a(am.N0)).intValue();
        this.f16999e = ((Long) ym.f22309f.o()).intValue();
        this.f17006m = (String) zzba.zzc().a(am.P0);
        this.f17007n = ((Boolean) zzba.zzc().a(am.Q0)).booleanValue();
        this.f17008o = ((Boolean) zzba.zzc().a(am.R0)).booleanValue();
        ((Boolean) zzba.zzc().a(am.S0)).getClass();
        setName("ContentFetchTask");
    }

    public final n3 a(View view, gi giVar) {
        if (view == null) {
            return new n3(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new n3(this, 0, 0);
            }
            giVar.c(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new n3(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof b30)) {
            WebView webView = (WebView) view;
            synchronized (giVar.f14867g) {
                giVar.f14872m++;
            }
            webView.post(new o1(this, giVar, webView, globalVisibleRect));
            return new n3(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new n3(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
            n3 n3VarA = a(viewGroup.getChildAt(i12), giVar);
            i10 += n3VarA.f17624a;
            i11 += n3VarA.f17625b;
        }
        return new n3(this, i10, i11);
    }

    public final void b() {
        synchronized (this.f16997c) {
            this.f16996b = true;
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("ContentFetchThread: paused, pause = true");
            String string = sb2.toString();
            int i10 = zze.zza;
            zzo.zzd(string);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00cb A[Catch: Exception -> 0x007c, InterruptedException -> 0x007e, TryCatch #7 {InterruptedException -> 0x007e, Exception -> 0x007c, blocks: (B:33:0x0067, B:35:0x0071, B:58:0x00d5, B:50:0x00b3, B:48:0x00a1, B:57:0x00cb, B:56:0x00c2, B:41:0x0080, B:43:0x0086, B:45:0x0090, B:2:0x0000, B:3:0x0006, B:15:0x0019, B:18:0x002d, B:20:0x0033, B:21:0x0037, B:23:0x003d, B:25:0x004b, B:27:0x0051, B:29:0x0057, B:31:0x0061, B:55:0x00c1, B:4:0x0007, B:6:0x000c, B:7:0x000e, B:11:0x0013), top: B:85:0x0067, inners: #0, #6 }] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        View viewFindViewById;
        Application application;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        while (true) {
            try {
                ji jiVarZzg = zzt.zzg();
                synchronized (jiVarZzg.f16100a) {
                    try {
                        hi hiVar = jiVarZzg.f16101b;
                        viewFindViewById = null;
                        application = hiVar != null ? hiVar.f15295b : null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (application != null) {
                    ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
                    KeyguardManager keyguardManager = (KeyguardManager) application.getSystemService("keyguard");
                    if (activityManager != null && keyguardManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                ActivityManager.RunningAppProcessInfo next = it.next();
                                if (Process.myPid() == next.pid) {
                                    if (next.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode() || (powerManager = (PowerManager) application.getSystemService("power")) == null || !powerManager.isScreenOn()) {
                                        break;
                                    }
                                    try {
                                        Activity activityD = zzt.zzg().d();
                                        if (activityD != null) {
                                            try {
                                                if (activityD.getWindow() != null && activityD.getWindow().getDecorView() != null) {
                                                    viewFindViewById = activityD.getWindow().getDecorView().findViewById(R.id.content);
                                                }
                                            } catch (Exception e10) {
                                                zzt.zzh().d("ContentFetchTask.extractContent", e10);
                                                int i10 = zze.zza;
                                                zzo.zzd("Failed getting root view of activity. Content not extracted.");
                                            }
                                            if (viewFindViewById == null) {
                                                break;
                                            }
                                            viewFindViewById.post(new zd1(this, false, viewFindViewById, 5));
                                            break;
                                        }
                                        int i11 = zze.zza;
                                        zzo.zzd("ContentFetchThread: no activity. Sleeping.");
                                        b();
                                        break;
                                    } catch (InterruptedException e11) {
                                        int i12 = zze.zza;
                                        zzo.zzg("Error in ContentFetchTask", e11);
                                    } catch (Exception e12) {
                                        int i13 = zze.zza;
                                        zzo.zzg("Error in ContentFetchTask", e12);
                                        zzt.zzh().d("ContentFetchTask.run", e12);
                                    }
                                }
                            }
                            int i14 = zze.zza;
                            zzo.zzd("ContentFetchTask: sleeping");
                            b();
                            break;
                        }
                    }
                    int i15 = zze.zza;
                    zzo.zzd("ContentFetchTask: sleeping");
                    b();
                    break;
                }
                int i16 = zze.zza;
                zzo.zzd("ContentFetchTask: sleeping");
                b();
                break;
            } catch (Throwable th3) {
                zzt.zzh().d("ContentFetchTask.isInForeground", th3);
            }
            Thread.sleep(this.f16999e * 1000);
            Object obj = this.f16997c;
            synchronized (obj) {
                while (this.f16996b) {
                    try {
                        int i17 = zze.zza;
                        zzo.zzd("ContentFetchTask: waiting");
                        obj.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }
}
