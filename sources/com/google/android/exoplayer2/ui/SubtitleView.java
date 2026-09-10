package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2391Ek;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2417Fk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2876Xc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2902Yc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.El0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5199za0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ug0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.XG;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SubtitleView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f810a;
    public C2902Yc b;
    public int c;
    public float d;
    public float e;
    public boolean f;
    public boolean g;
    public int h;
    public InterfaceC5199za0 i;
    public View j;

    public SubtitleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f810a = Collections.emptyList();
        this.b = C2902Yc.g;
        this.c = 0;
        this.d = 0.0533f;
        this.e = 0.08f;
        this.f = true;
        this.g = true;
        C2876Xc c2876Xc = new C2876Xc(context);
        this.i = c2876Xc;
        this.j = c2876Xc;
        addView(c2876Xc);
        this.h = 1;
    }

    private List<C2417Fk> getCuesWithStylingPreferencesApplied() {
        if (this.f && this.g) {
            return this.f810a;
        }
        ArrayList arrayList = new ArrayList(this.f810a.size());
        for (int i = 0; i < this.f810a.size(); i++) {
            C2391Ek c2391EkA = ((C2417Fk) this.f810a.get(i)).a();
            if (!this.f) {
                c2391EkA.n = false;
                CharSequence charSequence = c2391EkA.f3034a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        c2391EkA.f3034a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = c2391EkA.f3034a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof XG)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                AbstractC2995aW.k0(c2391EkA);
            } else if (!this.g) {
                AbstractC2995aW.k0(c2391EkA);
            }
            arrayList.add(c2391EkA.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (Ug0.f3833a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C2902Yc getUserCaptionStyle() {
        CaptioningManager captioningManager;
        C2902Yc c2902Yc;
        int i = Ug0.f3833a;
        C2902Yc c2902Yc2 = C2902Yc.g;
        if (i < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return c2902Yc2;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        if (i >= 21) {
            c2902Yc = new C2902Yc(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : ViewCompat.MEASURED_STATE_MASK, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        } else {
            c2902Yc = new C2902Yc(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
        }
        return c2902Yc;
    }

    private <T extends View & InterfaceC5199za0> void setView(T t) {
        removeView(this.j);
        View view = this.j;
        if (view instanceof El0) {
            ((El0) view).b.destroy();
        }
        this.j = t;
        this.i = t;
        addView(t);
    }

    public final void a() {
        setStyle(getUserCaptionStyle());
    }

    public final void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.i.a(getCuesWithStylingPreferencesApplied(), this.b, this.d, this.c, this.e);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.g = z;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f = z;
        c();
    }

    public void setBottomPaddingFraction(float f) {
        this.e = f;
        c();
    }

    public void setCues(@Nullable List<C2417Fk> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f810a = list;
        c();
    }

    public void setFractionalTextSize(float f) {
        this.c = 0;
        this.d = f;
        c();
    }

    public void setStyle(C2902Yc c2902Yc) {
        this.b = c2902Yc;
        c();
    }

    public void setViewType(int i) {
        if (this.h == i) {
            return;
        }
        if (i == 1) {
            setView(new C2876Xc(getContext()));
        } else {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            setView(new El0(getContext()));
        }
        this.h = i;
    }
}
