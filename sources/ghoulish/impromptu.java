package ghoulish;

import androidx.media3.common.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: AdtsExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class impromptu implements cybernatic.arytenoidectomy {

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public static final cybernatic.adultoid f26907impassible = new cybernatic.adultoid() { // from class: ghoulish.competently
        @Override // cybernatic.adultoid
        public final cybernatic.arytenoidectomy[] createExtractors() {
            return impromptu.dern();
        }
    };

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public boolean f26908apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f26909attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public cybernatic.polloi f26910beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public long f26911competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public boolean f26912cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final decarock.stratoscope f26913dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public boolean f26914formularize;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public long f26915impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final decarock.cuirassed f26916marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final taiyuan f26917saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public int f26918taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final decarock.stratoscope f26919wireman;

    public impromptu() {
        this(0);
    }

    public static /* synthetic */ cybernatic.arytenoidectomy[] dern() {
        return new cybernatic.arytenoidectomy[]{new impromptu()};
    }

    private static int impromptu(int i, long j) {
        return (int) ((((long) i) * 8000000) / j);
    }

    private cybernatic.merc taiyuan(long j, boolean z) {
        return new cybernatic.impromptu(j, this.f26915impromptu, impromptu(this.f26918taiyuan, this.f26917saneness.cutely()), this.f26918taiyuan, z);
    }

    public final int apical(cybernatic.monoploid monoploidVar) throws IOException {
        int i = 0;
        while (true) {
            monoploidVar.peekFully(this.f26919wireman.marial(), 0, 10);
            this.f26919wireman.mathsort(0);
            if (this.f26919wireman.polder() != 4801587) {
                break;
            }
            this.f26919wireman.splinterproof(3);
            int iKattegat = this.f26919wireman.kattegat();
            i += iKattegat + 10;
            monoploidVar.advancePeekPosition(iKattegat);
        }
        monoploidVar.resetPeekPosition();
        monoploidVar.advancePeekPosition(i);
        if (this.f26915impromptu == -1) {
            this.f26915impromptu = i;
        }
        return i;
    }

    @Override // cybernatic.arytenoidectomy
    public boolean attabal(cybernatic.monoploid monoploidVar) throws IOException {
        int iApical = apical(monoploidVar);
        int i = iApical;
        int i2 = 0;
        int i3 = 0;
        do {
            monoploidVar.peekFully(this.f26919wireman.marial(), 0, 2);
            this.f26919wireman.mathsort(0);
            if (taiyuan.formularize(this.f26919wireman.saran())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                monoploidVar.peekFully(this.f26919wireman.marial(), 0, 4);
                this.f26916marial.arytenoidectomy(14);
                int iImpromptu = this.f26916marial.impromptu(13);
                if (iImpromptu <= 6) {
                    i++;
                    monoploidVar.resetPeekPosition();
                    monoploidVar.advancePeekPosition(i);
                } else {
                    monoploidVar.advancePeekPosition(iImpromptu - 6);
                    i3 += iImpromptu;
                }
            } else {
                i++;
                monoploidVar.resetPeekPosition();
                monoploidVar.advancePeekPosition(i);
            }
            i2 = 0;
            i3 = 0;
        } while (i - iApical < 8192);
        return false;
    }

    @Override // cybernatic.arytenoidectomy
    public int beachfront(cybernatic.monoploid monoploidVar, cybernatic.restrictive restrictiveVar) throws IOException {
        decarock.attabal.taiyuan(this.f26910beachfront);
        long length = monoploidVar.getLength();
        int i = this.f26909attabal;
        if ((i & 2) != 0 || ((i & 1) != 0 && length != -1)) {
            competently(monoploidVar);
        }
        int i2 = monoploidVar.read(this.f26913dern.marial(), 0, 2048);
        boolean z = i2 == -1;
        cutely(length, z);
        if (z) {
            return -1;
        }
        this.f26913dern.mathsort(0);
        this.f26913dern.peridotite(i2);
        if (!this.f26908apical) {
            this.f26917saneness.wireman(this.f26911competently, 4);
            this.f26908apical = true;
        }
        this.f26917saneness.attabal(this.f26913dern);
        return 0;
    }

    public final void competently(cybernatic.monoploid monoploidVar) throws IOException {
        if (this.f26912cutely) {
            return;
        }
        this.f26918taiyuan = -1;
        monoploidVar.resetPeekPosition();
        long j = 0;
        if (monoploidVar.getPosition() == 0) {
            apical(monoploidVar);
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                if (monoploidVar.peekFully(this.f26919wireman.marial(), 0, 2, true)) {
                    this.f26919wireman.mathsort(0);
                    if (!taiyuan.formularize(this.f26919wireman.saran())) {
                        break;
                    }
                    if (monoploidVar.peekFully(this.f26919wireman.marial(), 0, 4, true)) {
                        this.f26916marial.arytenoidectomy(14);
                        int iImpromptu = this.f26916marial.impromptu(13);
                        if (iImpromptu <= 6) {
                            this.f26912cutely = true;
                            throw ParserException.createForMalformedContainer("Malformed ADTS stream", null);
                        }
                        j += (long) iImpromptu;
                        i2++;
                        if (i2 != 1000 && monoploidVar.advancePeekPosition(iImpromptu - 6, true)) {
                        }
                    }
                }
            } catch (EOFException unused) {
            }
            i = i2;
            break;
        }
        monoploidVar.resetPeekPosition();
        if (i > 0) {
            this.f26918taiyuan = (int) (j / ((long) i));
        } else {
            this.f26918taiyuan = -1;
        }
        this.f26912cutely = true;
    }

    @RequiresNonNull({"extractorOutput"})
    public final void cutely(long j, boolean z) {
        if (this.f26914formularize) {
            return;
        }
        boolean z2 = (this.f26909attabal & 1) != 0 && this.f26918taiyuan > 0;
        if (z2 && this.f26917saneness.cutely() == C.TIME_UNSET && !z) {
            return;
        }
        if (!z2 || this.f26917saneness.cutely() == C.TIME_UNSET) {
            this.f26910beachfront.beachfront(new cybernatic.merc.saneness(C.TIME_UNSET));
        } else {
            this.f26910beachfront.beachfront(taiyuan(j, (this.f26909attabal & 2) != 0));
        }
        this.f26914formularize = true;
    }

    @Override // cybernatic.arytenoidectomy
    public void marial(cybernatic.polloi polloiVar) {
        this.f26910beachfront = polloiVar;
        this.f26917saneness.saneness(polloiVar, new polder.wireman(0, 1));
        polloiVar.endTracks();
    }

    @Override // cybernatic.arytenoidectomy
    public void seek(long j, long j2) {
        this.f26908apical = false;
        this.f26917saneness.seek();
        this.f26911competently = j2;
    }

    public impromptu(int i) {
        this.f26909attabal = (i & 2) != 0 ? i | 1 : i;
        this.f26917saneness = new taiyuan(true);
        this.f26913dern = new decarock.stratoscope(2048);
        this.f26918taiyuan = -1;
        this.f26915impromptu = -1L;
        decarock.stratoscope stratoscopeVar = new decarock.stratoscope(10);
        this.f26919wireman = stratoscopeVar;
        this.f26916marial = new decarock.cuirassed(stratoscopeVar.marial());
    }

    @Override // cybernatic.arytenoidectomy
    public void release() {
    }
}
