package androidx.emoji2.text;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
class DefaultGlyphChecker implements EmojiCompat.GlyphChecker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f4959b = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f4960a;

    public DefaultGlyphChecker() {
        TextPaint textPaint = new TextPaint();
        this.f4960a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
