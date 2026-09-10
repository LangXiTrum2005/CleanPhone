package cybernatic;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: FlacStreamMetadata.java */
/* JADX INFO: loaded from: classes.dex */
public final class preprohormone {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final attabal f24725apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f24726attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final int f24727beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final int f24728competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final long f24729cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f24730dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final Metadata f24731formularize;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final int f24732impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f24733marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f24734saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final int f24735taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f24736wireman;

    /* JADX INFO: compiled from: FlacStreamMetadata.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final long[] f24737attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final long[] f24738saneness;

        public attabal(long[] jArr, long[] jArr2) {
            this.f24737attabal = jArr;
            this.f24738saneness = jArr2;
        }
    }

    public preprohormone(byte[] bArr, int i) {
        decarock.cuirassed cuirassedVar = new decarock.cuirassed(bArr);
        cuirassedVar.arytenoidectomy(i * 8);
        this.f24726attabal = cuirassedVar.impromptu(16);
        this.f24734saneness = cuirassedVar.impromptu(16);
        this.f24730dern = cuirassedVar.impromptu(24);
        this.f24736wireman = cuirassedVar.impromptu(24);
        int iImpromptu = cuirassedVar.impromptu(20);
        this.f24733marial = iImpromptu;
        this.f24727beachfront = cutely(iImpromptu);
        this.f24728competently = cuirassedVar.impromptu(3) + 1;
        int iImpromptu2 = cuirassedVar.impromptu(5) + 1;
        this.f24732impromptu = iImpromptu2;
        this.f24735taiyuan = marial(iImpromptu2);
        this.f24729cutely = cuirassedVar.cutely(36);
        this.f24725apical = null;
        this.f24731formularize = null;
    }

    public static int cutely(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public static int marial(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    public preprohormone attabal(List<PictureFrame> list) {
        return new preprohormone(this.f24726attabal, this.f24734saneness, this.f24730dern, this.f24736wireman, this.f24733marial, this.f24728competently, this.f24732impromptu, this.f24729cutely, this.f24725apical, impromptu(new Metadata(list)));
    }

    public long beachfront() {
        long j = this.f24729cutely;
        return j == 0 ? C.TIME_UNSET : (j * 1000000) / ((long) this.f24733marial);
    }

    public androidx.media3.common.polloi competently(byte[] bArr, Metadata metadata) {
        bArr[4] = -128;
        int i = this.f24736wireman;
        if (i <= 0) {
            i = -1;
        }
        return new androidx.media3.common.polloi.saneness().sensatory(MimeTypes.AUDIO_FLAC).itchy(i).saran(this.f24728competently).underbelly(this.f24733marial).nosophobia(decarock.grimness.premeiotic(this.f24732impromptu)).premeiotic(Collections.singletonList(bArr)).lerp(impromptu(metadata)).polder();
    }

    public preprohormone dern(List<String> list) {
        return new preprohormone(this.f24726attabal, this.f24734saneness, this.f24730dern, this.f24736wireman, this.f24733marial, this.f24728competently, this.f24732impromptu, this.f24729cutely, this.f24725apical, impromptu(hydrovane.wireman(list)));
    }

    public Metadata impromptu(Metadata metadata) {
        Metadata metadata2 = this.f24731formularize;
        return metadata2 == null ? metadata : metadata2.saneness(metadata);
    }

    public preprohormone saneness(attabal attabalVar) {
        return new preprohormone(this.f24726attabal, this.f24734saneness, this.f24730dern, this.f24736wireman, this.f24733marial, this.f24728competently, this.f24732impromptu, this.f24729cutely, attabalVar, this.f24731formularize);
    }

    public long taiyuan(long j) {
        return decarock.grimness.arytenoidectomy((j * ((long) this.f24733marial)) / 1000000, 0L, this.f24729cutely - 1);
    }

    public long wireman() {
        long j;
        long j2;
        int i = this.f24736wireman;
        if (i > 0) {
            j = (((long) i) + ((long) this.f24730dern)) / 2;
            j2 = 1;
        } else {
            int i2 = this.f24726attabal;
            j = ((((i2 != this.f24734saneness || i2 <= 0) ? 4096L : i2) * ((long) this.f24728competently)) * ((long) this.f24732impromptu)) / 8;
            j2 = 64;
        }
        return j + j2;
    }

    public preprohormone(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, attabal attabalVar, Metadata metadata) {
        this.f24726attabal = i;
        this.f24734saneness = i2;
        this.f24730dern = i3;
        this.f24736wireman = i4;
        this.f24733marial = i5;
        this.f24727beachfront = cutely(i5);
        this.f24728competently = i6;
        this.f24732impromptu = i7;
        this.f24735taiyuan = marial(i7);
        this.f24729cutely = j;
        this.f24725apical = attabalVar;
        this.f24731formularize = metadata;
    }
}
