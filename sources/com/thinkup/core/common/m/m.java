package com.thinkup.core.common.m;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.model.a;
import com.thinkup.core.api.TUSDKGlobalSetting;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.n.oo0;
import com.thinkup.core.common.ooo.o00;
import com.thinkup.core.common.ooo.onm;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public class m {
    private static m om;
    JSONArray[] m;
    private String mn;
    private String n0;
    Runnable o;
    private long on;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f41865n = getClass().getSimpleName();
    private final String o0 = "al_it_apil";
    private final String oo = "al_it_apil_t";
    private final Object mm = new Object();
    private final Object no = new Object();
    private ConcurrentLinkedQueue<oo> m0 = new ConcurrentLinkedQueue<>();
    private ConcurrentHashMap<String, String> mo = new ConcurrentHashMap<>();

    public m() {
        com.thinkup.core.oo.m mVarH;
        this.on = 0L;
        this.on = Math.max(0L, TUSDKGlobalSetting.mInspectInterval);
        if (!TextUtils.isEmpty(o0n.m().o00()) && (mVarH = a.h(a.i())) != null && !mVarH.mom()) {
            this.on = mVarH.o0mm();
        }
        o(new Runnable() { // from class: com.thinkup.core.common.m.m.1
            @Override // java.lang.Runnable
            public final void run() {
                String unused = m.this.f41865n;
                synchronized (m.this.no) {
                    try {
                        m mVar = m.this;
                        if (mVar.m == null) {
                            mVar.mn = onm.n(o0n.m().on(), oo0.m.o, "al_it_apil", "");
                            m.this.n0 = onm.n(o0n.m().on(), oo0.m.o, "al_it_apil_t", "");
                            if (!TextUtils.isEmpty(m.this.mn) && !TextUtils.isEmpty(m.this.n0)) {
                                JSONArray[] jSONArrayArr = new JSONArray[2];
                                m.this.m = jSONArrayArr;
                                try {
                                    jSONArrayArr[0] = new JSONArray(m.this.mn);
                                    m.this.m[1] = new JSONArray(m.this.n0);
                                } catch (Throwable th) {
                                    String unused2 = m.this.f41865n;
                                    th.getMessage();
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        });
    }

    private static void o0() {
    }

    private static int on() {
        return onm.m(o0n.m().on(), oo0.m.o, "SPU_INSPECT_INFO_OFFSET", 0);
    }

    private void om() {
        synchronized (this.mm) {
            try {
                if (this.o != null) {
                    this.o = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void on(m mVar) {
        synchronized (mVar.mm) {
            try {
                if (mVar.o != null) {
                    mVar.o = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oo() {
        synchronized (this.mm) {
            try {
                if (this.on >= 0 && this.m0.size() > 0 && this.o == null) {
                    oo ooVarPoll = this.m0.poll();
                    if (ooVarPoll != null) {
                        Runnable runnableO = o(ooVarPoll);
                        this.o = runnableO;
                        o(runnableO);
                    } else {
                        oo();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Map<String, String> n() {
        ConcurrentHashMap<String, String> concurrentHashMap;
        synchronized (this.no) {
            concurrentHashMap = this.mo;
        }
        return concurrentHashMap;
    }

    public static m o() {
        if (om == null) {
            synchronized (m.class) {
                try {
                    if (om == null) {
                        om = new m();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return om;
    }

    public final JSONArray[] m() {
        JSONArray[] jSONArrayArr;
        synchronized (this.no) {
            jSONArrayArr = this.m;
        }
        return jSONArrayArr;
    }

    public final void o(long j) {
        this.on = j;
        o0n.m().n("ail_deny");
    }

    private void o(final Context context, final String str, final om.o oVar) {
        o(new Runnable() { // from class: com.thinkup.core.common.m.m.2
            @Override // java.lang.Runnable
            public final void run() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new om(context, str, oVar));
                m.o(m.this, arrayList);
            }
        });
    }

    private void o(List<oo> list) {
        synchronized (this.mm) {
            if (list != null) {
                try {
                    if (list.size() > 0) {
                        this.m0.addAll(list);
                        oo();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private Runnable o(final oo ooVar) {
        return new Runnable() { // from class: com.thinkup.core.common.m.m.3
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (m.this.mm) {
                    try {
                        try {
                            oo ooVar2 = ooVar;
                            if (ooVar2 != null) {
                                n nVarM = ooVar2.m();
                                if (nVarM == null || nVarM.o()) {
                                    if (m.this.on > 0) {
                                        try {
                                            Thread.sleep(m.this.on);
                                        } catch (Throwable unused) {
                                        }
                                    }
                                }
                                String unused2 = m.this.f41865n;
                                Thread.currentThread().getName();
                                long unused3 = m.this.on;
                                if (nVarM != null) {
                                    nVarM.toString();
                                }
                            }
                            m.on(m.this);
                            m.this.oo();
                        } catch (Throwable th) {
                            StackTraceElement[] stackTrace = th.getStackTrace();
                            StringBuilder sb = new StringBuilder("queue size=");
                            sb.append(m.this.m0 != null ? m.this.m0.size() : -1);
                            sb.append(" , ");
                            sb.append(o00.o(stackTrace));
                            com.thinkup.core.common.oo0.oo.m("inspect error", sb.toString(), o0n.m().o0m());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        };
    }

    public final void o(Map<String, String> map) {
        synchronized (this.no) {
            if (map == null) {
                return;
            }
            try {
                if (map.isEmpty()) {
                    return;
                }
                this.mo.clear();
                this.mo.putAll(map);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void o(Runnable runnable) {
        com.thinkup.core.common.ooo.m.m.o().m(runnable, 17);
    }

    private static void o(Runnable runnable, long j) {
        com.thinkup.core.common.ooo.m.m.o().o(runnable, j, 17);
    }

    public final void o(final JSONArray[] jSONArrayArr) {
        synchronized (this.no) {
            this.m = jSONArrayArr;
        }
        com.thinkup.core.common.ooo.m.m.o().m(new Runnable() { // from class: com.thinkup.core.common.m.m.4
            @Override // java.lang.Runnable
            public final void run() {
                JSONArray[] jSONArrayArr2 = jSONArrayArr;
                if (jSONArrayArr2 == null || jSONArrayArr2.length != 2) {
                    return;
                }
                try {
                    JSONArray jSONArray = jSONArrayArr2[0];
                    if (jSONArray != null) {
                        String string = jSONArray.toString();
                        if (!TextUtils.equals(string, m.this.mn)) {
                            m.this.mn = string;
                            onm.m(o0n.m().on(), oo0.m.o, "al_it_apil", m.this.mn);
                        }
                    }
                    JSONArray jSONArray2 = jSONArrayArr[1];
                    if (jSONArray2 != null) {
                        String string2 = jSONArray2.toString();
                        if (TextUtils.equals(string2, m.this.n0)) {
                            return;
                        }
                        m.this.n0 = string2;
                        onm.m(o0n.m().on(), oo0.m.o, "al_it_apil_t", m.this.n0);
                    }
                } catch (Throwable unused) {
                }
            }
        }, 17);
    }

    public static /* synthetic */ void o(m mVar, List list) {
        synchronized (mVar.mm) {
            try {
                if (list.size() > 0) {
                    mVar.m0.addAll(list);
                    mVar.oo();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
