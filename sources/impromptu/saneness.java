package impromptu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableCompat;
import beachfront.cutely;
import beachfront.taiyuan;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: DrawerArrowDrawable.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness extends Drawable {

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public static final float f28503impassible = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public float f28504apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Paint f28505attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public boolean f28506beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final Path f28507competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public float f28508cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public float f28509dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public int f28510formularize;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final int f28511impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public float f28512marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public float f28513saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public boolean f28514taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public float f28515wireman;

    public saneness(Context context) {
        Paint paint = new Paint();
        this.f28505attabal = paint;
        this.f28507competently = new Path();
        this.f28514taiyuan = false;
        this.f28510formularize = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, cutely.DrawerArrowToggle, beachfront.attabal.drawerArrowStyle, taiyuan.Base_Widget_AppCompat_DrawerArrowToggle);
        dern(typedArrayObtainStyledAttributes.getColor(cutely.DrawerArrowToggle_color, 0));
        saneness(typedArrayObtainStyledAttributes.getDimension(cutely.DrawerArrowToggle_thickness, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        beachfront(typedArrayObtainStyledAttributes.getBoolean(cutely.DrawerArrowToggle_spinBars, true));
        wireman(Math.round(typedArrayObtainStyledAttributes.getDimension(cutely.DrawerArrowToggle_gapBetweenBars, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
        this.f28511impromptu = typedArrayObtainStyledAttributes.getDimensionPixelSize(cutely.DrawerArrowToggle_drawableSize, 0);
        this.f28509dern = Math.round(typedArrayObtainStyledAttributes.getDimension(cutely.DrawerArrowToggle_barLength, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        this.f28513saneness = Math.round(typedArrayObtainStyledAttributes.getDimension(cutely.DrawerArrowToggle_arrowHeadLength, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        this.f28515wireman = typedArrayObtainStyledAttributes.getDimension(cutely.DrawerArrowToggle_arrowShaftLength, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float attabal(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    public void beachfront(boolean z) {
        if (this.f28506beachfront != z) {
            this.f28506beachfront = z;
            invalidateSelf();
        }
    }

    public void dern(int i) {
        if (i != this.f28505attabal.getColor()) {
            this.f28505attabal.setColor(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = this.f28510formularize;
        boolean z = false;
        if (i != 0 && (i == 1 || (i == 3 ? DrawableCompat.getLayoutDirection(this) == 0 : DrawableCompat.getLayoutDirection(this) == 1))) {
            z = true;
        }
        float f = this.f28513saneness;
        float fAttabal = attabal(this.f28509dern, (float) Math.sqrt(f * f * 2.0f), this.f28508cutely);
        float fAttabal2 = attabal(this.f28509dern, this.f28515wireman, this.f28508cutely);
        float fRound = Math.round(attabal(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f28504apical, this.f28508cutely));
        float fAttabal3 = attabal(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f28503impassible, this.f28508cutely);
        float fAttabal4 = attabal(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.f28508cutely);
        double d = fAttabal;
        double d2 = fAttabal3;
        boolean z2 = z;
        float fRound2 = Math.round(Math.cos(d2) * d);
        float fRound3 = Math.round(d * Math.sin(d2));
        this.f28507competently.rewind();
        float fAttabal5 = attabal(this.f28512marial + this.f28505attabal.getStrokeWidth(), -this.f28504apical, this.f28508cutely);
        float f2 = (-fAttabal2) / 2.0f;
        this.f28507competently.moveTo(f2 + fRound, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f28507competently.rLineTo(fAttabal2 - (fRound * 2.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f28507competently.moveTo(f2, fAttabal5);
        this.f28507competently.rLineTo(fRound2, fRound3);
        this.f28507competently.moveTo(f2, -fAttabal5);
        this.f28507competently.rLineTo(fRound2, -fRound3);
        this.f28507competently.close();
        canvas.save();
        float strokeWidth = this.f28505attabal.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        float f3 = this.f28512marial;
        canvas.translate(bounds.centerX(), ((((int) (fHeight - (f3 * 2.0f))) / 4) * 2) + (strokeWidth * 1.5f) + f3);
        if (this.f28506beachfront) {
            canvas.rotate(fAttabal4 * (this.f28514taiyuan ^ z2 ? -1 : 1));
        } else if (z2) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f28507competently, this.f28505attabal);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f28511impromptu;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f28511impromptu;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void marial(float f) {
        if (this.f28508cutely != f) {
            this.f28508cutely = f;
            invalidateSelf();
        }
    }

    public void saneness(float f) {
        if (this.f28505attabal.getStrokeWidth() != f) {
            this.f28505attabal.setStrokeWidth(f);
            this.f28504apical = (float) (((double) (f / 2.0f)) * Math.cos(f28503impassible));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f28505attabal.getAlpha()) {
            this.f28505attabal.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f28505attabal.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void wireman(float f) {
        if (f != this.f28512marial) {
            this.f28512marial = f;
            invalidateSelf();
        }
    }
}
