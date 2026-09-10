package com.thinkup.core.common;

import com.thinkup.core.api.AdError;
import com.thinkup.core.common.on.mmo;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class oo0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile oo0 f42279n;
    private String m = "oo0";
    AtomicInteger o = new AtomicInteger(0);

    private oo0() {
    }

    public final synchronized void m() {
        List<mmo> listO;
        int iOptInt;
        if (this.o.get() <= 0 && (listO = com.thinkup.core.common.oo.mn.o(com.thinkup.core.common.oo.oo.o(com.thinkup.core.common.n.o0n.m().on())).o()) != null && listO.size() > 0) {
            this.o.set(listO.size());
            this.o.get();
            for (final mmo mmoVar : listO) {
                if (System.currentTimeMillis() - mmoVar.om >= com.thinkup.core.oo.m0.om) {
                    this.o.decrementAndGet();
                    com.thinkup.core.common.oo.mn.o(com.thinkup.core.common.oo.oo.o(com.thinkup.core.common.n.o0n.m().on())).m(mmoVar);
                } else {
                    try {
                        iOptInt = new JSONObject(mmoVar.on).optInt("business_type");
                    } catch (Throwable unused) {
                        iOptInt = 1000;
                    }
                    if (mmoVar.m == 3) {
                        new com.thinkup.core.common.n0.o0.n(mmoVar.oo, iOptInt).o(new com.thinkup.core.common.n0.o0.o0.o() { // from class: com.thinkup.core.common.oo0.2
                            @Override // com.thinkup.core.common.n0.o0.o0.o
                            public final void o(Object obj) {
                                String unused2 = oo0.this.m;
                                mmoVar.o();
                                com.thinkup.core.common.oo.mn.o(com.thinkup.core.common.oo.oo.o(com.thinkup.core.common.n.o0n.m().on())).m(mmoVar);
                                oo0.this.o.decrementAndGet();
                            }

                            @Override // com.thinkup.core.common.n0.o0.o0.o
                            public final void o(Throwable th) {
                                String unused2 = oo0.this.m;
                                mmoVar.o();
                                th.getMessage();
                                oo0.this.o.decrementAndGet();
                            }
                        });
                    } else {
                        final com.thinkup.core.common.n0.ooo oooVar = new com.thinkup.core.common.n0.ooo(mmoVar);
                        if (iOptInt == 1001) {
                            oooVar.oo0();
                        }
                        oooVar.o(0, new com.thinkup.core.common.n0.o0o() { // from class: com.thinkup.core.common.oo0.3
                            @Override // com.thinkup.core.common.n0.o0o
                            public final void onLoadCanceled(int i2) {
                                oo0.this.o.decrementAndGet();
                            }

                            @Override // com.thinkup.core.common.n0.o0o
                            public final void onLoadError(int i2, String str, AdError adError) {
                                String unused2 = oo0.this.m;
                                mmoVar.o();
                                oo0.this.o.decrementAndGet();
                            }

                            @Override // com.thinkup.core.common.n0.o0o
                            public final void onLoadFinish(int i2, Object obj) {
                                String unused2 = oo0.this.m;
                                mmoVar.o();
                                com.thinkup.core.common.oo.mn.o(com.thinkup.core.common.oo.oo.o(com.thinkup.core.common.n.o0n.m().on())).m(oooVar.ooo());
                                oo0.this.o.decrementAndGet();
                            }

                            @Override // com.thinkup.core.common.n0.o0o
                            public final void onLoadStart(int i2) {
                            }
                        });
                    }
                }
            }
        }
    }

    public static oo0 o() {
        if (f42279n == null) {
            synchronized (oo0.class) {
                try {
                    if (f42279n == null) {
                        f42279n = new oo0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f42279n;
    }

    public final void o(final int i2, final String str, final String str2, final String str3, final String str4) {
        com.thinkup.core.common.ooo.m.m.o().m(new Runnable() { // from class: com.thinkup.core.common.oo0.1
            @Override // java.lang.Runnable
            public final void run() {
                mmo mmoVar = new mmo();
                mmoVar.m = i2;
                mmoVar.o0 = str;
                mmoVar.f42200n = str2;
                mmoVar.oo = str3;
                mmoVar.om = System.currentTimeMillis();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(mmoVar.om);
                sb.append(str3);
                mmoVar.o = com.thinkup.core.common.ooo.nm.o(sb.toString() != null ? str3 : "");
                mmoVar.on = str4;
                String unused = oo0.this.m;
                mmoVar.o();
                com.thinkup.core.common.oo.mn.o(com.thinkup.core.common.oo.oo.o(com.thinkup.core.common.n.o0n.m().on())).o(mmoVar);
            }
        }, 16);
    }
}
