package com.bytedance.sdk.component.jpc;

import android.os.Looper;
import android.support.v4.media.a;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.utils.bjy;
import com.p004ironsource.d9;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class mml {
    private static AtomicInteger lnr = new AtomicInteger(0);
    public static final String[] qdl = {"com.bytedance.sdk", "com.bykv.vk", "com.ss", "tt_pangle"};
    public static final String[] ud = {"tt_pangle", "bd_tracker"};
    private static int mml = 0;
    private static int mzz = 0;

    public static class qdl {
        public String lnr;
        public String mml;
        public int qdl;
        public String ud;

        public qdl(String str, int i2, String str2, String str3) {
            this.lnr = str;
            this.qdl = i2;
            this.mml = str2;
            this.ud = str3;
        }

        public void qdl(int i2) {
            this.qdl = i2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ThreadModel{times=");
            sb.append(this.qdl);
            sb.append(", name='");
            sb.append(this.ud);
            sb.append("', lastStackStack='");
            return a.r(sb, this.lnr, "'}");
        }

        public int qdl() {
            return this.qdl;
        }
    }

    public static void qdl() {
        try {
            ud();
        } catch (Throwable unused) {
        }
    }

    private static void ud() {
        int i2;
        lnr lnrVarTvp = mo.tvp();
        if (lnrVarTvp == null) {
            return;
        }
        int i3 = 1;
        int iAddAndGet = lnr.addAndGet(1);
        int i4 = mo.lnr;
        if (i4 < 0 || iAddAndGet % i4 != 0 || Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        HashMap map = new HashMap();
        if (allStackTraces == null) {
            return;
        }
        boolean zQdl = bjy.qdl();
        int size = allStackTraces.size();
        if (size > mzz) {
            mzz = size;
        }
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it = allStackTraces.entrySet().iterator();
        int i5 = 0;
        int i6 = 0;
        while (it.hasNext()) {
            Map.Entry<Thread, StackTraceElement[]> next = it.next();
            i6 += i3;
            Thread key = next.getKey();
            StackTraceElement[] value = next.getValue();
            StringBuilder sb = new StringBuilder(IOUtils.LINE_SEPARATOR_UNIX);
            if (zQdl) {
                sb.append("Thread Name is : " + key.getName());
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
            int length = value.length;
            String str = null;
            int i7 = 0;
            while (i7 < length) {
                int i8 = i3;
                String string = value[i7].toString();
                Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = it;
                if (zQdl) {
                    sb.append(string + IOUtils.LINE_SEPARATOR_UNIX);
                }
                if (TextUtils.isEmpty(str) && (qdl(string, qdl) || qdl(key.getName(), ud))) {
                    i5++;
                    str = string;
                }
                i7++;
                it = it2;
                i3 = i8;
            }
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it3 = it;
            int i9 = i3;
            if (zQdl) {
                if (TextUtils.isEmpty(str)) {
                    i2 = i9;
                } else {
                    StringBuilder sbX = a.x(str, d9.i.f24749c);
                    sbX.append(key.getName());
                    String string2 = sbX.toString();
                    qdl qdlVar = (qdl) map.get(string2);
                    if (qdlVar != null) {
                        qdlVar.qdl(qdlVar.qdl() + 1);
                        i2 = i9;
                    } else {
                        String string3 = sb.toString();
                        String name = key.getName();
                        i2 = i9;
                        qdlVar = new qdl(string2, i2, string3, name);
                    }
                    map.put(string2, qdlVar);
                }
                if (!TextUtils.isEmpty(sb.toString())) {
                    Log.e("PoolTaskStatistics", "Thread index = " + i6 + "   &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                    Log.w("PoolTaskStatistics", sb.toString());
                }
            } else {
                i2 = i9;
            }
            i3 = i2;
            it = it3;
        }
        if (i5 > mml) {
            mml = i5;
        }
        if (zQdl) {
            StringBuilder sbU = a.u(i5, "SDK current threads=", ", SDK Max threads=");
            androidx.datastore.preferences.protobuf.a.y(sbU, mml, ", Application threads = ", size, ", Application max threads = ");
            sbU.append(mzz);
            Log.e("PoolTaskStatistics", sbU.toString());
            Iterator it4 = map.entrySet().iterator();
            while (it4.hasNext()) {
                Log.i("PoolTaskStatistics", ((qdl) ((Map.Entry) it4.next()).getValue()).toString());
            }
        }
        lnrVarTvp.qdl(new com.bytedance.sdk.component.jpc.ud.qdl(i5, mml, size, mzz));
    }

    private static boolean qdl(String str, String[] strArr) {
        if (!TextUtils.isEmpty(str) && strArr != null) {
            for (String str2 : strArr) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
