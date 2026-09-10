package s0;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends kotlin.jvm.internal.o implements jk.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h0 f49819e = new h0(1);

    @Override // jk.b
    public final Object invoke(Object obj) {
        File it = (File) obj;
        kotlin.jvm.internal.n.f(it, "it");
        String absolutePath = it.getCanonicalFile().getAbsolutePath();
        kotlin.jvm.internal.n.e(absolutePath, "file.canonicalFile.absolutePath");
        return new e1(absolutePath);
    }
}
