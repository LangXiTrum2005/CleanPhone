package nitroguanidine;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import com.unity3d.services.UnityAdsConstants;
import monroe.dern;

/* JADX INFO: compiled from: ShadowRenderer.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Paint f33935attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f33936beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final Path f33937competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Paint f33938dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final Paint f33939impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f33940marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Paint f33941saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f33942wireman;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final int[] f33934taiyuan = new int[3];

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final float[] f33932cutely = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 1.0f};

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final int[] f33931apical = new int[4];

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static final float[] f33933formularize = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 1.0f};

    public attabal() {
        this(-16777216);
    }

    public void attabal(Canvas canvas, Matrix matrix, RectF rectF, int i, float f, float f2) {
        float f3;
        boolean z = f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Path path = this.f33937competently;
        if (z) {
            int[] iArr = f33931apical;
            iArr[0] = 0;
            iArr[1] = this.f33936beachfront;
            iArr[2] = this.f33940marial;
            iArr[3] = this.f33942wireman;
            f3 = f;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            f3 = f;
            path.arcTo(rectF, f3, f2);
            path.close();
            float f4 = -i;
            rectF.inset(f4, f4);
            int[] iArr2 = f33931apical;
            iArr2[0] = 0;
            iArr2[1] = this.f33942wireman;
            iArr2[2] = this.f33940marial;
            iArr2[3] = this.f33936beachfront;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        float f5 = 1.0f - (i / fWidth);
        float[] fArr = f33933formularize;
        fArr[1] = f5;
        fArr[2] = ((1.0f - f5) / 2.0f) + f5;
        this.f33941saneness.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f33931apical, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f33939impromptu);
        }
        canvas.drawArc(rectF, f3, f2, true, this.f33941saneness);
        canvas.restore();
    }

    public Paint dern() {
        return this.f33935attabal;
    }

    public void saneness(Canvas canvas, Matrix matrix, RectF rectF, int i) {
        rectF.bottom += i;
        rectF.offset(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -i);
        int[] iArr = f33934taiyuan;
        iArr[0] = this.f33936beachfront;
        iArr[1] = this.f33940marial;
        iArr[2] = this.f33942wireman;
        Paint paint = this.f33938dern;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, f33932cutely, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f33938dern);
        canvas.restore();
    }

    public void wireman(int i) {
        this.f33942wireman = dern.apical(i, 68);
        this.f33940marial = dern.apical(i, 20);
        this.f33936beachfront = dern.apical(i, 0);
        this.f33935attabal.setColor(this.f33942wireman);
    }

    public attabal(int i) {
        this.f33937competently = new Path();
        Paint paint = new Paint();
        this.f33939impromptu = paint;
        this.f33935attabal = new Paint();
        wireman(i);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f33941saneness = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f33938dern = new Paint(paint2);
    }
}
