package pact;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.creditor;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.seminary;
import com.airbnb.lottie.utils.OffscreenLayer;
import com.unity3d.services.UnityAdsConstants;
import redevelopment.graveside;
import utwa.arytenoidectomy;

/* JADX INFO: compiled from: ImageLayer.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness extends com.airbnb.lottie.model.layer.attabal {

    /* JADX INFO: renamed from: grimness, reason: collision with root package name */
    public OffscreenLayer f34976grimness;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public final Rect f34977kattegat;

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public redevelopment.attabal<ColorFilter, ColorFilter> f34978merc;

    /* JADX INFO: renamed from: polder, reason: collision with root package name */
    public redevelopment.attabal<Bitmap, Bitmap> f34979polder;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
    public final seminary f34980restrictive;

    /* JADX INFO: renamed from: saran, reason: collision with root package name */
    public OffscreenLayer.saneness f34981saran;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public final Rect f34982sealless;

    /* JADX INFO: renamed from: seminary, reason: collision with root package name */
    public redevelopment.dern f34983seminary;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public final RectF f34984supplicat;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public final Paint f34985yemenite;

    public saneness(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.f34985yemenite = new blighty.attabal(3);
        this.f34982sealless = new Rect();
        this.f34977kattegat = new Rect();
        this.f34984supplicat = new RectF();
        this.f34980restrictive = lottieDrawable.mathsort(layer.triweekly());
        if (cord() != null) {
            this.f34983seminary = new redevelopment.dern(this, this, cord());
        }
    }

    @Override // com.airbnb.lottie.model.layer.attabal
    public void adultoid(Canvas canvas, Matrix matrix, int i, com.airbnb.lottie.utils.attabal attabalVar) {
        Bitmap bitmapCreditor = creditor();
        if (bitmapCreditor == null || bitmapCreditor.isRecycled() || this.f34980restrictive == null) {
            return;
        }
        float fMarial = arytenoidectomy.marial();
        this.f34985yemenite.setAlpha(i);
        redevelopment.attabal<ColorFilter, ColorFilter> attabalVar2 = this.f34978merc;
        if (attabalVar2 != null) {
            this.f34985yemenite.setColorFilter(attabalVar2.impromptu());
        }
        redevelopment.dern dernVar = this.f34983seminary;
        if (dernVar != null) {
            attabalVar = dernVar.saneness(matrix, i);
        }
        this.f34982sealless.set(0, 0, bitmapCreditor.getWidth(), bitmapCreditor.getHeight());
        if (this.f16099arytenoidectomy.splinterproof()) {
            this.f34977kattegat.set(0, 0, (int) (this.f34980restrictive.beachfront() * fMarial), (int) (this.f34980restrictive.wireman() * fMarial));
        } else {
            this.f34977kattegat.set(0, 0, (int) (bitmapCreditor.getWidth() * fMarial), (int) (bitmapCreditor.getHeight() * fMarial));
        }
        boolean z = attabalVar != null;
        if (z) {
            if (this.f34976grimness == null) {
                this.f34976grimness = new OffscreenLayer();
            }
            if (this.f34981saran == null) {
                this.f34981saran = new OffscreenLayer.saneness();
            }
            this.f34981saran.beachfront();
            attabalVar.wireman(i, this.f34981saran);
            RectF rectF = this.f34984supplicat;
            Rect rect = this.f34977kattegat;
            rectF.set(rect.left, rect.top, rect.right, rect.bottom);
            matrix.mapRect(this.f34984supplicat);
            canvas = this.f34976grimness.cutely(canvas, this.f34984supplicat, this.f34981saran);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmapCreditor, this.f34982sealless, this.f34977kattegat, this.f34985yemenite);
        if (z) {
            this.f34976grimness.marial();
            if (this.f34976grimness.beachfront()) {
                return;
            }
        }
        canvas.restore();
    }

    public final Bitmap creditor() {
        Bitmap bitmapImpromptu;
        redevelopment.attabal<Bitmap, Bitmap> attabalVar = this.f34979polder;
        if (attabalVar != null && (bitmapImpromptu = attabalVar.impromptu()) != null) {
            return bitmapImpromptu;
        }
        Bitmap bitmapSeminary = this.f16099arytenoidectomy.seminary(this.f16116monoploid.triweekly());
        if (bitmapSeminary != null) {
            return bitmapSeminary;
        }
        seminary seminaryVar = this.f34980restrictive;
        if (seminaryVar != null) {
            return seminaryVar.saneness();
        }
        return null;
    }

    @Override // com.airbnb.lottie.model.layer.attabal, kinesic.marial
    public void impromptu(RectF rectF, Matrix matrix, boolean z) {
        Bitmap bitmapCreditor;
        super.impromptu(rectF, matrix, z);
        if (this.f34980restrictive != null) {
            float fMarial = arytenoidectomy.marial();
            if (this.f16099arytenoidectomy.splinterproof() || (bitmapCreditor = creditor()) == null) {
                rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f34980restrictive.beachfront() * fMarial, this.f34980restrictive.wireman() * fMarial);
            } else {
                rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, bitmapCreditor.getWidth() * fMarial, bitmapCreditor.getHeight() * fMarial);
            }
            this.f16113kowloon.mapRect(rectF);
        }
    }

    @Override // com.airbnb.lottie.model.layer.attabal, lamplit.marial
    public <T> void wireman(T t, com.airbnb.lottie.value.dern<T> dernVar) {
        redevelopment.dern dernVar2;
        redevelopment.dern dernVar3;
        redevelopment.dern dernVar4;
        redevelopment.dern dernVar5;
        redevelopment.dern dernVar6;
        super.wireman(t, dernVar);
        if (t == creditor.f15944saran) {
            if (dernVar == null) {
                this.f34978merc = null;
                return;
            } else {
                this.f34978merc = new graveside(dernVar);
                return;
            }
        }
        if (t == creditor.f15947starveling) {
            if (dernVar == null) {
                this.f34979polder = null;
                return;
            } else {
                this.f34979polder = new graveside(dernVar);
                return;
            }
        }
        if (t == creditor.f15932marial && (dernVar6 = this.f34983seminary) != null) {
            dernVar6.dern(dernVar);
            return;
        }
        if (t == creditor.f15933merc && (dernVar5 = this.f34983seminary) != null) {
            dernVar5.beachfront(dernVar);
            return;
        }
        if (t == creditor.f15937polder && (dernVar4 = this.f34983seminary) != null) {
            dernVar4.wireman(dernVar);
            return;
        }
        if (t == creditor.f15946seminary && (dernVar3 = this.f34983seminary) != null) {
            dernVar3.marial(dernVar);
        } else {
            if (t != creditor.f15926grimness || (dernVar2 = this.f34983seminary) == null) {
                return;
            }
            dernVar2.competently(dernVar);
        }
    }
}
