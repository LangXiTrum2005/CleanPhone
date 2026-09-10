package chinny;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: ShapeAppearancePathProvider.java */
/* JADX INFO: loaded from: classes3.dex */
public class arytenoidectomy {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final monoploid[] f15441attabal = new monoploid[4];

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Matrix[] f15449saneness = new Matrix[4];

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Matrix[] f15445dern = new Matrix[4];

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final PointF f15451wireman = new PointF();

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Path f15448marial = new Path();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final Path f15442beachfront = new Path();

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final monoploid f15443competently = new monoploid();

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final float[] f15447impromptu = new float[2];

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final float[] f15450taiyuan = new float[2];

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final Path f15444cutely = new Path();

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final Path f15440apical = new Path();

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public boolean f15446formularize = true;

    /* JADX INFO: compiled from: ShapeAppearancePathProvider.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final arytenoidectomy f15452attabal = new arytenoidectomy();
    }

    /* JADX INFO: compiled from: ShapeAppearancePathProvider.java */
    public static final class dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final kowloon f15453attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final RectF f15454dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final float f15455marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Path f15456saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final saneness f15457wireman;

        public dern(kowloon kowloonVar, float f, RectF rectF, saneness sanenessVar, Path path) {
            this.f15457wireman = sanenessVar;
            this.f15453attabal = kowloonVar;
            this.f15455marial = f;
            this.f15454dern = rectF;
            this.f15456saneness = path;
        }
    }

    /* JADX INFO: compiled from: ShapeAppearancePathProvider.java */
    public interface saneness {
        void attabal(monoploid monoploidVar, Matrix matrix, int i);

        void saneness(monoploid monoploidVar, Matrix matrix, int i);
    }

    public arytenoidectomy() {
        for (int i = 0; i < 4; i++) {
            this.f15441attabal[i] = new monoploid();
            this.f15449saneness[i] = new Matrix();
            this.f15445dern[i] = new Matrix();
        }
    }

    public static arytenoidectomy formularize() {
        return attabal.f15452attabal;
    }

    public final competently apical(int i, kowloon kowloonVar) {
        if (i == 1) {
            return kowloonVar.impromptu();
        }
        if (i != 2) {
            return i != 3 ? kowloonVar.kowloon() : kowloonVar.arytenoidectomy();
        }
        return kowloonVar.triweekly();
    }

    public final float attabal(int i) {
        return ((i + 1) % 4) * 90;
    }

    public void beachfront(kowloon kowloonVar, float[] fArr, float f, RectF rectF, saneness sanenessVar, Path path) {
        path.rewind();
        this.f15448marial.rewind();
        this.f15442beachfront.rewind();
        this.f15442beachfront.addRect(rectF, Path.Direction.CW);
        dern dernVar = new dern(kowloonVar, f, rectF, sanenessVar, path);
        for (int i = 0; i < 4; i++) {
            triweekly(dernVar, i, fArr);
            kowloon(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            saneness(dernVar, i2);
            dern(dernVar, i2);
        }
        path.close();
        this.f15448marial.close();
        if (this.f15448marial.isEmpty()) {
            return;
        }
        path.op(this.f15448marial, Path.Op.UNION);
    }

    public final void competently(int i, RectF rectF, PointF pointF) {
        if (i == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    public final float cutely(RectF rectF, int i) {
        float[] fArr = this.f15447impromptu;
        monoploid monoploidVar = this.f15441attabal[i];
        fArr[0] = monoploidVar.f15521dern;
        fArr[1] = monoploidVar.f15526wireman;
        this.f15449saneness[i].mapPoints(fArr);
        return (i == 1 || i == 3) ? Math.abs(rectF.centerX() - this.f15447impromptu[0]) : Math.abs(rectF.centerY() - this.f15447impromptu[1]);
    }

    public final void dern(dern dernVar, int i) {
        int i2 = (i + 1) % 4;
        this.f15447impromptu[0] = this.f15441attabal[i].taiyuan();
        this.f15447impromptu[1] = this.f15441attabal[i].cutely();
        this.f15449saneness[i].mapPoints(this.f15447impromptu);
        this.f15450taiyuan[0] = this.f15441attabal[i2].apical();
        this.f15450taiyuan[1] = this.f15441attabal[i2].formularize();
        this.f15449saneness[i2].mapPoints(this.f15450taiyuan);
        float[] fArr = this.f15447impromptu;
        float f = fArr[0];
        float[] fArr2 = this.f15450taiyuan;
        float fMax = Math.max(((float) Math.hypot(f - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float fCutely = cutely(dernVar.f15454dern, i);
        this.f15443competently.triweekly(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        competently competentlyVarApical = apical(i, dernVar.f15453attabal);
        competentlyVarApical.dern(fMax, fCutely, dernVar.f15455marial, this.f15443competently);
        this.f15444cutely.reset();
        this.f15443competently.wireman(this.f15445dern[i], this.f15444cutely);
        if (this.f15446formularize && (competentlyVarApical.attabal() || impassible(this.f15444cutely, i) || impassible(this.f15444cutely, i2))) {
            Path path = this.f15444cutely;
            path.op(path, this.f15442beachfront, Path.Op.DIFFERENCE);
            this.f15447impromptu[0] = this.f15443competently.apical();
            this.f15447impromptu[1] = this.f15443competently.formularize();
            this.f15445dern[i].mapPoints(this.f15447impromptu);
            Path path2 = this.f15448marial;
            float[] fArr3 = this.f15447impromptu;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f15443competently.wireman(this.f15445dern[i], this.f15448marial);
        } else {
            this.f15443competently.wireman(this.f15445dern[i], dernVar.f15456saneness);
        }
        saneness sanenessVar = dernVar.f15457wireman;
        if (sanenessVar != null) {
            sanenessVar.saneness(this.f15443competently, this.f15445dern[i], i);
        }
    }

    public final boolean impassible(Path path, int i) {
        this.f15440apical.reset();
        this.f15441attabal[i].wireman(this.f15449saneness[i], this.f15440apical);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f15440apical.computeBounds(rectF, true);
        path.op(this.f15440apical, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    public wireman impromptu(int i, kowloon kowloonVar) {
        if (i == 1) {
            return kowloonVar.formularize();
        }
        if (i != 2) {
            return i != 3 ? kowloonVar.graveside() : kowloonVar.polloi();
        }
        return kowloonVar.cutely();
    }

    public final void kowloon(int i) {
        this.f15447impromptu[0] = this.f15441attabal[i].taiyuan();
        this.f15447impromptu[1] = this.f15441attabal[i].cutely();
        this.f15449saneness[i].mapPoints(this.f15447impromptu);
        float fAttabal = attabal(i);
        this.f15445dern[i].reset();
        Matrix matrix = this.f15445dern[i];
        float[] fArr = this.f15447impromptu;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f15445dern[i].preRotate(fAttabal);
    }

    public void marial(kowloon kowloonVar, float f, RectF rectF, saneness sanenessVar, Path path) {
        beachfront(kowloonVar, null, f, rectF, sanenessVar, path);
    }

    public final void saneness(dern dernVar, int i) {
        this.f15447impromptu[0] = this.f15441attabal[i].apical();
        this.f15447impromptu[1] = this.f15441attabal[i].formularize();
        this.f15449saneness[i].mapPoints(this.f15447impromptu);
        if (i == 0) {
            Path path = dernVar.f15456saneness;
            float[] fArr = this.f15447impromptu;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = dernVar.f15456saneness;
            float[] fArr2 = this.f15447impromptu;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f15441attabal[i].wireman(this.f15449saneness[i], dernVar.f15456saneness);
        saneness sanenessVar = dernVar.f15457wireman;
        if (sanenessVar != null) {
            sanenessVar.attabal(this.f15441attabal[i], this.f15449saneness[i], i);
        }
    }

    public final marial taiyuan(int i, kowloon kowloonVar) {
        if (i == 1) {
            return kowloonVar.apical();
        }
        if (i != 2) {
            return i != 3 ? kowloonVar.molybdenite() : kowloonVar.monoploid();
        }
        return kowloonVar.taiyuan();
    }

    public final void triweekly(dern dernVar, int i, float[] fArr) {
        taiyuan(i, dernVar.f15453attabal).saneness(this.f15441attabal[i], 90.0f, dernVar.f15455marial, dernVar.f15454dern, fArr == null ? impromptu(i, dernVar.f15453attabal) : new chinny.dern(fArr[i]));
        float fAttabal = attabal(i);
        this.f15449saneness[i].reset();
        competently(i, dernVar.f15454dern, this.f15451wireman);
        Matrix matrix = this.f15449saneness[i];
        PointF pointF = this.f15451wireman;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f15449saneness[i].preRotate(fAttabal);
    }

    public void wireman(kowloon kowloonVar, float f, RectF rectF, Path path) {
        marial(kowloonVar, f, rectF, null, path);
    }
}
