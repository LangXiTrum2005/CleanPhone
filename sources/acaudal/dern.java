package acaudal;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import chinny.apical;
import com.google.android.material.loadingindicator.LoadingIndicatorSpec;
import microchemistry.adultoid;
import microchemistry.impassible;
import microchemistry.rotuma;

/* JADX INFO: compiled from: LoadingIndicatorDrawingDelegate.java */
/* JADX INFO: loaded from: classes3.dex */
public class dern {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final impassible[] f3255marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final adultoid[] f3256wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public LoadingIndicatorSpec f3257attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Path f3259saneness = new Path();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Matrix f3258dern = new Matrix();

    /* JADX INFO: compiled from: LoadingIndicatorDrawingDelegate.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f3260attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public float f3261dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public float f3262saneness;
    }

    static {
        adultoid[] adultoidVarArr = {apical.starveling(apical.f15437yemenite, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), apical.starveling(apical.f15424preprohormone, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), apical.starveling(apical.f15423polloi, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), apical.starveling(apical.f15434triweekly, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), apical.starveling(apical.f15411graveside, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), apical.starveling(apical.f15408dovishness, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), apical.starveling(apical.f15413impassible, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f))};
        f3256wireman = adultoidVarArr;
        f3255marial = new impassible[adultoidVarArr.length];
        int i = 0;
        while (true) {
            adultoid[] adultoidVarArr2 = f3256wireman;
            if (i >= adultoidVarArr2.length) {
                return;
            }
            int i2 = i + 1;
            f3255marial[i] = new impassible(adultoidVarArr2[i], adultoidVarArr2[i2 % adultoidVarArr2.length]);
            i = i2;
        }
    }

    public dern(LoadingIndicatorSpec loadingIndicatorSpec) {
        this.f3257attabal = loadingIndicatorSpec;
    }

    public void attabal(Canvas canvas, Rect rect) {
        canvas.translate(rect.centerX(), rect.centerY());
        if (this.f3257attabal.f20543attabal) {
            float fMin = Math.min(rect.width() / marial(), rect.height() / wireman());
            canvas.scale(fMin, fMin);
        }
        canvas.clipRect((-marial()) / 2.0f, (-wireman()) / 2.0f, marial() / 2.0f, wireman() / 2.0f);
        canvas.rotate(-90.0f);
    }

    public void dern(Canvas canvas, Paint paint, attabal attabalVar, int i) {
        paint.setColor(pyrope.attabal.attabal(attabalVar.f3260attabal, i));
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        canvas.rotate(attabalVar.f3261dern);
        this.f3259saneness.rewind();
        int iFloor = (int) Math.floor(attabalVar.f3262saneness);
        impassible[] impassibleVarArr = f3255marial;
        rotuma.saneness(impassibleVarArr[othin.attabal.wireman(iFloor, impassibleVarArr.length)], attabalVar.f3262saneness - iFloor, this.f3259saneness);
        Matrix matrix = this.f3258dern;
        int i2 = this.f3257attabal.f20547saneness;
        matrix.setScale(i2 / 2.0f, i2 / 2.0f);
        this.f3259saneness.transform(this.f3258dern);
        canvas.drawPath(this.f3259saneness, paint);
        canvas.restore();
    }

    public int marial() {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f3257attabal;
        return Math.max(loadingIndicatorSpec.f20548wireman, loadingIndicatorSpec.f20547saneness);
    }

    public void saneness(Canvas canvas, Paint paint, int i, int i2) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f3257attabal;
        float fMin = Math.min(loadingIndicatorSpec.f20545dern, loadingIndicatorSpec.f20548wireman) / 2.0f;
        paint.setColor(pyrope.attabal.attabal(i, i2));
        paint.setStyle(Paint.Style.FILL);
        LoadingIndicatorSpec loadingIndicatorSpec2 = this.f3257attabal;
        int i3 = loadingIndicatorSpec2.f20545dern;
        int i4 = loadingIndicatorSpec2.f20548wireman;
        canvas.drawRoundRect(new RectF((-i3) / 2.0f, (-i4) / 2.0f, i3 / 2.0f, i4 / 2.0f), fMin, fMin, paint);
    }

    public int wireman() {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f3257attabal;
        return Math.max(loadingIndicatorSpec.f20545dern, loadingIndicatorSpec.f20547saneness);
    }
}
