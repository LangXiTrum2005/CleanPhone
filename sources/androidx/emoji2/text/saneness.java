package androidx.emoji2.text;

import android.text.TextPaint;

/* JADX INFO: compiled from: DefaultGlyphChecker.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness implements dern.marial {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final ThreadLocal<StringBuilder> f10022saneness = new ThreadLocal<>();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final TextPaint f10023attabal;

    public saneness() {
        TextPaint textPaint = new TextPaint();
        this.f10023attabal = textPaint;
        textPaint.setTextSize(10.0f);
    }

    public static StringBuilder saneness() {
        ThreadLocal<StringBuilder> threadLocal = f10022saneness;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    @Override // androidx.emoji2.text.dern.marial
    public boolean attabal(CharSequence charSequence, int i, int i2, int i3) {
        StringBuilder sbSaneness = saneness();
        sbSaneness.setLength(0);
        while (i < i2) {
            sbSaneness.append(charSequence.charAt(i));
            i++;
        }
        return monroe.marial.attabal(this.f10023attabal, sbSaneness.toString());
    }
}
