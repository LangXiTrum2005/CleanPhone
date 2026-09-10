package livable;

import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;

/* JADX INFO: compiled from: MotionPhotoDescription.java */
/* JADX INFO: loaded from: classes.dex */
public final class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final long f33094attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final List<attabal> f33095saneness;

    /* JADX INFO: compiled from: MotionPhotoDescription.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final String f33096attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final long f33097dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final String f33098saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final long f33099wireman;

        public attabal(String str, String str2, long j, long j2) {
            this.f33096attabal = str;
            this.f33098saneness = str2;
            this.f33097dern = j;
            this.f33099wireman = j2;
        }
    }

    public dern(long j, List<attabal> list) {
        this.f33094attabal = j;
        this.f33095saneness = list;
    }

    public MotionPhotoMetadata attabal(long j) {
        long j2;
        if (this.f33095saneness.size() < 2) {
            return null;
        }
        long j3 = j;
        long j4 = -1;
        long j5 = -1;
        long j6 = -1;
        long j7 = -1;
        boolean z = false;
        for (int size = this.f33095saneness.size() - 1; size >= 0; size--) {
            attabal attabalVar = this.f33095saneness.get(size);
            boolean zEquals = MimeTypes.VIDEO_MP4.equals(attabalVar.f33096attabal) | z;
            if (size == 0) {
                j3 -= attabalVar.f33099wireman;
                j2 = 0;
            } else {
                j2 = j3 - attabalVar.f33097dern;
            }
            long j8 = j2;
            long j9 = j3;
            j3 = j8;
            if (!zEquals || j3 == j9) {
                z = zEquals;
            } else {
                j7 = j9 - j3;
                j6 = j3;
                z = false;
            }
            if (size == 0) {
                j4 = j3;
                j5 = j9;
            }
        }
        if (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) {
            return null;
        }
        return new MotionPhotoMetadata(j4, j5, this.f33094attabal, j6, j7);
    }
}
