package sg;

import android.content.Context;
import com.google.android.gms.internal.auth.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public interface c {
    default Context h() {
        Context context = o.f22881d;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("ContextHolder not initialized");
    }
}
