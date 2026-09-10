package aesthesia;

import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: Arrangement.java */
/* JADX INFO: loaded from: classes3.dex */
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f3810attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public float f3811beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final int f3812competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f3813dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final float f3814impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public float f3815marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public float f3816saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f3817wireman;

    public attabal(int i, float f, float f2, float f3, int i2, float f4, int i3, float f5, int i4, float f6) {
        this.f3810attabal = i;
        this.f3816saneness = achondroplasia.attabal.attabal(f, f2, f3);
        this.f3813dern = i2;
        this.f3815marial = f4;
        this.f3817wireman = i3;
        this.f3811beachfront = f5;
        this.f3812competently = i4;
        wireman(f6, f2, f3, f5);
        this.f3814impromptu = saneness(f5);
    }

    public static attabal dern(float f, float f2, float f3, float f4, int[] iArr, float f5, int[] iArr2, float f6, int[] iArr3) {
        attabal attabalVar = null;
        int i = 1;
        for (int i2 : iArr3) {
            int length = iArr2.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = iArr2[i3];
                int length2 = iArr.length;
                int i5 = 0;
                while (i5 < length2) {
                    int i6 = length;
                    int i7 = i3;
                    int i8 = i;
                    int i9 = length2;
                    int i10 = i5;
                    attabal attabalVar2 = new attabal(i8, f2, f3, f4, iArr[i5], f5, i4, f6, i2, f);
                    if (attabalVar == null || attabalVar2.f3814impromptu < attabalVar.f3814impromptu) {
                        if (attabalVar2.f3814impromptu == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            return attabalVar2;
                        }
                        attabalVar = attabalVar2;
                    }
                    int i11 = i8 + 1;
                    i5 = i10 + 1;
                    i3 = i7;
                    i = i11;
                    length = i6;
                    length2 = i9;
                }
                i3++;
                i = i;
                length = length;
            }
        }
        return attabalVar;
    }

    public final float attabal(float f, int i, float f2, int i2, int i3) {
        if (i <= 0) {
            f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f3 = i2 / 2.0f;
        return (f - ((i + f3) * f2)) / (i3 + f3);
    }

    public final float beachfront() {
        return (this.f3811beachfront * this.f3812competently) + (this.f3815marial * this.f3817wireman) + (this.f3816saneness * this.f3813dern);
    }

    public final boolean competently() {
        int i = this.f3812competently;
        if (i <= 0 || this.f3813dern <= 0 || this.f3817wireman <= 0) {
            return i <= 0 || this.f3813dern <= 0 || this.f3811beachfront > this.f3816saneness;
        }
        float f = this.f3811beachfront;
        float f2 = this.f3815marial;
        return f > f2 && f2 > this.f3816saneness;
    }

    public int marial() {
        return this.f3813dern + this.f3817wireman + this.f3812competently;
    }

    public final float saneness(float f) {
        if (competently()) {
            return Math.abs(f - this.f3811beachfront) * this.f3810attabal;
        }
        return Float.MAX_VALUE;
    }

    public String toString() {
        return "Arrangement [priority=" + this.f3810attabal + ", smallCount=" + this.f3813dern + ", smallSize=" + this.f3816saneness + ", mediumCount=" + this.f3817wireman + ", mediumSize=" + this.f3815marial + ", largeCount=" + this.f3812competently + ", largeSize=" + this.f3811beachfront + ", cost=" + this.f3814impromptu + X3.j.e;
    }

    public final void wireman(float f, float f2, float f3, float f4) {
        float fBeachfront = f - beachfront();
        int i = this.f3813dern;
        if (i > 0 && fBeachfront > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f5 = this.f3816saneness;
            this.f3816saneness = f5 + Math.min(fBeachfront / i, f3 - f5);
        } else if (i > 0 && fBeachfront < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f6 = this.f3816saneness;
            this.f3816saneness = f6 + Math.max(fBeachfront / i, f2 - f6);
        }
        int i2 = this.f3813dern;
        float f7 = i2 > 0 ? this.f3816saneness : 0.0f;
        this.f3816saneness = f7;
        float fAttabal = attabal(f, i2, f7, this.f3817wireman, this.f3812competently);
        this.f3811beachfront = fAttabal;
        float f8 = (this.f3816saneness + fAttabal) / 2.0f;
        this.f3815marial = f8;
        int i3 = this.f3817wireman;
        if (i3 <= 0 || fAttabal == f4) {
            return;
        }
        float f9 = (f4 - fAttabal) * this.f3812competently;
        float fMin = Math.min(Math.abs(f9), f8 * 0.1f * i3);
        if (f9 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.f3815marial -= fMin / this.f3817wireman;
            this.f3811beachfront += fMin / this.f3812competently;
        } else {
            this.f3815marial += fMin / this.f3817wireman;
            this.f3811beachfront -= fMin / this.f3812competently;
        }
    }
}
