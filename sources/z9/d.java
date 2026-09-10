package z9;

import com.google.android.gms.internal.auth.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f54660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f54661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f54662e;

    public d(e eVar, int i10, int i11) {
        this.f54662e = eVar;
        this.f54660c = i10;
        this.f54661d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        i.J(i10, this.f54661d);
        return this.f54662e.get(i10 + this.f54660c);
    }

    @Override // z9.a
    public final Object[] h() {
        return this.f54662e.h();
    }

    @Override // z9.a
    public final int m() {
        return this.f54662e.m() + this.f54660c;
    }

    @Override // z9.a
    public final int n() {
        return this.f54662e.m() + this.f54660c + this.f54661d;
    }

    @Override // z9.e, java.util.List
    /* JADX INFO: renamed from: r */
    public final e subList(int i10, int i11) {
        i.K(i10, i11, this.f54661d);
        int i12 = this.f54660c;
        return this.f54662e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f54661d;
    }
}
