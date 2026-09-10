package com.bytedance.sdk.openadsdk.core.QAg.Lxb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Process;
import android.util.ArrayMap;
import androidx.core.app.NotificationCompat;
import com.hjq.permissions.Permission;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    private static volatile LD Lxb;
    private final ArrayList<String> LD = new ArrayList<>();
    private final AtomicBoolean lk = new AtomicBoolean(false);
    private long ZU = System.currentTimeMillis();
    private long JXs = 0;
    private long lc = 0;
    private String ebl = "";
    private String OY = "";
    private String QAg = "";
    private boolean nBu = false;
    private boolean JVA = false;

    public static LD Lxb(Application application) {
        if (Lxb == null) {
            synchronized (LD.class) {
                try {
                    if (Lxb == null) {
                        LD ld = new LD();
                        Lxb = ld;
                        ld.nBu = Lxb((Context) application);
                        Lxb.JVA = Lxb(application.getApplicationContext(), Permission.SYSTEM_ALERT_WINDOW) == 0;
                        Lxb.Lxb();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Lxb;
    }

    public void LD(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.LD.contains(localClassName)) {
            this.LD.remove(localClassName);
        }
        if (this.LD.size() == 0) {
            this.ZU = System.currentTimeMillis();
            this.lk.set(true);
            this.OY = localClassName;
        }
    }

    private static int Lxb(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (Throwable unused) {
            return Build.VERSION.SDK_INT >= 23 ? -1 : 0;
        }
    }

    private static boolean Lxb(Context context) {
        ApplicationInfo applicationInfo;
        return (context == null || (applicationInfo = context.getApplicationInfo()) == null || (applicationInfo.flags & 1) <= 0) ? false : true;
    }

    public void Lxb(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.LD.size() == 0) {
            this.ebl = localClassName;
            this.JXs = System.currentTimeMillis();
            this.lc = System.currentTimeMillis() - this.ZU;
            this.lk.set(false);
        }
        if (!this.LD.contains(localClassName)) {
            this.LD.add(localClassName);
        }
        if (localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity") || localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity")) {
            return;
        }
        this.QAg = localClassName;
    }

    private void Lxb() {
        int size;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(objInvoke);
            if (arrayMap != null && (size = arrayMap.size()) > 0) {
                Class<?> cls2 = Class.forName("android.app.ActivityThread$ActivityClientRecord");
                Field declaredField2 = cls2.getDeclaredField("stopped");
                declaredField2.setAccessible(true);
                Field declaredField3 = cls2.getDeclaredField("activity");
                declaredField3.setAccessible(true);
                for (int i = 0; i < size; i++) {
                    Object objValueAt = arrayMap.valueAt(i);
                    if (!((Boolean) declaredField2.get(objValueAt)).booleanValue()) {
                        String localClassName = ((Activity) declaredField3.get(objValueAt)).getLocalClassName();
                        if (!this.LD.contains(localClassName)) {
                            this.LD.add(localClassName);
                        }
                    }
                }
                this.lk.set(this.LD.size() <= 0);
            }
        } catch (Throwable unused) {
        }
    }

    public String Lxb(String str, long j, int i) {
        String string;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = jCurrentTimeMillis - this.JXs;
        long j3 = jCurrentTimeMillis - j;
        int i2 = j3 < 500 ? 1 : 0;
        if (this.lk.get() && this.JVA) {
            i2 |= 2;
        }
        if (!this.lk.get() && this.lc >= 5000 && j2 < 1000) {
            i2 = this.OY.equals(this.QAg) ? i2 | 4 : i2 | 8;
        }
        try {
            string = new JSONObject().put("rst", i2).put("adtag", str).put("bakdur", this.lc).put("rit", i).put("poptime", j2).put("unlocktime", j3).put("bakground", this.lk).put("alert", this.JVA).put(NotificationCompat.CATEGORY_SYSTEM, this.nBu).put("actsize", this.LD.size()).put("mutiproc", com.bytedance.sdk.openadsdk.multipro.LD.lk()).toString();
        } catch (JSONException unused) {
            string = "";
        }
        this.ebl = "";
        this.lc = 0L;
        this.JXs = 0L;
        this.ZU = System.currentTimeMillis();
        return string;
    }
}
