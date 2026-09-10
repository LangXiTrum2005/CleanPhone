package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.google.android.material.card.MaterialCardView;
import com.unity3d.services.UnityAdsConstants;
import czestochowa.dern;
import java.util.Objects;
import sensatory.wireman;

/* JADX INFO: loaded from: classes.dex */
public class MotionLabel extends View implements dern {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public float f8710adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public Path f8711arytenoidectomy;

    /* JADX INFO: renamed from: clubfoot, reason: collision with root package name */
    public float f8712clubfoot;

    /* JADX INFO: renamed from: coffeecake, reason: collision with root package name */
    public float f8713coffeecake;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public int f8714cord;

    /* JADX INFO: renamed from: creditor, reason: collision with root package name */
    public float f8715creditor;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public int f8716cuirassed;

    /* JADX INFO: renamed from: cultivated, reason: collision with root package name */
    public Paint f8717cultivated;

    /* JADX INFO: renamed from: dent, reason: collision with root package name */
    public float f8718dent;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public ViewOutlineProvider f8719dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public RectF f8720gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public float f8721graveside;

    /* JADX INFO: renamed from: grimness, reason: collision with root package name */
    public int f8722grimness;

    /* JADX INFO: renamed from: hydrovane, reason: collision with root package name */
    public Drawable f8723hydrovane;

    /* JADX INFO: renamed from: itchy, reason: collision with root package name */
    public float f8724itchy;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public int f8725kattegat;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public TextPaint f8726kowloon;

    /* JADX INFO: renamed from: lerp, reason: collision with root package name */
    public float f8727lerp;

    /* JADX INFO: renamed from: mathsort, reason: collision with root package name */
    public BitmapShader f8728mathsort;

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public String f8729merc;

    /* JADX INFO: renamed from: milliradian, reason: collision with root package name */
    public Paint f8730milliradian;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public boolean f8731molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public int f8732monoploid;

    /* JADX INFO: renamed from: nosophobia, reason: collision with root package name */
    public float f8733nosophobia;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public boolean f8734oilcan;

    /* JADX INFO: renamed from: overspeculate, reason: collision with root package name */
    public float f8735overspeculate;

    /* JADX INFO: renamed from: peridotite, reason: collision with root package name */
    public Bitmap f8736peridotite;

    /* JADX INFO: renamed from: permissivist, reason: collision with root package name */
    public float f8737permissivist;

    /* JADX INFO: renamed from: polder, reason: collision with root package name */
    public Layout f8738polder;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public int f8739polloi;

    /* JADX INFO: renamed from: premeiotic, reason: collision with root package name */
    public int f8740premeiotic;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public float f8741preprohormone;

    /* JADX INFO: renamed from: privatdozent, reason: collision with root package name */
    public float f8742privatdozent;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
    public int f8743restrictive;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public float f8744rotuma;

    /* JADX INFO: renamed from: saran, reason: collision with root package name */
    public boolean f8745saran;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public int f8746sealless;

    /* JADX INFO: renamed from: seminary, reason: collision with root package name */
    public int f8747seminary;

    /* JADX INFO: renamed from: splinterproof, reason: collision with root package name */
    public Matrix f8748splinterproof;

    /* JADX INFO: renamed from: starveling, reason: collision with root package name */
    public float f8749starveling;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public float f8750stratoscope;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public int f8751supplicat;

    /* JADX INFO: renamed from: timberyard, reason: collision with root package name */
    public Rect f8752timberyard;

    /* JADX INFO: renamed from: treadless, reason: collision with root package name */
    public float f8753treadless;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public String f8754trm;

    /* JADX INFO: renamed from: walach, reason: collision with root package name */
    public Matrix f8755walach;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public Rect f8756yemenite;

    public class attabal extends ViewOutlineProvider {
        public attabal() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = MotionLabel.this.getWidth();
            int height = MotionLabel.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * MotionLabel.this.f8721graveside) / 2.0f);
        }
    }

    public class saneness extends ViewOutlineProvider {
        public saneness() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), MotionLabel.this.f8710adultoid);
        }
    }

    public MotionLabel(Context context) {
        super(context);
        this.f8726kowloon = new TextPaint();
        this.f8711arytenoidectomy = new Path();
        this.f8732monoploid = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.f8739polloi = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.f8731molybdenite = false;
        this.f8721graveside = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f8710adultoid = Float.NaN;
        this.f8744rotuma = 48.0f;
        this.f8741preprohormone = Float.NaN;
        this.f8750stratoscope = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f8754trm = "Hello World";
        this.f8734oilcan = true;
        this.f8756yemenite = new Rect();
        this.f8746sealless = 1;
        this.f8725kattegat = 1;
        this.f8751supplicat = 1;
        this.f8743restrictive = 1;
        this.f8747seminary = MaterialCardView.CHECKED_ICON_GRAVITY_TOP_START;
        this.f8722grimness = 0;
        this.f8745saran = false;
        this.f8735overspeculate = Float.NaN;
        this.f8712clubfoot = Float.NaN;
        this.f8718dent = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f8737permissivist = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f8717cultivated = new Paint();
        this.f8740premeiotic = 0;
        this.f8724itchy = Float.NaN;
        this.f8713coffeecake = Float.NaN;
        this.f8727lerp = Float.NaN;
        this.f8733nosophobia = Float.NaN;
        competently(context, null);
    }

    private float getHorizontalOffset() {
        float f = Float.isNaN(this.f8741preprohormone) ? 1.0f : this.f8744rotuma / this.f8741preprohormone;
        TextPaint textPaint = this.f8726kowloon;
        String str = this.f8754trm;
        return (((((Float.isNaN(this.f8715creditor) ? getMeasuredWidth() : this.f8715creditor) - getPaddingLeft()) - getPaddingRight()) - (f * textPaint.measureText(str, 0, str.length()))) * (this.f8718dent + 1.0f)) / 2.0f;
    }

    private float getVerticalOffset() {
        float f = Float.isNaN(this.f8741preprohormone) ? 1.0f : this.f8744rotuma / this.f8741preprohormone;
        Paint.FontMetrics fontMetrics = this.f8726kowloon.getFontMetrics();
        float measuredHeight = ((Float.isNaN(this.f8749starveling) ? getMeasuredHeight() : this.f8749starveling) - getPaddingTop()) - getPaddingBottom();
        float f2 = fontMetrics.descent;
        float f3 = fontMetrics.ascent;
        return (((measuredHeight - ((f2 - f3) * f)) * (1.0f - this.f8737permissivist)) / 2.0f) - (f * f3);
    }

    private void setUpTheme(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(beachfront.attabal.colorPrimary, typedValue, true);
        TextPaint textPaint = this.f8726kowloon;
        int i = typedValue.data;
        this.f8732monoploid = i;
        textPaint.setColor(i);
    }

    public final void apical() {
        boolean zIsNaN = Float.isNaN(this.f8724itchy);
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f2 = zIsNaN ? 0.0f : this.f8724itchy;
        float f3 = Float.isNaN(this.f8713coffeecake) ? 0.0f : this.f8713coffeecake;
        float f4 = Float.isNaN(this.f8727lerp) ? 1.0f : this.f8727lerp;
        if (!Float.isNaN(this.f8733nosophobia)) {
            f = this.f8733nosophobia;
        }
        this.f8748splinterproof.reset();
        float width = this.f8736peridotite.getWidth();
        float height = this.f8736peridotite.getHeight();
        float f5 = Float.isNaN(this.f8712clubfoot) ? this.f8715creditor : this.f8712clubfoot;
        float f6 = Float.isNaN(this.f8735overspeculate) ? this.f8749starveling : this.f8735overspeculate;
        float f7 = f4 * (width * f6 < height * f5 ? f5 / width : f6 / height);
        this.f8748splinterproof.postScale(f7, f7);
        float f8 = width * f7;
        float f9 = f5 - f8;
        float f10 = f7 * height;
        float f11 = f6 - f10;
        if (!Float.isNaN(this.f8735overspeculate)) {
            f11 = this.f8735overspeculate / 2.0f;
        }
        if (!Float.isNaN(this.f8712clubfoot)) {
            f9 = this.f8712clubfoot / 2.0f;
        }
        this.f8748splinterproof.postTranslate((((f2 * f9) + f5) - f8) * 0.5f, (((f3 * f11) + f6) - f10) * 0.5f);
        this.f8748splinterproof.postRotate(f, f5 / 2.0f, f6 / 2.0f);
        this.f8728mathsort.setLocalMatrix(this.f8748splinterproof);
    }

    @Override // czestochowa.dern
    public void attabal(float f, float f2, float f3, float f4) {
        int i = (int) (f + 0.5f);
        this.f8742privatdozent = f - i;
        int i2 = (int) (f3 + 0.5f);
        int i3 = i2 - i;
        int i4 = (int) (f4 + 0.5f);
        int i5 = (int) (0.5f + f2);
        int i6 = i4 - i5;
        float f5 = f3 - f;
        this.f8715creditor = f5;
        float f6 = f4 - f2;
        this.f8749starveling = f6;
        wireman(f, f2, f3, f4);
        if (getMeasuredHeight() == i6 && getMeasuredWidth() == i3) {
            super.layout(i, i5, i2, i4);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            super.layout(i, i5, i2, i4);
        }
        if (this.f8745saran) {
            if (this.f8752timberyard == null) {
                this.f8730milliradian = new Paint();
                this.f8752timberyard = new Rect();
                this.f8730milliradian.set(this.f8726kowloon);
                this.f8753treadless = this.f8730milliradian.getTextSize();
            }
            this.f8715creditor = f5;
            this.f8749starveling = f6;
            Paint paint = this.f8730milliradian;
            String str = this.f8754trm;
            paint.getTextBounds(str, 0, str.length(), this.f8752timberyard);
            int iWidth = this.f8752timberyard.width();
            float fHeight = this.f8752timberyard.height() * 1.3f;
            float f7 = (f5 - this.f8725kattegat) - this.f8746sealless;
            float f8 = (f6 - this.f8743restrictive) - this.f8751supplicat;
            float f9 = iWidth;
            if (f9 * f8 > fHeight * f7) {
                this.f8726kowloon.setTextSize((this.f8753treadless * f7) / f9);
            } else {
                this.f8726kowloon.setTextSize((this.f8753treadless * f8) / fHeight);
            }
            if (this.f8731molybdenite || !Float.isNaN(this.f8741preprohormone)) {
                beachfront(Float.isNaN(this.f8741preprohormone) ? 1.0f : this.f8744rotuma / this.f8741preprohormone);
            }
        }
    }

    public void beachfront(float f) {
        if (this.f8731molybdenite || f != 1.0f) {
            this.f8711arytenoidectomy.reset();
            String str = this.f8754trm;
            int length = str.length();
            this.f8726kowloon.getTextBounds(str, 0, length, this.f8756yemenite);
            this.f8726kowloon.getTextPath(str, 0, length, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f8711arytenoidectomy);
            if (f != 1.0f) {
                czestochowa.attabal.attabal();
                Matrix matrix = new Matrix();
                matrix.postScale(f, f);
                this.f8711arytenoidectomy.transform(matrix);
            }
            Rect rect = this.f8756yemenite;
            rect.right--;
            rect.left++;
            rect.bottom++;
            rect.top--;
            RectF rectF = new RectF();
            rectF.bottom = getHeight();
            rectF.right = getWidth();
            this.f8734oilcan = false;
        }
    }

    public final void competently(Context context, AttributeSet attributeSet) {
        setUpTheme(context);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, wireman.MotionLabel);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == wireman.MotionLabel_android_text) {
                    setText(typedArrayObtainStyledAttributes.getText(index));
                } else if (index == wireman.MotionLabel_android_fontFamily) {
                    this.f8729merc = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == wireman.MotionLabel_scaleFromTextSize) {
                    this.f8741preprohormone = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.f8741preprohormone);
                } else if (index == wireman.MotionLabel_android_textSize) {
                    this.f8744rotuma = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.f8744rotuma);
                } else if (index == wireman.MotionLabel_android_textStyle) {
                    this.f8714cord = typedArrayObtainStyledAttributes.getInt(index, this.f8714cord);
                } else if (index == wireman.MotionLabel_android_typeface) {
                    this.f8716cuirassed = typedArrayObtainStyledAttributes.getInt(index, this.f8716cuirassed);
                } else if (index == wireman.MotionLabel_android_textColor) {
                    this.f8732monoploid = typedArrayObtainStyledAttributes.getColor(index, this.f8732monoploid);
                } else if (index == wireman.MotionLabel_borderRound) {
                    float dimension = typedArrayObtainStyledAttributes.getDimension(index, this.f8710adultoid);
                    this.f8710adultoid = dimension;
                    setRound(dimension);
                } else if (index == wireman.MotionLabel_borderRoundPercent) {
                    float f = typedArrayObtainStyledAttributes.getFloat(index, this.f8721graveside);
                    this.f8721graveside = f;
                    setRoundPercent(f);
                } else if (index == wireman.MotionLabel_android_gravity) {
                    setGravity(typedArrayObtainStyledAttributes.getInt(index, -1));
                } else if (index == wireman.MotionLabel_android_autoSizeTextType) {
                    this.f8722grimness = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == wireman.MotionLabel_textOutlineColor) {
                    this.f8739polloi = typedArrayObtainStyledAttributes.getInt(index, this.f8739polloi);
                    this.f8731molybdenite = true;
                } else if (index == wireman.MotionLabel_textOutlineThickness) {
                    this.f8750stratoscope = typedArrayObtainStyledAttributes.getDimension(index, this.f8750stratoscope);
                    this.f8731molybdenite = true;
                } else if (index == wireman.MotionLabel_textBackground) {
                    this.f8723hydrovane = typedArrayObtainStyledAttributes.getDrawable(index);
                    this.f8731molybdenite = true;
                } else if (index == wireman.MotionLabel_textBackgroundPanX) {
                    this.f8724itchy = typedArrayObtainStyledAttributes.getFloat(index, this.f8724itchy);
                } else if (index == wireman.MotionLabel_textBackgroundPanY) {
                    this.f8713coffeecake = typedArrayObtainStyledAttributes.getFloat(index, this.f8713coffeecake);
                } else if (index == wireman.MotionLabel_textPanX) {
                    this.f8718dent = typedArrayObtainStyledAttributes.getFloat(index, this.f8718dent);
                } else if (index == wireman.MotionLabel_textPanY) {
                    this.f8737permissivist = typedArrayObtainStyledAttributes.getFloat(index, this.f8737permissivist);
                } else if (index == wireman.MotionLabel_textBackgroundRotate) {
                    this.f8733nosophobia = typedArrayObtainStyledAttributes.getFloat(index, this.f8733nosophobia);
                } else if (index == wireman.MotionLabel_textBackgroundZoom) {
                    this.f8727lerp = typedArrayObtainStyledAttributes.getFloat(index, this.f8727lerp);
                } else if (index == wireman.MotionLabel_textureHeight) {
                    this.f8735overspeculate = typedArrayObtainStyledAttributes.getDimension(index, this.f8735overspeculate);
                } else if (index == wireman.MotionLabel_textureWidth) {
                    this.f8712clubfoot = typedArrayObtainStyledAttributes.getDimension(index, this.f8712clubfoot);
                } else if (index == wireman.MotionLabel_textureEffect) {
                    this.f8740premeiotic = typedArrayObtainStyledAttributes.getInt(index, this.f8740premeiotic);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        cutely();
        taiyuan();
    }

    public final void cutely() {
        if (this.f8723hydrovane != null) {
            this.f8748splinterproof = new Matrix();
            int intrinsicWidth = this.f8723hydrovane.getIntrinsicWidth();
            int intrinsicHeight = this.f8723hydrovane.getIntrinsicHeight();
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                intrinsicWidth = Float.isNaN(this.f8712clubfoot) ? 128 : (int) this.f8712clubfoot;
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                intrinsicHeight = Float.isNaN(this.f8735overspeculate) ? 128 : (int) this.f8735overspeculate;
            }
            if (this.f8740premeiotic != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.f8736peridotite = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f8736peridotite);
            this.f8723hydrovane.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.f8723hydrovane.setFilterBitmap(true);
            this.f8723hydrovane.draw(canvas);
            if (this.f8740premeiotic != 0) {
                this.f8736peridotite = marial(this.f8736peridotite, 4);
            }
            Bitmap bitmap = this.f8736peridotite;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.f8728mathsort = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    public float getRound() {
        return this.f8710adultoid;
    }

    public float getRoundPercent() {
        return this.f8721graveside;
    }

    public float getScaleFromTextSize() {
        return this.f8741preprohormone;
    }

    public float getTextBackgroundPanX() {
        return this.f8724itchy;
    }

    public float getTextBackgroundPanY() {
        return this.f8713coffeecake;
    }

    public float getTextBackgroundRotate() {
        return this.f8733nosophobia;
    }

    public float getTextBackgroundZoom() {
        return this.f8727lerp;
    }

    public int getTextOutlineColor() {
        return this.f8739polloi;
    }

    public float getTextPanX() {
        return this.f8718dent;
    }

    public float getTextPanY() {
        return this.f8737permissivist;
    }

    public float getTextureHeight() {
        return this.f8735overspeculate;
    }

    public float getTextureWidth() {
        return this.f8712clubfoot;
    }

    public Typeface getTypeface() {
        return this.f8726kowloon.getTypeface();
    }

    public final void impromptu(String str, int i, int i2) {
        Typeface typefaceCreate;
        if (str != null) {
            typefaceCreate = Typeface.create(str, i2);
            if (typefaceCreate != null) {
                setTypeface(typefaceCreate);
                return;
            }
        } else {
            typefaceCreate = null;
        }
        if (i == 1) {
            typefaceCreate = Typeface.SANS_SERIF;
        } else if (i == 2) {
            typefaceCreate = Typeface.SERIF;
        } else if (i == 3) {
            typefaceCreate = Typeface.MONOSPACE;
        }
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (i2 <= 0) {
            this.f8726kowloon.setFakeBoldText(false);
            this.f8726kowloon.setTextSkewX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            setTypeface(typefaceCreate);
            return;
        }
        Typeface typefaceDefaultFromStyle = typefaceCreate == null ? Typeface.defaultFromStyle(i2) : Typeface.create(typefaceCreate, i2);
        setTypeface(typefaceDefaultFromStyle);
        int i3 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i2;
        this.f8726kowloon.setFakeBoldText((i3 & 1) != 0);
        TextPaint textPaint = this.f8726kowloon;
        if ((i3 & 2) != 0) {
            f = -0.25f;
        }
        textPaint.setTextSkewX(f);
    }

    @Override // android.view.View
    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        boolean zIsNaN = Float.isNaN(this.f8741preprohormone);
        float f = zIsNaN ? 1.0f : this.f8744rotuma / this.f8741preprohormone;
        this.f8715creditor = i3 - i;
        this.f8749starveling = i4 - i2;
        if (this.f8745saran) {
            if (this.f8752timberyard == null) {
                this.f8730milliradian = new Paint();
                this.f8752timberyard = new Rect();
                this.f8730milliradian.set(this.f8726kowloon);
                this.f8753treadless = this.f8730milliradian.getTextSize();
            }
            Paint paint = this.f8730milliradian;
            String str = this.f8754trm;
            paint.getTextBounds(str, 0, str.length(), this.f8752timberyard);
            int iWidth = this.f8752timberyard.width();
            int iHeight = (int) (this.f8752timberyard.height() * 1.3f);
            float f2 = (this.f8715creditor - this.f8725kattegat) - this.f8746sealless;
            float f3 = (this.f8749starveling - this.f8743restrictive) - this.f8751supplicat;
            if (zIsNaN) {
                float f4 = iWidth;
                float f5 = iHeight;
                if (f4 * f3 > f5 * f2) {
                    this.f8726kowloon.setTextSize((this.f8753treadless * f2) / f4);
                } else {
                    this.f8726kowloon.setTextSize((this.f8753treadless * f3) / f5);
                }
            } else {
                float f6 = iWidth;
                float f7 = iHeight;
                f = f6 * f3 > f7 * f2 ? f2 / f6 : f3 / f7;
            }
        }
        if (this.f8731molybdenite || !zIsNaN) {
            wireman(i, i2, i3, i4);
            beachfront(f);
        }
    }

    public Bitmap marial(Bitmap bitmap, int i) {
        int width = bitmap.getWidth() / 2;
        int height = bitmap.getHeight() / 2;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
        for (int i2 = 0; i2 < i && width >= 32 && height >= 32; i2++) {
            width /= 2;
            height /= 2;
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, width, height, true);
        }
        return bitmapCreateScaledBitmap;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f = Float.isNaN(this.f8741preprohormone) ? 1.0f : this.f8744rotuma / this.f8741preprohormone;
        super.onDraw(canvas);
        if (!this.f8731molybdenite && f == 1.0f) {
            canvas.drawText(this.f8754trm, this.f8742privatdozent + this.f8746sealless + getHorizontalOffset(), this.f8751supplicat + getVerticalOffset(), this.f8726kowloon);
            return;
        }
        if (this.f8734oilcan) {
            beachfront(f);
        }
        if (this.f8755walach == null) {
            this.f8755walach = new Matrix();
        }
        if (!this.f8731molybdenite) {
            float horizontalOffset = this.f8746sealless + getHorizontalOffset();
            float verticalOffset = this.f8751supplicat + getVerticalOffset();
            this.f8755walach.reset();
            this.f8755walach.preTranslate(horizontalOffset, verticalOffset);
            this.f8711arytenoidectomy.transform(this.f8755walach);
            this.f8726kowloon.setColor(this.f8732monoploid);
            this.f8726kowloon.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f8726kowloon.setStrokeWidth(this.f8750stratoscope);
            canvas.drawPath(this.f8711arytenoidectomy, this.f8726kowloon);
            this.f8755walach.reset();
            this.f8755walach.preTranslate(-horizontalOffset, -verticalOffset);
            this.f8711arytenoidectomy.transform(this.f8755walach);
            return;
        }
        this.f8717cultivated.set(this.f8726kowloon);
        this.f8755walach.reset();
        float horizontalOffset2 = this.f8746sealless + getHorizontalOffset();
        float verticalOffset2 = this.f8751supplicat + getVerticalOffset();
        this.f8755walach.postTranslate(horizontalOffset2, verticalOffset2);
        this.f8755walach.preScale(f, f);
        this.f8711arytenoidectomy.transform(this.f8755walach);
        if (this.f8728mathsort != null) {
            this.f8726kowloon.setFilterBitmap(true);
            this.f8726kowloon.setShader(this.f8728mathsort);
        } else {
            this.f8726kowloon.setColor(this.f8732monoploid);
        }
        this.f8726kowloon.setStyle(Paint.Style.FILL);
        this.f8726kowloon.setStrokeWidth(this.f8750stratoscope);
        canvas.drawPath(this.f8711arytenoidectomy, this.f8726kowloon);
        if (this.f8728mathsort != null) {
            this.f8726kowloon.setShader(null);
        }
        this.f8726kowloon.setColor(this.f8739polloi);
        this.f8726kowloon.setStyle(Paint.Style.STROKE);
        this.f8726kowloon.setStrokeWidth(this.f8750stratoscope);
        canvas.drawPath(this.f8711arytenoidectomy, this.f8726kowloon);
        this.f8755walach.reset();
        this.f8755walach.postTranslate(-horizontalOffset2, -verticalOffset2);
        this.f8711arytenoidectomy.transform(this.f8755walach);
        this.f8726kowloon.set(this.f8717cultivated);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f8745saran = false;
        this.f8746sealless = getPaddingLeft();
        this.f8725kattegat = getPaddingRight();
        this.f8751supplicat = getPaddingTop();
        this.f8743restrictive = getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            TextPaint textPaint = this.f8726kowloon;
            String str = this.f8754trm;
            textPaint.getTextBounds(str, 0, str.length(), this.f8756yemenite);
            if (mode != 1073741824) {
                size = (int) (this.f8756yemenite.width() + 0.99999f);
            }
            size += this.f8746sealless + this.f8725kattegat;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (this.f8726kowloon.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.f8751supplicat + this.f8743restrictive + fontMetricsInt;
            }
        } else if (this.f8722grimness != 0) {
            this.f8745saran = true;
        }
        setMeasuredDimension(size, size2);
    }

    public void setGravity(int i) {
        if ((i & 8388615) == 0) {
            i |= 8388611;
        }
        if ((i & 112) == 0) {
            i |= 48;
        }
        if (i != this.f8747seminary) {
            invalidate();
        }
        this.f8747seminary = i;
        int i2 = i & 112;
        if (i2 == 48) {
            this.f8737permissivist = -1.0f;
        } else if (i2 != 80) {
            this.f8737permissivist = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            this.f8737permissivist = 1.0f;
        }
        int i3 = i & 8388615;
        if (i3 != 3) {
            if (i3 != 5) {
                if (i3 != 8388611) {
                    if (i3 != 8388613) {
                        this.f8718dent = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        return;
                    }
                }
            }
            this.f8718dent = 1.0f;
            return;
        }
        this.f8718dent = -1.0f;
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f8710adultoid = f;
            float f2 = this.f8721graveside;
            this.f8721graveside = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f8710adultoid != f;
        this.f8710adultoid = f;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (this.f8711arytenoidectomy == null) {
                this.f8711arytenoidectomy = new Path();
            }
            if (this.f8720gintrap == null) {
                this.f8720gintrap = new RectF();
            }
            if (this.f8719dovishness == null) {
                saneness sanenessVar = new saneness();
                this.f8719dovishness = sanenessVar;
                setOutlineProvider(sanenessVar);
            }
            setClipToOutline(true);
            this.f8720gintrap.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), getHeight());
            this.f8711arytenoidectomy.reset();
            Path path = this.f8711arytenoidectomy;
            RectF rectF = this.f8720gintrap;
            float f3 = this.f8710adultoid;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z = this.f8721graveside != f;
        this.f8721graveside = f;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (this.f8711arytenoidectomy == null) {
                this.f8711arytenoidectomy = new Path();
            }
            if (this.f8720gintrap == null) {
                this.f8720gintrap = new RectF();
            }
            if (this.f8719dovishness == null) {
                attabal attabalVar = new attabal();
                this.f8719dovishness = attabalVar;
                setOutlineProvider(attabalVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f8721graveside) / 2.0f;
            this.f8720gintrap.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height);
            this.f8711arytenoidectomy.reset();
            this.f8711arytenoidectomy.addRoundRect(this.f8720gintrap, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f) {
        this.f8741preprohormone = f;
    }

    public void setText(CharSequence charSequence) {
        this.f8754trm = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f) {
        this.f8724itchy = f;
        apical();
        invalidate();
    }

    public void setTextBackgroundPanY(float f) {
        this.f8713coffeecake = f;
        apical();
        invalidate();
    }

    public void setTextBackgroundRotate(float f) {
        this.f8733nosophobia = f;
        apical();
        invalidate();
    }

    public void setTextBackgroundZoom(float f) {
        this.f8727lerp = f;
        apical();
        invalidate();
    }

    public void setTextFillColor(int i) {
        this.f8732monoploid = i;
        invalidate();
    }

    public void setTextOutlineColor(int i) {
        this.f8739polloi = i;
        this.f8731molybdenite = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f) {
        this.f8750stratoscope = f;
        this.f8731molybdenite = true;
        if (Float.isNaN(f)) {
            this.f8750stratoscope = 1.0f;
            this.f8731molybdenite = false;
        }
        invalidate();
    }

    public void setTextPanX(float f) {
        this.f8718dent = f;
        invalidate();
    }

    public void setTextPanY(float f) {
        this.f8737permissivist = f;
        invalidate();
    }

    public void setTextSize(float f) {
        this.f8744rotuma = f;
        TextPaint textPaint = this.f8726kowloon;
        if (!Float.isNaN(this.f8741preprohormone)) {
            f = this.f8741preprohormone;
        }
        textPaint.setTextSize(f);
        beachfront(Float.isNaN(this.f8741preprohormone) ? 1.0f : this.f8744rotuma / this.f8741preprohormone);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f) {
        this.f8735overspeculate = f;
        apical();
        invalidate();
    }

    public void setTextureWidth(float f) {
        this.f8712clubfoot = f;
        apical();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        if (Objects.equals(this.f8726kowloon.getTypeface(), typeface)) {
            return;
        }
        this.f8726kowloon.setTypeface(typeface);
        if (this.f8738polder != null) {
            this.f8738polder = null;
            requestLayout();
            invalidate();
        }
    }

    public void taiyuan() {
        this.f8746sealless = getPaddingLeft();
        this.f8725kattegat = getPaddingRight();
        this.f8751supplicat = getPaddingTop();
        this.f8743restrictive = getPaddingBottom();
        impromptu(this.f8729merc, this.f8716cuirassed, this.f8714cord);
        this.f8726kowloon.setColor(this.f8732monoploid);
        this.f8726kowloon.setStrokeWidth(this.f8750stratoscope);
        this.f8726kowloon.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f8726kowloon.setFlags(128);
        setTextSize(this.f8744rotuma);
        this.f8726kowloon.setAntiAlias(true);
    }

    public final void wireman(float f, float f2, float f3, float f4) {
        if (this.f8748splinterproof == null) {
            return;
        }
        this.f8715creditor = f3 - f;
        this.f8749starveling = f4 - f2;
        apical();
    }

    public MotionLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8726kowloon = new TextPaint();
        this.f8711arytenoidectomy = new Path();
        this.f8732monoploid = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.f8739polloi = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.f8731molybdenite = false;
        this.f8721graveside = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f8710adultoid = Float.NaN;
        this.f8744rotuma = 48.0f;
        this.f8741preprohormone = Float.NaN;
        this.f8750stratoscope = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f8754trm = "Hello World";
        this.f8734oilcan = true;
        this.f8756yemenite = new Rect();
        this.f8746sealless = 1;
        this.f8725kattegat = 1;
        this.f8751supplicat = 1;
        this.f8743restrictive = 1;
        this.f8747seminary = MaterialCardView.CHECKED_ICON_GRAVITY_TOP_START;
        this.f8722grimness = 0;
        this.f8745saran = false;
        this.f8735overspeculate = Float.NaN;
        this.f8712clubfoot = Float.NaN;
        this.f8718dent = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f8737permissivist = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f8717cultivated = new Paint();
        this.f8740premeiotic = 0;
        this.f8724itchy = Float.NaN;
        this.f8713coffeecake = Float.NaN;
        this.f8727lerp = Float.NaN;
        this.f8733nosophobia = Float.NaN;
        competently(context, attributeSet);
    }

    public MotionLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8726kowloon = new TextPaint();
        this.f8711arytenoidectomy = new Path();
        this.f8732monoploid = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.f8739polloi = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.f8731molybdenite = false;
        this.f8721graveside = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f8710adultoid = Float.NaN;
        this.f8744rotuma = 48.0f;
        this.f8741preprohormone = Float.NaN;
        this.f8750stratoscope = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f8754trm = "Hello World";
        this.f8734oilcan = true;
        this.f8756yemenite = new Rect();
        this.f8746sealless = 1;
        this.f8725kattegat = 1;
        this.f8751supplicat = 1;
        this.f8743restrictive = 1;
        this.f8747seminary = MaterialCardView.CHECKED_ICON_GRAVITY_TOP_START;
        this.f8722grimness = 0;
        this.f8745saran = false;
        this.f8735overspeculate = Float.NaN;
        this.f8712clubfoot = Float.NaN;
        this.f8718dent = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f8737permissivist = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f8717cultivated = new Paint();
        this.f8740premeiotic = 0;
        this.f8724itchy = Float.NaN;
        this.f8713coffeecake = Float.NaN;
        this.f8727lerp = Float.NaN;
        this.f8733nosophobia = Float.NaN;
        competently(context, attributeSet);
    }
}
