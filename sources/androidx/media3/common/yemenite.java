package androidx.media3.common;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import decarock.grimness;
import java.util.Arrays;

/* JADX INFO: compiled from: TrackGroup.java */
/* JADX INFO: loaded from: classes.dex */
public final class yemenite {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final String f11330beachfront = grimness.igbo(0);

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final String f11331competently = grimness.igbo(1);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f11332attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f11333dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f11334marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f11335saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final polloi[] f11336wireman;

    public yemenite(polloi... polloiVarArr) {
        this("", polloiVarArr);
    }

    public static void dern(String str, String str2, String str3, int i) {
        decarock.triweekly.wireman("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    public static int marial(int i) {
        return i | 16384;
    }

    public static String wireman(String str) {
        return (str == null || str.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str;
    }

    public polloi attabal(int i) {
        return this.f11336wireman[i];
    }

    public final void beachfront() {
        String strWireman = wireman(this.f11336wireman[0].f11220wireman);
        int iMarial = marial(this.f11336wireman[0].f11188beachfront);
        int i = 1;
        while (true) {
            polloi[] polloiVarArr = this.f11336wireman;
            if (i >= polloiVarArr.length) {
                return;
            }
            if (!strWireman.equals(wireman(polloiVarArr[i].f11220wireman))) {
                polloi[] polloiVarArr2 = this.f11336wireman;
                dern("languages", polloiVarArr2[0].f11220wireman, polloiVarArr2[i].f11220wireman, i);
                return;
            } else {
                if (iMarial != marial(this.f11336wireman[i].f11188beachfront)) {
                    dern("role flags", Integer.toBinaryString(this.f11336wireman[0].f11188beachfront), Integer.toBinaryString(this.f11336wireman[i].f11188beachfront), i);
                    return;
                }
                i++;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yemenite.class == obj.getClass()) {
            yemenite yemeniteVar = (yemenite) obj;
            if (this.f11335saneness.equals(yemeniteVar.f11335saneness) && Arrays.equals(this.f11336wireman, yemeniteVar.f11336wireman)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f11334marial == 0) {
            this.f11334marial = ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f11335saneness.hashCode()) * 31) + Arrays.hashCode(this.f11336wireman);
        }
        return this.f11334marial;
    }

    public int saneness(polloi polloiVar) {
        int i = 0;
        while (true) {
            polloi[] polloiVarArr = this.f11336wireman;
            if (i >= polloiVarArr.length) {
                return -1;
            }
            if (polloiVar == polloiVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public yemenite(String str, polloi... polloiVarArr) {
        decarock.attabal.attabal(polloiVarArr.length > 0);
        this.f11335saneness = str;
        this.f11336wireman = polloiVarArr;
        this.f11332attabal = polloiVarArr.length;
        int iBeachfront = rotuma.beachfront(polloiVarArr[0].f11218triweekly);
        this.f11333dern = iBeachfront == -1 ? rotuma.beachfront(polloiVarArr[0].f11198impassible) : iBeachfront;
        beachfront();
    }
}
