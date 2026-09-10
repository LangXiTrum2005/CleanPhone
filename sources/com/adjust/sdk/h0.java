package com.adjust.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import com.applovin.impl.da;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f6851b;

    public /* synthetic */ h0(Context context, int i10) {
        this.f6850a = i10;
        this.f6851b = context;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    @Override // java.lang.Runnable
    public final void run() {
        i0.e eVar;
        Object systemService;
        Context context;
        switch (this.f6850a) {
            case 0:
                AdjustInstance.lambda$setSendingReferrersAsNotSent$2(this.f6851b);
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new h0(this.f6851b, 2));
                break;
            case 2:
                f4.d.t(this.f6851b, new da(1), f4.d.f40634a, false);
                break;
            default:
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 33) {
                    Context context2 = this.f6851b;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i10 >= 33) {
                            x.f fVar = k.l.f44131g;
                            fVar.getClass();
                            x.a aVar = new x.a(fVar);
                            while (true) {
                                if (aVar.hasNext()) {
                                    k.l lVar = (k.l) ((WeakReference) aVar.next()).get();
                                    if (lVar != null && (context = ((k.v) lVar).f44172k) != null) {
                                        systemService = context.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            if (systemService != null) {
                                eVar = new i0.e(new i0.f(k.j.a(systemService)));
                            } else {
                                eVar = i0.e.f42487b;
                            }
                        } else {
                            eVar = k.l.f44127c;
                            if (eVar == null) {
                                eVar = i0.e.f42487b;
                            }
                        }
                        if (eVar.f42488a.f42489a.isEmpty()) {
                            String strG = b0.b.g(context2);
                            Object systemService2 = context2.getSystemService("locale");
                            if (systemService2 != null) {
                                k.j.b(systemService2, k.i.a(strG));
                            }
                        }
                        context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                k.l.f44130f = true;
                break;
        }
    }
}
