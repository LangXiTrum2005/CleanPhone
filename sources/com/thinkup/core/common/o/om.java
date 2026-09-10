package com.thinkup.core.common.o;

import android.text.TextUtils;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.o00;
import com.thinkup.core.common.on.ooo;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class om {
    private static volatile om o0;
    long m;
    private Map<String, m0> om;
    private com.thinkup.core.common.oo.m oo;
    final String o = om.class.getName();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f42126n = new Object();

    /* JADX INFO: renamed from: com.thinkup.core.common.o.om$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (om.this.f42126n) {
                try {
                    om.this.m();
                    List<on> listO = om.this.oo.o();
                    if (listO != null) {
                        for (int i2 = 0; i2 < listO.size(); i2++) {
                            on onVar = listO.get(i2);
                            String strO = onVar.o();
                            if (!TextUtils.isEmpty(strO)) {
                                m0 m0Var = (m0) om.this.om.get(strO);
                                if (m0Var == null) {
                                    m0Var = new m0();
                                    om.this.om.put(strO, m0Var);
                                }
                                m0Var.o(onVar);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private om() {
        this.m = 0L;
        if (o0n.m().on() != null) {
            this.oo = com.thinkup.core.common.oo.m.o(com.thinkup.core.common.oo.oo.o(o0n.m().on()));
            this.om = new ConcurrentHashMap();
            this.m = om();
            o0n.m();
            o0n.n(new AnonymousClass1());
        }
    }

    private static void n() {
    }

    private void o0() {
        this.m = om();
        o0n.m();
        o0n.n(new AnonymousClass1());
    }

    private static long om() {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            return calendar.getTimeInMillis();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oo() {
        long jOm = om();
        if (this.m != jOm) {
            this.om.clear();
            this.m = jOm;
        }
    }

    private void m(final String str, final ooo oooVar) {
        o0n.m();
        o0n.n(new Runnable() { // from class: com.thinkup.core.common.o.om.3
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (om.this.f42126n) {
                    try {
                        om.this.oo();
                        m0 m0Var = (m0) om.this.om.get(str);
                        if (m0Var == null) {
                            m0Var = new m0();
                            om.this.om.put(str, m0Var);
                        }
                        ooo oooVar2 = oooVar;
                        if (oooVar2 instanceof o00) {
                            m0Var.m(((o00) oooVar2).mmn());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                om.o(om.this, 6, str, oooVar);
            }
        });
    }

    public static om o() {
        if (o0 == null) {
            synchronized (om.class) {
                try {
                    if (o0 == null) {
                        o0 = new om();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return o0;
    }

    public final void m() {
        this.oo.m();
    }

    private void o(final String str, final ooo oooVar) {
        o0n.m();
        o0n.n(new Runnable() { // from class: com.thinkup.core.common.o.om.2
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (om.this.f42126n) {
                    try {
                        om.this.oo();
                        m0 m0Var = (m0) om.this.om.get(str);
                        if (m0Var == null) {
                            m0Var = new m0();
                            om.this.om.put(str, m0Var);
                        }
                        m0Var.o(((o00) oooVar).mmn());
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                om.o(om.this, 4, str, oooVar);
            }
        });
    }

    private void o(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str) || jSONObject == null) {
            return;
        }
        synchronized (this.f42126n) {
            try {
                oo();
                m0 m0Var = this.om.get(str);
                if (m0Var != null) {
                    m0Var.o(jSONObject);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void o(int i2, String str, ooo oooVar) {
        if (TextUtils.isEmpty(str) || !(oooVar instanceof o00)) {
            return;
        }
        on onVar = new on();
        onVar.o(str);
        onVar.m(((o00) oooVar).mmn());
        onVar.n(oooVar.mo());
        onVar.o(i2);
        onVar.o0("");
        this.oo.o(onVar);
    }

    public static /* synthetic */ void o(om omVar, int i2, String str, ooo oooVar) {
        if (TextUtils.isEmpty(str) || !(oooVar instanceof o00)) {
            return;
        }
        on onVar = new on();
        onVar.o(str);
        onVar.m(((o00) oooVar).mmn());
        onVar.n(oooVar.mo());
        onVar.o(i2);
        onVar.o0("");
        omVar.oo.o(onVar);
    }
}
