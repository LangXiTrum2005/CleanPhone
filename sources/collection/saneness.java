package collection;

import androidx.media3.common.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import cybernatic.adultoid;
import cybernatic.arytenoidectomy;
import cybernatic.impromptu;
import cybernatic.merc;
import cybernatic.monoploid;
import cybernatic.polloi;
import cybernatic.privatdozent;
import cybernatic.restrictive;
import decarock.grimness;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: AmrExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness implements arytenoidectomy {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static final int f15784adultoid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final int[] f15789polloi;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public long f15790apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final byte[] f15791attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f15792beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public boolean f15793competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public int f15794cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f15795dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public polloi f15796formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public privatdozent f15797impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public long f15798impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public boolean f15799kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f15800marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f15801saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public int f15802taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public merc f15803triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public long f15804wireman;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final adultoid f15785arytenoidectomy = new adultoid() { // from class: collection.attabal
        @Override // cybernatic.adultoid
        public final arytenoidectomy[] createExtractors() {
            return saneness.dern();
        }
    };

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final int[] f15788monoploid = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final byte[] f15787molybdenite = grimness.czestochowa("#!AMR\n");

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static final byte[] f15786graveside = grimness.czestochowa("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f15789polloi = iArr;
        f15784adultoid = iArr[8];
    }

    public saneness() {
        this(0);
    }

    public static boolean arytenoidectomy(monoploid monoploidVar, byte[] bArr) throws IOException {
        monoploidVar.resetPeekPosition();
        byte[] bArr2 = new byte[bArr.length];
        monoploidVar.peekFully(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    public static /* synthetic */ arytenoidectomy[] dern() {
        return new arytenoidectomy[]{new saneness()};
    }

    public static int impromptu(int i, long j) {
        return (int) ((((long) i) * 8000000) / j);
    }

    public final boolean apical(int i) {
        if (this.f15795dern) {
            return false;
        }
        return i < 12 || i > 14;
    }

    @Override // cybernatic.arytenoidectomy
    public boolean attabal(monoploid monoploidVar) throws IOException {
        return polloi(monoploidVar);
    }

    @Override // cybernatic.arytenoidectomy
    public int beachfront(monoploid monoploidVar, restrictive restrictiveVar) throws IOException {
        competently();
        if (monoploidVar.getPosition() == 0 && !polloi(monoploidVar)) {
            throw ParserException.createForMalformedContainer("Could not find AMR header.", null);
        }
        triweekly();
        int iMolybdenite = molybdenite(monoploidVar);
        kowloon(monoploidVar.getLength(), iMolybdenite);
        return iMolybdenite;
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    public final void competently() {
        decarock.attabal.taiyuan(this.f15797impassible);
        grimness.impromptu(this.f15796formularize);
    }

    public final int cutely(int i) throws ParserException {
        if (formularize(i)) {
            return this.f15795dern ? f15789polloi[i] : f15788monoploid[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(this.f15795dern ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw ParserException.createForMalformedContainer(sb.toString(), null);
    }

    public final boolean formularize(int i) {
        if (i < 0 || i > 15) {
            return false;
        }
        return impassible(i) || apical(i);
    }

    public final boolean impassible(int i) {
        if (this.f15795dern) {
            return i < 10 || i > 13;
        }
        return false;
    }

    @RequiresNonNull({"extractorOutput"})
    public final void kowloon(long j, int i) {
        int i2;
        if (this.f15793competently) {
            return;
        }
        int i3 = this.f15801saneness;
        if ((i3 & 1) == 0 || j == -1 || !((i2 = this.f15802taiyuan) == -1 || i2 == this.f15800marial)) {
            merc.saneness sanenessVar = new merc.saneness(C.TIME_UNSET);
            this.f15803triweekly = sanenessVar;
            this.f15796formularize.beachfront(sanenessVar);
            this.f15793competently = true;
            return;
        }
        if (this.f15794cutely >= 20 || i == -1) {
            merc mercVarTaiyuan = taiyuan(j, (i3 & 2) != 0);
            this.f15803triweekly = mercVarTaiyuan;
            this.f15796formularize.beachfront(mercVarTaiyuan);
            this.f15793competently = true;
        }
    }

    @Override // cybernatic.arytenoidectomy
    public void marial(polloi polloiVar) {
        this.f15796formularize = polloiVar;
        this.f15797impassible = polloiVar.track(0, 1);
        polloiVar.endTracks();
    }

    @RequiresNonNull({"trackOutput"})
    public final int molybdenite(monoploid monoploidVar) throws IOException {
        if (this.f15792beachfront == 0) {
            try {
                int iMonoploid = monoploid(monoploidVar);
                this.f15800marial = iMonoploid;
                this.f15792beachfront = iMonoploid;
                if (this.f15802taiyuan == -1) {
                    this.f15798impromptu = monoploidVar.getPosition();
                    this.f15802taiyuan = this.f15800marial;
                }
                if (this.f15802taiyuan == this.f15800marial) {
                    this.f15794cutely++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iMarial = this.f15797impassible.marial(monoploidVar, this.f15792beachfront, true);
        if (iMarial == -1) {
            return -1;
        }
        int i = this.f15792beachfront - iMarial;
        this.f15792beachfront = i;
        if (i > 0) {
            return 0;
        }
        this.f15797impassible.wireman(this.f15790apical + this.f15804wireman, 1, this.f15800marial, 0, null);
        this.f15804wireman += 20000;
        return 0;
    }

    public final int monoploid(monoploid monoploidVar) throws IOException {
        monoploidVar.resetPeekPosition();
        monoploidVar.peekFully(this.f15791attabal, 0, 1);
        byte b = this.f15791attabal[0];
        if ((b & 131) <= 0) {
            return cutely((b >> 3) & 15);
        }
        throw ParserException.createForMalformedContainer("Invalid padding bits for frame header " + ((int) b), null);
    }

    public final boolean polloi(monoploid monoploidVar) throws IOException {
        byte[] bArr = f15787molybdenite;
        if (arytenoidectomy(monoploidVar, bArr)) {
            this.f15795dern = false;
            monoploidVar.skipFully(bArr.length);
            return true;
        }
        byte[] bArr2 = f15786graveside;
        if (!arytenoidectomy(monoploidVar, bArr2)) {
            return false;
        }
        this.f15795dern = true;
        monoploidVar.skipFully(bArr2.length);
        return true;
    }

    @Override // cybernatic.arytenoidectomy
    public void seek(long j, long j2) {
        this.f15804wireman = 0L;
        this.f15800marial = 0;
        this.f15792beachfront = 0;
        if (j != 0) {
            merc mercVar = this.f15803triweekly;
            if (mercVar instanceof impromptu) {
                this.f15790apical = ((impromptu) mercVar).saneness(j);
                return;
            }
        }
        this.f15790apical = 0L;
    }

    public final merc taiyuan(long j, boolean z) {
        return new impromptu(j, this.f15798impromptu, impromptu(this.f15802taiyuan, 20000L), this.f15802taiyuan, z);
    }

    @RequiresNonNull({"trackOutput"})
    public final void triweekly() {
        if (this.f15799kowloon) {
            return;
        }
        this.f15799kowloon = true;
        boolean z = this.f15795dern;
        this.f15797impassible.dern(new androidx.media3.common.polloi.saneness().sensatory(z ? MimeTypes.AUDIO_AMR_WB : MimeTypes.AUDIO_AMR_NB).itchy(f15784adultoid).saran(1).underbelly(z ? 16000 : 8000).polder());
    }

    public saneness(int i) {
        this.f15801saneness = (i & 2) != 0 ? i | 1 : i;
        this.f15791attabal = new byte[1];
        this.f15802taiyuan = -1;
    }

    @Override // cybernatic.arytenoidectomy
    public void release() {
    }
}
