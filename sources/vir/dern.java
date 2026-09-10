package vir;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import decarock.grimness;
import java.io.IOException;
import java.net.URLDecoder;

/* JADX INFO: compiled from: DataSchemeDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class dern extends attabal {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public byte[] f39566beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f39567competently;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f39568impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public competently f39569marial;

    public dern() {
        super(false);
    }

    @Override // androidx.media3.datasource.attabal
    public long attabal(competently competentlyVar) throws IOException {
        beachfront(competentlyVar);
        this.f39569marial = competentlyVar;
        Uri uriNormalizeScheme = competentlyVar.f39544attabal.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        decarock.attabal.saneness("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] strArrOsteal = grimness.osteal(uriNormalizeScheme.getSchemeSpecificPart(), ",");
        if (strArrOsteal.length != 2) {
            throw ParserException.createForMalformedDataOfUnknownType("Unexpected URI format: " + uriNormalizeScheme, null);
        }
        String str = strArrOsteal[1];
        if (strArrOsteal[0].contains(";base64")) {
            try {
                this.f39566beachfront = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw ParserException.createForMalformedDataOfUnknownType("Error while parsing Base64 encoded string: " + str, e);
            }
        } else {
            this.f39566beachfront = grimness.czestochowa(URLDecoder.decode(str, com.google.common.base.dern.f21532attabal.name()));
        }
        long j = competentlyVar.f39546competently;
        byte[] bArr = this.f39566beachfront;
        if (j > bArr.length) {
            this.f39566beachfront = null;
            throw new DataSourceException(2008);
        }
        int i = (int) j;
        this.f39567competently = i;
        int length = bArr.length - i;
        this.f39568impromptu = length;
        long j2 = competentlyVar.f39549impromptu;
        if (j2 != -1) {
            this.f39568impromptu = (int) Math.min(length, j2);
        }
        competently(competentlyVar);
        long j3 = competentlyVar.f39549impromptu;
        return j3 != -1 ? j3 : this.f39568impromptu;
    }

    @Override // androidx.media3.datasource.attabal
    public void close() {
        if (this.f39566beachfront != null) {
            this.f39566beachfront = null;
            marial();
        }
        this.f39569marial = null;
    }

    @Override // androidx.media3.datasource.attabal
    public Uri getUri() {
        competently competentlyVar = this.f39569marial;
        if (competentlyVar != null) {
            return competentlyVar.f39544attabal;
        }
        return null;
    }

    @Override // androidx.media3.common.taiyuan
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f39568impromptu;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        System.arraycopy(grimness.impromptu(this.f39566beachfront), this.f39567competently, bArr, i, iMin);
        this.f39567competently += iMin;
        this.f39568impromptu -= iMin;
        wireman(iMin);
        return iMin;
    }
}
