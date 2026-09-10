package zl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f55039b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f55040a;

    static {
        new g(0);
    }

    public g() {
        this.f55040a = new HashMap();
    }

    public final void a(m mVar) {
        this.f55040a.put(new f(mVar.f55070a, mVar.f55073d.f55067a), mVar);
    }

    public g(int i10) {
        this.f55040a = Collections.EMPTY_MAP;
    }
}
