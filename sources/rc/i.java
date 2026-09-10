package rc;

import ak.l;
import android.content.Context;
import cn.d0;
import com.google.android.gms.internal.play_billing.q1;
import go.k;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w0.d f49563b = k.Q("fire-global");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w0.d f49564c = k.Q("fire-count");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w0.d f49565d = k.X("last-used-date");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jc.c f49566a;

    public i(Context context, String str) {
        this.f49566a = new jc.c(context, defpackage.e.n("FirebaseHeartBeat", str));
    }

    public static String b(long j10) {
        return new Date(j10).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public static w0.d c(w0.b bVar, String str) {
        for (Map.Entry entry : bVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return k.Y(((w0.d) entry.getKey()).f52738a);
                    }
                }
            }
        }
        return null;
    }

    public static void d(w0.b bVar, String str) {
        w0.d dVarC = c(bVar, str);
        if (dVarC == null) {
            return;
        }
        HashSet hashSet = new HashSet((Collection) q1.s(bVar, dVarC, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            bVar.d(dVarC);
        } else {
            bVar.f(dVarC, hashSet);
        }
    }

    public final synchronized ArrayList a() {
        try {
            ArrayList arrayList = new ArrayList();
            String strB = b(System.currentTimeMillis());
            jc.c cVar = this.f49566a;
            cVar.getClass();
            for (Map.Entry entry : ((Map) d0.C(l.f3620a, new b4.a(cVar, null, 8))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strB);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new a(new ArrayList(hashSet), ((w0.d) entry.getKey()).f52738a));
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.f49566a.a(new h(jCurrentTimeMillis, 0));
            }
            return arrayList;
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public final synchronized boolean e(w0.d dVar, long j10) {
        if (b(((Long) this.f49566a.b(dVar, -1L)).longValue()).equals(b(j10))) {
            return false;
        }
        jc.c cVar = this.f49566a;
        Long lValueOf = Long.valueOf(j10);
        cVar.getClass();
        return true;
    }
}
