package com.afollestad.materialdialogs.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4885vy;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public class MDButton extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f45a;
    public EnumC4885vy b;
    public final int c;
    public Drawable d;
    public Drawable e;

    public MDButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45a = false;
        this.c = context.getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin);
        this.b = EnumC4885vy.c;
    }

    public final void a(boolean z, boolean z2) {
        int iOrdinal;
        if (this.f45a != z || z2) {
            setGravity(z ? this.b.a() | 16 : 17);
            int i = 4;
            if (z && (iOrdinal = this.b.ordinal()) != 1) {
                i = iOrdinal != 2 ? 5 : 6;
            }
            setTextAlignment(i);
            setBackground(z ? this.d : this.e);
            if (z) {
                setPadding(this.c, getPaddingTop(), this.c, getPaddingBottom());
            }
            this.f45a = z;
        }
    }

    public void setAllCapsCompat(boolean z) {
        setAllCaps(z);
    }

    public void setDefaultSelector(Drawable drawable) {
        this.e = drawable;
        if (this.f45a) {
            return;
        }
        a(false, true);
    }

    public void setStackedGravity(EnumC4885vy enumC4885vy) {
        this.b = enumC4885vy;
    }

    public void setStackedSelector(Drawable drawable) {
        this.d = drawable;
        if (this.f45a) {
            a(true, true);
        }
    }
}
