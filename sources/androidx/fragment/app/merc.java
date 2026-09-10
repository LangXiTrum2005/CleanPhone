package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.premeiotic;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.p001lifecycle.Lifecycle;
import androidx.p001lifecycle.splinterproof;
import com.unity3d.services.UnityAdsConstants;
import java.util.Objects;

/* JADX INFO: compiled from: FragmentStateManager.java */
/* JADX INFO: loaded from: classes.dex */
public class merc {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final preprohormone f10340attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Fragment f10341dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final polder f10343saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public boolean f10344wireman = false;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f10342marial = -1;

    /* JADX INFO: compiled from: FragmentStateManager.java */
    public static /* synthetic */ class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f10347attabal;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            f10347attabal = iArr;
            try {
                iArr[Lifecycle.State.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10347attabal[Lifecycle.State.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10347attabal[Lifecycle.State.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10347attabal[Lifecycle.State.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public merc(preprohormone preprohormoneVar, polder polderVar, Fragment fragment) {
        this.f10340attabal = preprohormoneVar;
        this.f10343saneness = polderVar;
        this.f10341dern = fragment;
    }

    public void adultoid() {
        if (FragmentManager.deadwork(3)) {
            Objects.toString(this.f10341dern);
        }
        this.f10341dern.performStart();
        this.f10340attabal.apical(this.f10341dern, false);
    }

    public Fragment apical() {
        return this.f10341dern;
    }

    public void arytenoidectomy() {
        if (FragmentManager.deadwork(3)) {
            Objects.toString(this.f10341dern);
        }
        View focusedView = this.f10341dern.getFocusedView();
        if (focusedView != null && formularize(focusedView)) {
            focusedView.requestFocus();
            if (FragmentManager.deadwork(2)) {
                focusedView.toString();
                Objects.toString(this.f10341dern);
                Objects.toString(this.f10341dern.mView.findFocus());
            }
        }
        this.f10341dern.setFocusedView(null);
        this.f10341dern.performResume();
        this.f10340attabal.taiyuan(this.f10341dern, false);
        this.f10343saneness.stratoscope(this.f10341dern.mWho, null);
        Fragment fragment = this.f10341dern;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public void attabal() {
        if (FragmentManager.deadwork(3)) {
            Objects.toString(this.f10341dern);
        }
        Bundle bundle = this.f10341dern.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        this.f10341dern.performActivityCreated(bundle2);
        this.f10340attabal.attabal(this.f10341dern, bundle2, false);
    }

    public void beachfront() {
        String resourceName;
        if (this.f10341dern.mFromLayout) {
            return;
        }
        if (FragmentManager.deadwork(3)) {
            Objects.toString(this.f10341dern);
        }
        Bundle bundle = this.f10341dern.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = this.f10341dern.performGetLayoutInflater(bundle2);
        Fragment fragment = this.f10341dern;
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fragment.mContainerId;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f10341dern + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.lightstruck().dern(this.f10341dern.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment2 = this.f10341dern;
                    if (!fragment2.mRestored && !fragment2.mInDynamicContainer) {
                        try {
                            resourceName = fragment2.getResources().getResourceName(this.f10341dern.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f10341dern.mContainerId) + " (" + resourceName + ") for fragment " + this.f10341dern);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    FragmentStrictMode.triweekly(this.f10341dern, viewGroup);
                }
            }
        }
        Fragment fragment3 = this.f10341dern;
        fragment3.mContainer = viewGroup;
        fragment3.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (this.f10341dern.mView != null) {
            if (FragmentManager.deadwork(3)) {
                Objects.toString(this.f10341dern);
            }
            this.f10341dern.mView.setSaveFromParentEnabled(false);
            Fragment fragment4 = this.f10341dern;
            fragment4.mView.setTag(prefect.saneness.fragment_container_view_tag, fragment4);
            if (viewGroup != null) {
                saneness();
            }
            Fragment fragment5 = this.f10341dern;
            if (fragment5.mHidden) {
                fragment5.mView.setVisibility(8);
            }
            if (this.f10341dern.mView.isAttachedToWindow()) {
                premeiotic.lerp(this.f10341dern.mView);
            } else {
                View view = this.f10341dern.mView;
                view.addOnAttachStateChangeListener(new attabal(view));
            }
            this.f10341dern.performViewCreated();
            preprohormone preprohormoneVar = this.f10340attabal;
            Fragment fragment6 = this.f10341dern;
            preprohormoneVar.impassible(fragment6, fragment6.mView, bundle2, false);
            int visibility = this.f10341dern.mView.getVisibility();
            this.f10341dern.setPostOnViewCreatedAlpha(this.f10341dern.mView.getAlpha());
            Fragment fragment7 = this.f10341dern;
            if (fragment7.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment7.mView.findFocus();
                if (viewFindFocus != null) {
                    this.f10341dern.setFocusedView(viewFindFocus);
                    if (FragmentManager.deadwork(2)) {
                        viewFindFocus.toString();
                        Objects.toString(this.f10341dern);
                    }
                }
                this.f10341dern.mView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
        this.f10341dern.mState = 2;
    }

    public void competently() {
        Fragment fragmentBeachfront;
        if (FragmentManager.deadwork(3)) {
            Objects.toString(this.f10341dern);
        }
        Fragment fragment = this.f10341dern;
        boolean zIsChangingConfigurations = true;
        boolean z = fragment.mRemoving && !fragment.isInBackStack();
        if (z) {
            Fragment fragment2 = this.f10341dern;
            if (!fragment2.mBeingSaved) {
                this.f10343saneness.stratoscope(fragment2.mWho, null);
            }
        }
        if (!z && !this.f10343saneness.arytenoidectomy().monoploid(this.f10341dern)) {
            String str = this.f10341dern.mTargetWho;
            if (str != null && (fragmentBeachfront = this.f10343saneness.beachfront(str)) != null && fragmentBeachfront.mRetainInstance) {
                this.f10341dern.mTarget = fragmentBeachfront;
            }
            this.f10341dern.mState = 0;
            return;
        }
        adultoid<?> adultoidVar = this.f10341dern.mHost;
        if (adultoidVar instanceof splinterproof) {
            zIsChangingConfigurations = this.f10343saneness.arytenoidectomy().triweekly();
        } else if (adultoidVar.getContext() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) adultoidVar.getContext()).isChangingConfigurations();
        }
        if ((z && !this.f10341dern.mBeingSaved) || zIsChangingConfigurations) {
            this.f10343saneness.arytenoidectomy().beachfront(this.f10341dern, false);
        }
        this.f10341dern.performDestroy();
        this.f10340attabal.wireman(this.f10341dern, false);
        for (merc mercVar : this.f10343saneness.apical()) {
            if (mercVar != null) {
                Fragment fragmentApical = mercVar.apical();
                if (this.f10341dern.mWho.equals(fragmentApical.mTargetWho)) {
                    fragmentApical.mTarget = this.f10341dern;
                    fragmentApical.mTargetWho = null;
                }
            }
        }
        Fragment fragment3 = this.f10341dern;
        String str2 = fragment3.mTargetWho;
        if (str2 != null) {
            fragment3.mTarget = this.f10343saneness.beachfront(str2);
        }
        this.f10343saneness.molybdenite(this);
    }

    public void cutely() {
        Fragment fragment = this.f10341dern;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.deadwork(3)) {
                Objects.toString(this.f10341dern);
            }
            Bundle bundle = this.f10341dern.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            Fragment fragment2 = this.f10341dern;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(bundle2), null, bundle2);
            View view = this.f10341dern.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f10341dern;
                fragment3.mView.setTag(prefect.saneness.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f10341dern;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f10341dern.performViewCreated();
                preprohormone preprohormoneVar = this.f10340attabal;
                Fragment fragment5 = this.f10341dern;
                preprohormoneVar.impassible(fragment5, fragment5.mView, bundle2, false);
                this.f10341dern.mState = 2;
            }
        }
    }

    public void dern() {
        if (FragmentManager.deadwork(3)) {
            Objects.toString(this.f10341dern);
        }
        Fragment fragment = this.f10341dern;
        Fragment fragment2 = fragment.mTarget;
        merc mercVarTriweekly = null;
        if (fragment2 != null) {
            merc mercVarTriweekly2 = this.f10343saneness.triweekly(fragment2.mWho);
            if (mercVarTriweekly2 == null) {
                throw new IllegalStateException("Fragment " + this.f10341dern + " declared target fragment " + this.f10341dern.mTarget + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f10341dern;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            mercVarTriweekly = mercVarTriweekly2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (mercVarTriweekly = this.f10343saneness.triweekly(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f10341dern + " declared target fragment " + this.f10341dern.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (mercVarTriweekly != null) {
            mercVarTriweekly.impassible();
        }
        Fragment fragment4 = this.f10341dern;
        fragment4.mHost = fragment4.mFragmentManager.claque();
        Fragment fragment5 = this.f10341dern;
        fragment5.mParentFragment = fragment5.mFragmentManager.technofreak();
        this.f10340attabal.competently(this.f10341dern, false);
        this.f10341dern.performAttach();
        this.f10340attabal.saneness(this.f10341dern, false);
    }

    public void dovishness() {
        if (FragmentManager.deadwork(3)) {
            Objects.toString(this.f10341dern);
        }
        this.f10341dern.performStop();
        this.f10340attabal.formularize(this.f10341dern, false);
    }

    public final boolean formularize(View view) {
        if (view == this.f10341dern.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f10341dern.mView) {
                return true;
            }
        }
        return false;
    }

    public void graveside(int i) {
        this.f10342marial = i;
    }

    public void impassible() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f10344wireman) {
            if (FragmentManager.deadwork(2)) {
                Objects.toString(apical());
                return;
            }
            return;
        }
        try {
            this.f10344wireman = true;
            boolean z = false;
            while (true) {
                int iWireman = wireman();
                Fragment fragment = this.f10341dern;
                int i = fragment.mState;
                if (iWireman == i) {
                    if (!z && i == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f10341dern.mBeingSaved) {
                        if (FragmentManager.deadwork(3)) {
                            Objects.toString(this.f10341dern);
                        }
                        this.f10343saneness.arytenoidectomy().beachfront(this.f10341dern, true);
                        this.f10343saneness.molybdenite(this);
                        if (FragmentManager.deadwork(3)) {
                            Objects.toString(this.f10341dern);
                        }
                        this.f10341dern.initState();
                    }
                    Fragment fragment2 = this.f10341dern;
                    if (fragment2.mHiddenChanged) {
                        if (fragment2.mView != null && (viewGroup = fragment2.mContainer) != null) {
                            SpecialEffectsController specialEffectsControllerAdultoid = SpecialEffectsController.adultoid(viewGroup, fragment2.getParentFragmentManager());
                            if (this.f10341dern.mHidden) {
                                specialEffectsControllerAdultoid.apical(this);
                            } else {
                                specialEffectsControllerAdultoid.impassible(this);
                            }
                        }
                        Fragment fragment3 = this.f10341dern;
                        FragmentManager fragmentManager = fragment3.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.lampshade(fragment3);
                        }
                        Fragment fragment4 = this.f10341dern;
                        fragment4.mHiddenChanged = false;
                        fragment4.onHiddenChanged(fragment4.mHidden);
                        this.f10341dern.mChildFragmentManager.saran();
                    }
                    return;
                }
                if (iWireman <= i) {
                    switch (i - 1) {
                        case -1:
                            taiyuan();
                            break;
                        case 0:
                            if (fragment.mBeingSaved && this.f10343saneness.monoploid(fragment.mWho) == null) {
                                this.f10343saneness.stratoscope(this.f10341dern.mWho, polloi());
                            }
                            competently();
                            break;
                        case 1:
                            impromptu();
                            this.f10341dern.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.deadwork(3)) {
                                Objects.toString(this.f10341dern);
                            }
                            Fragment fragment5 = this.f10341dern;
                            if (fragment5.mBeingSaved) {
                                this.f10343saneness.stratoscope(fragment5.mWho, polloi());
                            } else if (fragment5.mView != null && fragment5.mSavedViewState == null) {
                                molybdenite();
                            }
                            Fragment fragment6 = this.f10341dern;
                            if (fragment6.mView != null && (viewGroup2 = fragment6.mContainer) != null) {
                                SpecialEffectsController.adultoid(viewGroup2, fragment6.getParentFragmentManager()).formularize(this);
                            }
                            this.f10341dern.mState = 3;
                            break;
                        case 4:
                            dovishness();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            triweekly();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            dern();
                            break;
                        case 1:
                            marial();
                            break;
                        case 2:
                            cutely();
                            beachfront();
                            break;
                        case 3:
                            attabal();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                SpecialEffectsController.adultoid(viewGroup3, fragment.getParentFragmentManager()).cutely(SpecialEffectsController.Operation.State.from(this.f10341dern.mView.getVisibility()), this);
                            }
                            this.f10341dern.mState = 4;
                            break;
                        case 5:
                            adultoid();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            arytenoidectomy();
                            break;
                    }
                }
                z = true;
            }
        } finally {
            this.f10344wireman = false;
        }
    }

    public void impromptu() {
        View view;
        if (FragmentManager.deadwork(3)) {
            Objects.toString(this.f10341dern);
        }
        Fragment fragment = this.f10341dern;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f10341dern.performDestroyView();
        this.f10340attabal.triweekly(this.f10341dern, false);
        Fragment fragment2 = this.f10341dern;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.impassible(null);
        this.f10341dern.mInLayout = false;
    }

    public void kowloon(ClassLoader classLoader) {
        Bundle bundle = this.f10341dern.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.f10341dern.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            this.f10341dern.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            Fragment fragment = this.f10341dern;
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
            Fragment fragment2 = this.f10341dern;
            fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("viewRegistryState");
            FragmentState fragmentState = (FragmentState) this.f10341dern.mSavedFragmentState.getParcelable("state");
            if (fragmentState != null) {
                Fragment fragment3 = this.f10341dern;
                fragment3.mTargetWho = fragmentState.f10230cuirassed;
                fragment3.mTargetRequestCode = fragmentState.f10240stratoscope;
                Boolean bool = fragment3.mSavedUserVisibleHint;
                if (bool != null) {
                    fragment3.mUserVisibleHint = bool.booleanValue();
                    this.f10341dern.mSavedUserVisibleHint = null;
                } else {
                    fragment3.mUserVisibleHint = fragmentState.f10241trm;
                }
            }
            Fragment fragment4 = this.f10341dern;
            if (fragment4.mUserVisibleHint) {
                return;
            }
            fragment4.mDeferStart = true;
        } catch (BadParcelableException e) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + apical(), e);
        }
    }

    public void marial() {
        if (FragmentManager.deadwork(3)) {
            Objects.toString(this.f10341dern);
        }
        Bundle bundle = this.f10341dern.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        Fragment fragment = this.f10341dern;
        if (fragment.mIsCreated) {
            fragment.mState = 1;
            fragment.restoreChildFragmentState();
        } else {
            this.f10340attabal.impromptu(fragment, bundle2, false);
            this.f10341dern.performCreate(bundle2);
            this.f10340attabal.dern(this.f10341dern, bundle2, false);
        }
    }

    public void molybdenite() {
        if (this.f10341dern.mView == null) {
            return;
        }
        if (FragmentManager.deadwork(2)) {
            Objects.toString(this.f10341dern);
            Objects.toString(this.f10341dern.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f10341dern.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f10341dern.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f10341dern.mViewLifecycleOwner.marial(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f10341dern.mSavedViewRegistryState = bundle;
    }

    public Fragment.SavedState monoploid() {
        if (this.f10341dern.mState > -1) {
            return new Fragment.SavedState(polloi());
        }
        return null;
    }

    public Bundle polloi() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.f10341dern;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new FragmentState(this.f10341dern));
        if (this.f10341dern.mState > 0) {
            Bundle bundle3 = new Bundle();
            this.f10341dern.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f10340attabal.cutely(this.f10341dern, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f10341dern.mSavedStateRegistryController.marial(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleRajahship = this.f10341dern.mChildFragmentManager.rajahship();
            if (!bundleRajahship.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleRajahship);
            }
            if (this.f10341dern.mView != null) {
                molybdenite();
            }
            SparseArray<Parcelable> sparseArray = this.f10341dern.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f10341dern.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f10341dern.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public void saneness() {
        Fragment fragmentPreterite = FragmentManager.preterite(this.f10341dern.mContainer);
        Fragment parentFragment = this.f10341dern.getParentFragment();
        if (fragmentPreterite != null && !fragmentPreterite.equals(parentFragment)) {
            Fragment fragment = this.f10341dern;
            FragmentStrictMode.kowloon(fragment, fragmentPreterite, fragment.mContainerId);
        }
        int iCutely = this.f10343saneness.cutely(this.f10341dern);
        Fragment fragment2 = this.f10341dern;
        fragment2.mContainer.addView(fragment2.mView, iCutely);
    }

    public void taiyuan() {
        if (FragmentManager.deadwork(3)) {
            Objects.toString(this.f10341dern);
        }
        this.f10341dern.performDetach();
        this.f10340attabal.marial(this.f10341dern, false);
        Fragment fragment = this.f10341dern;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if ((!fragment.mRemoving || fragment.isInBackStack()) && !this.f10343saneness.arytenoidectomy().monoploid(this.f10341dern)) {
            return;
        }
        if (FragmentManager.deadwork(3)) {
            Objects.toString(this.f10341dern);
        }
        this.f10341dern.initState();
    }

    public void triweekly() {
        if (FragmentManager.deadwork(3)) {
            Objects.toString(this.f10341dern);
        }
        this.f10341dern.performPause();
        this.f10340attabal.beachfront(this.f10341dern, false);
    }

    public int wireman() {
        Fragment fragment = this.f10341dern;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.f10342marial;
        int i = saneness.f10347attabal[fragment.mMaxState.ordinal()];
        if (i != 1) {
            if (i == 2) {
                iMin = Math.min(iMin, 5);
            } else if (i != 3) {
                iMin = i != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0);
            } else {
                iMin = Math.min(iMin, 1);
            }
        }
        Fragment fragment2 = this.f10341dern;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                iMin = Math.max(this.f10342marial, 2);
                View view = this.f10341dern.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f10342marial < 4 ? Math.min(iMin, fragment2.mState) : Math.min(iMin, 1);
            }
        }
        Fragment fragment3 = this.f10341dern;
        if (fragment3.mInDynamicContainer && fragment3.mContainer == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!this.f10341dern.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        Fragment fragment4 = this.f10341dern;
        ViewGroup viewGroup = fragment4.mContainer;
        SpecialEffectsController.Operation.LifecycleImpact lifecycleImpactMolybdenite = viewGroup != null ? SpecialEffectsController.adultoid(viewGroup, fragment4.getParentFragmentManager()).molybdenite(this) : null;
        if (lifecycleImpactMolybdenite == SpecialEffectsController.Operation.LifecycleImpact.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (lifecycleImpactMolybdenite == SpecialEffectsController.Operation.LifecycleImpact.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment5 = this.f10341dern;
            if (fragment5.mRemoving) {
                iMin = fragment5.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment6 = this.f10341dern;
        if (fragment6.mDeferStart && fragment6.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (this.f10341dern.mTransitioning) {
            iMin = Math.max(iMin, 3);
        }
        if (FragmentManager.deadwork(2)) {
            Objects.toString(this.f10341dern);
        }
        return iMin;
    }

    public merc(preprohormone preprohormoneVar, polder polderVar, ClassLoader classLoader, graveside gravesideVar, Bundle bundle) {
        this.f10340attabal = preprohormoneVar;
        this.f10343saneness = polderVar;
        Fragment fragmentAttabal = ((FragmentState) bundle.getParcelable("state")).attabal(gravesideVar, classLoader);
        this.f10341dern = fragmentAttabal;
        fragmentAttabal.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentAttabal.setArguments(bundle2);
        if (FragmentManager.deadwork(2)) {
            Objects.toString(fragmentAttabal);
        }
    }

    public merc(preprohormone preprohormoneVar, polder polderVar, Fragment fragment, Bundle bundle) {
        this.f10340attabal = preprohormoneVar;
        this.f10343saneness = polderVar;
        this.f10341dern = fragment;
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

    /* JADX INFO: compiled from: FragmentStateManager.java */
    public class attabal implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ View f10346kowloon;

        public attabal(View view) {
            this.f10346kowloon = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f10346kowloon.removeOnAttachStateChangeListener(this);
            premeiotic.lerp(this.f10346kowloon);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
