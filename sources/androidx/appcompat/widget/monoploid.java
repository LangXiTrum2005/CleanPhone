package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.core.view.premeiotic;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: AppCompatTextViewAutoSizeHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class monoploid {

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static final RectF f5501formularize = new RectF();

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public static ConcurrentHashMap<String, Method> f5502impassible = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final wireman f5503apical;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final Context f5507cutely;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public TextPaint f5509impromptu;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final TextView f5512taiyuan;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f5504attabal = 0;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public boolean f5511saneness = false;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public float f5508dern = -1.0f;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public float f5513wireman = -1.0f;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public float f5510marial = -1.0f;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int[] f5505beachfront = new int[0];

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public boolean f5506competently = false;

    /* JADX INFO: compiled from: AppCompatTextViewAutoSizeHelper.java */
    public static final class attabal {
        public static StaticLayout attabal(CharSequence charSequence, Layout.Alignment alignment, int i, int i2, TextView textView, TextPaint textPaint, wireman wiremanVar) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i2 == -1) {
                i2 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i2);
            try {
                wiremanVar.attabal(builderObtain, textView);
            } catch (ClassCastException unused) {
            }
            return builderObtain.build();
        }
    }

    /* JADX INFO: compiled from: AppCompatTextViewAutoSizeHelper.java */
    public static class dern extends saneness {
        @Override // androidx.appcompat.widget.monoploid.saneness, androidx.appcompat.widget.monoploid.wireman
        public void attabal(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.monoploid.wireman
        public boolean saneness(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* JADX INFO: compiled from: AppCompatTextViewAutoSizeHelper.java */
    public static class saneness extends wireman {
        @Override // androidx.appcompat.widget.monoploid.wireman
        public void attabal(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) monoploid.impassible(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* JADX INFO: compiled from: AppCompatTextViewAutoSizeHelper.java */
    public static class wireman {
        public void attabal(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        public boolean saneness(TextView textView) {
            return ((Boolean) monoploid.impassible(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public monoploid(TextView textView) {
        this.f5512taiyuan = textView;
        this.f5507cutely = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f5503apical = new dern();
        } else {
            this.f5503apical = new saneness();
        }
    }

    public static Method apical(String str) {
        try {
            Method declaredMethod = f5502impassible.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, null)) != null) {
                declaredMethod.setAccessible(true);
                f5502impassible.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> T impassible(Object obj, String str, T t) {
        try {
            return (T) apical(str).invoke(obj, null);
        } catch (Exception unused) {
            return t;
        }
    }

    public final boolean adultoid() {
        if (preprohormone() && this.f5504attabal == 1) {
            if (!this.f5506competently || this.f5505beachfront.length == 0) {
                int iFloor = ((int) Math.floor((this.f5510marial - this.f5513wireman) / this.f5508dern)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round(this.f5513wireman + (i * this.f5508dern));
                }
                this.f5505beachfront = saneness(iArr);
            }
            this.f5511saneness = true;
        } else {
            this.f5511saneness = false;
        }
        return this.f5511saneness;
    }

    public void arytenoidectomy(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (preprohormone()) {
            DisplayMetrics displayMetrics = this.f5507cutely.getResources().getDisplayMetrics();
            cord(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (adultoid()) {
                attabal();
            }
        }
    }

    public void attabal() {
        if (triweekly()) {
            if (this.f5511saneness) {
                if (this.f5512taiyuan.getMeasuredHeight() <= 0 || this.f5512taiyuan.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f5503apical.saneness(this.f5512taiyuan) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : (this.f5512taiyuan.getMeasuredWidth() - this.f5512taiyuan.getTotalPaddingLeft()) - this.f5512taiyuan.getTotalPaddingRight();
                int height = (this.f5512taiyuan.getHeight() - this.f5512taiyuan.getCompoundPaddingBottom()) - this.f5512taiyuan.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f5501formularize;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fMarial = marial(rectF);
                        if (fMarial != this.f5512taiyuan.getTextSize()) {
                            graveside(0, fMarial);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f5511saneness = true;
        }
    }

    public int beachfront() {
        return Math.round(this.f5510marial);
    }

    public int competently() {
        return Math.round(this.f5513wireman);
    }

    public final void cord(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f5504attabal = 1;
        this.f5513wireman = f;
        this.f5510marial = f2;
        this.f5508dern = f3;
        this.f5506competently = false;
    }

    public int cutely() {
        return this.f5504attabal;
    }

    public final void dern() {
        this.f5504attabal = 0;
        this.f5513wireman = -1.0f;
        this.f5510marial = -1.0f;
        this.f5508dern = -1.0f;
        this.f5505beachfront = new int[0];
        this.f5511saneness = false;
    }

    public final void dovishness(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f5505beachfront = saneness(iArr);
            gintrap();
        }
    }

    public void formularize(int i) {
        TextPaint textPaint = this.f5509impromptu;
        if (textPaint == null) {
            this.f5509impromptu = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f5509impromptu.set(this.f5512taiyuan.getPaint());
        this.f5509impromptu.setTextSize(i);
    }

    public final boolean gintrap() {
        int[] iArr = this.f5505beachfront;
        int length = iArr.length;
        boolean z = length > 0;
        this.f5506competently = z;
        if (z) {
            this.f5504attabal = 1;
            this.f5513wireman = iArr[0];
            this.f5510marial = iArr[length - 1];
            this.f5508dern = -1.0f;
        }
        return z;
    }

    public void graveside(int i, float f) {
        Context context = this.f5507cutely;
        molybdenite(TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public int impromptu() {
        return Math.round(this.f5508dern);
    }

    public void kowloon(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.f5507cutely.obtainStyledAttributes(attributeSet, beachfront.cutely.AppCompatTextView, i, 0);
        TextView textView = this.f5512taiyuan;
        premeiotic.nosophobia(textView, textView.getContext(), beachfront.cutely.AppCompatTextView, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        if (typedArrayObtainStyledAttributes.hasValue(beachfront.cutely.AppCompatTextView_autoSizeTextType)) {
            this.f5504attabal = typedArrayObtainStyledAttributes.getInt(beachfront.cutely.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(beachfront.cutely.AppCompatTextView_autoSizeStepGranularity) ? typedArrayObtainStyledAttributes.getDimension(beachfront.cutely.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(beachfront.cutely.AppCompatTextView_autoSizeMinTextSize) ? typedArrayObtainStyledAttributes.getDimension(beachfront.cutely.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(beachfront.cutely.AppCompatTextView_autoSizeMaxTextSize) ? typedArrayObtainStyledAttributes.getDimension(beachfront.cutely.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(beachfront.cutely.AppCompatTextView_autoSizePresetSizes) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(beachfront.cutely.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            dovishness(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!preprohormone()) {
            this.f5504attabal = 0;
            return;
        }
        if (this.f5504attabal == 1) {
            if (!this.f5506competently) {
                DisplayMetrics displayMetrics = this.f5507cutely.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                cord(dimension2, dimension3, dimension);
            }
            adultoid();
        }
    }

    public final int marial(RectF rectF) {
        int length = this.f5505beachfront.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = 1;
        int i2 = length - 1;
        int i3 = 0;
        while (i <= i2) {
            int i4 = (i + i2) / 2;
            if (rotuma(this.f5505beachfront[i4], rectF)) {
                int i5 = i4 + 1;
                i3 = i;
                i = i5;
            } else {
                i3 = i4 - 1;
                i2 = i3;
            }
        }
        return this.f5505beachfront[i3];
    }

    public final void molybdenite(float f) {
        if (f != this.f5512taiyuan.getPaint().getTextSize()) {
            this.f5512taiyuan.getPaint().setTextSize(f);
            boolean zIsInLayout = this.f5512taiyuan.isInLayout();
            if (this.f5512taiyuan.getLayout() != null) {
                this.f5511saneness = false;
                try {
                    Method methodApical = apical("nullLayouts");
                    if (methodApical != null) {
                        methodApical.invoke(this.f5512taiyuan, null);
                    }
                } catch (Exception unused) {
                }
                if (zIsInLayout) {
                    this.f5512taiyuan.forceLayout();
                } else {
                    this.f5512taiyuan.requestLayout();
                }
                this.f5512taiyuan.invalidate();
            }
        }
    }

    public void monoploid(int[] iArr, int i) throws IllegalArgumentException {
        if (preprohormone()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f5507cutely.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.f5505beachfront = saneness(iArrCopyOf);
                if (!gintrap()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f5506competently = false;
            }
            if (adultoid()) {
                attabal();
            }
        }
    }

    public void polloi(int i) {
        if (preprohormone()) {
            if (i == 0) {
                dern();
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            }
            DisplayMetrics displayMetrics = this.f5507cutely.getResources().getDisplayMetrics();
            cord(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (adultoid()) {
                attabal();
            }
        }
    }

    public final boolean preprohormone() {
        return !(this.f5512taiyuan instanceof AppCompatEditText);
    }

    public final boolean rotuma(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f5512taiyuan.getText();
        TransformationMethod transformationMethod = this.f5512taiyuan.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f5512taiyuan)) != null) {
            text = transformation;
        }
        int maxLines = this.f5512taiyuan.getMaxLines();
        formularize(i);
        StaticLayout staticLayoutWireman = wireman(text, (Layout.Alignment) impassible(this.f5512taiyuan, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutWireman.getLineCount() <= maxLines && staticLayoutWireman.getLineEnd(staticLayoutWireman.getLineCount() - 1) == text.length())) && ((float) staticLayoutWireman.getHeight()) <= rectF.bottom;
    }

    public final int[] saneness(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public int[] taiyuan() {
        return this.f5505beachfront;
    }

    public boolean triweekly() {
        return preprohormone() && this.f5504attabal != 0;
    }

    public StaticLayout wireman(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        return attabal.attabal(charSequence, alignment, i, i2, this.f5512taiyuan, this.f5509impromptu, this.f5503apical);
    }
}
