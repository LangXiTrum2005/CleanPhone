package preterite;

import androidx.collection.splinterproof;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import technofreak.competently;
import technofreak.impromptu;

/* JADX INFO: compiled from: DirectedAcyclicGraph.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final competently<ArrayList<T>> f35687attabal = new impromptu(10);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final splinterproof<T, ArrayList<T>> f35689saneness = new splinterproof<>();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ArrayList<T> f35688dern = new ArrayList<>();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final HashSet<T> f35690wireman = new HashSet<>();

    public final void apical(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f35687attabal.attabal(arrayList);
    }

    public void attabal(T t, T t2) {
        if (!this.f35689saneness.containsKey(t) || !this.f35689saneness.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayListBeachfront = this.f35689saneness.get(t);
        if (arrayListBeachfront == null) {
            arrayListBeachfront = beachfront();
            this.f35689saneness.put(t, arrayListBeachfront);
        }
        arrayListBeachfront.add(t2);
    }

    public final ArrayList<T> beachfront() {
        ArrayList<T> arrayListSaneness = this.f35687attabal.saneness();
        return arrayListSaneness == null ? new ArrayList<>() : arrayListSaneness;
    }

    public List competently(T t) {
        return this.f35689saneness.get(t);
    }

    public boolean cutely(T t) {
        int size = this.f35689saneness.getSize();
        for (int i = 0; i < size; i++) {
            ArrayList<T> arrayListFormularize = this.f35689saneness.formularize(i);
            if (arrayListFormularize != null && arrayListFormularize.contains(t)) {
                return true;
            }
        }
        return false;
    }

    public void dern() {
        int size = this.f35689saneness.getSize();
        for (int i = 0; i < size; i++) {
            ArrayList<T> arrayListFormularize = this.f35689saneness.formularize(i);
            if (arrayListFormularize != null) {
                apical(arrayListFormularize);
            }
        }
        this.f35689saneness.clear();
    }

    public List<T> impromptu(T t) {
        int size = this.f35689saneness.getSize();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList<T> arrayListFormularize = this.f35689saneness.formularize(i);
            if (arrayListFormularize != null && arrayListFormularize.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f35689saneness.competently(i));
            }
        }
        return arrayList;
    }

    public final void marial(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        ArrayList<T> arrayList2 = this.f35689saneness.get(t);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                marial(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }

    public void saneness(T t) {
        if (this.f35689saneness.containsKey(t)) {
            return;
        }
        this.f35689saneness.put(t, null);
    }

    public ArrayList<T> taiyuan() {
        this.f35688dern.clear();
        this.f35690wireman.clear();
        int size = this.f35689saneness.getSize();
        for (int i = 0; i < size; i++) {
            marial(this.f35689saneness.competently(i), this.f35688dern, this.f35690wireman);
        }
        return this.f35688dern;
    }

    public boolean wireman(T t) {
        return this.f35689saneness.containsKey(t);
    }
}
