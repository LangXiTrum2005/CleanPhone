package weimar;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.DrawableCompat;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import lightstruck.apical;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: VectorDrawableCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class competently extends weimar.beachfront {

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public static final PorterDuff.Mode f39623preprohormone = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public Drawable.ConstantState f39624adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public impromptu f39625arytenoidectomy;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final float[] f39626dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public final Matrix f39627gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public boolean f39628graveside;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public boolean f39629molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public PorterDuffColorFilter f39630monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public ColorFilter f39631polloi;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public final Rect f39632rotuma;

    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    public static class impromptu extends Drawable.ConstantState {

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public boolean f39666apical;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f39667attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public Bitmap f39668beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public ColorStateList f39669competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public boolean f39670cutely;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public ColorStateList f39671dern;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public Paint f39672formularize;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public PorterDuff.Mode f39673impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public boolean f39674marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public C0820competently f39675saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public int f39676taiyuan;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public PorterDuff.Mode f39677wireman;

        public impromptu(impromptu impromptuVar) {
            this.f39671dern = null;
            this.f39677wireman = competently.f39623preprohormone;
            if (impromptuVar != null) {
                this.f39667attabal = impromptuVar.f39667attabal;
                C0820competently c0820competently = new C0820competently(impromptuVar.f39675saneness);
                this.f39675saneness = c0820competently;
                if (impromptuVar.f39675saneness.f39649marial != null) {
                    c0820competently.f39649marial = new Paint(impromptuVar.f39675saneness.f39649marial);
                }
                if (impromptuVar.f39675saneness.f39653wireman != null) {
                    this.f39675saneness.f39653wireman = new Paint(impromptuVar.f39675saneness.f39653wireman);
                }
                this.f39671dern = impromptuVar.f39671dern;
                this.f39677wireman = impromptuVar.f39677wireman;
                this.f39674marial = impromptuVar.f39674marial;
            }
        }

        public boolean attabal(int i, int i2) {
            return i == this.f39668beachfront.getWidth() && i2 == this.f39668beachfront.getHeight();
        }

        public boolean beachfront() {
            return this.f39675saneness.getRootAlpha() < 255;
        }

        public boolean competently() {
            return this.f39675saneness.beachfront();
        }

        public void cutely(int i, int i2) {
            this.f39668beachfront.eraseColor(0);
            this.f39675saneness.saneness(new Canvas(this.f39668beachfront), i, i2, null);
        }

        public void dern(int i, int i2) {
            if (this.f39668beachfront == null || !attabal(i, i2)) {
                this.f39668beachfront = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f39666apical = true;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f39667attabal;
        }

        public boolean impromptu(int[] iArr) {
            boolean zCompetently = this.f39675saneness.competently(iArr);
            this.f39666apical |= zCompetently;
            return zCompetently;
        }

        public Paint marial(ColorFilter colorFilter) {
            if (!beachfront() && colorFilter == null) {
                return null;
            }
            if (this.f39672formularize == null) {
                Paint paint = new Paint();
                this.f39672formularize = paint;
                paint.setFilterBitmap(true);
            }
            this.f39672formularize.setAlpha(this.f39675saneness.getRootAlpha());
            this.f39672formularize.setColorFilter(colorFilter);
            return this.f39672formularize;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new competently(this);
        }

        public boolean saneness() {
            return !this.f39666apical && this.f39669competently == this.f39671dern && this.f39673impromptu == this.f39677wireman && this.f39670cutely == this.f39674marial && this.f39676taiyuan == this.f39675saneness.getRootAlpha();
        }

        public void taiyuan() {
            this.f39669competently = this.f39671dern;
            this.f39673impromptu = this.f39677wireman;
            this.f39676taiyuan = this.f39675saneness.getRootAlpha();
            this.f39670cutely = this.f39674marial;
            this.f39666apical = false;
        }

        public void wireman(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f39668beachfront, (Rect) null, rect, marial(colorFilter));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new competently(this);
        }

        public impromptu() {
            this.f39671dern = null;
            this.f39677wireman = competently.f39623preprohormone;
            this.f39675saneness = new C0820competently();
        }
    }

    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    public static abstract class marial {
        public marial() {
        }

        public boolean attabal() {
            return false;
        }

        public boolean saneness(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    public static class saneness extends beachfront {
        public saneness() {
        }

        private void beachfront(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f39635saneness = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f39633attabal = monroe.beachfront.wireman(string2);
            }
            this.f39634dern = apical.competently(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // weimar.competently.beachfront
        public boolean dern() {
            return true;
        }

        public void marial(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (apical.cutely(xmlPullParser, "pathData")) {
                TypedArray typedArrayApical = apical.apical(resources, theme, attributeSet, weimar.attabal.f39621wireman);
                beachfront(typedArrayApical, xmlPullParser);
                typedArrayApical.recycle();
            }
        }

        public saneness(saneness sanenessVar) {
            super(sanenessVar);
        }
    }

    public competently() {
        this.f39628graveside = true;
        this.f39626dovishness = new float[9];
        this.f39627gintrap = new Matrix();
        this.f39632rotuma = new Rect();
        this.f39625arytenoidectomy = new impromptu();
    }

    public static int attabal(int i, float f) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f)) << 24);
    }

    public static PorterDuff.Mode beachfront(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static competently saneness(Resources resources, int i, Resources.Theme theme) {
        competently competentlyVar = new competently();
        competentlyVar.f39622kowloon = lightstruck.impromptu.marial(resources, i, theme);
        competentlyVar.f39624adultoid = new taiyuan(competentlyVar.f39622kowloon.getConstantState());
        return competentlyVar;
    }

    @Override // weimar.beachfront, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f39622kowloon;
        if (drawable == null) {
            return false;
        }
        DrawableCompat.canApplyTheme(drawable);
        return false;
    }

    @Override // weimar.beachfront, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void competently(boolean z) {
        this.f39628graveside = z;
    }

    public Object dern(String str) {
        return this.f39625arytenoidectomy.f39675saneness.f39639arytenoidectomy.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f39632rotuma);
        if (this.f39632rotuma.width() <= 0 || this.f39632rotuma.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f39631polloi;
        if (colorFilter == null) {
            colorFilter = this.f39630monoploid;
        }
        canvas.getMatrix(this.f39627gintrap);
        this.f39627gintrap.getValues(this.f39626dovishness);
        float fAbs = Math.abs(this.f39626dovishness[0]);
        float fAbs2 = Math.abs(this.f39626dovishness[4]);
        float fAbs3 = Math.abs(this.f39626dovishness[1]);
        float fAbs4 = Math.abs(this.f39626dovishness[3]);
        if (fAbs3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fAbs4 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (this.f39632rotuma.width() * fAbs);
        int iHeight = (int) (this.f39632rotuma.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f39632rotuma;
        canvas.translate(rect.left, rect.top);
        if (marial()) {
            canvas.translate(this.f39632rotuma.width(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f39632rotuma.offsetTo(0, 0);
        this.f39625arytenoidectomy.dern(iMin, iMin2);
        if (!this.f39628graveside) {
            this.f39625arytenoidectomy.cutely(iMin, iMin2);
        } else if (!this.f39625arytenoidectomy.saneness()) {
            this.f39625arytenoidectomy.cutely(iMin, iMin2);
            this.f39625arytenoidectomy.taiyuan();
        }
        this.f39625arytenoidectomy.wireman(canvas, colorFilter, this.f39632rotuma);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f39622kowloon;
        return drawable != null ? DrawableCompat.getAlpha(drawable) : this.f39625arytenoidectomy.f39675saneness.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f39622kowloon;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f39625arytenoidectomy.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f39622kowloon;
        return drawable != null ? DrawableCompat.getColorFilter(drawable) : this.f39631polloi;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f39622kowloon != null) {
            return new taiyuan(this.f39622kowloon.getConstantState());
        }
        this.f39625arytenoidectomy.f39667attabal = getChangingConfigurations();
        return this.f39625arytenoidectomy;
    }

    @Override // weimar.beachfront, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f39622kowloon;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f39625arytenoidectomy.f39675saneness.f39643cutely;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f39622kowloon;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f39625arytenoidectomy.f39675saneness.f39651taiyuan;
    }

    @Override // weimar.beachfront, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // weimar.beachfront, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // weimar.beachfront, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // weimar.beachfront, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // weimar.beachfront, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public final void impromptu(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        impromptu impromptuVar = this.f39625arytenoidectomy;
        C0820competently c0820competently = impromptuVar.f39675saneness;
        impromptuVar.f39677wireman = beachfront(apical.competently(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListDern = apical.dern(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListDern != null) {
            impromptuVar.f39671dern = colorStateListDern;
        }
        impromptuVar.f39674marial = apical.attabal(typedArray, xmlPullParser, "autoMirrored", 5, impromptuVar.f39674marial);
        c0820competently.f39638apical = apical.beachfront(typedArray, xmlPullParser, "viewportWidth", 7, c0820competently.f39638apical);
        float fBeachfront = apical.beachfront(typedArray, xmlPullParser, "viewportHeight", 8, c0820competently.f39645formularize);
        c0820competently.f39645formularize = fBeachfront;
        if (c0820competently.f39638apical <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fBeachfront <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        c0820competently.f39651taiyuan = typedArray.getDimension(3, c0820competently.f39651taiyuan);
        float dimension = typedArray.getDimension(2, c0820competently.f39643cutely);
        c0820competently.f39643cutely = dimension;
        if (c0820competently.f39651taiyuan <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        c0820competently.setAlpha(apical.beachfront(typedArray, xmlPullParser, "alpha", 4, c0820competently.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            c0820competently.f39652triweekly = string;
            c0820competently.f39639arytenoidectomy.put(string, c0820competently);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f39622kowloon;
        return drawable != null ? DrawableCompat.isAutoMirrored(drawable) : this.f39625arytenoidectomy.f39674marial;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        impromptu impromptuVar = this.f39625arytenoidectomy;
        if (impromptuVar == null) {
            return false;
        }
        if (impromptuVar.competently()) {
            return true;
        }
        ColorStateList colorStateList = this.f39625arytenoidectomy.f39671dern;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // weimar.beachfront, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public final boolean marial() {
        return isAutoMirrored() && DrawableCompat.getLayoutDirection(this) == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f39629molybdenite && super.mutate() == this) {
            this.f39625arytenoidectomy = new impromptu(this.f39625arytenoidectomy);
            this.f39629molybdenite = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        impromptu impromptuVar = this.f39625arytenoidectomy;
        ColorStateList colorStateList = impromptuVar.f39671dern;
        if (colorStateList == null || (mode = impromptuVar.f39677wireman) == null) {
            z = false;
        } else {
            this.f39630monoploid = taiyuan(this.f39630monoploid, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!impromptuVar.competently() || !impromptuVar.impromptu(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f39625arytenoidectomy.f39675saneness.getRootAlpha() != i) {
            this.f39625arytenoidectomy.f39675saneness.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            DrawableCompat.setAutoMirrored(drawable, z);
        } else {
            this.f39625arytenoidectomy.f39674marial = z;
        }
    }

    @Override // weimar.beachfront, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // weimar.beachfront, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // weimar.beachfront, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // weimar.beachfront, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // weimar.beachfront, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // weimar.beachfront, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int i) {
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            DrawableCompat.setTint(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, colorStateList);
            return;
        }
        impromptu impromptuVar = this.f39625arytenoidectomy;
        if (impromptuVar.f39671dern != colorStateList) {
            impromptuVar.f39671dern = colorStateList;
            this.f39630monoploid = taiyuan(this.f39630monoploid, colorStateList, impromptuVar.f39677wireman);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            DrawableCompat.setTintMode(drawable, mode);
            return;
        }
        impromptu impromptuVar = this.f39625arytenoidectomy;
        if (impromptuVar.f39677wireman != mode) {
            impromptuVar.f39677wireman = mode;
            this.f39630monoploid = taiyuan(this.f39630monoploid, impromptuVar.f39671dern, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f39622kowloon;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public PorterDuffColorFilter taiyuan(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public final void wireman(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        impromptu impromptuVar = this.f39625arytenoidectomy;
        C0820competently c0820competently = impromptuVar.f39675saneness;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c0820competently.f39647impromptu);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                wireman wiremanVar = (wireman) arrayDeque.peek();
                if ("path".equals(name)) {
                    dern dernVar = new dern();
                    dernVar.competently(resources, attributeSet, theme, xmlPullParser);
                    wiremanVar.f39689saneness.add(dernVar);
                    if (dernVar.getPathName() != null) {
                        c0820competently.f39639arytenoidectomy.put(dernVar.getPathName(), dernVar);
                    }
                    impromptuVar.f39667attabal = dernVar.f39636wireman | impromptuVar.f39667attabal;
                    z = false;
                } else if ("clip-path".equals(name)) {
                    saneness sanenessVar = new saneness();
                    sanenessVar.marial(resources, attributeSet, theme, xmlPullParser);
                    wiremanVar.f39689saneness.add(sanenessVar);
                    if (sanenessVar.getPathName() != null) {
                        c0820competently.f39639arytenoidectomy.put(sanenessVar.getPathName(), sanenessVar);
                    }
                    impromptuVar.f39667attabal = sanenessVar.f39636wireman | impromptuVar.f39667attabal;
                } else if ("group".equals(name)) {
                    wireman wiremanVar2 = new wireman();
                    wiremanVar2.dern(resources, attributeSet, theme, xmlPullParser);
                    wiremanVar.f39689saneness.add(wiremanVar2);
                    arrayDeque.push(wiremanVar2);
                    if (wiremanVar2.getGroupName() != null) {
                        c0820competently.f39639arytenoidectomy.put(wiremanVar2.getGroupName(), wiremanVar2);
                    }
                    impromptuVar.f39667attabal = wiremanVar2.f39679apical | impromptuVar.f39667attabal;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    public static class taiyuan extends Drawable.ConstantState {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Drawable.ConstantState f39678attabal;

        public taiyuan(Drawable.ConstantState constantState) {
            this.f39678attabal = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f39678attabal.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f39678attabal.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            competently competentlyVar = new competently();
            competentlyVar.f39622kowloon = (VectorDrawable) this.f39678attabal.newDrawable();
            return competentlyVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            competently competentlyVar = new competently();
            competentlyVar.f39622kowloon = (VectorDrawable) this.f39678attabal.newDrawable(resources);
            return competentlyVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            competently competentlyVar = new competently();
            competentlyVar.f39622kowloon = (VectorDrawable) this.f39678attabal.newDrawable(resources, theme);
            return competentlyVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f39631polloi = colorFilter;
            invalidateSelf();
        }
    }

    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    public static abstract class beachfront extends marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public monroe.beachfront.saneness[] f39633attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f39634dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public String f39635saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public int f39636wireman;

        public beachfront() {
            super();
            this.f39633attabal = null;
            this.f39634dern = 0;
        }

        public boolean dern() {
            return false;
        }

        public monroe.beachfront.saneness[] getPathData() {
            return this.f39633attabal;
        }

        public String getPathName() {
            return this.f39635saneness;
        }

        public void setPathData(monroe.beachfront.saneness[] sanenessVarArr) {
            if (monroe.beachfront.saneness(this.f39633attabal, sanenessVarArr)) {
                monroe.beachfront.apical(this.f39633attabal, sanenessVarArr);
            } else {
                this.f39633attabal = monroe.beachfront.beachfront(sanenessVarArr);
            }
        }

        public void wireman(Path path) {
            path.reset();
            monroe.beachfront.saneness[] sanenessVarArr = this.f39633attabal;
            if (sanenessVarArr != null) {
                monroe.beachfront.saneness.impromptu(sanenessVarArr, path);
            }
        }

        public beachfront(beachfront beachfrontVar) {
            super();
            this.f39633attabal = null;
            this.f39634dern = 0;
            this.f39635saneness = beachfrontVar.f39635saneness;
            this.f39636wireman = beachfrontVar.f39636wireman;
            this.f39633attabal = monroe.beachfront.beachfront(beachfrontVar.f39633attabal);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            DrawableCompat.inflate(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        impromptu impromptuVar = this.f39625arytenoidectomy;
        impromptuVar.f39675saneness = new C0820competently();
        TypedArray typedArrayApical = apical.apical(resources, theme, attributeSet, weimar.attabal.f39611attabal);
        impromptu(typedArrayApical, xmlPullParser, theme);
        typedArrayApical.recycle();
        impromptuVar.f39667attabal = getChangingConfigurations();
        impromptuVar.f39666apical = true;
        wireman(resources, xmlPullParser, attributeSet, theme);
        this.f39630monoploid = taiyuan(this.f39630monoploid, impromptuVar.f39671dern, impromptuVar.f39677wireman);
    }

    public competently(impromptu impromptuVar) {
        this.f39628graveside = true;
        this.f39626dovishness = new float[9];
        this.f39627gintrap = new Matrix();
        this.f39632rotuma = new Rect();
        this.f39625arytenoidectomy = impromptuVar;
        this.f39630monoploid = taiyuan(this.f39630monoploid, impromptuVar.f39671dern, impromptuVar.f39677wireman);
    }

    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    public static class dern extends beachfront {

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public float f39654apical;

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public float f39655arytenoidectomy;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public lightstruck.wireman f39656beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public float f39657competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public float f39658cutely;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public float f39659formularize;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public float f39660impassible;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public lightstruck.wireman f39661impromptu;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public Paint.Join f39662kowloon;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public int[] f39663marial;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public float f39664taiyuan;

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        public Paint.Cap f39665triweekly;

        public dern() {
            this.f39657competently = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f39664taiyuan = 1.0f;
            this.f39658cutely = 1.0f;
            this.f39654apical = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f39659formularize = 1.0f;
            this.f39660impassible = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f39665triweekly = Paint.Cap.BUTT;
            this.f39662kowloon = Paint.Join.MITER;
            this.f39655arytenoidectomy = 4.0f;
        }

        @Override // weimar.competently.marial
        public boolean attabal() {
            return this.f39661impromptu.taiyuan() || this.f39656beachfront.taiyuan();
        }

        public final Paint.Join beachfront(int i, Paint.Join join) {
            if (i == 0) {
                return Paint.Join.MITER;
            }
            if (i != 1) {
                return i != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        public void competently(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayApical = apical.apical(resources, theme, attributeSet, weimar.attabal.f39615dern);
            impromptu(typedArrayApical, xmlPullParser, theme);
            typedArrayApical.recycle();
        }

        public float getFillAlpha() {
            return this.f39658cutely;
        }

        public int getFillColor() {
            return this.f39661impromptu.marial();
        }

        public float getStrokeAlpha() {
            return this.f39664taiyuan;
        }

        public int getStrokeColor() {
            return this.f39656beachfront.marial();
        }

        public float getStrokeWidth() {
            return this.f39657competently;
        }

        public float getTrimPathEnd() {
            return this.f39659formularize;
        }

        public float getTrimPathOffset() {
            return this.f39660impassible;
        }

        public float getTrimPathStart() {
            return this.f39654apical;
        }

        public final void impromptu(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f39663marial = null;
            if (apical.cutely(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f39635saneness = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f39633attabal = monroe.beachfront.wireman(string2);
                }
                this.f39661impromptu = apical.marial(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f39658cutely = apical.beachfront(typedArray, xmlPullParser, "fillAlpha", 12, this.f39658cutely);
                this.f39665triweekly = marial(apical.competently(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f39665triweekly);
                this.f39662kowloon = beachfront(apical.competently(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f39662kowloon);
                this.f39655arytenoidectomy = apical.beachfront(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f39655arytenoidectomy);
                this.f39656beachfront = apical.marial(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f39664taiyuan = apical.beachfront(typedArray, xmlPullParser, "strokeAlpha", 11, this.f39664taiyuan);
                this.f39657competently = apical.beachfront(typedArray, xmlPullParser, "strokeWidth", 4, this.f39657competently);
                this.f39659formularize = apical.beachfront(typedArray, xmlPullParser, "trimPathEnd", 6, this.f39659formularize);
                this.f39660impassible = apical.beachfront(typedArray, xmlPullParser, "trimPathOffset", 7, this.f39660impassible);
                this.f39654apical = apical.beachfront(typedArray, xmlPullParser, "trimPathStart", 5, this.f39654apical);
                this.f39634dern = apical.competently(typedArray, xmlPullParser, "fillType", 13, this.f39634dern);
            }
        }

        public final Paint.Cap marial(int i, Paint.Cap cap) {
            if (i == 0) {
                return Paint.Cap.BUTT;
            }
            if (i != 1) {
                return i != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        @Override // weimar.competently.marial
        public boolean saneness(int[] iArr) {
            return this.f39656beachfront.cutely(iArr) | this.f39661impromptu.cutely(iArr);
        }

        public void setFillAlpha(float f) {
            this.f39658cutely = f;
        }

        public void setFillColor(int i) {
            this.f39661impromptu.apical(i);
        }

        public void setStrokeAlpha(float f) {
            this.f39664taiyuan = f;
        }

        public void setStrokeColor(int i) {
            this.f39656beachfront.apical(i);
        }

        public void setStrokeWidth(float f) {
            this.f39657competently = f;
        }

        public void setTrimPathEnd(float f) {
            this.f39659formularize = f;
        }

        public void setTrimPathOffset(float f) {
            this.f39660impassible = f;
        }

        public void setTrimPathStart(float f) {
            this.f39654apical = f;
        }

        public dern(dern dernVar) {
            super(dernVar);
            this.f39657competently = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f39664taiyuan = 1.0f;
            this.f39658cutely = 1.0f;
            this.f39654apical = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f39659formularize = 1.0f;
            this.f39660impassible = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f39665triweekly = Paint.Cap.BUTT;
            this.f39662kowloon = Paint.Join.MITER;
            this.f39655arytenoidectomy = 4.0f;
            this.f39663marial = dernVar.f39663marial;
            this.f39656beachfront = dernVar.f39656beachfront;
            this.f39657competently = dernVar.f39657competently;
            this.f39664taiyuan = dernVar.f39664taiyuan;
            this.f39661impromptu = dernVar.f39661impromptu;
            this.f39634dern = dernVar.f39634dern;
            this.f39658cutely = dernVar.f39658cutely;
            this.f39654apical = dernVar.f39654apical;
            this.f39659formularize = dernVar.f39659formularize;
            this.f39660impassible = dernVar.f39660impassible;
            this.f39665triweekly = dernVar.f39665triweekly;
            this.f39662kowloon = dernVar.f39662kowloon;
            this.f39655arytenoidectomy = dernVar.f39655arytenoidectomy;
        }
    }

    /* JADX INFO: renamed from: weimar.competently$competently, reason: collision with other inner class name */
    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    public static class C0820competently {

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public static final Matrix f39637monoploid = new Matrix();

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public float f39638apical;

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final androidx.collection.attabal<String, Object> f39639arytenoidectomy;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Path f39640attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public PathMeasure f39641beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public int f39642competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public float f39643cutely;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final Matrix f39644dern;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public float f39645formularize;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public int f39646impassible;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public final wireman f39647impromptu;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public Boolean f39648kowloon;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public Paint f39649marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Path f39650saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public float f39651taiyuan;

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        public String f39652triweekly;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public Paint f39653wireman;

        public C0820competently() {
            this.f39644dern = new Matrix();
            this.f39651taiyuan = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f39643cutely = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f39638apical = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f39645formularize = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f39646impassible = 255;
            this.f39652triweekly = null;
            this.f39648kowloon = null;
            this.f39639arytenoidectomy = new androidx.collection.attabal<>();
            this.f39647impromptu = new wireman();
            this.f39640attabal = new Path();
            this.f39650saneness = new Path();
        }

        public static float attabal(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        public boolean beachfront() {
            if (this.f39648kowloon == null) {
                this.f39648kowloon = Boolean.valueOf(this.f39647impromptu.attabal());
            }
            return this.f39648kowloon.booleanValue();
        }

        public boolean competently(int[] iArr) {
            return this.f39647impromptu.saneness(iArr);
        }

        public final void dern(wireman wiremanVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            wireman wiremanVar2 = wiremanVar;
            wiremanVar2.f39680attabal.set(matrix);
            wiremanVar2.f39680attabal.preConcat(wiremanVar2.f39683cutely);
            canvas.save();
            int i3 = 0;
            while (i3 < wiremanVar2.f39689saneness.size()) {
                marial marialVar = wiremanVar2.f39689saneness.get(i3);
                if (marialVar instanceof wireman) {
                    dern((wireman) marialVar, wiremanVar2.f39680attabal, canvas, i, i2, colorFilter);
                } else if (marialVar instanceof beachfront) {
                    wireman(wiremanVar2, (beachfront) marialVar, canvas, i, i2, colorFilter);
                }
                i3++;
                wiremanVar2 = wiremanVar;
            }
            canvas.restore();
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f39646impassible;
        }

        public final float marial(Matrix matrix) {
            float[] fArr = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fAttabal = attabal(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            return fMax > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Math.abs(fAttabal) / fMax : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        public void saneness(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dern(this.f39647impromptu, f39637monoploid, canvas, i, i2, colorFilter);
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f39646impassible = i;
        }

        public final void wireman(wireman wiremanVar, beachfront beachfrontVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = i / this.f39638apical;
            float f2 = i2 / this.f39645formularize;
            float fMin = Math.min(f, f2);
            Matrix matrix = wiremanVar.f39680attabal;
            this.f39644dern.set(matrix);
            this.f39644dern.postScale(f, f2);
            float fMarial = marial(matrix);
            if (fMarial == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return;
            }
            beachfrontVar.wireman(this.f39640attabal);
            Path path = this.f39640attabal;
            this.f39650saneness.reset();
            if (beachfrontVar.dern()) {
                this.f39650saneness.setFillType(beachfrontVar.f39634dern == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f39650saneness.addPath(path, this.f39644dern);
                canvas.clipPath(this.f39650saneness);
                return;
            }
            dern dernVar = (dern) beachfrontVar;
            float f3 = dernVar.f39654apical;
            if (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || dernVar.f39659formularize != 1.0f) {
                float f4 = dernVar.f39660impassible;
                float f5 = (f3 + f4) % 1.0f;
                float f6 = (dernVar.f39659formularize + f4) % 1.0f;
                if (this.f39641beachfront == null) {
                    this.f39641beachfront = new PathMeasure();
                }
                this.f39641beachfront.setPath(this.f39640attabal, false);
                float length = this.f39641beachfront.getLength();
                float f7 = f5 * length;
                float f8 = f6 * length;
                path.reset();
                if (f7 > f8) {
                    this.f39641beachfront.getSegment(f7, length, path, true);
                    this.f39641beachfront.getSegment(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f8, path, true);
                } else {
                    this.f39641beachfront.getSegment(f7, f8, path, true);
                }
                path.rLineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            this.f39650saneness.addPath(path, this.f39644dern);
            if (dernVar.f39661impromptu.formularize()) {
                lightstruck.wireman wiremanVar2 = dernVar.f39661impromptu;
                if (this.f39649marial == null) {
                    Paint paint = new Paint(1);
                    this.f39649marial = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f39649marial;
                if (wiremanVar2.impromptu()) {
                    Shader shaderBeachfront = wiremanVar2.beachfront();
                    shaderBeachfront.setLocalMatrix(this.f39644dern);
                    paint2.setShader(shaderBeachfront);
                    paint2.setAlpha(Math.round(dernVar.f39658cutely * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(competently.attabal(wiremanVar2.marial(), dernVar.f39658cutely));
                }
                paint2.setColorFilter(colorFilter);
                this.f39650saneness.setFillType(dernVar.f39634dern == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f39650saneness, paint2);
            }
            if (dernVar.f39656beachfront.formularize()) {
                lightstruck.wireman wiremanVar3 = dernVar.f39656beachfront;
                if (this.f39653wireman == null) {
                    Paint paint3 = new Paint(1);
                    this.f39653wireman = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f39653wireman;
                Paint.Join join = dernVar.f39662kowloon;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = dernVar.f39665triweekly;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(dernVar.f39655arytenoidectomy);
                if (wiremanVar3.impromptu()) {
                    Shader shaderBeachfront2 = wiremanVar3.beachfront();
                    shaderBeachfront2.setLocalMatrix(this.f39644dern);
                    paint4.setShader(shaderBeachfront2);
                    paint4.setAlpha(Math.round(dernVar.f39664taiyuan * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(competently.attabal(wiremanVar3.marial(), dernVar.f39664taiyuan));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(dernVar.f39657competently * fMin * fMarial);
                canvas.drawPath(this.f39650saneness, paint4);
            }
        }

        public C0820competently(C0820competently c0820competently) {
            this.f39644dern = new Matrix();
            this.f39651taiyuan = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f39643cutely = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f39638apical = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f39645formularize = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f39646impassible = 255;
            this.f39652triweekly = null;
            this.f39648kowloon = null;
            androidx.collection.attabal<String, Object> attabalVar = new androidx.collection.attabal<>();
            this.f39639arytenoidectomy = attabalVar;
            this.f39647impromptu = new wireman(c0820competently.f39647impromptu, attabalVar);
            this.f39640attabal = new Path(c0820competently.f39640attabal);
            this.f39650saneness = new Path(c0820competently.f39650saneness);
            this.f39651taiyuan = c0820competently.f39651taiyuan;
            this.f39643cutely = c0820competently.f39643cutely;
            this.f39638apical = c0820competently.f39638apical;
            this.f39645formularize = c0820competently.f39645formularize;
            this.f39642competently = c0820competently.f39642competently;
            this.f39646impassible = c0820competently.f39646impassible;
            this.f39652triweekly = c0820competently.f39652triweekly;
            String str = c0820competently.f39652triweekly;
            if (str != null) {
                attabalVar.put(str, this);
            }
            this.f39648kowloon = c0820competently.f39648kowloon;
        }
    }

    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    public static class wireman extends marial {

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public int f39679apical;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Matrix f39680attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public float f39681beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public float f39682competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public final Matrix f39683cutely;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public float f39684dern;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public int[] f39685formularize;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public String f39686impassible;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public float f39687impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public float f39688marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final ArrayList<marial> f39689saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public float f39690taiyuan;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public float f39691wireman;

        public wireman(wireman wiremanVar, androidx.collection.attabal<String, Object> attabalVar) {
            beachfront sanenessVar;
            super();
            this.f39680attabal = new Matrix();
            this.f39689saneness = new ArrayList<>();
            this.f39684dern = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f39691wireman = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f39688marial = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f39681beachfront = 1.0f;
            this.f39682competently = 1.0f;
            this.f39687impromptu = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f39690taiyuan = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            Matrix matrix = new Matrix();
            this.f39683cutely = matrix;
            this.f39686impassible = null;
            this.f39684dern = wiremanVar.f39684dern;
            this.f39691wireman = wiremanVar.f39691wireman;
            this.f39688marial = wiremanVar.f39688marial;
            this.f39681beachfront = wiremanVar.f39681beachfront;
            this.f39682competently = wiremanVar.f39682competently;
            this.f39687impromptu = wiremanVar.f39687impromptu;
            this.f39690taiyuan = wiremanVar.f39690taiyuan;
            this.f39685formularize = wiremanVar.f39685formularize;
            String str = wiremanVar.f39686impassible;
            this.f39686impassible = str;
            this.f39679apical = wiremanVar.f39679apical;
            if (str != null) {
                attabalVar.put(str, this);
            }
            matrix.set(wiremanVar.f39683cutely);
            ArrayList<marial> arrayList = wiremanVar.f39689saneness;
            for (int i = 0; i < arrayList.size(); i++) {
                marial marialVar = arrayList.get(i);
                if (marialVar instanceof wireman) {
                    this.f39689saneness.add(new wireman((wireman) marialVar, attabalVar));
                } else {
                    if (marialVar instanceof dern) {
                        sanenessVar = new dern((dern) marialVar);
                    } else {
                        if (!(marialVar instanceof saneness)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        sanenessVar = new saneness((saneness) marialVar);
                    }
                    this.f39689saneness.add(sanenessVar);
                    String str2 = sanenessVar.f39635saneness;
                    if (str2 != null) {
                        attabalVar.put(str2, sanenessVar);
                    }
                }
            }
        }

        @Override // weimar.competently.marial
        public boolean attabal() {
            for (int i = 0; i < this.f39689saneness.size(); i++) {
                if (this.f39689saneness.get(i).attabal()) {
                    return true;
                }
            }
            return false;
        }

        public void dern(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayApical = apical.apical(resources, theme, attributeSet, weimar.attabal.f39619saneness);
            marial(typedArrayApical, xmlPullParser);
            typedArrayApical.recycle();
        }

        public String getGroupName() {
            return this.f39686impassible;
        }

        public Matrix getLocalMatrix() {
            return this.f39683cutely;
        }

        public float getPivotX() {
            return this.f39691wireman;
        }

        public float getPivotY() {
            return this.f39688marial;
        }

        public float getRotation() {
            return this.f39684dern;
        }

        public float getScaleX() {
            return this.f39681beachfront;
        }

        public float getScaleY() {
            return this.f39682competently;
        }

        public float getTranslateX() {
            return this.f39687impromptu;
        }

        public float getTranslateY() {
            return this.f39690taiyuan;
        }

        public final void marial(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f39685formularize = null;
            this.f39684dern = apical.beachfront(typedArray, xmlPullParser, "rotation", 5, this.f39684dern);
            this.f39691wireman = typedArray.getFloat(1, this.f39691wireman);
            this.f39688marial = typedArray.getFloat(2, this.f39688marial);
            this.f39681beachfront = apical.beachfront(typedArray, xmlPullParser, "scaleX", 3, this.f39681beachfront);
            this.f39682competently = apical.beachfront(typedArray, xmlPullParser, "scaleY", 4, this.f39682competently);
            this.f39687impromptu = apical.beachfront(typedArray, xmlPullParser, "translateX", 6, this.f39687impromptu);
            this.f39690taiyuan = apical.beachfront(typedArray, xmlPullParser, "translateY", 7, this.f39690taiyuan);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f39686impassible = string;
            }
            wireman();
        }

        @Override // weimar.competently.marial
        public boolean saneness(int[] iArr) {
            boolean zSaneness = false;
            for (int i = 0; i < this.f39689saneness.size(); i++) {
                zSaneness |= this.f39689saneness.get(i).saneness(iArr);
            }
            return zSaneness;
        }

        public void setPivotX(float f) {
            if (f != this.f39691wireman) {
                this.f39691wireman = f;
                wireman();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f39688marial) {
                this.f39688marial = f;
                wireman();
            }
        }

        public void setRotation(float f) {
            if (f != this.f39684dern) {
                this.f39684dern = f;
                wireman();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f39681beachfront) {
                this.f39681beachfront = f;
                wireman();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f39682competently) {
                this.f39682competently = f;
                wireman();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f39687impromptu) {
                this.f39687impromptu = f;
                wireman();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f39690taiyuan) {
                this.f39690taiyuan = f;
                wireman();
            }
        }

        public final void wireman() {
            this.f39683cutely.reset();
            this.f39683cutely.postTranslate(-this.f39691wireman, -this.f39688marial);
            this.f39683cutely.postScale(this.f39681beachfront, this.f39682competently);
            this.f39683cutely.postRotate(this.f39684dern, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f39683cutely.postTranslate(this.f39687impromptu + this.f39691wireman, this.f39690taiyuan + this.f39688marial);
        }

        public wireman() {
            super();
            this.f39680attabal = new Matrix();
            this.f39689saneness = new ArrayList<>();
            this.f39684dern = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f39691wireman = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f39688marial = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f39681beachfront = 1.0f;
            this.f39682competently = 1.0f;
            this.f39687impromptu = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f39690taiyuan = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f39683cutely = new Matrix();
            this.f39686impassible = null;
        }
    }
}
