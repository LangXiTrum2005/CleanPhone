package hk;

import java.io.File;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f42394a;

    public h(File root) {
        n.f(root, "root");
        this.f42394a = root;
    }

    public abstract File a();
}
