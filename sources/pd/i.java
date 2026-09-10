package pd;

import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements com.google.android.gms.common.api.internal.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f48337a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.b
    public final void a(boolean z10) {
        Random random = j.f48338j;
        synchronized (j.class) {
            Iterator it = j.f48339k.values().iterator();
            while (it.hasNext()) {
                ((b) it.next()).c(z10);
            }
        }
    }
}
