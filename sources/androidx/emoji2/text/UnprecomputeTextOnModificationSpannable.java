package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.core.text.PrecomputedTextCompat;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
class UnprecomputeTextOnModificationSpannable implements Spannable {
    public boolean X = false;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Spannable f5002Y;

    public static class CharSequenceHelper_API24 {
    }

    public static class PrecomputedTextDetector {
        public boolean a(CharSequence charSequence) {
            return charSequence instanceof PrecomputedTextCompat;
        }
    }

    public static class PrecomputedTextDetector_28 extends PrecomputedTextDetector {
        @Override // androidx.emoji2.text.UnprecomputeTextOnModificationSpannable.PrecomputedTextDetector
        public final boolean a(CharSequence charSequence) {
            return b.y(charSequence) || (charSequence instanceof PrecomputedTextCompat);
        }
    }

    public UnprecomputeTextOnModificationSpannable(Spannable spannable) {
        this.f5002Y = spannable;
    }

    public final void a() {
        Spannable spannable = this.f5002Y;
        if (!this.X) {
            if ((Build.VERSION.SDK_INT < 28 ? new PrecomputedTextDetector() : new PrecomputedTextDetector_28()).a(spannable)) {
                this.f5002Y = new SpannableString(spannable);
            }
        }
        this.X = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i2) {
        return this.f5002Y.charAt(i2);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f5002Y.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f5002Y.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f5002Y.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f5002Y.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f5002Y.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i2, int i3, Class cls) {
        return this.f5002Y.getSpans(i2, i3, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f5002Y.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i2, int i3, Class cls) {
        return this.f5002Y.nextSpanTransition(i2, i3, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f5002Y.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i2, int i3, int i4) {
        a();
        this.f5002Y.setSpan(obj, i2, i3, i4);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i3) {
        return this.f5002Y.subSequence(i2, i3);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f5002Y.toString();
    }

    public UnprecomputeTextOnModificationSpannable(CharSequence charSequence) {
        this.f5002Y = new SpannableString(charSequence);
    }
}
