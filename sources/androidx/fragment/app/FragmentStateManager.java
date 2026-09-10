package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStoreOwner;
import com.charging.screenshow.battery.animations.themes.R;
import com.p004ironsource.d9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
class FragmentStateManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentLifecycleCallbacksDispatcher f5148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FragmentStore f5149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Fragment f5150c;
    public boolean d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5151e = -1;

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentStateManager$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5152a;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            f5152a = iArr;
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5152a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5152a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5152a[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public FragmentStateManager(FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, FragmentStore fragmentStore, Fragment fragment) {
        this.f5148a = fragmentLifecycleCallbacksDispatcher;
        this.f5149b = fragmentStore;
        this.f5150c = fragment;
    }

    public final void a() {
        boolean zI = FragmentManager.I(3);
        Fragment fragment = this.f5150c;
        if (zI) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        fragment.performActivityCreated(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.f5148a.a(false);
    }

    public final void b() {
        Fragment fragment;
        View view;
        View view2;
        int iIndexOfChild = -1;
        Fragment fragment2 = this.f5150c;
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
            int i2 = fragment2.mContainerId;
            FragmentStrictMode.Policy policy = FragmentStrictMode.f5209a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(fragment2);
            sb.append(" within the view of parent fragment ");
            sb.append(fragment);
            sb.append(" via container with ID ");
            FragmentStrictMode.b(new WrongNestedHierarchyViolation(fragment2, android.support.v4.media.a.i(i2, " without using parent's childFragmentManager", sb)));
            FragmentStrictMode.a(fragment2).getClass();
            EmptySet.X.contains(FragmentStrictMode.Flag.Z);
        }
        FragmentStore fragmentStore = this.f5149b;
        fragmentStore.getClass();
        ViewGroup viewGroup = fragment2.mContainer;
        if (viewGroup != null) {
            ArrayList arrayList = fragmentStore.f5154a;
            int iIndexOf = arrayList.indexOf(fragment2);
            for (int i3 = iIndexOf - 1; i3 >= 0; i3--) {
                Fragment fragment4 = (Fragment) arrayList.get(i3);
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
        boolean zI = FragmentManager.I(3);
        Fragment fragment = this.f5150c;
        if (zI) {
            Log.d("FragmentManager", "moveto ATTACHED: " + fragment);
        }
        Fragment fragment2 = fragment.mTarget;
        FragmentStateManager fragmentStateManager = null;
        FragmentStore fragmentStore = this.f5149b;
        if (fragment2 != null) {
            FragmentStateManager fragmentStateManager2 = (FragmentStateManager) fragmentStore.f5155b.get(fragment2.mWho);
            if (fragmentStateManager2 == null) {
                throw new IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.mTarget + " that does not belong to this FragmentManager!");
            }
            fragment.mTargetWho = fragment.mTarget.mWho;
            fragment.mTarget = null;
            fragmentStateManager = fragmentStateManager2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (fragmentStateManager = (FragmentStateManager) fragmentStore.f5155b.get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(fragment);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(android.support.v4.media.a.r(sb, fragment.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (fragmentStateManager != null) {
            fragmentStateManager.k();
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        fragment.mHost = fragmentManager.f5129u;
        fragment.mParentFragment = fragmentManager.f5130w;
        FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.f5148a;
        fragmentLifecycleCallbacksDispatcher.g(false);
        fragment.performAttach();
        fragmentLifecycleCallbacksDispatcher.b(false);
    }

    public final int d() {
        Object next;
        Fragment fragment = this.f5150c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.f5151e;
        int iOrdinal = fragment.mMaxState.ordinal();
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
                iMin = Math.max(this.f5151e, 2);
                View view = fragment.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f5151e < 4 ? Math.min(iMin, fragment.mState) : Math.min(iMin, 1);
            }
        }
        if (!fragment.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = fragment.mContainer;
        SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact = null;
        if (viewGroup != null) {
            SpecialEffectsController specialEffectsControllerF = SpecialEffectsController.f(viewGroup, fragment.getParentFragmentManager());
            specialEffectsControllerF.getClass();
            SpecialEffectsController.Operation operationD = specialEffectsControllerF.d(fragment);
            SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact2 = operationD != null ? operationD.f5192b : null;
            Iterator it = specialEffectsControllerF.f5188c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) next;
                if (Intrinsics.a(operation.f5193c, fragment) && !operation.f) {
                    break;
                }
            }
            SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) next;
            lifecycleImpact = operation2 != null ? operation2.f5192b : null;
            int i2 = lifecycleImpact2 == null ? -1 : SpecialEffectsController.WhenMappings.f5197a[lifecycleImpact2.ordinal()];
            if (i2 != -1 && i2 != 1) {
                lifecycleImpact = lifecycleImpact2;
            }
        }
        if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.f5195Y) {
            iMin = Math.min(iMin, 6);
        } else if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.Z) {
            iMin = Math.max(iMin, 3);
        } else if (fragment.mRemoving) {
            iMin = fragment.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (fragment.mDeferStart && fragment.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (FragmentManager.I(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + fragment);
        }
        return iMin;
    }

    public final void e() {
        boolean zI = FragmentManager.I(3);
        Fragment fragment = this.f5150c;
        if (zI) {
            Log.d("FragmentManager", "moveto CREATED: " + fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        if (fragment.mIsCreated) {
            fragment.mState = 1;
            fragment.restoreChildFragmentState();
        } else {
            FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.f5148a;
            fragmentLifecycleCallbacksDispatcher.h(false);
            fragment.performCreate(bundle2);
            fragmentLifecycleCallbacksDispatcher.c(false);
        }
    }

    public final void f() {
        String resourceName;
        Fragment fragment = this.f5150c;
        if (fragment.mFromLayout) {
            return;
        }
        if (FragmentManager.I(3)) {
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
            int i2 = fragment.mContainerId;
            if (i2 != 0) {
                if (i2 == -1) {
                    throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.a.l("Cannot create fragment ", fragment, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.v.b(i2);
                if (viewGroup == null) {
                    if (!fragment.mRestored) {
                        try {
                            resourceName = fragment.getResources().getResourceName(fragment.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.mContainerId) + " (" + resourceName + ") for fragment " + fragment);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    FragmentStrictMode.Policy policy = FragmentStrictMode.f5209a;
                    FragmentStrictMode.b(new WrongFragmentContainerViolation(fragment, viewGroup));
                    FragmentStrictMode.a(fragment).getClass();
                    EmptySet.X.contains(FragmentStrictMode.Flag.h0);
                }
            }
        }
        fragment.mContainer = viewGroup;
        fragment.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (fragment.mView != null) {
            if (FragmentManager.I(3)) {
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
            View view = fragment.mView;
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            if (view.isAttachedToWindow()) {
                ViewCompat.x(fragment.mView);
            } else {
                final View view2 = fragment.mView;
                view2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.fragment.app.FragmentStateManager.1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewAttachedToWindow(View view3) {
                        View view4 = view2;
                        view4.removeOnAttachStateChangeListener(this);
                        ViewCompat.x(view4);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewDetachedFromWindow(View view3) {
                    }
                });
            }
            fragment.performViewCreated();
            this.f5148a.m(fragment, fragment.mView, bundle2, false);
            int visibility = fragment.mView.getVisibility();
            fragment.setPostOnViewCreatedAlpha(fragment.mView.getAlpha());
            if (fragment.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment.mView.findFocus();
                if (viewFindFocus != null) {
                    fragment.setFocusedView(viewFindFocus);
                    if (FragmentManager.I(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment);
                    }
                }
                fragment.mView.setAlpha(0.0f);
            }
        }
        fragment.mState = 2;
    }

    public final void g() {
        Fragment fragmentB;
        boolean zI = FragmentManager.I(3);
        Fragment fragment = this.f5150c;
        if (zI) {
            Log.d("FragmentManager", "movefrom CREATED: " + fragment);
        }
        boolean zIsChangingConfigurations = true;
        boolean z2 = fragment.mRemoving && !fragment.isInBackStack();
        FragmentStore fragmentStore = this.f5149b;
        if (z2 && !fragment.mBeingSaved) {
            fragmentStore.i(null, fragment.mWho);
        }
        if (!z2) {
            FragmentManagerViewModel fragmentManagerViewModel = fragmentStore.d;
            if (!((fragmentManagerViewModel.d.containsKey(fragment.mWho) && fragmentManagerViewModel.g) ? fragmentManagerViewModel.f5143h : true)) {
                String str = fragment.mTargetWho;
                if (str != null && (fragmentB = fragmentStore.b(str)) != null && fragmentB.mRetainInstance) {
                    fragment.mTarget = fragmentB;
                }
                fragment.mState = 0;
                return;
            }
        }
        FragmentHostCallback<?> fragmentHostCallback = fragment.mHost;
        if (fragmentHostCallback instanceof ViewModelStoreOwner) {
            zIsChangingConfigurations = fragmentStore.d.f5143h;
        } else {
            FragmentActivity fragmentActivity = fragmentHostCallback.f5109Y;
            if (fragmentActivity != null) {
                zIsChangingConfigurations = true ^ fragmentActivity.isChangingConfigurations();
            }
        }
        if ((z2 && !fragment.mBeingSaved) || zIsChangingConfigurations) {
            fragmentStore.d.e(fragment);
        }
        fragment.performDestroy();
        this.f5148a.d(false);
        for (FragmentStateManager fragmentStateManager : fragmentStore.d()) {
            if (fragmentStateManager != null) {
                String str2 = fragment.mWho;
                Fragment fragment2 = fragmentStateManager.f5150c;
                if (str2.equals(fragment2.mTargetWho)) {
                    fragment2.mTarget = fragment;
                    fragment2.mTargetWho = null;
                }
            }
        }
        String str3 = fragment.mTargetWho;
        if (str3 != null) {
            fragment.mTarget = fragmentStore.b(str3);
        }
        fragmentStore.h(this);
    }

    public final void h() {
        View view;
        boolean zI = FragmentManager.I(3);
        Fragment fragment = this.f5150c;
        if (zI) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + fragment);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.f5148a.n(false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.j(null);
        fragment.mInLayout = false;
    }

    public final void i() {
        boolean zI = FragmentManager.I(3);
        Fragment fragment = this.f5150c;
        if (zI) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + fragment);
        }
        fragment.performDetach();
        this.f5148a.e(false);
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (!fragment.mRemoving || fragment.isInBackStack()) {
            FragmentManagerViewModel fragmentManagerViewModel = this.f5149b.d;
            if (!((fragmentManagerViewModel.d.containsKey(fragment.mWho) && fragmentManagerViewModel.g) ? fragmentManagerViewModel.f5143h : true)) {
                return;
            }
        }
        if (FragmentManager.I(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + fragment);
        }
        fragment.initState();
    }

    public final void j() {
        Fragment fragment = this.f5150c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.I(3)) {
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
                this.f5148a.m(fragment, fragment.mView, bundle2, false);
                fragment.mState = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z2 = this.d;
        Fragment fragment = this.f5150c;
        if (z2) {
            if (FragmentManager.I(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + fragment);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z3 = false;
            while (true) {
                int iD = d();
                int i2 = fragment.mState;
                FragmentStore fragmentStore = this.f5149b;
                if (iD == i2) {
                    if (!z3 && i2 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !fragment.mBeingSaved) {
                        if (FragmentManager.I(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + fragment);
                        }
                        fragmentStore.d.e(fragment);
                        fragmentStore.h(this);
                        if (FragmentManager.I(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + fragment);
                        }
                        fragment.initState();
                    }
                    if (fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            SpecialEffectsController specialEffectsControllerF = SpecialEffectsController.f(viewGroup, fragment.getParentFragmentManager());
                            boolean z4 = fragment.mHidden;
                            SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact = SpecialEffectsController.Operation.LifecycleImpact.X;
                            if (z4) {
                                specialEffectsControllerF.getClass();
                                if (FragmentManager.I(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragment);
                                }
                                specialEffectsControllerF.a(SpecialEffectsController.Operation.State.Z, lifecycleImpact, this);
                            } else {
                                specialEffectsControllerF.getClass();
                                if (FragmentManager.I(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragment);
                                }
                                specialEffectsControllerF.a(SpecialEffectsController.Operation.State.f5196Y, lifecycleImpact, this);
                            }
                        }
                        FragmentManager fragmentManager = fragment.mFragmentManager;
                        if (fragmentManager != null && fragment.mAdded && FragmentManager.J(fragment)) {
                            fragmentManager.f5115E = true;
                        }
                        fragment.mHiddenChanged = false;
                        fragment.onHiddenChanged(fragment.mHidden);
                        fragment.mChildFragmentManager.o();
                    }
                    return;
                }
                FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.f5148a;
                if (iD <= i2) {
                    switch (i2 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (fragment.mBeingSaved) {
                                if (((Bundle) fragmentStore.f5156c.get(fragment.mWho)) == null) {
                                    fragmentStore.i(n(), fragment.mWho);
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
                            if (FragmentManager.I(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment);
                            }
                            if (fragment.mBeingSaved) {
                                fragmentStore.i(n(), fragment.mWho);
                            } else if (fragment.mView != null && fragment.mSavedViewState == null) {
                                o();
                            }
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                SpecialEffectsController specialEffectsControllerF2 = SpecialEffectsController.f(viewGroup2, fragment.getParentFragmentManager());
                                specialEffectsControllerF2.getClass();
                                if (FragmentManager.I(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragment);
                                }
                                specialEffectsControllerF2.a(SpecialEffectsController.Operation.State.X, SpecialEffectsController.Operation.LifecycleImpact.Z, this);
                            }
                            fragment.mState = 3;
                            break;
                        case 4:
                            if (FragmentManager.I(3)) {
                                Log.d("FragmentManager", "movefrom STARTED: " + fragment);
                            }
                            fragment.performStop();
                            fragmentLifecycleCallbacksDispatcher.l(false);
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            if (FragmentManager.I(3)) {
                                Log.d("FragmentManager", "movefrom RESUMED: " + fragment);
                            }
                            fragment.performPause();
                            fragmentLifecycleCallbacksDispatcher.f(false);
                            break;
                    }
                } else {
                    switch (i2 + 1) {
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
                                SpecialEffectsController specialEffectsControllerF3 = SpecialEffectsController.f(viewGroup3, fragment.getParentFragmentManager());
                                SpecialEffectsController.Operation.State stateB = SpecialEffectsController.Operation.State.Companion.b(fragment.mView.getVisibility());
                                specialEffectsControllerF3.getClass();
                                if (FragmentManager.I(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragment);
                                }
                                specialEffectsControllerF3.a(stateB, SpecialEffectsController.Operation.LifecycleImpact.f5195Y, this);
                            }
                            fragment.mState = 4;
                            break;
                        case 5:
                            if (FragmentManager.I(3)) {
                                Log.d("FragmentManager", "moveto STARTED: " + fragment);
                            }
                            fragment.performStart();
                            fragmentLifecycleCallbacksDispatcher.k(false);
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            m();
                            break;
                    }
                }
                z3 = true;
            }
        } finally {
            this.d = false;
        }
    }

    public final void l(ClassLoader classLoader) {
        Fragment fragment = this.f5150c;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (fragment.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            fragment.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
        fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("viewRegistryState");
        FragmentState fragmentState = (FragmentState) fragment.mSavedFragmentState.getParcelable("state");
        if (fragmentState != null) {
            fragment.mTargetWho = fragmentState.m0;
            fragment.mTargetRequestCode = fragmentState.n0;
            Boolean bool = fragment.mSavedUserVisibleHint;
            if (bool != null) {
                fragment.mUserVisibleHint = bool.booleanValue();
                fragment.mSavedUserVisibleHint = null;
            } else {
                fragment.mUserVisibleHint = fragmentState.o0;
            }
        }
        if (fragment.mUserVisibleHint) {
            return;
        }
        fragment.mDeferStart = true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    public final void m() {
        boolean zRequestFocus;
        String str;
        boolean zI = FragmentManager.I(3);
        Fragment fragment = this.f5150c;
        if (zI) {
            Log.d("FragmentManager", "moveto RESUMED: " + fragment);
        }
        View focusedView = fragment.getFocusedView();
        if (focusedView != null) {
            if (focusedView == fragment.mView) {
                zRequestFocus = focusedView.requestFocus();
                if (FragmentManager.I(2)) {
                    StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                    sb.append(focusedView);
                    sb.append(" ");
                    if (zRequestFocus) {
                        str = "succeeded";
                    } else {
                        str = d9.h.t;
                    }
                    sb.append(str);
                    sb.append(" on Fragment ");
                    sb.append(fragment);
                    sb.append(" resulting in focused view ");
                    sb.append(fragment.mView.findFocus());
                    Log.v("FragmentManager", sb.toString());
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
                if (FragmentManager.I(2)) {
                    StringBuilder sb2 = new StringBuilder("requestFocus: Restoring focused view ");
                    sb2.append(focusedView);
                    sb2.append(" ");
                    if (zRequestFocus) {
                        str = "succeeded";
                    } else {
                        str = d9.h.t;
                    }
                    sb2.append(str);
                    sb2.append(" on Fragment ");
                    sb2.append(fragment);
                    sb2.append(" resulting in focused view ");
                    sb2.append(fragment.mView.findFocus());
                    Log.v("FragmentManager", sb2.toString());
                }
            }
        }
        fragment.setFocusedView(null);
        fragment.performResume();
        this.f5148a.i(false);
        this.f5149b.i(null, fragment.mWho);
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public final Bundle n() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.f5150c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new FragmentState(fragment));
        if (fragment.mState > -1) {
            Bundle bundle3 = new Bundle();
            fragment.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f5148a.j(false);
            Bundle bundle4 = new Bundle();
            fragment.mSavedStateRegistryController.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleV = fragment.mChildFragmentManager.V();
            if (!bundleV.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleV);
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
        Fragment fragment = this.f5150c;
        if (fragment.mView == null) {
            return;
        }
        if (FragmentManager.I(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + fragment + " with view " + fragment.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.mViewLifecycleOwner.g0.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fragment.mSavedViewRegistryState = bundle;
    }

    public FragmentStateManager(FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, FragmentStore fragmentStore, ClassLoader classLoader, FragmentFactory fragmentFactory, Bundle bundle) {
        this.f5148a = fragmentLifecycleCallbacksDispatcher;
        this.f5149b = fragmentStore;
        FragmentState fragmentState = (FragmentState) bundle.getParcelable("state");
        Fragment fragmentA = fragmentFactory.a(classLoader, fragmentState.X);
        fragmentA.mWho = fragmentState.f5147Y;
        fragmentA.mFromLayout = fragmentState.Z;
        fragmentA.mRestored = true;
        fragmentA.mFragmentId = fragmentState.e0;
        fragmentA.mContainerId = fragmentState.f0;
        fragmentA.mTag = fragmentState.g0;
        fragmentA.mRetainInstance = fragmentState.h0;
        fragmentA.mRemoving = fragmentState.i0;
        fragmentA.mDetached = fragmentState.j0;
        fragmentA.mHidden = fragmentState.k0;
        fragmentA.mMaxState = Lifecycle.State.values()[fragmentState.l0];
        fragmentA.mTargetWho = fragmentState.m0;
        fragmentA.mTargetRequestCode = fragmentState.n0;
        fragmentA.mUserVisibleHint = fragmentState.o0;
        this.f5150c = fragmentA;
        fragmentA.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentA.setArguments(bundle2);
        if (FragmentManager.I(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentA);
        }
    }

    public FragmentStateManager(FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, FragmentStore fragmentStore, Fragment fragment, Bundle bundle) {
        this.f5148a = fragmentLifecycleCallbacksDispatcher;
        this.f5149b = fragmentStore;
        this.f5150c = fragment;
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
