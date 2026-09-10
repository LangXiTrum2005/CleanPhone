package p002kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: SpreadBuilder.java */
/* JADX INFO: loaded from: classes5.dex */
public class dovishness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ArrayList<Object> f29389attabal;

    public dovishness(int i) {
        this.f29389attabal = new ArrayList<>(i);
    }

    public void attabal(Object obj) {
        this.f29389attabal.add(obj);
    }

    public int dern() {
        return this.f29389attabal.size();
    }

    public void saneness(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.f29389attabal;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f29389attabal, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f29389attabal.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f29389attabal.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f29389attabal.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public Object[] wireman(Object[] objArr) {
        return this.f29389attabal.toArray(objArr);
    }
}
