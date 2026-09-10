package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4483rP {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4929a;
    public String b;
    public String c;
    public int d;
    public int e = 0;

    public C4483rP(Context context) {
        this.f4929a = context;
    }

    public static String c(C4266ou c4266ou) {
        c4266ou.a();
        C2323Bu c2323Bu = c4266ou.c;
        String str = c2323Bu.e;
        if (str != null) {
            return str;
        }
        c4266ou.a();
        String str2 = c2323Bu.b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final synchronized String a() {
        try {
            if (this.b == null) {
                e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    public final synchronized String b() {
        try {
            if (this.c == null) {
                e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    public final boolean d() {
        synchronized (this) {
            int i = this.e;
            if (i == 0) {
                PackageManager packageManager = this.f4929a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") != -1) {
                    if (!PlatformVersion.isAtLeastO()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                            this.e = 1;
                            return true;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
                        this.e = 2;
                        return true;
                    }
                    if (PlatformVersion.isAtLeastO()) {
                        this.e = 2;
                    } else {
                        this.e = 1;
                    }
                    i = this.e;
                }
            }
            return i != 0;
        }
    }

    public final synchronized void e() {
        PackageInfo packageInfo;
        try {
            packageInfo = this.f4929a.getPackageManager().getPackageInfo(this.f4929a.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.b = Integer.toString(packageInfo.versionCode);
            this.c = packageInfo.versionName;
        }
    }
}
