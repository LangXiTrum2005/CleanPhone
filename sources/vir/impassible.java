package vir;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PriorityDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class impassible implements androidx.media3.datasource.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final androidx.media3.datasource.attabal f39570attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f39571dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final PriorityTaskManager f39572saneness;

    public impassible(androidx.media3.datasource.attabal attabalVar, PriorityTaskManager priorityTaskManager, int i) {
        this.f39570attabal = (androidx.media3.datasource.attabal) decarock.attabal.marial(attabalVar);
        this.f39572saneness = (PriorityTaskManager) decarock.attabal.marial(priorityTaskManager);
        this.f39571dern = i;
    }

    @Override // androidx.media3.datasource.attabal
    public long attabal(competently competentlyVar) throws IOException {
        this.f39572saneness.saneness(this.f39571dern);
        return this.f39570attabal.attabal(competentlyVar);
    }

    @Override // androidx.media3.datasource.attabal
    public void close() throws IOException {
        this.f39570attabal.close();
    }

    @Override // androidx.media3.datasource.attabal
    public void dern(arytenoidectomy arytenoidectomyVar) {
        decarock.attabal.marial(arytenoidectomyVar);
        this.f39570attabal.dern(arytenoidectomyVar);
    }

    @Override // androidx.media3.datasource.attabal
    public Map<String, List<String>> getResponseHeaders() {
        return this.f39570attabal.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.attabal
    public Uri getUri() {
        return this.f39570attabal.getUri();
    }

    @Override // androidx.media3.common.taiyuan
    public int read(byte[] bArr, int i, int i2) throws IOException {
        this.f39572saneness.saneness(this.f39571dern);
        return this.f39570attabal.read(bArr, i, i2);
    }
}
