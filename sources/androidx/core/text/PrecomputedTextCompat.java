package androidx.core.text;

import A.M;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public class PrecomputedTextCompat implements Spannable {

    public static class Api28Impl {
        public static Spannable a(PrecomputedText precomputedText) {
            return precomputedText;
        }
    }

    public static class PrecomputedTextFutureTask extends FutureTask<PrecomputedTextCompat> {

        public static class PrecomputedTextCallback implements Callable<PrecomputedTextCompat> {
            @Override // java.util.concurrent.Callable
            public final PrecomputedTextCompat call() {
                throw null;
            }
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i2) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i2, int i3, Class cls) {
        if (Build.VERSION.SDK_INT < 29) {
            throw null;
        }
        ((PrecomputedText) null).getSpans(i2, i3, cls);
        throw null;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        throw null;
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i2, int i3, Class cls) {
        throw null;
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw null;
        }
        ((PrecomputedText) null).removeSpan(obj);
        throw null;
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i2, int i3, int i4) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw null;
        }
        ((PrecomputedText) null).setSpan(obj, i2, i3, i4);
        throw null;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i3) {
        throw null;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        throw null;
    }

    public static final class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextPaint f4392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextDirectionHeuristic f4393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f4394c;
        public final int d;

        public static class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f4395a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f4396b;
        }

        public Params(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
            if (Build.VERSION.SDK_INT >= 29) {
                M.g(textPaint).setBreakStrategy(i2).setHyphenationFrequency(i3).setTextDirection(textDirectionHeuristic).build();
            }
            this.f4392a = textPaint;
            this.f4393b = textDirectionHeuristic;
            this.f4394c = i2;
            this.d = i3;
        }

        public final boolean a(Params params) {
            if (this.f4394c != params.f4394c || this.d != params.d) {
                return false;
            }
            TextPaint textPaint = this.f4392a;
            if (textPaint.getTextSize() != params.f4392a.getTextSize()) {
                return false;
            }
            float textScaleX = textPaint.getTextScaleX();
            TextPaint textPaint2 = params.f4392a;
            if (textScaleX != textPaint2.getTextScaleX() || textPaint.getTextSkewX() != textPaint2.getTextSkewX() || textPaint.getLetterSpacing() != textPaint2.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) || textPaint.getFlags() != textPaint2.getFlags() || !textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
                return false;
            }
            if (textPaint.getTypeface() == null) {
                return textPaint2.getTypeface() == null;
            }
            return textPaint.getTypeface().equals(textPaint2.getTypeface());
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return a(params) && this.f4393b == params.f4393b;
        }

        public final int hashCode() {
            TextPaint textPaint = this.f4392a;
            return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f4393b, Integer.valueOf(this.f4394c), Integer.valueOf(this.d));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder sb2 = new StringBuilder("textSize=");
            TextPaint textPaint = this.f4392a;
            sb2.append(textPaint.getTextSize());
            sb.append(sb2.toString());
            sb.append(", textScaleX=" + textPaint.getTextScaleX());
            sb.append(", textSkewX=" + textPaint.getTextSkewX());
            int i2 = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
            sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
            sb.append(", textLocale=" + textPaint.getTextLocales());
            sb.append(", typeface=" + textPaint.getTypeface());
            if (i2 >= 26) {
                sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f4393b);
            sb.append(", breakStrategy=" + this.f4394c);
            sb.append(", hyphenationFrequency=" + this.d);
            sb.append("}");
            return sb.toString();
        }

        public Params(PrecomputedText.Params params) {
            this.f4392a = params.getTextPaint();
            this.f4393b = params.getTextDirection();
            this.f4394c = params.getBreakStrategy();
            this.d = params.getHyphenationFrequency();
        }
    }
}
