package k6;

import android.net.Uri;
import com.ironsource.X3;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f44340b = Collections.unmodifiableSet(new HashSet(Arrays.asList(X3.i.f27782b, "content", "android.resource")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f44341a;

    public d0(c0 c0Var) {
        this.f44341a = c0Var;
    }

    @Override // k6.r
    public final boolean a(Object obj) {
        return f44340b.contains(((Uri) obj).getScheme());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k6.c0] */
    @Override // k6.r
    public final q b(Object obj, int i10, int i11, e6.i iVar) {
        Uri uri = (Uri) obj;
        return new q(new z6.d(uri), this.f44341a.d(uri));
    }
}
