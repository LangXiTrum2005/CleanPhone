package oa;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l extends n implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Map f47270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int f47271e;

    public final void j() {
        Iterator it = this.f47270d.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f47270d.clear();
        this.f47271e = 0;
    }

    public abstract Collection k();
}
