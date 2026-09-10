package u0;

import android.content.Context;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final boolean a(Context context, String name) {
        n.f(context, "context");
        n.f(name, "name");
        return context.deleteSharedPreferences(name);
    }
}
