package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.core.view.ViewCompat;
import androidx.cursoradapter.widget.CursorAdapter;
import androidx.customview.view.AbsSavedState;
import com.charging.screenshow.battery.animations.themes.R;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements CollapsibleActionView {
    public static final PreQAutoCompleteTextViewReflector m1;
    public final ImageView A0;
    public final View B0;
    public UpdatableTouchDelegate C0;
    public final Rect D0;
    public final Rect E0;
    public final int[] F0;
    public final int[] G0;
    public final ImageView H0;
    public final Drawable I0;
    public final int J0;
    public final int K0;
    public final Intent L0;
    public final Intent M0;
    public final CharSequence N0;
    public OnQueryTextListener O0;
    public OnCloseListener P0;
    public View.OnFocusChangeListener Q0;
    public OnSuggestionListener R0;
    public View.OnClickListener S0;
    public boolean T0;
    public boolean U0;
    public CursorAdapter V0;
    public boolean W0;
    public CharSequence X0;
    public boolean Y0;
    public boolean Z0;
    public int a1;
    public boolean b1;
    public String c1;
    public CharSequence d1;
    public boolean e1;
    public int f1;
    public SearchableInfo g1;
    public Bundle h1;
    public final Runnable i1;
    public final Runnable j1;
    public final WeakHashMap k1;
    public final View.OnClickListener l1;
    public final SearchAutoComplete t0;
    public final View u0;
    public final View v0;
    public final View w0;
    public final ImageView x0;
    public final ImageView y0;
    public final ImageView z0;

    public static class Api29Impl {
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i2) {
            searchAutoComplete.setInputMethodMode(i2);
        }
    }

    public interface OnCloseListener {
        boolean onClose();
    }

    public interface OnQueryTextListener {
        boolean a();

        boolean b();
    }

    public interface OnSuggestionListener {
        boolean a();

        boolean b();
    }

    public static class PreQAutoCompleteTextViewReflector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Method f3625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Method f3626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Method f3627c;

        public static void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public boolean Z;

        /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$SavedState$1, reason: invalid class name */
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
            this.Z = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SearchView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" isIconified=");
            return android.support.v4.media.a.t(sb, this.Z, "}");
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeValue(Boolean.valueOf(this.Z));
        }
    }

    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {
        public int i0;
        public SearchView j0;
        public boolean k0;
        public final Runnable l0;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.l0 = new Runnable() { // from class: androidx.appcompat.widget.SearchView.SearchAutoComplete.1
                @Override // java.lang.Runnable
                public final void run() {
                    SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                    if (searchAutoComplete.k0) {
                        ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                        searchAutoComplete.k0 = false;
                    }
                }
            };
            this.i0 = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i2 >= 600) {
                return PsExtractor.AUDIO_STREAM;
            }
            if (i2 < 640 || i3 < 480) {
                return 160;
            }
            return PsExtractor.AUDIO_STREAM;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                Api29Impl.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            PreQAutoCompleteTextViewReflector preQAutoCompleteTextViewReflector = SearchView.m1;
            preQAutoCompleteTextViewReflector.getClass();
            PreQAutoCompleteTextViewReflector.a();
            Method method = preQAutoCompleteTextViewReflector.f3627c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.i0 <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.k0) {
                Runnable runnable = this.l0;
                removeCallbacks(runnable);
                post(runnable);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z2, int i2, Rect rect) {
            super.onFocusChanged(z2, i2, rect);
            SearchView searchView = this.j0;
            searchView.y(searchView.U0);
            searchView.post(searchView.i1);
            if (searchView.t0.hasFocus()) {
                searchView.n();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.j0.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z2) {
            super.onWindowFocusChanged(z2);
            if (z2 && this.j0.hasFocus() && getVisibility() == 0) {
                this.k0 = true;
                Context context = getContext();
                PreQAutoCompleteTextViewReflector preQAutoCompleteTextViewReflector = SearchView.m1;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z2) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            Runnable runnable = this.l0;
            if (!z2) {
                this.k0 = false;
                removeCallbacks(runnable);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.k0 = true;
                    return;
                }
                this.k0 = false;
                removeCallbacks(runnable);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.j0 = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.i0 = i2;
        }
    }

    public static class UpdatableTouchDelegate extends TouchDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f3628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f3629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Rect f3630c;
        public final Rect d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f3631e;
        public boolean f;

        public UpdatableTouchDelegate(Rect rect, Rect rect2, View view) {
            super(rect, view);
            int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f3631e = scaledTouchSlop;
            Rect rect3 = new Rect();
            this.f3629b = rect3;
            Rect rect4 = new Rect();
            this.d = rect4;
            Rect rect5 = new Rect();
            this.f3630c = rect5;
            rect3.set(rect);
            rect4.set(rect);
            int i2 = -scaledTouchSlop;
            rect4.inset(i2, i2);
            rect5.set(rect2);
            this.f3628a = view;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003e  */
        @Override // android.view.TouchDelegate
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z2;
            boolean z3;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z4 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z3 = this.f;
                    if (z3 && !this.d.contains(x, y)) {
                        z4 = z3;
                        z2 = false;
                    }
                } else if (action != 3) {
                    z2 = true;
                    z4 = false;
                } else {
                    z3 = this.f;
                    this.f = false;
                }
                z4 = z3;
                z2 = true;
            } else if (this.f3629b.contains(x, y)) {
                this.f = true;
                z2 = true;
            } else {
                z2 = true;
                z4 = false;
            }
            if (!z4) {
                return false;
            }
            Rect rect = this.f3630c;
            View view = this.f3628a;
            if (!z2 || rect.contains(x, y)) {
                motionEvent.setLocation(x - rect.left, y - rect.top);
            } else {
                motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
            }
            return view.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        PreQAutoCompleteTextViewReflector preQAutoCompleteTextViewReflector = null;
        if (Build.VERSION.SDK_INT < 29) {
            PreQAutoCompleteTextViewReflector preQAutoCompleteTextViewReflector2 = new PreQAutoCompleteTextViewReflector();
            preQAutoCompleteTextViewReflector2.f3625a = null;
            preQAutoCompleteTextViewReflector2.f3626b = null;
            preQAutoCompleteTextViewReflector2.f3627c = null;
            PreQAutoCompleteTextViewReflector.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                preQAutoCompleteTextViewReflector2.f3625a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                preQAutoCompleteTextViewReflector2.f3626b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                preQAutoCompleteTextViewReflector2.f3627c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            preQAutoCompleteTextViewReflector = preQAutoCompleteTextViewReflector2;
        }
        m1 = preQAutoCompleteTextViewReflector;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.t0;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // androidx.appcompat.view.CollapsibleActionView
    public final void b() {
        if (this.e1) {
            return;
        }
        this.e1 = true;
        SearchAutoComplete searchAutoComplete = this.t0;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f1 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.Z0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.t0;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.Z0 = false;
    }

    @Override // androidx.appcompat.view.CollapsibleActionView
    public final void e() {
        SearchAutoComplete searchAutoComplete = this.t0;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.d1 = "";
        clearFocus();
        y(true);
        searchAutoComplete.setImeOptions(this.f1);
        this.e1 = false;
    }

    public int getImeOptions() {
        return this.t0.getImeOptions();
    }

    public int getInputType() {
        return this.t0.getInputType();
    }

    public int getMaxWidth() {
        return this.a1;
    }

    public CharSequence getQuery() {
        return this.t0.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.X0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.g1;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.N0 : getContext().getText(this.g1.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.K0;
    }

    public int getSuggestionRowLayout() {
        return this.J0;
    }

    public CursorAdapter getSuggestionsAdapter() {
        return this.V0;
    }

    public final Intent l(Uri uri, String str, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.d1);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.h1;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.g1.getSearchActivity());
        return intent;
    }

    public final Intent m(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.h1;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void n() {
        int i2 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.t0;
        if (i2 >= 29) {
            Api29Impl.a(searchAutoComplete);
            return;
        }
        PreQAutoCompleteTextViewReflector preQAutoCompleteTextViewReflector = m1;
        preQAutoCompleteTextViewReflector.getClass();
        PreQAutoCompleteTextViewReflector.a();
        Method method = preQAutoCompleteTextViewReflector.f3625a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        preQAutoCompleteTextViewReflector.getClass();
        PreQAutoCompleteTextViewReflector.a();
        Method method2 = preQAutoCompleteTextViewReflector.f3626b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.t0;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.T0) {
            OnCloseListener onCloseListener = this.P0;
            if (onCloseListener == null || !onCloseListener.onClose()) {
                clearFocus();
                y(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.i1);
        post(this.j1);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            int[] iArr = this.F0;
            SearchAutoComplete searchAutoComplete = this.t0;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.G0;
            getLocationInWindow(iArr2);
            int i6 = iArr[1] - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i7;
            int height = searchAutoComplete.getHeight() + i6;
            Rect rect = this.D0;
            rect.set(i7, i6, width, height);
            int i8 = rect.left;
            int i9 = rect.right;
            int i10 = i5 - i3;
            Rect rect2 = this.E0;
            rect2.set(i8, 0, i9, i10);
            UpdatableTouchDelegate updatableTouchDelegate = this.C0;
            if (updatableTouchDelegate == null) {
                UpdatableTouchDelegate updatableTouchDelegate2 = new UpdatableTouchDelegate(rect2, rect, searchAutoComplete);
                this.C0 = updatableTouchDelegate2;
                setTouchDelegate(updatableTouchDelegate2);
            } else {
                updatableTouchDelegate.f3629b.set(rect2);
                Rect rect3 = updatableTouchDelegate.d;
                rect3.set(rect2);
                int i11 = -updatableTouchDelegate.f3631e;
                rect3.inset(i11, i11);
                updatableTouchDelegate.f3630c.set(rect);
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.U0) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i5 = this.a1;
            size = i5 > 0 ? Math.min(i5, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.a1;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i4 = this.a1) > 0) {
            size = Math.min(i4, size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.X);
        y(savedState.Z);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.Z = this.U0;
        return savedState;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        post(this.i1);
    }

    public final boolean p(int i2) {
        int position;
        String strK;
        OnSuggestionListener onSuggestionListener = this.R0;
        if (onSuggestionListener != null && onSuggestionListener.b()) {
            return false;
        }
        Cursor cursor = this.V0.Z;
        if (cursor != null && cursor.moveToPosition(i2)) {
            Intent intentL = null;
            try {
                int i3 = SuggestionsAdapter.z0;
                String strK2 = SuggestionsAdapter.k(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strK2 == null) {
                    strK2 = this.g1.getSuggestIntentAction();
                }
                if (strK2 == null) {
                    strK2 = "android.intent.action.SEARCH";
                }
                String strK3 = SuggestionsAdapter.k(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strK3 == null) {
                    strK3 = this.g1.getSuggestIntentData();
                }
                if (strK3 != null && (strK = SuggestionsAdapter.k(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strK3 = strK3 + "/" + Uri.encode(strK);
                }
                intentL = l(strK3 == null ? null : Uri.parse(strK3), strK2, SuggestionsAdapter.k(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), SuggestionsAdapter.k(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e2) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e2);
            }
            if (intentL != null) {
                try {
                    getContext().startActivity(intentL);
                } catch (RuntimeException e3) {
                    Log.e("SearchView", "Failed launch activity: " + intentL, e3);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.t0;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
        return true;
    }

    public final void q(int i2) {
        OnSuggestionListener onSuggestionListener = this.R0;
        if (onSuggestionListener == null || !onSuggestionListener.a()) {
            Editable text = this.t0.getText();
            Cursor cursor = this.V0.Z;
            if (cursor == null) {
                return;
            }
            if (!cursor.moveToPosition(i2)) {
                setQuery(text);
                return;
            }
            String strB = this.V0.b(cursor);
            if (strB != null) {
                setQuery(strB);
            } else {
                setQuery(text);
            }
        }
    }

    public final void r(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i2, Rect rect) {
        if (this.Z0 || !isFocusable()) {
            return false;
        }
        if (this.U0) {
            return super.requestFocus(i2, rect);
        }
        boolean zRequestFocus = this.t0.requestFocus(i2, rect);
        if (zRequestFocus) {
            y(false);
        }
        return zRequestFocus;
    }

    public final void s() {
        SearchAutoComplete searchAutoComplete = this.t0;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        OnQueryTextListener onQueryTextListener = this.O0;
        if (onQueryTextListener != null) {
            text.toString();
            if (onQueryTextListener.a()) {
                return;
            }
        }
        if (this.g1 != null) {
            getContext().startActivity(l(null, "android.intent.action.SEARCH", null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public void setAppSearchData(Bundle bundle) {
        this.h1 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            o();
            return;
        }
        y(false);
        SearchAutoComplete searchAutoComplete = this.t0;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.S0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.T0 == z2) {
            return;
        }
        this.T0 = z2;
        y(z2);
        v();
    }

    public void setImeOptions(int i2) {
        this.t0.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.t0.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.a1 = i2;
        requestLayout();
    }

    public void setOnCloseListener(OnCloseListener onCloseListener) {
        this.P0 = onCloseListener;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.Q0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(OnQueryTextListener onQueryTextListener) {
        this.O0 = onQueryTextListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.S0 = onClickListener;
    }

    public void setOnSuggestionListener(OnSuggestionListener onSuggestionListener) {
        this.R0 = onSuggestionListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.X0 = charSequence;
        v();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.Y0 = z2;
        CursorAdapter cursorAdapter = this.V0;
        if (cursorAdapter instanceof SuggestionsAdapter) {
            ((SuggestionsAdapter) cursorAdapter).r0 = z2 ? 2 : 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        boolean z2;
        this.g1 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.t0;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.g1.getImeOptions());
            int inputType = this.g1.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.g1.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            CursorAdapter cursorAdapter = this.V0;
            if (cursorAdapter != null) {
                cursorAdapter.a(null);
            }
            if (this.g1.getSuggestAuthority() != null) {
                SuggestionsAdapter suggestionsAdapter = new SuggestionsAdapter(getContext(), this, this.g1, this.k1);
                this.V0 = suggestionsAdapter;
                searchAutoComplete.setAdapter(suggestionsAdapter);
                ((SuggestionsAdapter) this.V0).r0 = this.Y0 ? 2 : 1;
            }
            v();
        }
        SearchableInfo searchableInfo2 = this.g1;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.g1.getVoiceSearchLaunchWebSearch()) {
                intent = this.L0;
            } else if (this.g1.getVoiceSearchLaunchRecognizer()) {
                intent = this.M0;
            }
            z2 = (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
        }
        this.b1 = z2;
        if (z2) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        y(this.U0);
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.W0 = z2;
        y(this.U0);
    }

    public void setSuggestionsAdapter(CursorAdapter cursorAdapter) {
        this.V0 = cursorAdapter;
        this.t0.setAdapter(cursorAdapter);
    }

    public final void t() {
        boolean zIsEmpty = TextUtils.isEmpty(this.t0.getText());
        int i2 = (!zIsEmpty || (this.T0 && !this.e1)) ? 0 : 8;
        ImageView imageView = this.z0;
        imageView.setVisibility(i2);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void u() {
        int[] iArr = this.t0.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.v0.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.w0.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void v() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        boolean z2 = this.T0;
        SearchAutoComplete searchAutoComplete = this.t0;
        CharSequence charSequence2 = charSequence;
        if (z2 && (drawable = this.I0) != null) {
            charSequence2 = charSequence;
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence2 = spannableStringBuilder;
        }
        charSequence2 = charSequence;
        searchAutoComplete.setHint(charSequence2);
    }

    public final void w() {
        this.w0.setVisibility(((this.W0 || this.b1) && !this.U0 && (this.y0.getVisibility() == 0 || this.A0.getVisibility() == 0)) ? 0 : 8);
    }

    public final void x(boolean z2) {
        boolean z3 = this.W0;
        this.y0.setVisibility((!z3 || !(z3 || this.b1) || this.U0 || !hasFocus() || (!z2 && this.b1)) ? 8 : 0);
    }

    public final void y(boolean z2) {
        this.U0 = z2;
        int i2 = 8;
        int i3 = z2 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.t0.getText());
        this.x0.setVisibility(i3);
        x(!zIsEmpty);
        this.u0.setVisibility(z2 ? 8 : 0);
        ImageView imageView = this.H0;
        imageView.setVisibility((imageView.getDrawable() == null || this.T0) ? 8 : 0);
        t();
        if (this.b1 && !this.U0 && zIsEmpty) {
            this.y0.setVisibility(8);
            i2 = 0;
        }
        this.A0.setVisibility(i2);
        w();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.D0 = new Rect();
        this.E0 = new Rect();
        this.F0 = new int[2];
        this.G0 = new int[2];
        this.i1 = new Runnable() { // from class: androidx.appcompat.widget.SearchView.1
            @Override // java.lang.Runnable
            public final void run() {
                SearchView.this.u();
            }
        };
        this.j1 = new Runnable() { // from class: androidx.appcompat.widget.SearchView.2
            @Override // java.lang.Runnable
            public final void run() {
                CursorAdapter cursorAdapter = SearchView.this.V0;
                if (cursorAdapter instanceof SuggestionsAdapter) {
                    cursorAdapter.a(null);
                }
            }
        };
        this.k1 = new WeakHashMap();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: androidx.appcompat.widget.SearchView.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchView searchView = SearchView.this;
                ImageView imageView = searchView.x0;
                SearchAutoComplete searchAutoComplete = searchView.t0;
                if (view == imageView) {
                    searchView.y(false);
                    searchAutoComplete.requestFocus();
                    searchAutoComplete.setImeVisibility(true);
                    View.OnClickListener onClickListener2 = searchView.S0;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(searchView);
                        return;
                    }
                    return;
                }
                if (view == searchView.z0) {
                    searchView.o();
                    return;
                }
                if (view == searchView.y0) {
                    searchView.s();
                    return;
                }
                if (view != searchView.A0) {
                    if (view == searchAutoComplete) {
                        searchView.n();
                        return;
                    }
                    return;
                }
                SearchableInfo searchableInfo = searchView.g1;
                if (searchableInfo == null) {
                    return;
                }
                try {
                    if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                        if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.m(searchView.M0, searchableInfo));
                        }
                    } else {
                        Intent intent = new Intent(searchView.L0);
                        ComponentName searchActivity = searchableInfo.getSearchActivity();
                        intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                        searchView.getContext().startActivity(intent);
                    }
                } catch (ActivityNotFoundException unused) {
                    Log.w("SearchView", "Could not find voice search activity");
                }
            }
        };
        this.l1 = onClickListener;
        View.OnKeyListener onKeyListener = new View.OnKeyListener() { // from class: androidx.appcompat.widget.SearchView.6
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
                SearchView searchView = SearchView.this;
                if (searchView.g1 != null) {
                    SearchAutoComplete searchAutoComplete = searchView.t0;
                    if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                        if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i3 == 66) {
                            view.cancelLongPress();
                            searchView.getContext().startActivity(searchView.l(null, "android.intent.action.SEARCH", null, searchAutoComplete.getText().toString()));
                            return true;
                        }
                    } else if (searchView.g1 != null && searchView.V0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                        if (i3 == 66 || i3 == 84 || i3 == 61) {
                            return searchView.p(searchAutoComplete.getListSelection());
                        }
                        if (i3 == 21 || i3 == 22) {
                            searchAutoComplete.setSelection(i3 == 21 ? 0 : searchAutoComplete.length());
                            searchAutoComplete.setListSelection(0);
                            searchAutoComplete.clearListSelection();
                            searchAutoComplete.a();
                            return true;
                        }
                        if (i3 == 19) {
                            searchAutoComplete.getListSelection();
                            return false;
                        }
                    }
                }
                return false;
            }
        };
        TextView.OnEditorActionListener onEditorActionListener = new TextView.OnEditorActionListener() { // from class: androidx.appcompat.widget.SearchView.7
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
                SearchView.this.s();
                return true;
            }
        };
        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() { // from class: androidx.appcompat.widget.SearchView.8
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i3, long j) {
                SearchView.this.p(i3);
            }
        };
        AdapterView.OnItemSelectedListener onItemSelectedListener = new AdapterView.OnItemSelectedListener() { // from class: androidx.appcompat.widget.SearchView.9
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onItemSelected(AdapterView adapterView, View view, int i3, long j) {
                SearchView.this.q(i3);
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onNothingSelected(AdapterView adapterView) {
            }
        };
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.appcompat.widget.SearchView.10
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                SearchView searchView = SearchView.this;
                Editable text = searchView.t0.getText();
                searchView.d1 = text;
                boolean zIsEmpty = TextUtils.isEmpty(text);
                searchView.x(!zIsEmpty);
                int i6 = 8;
                if (searchView.b1 && !searchView.U0 && zIsEmpty) {
                    searchView.y0.setVisibility(8);
                    i6 = 0;
                }
                searchView.A0.setVisibility(i6);
                searchView.t();
                searchView.w();
                if (searchView.O0 != null && !TextUtils.equals(charSequence, searchView.c1)) {
                    OnQueryTextListener onQueryTextListener = searchView.O0;
                    charSequence.toString();
                    onQueryTextListener.b();
                }
                searchView.c1 = charSequence.toString();
            }
        };
        int[] iArr = androidx.appcompat.R.styleable.f3286u;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        TintTypedArray tintTypedArray = new TintTypedArray(context, typedArrayObtainStyledAttributes);
        ViewCompat.y(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i2);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.t0 = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.u0 = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.v0 = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.w0 = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.x0 = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.y0 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.z0 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.A0 = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.H0 = imageView5;
        viewFindViewById.setBackground(tintTypedArray.b(20));
        viewFindViewById2.setBackground(tintTypedArray.b(25));
        imageView.setImageDrawable(tintTypedArray.b(23));
        imageView2.setImageDrawable(tintTypedArray.b(15));
        imageView3.setImageDrawable(tintTypedArray.b(12));
        imageView4.setImageDrawable(tintTypedArray.b(28));
        imageView5.setImageDrawable(tintTypedArray.b(23));
        this.I0 = tintTypedArray.b(22);
        TooltipCompat.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.J0 = typedArrayObtainStyledAttributes.getResourceId(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.K0 = typedArrayObtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(onClickListener);
        imageView3.setOnClickListener(onClickListener);
        imageView2.setOnClickListener(onClickListener);
        imageView4.setOnClickListener(onClickListener);
        searchAutoComplete.setOnClickListener(onClickListener);
        searchAutoComplete.addTextChangedListener(textWatcher);
        searchAutoComplete.setOnEditorActionListener(onEditorActionListener);
        searchAutoComplete.setOnItemClickListener(onItemClickListener);
        searchAutoComplete.setOnItemSelectedListener(onItemSelectedListener);
        searchAutoComplete.setOnKeyListener(onKeyListener);
        searchAutoComplete.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: androidx.appcompat.widget.SearchView.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                SearchView searchView = SearchView.this;
                View.OnFocusChangeListener onFocusChangeListener = searchView.Q0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z2);
                }
            }
        });
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(18, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.N0 = typedArrayObtainStyledAttributes.getText(14);
        this.X0 = typedArrayObtainStyledAttributes.getText(21);
        int i3 = typedArrayObtainStyledAttributes.getInt(6, -1);
        if (i3 != -1) {
            setImeOptions(i3);
        }
        int i4 = typedArrayObtainStyledAttributes.getInt(5, -1);
        if (i4 != -1) {
            setInputType(i4);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(1, true));
        tintTypedArray.f();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.L0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.M0 = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.B0 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.appcompat.widget.SearchView.4
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                    int dimensionPixelSize2;
                    SearchView searchView = SearchView.this;
                    View view2 = searchView.B0;
                    if (view2.getWidth() > 1) {
                        Resources resources = searchView.getContext().getResources();
                        int paddingLeft = searchView.v0.getPaddingLeft();
                        Rect rect = new Rect();
                        boolean zA = ViewUtils.a(searchView);
                        if (searchView.T0) {
                            dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
                        } else {
                            dimensionPixelSize2 = 0;
                        }
                        SearchAutoComplete searchAutoComplete2 = searchView.t0;
                        searchAutoComplete2.getDropDownBackground().getPadding(rect);
                        searchAutoComplete2.setDropDownHorizontalOffset(zA ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize2));
                        searchAutoComplete2.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize2) - paddingLeft);
                    }
                }
            });
        }
        y(this.T0);
        v();
    }
}
