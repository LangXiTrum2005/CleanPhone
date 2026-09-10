package com.thinkup.core.oo;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.common.on.nnn;
import com.thinkup.core.common.ooo.onm;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class nm {
    private static volatile nm m = null;
    public static final String o = "nm";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Context f42459n;
    private final o0n o0 = new o0n();
    private final nn om = new nn(this);
    private final o00 oo;

    public interface m {
        void m();

        void m(n0 n0Var);

        void o();

        void o(AdError adError);

        void o(n0 n0Var);
    }

    public static class o implements m {
        private m m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private volatile boolean f42463n = false;
        private final String o;

        public o(String str, m mVar) {
            this.o = str;
            this.m = mVar;
        }

        @Override // com.thinkup.core.oo.nm.m
        public final void m() {
            m mVar = this.m;
            if (mVar != null) {
                mVar.m();
            }
        }

        @Override // com.thinkup.core.oo.nm.m
        public final void o() {
            m mVar = this.m;
            if (mVar != null) {
                mVar.o();
            }
        }

        @Override // com.thinkup.core.oo.nm.m
        public final void m(n0 n0Var) {
            m mVar = this.m;
            if (mVar != null) {
                mVar.m(n0Var);
            }
        }

        @Override // com.thinkup.core.oo.nm.m
        public final void o(n0 n0Var) {
            if (this.m == null || this.f42463n) {
                return;
            }
            nm.o(com.thinkup.core.common.n.o0n.m().on()).m(this.o, n0Var.omon());
            this.f42463n = true;
            this.m.o(n0Var);
        }

        @Override // com.thinkup.core.oo.nm.m
        public final void o(AdError adError) {
            if (this.m == null || this.f42463n) {
                return;
            }
            this.f42463n = true;
            this.m.o(adError);
        }
    }

    private nm(Context context) {
        this.f42459n = context;
        this.oo = new o00(context);
    }

    public final boolean m0(String str) {
        return this.oo.m(com.thinkup.core.common.n.o0n.m().o00(), str);
    }

    public final int mm(String str) {
        return this.oo.oo(com.thinkup.core.common.n.o0n.m().o00(), str);
    }

    public final void mo(String str) {
        this.o0.o(str);
    }

    public final n0 o0(String str) {
        return this.oo.o(com.thinkup.core.common.n.o0n.m().o00(), str, 2);
    }

    public final n0 om(String str) {
        String strO00 = com.thinkup.core.common.n.o0n.m().o00();
        if (this.oo.o(com.thinkup.core.common.n.o0n.m().o00(), str, 0) != null) {
            this.oo.m(strO00, str, 1);
            return null;
        }
        n0 n0VarO = this.oo.o(strO00, str, 1);
        if (n0VarO == null) {
            n0VarO = this.o0.m(str);
        }
        if (n0VarO != null) {
            o(str, n0VarO, null, 1);
        }
        return n0VarO;
    }

    public final void on(String str) {
        this.oo.o0(com.thinkup.core.common.n.o0n.m().o00(), str);
    }

    public final n0 oo(String str) {
        return this.oo.o(com.thinkup.core.common.n.o0n.m().o00(), str, 0);
    }

    public static nm o(Context context) {
        if (m == null) {
            synchronized (nm.class) {
                try {
                    if (m == null) {
                        m = new nm(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    public final n0 m(String str) {
        return o(str);
    }

    public final n0 n(String str) {
        return this.oo.o(com.thinkup.core.common.n.o0n.m().o00(), str);
    }

    public final void m(String str, int i2) {
        this.oo.o(str, i2);
    }

    public final void o() {
        onm.o(this.f42459n, com.thinkup.core.common.n.oo0.m.mn);
    }

    public final void o(String str, n0 n0Var, JSONObject jSONObject, int i2) {
        this.oo.o(com.thinkup.core.common.n.o0n.m().o00(), str, n0Var, jSONObject, i2);
    }

    public final n0 o(String str) {
        return this.oo.n(com.thinkup.core.common.n.o0n.m().o00(), str);
    }

    public final n0 o(String str, int i2) {
        return this.oo.o(com.thinkup.core.common.n.o0n.m().o00(), str, i2);
    }

    public final void o(final n0 n0Var, final String str, final String str2, final String str3, final Map<String, Object> map, final m mVar, final int i2, final boolean z2, final TUAdRequest tUAdRequest) {
        com.thinkup.core.common.ooo.m.m.o().n(new Runnable() { // from class: com.thinkup.core.oo.nm.1
            final /* synthetic */ boolean m0 = true;

            @Override // java.lang.Runnable
            public final void run() {
                final o oVar = new o(str3, mVar);
                n0 n0Var2 = n0Var;
                String strNn0 = n0Var2 != null ? n0Var2.nn0() : "";
                Map<String, Object> mapO0 = com.thinkup.core.common.n.o0n.m().o0(str3);
                nnn nnnVar = new nnn(str, str2, str3, strNn0, mapO0, map, com.thinkup.core.common.ooo.o().on(str3), tUAdRequest);
                nnnVar.o(this.m0);
                nnnVar.o(i2);
                n0 n0Var3 = n0Var;
                if (n0Var3 != null) {
                    n0Var3.omon();
                }
                n0 n0Var4 = n0Var;
                com.thinkup.core.common.o0n.m mVar2 = null;
                if (n0Var4 == null) {
                    nm.this.om.o(nm.this.f42459n, nnnVar, new no(nm.this, nnnVar, oVar, null));
                    return;
                }
                if (n0Var4.onom()) {
                    n0Var.m(4);
                    oVar.o(n0Var);
                    return;
                }
                n0Var.m(3);
                nnnVar.o(n0Var.oonm());
                if (z2) {
                    nm.this.om.o(nm.this.f42459n, nnnVar, new no(nm.this, nnnVar, oVar, n0Var));
                    return;
                }
                if (n0Var.oonn()) {
                    oVar.o(n0Var);
                    nnnVar.o((Map<String, String>) null);
                    nm.this.om.o(nm.this.f42459n, nnnVar, new no(nm.this, nnnVar, oVar, n0Var));
                    return;
                }
                if (n0Var.om0o()) {
                    oVar.o(n0Var);
                    oVar.m = null;
                }
                n0 n0VarOo = nm.this.oo(str3);
                if (n0VarOo == null) {
                    nnnVar.o((Map<String, String>) null);
                    nm.this.om.o(nm.this.f42459n, nnnVar, new no(nm.this, nnnVar, oVar, n0Var));
                    return;
                }
                nnnVar.o(n0VarOo.oonm());
                boolean zEquals = mapO0.equals(n0VarOo.nmo());
                if (zEquals && !n0VarOo.on00() && !com.thinkup.core.common.o0m.o().m(nm.this.f42459n, str3) && !n0VarOo.on0o()) {
                    oVar.o(n0Var);
                    return;
                }
                final boolean[] zArr = new boolean[1];
                long jOnn0 = !zEquals ? n0VarOo.onn0() : n0VarOo.o0oo();
                com.thinkup.core.common.o0n.o oVarO = com.thinkup.core.common.o0n.o0.o();
                if (jOnn0 == 0) {
                    zArr[0] = true;
                    oVar.o(n0Var);
                } else {
                    mVar2 = new com.thinkup.core.common.o0n.m() { // from class: com.thinkup.core.oo.nm.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            zArr[0] = true;
                            n0Var.m(1);
                            oVar.o(n0Var);
                        }
                    };
                    oVarO.o(mVar2, jOnn0, false);
                }
                com.thinkup.core.common.o0n.m mVar3 = mVar2;
                com.thinkup.core.o0.m.o().m(str3);
                nm.this.om.o(nm.this.f42459n, nnnVar, new no(nm.this, nnnVar, oVar, n0Var, oVarO, mVar3, zArr));
            }
        }, 2);
    }

    private void o(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        n0 n0VarO;
        JSONObject jSONObjectOomn;
        if (jSONObject != null) {
            if (jSONObject2 == null && TextUtils.isEmpty(str)) {
                return;
            }
            try {
                if (jSONObject2 != null) {
                    jSONObject.put("p_c", jSONObject2);
                } else {
                    if (TextUtils.isEmpty(str) || (n0VarO = o(str)) == null || (jSONObjectOomn = n0VarO.oomn()) == null) {
                        return;
                    }
                    jSONObject.put("p_c", jSONObjectOomn);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void o(Object obj, final nnn nnnVar, m mVar, boolean[] zArr, n0 n0Var) {
        if (!(obj instanceof JSONObject) || nnnVar == null) {
            if (mVar != null) {
                if (n0Var == null) {
                    mVar.o(ErrorCode.getErrorCode("3001", "", "Placement LoadParams error."));
                    return;
                } else {
                    mVar.o(n0Var);
                    return;
                }
            }
            return;
        }
        JSONObject jSONObject = (JSONObject) obj;
        try {
            jSONObject.put("updateTime", System.currentTimeMillis());
            n0 n0VarO = o(nnnVar.o0(), jSONObject.optInt("pl_wf_st_type", 0));
            if (n0VarO != null) {
                n0VarO.o(jSONObject, nnnVar.o0());
            }
        } catch (Throwable th) {
            Log.e(o, "parse place strategy error:" + th.getMessage());
        }
        final n0 n0VarO2 = n0.o(nnnVar.o0(), jSONObject);
        final String strO0 = nnnVar.o0();
        if (n0VarO2 != null) {
            n0VarO2.m(nnnVar.nn() ? 5 : 2);
            if (n0VarO2.o0om() != 1) {
                jSONObject = null;
            }
            o(strO0, n0VarO2, jSONObject, n0VarO2.omon());
            int iM0 = nnnVar.m0();
            n0VarO2.omon();
            if (iM0 == 3 && n0VarO2.om0o()) {
                nnnVar.o(2);
                nnnVar.o((Map<String, String>) null);
                this.om.o(this.f42459n, nnnVar);
            } else if (n0VarO2.om0m()) {
                com.thinkup.core.common.ooo.m.m.o().o(new Runnable() { // from class: com.thinkup.core.oo.nm.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (n0VarO2.nmm() == 1) {
                            com.thinkup.core.common.o0m.o().o(nm.this.f42459n, strO0, n0VarO2.oon0());
                        }
                        if (!n0VarO2.om00()) {
                            nm.this.oo.m(nnnVar.m(), strO0, 2);
                            return;
                        }
                        nnnVar.o(1);
                        n0 n0VarO0 = nm.this.o0(strO0);
                        if (n0VarO0 != null) {
                            nnnVar.o(n0VarO0.oonm());
                        } else {
                            nnnVar.o((Map<String, String>) null);
                        }
                        nm.this.om.o(nm.this.f42459n, nnnVar);
                    }
                });
            }
        }
        if (zArr != null && zArr.length > 0 && zArr[0]) {
            if (mVar == null || n0VarO2 == null) {
                return;
            }
            mVar.m(n0VarO2);
            return;
        }
        if (mVar != null) {
            if (n0VarO2 != null) {
                mVar.o(n0VarO2);
            } else {
                mVar.o(ErrorCode.getErrorCode("3001", "", "Placement Service error."));
            }
        }
    }

    public static boolean o(n0 n0Var) {
        if (n0Var == null) {
            return false;
        }
        int iOmon = n0Var.omon();
        if (iOmon != 0) {
            if (iOmon == 1) {
                n0Var.mo();
                return true;
            }
            if (iOmon != 2) {
                n0Var.mo();
                return true;
            }
        }
        if (n0Var.on0o()) {
            n0Var.mo();
            return false;
        }
        n0Var.mo();
        return true;
    }

    public final void o(String str, String str2, n0 n0Var) {
        if (n0Var == null) {
            return;
        }
        this.oo.m(str, str2, n0Var.omon());
    }
}
