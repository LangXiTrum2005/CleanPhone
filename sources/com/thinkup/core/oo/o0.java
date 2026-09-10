package com.thinkup.core.oo;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.model.a;
import com.thinkup.core.api.AdError;
import com.thinkup.core.common.on.o0oo;
import com.thinkup.core.common.oon;
import com.thinkup.core.common.ooo.onm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class o0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile o0 f42466n = null;
    public static final String o = "o0";
    private static volatile m o0;
    private Context oo;
    private Object on = new Object();
    private boolean om = false;
    List<o> m = Collections.synchronizedList(new ArrayList(3));
    private String m0 = "AP_SY";
    private final o0m mo = new o0m();
    private final n mm = new n();

    /* JADX INFO: renamed from: com.thinkup.core.oo.o0$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {
        public AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.thinkup.core.common.m.m.o().o(o0.o0.o0mm());
            com.thinkup.core.common.nm.oo.o().o(o0.o0);
        }
    }

    public interface o {
        void m();

        void o();
    }

    private o0(Context context) {
        this.oo = context;
    }

    public static /* synthetic */ boolean m(o0 o0Var) {
        o0Var.om = false;
        return false;
    }

    private static void m0() {
    }

    public static m o() {
        return a.h(a.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void om() {
        synchronized (this.on) {
            try {
                Iterator<o> it = this.m.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                this.m.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean on() {
        return this.om;
    }

    private Context oo() {
        return this.oo;
    }

    private void m(Context context) {
        this.oo = context;
    }

    private m n(Context context) {
        o0m o0mVar;
        m mVar = new m();
        mVar.m = true;
        mVar.n0n();
        mVar.n("0");
        mVar.o(0L);
        mVar.nm0();
        mVar.nmn();
        mVar.nno();
        mVar.o0("");
        mVar.o000();
        mVar.o00m();
        mVar.oo("");
        mVar.n0o();
        mVar.mmm();
        mVar.m0m();
        mVar.mo0();
        mVar.m("[\"com.thinkup\"]");
        mVar.onm();
        mVar.o00();
        mVar.m();
        mVar.no();
        if (context != null && (o0mVar = this.mo) != null) {
            m mVarM = o0mVar.m(com.thinkup.core.common.n.o0n.m().o00());
            Thread.currentThread().getId();
            Thread.currentThread().getName();
            if (mVarM != null) {
                mVar.o(mVarM.m0());
            }
        }
        return mVar;
    }

    private void m(o oVar) {
        synchronized (this.on) {
            if (oVar != null) {
                try {
                    this.m.remove(oVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final m m(String str) {
        o0m o0mVar;
        if (o0 == null) {
            synchronized (this) {
                try {
                    if (o0 == null) {
                        try {
                            if (this.oo == null) {
                                this.oo = com.thinkup.core.common.n.o0n.m().on();
                            }
                            o0 = o(this.oo, str);
                        } catch (Throwable unused) {
                        }
                        if (o0 == null) {
                            Context context = this.oo;
                            m mVar = new m();
                            mVar.m = true;
                            mVar.n0n();
                            mVar.n("0");
                            mVar.o(0L);
                            mVar.nm0();
                            mVar.nmn();
                            mVar.nno();
                            mVar.o0("");
                            mVar.o000();
                            mVar.o00m();
                            mVar.oo("");
                            mVar.n0o();
                            mVar.mmm();
                            mVar.m0m();
                            mVar.mo0();
                            mVar.m("[\"com.thinkup\"]");
                            mVar.onm();
                            mVar.o00();
                            mVar.m();
                            mVar.no();
                            if (context != null && (o0mVar = this.mo) != null) {
                                m mVarM = o0mVar.m(com.thinkup.core.common.n.o0n.m().o00());
                                Thread.currentThread().getId();
                                Thread.currentThread().getName();
                                if (mVarM != null) {
                                    mVar.o(mVarM.m0());
                                }
                            }
                            o0 = mVar;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return o0;
    }

    public static o0 o(Context context) {
        if (f42466n == null) {
            synchronized (o0.class) {
                try {
                    if (f42466n == null) {
                        f42466n = new o0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f42466n;
    }

    private void o(o oVar) {
        synchronized (this.on) {
            try {
                if (this.on != null) {
                    this.m.add(oVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    public final boolean o(String str) {
        boolean z2;
        boolean z3;
        m mVarM = m(str);
        if (mVarM != null) {
            mm mmVarO0 = mVarM.o0();
            long jN0m = mVarM.n0m();
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z4 = mVarM.mmn() + jN0m <= jCurrentTimeMillis;
            if (mmVarO0 != null) {
                if (mmVarO0.o() + mVarM.mmn() <= jCurrentTimeMillis) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            Map<String, Object> map = mVarM.f42449n;
            Map<String, Object> mapNo = com.thinkup.core.common.n.o0n.m().no();
            if (map != null) {
                z3 = !map.equals(mapNo);
            } else {
                z3 = mapNo != null;
            }
            if (!z4 && !z2 && !z3) {
                return false;
            }
        }
        return true;
    }

    public final void n() {
        com.thinkup.core.common.n.o0n o0nVarM = com.thinkup.core.common.n.o0n.m();
        final String strO00 = o0nVarM.o00();
        String strO0o = o0nVarM.o0o();
        final Context context = this.oo;
        if (context == null || TextUtils.isEmpty(strO00) || TextUtils.isEmpty(strO0o)) {
            return;
        }
        m mVarM = m(strO00);
        Map<String, String> map = new HashMap<>();
        if (!mVarM.m) {
            map = mVarM.oonm();
        }
        com.thinkup.core.common.on.oo0 oo0Var = new com.thinkup.core.common.on.oo0(strO00, strO0o);
        oo0Var.o(map);
        n.m(context, oo0Var, new com.thinkup.core.common.n0.o0o() { // from class: com.thinkup.core.oo.o0.3
            @Override // com.thinkup.core.common.n0.o0o
            public final void onLoadCanceled(int i2) {
                o0.this.om();
            }

            @Override // com.thinkup.core.common.n0.o0o
            public final void onLoadError(int i2, String str, AdError adError) {
                o0.this.om();
            }

            @Override // com.thinkup.core.common.n0.o0o
            public final void onLoadFinish(int i2, Object obj) {
                o0.o(o0.this, context, obj, strO00);
            }

            @Override // com.thinkup.core.common.n0.o0o
            public final void onLoadStart(int i2) {
            }
        });
    }

    private m o(Context context, String str) {
        o0oo o0ooVar;
        List<o0oo> listO = com.thinkup.core.common.oo.om.o(com.thinkup.core.common.oo.oo.o(context)).o(str, this.m0);
        if (listO != null && listO.size() > 0 && (o0ooVar = listO.get(0)) != null) {
            try {
                m mVarO = m.o(new JSONObject(o0ooVar.o0()));
                if (mVarO != null) {
                    mVarO.o(Long.parseLong(o0ooVar.o()));
                }
                return mVarO;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private m o(final Context context, final String str, final JSONObject jSONObject) {
        try {
            m mVarM = o(context).m(str);
            if (!mVarM.mom()) {
                mVarM.o(jSONObject, null);
            }
        } catch (Throwable unused) {
        }
        final m mVarO = m.o(jSONObject);
        mVarO.o(System.currentTimeMillis());
        com.thinkup.core.common.ooo.m.m.o().o(new Runnable() { // from class: com.thinkup.core.oo.o0.1
            @Override // java.lang.Runnable
            public final void run() {
                com.thinkup.core.common.oo.om.o(com.thinkup.core.common.oo.oo.o(context)).o(str, jSONObject.toString(), o0.this.m0);
                onm.o(context, com.thinkup.core.common.n.oo0.m.o, "EU_INFO", mVarO.non());
            }
        });
        return mVarO;
    }

    public final void n(String str) {
        o0m o0mVar = this.mo;
        if (o0mVar != null) {
            o0mVar.o(str);
        }
    }

    public static long m() {
        if (o0 == null || o0.mmo() == 0) {
            return 204800L;
        }
        return o0.mmo();
    }

    public final synchronized void o(final String str, String str2) {
        try {
            if (this.om) {
                return;
            }
            this.om = true;
            com.thinkup.core.common.on.oo0 oo0Var = new com.thinkup.core.common.on.oo0(str, str2);
            oo0Var.om();
            if (o0 != null) {
                oo0Var.o(o0.oonm());
            }
            this.mm.o(this.oo, oo0Var, new com.thinkup.core.common.n0.o0o() { // from class: com.thinkup.core.oo.o0.2
                @Override // com.thinkup.core.common.n0.o0o
                public final void onLoadCanceled(int i2) {
                    o0.m(o0.this);
                    o0.this.om();
                }

                @Override // com.thinkup.core.common.n0.o0o
                public final void onLoadError(int i2, String str3, AdError adError) {
                    o0.m(o0.this);
                    o0.this.om();
                }

                @Override // com.thinkup.core.common.n0.o0o
                public final void onLoadFinish(int i2, Object obj) {
                    o0.m(o0.this);
                    o0 o0Var = o0.this;
                    o0.o(o0Var, o0Var.oo, obj, str);
                }

                @Override // com.thinkup.core.common.n0.o0o
                public final void onLoadStart(int i2) {
                }
            });
        } catch (Throwable th) {
            throw th;
        }
    }

    private static void o(Context context, m mVar) {
        if (mVar == null) {
            return;
        }
        String strO0n = mVar.o0n();
        if (TextUtils.isEmpty(strO0n)) {
            return;
        }
        com.thinkup.core.common.res.m.o(context).o(new com.thinkup.core.common.res.oo(3, strO0n), (com.thinkup.core.common.res.m.o) null);
    }

    private void o(JSONObject jSONObject) {
        JSONObject jSONObjectOom0;
        try {
            m mVarM = m(com.thinkup.core.common.n.o0n.m().o00());
            if (mVarM == null || (jSONObjectOom0 = mVarM.oom0()) == null) {
                return;
            }
            jSONObject.put("a_c", jSONObjectOom0);
        } catch (Exception unused) {
        }
    }

    private void o(Context context, Object obj, String str) {
        if (obj instanceof JSONObject) {
            m mVarO = o(context, str, (JSONObject) obj);
            if (mVarO != null) {
                o0 = mVarO;
                String strOm0 = mVarO.om0();
                if (!TextUtils.isEmpty(strOm0) && TextUtils.isEmpty(com.thinkup.core.common.n.o0n.m().onm())) {
                    com.thinkup.core.common.n.o0n.m().mm(strOm0);
                }
                com.thinkup.core.common.o0o.o(context).o(o0);
                m mVar = o0;
                if (mVar != null) {
                    String strO0n = mVar.o0n();
                    if (!TextUtils.isEmpty(strO0n)) {
                        com.thinkup.core.common.res.m.o(context).o(new com.thinkup.core.common.res.oo(3, strO0n), (com.thinkup.core.common.res.m.o) null);
                    }
                }
                com.thinkup.core.common.ooo.m.m.o().o(new AnonymousClass4());
                oon.o().o(o0.m0());
                com.thinkup.core.common.n.o().m(o0.mm());
                com.thinkup.core.common.o.nn.o().n();
                com.thinkup.core.common.n.o0n.m();
                com.thinkup.core.m.m.o(context.getApplicationContext()).o(mVarO.o0nm());
                com.thinkup.core.common.n.o0n.m().m0n();
                com.thinkup.core.common.n.o0n.m().o(mVarO);
                com.thinkup.core.common.ooo.oo.o().o(mVarO.on());
                com.thinkup.core.common.n.o0m o0mVarN = com.thinkup.core.common.n.o0n.m().n();
                if (o0mVarN != null) {
                    o0mVarN.uploadAegisData(mVarO);
                }
                com.thinkup.core.o.m.m.o().o(context.getApplicationContext());
            }
            om();
        }
    }

    public static /* synthetic */ void o(o0 o0Var, Context context, Object obj, String str) {
        if (obj instanceof JSONObject) {
            m mVarO = o0Var.o(context, str, (JSONObject) obj);
            if (mVarO != null) {
                o0 = mVarO;
                String strOm0 = mVarO.om0();
                if (!TextUtils.isEmpty(strOm0) && TextUtils.isEmpty(com.thinkup.core.common.n.o0n.m().onm())) {
                    com.thinkup.core.common.n.o0n.m().mm(strOm0);
                }
                com.thinkup.core.common.o0o.o(context).o(o0);
                m mVar = o0;
                if (mVar != null) {
                    String strO0n = mVar.o0n();
                    if (!TextUtils.isEmpty(strO0n)) {
                        com.thinkup.core.common.res.m.o(context).o(new com.thinkup.core.common.res.oo(3, strO0n), (com.thinkup.core.common.res.m.o) null);
                    }
                }
                com.thinkup.core.common.ooo.m.m.o().o(o0Var.new AnonymousClass4());
                oon.o().o(o0.m0());
                com.thinkup.core.common.n.o().m(o0.mm());
                com.thinkup.core.common.o.nn.o().n();
                com.thinkup.core.common.n.o0n.m();
                com.thinkup.core.m.m.o(context.getApplicationContext()).o(mVarO.o0nm());
                com.thinkup.core.common.n.o0n.m().m0n();
                com.thinkup.core.common.n.o0n.m().o(mVarO);
                com.thinkup.core.common.ooo.oo.o().o(mVarO.on());
                com.thinkup.core.common.n.o0m o0mVarN = com.thinkup.core.common.n.o0n.m().n();
                if (o0mVarN != null) {
                    o0mVarN.uploadAegisData(mVarO);
                }
                com.thinkup.core.o.m.m.o().o(context.getApplicationContext());
            }
            o0Var.om();
        }
    }
}
