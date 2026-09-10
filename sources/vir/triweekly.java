package vir;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: StatsDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class triweekly implements androidx.media3.datasource.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final androidx.media3.datasource.attabal f39583attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public long f39585saneness;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public Uri f39584dern = Uri.EMPTY;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public Map<String, List<String>> f39586wireman = Collections.EMPTY_MAP;

    public triweekly(androidx.media3.datasource.attabal attabalVar) {
        this.f39583attabal = (androidx.media3.datasource.attabal) decarock.attabal.marial(attabalVar);
    }

    @Override // androidx.media3.datasource.attabal
    public long attabal(competently competentlyVar) throws IOException {
        this.f39584dern = competentlyVar.f39544attabal;
        this.f39586wireman = Collections.EMPTY_MAP;
        long jAttabal = this.f39583attabal.attabal(competentlyVar);
        this.f39584dern = (Uri) decarock.attabal.marial(getUri());
        this.f39586wireman = getResponseHeaders();
        return jAttabal;
    }

    public Map<String, List<String>> beachfront() {
        return this.f39586wireman;
    }

    @Override // androidx.media3.datasource.attabal
    public void close() throws IOException {
        this.f39583attabal.close();
    }

    public void competently() {
        this.f39585saneness = 0L;
    }

    @Override // androidx.media3.datasource.attabal
    public void dern(arytenoidectomy arytenoidectomyVar) {
        decarock.attabal.marial(arytenoidectomyVar);
        this.f39583attabal.dern(arytenoidectomyVar);
    }

    @Override // androidx.media3.datasource.attabal
    public Map<String, List<String>> getResponseHeaders() {
        return this.f39583attabal.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.attabal
    public Uri getUri() {
        return this.f39583attabal.getUri();
    }

    public Uri marial() {
        return this.f39584dern;
    }

    @Override // androidx.media3.common.taiyuan
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f39583attabal.read(bArr, i, i2);
        if (i3 != -1) {
            this.f39585saneness += (long) i3;
        }
        return i3;
    }

    public long wireman() {
        return this.f39585saneness;
    }
}
