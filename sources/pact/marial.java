package pact;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.creditor;
import com.airbnb.lottie.model.layer.Layer;
import com.unity3d.services.UnityAdsConstants;
import redevelopment.graveside;

/* JADX INFO: compiled from: SolidLayer.java */
/* JADX INFO: loaded from: classes.dex */
public class marial extends com.airbnb.lottie.model.layer.attabal {

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public final float[] f34969kattegat;

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public redevelopment.attabal<ColorFilter, ColorFilter> f34970merc;

    /* JADX INFO: renamed from: polder, reason: collision with root package name */
    public redevelopment.attabal<Integer, Integer> f34971polder;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
    public final Layer f34972restrictive;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public final Paint f34973sealless;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public final Path f34974supplicat;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public final RectF f34975yemenite;

    public marial(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.f34975yemenite = new RectF();
        blighty.attabal attabalVar = new blighty.attabal();
        this.f34973sealless = attabalVar;
        this.f34969kattegat = new float[8];
        this.f34974supplicat = new Path();
        this.f34972restrictive = layer;
        attabalVar.setAlpha(0);
        attabalVar.setStyle(Paint.Style.FILL);
        attabalVar.setColor(layer.arytenoidectomy());
    }

    @Override // com.airbnb.lottie.model.layer.attabal
    public void adultoid(Canvas canvas, Matrix matrix, int i, com.airbnb.lottie.utils.attabal attabalVar) {
        int iAlpha = Color.alpha(this.f34972restrictive.arytenoidectomy());
        if (iAlpha == 0) {
            return;
        }
        redevelopment.attabal<Integer, Integer> attabalVar2 = this.f34971polder;
        Integer numImpromptu = attabalVar2 == null ? null : attabalVar2.impromptu();
        if (numImpromptu != null) {
            this.f34973sealless.setColor(numImpromptu.intValue());
        } else {
            this.f34973sealless.setColor(this.f34972restrictive.arytenoidectomy());
        }
        int iIntValue = (int) ((i / 255.0f) * (((iAlpha / 255.0f) * (this.f16120rotuma.apical() == null ? 100 : this.f16120rotuma.apical().impromptu().intValue())) / 100.0f) * 255.0f);
        this.f34973sealless.setAlpha(iIntValue);
        if (attabalVar != null) {
            attabalVar.attabal(this.f34973sealless);
        } else {
            this.f34973sealless.clearShadowLayer();
        }
        redevelopment.attabal<ColorFilter, ColorFilter> attabalVar3 = this.f34970merc;
        if (attabalVar3 != null) {
            this.f34973sealless.setColorFilter(attabalVar3.impromptu());
        }
        if (iIntValue > 0) {
            float[] fArr = this.f34969kattegat;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.f34972restrictive.polloi();
            float[] fArr2 = this.f34969kattegat;
            fArr2[3] = 0.0f;
            fArr2[4] = this.f34972restrictive.polloi();
            this.f34969kattegat[5] = this.f34972restrictive.monoploid();
            float[] fArr3 = this.f34969kattegat;
            fArr3[6] = 0.0f;
            fArr3[7] = this.f34972restrictive.monoploid();
            matrix.mapPoints(this.f34969kattegat);
            this.f34974supplicat.reset();
            Path path = this.f34974supplicat;
            float[] fArr4 = this.f34969kattegat;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.f34974supplicat;
            float[] fArr5 = this.f34969kattegat;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.f34974supplicat;
            float[] fArr6 = this.f34969kattegat;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.f34974supplicat;
            float[] fArr7 = this.f34969kattegat;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.f34974supplicat;
            float[] fArr8 = this.f34969kattegat;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.f34974supplicat.close();
            canvas.drawPath(this.f34974supplicat, this.f34973sealless);
        }
    }

    @Override // com.airbnb.lottie.model.layer.attabal, kinesic.marial
    public void impromptu(RectF rectF, Matrix matrix, boolean z) {
        super.impromptu(rectF, matrix, z);
        this.f34975yemenite.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f34972restrictive.polloi(), this.f34972restrictive.monoploid());
        this.f16113kowloon.mapRect(this.f34975yemenite);
        rectF.set(this.f34975yemenite);
    }

    @Override // com.airbnb.lottie.model.layer.attabal, lamplit.marial
    public <T> void wireman(T t, com.airbnb.lottie.value.dern<T> dernVar) {
        super.wireman(t, dernVar);
        if (t == creditor.f15944saran) {
            if (dernVar == null) {
                this.f34970merc = null;
                return;
            } else {
                this.f34970merc = new graveside(dernVar);
                return;
            }
        }
        if (t == creditor.f15914attabal) {
            if (dernVar != null) {
                this.f34971polder = new graveside(dernVar);
            } else {
                this.f34971polder = null;
                this.f34973sealless.setColor(this.f34972restrictive.arytenoidectomy());
            }
        }
    }
}
