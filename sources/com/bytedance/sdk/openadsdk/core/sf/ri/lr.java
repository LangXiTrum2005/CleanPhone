package com.bytedance.sdk.openadsdk.core.sf.ri;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.util.ArrayMap;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.ihz;
import com.bytedance.sdk.openadsdk.core.nr;
import com.ironsource.X3;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    private static volatile lr ri;
    private final ArrayList<String> lr = new ArrayList<>();
    private final AtomicBoolean ik = new AtomicBoolean(false);
    private long ka = System.currentTimeMillis();
    private long fi = 0;
    private long di = 0;
    private String xha = "";
    private String mj = "";
    private String jbs = "";
    private boolean qt = false;
    private boolean sf = false;

    public static lr ri(Application application) {
        if (ri == null) {
            synchronized (lr.class) {
                try {
                    if (ri == null) {
                        lr lrVar = new lr();
                        ri = lrVar;
                        lrVar.qt = ri((Context) application);
                        ri.sf = ri(application.getApplicationContext(), "android.permission.SYSTEM_ALERT_WINDOW") == 0;
                        ri.ri();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ri;
    }

    public void lr(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.lr.contains(localClassName)) {
            this.lr.remove(localClassName);
        }
        if (this.lr.size() == 0) {
            this.ka = System.currentTimeMillis();
            this.ik.set(true);
            this.mj = localClassName;
        }
    }

    private static int ri(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static boolean ri(Context context) {
        ApplicationInfo applicationInfo;
        return (context == null || (applicationInfo = context.getApplicationInfo()) == null || (applicationInfo.flags & 1) <= 0) ? false : true;
    }

    public void ri(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.lr.size() == 0) {
            this.xha = localClassName;
            this.fi = System.currentTimeMillis();
            this.di = System.currentTimeMillis() - this.ka;
            this.ik.set(false);
        }
        if (!this.lr.contains(localClassName)) {
            this.lr.add(localClassName);
        }
        if (localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity") || localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity")) {
            return;
        }
        this.jbs = localClassName;
    }

    private void ri() {
        int size;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", null);
            boolean z = true;
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(objInvoke);
            if (arrayMap != null && (size = arrayMap.size()) > 0) {
                Class<?> cls2 = Class.forName("android.app.ActivityThread$ActivityClientRecord");
                Field declaredField2 = cls2.getDeclaredField(X3.i.h0);
                declaredField2.setAccessible(true);
                Field declaredField3 = cls2.getDeclaredField("activity");
                declaredField3.setAccessible(true);
                for (int i = 0; i < size; i++) {
                    Object objValueAt = arrayMap.valueAt(i);
                    if (!((Boolean) declaredField2.get(objValueAt)).booleanValue()) {
                        String localClassName = ((Activity) declaredField3.get(objValueAt)).getLocalClassName();
                        if (!this.lr.contains(localClassName)) {
                            this.lr.add(localClassName);
                        }
                    }
                }
                AtomicBoolean atomicBoolean = this.ik;
                if (this.lr.size() > 0) {
                    z = false;
                }
                atomicBoolean.set(z);
            }
        } catch (Throwable unused) {
        }
    }

    public String ri(String str, long j, int i) {
        String string;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = jCurrentTimeMillis - this.fi;
        long j3 = jCurrentTimeMillis - j;
        int i2 = j3 < 500 ? 1 : 0;
        if (this.ik.get() && this.sf) {
            i2 |= 2;
        }
        if (!this.ik.get() && this.di >= 5000 && j2 < 1000) {
            i2 = this.mj.equals(this.jbs) ? i2 | 4 : i2 | 8;
        }
        try {
            string = new JSONObject().put("rst", i2).put("adtag", str).put("bakdur", this.di).put("rit", i).put("poptime", j2).put("unlocktime", j3).put("bakground", this.ik).put("alert", this.sf).put(NotificationCompat.CATEGORY_SYSTEM, this.qt).put("actsize", this.lr.size()).put("mutiproc", true ^ ihz.ri(nr.ri())).toString();
        } catch (JSONException unused) {
            string = "";
        }
        this.xha = "";
        this.di = 0L;
        this.fi = 0L;
        this.ka = System.currentTimeMillis();
        return string;
    }
}
