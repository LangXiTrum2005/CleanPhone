package androidx.media3.common;

import android.net.Uri;
import androidx.datastore.preferences.protobuf.a;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class AdPlaybackState {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AdPlaybackState f5367c = new AdPlaybackState(new AdGroup[0]);
    public static final AdGroup d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdGroup[] f5369b;

    public static final class AdGroup {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Uri[] f5372c;
        public final MediaItem[] d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f5373e;
        public final long[] f;

        static {
            a.s(0, 1, 2, 3, 4);
            Util.E(5);
            Util.E(6);
            Util.E(7);
            Util.E(8);
        }

        public AdGroup(int i2, int i3, int[] iArr, MediaItem[] mediaItemArr, long[] jArr) {
            Uri uri;
            int i4 = 0;
            Assertions.b(iArr.length == mediaItemArr.length);
            this.f5370a = i2;
            this.f5371b = i3;
            this.f5373e = iArr;
            this.d = mediaItemArr;
            this.f = jArr;
            this.f5372c = new Uri[mediaItemArr.length];
            while (true) {
                Uri[] uriArr = this.f5372c;
                if (i4 >= uriArr.length) {
                    return;
                }
                MediaItem mediaItem = mediaItemArr[i4];
                if (mediaItem == null) {
                    uri = null;
                } else {
                    MediaItem.LocalConfiguration localConfiguration = mediaItem.f5438b;
                    localConfiguration.getClass();
                    uri = localConfiguration.f5458a;
                }
                uriArr[i4] = uri;
                i4++;
            }
        }

        public final int a(int i2) {
            int i3;
            int i4 = i2 + 1;
            while (true) {
                int[] iArr = this.f5373e;
                if (i4 >= iArr.length || (i3 = iArr[i4]) == 0 || i3 == 1) {
                    break;
                }
                i4++;
            }
            return i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || AdGroup.class != obj.getClass()) {
                return false;
            }
            AdGroup adGroup = (AdGroup) obj;
            return this.f5370a == adGroup.f5370a && this.f5371b == adGroup.f5371b && Arrays.equals(this.d, adGroup.d) && Arrays.equals(this.f5373e, adGroup.f5373e) && Arrays.equals(this.f, adGroup.f);
        }

        public final int hashCode() {
            int i2 = ((this.f5370a * 31) + this.f5371b) * 31;
            int i3 = (int) 0;
            return (((Arrays.hashCode(this.f) + ((Arrays.hashCode(this.f5373e) + ((Arrays.hashCode(this.d) + ((i2 + i3) * 31)) * 31)) * 31)) * 31) + i3) * 31;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AdState {
    }

    static {
        AdGroup adGroup = new AdGroup(-1, -1, new int[0], new MediaItem[0], new long[0]);
        int[] iArr = adGroup.f5373e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = adGroup.f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        d = new AdGroup(0, adGroup.f5371b, iArrCopyOf, (MediaItem[]) Arrays.copyOf(adGroup.d, 0), jArrCopyOf);
        Util.E(1);
        Util.E(2);
        Util.E(3);
        Util.E(4);
    }

    public AdPlaybackState(AdGroup[] adGroupArr) {
        this.f5368a = adGroupArr.length;
        this.f5369b = adGroupArr;
    }

    public final AdGroup a(int i2) {
        return i2 < 0 ? d : this.f5369b[i2];
    }

    public final boolean b(int i2) {
        if (i2 != this.f5368a - 1) {
            return false;
        }
        a(i2).getClass();
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdPlaybackState.class != obj.getClass()) {
            return false;
        }
        AdPlaybackState adPlaybackState = (AdPlaybackState) obj;
        int i2 = Util.f5683a;
        return this.f5368a == adPlaybackState.f5368a && Arrays.equals(this.f5369b, adPlaybackState.f5369b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5369b) + (((((this.f5368a * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i2 = 0;
        while (true) {
            AdGroup[] adGroupArr = this.f5369b;
            if (i2 >= adGroupArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=0, ads=[");
            adGroupArr[i2].getClass();
            for (int i3 = 0; i3 < adGroupArr[i2].f5373e.length; i3++) {
                sb.append("ad(state=");
                int i4 = adGroupArr[i2].f5373e[i3];
                if (i4 == 0) {
                    sb.append('_');
                } else if (i4 == 1) {
                    sb.append('R');
                } else if (i4 == 2) {
                    sb.append('S');
                } else if (i4 == 3) {
                    sb.append('P');
                } else if (i4 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(adGroupArr[i2].f[i3]);
                sb.append(')');
                if (i3 < adGroupArr[i2].f5373e.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i2 < adGroupArr.length - 1) {
                sb.append(", ");
            }
            i2++;
        }
    }
}
