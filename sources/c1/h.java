package c1;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fragment f5833a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Fragment fragment, String str) {
        super(str);
        n.f(fragment, "fragment");
        this.f5833a = fragment;
    }
}
