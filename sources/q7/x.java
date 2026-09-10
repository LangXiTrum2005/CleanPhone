package q7;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ne.a f48792c = new ne.a(8);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f48793d = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public StringBuilder f48795b;

    public x() {
        f.n("Request", ViewHierarchyConstants.TAG_KEY);
        this.f48794a = "FacebookSDK.".concat("Request");
        this.f48795b = new StringBuilder();
    }

    public final void a(String str) {
        if (l7.s.i(l7.g0.f45133a)) {
            this.f48795b.append(str);
        }
    }

    public final void b(Object value, String key) {
        kotlin.jvm.internal.n.f(key, "key");
        kotlin.jvm.internal.n.f(value, "value");
        Object[] objArr = {key, value};
        if (l7.s.i(l7.g0.f45133a)) {
            StringBuilder sb2 = this.f48795b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, 2);
            sb2.append(String.format("  %s:\t%s\n", Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)));
        }
    }
}
