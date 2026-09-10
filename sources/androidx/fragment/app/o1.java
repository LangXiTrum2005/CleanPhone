package androidx.fragment.app;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ironsource.X3;
import com.storage.androidcleaner.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f4412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1 f4413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Fragment f4414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4415d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4416e = -1;

    public o1(m0 m0Var, p1 p1Var, Fragment fragment) {
        this.f4412a = m0Var;
        this.f4413b = p1Var;
        this.f4414c = fragment;
    }

    public final void a() {
        boolean zJ = g1.J(3);
        Fragment fragment = this.f4414c;
        if (zJ) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        fragment.performActivityCreated(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.f4412a.a(fragment, false);
    }

    public final void b() {
        Fragment fragment;
        View view;
        View view2;
        Fragment fragment2 = this.f4414c;
        View view3 = fragment2.mContainer;
        while (true) {
            fragment = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            Fragment fragment3 = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment3 != null) {
                fragment = fragment3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        Fragment parentFragment = fragment2.getParentFragment();
        if (fragment != null && !fragment.equals(parentFragment)) {
            int i10 = fragment2.mContainerId;
            c1.b bVar = c1.c.f5831a;
            StringBuilder sb2 = new StringBuilder("Attempting to nest fragment ");
            sb2.append(fragment2);
            sb2.append(" within the view of parent fragment ");
            sb2.append(fragment);
            sb2.append(" via container with ID ");
            c1.c.b(new c1.a(fragment2, l1.d.i(sb2, i10, " without using parent's childFragmentManager")));
            c1.c.a(fragment2).getClass();
        }
        ArrayList arrayList = this.f4413b.f4435a;
        ViewGroup viewGroup = fragment2.mContainer;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(fragment2);
            for (int i11 = iIndexOf - 1; i11 >= 0; i11--) {
                Fragment fragment4 = (Fragment) arrayList.get(i11);
                if (fragment4.mContainer == viewGroup && (view2 = fragment4.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                Fragment fragment5 = (Fragment) arrayList.get(iIndexOf);
                if (fragment5.mContainer == viewGroup && (view = fragment5.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        fragment2.mContainer.addView(fragment2.mView, iIndexOfChild);
    }

    public final void c() {
        boolean zJ = g1.J(3);
        Fragment fragment = this.f4414c;
        if (zJ) {
            Log.d("FragmentManager", "moveto ATTACHED: " + fragment);
        }
        Fragment fragment2 = fragment.mTarget;
        o1 o1Var = null;
        p1 p1Var = this.f4413b;
        if (fragment2 != null) {
            o1 o1Var2 = (o1) p1Var.f4436b.get(fragment2.mWho);
            if (o1Var2 == null) {
                throw new IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.mTarget + " that does not belong to this FragmentManager!");
            }
            fragment.mTargetWho = fragment.mTarget.mWho;
            fragment.mTarget = null;
            o1Var = o1Var2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (o1Var = (o1) p1Var.f4436b.get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(fragment);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(defpackage.e.q(fragment.mTargetWho, " that does not belong to this FragmentManager!", sb2));
            }
        }
        if (o1Var != null) {
            o1Var.k();
        }
        g1 g1Var = fragment.mFragmentManager;
        fragment.mHost = g1Var.f4343w;
        fragment.mParentFragment = g1Var.f4345y;
        m0 m0Var = this.f4412a;
        m0Var.g(fragment, false);
        fragment.performAttach();
        m0Var.b(fragment, false);
    }

    public final int d() {
        Fragment fragment = this.f4414c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.f4416e;
        int iOrdinal = fragment.mMaxState.ordinal();
        int i10 = 0;
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (fragment.mFromLayout) {
            if (fragment.mInLayout) {
                iMin = Math.max(this.f4416e, 2);
                View view = fragment.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f4416e < 4 ? Math.min(iMin, fragment.mState) : Math.min(iMin, 1);
            }
        }
        if (fragment.mInDynamicContainer && fragment.mContainer == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!fragment.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            r rVarJ = r.j(viewGroup, fragment.getParentFragmentManager());
            c2 c2VarG = rVarJ.g(fragment);
            int i11 = c2VarG != null ? c2VarG.f4272b : 0;
            c2 c2VarH = rVarJ.h(fragment);
            i10 = c2VarH != null ? c2VarH.f4272b : 0;
            int i12 = i11 == 0 ? -1 : d2.f4291a[v0.i.c(i11)];
            if (i12 != -1 && i12 != 1) {
                i10 = i11;
            }
        }
        if (i10 == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i10 == 3) {
            iMin = Math.max(iMin, 3);
        } else if (fragment.mRemoving) {
            iMin = fragment.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (fragment.mDeferStart && fragment.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (fragment.mTransitioning) {
            iMin = Math.max(iMin, 3);
        }
        if (g1.J(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + fragment);
        }
        return iMin;
    }

    public final void e() {
        boolean zJ = g1.J(3);
        Fragment fragment = this.f4414c;
        if (zJ) {
            Log.d("FragmentManager", "moveto CREATED: " + fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        if (fragment.mIsCreated) {
            fragment.mState = 1;
            fragment.restoreChildFragmentState();
        } else {
            m0 m0Var = this.f4412a;
            m0Var.h(fragment, false);
            fragment.performCreate(bundle2);
            m0Var.c(fragment, false);
        }
    }

    public final void f() {
        String resourceName;
        Fragment fragment = this.f4414c;
        if (fragment.mFromLayout) {
            return;
        }
        if (g1.J(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = fragment.mContainerId;
            if (i10 != 0) {
                if (i10 == -1) {
                    throw new IllegalArgumentException(defpackage.e.m("Cannot create fragment ", fragment, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.f4344x.b(i10);
                if (viewGroup == null) {
                    if (!fragment.mRestored && !fragment.mInDynamicContainer) {
                        try {
                            resourceName = fragment.getResources().getResourceName(fragment.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.mContainerId) + " (" + resourceName + ") for fragment " + fragment);
                    }
                } else if (!(viewGroup instanceof p0)) {
                    c1.b bVar = c1.c.f5831a;
                    c1.c.b(new c1.d(fragment, viewGroup, 1));
                    c1.c.a(fragment).getClass();
                }
            }
        }
        fragment.mContainer = viewGroup;
        fragment.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (fragment.mView != null) {
            if (g1.J(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + fragment);
            }
            fragment.mView.setSaveFromParentEnabled(false);
            fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
            if (viewGroup != null) {
                b();
            }
            if (fragment.mHidden) {
                fragment.mView.setVisibility(8);
            }
            if (fragment.mView.isAttachedToWindow()) {
                View view = fragment.mView;
                WeakHashMap weakHashMap = m0.s0.f45746a;
                view.requestApplyInsets();
            } else {
                View view2 = fragment.mView;
                view2.addOnAttachStateChangeListener(new n1(view2));
            }
            fragment.performViewCreated();
            this.f4412a.m(fragment, fragment.mView, false);
            int visibility = fragment.mView.getVisibility();
            fragment.setPostOnViewCreatedAlpha(fragment.mView.getAlpha());
            if (fragment.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment.mView.findFocus();
                if (viewFindFocus != null) {
                    fragment.setFocusedView(viewFindFocus);
                    if (g1.J(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment);
                    }
                }
                fragment.mView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
        fragment.mState = 2;
    }

    public final void g() {
        Fragment fragmentB;
        boolean zJ = g1.J(3);
        Fragment fragment = this.f4414c;
        if (zJ) {
            Log.d("FragmentManager", "movefrom CREATED: " + fragment);
        }
        boolean zIsChangingConfigurations = true;
        boolean z10 = fragment.mRemoving && !fragment.isInBackStack();
        p1 p1Var = this.f4413b;
        if (z10 && !fragment.mBeingSaved) {
            p1Var.i(null, fragment.mWho);
        }
        if (!z10) {
            k1 k1Var = p1Var.f4438d;
            if (!((k1Var.f4373d.containsKey(fragment.mWho) && k1Var.f4376g) ? k1Var.f4377h : true)) {
                String str = fragment.mTargetWho;
                if (str != null && (fragmentB = p1Var.b(str)) != null && fragmentB.mRetainInstance) {
                    fragment.mTarget = fragmentB;
                }
                fragment.mState = 0;
                return;
            }
        }
        q0 q0Var = fragment.mHost;
        if (q0Var instanceof androidx.lifecycle.d1) {
            zIsChangingConfigurations = p1Var.f4438d.f4377h;
        } else {
            FragmentActivity fragmentActivity = q0Var.f4443b;
            if (fragmentActivity != null) {
                zIsChangingConfigurations = true ^ fragmentActivity.isChangingConfigurations();
            }
        }
        if ((z10 && !fragment.mBeingSaved) || zIsChangingConfigurations) {
            p1Var.f4438d.d(fragment, false);
        }
        fragment.performDestroy();
        this.f4412a.d(fragment, false);
        for (o1 o1Var : p1Var.d()) {
            if (o1Var != null) {
                Fragment fragment2 = o1Var.f4414c;
                if (fragment.mWho.equals(fragment2.mTargetWho)) {
                    fragment2.mTarget = fragment;
                    fragment2.mTargetWho = null;
                }
            }
        }
        String str2 = fragment.mTargetWho;
        if (str2 != null) {
            fragment.mTarget = p1Var.b(str2);
        }
        p1Var.h(this);
    }

    public final void h() {
        View view;
        boolean zJ = g1.J(3);
        Fragment fragment = this.f4414c;
        if (zJ) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + fragment);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.f4412a.n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.j(null);
        fragment.mInLayout = false;
    }

    public final void i() {
        boolean zJ = g1.J(3);
        Fragment fragment = this.f4414c;
        if (zJ) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + fragment);
        }
        fragment.performDetach();
        this.f4412a.e(fragment, false);
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (!fragment.mRemoving || fragment.isInBackStack()) {
            k1 k1Var = this.f4413b.f4438d;
            if (!((k1Var.f4373d.containsKey(fragment.mWho) && k1Var.f4376g) ? k1Var.f4377h : true)) {
                return;
            }
        }
        if (g1.J(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + fragment);
        }
        fragment.initState();
    }

    public final void j() {
        Fragment fragment = this.f4414c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (g1.J(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
            }
            Bundle bundle = fragment.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            fragment.performCreateView(fragment.performGetLayoutInflater(bundle2), null, bundle2);
            View view = fragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.performViewCreated();
                this.f4412a.m(fragment, fragment.mView, false);
                fragment.mState = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z10 = this.f4415d;
        Fragment fragment = this.f4414c;
        if (z10) {
            if (g1.J(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + fragment);
                return;
            }
            return;
        }
        try {
            this.f4415d = true;
            boolean z11 = false;
            while (true) {
                int iD = d();
                int i10 = fragment.mState;
                int i11 = 3;
                p1 p1Var = this.f4413b;
                if (iD == i10) {
                    if (!z11 && i10 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !fragment.mBeingSaved) {
                        if (g1.J(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + fragment);
                        }
                        p1Var.f4438d.d(fragment, true);
                        p1Var.h(this);
                        if (g1.J(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + fragment);
                        }
                        fragment.initState();
                    }
                    if (fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            r rVarJ = r.j(viewGroup, fragment.getParentFragmentManager());
                            if (fragment.mHidden) {
                                if (g1.J(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragment);
                                }
                                rVarJ.d(3, 1, this);
                            } else {
                                if (g1.J(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragment);
                                }
                                rVarJ.d(2, 1, this);
                            }
                        }
                        g1 g1Var = fragment.mFragmentManager;
                        if (g1Var != null && fragment.mAdded && g1.K(fragment)) {
                            g1Var.G = true;
                        }
                        fragment.mHiddenChanged = false;
                        fragment.onHiddenChanged(fragment.mHidden);
                        fragment.mChildFragmentManager.o();
                    }
                    this.f4415d = false;
                    return;
                }
                m0 m0Var = this.f4412a;
                if (iD <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (fragment.mBeingSaved) {
                                if (((Bundle) p1Var.f4437c.get(fragment.mWho)) == null) {
                                    p1Var.i(n(), fragment.mWho);
                                }
                            }
                            g();
                            break;
                        case 1:
                            h();
                            fragment.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (g1.J(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment);
                            }
                            if (fragment.mBeingSaved) {
                                p1Var.i(n(), fragment.mWho);
                            } else if (fragment.mView != null && fragment.mSavedViewState == null) {
                                o();
                            }
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                r rVarJ2 = r.j(viewGroup2, fragment.getParentFragmentManager());
                                if (g1.J(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragment);
                                }
                                rVarJ2.d(1, 3, this);
                            }
                            fragment.mState = 3;
                            break;
                        case 4:
                            if (g1.J(3)) {
                                Log.d("FragmentManager", "movefrom STARTED: " + fragment);
                            }
                            fragment.performStop();
                            m0Var.l(fragment, false);
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            if (g1.J(3)) {
                                Log.d("FragmentManager", "movefrom RESUMED: " + fragment);
                            }
                            fragment.performPause();
                            m0Var.f(fragment, false);
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                r rVarJ3 = r.j(viewGroup3, fragment.getParentFragmentManager());
                                int visibility = fragment.mView.getVisibility();
                                if (visibility == 0) {
                                    i11 = 2;
                                } else if (visibility == 4) {
                                    i11 = 4;
                                } else if (visibility != 8) {
                                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                                }
                                d5.u.n(i11, "finalState");
                                if (g1.J(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragment);
                                }
                                rVarJ3.d(i11, 2, this);
                            }
                            fragment.mState = 4;
                            break;
                        case 5:
                            if (g1.J(3)) {
                                Log.d("FragmentManager", "moveto STARTED: " + fragment);
                            }
                            fragment.performStart();
                            m0Var.k(fragment, false);
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            m();
                            break;
                    }
                }
                z11 = true;
            }
        } catch (Throwable th2) {
            this.f4415d = false;
            throw th2;
        }
    }

    public final void l(ClassLoader classLoader) {
        Fragment fragment = this.f4414c;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (fragment.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            fragment.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
            fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("viewRegistryState");
            m1 m1Var = (m1) fragment.mSavedFragmentState.getParcelable("state");
            if (m1Var != null) {
                fragment.mTargetWho = m1Var.f4397m;
                fragment.mTargetRequestCode = m1Var.f4398n;
                Boolean bool = fragment.mSavedUserVisibleHint;
                if (bool != null) {
                    fragment.mUserVisibleHint = bool.booleanValue();
                    fragment.mSavedUserVisibleHint = null;
                } else {
                    fragment.mUserVisibleHint = m1Var.f4399o;
                }
            }
            if (fragment.mUserVisibleHint) {
                return;
            }
            fragment.mDeferStart = true;
        } catch (BadParcelableException e10) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + fragment, e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    public final void m() {
        boolean zRequestFocus;
        String str;
        boolean zJ = g1.J(3);
        Fragment fragment = this.f4414c;
        if (zJ) {
            Log.d("FragmentManager", "moveto RESUMED: " + fragment);
        }
        View focusedView = fragment.getFocusedView();
        if (focusedView != null) {
            if (focusedView == fragment.mView) {
                zRequestFocus = focusedView.requestFocus();
                if (g1.J(2)) {
                    StringBuilder sb2 = new StringBuilder("requestFocus: Restoring focused view ");
                    sb2.append(focusedView);
                    sb2.append(" ");
                    if (zRequestFocus) {
                        str = "succeeded";
                    } else {
                        str = X3.i.f27815t;
                    }
                    sb2.append(str);
                    sb2.append(" on Fragment ");
                    sb2.append(fragment);
                    sb2.append(" resulting in focused view ");
                    sb2.append(fragment.mView.findFocus());
                    Log.v("FragmentManager", sb2.toString());
                }
            } else {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == fragment.mView) {
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                zRequestFocus = focusedView.requestFocus();
                if (g1.J(2)) {
                    StringBuilder sb3 = new StringBuilder("requestFocus: Restoring focused view ");
                    sb3.append(focusedView);
                    sb3.append(" ");
                    if (zRequestFocus) {
                        str = "succeeded";
                    } else {
                        str = X3.i.f27815t;
                    }
                    sb3.append(str);
                    sb3.append(" on Fragment ");
                    sb3.append(fragment);
                    sb3.append(" resulting in focused view ");
                    sb3.append(fragment.mView.findFocus());
                    Log.v("FragmentManager", sb3.toString());
                }
            }
        }
        fragment.setFocusedView(null);
        fragment.performResume();
        this.f4412a.i(fragment, false);
        this.f4413b.i(null, fragment.mWho);
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public final Bundle n() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.f4414c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new m1(fragment));
        if (fragment.mState > 0) {
            Bundle bundle3 = new Bundle();
            fragment.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f4412a.j(fragment, bundle3, false);
            Bundle bundle4 = new Bundle();
            fragment.mSavedStateRegistryController.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleW = fragment.mChildFragmentManager.W();
            if (!bundleW.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleW);
            }
            if (fragment.mView != null) {
                o();
            }
            SparseArray<Parcelable> sparseArray = fragment.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = fragment.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = fragment.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void o() {
        Fragment fragment = this.f4414c;
        if (fragment.mView == null) {
            return;
        }
        if (g1.J(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + fragment + " with view " + fragment.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.mViewLifecycleOwner.f4522f.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fragment.mSavedViewRegistryState = bundle;
    }

    public o1(m0 m0Var, p1 p1Var, ClassLoader classLoader, y0 y0Var, Bundle bundle) {
        this.f4412a = m0Var;
        this.f4413b = p1Var;
        m1 m1Var = (m1) bundle.getParcelable("state");
        Fragment fragmentInstantiate = Fragment.instantiate(y0Var.f4514a.f4343w.f4443b, m1Var.f4386a, null);
        fragmentInstantiate.mWho = m1Var.f4387b;
        fragmentInstantiate.mFromLayout = m1Var.f4388c;
        fragmentInstantiate.mInDynamicContainer = m1Var.f4389d;
        fragmentInstantiate.mRestored = true;
        fragmentInstantiate.mFragmentId = m1Var.f4390e;
        fragmentInstantiate.mContainerId = m1Var.f4391f;
        fragmentInstantiate.mTag = m1Var.f4392g;
        fragmentInstantiate.mRetainInstance = m1Var.f4393h;
        fragmentInstantiate.mRemoving = m1Var.f4394i;
        fragmentInstantiate.mDetached = m1Var.f4395j;
        fragmentInstantiate.mHidden = m1Var.f4396k;
        fragmentInstantiate.mMaxState = androidx.lifecycle.n.values()[m1Var.l];
        fragmentInstantiate.mTargetWho = m1Var.f4397m;
        fragmentInstantiate.mTargetRequestCode = m1Var.f4398n;
        fragmentInstantiate.mUserVisibleHint = m1Var.f4399o;
        this.f4414c = fragmentInstantiate;
        fragmentInstantiate.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentInstantiate.setArguments(bundle2);
        if (g1.J(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentInstantiate);
        }
    }

    public o1(m0 m0Var, p1 p1Var, Fragment fragment, Bundle bundle) {
        this.f4412a = m0Var;
        this.f4413b = p1Var;
        this.f4414c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }
}
