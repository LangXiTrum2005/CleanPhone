package androidx.media3.common;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import decarock.grimness;
import java.util.Arrays;

/* JADX INFO: compiled from: AdPlaybackState.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Object f10753attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final C0076attabal[] f10754beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final long f10755dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f10756marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f10757saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final long f10758wireman;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final attabal f10748competently = new attabal(null, new C0076attabal[0], 0, C.TIME_UNSET, 0);

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final C0076attabal f10751impromptu = new C0076attabal(0).taiyuan(0);

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final String f10752taiyuan = grimness.igbo(1);

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final String f10749cutely = grimness.igbo(2);

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final String f10747apical = grimness.igbo(3);

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static final String f10750formularize = grimness.igbo(4);

    /* JADX INFO: renamed from: androidx.media3.common.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AdPlaybackState.java */
    public static final class C0076attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final long f10768attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final int[] f10769beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final long[] f10770competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f10771dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public final long f10772impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final adultoid[] f10773marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f10774saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public final boolean f10775taiyuan;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        @Deprecated
        public final Uri[] f10776wireman;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public static final String f10761cutely = grimness.igbo(0);

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public static final String f10759apical = grimness.igbo(1);

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public static final String f10762formularize = grimness.igbo(2);

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public static final String f10763impassible = grimness.igbo(3);

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        public static final String f10767triweekly = grimness.igbo(4);

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final String f10764kowloon = grimness.igbo(5);

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public static final String f10760arytenoidectomy = grimness.igbo(6);

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public static final String f10765monoploid = grimness.igbo(7);

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public static final String f10766polloi = grimness.igbo(8);

        public C0076attabal(long j) {
            this(j, -1, -1, new int[0], new adultoid[0], new long[0], 0L, false);
        }

        public static int[] dern(int[] iArr, int i) {
            int length = iArr.length;
            int iMax = Math.max(i, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        public static long[] saneness(long[] jArr, int i) {
            int length = jArr.length;
            int iMax = Math.max(i, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, C.TIME_UNSET);
            return jArrCopyOf;
        }

        public boolean beachfront() {
            if (this.f10774saneness == -1) {
                return true;
            }
            for (int i = 0; i < this.f10774saneness; i++) {
                int i2 = this.f10769beachfront[i];
                if (i2 == 0 || i2 == 1) {
                    return true;
                }
            }
            return false;
        }

        public final boolean competently() {
            return this.f10775taiyuan && this.f10768attabal == Long.MIN_VALUE && this.f10774saneness == -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C0076attabal.class == obj.getClass()) {
                C0076attabal c0076attabal = (C0076attabal) obj;
                if (this.f10768attabal == c0076attabal.f10768attabal && this.f10774saneness == c0076attabal.f10774saneness && this.f10771dern == c0076attabal.f10771dern && Arrays.equals(this.f10773marial, c0076attabal.f10773marial) && Arrays.equals(this.f10769beachfront, c0076attabal.f10769beachfront) && Arrays.equals(this.f10770competently, c0076attabal.f10770competently) && this.f10772impromptu == c0076attabal.f10772impromptu && this.f10775taiyuan == c0076attabal.f10775taiyuan) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i = ((this.f10774saneness * 31) + this.f10771dern) * 31;
            long j = this.f10768attabal;
            int iHashCode = (((((((i + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.f10773marial)) * 31) + Arrays.hashCode(this.f10769beachfront)) * 31) + Arrays.hashCode(this.f10770competently)) * 31;
            long j2 = this.f10772impromptu;
            return ((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f10775taiyuan ? 1 : 0);
        }

        public boolean impromptu() {
            return this.f10774saneness == -1 || wireman() < this.f10774saneness;
        }

        public int marial(int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.f10769beachfront;
                if (i3 >= iArr.length || this.f10775taiyuan || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        public C0076attabal taiyuan(int i) {
            int[] iArrDern = dern(this.f10769beachfront, i);
            long[] jArrSaneness = saneness(this.f10770competently, i);
            return new C0076attabal(this.f10768attabal, i, this.f10771dern, iArrDern, (adultoid[]) Arrays.copyOf(this.f10773marial, i), jArrSaneness, this.f10772impromptu, this.f10775taiyuan);
        }

        public int wireman() {
            return marial(-1);
        }

        public C0076attabal(long j, int i, int i2, int[] iArr, adultoid[] adultoidVarArr, long[] jArr, long j2, boolean z) {
            int i3 = 0;
            decarock.attabal.attabal(iArr.length == adultoidVarArr.length);
            this.f10768attabal = j;
            this.f10774saneness = i;
            this.f10771dern = i2;
            this.f10769beachfront = iArr;
            this.f10773marial = adultoidVarArr;
            this.f10770competently = jArr;
            this.f10772impromptu = j2;
            this.f10775taiyuan = z;
            this.f10776wireman = new Uri[adultoidVarArr.length];
            while (true) {
                Uri[] uriArr = this.f10776wireman;
                if (i3 >= uriArr.length) {
                    return;
                }
                adultoid adultoidVar = adultoidVarArr[i3];
                uriArr[i3] = adultoidVar == null ? null : ((adultoid.impromptu) decarock.attabal.marial(adultoidVar.f10619saneness)).f10706attabal;
                i3++;
            }
        }
    }

    public attabal(Object obj, C0076attabal[] c0076attabalArr, long j, long j2, int i) {
        this.f10753attabal = obj;
        this.f10755dern = j;
        this.f10758wireman = j2;
        this.f10757saneness = c0076attabalArr.length + i;
        this.f10754beachfront = c0076attabalArr;
        this.f10756marial = i;
    }

    public C0076attabal attabal(int i) {
        int i2 = this.f10756marial;
        return i < i2 ? f10751impromptu : this.f10754beachfront[i - i2];
    }

    public int dern(long j, long j2) {
        int i = this.f10757saneness - 1;
        int i2 = i - (wireman(i) ? 1 : 0);
        while (i2 >= 0) {
            long j3 = j;
            long j4 = j2;
            if (!marial(j3, j4, i2)) {
                break;
            }
            i2--;
            j = j3;
            j2 = j4;
        }
        if (i2 < 0 || !attabal(i2).beachfront()) {
            return -1;
        }
        return i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && attabal.class == obj.getClass()) {
            attabal attabalVar = (attabal) obj;
            if (grimness.dern(this.f10753attabal, attabalVar.f10753attabal) && this.f10757saneness == attabalVar.f10757saneness && this.f10755dern == attabalVar.f10755dern && this.f10758wireman == attabalVar.f10758wireman && this.f10756marial == attabalVar.f10756marial && Arrays.equals(this.f10754beachfront, attabalVar.f10754beachfront)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f10757saneness * 31;
        Object obj = this.f10753attabal;
        return ((((((((i + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f10755dern)) * 31) + ((int) this.f10758wireman)) * 31) + this.f10756marial) * 31) + Arrays.hashCode(this.f10754beachfront);
    }

    public final boolean marial(long j, long j2, int i) {
        if (j == Long.MIN_VALUE) {
            return false;
        }
        C0076attabal c0076attabalAttabal = attabal(i);
        long j3 = c0076attabalAttabal.f10768attabal;
        if (j3 == Long.MIN_VALUE) {
            return j2 == C.TIME_UNSET || (c0076attabalAttabal.f10775taiyuan && c0076attabalAttabal.f10774saneness == -1) || j < j2;
        }
        return j < j3;
    }

    public int saneness(long j, long j2) {
        if (j != Long.MIN_VALUE && (j2 == C.TIME_UNSET || j < j2)) {
            int i = this.f10756marial;
            while (i < this.f10757saneness && ((attabal(i).f10768attabal != Long.MIN_VALUE && attabal(i).f10768attabal <= j) || !attabal(i).impromptu())) {
                i++;
            }
            if (i < this.f10757saneness) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adsId=");
        sb.append(this.f10753attabal);
        sb.append(", adResumePositionUs=");
        sb.append(this.f10755dern);
        sb.append(", adGroups=[");
        for (int i = 0; i < this.f10754beachfront.length; i++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f10754beachfront[i].f10768attabal);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < this.f10754beachfront[i].f10769beachfront.length; i2++) {
                sb.append("ad(state=");
                int i3 = this.f10754beachfront[i].f10769beachfront[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(this.f10754beachfront[i].f10770competently[i2]);
                sb.append(')');
                if (i2 < this.f10754beachfront[i].f10769beachfront.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < this.f10754beachfront.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    public boolean wireman(int i) {
        return i == this.f10757saneness - 1 && attabal(i).competently();
    }
}
