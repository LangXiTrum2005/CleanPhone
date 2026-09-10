package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.mw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4092mw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f4722a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public final void a(String str, String str2) {
        Map map = (Map) this.b;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    public final Y7 b() {
        String strH = ((String) this.f4722a) == null ? " transportName" : "";
        if (((C3209cr) this.d) == null) {
            strH = strH.concat(" encodedPayload");
        }
        if (((Long) this.e) == null) {
            strH = DM.h(strH, " eventMillis");
        }
        if (((Long) this.f) == null) {
            strH = DM.h(strH, " uptimeMillis");
        }
        if (((Map) this.b) == null) {
            strH = DM.h(strH, " autoMetadata");
        }
        if (strH.isEmpty()) {
            return new Y7((String) this.f4722a, (Integer) this.c, (C3209cr) this.d, ((Long) this.e).longValue(), ((Long) this.f).longValue(), (Map) this.b);
        }
        throw new IllegalStateException("Missing required properties:".concat(strH));
    }

    public final Task c(Task task) {
        return task.continueWith(new N5(23), new Md0(this, 28));
    }

    public final void d(String str, String str2, Bundle bundle) {
        int i;
        String strEncodeToString;
        int iA;
        PackageInfo packageInfo;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        C4266ou c4266ou = (C4266ou) this.c;
        c4266ou.a();
        bundle.putString("gmp_app_id", c4266ou.c.b);
        C4483rP c4483rP = (C4483rP) this.b;
        synchronized (c4483rP) {
            try {
                if (c4483rP.d == 0) {
                    try {
                        packageInfo = c4483rP.f4929a.getPackageManager().getPackageInfo("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e) {
                        e.toString();
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        c4483rP.d = packageInfo.versionCode;
                    }
                }
                i = c4483rP.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((C4483rP) this.b).a());
        bundle.putString("app_ver_name", ((C4483rP) this.b).b());
        C4266ou c4266ou2 = (C4266ou) this.c;
        c4266ou2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1).digest(c4266ou2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str3 = ((C3146c8) Tasks.await(((C4617su) ((InterfaceC4705tu) this.f4722a)).e())).f4207a;
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("Goog-Firebase-Installations-Auth", str3);
            }
        } catch (InterruptedException | ExecutionException unused2) {
        }
        bundle.putString("appid", (String) Tasks.await(((C4617su) ((InterfaceC4705tu) this.f4722a)).d()));
        bundle.putString("cliv", "fcm-23.2.1");
        InterfaceC4886vz interfaceC4886vz = (InterfaceC4886vz) ((AW) this.f).get();
        C3645ho c3645ho = (C3645ho) ((AW) this.e).get();
        if (interfaceC4886vz == null || c3645ho == null || (iA = ((C3379en) interfaceC4886vz).a()) == 1) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(DM.D(iA)));
        bundle.putString("Firebase-Client", c3645ho.a());
    }

    public final void e(C3209cr c3209cr) {
        if (c3209cr == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        this.d = c3209cr;
    }

    public final Task f(String str, String str2, Bundle bundle) {
        try {
            d(str, str2, bundle);
            return ((Rpc) this.d).send(bundle);
        } catch (InterruptedException | ExecutionException e) {
            return Tasks.forException(e);
        }
    }
}
