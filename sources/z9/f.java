package z9;

import com.google.android.gms.internal.auth.i;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f54664e = new f(0, new Object[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f54665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f54666d;

    public f(int i10, Object[] objArr) {
        this.f54665c = objArr;
        this.f54666d = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        i.J(i10, this.f54666d);
        Object obj = this.f54665c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // z9.a
    public final Object[] h() {
        return this.f54665c;
    }

    @Override // z9.a
    public final int m() {
        return 0;
    }

    @Override // z9.a
    public final int n() {
        return this.f54666d;
    }

    @Override // z9.e, z9.a
    public final int p(Object[] objArr) {
        Object[] objArr2 = this.f54665c;
        int i10 = this.f54666d;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f54666d;
    }
}
