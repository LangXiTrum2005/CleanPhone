package decarock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: CopyOnWriteMultiset.java */
/* JADX INFO: loaded from: classes.dex */
public final class taiyuan<E> implements Iterable<E> {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Object f25141kowloon = new Object();

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final Map<E, Integer> f25140arytenoidectomy = new HashMap();

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public Set<E> f25142monoploid = Collections.EMPTY_SET;
    private List<E> elements = Collections.EMPTY_LIST;

    public int count(E e) {
        int iIntValue;
        synchronized (this.f25141kowloon) {
            try {
                iIntValue = this.f25140arytenoidectomy.containsKey(e) ? this.f25140arytenoidectomy.get(e).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    public void dern(E e) {
        synchronized (this.f25141kowloon) {
            try {
                Integer num = this.f25140arytenoidectomy.get(e);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.elements);
                arrayList.remove(e);
                this.elements = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f25140arytenoidectomy.remove(e);
                    HashSet hashSet = new HashSet(this.f25142monoploid);
                    hashSet.remove(e);
                    this.f25142monoploid = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f25140arytenoidectomy.put(e, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Set<E> elementSet() {
        Set<E> set;
        synchronized (this.f25141kowloon) {
            set = this.f25142monoploid;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f25141kowloon) {
            it = this.elements.iterator();
        }
        return it;
    }

    public void saneness(E e) {
        synchronized (this.f25141kowloon) {
            try {
                ArrayList arrayList = new ArrayList(this.elements);
                arrayList.add(e);
                this.elements = Collections.unmodifiableList(arrayList);
                Integer num = this.f25140arytenoidectomy.get(e);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f25142monoploid);
                    hashSet.add(e);
                    this.f25142monoploid = Collections.unmodifiableSet(hashSet);
                }
                this.f25140arytenoidectomy.put(e, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
