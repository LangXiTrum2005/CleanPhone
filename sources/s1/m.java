package s1;

import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;
import l1.y;
import oa.k0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.e f50065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f50066b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t1.c f50070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f50071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f50072h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f50073i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TreeMap f50069e = new TreeMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f50068d = y.q(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x2.b f50067c = new x2.b(1);

    public m(t1.c cVar, k0 k0Var, v9.e eVar) {
        this.f50070f = cVar;
        this.f50066b = k0Var;
        this.f50065a = eVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (!this.f50073i) {
            if (message.what != 1) {
                return false;
            }
            k kVar = (k) message.obj;
            long j10 = kVar.f50058a;
            long j11 = kVar.f50059b;
            Long lValueOf = Long.valueOf(j11);
            TreeMap treeMap = this.f50069e;
            Long l = (Long) treeMap.get(lValueOf);
            if (l == null) {
                treeMap.put(Long.valueOf(j11), Long.valueOf(j10));
                return true;
            }
            if (l.longValue() > j10) {
                treeMap.put(Long.valueOf(j11), Long.valueOf(j10));
            }
        }
        return true;
    }
}
