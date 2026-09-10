package wb;

import ac.g;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import b2.o;
import bc.q;
import fc.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import td.e;
import xj.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f53148a;

    public b(f fVar) {
        this.f53148a = fVar;
    }

    public final void a(td.d dVar) {
        f fVar = this.f53148a;
        HashSet hashSet = dVar.f50741a;
        ArrayList arrayList = new ArrayList(p.W(hashSet, 10));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            td.c cVar = (td.c) ((e) it.next());
            String str = cVar.f50736b;
            String str2 = cVar.f50738d;
            String strSubstring = cVar.f50739e;
            String str3 = cVar.f50737c;
            long j10 = cVar.f50740f;
            am.e eVar = bc.p.f5572a;
            if (strSubstring.length() > 256) {
                strSubstring = strSubstring.substring(0, NotificationCompat.FLAG_LOCAL_ONLY);
            }
            arrayList.add(new bc.b(str, str2, strSubstring, str3, j10));
        }
        synchronized (((q) fVar.f40785g)) {
            try {
                if (((q) fVar.f40785g).c(arrayList)) {
                    ((g) fVar.f40782d).f3463b.a(new o(1, fVar, ((q) fVar.f40785g).a()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Updated Crashlytics Rollout State", null);
        }
    }
}
