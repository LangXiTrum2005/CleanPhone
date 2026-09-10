package androidx.media3.exoplayer.source;

import androidx.media3.common.yemenite;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.empress;
import androidx.media3.exoplayer.molet;
import androidx.media3.exoplayer.sensatory;
import androidx.media3.exoplayer.upstream.Loader;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import decarock.grimness;
import ethene.restrictive;
import ethene.trm;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: SingleSampleMediaPeriod.java */
/* JADX INFO: loaded from: classes.dex */
public final class dovishness implements apical, Loader.saneness<dern> {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final androidx.media3.datasource.attabal.InterfaceC0080attabal f12497arytenoidectomy;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public boolean f12498cord;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public byte[] f12499cuirassed;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final long f12500dovishness;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final restrictive f12502graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final vir.competently f12503kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final impassible.attabal f12504molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final vir.arytenoidectomy f12505monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final androidx.media3.exoplayer.upstream.saneness f12506polloi;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public final boolean f12507preprohormone;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public final androidx.media3.common.polloi f12508rotuma;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public int f12509stratoscope;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final ArrayList<saneness> f12496adultoid = new ArrayList<>();

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public final Loader f12501gintrap = new Loader("SingleSampleMediaPeriod");

    /* JADX INFO: compiled from: SingleSampleMediaPeriod.java */
    public final class saneness implements trm {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f12514attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public boolean f12516saneness;

        public saneness() {
        }

        @Override // ethene.trm
        public int attabal(empress empressVar, DecoderInputBuffer decoderInputBuffer, int i) {
            saneness();
            dovishness dovishnessVar = dovishness.this;
            boolean z = dovishnessVar.f12498cord;
            if (z && dovishnessVar.f12499cuirassed == null) {
                this.f12514attabal = 2;
            }
            int i2 = this.f12514attabal;
            if (i2 == 2) {
                decoderInputBuffer.attabal(4);
                return -4;
            }
            if ((i & 2) != 0 || i2 == 0) {
                empressVar.f11879saneness = dovishnessVar.f12508rotuma;
                this.f12514attabal = 1;
                return -5;
            }
            if (!z) {
                return -3;
            }
            decarock.attabal.marial(dovishnessVar.f12499cuirassed);
            decoderInputBuffer.attabal(1);
            decoderInputBuffer.f11480graveside = 0L;
            if ((i & 4) == 0) {
                decoderInputBuffer.kowloon(dovishness.this.f12509stratoscope);
                ByteBuffer byteBuffer = decoderInputBuffer.f11483polloi;
                dovishness dovishnessVar2 = dovishness.this;
                byteBuffer.put(dovishnessVar2.f12499cuirassed, 0, dovishnessVar2.f12509stratoscope);
            }
            if ((i & 1) == 0) {
                this.f12514attabal = 2;
            }
            return -4;
        }

        public void dern() {
            if (this.f12514attabal == 2) {
                this.f12514attabal = 1;
            }
        }

        @Override // ethene.trm
        public boolean isReady() {
            return dovishness.this.f12498cord;
        }

        @Override // ethene.trm
        public void maybeThrowError() throws IOException {
            dovishness dovishnessVar = dovishness.this;
            if (dovishnessVar.f12507preprohormone) {
                return;
            }
            dovishnessVar.f12501gintrap.cutely();
        }

        public final void saneness() {
            if (this.f12516saneness) {
                return;
            }
            dovishness.this.f12504molybdenite.competently(androidx.media3.common.rotuma.beachfront(dovishness.this.f12508rotuma.f11218triweekly), dovishness.this.f12508rotuma, 0, null, 0L);
            this.f12516saneness = true;
        }

        @Override // ethene.trm
        public int skipData(long j) {
            saneness();
            if (j <= 0 || this.f12514attabal == 2) {
                return 0;
            }
            this.f12514attabal = 2;
            return 1;
        }
    }

    public dovishness(vir.competently competentlyVar, androidx.media3.datasource.attabal.InterfaceC0080attabal interfaceC0080attabal, vir.arytenoidectomy arytenoidectomyVar, androidx.media3.common.polloi polloiVar, long j, androidx.media3.exoplayer.upstream.saneness sanenessVar, impassible.attabal attabalVar, boolean z) {
        this.f12503kowloon = competentlyVar;
        this.f12497arytenoidectomy = interfaceC0080attabal;
        this.f12505monoploid = arytenoidectomyVar;
        this.f12508rotuma = polloiVar;
        this.f12500dovishness = j;
        this.f12506polloi = sanenessVar;
        this.f12504molybdenite = attabalVar;
        this.f12507preprohormone = z;
        this.f12502graveside = new restrictive(new yemenite(polloiVar));
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.saneness
    /* JADX INFO: renamed from: apical, reason: merged with bridge method [inline-methods] */
    public Loader.dern dern(dern dernVar, long j, long j2, IOException iOException, int i) {
        Loader.dern dernVarCompetently;
        vir.triweekly triweeklyVar = dernVar.f12511dern;
        ethene.kowloon kowloonVar = new ethene.kowloon(dernVar.f12510attabal, dernVar.f12512saneness, triweeklyVar.marial(), triweeklyVar.beachfront(), j, j2, triweeklyVar.wireman());
        long jAttabal = this.f12506polloi.attabal(new androidx.media3.exoplayer.upstream.saneness.attabal(kowloonVar, new ethene.arytenoidectomy(1, -1, this.f12508rotuma, 0, null, 0L, grimness.sultanate(this.f12500dovishness)), iOException, i));
        boolean z = jAttabal == C.TIME_UNSET || i >= this.f12506polloi.saneness(1);
        if (this.f12507preprohormone && z) {
            decarock.triweekly.taiyuan("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f12498cord = true;
            dernVarCompetently = Loader.f12778beachfront;
        } else {
            dernVarCompetently = jAttabal != C.TIME_UNSET ? Loader.competently(false, jAttabal) : Loader.f12779competently;
        }
        Loader.dern dernVar2 = dernVarCompetently;
        boolean zDern = dernVar2.dern();
        this.f12504molybdenite.impassible(kowloonVar, 1, -1, this.f12508rotuma, 0, null, 0L, this.f12500dovishness, iOException, !zDern);
        if (!zDern) {
            this.f12506polloi.dern(dernVar.f12510attabal);
        }
        return dernVar2;
    }

    @Override // androidx.media3.exoplayer.source.apical, androidx.media3.exoplayer.source.adultoid
    public boolean attabal(sensatory sensatoryVar) {
        if (this.f12498cord || this.f12501gintrap.taiyuan() || this.f12501gintrap.impromptu()) {
            return false;
        }
        androidx.media3.datasource.attabal attabalVarCreateDataSource = this.f12497arytenoidectomy.createDataSource();
        vir.arytenoidectomy arytenoidectomyVar = this.f12505monoploid;
        if (arytenoidectomyVar != null) {
            attabalVarCreateDataSource.dern(arytenoidectomyVar);
        }
        dern dernVar = new dern(this.f12503kowloon, attabalVarCreateDataSource);
        this.f12504molybdenite.kowloon(new ethene.kowloon(dernVar.f12510attabal, this.f12503kowloon, this.f12501gintrap.triweekly(dernVar, this, this.f12506polloi.saneness(1))), 1, -1, this.f12508rotuma, 0, null, 0L, this.f12500dovishness);
        return true;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.saneness
    /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
    public void taiyuan(dern dernVar, long j, long j2, boolean z) {
        vir.triweekly triweeklyVar = dernVar.f12511dern;
        ethene.kowloon kowloonVar = new ethene.kowloon(dernVar.f12510attabal, dernVar.f12512saneness, triweeklyVar.marial(), triweeklyVar.beachfront(), j, j2, triweeklyVar.wireman());
        this.f12506polloi.dern(dernVar.f12510attabal);
        this.f12504molybdenite.taiyuan(kowloonVar, 1, -1, null, 0, null, 0L, this.f12500dovishness);
    }

    @Override // androidx.media3.exoplayer.source.apical
    public void competently(apical.attabal attabalVar, long j) {
        attabalVar.dern(this);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.saneness
    /* JADX INFO: renamed from: cutely, reason: merged with bridge method [inline-methods] */
    public void impromptu(dern dernVar, long j, long j2) {
        this.f12509stratoscope = (int) dernVar.f12511dern.wireman();
        this.f12499cuirassed = (byte[]) decarock.attabal.marial(dernVar.f12513wireman);
        this.f12498cord = true;
        vir.triweekly triweeklyVar = dernVar.f12511dern;
        ethene.kowloon kowloonVar = new ethene.kowloon(dernVar.f12510attabal, dernVar.f12512saneness, triweeklyVar.marial(), triweeklyVar.beachfront(), j, j2, this.f12509stratoscope);
        this.f12506polloi.dern(dernVar.f12510attabal);
        this.f12504molybdenite.apical(kowloonVar, 1, -1, this.f12508rotuma, 0, null, 0L, this.f12500dovishness);
    }

    public void formularize() {
        this.f12501gintrap.formularize();
    }

    @Override // androidx.media3.exoplayer.source.apical, androidx.media3.exoplayer.source.adultoid
    public long getBufferedPositionUs() {
        return this.f12498cord ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.apical, androidx.media3.exoplayer.source.adultoid
    public long getNextLoadPositionUs() {
        return (this.f12498cord || this.f12501gintrap.taiyuan()) ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.apical
    public restrictive getTrackGroups() {
        return this.f12502graveside;
    }

    @Override // androidx.media3.exoplayer.source.apical, androidx.media3.exoplayer.source.adultoid
    public boolean isLoading() {
        return this.f12501gintrap.taiyuan();
    }

    @Override // androidx.media3.exoplayer.source.apical
    public long readDiscontinuity() {
        return C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.apical
    public long saneness(hydromechanics.rotuma[] rotumaVarArr, boolean[] zArr, trm[] trmVarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < rotumaVarArr.length; i++) {
            trm trmVar = trmVarArr[i];
            if (trmVar != null && (rotumaVarArr[i] == null || !zArr[i])) {
                this.f12496adultoid.remove(trmVar);
                trmVarArr[i] = null;
            }
            if (trmVarArr[i] == null && rotumaVarArr[i] != null) {
                saneness sanenessVar = new saneness();
                this.f12496adultoid.add(sanenessVar);
                trmVarArr[i] = sanenessVar;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.apical
    public long seekToUs(long j) {
        for (int i = 0; i < this.f12496adultoid.size(); i++) {
            this.f12496adultoid.get(i).dern();
        }
        return j;
    }

    /* JADX INFO: compiled from: SingleSampleMediaPeriod.java */
    public static final class dern implements Loader.marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final long f12510attabal = ethene.kowloon.attabal();

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final vir.triweekly f12511dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final vir.competently f12512saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public byte[] f12513wireman;

        public dern(vir.competently competentlyVar, androidx.media3.datasource.attabal attabalVar) {
            this.f12512saneness = competentlyVar;
            this.f12511dern = new vir.triweekly(attabalVar);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.marial
        public void load() throws IOException {
            this.f12511dern.competently();
            try {
                this.f12511dern.attabal(this.f12512saneness);
                int i = 0;
                while (i != -1) {
                    int iWireman = (int) this.f12511dern.wireman();
                    byte[] bArr = this.f12513wireman;
                    if (bArr == null) {
                        this.f12513wireman = new byte[1024];
                    } else if (iWireman == bArr.length) {
                        this.f12513wireman = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    vir.triweekly triweeklyVar = this.f12511dern;
                    byte[] bArr2 = this.f12513wireman;
                    i = triweeklyVar.read(bArr2, iWireman, bArr2.length - iWireman);
                }
            } finally {
                vir.beachfront.attabal(this.f12511dern);
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.marial
        public void cancelLoad() {
        }
    }

    @Override // androidx.media3.exoplayer.source.apical
    public void maybeThrowPrepareError() {
    }

    @Override // androidx.media3.exoplayer.source.apical, androidx.media3.exoplayer.source.adultoid
    public void reevaluateBuffer(long j) {
    }

    @Override // androidx.media3.exoplayer.source.apical
    public void discardBuffer(long j, boolean z) {
    }

    @Override // androidx.media3.exoplayer.source.apical
    public long marial(long j, molet moletVar) {
        return j;
    }
}
