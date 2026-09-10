package com.thinkup.core.common.oo0;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.model.a;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.n0.oom;
import com.thinkup.core.common.no;
import com.thinkup.core.common.o00;
import com.thinkup.core.common.o0o;
import com.thinkup.core.common.on.n0;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.o0mo;
import com.thinkup.core.common.on.on0;
import com.thinkup.core.common.oon;
import com.thinkup.core.common.ooo;
import com.thinkup.core.common.ooo.m0n;
import com.thinkup.core.common.ooo.nn;
import com.thinkup.core.oo.nm;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public class n extends no<com.thinkup.core.common.on.no> {
    private static volatile n on;

    private n(Context context) {
        super(context);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c8  */
    private com.thinkup.core.common.on.no m(int i2, o0mo o0moVar, o0mm o0mmVar, long j) {
        List<String> listMno;
        List<com.thinkup.core.common.on.o> listO;
        on0 on0VarN0n;
        o(i2, o0mmVar, false);
        if (i2 == 4) {
            on0 on0VarN0n2 = o0mmVar != null ? o0mmVar.n0n() : null;
            if (on0VarN0n2 != null) {
                com.thinkup.core.n.o0.n.o(on0VarN0n2, true, on0VarN0n2.getSortPrice(), true, false);
            }
            if (o0moVar instanceof n0) {
                n0 n0Var = (n0) o0moVar;
                String strOomn = n0Var.oomn();
                com.thinkup.core.oo.n0 n0VarO = nm.o(this.o0).o(strOomn);
                if (n0VarO != null && (listMno = n0VarO.mno()) != null && listMno.size() != 0 && (listO = com.thinkup.core.common.o.o().o(strOomn)) != null) {
                    for (com.thinkup.core.common.on.o oVar : listO) {
                        if (oVar != null && oVar.n() == 0) {
                            n0 n0VarMo = oVar.mo();
                            o0mm unitGroupInfo = oVar.oo().getUnitGroupInfo();
                            boolean zO0m = (!m0n.m(unitGroupInfo) || unitGroupInfo.n0n() == null) ? false : unitGroupInfo.n0n().o0m();
                            if (listMno.contains(String.valueOf(unitGroupInfo.nm())) && !TextUtils.equals(n0Var.om0(), n0VarMo.om0()) && (on0VarN0n = unitGroupInfo.n0n()) != null) {
                                com.thinkup.core.n.o0.n.o(on0VarN0n, false, nn.o(o0mmVar), n0Var.mo0() == 1, zO0m);
                            }
                        }
                    }
                }
            }
        }
        if (i2 == 4) {
            if (o0moVar instanceof n0) {
                if (o0mmVar != null) {
                    n0 n0Var2 = (n0) o0moVar;
                    com.thinkup.core.o0.o.o().o(n0Var2, o0mmVar);
                    if (o0mmVar.n0m() && o0mmVar.ooon() > 0.0d) {
                        n0Var2.oo(o0mmVar.ooon());
                    }
                }
                n0 n0Var3 = (n0) o0moVar;
                if (n0Var3.mo() == 2) {
                    oon.o().o(o0moVar.oomn(), n0Var3.o());
                }
                com.thinkup.core.common.o0.o().o(o0moVar.oomn(), o0moVar.oon0(), n0Var3.mon());
            }
            com.thinkup.core.o0.m.o().o(o0moVar, o0mmVar);
        }
        if (i2 == 6 && (o0moVar instanceof n0)) {
            com.thinkup.core.common.o0.o().m(o0moVar.oomn(), o0moVar.oon0(), ((n0) o0moVar).mon());
        }
        com.thinkup.core.oo.m mVarH = a.h(a.i());
        com.thinkup.core.common.on.no noVar = new com.thinkup.core.common.on.no();
        noVar.o = i2;
        noVar.m = o0moVar;
        noVar.f42216n = j > 0 ? j : System.currentTimeMillis();
        o0o.o(o0n.m().on()).o(i2, noVar, mVarH);
        if (4 == i2 && (o0moVar instanceof n0)) {
            o00.o();
            o00.o((n0) o0moVar);
        }
        if (o(i2, o0moVar, mVarH)) {
            return null;
        }
        return noVar;
    }

    private static boolean n(int i2, o0mo o0moVar) {
        if (!(o0moVar instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) o0moVar;
        if (n0Var.n0n() == 67) {
            return true;
        }
        if (n0Var.n0n() == 0 || TextUtils.isEmpty(o0moVar.oono())) {
            return false;
        }
        if (!TextUtils.isEmpty(n0Var.o0mn()) || !TextUtils.isEmpty(n0Var.o0n0())) {
            return true;
        }
        Map<String, String> mapO = a.i().m(o0n.m().o00()).o(i2);
        if (mapO != null) {
            if (mapO.containsKey("0")) {
                String str = mapO.get("0");
                return !TextUtils.isEmpty(str) && str.contains(o0moVar.oono());
            }
            if (mapO.containsKey(String.valueOf(n0Var.n0n()))) {
                String str2 = mapO.get(String.valueOf(n0Var.n0n()));
                if (!TextUtils.isEmpty(str2) && str2.contains(o0moVar.oono())) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void o0(int i2, o0mo o0moVar) {
        if (4 == i2 && (o0moVar instanceof n0)) {
            o00.o();
            o00.o((n0) o0moVar);
        }
    }

    private static void oo(int i2, o0mo o0moVar) {
        if (o0moVar instanceof n0) {
            if (i2 == 4) {
                n0 n0Var = (n0) o0moVar;
                n0Var.no();
                ooo.o().m(o0moVar.oomn(), o0moVar.oon0(), n0Var.mon());
            } else if (i2 == 6) {
                ((n0) o0moVar).nm();
            } else if (i2 == 10) {
                n0 n0Var2 = (n0) o0moVar;
                com.thinkup.core.common.oo.o(o0moVar.oo0o(), com.thinkup.core.common.oo.f42258n, n0Var2);
                o(o0moVar);
                oo.m(n0Var2, 1);
            } else if (i2 == 21) {
                o0n.m().mnm();
            }
            m.o().o(i2, (n0) o0moVar);
        }
    }

    @Override // com.thinkup.core.common.no
    public final void o(List<com.thinkup.core.common.on.no> list) {
        com.thinkup.core.oo.m mVarH = a.h(a.i());
        if (mVarH == null) {
            new oom(this.o0, 0, list).o(0, (com.thinkup.core.common.n0.o0o) null);
            return;
        }
        int iOmm = mVarH.omm();
        if (iOmm == 1) {
            com.thinkup.core.common.n0.o0.om omVar = new com.thinkup.core.common.n0.o0.om(list);
            omVar.o(1, mVarH.omo());
            omVar.o((com.thinkup.core.common.n0.o0.o0.o) null);
        } else {
            if (iOmm != 2) {
                new oom(this.o0, mVarH.omm(), list).o(0, (com.thinkup.core.common.n0.o0o) null);
                return;
            }
            new oom(this.o0, mVarH.omm(), list).o(0, (com.thinkup.core.common.n0.o0o) null);
            com.thinkup.core.common.n0.o0.om omVar2 = new com.thinkup.core.common.n0.o0.om(list);
            omVar2.o(2, mVarH.omo());
            omVar2.o((com.thinkup.core.common.n0.o0.o0.o) null);
        }
    }

    private static void n(int i2, o0mo o0moVar, o0mm o0mmVar) {
        if (i2 == 4) {
            if (o0moVar instanceof n0) {
                if (o0mmVar != null) {
                    n0 n0Var = (n0) o0moVar;
                    com.thinkup.core.o0.o.o().o(n0Var, o0mmVar);
                    if (o0mmVar.n0m() && o0mmVar.ooon() > 0.0d) {
                        n0Var.oo(o0mmVar.ooon());
                    }
                }
                n0 n0Var2 = (n0) o0moVar;
                if (n0Var2.mo() == 2) {
                    oon.o().o(o0moVar.oomn(), n0Var2.o());
                }
                com.thinkup.core.common.o0.o().o(o0moVar.oomn(), o0moVar.oon0(), n0Var2.mon());
            }
            com.thinkup.core.o0.m.o().o(o0moVar, o0mmVar);
        }
    }

    public static n o(Context context) {
        if (on == null) {
            synchronized (n.class) {
                try {
                    if (on == null) {
                        on = new n(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return on;
    }

    public final void o(int i2, o0mo o0moVar) {
        o(i2, o0moVar, null, -1L);
    }

    public final void o(int i2, o0mo o0moVar, o0mm o0mmVar) {
        o(i2, o0moVar, o0mmVar, -1L);
    }

    public final void o(final int i2, final o0mo o0moVar, final o0mm o0mmVar, final long j) {
        if (o0moVar == null) {
            return;
        }
        synchronized (o0moVar) {
            o(i2, o0mmVar, true);
            oo(i2, o0moVar);
        }
        Handler handler = this.oo;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.thinkup.core.common.oo0.n.1
                @Override // java.lang.Runnable
                public final void run() {
                    com.thinkup.core.common.on.no noVarO = n.o(n.this, i2, o0moVar, o0mmVar, j);
                    if (noVarO == null) {
                        return;
                    }
                    n.this.o(noVarO, n.m(i2, o0moVar));
                }
            });
        }
    }

    private static void o(int i2, o0mm o0mmVar, boolean z2) {
        if (o0mmVar != null) {
            int iNm = o0mmVar.nm();
            if (z2) {
                if (iNm == 79 || (iNm == 50 && o0mmVar.onoo() == 1)) {
                    o(i2, o0mmVar);
                    return;
                }
                return;
            }
            if (iNm == 79) {
                return;
            }
            if (iNm == 50 && o0mmVar.onoo() == 1) {
                return;
            }
            o(i2, o0mmVar);
        }
    }

    private static void o(int i2, o0mm o0mmVar) {
        if (i2 == 13) {
            on0 on0VarN0n = o0mmVar != null ? o0mmVar.n0n() : null;
            if (on0VarN0n != null) {
                com.thinkup.core.n.o0.n.o(on0VarN0n, o0mmVar, 1);
            }
        }
    }

    private static boolean o(int i2, o0mo o0moVar, com.thinkup.core.oo.m mVar) {
        if (o0n.m().omn()) {
            return true;
        }
        String strO0om = mVar.o0om();
        if (!TextUtils.isEmpty(strO0om) && (o0moVar instanceof n0)) {
            try {
                JSONArray jSONArray = new JSONArray(strO0om);
                int length = jSONArray.length();
                String strValueOf = String.valueOf(((n0) o0moVar).n0n());
                for (int i3 = 0; i3 < length; i3++) {
                    if (TextUtils.equals(strValueOf, jSONArray.optString(i3))) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        Map<String, String> mapO0o0 = mVar.o0o0();
        if (mapO0o0 != null && mapO0o0.containsKey(String.valueOf(i2))) {
            String str = mapO0o0.get(String.valueOf(i2));
            if (!TextUtils.isEmpty(str)) {
                String strOono = o0moVar.oono();
                if (TextUtils.isEmpty(strOono) || str.contains(strOono)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void m(int i2, o0mo o0moVar, o0mm o0mmVar) {
        n0 n0Var;
        String strOomn;
        com.thinkup.core.oo.n0 n0VarO;
        List<String> listMno;
        List<com.thinkup.core.common.on.o> listO;
        on0 on0VarN0n;
        if (i2 == 4) {
            on0 on0VarN0n2 = o0mmVar != null ? o0mmVar.n0n() : null;
            if (on0VarN0n2 != null) {
                com.thinkup.core.n.o0.n.o(on0VarN0n2, true, on0VarN0n2.getSortPrice(), true, false);
            }
            if (!(o0moVar instanceof n0) || (n0VarO = nm.o(this.o0).o((strOomn = (n0Var = (n0) o0moVar).oomn()))) == null || (listMno = n0VarO.mno()) == null || listMno.size() == 0 || (listO = com.thinkup.core.common.o.o().o(strOomn)) == null) {
                return;
            }
            for (com.thinkup.core.common.on.o oVar : listO) {
                if (oVar != null && oVar.n() == 0) {
                    n0 n0VarMo = oVar.mo();
                    o0mm unitGroupInfo = oVar.oo().getUnitGroupInfo();
                    boolean zO0m = (!m0n.m(unitGroupInfo) || unitGroupInfo.n0n() == null) ? false : unitGroupInfo.n0n().o0m();
                    if (listMno.contains(String.valueOf(unitGroupInfo.nm())) && !TextUtils.equals(n0Var.om0(), n0VarMo.om0()) && (on0VarN0n = unitGroupInfo.n0n()) != null) {
                        com.thinkup.core.n.o0.n.o(on0VarN0n, false, nn.o(o0mmVar), n0Var.mo0() == 1, zO0m);
                    }
                }
            }
        }
    }

    private void o(n0 n0Var, o0mm o0mmVar) {
        List<String> listMno;
        List<com.thinkup.core.common.on.o> listO;
        on0 on0VarN0n;
        String strOomn = n0Var.oomn();
        com.thinkup.core.oo.n0 n0VarO = nm.o(this.o0).o(strOomn);
        if (n0VarO == null || (listMno = n0VarO.mno()) == null || listMno.size() == 0 || (listO = com.thinkup.core.common.o.o().o(strOomn)) == null) {
            return;
        }
        for (com.thinkup.core.common.on.o oVar : listO) {
            if (oVar != null && oVar.n() == 0) {
                n0 n0VarMo = oVar.mo();
                o0mm unitGroupInfo = oVar.oo().getUnitGroupInfo();
                boolean zO0m = (!m0n.m(unitGroupInfo) || unitGroupInfo.n0n() == null) ? false : unitGroupInfo.n0n().o0m();
                if (listMno.contains(String.valueOf(unitGroupInfo.nm())) && !TextUtils.equals(n0Var.om0(), n0VarMo.om0()) && (on0VarN0n = unitGroupInfo.n0n()) != null) {
                    com.thinkup.core.n.o0.n.o(on0VarN0n, false, nn.o(o0mmVar), n0Var.mo0() == 1, zO0m);
                }
            }
        }
    }

    public static /* synthetic */ boolean m(int i2, o0mo o0moVar) {
        if (o0moVar instanceof n0) {
            n0 n0Var = (n0) o0moVar;
            if (n0Var.n0n() == 67) {
                return true;
            }
            if (n0Var.n0n() != 0 && !TextUtils.isEmpty(o0moVar.oono())) {
                if (!TextUtils.isEmpty(n0Var.o0mn()) || !TextUtils.isEmpty(n0Var.o0n0())) {
                    return true;
                }
                Map<String, String> mapO = a.i().m(o0n.m().o00()).o(i2);
                if (mapO != null) {
                    if (mapO.containsKey("0")) {
                        String str = mapO.get("0");
                        return !TextUtils.isEmpty(str) && str.contains(o0moVar.oono());
                    }
                    if (mapO.containsKey(String.valueOf(n0Var.n0n()))) {
                        String str2 = mapO.get(String.valueOf(n0Var.n0n()));
                        return !TextUtils.isEmpty(str2) && str2.contains(o0moVar.oono());
                    }
                }
            }
        }
        return false;
    }

    private static void o(o0mo o0moVar) {
        if (o0moVar instanceof n0) {
            oo.m((n0) o0moVar);
        }
    }

    public static /* synthetic */ com.thinkup.core.common.on.no o(n nVar, int i2, o0mo o0moVar, o0mm o0mmVar, long j) {
        n0 n0Var;
        String strOomn;
        com.thinkup.core.oo.n0 n0VarO;
        List<String> listMno;
        List<com.thinkup.core.common.on.o> listO;
        on0 on0VarN0n;
        o(i2, o0mmVar, false);
        if (i2 == 4) {
            on0 on0VarN0n2 = o0mmVar != null ? o0mmVar.n0n() : null;
            if (on0VarN0n2 != null) {
                com.thinkup.core.n.o0.n.o(on0VarN0n2, true, on0VarN0n2.getSortPrice(), true, false);
            }
            if ((o0moVar instanceof n0) && (n0VarO = nm.o(nVar.o0).o((strOomn = (n0Var = (n0) o0moVar).oomn()))) != null && (listMno = n0VarO.mno()) != null && listMno.size() != 0 && (listO = com.thinkup.core.common.o.o().o(strOomn)) != null) {
                for (com.thinkup.core.common.on.o oVar : listO) {
                    if (oVar != null && oVar.n() == 0) {
                        n0 n0VarMo = oVar.mo();
                        o0mm unitGroupInfo = oVar.oo().getUnitGroupInfo();
                        boolean zO0m = (!m0n.m(unitGroupInfo) || unitGroupInfo.n0n() == null) ? false : unitGroupInfo.n0n().o0m();
                        if (listMno.contains(String.valueOf(unitGroupInfo.nm())) && !TextUtils.equals(n0Var.om0(), n0VarMo.om0()) && (on0VarN0n = unitGroupInfo.n0n()) != null) {
                            com.thinkup.core.n.o0.n.o(on0VarN0n, false, nn.o(o0mmVar), n0Var.mo0() == 1, zO0m);
                        }
                    }
                }
            }
        }
        if (i2 == 4) {
            if (o0moVar instanceof n0) {
                if (o0mmVar != null) {
                    n0 n0Var2 = (n0) o0moVar;
                    com.thinkup.core.o0.o.o().o(n0Var2, o0mmVar);
                    if (o0mmVar.n0m() && o0mmVar.ooon() > 0.0d) {
                        n0Var2.oo(o0mmVar.ooon());
                    }
                }
                n0 n0Var3 = (n0) o0moVar;
                if (n0Var3.mo() == 2) {
                    oon.o().o(o0moVar.oomn(), n0Var3.o());
                }
                com.thinkup.core.common.o0.o().o(o0moVar.oomn(), o0moVar.oon0(), n0Var3.mon());
            }
            com.thinkup.core.o0.m.o().o(o0moVar, o0mmVar);
        }
        if (i2 == 6 && (o0moVar instanceof n0)) {
            com.thinkup.core.common.o0.o().m(o0moVar.oomn(), o0moVar.oon0(), ((n0) o0moVar).mon());
        }
        com.thinkup.core.oo.m mVarH = a.h(a.i());
        com.thinkup.core.common.on.no noVar = new com.thinkup.core.common.on.no();
        noVar.o = i2;
        noVar.m = o0moVar;
        noVar.f42216n = j > 0 ? j : System.currentTimeMillis();
        o0o.o(o0n.m().on()).o(i2, noVar, mVarH);
        if (4 == i2 && (o0moVar instanceof n0)) {
            o00.o();
            o00.o((n0) o0moVar);
        }
        if (o(i2, o0moVar, mVarH)) {
            return null;
        }
        return noVar;
    }
}
