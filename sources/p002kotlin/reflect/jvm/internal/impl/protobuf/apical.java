package p002kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: LazyStringArrayList.java */
/* JADX INFO: loaded from: classes5.dex */
public class apical extends AbstractList<String> implements RandomAccess, formularize {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final formularize f31100arytenoidectomy = new apical().getUnmodifiableView();

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final List<Object> f31101kowloon;

    public apical() {
        this.f31101kowloon = new ArrayList();
    }

    public static wireman dern(Object obj) {
        if (obj instanceof wireman) {
            return (wireman) obj;
        }
        return obj instanceof String ? wireman.competently((String) obj) : wireman.marial((byte[]) obj);
    }

    public static String wireman(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof wireman ? ((wireman) obj).dovishness() : impromptu.saneness((byte[]) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection2) {
        return addAll(size(), collection2);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
    public String remove(int i) {
        Object objRemove = this.f31101kowloon.remove(i);
        ((AbstractList) this).modCount++;
        return wireman(objRemove);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f31101kowloon.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: competently, reason: merged with bridge method [inline-methods] */
    public String set(int i, String str) {
        return wireman(this.f31101kowloon.set(i, str));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.formularize
    public wireman getByteString(int i) {
        Object obj = this.f31101kowloon.get(i);
        wireman wiremanVarDern = dern(obj);
        if (wiremanVarDern != obj) {
            this.f31101kowloon.set(i, wiremanVarDern);
        }
        return wiremanVarDern;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.formularize
    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f31101kowloon);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.formularize
    public formularize getUnmodifiableView() {
        return new graveside(this);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
    public String get(int i) {
        Object obj = this.f31101kowloon.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof wireman) {
            wireman wiremanVar = (wireman) obj;
            String strDovishness = wiremanVar.dovishness();
            if (wiremanVar.impassible()) {
                this.f31101kowloon.set(i, strDovishness);
            }
            return strDovishness;
        }
        byte[] bArr = (byte[]) obj;
        String strSaneness = impromptu.saneness(bArr);
        if (impromptu.attabal(bArr)) {
            this.f31101kowloon.set(i, strSaneness);
        }
        return strSaneness;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.formularize
    public void polder(wireman wiremanVar) {
        this.f31101kowloon.add(wiremanVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public void add(int i, String str) {
        this.f31101kowloon.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f31101kowloon.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends String> collection2) {
        if (collection2 instanceof formularize) {
            collection2 = ((formularize) collection2).getUnderlyingElements();
        }
        boolean zAddAll = this.f31101kowloon.addAll(i, collection2);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    public apical(formularize formularizeVar) {
        this.f31101kowloon = new ArrayList(formularizeVar.size());
        addAll(formularizeVar);
    }
}
