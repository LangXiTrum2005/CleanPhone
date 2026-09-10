package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public class LazyStringArrayList extends AbstractProtobufList<String> implements LazyStringList, RandomAccess {
    public static final /* synthetic */ int Z = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final List f4867Y;

    public static class ByteArrayListView extends AbstractList<byte[]> implements RandomAccess {
        @Override // java.util.AbstractList, java.util.List
        public final void add(int i2, Object obj) {
            int i3 = LazyStringArrayList.Z;
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i2) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object remove(int i2) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i2, Object obj) {
            int i3 = LazyStringArrayList.Z;
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    public static class ByteStringListView extends AbstractList<ByteString> implements RandomAccess {
        @Override // java.util.AbstractList, java.util.List
        public final void add(int i2, Object obj) {
            int i3 = LazyStringArrayList.Z;
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i2) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object remove(int i2) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i2, Object obj) {
            int i3 = LazyStringArrayList.Z;
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    static {
        new LazyStringArrayList();
    }

    public LazyStringArrayList(ArrayList arrayList) {
        super(true);
        this.f4867Y = arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        a();
        this.f4867Y.add(i2, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f4867Y.size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f4867Y.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        List list = this.f4867Y;
        Object obj = list.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            byteString.getClass();
            String strY = byteString.size() == 0 ? "" : byteString.y(Internal.f4857a);
            if (byteString.p()) {
                list.set(i2, strY);
            }
            return strY;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, Internal.f4857a);
        Utf8.Processor processor = Utf8.f4942a;
        if (Utf8.f4942a.e(bArr, 0, bArr.length)) {
            list.set(i2, str);
        }
        return str;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public final Object getRaw(int i2) {
        return this.f4867Y.get(i2);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.f4867Y);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public final boolean isModifiable() {
        return this.X;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public final void j0(ByteString byteString) {
        a();
        this.f4867Y.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    public final Internal.ProtobufList mutableCopyWithCapacity(int i2) {
        List list = this.f4867Y;
        if (i2 < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i2);
        arrayList.addAll(list);
        return new LazyStringArrayList(arrayList);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        a();
        Object objRemove = this.f4867Y.remove(i2);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof ByteString)) {
            return new String((byte[]) objRemove, Internal.f4857a);
        }
        ByteString byteString = (ByteString) objRemove;
        byteString.getClass();
        return byteString.size() == 0 ? "" : byteString.y(Internal.f4857a);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        a();
        Object obj2 = this.f4867Y.set(i2, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof ByteString)) {
            return new String((byte[]) obj2, Internal.f4857a);
        }
        ByteString byteString = (ByteString) obj2;
        byteString.getClass();
        return byteString.size() == 0 ? "" : byteString.y(Internal.f4857a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4867Y.size();
    }

    public LazyStringArrayList() {
        super(false);
        this.f4867Y = Collections.EMPTY_LIST;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        a();
        if (collection instanceof LazyStringList) {
            collection = ((LazyStringList) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f4867Y.addAll(i2, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        this.f4867Y.add((String) obj);
        ((AbstractList) this).modCount++;
        return true;
    }
}
