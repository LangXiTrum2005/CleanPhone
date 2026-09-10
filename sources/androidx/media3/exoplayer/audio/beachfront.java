package androidx.media3.exoplayer.audio;

import androidx.media3.common.PlaybackException;
import com.google.common.primitives.Ints;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import decarock.grimness;
import java.math.RoundingMode;

/* JADX INFO: compiled from: DefaultAudioTrackBufferSizeProvider.java */
/* JADX INFO: loaded from: classes.dex */
public class beachfront implements DefaultAudioSink.marial {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final int f11678beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final int f11679competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f11680dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final int f11681impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f11682marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f11683saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f11684wireman;

    /* JADX INFO: compiled from: DefaultAudioTrackBufferSizeProvider.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f11685attabal = 250000;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f11690saneness = 750000;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f11688dern = 4;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public int f11691wireman = 250000;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public int f11689marial = 50000000;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public int f11686beachfront = 2;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public int f11687competently = 4;

        public beachfront impromptu() {
            return new beachfront(this);
        }
    }

    public beachfront(attabal attabalVar) {
        this.f11683saneness = attabalVar.f11685attabal;
        this.f11680dern = attabalVar.f11690saneness;
        this.f11684wireman = attabalVar.f11688dern;
        this.f11682marial = attabalVar.f11691wireman;
        this.f11678beachfront = attabalVar.f11689marial;
        this.f11679competently = attabalVar.f11686beachfront;
        this.f11681impromptu = attabalVar.f11687competently;
    }

    public static int saneness(int i, int i2, int i3) {
        return Ints.wireman(((((long) i) * ((long) i2)) * ((long) i3)) / 1000000);
    }

    public static int wireman(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return DefaultOggSeeker.MATCH_BYTE_RANGE;
            case 11:
                return 16000;
            case 12:
                return PlaybackException.ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED;
            default:
                switch (i) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.marial
    public int attabal(int i, int i2, int i3, int i4, int i5, int i6, double d) {
        return (((Math.max(i, (int) (((double) dern(i, i2, i3, i4, i5, i6)) * d)) + i4) - 1) / i4) * i4;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013  */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    public int beachfront(int i, int i2) {
        int i3;
        int iWireman;
        int i4 = this.f11682marial;
        if (i != 5) {
            if (i == 8) {
                i3 = this.f11681impromptu;
            }
            if (i2 != -1) {
                iWireman = moresque.dern.dern(i2, 8, RoundingMode.CEILING);
            } else {
                iWireman = wireman(i);
            }
            return Ints.wireman((((long) i4) * ((long) iWireman)) / 1000000);
        }
        i3 = this.f11679competently;
        i4 *= i3;
        if (i2 != -1) {
            iWireman = moresque.dern.dern(i2, 8, RoundingMode.CEILING);
        } else {
            iWireman = wireman(i);
        }
        return Ints.wireman((((long) i4) * ((long) iWireman)) / 1000000);
    }

    public int competently(int i, int i2, int i3) {
        return grimness.kowloon(i * this.f11684wireman, saneness(this.f11683saneness, i2, i3), saneness(this.f11680dern, i2, i3));
    }

    public int dern(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 == 0) {
            return competently(i, i5, i4);
        }
        if (i3 == 1) {
            return marial(i2);
        }
        if (i3 == 2) {
            return beachfront(i2, i6);
        }
        throw new IllegalArgumentException();
    }

    public int marial(int i) {
        return Ints.wireman((((long) this.f11678beachfront) * ((long) wireman(i))) / 1000000);
    }
}
