package com.google.android.material.resources;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes4.dex */
public final class CancelableFontCallback extends TextAppearanceFontCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Typeface f19381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApplyFont f19382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19383c;

    public interface ApplyFont {
        void a(Typeface typeface);
    }

    public CancelableFontCallback(ApplyFont applyFont, Typeface typeface) {
        this.f19381a = typeface;
        this.f19382b = applyFont;
    }

    @Override // com.google.android.material.resources.TextAppearanceFontCallback
    public final void a(int i2) {
        if (this.f19383c) {
            return;
        }
        this.f19382b.a(this.f19381a);
    }

    @Override // com.google.android.material.resources.TextAppearanceFontCallback
    public final void b(Typeface typeface, boolean z2) {
        if (this.f19383c) {
            return;
        }
        this.f19382b.a(typeface);
    }
}
