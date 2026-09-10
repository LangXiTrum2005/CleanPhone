package com.bytedance.sdk.openadsdk.core.ebl;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.settings.lc;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    private static volatile boolean LD;
    private static volatile Lxb Lxb;
    private static volatile long lk;
    private Handler JXs;
    private final Queue<C0106Lxb> ZU = new LinkedList();
    private final lc lc = kqm.ZU();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ebl.Lxb$Lxb, reason: collision with other inner class name */
    public static class C0106Lxb {
        private final String LD;
        private final long Lxb;

        private C0106Lxb(long j, String str) {
            this.Lxb = j;
            this.LD = str;
        }
    }

    private Lxb() {
    }

    private synchronized boolean LD(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iAH = this.lc.aH();
        long jEK = this.lc.eK();
        if (this.ZU.size() <= 0 || this.ZU.size() < iAH) {
            this.ZU.offer(new C0106Lxb(jCurrentTimeMillis, str));
        } else {
            long jAbs = Math.abs(jCurrentTimeMillis - this.ZU.peek().Lxb);
            if (jAbs <= jEK) {
                LD(jEK - jAbs);
                return true;
            }
            this.ZU.poll();
            this.ZU.offer(new C0106Lxb(jCurrentTimeMillis, str));
        }
        return false;
    }

    public synchronized String lk() {
        String str;
        try {
            HashMap map = new HashMap();
            for (C0106Lxb c0106Lxb : this.ZU) {
                if (map.containsKey(c0106Lxb.LD)) {
                    map.put(c0106Lxb.LD, Integer.valueOf(((Integer) map.get(c0106Lxb.LD)).intValue() + 1));
                } else {
                    map.put(c0106Lxb.LD, 1);
                }
            }
            str = "";
            int i = Integer.MIN_VALUE;
            for (String str2 : map.keySet()) {
                int iIntValue = ((Integer) map.get(str2)).intValue();
                if (i < iIntValue) {
                    str = str2;
                    i = iIntValue;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return str;
    }

    public static Lxb Lxb() {
        if (Lxb == null) {
            synchronized (Lxb.class) {
                try {
                    if (Lxb == null) {
                        Lxb = new Lxb();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Lxb;
    }

    public synchronized boolean Lxb(String str) {
        try {
            if (LD(str)) {
                Lxb(true);
                Lxb(lk);
            } else {
                Lxb(false);
            }
        } catch (Throwable th) {
            throw th;
        }
        return LD;
    }

    private synchronized void Lxb(long j) {
        try {
            if (this.JXs == null) {
                this.JXs = new Handler(Looper.getMainLooper());
            }
            this.JXs.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ebl.Lxb.1
                @Override // java.lang.Runnable
                public void run() {
                    Lxb.this.Lxb(false);
                }
            }, j);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean LD() {
        return LD;
    }

    private synchronized void LD(long j) {
        lk = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void Lxb(boolean z) {
        LD = z;
    }
}
