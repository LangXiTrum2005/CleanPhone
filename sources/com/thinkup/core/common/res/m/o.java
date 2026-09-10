package com.thinkup.core.common.res.m;

import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.text.TextUtils;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.o.nn;
import com.thinkup.core.common.ooo.nm;
import com.thinkup.core.common.res.o0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class o extends com.thinkup.core.common.res.image.m {
    public com.thinkup.core.common.res.m.m m;
    public n mn;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<m> f42364n;
    int n0;
    private final int nm;
    private int nn;
    private final int no;
    final String o;
    private int o00;
    private String o0m;
    private boolean o0n;
    private long o0o;
    private final long oo0;
    private MediaMetadataRetriever oom;
    private Object oon;
    private long ooo;

    public static abstract class m {
        public abstract void m();

        public abstract void n();

        public abstract boolean o();
    }

    public static abstract class n {
        public abstract void m();

        public abstract void o();
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.res.m.o$o, reason: collision with other inner class name */
    public class C0692o {
        long m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f42365n;
        long o;
        int o0;

        public C0692o(long j, long j2, long j3, int i2) {
            this.o = j;
            this.m = j2;
            this.f42365n = j3;
            this.o0 = i2;
        }

        private long m() {
            return this.m;
        }

        private long n() {
            return this.f42365n;
        }

        private long o() {
            return this.o;
        }

        private int o0() {
            return this.o0;
        }
    }

    public o(String str) {
        super(str);
        this.o = "o";
        this.no = 0;
        this.nm = 1;
        this.oo0 = 512000L;
        this.oon = new Object();
        this.n0 = -1;
        this.f42364n = new ArrayList();
        this.m = new com.thinkup.core.common.res.m.m();
        this.o00 = 0;
        this.o0o = 0L;
        this.o0n = false;
        this.ooo = 0L;
        this.nn = 0;
    }

    private void m0() {
        mm();
        if (mm()) {
            mo();
            this.nn = 1;
            o0();
        }
    }

    private boolean mm() {
        int i2 = this.o00;
        if (i2 != 100) {
            return this.nn == 0 && i2 < 100;
        }
        o(i2, this.o0o);
        m(this.o00, this.o0o);
        return false;
    }

    private synchronized void mn() {
        this.f42364n.clear();
    }

    private void mo() {
        String strO = o0.o(o0n.m().on()).o(4);
        if (TextUtils.isEmpty(strO)) {
            m("", "without saveDirectory");
            return;
        }
        File file = new File(strO);
        if (!file.exists()) {
            file.mkdirs();
        }
        this.o0m = o0.o(o0n.m().on()).m(4, nm.o(this.o0));
        File file2 = new File(this.o0m);
        if (file2.exists()) {
            this.o0o = file2.length();
        }
    }

    private void n0() {
        long j;
        MediaMetadataRetriever mediaMetadataRetriever;
        if (this.ooo > 0 && this.oom == null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
            this.oom = mediaMetadataRetriever2;
            int i2 = this.m.o;
            try {
                try {
                    mediaMetadataRetriever2.setDataSource(this.o0m);
                    j = Long.parseLong(this.oom.extractMetadata(9));
                    if (j > 0) {
                        try {
                            int i3 = (int) (((this.ooo + 500) * 100) / j);
                            i2 = i3 > 100 ? 100 : i3;
                            com.thinkup.core.common.res.m.m mVar = this.m;
                            if (mVar.o < i2) {
                                mVar.o = i2;
                            }
                        } catch (Throwable unused) {
                            mediaMetadataRetriever = this.oom;
                        }
                    }
                    mediaMetadataRetriever = this.oom;
                } catch (Throwable unused2) {
                    j = -1;
                }
                mediaMetadataRetriever.release();
            } catch (Throwable unused3) {
            }
            o(new C0692o(this.ooo, j, System.currentTimeMillis() - jCurrentTimeMillis, i2));
            int i4 = this.m.o;
        }
    }

    private int on() {
        return this.nn;
    }

    @Override // com.thinkup.core.common.res.image.m
    public final void m() {
    }

    @Override // com.thinkup.core.common.res.image.m
    public final void n() {
        this.nn = 0;
    }

    @Override // com.thinkup.core.common.res.image.m
    public final Map<String, String> o() {
        return null;
    }

    public final void om() {
        this.o0n = false;
        this.nn = 0;
    }

    public final void oo() {
        mm();
        this.o0n = true;
        if (mm()) {
            mo();
            this.nn = 1;
            o0();
        }
    }

    private boolean m(int i2) {
        synchronized (this.oon) {
            try {
                if (this.o0n) {
                    return true;
                }
                if (this.mm < 512000) {
                    return true;
                }
                com.thinkup.core.common.res.m.m mVar = this.m;
                int i3 = mVar.f42363n;
                if (i3 == 2 && i2 >= mVar.o) {
                    return false;
                }
                if (i3 == 1) {
                    return true;
                }
                List<m> list = this.f42364n;
                return list == null || list.size() != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void o(com.thinkup.core.common.res.m.m mVar) {
        synchronized (this.oon) {
            try {
                int i2 = mVar.o;
                int i3 = mVar.f42363n;
                long j = mVar.o0;
                com.thinkup.core.common.res.m.m mVar2 = this.m;
                if (mVar2.o < i2) {
                    mVar2.o = i2;
                }
                if (j > this.ooo) {
                    this.ooo = j;
                }
                if (Build.VERSION.SDK_INT <= 24) {
                    mVar2.f42363n = 1;
                } else if (mVar2.f42363n != 1) {
                    mVar2.f42363n = i3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void o(m mVar) {
        if (!this.f42364n.contains(mVar)) {
            this.f42364n.add(mVar);
        }
    }

    private void m(int i2, long j) {
        if (i2 == 100) {
            nn.o().o(this.o0, this.o0m, this.mm, j, i2, true);
        }
    }

    private synchronized void m(String str, String str2) {
        try {
            this.nn = 0;
            Iterator<m> it = this.f42364n.iterator();
            while (it.hasNext()) {
                it.next();
            }
            mn();
        } catch (Throwable th) {
            throw th;
        }
    }

    private void o(n nVar) {
        this.mn = nVar;
    }

    private void o(int i2) {
        this.nn = i2;
    }

    private synchronized void o(int i2, long j) {
        try {
            if (this.n0 != i2) {
                this.n0 = i2;
            }
            nn.o().o(this.o0, this.o0m, this.mm, j, i2, false);
            Iterator<m> it = this.f42364n.iterator();
            boolean z2 = false;
            if (this.mm > 512000 || i2 == 100) {
                boolean z3 = false;
                while (it.hasNext()) {
                    if (it.next().o()) {
                        z3 = i2 != 100;
                        it.remove();
                    }
                }
                z2 = z3;
            }
            if (z2) {
                nn.o().o(this.o0, this.o0m, this.mm, j, i2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0053 */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0120, code lost:
    
        r0 = th;
     */
    @Override // com.thinkup.core.common.res.image.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o(java.io.InputStream r24) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.thinkup.core.common.res.m.o.o(java.io.InputStream):boolean");
    }

    @Override // com.thinkup.core.common.res.image.m
    public final void o(com.thinkup.core.common.ooo.m.o0 o0Var) {
        com.thinkup.core.common.ooo.m.m.o().o(o0Var, 4);
    }

    @Override // com.thinkup.core.common.res.image.m
    public final void o(String str, String str2) {
        m(str, str2);
    }

    private synchronized void o(C0692o c0692o) {
        long j = c0692o.m;
        Iterator<m> it = this.f42364n.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
