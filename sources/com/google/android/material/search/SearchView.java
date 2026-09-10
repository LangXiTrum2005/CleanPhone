package com.google.android.material.search;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.BackEventCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.android.material.shape.MaterialShapeUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.AttachedBehavior, MaterialBackHandler {
    public SearchBar e0;
    public int f0;
    public TransitionState g0;

    /* JADX INFO: renamed from: com.google.android.material.search.SearchView$1, reason: invalid class name */
    class AnonymousClass1 implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            throw null;
        }
    }

    public static class Behavior extends CoordinatorLayout.Behavior<SearchView> {
        public Behavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean j(CoordinatorLayout coordinatorLayout, View view, View view2) {
            SearchView searchView = (SearchView) view;
            if (searchView.e0 != null || !(view2 instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view2);
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public String Z;
        public final int e0;

        /* JADX INFO: renamed from: com.google.android.material.search.SearchView$SavedState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.Z = parcel.readString();
            this.e0 = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.Z);
            parcel.writeInt(this.e0);
        }
    }

    public interface TransitionListener {
        void a();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TransitionState {
        public static final TransitionState X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final TransitionState f19403Y;
        public static final TransitionState Z;
        public static final /* synthetic */ TransitionState[] e0;

        static {
            TransitionState transitionState = new TransitionState("HIDING", 0);
            X = transitionState;
            TransitionState transitionState2 = new TransitionState("HIDDEN", 1);
            f19403Y = transitionState2;
            TransitionState transitionState3 = new TransitionState("SHOWING", 2);
            TransitionState transitionState4 = new TransitionState("SHOWN", 3);
            Z = transitionState4;
            e0 = new TransitionState[]{transitionState, transitionState2, transitionState3, transitionState4};
        }

        public static TransitionState valueOf(String str) {
            return (TransitionState) Enum.valueOf(TransitionState.class, str);
        }

        public static TransitionState[] values() {
            return (TransitionState[]) e0.clone();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    private Window getActivityWindow() {
        Activity activity;
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                activity = (Activity) context;
                if (activity == null) {
                    return null;
                }
                return activity.getWindow();
            }
        }
        activity = null;
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.e0;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(R.dimen.m3_searchview_elevation);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z2) {
        throw null;
    }

    private void setUpBackgroundViewElevationOverlay(float f) {
    }

    private void setUpHeaderLayout(int i2) {
        if (i2 == -1) {
            return;
        }
        LayoutInflater.from(getContext()).inflate(i2, (ViewGroup) null, false);
        throw null;
    }

    private void setUpStatusBarSpacer(int i2) {
        throw null;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void b() {
        if (!g() && this.e0 != null && Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void d(BackEventCompat backEventCompat) {
        if (!g() && this.e0 != null) {
            throw null;
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void e(BackEventCompat backEventCompat) {
        if (!g() && this.e0 != null && Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void f() {
        if (!g()) {
            throw null;
        }
    }

    public final boolean g() {
        return this.g0.equals(TransitionState.f19403Y) || this.g0.equals(TransitionState.X);
    }

    public MaterialMainContainerBackHelper getBackHelper() {
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    public CoordinatorLayout.Behavior<SearchView> getBehavior() {
        return new Behavior();
    }

    public TransitionState getCurrentTransitionState() {
        return this.g0;
    }

    public int getDefaultNavigationIconResource() {
        return R.drawable.ic_arrow_back_black_24;
    }

    public EditText getEditText() {
        return null;
    }

    public CharSequence getHint() {
        throw null;
    }

    public TextView getSearchPrefix() {
        return null;
    }

    public CharSequence getSearchPrefixText() {
        throw null;
    }

    public int getSoftInputMode() {
        return this.f0;
    }

    public Editable getText() {
        throw null;
    }

    public Toolbar getToolbar() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.d(this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f0 = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.X);
        setText(savedState.Z);
        setVisible(savedState.e0 == 0);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable text = getText();
        savedState.Z = text == null ? null : text.toString();
        throw null;
    }

    public void setAnimatedNavigationIcon(boolean z2) {
    }

    public void setAutoShowKeyboard(boolean z2) {
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        setUpBackgroundViewElevationOverlay(f);
    }

    public void setHint(CharSequence charSequence) {
        throw null;
    }

    public void setMenuItemsAnimated(boolean z2) {
    }

    public void setModalForAccessibility(boolean z2) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z2) {
            new HashMap(viewGroup.getChildCount());
        }
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            if (viewGroup.getChildAt(i2) != this) {
                throw null;
            }
        }
    }

    public void setOnMenuItemClickListener(Toolbar.OnMenuItemClickListener onMenuItemClickListener) {
        throw null;
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        throw null;
    }

    public void setStatusBarSpacerEnabled(boolean z2) {
        setStatusBarSpacerEnabledInternal(z2);
    }

    public void setText(CharSequence charSequence) {
        throw null;
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z2) {
        throw null;
    }

    public void setTransitionState(TransitionState transitionState) {
        if (this.g0.equals(transitionState)) {
            return;
        }
        if (transitionState == TransitionState.Z) {
            setModalForAccessibility(true);
        } else if (transitionState == TransitionState.f19403Y) {
            setModalForAccessibility(false);
        }
        this.g0 = transitionState;
        Iterator it = new LinkedHashSet((Collection) null).iterator();
        while (it.hasNext()) {
            ((TransitionListener) it.next()).a();
        }
    }

    public void setUseWindowInsetsController(boolean z2) {
    }

    public void setVisible(boolean z2) {
        throw null;
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.e0 = searchBar;
        throw null;
    }

    public void setHint(int i2) {
        throw null;
    }

    public void setText(int i2) {
        throw null;
    }
}
