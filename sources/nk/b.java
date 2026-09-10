package nk;

import java.util.Random;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final co.c f46783c = new co.c(17);

    @Override // nk.a
    public final Random i() {
        Object obj = this.f46783c.get();
        n.e(obj, "get(...)");
        return (Random) obj;
    }
}
