package mb;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements com.google.android.gms.common.api.internal.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f45924a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.b
    public final void a(boolean z10) {
        synchronized (g.f45927k) {
            try {
                for (g gVar : new ArrayList(g.l.values())) {
                    if (gVar.f45932e.get()) {
                        gVar.l(z10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
