package vir;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: TeeDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class kowloon implements androidx.media3.datasource.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final androidx.media3.datasource.attabal f39573attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f39574dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final wireman f39575saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public long f39576wireman;

    public kowloon(androidx.media3.datasource.attabal attabalVar, wireman wiremanVar) {
        this.f39573attabal = (androidx.media3.datasource.attabal) decarock.attabal.marial(attabalVar);
        this.f39575saneness = (wireman) decarock.attabal.marial(wiremanVar);
    }

    @Override // androidx.media3.datasource.attabal
    public long attabal(competently competentlyVar) throws IOException {
        long jAttabal = this.f39573attabal.attabal(competentlyVar);
        this.f39576wireman = jAttabal;
        if (jAttabal == 0) {
            return 0L;
        }
        if (competentlyVar.f39549impromptu == -1 && jAttabal != -1) {
            competentlyVar = competentlyVar.marial(0L, jAttabal);
        }
        this.f39574dern = true;
        this.f39575saneness.attabal(competentlyVar);
        return this.f39576wireman;
    }

    @Override // androidx.media3.datasource.attabal
    public void close() throws IOException {
        try {
            this.f39573attabal.close();
        } finally {
            if (this.f39574dern) {
                this.f39574dern = false;
                this.f39575saneness.close();
            }
        }
    }

    @Override // androidx.media3.datasource.attabal
    public void dern(arytenoidectomy arytenoidectomyVar) {
        decarock.attabal.marial(arytenoidectomyVar);
        this.f39573attabal.dern(arytenoidectomyVar);
    }

    @Override // androidx.media3.datasource.attabal
    public Map<String, List<String>> getResponseHeaders() {
        return this.f39573attabal.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.attabal
    public Uri getUri() {
        return this.f39573attabal.getUri();
    }

    @Override // androidx.media3.common.taiyuan
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f39576wireman == 0) {
            return -1;
        }
        int i3 = this.f39573attabal.read(bArr, i, i2);
        if (i3 > 0) {
            this.f39575saneness.write(bArr, i, i3);
            long j = this.f39576wireman;
            if (j != -1) {
                this.f39576wireman = j - ((long) i3);
            }
        }
        return i3;
    }
}
