package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.tasks.Tasks;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zp0 implements bs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f22687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f22688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f22689d;

    public zp0(f00 f00Var, ScheduledExecutorService scheduledExecutorService, fe1 fe1Var) {
        this.f22686a = 4;
        this.f22687b = f00Var;
        this.f22689d = scheduledExecutorService;
        this.f22688c = fe1Var;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0114  */
    @Override // com.google.android.gms.internal.ads.bs0
    public final ListenableFuture zza() {
        String strValueOf;
        String installingPackageName;
        String str;
        String str2;
        int i10 = this.f22686a;
        String str3 = null;
        Object obj = this.f22687b;
        Object obj2 = this.f22689d;
        Object obj3 = this.f22688c;
        switch (i10) {
            case 0:
                Executor executor = (Executor) obj3;
                ListenableFuture listenableFutureX = zw1.x((ListenableFuture) obj, c60.f13064i, executor);
                ul ulVar = am.f12185he;
                if (((Integer) zzba.zzc().a(ulVar)).intValue() > 0) {
                    listenableFutureX = zw1.v(listenableFutureX, ((Integer) zzba.zzc().a(ulVar)).intValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) obj2);
                }
                return zw1.u(listenableFutureX, Throwable.class, c60.f13063h, executor);
            case 1:
                return ((k00) ((fe1) obj)).b(new sf(this, 11));
            case 2:
                Context context = (Context) obj2;
                String str4 = ((ApplicationInfo) obj).packageName;
                PackageInfo packageInfo = (PackageInfo) obj3;
                Integer numValueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
                String str5 = packageInfo == null ? null : packageInfo.versionName;
                try {
                    y01 y01Var = zzs.zza;
                    Context context2 = r9.c.a(context).f40681b;
                    strValueOf = String.valueOf(context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(str4, 0)));
                } catch (PackageManager.NameNotFoundException unused) {
                    strValueOf = null;
                }
                if (((Boolean) zzba.zzc().a(am.f12411we)).booleanValue()) {
                    try {
                        InstallSourceInfo installSourceInfo = context.getPackageManager().getInstallSourceInfo(str4);
                        if (installSourceInfo != null) {
                            installingPackageName = installSourceInfo.getInstallingPackageName();
                            try {
                                if (TextUtils.isEmpty(installingPackageName)) {
                                    zze.zza("No installing package name found");
                                    installingPackageName = null;
                                }
                                try {
                                    String initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                                    try {
                                        if (TextUtils.isEmpty(initiatingPackageName)) {
                                            zze.zza("No initiating package name found");
                                            str = str3;
                                        } else {
                                            str = initiatingPackageName;
                                        }
                                    } catch (PackageManager.NameNotFoundException e10) {
                                        e = e10;
                                        str3 = initiatingPackageName;
                                        zzt.zzh().d("PackageInfoSignalSource.getInstallSourceInfo", e);
                                    }
                                } catch (PackageManager.NameNotFoundException e11) {
                                    e = e11;
                                }
                            } catch (PackageManager.NameNotFoundException e12) {
                                e = e12;
                            }
                            str2 = installingPackageName;
                        } else {
                            str2 = null;
                            str = null;
                        }
                    } catch (PackageManager.NameNotFoundException e13) {
                        e = e13;
                        installingPackageName = null;
                    }
                } else {
                    str2 = null;
                    str = null;
                }
                return zw1.d(new pr0(str4, numValueOf, str5, strValueOf, str2, str));
            case 3:
                return ((k00) ((fe1) obj3)).b(new sf(this, 24));
            default:
                if (((Boolean) zzba.zzc().a(am.W3)).booleanValue()) {
                    if (((Boolean) zzba.zzc().a(am.f12080b4)).booleanValue()) {
                        fe1 fe1Var = (fe1) obj3;
                        ListenableFuture listenableFutureX2 = zw1.x(v71.b(Tasks.forResult(null)), c60.l, fe1Var);
                        if (((Boolean) vm.f21201a.o()).booleanValue()) {
                            listenableFutureX2 = zw1.v(listenableFutureX2, ((Long) vm.f21202b.o()).longValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) obj2);
                        }
                        return zw1.t(listenableFutureX2, Exception.class, new lx(this, 5), fe1Var);
                    }
                }
                return zw1.d(new nq0(str3, -1, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final int zzb() {
        switch (this.f22686a) {
            case 0:
                return 6;
            case 1:
                return 9;
            case 2:
                return 29;
            case 3:
                return 34;
            default:
                return 43;
        }
    }

    public /* synthetic */ zp0(Object obj, Object obj2, Object obj3, int i10) {
        this.f22686a = i10;
        this.f22687b = obj;
        this.f22688c = obj2;
        this.f22689d = obj3;
    }
}
