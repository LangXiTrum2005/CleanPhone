package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: SharedValues.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public SparseIntArray f9057attabal = new SparseIntArray();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public HashMap<Integer, HashSet<WeakReference<attabal>>> f9058saneness = new HashMap<>();

    /* JADX INFO: compiled from: SharedValues.java */
    public interface attabal {
    }

    public void attabal(int i, attabal attabalVar) {
        HashSet<WeakReference<attabal>> hashSet = this.f9058saneness.get(Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.f9058saneness.put(Integer.valueOf(i), hashSet);
        }
        hashSet.add(new WeakReference<>(attabalVar));
    }

    public void saneness(int i, attabal attabalVar) {
        HashSet<WeakReference<attabal>> hashSet = this.f9058saneness.get(Integer.valueOf(i));
        if (hashSet == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (WeakReference<attabal> weakReference : hashSet) {
            attabal attabalVar2 = weakReference.get();
            if (attabalVar2 == null || attabalVar2 == attabalVar) {
                arrayList.add(weakReference);
            }
        }
        hashSet.removeAll(arrayList);
    }
}
