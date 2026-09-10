package com.bytedance.sdk.openadsdk.core.mj;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.settings.sf;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private static volatile long ik;
    private static volatile boolean lr;
    private static volatile ri ri;
    private Handler fi;
    private final Queue<C0255ri> ka = new LinkedList();
    private final sf di = nr.ka();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.mj.ri$ri, reason: collision with other inner class name */
    public static class C0255ri {
        private final String lr;
        private final long ri;

        private C0255ri(long j, String str) {
            this.ri = j;
            this.lr = str;
        }
    }

    private ri() {
    }

    private synchronized boolean lr(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iOh = this.di.oh();
        long jHcw = this.di.hcw();
        if (this.ka.size() <= 0 || this.ka.size() < iOh) {
            this.ka.offer(new C0255ri(jCurrentTimeMillis, str));
        } else {
            long jAbs = Math.abs(jCurrentTimeMillis - this.ka.peek().ri);
            if (jAbs <= jHcw) {
                lr(jHcw - jAbs);
                return true;
            }
            this.ka.poll();
            this.ka.offer(new C0255ri(jCurrentTimeMillis, str));
        }
        return false;
    }

    public synchronized String ik() {
        String str;
        try {
            HashMap map = new HashMap();
            for (C0255ri c0255ri : this.ka) {
                if (map.containsKey(c0255ri.lr)) {
                    map.put(c0255ri.lr, Integer.valueOf(((Integer) map.get(c0255ri.lr)).intValue() + 1));
                } else {
                    map.put(c0255ri.lr, 1);
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

    public static ri ri() {
        if (ri == null) {
            synchronized (ri.class) {
                try {
                    if (ri == null) {
                        ri = new ri();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ri;
    }

    public synchronized boolean ri(String str) {
        try {
            if (lr(str)) {
                ri(true);
                ri(ik);
            } else {
                ri(false);
            }
        } catch (Throwable th) {
            throw th;
        }
        return lr;
    }

    private synchronized void ri(long j) {
        try {
            if (this.fi == null) {
                this.fi = new Handler(Looper.getMainLooper());
            }
            this.fi.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mj.ri.1
                @Override // java.lang.Runnable
                public void run() {
                    ri.this.ri(false);
                }
            }, j);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean lr() {
        return lr;
    }

    private synchronized void lr(long j) {
        ik = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void ri(boolean z) {
        lr = z;
    }
}
