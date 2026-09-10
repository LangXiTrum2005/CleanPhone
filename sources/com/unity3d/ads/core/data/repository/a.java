package com.unity3d.ads.core.data.repository;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.ironsource.InterfaceC0435l1;
import java.io.FileOutputStream;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import l7.r;
import m5.k;
import qd.b;
import qd.c;
import qd.n;
import zc.c0;
import zc.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38422c;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f38420a = i10;
        this.f38421b = obj;
        this.f38422c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        int i10;
        ComponentName componentNameStartService;
        switch (this.f38420a) {
            case 0:
                return AndroidDiagnosticEventRepository.flush$lambda$4((AndroidDiagnosticEventRepository) this.f38421b, (List) this.f38422c);
            case 1:
                k kVar = (k) this.f38421b;
                r rVar = (r) this.f38422c;
                CountDownLatch countDownLatch = (CountDownLatch) kVar.f45903c;
                try {
                    kVar.f45902b = rVar.call();
                } finally {
                    if (countDownLatch != null) {
                        countDownLatch.countDown();
                    }
                }
            case 2:
                b bVar = (b) this.f38421b;
                c cVar = (c) this.f38422c;
                n nVar = bVar.f48942b;
                synchronized (nVar) {
                    FileOutputStream fileOutputStreamOpenFileOutput = nVar.f49012a.openFileOutput(nVar.f49013b, 0);
                    try {
                        fileOutputStreamOpenFileOutput.write(cVar.f48945a.toString().getBytes("UTF-8"));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Throwable th2) {
                        fileOutputStreamOpenFileOutput.close();
                        throw th2;
                    }
                }
                return null;
            default:
                Context context = (Context) this.f38421b;
                Intent intent = (Intent) this.f38422c;
                u uVarT = u.t();
                uVarT.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) uVarT.f54882e).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (uVarT) {
                    try {
                        str = (String) uVarT.f54879b;
                        if (str == null) {
                            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            } else if (!context.getPackageName().equals(serviceInfo.packageName) || (str2 = serviceInfo.name) == null) {
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            } else {
                                if (str2.startsWith(".")) {
                                    uVarT.f54879b = context.getPackageName() + serviceInfo.name;
                                } else {
                                    uVarT.f54879b = serviceInfo.name;
                                }
                                str = (String) uVarT.f54879b;
                            }
                            str = null;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
                    }
                    intent2.setClassName(context.getPackageName(), str);
                }
                try {
                    if (uVarT.v(context)) {
                        componentNameStartService = c0.c(context, intent2);
                    } else {
                        componentNameStartService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentNameStartService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i10 = InterfaceC0435l1.a.b.f29084d;
                    } else {
                        i10 = -1;
                    }
                } catch (IllegalStateException e10) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e10);
                    i10 = 402;
                } catch (SecurityException e11) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e11);
                    i10 = InterfaceC0435l1.a.b.f29082b;
                }
                return Integer.valueOf(i10);
        }
    }
}
