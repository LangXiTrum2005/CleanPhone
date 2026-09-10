package hi;

import android.content.Intent;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import java.util.concurrent.atomic.AtomicBoolean;
import wi.j;
import xi.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f42357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AtomicBoolean f42358b;

    @Override // xi.r
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        j jVar;
        if (i10 != 22643) {
            return false;
        }
        String str = SharePlusPendingIntent.f38840a;
        if (this.f42358b.compareAndSet(false, true) && (jVar = this.f42357a) != null) {
            jVar.a(str);
            this.f42357a = null;
        }
        return true;
    }
}
