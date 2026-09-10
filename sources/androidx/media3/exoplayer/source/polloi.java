package androidx.media3.exoplayer.source;

import android.os.Looper;
import androidx.media3.common.oilcan;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import decarock.grimness;
import ethene.yemenite;
import incorrectly.ctenidium;

/* JADX INFO: compiled from: ProgressiveMediaSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class polloi extends androidx.media3.exoplayer.source.attabal implements monoploid.dern {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final androidx.media3.exoplayer.upstream.saneness f12673apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public boolean f12674arytenoidectomy;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final androidx.media3.exoplayer.drm.dern f12675cutely;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final int f12676formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public boolean f12677impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final androidx.media3.datasource.attabal.InterfaceC0080attabal f12678impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public boolean f12679kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public vir.arytenoidectomy f12680monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public androidx.media3.common.adultoid f12681polloi;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final arytenoidectomy.attabal f12682taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public long f12683triweekly;

    /* JADX INFO: compiled from: ProgressiveMediaSource.java */
    public class attabal extends ethene.triweekly {
        public attabal(oilcan oilcanVar) {
            super(oilcanVar);
        }

        @Override // ethene.triweekly, androidx.media3.common.oilcan
        public oilcan.saneness competently(int i, oilcan.saneness sanenessVar, boolean z) {
            super.competently(i, sanenessVar, z);
            sanenessVar.f11135beachfront = true;
            return sanenessVar;
        }

        @Override // ethene.triweekly, androidx.media3.common.oilcan
        public oilcan.dern kowloon(int i, oilcan.dern dernVar, long j) {
            super.kowloon(i, dernVar, j);
            dernVar.f11113apical = true;
            return dernVar;
        }
    }

    /* JADX INFO: compiled from: ProgressiveMediaSource.java */
    public static final class saneness implements triweekly {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public androidx.media3.exoplayer.upstream.saneness f12685beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public int f12686competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final androidx.media3.datasource.attabal.InterfaceC0080attabal f12687dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public puffin.monoploid f12688marial;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public arytenoidectomy.attabal f12689wireman;

        public saneness(androidx.media3.datasource.attabal.InterfaceC0080attabal interfaceC0080attabal, final cybernatic.adultoid adultoidVar) {
            this(interfaceC0080attabal, new arytenoidectomy.attabal() { // from class: ethene.cuirassed
                @Override // androidx.media3.exoplayer.source.arytenoidectomy.attabal
                public final androidx.media3.exoplayer.source.arytenoidectomy attabal(ctenidium ctenidiumVar) {
                    return androidx.media3.exoplayer.source.polloi.saneness.competently(adultoidVar, ctenidiumVar);
                }
            });
        }

        public static /* synthetic */ arytenoidectomy competently(cybernatic.adultoid adultoidVar, ctenidium ctenidiumVar) {
            return new ethene.saneness(adultoidVar);
        }

        @Override // androidx.media3.exoplayer.source.formularize.attabal
        /* JADX INFO: renamed from: cutely, reason: merged with bridge method [inline-methods] */
        public saneness marial(androidx.media3.exoplayer.upstream.saneness sanenessVar) {
            this.f12685beachfront = (androidx.media3.exoplayer.upstream.saneness) decarock.attabal.beachfront(sanenessVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // androidx.media3.exoplayer.source.formularize.attabal
        /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
        public polloi saneness(androidx.media3.common.adultoid adultoidVar) {
            decarock.attabal.marial(adultoidVar.f10619saneness);
            return new polloi(adultoidVar, this.f12687dern, this.f12689wireman, this.f12688marial.attabal(adultoidVar), this.f12685beachfront, this.f12686competently, null);
        }

        @Override // androidx.media3.exoplayer.source.formularize.attabal
        /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
        public saneness wireman(puffin.monoploid monoploidVar) {
            this.f12688marial = (puffin.monoploid) decarock.attabal.beachfront(monoploidVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public saneness(androidx.media3.datasource.attabal.InterfaceC0080attabal interfaceC0080attabal, arytenoidectomy.attabal attabalVar) {
            this(interfaceC0080attabal, attabalVar, new androidx.media3.exoplayer.drm.attabal(), new androidx.media3.exoplayer.upstream.attabal(), ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        }

        public saneness(androidx.media3.datasource.attabal.InterfaceC0080attabal interfaceC0080attabal, arytenoidectomy.attabal attabalVar, puffin.monoploid monoploidVar, androidx.media3.exoplayer.upstream.saneness sanenessVar, int i) {
            this.f12687dern = interfaceC0080attabal;
            this.f12689wireman = attabalVar;
            this.f12688marial = monoploidVar;
            this.f12685beachfront = sanenessVar;
            this.f12686competently = i;
        }
    }

    public /* synthetic */ polloi(androidx.media3.common.adultoid adultoidVar, androidx.media3.datasource.attabal.InterfaceC0080attabal interfaceC0080attabal, arytenoidectomy.attabal attabalVar, androidx.media3.exoplayer.drm.dern dernVar, androidx.media3.exoplayer.upstream.saneness sanenessVar, int i, attabal attabalVar2) {
        this(adultoidVar, interfaceC0080attabal, attabalVar, dernVar, sanenessVar, i);
    }

    @Override // androidx.media3.exoplayer.source.monoploid.dern
    public void apical(long j, boolean z, boolean z2) {
        if (j == C.TIME_UNSET) {
            j = this.f12683triweekly;
        }
        if (!this.f12677impassible && this.f12683triweekly == j && this.f12679kowloon == z && this.f12674arytenoidectomy == z2) {
            return;
        }
        this.f12683triweekly = j;
        this.f12679kowloon = z;
        this.f12674arytenoidectomy = z2;
        this.f12677impassible = false;
        stratoscope();
    }

    @Override // androidx.media3.exoplayer.source.formularize
    public void beachfront(apical apicalVar) {
        ((monoploid) apicalVar).hydrovane();
    }

    @Override // androidx.media3.exoplayer.source.attabal
    public void cord() {
        this.f12675cutely.release();
    }

    public final androidx.media3.common.adultoid.impromptu cuirassed() {
        return (androidx.media3.common.adultoid.impromptu) decarock.attabal.marial(dern().f10619saneness);
    }

    @Override // androidx.media3.exoplayer.source.formularize
    public synchronized androidx.media3.common.adultoid dern() {
        return this.f12681polloi;
    }

    @Override // androidx.media3.exoplayer.source.formularize
    public synchronized void impromptu(androidx.media3.common.adultoid adultoidVar) {
        this.f12681polloi = adultoidVar;
    }

    @Override // androidx.media3.exoplayer.source.formularize
    public apical kowloon(formularize.saneness sanenessVar, polyfoil.saneness sanenessVar2, long j) {
        androidx.media3.datasource.attabal attabalVarCreateDataSource = this.f12678impromptu.createDataSource();
        vir.arytenoidectomy arytenoidectomyVar = this.f12680monoploid;
        if (arytenoidectomyVar != null) {
            attabalVarCreateDataSource.dern(arytenoidectomyVar);
        }
        androidx.media3.common.adultoid.impromptu impromptuVarCuirassed = cuirassed();
        return new monoploid(impromptuVarCuirassed.f10706attabal, attabalVarCreateDataSource, this.f12682taiyuan.attabal(dovishness()), this.f12675cutely, monoploid(sanenessVar), this.f12673apical, molybdenite(sanenessVar), this, sanenessVar2, impromptuVarCuirassed.f10711marial, this.f12676formularize, grimness.outmarry(impromptuVarCuirassed.f10713taiyuan));
    }

    @Override // androidx.media3.exoplayer.source.attabal
    public void rotuma(vir.arytenoidectomy arytenoidectomyVar) {
        this.f12680monoploid = arytenoidectomyVar;
        this.f12675cutely.saneness((Looper) decarock.attabal.marial(Looper.myLooper()), dovishness());
        this.f12675cutely.attabal();
        stratoscope();
    }

    public final void stratoscope() {
        oilcan yemeniteVar = new yemenite(this.f12683triweekly, this.f12679kowloon, false, this.f12674arytenoidectomy, null, dern());
        if (this.f12677impassible) {
            yemeniteVar = new attabal(yemeniteVar);
        }
        preprohormone(yemeniteVar);
    }

    public polloi(androidx.media3.common.adultoid adultoidVar, androidx.media3.datasource.attabal.InterfaceC0080attabal interfaceC0080attabal, arytenoidectomy.attabal attabalVar, androidx.media3.exoplayer.drm.dern dernVar, androidx.media3.exoplayer.upstream.saneness sanenessVar, int i) {
        this.f12681polloi = adultoidVar;
        this.f12678impromptu = interfaceC0080attabal;
        this.f12682taiyuan = attabalVar;
        this.f12675cutely = dernVar;
        this.f12673apical = sanenessVar;
        this.f12676formularize = i;
        this.f12677impassible = true;
        this.f12683triweekly = C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.formularize
    public void maybeThrowSourceInfoRefreshError() {
    }
}
