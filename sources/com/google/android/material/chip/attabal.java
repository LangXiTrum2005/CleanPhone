package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.graphics.drawable.TintAwareDrawable;
import bubbles.impassible;
import chinny.taiyuan;
import com.google.android.material.internal.adultoid;
import com.google.android.material.internal.cuirassed;
import com.google.android.material.internal.rotuma;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import mullein.dern;
import mullein.marial;
import org.objectweb.asm.Opcodes;
import strum.wireman;

/* JADX INFO: compiled from: ChipDrawable.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal extends taiyuan implements TintAwareDrawable, Drawable.Callback, adultoid.saneness {

    /* JADX INFO: renamed from: achondroplasia, reason: collision with root package name */
    public float f19929achondroplasia;

    /* JADX INFO: renamed from: attendance, reason: collision with root package name */
    public final adultoid f19930attendance;

    /* JADX INFO: renamed from: basify, reason: collision with root package name */
    public int f19931basify;

    /* JADX INFO: renamed from: cig, reason: collision with root package name */
    public TextUtils.TruncateAt f19932cig;

    /* JADX INFO: renamed from: claque, reason: collision with root package name */
    public float f19933claque;

    /* JADX INFO: renamed from: clubfoot, reason: collision with root package name */
    public ColorStateList f19934clubfoot;

    /* JADX INFO: renamed from: coffeecake, reason: collision with root package name */
    public ColorStateList f19935coffeecake;

    /* JADX INFO: renamed from: coi, reason: collision with root package name */
    public ColorStateList f19936coi;

    /* JADX INFO: renamed from: cosy, reason: collision with root package name */
    public boolean f19937cosy;

    /* JADX INFO: renamed from: cultivated, reason: collision with root package name */
    public ColorStateList f19938cultivated;

    /* JADX INFO: renamed from: czestochowa, reason: collision with root package name */
    public float f19939czestochowa;

    /* JADX INFO: renamed from: deadwork, reason: collision with root package name */
    public int f19940deadwork;

    /* JADX INFO: renamed from: demilitarize, reason: collision with root package name */
    public boolean f19941demilitarize;

    /* JADX INFO: renamed from: dent, reason: collision with root package name */
    public float f19942dent;

    /* JADX INFO: renamed from: dhss, reason: collision with root package name */
    public final Paint.FontMetrics f19943dhss;

    /* JADX INFO: renamed from: empress, reason: collision with root package name */
    public Drawable f19944empress;

    /* JADX INFO: renamed from: fastrack, reason: collision with root package name */
    public int[] f19945fastrack;

    /* JADX INFO: renamed from: gusty, reason: collision with root package name */
    public phrasemonger.taiyuan f19946gusty;

    /* JADX INFO: renamed from: hardpan, reason: collision with root package name */
    public float f19947hardpan;

    /* JADX INFO: renamed from: herdbook, reason: collision with root package name */
    public final Context f19948herdbook;

    /* JADX INFO: renamed from: homozygous, reason: collision with root package name */
    public int f19949homozygous;

    /* JADX INFO: renamed from: igbo, reason: collision with root package name */
    public ColorStateList f19950igbo;

    /* JADX INFO: renamed from: immediately, reason: collision with root package name */
    public boolean f19951immediately;

    /* JADX INFO: renamed from: itchy, reason: collision with root package name */
    public Drawable f19952itchy;

    /* JADX INFO: renamed from: julian, reason: collision with root package name */
    public float f19953julian;

    /* JADX INFO: renamed from: lampshade, reason: collision with root package name */
    public int f19954lampshade;

    /* JADX INFO: renamed from: lerp, reason: collision with root package name */
    public float f19955lerp;

    /* JADX INFO: renamed from: libyan, reason: collision with root package name */
    public int f19956libyan;

    /* JADX INFO: renamed from: licking, reason: collision with root package name */
    public ColorStateList f19957licking;

    /* JADX INFO: renamed from: lightstruck, reason: collision with root package name */
    public float f19958lightstruck;

    /* JADX INFO: renamed from: linendraper, reason: collision with root package name */
    public boolean f19959linendraper;

    /* JADX INFO: renamed from: lotta, reason: collision with root package name */
    public boolean f19960lotta;

    /* JADX INFO: renamed from: mastfed, reason: collision with root package name */
    public final Path f19961mastfed;

    /* JADX INFO: renamed from: microchemistry, reason: collision with root package name */
    public PorterDuff.Mode f19962microchemistry;

    /* JADX INFO: renamed from: milliradian, reason: collision with root package name */
    public CharSequence f19963milliradian;

    /* JADX INFO: renamed from: molet, reason: collision with root package name */
    public int f19964molet;

    /* JADX INFO: renamed from: monroe, reason: collision with root package name */
    public float f19965monroe;

    /* JADX INFO: renamed from: nosophobia, reason: collision with root package name */
    public boolean f19966nosophobia;

    /* JADX INFO: renamed from: osteal, reason: collision with root package name */
    public PorterDuffColorFilter f19967osteal;

    /* JADX INFO: renamed from: outmarry, reason: collision with root package name */
    public final Paint f19968outmarry;

    /* JADX INFO: renamed from: overspeculate, reason: collision with root package name */
    public ColorStateList f19969overspeculate;

    /* JADX INFO: renamed from: palmyra, reason: collision with root package name */
    public float f19970palmyra;

    /* JADX INFO: renamed from: permissivist, reason: collision with root package name */
    public float f19971permissivist;

    /* JADX INFO: renamed from: picketboat, reason: collision with root package name */
    public phrasemonger.taiyuan f19972picketboat;

    /* JADX INFO: renamed from: prefect, reason: collision with root package name */
    public ColorFilter f19973prefect;

    /* JADX INFO: renamed from: premeiotic, reason: collision with root package name */
    public float f19974premeiotic;

    /* JADX INFO: renamed from: preterite, reason: collision with root package name */
    public boolean f19975preterite;

    /* JADX INFO: renamed from: pruinose, reason: collision with root package name */
    public ColorStateList f19976pruinose;

    /* JADX INFO: renamed from: sakeen, reason: collision with root package name */
    public int f19977sakeen;

    /* JADX INFO: renamed from: sayid, reason: collision with root package name */
    public Drawable f19978sayid;

    /* JADX INFO: renamed from: sensatory, reason: collision with root package name */
    public CharSequence f19979sensatory;

    /* JADX INFO: renamed from: setterwort, reason: collision with root package name */
    public final PointF f19980setterwort;

    /* JADX INFO: renamed from: sultanate, reason: collision with root package name */
    public int f19981sultanate;

    /* JADX INFO: renamed from: tarboosh, reason: collision with root package name */
    public WeakReference<InterfaceC0298attabal> f19982tarboosh;

    /* JADX INFO: renamed from: technofreak, reason: collision with root package name */
    public final Paint f19983technofreak;

    /* JADX INFO: renamed from: tectonization, reason: collision with root package name */
    public int f19984tectonization;

    /* JADX INFO: renamed from: timberyard, reason: collision with root package name */
    public ColorStateList f19985timberyard;

    /* JADX INFO: renamed from: treadless, reason: collision with root package name */
    public boolean f19986treadless;

    /* JADX INFO: renamed from: unconsolidated, reason: collision with root package name */
    public float f19987unconsolidated;

    /* JADX INFO: renamed from: underbelly, reason: collision with root package name */
    public boolean f19988underbelly;

    /* JADX INFO: renamed from: vesuvio, reason: collision with root package name */
    public final RectF f19989vesuvio;

    /* JADX INFO: renamed from: wostteth, reason: collision with root package name */
    public Drawable f19990wostteth;

    /* JADX INFO: renamed from: stupefactive, reason: collision with root package name */
    public static final int[] f19928stupefactive = {R.attr.state_enabled};

    /* JADX INFO: renamed from: libya, reason: collision with root package name */
    public static final ShapeDrawable f19927libya = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: com.google.android.material.chip.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ChipDrawable.java */
    public interface InterfaceC0298attabal {
        void onChipDrawableSizeChange();
    }

    public attabal(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f19971permissivist = -1.0f;
        this.f19983technofreak = new Paint(1);
        this.f19943dhss = new Paint.FontMetrics();
        this.f19989vesuvio = new RectF();
        this.f19980setterwort = new PointF();
        this.f19961mastfed = new Path();
        this.f19984tectonization = 255;
        this.f19962microchemistry = PorterDuff.Mode.SRC_IN;
        this.f19982tarboosh = new WeakReference<>(null);
        overspeculate(context);
        this.f19948herdbook = context;
        adultoid adultoidVar = new adultoid(this);
        this.f19930attendance = adultoidVar;
        this.f19963milliradian = "";
        adultoidVar.competently().density = context.getResources().getDisplayMetrics().density;
        this.f19968outmarry = null;
        int[] iArr = f19928stupefactive;
        setState(iArr);
        disrupture(iArr);
        this.f19941demilitarize = true;
        f19927libya.setTint(-1);
    }

    public static boolean genii(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean hypokinesis(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static attabal libyan(Context context, AttributeSet attributeSet, int i, int i2) {
        attabal attabalVar = new attabal(context, attributeSet, i, i2);
        attabalVar.imparkation(attributeSet, i, i2);
        return attabalVar;
    }

    public static boolean murrine(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static boolean untruth(marial marialVar) {
        return (marialVar == null || marialVar.cutely() == null || !marialVar.cutely().isStateful()) ? false : true;
    }

    public boolean alloy() {
        return this.f19975preterite;
    }

    public final void apologetic() {
        this.f19976pruinose = this.f19937cosy ? appreciation.attabal.wireman(this.f19985timberyard) : null;
    }

    public void aristocrat(int i) {
        sulfarsenide(competently.attabal.attabal(this.f19948herdbook, i));
    }

    public void arugula(TextUtils.TruncateAt truncateAt) {
        this.f19932cig = truncateAt;
    }

    public void astrogate(ColorStateList colorStateList) {
        if (this.f19934clubfoot != colorStateList) {
            this.f19934clubfoot = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.internal.adultoid.saneness
    public void attabal() {
        brighton();
        invalidateSelf();
    }

    public final float attendance() {
        this.f19930attendance.competently().getFontMetrics(this.f19943dhss);
        Paint.FontMetrics fontMetrics = this.f19943dhss;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    public final boolean autoboat() {
        return this.f19960lotta && this.f19978sayid != null;
    }

    public void ayutthaya(float f) {
        if (this.f19939czestochowa != f) {
            this.f19939czestochowa = f;
            invalidateSelf();
            if (autoboat()) {
                brighton();
            }
        }
    }

    public void balance(boolean z) {
        if (this.f19988underbelly != z) {
            this.f19988underbelly = z;
            float fTechnofreak = technofreak();
            if (!z && this.f19951immediately) {
                this.f19951immediately = false;
            }
            float fTechnofreak2 = technofreak();
            invalidateSelf();
            if (fTechnofreak != fTechnofreak2) {
                brighton();
            }
        }
    }

    public final void basify(Canvas canvas, Rect rect) {
        if (this.f19959linendraper) {
            return;
        }
        this.f19983technofreak.setColor(this.f19949homozygous);
        this.f19983technofreak.setStyle(Paint.Style.FILL);
        this.f19989vesuvio.set(rect);
        canvas.drawRoundRect(this.f19989vesuvio, pruinose(), pruinose(), this.f19983technofreak);
    }

    public void bavaria(Drawable drawable) {
        if (this.f19990wostteth != drawable) {
            float fTechnofreak = technofreak();
            this.f19990wostteth = drawable;
            float fTechnofreak2 = technofreak();
            glutethimide(this.f19990wostteth);
            hardpan(this.f19990wostteth);
            invalidateSelf();
            if (fTechnofreak != fTechnofreak2) {
                brighton();
            }
        }
    }

    public void beclomethasone(boolean z) {
        if (this.f19937cosy != z) {
            this.f19937cosy = z;
            apologetic();
            onStateChange(getState());
        }
    }

    public void bleacherite(int i) {
        bavaria(competently.attabal.saneness(this.f19948herdbook, i));
    }

    public void blighty(phrasemonger.taiyuan taiyuanVar) {
        this.f19972picketboat = taiyuanVar;
    }

    public CharSequence bluecoat() {
        return this.f19963milliradian;
    }

    public void brighton() {
        InterfaceC0298attabal interfaceC0298attabal = this.f19982tarboosh.get();
        if (interfaceC0298attabal != null) {
            interfaceC0298attabal.onChipDrawableSizeChange();
        }
    }

    public Drawable cig() {
        Drawable drawable = this.f19952itchy;
        if (drawable != null) {
            return DrawableCompat.unwrap(drawable);
        }
        return null;
    }

    public float collection() {
        return this.f19953julian;
    }

    public ColorStateList cosy() {
        return this.f19934clubfoot;
    }

    public void crock(int i) {
        electropaint(this.f19948herdbook.getResources().getBoolean(i));
    }

    public void crosspiece(CharSequence charSequence) {
        if (this.f19979sensatory != charSequence) {
            this.f19979sensatory = herdbook.attabal.dern().impromptu(charSequence);
            invalidateSelf();
        }
    }

    public final float ctenidium() {
        Drawable drawable = this.f19951immediately ? this.f19990wostteth : this.f19952itchy;
        float fCeil = this.f19955lerp;
        if (fCeil <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && drawable != null) {
            fCeil = (float) Math.ceil(cuirassed.competently(this.f19948herdbook, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    public float cybernatic() {
        return this.f19929achondroplasia;
    }

    public final void deadwork(Canvas canvas, Rect rect) {
        if (trawler()) {
            herdbook(rect, this.f19989vesuvio);
            RectF rectF = this.f19989vesuvio;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f19990wostteth.setBounds(0, 0, (int) this.f19989vesuvio.width(), (int) this.f19989vesuvio.height());
            this.f19990wostteth.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    public float decarock() {
        return this.f19974premeiotic;
    }

    public float demilitarize() {
        return this.f19955lerp;
    }

    public final void dhss(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (autoboat()) {
            float f = this.f19947hardpan + this.f19933claque;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.f19939czestochowa;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.f19939czestochowa;
            }
            float fExactCenterY = rect.exactCenterY();
            float f4 = this.f19939czestochowa;
            float f5 = fExactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    public void diakinesis(int i) {
        transitional(this.f19948herdbook.getResources().getDimension(i));
    }

    public void dispope(int i) {
        inrooted(this.f19948herdbook.getResources().getBoolean(i));
    }

    public boolean disrupture(int[] iArr) {
        if (Arrays.equals(this.f19945fastrack, iArr)) {
            return false;
        }
        this.f19945fastrack = iArr;
        if (autoboat()) {
            return infiltration(getState(), iArr);
        }
        return false;
    }

    public void don(int i) {
        tractor(this.f19948herdbook.getResources().getDimension(i));
    }

    @Override // chinny.taiyuan, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Canvas canvas2;
        int iAttabal;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i = this.f19984tectonization;
        if (i < 255) {
            canvas2 = canvas;
            iAttabal = punish.attabal.attabal(canvas2, bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iAttabal = 0;
        }
        basify(canvas2, bounds);
        molet(canvas2, bounds);
        if (this.f19959linendraper) {
            super.draw(canvas2);
        }
        immediately(canvas2, bounds);
        prefect(canvas2, bounds);
        sakeen(canvas2, bounds);
        deadwork(canvas2, bounds);
        if (this.f19941demilitarize) {
            licking(canvas2, bounds);
        }
        tectonization(canvas2, bounds);
        osteal(canvas2, bounds);
        if (this.f19984tectonization < 255) {
            canvas2.restoreToCount(iAttabal);
        }
    }

    public void earstone(int i) {
        ferrovanadium(competently.attabal.attabal(this.f19948herdbook, i));
    }

    public void electropaint(boolean z) {
        if (this.f19975preterite != z) {
            boolean zTrawler = trawler();
            this.f19975preterite = z;
            boolean zTrawler2 = trawler();
            if (zTrawler != zTrawler2) {
                if (zTrawler2) {
                    hardpan(this.f19990wostteth);
                } else {
                    glutethimide(this.f19990wostteth);
                }
                invalidateSelf();
                brighton();
            }
        }
    }

    public boolean endosteum() {
        return this.f19941demilitarize;
    }

    public void energid(int i) {
        http(this.f19948herdbook.getResources().getDimension(i));
    }

    public void estragon(float f) {
        if (this.f19947hardpan != f) {
            this.f19947hardpan = f;
            invalidateSelf();
            brighton();
        }
    }

    public float ethene() {
        return this.f19965monroe;
    }

    public void euhemerize(ColorStateList colorStateList) {
        if (this.f19985timberyard != colorStateList) {
            this.f19985timberyard = colorStateList;
            apologetic();
            onStateChange(getState());
        }
    }

    public void eyepiece(float f) {
        if (this.f19955lerp != f) {
            float fTechnofreak = technofreak();
            this.f19955lerp = f;
            float fTechnofreak2 = technofreak();
            invalidateSelf();
            if (fTechnofreak != fTechnofreak2) {
                brighton();
            }
        }
    }

    public ColorStateList fastrack() {
        return this.f19950igbo;
    }

    public void ferrovanadium(ColorStateList colorStateList) {
        if (this.f19938cultivated != colorStateList) {
            this.f19938cultivated = colorStateList;
            if (this.f19959linendraper) {
                picketboat(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void galluses(int i) {
        mef(competently.attabal.saneness(this.f19948herdbook, i));
    }

    public void garter(int i) {
        eyepiece(this.f19948herdbook.getResources().getDimension(i));
    }

    @Override // chinny.taiyuan, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f19984tectonization;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f19973prefect;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f19942dent;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f19970palmyra + technofreak() + this.f19953julian + this.f19930attendance.impromptu(bluecoat().toString()) + this.f19929achondroplasia + setterwort() + this.f19947hardpan), this.f19981sultanate);
    }

    @Override // chinny.taiyuan, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // chinny.taiyuan, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Outline outline2;
        if (this.f19959linendraper) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f19971permissivist);
        } else {
            outline.setRoundRect(bounds, this.f19971permissivist);
            outline2 = outline;
        }
        outline2.setAlpha(getAlpha() / 255.0f);
    }

    public void ghoulish(int i) {
        estragon(this.f19948herdbook.getResources().getDimension(i));
    }

    public final void glutethimide(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void gondola(float f) {
        marial marialVarHarlequinade = harlequinade();
        if (marialVarHarlequinade != null) {
            marialVarHarlequinade.kowloon(f);
            this.f19930attendance.competently().setTextSize(f);
            attabal();
        }
    }

    public final void goonda(ColorStateList colorStateList) {
        if (this.f19969overspeculate != colorStateList) {
            this.f19969overspeculate = colorStateList;
            onStateChange(getState());
        }
    }

    public final void hardpan(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        DrawableCompat.setLayoutDirection(drawable, DrawableCompat.getLayoutDirection(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f19978sayid) {
            if (drawable.isStateful()) {
                drawable.setState(incorrectly());
            }
            drawable.setTintList(this.f19936coi);
            return;
        }
        Drawable drawable2 = this.f19952itchy;
        if (drawable == drawable2 && this.f19966nosophobia) {
            drawable2.setTintList(this.f19935coffeecake);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public marial harlequinade() {
        return this.f19930attendance.marial();
    }

    public final boolean hemolysin() {
        return this.f19986treadless && this.f19952itchy != null;
    }

    public final void herdbook(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (hemolysin() || trawler()) {
            float f = this.f19970palmyra + this.f19958lightstruck;
            float fRajahship = rajahship();
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + fRajahship;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - fRajahship;
            }
            float fCtenidium = ctenidium();
            float fExactCenterY = rect.exactCenterY() - (fCtenidium / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCtenidium;
        }
    }

    public boolean homophylic() {
        return this.f19937cosy;
    }

    public Paint.Align homozygous(Rect rect, PointF pointF) {
        pointF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f19963milliradian != null) {
            float fTechnofreak = this.f19970palmyra + technofreak() + this.f19953julian;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                pointF.x = rect.left + fTechnofreak;
            } else {
                pointF.x = rect.right - fTechnofreak;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - attendance();
        }
        return align;
    }

    public void http(float f) {
        if (this.f19933claque != f) {
            this.f19933claque = f;
            invalidateSelf();
            if (autoboat()) {
                brighton();
            }
        }
    }

    public ColorStateList hyalinization() {
        return this.f19936coi;
    }

    public void hydrated(int i) {
        rotissomat(phrasemonger.taiyuan.wireman(this.f19948herdbook, i));
    }

    public void hydrofracturing(float f) {
        if (this.f19958lightstruck != f) {
            float fTechnofreak = technofreak();
            this.f19958lightstruck = f;
            float fTechnofreak2 = technofreak();
            invalidateSelf();
            if (fTechnofreak != fTechnofreak2) {
                brighton();
            }
        }
    }

    public ColorStateList hydromechanics() {
        return this.f19985timberyard;
    }

    public void iconoclasm(int i) {
        wittig(this.f19948herdbook.getResources().getDimension(i));
    }

    public final void immediately(Canvas canvas, Rect rect) {
        if (this.f19974premeiotic <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || this.f19959linendraper) {
            return;
        }
        this.f19983technofreak.setColor(this.f19940deadwork);
        this.f19983technofreak.setStyle(Paint.Style.STROKE);
        if (!this.f19959linendraper) {
            this.f19983technofreak.setColorFilter(likeable());
        }
        RectF rectF = this.f19989vesuvio;
        float f = rect.left;
        float f2 = this.f19974premeiotic;
        rectF.set(f + (f2 / 2.0f), rect.top + (f2 / 2.0f), rect.right - (f2 / 2.0f), rect.bottom - (f2 / 2.0f));
        float f3 = this.f19971permissivist - (this.f19974premeiotic / 2.0f);
        canvas.drawRoundRect(this.f19989vesuvio, f3, f3, this.f19983technofreak);
    }

    public final void imparkation(AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayTaiyuan = rotuma.taiyuan(this.f19948herdbook, attributeSet, impassible.Chip, i, i2, new int[0]);
        this.f19959linendraper = typedArrayTaiyuan.hasValue(impassible.Chip_shapeAppearance);
        goonda(dern.attabal(this.f19948herdbook, typedArrayTaiyuan, impassible.Chip_chipSurfaceColor));
        astrogate(dern.attabal(this.f19948herdbook, typedArrayTaiyuan, impassible.Chip_chipBackgroundColor));
        wittig(typedArrayTaiyuan.getDimension(impassible.Chip_chipMinHeight, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        if (typedArrayTaiyuan.hasValue(impassible.Chip_chipCornerRadius)) {
            rsp(typedArrayTaiyuan.getDimension(impassible.Chip_chipCornerRadius, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        }
        ferrovanadium(dern.attabal(this.f19948herdbook, typedArrayTaiyuan, impassible.Chip_chipStrokeColor));
        weimar(typedArrayTaiyuan.getDimension(impassible.Chip_chipStrokeWidth, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        euhemerize(dern.attabal(this.f19948herdbook, typedArrayTaiyuan, impassible.Chip_rippleColor));
        utwa(typedArrayTaiyuan.getText(impassible.Chip_android_text));
        marial marialVarImpromptu = dern.impromptu(this.f19948herdbook, typedArrayTaiyuan, impassible.Chip_android_textAppearance);
        marialVarImpromptu.kowloon(typedArrayTaiyuan.getDimension(impassible.Chip_android_textSize, marialVarImpromptu.apical()));
        slumberous(marialVarImpromptu);
        int i3 = typedArrayTaiyuan.getInt(impassible.Chip_android_ellipsize, 0);
        if (i3 == 1) {
            arugula(TextUtils.TruncateAt.START);
        } else if (i3 == 2) {
            arugula(TextUtils.TruncateAt.MIDDLE);
        } else if (i3 == 3) {
            arugula(TextUtils.TruncateAt.END);
        }
        inrooted(typedArrayTaiyuan.getBoolean(impassible.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            inrooted(typedArrayTaiyuan.getBoolean(impassible.Chip_chipIconEnabled, false));
        }
        mef(dern.marial(this.f19948herdbook, typedArrayTaiyuan, impassible.Chip_chipIcon));
        if (typedArrayTaiyuan.hasValue(impassible.Chip_chipIconTint)) {
            sulfarsenide(dern.attabal(this.f19948herdbook, typedArrayTaiyuan, impassible.Chip_chipIconTint));
        }
        eyepiece(typedArrayTaiyuan.getDimension(impassible.Chip_chipIconSize, -1.0f));
        ocellation(typedArrayTaiyuan.getBoolean(impassible.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            ocellation(typedArrayTaiyuan.getBoolean(impassible.Chip_closeIconEnabled, false));
        }
        interweave(dern.marial(this.f19948herdbook, typedArrayTaiyuan, impassible.Chip_closeIcon));
        kabul(dern.attabal(this.f19948herdbook, typedArrayTaiyuan, impassible.Chip_closeIconTint));
        ayutthaya(typedArrayTaiyuan.getDimension(impassible.Chip_closeIconSize, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        balance(typedArrayTaiyuan.getBoolean(impassible.Chip_android_checkable, false));
        electropaint(typedArrayTaiyuan.getBoolean(impassible.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            electropaint(typedArrayTaiyuan.getBoolean(impassible.Chip_checkedIconEnabled, false));
        }
        bavaria(dern.marial(this.f19948herdbook, typedArrayTaiyuan, impassible.Chip_checkedIcon));
        if (typedArrayTaiyuan.hasValue(impassible.Chip_checkedIconTint)) {
            strother(dern.attabal(this.f19948herdbook, typedArrayTaiyuan, impassible.Chip_checkedIconTint));
        }
        rotissomat(phrasemonger.taiyuan.dern(this.f19948herdbook, typedArrayTaiyuan, impassible.Chip_showMotionSpec));
        blighty(phrasemonger.taiyuan.dern(this.f19948herdbook, typedArrayTaiyuan, impassible.Chip_hideMotionSpec));
        premed(typedArrayTaiyuan.getDimension(impassible.Chip_chipStartPadding, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        hydrofracturing(typedArrayTaiyuan.getDimension(impassible.Chip_iconStartPadding, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        redevelopment(typedArrayTaiyuan.getDimension(impassible.Chip_iconEndPadding, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        terni(typedArrayTaiyuan.getDimension(impassible.Chip_textStartPadding, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        tractor(typedArrayTaiyuan.getDimension(impassible.Chip_textEndPadding, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        transitional(typedArrayTaiyuan.getDimension(impassible.Chip_closeIconStartPadding, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        http(typedArrayTaiyuan.getDimension(impassible.Chip_closeIconEndPadding, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        estragon(typedArrayTaiyuan.getDimension(impassible.Chip_chipEndPadding, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        inswinger(typedArrayTaiyuan.getDimensionPixelSize(impassible.Chip_android_maxWidth, Integer.MAX_VALUE));
        typedArrayTaiyuan.recycle();
    }

    public int[] incorrectly() {
        return this.f19945fastrack;
    }

    public final boolean infiltration(int[] iArr, int[] iArr2) {
        boolean z;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f19969overspeculate;
        int iMonoploid = monoploid(colorStateList != null ? colorStateList.getColorForState(iArr, this.f19949homozygous) : 0);
        boolean state = true;
        if (this.f19949homozygous != iMonoploid) {
            this.f19949homozygous = iMonoploid;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.f19934clubfoot;
        int iMonoploid2 = monoploid(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f19954lampshade) : 0);
        if (this.f19954lampshade != iMonoploid2) {
            this.f19954lampshade = iMonoploid2;
            zOnStateChange = true;
        }
        int iTaiyuan = pyrope.attabal.taiyuan(iMonoploid, iMonoploid2);
        if ((this.f19956libyan != iTaiyuan) | (oilcan() == null)) {
            this.f19956libyan = iTaiyuan;
            nosophobia(ColorStateList.valueOf(iTaiyuan));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f19938cultivated;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f19940deadwork) : 0;
        if (this.f19940deadwork != colorForState) {
            this.f19940deadwork = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f19976pruinose == null || !appreciation.attabal.marial(iArr)) ? 0 : this.f19976pruinose.getColorForState(iArr, this.f19964molet);
        if (this.f19964molet != colorForState2) {
            this.f19964molet = colorForState2;
            if (this.f19937cosy) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.f19930attendance.marial() == null || this.f19930attendance.marial().cutely() == null) ? 0 : this.f19930attendance.marial().cutely().getColorForState(iArr, this.f19977sakeen);
        if (this.f19977sakeen != colorForState3) {
            this.f19977sakeen = colorForState3;
            zOnStateChange = true;
        }
        boolean z2 = genii(getState(), R.attr.state_checked) && this.f19988underbelly;
        if (this.f19951immediately == z2 || this.f19990wostteth == null) {
            z = false;
        } else {
            float fTechnofreak = technofreak();
            this.f19951immediately = z2;
            if (fTechnofreak != technofreak()) {
                zOnStateChange = true;
                z = true;
            } else {
                z = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f19957licking;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f19931basify) : 0;
        if (this.f19931basify != colorForState4) {
            this.f19931basify = colorForState4;
            this.f19967osteal = wireman.kowloon(this, this.f19957licking, this.f19962microchemistry);
        } else {
            state = zOnStateChange;
        }
        if (murrine(this.f19952itchy)) {
            state |= this.f19952itchy.setState(iArr);
        }
        if (murrine(this.f19990wostteth)) {
            state |= this.f19990wostteth.setState(iArr);
        }
        if (murrine(this.f19978sayid)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f19978sayid.setState(iArr3);
        }
        if (murrine(this.f19944empress)) {
            state |= this.f19944empress.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z) {
            brighton();
        }
        return state;
    }

    public void inrooted(boolean z) {
        if (this.f19986treadless != z) {
            boolean zHemolysin = hemolysin();
            this.f19986treadless = z;
            boolean zHemolysin2 = hemolysin();
            if (zHemolysin != zHemolysin2) {
                if (zHemolysin2) {
                    hardpan(this.f19952itchy);
                } else {
                    glutethimide(this.f19952itchy);
                }
                invalidateSelf();
                brighton();
            }
        }
    }

    public void inswinger(int i) {
        this.f19981sultanate = i;
    }

    public void interweave(Drawable drawable) {
        Drawable drawableTailoring = tailoring();
        if (drawableTailoring != drawable) {
            float f = setterwort();
            this.f19978sayid = drawable != null ? DrawableCompat.wrap(drawable).mutate() : null;
            speck();
            float f2 = setterwort();
            glutethimide(drawableTailoring);
            if (autoboat()) {
                hardpan(this.f19978sayid);
            }
            invalidateSelf();
            if (f != f2) {
                brighton();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void irani(int i) {
        astrogate(competently.attabal.attabal(this.f19948herdbook, i));
    }

    @Override // chinny.taiyuan, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (hypokinesis(this.f19969overspeculate) || hypokinesis(this.f19934clubfoot) || hypokinesis(this.f19938cultivated)) {
            return true;
        }
        return (this.f19937cosy && hypokinesis(this.f19976pruinose)) || untruth(this.f19930attendance.marial()) || lampshade() || murrine(this.f19952itchy) || murrine(this.f19990wostteth) || hypokinesis(this.f19957licking);
    }

    public void kabul(ColorStateList colorStateList) {
        if (this.f19936coi != colorStateList) {
            this.f19936coi = colorStateList;
            if (autoboat()) {
                this.f19978sayid.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void kinesic(int i) {
        blighty(phrasemonger.taiyuan.wireman(this.f19948herdbook, i));
    }

    public void lamplit(int i) {
        hydrofracturing(this.f19948herdbook.getResources().getDimension(i));
    }

    public final boolean lampshade() {
        return this.f19975preterite && this.f19990wostteth != null && this.f19988underbelly;
    }

    public CharSequence liable() {
        return this.f19979sensatory;
    }

    public ColorStateList libya() {
        return this.f19938cultivated;
    }

    public final void licking(Canvas canvas, Rect rect) {
        if (this.f19963milliradian != null) {
            Paint.Align alignHomozygous = homozygous(rect, this.f19980setterwort);
            mastfed(rect, this.f19989vesuvio);
            if (this.f19930attendance.marial() != null) {
                this.f19930attendance.competently().drawableState = getState();
                this.f19930attendance.triweekly(this.f19948herdbook);
            }
            this.f19930attendance.competently().setTextAlign(alignHomozygous);
            int iSave = 0;
            boolean z = Math.round(this.f19930attendance.impromptu(bluecoat().toString())) > Math.round(this.f19989vesuvio.width());
            if (z) {
                iSave = canvas.save();
                canvas.clipRect(this.f19989vesuvio);
            }
            CharSequence charSequenceEllipsize = this.f19963milliradian;
            if (z && this.f19932cig != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f19930attendance.competently(), this.f19989vesuvio.width(), this.f19932cig);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.f19980setterwort;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.f19930attendance.competently());
            if (z) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    public final ColorFilter likeable() {
        ColorFilter colorFilter = this.f19973prefect;
        return colorFilter != null ? colorFilter : this.f19967osteal;
    }

    public float linendraper() {
        return this.f19942dent;
    }

    public boolean livable() {
        return murrine(this.f19978sayid);
    }

    public void maggot(int i) {
        terni(this.f19948herdbook.getResources().getDimension(i));
    }

    public final void mastfed(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f19963milliradian != null) {
            float fTechnofreak = this.f19970palmyra + technofreak() + this.f19953julian;
            float f = this.f19947hardpan + setterwort() + this.f19929achondroplasia;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                rectF.left = rect.left + fTechnofreak;
                rectF.right = rect.right - f;
            } else {
                rectF.left = rect.left + f;
                rectF.right = rect.right - fTechnofreak;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public void mef(Drawable drawable) {
        Drawable drawableCig = cig();
        if (drawableCig != drawable) {
            float fTechnofreak = technofreak();
            this.f19952itchy = drawable != null ? DrawableCompat.wrap(drawable).mutate() : null;
            float fTechnofreak2 = technofreak();
            glutethimide(drawableCig);
            if (hemolysin()) {
                hardpan(this.f19952itchy);
            }
            invalidateSelf();
            if (fTechnofreak != fTechnofreak2) {
                brighton();
            }
        }
    }

    public float microanalysis() {
        return this.f19958lightstruck;
    }

    public Drawable microchemistry() {
        return this.f19990wostteth;
    }

    public float miliaria() {
        return this.f19987unconsolidated;
    }

    public final void molet(Canvas canvas, Rect rect) {
        if (this.f19959linendraper) {
            return;
        }
        this.f19983technofreak.setColor(this.f19954lampshade);
        this.f19983technofreak.setStyle(Paint.Style.FILL);
        this.f19983technofreak.setColorFilter(likeable());
        this.f19989vesuvio.set(rect);
        canvas.drawRoundRect(this.f19989vesuvio, pruinose(), pruinose(), this.f19983technofreak);
    }

    public void montera(int i) {
        premed(this.f19948herdbook.getResources().getDimension(i));
    }

    public void nattier(int i) {
        balance(this.f19948herdbook.getResources().getBoolean(i));
    }

    public void nictation(int i) {
        slumberous(new marial(this.f19948herdbook, i));
    }

    public boolean nomenclative() {
        return this.f19960lotta;
    }

    public void notornis(int i) {
        weimar(this.f19948herdbook.getResources().getDimension(i));
    }

    public void ocellation(boolean z) {
        if (this.f19960lotta != z) {
            boolean zAutoboat = autoboat();
            this.f19960lotta = z;
            boolean zAutoboat2 = autoboat();
            if (zAutoboat != zAutoboat2) {
                if (zAutoboat2) {
                    hardpan(this.f19978sayid);
                } else {
                    glutethimide(this.f19978sayid);
                }
                invalidateSelf();
                brighton();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (hemolysin()) {
            zOnLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.f19952itchy, i);
        }
        if (trawler()) {
            zOnLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.f19990wostteth, i);
        }
        if (autoboat()) {
            zOnLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.f19978sayid, i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (hemolysin()) {
            zOnLevelChange |= this.f19952itchy.setLevel(i);
        }
        if (trawler()) {
            zOnLevelChange |= this.f19990wostteth.setLevel(i);
        }
        if (autoboat()) {
            zOnLevelChange |= this.f19978sayid.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // chinny.taiyuan, android.graphics.drawable.Drawable, com.google.android.material.internal.adultoid.saneness
    public boolean onStateChange(int[] iArr) {
        if (this.f19959linendraper) {
            super.onStateChange(iArr);
        }
        return infiltration(iArr, incorrectly());
    }

    public final void osteal(Canvas canvas, Rect rect) {
        Canvas canvas2;
        Paint paint = this.f19968outmarry;
        if (paint != null) {
            paint.setColor(monroe.dern.apical(-16777216, 127));
            canvas.drawRect(rect, this.f19968outmarry);
            if (hemolysin() || trawler()) {
                herdbook(rect, this.f19989vesuvio);
                canvas.drawRect(this.f19989vesuvio, this.f19968outmarry);
            }
            if (this.f19963milliradian != null) {
                canvas2 = canvas;
                canvas2.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f19968outmarry);
            } else {
                canvas2 = canvas;
            }
            if (autoboat()) {
                dhss(rect, this.f19989vesuvio);
                canvas2.drawRect(this.f19989vesuvio, this.f19968outmarry);
            }
            this.f19968outmarry.setColor(monroe.dern.apical(Opcodes.V_PREVIEW, 127));
            outmarry(rect, this.f19989vesuvio);
            canvas2.drawRect(this.f19989vesuvio, this.f19968outmarry);
            this.f19968outmarry.setColor(monroe.dern.apical(-16711936, 127));
            vesuvio(rect, this.f19989vesuvio);
            canvas2.drawRect(this.f19989vesuvio, this.f19968outmarry);
        }
    }

    public final void outmarry(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (autoboat()) {
            float f = this.f19947hardpan + this.f19933claque + this.f19939czestochowa + this.f19987unconsolidated + this.f19929achondroplasia;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                rectF.right = rect.right - f;
            } else {
                rectF.left = rect.left + f;
            }
        }
    }

    public void overassessment(int i) {
        interweave(competently.attabal.saneness(this.f19948herdbook, i));
    }

    public void pact(int i) {
        euhemerize(competently.attabal.attabal(this.f19948herdbook, i));
    }

    public boolean palewise() {
        return this.f19986treadless;
    }

    public void pedagogism(int i) {
        ayutthaya(this.f19948herdbook.getResources().getDimension(i));
    }

    public void philabeg(int i) {
        strother(competently.attabal.attabal(this.f19948herdbook, i));
    }

    public boolean polliwog(boolean z) {
        if (this.f19978sayid != null) {
            return disrupture(z ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : f19928stupefactive);
        }
        return false;
    }

    public phrasemonger.taiyuan polyfoil() {
        return this.f19946gusty;
    }

    public final void prefect(Canvas canvas, Rect rect) {
        this.f19983technofreak.setColor(this.f19964molet);
        this.f19983technofreak.setStyle(Paint.Style.FILL);
        this.f19989vesuvio.set(rect);
        if (!this.f19959linendraper) {
            canvas.drawRoundRect(this.f19989vesuvio, pruinose(), pruinose(), this.f19983technofreak);
        } else {
            formularize(new RectF(rect), this.f19961mastfed);
            super.adultoid(canvas, this.f19983technofreak, this.f19961mastfed, cord());
        }
    }

    public void premed(float f) {
        if (this.f19970palmyra != f) {
            this.f19970palmyra = f;
            invalidateSelf();
            brighton();
        }
    }

    public float pruinose() {
        return this.f19959linendraper ? creditor() : this.f19971permissivist;
    }

    public void puffin(RectF rectF) {
        vesuvio(getBounds(), rectF);
    }

    public final float rajahship() {
        Drawable drawable = this.f19951immediately ? this.f19990wostteth : this.f19952itchy;
        float f = this.f19955lerp;
        return (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || drawable == null) ? f : drawable.getIntrinsicWidth();
    }

    public void ramallah(int i) {
        redevelopment(this.f19948herdbook.getResources().getDimension(i));
    }

    public void redevelopment(float f) {
        if (this.f19965monroe != f) {
            float fTechnofreak = technofreak();
            this.f19965monroe = f;
            float fTechnofreak2 = technofreak();
            invalidateSelf();
            if (fTechnofreak != fTechnofreak2) {
                brighton();
            }
        }
    }

    public void rotissomat(phrasemonger.taiyuan taiyuanVar) {
        this.f19946gusty = taiyuanVar;
    }

    @Deprecated
    public void rsp(float f) {
        if (this.f19971permissivist != f) {
            this.f19971permissivist = f;
            setShapeAppearanceModel(polder().rotuma(f));
        }
    }

    public boolean saccharic() {
        return this.f19988underbelly;
    }

    public final void sakeen(Canvas canvas, Rect rect) {
        if (hemolysin()) {
            herdbook(rect, this.f19989vesuvio);
            RectF rectF = this.f19989vesuvio;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f19952itchy.setBounds(0, 0, (int) this.f19989vesuvio.width(), (int) this.f19989vesuvio.height());
            this.f19952itchy.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void sentimentalism(boolean z) {
        this.f19941demilitarize = z;
    }

    @Override // chinny.taiyuan, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f19984tectonization != i) {
            this.f19984tectonization = i;
            invalidateSelf();
        }
    }

    @Override // chinny.taiyuan, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f19973prefect != colorFilter) {
            this.f19973prefect = colorFilter;
            invalidateSelf();
        }
    }

    @Override // chinny.taiyuan, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f19957licking != colorStateList) {
            this.f19957licking = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // chinny.taiyuan, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f19962microchemistry != mode) {
            this.f19962microchemistry = mode;
            this.f19967osteal = wireman.kowloon(this, this.f19957licking, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (hemolysin()) {
            visible |= this.f19952itchy.setVisible(z, z2);
        }
        if (trawler()) {
            visible |= this.f19990wostteth.setVisible(z, z2);
        }
        if (autoboat()) {
            visible |= this.f19978sayid.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public float setterwort() {
        return autoboat() ? this.f19987unconsolidated + this.f19939czestochowa + this.f19933claque : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public void slumberous(marial marialVar) {
        this.f19930attendance.apical(marialVar, this.f19948herdbook);
    }

    public final void speck() {
        this.f19944empress = new RippleDrawable(appreciation.attabal.wireman(hydromechanics()), this.f19978sayid, f19927libya);
    }

    public void specky(int i) {
        kabul(competently.attabal.attabal(this.f19948herdbook, i));
    }

    public void strother(ColorStateList colorStateList) {
        if (this.f19950igbo != colorStateList) {
            this.f19950igbo = colorStateList;
            if (lampshade()) {
                this.f19990wostteth.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float stupefactive() {
        return this.f19970palmyra;
    }

    public void sulfarsenide(ColorStateList colorStateList) {
        this.f19966nosophobia = true;
        if (this.f19935coffeecake != colorStateList) {
            this.f19935coffeecake = colorStateList;
            if (hemolysin()) {
                this.f19952itchy.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public ColorStateList sultanate() {
        return this.f19935coffeecake;
    }

    public Drawable tailoring() {
        Drawable drawable = this.f19978sayid;
        if (drawable != null) {
            return DrawableCompat.unwrap(drawable);
        }
        return null;
    }

    public void talweg(InterfaceC0298attabal interfaceC0298attabal) {
        this.f19982tarboosh = new WeakReference<>(interfaceC0298attabal);
    }

    public float tarboosh() {
        return this.f19947hardpan;
    }

    public float technofreak() {
        return (hemolysin() || trawler()) ? this.f19958lightstruck + rajahship() + this.f19965monroe : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void tectonization(Canvas canvas, Rect rect) {
        if (autoboat()) {
            dhss(rect, this.f19989vesuvio);
            RectF rectF = this.f19989vesuvio;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f19978sayid.setBounds(0, 0, (int) this.f19989vesuvio.width(), (int) this.f19989vesuvio.height());
            this.f19944empress.setBounds(this.f19978sayid.getBounds());
            this.f19944empress.jumpToCurrentState();
            this.f19944empress.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    public void terni(float f) {
        if (this.f19953julian != f) {
            this.f19953julian = f;
            invalidateSelf();
            brighton();
        }
    }

    public TextUtils.TruncateAt tout() {
        return this.f19932cig;
    }

    public void tractor(float f) {
        if (this.f19929achondroplasia != f) {
            this.f19929achondroplasia = f;
            invalidateSelf();
            brighton();
        }
    }

    @Deprecated
    public void transformable(int i) {
        rsp(this.f19948herdbook.getResources().getDimension(i));
    }

    public void transitional(float f) {
        if (this.f19987unconsolidated != f) {
            this.f19987unconsolidated = f;
            invalidateSelf();
            if (autoboat()) {
                brighton();
            }
        }
    }

    public final boolean trawler() {
        return this.f19975preterite && this.f19990wostteth != null && this.f19951immediately;
    }

    public float twybill() {
        return this.f19939czestochowa;
    }

    public phrasemonger.taiyuan undecorated() {
        return this.f19972picketboat;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void utwa(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.f19963milliradian, charSequence)) {
            return;
        }
        this.f19963milliradian = charSequence;
        this.f19930attendance.impassible(true);
        invalidateSelf();
        brighton();
    }

    public final void vesuvio(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (autoboat()) {
            float f = this.f19947hardpan + this.f19933claque + this.f19939czestochowa + this.f19987unconsolidated + this.f19929achondroplasia;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                float f2 = rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public float vir() {
        return this.f19933claque;
    }

    public void weimar(float f) {
        if (this.f19974premeiotic != f) {
            this.f19974premeiotic = f;
            this.f19983technofreak.setStrokeWidth(f);
            if (this.f19959linendraper) {
                super.palmyra(f);
            }
            invalidateSelf();
        }
    }

    public void wittig(float f) {
        if (this.f19942dent != f) {
            this.f19942dent = f;
            invalidateSelf();
            brighton();
        }
    }
}
