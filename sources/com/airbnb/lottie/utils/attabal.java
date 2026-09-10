package com.airbnb.lottie.utils;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.unity3d.services.UnityAdsConstants;
import utwa.apical;
import utwa.arytenoidectomy;

/* JADX INFO: compiled from: DropShadow.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public float f16239attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public float f16240dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public float[] f16241marial = null;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public float f16242saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f16243wireman;

    public attabal(float f, float f2, float f3, int i) {
        this.f16239attabal = f;
        this.f16242saneness = f2;
        this.f16240dern = f3;
        this.f16243wireman = i;
    }

    public void apical(Matrix matrix) {
        if (this.f16241marial == null) {
            this.f16241marial = new float[2];
        }
        float[] fArr = this.f16241marial;
        fArr[0] = this.f16242saneness;
        fArr[1] = this.f16240dern;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.f16241marial;
        this.f16242saneness = fArr2[0];
        this.f16240dern = fArr2[1];
        this.f16239attabal = matrix.mapRadius(this.f16239attabal);
    }

    public void attabal(Paint paint) {
        if (Color.alpha(this.f16243wireman) > 0) {
            paint.setShadowLayer(Math.max(this.f16239attabal, Float.MIN_VALUE), this.f16242saneness, this.f16240dern, this.f16243wireman);
        } else {
            paint.clearShadowLayer();
        }
    }

    public float beachfront() {
        return this.f16242saneness;
    }

    public float competently() {
        return this.f16240dern;
    }

    public boolean cutely(attabal attabalVar) {
        return this.f16239attabal == attabalVar.f16239attabal && this.f16242saneness == attabalVar.f16242saneness && this.f16240dern == attabalVar.f16240dern && this.f16243wireman == attabalVar.f16243wireman;
    }

    public void dern(int i, Paint paint) {
        int iFormularize = arytenoidectomy.formularize(Color.alpha(this.f16243wireman), apical.dern(i, 0, 255));
        if (iFormularize <= 0) {
            paint.clearShadowLayer();
        } else {
            paint.setShadowLayer(Math.max(this.f16239attabal, Float.MIN_VALUE), this.f16242saneness, this.f16240dern, Color.argb(iFormularize, Color.red(this.f16243wireman), Color.green(this.f16243wireman), Color.blue(this.f16243wireman)));
        }
    }

    public float impromptu() {
        return this.f16239attabal;
    }

    public int marial() {
        return this.f16243wireman;
    }

    public void saneness(OffscreenLayer.saneness sanenessVar) {
        if (Color.alpha(this.f16243wireman) > 0) {
            sanenessVar.f16238wireman = this;
        } else {
            sanenessVar.f16238wireman = null;
        }
    }

    public void taiyuan(int i) {
        this.f16243wireman = Color.argb(Math.round((Color.alpha(this.f16243wireman) * apical.dern(i, 0, 255)) / 255.0f), Color.red(this.f16243wireman), Color.green(this.f16243wireman), Color.blue(this.f16243wireman));
    }

    public void wireman(int i, OffscreenLayer.saneness sanenessVar) {
        attabal attabalVar = new attabal(this);
        sanenessVar.f16238wireman = attabalVar;
        attabalVar.taiyuan(i);
    }

    public attabal(attabal attabalVar) {
        this.f16239attabal = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f16242saneness = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f16240dern = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f16243wireman = 0;
        this.f16239attabal = attabalVar.f16239attabal;
        this.f16242saneness = attabalVar.f16242saneness;
        this.f16240dern = attabalVar.f16240dern;
        this.f16243wireman = attabalVar.f16243wireman;
    }
}
