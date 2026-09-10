package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Pair;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* JADX INFO: compiled from: CircularDrawingDelegate.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dern extends cutely<CircularProgressIndicatorSpec> {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public float f20675apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final RectF f20676arytenoidectomy;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public float f20677beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public float f20678competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public float f20679cutely;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public int f20680formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public float f20681impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public float f20682impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public float f20683kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final Pair<cutely<CircularProgressIndicatorSpec>.saneness, cutely<CircularProgressIndicatorSpec>.saneness> f20684monoploid;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public float f20685taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public boolean f20686triweekly;

    public dern(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
        this.f20676arytenoidectomy = new RectF();
        this.f20684monoploid = new Pair<>(new cutely.saneness(), new cutely.saneness());
    }

    public final void apical(PathMeasure pathMeasure, Path path, Pair<cutely<CircularProgressIndicatorSpec>.saneness, cutely<CircularProgressIndicatorSpec>.saneness> pair, float f, float f2, float f3, float f4) {
        float f5 = this.f20682impromptu * f3;
        int i = this.f20686triweekly ? ((CircularProgressIndicatorSpec) this.f20658attabal).f20744cutely : ((CircularProgressIndicatorSpec) this.f20658attabal).f20740apical;
        float f6 = this.f20685taiyuan;
        if (f6 != this.f20681impassible || (pathMeasure == this.f20662wireman && (f5 != this.f20675apical || i != this.f20680formularize))) {
            this.f20675apical = f5;
            this.f20680formularize = i;
            this.f20681impassible = f6;
            competently();
        }
        path.rewind();
        float f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float fAttabal = achondroplasia.attabal.attabal(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        if (((CircularProgressIndicatorSpec) this.f20658attabal).saneness(this.f20686triweekly)) {
            float f8 = f4 / ((float) ((((double) this.f20685taiyuan) * 6.283185307179586d) / ((double) this.f20679cutely)));
            f += f8;
            f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - (f8 * 360.0f);
        }
        float f9 = f % 1.0f;
        float length = (pathMeasure.getLength() * f9) / 2.0f;
        float length2 = ((f9 + fAttabal) * pathMeasure.getLength()) / 2.0f;
        pathMeasure.getSegment(length, length2, path, true);
        cutely.saneness sanenessVar = (cutely.saneness) pair.first;
        sanenessVar.dern();
        pathMeasure.getPosTan(length, sanenessVar.f20671attabal, sanenessVar.f20673saneness);
        cutely.saneness sanenessVar2 = (cutely.saneness) pair.second;
        sanenessVar2.dern();
        pathMeasure.getPosTan(length2, sanenessVar2.f20671attabal, sanenessVar2.f20673saneness);
        this.f20660marial.reset();
        this.f20660marial.setRotate(f7);
        sanenessVar.wireman(f7);
        sanenessVar2.wireman(f7);
        path.transform(this.f20660marial);
    }

    public final int arytenoidectomy() {
        S s = this.f20658attabal;
        return ((CircularProgressIndicatorSpec) s).f20639arytenoidectomy + (((CircularProgressIndicatorSpec) s).f20642monoploid * 2);
    }

    @Override // com.google.android.material.progressindicator.cutely
    public void attabal(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        float fWidth = rect.width() / beachfront();
        float fHeight = rect.height() / marial();
        S s = this.f20658attabal;
        float f2 = (((CircularProgressIndicatorSpec) s).f20639arytenoidectomy / 2.0f) + ((CircularProgressIndicatorSpec) s).f20642monoploid;
        canvas.translate((f2 * fWidth) + rect.left, (f2 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (((CircularProgressIndicatorSpec) this.f20658attabal).f20643polloi != 0) {
            canvas.scale(1.0f, -1.0f);
            if (Build.VERSION.SDK_INT == 29) {
                canvas.rotate(0.1f);
            }
        }
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        S s2 = this.f20658attabal;
        this.f20677beachfront = ((CircularProgressIndicatorSpec) s2).f20741attabal * f;
        this.f20678competently = Math.min(((CircularProgressIndicatorSpec) s2).f20741attabal / 2, ((CircularProgressIndicatorSpec) s2).attabal()) * f;
        S s3 = this.f20658attabal;
        this.f20682impromptu = ((CircularProgressIndicatorSpec) s3).f20746formularize * f;
        float f4 = (((CircularProgressIndicatorSpec) s3).f20639arytenoidectomy - ((CircularProgressIndicatorSpec) s3).f20741attabal) / 2.0f;
        this.f20685taiyuan = f4;
        if (z || z2) {
            float f5 = ((1.0f - f) * ((CircularProgressIndicatorSpec) s3).f20741attabal) / 2.0f;
            if ((z && ((CircularProgressIndicatorSpec) s3).f20743competently == 2) || (z2 && ((CircularProgressIndicatorSpec) s3).f20748impromptu == 1)) {
                this.f20685taiyuan = f4 + f5;
            } else if ((z && ((CircularProgressIndicatorSpec) s3).f20743competently == 1) || (z2 && ((CircularProgressIndicatorSpec) s3).f20748impromptu == 2)) {
                this.f20685taiyuan = f4 - f5;
            }
        }
        if (z2 && ((CircularProgressIndicatorSpec) s3).f20748impromptu == 3) {
            this.f20683kowloon = f;
        } else {
            this.f20683kowloon = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.cutely
    public int beachfront() {
        return arytenoidectomy();
    }

    @Override // com.google.android.material.progressindicator.cutely
    public void competently() {
        this.f20661saneness.rewind();
        this.f20661saneness.moveTo(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        for (int i = 0; i < 2; i++) {
            this.f20661saneness.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            this.f20661saneness.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f20661saneness.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.0f);
            this.f20661saneness.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        this.f20660marial.reset();
        Matrix matrix = this.f20660marial;
        float f = this.f20685taiyuan;
        matrix.setScale(f, f);
        this.f20661saneness.transform(this.f20660marial);
        if (((CircularProgressIndicatorSpec) this.f20658attabal).saneness(this.f20686triweekly)) {
            this.f20662wireman.setPath(this.f20661saneness, false);
            formularize(this.f20662wireman, this.f20661saneness, this.f20675apical);
        }
        this.f20662wireman.setPath(this.f20661saneness, false);
    }

    public final void cutely(Path path, cutely<CircularProgressIndicatorSpec>.saneness sanenessVar, cutely<CircularProgressIndicatorSpec>.saneness sanenessVar2) {
        float f = (this.f20679cutely / 2.0f) * 0.48f;
        cutely.saneness sanenessVar3 = new cutely.saneness(this, sanenessVar);
        cutely.saneness sanenessVar4 = new cutely.saneness(this, sanenessVar2);
        sanenessVar3.saneness(f);
        sanenessVar4.saneness(-f);
        float[] fArr = sanenessVar3.f20671attabal;
        float f2 = fArr[0];
        float f3 = fArr[1];
        float[] fArr2 = sanenessVar4.f20671attabal;
        float f4 = fArr2[0];
        float f5 = fArr2[1];
        float[] fArr3 = sanenessVar2.f20671attabal;
        path.cubicTo(f2, f3, f4, f5, fArr3[0], fArr3[1]);
    }

    @Override // com.google.android.material.progressindicator.cutely
    public void dern(Canvas canvas, Paint paint, cutely.attabal attabalVar, int i) {
        int iAttabal = pyrope.attabal.attabal(attabalVar.f20666dern, i);
        canvas.save();
        canvas.rotate(attabalVar.f20665competently);
        this.f20686triweekly = attabalVar.f20667impromptu;
        float f = attabalVar.f20663attabal;
        float f2 = attabalVar.f20669saneness;
        int i2 = attabalVar.f20670wireman;
        impassible(canvas, paint, f, f2, iAttabal, i2, i2, attabalVar.f20668marial, attabalVar.f20664beachfront, true);
        canvas.restore();
    }

    public final void formularize(PathMeasure pathMeasure, Path path, float f) {
        path.rewind();
        float length = pathMeasure.getLength();
        int iMax = Math.max(3, (int) ((length / (this.f20686triweekly ? ((CircularProgressIndicatorSpec) this.f20658attabal).f20744cutely : ((CircularProgressIndicatorSpec) this.f20658attabal).f20740apical)) / 2.0f)) * 2;
        this.f20679cutely = length / iMax;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iMax; i++) {
            cutely.saneness sanenessVar = new cutely.saneness();
            float f2 = i;
            pathMeasure.getPosTan(this.f20679cutely * f2, sanenessVar.f20671attabal, sanenessVar.f20673saneness);
            cutely.saneness sanenessVar2 = new cutely.saneness();
            float f3 = this.f20679cutely;
            pathMeasure.getPosTan((f2 * f3) + (f3 / 2.0f), sanenessVar2.f20671attabal, sanenessVar2.f20673saneness);
            arrayList.add(sanenessVar);
            sanenessVar2.attabal(f * 2.0f);
            arrayList.add(sanenessVar2);
        }
        arrayList.add((cutely.saneness) arrayList.get(0));
        cutely<CircularProgressIndicatorSpec>.saneness sanenessVar3 = (cutely.saneness) arrayList.get(0);
        float[] fArr = sanenessVar3.f20671attabal;
        int i2 = 1;
        path.moveTo(fArr[0], fArr[1]);
        while (i2 < arrayList.size()) {
            cutely<CircularProgressIndicatorSpec>.saneness sanenessVar4 = (cutely.saneness) arrayList.get(i2);
            cutely(path, sanenessVar3, sanenessVar4);
            i2++;
            sanenessVar3 = sanenessVar4;
        }
    }

    public final void impassible(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5 = f2 >= f ? f2 - f : (f2 + 1.0f) - f;
        float f6 = f % 1.0f;
        if (f6 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f6 += 1.0f;
        }
        if (this.f20683kowloon < 1.0f) {
            float f7 = f6 + f5;
            if (f7 > 1.0f) {
                impassible(canvas, paint, f6, 1.0f, i, i2, 0, f3, f4, z);
                impassible(canvas, paint, 1.0f, f7, i, 0, i3, f3, f4, z);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.f20678competently / this.f20685taiyuan);
        float f8 = f5 - 0.99f;
        if (f8 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f9 = ((f8 * degrees) / 180.0f) / 0.01f;
            f5 += f9;
            if (!z) {
                f6 -= f9 / 2.0f;
            }
        }
        float fBeachfront = othin.attabal.beachfront(1.0f - this.f20683kowloon, 1.0f, f6);
        float fBeachfront2 = othin.attabal.beachfront(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f20683kowloon, f5);
        float degrees2 = (float) Math.toDegrees(i2 / this.f20685taiyuan);
        float degrees3 = ((fBeachfront2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i3 / this.f20685taiyuan));
        float f10 = (fBeachfront * 360.0f) + degrees2;
        if (degrees3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        boolean z2 = ((CircularProgressIndicatorSpec) this.f20658attabal).saneness(this.f20686triweekly) && z && f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.f20677beachfront);
        float f11 = this.f20678competently * 2.0f;
        float f12 = degrees * 2.0f;
        if (degrees3 < f12) {
            float f13 = degrees3 / f12;
            float f14 = f10 + (degrees * f13);
            cutely<CircularProgressIndicatorSpec>.saneness sanenessVar = new cutely.saneness();
            if (z2) {
                float length = ((f14 / 360.0f) * this.f20662wireman.getLength()) / 2.0f;
                float f15 = this.f20682impromptu * f3;
                float f16 = this.f20685taiyuan;
                if (f16 != this.f20681impassible || f15 != this.f20675apical) {
                    this.f20675apical = f15;
                    this.f20681impassible = f16;
                    competently();
                }
                this.f20662wireman.getPosTan(length, sanenessVar.f20671attabal, sanenessVar.f20673saneness);
            } else {
                sanenessVar.wireman(f14 + 90.0f);
                sanenessVar.attabal(-this.f20685taiyuan);
            }
            paint.setStyle(Paint.Style.FILL);
            kowloon(canvas, paint, sanenessVar, f11, this.f20677beachfront, f13);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(((CircularProgressIndicatorSpec) this.f20658attabal).competently() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f17 = f10 + degrees;
        float f18 = degrees3 - f12;
        ((cutely.saneness) this.f20684monoploid.first).dern();
        ((cutely.saneness) this.f20684monoploid.second).dern();
        if (z2) {
            apical(this.f20662wireman, this.f20659dern, this.f20684monoploid, f17 / 360.0f, f18 / 360.0f, f3, f4);
            canvas.drawPath(this.f20659dern, paint);
        } else {
            ((cutely.saneness) this.f20684monoploid.first).wireman(f17 + 90.0f);
            ((cutely.saneness) this.f20684monoploid.first).attabal(-this.f20685taiyuan);
            ((cutely.saneness) this.f20684monoploid.second).wireman(f17 + f18 + 90.0f);
            ((cutely.saneness) this.f20684monoploid.second).attabal(-this.f20685taiyuan);
            RectF rectF = this.f20676arytenoidectomy;
            float f19 = this.f20685taiyuan;
            rectF.set(-f19, -f19, f19, f19);
            canvas.drawArc(this.f20676arytenoidectomy, f17, f18, false, paint);
        }
        if (((CircularProgressIndicatorSpec) this.f20658attabal).competently() || this.f20678competently <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        triweekly(canvas, paint, (cutely.saneness) this.f20684monoploid.first, f11, this.f20677beachfront);
        triweekly(canvas, paint, (cutely.saneness) this.f20684monoploid.second, f11, this.f20677beachfront);
    }

    public final void kowloon(Canvas canvas, Paint paint, cutely<CircularProgressIndicatorSpec>.saneness sanenessVar, float f, float f2, float f3) {
        float fMin = Math.min(f2, this.f20677beachfront);
        float f4 = f / 2.0f;
        float fMin2 = Math.min(f4, (this.f20678competently * fMin) / this.f20677beachfront);
        RectF rectF = new RectF((-f) / 2.0f, (-fMin) / 2.0f, f4, fMin / 2.0f);
        canvas.save();
        float[] fArr = sanenessVar.f20671attabal;
        canvas.translate(fArr[0], fArr[1]);
        canvas.rotate(taiyuan(sanenessVar.f20673saneness));
        canvas.scale(f3, f3);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    @Override // com.google.android.material.progressindicator.cutely
    public int marial() {
        return arytenoidectomy();
    }

    public final void triweekly(Canvas canvas, Paint paint, cutely<CircularProgressIndicatorSpec>.saneness sanenessVar, float f, float f2) {
        kowloon(canvas, paint, sanenessVar, f, f2, 1.0f);
    }

    @Override // com.google.android.material.progressindicator.cutely
    public void wireman(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int iAttabal = pyrope.attabal.attabal(i, i2);
        this.f20686triweekly = false;
        impassible(canvas, paint, f, f2, iAttabal, i3, i3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
    }

    @Override // com.google.android.material.progressindicator.cutely
    public void saneness(Canvas canvas, Paint paint, int i, int i2) {
    }
}
