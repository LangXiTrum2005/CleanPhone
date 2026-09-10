package zl;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class r extends AbstractList implements RandomAccess, s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f55077b = new d0(new r());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f55078a;

    public r() {
        this.f55078a = new ArrayList();
    }

    @Override // zl.s
    public final void a(t tVar) {
        this.f55078a.add(tVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        this.f55078a.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f55078a.size(), collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f55078a.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        ArrayList arrayList = this.f55078a;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String strX = dVar.x();
            if (dVar.r()) {
                arrayList.set(i10, strX);
            }
            return strX;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = p.f55075a;
        try {
            String str = new String(bArr, "UTF-8");
            if (a0.c(bArr, 0, bArr.length) == 0) {
                arrayList.set(i10, str);
            }
            return str;
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    @Override // zl.s
    public final d getByteString(int i10) {
        d tVar;
        ArrayList arrayList = this.f55078a;
        Object obj = arrayList.get(i10);
        if (obj instanceof d) {
            tVar = (d) obj;
        } else if (obj instanceof String) {
            try {
                tVar = new t(((String) obj).getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException("UTF-8 not supported?", e10);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            tVar = new t(bArr2);
        }
        if (tVar != obj) {
            arrayList.set(i10, tVar);
        }
        return tVar;
    }

    @Override // zl.s
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.f55078a);
    }

    @Override // zl.s
    public final d0 getUnmodifiableView() {
        return new d0(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        Object objRemove = this.f55078a.remove(i10);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof d) {
            return ((d) objRemove).x();
        }
        byte[] bArr = (byte[]) objRemove;
        byte[] bArr2 = p.f55075a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        Object obj2 = this.f55078a.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof d) {
            return ((d) obj2).x();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = p.f55075a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f55078a.size();
    }

    public r(s sVar) {
        this.f55078a = new ArrayList(sVar.size());
        addAll(sVar);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        if (collection instanceof s) {
            collection = ((s) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f55078a.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
