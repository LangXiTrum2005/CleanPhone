package com.thinkup.core.common.o;

import android.text.TextUtils;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.oo.o0m;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class nn {
    private static volatile nn m;
    private long om;
    final String o = "nn";
    private volatile boolean oo = false;
    private long on = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private o0m f42120n = o0m.o(com.thinkup.core.common.oo.oo.o(o0n.m().on()));
    private Map<String, Integer> o0 = new HashMap();

    /* JADX INFO: renamed from: com.thinkup.core.common.o.nn$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {
        final /* synthetic */ nm o;

        public AnonymousClass2(nm nmVar) {
            this.o = nmVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                File file = new File(this.o.m());
                if (file.exists()) {
                    file.delete();
                }
            } catch (Throwable unused) {
            }
            nn.this.f42120n.n(this.o.o());
        }
    }

    private nn() {
        this.om = 209715200L;
        this.om = o0n.m().o0(4);
    }

    private long oo() {
        return this.on;
    }

    private long o0() {
        return this.om;
    }

    public final void m() {
        if (this.oo) {
            return;
        }
        com.thinkup.core.common.ooo.m.m.o().m(new Runnable() { // from class: com.thinkup.core.common.o.nn.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    nn.this.oo = true;
                    new ArrayList();
                    nn nnVar = nn.this;
                    nnVar.on = nnVar.f42120n.o();
                    long unused = nn.this.on;
                    long unused2 = nn.this.om;
                    long unused3 = nn.this.on;
                    long unused4 = nn.this.om;
                    if (nn.this.on > nn.this.om) {
                        List<nm> listM = nn.this.f42120n.m();
                        listM.size();
                        for (nm nmVar : listM) {
                            try {
                                File file = new File(nmVar.m());
                                if (file.exists()) {
                                    file.delete();
                                }
                            } catch (Throwable unused5) {
                            }
                            try {
                                if (!TextUtils.isEmpty(nmVar.o())) {
                                    String strO = nmVar.o();
                                    nn.this.o0.remove(strO);
                                    com.thinkup.core.common.res.m.n.o().o(strO);
                                }
                            } catch (Throwable unused6) {
                            }
                        }
                    }
                } catch (Throwable unused7) {
                }
                nn.this.oo = false;
            }
        }, 13);
    }

    public final void n() {
        this.om = o0n.m().o0(4);
    }

    private synchronized int m(String str) {
        if (this.o0.containsKey(str) && this.o0.get(str) != null) {
            return this.o0.get(str).intValue();
        }
        nm nmVarO = this.f42120n.o(str);
        if (nmVarO == null || nmVarO.n() <= 0) {
            return 0;
        }
        File file = new File(nmVarO.m());
        if (file.exists() && file.length() >= nmVarO.o0()) {
            this.o0.put(str, Integer.valueOf(nmVarO.n()));
            this.f42120n.m(str);
            return nmVarO.n();
        }
        com.thinkup.core.common.ooo.m.m.o().m((Runnable) new AnonymousClass2(nmVarO), 2);
        return 0;
    }

    public static nn o() {
        if (m == null) {
            synchronized (nn.class) {
                try {
                    if (m == null) {
                        m = new nn();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    private void o(nm nmVar) {
        if (nmVar == null) {
            return;
        }
        com.thinkup.core.common.ooo.m.m.o().m((Runnable) new AnonymousClass2(nmVar), 2);
    }

    public final void o(String str, String str2, long j, long j2, int i2, boolean z2) {
        this.o0.put(str, Integer.valueOf(i2));
        if (z2) {
            o(str, str2, j, j2, i2);
        }
    }

    public final void o(final String str, final String str2, final long j, final long j2, final int i2) {
        com.thinkup.core.common.ooo.m.m.o().m(new Runnable() { // from class: com.thinkup.core.common.o.nn.3
            @Override // java.lang.Runnable
            public final void run() {
                nn.this.f42120n.o(str, str2, j, j2, i2);
            }
        }, 13);
    }

    private nm o(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f42120n.o(str);
    }

    private synchronized boolean o(String str, int i2) {
        return m(str) >= i2;
    }
}
