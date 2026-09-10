package p002kotlin.reflect.jvm.internal.impl.types.model;

import java.util.ArrayList;
import presbytery.cutely;
import presbytery.taiyuan;

/* JADX INFO: compiled from: TypeSystemContext.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ArgumentList extends ArrayList<cutely> implements taiyuan {
    public ArgumentList(int i) {
        super(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof cutely) {
            return contains((cutely) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof cutely) {
            return indexOf((cutely) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof cutely) {
            return lastIndexOf((cutely) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof cutely) {
            return remove((cutely) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public /* bridge */ boolean contains(cutely cutelyVar) {
        return super.contains((Object) cutelyVar);
    }

    public /* bridge */ int indexOf(cutely cutelyVar) {
        return super.indexOf((Object) cutelyVar);
    }

    public /* bridge */ int lastIndexOf(cutely cutelyVar) {
        return super.lastIndexOf((Object) cutelyVar);
    }

    public /* bridge */ boolean remove(cutely cutelyVar) {
        return super.remove((Object) cutelyVar);
    }
}
