package z9;

import com.google.android.gms.internal.auth.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient e f54659c;

    public c(e eVar) {
        this.f54659c = eVar;
    }

    @Override // z9.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f54659c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        e eVar = this.f54659c;
        i.J(i10, eVar.size());
        return eVar.get((eVar.size() - 1) - i10);
    }

    @Override // z9.e, java.util.List
    public final int indexOf(Object obj) {
        e eVar = this.f54659c;
        int iLastIndexOf = eVar.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (eVar.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // z9.e, java.util.List
    public final int lastIndexOf(Object obj) {
        e eVar = this.f54659c;
        int iIndexOf = eVar.indexOf(obj);
        if (iIndexOf >= 0) {
            return (eVar.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // z9.e
    public final e q() {
        return this.f54659c;
    }

    @Override // z9.e, java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final e subList(int i10, int i11) {
        e eVar = this.f54659c;
        i.K(i10, i11, eVar.size());
        return eVar.subList(eVar.size() - i11, eVar.size() - i10).q();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f54659c.size();
    }
}
