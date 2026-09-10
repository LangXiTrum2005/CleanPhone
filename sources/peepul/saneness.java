package peepul;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.graphics.drawable.DrawableCompat;
import bubbles.competently;
import bubbles.impassible;
import chinny.beachfront;
import chinny.kowloon;
import chinny.marial;
import chinny.taiyuan;
import chinny.triweekly;
import com.google.android.gms.ads.AdSize;
import com.google.android.material.card.MaterialCardView;
import com.unity3d.services.UnityAdsConstants;
import gown.apical;
import polloi.dern;
import polloi.wireman;

/* JADX INFO: compiled from: MaterialCardViewHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class saneness {

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public static final Drawable f35142cord;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public static final double f35143preprohormone = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final TimeInterpolator f35144adultoid;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public ColorStateList f35145apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public LayerDrawable f35146arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final MaterialCardView f35147attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f35148beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f35149competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public Drawable f35150cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final taiyuan f35151dern;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final int f35152dovishness;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public ColorStateList f35153formularize;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public final int f35154gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public ValueAnimator f35155graveside;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public kowloon f35156impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f35157impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public Drawable f35158kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f35159marial;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public boolean f35160molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public taiyuan f35161monoploid;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public Drawable f35165taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public ColorStateList f35166triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final taiyuan f35167wireman;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Rect f35164saneness = new Rect();

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public boolean f35162polloi = false;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public float f35163rotuma = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: compiled from: MaterialCardViewHelper.java */
    public class attabal extends InsetDrawable {
        public attabal(Drawable drawable, int i, int i2, int i3, int i4) {
            super(drawable, i, i2, i3, i4);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        f35142cord = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public saneness(MaterialCardView materialCardView, AttributeSet attributeSet, int i, int i2) {
        this.f35147attabal = materialCardView;
        taiyuan taiyuanVar = new taiyuan(materialCardView.getContext(), attributeSet, i, i2);
        this.f35151dern = taiyuanVar;
        taiyuanVar.overspeculate(materialCardView.getContext());
        taiyuanVar.underbelly(-12303292);
        kowloon.saneness sanenessVarGintrap = taiyuanVar.polder().gintrap();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, wireman.CardView, i, dern.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(wireman.CardView_cardCornerRadius)) {
            sanenessVarGintrap.kowloon(typedArrayObtainStyledAttributes.getDimension(wireman.CardView_cardCornerRadius, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        }
        this.f35167wireman = new taiyuan();
        overspeculate(sanenessVarGintrap.impassible());
        this.f35144adultoid = apical.competently(materialCardView.getContext(), bubbles.dern.motionEasingLinearInterpolator, phrasemonger.saneness.f35307attabal);
        this.f35152dovishness = apical.beachfront(materialCardView.getContext(), bubbles.dern.motionDurationShort2, AdSize.MEDIUM_RECTANGLE_WIDTH);
        this.f35154gintrap = apical.beachfront(materialCardView.getContext(), bubbles.dern.motionDurationShort1, AdSize.MEDIUM_RECTANGLE_WIDTH);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void attabal(saneness sanenessVar, ValueAnimator valueAnimator) {
        sanenessVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        sanenessVar.f35150cutely.setAlpha((int) (255.0f * fFloatValue));
        sanenessVar.f35163rotuma = fFloatValue;
    }

    public float adultoid() {
        return this.f35151dern.yemenite();
    }

    public ColorStateList apical() {
        return this.f35151dern.oilcan();
    }

    public int arytenoidectomy() {
        return this.f35148beachfront;
    }

    public final float beachfront() {
        return (this.f35147attabal.getMaxCardElevation() * 1.5f) + (premeiotic() ? dern() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public void clubfoot(ColorStateList colorStateList) {
        if (this.f35166triweekly == colorStateList) {
            return;
        }
        this.f35166triweekly = colorStateList;
        lotta();
    }

    public final void coffeecake(Drawable drawable) {
        if (this.f35147attabal.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f35147attabal.getForeground()).setDrawable(drawable);
        } else {
            this.f35147attabal.setForeground(stratoscope(drawable));
        }
    }

    public final boolean competently() {
        return this.f35151dern.permissivist();
    }

    public int cord() {
        return this.f35157impromptu;
    }

    public void creditor(int i) {
        this.f35149competently = i;
        supplicat(this.f35147attabal.getMeasuredWidth(), this.f35147attabal.getMeasuredHeight());
    }

    public Rect cuirassed() {
        return this.f35164saneness;
    }

    public final boolean cultivated() {
        return this.f35147attabal.getPreventCornerOverlap() && !competently();
    }

    public taiyuan cutely() {
        return this.f35151dern;
    }

    public void dent(int i) {
        if (i == this.f35157impromptu) {
            return;
        }
        this.f35157impromptu = i;
        lotta();
    }

    public final float dern() {
        return Math.max(Math.max(wireman(this.f35156impassible.monoploid(), this.f35151dern.creditor()), wireman(this.f35156impassible.molybdenite(), this.f35151dern.starveling())), Math.max(wireman(this.f35156impassible.apical(), this.f35151dern.preprohormone()), wireman(this.f35156impassible.taiyuan(), this.f35151dern.rotuma())));
    }

    public ColorStateList dovishness() {
        return this.f35145apical;
    }

    public ColorStateList formularize() {
        return this.f35167wireman.oilcan();
    }

    public kowloon gintrap() {
        return this.f35156impassible;
    }

    public final float graveside() {
        return (this.f35147attabal.getPreventCornerOverlap() && this.f35147attabal.getUseCompatPadding()) ? (float) ((1.0d - f35143preprohormone) * ((double) this.f35147attabal.getCardViewRadius())) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public void grimness(boolean z) {
        saran(z, false);
    }

    public void hydrovane(int i) {
        this.f35148beachfront = i;
    }

    public Drawable impassible() {
        return this.f35150cutely;
    }

    public final Drawable impromptu() {
        this.f35161monoploid = new taiyuan(this.f35156impassible);
        return new RippleDrawable(this.f35145apical, null, this.f35161monoploid);
    }

    public void itchy() {
        this.f35151dern.lerp(this.f35147attabal.getCardElevation());
    }

    public void kattegat(TypedArray typedArray) {
        ColorStateList colorStateListAttabal = mullein.dern.attabal(this.f35147attabal.getContext(), typedArray, impassible.MaterialCardView_strokeColor);
        this.f35166triweekly = colorStateListAttabal;
        if (colorStateListAttabal == null) {
            this.f35166triweekly = ColorStateList.valueOf(-1);
        }
        this.f35157impromptu = typedArray.getDimensionPixelSize(impassible.MaterialCardView_strokeWidth, 0);
        boolean z = typedArray.getBoolean(impassible.MaterialCardView_android_checkable, false);
        this.f35160molybdenite = z;
        this.f35147attabal.setLongClickable(z);
        this.f35153formularize = mullein.dern.attabal(this.f35147attabal.getContext(), typedArray, impassible.MaterialCardView_checkedIconTint);
        privatdozent(mullein.dern.marial(this.f35147attabal.getContext(), typedArray, impassible.MaterialCardView_checkedIcon));
        hydrovane(typedArray.getDimensionPixelSize(impassible.MaterialCardView_checkedIconSize, 0));
        starveling(typedArray.getDimensionPixelSize(impassible.MaterialCardView_checkedIconMargin, 0));
        this.f35149competently = typedArray.getInteger(impassible.MaterialCardView_checkedIconGravity, MaterialCardView.CHECKED_ICON_GRAVITY_TOP_END);
        ColorStateList colorStateListAttabal2 = mullein.dern.attabal(this.f35147attabal.getContext(), typedArray, impassible.MaterialCardView_rippleColor);
        this.f35145apical = colorStateListAttabal2;
        if (colorStateListAttabal2 == null) {
            this.f35145apical = ColorStateList.valueOf(pyrope.attabal.wireman(this.f35147attabal, beachfront.attabal.colorControlHighlight));
        }
        polder(mullein.dern.attabal(this.f35147attabal.getContext(), typedArray, impassible.MaterialCardView_cardForegroundColor));
        nosophobia();
        itchy();
        lotta();
        this.f35147attabal.setBackgroundInternal(stratoscope(this.f35151dern));
        Drawable drawablePolloi = timberyard() ? polloi() : this.f35167wireman;
        this.f35165taiyuan = drawablePolloi;
        this.f35147attabal.setForeground(stratoscope(drawablePolloi));
    }

    public int kowloon() {
        return this.f35159marial;
    }

    public void lerp() {
        if (!trm()) {
            this.f35147attabal.setBackgroundInternal(stratoscope(this.f35151dern));
        }
        this.f35147attabal.setForeground(stratoscope(this.f35165taiyuan));
    }

    public void lotta() {
        this.f35167wireman.gusty(this.f35157impromptu, this.f35166triweekly);
    }

    public final float marial() {
        return this.f35147attabal.getMaxCardElevation() + (premeiotic() ? dern() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public void mathsort(float f) {
        this.f35151dern.lotta(f);
        taiyuan taiyuanVar = this.f35167wireman;
        if (taiyuanVar != null) {
            taiyuanVar.lotta(f);
        }
        taiyuan taiyuanVar2 = this.f35161monoploid;
        if (taiyuanVar2 != null) {
            taiyuanVar2.lotta(f);
        }
    }

    public void merc(ColorStateList colorStateList) {
        this.f35151dern.nosophobia(colorStateList);
    }

    public void milliradian() {
        Drawable drawable = this.f35165taiyuan;
        Drawable drawablePolloi = timberyard() ? polloi() : this.f35167wireman;
        this.f35165taiyuan = drawablePolloi;
        if (drawable != drawablePolloi) {
            coffeecake(drawablePolloi);
        }
    }

    public float molybdenite() {
        return this.f35151dern.creditor();
    }

    public ColorStateList monoploid() {
        return this.f35153formularize;
    }

    public final void nosophobia() {
        Drawable drawable = this.f35158kowloon;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(this.f35145apical);
        }
    }

    public boolean oilcan() {
        return this.f35160molybdenite;
    }

    public void overspeculate(kowloon kowloonVar) {
        this.f35156impassible = kowloonVar;
        this.f35151dern.setShapeAppearanceModel(kowloonVar);
        taiyuan taiyuanVar = this.f35151dern;
        taiyuanVar.sensatory(!taiyuanVar.permissivist());
        taiyuan taiyuanVar2 = this.f35167wireman;
        if (taiyuanVar2 != null) {
            taiyuanVar2.setShapeAppearanceModel(kowloonVar);
        }
        taiyuan taiyuanVar3 = this.f35161monoploid;
        if (taiyuanVar3 != null) {
            taiyuanVar3.setShapeAppearanceModel(kowloonVar);
        }
    }

    public void peridotite(float f) {
        overspeculate(this.f35156impassible.rotuma(f));
        this.f35165taiyuan.invalidateSelf();
        if (premeiotic() || cultivated()) {
            treadless();
        }
        if (premeiotic()) {
            lerp();
        }
    }

    public void permissivist(int i, int i2, int i3, int i4) {
        this.f35164saneness.set(i, i2, i3, i4);
        treadless();
    }

    public void polder(ColorStateList colorStateList) {
        taiyuan taiyuanVar = this.f35167wireman;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        taiyuanVar.nosophobia(colorStateList);
    }

    public final Drawable polloi() {
        if (this.f35158kowloon == null) {
            this.f35158kowloon = impromptu();
        }
        if (this.f35146arytenoidectomy == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f35158kowloon, this.f35167wireman, this.f35150cutely});
            this.f35146arytenoidectomy = layerDrawable;
            layerDrawable.setId(2, competently.mtrl_card_checked_layer_id);
        }
        return this.f35146arytenoidectomy;
    }

    public final boolean premeiotic() {
        return this.f35147attabal.getPreventCornerOverlap() && competently() && this.f35147attabal.getUseCompatPadding();
    }

    public ColorStateList preprohormone() {
        return this.f35166triweekly;
    }

    public void privatdozent(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = DrawableCompat.wrap(drawable).mutate();
            this.f35150cutely = drawableMutate;
            drawableMutate.setTintList(this.f35153formularize);
            grimness(this.f35147attabal.isChecked());
        } else {
            this.f35150cutely = f35142cord;
        }
        LayerDrawable layerDrawable = this.f35146arytenoidectomy;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(competently.mtrl_card_checked_layer_id, this.f35150cutely);
        }
    }

    public void restrictive(boolean z) {
        this.f35162polloi = z;
    }

    public int rotuma() {
        ColorStateList colorStateList = this.f35166triweekly;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public void saneness(boolean z) {
        float f = z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f2 = z ? 1.0f - this.f35163rotuma : this.f35163rotuma;
        ValueAnimator valueAnimator = this.f35155graveside;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f35155graveside = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f35163rotuma, f);
        this.f35155graveside = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: peepul.attabal
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                saneness.attabal(this.f35141attabal, valueAnimator2);
            }
        });
        this.f35155graveside.setInterpolator(this.f35144adultoid);
        this.f35155graveside.setDuration((long) ((z ? this.f35152dovishness : this.f35154gintrap) * f2));
        this.f35155graveside.start();
    }

    public void saran(boolean z, boolean z2) {
        Drawable drawable = this.f35150cutely;
        if (drawable != null) {
            if (z2) {
                saneness(z);
            } else {
                drawable.setAlpha(z ? 255 : 0);
                this.f35163rotuma = z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        }
    }

    public final boolean sealless() {
        return (this.f35149competently & 8388613) == 8388613;
    }

    public void seminary(boolean z) {
        this.f35160molybdenite = z;
    }

    public void splinterproof(ColorStateList colorStateList) {
        this.f35145apical = colorStateList;
        nosophobia();
    }

    public void starveling(int i) {
        this.f35159marial = i;
    }

    public final Drawable stratoscope(Drawable drawable) {
        int iCeil;
        int iCeil2;
        if (this.f35147attabal.getUseCompatPadding()) {
            iCeil2 = (int) Math.ceil(beachfront());
            iCeil = (int) Math.ceil(marial());
        } else {
            iCeil = 0;
            iCeil2 = 0;
        }
        return new attabal(drawable, iCeil, iCeil2, iCeil, iCeil2);
    }

    public void supplicat(int i, int i2) {
        int iCeil;
        int iCeil2;
        int i3;
        int i4;
        if (this.f35146arytenoidectomy != null) {
            if (this.f35147attabal.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(beachfront() * 2.0f);
                iCeil2 = (int) Math.ceil(marial() * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i5 = sealless() ? ((i - this.f35159marial) - this.f35148beachfront) - iCeil2 : this.f35159marial;
            int i6 = yemenite() ? this.f35159marial : ((i2 - this.f35159marial) - this.f35148beachfront) - iCeil;
            int i7 = sealless() ? this.f35159marial : ((i - this.f35159marial) - this.f35148beachfront) - iCeil2;
            int i8 = yemenite() ? ((i2 - this.f35159marial) - this.f35148beachfront) - iCeil : this.f35159marial;
            if (this.f35147attabal.getLayoutDirection() == 1) {
                i4 = i7;
                i3 = i5;
            } else {
                i3 = i7;
                i4 = i5;
            }
            this.f35146arytenoidectomy.setLayerInset(2, i4, i8, i3, i6);
        }
    }

    public void taiyuan() {
        Drawable drawable = this.f35158kowloon;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            this.f35158kowloon.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.f35158kowloon.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    public final boolean timberyard() {
        if (this.f35147attabal.isClickable()) {
            return true;
        }
        View view = this.f35147attabal;
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public void treadless() {
        int iDern = (int) (((cultivated() || premeiotic()) ? dern() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) - graveside());
        MaterialCardView materialCardView = this.f35147attabal;
        Rect rect = this.f35164saneness;
        materialCardView.setAncestorContentPadding(rect.left + iDern, rect.top + iDern, rect.right + iDern, rect.bottom + iDern);
    }

    public int triweekly() {
        return this.f35149competently;
    }

    public boolean trm() {
        return this.f35162polloi;
    }

    public void walach(ColorStateList colorStateList) {
        this.f35153formularize = colorStateList;
        Drawable drawable = this.f35150cutely;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    public final float wireman(marial marialVar, float f) {
        if (marialVar instanceof triweekly) {
            return (float) ((1.0d - f35143preprohormone) * ((double) f));
        }
        return marialVar instanceof beachfront ? f / 2.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final boolean yemenite() {
        return (this.f35149competently & 80) == 80;
    }
}
