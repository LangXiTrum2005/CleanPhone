package androidx.media3.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.LanguageFeatureSpan;
import androidx.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {
    public List e0;
    public CaptionStyleCompat f0;
    public float g0;
    public float h0;
    public boolean i0;
    public boolean j0;
    public int k0;
    public Output l0;
    public View m0;

    public interface Output {
        void a(List list, CaptionStyleCompat captionStyleCompat, float f, float f2);
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewType {
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e0 = Collections.EMPTY_LIST;
        this.f0 = CaptionStyleCompat.g;
        this.g0 = 0.0533f;
        this.h0 = 0.08f;
        this.i0 = true;
        this.j0 = true;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context);
        this.l0 = canvasSubtitleOutput;
        this.m0 = canvasSubtitleOutput;
        addView(canvasSubtitleOutput);
        this.k0 = 1;
    }

    private List<Cue> getCuesWithStylingPreferencesApplied() {
        if (this.i0 && this.j0) {
            return this.e0;
        }
        ArrayList arrayList = new ArrayList(this.e0.size());
        for (int i2 = 0; i2 < this.e0.size(); i2++) {
            Cue.Builder builderA = ((Cue) this.e0.get(i2)).a();
            if (!this.i0) {
                builderA.f5611n = false;
                CharSequence charSequence = builderA.f5604a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        builderA.f5604a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = builderA.f5604a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof LanguageFeatureSpan)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                SubtitleViewUtils.a(builderA);
            } else if (!this.j0) {
                SubtitleViewUtils.a(builderA);
            }
            arrayList.add(builderA.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private CaptionStyleCompat getUserCaptionStyle() {
        CaptioningManager captioningManager;
        boolean zIsInEditMode = isInEditMode();
        CaptionStyleCompat captionStyleCompat = CaptionStyleCompat.g;
        if (zIsInEditMode || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return captionStyleCompat;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        if (Util.f5683a >= 21) {
            return new CaptionStyleCompat(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        }
        return new CaptionStyleCompat(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
    }

    private <T extends View & Output> void setView(T t) {
        removeView(this.m0);
        View view = this.m0;
        if (view instanceof WebViewSubtitleOutput) {
            ((WebViewSubtitleOutput) view).f0.destroy();
        }
        this.m0 = t;
        this.l0 = t;
        addView(t);
    }

    public final void a() {
        setStyle(getUserCaptionStyle());
    }

    public final void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.l0.a(getCuesWithStylingPreferencesApplied(), this.f0, this.g0, this.h0);
    }

    public void setApplyEmbeddedFontSizes(boolean z2) {
        this.j0 = z2;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z2) {
        this.i0 = z2;
        c();
    }

    public void setBottomPaddingFraction(float f) {
        this.h0 = f;
        c();
    }

    public void setCues(List<Cue> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.e0 = list;
        c();
    }

    public void setFractionalTextSize(float f) {
        this.g0 = f;
        c();
    }

    public void setStyle(CaptionStyleCompat captionStyleCompat) {
        this.f0 = captionStyleCompat;
        c();
    }

    public void setViewType(int i2) {
        if (this.k0 == i2) {
            return;
        }
        if (i2 == 1) {
            setView(new CanvasSubtitleOutput(getContext()));
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new WebViewSubtitleOutput(getContext()));
        }
        this.k0 = i2;
    }
}
