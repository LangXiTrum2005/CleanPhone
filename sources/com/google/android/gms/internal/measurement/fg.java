package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fg extends p4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q6 f23468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f23469d;

    public fg(q6 q6Var) {
        super("require");
        this.f23469d = new HashMap();
        this.f23468c = q6Var;
    }

    @Override // com.google.android.gms.internal.measurement.p4
    public final b6 a(d8 d8Var, List list) {
        b6 b6Var;
        yg.c(1, "require", list);
        String strZzc = ((h6) d8Var.f23388c).e(d8Var, (b6) list.get(0)).zzc();
        HashMap map = this.f23469d;
        if (map.containsKey(strZzc)) {
            return (b6) map.get(strZzc);
        }
        HashMap map2 = (HashMap) this.f23468c.f23891b;
        if (map2.containsKey(strZzc)) {
            try {
                b6Var = (b6) ((Callable) map2.get(strZzc)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strZzc)));
            }
        } else {
            b6Var = b6.S8;
        }
        if (b6Var instanceof p4) {
            map.put(strZzc, (p4) b6Var);
        }
        return b6Var;
    }
}
