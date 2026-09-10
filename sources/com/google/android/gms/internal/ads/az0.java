package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.util.zzaz;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class az0 implements zb0, yd1, hm0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final az0 f12552b = new az0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f12553a;

    public /* synthetic */ az0(Context context) {
        this.f12553a = context;
    }

    @Override // com.google.android.gms.internal.ads.hm0
    /* JADX INFO: renamed from: zza */
    public Object mo166zza() {
        n6 n6Var = pi1.L;
        if (n6Var.f17679b) {
            return Boolean.TRUE;
        }
        Context applicationContext = this.f12553a.getApplicationContext();
        if (applicationContext == null) {
            throw new IllegalArgumentException("Application Context cannot be null");
        }
        if (!n6Var.f17679b) {
            int i10 = 1;
            n6Var.f17679b = true;
            bz0 bz0VarA = bz0.a();
            bz0VarA.getClass();
            bz0VarA.f12942b = new sy0(new Handler(), applicationContext, bz0VarA);
            boolean z10 = applicationContext instanceof Application;
            if (z10) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(uy0.f20962d);
            }
            x10.A = (UiModeManager) applicationContext.getSystemService("uimode");
            WindowManager windowManager = hz0.f15437a;
            hz0.f15439c = applicationContext.getResources().getDisplayMetrics().density;
            hz0.f15437a = (WindowManager) applicationContext.getSystemService("window");
            applicationContext.registerReceiver(new com.google.android.gms.internal.measurement.ge(i10), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
            f12552b.f12553a = applicationContext.getApplicationContext();
            ty0 ty0Var = ty0.f20527e;
            if (!ty0Var.f20528a) {
                xy0 xy0Var = (xy0) ty0Var.f20531d;
                if (z10) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(xy0Var);
                }
                xy0Var.f22038c = ty0Var;
                xy0Var.f22036a = true;
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                xy0Var.f22037b = runningAppProcessInfo.importance == 100;
                ty0Var.f20529b = xy0Var.f22037b;
                ty0Var.f20528a = true;
            }
            cz0.f13317d.f13318a = new WeakReference(applicationContext);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            applicationContext.registerReceiver(new q7.c(), intentFilter);
        }
        return Boolean.valueOf(n6Var.f17679b);
    }

    @Override // com.google.android.gms.internal.ads.yd1
    /* JADX INFO: renamed from: zzb */
    public /* bridge */ /* synthetic */ void mo164zzb(Object obj) {
        if (((Boolean) zm.f22668j.o()).booleanValue()) {
            x10.w(this.f12553a);
        }
    }

    @Override // com.google.android.gms.internal.ads.zb0
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo160zza(Object obj) {
        ((oa0) obj).zza(this.f12553a);
    }

    @Override // com.google.android.gms.internal.ads.yd1
    public void zza(Throwable th2) {
        if (((Boolean) zm.f22666h.o()).booleanValue() && (th2 instanceof zzaz)) {
            x10.w(this.f12553a);
        }
    }
}
