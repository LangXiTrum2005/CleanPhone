package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: LinearDrawingDelegate.java */
/* JADX INFO: loaded from: classes3.dex */
public final class impassible extends cutely<LinearProgressIndicatorSpec> {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public float f20690apical;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public float f20691beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public float f20692competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public float f20693cutely;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public int f20694formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public boolean f20695impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public float f20696impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public Pair<cutely<LinearProgressIndicatorSpec>.saneness, cutely<LinearProgressIndicatorSpec>.saneness> f20697kowloon;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public float f20698taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public float f20699triweekly;

    public impassible(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.f20691beachfront = 300.0f;
        this.f20697kowloon = new Pair<>(new cutely.saneness(), new cutely.saneness());
    }

    private void cutely(PathMeasure pathMeasure, Path path, Pair<cutely<LinearProgressIndicatorSpec>.saneness, cutely<LinearProgressIndicatorSpec>.saneness> pair, float f, float f2, float f3, float f4) {
        int i = this.f20695impassible ? ((LinearProgressIndicatorSpec) this.f20658attabal).f20744cutely : ((LinearProgressIndicatorSpec) this.f20658attabal).f20740apical;
        if (pathMeasure == this.f20662wireman && i != this.f20694formularize) {
            this.f20694formularize = i;
            competently();
        }
        path.rewind();
        float f5 = (-this.f20691beachfront) / 2.0f;
        boolean zSaneness = ((LinearProgressIndicatorSpec) this.f20658attabal).saneness(this.f20695impassible);
        if (zSaneness) {
            float f6 = this.f20691beachfront;
            float f7 = this.f20690apical;
            float f8 = f6 / f7;
            float f9 = f4 / f8;
            float f10 = f8 / (f8 + 1.0f);
            f = (f + f9) * f10;
            f2 = (f2 + f9) * f10;
            f5 -= f4 * f7;
        }
        float length = f * pathMeasure.getLength();
        float length2 = f2 * pathMeasure.getLength();
        pathMeasure.getSegment(length, length2, path, true);
        cutely.saneness sanenessVar = (cutely.saneness) pair.first;
        sanenessVar.dern();
        pathMeasure.getPosTan(length, sanenessVar.f20671attabal, sanenessVar.f20673saneness);
        cutely.saneness sanenessVar2 = (cutely.saneness) pair.second;
        sanenessVar2.dern();
        pathMeasure.getPosTan(length2, sanenessVar2.f20671attabal, sanenessVar2.f20673saneness);
        this.f20660marial.reset();
        this.f20660marial.setTranslate(f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        sanenessVar.beachfront(f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        sanenessVar2.beachfront(f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (zSaneness) {
            float f11 = this.f20693cutely * f3;
            this.f20660marial.postScale(1.0f, f11);
            sanenessVar.marial(1.0f, f11);
            sanenessVar2.marial(1.0f, f11);
        }
        path.transform(this.f20660marial);
    }

    private void formularize(Canvas canvas, Paint paint, cutely<LinearProgressIndicatorSpec>.saneness sanenessVar, float f, float f2, float f3) {
        impassible(canvas, paint, sanenessVar, f, f2, f3, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
    }

    public final void apical(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5;
        float fBeachfront;
        Paint paint2;
        Canvas canvas2;
        float fAttabal = achondroplasia.attabal.attabal(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        float fAttabal2 = achondroplasia.attabal.attabal(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        float fBeachfront2 = othin.attabal.beachfront(1.0f - this.f20699triweekly, 1.0f, fAttabal);
        float fBeachfront3 = othin.attabal.beachfront(1.0f - this.f20699triweekly, 1.0f, fAttabal2);
        int iAttabal = (int) ((i2 * achondroplasia.attabal.attabal(fBeachfront2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.01f)) / 0.01f);
        int iAttabal2 = (int) ((i3 * (1.0f - achondroplasia.attabal.attabal(fBeachfront3, 0.99f, 1.0f))) / 0.01f);
        float f6 = this.f20691beachfront;
        int i4 = (int) ((fBeachfront2 * f6) + iAttabal);
        int i5 = (int) ((fBeachfront3 * f6) - iAttabal2);
        float f7 = this.f20696impromptu;
        float f8 = this.f20698taiyuan;
        if (f7 != f8) {
            float fMax = Math.max(f7, f8);
            float f9 = this.f20691beachfront;
            float f10 = fMax / f9;
            float fBeachfront4 = othin.attabal.beachfront(this.f20696impromptu, this.f20698taiyuan, achondroplasia.attabal.attabal(i4 / f9, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10) / f10);
            float f11 = this.f20696impromptu;
            float f12 = this.f20698taiyuan;
            float f13 = this.f20691beachfront;
            fBeachfront = othin.attabal.beachfront(f11, f12, achondroplasia.attabal.attabal((f13 - i5) / f13, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10) / f10);
            f5 = fBeachfront4;
        } else {
            f5 = f7;
            fBeachfront = f5;
        }
        float f14 = (-this.f20691beachfront) / 2.0f;
        boolean z2 = ((LinearProgressIndicatorSpec) this.f20658attabal).saneness(this.f20695impassible) && z && f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (i4 <= i5) {
            float f15 = i4 + f5;
            float f16 = i5 - fBeachfront;
            float f17 = f5 * 2.0f;
            float f18 = 2.0f * fBeachfront;
            paint.setColor(i);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.f20692competently);
            ((cutely.saneness) this.f20697kowloon.first).dern();
            ((cutely.saneness) this.f20697kowloon.second).dern();
            ((cutely.saneness) this.f20697kowloon.first).beachfront(f15 + f14, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ((cutely.saneness) this.f20697kowloon.second).beachfront(f14 + f16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            if (i4 == 0 && f16 + fBeachfront < f15 + f5) {
                Pair<cutely<LinearProgressIndicatorSpec>.saneness, cutely<LinearProgressIndicatorSpec>.saneness> pair = this.f20697kowloon;
                cutely<LinearProgressIndicatorSpec>.saneness sanenessVar = (cutely.saneness) pair.first;
                float f19 = this.f20692competently;
                impassible(canvas, paint, sanenessVar, f17, f19, f5, (cutely.saneness) pair.second, f18, f19, fBeachfront, true);
                return;
            }
            if (f15 - f5 > f16 - fBeachfront) {
                Pair<cutely<LinearProgressIndicatorSpec>.saneness, cutely<LinearProgressIndicatorSpec>.saneness> pair2 = this.f20697kowloon;
                cutely<LinearProgressIndicatorSpec>.saneness sanenessVar2 = (cutely.saneness) pair2.second;
                float f20 = this.f20692competently;
                impassible(canvas, paint, sanenessVar2, f18, f20, fBeachfront, (cutely.saneness) pair2.first, f17, f20, f5, false);
                return;
            }
            float f21 = fBeachfront;
            float f22 = f5;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(((LinearProgressIndicatorSpec) this.f20658attabal).competently() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            if (z2) {
                paint2 = paint;
                PathMeasure pathMeasure = this.f20662wireman;
                Path path = this.f20659dern;
                Pair<cutely<LinearProgressIndicatorSpec>.saneness, cutely<LinearProgressIndicatorSpec>.saneness> pair3 = this.f20697kowloon;
                float f23 = this.f20691beachfront;
                cutely(pathMeasure, path, pair3, f15 / f23, f16 / f23, f3, f4);
                canvas2 = canvas;
                canvas2.drawPath(this.f20659dern, paint2);
            } else {
                Pair<cutely<LinearProgressIndicatorSpec>.saneness, cutely<LinearProgressIndicatorSpec>.saneness> pair4 = this.f20697kowloon;
                Object obj = pair4.first;
                float f24 = ((cutely.saneness) obj).f20671attabal[0];
                float f25 = ((cutely.saneness) obj).f20671attabal[1];
                Object obj2 = pair4.second;
                canvas.drawLine(f24, f25, ((cutely.saneness) obj2).f20671attabal[0], ((cutely.saneness) obj2).f20671attabal[1], paint);
                paint2 = paint;
                canvas2 = canvas;
            }
            if (((LinearProgressIndicatorSpec) this.f20658attabal).competently()) {
                return;
            }
            if (f15 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f22 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                formularize(canvas2, paint2, (cutely.saneness) this.f20697kowloon.first, f17, this.f20692competently, f22);
            }
            if (f16 >= this.f20691beachfront || f21 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return;
            }
            formularize(canvas, paint, (cutely.saneness) this.f20697kowloon.second, f18, this.f20692competently, f21);
        }
    }

    @Override // com.google.android.material.progressindicator.cutely
    public void attabal(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        if (this.f20691beachfront != rect.width()) {
            this.f20691beachfront = rect.width();
            competently();
        }
        float fMarial = marial();
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (rect.height() - fMarial) / 2.0f));
        if (((LinearProgressIndicatorSpec) this.f20658attabal).f20651monoploid) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f2 = this.f20691beachfront / 2.0f;
        float f3 = fMarial / 2.0f;
        canvas.clipRect(-f2, -f3, f2, f3);
        S s = this.f20658attabal;
        this.f20692competently = ((LinearProgressIndicatorSpec) s).f20741attabal * f;
        this.f20696impromptu = Math.min(((LinearProgressIndicatorSpec) s).f20741attabal / 2, ((LinearProgressIndicatorSpec) s).attabal()) * f;
        S s2 = this.f20658attabal;
        this.f20693cutely = ((LinearProgressIndicatorSpec) s2).f20746formularize * f;
        this.f20698taiyuan = Math.min(((LinearProgressIndicatorSpec) s2).f20741attabal / 2.0f, ((LinearProgressIndicatorSpec) s2).taiyuan()) * f;
        if (z || z2) {
            if ((z && ((LinearProgressIndicatorSpec) this.f20658attabal).f20743competently == 2) || (z2 && ((LinearProgressIndicatorSpec) this.f20658attabal).f20748impromptu == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z || (z2 && ((LinearProgressIndicatorSpec) this.f20658attabal).f20748impromptu != 3)) {
                canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (((LinearProgressIndicatorSpec) this.f20658attabal).f20741attabal * (1.0f - f)) / 2.0f);
            }
        }
        if (z2 && ((LinearProgressIndicatorSpec) this.f20658attabal).f20748impromptu == 3) {
            this.f20699triweekly = f;
        } else {
            this.f20699triweekly = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.cutely
    public int beachfront() {
        return -1;
    }

    @Override // com.google.android.material.progressindicator.cutely
    public void competently() {
        this.f20661saneness.rewind();
        if (((LinearProgressIndicatorSpec) this.f20658attabal).saneness(this.f20695impassible)) {
            int i = this.f20695impassible ? ((LinearProgressIndicatorSpec) this.f20658attabal).f20744cutely : ((LinearProgressIndicatorSpec) this.f20658attabal).f20740apical;
            float f = this.f20691beachfront;
            int i2 = (int) (f / i);
            this.f20690apical = f / i2;
            for (int i3 = 0; i3 <= i2; i3++) {
                int i4 = i3 * 2;
                float f2 = i4 + 1;
                this.f20661saneness.cubicTo(i4 + 0.48f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2 - 0.48f, 1.0f, f2, 1.0f);
                float f3 = i4 + 2;
                this.f20661saneness.cubicTo(f2 + 0.48f, 1.0f, f3 - 0.48f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            this.f20660marial.reset();
            this.f20660marial.setScale(this.f20690apical / 2.0f, -2.0f);
            this.f20660marial.postTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            this.f20661saneness.transform(this.f20660marial);
        } else {
            this.f20661saneness.lineTo(this.f20691beachfront, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        this.f20662wireman.setPath(this.f20661saneness, false);
    }

    @Override // com.google.android.material.progressindicator.cutely
    public void dern(Canvas canvas, Paint paint, cutely.attabal attabalVar, int i) {
        int iAttabal = pyrope.attabal.attabal(attabalVar.f20666dern, i);
        this.f20695impassible = attabalVar.f20667impromptu;
        float f = attabalVar.f20663attabal;
        float f2 = attabalVar.f20669saneness;
        int i2 = attabalVar.f20670wireman;
        apical(canvas, paint, f, f2, iAttabal, i2, i2, attabalVar.f20668marial, attabalVar.f20664beachfront, true);
    }

    public final void impassible(Canvas canvas, Paint paint, cutely<LinearProgressIndicatorSpec>.saneness sanenessVar, float f, float f2, float f3, cutely<LinearProgressIndicatorSpec>.saneness sanenessVar2, float f4, float f5, float f6, boolean z) {
        char c;
        float f7;
        float f8;
        float fMin = Math.min(f2, this.f20692competently);
        float f9 = (-f) / 2.0f;
        float f10 = (-fMin) / 2.0f;
        float f11 = f / 2.0f;
        float f12 = fMin / 2.0f;
        RectF rectF = new RectF(f9, f10, f11, f12);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (sanenessVar2 != null) {
            float fMin2 = Math.min(f5, this.f20692competently);
            float fMin3 = Math.min(f4 / 2.0f, (f6 * fMin2) / this.f20692competently);
            RectF rectF2 = new RectF();
            if (z) {
                c = 0;
                float f13 = (sanenessVar2.f20671attabal[0] - fMin3) - (sanenessVar.f20671attabal[0] - f3);
                if (f13 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    sanenessVar2.beachfront((-f13) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    f8 = f4 + f13;
                } else {
                    f8 = f4;
                }
                rectF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, f11, f12);
            } else {
                c = 0;
                float f14 = (sanenessVar2.f20671attabal[0] + fMin3) - (sanenessVar.f20671attabal[0] + f3);
                if (f14 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    sanenessVar2.beachfront((-f14) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    f7 = f4 - f14;
                } else {
                    f7 = f4;
                }
                rectF2.set(f9, f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f12);
                f8 = f7;
            }
            RectF rectF3 = new RectF((-f8) / 2.0f, (-fMin2) / 2.0f, f8 / 2.0f, fMin2 / 2.0f);
            float[] fArr = sanenessVar2.f20671attabal;
            canvas.translate(fArr[c], fArr[1]);
            canvas.rotate(taiyuan(sanenessVar2.f20673saneness));
            Path path = new Path();
            path.addRoundRect(rectF3, fMin3, fMin3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-taiyuan(sanenessVar2.f20673saneness));
            float[] fArr2 = sanenessVar2.f20671attabal;
            canvas.translate(-fArr2[c], -fArr2[1]);
            float[] fArr3 = sanenessVar.f20671attabal;
            canvas.translate(fArr3[c], fArr3[1]);
            canvas.rotate(taiyuan(sanenessVar.f20673saneness));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f3, f3, paint);
        } else {
            float[] fArr4 = sanenessVar.f20671attabal;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(taiyuan(sanenessVar.f20673saneness));
            canvas.drawRoundRect(rectF, f3, f3, paint);
        }
        canvas.restore();
    }

    @Override // com.google.android.material.progressindicator.cutely
    public int marial() {
        S s = this.f20658attabal;
        return ((LinearProgressIndicatorSpec) s).f20741attabal + (((LinearProgressIndicatorSpec) s).f20746formularize * 2);
    }

    @Override // com.google.android.material.progressindicator.cutely
    public void saneness(Canvas canvas, Paint paint, int i, int i2) {
        int iAttabal = pyrope.attabal.attabal(i, i2);
        this.f20695impassible = false;
        if (((LinearProgressIndicatorSpec) this.f20658attabal).f20652polloi <= 0 || iAttabal == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iAttabal);
        S s = this.f20658attabal;
        cutely<LinearProgressIndicatorSpec>.saneness sanenessVar = new cutely.saneness(new float[]{(this.f20691beachfront / 2.0f) - (((LinearProgressIndicatorSpec) s).f20650molybdenite != null ? ((LinearProgressIndicatorSpec) s).f20650molybdenite.floatValue() + (((LinearProgressIndicatorSpec) this.f20658attabal).f20652polloi / 2.0f) : this.f20692competently / 2.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT}, new float[]{1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT});
        S s2 = this.f20658attabal;
        formularize(canvas, paint, sanenessVar, ((LinearProgressIndicatorSpec) s2).f20652polloi, ((LinearProgressIndicatorSpec) s2).f20652polloi, (this.f20696impromptu * ((LinearProgressIndicatorSpec) s2).f20652polloi) / this.f20692competently);
    }

    @Override // com.google.android.material.progressindicator.cutely
    public void wireman(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int iAttabal = pyrope.attabal.attabal(i, i2);
        this.f20695impassible = false;
        apical(canvas, paint, f, f2, iAttabal, i3, i3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
    }
}
