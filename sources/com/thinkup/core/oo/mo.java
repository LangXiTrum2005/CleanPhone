package com.thinkup.core.oo;

import android.content.Context;
import com.thinkup.core.api.AdError;
import com.thinkup.core.common.on.n00;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class mo {
    private static volatile mo m = null;
    public static final String o = "mo";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Context f42455n;

    public interface o {
        void o(String str);

        void o(JSONObject jSONObject);
    }

    private mo(Context context) {
        this.f42455n = context.getApplicationContext();
    }

    private static void m(Object obj, o oVar) {
        if (!(obj instanceof JSONObject)) {
            if (oVar != null) {
                oVar.o("get mediation adapter Strategy error");
            }
        } else {
            JSONObject jSONObject = (JSONObject) obj;
            o(jSONObject);
            if (oVar != null) {
                oVar.o(jSONObject);
            }
        }
    }

    public static mo o(Context context) {
        if (m == null) {
            synchronized (mo.class) {
                try {
                    if (m == null) {
                        m = new mo(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    private static m0 o(JSONObject jSONObject) {
        try {
            jSONObject.put(m0.m.m, System.currentTimeMillis());
        } catch (Throwable unused) {
        }
        return m0.o(jSONObject);
    }

    public final synchronized void o(n00 n00Var, final o oVar) {
        new com.thinkup.core.common.n0.no(this.f42455n, n00Var).o(0, new com.thinkup.core.common.n0.o0o() { // from class: com.thinkup.core.oo.mo.1
            @Override // com.thinkup.core.common.n0.o0o
            public final void onLoadCanceled(int i2) {
                o oVar2 = oVar;
                if (oVar2 != null) {
                    oVar2.o("Request cancel");
                }
            }

            @Override // com.thinkup.core.common.n0.o0o
            public final void onLoadError(int i2, String str, AdError adError) {
                o oVar2 = oVar;
                if (oVar2 != null) {
                    if (str == null) {
                        str = "Request Strategy error.";
                    }
                    oVar2.o(str);
                }
            }

            @Override // com.thinkup.core.common.n0.o0o
            public final void onLoadFinish(int i2, Object obj) {
                Context unused = mo.this.f42455n;
                mo.o(obj, oVar);
            }

            @Override // com.thinkup.core.common.n0.o0o
            public final void onLoadStart(int i2) {
            }
        });
    }

    public static /* synthetic */ void o(Object obj, o oVar) {
        if (!(obj instanceof JSONObject)) {
            if (oVar != null) {
                oVar.o("get mediation adapter Strategy error");
            }
        } else {
            JSONObject jSONObject = (JSONObject) obj;
            o(jSONObject);
            if (oVar != null) {
                oVar.o(jSONObject);
            }
        }
    }
}
