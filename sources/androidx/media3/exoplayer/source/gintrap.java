package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.oilcan;
import com.google.common.collect.ImmutableList;
import ethene.yemenite;

/* JADX INFO: compiled from: SingleSampleMediaSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class gintrap extends androidx.media3.exoplayer.source.attabal {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final long f12523apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public vir.arytenoidectomy f12524arytenoidectomy;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final androidx.media3.common.polloi f12525cutely;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final androidx.media3.exoplayer.upstream.saneness f12526formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public final boolean f12527impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final vir.competently f12528impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final androidx.media3.common.adultoid f12529kowloon;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final androidx.media3.datasource.attabal.InterfaceC0080attabal f12530taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public final oilcan f12531triweekly;

    /* JADX INFO: compiled from: SingleSampleMediaSource.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final androidx.media3.datasource.attabal.InterfaceC0080attabal f12532attabal;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public String f12534marial;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public Object f12536wireman;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public androidx.media3.exoplayer.upstream.saneness f12535saneness = new androidx.media3.exoplayer.upstream.attabal();

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public boolean f12533dern = true;

        public saneness(androidx.media3.datasource.attabal.InterfaceC0080attabal interfaceC0080attabal) {
            this.f12532attabal = (androidx.media3.datasource.attabal.InterfaceC0080attabal) decarock.attabal.marial(interfaceC0080attabal);
        }

        public gintrap attabal(androidx.media3.common.adultoid.apical apicalVar, long j) {
            return new gintrap(this.f12534marial, apicalVar, this.f12532attabal, j, this.f12535saneness, this.f12533dern, this.f12536wireman);
        }

        public saneness saneness(androidx.media3.exoplayer.upstream.saneness sanenessVar) {
            if (sanenessVar == null) {
                sanenessVar = new androidx.media3.exoplayer.upstream.attabal();
            }
            this.f12535saneness = sanenessVar;
            return this;
        }
    }

    @Override // androidx.media3.exoplayer.source.formularize
    public void beachfront(apical apicalVar) {
        ((dovishness) apicalVar).formularize();
    }

    @Override // androidx.media3.exoplayer.source.formularize
    public androidx.media3.common.adultoid dern() {
        return this.f12529kowloon;
    }

    @Override // androidx.media3.exoplayer.source.formularize
    public apical kowloon(formularize.saneness sanenessVar, polyfoil.saneness sanenessVar2, long j) {
        return new dovishness(this.f12528impromptu, this.f12530taiyuan, this.f12524arytenoidectomy, this.f12525cutely, this.f12523apical, this.f12526formularize, molybdenite(sanenessVar), this.f12527impassible);
    }

    @Override // androidx.media3.exoplayer.source.attabal
    public void rotuma(vir.arytenoidectomy arytenoidectomyVar) {
        this.f12524arytenoidectomy = arytenoidectomyVar;
        preprohormone(this.f12531triweekly);
    }

    public gintrap(String str, androidx.media3.common.adultoid.apical apicalVar, androidx.media3.datasource.attabal.InterfaceC0080attabal interfaceC0080attabal, long j, androidx.media3.exoplayer.upstream.saneness sanenessVar, boolean z, Object obj) {
        this.f12530taiyuan = interfaceC0080attabal;
        this.f12523apical = j;
        this.f12526formularize = sanenessVar;
        this.f12527impassible = z;
        androidx.media3.common.adultoid adultoidVarAttabal = new androidx.media3.common.adultoid.dern().competently(Uri.EMPTY).wireman(apicalVar.f10628attabal.toString()).marial(ImmutableList.of(apicalVar)).beachfront(obj).attabal();
        this.f12529kowloon = adultoidVarAttabal;
        androidx.media3.common.polloi.saneness sanenessVarTimberyard = new androidx.media3.common.polloi.saneness().sensatory((String) com.google.common.base.competently.attabal(apicalVar.f10633saneness, "text/x-unknown")).treadless(apicalVar.f10631dern).preterite(apicalVar.f10634wireman).coi(apicalVar.f10632marial).timberyard(apicalVar.f10629beachfront);
        String str2 = apicalVar.f10630competently;
        this.f12525cutely = sanenessVarTimberyard.cultivated(str2 != null ? str2 : str).polder();
        this.f12528impromptu = new vir.competently.saneness().taiyuan(apicalVar.f10628attabal).saneness(1).attabal();
        this.f12531triweekly = new yemenite(j, true, false, false, null, adultoidVarAttabal);
    }

    @Override // androidx.media3.exoplayer.source.attabal
    public void cord() {
    }

    @Override // androidx.media3.exoplayer.source.formularize
    public void maybeThrowSourceInfoRefreshError() {
    }
}
