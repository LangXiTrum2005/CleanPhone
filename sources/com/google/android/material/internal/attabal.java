package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.MaterialCheckable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: CheckableGroup.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal<T extends MaterialCheckable<T>> {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public saneness f20428dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public boolean f20429marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public boolean f20431wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<Integer, T> f20427attabal = new HashMap();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Set<Integer> f20430saneness = new HashSet();

    /* JADX INFO: renamed from: com.google.android.material.internal.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CheckableGroup.java */
    public class C0302attabal implements MaterialCheckable.attabal<T> {
        public C0302attabal() {
        }

        @Override // com.google.android.material.internal.MaterialCheckable.attabal
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public void attabal(T t, boolean z) {
            if (!z) {
                attabal attabalVar = attabal.this;
                if (!attabalVar.polloi(t, attabalVar.f20429marial)) {
                    return;
                }
            } else if (!attabal.this.competently(t)) {
                return;
            }
            attabal.this.impassible();
        }
    }

    /* JADX INFO: compiled from: CheckableGroup.java */
    public interface saneness {
        void attabal(Set<Integer> set);
    }

    public int apical() {
        if (!this.f20431wireman || this.f20430saneness.isEmpty()) {
            return -1;
        }
        return this.f20430saneness.iterator().next().intValue();
    }

    public void arytenoidectomy(boolean z) {
        this.f20429marial = z;
    }

    public void beachfront(int i) {
        T t = this.f20427attabal.get(Integer.valueOf(i));
        if (t != null && competently(t)) {
            impassible();
        }
    }

    public final boolean competently(MaterialCheckable<T> materialCheckable) {
        int id = materialCheckable.getId();
        if (this.f20430saneness.contains(Integer.valueOf(id))) {
            return false;
        }
        T t = this.f20427attabal.get(Integer.valueOf(apical()));
        if (t != null) {
            polloi(t, false);
        }
        boolean zAdd = this.f20430saneness.add(Integer.valueOf(id));
        if (!materialCheckable.isChecked()) {
            materialCheckable.setChecked(true);
        }
        return zAdd;
    }

    public List<Integer> cutely(ViewGroup viewGroup) {
        Set<Integer> setTaiyuan = taiyuan();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof MaterialCheckable) && setTaiyuan.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public boolean formularize() {
        return this.f20431wireman;
    }

    public final void impassible() {
        saneness sanenessVar = this.f20428dern;
        if (sanenessVar != null) {
            sanenessVar.attabal(taiyuan());
        }
    }

    public void impromptu() {
        boolean zIsEmpty = this.f20430saneness.isEmpty();
        Iterator<T> it = this.f20427attabal.values().iterator();
        while (it.hasNext()) {
            polloi(it.next(), false);
        }
        if (zIsEmpty) {
            return;
        }
        impassible();
    }

    public void kowloon(saneness sanenessVar) {
        this.f20428dern = sanenessVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void marial(T t) {
        this.f20427attabal.put(Integer.valueOf(t.getId()), t);
        if (t.isChecked()) {
            competently(t);
        }
        t.setInternalOnCheckedChangeListener(new C0302attabal());
    }

    public void monoploid(boolean z) {
        if (this.f20431wireman != z) {
            this.f20431wireman = z;
            impromptu();
        }
    }

    public final boolean polloi(MaterialCheckable<T> materialCheckable, boolean z) {
        int id = materialCheckable.getId();
        if (!this.f20430saneness.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z && this.f20430saneness.size() == 1 && this.f20430saneness.contains(Integer.valueOf(id))) {
            materialCheckable.setChecked(true);
            return false;
        }
        boolean zRemove = this.f20430saneness.remove(Integer.valueOf(id));
        if (materialCheckable.isChecked()) {
            materialCheckable.setChecked(false);
        }
        return zRemove;
    }

    public Set<Integer> taiyuan() {
        return new HashSet(this.f20430saneness);
    }

    public void triweekly(T t) {
        t.setInternalOnCheckedChangeListener(null);
        this.f20427attabal.remove(Integer.valueOf(t.getId()));
        this.f20430saneness.remove(Integer.valueOf(t.getId()));
    }
}
