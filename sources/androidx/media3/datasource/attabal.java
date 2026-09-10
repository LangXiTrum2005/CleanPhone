package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.taiyuan;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import vir.arytenoidectomy;
import vir.competently;

/* JADX INFO: compiled from: DataSource.java */
/* JADX INFO: loaded from: classes.dex */
public interface attabal extends taiyuan {

    /* JADX INFO: renamed from: androidx.media3.datasource.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DataSource.java */
    public interface InterfaceC0080attabal {
        attabal createDataSource();
    }

    long attabal(competently competentlyVar) throws IOException;

    void close() throws IOException;

    void dern(arytenoidectomy arytenoidectomyVar);

    default Map<String, List<String>> getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    Uri getUri();
}
