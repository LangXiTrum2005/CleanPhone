package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes7.dex */
public class LazyStringArrayList extends AbstractList<String> implements RandomAccess, LazyStringList {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final UnmodifiableLazyStringList f44218Y = new UnmodifiableLazyStringList(new LazyStringArrayList());
    public final ArrayList X;

    public LazyStringArrayList() {
        this.X = new ArrayList();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        this.X.add(i2, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.X.size(), collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.X.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        ArrayList arrayList = this.X;
        Object obj = arrayList.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String strV = byteString.v();
            if (byteString.i()) {
                arrayList.set(i2, strV);
            }
            return strV;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = Internal.f44216a;
        try {
            String str = new String(bArr, "UTF-8");
            if (Utf8.c(bArr, 0, bArr.length) == 0) {
                arrayList.set(i2, str);
            }
            return str;
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported?", e2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public final ByteString getByteString(int i2) {
        ByteString literalByteString;
        ArrayList arrayList = this.X;
        Object obj = arrayList.get(i2);
        if (obj instanceof ByteString) {
            literalByteString = (ByteString) obj;
        } else if (obj instanceof String) {
            literalByteString = ByteString.d((String) obj);
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            literalByteString = new LiteralByteString(bArr2);
        }
        if (literalByteString != obj) {
            arrayList.set(i2, literalByteString);
        }
        return literalByteString;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.X);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public final UnmodifiableLazyStringList getUnmodifiableView() {
        return new UnmodifiableLazyStringList(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public final void j(ByteString byteString) {
        this.X.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        Object objRemove = this.X.remove(i2);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof ByteString) {
            return ((ByteString) objRemove).v();
        }
        byte[] bArr = (byte[]) objRemove;
        byte[] bArr2 = Internal.f44216a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported?", e2);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        Object obj2 = this.X.set(i2, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof ByteString) {
            return ((ByteString) obj2).v();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = Internal.f44216a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported?", e2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.X.size();
    }

    public LazyStringArrayList(LazyStringList lazyStringList) {
        this.X = new ArrayList(lazyStringList.size());
        addAll(lazyStringList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        if (collection instanceof LazyStringList) {
            collection = ((LazyStringList) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.X.addAll(i2, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
