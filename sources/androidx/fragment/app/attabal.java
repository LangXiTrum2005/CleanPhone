package androidx.fragment.app;

import androidx.p001lifecycle.Lifecycle;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: BackStackRecord.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal extends seminary implements FragmentManager.kowloon {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public boolean f10295adultoid;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public int f10296dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public boolean f10297gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final FragmentManager f10298graveside;

    public attabal(FragmentManager fragmentManager) {
        super(fragmentManager.achondroplasia(), fragmentManager.claque() != null ? fragmentManager.claque().getContext().getClassLoader() : null);
        this.f10296dovishness = -1;
        this.f10297gintrap = false;
        this.f10298graveside = fragmentManager;
    }

    public void adultoid(int i) {
        if (this.f10408taiyuan) {
            if (FragmentManager.deadwork(2)) {
                toString();
            }
            int size = this.f10398dern.size();
            for (int i2 = 0; i2 < size; i2++) {
                seminary.attabal attabalVar = this.f10398dern.get(i2);
                Fragment fragment = attabalVar.f10417saneness;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (FragmentManager.deadwork(2)) {
                        Objects.toString(attabalVar.f10417saneness);
                        int i3 = attabalVar.f10417saneness.mBackStackNesting;
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.seminary
    public seminary apical(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f10298graveside) {
            return super.apical(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.FragmentManager.kowloon
    public boolean attabal(ArrayList<attabal> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.deadwork(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f10408taiyuan) {
            return true;
        }
        this.f10298graveside.apical(this);
        return true;
    }

    @Override // androidx.fragment.app.seminary
    public int competently() {
        return gintrap(false, true);
    }

    public void cord() {
        int size = this.f10398dern.size();
        for (int i = 0; i < size; i++) {
            seminary.attabal attabalVar = this.f10398dern.get(i);
            Fragment fragment = attabalVar.f10417saneness;
            if (fragment != null) {
                fragment.mBeingSaved = this.f10297gintrap;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f10401impromptu);
                fragment.setSharedElementNames(this.f10393arytenoidectomy, this.f10405monoploid);
            }
            switch (attabalVar.f10411attabal) {
                case 1:
                    fragment.setAnimations(attabalVar.f10419wireman, attabalVar.f10416marial, attabalVar.f10412beachfront, attabalVar.f10413competently);
                    this.f10298graveside.ethene(fragment, false);
                    this.f10298graveside.formularize(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + attabalVar.f10411attabal);
                case 3:
                    fragment.setAnimations(attabalVar.f10419wireman, attabalVar.f10416marial, attabalVar.f10412beachfront, attabalVar.f10413competently);
                    this.f10298graveside.twybill(fragment);
                    break;
                case 4:
                    fragment.setAnimations(attabalVar.f10419wireman, attabalVar.f10416marial, attabalVar.f10412beachfront, attabalVar.f10413competently);
                    this.f10298graveside.homozygous(fragment);
                    break;
                case 5:
                    fragment.setAnimations(attabalVar.f10419wireman, attabalVar.f10416marial, attabalVar.f10412beachfront, attabalVar.f10413competently);
                    this.f10298graveside.ethene(fragment, false);
                    this.f10298graveside.cybernatic(fragment);
                    break;
                case 6:
                    fragment.setAnimations(attabalVar.f10419wireman, attabalVar.f10416marial, attabalVar.f10412beachfront, attabalVar.f10413competently);
                    this.f10298graveside.stratoscope(fragment);
                    break;
                case 7:
                    fragment.setAnimations(attabalVar.f10419wireman, attabalVar.f10416marial, attabalVar.f10412beachfront, attabalVar.f10413competently);
                    this.f10298graveside.ethene(fragment, false);
                    this.f10298graveside.monoploid(fragment);
                    break;
                case 8:
                    this.f10298graveside.bluecoat(fragment);
                    break;
                case 9:
                    this.f10298graveside.bluecoat(null);
                    break;
                case 10:
                    attabalVar.f10415impromptu = fragment.mMaxState;
                    this.f10298graveside.polyfoil(fragment, attabalVar.f10418taiyuan);
                    break;
            }
        }
    }

    public void cuirassed() {
        for (int size = this.f10398dern.size() - 1; size >= 0; size--) {
            seminary.attabal attabalVar = this.f10398dern.get(size);
            Fragment fragment = attabalVar.f10417saneness;
            if (fragment != null) {
                fragment.mBeingSaved = this.f10297gintrap;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.ctenidium(this.f10401impromptu));
                fragment.setSharedElementNames(this.f10405monoploid, this.f10393arytenoidectomy);
            }
            switch (attabalVar.f10411attabal) {
                case 1:
                    fragment.setAnimations(attabalVar.f10419wireman, attabalVar.f10416marial, attabalVar.f10412beachfront, attabalVar.f10413competently);
                    this.f10298graveside.ethene(fragment, true);
                    this.f10298graveside.twybill(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + attabalVar.f10411attabal);
                case 3:
                    fragment.setAnimations(attabalVar.f10419wireman, attabalVar.f10416marial, attabalVar.f10412beachfront, attabalVar.f10413competently);
                    this.f10298graveside.formularize(fragment);
                    break;
                case 4:
                    fragment.setAnimations(attabalVar.f10419wireman, attabalVar.f10416marial, attabalVar.f10412beachfront, attabalVar.f10413competently);
                    this.f10298graveside.cybernatic(fragment);
                    break;
                case 5:
                    fragment.setAnimations(attabalVar.f10419wireman, attabalVar.f10416marial, attabalVar.f10412beachfront, attabalVar.f10413competently);
                    this.f10298graveside.ethene(fragment, true);
                    this.f10298graveside.homozygous(fragment);
                    break;
                case 6:
                    fragment.setAnimations(attabalVar.f10419wireman, attabalVar.f10416marial, attabalVar.f10412beachfront, attabalVar.f10413competently);
                    this.f10298graveside.monoploid(fragment);
                    break;
                case 7:
                    fragment.setAnimations(attabalVar.f10419wireman, attabalVar.f10416marial, attabalVar.f10412beachfront, attabalVar.f10413competently);
                    this.f10298graveside.ethene(fragment, true);
                    this.f10298graveside.stratoscope(fragment);
                    break;
                case 8:
                    this.f10298graveside.bluecoat(null);
                    break;
                case 9:
                    this.f10298graveside.bluecoat(fragment);
                    break;
                case 10:
                    attabalVar.f10418taiyuan = fragment.mMaxState;
                    this.f10298graveside.polyfoil(fragment, attabalVar.f10415impromptu);
                    break;
            }
        }
    }

    @Override // androidx.fragment.app.seminary
    public void cutely() {
        formularize();
        this.f10298graveside.coffeecake(this, true);
    }

    public void dovishness() {
        int size = this.f10398dern.size() - 1;
        while (size >= 0) {
            seminary.attabal attabalVar = this.f10398dern.get(size);
            if (attabalVar.f10414dern) {
                if (attabalVar.f10411attabal == 8) {
                    attabalVar.f10414dern = false;
                    this.f10398dern.remove(size - 1);
                    size--;
                } else {
                    int i = attabalVar.f10417saneness.mContainerId;
                    attabalVar.f10411attabal = 2;
                    attabalVar.f10414dern = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        seminary.attabal attabalVar2 = this.f10398dern.get(i2);
                        if (attabalVar2.f10414dern && attabalVar2.f10417saneness.mContainerId == i) {
                            this.f10398dern.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public int gintrap(boolean z, boolean z2) {
        if (this.f10295adultoid) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.deadwork(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new starveling("FragmentManager"));
            rotuma("  ", printWriter);
            printWriter.close();
        }
        this.f10295adultoid = true;
        if (this.f10408taiyuan) {
            this.f10296dovishness = this.f10298graveside.kowloon();
        } else {
            this.f10296dovishness = -1;
        }
        if (z2) {
            this.f10298graveside.milliradian(this, z);
        }
        return this.f10296dovishness;
    }

    @Override // androidx.fragment.app.seminary
    public void impassible(int i, Fragment fragment, String str, int i2) {
        super.impassible(i, fragment, str, i2);
        fragment.mFragmentManager = this.f10298graveside;
    }

    @Override // androidx.fragment.app.seminary
    public int impromptu() {
        return gintrap(true, true);
    }

    @Override // androidx.fragment.app.seminary
    public seminary kowloon(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f10298graveside) {
            return super.kowloon(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.seminary
    public seminary molybdenite(Fragment fragment, Lifecycle.State state) {
        if (fragment.mFragmentManager != this.f10298graveside) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f10298graveside);
        }
        if (state == Lifecycle.State.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
        }
        if (state != Lifecycle.State.DESTROYED) {
            return super.molybdenite(fragment, state);
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    public void oilcan() {
        if (this.f10404molybdenite != null) {
            for (int i = 0; i < this.f10404molybdenite.size(); i++) {
                this.f10404molybdenite.get(i).run();
            }
            this.f10404molybdenite = null;
        }
    }

    public void preprohormone(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f10392apical);
            printWriter.print(" mIndex=");
            printWriter.print(this.f10296dovishness);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f10295adultoid);
            if (this.f10401impromptu != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f10401impromptu));
            }
            if (this.f10410wireman != 0 || this.f10403marial != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f10410wireman));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f10403marial));
            }
            if (this.f10395beachfront != 0 || this.f10396competently != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f10395beachfront));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f10396competently));
            }
            if (this.f10399formularize != 0 || this.f10400impassible != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f10399formularize));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f10400impassible);
            }
            if (this.f10409triweekly != 0 || this.f10402kowloon != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f10409triweekly));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f10402kowloon);
            }
        }
        if (this.f10398dern.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f10398dern.size();
        for (int i = 0; i < size; i++) {
            seminary.attabal attabalVar = this.f10398dern.get(i);
            switch (attabalVar.f10411attabal) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + attabalVar.f10411attabal;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(attabalVar.f10417saneness);
            if (z) {
                if (attabalVar.f10419wireman != 0 || attabalVar.f10416marial != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(attabalVar.f10419wireman));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(attabalVar.f10416marial));
                }
                if (attabalVar.f10412beachfront != 0 || attabalVar.f10413competently != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(attabalVar.f10412beachfront));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(attabalVar.f10413competently));
                }
            }
        }
    }

    public void rotuma(String str, PrintWriter printWriter) {
        preprohormone(str, printWriter, true);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    public Fragment stratoscope(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f10398dern.size()) {
            seminary.attabal attabalVar = this.f10398dern.get(i);
            int i2 = attabalVar.f10411attabal;
            if (i2 == 1) {
                arrayList.add(attabalVar.f10417saneness);
            } else if (i2 == 2) {
                Fragment fragment3 = attabalVar.f10417saneness;
                int i3 = fragment3.mContainerId;
                boolean z = false;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Fragment fragment4 = arrayList.get(size);
                    if (fragment4.mContainerId == i3) {
                        if (fragment4 == fragment3) {
                            z = true;
                        } else {
                            if (fragment4 == fragment2) {
                                this.f10398dern.add(i, new seminary.attabal(9, fragment4, true));
                                i++;
                                fragment2 = null;
                            }
                            seminary.attabal attabalVar2 = new seminary.attabal(3, fragment4, true);
                            attabalVar2.f10419wireman = attabalVar.f10419wireman;
                            attabalVar2.f10412beachfront = attabalVar.f10412beachfront;
                            attabalVar2.f10416marial = attabalVar.f10416marial;
                            attabalVar2.f10413competently = attabalVar.f10413competently;
                            this.f10398dern.add(i, attabalVar2);
                            arrayList.remove(fragment4);
                            i++;
                        }
                    }
                }
                if (z) {
                    this.f10398dern.remove(i);
                    i--;
                } else {
                    attabalVar.f10411attabal = 1;
                    attabalVar.f10414dern = true;
                    arrayList.add(fragment3);
                }
            } else if (i2 == 3 || i2 == 6) {
                arrayList.remove(attabalVar.f10417saneness);
                Fragment fragment5 = attabalVar.f10417saneness;
                if (fragment5 == fragment2) {
                    this.f10398dern.add(i, new seminary.attabal(9, fragment5));
                    i++;
                    fragment2 = null;
                }
            } else if (i2 == 7) {
                arrayList.add(attabalVar.f10417saneness);
            } else if (i2 == 8) {
                this.f10398dern.add(i, new seminary.attabal(9, fragment2, true));
                attabalVar.f10414dern = true;
                i++;
                fragment2 = attabalVar.f10417saneness;
            }
            i++;
        }
        return fragment2;
    }

    @Override // androidx.fragment.app.seminary
    public void taiyuan() {
        formularize();
        this.f10298graveside.coffeecake(this, false);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f10296dovishness >= 0) {
            sb.append(" #");
            sb.append(this.f10296dovishness);
        }
        if (this.f10392apical != null) {
            sb.append(" ");
            sb.append(this.f10392apical);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // androidx.fragment.app.seminary
    public boolean triweekly() {
        return this.f10398dern.isEmpty();
    }

    public String trm() {
        return this.f10392apical;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    public Fragment yemenite(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f10398dern.size() - 1; size >= 0; size--) {
            seminary.attabal attabalVar = this.f10398dern.get(size);
            int i = attabalVar.f10411attabal;
            if (i == 1) {
                arrayList.remove(attabalVar.f10417saneness);
            } else if (i != 3) {
                switch (i) {
                    case 6:
                        arrayList.add(attabalVar.f10417saneness);
                        break;
                    case 7:
                        arrayList.remove(attabalVar.f10417saneness);
                        break;
                    case 8:
                        fragment = null;
                        break;
                    case 9:
                        fragment = attabalVar.f10417saneness;
                        break;
                    case 10:
                        attabalVar.f10418taiyuan = attabalVar.f10415impromptu;
                        break;
                }
            } else {
                arrayList.add(attabalVar.f10417saneness);
            }
        }
        return fragment;
    }
}
