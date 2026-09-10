package r;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f49203e = new HashMap();

    @Override // r.f
    public final c b(Object obj) {
        return (c) this.f49203e.get(obj);
    }

    @Override // r.f
    public final Object h(Object obj) {
        Object objH = super.h(obj);
        this.f49203e.remove(obj);
        return objH;
    }
}
