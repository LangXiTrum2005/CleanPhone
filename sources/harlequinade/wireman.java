package harlequinade;

import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: Projection.java */
/* JADX INFO: loaded from: classes.dex */
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final attabal f27580attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f27581dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final attabal f27582saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final boolean f27583wireman;

    /* JADX INFO: compiled from: Projection.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final saneness[] f27584attabal;

        public attabal(saneness... sanenessVarArr) {
            this.f27584attabal = sanenessVarArr;
        }

        public saneness attabal(int i) {
            return this.f27584attabal[i];
        }

        public int saneness() {
            return this.f27584attabal.length;
        }
    }

    /* JADX INFO: compiled from: Projection.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f27585attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final float[] f27586dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f27587saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final float[] f27588wireman;

        public saneness(int i, float[] fArr, float[] fArr2, int i2) {
            this.f27585attabal = i;
            decarock.attabal.attabal(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f27586dern = fArr;
            this.f27588wireman = fArr2;
            this.f27587saneness = i2;
        }

        public int attabal() {
            return this.f27586dern.length / 3;
        }
    }

    public wireman(attabal attabalVar, int i) {
        this(attabalVar, attabalVar, i);
    }

    public static wireman attabal(float f, int i, int i2, float f2, float f3, int i3) {
        int i4;
        int i5 = i;
        decarock.attabal.attabal(f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        decarock.attabal.attabal(i5 >= 1);
        decarock.attabal.attabal(i2 >= 1);
        decarock.attabal.attabal(f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 <= 180.0f);
        decarock.attabal.attabal(f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f3 <= 360.0f);
        float radians = (float) Math.toRadians(f2);
        float radians2 = (float) Math.toRadians(f3);
        float f4 = radians / i5;
        float f5 = radians2 / i2;
        int i6 = i2 + 1;
        int i7 = ((i6 * 2) + 2) * i5;
        float[] fArr = new float[i7 * 3];
        float[] fArr2 = new float[i7 * 2];
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < i5) {
            float f6 = radians / 2.0f;
            float f7 = (i8 * f4) - f6;
            int i11 = i8 + 1;
            float f8 = (i11 * f4) - f6;
            int i12 = 0;
            while (i12 < i6) {
                float f9 = radians;
                float f10 = radians2;
                int i13 = 0;
                int i14 = 2;
                while (i13 < i14) {
                    float f11 = f4;
                    float f12 = i12 * f5;
                    float f13 = f5;
                    float f14 = f7;
                    double d = f;
                    double d2 = (f12 + 3.1415927f) - (f10 / 2.0f);
                    double d3 = i13 == 0 ? f7 : f8;
                    fArr[i9] = -((float) (Math.cos(d3) * Math.sin(d2) * d));
                    fArr[i9 + 1] = (float) (d * Math.sin(d3));
                    int i15 = i9 + 3;
                    fArr[i9 + 2] = (float) (d * Math.cos(d2) * Math.cos(d3));
                    fArr2[i10] = f12 / f10;
                    int i16 = i10 + 2;
                    fArr2[i10 + 1] = ((i8 + i13) * f11) / f9;
                    if ((i12 == 0 && i13 == 0) || (i12 == i2 && i13 == 1)) {
                        System.arraycopy(fArr, i9, fArr, i15, 3);
                        i9 += 6;
                        i4 = 2;
                        System.arraycopy(fArr2, i10, fArr2, i16, 2);
                        i10 += 4;
                    } else {
                        i4 = 2;
                        i9 = i15;
                        i10 = i16;
                    }
                    i13++;
                    i14 = i4;
                    f4 = f11;
                    f5 = f13;
                    f7 = f14;
                }
                i12++;
                radians2 = f10;
                radians = f9;
                f4 = f4;
            }
            i5 = i;
            i8 = i11;
        }
        return new wireman(new attabal(new saneness(0, fArr, fArr2, 1)), i3);
    }

    public static wireman saneness(int i) {
        return attabal(50.0f, 36, 72, 180.0f, 360.0f, i);
    }

    public wireman(attabal attabalVar, attabal attabalVar2, int i) {
        this.f27580attabal = attabalVar;
        this.f27582saneness = attabalVar2;
        this.f27581dern = i;
        this.f27583wireman = attabalVar == attabalVar2;
    }
}
