package androidx.media3.datasource;

import java.io.IOException;
import vir.competently;

/* JADX INFO: loaded from: classes.dex */
public final class HttpEngineDataSource$OpenException extends HttpDataSource$HttpDataSourceException {
    public final int httpEngineConnectionStatus;

    public HttpEngineDataSource$OpenException(IOException iOException, competently competentlyVar, int i, int i2) {
        super(iOException, competentlyVar, i, 1);
        this.httpEngineConnectionStatus = i2;
    }

    public HttpEngineDataSource$OpenException(String str, competently competentlyVar, int i, int i2) {
        super(str, competentlyVar, i, 1);
        this.httpEngineConnectionStatus = i2;
    }

    public HttpEngineDataSource$OpenException(competently competentlyVar, int i, int i2) {
        super(competentlyVar, i, 1);
        this.httpEngineConnectionStatus = i2;
    }
}
