package d5;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    public final void a(p pVar) {
        List listSingletonList = Collections.singletonList(pVar);
        e5.l lVar = (e5.l) this;
        if (listSingletonList.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        e5.e eVar = new e5.e(lVar, listSingletonList);
        if (eVar.f39092g) {
            o.g().k(e5.e.f39087h, defpackage.e.o("Already enqueued work ids (", TextUtils.join(", ", eVar.f39090e), ")"), new Throwable[0]);
        } else {
            lVar.f39112d.k(new n5.d(eVar));
        }
    }
}
