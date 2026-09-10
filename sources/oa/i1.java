package oa;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class i1 implements na.r, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47263a;

    public i1() {
        q.d(2, "expectedValuesPerKey");
        this.f47263a = 2;
    }

    @Override // na.r
    public final Object get() {
        return new ArrayList(this.f47263a);
    }
}
