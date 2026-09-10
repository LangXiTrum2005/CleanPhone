package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
final class StaticLayoutBuilderCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f19339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f19340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19341c;
    public int d;
    public boolean j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Layout.Alignment f19342e = Layout.Alignment.ALIGN_NORMAL;
    public int f = Integer.MAX_VALUE;
    public float g = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19343h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f19344i = true;
    public TextUtils.TruncateAt k = null;

    public static class StaticLayoutBuilderCompatException extends Exception {
    }

    public StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.f19339a = charSequence;
        this.f19340b = textPaint;
        this.f19341c = i2;
        this.d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f19339a == null) {
            this.f19339a = "";
        }
        int iMax = Math.max(0, this.f19341c);
        CharSequence charSequenceEllipsize = this.f19339a;
        int i2 = this.f;
        TextPaint textPaint = this.f19340b;
        if (i2 == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.k);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.d);
        this.d = iMin;
        if (this.j && this.f == 1) {
            this.f19342e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f19342e);
        builderObtain.setIncludePad(this.f19344i);
        builderObtain.setTextDirection(this.j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.k;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f);
        float f = this.g;
        if (f != 1.0f) {
            builderObtain.setLineSpacing(0.0f, f);
        }
        if (this.f > 1) {
            builderObtain.setHyphenationFrequency(this.f19343h);
        }
        return builderObtain.build();
    }
}
