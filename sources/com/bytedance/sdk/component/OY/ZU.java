package com.bytedance.sdk.component.OY;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.sLN;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class ZU {
    private static AtomicInteger lk = new AtomicInteger(0);
    public static final String[] Lxb = {"com.bytedance.sdk", "com.bykv.vk", "com.ss", "tt_pangle"};
    public static final String[] LD = {"tt_pangle", "bd_tracker"};
    private static int ZU = 0;
    private static int JXs = 0;

    public static class Lxb {
        public String LD;
        public int Lxb;
        public String ZU;
        public String lk;

        public Lxb(String str, int i, String str2, String str3) {
            this.lk = str;
            this.Lxb = i;
            this.ZU = str2;
            this.LD = str3;
        }

        public void Lxb(int i) {
            this.Lxb = i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ThreadModel{times=");
            sb.append(this.Lxb);
            sb.append(", name='");
            sb.append(this.LD);
            sb.append("', lastStackStack='");
            return DM.m(sb, this.lk, "'}");
        }

        public int Lxb() {
            return this.Lxb;
        }
    }

    private static void LD() {
        lk lkVarQAg = lc.QAg();
        if (lkVarQAg == null) {
            return;
        }
        int iAddAndGet = lk.addAndGet(1);
        int i = lc.lk;
        if (i < 0 || iAddAndGet % i != 0 || Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        HashMap map = new HashMap();
        if (allStackTraces == null) {
            return;
        }
        boolean zLxb = sLN.Lxb();
        int size = allStackTraces.size();
        if (size > JXs) {
            JXs = size;
        }
        int i2 = 0;
        for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
            Thread key = entry.getKey();
            StackTraceElement[] value = entry.getValue();
            StringBuilder sb = new StringBuilder("\n");
            if (zLxb) {
                sb.append("Thread Name is : " + key.getName());
                sb.append("\n");
            }
            String str = null;
            for (StackTraceElement stackTraceElement : value) {
                String string = stackTraceElement.toString();
                if (zLxb) {
                    sb.append(string + "\n");
                }
                if (TextUtils.isEmpty(str) && (Lxb(string, Lxb) || Lxb(key.getName(), LD))) {
                    i2++;
                    str = string;
                }
            }
            if (zLxb) {
                if (!TextUtils.isEmpty(str)) {
                    StringBuilder sbQ = DM.q(str, "&");
                    sbQ.append(key.getName());
                    String string2 = sbQ.toString();
                    Lxb lxb = (Lxb) map.get(string2);
                    if (lxb != null) {
                        lxb.Lxb(lxb.Lxb() + 1);
                    } else {
                        lxb = new Lxb(string2, 1, sb.toString(), key.getName());
                    }
                    map.put(string2, lxb);
                }
                TextUtils.isEmpty(sb.toString());
            }
        }
        if (i2 > ZU) {
            ZU = i2;
        }
        if (zLxb) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                ((Lxb) ((Map.Entry) it.next()).getValue()).toString();
            }
        }
        lkVarQAg.Lxb(new com.bytedance.sdk.component.OY.LD.Lxb(i2, ZU, size, JXs));
    }

    public static void Lxb() {
        try {
            LD();
        } catch (Throwable unused) {
        }
    }

    private static boolean Lxb(String str, String[] strArr) {
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
