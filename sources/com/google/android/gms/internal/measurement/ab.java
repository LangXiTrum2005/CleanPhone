package com.google.android.gms.internal.measurement;

import androidx.core.app.NotificationCompat;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ab extends p4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23299c = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f23300d;

    public ab(h6 h6Var) {
        super("internal.registerCallback");
        this.f23300d = h6Var;
    }

    @Override // com.google.android.gms.internal.measurement.p4
    public final b6 a(d8 d8Var, List list) {
        TreeMap treeMap;
        switch (this.f23299c) {
            case 0:
                yg.c(3, this.f23836a, list);
                String strZzc = ((h6) d8Var.f23388c).e(d8Var, (b6) list.get(0)).zzc();
                b6 b6Var = (b6) list.get(1);
                h6 h6Var = (h6) d8Var.f23388c;
                long jL = (long) yg.l(h6Var.e(d8Var, b6Var).zzd().doubleValue());
                b6 b6VarE = h6Var.e(d8Var, (b6) list.get(2));
                HashMap mapN = b6VarE instanceof y5 ? yg.n((y5) b6VarE) : new HashMap();
                v9.e eVar = (v9.e) this.f23300d;
                eVar.getClass();
                HashMap map = new HashMap();
                for (String str : mapN.keySet()) {
                    HashMap map2 = ((b) eVar.f52503b).f23307c;
                    map.put(str, b.b(str, map2.containsKey(str) ? map2.get(str) : null, mapN.get(str)));
                }
                ((ArrayList) eVar.f52505d).add(new b(strZzc, jL, map));
                return b6.S8;
            case 1:
                yg.c(2, "getValue", list);
                b6 b6VarE2 = ((h6) d8Var.f23388c).e(d8Var, (b6) list.get(0));
                b6 b6VarE3 = ((h6) d8Var.f23388c).e(d8Var, (b6) list.get(1));
                String strZzc2 = b6VarE2.zzc();
                eb.d0 d0Var = (eb.d0) this.f23300d;
                Map map3 = (Map) ((ea.f1) d0Var.f39977c).f39397d.get((String) d0Var.f39976b);
                String str2 = (map3 == null || !map3.containsKey(strZzc2)) ? null : (String) map3.get(strZzc2);
                return str2 != null ? new e6(str2) : b6VarE3;
            case 2:
                return b6.S8;
            case 3:
                try {
                    return h.b(((ea.e1) this.f23300d).call());
                } catch (Exception unused) {
                    return b6.S8;
                }
            default:
                yg.c(3, this.f23836a, list);
                ((h6) d8Var.f23388c).e(d8Var, (b6) list.get(0)).zzc();
                b6 b6Var2 = (b6) list.get(1);
                h6 h6Var2 = (h6) d8Var.f23388c;
                b6 b6VarE4 = h6Var2.e(d8Var, b6Var2);
                if (!(b6VarE4 instanceof a6)) {
                    throw new IllegalArgumentException("Invalid callback type");
                }
                b6 b6VarE5 = h6Var2.e(d8Var, (b6) list.get(2));
                if (!(b6VarE5 instanceof y5)) {
                    throw new IllegalArgumentException("Invalid callback params");
                }
                y5 y5Var = (y5) b6VarE5;
                HashMap map4 = y5Var.f24170a;
                if (!map4.containsKey("type")) {
                    throw new IllegalArgumentException("Undefined rule type");
                }
                String strZzc3 = y5Var.zzk("type").zzc();
                int iK = map4.containsKey(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY) ? yg.k(y5Var.zzk(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY).zzd().doubleValue()) : 1000;
                h6 h6Var3 = (h6) this.f23300d;
                a6 a6Var = (a6) b6VarE4;
                h6Var3.getClass();
                if ("create".equals(strZzc3)) {
                    treeMap = (TreeMap) h6Var3.f23541c;
                } else {
                    if (!"edit".equals(strZzc3)) {
                        throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(strZzc3)));
                    }
                    treeMap = (TreeMap) h6Var3.f23540b;
                }
                if (treeMap.containsKey(Integer.valueOf(iK))) {
                    iK = ((Integer) treeMap.lastKey()).intValue() + 1;
                }
                treeMap.put(Integer.valueOf(iK), a6Var);
                return b6.S8;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(qc qcVar, eb.d0 d0Var) {
        super("getValue");
        this.f23300d = d0Var;
    }

    public ab(ea.e1 e1Var) {
        super("internal.appMetadata");
        this.f23300d = e1Var;
    }

    public ab(n5.f fVar) {
        super("internal.logger");
        this.f23300d = fVar;
        this.f23837b.put("log", new we(this, false, true));
        this.f23837b.put(NotificationCompat.GROUP_KEY_SILENT, new qc(NotificationCompat.GROUP_KEY_SILENT, 1));
        ((p4) this.f23837b.get(NotificationCompat.GROUP_KEY_SILENT)).b("log", new we(this, true, true));
        this.f23837b.put("unmonitored", new qc("unmonitored", 2));
        ((p4) this.f23837b.get("unmonitored")).b("log", new we(this, false, false));
    }

    public ab(v9.e eVar) {
        super("internal.eventLogger");
        this.f23300d = eVar;
    }
}
