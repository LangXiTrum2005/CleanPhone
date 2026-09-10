package balance;

import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.extractor.metadata.id3.MlltFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.google.common.primitives.Ints;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import cybernatic.adultoid;
import cybernatic.arytenoidectomy;
import cybernatic.impassible;
import cybernatic.monoploid;
import cybernatic.oilcan;
import cybernatic.polloi;
import cybernatic.privatdozent;
import cybernatic.restrictive;
import cybernatic.sealless;
import decarock.grimness;
import decarock.stratoscope;
import decarock.triweekly;
import java.io.EOFException;
import java.io.IOException;
import java.math.RoundingMode;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: Mp3Extractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class beachfront implements arytenoidectomy {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static final adultoid f14858adultoid = new adultoid() { // from class: balance.wireman
        @Override // cybernatic.adultoid
        public final arytenoidectomy[] createExtractors() {
            return beachfront.dern();
        }
    };

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public static final imparkation.saneness.attabal f14859dovishness = new imparkation.saneness.attabal() { // from class: balance.marial
        @Override // imparkation.saneness.attabal
        public final boolean evaluate(int i, int i2, int i3, int i4, int i5) {
            return beachfront.competently(i, i2, i3, i4, i5);
        }
    };

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public int f14860apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public int f14861arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f14862attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final oilcan f14863beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final privatdozent f14864competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public privatdozent f14865cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final stratoscope f14866dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public Metadata f14867formularize;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public long f14868graveside;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public long f14869impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public polloi f14870impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public long f14871kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final cybernatic.stratoscope f14872marial;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public boolean f14873molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public competently f14874monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public boolean f14875polloi;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final long f14876saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public privatdozent f14877taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public long f14878triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final sealless.attabal f14879wireman;

    public beachfront() {
        this(0);
    }

    @RequiresNonNull({"realTrackOutput", "seeker"})
    private int adultoid(monoploid monoploidVar) throws IOException {
        if (this.f14861arytenoidectomy == 0) {
            monoploidVar.resetPeekPosition();
            if (molybdenite(monoploidVar)) {
                return -1;
            }
            this.f14866dern.mathsort(0);
            int iMonoploid = this.f14866dern.monoploid();
            if (!arytenoidectomy(iMonoploid, this.f14860apical) || sealless.cutely(iMonoploid) == -1) {
                monoploidVar.skipFully(1);
                this.f14860apical = 0;
                return 0;
            }
            this.f14879wireman.attabal(iMonoploid);
            if (this.f14869impassible == C.TIME_UNSET) {
                this.f14869impassible = this.f14874monoploid.getTimeUs(monoploidVar.getPosition());
                if (this.f14876saneness != C.TIME_UNSET) {
                    this.f14869impassible += this.f14876saneness - this.f14874monoploid.getTimeUs(0L);
                }
            }
            sealless.attabal attabalVar = this.f14879wireman;
            this.f14861arytenoidectomy = attabalVar.f24769dern;
            competently competentlyVar = this.f14874monoploid;
            if (competentlyVar instanceof saneness) {
                saneness sanenessVar = (saneness) competentlyVar;
                sanenessVar.saneness(cutely(this.f14878triweekly + ((long) attabalVar.f24768competently)), monoploidVar.getPosition() + ((long) this.f14879wireman.f24769dern));
                if (this.f14873molybdenite && sanenessVar.attabal(this.f14868graveside)) {
                    this.f14873molybdenite = false;
                    this.f14865cutely = this.f14877taiyuan;
                }
            }
        }
        int iMarial = this.f14865cutely.marial(monoploidVar, this.f14861arytenoidectomy, true);
        if (iMarial == -1) {
            return -1;
        }
        int i = this.f14861arytenoidectomy - iMarial;
        this.f14861arytenoidectomy = i;
        if (i > 0) {
            return 0;
        }
        this.f14865cutely.wireman(cutely(this.f14878triweekly), 1, this.f14879wireman.f24769dern, 0, null);
        this.f14878triweekly += (long) this.f14879wireman.f24768competently;
        this.f14861arytenoidectomy = 0;
        return 0;
    }

    public static boolean arytenoidectomy(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    public static /* synthetic */ boolean competently(int i, int i2, int i3, int i4, int i5) {
        if (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) {
            return true;
        }
        if (i2 == 77 && i3 == 76 && i4 == 76) {
            return i5 == 84 || i == 2;
        }
        return false;
    }

    public static /* synthetic */ arytenoidectomy[] dern() {
        return new arytenoidectomy[]{new beachfront()};
    }

    @EnsuresNonNull({"extractorOutput", "realTrackOutput"})
    private void impromptu() {
        decarock.attabal.taiyuan(this.f14877taiyuan);
        grimness.impromptu(this.f14870impromptu);
    }

    public static int kowloon(stratoscope stratoscopeVar, int i) {
        if (stratoscopeVar.competently() >= i + 4) {
            stratoscopeVar.mathsort(i);
            int iMonoploid = stratoscopeVar.monoploid();
            if (iMonoploid == 1483304551 || iMonoploid == 1231971951) {
                return iMonoploid;
            }
        }
        if (stratoscopeVar.competently() < 40) {
            return 0;
        }
        stratoscopeVar.mathsort(36);
        return stratoscopeVar.monoploid() == 1447187017 ? 1447187017 : 0;
    }

    public static dern monoploid(Metadata metadata, long j) {
        if (metadata == null) {
            return null;
        }
        int length = metadata.length();
        for (int i = 0; i < length; i++) {
            Metadata.Entry entryWireman = metadata.wireman(i);
            if (entryWireman instanceof MlltFrame) {
                return dern.attabal(j, (MlltFrame) entryWireman, triweekly(metadata));
            }
        }
        return null;
    }

    public static long triweekly(Metadata metadata) {
        if (metadata == null) {
            return C.TIME_UNSET;
        }
        int length = metadata.length();
        for (int i = 0; i < length; i++) {
            Metadata.Entry entryWireman = metadata.wireman(i);
            if (entryWireman instanceof TextInformationFrame) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) entryWireman;
                if (textInformationFrame.f13073kowloon.equals("TLEN")) {
                    return grimness.outmarry(Long.parseLong(textInformationFrame.f13085monoploid.get(0)));
                }
            }
        }
        return C.TIME_UNSET;
    }

    public void apical() {
        this.f14875polloi = true;
    }

    @Override // cybernatic.arytenoidectomy
    public boolean attabal(monoploid monoploidVar) throws IOException {
        return dovishness(monoploidVar, true);
    }

    @Override // cybernatic.arytenoidectomy
    public int beachfront(monoploid monoploidVar, restrictive restrictiveVar) throws Throwable {
        impromptu();
        int iGraveside = graveside(monoploidVar);
        if (iGraveside == -1 && (this.f14874monoploid instanceof saneness)) {
            long jCutely = cutely(this.f14878triweekly);
            if (this.f14874monoploid.getDurationUs() != jCutely) {
                ((saneness) this.f14874monoploid).wireman(jCutely);
                this.f14870impromptu.beachfront(this.f14874monoploid);
            }
        }
        return iGraveside;
    }

    public final long cutely(long j) {
        return this.f14869impassible + ((j * 1000000) / ((long) this.f14879wireman.f24772wireman));
    }

    public final boolean dovishness(monoploid monoploidVar, boolean z) throws Throwable {
        int peekPosition;
        int i;
        int iCutely;
        int i2 = z ? 32768 : 131072;
        monoploidVar.resetPeekPosition();
        if (monoploidVar.getPosition() == 0) {
            Metadata metadataAttabal = this.f14863beachfront.attabal(monoploidVar, (this.f14862attabal & 8) == 0 ? null : f14859dovishness);
            this.f14867formularize = metadataAttabal;
            if (metadataAttabal != null) {
                this.f14872marial.dern(metadataAttabal);
            }
            peekPosition = (int) monoploidVar.getPeekPosition();
            if (!z) {
                monoploidVar.skipFully(peekPosition);
            }
            i = 0;
        } else {
            peekPosition = 0;
            i = 0;
        }
        int i3 = i;
        int i4 = i3;
        while (true) {
            if (molybdenite(monoploidVar)) {
                if (i3 > 0) {
                    break;
                }
                throw new EOFException();
            }
            this.f14866dern.mathsort(0);
            int iMonoploid = this.f14866dern.monoploid();
            if ((i == 0 || arytenoidectomy(iMonoploid, i)) && (iCutely = sealless.cutely(iMonoploid)) != -1) {
                i3++;
                if (i3 != 1) {
                    if (i3 == 4) {
                        break;
                    }
                } else {
                    this.f14879wireman.attabal(iMonoploid);
                    i = iMonoploid;
                }
                monoploidVar.advancePeekPosition(iCutely - 4);
            } else {
                int i5 = i4 + 1;
                if (i4 == i2) {
                    if (z) {
                        return false;
                    }
                    throw ParserException.createForMalformedContainer("Searched too many bytes.", null);
                }
                if (z) {
                    monoploidVar.resetPeekPosition();
                    monoploidVar.advancePeekPosition(peekPosition + i5);
                } else {
                    monoploidVar.skipFully(1);
                }
                i3 = 0;
                i4 = i5;
                i = 0;
            }
        }
        if (z) {
            monoploidVar.skipFully(peekPosition + i4);
        } else {
            monoploidVar.resetPeekPosition();
        }
        this.f14860apical = i;
        return true;
    }

    public final competently formularize(long j, taiyuan taiyuanVar, long j2) {
        long j3;
        long j4;
        long jAttabal = taiyuanVar.attabal();
        if (jAttabal == C.TIME_UNSET) {
            return null;
        }
        long j5 = taiyuanVar.f14902dern;
        if (j5 != -1) {
            long j6 = j + j5;
            j3 = j5 - ((long) taiyuanVar.f14900attabal.f24769dern);
            j4 = j6;
        } else {
            if (j2 == -1) {
                return null;
            }
            j3 = (j2 - j) - ((long) taiyuanVar.f14900attabal.f24769dern);
            j4 = j2;
        }
        long j7 = j3;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        return new attabal(j4, j + ((long) taiyuanVar.f14900attabal.f24769dern), Ints.wireman(grimness.sakeen(j7, 8000000L, jAttabal, roundingMode)), Ints.wireman(moresque.wireman.saneness(j7, taiyuanVar.f14904saneness, roundingMode)), false);
    }

    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    public final int graveside(monoploid monoploidVar) throws Throwable {
        if (this.f14860apical == 0) {
            try {
                dovishness(monoploidVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f14874monoploid == null) {
            competently competentlyVarTaiyuan = taiyuan(monoploidVar);
            this.f14874monoploid = competentlyVarTaiyuan;
            this.f14870impromptu.beachfront(competentlyVarTaiyuan);
            androidx.media3.common.polloi.saneness sanenessVarLerp = new androidx.media3.common.polloi.saneness().sensatory(this.f14879wireman.f24771saneness).itchy(4096).saran(this.f14879wireman.f24770marial).underbelly(this.f14879wireman.f24772wireman).splinterproof(this.f14872marial.f24785attabal).overspeculate(this.f14872marial.f24786saneness).lerp((this.f14862attabal & 8) != 0 ? null : this.f14867formularize);
            if (this.f14874monoploid.competently() != -2147483647) {
                sanenessVarLerp.grimness(this.f14874monoploid.competently());
            }
            this.f14865cutely.dern(sanenessVarLerp.polder());
            this.f14871kowloon = monoploidVar.getPosition();
        } else if (this.f14871kowloon != 0) {
            long position = monoploidVar.getPosition();
            long j = this.f14871kowloon;
            if (position < j) {
                monoploidVar.skipFully((int) (j - position));
            }
        }
        return adultoid(monoploidVar);
    }

    public final competently impassible(monoploid monoploidVar, boolean z) throws IOException {
        monoploidVar.peekFully(this.f14866dern.marial(), 0, 4);
        this.f14866dern.mathsort(0);
        this.f14879wireman.attabal(this.f14866dern.monoploid());
        return new attabal(monoploidVar.getLength(), monoploidVar.getPosition(), this.f14879wireman, z);
    }

    @Override // cybernatic.arytenoidectomy
    public void marial(polloi polloiVar) {
        this.f14870impromptu = polloiVar;
        privatdozent privatdozentVarTrack = polloiVar.track(0, 1);
        this.f14877taiyuan = privatdozentVarTrack;
        this.f14865cutely = privatdozentVarTrack;
        this.f14870impromptu.endTracks();
    }

    public final boolean molybdenite(monoploid monoploidVar) throws IOException {
        competently competentlyVar = this.f14874monoploid;
        if (competentlyVar != null) {
            long jDern = competentlyVar.dern();
            if (jDern != -1 && monoploidVar.getPeekPosition() > jDern - 4) {
                return true;
            }
        }
        try {
            return !monoploidVar.peekFully(this.f14866dern.marial(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final competently polloi(monoploid monoploidVar) throws IOException {
        int i;
        int i2;
        stratoscope stratoscopeVar = new stratoscope(this.f14879wireman.f24769dern);
        monoploidVar.peekFully(stratoscopeVar.marial(), 0, this.f14879wireman.f24769dern);
        sealless.attabal attabalVar = this.f14879wireman;
        int i3 = 21;
        if ((attabalVar.f24766attabal & 1) != 0) {
            if (attabalVar.f24770marial != 1) {
                i3 = 36;
            }
        } else if (attabalVar.f24770marial == 1) {
            i3 = 13;
        }
        int iKowloon = kowloon(stratoscopeVar, i3);
        if (iKowloon != 1231971951) {
            if (iKowloon == 1447187017) {
                impromptu impromptuVarAttabal = impromptu.attabal(monoploidVar.getLength(), monoploidVar.getPosition(), this.f14879wireman, stratoscopeVar);
                monoploidVar.skipFully(this.f14879wireman.f24769dern);
                return impromptuVarAttabal;
            }
            if (iKowloon != 1483304551) {
                monoploidVar.resetPeekPosition();
                return null;
            }
        }
        taiyuan taiyuanVarSaneness = taiyuan.saneness(this.f14879wireman, stratoscopeVar);
        if (!this.f14872marial.attabal() && (i = taiyuanVarSaneness.f14905wireman) != -1 && (i2 = taiyuanVarSaneness.f14903marial) != -1) {
            cybernatic.stratoscope stratoscopeVar2 = this.f14872marial;
            stratoscopeVar2.f24785attabal = i;
            stratoscopeVar2.f24786saneness = i2;
        }
        long position = monoploidVar.getPosition();
        if (monoploidVar.getLength() != -1 && taiyuanVarSaneness.f14902dern != -1 && monoploidVar.getLength() != taiyuanVarSaneness.f14902dern + position) {
            triweekly.beachfront("Mp3Extractor", "Data size mismatch between stream (" + monoploidVar.getLength() + ") and Xing frame (" + (taiyuanVarSaneness.f14902dern + position) + "), using Xing value.");
        }
        monoploidVar.skipFully(this.f14879wireman.f24769dern);
        return iKowloon == 1483304551 ? cutely.attabal(taiyuanVarSaneness, position) : formularize(position, taiyuanVarSaneness, monoploidVar.getLength());
    }

    @Override // cybernatic.arytenoidectomy
    public void seek(long j, long j2) {
        this.f14860apical = 0;
        this.f14869impassible = C.TIME_UNSET;
        this.f14878triweekly = 0L;
        this.f14861arytenoidectomy = 0;
        this.f14868graveside = j2;
        competently competentlyVar = this.f14874monoploid;
        if (!(competentlyVar instanceof saneness) || ((saneness) competentlyVar).attabal(j2)) {
            return;
        }
        this.f14873molybdenite = true;
        this.f14865cutely = this.f14864competently;
    }

    public final competently taiyuan(monoploid monoploidVar) throws IOException {
        long jTriweekly;
        long jDern;
        competently competentlyVarPolloi = polloi(monoploidVar);
        dern dernVarMonoploid = monoploid(this.f14867formularize, monoploidVar.getPosition());
        if (this.f14875polloi) {
            return new competently.attabal();
        }
        if ((this.f14862attabal & 4) != 0) {
            if (dernVarMonoploid != null) {
                jTriweekly = dernVarMonoploid.getDurationUs();
                jDern = dernVarMonoploid.dern();
            } else if (competentlyVarPolloi != null) {
                jTriweekly = competentlyVarPolloi.getDurationUs();
                jDern = competentlyVarPolloi.dern();
            } else {
                jTriweekly = triweekly(this.f14867formularize);
                jDern = -1;
            }
            competentlyVarPolloi = new saneness(jTriweekly, monoploidVar.getPosition(), jDern);
        } else if (dernVarMonoploid != null) {
            competentlyVarPolloi = dernVarMonoploid;
        } else if (competentlyVarPolloi == null) {
            competentlyVarPolloi = null;
        }
        if (competentlyVarPolloi == null || !(competentlyVarPolloi.isSeekable() || (this.f14862attabal & 1) == 0)) {
            return impassible(monoploidVar, (this.f14862attabal & 2) != 0);
        }
        return competentlyVarPolloi;
    }

    public beachfront(int i) {
        this(i, C.TIME_UNSET);
    }

    public beachfront(int i, long j) {
        this.f14862attabal = (i & 2) != 0 ? i | 1 : i;
        this.f14876saneness = j;
        this.f14866dern = new stratoscope(10);
        this.f14879wireman = new sealless.attabal();
        this.f14872marial = new cybernatic.stratoscope();
        this.f14869impassible = C.TIME_UNSET;
        this.f14863beachfront = new oilcan();
        impassible impassibleVar = new impassible();
        this.f14864competently = impassibleVar;
        this.f14865cutely = impassibleVar;
    }

    @Override // cybernatic.arytenoidectomy
    public void release() {
    }
}
