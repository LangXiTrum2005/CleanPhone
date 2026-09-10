package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class TextDrawableHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f19347c;
    public float d;
    public final WeakReference f;
    public TextAppearance g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f19345a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextAppearanceFontCallback f19346b = new TextAppearanceFontCallback() { // from class: com.google.android.material.internal.TextDrawableHelper.1
        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public final void a(int i2) {
            TextDrawableHelper textDrawableHelper = TextDrawableHelper.this;
            textDrawableHelper.f19348e = true;
            TextDrawableDelegate textDrawableDelegate = (TextDrawableDelegate) textDrawableHelper.f.get();
            if (textDrawableDelegate != null) {
                textDrawableDelegate.a();
            }
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public final void b(Typeface typeface, boolean z2) {
            if (z2) {
                return;
            }
            TextDrawableHelper textDrawableHelper = TextDrawableHelper.this;
            textDrawableHelper.f19348e = true;
            TextDrawableDelegate textDrawableDelegate = (TextDrawableDelegate) textDrawableHelper.f.get();
            if (textDrawableDelegate != null) {
                textDrawableDelegate.a();
            }
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f19348e = true;

    public interface TextDrawableDelegate {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public TextDrawableHelper(TextDrawableDelegate textDrawableDelegate) {
        this.f = new WeakReference(null);
        this.f = new WeakReference(textDrawableDelegate);
    }

    public final float a(String str) {
        if (!this.f19348e) {
            return this.f19347c;
        }
        b(str);
        return this.f19347c;
    }

    public final void b(String str) {
        TextPaint textPaint = this.f19345a;
        this.f19347c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.f19348e = false;
    }

    public final void c(TextAppearance textAppearance, Context context) {
        if (this.g != textAppearance) {
            this.g = textAppearance;
            if (textAppearance != null) {
                TextPaint textPaint = this.f19345a;
                TextAppearanceFontCallback textAppearanceFontCallback = this.f19346b;
                textAppearance.f(context, textPaint, textAppearanceFontCallback);
                TextDrawableDelegate textDrawableDelegate = (TextDrawableDelegate) this.f.get();
                if (textDrawableDelegate != null) {
                    textPaint.drawableState = textDrawableDelegate.getState();
                }
                textAppearance.e(context, textPaint, textAppearanceFontCallback);
                this.f19348e = true;
            }
            TextDrawableDelegate textDrawableDelegate2 = (TextDrawableDelegate) this.f.get();
            if (textDrawableDelegate2 != null) {
                textDrawableDelegate2.a();
                textDrawableDelegate2.onStateChange(textDrawableDelegate2.getState());
            }
        }
    }
}
