package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f4233h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4234i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f4235j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4236k;
    public CharSequence l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f4237m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f4238n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4239o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f4240p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g1 f4241q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f4242r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4243s;

    public a(g1 g1Var) {
        g1Var.G();
        q0 q0Var = g1Var.f4343w;
        if (q0Var != null) {
            q0Var.f4443b.getClassLoader();
        }
        this.f4226a = new ArrayList();
        this.f4239o = false;
        this.f4243s = -1;
        this.f4241q = g1Var;
    }

    @Override // androidx.fragment.app.d1
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (g1.J(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f4232g) {
            return true;
        }
        this.f4241q.f4325d.add(this);
        return true;
    }

    public final void b(q1 q1Var) {
        this.f4226a.add(q1Var);
        q1Var.f4449d = this.f4227b;
        q1Var.f4450e = this.f4228c;
        q1Var.f4451f = this.f4229d;
        q1Var.f4452g = this.f4230e;
    }

    public final void c(int i10) {
        if (this.f4232g) {
            if (g1.J(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            ArrayList arrayList = this.f4226a;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                q1 q1Var = (q1) arrayList.get(i11);
                Fragment fragment = q1Var.f4447b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i10;
                    if (g1.J(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + q1Var.f4447b + " to " + q1Var.f4447b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.f4226a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            q1 q1Var = (q1) arrayList.get(size);
            if (q1Var.f4448c) {
                if (q1Var.f4446a == 8) {
                    q1Var.f4448c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i10 = q1Var.f4447b.mContainerId;
                    q1Var.f4446a = 2;
                    q1Var.f4448c = false;
                    for (int i11 = size - 1; i11 >= 0; i11--) {
                        q1 q1Var2 = (q1) arrayList.get(i11);
                        if (q1Var2.f4448c && q1Var2.f4447b.mContainerId == i10) {
                            arrayList.remove(i11);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final void e() {
        f(false, true);
    }

    public final int f(boolean z10, boolean z11) {
        if (this.f4242r) {
            throw new IllegalStateException("commit already called");
        }
        if (g1.J(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new ae.t());
            h("  ", printWriter, true);
            printWriter.close();
        }
        this.f4242r = true;
        boolean z12 = this.f4232g;
        g1 g1Var = this.f4241q;
        if (z12) {
            this.f4243s = g1Var.f4332k.getAndIncrement();
        } else {
            this.f4243s = -1;
        }
        if (z11) {
            g1Var.x(this, z10);
        }
        return this.f4243s;
    }

    public final void g(int i10, Fragment fragment, String str) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            c1.c.c(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                sb2.append(fragment);
                sb2.append(": was ");
                throw new IllegalStateException(q4.a.j(sb2, fragment.mTag, " now ", str));
            }
            fragment.mTag = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i11 = fragment.mFragmentId;
            if (i11 != 0 && i11 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i10);
            }
            fragment.mFragmentId = i10;
            fragment.mContainerId = i10;
        }
        b(new q1(fragment, 1));
        fragment.mFragmentManager = this.f4241q;
    }

    public final void h(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f4233h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f4243s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f4242r);
            if (this.f4231f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f4231f));
            }
            if (this.f4227b != 0 || this.f4228c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4227b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4228c));
            }
            if (this.f4229d != 0 || this.f4230e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4229d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4230e));
            }
            if (this.f4234i != 0 || this.f4235j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4234i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f4235j);
            }
            if (this.f4236k != 0 || this.l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4236k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.l);
            }
        }
        ArrayList arrayList = this.f4226a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            q1 q1Var = (q1) arrayList.get(i10);
            switch (q1Var.f4446a) {
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
                    str2 = "cmd=" + q1Var.f4446a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(q1Var.f4447b);
            if (z10) {
                if (q1Var.f4449d != 0 || q1Var.f4450e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(q1Var.f4449d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(q1Var.f4450e));
                }
                if (q1Var.f4451f != 0 || q1Var.f4452g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(q1Var.f4451f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(q1Var.f4452g));
                }
            }
        }
    }

    public final void i(Fragment fragment) {
        g1 g1Var = fragment.mFragmentManager;
        if (g1Var == null || g1Var == this.f4241q) {
            b(new q1(fragment, 3));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f4243s >= 0) {
            sb2.append(" #");
            sb2.append(this.f4243s);
        }
        if (this.f4233h != null) {
            sb2.append(" ");
            sb2.append(this.f4233h);
        }
        sb2.append("}");
        return sb2.toString();
    }
}
