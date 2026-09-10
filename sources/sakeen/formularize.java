package sakeen;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import herdbook.monoploid;
import java.util.stream.IntStream;

/* JADX INFO: compiled from: UnprecomputeTextOnModificationSpannable.java */
/* JADX INFO: loaded from: classes.dex */
public class formularize implements Spannable {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public Spannable f37036arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public boolean f37037kowloon = false;

    /* JADX INFO: compiled from: UnprecomputeTextOnModificationSpannable.java */
    public static class attabal {
        public static IntStream attabal(CharSequence charSequence) {
            return charSequence.chars();
        }

        public static IntStream saneness(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* JADX INFO: compiled from: UnprecomputeTextOnModificationSpannable.java */
    public static class dern extends saneness {
        @Override // sakeen.formularize.saneness
        public boolean attabal(CharSequence charSequence) {
            return herdbook.saneness.attabal(charSequence) || (charSequence instanceof monoploid);
        }
    }

    /* JADX INFO: compiled from: UnprecomputeTextOnModificationSpannable.java */
    public static class saneness {
        public boolean attabal(CharSequence charSequence) {
            return charSequence instanceof monoploid;
        }
    }

    public formularize(Spannable spannable) {
        this.f37036arytenoidectomy = spannable;
    }

    public static saneness dern() {
        return Build.VERSION.SDK_INT < 28 ? new saneness() : new dern();
    }

    public final void attabal() {
        Spannable spannable = this.f37036arytenoidectomy;
        if (!this.f37037kowloon && dern().attabal(spannable)) {
            this.f37036arytenoidectomy = new SpannableString(spannable);
        }
        this.f37037kowloon = true;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f37036arytenoidectomy.charAt(i);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return attabal.attabal(this.f37036arytenoidectomy);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return attabal.saneness(this.f37036arytenoidectomy);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f37036arytenoidectomy.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f37036arytenoidectomy.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f37036arytenoidectomy.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return (T[]) this.f37036arytenoidectomy.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f37036arytenoidectomy.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f37036arytenoidectomy.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        attabal();
        this.f37036arytenoidectomy.removeSpan(obj);
    }

    public Spannable saneness() {
        return this.f37036arytenoidectomy;
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        attabal();
        this.f37036arytenoidectomy.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f37036arytenoidectomy.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f37036arytenoidectomy.toString();
    }

    public formularize(CharSequence charSequence) {
        this.f37036arytenoidectomy = new SpannableString(charSequence);
    }
}
