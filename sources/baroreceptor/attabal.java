package baroreceptor;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import bubbles.dern;
import bubbles.formularize;
import bubbles.impassible;
import bubbles.marial;
import chinny.competently;
import chinny.impromptu;
import chinny.taiyuan;
import com.google.android.material.internal.adultoid;
import com.google.android.material.internal.rotuma;
import com.unity3d.services.UnityAdsConstants;
import phrasemonger.saneness;

/* JADX INFO: compiled from: TooltipDrawable.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal extends taiyuan implements adultoid.saneness {

    /* JADX INFO: renamed from: sensatory, reason: collision with root package name */
    public static final int f14911sensatory = formularize.Widget_MaterialComponents_Tooltip;

    /* JADX INFO: renamed from: underbelly, reason: collision with root package name */
    public static final int f14912underbelly = dern.tooltipStyle;

    /* JADX INFO: renamed from: clubfoot, reason: collision with root package name */
    public final Context f14913clubfoot;

    /* JADX INFO: renamed from: coffeecake, reason: collision with root package name */
    public boolean f14914coffeecake;

    /* JADX INFO: renamed from: coi, reason: collision with root package name */
    public float f14915coi;

    /* JADX INFO: renamed from: cultivated, reason: collision with root package name */
    public final View.OnLayoutChangeListener f14916cultivated;

    /* JADX INFO: renamed from: czestochowa, reason: collision with root package name */
    public float f14917czestochowa;

    /* JADX INFO: renamed from: dent, reason: collision with root package name */
    public final Paint.FontMetrics f14918dent;

    /* JADX INFO: renamed from: empress, reason: collision with root package name */
    public float f14919empress;

    /* JADX INFO: renamed from: itchy, reason: collision with root package name */
    public int f14920itchy;

    /* JADX INFO: renamed from: lerp, reason: collision with root package name */
    public int f14921lerp;

    /* JADX INFO: renamed from: lotta, reason: collision with root package name */
    public float f14922lotta;

    /* JADX INFO: renamed from: milliradian, reason: collision with root package name */
    public int f14923milliradian;

    /* JADX INFO: renamed from: nosophobia, reason: collision with root package name */
    public int f14924nosophobia;

    /* JADX INFO: renamed from: overspeculate, reason: collision with root package name */
    public CharSequence f14925overspeculate;

    /* JADX INFO: renamed from: permissivist, reason: collision with root package name */
    public final adultoid f14926permissivist;

    /* JADX INFO: renamed from: premeiotic, reason: collision with root package name */
    public final Rect f14927premeiotic;

    /* JADX INFO: renamed from: sayid, reason: collision with root package name */
    public float f14928sayid;

    /* JADX INFO: renamed from: timberyard, reason: collision with root package name */
    public int f14929timberyard;

    /* JADX INFO: renamed from: treadless, reason: collision with root package name */
    public int f14930treadless;

    /* JADX INFO: renamed from: baroreceptor.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TooltipDrawable.java */
    public class ViewOnLayoutChangeListenerC0127attabal implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC0127attabal() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            attabal.this.immediately(view);
        }
    }

    public attabal(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f14918dent = new Paint.FontMetrics();
        adultoid adultoidVar = new adultoid(this);
        this.f14926permissivist = adultoidVar;
        this.f14916cultivated = new ViewOnLayoutChangeListenerC0127attabal();
        this.f14927premeiotic = new Rect();
        this.f14922lotta = 1.0f;
        this.f14928sayid = 1.0f;
        this.f14919empress = 0.5f;
        this.f14915coi = 0.5f;
        this.f14917czestochowa = 1.0f;
        this.f14913clubfoot = context;
        adultoidVar.competently().density = context.getResources().getDisplayMetrics().density;
        adultoidVar.competently().setTextAlign(Paint.Align.CENTER);
    }

    public static attabal dhss(Context context, AttributeSet attributeSet, int i, int i2) {
        attabal attabalVar = new attabal(context, attributeSet, i, i2);
        attabalVar.homozygous(attributeSet, i, i2);
        return attabalVar;
    }

    private void homozygous(AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayTaiyuan = rotuma.taiyuan(this.f14913clubfoot, attributeSet, impassible.Tooltip, i, i2, new int[0]);
        this.f14921lerp = this.f14913clubfoot.getResources().getDimensionPixelSize(marial.mtrl_tooltip_arrowSize);
        boolean z = typedArrayTaiyuan.getBoolean(impassible.Tooltip_showMarker, true);
        this.f14914coffeecake = z;
        if (z) {
            setShapeAppearanceModel(polder().gintrap().molybdenite(vesuvio()).impassible());
        } else {
            this.f14921lerp = 0;
        }
        molet(typedArrayTaiyuan.getText(impassible.Tooltip_android_text));
        mullein.marial marialVarImpromptu = mullein.dern.impromptu(this.f14913clubfoot, typedArrayTaiyuan, impassible.Tooltip_android_textAppearance);
        if (marialVarImpromptu != null && typedArrayTaiyuan.hasValue(impassible.Tooltip_android_textColor)) {
            marialVarImpromptu.triweekly(mullein.dern.attabal(this.f14913clubfoot, typedArrayTaiyuan, impassible.Tooltip_android_textColor));
        }
        sakeen(marialVarImpromptu);
        nosophobia(ColorStateList.valueOf(typedArrayTaiyuan.getColor(impassible.Tooltip_backgroundTint, pyrope.attabal.taiyuan(monroe.dern.apical(pyrope.attabal.dern(this.f14913clubfoot, R.attr.colorBackground, attabal.class.getCanonicalName()), 229), monroe.dern.apical(pyrope.attabal.dern(this.f14913clubfoot, dern.colorOnBackground, attabal.class.getCanonicalName()), 153)))));
        picketboat(ColorStateList.valueOf(pyrope.attabal.dern(this.f14913clubfoot, dern.colorSurface, attabal.class.getCanonicalName())));
        this.f14929timberyard = typedArrayTaiyuan.getDimensionPixelSize(impassible.Tooltip_android_padding, 0);
        this.f14923milliradian = typedArrayTaiyuan.getDimensionPixelSize(impassible.Tooltip_android_minWidth, 0);
        this.f14930treadless = typedArrayTaiyuan.getDimensionPixelSize(impassible.Tooltip_android_minHeight, 0);
        this.f14920itchy = typedArrayTaiyuan.getDimensionPixelSize(impassible.Tooltip_android_layout_margin, 0);
        typedArrayTaiyuan.recycle();
    }

    private float technofreak() {
        this.f14926permissivist.competently().getFontMetrics(this.f14918dent);
        Paint.FontMetrics fontMetrics = this.f14918dent;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    @Override // com.google.android.material.internal.adultoid.saneness
    public void attabal() {
        invalidateSelf();
    }

    public final float attendance() {
        CharSequence charSequence = this.f14925overspeculate;
        return charSequence == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.f14926permissivist.impromptu(charSequence.toString());
    }

    public void deadwork(float f) {
        this.f14922lotta = f;
        this.f14928sayid = f;
        this.f14917czestochowa = saneness.saneness(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 0.19f, 1.0f, f);
        invalidateSelf();
    }

    @Override // chinny.taiyuan, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.save();
        float fHerdbook = herdbook();
        float f = (float) (-((((double) this.f14921lerp) * Math.sqrt(2.0d)) - ((double) this.f14921lerp)));
        canvas.scale(this.f14922lotta, this.f14928sayid, getBounds().left + (getBounds().width() * this.f14919empress), getBounds().top + (getBounds().height() * this.f14915coi));
        canvas.translate(fHerdbook, f);
        super.draw(canvas);
        mastfed(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.f14926permissivist.competently().getTextSize(), this.f14930treadless);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.f14929timberyard * 2) + attendance(), this.f14923milliradian);
    }

    public final float herdbook() {
        int i;
        if (((this.f14927premeiotic.right - getBounds().right) - this.f14924nosophobia) - this.f14920itchy < 0) {
            i = ((this.f14927premeiotic.right - getBounds().right) - this.f14924nosophobia) - this.f14920itchy;
        } else {
            if (((this.f14927premeiotic.left - getBounds().left) - this.f14924nosophobia) + this.f14920itchy <= 0) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            i = ((this.f14927premeiotic.left - getBounds().left) - this.f14924nosophobia) + this.f14920itchy;
        }
        return i;
    }

    public final void immediately(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.f14924nosophobia = iArr[0];
        view.getWindowVisibleDisplayFrame(this.f14927premeiotic);
    }

    public void lampshade(float f, float f2) {
        this.f14919empress = f;
        this.f14915coi = f2;
        invalidateSelf();
    }

    public void libyan(View view) {
        if (view == null) {
            return;
        }
        immediately(view);
        view.addOnLayoutChangeListener(this.f14916cultivated);
    }

    public final void mastfed(Canvas canvas) {
        if (this.f14925overspeculate == null) {
            return;
        }
        Rect bounds = getBounds();
        int iOutmarry = (int) outmarry(bounds);
        if (this.f14926permissivist.marial() != null) {
            this.f14926permissivist.competently().drawableState = getState();
            this.f14926permissivist.triweekly(this.f14913clubfoot);
            this.f14926permissivist.competently().setAlpha((int) (this.f14917czestochowa * 255.0f));
        }
        CharSequence charSequence = this.f14925overspeculate;
        canvas.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), iOutmarry, this.f14926permissivist.competently());
    }

    public void molet(CharSequence charSequence) {
        if (TextUtils.equals(this.f14925overspeculate, charSequence)) {
            return;
        }
        this.f14925overspeculate = charSequence;
        this.f14926permissivist.impassible(true);
        invalidateSelf();
    }

    @Override // chinny.taiyuan, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f14914coffeecake) {
            setShapeAppearanceModel(polder().gintrap().molybdenite(vesuvio()).impassible());
        }
    }

    @Override // chinny.taiyuan, android.graphics.drawable.Drawable, com.google.android.material.internal.adultoid.saneness
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public final float outmarry(Rect rect) {
        return rect.centerY() - technofreak();
    }

    public void sakeen(mullein.marial marialVar) {
        this.f14926permissivist.apical(marialVar, this.f14913clubfoot);
    }

    public void setterwort(View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.f14916cultivated);
    }

    public final competently vesuvio() {
        float f = -herdbook();
        float fWidth = (float) ((((double) getBounds().width()) - (((double) this.f14921lerp) * Math.sqrt(2.0d))) / 2.0d);
        return new chinny.formularize(new impromptu(this.f14921lerp), Math.min(Math.max(f, -fWidth), fWidth));
    }
}
