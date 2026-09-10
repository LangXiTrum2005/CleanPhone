package a5;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends o implements jk.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f3386e = new c(1);

    @Override // jk.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature require) {
        n.f(require, "$this$require");
        boolean z10 = true;
        if (require.getType() != 1 && require.getType() != 2) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
