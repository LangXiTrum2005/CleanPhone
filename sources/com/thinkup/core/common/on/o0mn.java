package com.thinkup.core.common.on;

import android.support.v4.media.a;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class o0mn {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f42232n;
    private final String o = "tpn_thinkup_o0mn";
    private int m = 1;
    private ConcurrentHashMap<String, o0o0> o0 = new ConcurrentHashMap<>(3);

    public interface o {
        boolean o(o0o0 o0o0Var);
    }

    public o0mn(String str, String str2) {
        this.f42232n = a.D(str, "_", str2);
    }

    public final synchronized void m(final int i2) {
        o(new o() { // from class: com.thinkup.core.common.on.o0mn.3
            @Override // com.thinkup.core.common.on.o0mn.o
            public final boolean o(o0o0 o0o0Var) {
                o0o0Var.o(i2);
                return true;
            }
        });
    }

    public final void o(int i2) {
        if (i2 <= 0) {
            return;
        }
        this.m = i2;
    }

    public final synchronized void o(String str, o0o0 o0o0Var) {
        this.o0.put(str, o0o0Var);
        o();
    }

    private synchronized void o() {
        try {
            if (this.o0.entrySet() == null) {
                return;
            }
            if (this.o0.size() <= this.m) {
                return;
            }
            this.o0.size();
            final o0o0[] o0o0VarArr = new o0o0[1];
            o(new o() { // from class: com.thinkup.core.common.on.o0mn.1
                @Override // com.thinkup.core.common.on.o0mn.o
                public final boolean o(o0o0 o0o0Var) {
                    o0o0[] o0o0VarArr2 = o0o0VarArr;
                    if (o0o0VarArr2[0] == null) {
                        o0o0VarArr2[0] = o0o0Var;
                    } else if (com.thinkup.core.common.ooo.mn.o(o0o0Var.oo(), o0o0VarArr[0].oo()) <= 0 && (com.thinkup.core.common.ooo.mn.o(o0o0Var.oo(), o0o0VarArr[0].oo()) != 0 || o0o0Var.om() >= o0o0VarArr[0].om())) {
                        return true;
                    }
                    o0o0VarArr[0] = o0o0Var;
                    return true;
                }
            });
            if (this.o0.size() <= this.m) {
                this.o0.size();
            } else {
                o0o0 o0o0Var = o0o0VarArr[0];
                if (o0o0Var != null) {
                    o0o0Var.o();
                    this.o0.remove(o0o0VarArr[0].o());
                    o0o0VarArr[0].on();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final m0 o(final on0 on0Var) {
        final m0 m0Var = new m0();
        final ArrayList arrayList = new ArrayList(3);
        m0Var.o = arrayList;
        o(new o() { // from class: com.thinkup.core.common.on.o0mn.2
            @Override // com.thinkup.core.common.on.o0mn.o
            public final boolean o(o0o0 o0o0Var) {
                if (!m0Var.f42191n && o0o0Var.o0()) {
                    m0Var.f42191n = true;
                }
                com.thinkup.core.common.on.o oVarN = o0o0Var.n();
                if (oVarN != null) {
                    if (arrayList.size() == 0) {
                        arrayList.add(oVarN);
                    } else {
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            if (com.thinkup.core.common.ooo.mn.o(oVarN.oo().getUnitGroupInfo(), ((com.thinkup.core.common.on.o) arrayList.get(i2)).oo().getUnitGroupInfo()) < 0) {
                                arrayList.add(i2, oVarN);
                                break;
                            }
                            if (i2 == arrayList.size() - 1) {
                                arrayList.add(oVarN);
                                break;
                            }
                        }
                    }
                    on0 on0VarN0n = oVarN.oo().getUnitGroupInfo().n0n();
                    on0 on0Var2 = on0Var;
                    if (on0Var2 != null && on0VarN0n != null && TextUtils.equals(on0Var2.token, on0VarN0n.token)) {
                        m0Var.m = oVarN;
                    }
                }
                return true;
            }
        });
        return m0Var;
    }

    public final synchronized void o(com.thinkup.core.common.on.o oVar) {
        if (this.o0 == null) {
            return;
        }
        if (oVar != null) {
            o0o0 o0o0Var = this.o0.get(oVar.mo().oon0());
            if (o0o0Var != null) {
                o0o0Var.o(oVar);
                if (o0o0Var.m() == 0) {
                    this.o0.remove(o0o0Var.o());
                    o0o0Var.o();
                }
            }
        }
    }

    private synchronized void o(o oVar) {
        try {
            ConcurrentHashMap<String, o0o0> concurrentHashMap = this.o0;
            if (concurrentHashMap == null) {
                return;
            }
            Set<Map.Entry<String, o0o0>> setEntrySet = concurrentHashMap.entrySet();
            if (setEntrySet == null) {
                return;
            }
            for (Map.Entry<String, o0o0> entry : setEntrySet) {
                o0o0 value = entry.getValue();
                com.thinkup.core.common.on.o oVarN = value.n();
                if (oVarN != null && oVarN.mn()) {
                    entry.getKey();
                    com.thinkup.core.common.ooo.nn.o(value.oo());
                    oVarN.toString();
                    entry.getKey();
                    oVar.o(value);
                } else {
                    entry.getKey();
                    entry.getKey();
                    this.o0.remove(entry.getKey());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
