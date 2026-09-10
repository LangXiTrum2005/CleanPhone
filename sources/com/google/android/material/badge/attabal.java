package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import bubbles.apical;
import bubbles.dern;
import bubbles.formularize;
import chinny.kowloon;
import chinny.taiyuan;
import com.google.android.material.internal.adultoid;
import com.google.android.material.internal.rotuma;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import mullein.marial;

/* JADX INFO: compiled from: BadgeDrawable.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal extends Drawable implements adultoid.saneness {

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public static final int f19575stratoscope = formularize.Widget_MaterialComponents_Badge;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public static final int f19576trm = dern.badgeStyle;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public float f19577adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final taiyuan f19578arytenoidectomy;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public WeakReference<View> f19579cord;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public WeakReference<FrameLayout> f19580cuirassed;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public int f19581dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public float f19582gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public float f19583graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final WeakReference<Context> f19584kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final BadgeState f19585molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final adultoid f19586monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final Rect f19587polloi;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public float f19588preprohormone;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public float f19589rotuma;

    public attabal(Context context, int i, int i2, int i3, BadgeState.State state) {
        this.f19584kowloon = new WeakReference<>(context);
        rotuma.dern(context);
        this.f19587polloi = new Rect();
        adultoid adultoidVar = new adultoid(this);
        this.f19586monoploid = adultoidVar;
        adultoidVar.competently().setTextAlign(Paint.Align.CENTER);
        BadgeState badgeState = new BadgeState(context, i, i2, i3, state);
        this.f19585molybdenite = badgeState;
        this.f19578arytenoidectomy = new taiyuan(kowloon.saneness(context, stratoscope() ? badgeState.impassible() : badgeState.taiyuan(), stratoscope() ? badgeState.formularize() : badgeState.impromptu()).impassible());
        saran();
    }

    public static attabal beachfront(Context context, BadgeState.State state) {
        return new attabal(context, 0, f19576trm, f19575stratoscope, state);
    }

    public static void creditor(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    public static attabal marial(Context context) {
        return new attabal(context, 0, f19576trm, f19575stratoscope, null);
    }

    public BadgeState.State adultoid() {
        return this.f19585molybdenite.preprohormone();
    }

    public FrameLayout apical() {
        WeakReference<FrameLayout> weakReference = this.f19580cuirassed;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int arytenoidectomy() {
        return this.f19585molybdenite.dovishness();
    }

    @Override // com.google.android.material.internal.adultoid.saneness
    public void attabal() {
        invalidateSelf();
    }

    public final void competently(Canvas canvas) {
        String strImpromptu = impromptu();
        if (strImpromptu != null) {
            Rect rect = new Rect();
            this.f19586monoploid.competently().getTextBounds(strImpromptu, 0, strImpromptu.length(), rect);
            float fExactCenterY = this.f19577adultoid - rect.exactCenterY();
            canvas.drawText(strImpromptu, this.f19583graveside, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), this.f19586monoploid.competently());
        }
    }

    public final int cord() {
        int iPolloi = stratoscope() ? this.f19585molybdenite.polloi() : this.f19585molybdenite.molybdenite();
        if (this.f19585molybdenite.f19532apical == 1) {
            iPolloi += stratoscope() ? this.f19585molybdenite.f19536cutely : this.f19585molybdenite.f19542taiyuan;
        }
        return iPolloi + this.f19585molybdenite.saneness();
    }

    public final int cuirassed() {
        int iTrm = this.f19585molybdenite.trm();
        if (stratoscope()) {
            iTrm = this.f19585molybdenite.stratoscope();
            Context context = this.f19584kowloon.get();
            if (context != null) {
                iTrm = phrasemonger.saneness.dern(iTrm, iTrm - this.f19585molybdenite.graveside(), phrasemonger.saneness.saneness(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 0.3f, 1.0f, mullein.dern.beachfront(context) - 1.0f));
            }
        }
        if (this.f19585molybdenite.f19532apical == 0) {
            iTrm -= Math.round(this.f19588preprohormone);
        }
        return iTrm + this.f19585molybdenite.dern();
    }

    public CharSequence cutely() {
        if (!isVisible()) {
            return null;
        }
        if (oilcan()) {
            return rotuma();
        }
        return trm() ? molybdenite() : formularize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void dern(View view, View view2) {
        float y;
        float x;
        ViewParent parent;
        boolean z;
        FrameLayout frameLayoutApical = apical();
        if (frameLayoutApical == null) {
            float y2 = view.getY();
            x = view.getX();
            parent = view.getParent();
            y = y2;
        } else {
            y = 0.0f;
            x = 0.0f;
            parent = frameLayoutApical;
        }
        while (true) {
            z = parent instanceof View;
            if (!z || parent == view2) {
                break;
            }
            ViewParent parent2 = parent.getParent();
            if (!(parent2 instanceof ViewGroup) || ((ViewGroup) parent2).getClipChildren()) {
                break;
            }
            View view3 = (View) parent;
            y += view3.getY();
            x += view3.getX();
            parent = parent.getParent();
        }
        if (z) {
            float fPreprohormone = preprohormone(y);
            float fTriweekly = triweekly(x);
            View view4 = (View) parent;
            float fTaiyuan = taiyuan(view4.getHeight(), y);
            float fGraveside = graveside(view4.getWidth(), x);
            if (fPreprohormone < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.f19577adultoid += Math.abs(fPreprohormone);
            }
            if (fTriweekly < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.f19583graveside += Math.abs(fTriweekly);
            }
            if (fTaiyuan > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.f19577adultoid -= Math.abs(fTaiyuan);
            }
            if (fGraveside > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.f19583graveside -= Math.abs(fGraveside);
            }
        }
    }

    public String dovishness() {
        return this.f19585molybdenite.cord();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f19578arytenoidectomy.draw(canvas);
        if (stratoscope()) {
            competently(canvas);
        }
    }

    public final CharSequence formularize() {
        return this.f19585molybdenite.arytenoidectomy();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f19585molybdenite.wireman();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f19587polloi.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f19587polloi.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final String gintrap() {
        String strDovishness = dovishness();
        int iKowloon = kowloon();
        if (iKowloon == -2 || strDovishness == null || strDovishness.length() <= iKowloon) {
            return strDovishness;
        }
        Context context = this.f19584kowloon.get();
        if (context == null) {
            return "";
        }
        return String.format(context.getString(apical.m3_exceed_max_badge_text_suffix), strDovishness.substring(0, iKowloon - 1), "…");
    }

    public final float graveside(float f, float f2) {
        return ((this.f19583graveside + this.f19589rotuma) - f) + f2;
    }

    public final void grimness() {
        setVisible(this.f19585molybdenite.kattegat(), false);
    }

    public final void hydrovane() {
        Context context = this.f19584kowloon.get();
        WeakReference<View> weakReference = this.f19579cord;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f19587polloi);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.f19580cuirassed;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null) {
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        wireman(rect2, view);
        saneness.competently(this.f19587polloi, this.f19583graveside, this.f19577adultoid, this.f19589rotuma, this.f19588preprohormone);
        float f = this.f19582gintrap;
        if (f != -1.0f) {
            this.f19578arytenoidectomy.treadless(f);
        }
        if (rect.equals(this.f19587polloi)) {
            return;
        }
        this.f19578arytenoidectomy.setBounds(this.f19587polloi);
    }

    public int impassible() {
        return this.f19585molybdenite.molybdenite();
    }

    public final String impromptu() {
        if (oilcan()) {
            return gintrap();
        }
        if (trm()) {
            return polloi();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public final void kattegat() {
        this.f19586monoploid.formularize(true);
        restrictive();
        hydrovane();
        invalidateSelf();
    }

    public int kowloon() {
        return this.f19585molybdenite.adultoid();
    }

    public final void merc() {
        marial marialVar;
        Context context = this.f19584kowloon.get();
        if (context == null || this.f19586monoploid.marial() == (marialVar = new marial(context, this.f19585molybdenite.cuirassed()))) {
            return;
        }
        this.f19586monoploid.apical(marialVar, context);
        polder();
        hydrovane();
        invalidateSelf();
    }

    public final String molybdenite() {
        Context context;
        if (this.f19585molybdenite.monoploid() == 0 || (context = this.f19584kowloon.get()) == null) {
            return null;
        }
        return (this.f19581dovishness == -2 || monoploid() <= this.f19581dovishness) ? context.getResources().getQuantityString(this.f19585molybdenite.monoploid(), monoploid(), Integer.valueOf(monoploid())) : context.getString(this.f19585molybdenite.triweekly(), Integer.valueOf(this.f19581dovishness));
    }

    public int monoploid() {
        if (this.f19585molybdenite.oilcan()) {
            return this.f19585molybdenite.gintrap();
        }
        return 0;
    }

    public boolean oilcan() {
        return this.f19585molybdenite.yemenite();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.adultoid.saneness
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public final void polder() {
        this.f19586monoploid.competently().setColor(this.f19585molybdenite.cutely());
        invalidateSelf();
    }

    public final String polloi() {
        if (this.f19581dovishness == -2 || monoploid() <= this.f19581dovishness) {
            return NumberFormat.getInstance(this.f19585molybdenite.rotuma()).format(monoploid());
        }
        Context context = this.f19584kowloon.get();
        return context == null ? "" : String.format(this.f19585molybdenite.rotuma(), context.getString(apical.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f19581dovishness), "+");
    }

    public final float preprohormone(float f) {
        return (this.f19577adultoid - this.f19588preprohormone) + f;
    }

    public void privatdozent(int i) {
        BadgeState badgeState = this.f19585molybdenite;
        if (badgeState.f19538formularize != i) {
            badgeState.f19538formularize = i;
            hydrovane();
        }
    }

    public final void restrictive() {
        Context context = this.f19584kowloon.get();
        if (context == null) {
            return;
        }
        this.f19578arytenoidectomy.setShapeAppearanceModel(kowloon.saneness(context, stratoscope() ? this.f19585molybdenite.impassible() : this.f19585molybdenite.taiyuan(), stratoscope() ? this.f19585molybdenite.formularize() : this.f19585molybdenite.impromptu()).impassible());
        invalidateSelf();
    }

    public final CharSequence rotuma() {
        CharSequence charSequenceKowloon = this.f19585molybdenite.kowloon();
        return charSequenceKowloon != null ? charSequenceKowloon : dovishness();
    }

    public final void saneness(View view) {
        ViewParent viewParentApical = apical();
        if (viewParentApical == null) {
            viewParentApical = view.getParent();
        }
        if ((viewParentApical instanceof View) && (viewParentApical.getParent() instanceof View)) {
            dern(view, (View) viewParentApical.getParent());
        }
    }

    public final void saran() {
        restrictive();
        merc();
        seminary();
        kattegat();
        yemenite();
        sealless();
        polder();
        supplicat();
        hydrovane();
        grimness();
    }

    public final void sealless() {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(this.f19585molybdenite.marial());
        if (this.f19578arytenoidectomy.oilcan() != colorStateListValueOf) {
            this.f19578arytenoidectomy.nosophobia(colorStateListValueOf);
            invalidateSelf();
        }
    }

    public final void seminary() {
        walach();
        this.f19586monoploid.formularize(true);
        hydrovane();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f19585molybdenite.restrictive(i);
        yemenite();
    }

    public void starveling(View view, FrameLayout frameLayout) {
        this.f19579cord = new WeakReference<>(view);
        this.f19580cuirassed = new WeakReference<>(frameLayout);
        creditor(view);
        hydrovane();
        invalidateSelf();
    }

    public final boolean stratoscope() {
        return oilcan() || trm();
    }

    public final void supplicat() {
        WeakReference<View> weakReference = this.f19579cord;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = this.f19579cord.get();
        WeakReference<FrameLayout> weakReference2 = this.f19580cuirassed;
        starveling(view, weakReference2 != null ? weakReference2.get() : null);
    }

    public final float taiyuan(float f, float f2) {
        return ((this.f19577adultoid + this.f19588preprohormone) - f) + f2;
    }

    public final float triweekly(float f) {
        return (this.f19583graveside - this.f19589rotuma) + f;
    }

    public boolean trm() {
        return !this.f19585molybdenite.yemenite() && this.f19585molybdenite.oilcan();
    }

    public final void walach() {
        if (kowloon() != -2) {
            this.f19581dovishness = ((int) Math.pow(10.0d, ((double) kowloon()) - 1.0d)) - 1;
        } else {
            this.f19581dovishness = arytenoidectomy();
        }
    }

    public final void wireman(Rect rect, View view) {
        float f;
        float f2;
        float f3 = stratoscope() ? this.f19585molybdenite.f19543wireman : this.f19585molybdenite.f19537dern;
        this.f19582gintrap = f3;
        if (f3 != -1.0f) {
            this.f19589rotuma = f3;
            this.f19588preprohormone = f3;
        } else {
            this.f19589rotuma = Math.round((stratoscope() ? this.f19585molybdenite.f19535competently : this.f19585molybdenite.f19540marial) / 2.0f);
            this.f19588preprohormone = Math.round((stratoscope() ? this.f19585molybdenite.f19539impromptu : this.f19585molybdenite.f19534beachfront) / 2.0f);
        }
        if (stratoscope()) {
            String strImpromptu = impromptu();
            this.f19589rotuma = Math.max(this.f19589rotuma, (this.f19586monoploid.impromptu(strImpromptu) / 2.0f) + this.f19585molybdenite.competently());
            float fMax = Math.max(this.f19588preprohormone, (this.f19586monoploid.beachfront(strImpromptu) / 2.0f) + this.f19585molybdenite.apical());
            this.f19588preprohormone = fMax;
            this.f19589rotuma = Math.max(this.f19589rotuma, fMax);
        }
        int iCuirassed = cuirassed();
        int iBeachfront = this.f19585molybdenite.beachfront();
        if (iBeachfront == 8388691 || iBeachfront == 8388693) {
            this.f19577adultoid = rect.bottom - iCuirassed;
        } else {
            this.f19577adultoid = rect.top + iCuirassed;
        }
        int iCord = cord();
        int iBeachfront2 = this.f19585molybdenite.beachfront();
        if (iBeachfront2 == 8388659 || iBeachfront2 == 8388691) {
            if (this.f19585molybdenite.f19538formularize == 0) {
                f = view.getLayoutDirection() == 0 ? (rect.left + this.f19589rotuma) - ((this.f19588preprohormone * 2.0f) - iCord) : (rect.right - this.f19589rotuma) + ((this.f19588preprohormone * 2.0f) - iCord);
            } else {
                f = view.getLayoutDirection() == 0 ? (rect.left - this.f19589rotuma) + iCord : (rect.right + this.f19589rotuma) - iCord;
            }
            this.f19583graveside = f;
        } else {
            if (this.f19585molybdenite.f19538formularize == 0) {
                f2 = view.getLayoutDirection() == 0 ? (rect.right + this.f19589rotuma) - iCord : (rect.left - this.f19589rotuma) + iCord;
            } else {
                f2 = view.getLayoutDirection() == 0 ? (rect.right - this.f19589rotuma) + ((this.f19588preprohormone * 2.0f) - iCord) : (rect.left + this.f19589rotuma) - ((this.f19588preprohormone * 2.0f) - iCord);
            }
            this.f19583graveside = f2;
        }
        if (this.f19585molybdenite.sealless()) {
            saneness(view);
        } else {
            dern(view, null);
        }
    }

    public final void yemenite() {
        this.f19586monoploid.competently().setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
