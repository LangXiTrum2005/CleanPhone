package com.thinkup.core.common;

import android.text.TextUtils;
import com.thinkup.core.api.AdError;
import com.thinkup.core.common.on.nom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class o0n {
    private static volatile o0n m = null;
    public static final String o = "o0n";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map<String, nom> f42159n;
    private List<nom> o0;
    private final int om = 5;
    private final int on = 500;
    private List<String> oo = Collections.synchronizedList(new ArrayList(8));

    private o0n() {
    }

    private synchronized void n() {
        try {
            try {
                if (this.f42159n == null && this.o0 == null) {
                    com.thinkup.core.common.oo.nm.o oVarO = com.thinkup.core.common.oo.nm.o(com.thinkup.core.common.oo.oo.o(com.thinkup.core.common.n.o0n.m().on())).o();
                    this.f42159n = oVarO.m;
                    this.o0 = oVarO.o;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (this.f42159n == null) {
                this.f42159n = new ConcurrentHashMap();
            }
            if (this.o0 == null) {
                this.o0 = Collections.synchronizedList(new ArrayList());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static boolean o(int i2) {
        boolean z2;
        switch (i2) {
            case -1003:
            case -1002:
            case -1001:
            case -1000:
                z2 = true;
                break;
            default:
                z2 = false;
                break;
        }
        if (z2 || ((i2 < -99 || i2 >= 200) && i2 < 400)) {
            return z2;
        }
        return true;
    }

    public final synchronized void m() {
        try {
            n();
            List<nom> listSynchronizedList = this.o0 != null ? Collections.synchronizedList(new ArrayList(this.o0)) : null;
            if (listSynchronizedList != null && listSynchronizedList.size() > 0) {
                for (nom nomVar : listSynchronizedList) {
                    nomVar.o();
                    o(nomVar, true);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static o0n o() {
        if (m == null) {
            synchronized (o0n.class) {
                try {
                    if (m == null) {
                        m = new o0n();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    private synchronized void o(int i2, String str, String str2, long j) {
        nom nomVar = new nom();
        nomVar.m = i2;
        nomVar.o0 = str;
        nomVar.f42218n = str2;
        nomVar.om = j;
        nomVar.o();
        o(nomVar, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void m(nom nomVar) {
        try {
            if (TextUtils.isEmpty(nomVar.o) && this.f42159n != null && this.o0 != null) {
                nomVar.oo = System.currentTimeMillis();
                String strO = com.thinkup.core.common.ooo.nm.o(nomVar.o0 + nomVar.oo);
                nomVar.o = strO;
                this.f42159n.put(strO, nomVar);
                this.o0.add(nomVar);
            }
            nomVar.o();
            com.thinkup.core.common.oo.nm.o(com.thinkup.core.common.oo.oo.o(com.thinkup.core.common.n.o0n.m().on())).o(nomVar);
            List<nom> list = this.o0;
            if (list != null && list.size() > 500) {
                nom nomVar2 = this.o0.get(0);
                nomVar.o();
                this.oo.remove(nomVar.o);
                o(nomVar2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void o(final nom nomVar, final boolean z2) {
        if (System.currentTimeMillis() > nomVar.om) {
            nomVar.o();
            this.oo.remove(nomVar.o);
            if (z2) {
                o(nomVar);
            }
            return;
        }
        if (this.oo.contains(nomVar.o)) {
            nomVar.o();
            return;
        }
        this.oo.add(nomVar.o);
        if (z2) {
            int i2 = nomVar.on + 1;
            nomVar.on = i2;
            if (i2 >= 5) {
                nomVar.o();
                o(nomVar);
            } else {
                m(nomVar);
            }
        } else {
            int i3 = nomVar.on + 1;
            nomVar.on = i3;
            if (i3 >= 5) {
                nomVar.o();
                this.oo.remove(nomVar.o);
                return;
            }
        }
        nomVar.o();
        new com.thinkup.core.common.n0.oo0(nomVar).o(0, new com.thinkup.core.common.n0.o0o() { // from class: com.thinkup.core.common.o0n.1
            @Override // com.thinkup.core.common.n0.o0o
            public final void onLoadCanceled(int i4) {
                synchronized (o0n.this) {
                    o0n.this.oo.remove(nomVar.o);
                }
            }

            @Override // com.thinkup.core.common.n0.o0o
            public final void onLoadError(int i4, String str, AdError adError) {
                nomVar.o();
                synchronized (o0n.this) {
                    try {
                        o0n.this.oo.remove(nomVar.o);
                        if (!z2) {
                            o0n.this.m(nomVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // com.thinkup.core.common.n0.o0o
            public final void onLoadFinish(int i4, Object obj) {
                nomVar.o();
                synchronized (o0n.this) {
                    try {
                        o0n.this.oo.remove(nomVar.o);
                        if (z2) {
                            o0n.this.o(nomVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // com.thinkup.core.common.n0.o0o
            public final void onLoadStart(int i4) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o(nom nomVar) {
        try {
            nomVar.o();
            Map<String, nom> map = this.f42159n;
            if (map != null) {
                map.remove(nomVar.o);
            }
            List<nom> list = this.o0;
            if (list != null) {
                list.remove(nomVar);
            }
            com.thinkup.core.common.oo.nm.o(com.thinkup.core.common.oo.oo.o(com.thinkup.core.common.n.o0n.m().on())).m(nomVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
