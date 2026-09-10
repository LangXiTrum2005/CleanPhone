package livable;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import cybernatic.arytenoidectomy;
import cybernatic.merc;
import cybernatic.monoploid;
import cybernatic.polloi;
import cybernatic.restrictive;
import decarock.stratoscope;
import java.io.IOException;
import nattier.impassible;

/* JADX INFO: compiled from: JpegMotionPhotoExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness implements arytenoidectomy {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final stratoscope f33104attabal = new stratoscope(6);

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public long f33105beachfront = -1;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public MotionPhotoMetadata f33106competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public impassible f33107cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f33108dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public monoploid f33109impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f33110marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public polloi f33111saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public wireman f33112taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f33113wireman;

    private void formularize(monoploid monoploidVar) throws IOException {
        String strStratoscope;
        if (this.f33113wireman == 65505) {
            stratoscope stratoscopeVar = new stratoscope(this.f33110marial);
            monoploidVar.readFully(stratoscopeVar.marial(), 0, this.f33110marial);
            if (this.f33106competently == null && "http://ns.adobe.com/xap/1.0/".equals(stratoscopeVar.stratoscope()) && (strStratoscope = stratoscopeVar.stratoscope()) != null) {
                MotionPhotoMetadata motionPhotoMetadataImpromptu = impromptu(strStratoscope, monoploidVar.getLength());
                this.f33106competently = motionPhotoMetadataImpromptu;
                if (motionPhotoMetadataImpromptu != null) {
                    this.f33105beachfront = motionPhotoMetadataImpromptu.f13092polloi;
                }
            }
        } else {
            monoploidVar.skipFully(this.f33110marial);
        }
        this.f33108dern = 0;
    }

    public static MotionPhotoMetadata impromptu(String str, long j) throws IOException {
        dern dernVarAttabal;
        if (j == -1 || (dernVarAttabal = beachfront.attabal(str)) == null) {
            return null;
        }
        return dernVarAttabal.attabal(j);
    }

    public final void apical(monoploid monoploidVar) throws IOException {
        this.f33104attabal.starveling(2);
        monoploidVar.readFully(this.f33104attabal.marial(), 0, 2);
        int iSaran = this.f33104attabal.saran();
        this.f33113wireman = iSaran;
        if (iSaran == 65498) {
            if (this.f33105beachfront != -1) {
                this.f33108dern = 4;
                return;
            } else {
                competently();
                return;
            }
        }
        if ((iSaran < 65488 || iSaran > 65497) && iSaran != 65281) {
            this.f33108dern = 1;
        }
    }

    @Override // cybernatic.arytenoidectomy
    public boolean attabal(monoploid monoploidVar) throws IOException {
        if (cutely(monoploidVar) != 65496) {
            return false;
        }
        int iCutely = cutely(monoploidVar);
        this.f33113wireman = iCutely;
        if (iCutely == 65504) {
            dern(monoploidVar);
            this.f33113wireman = cutely(monoploidVar);
        }
        if (this.f33113wireman != 65505) {
            return false;
        }
        monoploidVar.advancePeekPosition(2);
        this.f33104attabal.starveling(6);
        monoploidVar.peekFully(this.f33104attabal.marial(), 0, 6);
        return this.f33104attabal.merc() == 1165519206 && this.f33104attabal.saran() == 0;
    }

    @Override // cybernatic.arytenoidectomy
    public int beachfront(monoploid monoploidVar, restrictive restrictiveVar) throws IOException {
        int i = this.f33108dern;
        if (i == 0) {
            apical(monoploidVar);
            return 0;
        }
        if (i == 1) {
            impassible(monoploidVar);
            return 0;
        }
        if (i == 2) {
            formularize(monoploidVar);
            return 0;
        }
        if (i == 4) {
            long position = monoploidVar.getPosition();
            long j = this.f33105beachfront;
            if (position != j) {
                restrictiveVar.f24743attabal = j;
                return 1;
            }
            triweekly(monoploidVar);
            return 0;
        }
        if (i != 5) {
            if (i == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f33112taiyuan == null || monoploidVar != this.f33109impromptu) {
            this.f33109impromptu = monoploidVar;
            this.f33112taiyuan = new wireman(monoploidVar, this.f33105beachfront);
        }
        int iBeachfront = ((impassible) decarock.attabal.marial(this.f33107cutely)).beachfront(this.f33112taiyuan, restrictiveVar);
        if (iBeachfront == 1) {
            restrictiveVar.f24743attabal += this.f33105beachfront;
        }
        return iBeachfront;
    }

    public final void competently() {
        ((polloi) decarock.attabal.marial(this.f33111saneness)).endTracks();
        this.f33111saneness.beachfront(new merc.saneness(C.TIME_UNSET));
        this.f33108dern = 6;
    }

    public final int cutely(monoploid monoploidVar) throws IOException {
        this.f33104attabal.starveling(2);
        monoploidVar.peekFully(this.f33104attabal.marial(), 0, 2);
        return this.f33104attabal.saran();
    }

    public final void dern(monoploid monoploidVar) throws IOException {
        this.f33104attabal.starveling(2);
        monoploidVar.peekFully(this.f33104attabal.marial(), 0, 2);
        monoploidVar.advancePeekPosition(this.f33104attabal.saran() - 2);
    }

    public final void impassible(monoploid monoploidVar) throws IOException {
        this.f33104attabal.starveling(2);
        monoploidVar.readFully(this.f33104attabal.marial(), 0, 2);
        this.f33110marial = this.f33104attabal.saran() - 2;
        this.f33108dern = 2;
    }

    public final void kowloon() {
        taiyuan((MotionPhotoMetadata) decarock.attabal.marial(this.f33106competently));
        this.f33108dern = 5;
    }

    @Override // cybernatic.arytenoidectomy
    public void marial(polloi polloiVar) {
        this.f33111saneness = polloiVar;
    }

    @Override // cybernatic.arytenoidectomy
    public void release() {
        impassible impassibleVar = this.f33107cutely;
        if (impassibleVar != null) {
            impassibleVar.release();
        }
    }

    @Override // cybernatic.arytenoidectomy
    public void seek(long j, long j2) {
        if (j == 0) {
            this.f33108dern = 0;
            this.f33107cutely = null;
        } else if (this.f33108dern == 5) {
            ((impassible) decarock.attabal.marial(this.f33107cutely)).seek(j, j2);
        }
    }

    public final void taiyuan(MotionPhotoMetadata motionPhotoMetadata) {
        ((polloi) decarock.attabal.marial(this.f33111saneness)).track(1024, 4).dern(new androidx.media3.common.polloi.saneness().starveling("image/jpeg").lerp(new Metadata(motionPhotoMetadata)).polder());
    }

    public final void triweekly(monoploid monoploidVar) throws IOException {
        if (!monoploidVar.peekFully(this.f33104attabal.marial(), 0, 1, true)) {
            competently();
            return;
        }
        monoploidVar.resetPeekPosition();
        if (this.f33107cutely == null) {
            this.f33107cutely = new impassible(strother.polloi.attabal.f38202attabal, 8);
        }
        wireman wiremanVar = new wireman(monoploidVar, this.f33105beachfront);
        this.f33112taiyuan = wiremanVar;
        if (!this.f33107cutely.attabal(wiremanVar)) {
            competently();
        } else {
            this.f33107cutely.marial(new marial(this.f33105beachfront, (polloi) decarock.attabal.marial(this.f33111saneness)));
            kowloon();
        }
    }
}
