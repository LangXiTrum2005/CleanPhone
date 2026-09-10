package com.smartdigimkt.q3;

import android.text.TextUtils;
import com.smartdigimkt.b8.n;
import com.smartdigimkt.sdk.api.AdError;
import com.smartdigimkt.u6.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class c {
    public static final String f = "c";
    private static volatile c g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, com.smartdigimkt.v3.e> f37873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<com.smartdigimkt.v3.e> f37874b;
    private final int d = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f37876e = 500;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f37875c = Collections.synchronizedList(new ArrayList(8));

    private c() {
    }

    public boolean a(int i2) {
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

    public synchronized void c() {
        try {
            b();
            List<com.smartdigimkt.v3.e> listSynchronizedList = this.f37874b != null ? Collections.synchronizedList(new ArrayList(this.f37874b)) : null;
            if (listSynchronizedList != null && listSynchronizedList.size() > 0) {
                for (com.smartdigimkt.v3.e eVar : listSynchronizedList) {
                    eVar.a();
                    a(eVar, true);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized void b() {
        try {
            try {
                if (this.f37873a == null && this.f37874b == null) {
                    k.a aVarD = k.a(com.smartdigimkt.u6.d.a(com.smartdigimkt.m6.b.p().k())).d();
                    this.f37873a = aVarD.f38897b;
                    this.f37874b = aVarD.f38896a;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (this.f37873a == null) {
                this.f37873a = new ConcurrentHashMap();
            }
            if (this.f37874b == null) {
                this.f37874b = Collections.synchronizedList(new ArrayList());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static c a() {
        if (g == null) {
            synchronized (c.class) {
                try {
                    if (g == null) {
                        g = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    public class a implements com.smartdigimkt.w7.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.v3.e f37877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37878b;

        public a(com.smartdigimkt.v3.e eVar, boolean z2) {
            this.f37877a = eVar;
            this.f37878b = z2;
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2, Object obj) {
            this.f37877a.a();
            synchronized (c.this) {
                try {
                    c.this.f37875c.remove(this.f37877a.f39086a);
                    if (this.f37878b) {
                        c.this.a(this.f37877a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.smartdigimkt.w7.c
        public void b(int i2) {
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2, String str, AdError adError) {
            this.f37877a.a();
            synchronized (c.this) {
                try {
                    c.this.f37875c.remove(this.f37877a.f39086a);
                    if (!this.f37878b) {
                        c.this.b(this.f37877a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2) {
            synchronized (c.this) {
                c.this.f37875c.remove(this.f37877a.f39086a);
            }
        }
    }

    public synchronized void a(int i2, String str, String str2, long j) {
        com.smartdigimkt.v3.e eVar = new com.smartdigimkt.v3.e();
        eVar.f39087b = i2;
        eVar.d = str;
        eVar.f39088c = str2;
        eVar.f = j;
        eVar.a();
        a(eVar, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(com.smartdigimkt.v3.e eVar) {
        try {
            if (TextUtils.isEmpty(eVar.f39086a) && this.f37873a != null && this.f37874b != null) {
                eVar.f39089e = System.currentTimeMillis();
                String strB = com.smartdigimkt.n8.e.b(eVar.d + eVar.f39089e);
                eVar.f39086a = strB;
                this.f37873a.put(strB, eVar);
                this.f37874b.add(eVar);
            }
            eVar.a();
            k.a(com.smartdigimkt.u6.d.a(com.smartdigimkt.m6.b.p().k())).b(eVar);
            List<com.smartdigimkt.v3.e> list = this.f37874b;
            if (list != null && list.size() > 500) {
                com.smartdigimkt.v3.e eVar2 = this.f37874b.get(0);
                eVar.a();
                this.f37875c.remove(eVar.f39086a);
                a(eVar2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void a(com.smartdigimkt.v3.e eVar, boolean z2) {
        if (System.currentTimeMillis() > eVar.f) {
            eVar.a();
            this.f37875c.remove(eVar.f39086a);
            if (z2) {
                a(eVar);
            }
            return;
        }
        if (this.f37875c.contains(eVar.f39086a)) {
            eVar.a();
            return;
        }
        this.f37875c.add(eVar.f39086a);
        if (z2) {
            int i2 = eVar.g + 1;
            eVar.g = i2;
            if (i2 >= 5) {
                eVar.a();
                a(eVar);
            } else {
                b(eVar);
            }
        } else {
            int i3 = eVar.g + 1;
            eVar.g = i3;
            if (i3 >= 5) {
                eVar.a();
                this.f37875c.remove(eVar.f39086a);
                return;
            }
        }
        eVar.a();
        new n(eVar).a(0, (com.smartdigimkt.w7.c) new a(eVar, z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(com.smartdigimkt.v3.e eVar) {
        try {
            eVar.a();
            Map<String, com.smartdigimkt.v3.e> map = this.f37873a;
            if (map != null) {
                map.remove(eVar.f39086a);
            }
            List<com.smartdigimkt.v3.e> list = this.f37874b;
            if (list != null) {
                list.remove(eVar);
            }
            k.a(com.smartdigimkt.u6.d.a(com.smartdigimkt.m6.b.p().k())).a(eVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
