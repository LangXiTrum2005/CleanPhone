package k6;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f44347b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f44348a;

    public e0(r rVar) {
        this.f44348a = rVar;
    }

    @Override // k6.r
    public final boolean a(Object obj) {
        return f44347b.contains(((Uri) obj).getScheme());
    }

    @Override // k6.r
    public final q b(Object obj, int i10, int i11, e6.i iVar) {
        return this.f44348a.b(new h(((Uri) obj).toString()), i10, i11, iVar);
    }
}
