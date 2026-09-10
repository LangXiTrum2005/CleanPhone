package androidx.core.location;

import android.location.GnssStatus;

/* JADX INFO: loaded from: classes.dex */
class GnssStatusWrapper extends GnssStatusCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GnssStatus f4329a;

    public static class Api26Impl {
        public static float a(GnssStatus gnssStatus, int i2) {
            return gnssStatus.getCarrierFrequencyHz(i2);
        }

        public static boolean b(GnssStatus gnssStatus, int i2) {
            return gnssStatus.hasCarrierFrequencyHz(i2);
        }
    }

    public static class Api30Impl {
        public static float a(GnssStatus gnssStatus, int i2) {
            return gnssStatus.getBasebandCn0DbHz(i2);
        }

        public static boolean b(GnssStatus gnssStatus, int i2) {
            return gnssStatus.hasBasebandCn0DbHz(i2);
        }
    }

    public GnssStatusWrapper(Object obj) {
        GnssStatus gnssStatus = (GnssStatus) obj;
        gnssStatus.getClass();
        this.f4329a = gnssStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GnssStatusWrapper) {
            return this.f4329a.equals(((GnssStatusWrapper) obj).f4329a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4329a.hashCode();
    }
}
