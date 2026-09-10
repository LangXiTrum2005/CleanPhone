package strother;

import androidx.media3.common.ParserException;
import com.google.common.primitives.Ints;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import cybernatic.privatdozent;
import cybernatic.restrictive;
import cybernatic.yemenite;
import decarock.grimness;
import decarock.stratoscope;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: SubtitleExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public class triweekly implements cybernatic.arytenoidectomy {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final polloi f38207attabal;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public privatdozent f38209competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final androidx.media3.common.polloi f38211dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f38212impromptu;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final wireman f38214saneness = new wireman();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public byte[] f38208beachfront = grimness.f25081beachfront;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final stratoscope f38213marial = new stratoscope();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final List<saneness> f38216wireman = new ArrayList();

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public int f38215taiyuan = 0;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public long[] f38210cutely = grimness.f25082competently;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public long f38206apical = C.TIME_UNSET;

    /* JADX INFO: compiled from: SubtitleExtractor.java */
    public static class saneness implements Comparable<saneness> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final byte[] f38217arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final long f38218kowloon;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public int compareTo(saneness sanenessVar) {
            return Long.compare(this.f38218kowloon, sanenessVar.f38218kowloon);
        }

        public saneness(long j, byte[] bArr) {
            this.f38218kowloon = j;
            this.f38217arytenoidectomy = bArr;
        }
    }

    public triweekly(polloi polloiVar, androidx.media3.common.polloi polloiVar2) {
        this.f38207attabal = polloiVar;
        this.f38211dern = polloiVar2.attabal().sensatory("application/x-media3-cues").privatdozent(polloiVar2.f11218triweekly).walach(polloiVar.dern()).polder();
    }

    public static /* synthetic */ void dern(triweekly triweeklyVar, marial marialVar) {
        triweeklyVar.getClass();
        saneness sanenessVar = new saneness(marialVar.f38196saneness, triweeklyVar.f38214saneness.attabal(marialVar.f38194attabal, marialVar.f38195dern));
        triweeklyVar.f38216wireman.add(sanenessVar);
        long j = triweeklyVar.f38206apical;
        if (j == C.TIME_UNSET || marialVar.f38196saneness >= j) {
            triweeklyVar.apical(sanenessVar);
        }
    }

    public final void apical(saneness sanenessVar) {
        decarock.attabal.taiyuan(this.f38209competently);
        int length = sanenessVar.f38217arytenoidectomy.length;
        this.f38213marial.hydrovane(sanenessVar.f38217arytenoidectomy);
        this.f38209competently.saneness(this.f38213marial, length);
        this.f38209competently.wireman(sanenessVar.f38218kowloon, 1, length, 0, null);
    }

    @Override // cybernatic.arytenoidectomy
    public boolean attabal(cybernatic.monoploid monoploidVar) throws IOException {
        return true;
    }

    @Override // cybernatic.arytenoidectomy
    public int beachfront(cybernatic.monoploid monoploidVar, restrictive restrictiveVar) throws IOException {
        int i = this.f38215taiyuan;
        decarock.attabal.competently((i == 0 || i == 5) ? false : true);
        if (this.f38215taiyuan == 1) {
            int iWireman = monoploidVar.getLength() != -1 ? Ints.wireman(monoploidVar.getLength()) : 1024;
            if (iWireman > this.f38208beachfront.length) {
                this.f38208beachfront = new byte[iWireman];
            }
            this.f38212impromptu = 0;
            this.f38215taiyuan = 2;
        }
        if (this.f38215taiyuan == 2 && impromptu(monoploidVar)) {
            competently();
            this.f38215taiyuan = 4;
        }
        if (this.f38215taiyuan == 3 && taiyuan(monoploidVar)) {
            cutely();
            this.f38215taiyuan = 4;
        }
        return this.f38215taiyuan == 4 ? -1 : 0;
    }

    public final void competently() throws IOException {
        try {
            long j = this.f38206apical;
            this.f38207attabal.saneness(this.f38208beachfront, 0, this.f38212impromptu, j != C.TIME_UNSET ? polloi.saneness.dern(j) : polloi.saneness.saneness(), new decarock.impromptu() { // from class: strother.impassible
                @Override // decarock.impromptu
                public final void accept(Object obj) {
                    triweekly.dern(this.f38192attabal, (marial) obj);
                }
            });
            Collections.sort(this.f38216wireman);
            this.f38210cutely = new long[this.f38216wireman.size()];
            for (int i = 0; i < this.f38216wireman.size(); i++) {
                this.f38210cutely[i] = this.f38216wireman.get(i).f38218kowloon;
            }
            this.f38208beachfront = grimness.f25081beachfront;
        } catch (RuntimeException e) {
            throw ParserException.createForMalformedContainer("SubtitleParser failed.", e);
        }
    }

    public final void cutely() {
        long j = this.f38206apical;
        for (int iCompetently = j == C.TIME_UNSET ? 0 : grimness.competently(this.f38210cutely, j, true, true); iCompetently < this.f38216wireman.size(); iCompetently++) {
            apical(this.f38216wireman.get(iCompetently));
        }
    }

    public final boolean impromptu(cybernatic.monoploid monoploidVar) throws IOException {
        byte[] bArr = this.f38208beachfront;
        if (bArr.length == this.f38212impromptu) {
            this.f38208beachfront = Arrays.copyOf(bArr, bArr.length + 1024);
        }
        byte[] bArr2 = this.f38208beachfront;
        int i = this.f38212impromptu;
        int i2 = monoploidVar.read(bArr2, i, bArr2.length - i);
        if (i2 != -1) {
            this.f38212impromptu += i2;
        }
        long length = monoploidVar.getLength();
        return (length != -1 && ((long) this.f38212impromptu) == length) || i2 == -1;
    }

    @Override // cybernatic.arytenoidectomy
    public void marial(cybernatic.polloi polloiVar) {
        decarock.attabal.competently(this.f38215taiyuan == 0);
        privatdozent privatdozentVarTrack = polloiVar.track(0, 3);
        this.f38209competently = privatdozentVarTrack;
        privatdozentVarTrack.dern(this.f38211dern);
        polloiVar.endTracks();
        polloiVar.beachfront(new yemenite(new long[]{0}, new long[]{0}, C.TIME_UNSET));
        this.f38215taiyuan = 1;
    }

    @Override // cybernatic.arytenoidectomy
    public void release() {
        if (this.f38215taiyuan == 5) {
            return;
        }
        this.f38207attabal.reset();
        this.f38215taiyuan = 5;
    }

    @Override // cybernatic.arytenoidectomy
    public void seek(long j, long j2) {
        int i = this.f38215taiyuan;
        decarock.attabal.competently((i == 0 || i == 5) ? false : true);
        this.f38206apical = j2;
        if (this.f38215taiyuan == 2) {
            this.f38215taiyuan = 1;
        }
        if (this.f38215taiyuan == 4) {
            this.f38215taiyuan = 3;
        }
    }

    public final boolean taiyuan(cybernatic.monoploid monoploidVar) throws IOException {
        return monoploidVar.skip((monoploidVar.getLength() > (-1L) ? 1 : (monoploidVar.getLength() == (-1L) ? 0 : -1)) != 0 ? Ints.wireman(monoploidVar.getLength()) : 1024) == -1;
    }
}
