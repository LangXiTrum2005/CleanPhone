package oa;

import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f47273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f47274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f47275c;

    public m0(Object obj, Object obj2, Object obj3) {
        this.f47273a = obj;
        this.f47274b = obj2;
        this.f47275c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f47273a;
        sb2.append(obj);
        sb2.append(X3.j.f27830b);
        sb2.append(this.f47274b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append(X3.j.f27830b);
        sb2.append(this.f47275c);
        return new IllegalArgumentException(sb2.toString());
    }
}
