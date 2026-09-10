package s0;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f49875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e0 f49876f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(e0 e0Var, int i10) {
        super(0);
        this.f49875e = i10;
        this.f49876f = e0Var;
    }

    @Override // jk.a
    public final Object invoke() throws IOException {
        switch (this.f49875e) {
            case 0:
                return ((l0) this.f49876f.f49791j.getValue()).f49854c;
            default:
                i0 i0Var = this.f49876f.f49782a;
                File canonicalFile = ((File) i0Var.f49825c.invoke()).getCanonicalFile();
                synchronized (i0.f49822e) {
                    String path = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = i0.f49821d;
                    if (linkedHashSet.contains(path)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    kotlin.jvm.internal.n.e(path, "path");
                    linkedHashSet.add(path);
                }
                return new l0(canonicalFile, i0Var.f49823a, (p0) i0Var.f49824b.invoke(canonicalFile), new al.l(canonicalFile, 22));
        }
    }
}
