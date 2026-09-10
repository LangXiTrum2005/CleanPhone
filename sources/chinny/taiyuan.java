package chinny;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.TintAwareDrawable;
import com.unity3d.services.UnityAdsConstants;
import java.util.BitSet;

/* JADX INFO: compiled from: MaterialShapeDrawable.java */
/* JADX INFO: loaded from: classes3.dex */
public class taiyuan extends Drawable implements TintAwareDrawable, polloi {

    /* JADX INFO: renamed from: mathsort, reason: collision with root package name */
    public static final Paint f15548mathsort;

    /* JADX INFO: renamed from: peridotite, reason: collision with root package name */
    public static final kowloon f15549peridotite = kowloon.attabal().monoploid(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).impassible();

    /* JADX INFO: renamed from: splinterproof, reason: collision with root package name */
    public static final marial[] f15550splinterproof;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public boolean f15551adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public dern f15552arytenoidectomy;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public final RectF f15553cord;

    /* JADX INFO: renamed from: creditor, reason: collision with root package name */
    public molet.formularize[] f15554creditor;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public final Region f15555cuirassed;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final Matrix f15556dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public final Path f15557gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public boolean f15558graveside;

    /* JADX INFO: renamed from: grimness, reason: collision with root package name */
    public boolean f15559grimness;

    /* JADX INFO: renamed from: hydrovane, reason: collision with root package name */
    public float[] f15560hydrovane;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public final arytenoidectomy f15561kattegat;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final kowloon.dern f15562kowloon;

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public int f15563merc;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final BitSet f15564molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final monoploid.competently[] f15565monoploid;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public final Paint f15566oilcan;

    /* JADX INFO: renamed from: polder, reason: collision with root package name */
    public final RectF f15567polder;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final monoploid.competently[] f15568polloi;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public final RectF f15569preprohormone;

    /* JADX INFO: renamed from: privatdozent, reason: collision with root package name */
    public molet.impassible f15570privatdozent;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
    public PorterDuffColorFilter f15571restrictive;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public final Path f15572rotuma;

    /* JADX INFO: renamed from: saran, reason: collision with root package name */
    public kowloon f15573saran;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public final arytenoidectomy.saneness f15574sealless;

    /* JADX INFO: renamed from: seminary, reason: collision with root package name */
    public boolean f15575seminary;

    /* JADX INFO: renamed from: starveling, reason: collision with root package name */
    public float[] f15576starveling;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public final Region f15577stratoscope;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public PorterDuffColorFilter f15578supplicat;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public final Paint f15579trm;

    /* JADX INFO: renamed from: walach, reason: collision with root package name */
    public wireman f15580walach;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public final nitroguanidine.attabal f15581yemenite;

    /* JADX INFO: compiled from: MaterialShapeDrawable.java */
    public class attabal implements kowloon.dern {
        public attabal() {
        }

        @Override // chinny.kowloon.dern
        public chinny.wireman attabal(chinny.wireman wiremanVar) {
            return wiremanVar instanceof impassible ? wiremanVar : new chinny.saneness(-taiyuan.this.grimness(), wiremanVar);
        }
    }

    /* JADX INFO: compiled from: MaterialShapeDrawable.java */
    public static class marial extends molet.taiyuan<taiyuan> {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f15606saneness;

        public marial(int i) {
            super("cornerSizeAtIndex" + i);
            this.f15606saneness = i;
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public float attabal(taiyuan taiyuanVar) {
            return taiyuanVar.f15576starveling != null ? taiyuanVar.f15576starveling[this.f15606saneness] : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public void saneness(taiyuan taiyuanVar, float f) {
            if (taiyuanVar.f15576starveling == null || taiyuanVar.f15576starveling[this.f15606saneness] == f) {
                return;
            }
            taiyuanVar.f15576starveling[this.f15606saneness] = f;
            if (taiyuanVar.f15580walach != null) {
                taiyuanVar.f15580walach.attabal(taiyuanVar.stratoscope());
            }
            taiyuanVar.invalidateSelf();
        }
    }

    /* JADX INFO: compiled from: MaterialShapeDrawable.java */
    public class saneness implements arytenoidectomy.saneness {
        public saneness() {
        }

        @Override // chinny.arytenoidectomy.saneness
        public void attabal(monoploid monoploidVar, Matrix matrix, int i) {
            taiyuan.this.f15564molybdenite.set(i, monoploidVar.marial());
            taiyuan.this.f15565monoploid[i] = monoploidVar.beachfront(matrix);
        }

        @Override // chinny.arytenoidectomy.saneness
        public void saneness(monoploid monoploidVar, Matrix matrix, int i) {
            taiyuan.this.f15564molybdenite.set(i + 4, monoploidVar.marial());
            taiyuan.this.f15568polloi[i] = monoploidVar.beachfront(matrix);
        }
    }

    /* JADX INFO: compiled from: MaterialShapeDrawable.java */
    public interface wireman {
        void attabal(float f);
    }

    static {
        int i = 0;
        Paint paint = new Paint(1);
        f15548mathsort = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        f15550splinterproof = new marial[4];
        while (true) {
            marial[] marialVarArr = f15550splinterproof;
            if (i >= marialVarArr.length) {
                return;
            }
            marialVarArr[i] = new marial(i);
            i++;
        }
    }

    public taiyuan() {
        this(new kowloon());
    }

    public static taiyuan polloi(Context context, float f, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(pyrope.attabal.dern(context, bubbles.dern.colorSurface, taiyuan.class.getSimpleName()));
        }
        taiyuan taiyuanVar = new taiyuan();
        taiyuanVar.overspeculate(context);
        taiyuanVar.nosophobia(colorStateList);
        taiyuanVar.lerp(f);
        return taiyuanVar;
    }

    public static int premeiotic(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    public final void achondroplasia() {
        this.f15573saran = polder().cord(this.f15562kowloon);
        float[] fArr = this.f15576starveling;
        if (fArr == null) {
            this.f15560hydrovane = null;
            return;
        }
        if (this.f15560hydrovane == null) {
            this.f15560hydrovane = new float[fArr.length];
        }
        float fGrimness = grimness();
        int i = 0;
        while (true) {
            float[] fArr2 = this.f15576starveling;
            if (i >= fArr2.length) {
                return;
            }
            this.f15560hydrovane[i] = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fArr2[i] - fGrimness);
            i++;
        }
    }

    public void adultoid(Canvas canvas, Paint paint, Path path, RectF rectF) {
        dovishness(canvas, paint, path, this.f15552arytenoidectomy.f15586attabal, this.f15576starveling, rectF);
    }

    public final void apical(RectF rectF, Path path) {
        formularize(rectF, path);
        if (this.f15552arytenoidectomy.f15584apical != 1.0f) {
            this.f15556dovishness.reset();
            Matrix matrix = this.f15556dovishness;
            float f = this.f15552arytenoidectomy.f15584apical;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f15556dovishness);
        }
        path.computeBounds(this.f15567polder, true);
    }

    public final PorterDuffColorFilter arytenoidectomy(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? cutely(paint, z) : kowloon(colorStateList, mode, z);
    }

    public final void claque() {
        float fWalach = walach();
        this.f15552arytenoidectomy.f15599molybdenite = (int) Math.ceil(0.75f * fWalach);
        this.f15552arytenoidectomy.f15594graveside = (int) Math.ceil(fWalach * 0.25f);
        unconsolidated();
        clubfoot();
    }

    public final void clubfoot() {
        super.invalidateSelf();
    }

    public void coffeecake(molet.impassible impassibleVar) {
        if (this.f15570privatdozent == impassibleVar) {
            return;
        }
        this.f15570privatdozent = impassibleVar;
        int i = 0;
        while (true) {
            molet.formularize[] formularizeVarArr = this.f15554creditor;
            if (i >= formularizeVarArr.length) {
                julian(getState(), true);
                invalidateSelf();
                return;
            } else {
                if (formularizeVarArr[i] == null) {
                    formularizeVarArr[i] = new molet.formularize(this, f15550splinterproof[i]);
                }
                this.f15554creditor[i].rotuma(new molet.impassible().beachfront(impassibleVar.attabal()).impromptu(impassibleVar.dern()));
                i++;
            }
        }
    }

    public void coi(Paint.Style style) {
        this.f15552arytenoidectomy.f15593gintrap = style;
        clubfoot();
    }

    public RectF cord() {
        this.f15569preprohormone.set(getBounds());
        return this.f15569preprohormone;
    }

    public float creditor() {
        float[] fArr = this.f15576starveling;
        return fArr != null ? fArr[3] : this.f15552arytenoidectomy.f15586attabal.polloi().attabal(cord());
    }

    public final RectF cuirassed() {
        this.f15553cord.set(cord());
        float fGrimness = grimness();
        this.f15553cord.inset(fGrimness, fGrimness);
        return this.f15553cord;
    }

    public final void cultivated(Canvas canvas) {
        if (peridotite()) {
            canvas.save();
            timberyard(canvas);
            if (!this.f15575seminary) {
                molybdenite(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.f15567polder.width() - getBounds().width());
            int iHeight = (int) (this.f15567polder.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f15567polder.width()) + (this.f15552arytenoidectomy.f15599molybdenite * 2) + iWidth, ((int) this.f15567polder.height()) + (this.f15552arytenoidectomy.f15599molybdenite * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f = (getBounds().left - this.f15552arytenoidectomy.f15599molybdenite) - iWidth;
            float f2 = (getBounds().top - this.f15552arytenoidectomy.f15599molybdenite) - iHeight;
            canvas2.translate(-f, -f2);
            molybdenite(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f, f2, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    public final PorterDuffColorFilter cutely(Paint paint, boolean z) {
        if (!z) {
            return null;
        }
        int color = paint.getColor();
        int iMonoploid = monoploid(color);
        this.f15563merc = iMonoploid;
        if (iMonoploid != color) {
            return new PorterDuffColorFilter(iMonoploid, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    public void czestochowa(float f) {
        dern dernVar = this.f15552arytenoidectomy;
        if (dernVar.f15597kowloon != f) {
            dernVar.f15597kowloon = f;
            claque();
        }
    }

    public boolean dent() {
        powdery.attabal attabalVar = this.f15552arytenoidectomy.f15590dern;
        return attabalVar != null && attabalVar.marial();
    }

    public final void dovishness(Canvas canvas, Paint paint, Path path, kowloon kowloonVar, float[] fArr, RectF rectF) {
        float fImpassible = impassible(rectF, kowloonVar, fArr);
        if (fImpassible < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            canvas.drawPath(path, paint);
        } else {
            float f = fImpassible * this.f15552arytenoidectomy.f15592formularize;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f15579trm.setColorFilter(this.f15578supplicat);
        int alpha = this.f15579trm.getAlpha();
        this.f15579trm.setAlpha(premeiotic(alpha, this.f15552arytenoidectomy.f15604triweekly));
        this.f15566oilcan.setColorFilter(this.f15571restrictive);
        this.f15566oilcan.setStrokeWidth(this.f15552arytenoidectomy.f15595impassible);
        int alpha2 = this.f15566oilcan.getAlpha();
        this.f15566oilcan.setAlpha(premeiotic(alpha2, this.f15552arytenoidectomy.f15604triweekly));
        if (mathsort()) {
            if (this.f15558graveside) {
                apical(cord(), this.f15557gintrap);
                this.f15558graveside = false;
            }
            cultivated(canvas);
            graveside(canvas);
        }
        if (splinterproof()) {
            if (this.f15551adultoid) {
                triweekly();
                this.f15551adultoid = false;
            }
            gintrap(canvas);
        }
        this.f15579trm.setAlpha(alpha);
        this.f15566oilcan.setAlpha(alpha2);
    }

    public void empress(int i, int i2, int i3, int i4) {
        dern dernVar = this.f15552arytenoidectomy;
        if (dernVar.f15589cutely == null) {
            dernVar.f15589cutely = new Rect();
        }
        this.f15552arytenoidectomy.f15589cutely.set(i, i2, i3, i4);
        invalidateSelf();
    }

    public final void formularize(RectF rectF, Path path) {
        arytenoidectomy arytenoidectomyVar = this.f15561kattegat;
        dern dernVar = this.f15552arytenoidectomy;
        arytenoidectomyVar.beachfront(dernVar.f15586attabal, this.f15576starveling, dernVar.f15592formularize, rectF, this.f15574sealless, path);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f15552arytenoidectomy.f15604triweekly;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f15552arytenoidectomy;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f15552arytenoidectomy.f15601polloi == 2) {
            return;
        }
        RectF rectFCord = cord();
        if (rectFCord.isEmpty()) {
            return;
        }
        float fImpassible = impassible(rectFCord, this.f15552arytenoidectomy.f15586attabal, this.f15576starveling);
        if (fImpassible >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            outline.setRoundRect(getBounds(), fImpassible * this.f15552arytenoidectomy.f15592formularize);
            return;
        }
        if (this.f15558graveside) {
            apical(rectFCord, this.f15557gintrap);
            this.f15558graveside = false;
        }
        strum.wireman.formularize(outline, this.f15557gintrap);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f15552arytenoidectomy.f15589cutely;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f15555cuirassed.set(getBounds());
        apical(cord(), this.f15557gintrap);
        this.f15577stratoscope.setPath(this.f15557gintrap, this.f15555cuirassed);
        this.f15555cuirassed.op(this.f15577stratoscope, Region.Op.DIFFERENCE);
        return this.f15555cuirassed;
    }

    public void gintrap(Canvas canvas) {
        dovishness(canvas, this.f15566oilcan, this.f15572rotuma, this.f15573saran, this.f15560hydrovane, cuirassed());
    }

    public final void graveside(Canvas canvas) {
        dovishness(canvas, this.f15579trm, this.f15557gintrap, this.f15552arytenoidectomy.f15586attabal, this.f15576starveling, cord());
    }

    public final float grimness() {
        return splinterproof() ? this.f15566oilcan.getStrokeWidth() / 2.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public void gusty(float f, ColorStateList colorStateList) {
        palmyra(f);
        picketboat(colorStateList);
    }

    public float hydrovane() {
        return this.f15552arytenoidectomy.f15600monoploid;
    }

    public void igbo(float f, int i) {
        palmyra(f);
        picketboat(ColorStateList.valueOf(i));
    }

    public final float impassible(RectF rectF, kowloon kowloonVar, float[] fArr) {
        if (fArr == null) {
            if (kowloonVar.dovishness(rectF)) {
                return kowloonVar.polloi().attabal(rectF);
            }
            return -1.0f;
        }
        if (othin.attabal.attabal(fArr) && kowloonVar.adultoid()) {
            return fArr[0];
        }
        return -1.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f15558graveside = true;
        this.f15551adultoid = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f15552arytenoidectomy.f15596impromptu;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f15552arytenoidectomy.f15588competently;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f15552arytenoidectomy.f15587beachfront;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.f15552arytenoidectomy.f15598marial;
        if (colorStateList4 != null && colorStateList4.isStateful()) {
            return true;
        }
        gintrap gintrapVar = this.f15552arytenoidectomy.f15602saneness;
        return gintrapVar != null && gintrapVar.beachfront();
    }

    public void itchy(chinny.wireman wiremanVar) {
        setShapeAppearanceModel(this.f15552arytenoidectomy.f15586attabal.preprohormone(wiremanVar));
    }

    public final void julian(int[] iArr, boolean z) {
        RectF rectFCord = cord();
        if (this.f15552arytenoidectomy.f15602saneness == null || rectFCord.isEmpty()) {
            return;
        }
        boolean z2 = z | (this.f15570privatdozent == null);
        if (this.f15576starveling == null) {
            this.f15576starveling = new float[4];
        }
        kowloon kowloonVarWireman = this.f15552arytenoidectomy.f15602saneness.wireman(iArr);
        for (int i = 0; i < 4; i++) {
            float fAttabal = this.f15561kattegat.impromptu(i, kowloonVarWireman).attabal(rectFCord);
            if (z2) {
                this.f15576starveling[i] = fAttabal;
            }
            molet.formularize formularizeVar = this.f15554creditor[i];
            if (formularizeVar != null) {
                formularizeVar.graveside(fAttabal);
                if (z2) {
                    this.f15554creditor[i].preprohormone();
                }
            }
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public int kattegat() {
        return this.f15563merc;
    }

    public final PorterDuffColorFilter kowloon(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = monoploid(colorForState);
        }
        this.f15563merc = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public void lerp(float f) {
        dern dernVar = this.f15552arytenoidectomy;
        if (dernVar.f15585arytenoidectomy != f) {
            dernVar.f15585arytenoidectomy = f;
            claque();
        }
    }

    public final boolean lightstruck(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f15552arytenoidectomy.f15598marial == null || color2 == (colorForState2 = this.f15552arytenoidectomy.f15598marial.getColorForState(iArr, (color2 = this.f15579trm.getColor())))) {
            z = false;
        } else {
            this.f15579trm.setColor(colorForState2);
            z = true;
        }
        if (this.f15552arytenoidectomy.f15587beachfront == null || color == (colorForState = this.f15552arytenoidectomy.f15587beachfront.getColorForState(iArr, (color = this.f15566oilcan.getColor())))) {
            return z;
        }
        this.f15566oilcan.setColor(colorForState);
        return true;
    }

    public void lotta(float f) {
        dern dernVar = this.f15552arytenoidectomy;
        if (dernVar.f15592formularize != f) {
            dernVar.f15592formularize = f;
            this.f15558graveside = true;
            this.f15551adultoid = true;
            invalidateSelf();
        }
    }

    public final boolean mathsort() {
        Paint.Style style = this.f15552arytenoidectomy.f15593gintrap;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    public int merc() {
        return this.f15552arytenoidectomy.f15599molybdenite;
    }

    public boolean milliradian() {
        return (permissivist() || this.f15557gintrap.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public final void molybdenite(Canvas canvas) {
        this.f15564molybdenite.cardinality();
        if (this.f15552arytenoidectomy.f15594graveside != 0) {
            canvas.drawPath(this.f15557gintrap, this.f15581yemenite.dern());
        }
        for (int i = 0; i < 4; i++) {
            this.f15565monoploid[i].saneness(this.f15581yemenite, this.f15552arytenoidectomy.f15599molybdenite, canvas);
            this.f15568polloi[i].saneness(this.f15581yemenite, this.f15552arytenoidectomy.f15599molybdenite, canvas);
        }
        if (this.f15575seminary) {
            int iSupplicat = supplicat();
            int iRestrictive = restrictive();
            canvas.translate(-iSupplicat, -iRestrictive);
            canvas.drawPath(this.f15557gintrap, f15548mathsort);
            canvas.translate(iSupplicat, iRestrictive);
        }
    }

    public int monoploid(int i) {
        float fWalach = walach() + sealless();
        powdery.attabal attabalVar = this.f15552arytenoidectomy.f15590dern;
        return attabalVar != null ? attabalVar.dern(i, fWalach) : i;
    }

    public final void monroe(int[] iArr) {
        julian(iArr, false);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f15552arytenoidectomy = new dern(this.f15552arytenoidectomy);
        return this;
    }

    public void nosophobia(ColorStateList colorStateList) {
        dern dernVar = this.f15552arytenoidectomy;
        if (dernVar.f15598marial != colorStateList) {
            dernVar.f15598marial = colorStateList;
            onStateChange(getState());
        }
    }

    public ColorStateList oilcan() {
        return this.f15552arytenoidectomy.f15598marial;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f15558graveside = true;
        this.f15551adultoid = true;
        super.onBoundsChange(rect);
        if (this.f15552arytenoidectomy.f15602saneness != null && !rect.isEmpty()) {
            julian(getState(), this.f15559grimness);
        }
        this.f15559grimness = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.adultoid.saneness
    public boolean onStateChange(int[] iArr) {
        if (this.f15552arytenoidectomy.f15602saneness != null) {
            monroe(iArr);
        }
        boolean z = lightstruck(iArr) || unconsolidated();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public void overspeculate(Context context) {
        this.f15552arytenoidectomy.f15590dern = new powdery.attabal(context);
        claque();
    }

    public void palmyra(float f) {
        this.f15552arytenoidectomy.f15595impassible = f;
        invalidateSelf();
    }

    public final boolean peridotite() {
        dern dernVar = this.f15552arytenoidectomy;
        int i = dernVar.f15601polloi;
        if (i == 1 || dernVar.f15599molybdenite <= 0) {
            return false;
        }
        return i == 2 || milliradian();
    }

    public boolean permissivist() {
        if (this.f15552arytenoidectomy.f15586attabal.dovishness(cord())) {
            return true;
        }
        float[] fArr = this.f15576starveling;
        return fArr != null && othin.attabal.attabal(fArr) && this.f15552arytenoidectomy.f15586attabal.adultoid();
    }

    public void picketboat(ColorStateList colorStateList) {
        dern dernVar = this.f15552arytenoidectomy;
        if (dernVar.f15587beachfront != colorStateList) {
            dernVar.f15587beachfront = colorStateList;
            onStateChange(getState());
        }
    }

    public kowloon polder() {
        return this.f15552arytenoidectomy.f15586attabal;
    }

    public float preprohormone() {
        float[] fArr = this.f15576starveling;
        return fArr != null ? fArr[1] : this.f15552arytenoidectomy.f15586attabal.formularize().attabal(cord());
    }

    public void preterite(int i) {
        dern dernVar = this.f15552arytenoidectomy;
        if (dernVar.f15601polloi != i) {
            dernVar.f15601polloi = i;
            clubfoot();
        }
    }

    public ColorStateList privatdozent() {
        return this.f15552arytenoidectomy.f15596impromptu;
    }

    public int restrictive() {
        dern dernVar = this.f15552arytenoidectomy;
        return (int) (((double) dernVar.f15594graveside) * Math.cos(Math.toRadians(dernVar.f15583adultoid)));
    }

    public float rotuma() {
        float[] fArr = this.f15576starveling;
        return fArr != null ? fArr[2] : this.f15552arytenoidectomy.f15586attabal.cutely().attabal(cord());
    }

    public float saran() {
        return this.f15552arytenoidectomy.f15595impassible;
    }

    public void sayid(wireman wiremanVar) {
        this.f15580walach = wiremanVar;
    }

    public float sealless() {
        return this.f15552arytenoidectomy.f15597kowloon;
    }

    public ColorStateList seminary() {
        return this.f15552arytenoidectomy.f15587beachfront;
    }

    public void sensatory(boolean z) {
        this.f15575seminary = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        dern dernVar = this.f15552arytenoidectomy;
        if (dernVar.f15604triweekly != i) {
            dernVar.f15604triweekly = i;
            clubfoot();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f15552arytenoidectomy.f15605wireman = colorFilter;
        clubfoot();
    }

    @Override // chinny.polloi
    public void setShapeAppearanceModel(kowloon kowloonVar) {
        dern dernVar = this.f15552arytenoidectomy;
        dernVar.f15586attabal = kowloonVar;
        dernVar.f15602saneness = null;
        this.f15576starveling = null;
        this.f15560hydrovane = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList) {
        this.f15552arytenoidectomy.f15596impromptu = colorStateList;
        unconsolidated();
        clubfoot();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(PorterDuff.Mode mode) {
        dern dernVar = this.f15552arytenoidectomy;
        if (dernVar.f15603taiyuan != mode) {
            dernVar.f15603taiyuan = mode;
            unconsolidated();
            clubfoot();
        }
    }

    public final boolean splinterproof() {
        Paint.Style style = this.f15552arytenoidectomy.f15593gintrap;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f15566oilcan.getStrokeWidth() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float starveling() {
        float[] fArr = this.f15576starveling;
        return fArr != null ? fArr[0] : this.f15552arytenoidectomy.f15586attabal.graveside().attabal(cord());
    }

    public float stratoscope() {
        float fAttabal;
        float fAttabal2;
        float[] fArr = this.f15576starveling;
        if (fArr != null) {
            fAttabal = (fArr[3] + fArr[2]) - fArr[1];
            fAttabal2 = fArr[0];
        } else {
            RectF rectFCord = cord();
            fAttabal = (this.f15561kattegat.impromptu(3, polder()).attabal(rectFCord) + this.f15561kattegat.impromptu(2, polder()).attabal(rectFCord)) - this.f15561kattegat.impromptu(1, polder()).attabal(rectFCord);
            fAttabal2 = this.f15561kattegat.impromptu(0, polder()).attabal(rectFCord);
        }
        return (fAttabal - fAttabal2) / 2.0f;
    }

    public int supplicat() {
        dern dernVar = this.f15552arytenoidectomy;
        return (int) (((double) dernVar.f15594graveside) * Math.sin(Math.toRadians(dernVar.f15583adultoid)));
    }

    public final void timberyard(Canvas canvas) {
        canvas.translate(supplicat(), restrictive());
    }

    public void treadless(float f) {
        setShapeAppearanceModel(this.f15552arytenoidectomy.f15586attabal.rotuma(f));
    }

    public final void triweekly() {
        achondroplasia();
        this.f15561kattegat.beachfront(this.f15573saran, this.f15560hydrovane, this.f15552arytenoidectomy.f15592formularize, cuirassed(), null, this.f15572rotuma);
    }

    public float trm() {
        return this.f15552arytenoidectomy.f15585arytenoidectomy;
    }

    public final boolean unconsolidated() {
        PorterDuffColorFilter porterDuffColorFilter = this.f15578supplicat;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f15571restrictive;
        dern dernVar = this.f15552arytenoidectomy;
        this.f15578supplicat = arytenoidectomy(dernVar.f15596impromptu, dernVar.f15603taiyuan, this.f15579trm, true);
        dern dernVar2 = this.f15552arytenoidectomy;
        this.f15571restrictive = arytenoidectomy(dernVar2.f15588competently, dernVar2.f15603taiyuan, this.f15566oilcan, false);
        dern dernVar3 = this.f15552arytenoidectomy;
        if (dernVar3.f15591dovishness) {
            this.f15581yemenite.wireman(dernVar3.f15596impromptu.getColorForState(getState(), 0));
        }
        return (technofreak.marial.attabal(porterDuffColorFilter, this.f15578supplicat) && technofreak.marial.attabal(porterDuffColorFilter2, this.f15571restrictive)) ? false : true;
    }

    public void underbelly(int i) {
        this.f15581yemenite.wireman(i);
        this.f15552arytenoidectomy.f15591dovishness = false;
        clubfoot();
    }

    public float walach() {
        return trm() + hydrovane();
    }

    public void wostteth(gintrap gintrapVar) {
        dern dernVar = this.f15552arytenoidectomy;
        if (dernVar.f15602saneness != gintrapVar) {
            dernVar.f15602saneness = gintrapVar;
            julian(getState(), true);
            invalidateSelf();
        }
    }

    public float yemenite() {
        return this.f15552arytenoidectomy.f15592formularize;
    }

    public taiyuan(Context context, AttributeSet attributeSet, int i, int i2) {
        this(kowloon.marial(context, attributeSet, i, i2).impassible());
    }

    public taiyuan(kowloon kowloonVar) {
        this(new dern(kowloonVar, null));
    }

    public taiyuan(dern dernVar) {
        arytenoidectomy arytenoidectomyVar;
        this.f15562kowloon = new attabal();
        this.f15565monoploid = new monoploid.competently[4];
        this.f15568polloi = new monoploid.competently[4];
        this.f15564molybdenite = new BitSet(8);
        this.f15556dovishness = new Matrix();
        this.f15557gintrap = new Path();
        this.f15572rotuma = new Path();
        this.f15569preprohormone = new RectF();
        this.f15553cord = new RectF();
        this.f15555cuirassed = new Region();
        this.f15577stratoscope = new Region();
        Paint paint = new Paint(1);
        this.f15579trm = paint;
        Paint paint2 = new Paint(1);
        this.f15566oilcan = paint2;
        this.f15581yemenite = new nitroguanidine.attabal();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            arytenoidectomyVar = arytenoidectomy.formularize();
        } else {
            arytenoidectomyVar = new arytenoidectomy();
        }
        this.f15561kattegat = arytenoidectomyVar;
        this.f15567polder = new RectF();
        this.f15575seminary = true;
        this.f15559grimness = true;
        this.f15554creditor = new molet.formularize[4];
        this.f15552arytenoidectomy = dernVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        unconsolidated();
        lightstruck(getState());
        this.f15574sealless = new saneness();
    }

    /* JADX INFO: compiled from: MaterialShapeDrawable.java */
    public static class dern extends Drawable.ConstantState {

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
        public int f15583adultoid;

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public float f15584apical;

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public float f15585arytenoidectomy;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public kowloon f15586attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public ColorStateList f15587beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public ColorStateList f15588competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public Rect f15589cutely;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public powdery.attabal f15590dern;

        /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
        public boolean f15591dovishness;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public float f15592formularize;

        /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
        public Paint.Style f15593gintrap;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public int f15594graveside;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public float f15595impassible;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public ColorStateList f15596impromptu;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public float f15597kowloon;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public ColorStateList f15598marial;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public int f15599molybdenite;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public float f15600monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public int f15601polloi;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public gintrap f15602saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public PorterDuff.Mode f15603taiyuan;

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        public int f15604triweekly;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public ColorFilter f15605wireman;

        public dern(kowloon kowloonVar, powdery.attabal attabalVar) {
            this.f15598marial = null;
            this.f15587beachfront = null;
            this.f15588competently = null;
            this.f15596impromptu = null;
            this.f15603taiyuan = PorterDuff.Mode.SRC_IN;
            this.f15589cutely = null;
            this.f15584apical = 1.0f;
            this.f15592formularize = 1.0f;
            this.f15604triweekly = 255;
            this.f15597kowloon = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f15585arytenoidectomy = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f15600monoploid = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f15601polloi = 0;
            this.f15599molybdenite = 0;
            this.f15594graveside = 0;
            this.f15583adultoid = 0;
            this.f15591dovishness = false;
            this.f15593gintrap = Paint.Style.FILL_AND_STROKE;
            this.f15586attabal = kowloonVar;
            this.f15590dern = attabalVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            taiyuan taiyuanVar = new taiyuan(this);
            taiyuanVar.f15558graveside = true;
            taiyuanVar.f15551adultoid = true;
            return taiyuanVar;
        }

        public dern(dern dernVar) {
            this.f15598marial = null;
            this.f15587beachfront = null;
            this.f15588competently = null;
            this.f15596impromptu = null;
            this.f15603taiyuan = PorterDuff.Mode.SRC_IN;
            this.f15589cutely = null;
            this.f15584apical = 1.0f;
            this.f15592formularize = 1.0f;
            this.f15604triweekly = 255;
            this.f15597kowloon = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f15585arytenoidectomy = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f15600monoploid = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f15601polloi = 0;
            this.f15599molybdenite = 0;
            this.f15594graveside = 0;
            this.f15583adultoid = 0;
            this.f15591dovishness = false;
            this.f15593gintrap = Paint.Style.FILL_AND_STROKE;
            this.f15586attabal = dernVar.f15586attabal;
            this.f15602saneness = dernVar.f15602saneness;
            this.f15590dern = dernVar.f15590dern;
            this.f15595impassible = dernVar.f15595impassible;
            this.f15605wireman = dernVar.f15605wireman;
            this.f15598marial = dernVar.f15598marial;
            this.f15587beachfront = dernVar.f15587beachfront;
            this.f15603taiyuan = dernVar.f15603taiyuan;
            this.f15596impromptu = dernVar.f15596impromptu;
            this.f15604triweekly = dernVar.f15604triweekly;
            this.f15584apical = dernVar.f15584apical;
            this.f15594graveside = dernVar.f15594graveside;
            this.f15601polloi = dernVar.f15601polloi;
            this.f15591dovishness = dernVar.f15591dovishness;
            this.f15592formularize = dernVar.f15592formularize;
            this.f15597kowloon = dernVar.f15597kowloon;
            this.f15585arytenoidectomy = dernVar.f15585arytenoidectomy;
            this.f15600monoploid = dernVar.f15600monoploid;
            this.f15599molybdenite = dernVar.f15599molybdenite;
            this.f15583adultoid = dernVar.f15583adultoid;
            this.f15588competently = dernVar.f15588competently;
            this.f15593gintrap = dernVar.f15593gintrap;
            if (dernVar.f15589cutely != null) {
                this.f15589cutely = new Rect(dernVar.f15589cutely);
            }
        }
    }
}
