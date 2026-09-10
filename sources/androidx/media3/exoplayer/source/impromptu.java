package androidx.media3.exoplayer.source;

import android.net.Uri;
import decarock.stratoscope;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: IcyDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class impromptu implements androidx.media3.datasource.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final androidx.media3.datasource.attabal f12580attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final attabal f12581dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f12582marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f12583saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final byte[] f12584wireman;

    /* JADX INFO: compiled from: IcyDataSource.java */
    public interface attabal {
        void attabal(stratoscope stratoscopeVar);
    }

    public impromptu(androidx.media3.datasource.attabal attabalVar, int i, attabal attabalVar2) {
        decarock.attabal.attabal(i > 0);
        this.f12580attabal = attabalVar;
        this.f12583saneness = i;
        this.f12581dern = attabalVar2;
        this.f12584wireman = new byte[1];
        this.f12582marial = i;
    }

    @Override // androidx.media3.datasource.attabal
    public long attabal(vir.competently competentlyVar) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.attabal
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.attabal
    public void dern(vir.arytenoidectomy arytenoidectomyVar) {
        decarock.attabal.marial(arytenoidectomyVar);
        this.f12580attabal.dern(arytenoidectomyVar);
    }

    @Override // androidx.media3.datasource.attabal
    public Map<String, List<String>> getResponseHeaders() {
        return this.f12580attabal.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.attabal
    public Uri getUri() {
        return this.f12580attabal.getUri();
    }

    @Override // androidx.media3.common.taiyuan
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f12582marial == 0) {
            if (!wireman()) {
                return -1;
            }
            this.f12582marial = this.f12583saneness;
        }
        int i3 = this.f12580attabal.read(bArr, i, Math.min(this.f12582marial, i2));
        if (i3 != -1) {
            this.f12582marial -= i3;
        }
        return i3;
    }

    public final boolean wireman() throws IOException {
        if (this.f12580attabal.read(this.f12584wireman, 0, 1) == -1) {
            return false;
        }
        int i = (this.f12584wireman[0] & 255) << 4;
        if (i == 0) {
            return true;
        }
        byte[] bArr = new byte[i];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int i4 = this.f12580attabal.read(bArr, i3, i2);
            if (i4 == -1) {
                return false;
            }
            i3 += i4;
            i2 -= i4;
        }
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        if (i > 0) {
            this.f12581dern.attabal(new stratoscope(bArr, i));
        }
        return true;
    }
}
