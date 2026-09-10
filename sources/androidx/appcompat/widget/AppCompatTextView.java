package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.graphics.TypefaceCompatBaseImpl;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCompoundDrawablesView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView implements TintableBackgroundView, TintableCompoundDrawablesView, AutoSizeableTextView, EmojiCompatConfigurationView {
    public final AppCompatBackgroundHelper e0;
    public final AppCompatTextHelper f0;
    public final AppCompatTextClassifierHelper g0;
    public AppCompatEmojiTextHelper h0;
    public boolean i0;
    public SuperCallerApi26 j0;
    public Future k0;

    public interface SuperCaller {
        void a(int[] iArr, int i2);

        void b(int i2);

        int c();

        int d();

        int[] e();

        TextClassifier f();

        int g();

        void h(TextClassifier textClassifier);

        void i(int i2, int i3, int i4, int i5);

        void j(int i2);

        int k();

        void l(int i2);
    }

    public class SuperCallerApi26 implements SuperCaller {
        public SuperCallerApi26() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public final void a(int[] iArr, int i2) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void b(int i2) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public final int c() {
            return AppCompatTextView.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public final int d() {
            return AppCompatTextView.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public final int[] e() {
            return AppCompatTextView.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public final TextClassifier f() {
            return AppCompatTextView.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public final int g() {
            return AppCompatTextView.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public final void h(TextClassifier textClassifier) {
            AppCompatTextView.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public final void i(int i2, int i3, int i4, int i5) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void j(int i2) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public final int k() {
            return AppCompatTextView.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public final void l(int i2) {
            AppCompatTextView.super.setAutoSizeTextTypeWithDefaults(i2);
        }
    }

    public class SuperCallerApi28 extends SuperCallerApi26 {
        public SuperCallerApi28() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCallerApi26, androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public final void b(int i2) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i2);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCallerApi26, androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public final void j(int i2) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i2);
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.h0 == null) {
            this.h0 = new AppCompatEmojiTextHelper(this);
        }
        return this.h0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.e0;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.a();
        }
        AppCompatTextHelper appCompatTextHelper = this.f0;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (ViewUtils.f3670b) {
            return getSuperCaller().g();
        }
        AppCompatTextHelper appCompatTextHelper = this.f0;
        if (appCompatTextHelper != null) {
            return Math.round(appCompatTextHelper.f3585i.f3597e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (ViewUtils.f3670b) {
            return getSuperCaller().d();
        }
        AppCompatTextHelper appCompatTextHelper = this.f0;
        if (appCompatTextHelper != null) {
            return Math.round(appCompatTextHelper.f3585i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (ViewUtils.f3670b) {
            return getSuperCaller().k();
        }
        AppCompatTextHelper appCompatTextHelper = this.f0;
        if (appCompatTextHelper != null) {
            return Math.round(appCompatTextHelper.f3585i.f3596c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (ViewUtils.f3670b) {
            return getSuperCaller().e();
        }
        AppCompatTextHelper appCompatTextHelper = this.f0;
        return appCompatTextHelper != null ? appCompatTextHelper.f3585i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (ViewUtils.f3670b) {
            return getSuperCaller().c() == 1 ? 1 : 0;
        }
        AppCompatTextHelper appCompatTextHelper = this.f0;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.f3585i.f3594a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.h(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public SuperCaller getSuperCaller() {
        if (this.j0 == null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 28) {
                this.j0 = new SuperCallerApi28();
            } else if (i2 >= 26) {
                this.j0 = new SuperCallerApi26();
            }
        }
        return this.j0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.e0;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.e0;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f0.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f0.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        p();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        AppCompatTextClassifierHelper appCompatTextClassifierHelper;
        if (Build.VERSION.SDK_INT >= 28 || (appCompatTextClassifierHelper = this.g0) == null) {
            return getSuperCaller().f();
        }
        TextClassifier textClassifier = appCompatTextClassifierHelper.f3579b;
        return textClassifier == null ? AppCompatTextClassifierHelper.Api26Impl.a(appCompatTextClassifierHelper.f3578a) : textClassifier;
    }

    public PrecomputedTextCompat.Params getTextMetricsParamsCompat() {
        return TextViewCompat.a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f0.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            EditorInfoCompat.a(editorInfo, getText());
        }
        AppCompatHintHelper.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        AppCompatTextHelper appCompatTextHelper = this.f0;
        if (appCompatTextHelper == null || ViewUtils.f3670b) {
            return;
        }
        appCompatTextHelper.f3585i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        p();
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        AppCompatTextHelper appCompatTextHelper = this.f0;
        if (appCompatTextHelper == null || ViewUtils.f3670b) {
            return;
        }
        AppCompatTextViewAutoSizeHelper appCompatTextViewAutoSizeHelper = appCompatTextHelper.f3585i;
        if (appCompatTextViewAutoSizeHelper.f()) {
            appCompatTextViewAutoSizeHelper.a();
        }
    }

    public final void p() {
        Future future = this.k0;
        if (future != null) {
            try {
                this.k0 = null;
                TextViewCompat.f(this, (PrecomputedTextCompat) future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (ViewUtils.f3670b) {
            getSuperCaller().i(i2, i3, i4, i5);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.f0;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.h(i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (ViewUtils.f3670b) {
            getSuperCaller().a(iArr, i2);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.f0;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.i(iArr, i2);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (ViewUtils.f3670b) {
            getSuperCaller().l(i2);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.f0;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.j(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.e0;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.e0;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.f(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f0;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f0;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f0;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f0;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.i(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f3565b.a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().j(i2);
        } else {
            TextViewCompat.d(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i2);
        } else {
            TextViewCompat.e(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i2) {
        Preconditions.c(i2);
        int fontMetricsInt = getPaint().getFontMetricsInt(null);
        if (i2 != fontMetricsInt) {
            setLineSpacing(i2 - fontMetricsInt, 1.0f);
        }
    }

    public void setPrecomputedText(PrecomputedTextCompat precomputedTextCompat) {
        TextViewCompat.f(this, precomputedTextCompat);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.e0;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.e0;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        AppCompatTextHelper appCompatTextHelper = this.f0;
        appCompatTextHelper.k(colorStateList);
        appCompatTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        AppCompatTextHelper appCompatTextHelper = this.f0;
        appCompatTextHelper.l(mode);
        appCompatTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        AppCompatTextHelper appCompatTextHelper = this.f0;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.g(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        AppCompatTextClassifierHelper appCompatTextClassifierHelper;
        if (Build.VERSION.SDK_INT >= 28 || (appCompatTextClassifierHelper = this.g0) == null) {
            getSuperCaller().h(textClassifier);
        } else {
            appCompatTextClassifierHelper.f3579b = textClassifier;
        }
    }

    public void setTextFuture(Future<PrecomputedTextCompat> future) {
        this.k0 = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(PrecomputedTextCompat.Params params) {
        TextViewCompat.g(this, params);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f) {
        boolean z2 = ViewUtils.f3670b;
        if (z2) {
            super.setTextSize(i2, f);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.f0;
        if (appCompatTextHelper == null || z2) {
            return;
        }
        AppCompatTextViewAutoSizeHelper appCompatTextViewAutoSizeHelper = appCompatTextHelper.f3585i;
        if (appCompatTextViewAutoSizeHelper.f()) {
            return;
        }
        appCompatTextViewAutoSizeHelper.g(f, i2);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i2) {
        Typeface typefaceCreate;
        if (this.i0) {
            return;
        }
        if (typeface == null || i2 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            TypefaceCompatBaseImpl typefaceCompatBaseImpl = TypefaceCompat.f4303a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i2);
        }
        this.i0 = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i2);
        } finally {
            this.i0 = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TintContextWrapper.a(context);
        this.i0 = false;
        this.j0 = null;
        ThemeUtils.a(this, getContext());
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.e0 = appCompatBackgroundHelper;
        appCompatBackgroundHelper.d(attributeSet, i2);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.f0 = appCompatTextHelper;
        appCompatTextHelper.f(attributeSet, i2);
        appCompatTextHelper.b();
        AppCompatTextClassifierHelper appCompatTextClassifierHelper = new AppCompatTextClassifierHelper();
        appCompatTextClassifierHelper.f3578a = this;
        this.g0 = appCompatTextClassifierHelper;
        getEmojiTextViewHelper().a(attributeSet, i2);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i2 != 0 ? AppCompatResources.a(context, i2) : null, i3 != 0 ? AppCompatResources.a(context, i3) : null, i4 != 0 ? AppCompatResources.a(context, i4) : null, i5 != 0 ? AppCompatResources.a(context, i5) : null);
        AppCompatTextHelper appCompatTextHelper = this.f0;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i2 != 0 ? AppCompatResources.a(context, i2) : null, i3 != 0 ? AppCompatResources.a(context, i3) : null, i4 != 0 ? AppCompatResources.a(context, i4) : null, i5 != 0 ? AppCompatResources.a(context, i5) : null);
        AppCompatTextHelper appCompatTextHelper = this.f0;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }
}
