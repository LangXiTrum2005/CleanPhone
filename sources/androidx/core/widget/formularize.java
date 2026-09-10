package androidx.core.widget;

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
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import herdbook.monoploid;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: TextViewCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class formularize {

    /* JADX INFO: compiled from: TextViewCompat.java */
    public static class attabal {
        public static int attabal(TextView textView) {
            return textView.getBreakStrategy();
        }

        public static void beachfront(TextView textView, int i) {
            textView.setHyphenationFrequency(i);
        }

        public static void dern(TextView textView, int i) {
            textView.setBreakStrategy(i);
        }

        public static void marial(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        public static int saneness(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        public static void wireman(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }
    }

    /* JADX INFO: compiled from: TextViewCompat.java */
    public static class marial implements ActionMode.Callback {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final ActionMode.Callback f9503attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public boolean f9504beachfront = false;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public Class<?> f9505dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public boolean f9506marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final TextView f9507saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public Method f9508wireman;

        public marial(ActionMode.Callback callback, TextView textView) {
            this.f9503attabal = callback;
            this.f9507saneness = textView;
        }

        public final Intent attabal() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        public final boolean beachfront(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        public final void competently(Menu menu) {
            Context context = this.f9507saneness.getContext();
            PackageManager packageManager = context.getPackageManager();
            boolean z = this.f9504beachfront;
            Class cls = Integer.TYPE;
            if (!z) {
                this.f9504beachfront = true;
                try {
                    Class<?> cls2 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f9505dern = cls2;
                    this.f9508wireman = cls2.getDeclaredMethod("removeItemAt", cls);
                    this.f9506marial = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f9505dern = null;
                    this.f9508wireman = null;
                    this.f9506marial = false;
                }
            }
            try {
                Method declaredMethod = (this.f9506marial && this.f9505dern.isInstance(menu)) ? this.f9508wireman : menu.getClass().getDeclaredMethod("removeItemAt", cls);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> listDern = dern(context, packageManager);
                for (int i = 0; i < listDern.size(); i++) {
                    ResolveInfo resolveInfo = listDern.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(saneness(resolveInfo, this.f9507saneness)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        public final List<ResolveInfo> dern(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(attabal(), 0)) {
                    if (beachfront(resolveInfo, context)) {
                        arrayList.add(resolveInfo);
                    }
                }
            }
            return arrayList;
        }

        public final boolean marial(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f9503attabal.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f9503attabal.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f9503attabal.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            competently(menu);
            return this.f9503attabal.onPrepareActionMode(actionMode, menu);
        }

        public final Intent saneness(ResolveInfo resolveInfo, TextView textView) {
            Intent intentPutExtra = attabal().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !marial(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        public ActionMode.Callback wireman() {
            return this.f9503attabal;
        }
    }

    /* JADX INFO: compiled from: TextViewCompat.java */
    public static class saneness {
        public static DecimalFormatSymbols attabal(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* JADX INFO: compiled from: TextViewCompat.java */
    public static class wireman {
        public static void attabal(TextView textView, int i, float f) {
            textView.setLineHeight(i, f);
        }
    }

    public static void apical(TextView textView, int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            wireman.attabal(textView, i, f);
        } else {
            cutely(textView, Math.round(TypedValue.applyDimension(i, f, textView.getResources().getDisplayMetrics())));
        }
    }

    public static ActionMode.Callback arytenoidectomy(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof marial) || callback == null) ? callback : new marial(callback, textView);
    }

    public static int attabal(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static void beachfront(TextView textView, ColorStateList colorStateList) {
        technofreak.cutely.competently(textView);
        attabal.wireman(textView, colorStateList);
    }

    public static void competently(TextView textView, PorterDuff.Mode mode) {
        technofreak.cutely.competently(textView);
        attabal.marial(textView, mode);
    }

    public static void cutely(TextView textView, int i) {
        technofreak.cutely.wireman(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public static int dern(TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic3 || textDirectionHeuristic == (textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 6;
        }
        return textDirectionHeuristic == textDirectionHeuristic3 ? 7 : 1;
    }

    public static void formularize(TextView textView, monoploid monoploidVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(dern.attabal(monoploidVar.saneness()));
        } else {
            if (!marial(textView).attabal(monoploidVar.attabal())) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
            textView.setText(monoploidVar);
        }
    }

    public static void impassible(TextView textView, int i) {
        textView.setTextAppearance(i);
    }

    public static void impromptu(TextView textView, int i) {
        technofreak.cutely.wireman(i);
        if (Build.VERSION.SDK_INT >= 28) {
            dern.wireman(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static ActionMode.Callback kowloon(ActionMode.Callback callback) {
        return (!(callback instanceof marial) || Build.VERSION.SDK_INT < 26) ? callback : ((marial) callback).wireman();
    }

    public static monoploid.attabal marial(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new monoploid.attabal(dern.dern(textView));
        }
        monoploid.attabal.C0633attabal c0633attabal = new monoploid.attabal.C0633attabal(new TextPaint(textView.getPaint()));
        c0633attabal.saneness(attabal.attabal(textView));
        c0633attabal.dern(attabal.saneness(textView));
        c0633attabal.wireman(wireman(textView));
        return c0633attabal.attabal();
    }

    public static int saneness(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static void taiyuan(TextView textView, int i) {
        technofreak.cutely.wireman(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void triweekly(TextView textView, monoploid.attabal attabalVar) {
        textView.setTextDirection(dern(attabalVar.wireman()));
        textView.getPaint().set(attabalVar.marial());
        attabal.dern(textView, attabalVar.saneness());
        attabal.beachfront(textView, attabalVar.dern());
    }

    public static TextDirectionHeuristic wireman(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(dern.saneness(saneness.attabal(textView.getTextLocale()))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z = textView.getLayoutDirection() == 1;
        switch (textView.getTextDirection()) {
            case 2:
                return TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return TextDirectionHeuristics.LTR;
            case 4:
                return TextDirectionHeuristics.RTL;
            case 5:
                return TextDirectionHeuristics.LOCALE;
            case 6:
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                return z ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    /* JADX INFO: compiled from: TextViewCompat.java */
    public static class dern {
        public static PrecomputedText.Params dern(TextView textView) {
            return textView.getTextMetricsParams();
        }

        public static String[] saneness(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        public static void wireman(TextView textView, int i) {
            textView.setFirstBaselineToTopHeight(i);
        }

        public static CharSequence attabal(PrecomputedText precomputedText) {
            return precomputedText;
        }
    }
}
