package androidx.media3.datasource;

import android.content.Context;
import android.net.Uri;
import decarock.grimness;
import decarock.triweekly;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import vir.arytenoidectomy;
import vir.competently;

/* JADX INFO: compiled from: DefaultDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness implements androidx.media3.datasource.attabal {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public androidx.media3.datasource.attabal f11460apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f11461attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public androidx.media3.datasource.attabal f11462beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public androidx.media3.datasource.attabal f11463competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public androidx.media3.datasource.attabal f11464cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final androidx.media3.datasource.attabal f11465dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public androidx.media3.datasource.attabal f11466impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public androidx.media3.datasource.attabal f11467marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final List<arytenoidectomy> f11468saneness = new ArrayList();

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public androidx.media3.datasource.attabal f11469taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public androidx.media3.datasource.attabal f11470wireman;

    /* JADX INFO: compiled from: DefaultDataSource.java */
    public static final class attabal implements androidx.media3.datasource.attabal.InterfaceC0080attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Context f11471attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public arytenoidectomy f11472dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final androidx.media3.datasource.attabal.InterfaceC0080attabal f11473saneness;

        public attabal(Context context) {
            this(context, new dern.saneness());
        }

        @Override // androidx.media3.datasource.attabal.InterfaceC0080attabal
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public saneness createDataSource() {
            saneness sanenessVar = new saneness(this.f11471attabal, this.f11473saneness.createDataSource());
            arytenoidectomy arytenoidectomyVar = this.f11472dern;
            if (arytenoidectomyVar != null) {
                sanenessVar.dern(arytenoidectomyVar);
            }
            return sanenessVar;
        }

        public attabal(Context context, androidx.media3.datasource.attabal.InterfaceC0080attabal interfaceC0080attabal) {
            this.f11471attabal = context.getApplicationContext();
            this.f11473saneness = interfaceC0080attabal;
        }
    }

    public saneness(Context context, androidx.media3.datasource.attabal attabalVar) {
        this.f11461attabal = context.getApplicationContext();
        this.f11465dern = (androidx.media3.datasource.attabal) decarock.attabal.marial(attabalVar);
    }

    public final androidx.media3.datasource.attabal apical() {
        if (this.f11466impromptu == null) {
            UdpDataSource udpDataSource = new UdpDataSource();
            this.f11466impromptu = udpDataSource;
            wireman(udpDataSource);
        }
        return this.f11466impromptu;
    }

    @Override // androidx.media3.datasource.attabal
    public long attabal(competently competentlyVar) throws IOException {
        decarock.attabal.competently(this.f11460apical == null);
        String scheme = competentlyVar.f39544attabal.getScheme();
        if (grimness.achondroplasia(competentlyVar.f39544attabal)) {
            String path = competentlyVar.f39544attabal.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f11460apical = impromptu();
            } else {
                this.f11460apical = marial();
            }
        } else if ("asset".equals(scheme)) {
            this.f11460apical = marial();
        } else if ("content".equals(scheme)) {
            this.f11460apical = beachfront();
        } else if ("rtmp".equals(scheme)) {
            this.f11460apical = cutely();
        } else if ("udp".equals(scheme)) {
            this.f11460apical = apical();
        } else if ("data".equals(scheme)) {
            this.f11460apical = competently();
        } else if (com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource.RAW_RESOURCE_SCHEME.equals(scheme) || "android.resource".equals(scheme)) {
            this.f11460apical = taiyuan();
        } else {
            this.f11460apical = this.f11465dern;
        }
        return this.f11460apical.attabal(competentlyVar);
    }

    public final androidx.media3.datasource.attabal beachfront() {
        if (this.f11462beachfront == null) {
            ContentDataSource contentDataSource = new ContentDataSource(this.f11461attabal);
            this.f11462beachfront = contentDataSource;
            wireman(contentDataSource);
        }
        return this.f11462beachfront;
    }

    @Override // androidx.media3.datasource.attabal
    public void close() throws IOException {
        androidx.media3.datasource.attabal attabalVar = this.f11460apical;
        if (attabalVar != null) {
            try {
                attabalVar.close();
            } finally {
                this.f11460apical = null;
            }
        }
    }

    public final androidx.media3.datasource.attabal competently() {
        if (this.f11469taiyuan == null) {
            vir.dern dernVar = new vir.dern();
            this.f11469taiyuan = dernVar;
            wireman(dernVar);
        }
        return this.f11469taiyuan;
    }

    public final androidx.media3.datasource.attabal cutely() {
        if (this.f11463competently == null) {
            try {
                androidx.media3.datasource.attabal attabalVar = (androidx.media3.datasource.attabal) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.f11463competently = attabalVar;
                wireman(attabalVar);
            } catch (ClassNotFoundException unused) {
                triweekly.impromptu("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.f11463competently == null) {
                this.f11463competently = this.f11465dern;
            }
        }
        return this.f11463competently;
    }

    @Override // androidx.media3.datasource.attabal
    public void dern(arytenoidectomy arytenoidectomyVar) {
        decarock.attabal.marial(arytenoidectomyVar);
        this.f11465dern.dern(arytenoidectomyVar);
        this.f11468saneness.add(arytenoidectomyVar);
        formularize(this.f11470wireman, arytenoidectomyVar);
        formularize(this.f11467marial, arytenoidectomyVar);
        formularize(this.f11462beachfront, arytenoidectomyVar);
        formularize(this.f11463competently, arytenoidectomyVar);
        formularize(this.f11466impromptu, arytenoidectomyVar);
        formularize(this.f11469taiyuan, arytenoidectomyVar);
        formularize(this.f11464cutely, arytenoidectomyVar);
    }

    public final void formularize(androidx.media3.datasource.attabal attabalVar, arytenoidectomy arytenoidectomyVar) {
        if (attabalVar != null) {
            attabalVar.dern(arytenoidectomyVar);
        }
    }

    @Override // androidx.media3.datasource.attabal
    public Map<String, List<String>> getResponseHeaders() {
        androidx.media3.datasource.attabal attabalVar = this.f11460apical;
        return attabalVar == null ? Collections.EMPTY_MAP : attabalVar.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.attabal
    public Uri getUri() {
        androidx.media3.datasource.attabal attabalVar = this.f11460apical;
        if (attabalVar == null) {
            return null;
        }
        return attabalVar.getUri();
    }

    public final androidx.media3.datasource.attabal impromptu() {
        if (this.f11470wireman == null) {
            FileDataSource fileDataSource = new FileDataSource();
            this.f11470wireman = fileDataSource;
            wireman(fileDataSource);
        }
        return this.f11470wireman;
    }

    public final androidx.media3.datasource.attabal marial() {
        if (this.f11467marial == null) {
            AssetDataSource assetDataSource = new AssetDataSource(this.f11461attabal);
            this.f11467marial = assetDataSource;
            wireman(assetDataSource);
        }
        return this.f11467marial;
    }

    @Override // androidx.media3.common.taiyuan
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return ((androidx.media3.datasource.attabal) decarock.attabal.marial(this.f11460apical)).read(bArr, i, i2);
    }

    public final androidx.media3.datasource.attabal taiyuan() {
        if (this.f11464cutely == null) {
            RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.f11461attabal);
            this.f11464cutely = rawResourceDataSource;
            wireman(rawResourceDataSource);
        }
        return this.f11464cutely;
    }

    public final void wireman(androidx.media3.datasource.attabal attabalVar) {
        for (int i = 0; i < this.f11468saneness.size(); i++) {
            attabalVar.dern(this.f11468saneness.get(i));
        }
    }
}
