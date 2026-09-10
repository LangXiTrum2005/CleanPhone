package com.bytedance.sdk.openadsdk.core.jpc;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.core.settings.rq;
import com.bytedance.sdk.openadsdk.core.yt;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    private static volatile long lnr;
    private static volatile qdl qdl;
    private static volatile boolean ud;
    private final Queue<C0116qdl> mml = new LinkedList();
    private final rq mo = yt.mml();
    private Handler mzz;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.jpc.qdl$qdl, reason: collision with other inner class name */
    public static class C0116qdl {
        private final long qdl;
        private final String ud;

        private C0116qdl(long j, String str) {
            this.qdl = j;
            this.ud = str;
        }
    }

    private qdl() {
    }

    private synchronized boolean ud(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iHkc = this.mo.hkc();
        long jEkw = this.mo.ekw();
        if (this.mml.size() <= 0 || this.mml.size() < iHkc) {
            this.mml.offer(new C0116qdl(jCurrentTimeMillis, str));
        } else {
            long jAbs = Math.abs(jCurrentTimeMillis - this.mml.peek().qdl);
            if (jAbs <= jEkw) {
                ud(jEkw - jAbs);
                return true;
            }
            this.mml.poll();
            this.mml.offer(new C0116qdl(jCurrentTimeMillis, str));
        }
        return false;
    }

    public synchronized String lnr() {
        String str;
        try {
            HashMap map = new HashMap();
            for (C0116qdl c0116qdl : this.mml) {
                if (map.containsKey(c0116qdl.ud)) {
                    map.put(c0116qdl.ud, Integer.valueOf(((Integer) map.get(c0116qdl.ud)).intValue() + 1));
                } else {
                    map.put(c0116qdl.ud, 1);
                }
            }
            str = "";
            int i2 = Integer.MIN_VALUE;
            for (String str2 : map.keySet()) {
                int iIntValue = ((Integer) map.get(str2)).intValue();
                if (i2 < iIntValue) {
                    str = str2;
                    i2 = iIntValue;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return str;
    }

    public static qdl qdl() {
        if (qdl == null) {
            synchronized (qdl.class) {
                try {
                    if (qdl == null) {
                        qdl = new qdl();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return qdl;
    }

    public synchronized boolean qdl(String str) {
        try {
            if (ud(str)) {
                qdl(true);
                qdl(lnr);
            } else {
                qdl(false);
            }
        } catch (Throwable th) {
            throw th;
        }
        return ud;
    }

    private synchronized void qdl(long j) {
        try {
            if (this.mzz == null) {
                this.mzz = new Handler(Looper.getMainLooper());
            }
            this.mzz.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jpc.qdl.1
                @Override // java.lang.Runnable
                public void run() {
                    qdl.this.qdl(false);
                }
            }, j);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean ud() {
        return ud;
    }

    private synchronized void ud(long j) {
        lnr = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void qdl(boolean z2) {
        ud = z2;
    }
}
