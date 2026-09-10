package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class BackStackRecord extends FragmentTransaction implements FragmentManager.BackStackEntry, FragmentManager.OpGenerator {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final FragmentManager f5076p;
    public boolean q;
    public int r;
    public final boolean s;

    public BackStackRecord(FragmentManager fragmentManager) {
        fragmentManager.E();
        FragmentHostCallback fragmentHostCallback = fragmentManager.f5129u;
        if (fragmentHostCallback != null) {
            fragmentHostCallback.f5109Y.getClassLoader();
        }
        this.r = -1;
        this.s = false;
        this.f5076p = fragmentManager;
    }

    @Override // androidx.fragment.app.FragmentManager.OpGenerator
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (FragmentManager.I(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        FragmentManager fragmentManager = this.f5076p;
        if (fragmentManager.d == null) {
            fragmentManager.d = new ArrayList();
        }
        fragmentManager.d.add(this);
        return true;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final int c() {
        return m(false);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final int d() {
        return m(true);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final void e() {
        if (this.g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f5076p.z(this, false);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final void f() {
        if (this.g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f5076p.z(this, true);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final void g(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f5076p) {
            super.g(fragment);
            return;
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final void h(int i2, Fragment fragment, String str, int i3) {
        super.h(i2, fragment, str, i3);
        fragment.mFragmentManager = this.f5076p;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final void i(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f5076p) {
            super.i(fragment);
            return;
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final void j(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f5076p) {
            super.j(fragment);
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final void k(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f5076p) {
            super.k(fragment);
            return;
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public final void l(int i2) {
        if (this.g) {
            if (FragmentManager.I(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            ArrayList arrayList = this.f5157a;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                FragmentTransaction.Op op = (FragmentTransaction.Op) arrayList.get(i3);
                Fragment fragment = op.f5166b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i2;
                    if (FragmentManager.I(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + op.f5166b + " to " + op.f5166b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public final int m(boolean z2) {
        if (this.q) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.I(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new LogWriter());
            n("  ", printWriter, true);
            printWriter.close();
        }
        this.q = true;
        boolean z3 = this.g;
        FragmentManager fragmentManager = this.f5076p;
        if (z3) {
            this.r = fragmentManager.f5125i.getAndIncrement();
        } else {
            this.r = -1;
        }
        fragmentManager.w(this, z2);
        return this.r;
    }

    public final void n(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f5161h);
            printWriter.print(" mIndex=");
            printWriter.print(this.r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.q);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.f5158b != 0 || this.f5159c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f5158b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f5159c));
            }
            if (this.d != 0 || this.f5160e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f5160e));
            }
            if (this.f5162i != 0 || this.j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f5162i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.j);
            }
            if (this.k != 0 || this.f5163l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f5163l);
            }
        }
        ArrayList arrayList = this.f5157a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            FragmentTransaction.Op op = (FragmentTransaction.Op) arrayList.get(i2);
            switch (op.f5165a) {
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
                    str2 = "cmd=" + op.f5165a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i2);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(op.f5166b);
            if (z2) {
                if (op.d != 0 || op.f5168e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(op.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(op.f5168e));
                }
                if (op.f != 0 || op.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(op.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(op.g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.r >= 0) {
            sb.append(" #");
            sb.append(this.r);
        }
        if (this.f5161h != null) {
            sb.append(" ");
            sb.append(this.f5161h);
        }
        sb.append("}");
        return sb.toString();
    }
}
