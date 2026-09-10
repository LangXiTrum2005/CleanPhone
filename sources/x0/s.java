package x0;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Spannable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f53551a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Spannable f53552b;

    public s(Spannable spannable) {
        this.f53552b = spannable;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f53552b.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f53552b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f53552b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f53552b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f53552b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f53552b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i10, int i11, Class cls) {
        return this.f53552b.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f53552b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f53552b.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        Spannable spannable = this.f53552b;
        if (!this.f53551a && (spannable instanceof PrecomputedText)) {
            this.f53552b = new SpannableString(spannable);
        }
        this.f53551a = true;
        this.f53552b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        Spannable spannable = this.f53552b;
        if (!this.f53551a && (spannable instanceof PrecomputedText)) {
            this.f53552b = new SpannableString(spannable);
        }
        this.f53551a = true;
        this.f53552b.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return this.f53552b.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f53552b.toString();
    }
}
