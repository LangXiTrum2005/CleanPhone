package ads_mobile_sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.RemoteException;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.biogenic;

/* JADX INFO: loaded from: classes.dex */
public final class r11 {
    public final Context a;
    public q11 b;

    public r11(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    public final kd2 a() {
        try {
            q11 q11Var = this.b;
            if (q11Var == null || q11Var.a != 2 || q11Var.d == null || q11Var.e == null) {
                return null;
            }
            return q11Var.a();
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c4  */
    public final void a(d21 listener) {
        ServiceInfo serviceInfo;
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context context = this.a;
        if (context != null) {
            q11 q11Var = new q11(context);
            int i = q11Var.a;
            if (i == 2 && q11Var.d != null && q11Var.e != null) {
                biogenic.attabal("Service connection is valid. No need to re-initialize.");
                listener.a(0);
            } else if (i == 1) {
                biogenic.saneness("Client is already in the process of connecting to the service.");
                listener.a(3);
            } else if (i == 3) {
                biogenic.saneness("Client was already closed and can't be reused. Please create another instance.");
                listener.a(3);
            } else {
                biogenic.attabal("Starting install referrer service setup.");
                Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                List<ResolveInfo> listQueryIntentServices = q11Var.b.getPackageManager().queryIntentServices(intent, 0);
                if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty() && (serviceInfo = listQueryIntentServices.get(0).serviceInfo) != null) {
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    if ("com.android.vending".equals(str) && str2 != null) {
                        try {
                            if (q11Var.b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                                Intent intent2 = new Intent(intent);
                                p11 p11Var = new p11(q11Var, listener);
                                q11Var.e = p11Var;
                                try {
                                    if (q11Var.b.bindService(intent2, p11Var, 1)) {
                                        biogenic.attabal("Service was bonded successfully.");
                                    } else {
                                        biogenic.saneness("Connection to service is blocked.");
                                        q11Var.a = 0;
                                        listener.a(1);
                                    }
                                } catch (SecurityException unused) {
                                    biogenic.saneness("No permission to connect to service.");
                                    q11Var.a = 0;
                                    listener.a(4);
                                }
                            } else {
                                biogenic.saneness("Play Store missing or incompatible. Version 8.3.73 or later required.");
                                q11Var.a = 0;
                                listener.a(2);
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    } else {
                        biogenic.saneness("Play Store missing or incompatible. Version 8.3.73 or later required.");
                        q11Var.a = 0;
                        listener.a(2);
                    }
                } else {
                    q11Var.a = 0;
                    biogenic.attabal("Install Referrer service unavailable on device.");
                    listener.a(2);
                }
            }
            this.b = q11Var;
            return;
        }
        throw new IllegalArgumentException("Please provide a valid Context.");
    }
}
