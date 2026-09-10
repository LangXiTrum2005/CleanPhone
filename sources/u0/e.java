package u0;

import android.content.SharedPreferences;
import java.util.Set;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f51656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f51657b;

    public e(SharedPreferences prefs, Set set) {
        n.f(prefs, "prefs");
        this.f51656a = prefs;
        this.f51657b = set;
    }
}
