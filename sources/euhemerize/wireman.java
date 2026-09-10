package euhemerize;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* JADX INFO: compiled from: GradientColor.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final float[] f26127attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int[] f26128saneness;

    public wireman(float[] fArr, int[] iArr) {
        this.f26127attabal = fArr;
        this.f26128saneness = iArr;
    }

    public final void attabal(wireman wiremanVar) {
        int i = 0;
        while (true) {
            int[] iArr = wiremanVar.f26128saneness;
            if (i >= iArr.length) {
                return;
            }
            this.f26127attabal[i] = wiremanVar.f26127attabal[i];
            this.f26128saneness[i] = iArr[i];
            i++;
        }
    }

    public int beachfront() {
        return this.f26128saneness.length;
    }

    public void competently(wireman wiremanVar, wireman wiremanVar2, float f) {
        int[] iArr;
        if (wiremanVar.equals(wiremanVar2)) {
            attabal(wiremanVar);
            return;
        }
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            attabal(wiremanVar);
            return;
        }
        if (f >= 1.0f) {
            attabal(wiremanVar2);
            return;
        }
        if (wiremanVar.f26128saneness.length != wiremanVar2.f26128saneness.length) {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + wiremanVar.f26128saneness.length + " vs " + wiremanVar2.f26128saneness.length + ")");
        }
        int i = 0;
        while (true) {
            iArr = wiremanVar.f26128saneness;
            if (i >= iArr.length) {
                break;
            }
            this.f26127attabal[i] = utwa.apical.taiyuan(wiremanVar.f26127attabal[i], wiremanVar2.f26127attabal[i], f);
            this.f26128saneness[i] = utwa.wireman.dern(f, wiremanVar.f26128saneness[i], wiremanVar2.f26128saneness[i]);
            i++;
        }
        int length = iArr.length;
        while (true) {
            float[] fArr = this.f26127attabal;
            if (length >= fArr.length) {
                return;
            }
            int[] iArr2 = wiremanVar.f26128saneness;
            fArr[length] = fArr[iArr2.length - 1];
            int[] iArr3 = this.f26128saneness;
            iArr3[length] = iArr3[iArr2.length - 1];
            length++;
        }
    }

    public final int dern(float f) {
        int iBinarySearch = Arrays.binarySearch(this.f26127attabal, f);
        if (iBinarySearch >= 0) {
            return this.f26128saneness[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        if (i == 0) {
            return this.f26128saneness[0];
        }
        int[] iArr = this.f26128saneness;
        if (i == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.f26127attabal;
        int i2 = i - 1;
        float f2 = fArr[i2];
        return utwa.wireman.dern((f - f2) / (fArr[i] - f2), iArr[i2], iArr[i]);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            wireman wiremanVar = (wireman) obj;
            if (Arrays.equals(this.f26127attabal, wiremanVar.f26127attabal) && Arrays.equals(this.f26128saneness, wiremanVar.f26128saneness)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f26127attabal) * 31) + Arrays.hashCode(this.f26128saneness);
    }

    public float[] marial() {
        return this.f26127attabal;
    }

    public wireman saneness(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            iArr[i] = dern(fArr[i]);
        }
        return new wireman(fArr, iArr);
    }

    public int[] wireman() {
        return this.f26128saneness;
    }
}
