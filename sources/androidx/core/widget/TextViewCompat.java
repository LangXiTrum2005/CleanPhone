package androidx.core.widget;

import A.M;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class TextViewCompat {

    public static class Api23Impl {
        public static int a(TextView textView) {
            return textView.getBreakStrategy();
        }

        public static ColorStateList b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        public static PorterDuff.Mode c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        public static int d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        public static void e(TextView textView, int i2) {
            textView.setBreakStrategy(i2);
        }

        public static void f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        public static void g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        public static void h(TextView textView, int i2) {
            textView.setHyphenationFrequency(i2);
        }
    }

    public static class Api24Impl {
        public static DecimalFormatSymbols a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    public static class Api26Impl {
        public static int a(TextView textView) {
            return textView.getAutoSizeMaxTextSize();
        }

        public static int b(TextView textView) {
            return textView.getAutoSizeMinTextSize();
        }

        public static int c(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static int[] d(TextView textView) {
            return textView.getAutoSizeTextAvailableSizes();
        }

        public static int e(TextView textView) {
            return textView.getAutoSizeTextType();
        }

        public static void f(TextView textView, int i2, int i3, int i4, int i5) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
        }

        public static void g(TextView textView, int[] iArr, int i2) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
        }

        public static void h(TextView textView, int i2) {
            textView.setAutoSizeTextTypeWithDefaults(i2);
        }
    }

    public static class Api28Impl {
        public static CharSequence a(PrecomputedText precomputedText) {
            return precomputedText;
        }

        public static String[] b(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        public static PrecomputedText.Params c(TextView textView) {
            return textView.getTextMetricsParams();
        }

        public static void d(TextView textView, int i2) {
            textView.setFirstBaselineToTopHeight(i2);
        }
    }

    public static class Api34Impl {
        public static void a(TextView textView, int i2, float f) {
            textView.setLineHeight(i2, f);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface AutoSizeTextType {
    }

    public static class OreoCallback implements ActionMode.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f4570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f4571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Class f4572c;
        public Method d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f4573e;
        public boolean f = false;

        public OreoCallback(ActionMode.Callback callback, TextView textView) {
            this.f4570a = callback;
            this.f4571b = textView;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f4570a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f4570a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
            this.f4570a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            String str;
            TextView textView = this.f4571b;
            Context context = textView.getContext();
            PackageManager packageManager = context.getPackageManager();
            boolean z2 = this.f;
            Class cls = Integer.TYPE;
            if (!z2) {
                this.f = true;
                try {
                    Class<?> cls2 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f4572c = cls2;
                    this.d = cls2.getDeclaredMethod("removeItemAt", cls);
                    this.f4573e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f4572c = null;
                    this.d = null;
                    this.f4573e = false;
                }
            }
            try {
                Method declaredMethod = (this.f4573e && this.f4572c.isInstance(menu)) ? this.d : menu.getClass().getDeclaredMethod("removeItemAt", cls);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (context instanceof Activity) {
                    for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                        if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                            ActivityInfo activityInfo = resolveInfo.activityInfo;
                            if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                            }
                        }
                        arrayList.add(resolveInfo);
                    }
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i2);
                    MenuItem menuItemAdd = menu.add(0, 0, i2 + 100, resolveInfo2.loadLabel(packageManager));
                    Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()));
                    ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                    menuItemAdd.setIntent(intentPutExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
            return this.f4570a.onPrepareActionMode(actionMode, menu);
        }
    }

    public static PrecomputedTextCompat.Params a(AppCompatTextView appCompatTextView) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return new PrecomputedTextCompat.Params(Api28Impl.c(appCompatTextView));
        }
        TextPaint textPaint = new TextPaint(appCompatTextView.getPaint());
        PrecomputedTextCompat.Params.Builder builder = new PrecomputedTextCompat.Params.Builder();
        builder.f4395a = 1;
        builder.f4396b = 1;
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        builder.f4395a = Api23Impl.a(appCompatTextView);
        builder.f4396b = Api23Impl.d(appCompatTextView);
        if (appCompatTextView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i2 < 28 || (appCompatTextView.getInputType() & 15) != 3) {
            boolean z2 = appCompatTextView.getLayoutDirection() == 1;
            switch (appCompatTextView.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z2) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(Api28Impl.b(Api24Impl.a(appCompatTextView.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new PrecomputedTextCompat.Params(textPaint, textDirectionHeuristic, builder.f4395a, builder.f4396b);
    }

    public static void b(TextView textView, ColorStateList colorStateList) {
        textView.getClass();
        Api23Impl.f(textView, colorStateList);
    }

    public static void c(TextView textView, PorterDuff.Mode mode) {
        textView.getClass();
        Api23Impl.g(textView, mode);
    }

    public static void d(TextView textView, int i2) {
        Preconditions.c(i2);
        if (Build.VERSION.SDK_INT >= 28) {
            Api28Impl.d(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void e(TextView textView, int i2) {
        Preconditions.c(i2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static void f(AppCompatTextView appCompatTextView, PrecomputedTextCompat precomputedTextCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            precomputedTextCompat.getClass();
            appCompatTextView.setText(Api28Impl.a(M.y(null) ? M.i(null) : null));
        } else {
            PrecomputedTextCompat.Params paramsA = a(appCompatTextView);
            precomputedTextCompat.getClass();
            paramsA.a(null);
            throw null;
        }
    }

    public static void g(AppCompatTextView appCompatTextView, PrecomputedTextCompat.Params params) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = params.f4393b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i2 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i2 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i2 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i2 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i2 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i2 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i2 = 7;
            }
        }
        appCompatTextView.setTextDirection(i2);
        appCompatTextView.getPaint().set(params.f4392a);
        Api23Impl.e(appCompatTextView, params.f4394c);
        Api23Impl.h(appCompatTextView, params.d);
    }

    public static ActionMode.Callback h(ActionMode.Callback callback) {
        return (!(callback instanceof OreoCallback) || Build.VERSION.SDK_INT < 26) ? callback : ((OreoCallback) callback).f4570a;
    }

    public static ActionMode.Callback i(ActionMode.Callback callback, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof OreoCallback) || callback == null) ? callback : new OreoCallback(callback, textView);
    }
}
