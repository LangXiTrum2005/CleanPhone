package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: FragmentStore.java */
/* JADX INFO: loaded from: classes.dex */
public class polder {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public kattegat f10360wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ArrayList<Fragment> f10357attabal = new ArrayList<>();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final HashMap<String, merc> f10359saneness = new HashMap<>();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final HashMap<String, Bundle> f10358dern = new HashMap<>();

    public void adultoid(Fragment fragment) {
        synchronized (this.f10357attabal) {
            this.f10357attabal.remove(fragment);
        }
        fragment.mAdded = false;
    }

    public List<merc> apical() {
        ArrayList arrayList = new ArrayList();
        for (merc mercVar : this.f10359saneness.values()) {
            if (mercVar != null) {
                arrayList.add(mercVar);
            }
        }
        return arrayList;
    }

    public kattegat arytenoidectomy() {
        return this.f10360wireman;
    }

    public void attabal(Fragment fragment) {
        if (this.f10357attabal.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f10357attabal) {
            this.f10357attabal.add(fragment);
        }
        fragment.mAdded = true;
    }

    public Fragment beachfront(String str) {
        merc mercVar = this.f10359saneness.get(str);
        if (mercVar != null) {
            return mercVar.apical();
        }
        return null;
    }

    public Fragment competently(int i) {
        for (int size = this.f10357attabal.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f10357attabal.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (merc mercVar : this.f10359saneness.values()) {
            if (mercVar != null) {
                Fragment fragmentApical = mercVar.apical();
                if (fragmentApical.mFragmentId == i) {
                    return fragmentApical;
                }
            }
        }
        return null;
    }

    public ArrayList<String> cord() {
        synchronized (this.f10357attabal) {
            try {
                if (this.f10357attabal.isEmpty()) {
                    return null;
                }
                ArrayList<String> arrayList = new ArrayList<>(this.f10357attabal.size());
                for (Fragment fragment : this.f10357attabal) {
                    arrayList.add(fragment.mWho);
                    if (FragmentManager.deadwork(2)) {
                        fragment.toString();
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void cuirassed(kattegat kattegatVar) {
        this.f10360wireman = kattegatVar;
    }

    public int cutely(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f10357attabal.indexOf(fragment);
        for (int i = iIndexOf - 1; i >= 0; i--) {
            Fragment fragment2 = this.f10357attabal.get(i);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f10357attabal.size()) {
                return -1;
            }
            Fragment fragment3 = this.f10357attabal.get(iIndexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    public boolean dern(String str) {
        return this.f10359saneness.get(str) != null;
    }

    public void dovishness() {
        this.f10359saneness.clear();
    }

    public List<Fragment> formularize() {
        ArrayList arrayList = new ArrayList();
        for (merc mercVar : this.f10359saneness.values()) {
            if (mercVar != null) {
                arrayList.add(mercVar.apical());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public void gintrap(List<String> list) {
        this.f10357attabal.clear();
        if (list != null) {
            for (String str : list) {
                Fragment fragmentBeachfront = beachfront(str);
                if (fragmentBeachfront == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (FragmentManager.deadwork(2)) {
                    fragmentBeachfront.toString();
                }
                attabal(fragmentBeachfront);
            }
        }
    }

    public void graveside() {
        Iterator<Fragment> it = this.f10357attabal.iterator();
        while (it.hasNext()) {
            merc mercVar = this.f10359saneness.get(it.next().mWho);
            if (mercVar != null) {
                mercVar.impassible();
            }
        }
        for (merc mercVar2 : this.f10359saneness.values()) {
            if (mercVar2 != null) {
                mercVar2.impassible();
                Fragment fragmentApical = mercVar2.apical();
                if (fragmentApical.mRemoving && !fragmentApical.isInBackStack()) {
                    if (fragmentApical.mBeingSaved && !this.f10358dern.containsKey(fragmentApical.mWho)) {
                        stratoscope(fragmentApical.mWho, mercVar2.polloi());
                    }
                    molybdenite(mercVar2);
                }
            }
        }
    }

    public HashMap<String, Bundle> impassible() {
        return this.f10358dern;
    }

    public Fragment impromptu(String str) {
        if (str != null) {
            for (int size = this.f10357attabal.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f10357attabal.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (merc mercVar : this.f10359saneness.values()) {
            if (mercVar != null) {
                Fragment fragmentApical = mercVar.apical();
                if (str.equals(fragmentApical.mTag)) {
                    return fragmentApical;
                }
            }
        }
        return null;
    }

    public List<Fragment> kowloon() {
        ArrayList arrayList;
        if (this.f10357attabal.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f10357attabal) {
            arrayList = new ArrayList(this.f10357attabal);
        }
        return arrayList;
    }

    public void marial(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f10359saneness.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (merc mercVar : this.f10359saneness.values()) {
                printWriter.print(str);
                if (mercVar != null) {
                    Fragment fragmentApical = mercVar.apical();
                    printWriter.println(fragmentApical);
                    fragmentApical.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f10357attabal.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                Fragment fragment = this.f10357attabal.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    public void molybdenite(merc mercVar) {
        Fragment fragmentApical = mercVar.apical();
        if (fragmentApical.mRetainInstance) {
            this.f10360wireman.kowloon(fragmentApical);
        }
        if (this.f10359saneness.get(fragmentApical.mWho) == mercVar && this.f10359saneness.put(fragmentApical.mWho, null) != null && FragmentManager.deadwork(2)) {
            fragmentApical.toString();
        }
    }

    public Bundle monoploid(String str) {
        return this.f10358dern.get(str);
    }

    public void polloi(merc mercVar) {
        Fragment fragmentApical = mercVar.apical();
        if (dern(fragmentApical.mWho)) {
            return;
        }
        this.f10359saneness.put(fragmentApical.mWho, mercVar);
        if (fragmentApical.mRetainInstanceChangedWhileDetached) {
            if (fragmentApical.mRetainInstance) {
                this.f10360wireman.marial(fragmentApical);
            } else {
                this.f10360wireman.kowloon(fragmentApical);
            }
            fragmentApical.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.deadwork(2)) {
            fragmentApical.toString();
        }
    }

    public ArrayList<String> preprohormone() {
        ArrayList<String> arrayList = new ArrayList<>(this.f10359saneness.size());
        for (merc mercVar : this.f10359saneness.values()) {
            if (mercVar != null) {
                Fragment fragmentApical = mercVar.apical();
                stratoscope(fragmentApical.mWho, mercVar.polloi());
                arrayList.add(fragmentApical.mWho);
                if (FragmentManager.deadwork(2)) {
                    fragmentApical.toString();
                    Objects.toString(fragmentApical.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    public void rotuma(HashMap<String, Bundle> map) {
        this.f10358dern.clear();
        this.f10358dern.putAll(map);
    }

    public void saneness() {
        this.f10359saneness.values().removeAll(Collections.singleton(null));
    }

    public Bundle stratoscope(String str, Bundle bundle) {
        return bundle != null ? this.f10358dern.put(str, bundle) : this.f10358dern.remove(str);
    }

    public Fragment taiyuan(String str) {
        Fragment fragmentFindFragmentByWho;
        for (merc mercVar : this.f10359saneness.values()) {
            if (mercVar != null && (fragmentFindFragmentByWho = mercVar.apical().findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    public merc triweekly(String str) {
        return this.f10359saneness.get(str);
    }

    public void wireman(int i) {
        for (merc mercVar : this.f10359saneness.values()) {
            if (mercVar != null) {
                mercVar.graveside(i);
            }
        }
    }
}
