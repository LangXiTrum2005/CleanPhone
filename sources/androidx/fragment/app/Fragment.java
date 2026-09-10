package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.storage.androidcleaner.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.v, androidx.lifecycle.d1, androidx.lifecycle.i, j4.g {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    e0 mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;

    @NonNull
    g1 mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    androidx.lifecycle.a1 mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    g1 mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    q0 mHost;
    boolean mInDynamicContainer;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    androidx.lifecycle.x mLifecycleRegistry;
    androidx.lifecycle.n mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<f0> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;

    @Nullable
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final f0 mSavedStateAttachListener;
    j4.f mSavedStateRegistryController;

    @Nullable
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mTransitioning;
    boolean mUserVisibleHint;
    View mView;

    @Nullable
    z1 mViewLifecycleOwner;
    androidx.lifecycle.f0 mViewLifecycleOwnerLiveData;

    @NonNull
    String mWho;

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new h1();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new y(this, 0);
        this.mMaxState = androidx.lifecycle.n.f4568e;
        this.mViewLifecycleOwnerLiveData = new androidx.lifecycle.f0();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new z(this);
        initLifecycle();
    }

    private e0 ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            e0 e0Var = new e0();
            e0Var.f4304i = null;
            Object obj = USE_DEFAULT_TRANSITION;
            e0Var.f4305j = obj;
            e0Var.f4306k = null;
            e0Var.l = obj;
            e0Var.f4307m = null;
            e0Var.f4308n = obj;
            e0Var.f4311q = 1.0f;
            e0Var.f4312r = null;
            this.mAnimationInfo = e0Var;
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        androidx.lifecycle.n nVar = this.mMaxState;
        return (nVar == androidx.lifecycle.n.f4565b || this.mParentFragment == null) ? nVar.ordinal() : Math.min(nVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new androidx.lifecycle.x(this);
        this.mSavedStateRegistryController = new j4.f(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        registerOnPreAttachListener(this.mSavedStateAttachListener);
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context, @NonNull String str) {
        return instantiate(context, str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$performCreateView$0() {
        z1 z1Var = this.mViewLifecycleOwner;
        z1Var.f4522f.b(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    @NonNull
    private <I, O> h.c prepareCallInternal(@NonNull i.a aVar, @NonNull s.a aVar2, @NonNull h.b bVar) {
        if (this.mState > 1) {
            throw new IllegalStateException(defpackage.e.m("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        registerOnPreAttachListener(new d0(this, aVar2, atomicReference, aVar, bVar));
        return new x(atomicReference);
    }

    private void registerOnPreAttachListener(@NonNull f0 f0Var) {
        if (this.mState >= 0) {
            f0Var.a();
        } else {
            this.mOnPreAttachedListeners.add(f0Var);
        }
    }

    public void callStartTransitionListener(boolean z10) {
        ViewGroup viewGroup;
        g1 g1Var;
        e0 e0Var = this.mAnimationInfo;
        if (e0Var != null) {
            e0Var.f4313s = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (g1Var = this.mFragmentManager) == null) {
            return;
        }
        r rVarJ = r.j(viewGroup, g1Var);
        rVarJ.l();
        if (z10) {
            this.mHost.f4444c.post(new s(rVarJ, 1));
        } else {
            rVarJ.e();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    @NonNull
    public o0 createFragmentContainer() {
        return new a0(this);
    }

    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            f1.a.a(this).b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.v(wi.d.h(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(@Nullable Object obj) {
        return super.equals(obj);
    }

    @Nullable
    public Fragment findFragmentByWho(@NonNull String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.f4324c.c(str);
    }

    @NonNull
    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        e0 e0Var = this.mAnimationInfo;
        if (e0Var == null || (bool = e0Var.f4310p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        e0 e0Var = this.mAnimationInfo;
        if (e0Var == null || (bool = e0Var.f4309o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        e0 e0Var = this.mAnimationInfo;
        if (e0Var == null) {
            return null;
        }
        e0Var.getClass();
        return null;
    }

    @Nullable
    public final Bundle getArguments() {
        return this.mArguments;
    }

    @NonNull
    public final g1 getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(defpackage.e.m("Fragment ", this, " has not been attached yet."));
    }

    @Nullable
    public Context getContext() {
        q0 q0Var = this.mHost;
        if (q0Var == null) {
            return null;
        }
        return q0Var.f4443b;
    }

    @Override // androidx.lifecycle.i
    @NonNull
    public e1.b getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && g1.J(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        e1.c cVar = new e1.c(0);
        LinkedHashMap linkedHashMap = cVar.f39019a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.y0.f4620a, application);
        }
        linkedHashMap.put(androidx.lifecycle.r0.f4586a, this);
        linkedHashMap.put(androidx.lifecycle.r0.f4587b, this);
        if (getArguments() != null) {
            linkedHashMap.put(androidx.lifecycle.r0.f4588c, getArguments());
        }
        return cVar;
    }

    @Override // androidx.lifecycle.i
    @NonNull
    public androidx.lifecycle.a1 getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && g1.J(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new androidx.lifecycle.u0(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        e0 e0Var = this.mAnimationInfo;
        if (e0Var == null) {
            return 0;
        }
        return e0Var.f4297b;
    }

    @Nullable
    public Object getEnterTransition() {
        e0 e0Var = this.mAnimationInfo;
        if (e0Var == null) {
            return null;
        }
        return e0Var.f4304i;
    }

    public b0.r0 getEnterTransitionCallback() {
        e0 e0Var = this.mAnimationInfo;
        if (e0Var == null) {
            return null;
        }
        e0Var.getClass();
        return null;
    }

    public int getExitAnim() {
        e0 e0Var = this.mAnimationInfo;
        if (e0Var == null) {
            return 0;
        }
        return e0Var.f4298c;
    }

    @Nullable
    public Object getExitTransition() {
        e0 e0Var = this.mAnimationInfo;
        if (e0Var == null) {
            return null;
        }
        return e0Var.f4306k;
    }

    public b0.r0 getExitTransitionCallback() {
        e0 e0Var = this.mAnimationInfo;
        if (e0Var == null) {
            return null;
        }
        e0Var.getClass();
        return null;
    }

    public View getFocusedView() {
        e0 e0Var = this.mAnimationInfo;
        if (e0Var == null) {
            return null;
        }
        return e0Var.f4312r;
    }

    @Nullable
    @Deprecated
    public final g1 getFragmentManager() {
        return this.mFragmentManager;
    }

    @Nullable
    public final Object getHost() {
        q0 q0Var = this.mHost;
        if (q0Var == null) {
            return null;
        }
        return ((l0) q0Var).f4380e;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @NonNull
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.v
    @NonNull
    public androidx.lifecycle.o getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @NonNull
    @Deprecated
    public f1.a getLoaderManager() {
        return f1.a.a(this);
    }

    public int getNextTransition() {
        e0 e0Var = this.mAnimationInfo;
        if (e0Var == null) {
            return 0;
        }
        return e0Var.f4301f;
    }

    @Nullable
    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    @NonNull
    public final g1 getParentFragmentManager() {
        g1 g1Var = this.mFragmentManager;
        if (g1Var != null) {
            return g1Var;
        }
        throw new IllegalStateException(defpackage.e.m("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        e0 e0Var = this.mAnimationInfo;
        if (e0Var == null) {
            return false;
        }
        return e0Var.f4296a;
    }

    public int getPopEnterAnim() {
        e0 e0Var = this.mAnimationInfo;
        if (e0Var == null) {
            return 0;
        }
        return e0Var.f4299d;
    }

    public int getPopExitAnim() {
        e0 e0Var = this.mAnimationInfo;
        if (e0Var == null) {
            return 0;
        }
        return e0Var.f4300e;
    }

    public float getPostOnViewCreatedAlpha() {
        e0 e0Var = this.mAnimationInfo;
        if (e0Var == null) {
            return 1.0f;
        }
        return e0Var.f4311q;
    }

    @Nullable
    public Object getReenterTransition() {
        e0 e0Var = this.mAnimationInfo;
        if (e0Var == null) {
            return null;
        }
        Object obj = e0Var.l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    @NonNull
    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        c1.b bVar = c1.c.f5831a;
        c1.c.b(new c1.e(this, "Attempting to get retain instance for fragment " + this));
        c1.c.a(this).getClass();
        return this.mRetainInstance;
    }

    @Nullable
    public Object getReturnTransition() {
        e0 e0Var = this.mAnimationInfo;
        if (e0Var == null) {
            return null;
        }
        Object obj = e0Var.f4305j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // j4.g
    @NonNull
    public final j4.e getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f43708b;
    }

    @Nullable
    public Object getSharedElementEnterTransition() {
        e0 e0Var = this.mAnimationInfo;
        if (e0Var == null) {
            return null;
        }
        return e0Var.f4307m;
    }

    @Nullable
    public Object getSharedElementReturnTransition() {
        e0 e0Var = this.mAnimationInfo;
        if (e0Var == null) {
            return null;
        }
        Object obj = e0Var.f4308n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    @NonNull
    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        e0 e0Var = this.mAnimationInfo;
        return (e0Var == null || (arrayList = e0Var.f4302g) == null) ? new ArrayList<>() : arrayList;
    }

    @NonNull
    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        e0 e0Var = this.mAnimationInfo;
        return (e0Var == null || (arrayList = e0Var.f4303h) == null) ? new ArrayList<>() : arrayList;
    }

    @NonNull
    public final String getString(int i10) {
        return getResources().getString(i10);
    }

    @Nullable
    public final String getTag() {
        return this.mTag;
    }

    @Nullable
    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        c1.b bVar = c1.c.f5831a;
        c1.c.b(new c1.f(this, "Attempting to get target request code from fragment " + this));
        c1.c.a(this).getClass();
        return this.mTargetRequestCode;
    }

    @NonNull
    public final CharSequence getText(int i10) {
        return getResources().getText(i10);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @Nullable
    public View getView() {
        return this.mView;
    }

    @NonNull
    public androidx.lifecycle.v getViewLifecycleOwner() {
        z1 z1Var = this.mViewLifecycleOwner;
        if (z1Var != null) {
            return z1Var;
        }
        throw new IllegalStateException(defpackage.e.m("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    @NonNull
    public androidx.lifecycle.e0 getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.d1
    @NonNull
    public androidx.lifecycle.c1 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (getMinimumMaxLifecycleState() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.mFragmentManager.O.f4375f;
        androidx.lifecycle.c1 c1Var = (androidx.lifecycle.c1) map.get(this.mWho);
        if (c1Var != null) {
            return c1Var;
        }
        androidx.lifecycle.c1 c1Var2 = new androidx.lifecycle.c1();
        map.put(this.mWho, c1Var2);
        return c1Var2;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new h1();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (this.mHidden) {
            return true;
        }
        g1 g1Var = this.mFragmentManager;
        if (g1Var != null) {
            Fragment fragment = this.mParentFragment;
            g1Var.getClass();
            if (fragment == null ? false : fragment.isHidden()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (!this.mMenuVisible) {
            return false;
        }
        if (this.mFragmentManager != null) {
            Fragment fragment = this.mParentFragment;
            if (!(fragment == null ? true : fragment.isMenuVisible())) {
                return false;
            }
        }
        return true;
    }

    public boolean isPostponed() {
        e0 e0Var = this.mAnimationInfo;
        if (e0Var == null) {
            return false;
        }
        return e0Var.f4313s;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        g1 g1Var = this.mFragmentManager;
        if (g1Var == null) {
            return false;
        }
        return g1Var.N();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.P();
    }

    @Deprecated
    public void onActivityCreated(@Nullable Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i10, int i11, @Nullable Intent intent) {
        if (g1.J(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    public void onAttach(@NonNull Context context) {
        this.mCalled = true;
        q0 q0Var = this.mHost;
        FragmentActivity fragmentActivity = q0Var == null ? null : q0Var.f4442a;
        if (fragmentActivity != null) {
            this.mCalled = false;
            onAttach((Activity) fragmentActivity);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    public void onCreate(@Nullable Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        g1 g1Var = this.mChildFragmentManager;
        if (g1Var.f4342v >= 1) {
            return;
        }
        g1Var.H = false;
        g1Var.I = false;
        g1Var.O.f4378i = false;
        g1Var.u(1);
    }

    @Nullable
    public Animation onCreateAnimation(int i10, boolean z10, int i11) {
        return null;
    }

    @Nullable
    public Animator onCreateAnimator(int i10, boolean z10, int i11) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(@NonNull ContextMenu contextMenu, @NonNull View view, @Nullable ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    @NonNull
    public LayoutInflater onGetLayoutInflater(@Nullable Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onInflate(@NonNull Context context, @NonNull AttributeSet attributeSet, @Nullable Bundle bundle) {
        this.mCalled = true;
        q0 q0Var = this.mHost;
        FragmentActivity fragmentActivity = q0Var == null ? null : q0Var.f4442a;
        if (fragmentActivity != null) {
            this.mCalled = false;
            onInflate((Activity) fragmentActivity, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    @Deprecated
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewStateRestored(@Nullable Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.P();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new e2(defpackage.e.m("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        restoreViewState();
        g1 g1Var = this.mChildFragmentManager;
        g1Var.H = false;
        g1Var.I = false;
        g1Var.O.f4378i = false;
        g1Var.u(4);
    }

    public void performAttach() {
        Iterator<f0> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach((Context) this.mHost.f4443b);
        if (!this.mCalled) {
            throw new e2(defpackage.e.m("Fragment ", this, " did not call through to super.onAttach()"));
        }
        Iterator it2 = this.mFragmentManager.f4336p.iterator();
        while (it2.hasNext()) {
            ((l1) it2.next()).a(this);
        }
        g1 g1Var = this.mChildFragmentManager;
        g1Var.H = false;
        g1Var.I = false;
        g1Var.O.f4378i = false;
        g1Var.u(0);
    }

    public void performConfigurationChanged(@NonNull Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.j(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.P();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new b0(this));
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new e2(defpackage.e.m("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.e(androidx.lifecycle.m.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z10 = true;
        }
        return this.mChildFragmentManager.k(menu, menuInflater) | z10;
    }

    public void performCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.mChildFragmentManager.P();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new z1(this, getViewModelStore(), new n(this, 1));
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.f4521e != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.b();
        if (g1.J(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
        }
        View view = this.mView;
        z1 z1Var = this.mViewLifecycleOwner;
        kotlin.jvm.internal.n.f(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, z1Var);
        View view2 = this.mView;
        z1 z1Var2 = this.mViewLifecycleOwner;
        kotlin.jvm.internal.n.f(view2, "<this>");
        view2.setTag(R.id.view_tree_view_model_store_owner, z1Var2);
        View view3 = this.mView;
        z1 z1Var3 = this.mViewLifecycleOwner;
        kotlin.jvm.internal.n.f(view3, "<this>");
        view3.setTag(R.id.view_tree_saved_state_registry_owner, z1Var3);
        this.mViewLifecycleOwnerLiveData.j(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.l();
        this.mLifecycleRegistry.e(androidx.lifecycle.m.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new e2(defpackage.e.m("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.u(1);
        if (this.mView != null) {
            z1 z1Var = this.mViewLifecycleOwner;
            z1Var.b();
            if (z1Var.f4521e.f4609d.compareTo(androidx.lifecycle.n.f4566c) >= 0) {
                this.mViewLifecycleOwner.a(androidx.lifecycle.m.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new e2(defpackage.e.m("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        x.j jVar = f1.a.a(this).f40271b.f40268d;
        int i10 = jVar.f53509c;
        for (int i11 = 0; i11 < i10; i11++) {
            ((f1.b) jVar.f53508b[i11]).k();
        }
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new e2(defpackage.e.m("Fragment ", this, " did not call through to super.onDetach()"));
        }
        g1 g1Var = this.mChildFragmentManager;
        if (g1Var.J) {
            return;
        }
        g1Var.l();
        this.mChildFragmentManager = new h1();
    }

    @NonNull
    public LayoutInflater performGetLayoutInflater(@Nullable Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z10) {
        onMultiWindowModeChanged(z10);
    }

    public boolean performOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.p(menuItem);
    }

    public void performOptionsMenuClosed(@NonNull Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.q(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.u(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.m.ON_PAUSE);
        }
        this.mLifecycleRegistry.e(androidx.lifecycle.m.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new e2(defpackage.e.m("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z10) {
        onPictureInPictureModeChanged(z10);
    }

    public boolean performPrepareOptionsMenu(@NonNull Menu menu) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z10 = true;
        }
        return this.mChildFragmentManager.t(menu) | z10;
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean zM = g1.M(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zM) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zM);
            onPrimaryNavigationFragmentChanged(zM);
            g1 g1Var = this.mChildFragmentManager;
            g1Var.f0();
            g1Var.r(g1Var.f4346z);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.P();
        this.mChildFragmentManager.z(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new e2(defpackage.e.m("Fragment ", this, " did not call through to super.onResume()"));
        }
        androidx.lifecycle.x xVar = this.mLifecycleRegistry;
        androidx.lifecycle.m mVar = androidx.lifecycle.m.ON_RESUME;
        xVar.e(mVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f4521e.e(mVar);
        }
        g1 g1Var = this.mChildFragmentManager;
        g1Var.H = false;
        g1Var.I = false;
        g1Var.O.f4378i = false;
        g1Var.u(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.P();
        this.mChildFragmentManager.z(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new e2(defpackage.e.m("Fragment ", this, " did not call through to super.onStart()"));
        }
        androidx.lifecycle.x xVar = this.mLifecycleRegistry;
        androidx.lifecycle.m mVar = androidx.lifecycle.m.ON_START;
        xVar.e(mVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f4521e.e(mVar);
        }
        g1 g1Var = this.mChildFragmentManager;
        g1Var.H = false;
        g1Var.I = false;
        g1Var.O.f4378i = false;
        g1Var.u(5);
    }

    public void performStop() {
        g1 g1Var = this.mChildFragmentManager;
        g1Var.I = true;
        g1Var.O.f4378i = true;
        g1Var.u(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.m.ON_STOP);
        }
        this.mLifecycleRegistry.e(androidx.lifecycle.m.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new e2(defpackage.e.m("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.u(2);
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f4313s = true;
    }

    @NonNull
    public final <I, O> h.c registerForActivityResult(@NonNull i.a aVar, @NonNull h.b bVar) {
        return prepareCallInternal(aVar, new c0(this, 0), bVar);
    }

    public void registerForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@NonNull String[] permissions, int i10) {
        if (this.mHost == null) {
            throw new IllegalStateException(defpackage.e.m("Fragment ", this, " not attached to Activity"));
        }
        g1 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.E == null) {
            parentFragmentManager.f4343w.getClass();
            kotlin.jvm.internal.n.f(permissions, "permissions");
        } else {
            parentFragmentManager.F.addLast(new c1(this.mWho, i10));
            parentFragmentManager.E.a(permissions);
        }
    }

    @NonNull
    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(defpackage.e.m("Fragment ", this, " not attached to an activity."));
    }

    @NonNull
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(defpackage.e.m("Fragment ", this, " does not have any arguments."));
    }

    @NonNull
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(defpackage.e.m("Fragment ", this, " not attached to a context."));
    }

    @NonNull
    @Deprecated
    public final g1 requireFragmentManager() {
        return getParentFragmentManager();
    }

    @NonNull
    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(defpackage.e.m("Fragment ", this, " not attached to a host."));
    }

    @NonNull
    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(defpackage.e.m("Fragment ", this, " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    @NonNull
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(defpackage.e.m("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.V(bundle);
        g1 g1Var = this.mChildFragmentManager;
        g1Var.H = false;
        g1Var.I = false;
        g1Var.O.f4378i = false;
        g1Var.u(1);
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new e2(defpackage.e.m("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.m.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z10) {
        ensureAnimationInfo().f4310p = Boolean.valueOf(z10);
    }

    public void setAllowReturnTransitionOverlap(boolean z10) {
        ensureAnimationInfo().f4309o = Boolean.valueOf(z10);
    }

    public void setAnimations(int i10, int i11, int i12, int i13) {
        if (this.mAnimationInfo == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        ensureAnimationInfo().f4297b = i10;
        ensureAnimationInfo().f4298c = i11;
        ensureAnimationInfo().f4299d = i12;
        ensureAnimationInfo().f4300e = i13;
    }

    public void setArguments(@Nullable Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(@Nullable b0.r0 r0Var) {
        ensureAnimationInfo().getClass();
    }

    public void setEnterTransition(@Nullable Object obj) {
        ensureAnimationInfo().f4304i = obj;
    }

    public void setExitSharedElementCallback(@Nullable b0.r0 r0Var) {
        ensureAnimationInfo().getClass();
    }

    public void setExitTransition(@Nullable Object obj) {
        ensureAnimationInfo().f4306k = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().f4312r = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z10) {
        if (this.mHasMenu != z10) {
            this.mHasMenu = z10;
            if (!isAdded() || isHidden()) {
                return;
            }
            ((l0) this.mHost).f4380e.invalidateMenu();
        }
    }

    public void setInitialSavedState(@Nullable h0 h0Var) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (h0Var == null || (bundle = h0Var.f4352a) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z10) {
        if (this.mMenuVisible != z10) {
            this.mMenuVisible = z10;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                ((l0) this.mHost).f4380e.invalidateMenu();
            }
        }
    }

    public void setNextTransition(int i10) {
        if (this.mAnimationInfo == null && i10 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f4301f = i10;
    }

    public void setPopDirection(boolean z10) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().f4296a = z10;
    }

    public void setPostOnViewCreatedAlpha(float f10) {
        ensureAnimationInfo().f4311q = f10;
    }

    public void setReenterTransition(@Nullable Object obj) {
        ensureAnimationInfo().l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z10) {
        c1.b bVar = c1.c.f5831a;
        c1.c.b(new c1.e(this, "Attempting to set retain instance for fragment " + this));
        c1.c.a(this).getClass();
        this.mRetainInstance = z10;
        g1 g1Var = this.mFragmentManager;
        if (g1Var == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z10) {
            g1Var.O.c(this);
        } else {
            g1Var.O.g(this);
        }
    }

    public void setReturnTransition(@Nullable Object obj) {
        ensureAnimationInfo().f4305j = obj;
    }

    public void setSharedElementEnterTransition(@Nullable Object obj) {
        ensureAnimationInfo().f4307m = obj;
    }

    public void setSharedElementNames(@Nullable ArrayList<String> arrayList, @Nullable ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        e0 e0Var = this.mAnimationInfo;
        e0Var.f4302g = arrayList;
        e0Var.f4303h = arrayList2;
    }

    public void setSharedElementReturnTransition(@Nullable Object obj) {
        ensureAnimationInfo().f4308n = obj;
    }

    @Deprecated
    public void setTargetFragment(@Nullable Fragment fragment, int i10) {
        if (fragment != null) {
            c1.b bVar = c1.c.f5831a;
            c1.c.b(new c1.f(this, "Attempting to set target fragment " + fragment + " with request code " + i10 + " for fragment " + this));
            c1.c.a(this).getClass();
        }
        g1 g1Var = this.mFragmentManager;
        g1 g1Var2 = fragment != null ? fragment.mFragmentManager : null;
        if (g1Var != null && g1Var2 != null && g1Var != g1Var2) {
            throw new IllegalArgumentException(defpackage.e.m("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (Fragment targetFragment = fragment; targetFragment != null; targetFragment = targetFragment.getTargetFragment(false)) {
            if (targetFragment.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i10;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z10) {
        c1.b bVar = c1.c.f5831a;
        c1.c.b(new c1.a(this, "Attempting to set user visible hint to " + z10 + " for fragment " + this));
        c1.c.a(this).getClass();
        boolean z11 = false;
        if (!this.mUserVisibleHint && z10 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            g1 g1Var = this.mFragmentManager;
            o1 o1VarG = g1Var.g(this);
            Fragment fragment = o1VarG.f4414c;
            if (fragment.mDeferStart) {
                if (g1Var.f4323b) {
                    g1Var.K = true;
                } else {
                    fragment.mDeferStart = false;
                    o1VarG.k();
                }
            }
        }
        this.mUserVisibleHint = z10;
        if (this.mState < 5 && !z10) {
            z11 = true;
        }
        this.mDeferStart = z11;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z10);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull String str) {
        q0 q0Var = this.mHost;
        if (q0Var != null) {
            return b0.b.j(((l0) q0Var).f4380e, str);
        }
        return false;
    }

    public void startActivity(@NonNull Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i10) {
        startActivityForResult(intent, i10, null);
    }

    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intent, int i10, @Nullable Intent intent2, int i11, int i12, int i13, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost == null) {
            throw new IllegalStateException(defpackage.e.m("Fragment ", this, " not attached to Activity"));
        }
        if (g1.J(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i10 + " IntentSender: " + intent + " fillInIntent: " + intent2 + " options: " + bundle);
        }
        g1 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.D == null) {
            q0 q0Var = parentFragmentManager.f4343w;
            q0Var.getClass();
            kotlin.jvm.internal.n.f(intent, "intent");
            if (i10 != -1) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            FragmentActivity fragmentActivity = q0Var.f4442a;
            if (fragmentActivity == null) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            fragmentActivity.startIntentSenderForResult(intent, i10, intent2, i11, i12, i13, bundle);
            return;
        }
        if (bundle != null) {
            if (intent2 == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (g1.J(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + this);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        kotlin.jvm.internal.n.f(intent, "intentSender");
        h.j jVar = new h.j(intent, intent2, i11, i12);
        parentFragmentManager.F.addLast(new c1(this.mWho, i10));
        if (g1.J(2)) {
            Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
        }
        parentFragmentManager.D.a(jVar);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().f4313s) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().f4313s = false;
        } else if (Looper.myLooper() != this.mHost.f4444c.getLooper()) {
            this.mHost.f4444c.postAtFrontOfQueue(new y(this, 1));
        } else {
            callStartTransitionListener(true);
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb2.append(" tag=");
            sb2.append(this.mTag);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public Activity u() {
        return getActivity();
    }

    public void unregisterForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @Nullable
    private Fragment getTargetFragment(boolean z10) {
        String str;
        if (z10) {
            c1.b bVar = c1.c.f5831a;
            c1.c.b(new c1.f(this, "Attempting to get target fragment from fragment " + this));
            c1.c.a(this).getClass();
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        g1 g1Var = this.mFragmentManager;
        if (g1Var == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return g1Var.f4324c.b(str);
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context, @NonNull String str, @Nullable Bundle bundle) {
        try {
            Fragment fragment = (Fragment) y0.b(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return fragment;
            }
            bundle.setClassLoader(fragment.getClass().getClassLoader());
            fragment.setArguments(bundle);
            return fragment;
        } catch (IllegalAccessException e10) {
            throw new aa.b(1, defpackage.e.o("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (InstantiationException e11) {
            throw new aa.b(1, defpackage.e.o("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
        } catch (NoSuchMethodException e12) {
            throw new aa.b(1, defpackage.e.o("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e12);
        } catch (InvocationTargetException e13) {
            throw new aa.b(1, defpackage.e.o("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e13);
        }
    }

    @Nullable
    public final FragmentActivity getActivity() {
        q0 q0Var = this.mHost;
        if (q0Var == null) {
            return null;
        }
        return q0Var.f4442a;
    }

    @NonNull
    public final String getString(int i10, @Nullable Object... objArr) {
        return getResources().getString(i10, objArr);
    }

    public final void postponeEnterTransition(long j10, @NonNull TimeUnit timeUnit) {
        ensureAnimationInfo().f4313s = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        g1 g1Var = this.mFragmentManager;
        if (g1Var != null) {
            this.mPostponedHandler = g1Var.f4343w.f4444c;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j10));
    }

    @NonNull
    public final <I, O> h.c registerForActivityResult(@NonNull i.a aVar, @NonNull h.h hVar, @NonNull h.b bVar) {
        return prepareCallInternal(aVar, new c0(hVar, 2), bVar);
    }

    public void startActivity(@NonNull Intent intent, @Nullable Bundle bundle) {
        q0 q0Var = this.mHost;
        if (q0Var == null) {
            throw new IllegalStateException(defpackage.e.m("Fragment ", this, " not attached to Activity"));
        }
        kotlin.jvm.internal.n.f(intent, "intent");
        q0Var.f4443b.startActivity(intent, bundle);
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i10, @Nullable Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(defpackage.e.m("Fragment ", this, " not attached to Activity"));
        }
        g1 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.C != null) {
            parentFragmentManager.F.addLast(new c1(this.mWho, i10));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.C.a(intent);
            return;
        }
        q0 q0Var = parentFragmentManager.f4343w;
        q0Var.getClass();
        kotlin.jvm.internal.n.f(intent, "intent");
        if (i10 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        q0Var.f4443b.startActivity(intent, bundle);
    }

    @NonNull
    @Deprecated
    public LayoutInflater getLayoutInflater(@Nullable Bundle bundle) {
        q0 q0Var = this.mHost;
        if (q0Var != null) {
            FragmentActivity fragmentActivity = ((l0) q0Var).f4380e;
            LayoutInflater layoutInflaterCloneInContext = fragmentActivity.getLayoutInflater().cloneInContext(fragmentActivity);
            layoutInflaterCloneInContext.setFactory2(this.mChildFragmentManager.f4327f);
            return layoutInflaterCloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(@NonNull Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(@NonNull Activity activity, @NonNull AttributeSet attributeSet, @Nullable Bundle bundle) {
        this.mCalled = true;
    }

    private void restoreViewState() {
        if (g1.J(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    public Fragment(int i10) {
        this();
        this.mContentLayoutId = i10;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    public void onHiddenChanged(boolean z10) {
    }

    public void onMultiWindowModeChanged(boolean z10) {
    }

    @Deprecated
    public void onOptionsMenuClosed(@NonNull Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z10) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(@NonNull Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z10) {
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    @Deprecated
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
    }
}
