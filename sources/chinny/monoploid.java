package chinny;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: ShapePath.java */
/* JADX INFO: loaded from: classes3.dex */
public class monoploid {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    @Deprecated
    public float f15518attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    @Deprecated
    public float f15519beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    @Deprecated
    public float f15521dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    @Deprecated
    public float f15523marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    @Deprecated
    public float f15524saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public boolean f15525taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    @Deprecated
    public float f15526wireman;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final List<beachfront> f15520competently = new ArrayList();

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final List<competently> f15522impromptu = new ArrayList();

    /* JADX INFO: compiled from: ShapePath.java */
    public class attabal extends competently {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ List f15527dern;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ Matrix f15529wireman;

        public attabal(List list, Matrix matrix) {
            this.f15527dern = list;
            this.f15529wireman = matrix;
        }

        @Override // chinny.monoploid.competently
        public void attabal(Matrix matrix, nitroguanidine.attabal attabalVar, int i, Canvas canvas) {
            Iterator it = this.f15527dern.iterator();
            while (it.hasNext()) {
                ((competently) it.next()).attabal(this.f15529wireman, attabalVar, i, canvas);
            }
        }
    }

    /* JADX INFO: compiled from: ShapePath.java */
    public static abstract class beachfront {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Matrix f15530attabal = new Matrix();

        public abstract void attabal(Matrix matrix, Path path);
    }

    /* JADX INFO: compiled from: ShapePath.java */
    public static abstract class competently {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final Matrix f15531saneness = new Matrix();

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Matrix f15532attabal = new Matrix();

        public abstract void attabal(Matrix matrix, nitroguanidine.attabal attabalVar, int i, Canvas canvas);

        public final void saneness(nitroguanidine.attabal attabalVar, int i, Canvas canvas) {
            attabal(f15531saneness, attabalVar, i, canvas);
        }
    }

    /* JADX INFO: compiled from: ShapePath.java */
    public static class dern extends competently {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final marial f15533dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final float f15534marial;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final float f15535wireman;

        public dern(marial marialVar, float f, float f2) {
            this.f15533dern = marialVar;
            this.f15535wireman = f;
            this.f15534marial = f2;
        }

        @Override // chinny.monoploid.competently
        public void attabal(Matrix matrix, nitroguanidine.attabal attabalVar, int i, Canvas canvas) {
            RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (float) Math.hypot(this.f15533dern.f15536dern - this.f15534marial, this.f15533dern.f15537saneness - this.f15535wireman), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f15532attabal.set(matrix);
            this.f15532attabal.preTranslate(this.f15535wireman, this.f15534marial);
            this.f15532attabal.preRotate(dern());
            attabalVar.saneness(canvas, this.f15532attabal, rectF, i);
        }

        public float dern() {
            return (float) Math.toDegrees(Math.atan((this.f15533dern.f15536dern - this.f15534marial) / (this.f15533dern.f15537saneness - this.f15535wireman)));
        }
    }

    /* JADX INFO: compiled from: ShapePath.java */
    public static class marial extends beachfront {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public float f15536dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public float f15537saneness;

        @Override // chinny.monoploid.beachfront
        public void attabal(Matrix matrix, Path path) {
            Matrix matrix2 = this.f15530attabal;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f15537saneness, this.f15536dern);
            path.transform(matrix);
        }
    }

    /* JADX INFO: compiled from: ShapePath.java */
    public static class saneness extends competently {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final wireman f15538dern;

        public saneness(wireman wiremanVar) {
            this.f15538dern = wiremanVar;
        }

        @Override // chinny.monoploid.competently
        public void attabal(Matrix matrix, nitroguanidine.attabal attabalVar, int i, Canvas canvas) {
            attabalVar.attabal(canvas, matrix, new RectF(this.f15538dern.apical(), this.f15538dern.kowloon(), this.f15538dern.formularize(), this.f15538dern.cutely()), i, this.f15538dern.impassible(), this.f15538dern.triweekly());
        }
    }

    /* JADX INFO: compiled from: ShapePath.java */
    public static class wireman extends beachfront {

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public static final RectF f15539impromptu = new RectF();

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        @Deprecated
        public float f15540beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        @Deprecated
        public float f15541competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        @Deprecated
        public float f15542dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        @Deprecated
        public float f15543marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        @Deprecated
        public float f15544saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        @Deprecated
        public float f15545wireman;

        public wireman(float f, float f2, float f3, float f4) {
            monoploid(f);
            adultoid(f2);
            polloi(f3);
            arytenoidectomy(f4);
        }

        public final void adultoid(float f) {
            this.f15542dern = f;
        }

        public final float apical() {
            return this.f15544saneness;
        }

        public final void arytenoidectomy(float f) {
            this.f15543marial = f;
        }

        @Override // chinny.monoploid.beachfront
        public void attabal(Matrix matrix, Path path) {
            Matrix matrix2 = this.f15530attabal;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f15539impromptu;
            rectF.set(apical(), kowloon(), formularize(), cutely());
            path.arcTo(rectF, impassible(), triweekly(), false);
            path.transform(matrix);
        }

        public final float cutely() {
            return this.f15543marial;
        }

        public final float formularize() {
            return this.f15545wireman;
        }

        public final void graveside(float f) {
            this.f15541competently = f;
        }

        public final float impassible() {
            return this.f15540beachfront;
        }

        public final float kowloon() {
            return this.f15542dern;
        }

        public final void molybdenite(float f) {
            this.f15540beachfront = f;
        }

        public final void monoploid(float f) {
            this.f15544saneness = f;
        }

        public final void polloi(float f) {
            this.f15545wireman = f;
        }

        public final float triweekly() {
            return this.f15541competently;
        }
    }

    public monoploid() {
        triweekly(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final void adultoid(float f) {
        this.f15524saneness = f;
    }

    public float apical() {
        return this.f15518attabal;
    }

    public final void arytenoidectomy(float f) {
        this.f15523marial = f;
    }

    public void attabal(float f, float f2, float f3, float f4, float f5, float f6) {
        wireman wiremanVar = new wireman(f, f2, f3, f4);
        wiremanVar.molybdenite(f5);
        wiremanVar.graveside(f6);
        this.f15520competently.add(wiremanVar);
        saneness sanenessVar = new saneness(wiremanVar);
        float f7 = f5 + f6;
        boolean z = f6 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        dern(sanenessVar, f5, z ? (180.0f + f7) % 360.0f : f7);
        double d = f7;
        polloi(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        molybdenite(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    public competently beachfront(Matrix matrix) {
        saneness(impromptu());
        return new attabal(new ArrayList(this.f15522impromptu), new Matrix(matrix));
    }

    public final float competently() {
        return this.f15523marial;
    }

    public float cutely() {
        return this.f15526wireman;
    }

    public final void dern(competently competentlyVar, float f, float f2) {
        saneness(f);
        this.f15522impromptu.add(competentlyVar);
        arytenoidectomy(f2);
    }

    public float formularize() {
        return this.f15524saneness;
    }

    public final void graveside(float f) {
        this.f15518attabal = f;
    }

    public void impassible(float f, float f2) {
        marial marialVar = new marial();
        marialVar.f15537saneness = f;
        marialVar.f15536dern = f2;
        this.f15520competently.add(marialVar);
        dern dernVar = new dern(marialVar, taiyuan(), cutely());
        dern(dernVar, dernVar.dern() + 270.0f, dernVar.dern() + 270.0f);
        polloi(f);
        molybdenite(f2);
    }

    public final float impromptu() {
        return this.f15519beachfront;
    }

    public void kowloon(float f, float f2, float f3, float f4) {
        graveside(f);
        adultoid(f2);
        polloi(f);
        molybdenite(f2);
        arytenoidectomy(f3);
        monoploid((f3 + f4) % 360.0f);
        this.f15520competently.clear();
        this.f15522impromptu.clear();
        this.f15525taiyuan = false;
    }

    public boolean marial() {
        return this.f15525taiyuan;
    }

    public final void molybdenite(float f) {
        this.f15526wireman = f;
    }

    public final void monoploid(float f) {
        this.f15519beachfront = f;
    }

    public final void polloi(float f) {
        this.f15521dern = f;
    }

    public final void saneness(float f) {
        if (competently() == f) {
            return;
        }
        float fCompetently = ((f - competently()) + 360.0f) % 360.0f;
        if (fCompetently > 180.0f) {
            return;
        }
        wireman wiremanVar = new wireman(taiyuan(), cutely(), taiyuan(), cutely());
        wiremanVar.molybdenite(competently());
        wiremanVar.graveside(fCompetently);
        this.f15522impromptu.add(new saneness(wiremanVar));
        arytenoidectomy(f);
    }

    public float taiyuan() {
        return this.f15521dern;
    }

    public void triweekly(float f, float f2) {
        kowloon(f, f2, 270.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public void wireman(Matrix matrix, Path path) {
        int size = this.f15520competently.size();
        for (int i = 0; i < size; i++) {
            this.f15520competently.get(i).attabal(matrix, path);
        }
    }
}
