package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.view.premeiotic;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: AppCompatTextHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class arytenoidectomy {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final TextView f5381attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public kattegat f5382beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public kattegat f5383competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public kattegat f5385dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public Typeface f5386formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public boolean f5387impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public kattegat f5388impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public kattegat f5389marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public kattegat f5390saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final monoploid f5391taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public kattegat f5392wireman;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public int f5384cutely = 0;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public int f5380apical = -1;

    /* JADX INFO: compiled from: AppCompatTextHelper.java */
    public static class dern {
        public static LocaleList attabal(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void saneness(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* JADX INFO: compiled from: AppCompatTextHelper.java */
    public static class marial {
        public static Typeface attabal(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    /* JADX INFO: compiled from: AppCompatTextHelper.java */
    public class saneness implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ Typeface f5397arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ TextView f5398kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final /* synthetic */ int f5399monoploid;

        public saneness(TextView textView, Typeface typeface, int i) {
            this.f5398kowloon = textView;
            this.f5397arytenoidectomy = typeface;
            this.f5399monoploid = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5398kowloon.setTypeface(this.f5397arytenoidectomy, this.f5399monoploid);
        }
    }

    /* JADX INFO: compiled from: AppCompatTextHelper.java */
    public static class wireman {
        public static int attabal(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void dern(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        public static void saneness(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        public static boolean wireman(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    public arytenoidectomy(TextView textView) {
        this.f5381attabal = textView;
        this.f5391taiyuan = new monoploid(textView);
    }

    public static kattegat wireman(Context context, competently competentlyVar, int i) {
        ColorStateList colorStateListBeachfront = competentlyVar.beachfront(context, i);
        if (colorStateListBeachfront == null) {
            return null;
        }
        kattegat kattegatVar = new kattegat();
        kattegatVar.f5491wireman = true;
        kattegatVar.f5488attabal = colorStateListBeachfront;
        return kattegatVar;
    }

    public void adultoid(int[] iArr, int i) throws IllegalArgumentException {
        this.f5391taiyuan.monoploid(iArr, i);
    }

    public PorterDuff.Mode apical() {
        kattegat kattegatVar = this.f5388impromptu;
        if (kattegatVar != null) {
            return kattegatVar.f5490saneness;
        }
        return null;
    }

    public void arytenoidectomy() {
        saneness();
    }

    public final void attabal(Drawable drawable, kattegat kattegatVar) {
        if (drawable == null || kattegatVar == null) {
            return;
        }
        competently.taiyuan(drawable, kattegatVar, this.f5381attabal.getDrawableState());
    }

    public int beachfront() {
        return this.f5391taiyuan.competently();
    }

    public int competently() {
        return this.f5391taiyuan.impromptu();
    }

    public final void cord() {
        kattegat kattegatVar = this.f5388impromptu;
        this.f5390saneness = kattegatVar;
        this.f5385dern = kattegatVar;
        this.f5392wireman = kattegatVar;
        this.f5389marial = kattegatVar;
        this.f5382beachfront = kattegatVar;
        this.f5383competently = kattegatVar;
    }

    public void cuirassed(int i, float f) {
        if (peridotite.f5534dern || formularize()) {
            return;
        }
        stratoscope(i, f);
    }

    public ColorStateList cutely() {
        kattegat kattegatVar = this.f5388impromptu;
        if (kattegatVar != null) {
            return kattegatVar.f5488attabal;
        }
        return null;
    }

    public void dern() {
        this.f5391taiyuan.attabal();
    }

    public void dovishness(int i) {
        this.f5391taiyuan.polloi(i);
    }

    public boolean formularize() {
        return this.f5391taiyuan.triweekly();
    }

    public void gintrap(ColorStateList colorStateList) {
        if (this.f5388impromptu == null) {
            this.f5388impromptu = new kattegat();
        }
        kattegat kattegatVar = this.f5388impromptu;
        kattegatVar.f5488attabal = colorStateList;
        kattegatVar.f5491wireman = colorStateList != null;
        cord();
    }

    public void graveside(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.f5391taiyuan.arytenoidectomy(i, i2, i3, i4);
    }

    public void impassible(AttributeSet attributeSet, int i) {
        boolean zAttabal;
        boolean z;
        String strKowloon;
        String strKowloon2;
        boolean z2;
        int iSaneness;
        float fBeachfront;
        Context context = this.f5381attabal.getContext();
        competently competentlyVarSaneness = competently.saneness();
        restrictive restrictiveVarDovishness = restrictive.dovishness(context, attributeSet, beachfront.cutely.AppCompatTextHelper, i, 0);
        TextView textView = this.f5381attabal;
        premeiotic.nosophobia(textView, textView.getContext(), beachfront.cutely.AppCompatTextHelper, attributeSet, restrictiveVarDovishness.polloi(), i, 0);
        int iTriweekly = restrictiveVarDovishness.triweekly(beachfront.cutely.AppCompatTextHelper_android_textAppearance, -1);
        if (restrictiveVarDovishness.molybdenite(beachfront.cutely.AppCompatTextHelper_android_drawableLeft)) {
            this.f5390saneness = wireman(context, competentlyVarSaneness, restrictiveVarDovishness.triweekly(beachfront.cutely.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (restrictiveVarDovishness.molybdenite(beachfront.cutely.AppCompatTextHelper_android_drawableTop)) {
            this.f5385dern = wireman(context, competentlyVarSaneness, restrictiveVarDovishness.triweekly(beachfront.cutely.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (restrictiveVarDovishness.molybdenite(beachfront.cutely.AppCompatTextHelper_android_drawableRight)) {
            this.f5392wireman = wireman(context, competentlyVarSaneness, restrictiveVarDovishness.triweekly(beachfront.cutely.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (restrictiveVarDovishness.molybdenite(beachfront.cutely.AppCompatTextHelper_android_drawableBottom)) {
            this.f5389marial = wireman(context, competentlyVarSaneness, restrictiveVarDovishness.triweekly(beachfront.cutely.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (restrictiveVarDovishness.molybdenite(beachfront.cutely.AppCompatTextHelper_android_drawableStart)) {
            this.f5382beachfront = wireman(context, competentlyVarSaneness, restrictiveVarDovishness.triweekly(beachfront.cutely.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (restrictiveVarDovishness.molybdenite(beachfront.cutely.AppCompatTextHelper_android_drawableEnd)) {
            this.f5383competently = wireman(context, competentlyVarSaneness, restrictiveVarDovishness.triweekly(beachfront.cutely.AppCompatTextHelper_android_drawableEnd, 0));
        }
        restrictiveVarDovishness.rotuma();
        boolean z3 = this.f5381attabal.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iTriweekly != -1) {
            restrictive restrictiveVarGraveside = restrictive.graveside(context, iTriweekly, beachfront.cutely.TextAppearance);
            if (z3 || !restrictiveVarGraveside.molybdenite(beachfront.cutely.TextAppearance_textAllCaps)) {
                zAttabal = false;
                z = false;
            } else {
                zAttabal = restrictiveVarGraveside.attabal(beachfront.cutely.TextAppearance_textAllCaps, false);
                z = true;
            }
            trm(context, restrictiveVarGraveside);
            int i2 = Build.VERSION.SDK_INT;
            strKowloon2 = restrictiveVarGraveside.molybdenite(beachfront.cutely.TextAppearance_textLocale) ? restrictiveVarGraveside.kowloon(beachfront.cutely.TextAppearance_textLocale) : null;
            strKowloon = (i2 < 26 || !restrictiveVarGraveside.molybdenite(beachfront.cutely.TextAppearance_fontVariationSettings)) ? null : restrictiveVarGraveside.kowloon(beachfront.cutely.TextAppearance_fontVariationSettings);
            restrictiveVarGraveside.rotuma();
        } else {
            zAttabal = false;
            z = false;
            strKowloon = null;
            strKowloon2 = null;
        }
        restrictive restrictiveVarDovishness2 = restrictive.dovishness(context, attributeSet, beachfront.cutely.TextAppearance, i, 0);
        if (z3 || !restrictiveVarDovishness2.molybdenite(beachfront.cutely.TextAppearance_textAllCaps)) {
            z2 = z;
        } else {
            zAttabal = restrictiveVarDovishness2.attabal(beachfront.cutely.TextAppearance_textAllCaps, false);
            z2 = true;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (restrictiveVarDovishness2.molybdenite(beachfront.cutely.TextAppearance_textLocale)) {
            strKowloon2 = restrictiveVarDovishness2.kowloon(beachfront.cutely.TextAppearance_textLocale);
        }
        if (i3 >= 26 && restrictiveVarDovishness2.molybdenite(beachfront.cutely.TextAppearance_fontVariationSettings)) {
            strKowloon = restrictiveVarDovishness2.kowloon(beachfront.cutely.TextAppearance_fontVariationSettings);
        }
        if (i3 >= 28 && restrictiveVarDovishness2.molybdenite(beachfront.cutely.TextAppearance_android_textSize) && restrictiveVarDovishness2.beachfront(beachfront.cutely.TextAppearance_android_textSize, -1) == 0) {
            this.f5381attabal.setTextSize(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        trm(context, restrictiveVarDovishness2);
        restrictiveVarDovishness2.rotuma();
        if (!z3 && z2) {
            molybdenite(zAttabal);
        }
        Typeface typeface = this.f5386formularize;
        if (typeface != null) {
            if (this.f5380apical == -1) {
                this.f5381attabal.setTypeface(typeface, this.f5384cutely);
            } else {
                this.f5381attabal.setTypeface(typeface);
            }
        }
        if (strKowloon != null) {
            wireman.wireman(this.f5381attabal, strKowloon);
        }
        if (strKowloon2 != null) {
            dern.saneness(this.f5381attabal, dern.attabal(strKowloon2));
        }
        this.f5391taiyuan.kowloon(attributeSet, i);
        if (peridotite.f5534dern && this.f5391taiyuan.cutely() != 0) {
            int[] iArrTaiyuan = this.f5391taiyuan.taiyuan();
            if (iArrTaiyuan.length > 0) {
                if (wireman.attabal(this.f5381attabal) != -1.0f) {
                    wireman.saneness(this.f5381attabal, this.f5391taiyuan.competently(), this.f5391taiyuan.beachfront(), this.f5391taiyuan.impromptu(), 0);
                } else {
                    wireman.dern(this.f5381attabal, iArrTaiyuan, 0);
                }
            }
        }
        restrictive restrictiveVarAdultoid = restrictive.adultoid(context, attributeSet, beachfront.cutely.AppCompatTextView);
        int iTriweekly2 = restrictiveVarAdultoid.triweekly(beachfront.cutely.AppCompatTextView_drawableLeftCompat, -1);
        Drawable drawableDern = iTriweekly2 != -1 ? competentlyVarSaneness.dern(context, iTriweekly2) : null;
        int iTriweekly3 = restrictiveVarAdultoid.triweekly(beachfront.cutely.AppCompatTextView_drawableTopCompat, -1);
        Drawable drawableDern2 = iTriweekly3 != -1 ? competentlyVarSaneness.dern(context, iTriweekly3) : null;
        int iTriweekly4 = restrictiveVarAdultoid.triweekly(beachfront.cutely.AppCompatTextView_drawableRightCompat, -1);
        Drawable drawableDern3 = iTriweekly4 != -1 ? competentlyVarSaneness.dern(context, iTriweekly4) : null;
        int iTriweekly5 = restrictiveVarAdultoid.triweekly(beachfront.cutely.AppCompatTextView_drawableBottomCompat, -1);
        Drawable drawableDern4 = iTriweekly5 != -1 ? competentlyVarSaneness.dern(context, iTriweekly5) : null;
        int iTriweekly6 = restrictiveVarAdultoid.triweekly(beachfront.cutely.AppCompatTextView_drawableStartCompat, -1);
        Drawable drawableDern5 = iTriweekly6 != -1 ? competentlyVarSaneness.dern(context, iTriweekly6) : null;
        int iTriweekly7 = restrictiveVarAdultoid.triweekly(beachfront.cutely.AppCompatTextView_drawableEndCompat, -1);
        preprohormone(drawableDern, drawableDern2, drawableDern3, drawableDern4, drawableDern5, iTriweekly7 != -1 ? competentlyVarSaneness.dern(context, iTriweekly7) : null);
        if (restrictiveVarAdultoid.molybdenite(beachfront.cutely.AppCompatTextView_drawableTint)) {
            androidx.core.widget.formularize.beachfront(this.f5381attabal, restrictiveVarAdultoid.dern(beachfront.cutely.AppCompatTextView_drawableTint));
        }
        if (restrictiveVarAdultoid.molybdenite(beachfront.cutely.AppCompatTextView_drawableTintMode)) {
            androidx.core.widget.formularize.competently(this.f5381attabal, dovishness.marial(restrictiveVarAdultoid.apical(beachfront.cutely.AppCompatTextView_drawableTintMode, -1), null));
        }
        int iBeachfront = restrictiveVarAdultoid.beachfront(beachfront.cutely.AppCompatTextView_firstBaselineToTopHeight, -1);
        int iBeachfront2 = restrictiveVarAdultoid.beachfront(beachfront.cutely.AppCompatTextView_lastBaselineToBottomHeight, -1);
        if (restrictiveVarAdultoid.molybdenite(beachfront.cutely.AppCompatTextView_lineHeight)) {
            TypedValue typedValueGintrap = restrictiveVarAdultoid.gintrap(beachfront.cutely.AppCompatTextView_lineHeight);
            if (typedValueGintrap == null || typedValueGintrap.type != 5) {
                fBeachfront = restrictiveVarAdultoid.beachfront(beachfront.cutely.AppCompatTextView_lineHeight, -1);
                iSaneness = -1;
            } else {
                iSaneness = technofreak.formularize.saneness(typedValueGintrap.data);
                fBeachfront = TypedValue.complexToFloat(typedValueGintrap.data);
            }
        } else {
            iSaneness = -1;
            fBeachfront = -1.0f;
        }
        restrictiveVarAdultoid.rotuma();
        if (iBeachfront != -1) {
            androidx.core.widget.formularize.impromptu(this.f5381attabal, iBeachfront);
        }
        if (iBeachfront2 != -1) {
            androidx.core.widget.formularize.taiyuan(this.f5381attabal, iBeachfront2);
        }
        if (fBeachfront != -1.0f) {
            if (iSaneness == -1) {
                androidx.core.widget.formularize.cutely(this.f5381attabal, (int) fBeachfront);
            } else {
                androidx.core.widget.formularize.apical(this.f5381attabal, iSaneness, fBeachfront);
            }
        }
    }

    public int[] impromptu() {
        return this.f5391taiyuan.taiyuan();
    }

    public void kowloon(boolean z, int i, int i2, int i3, int i4) {
        if (peridotite.f5534dern) {
            return;
        }
        dern();
    }

    public int marial() {
        return this.f5391taiyuan.beachfront();
    }

    public void molybdenite(boolean z) {
        this.f5381attabal.setAllCaps(z);
    }

    public void monoploid(Context context, int i) {
        String strKowloon;
        restrictive restrictiveVarGraveside = restrictive.graveside(context, i, beachfront.cutely.TextAppearance);
        if (restrictiveVarGraveside.molybdenite(beachfront.cutely.TextAppearance_textAllCaps)) {
            molybdenite(restrictiveVarGraveside.attabal(beachfront.cutely.TextAppearance_textAllCaps, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (restrictiveVarGraveside.molybdenite(beachfront.cutely.TextAppearance_android_textSize) && restrictiveVarGraveside.beachfront(beachfront.cutely.TextAppearance_android_textSize, -1) == 0) {
            this.f5381attabal.setTextSize(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        trm(context, restrictiveVarGraveside);
        if (i2 >= 26 && restrictiveVarGraveside.molybdenite(beachfront.cutely.TextAppearance_fontVariationSettings) && (strKowloon = restrictiveVarGraveside.kowloon(beachfront.cutely.TextAppearance_fontVariationSettings)) != null) {
            wireman.wireman(this.f5381attabal, strKowloon);
        }
        restrictiveVarGraveside.rotuma();
        Typeface typeface = this.f5386formularize;
        if (typeface != null) {
            this.f5381attabal.setTypeface(typeface, this.f5384cutely);
        }
    }

    public void polloi(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        vesuvio.dern.beachfront(editorInfo, textView.getText());
    }

    public final void preprohormone(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f5381attabal.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f5381attabal;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f5381attabal.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f5381attabal.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f5381attabal.getCompoundDrawables();
        TextView textView2 = this.f5381attabal;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public void rotuma(PorterDuff.Mode mode) {
        if (this.f5388impromptu == null) {
            this.f5388impromptu = new kattegat();
        }
        kattegat kattegatVar = this.f5388impromptu;
        kattegatVar.f5490saneness = mode;
        kattegatVar.f5489dern = mode != null;
        cord();
    }

    public void saneness() {
        if (this.f5390saneness != null || this.f5385dern != null || this.f5392wireman != null || this.f5389marial != null) {
            Drawable[] compoundDrawables = this.f5381attabal.getCompoundDrawables();
            attabal(compoundDrawables[0], this.f5390saneness);
            attabal(compoundDrawables[1], this.f5385dern);
            attabal(compoundDrawables[2], this.f5392wireman);
            attabal(compoundDrawables[3], this.f5389marial);
        }
        if (this.f5382beachfront == null && this.f5383competently == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f5381attabal.getCompoundDrawablesRelative();
        attabal(compoundDrawablesRelative[0], this.f5382beachfront);
        attabal(compoundDrawablesRelative[2], this.f5383competently);
    }

    public final void stratoscope(int i, float f) {
        this.f5391taiyuan.graveside(i, f);
    }

    public int taiyuan() {
        return this.f5391taiyuan.cutely();
    }

    public void triweekly(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f5387impassible) {
            this.f5386formularize = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new saneness(textView, typeface, this.f5384cutely));
                } else {
                    textView.setTypeface(typeface, this.f5384cutely);
                }
            }
        }
    }

    public final void trm(Context context, restrictive restrictiveVar) {
        String strKowloon;
        this.f5384cutely = restrictiveVar.apical(beachfront.cutely.TextAppearance_android_textStyle, this.f5384cutely);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int iApical = restrictiveVar.apical(beachfront.cutely.TextAppearance_android_textFontWeight, -1);
            this.f5380apical = iApical;
            if (iApical != -1) {
                this.f5384cutely &= 2;
            }
        }
        if (!restrictiveVar.molybdenite(beachfront.cutely.TextAppearance_android_fontFamily) && !restrictiveVar.molybdenite(beachfront.cutely.TextAppearance_fontFamily)) {
            if (restrictiveVar.molybdenite(beachfront.cutely.TextAppearance_android_typeface)) {
                this.f5387impassible = false;
                int iApical2 = restrictiveVar.apical(beachfront.cutely.TextAppearance_android_typeface, 1);
                if (iApical2 == 1) {
                    this.f5386formularize = Typeface.SANS_SERIF;
                    return;
                } else if (iApical2 == 2) {
                    this.f5386formularize = Typeface.SERIF;
                    return;
                } else {
                    if (iApical2 != 3) {
                        return;
                    }
                    this.f5386formularize = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f5386formularize = null;
        int i2 = restrictiveVar.molybdenite(beachfront.cutely.TextAppearance_fontFamily) ? beachfront.cutely.TextAppearance_fontFamily : beachfront.cutely.TextAppearance_android_fontFamily;
        int i3 = this.f5380apical;
        int i4 = this.f5384cutely;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceCutely = restrictiveVar.cutely(i2, this.f5384cutely, new attabal(i3, i4, new WeakReference(this.f5381attabal)));
                if (typefaceCutely != null) {
                    if (i < 28 || this.f5380apical == -1) {
                        this.f5386formularize = typefaceCutely;
                    } else {
                        this.f5386formularize = marial.attabal(Typeface.create(typefaceCutely, 0), this.f5380apical, (this.f5384cutely & 2) != 0);
                    }
                }
                this.f5387impassible = this.f5386formularize == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f5386formularize != null || (strKowloon = restrictiveVar.kowloon(i2)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f5380apical == -1) {
            this.f5386formularize = Typeface.create(strKowloon, this.f5384cutely);
        } else {
            this.f5386formularize = marial.attabal(Typeface.create(strKowloon, 0), this.f5380apical, (this.f5384cutely & 2) != 0);
        }
    }

    /* JADX INFO: compiled from: AppCompatTextHelper.java */
    public class attabal extends lightstruck.impromptu.marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ int f5393attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ WeakReference f5394dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ int f5395saneness;

        public attabal(int i, int i2, WeakReference weakReference) {
            this.f5393attabal = i;
            this.f5395saneness = i2;
            this.f5394dern = weakReference;
        }

        @Override // lightstruck.impromptu.marial
        public void competently(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f5393attabal) != -1) {
                typeface = marial.attabal(typeface, i, (this.f5395saneness & 2) != 0);
            }
            arytenoidectomy.this.triweekly(this.f5394dern, typeface);
        }

        @Override // lightstruck.impromptu.marial
        public void beachfront(int i) {
        }
    }
}
