package com.thinkup.core.common;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile m f41861n = null;
    public static final String o = "1";
    ConcurrentHashMap<String, List<o>> m = new ConcurrentHashMap<>();

    public interface o {
        void o(Object obj);
    }

    private m() {
    }

    public static m o() {
        if (f41861n == null) {
            synchronized (m.class) {
                try {
                    if (f41861n == null) {
                        f41861n = new m();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f41861n;
    }

    public final synchronized void m(final String str, final o oVar) {
        if (!TextUtils.isEmpty(str) && oVar != null) {
            com.thinkup.core.common.ooo.m.m.o().m(new Runnable() { // from class: com.thinkup.core.common.m.2
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (m.this) {
                        try {
                            List<o> list = m.this.m.get(str);
                            if (list != null) {
                                list.remove(oVar);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }, 2);
        }
    }

    public final synchronized void o(final String str, final o oVar) {
        if (!TextUtils.isEmpty(str) && oVar != null) {
            com.thinkup.core.common.ooo.m.m.o().m(new Runnable() { // from class: com.thinkup.core.common.m.1
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (m.this) {
                        try {
                            List<o> arrayList = m.this.m.get(str);
                            if (arrayList == null) {
                                arrayList = new ArrayList<>();
                                m.this.m.put(str, arrayList);
                            }
                            arrayList.add(oVar);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }, 2);
        }
    }

    private synchronized void o(final String str, final Object obj) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.thinkup.core.common.ooo.m.m.o().m(new Runnable() { // from class: com.thinkup.core.common.m.3
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (m.this) {
                    try {
                        List<o> list = m.this.m.get(str);
                        if (list == null) {
                            return;
                        }
                        for (o oVar : list) {
                            if (oVar != null) {
                                oVar.o(obj);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }, 2);
    }
}
