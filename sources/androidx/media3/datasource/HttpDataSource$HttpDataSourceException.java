package androidx.media3.datasource;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import vir.competently;

/* JADX INFO: loaded from: classes.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {
    public static final int TYPE_CLOSE = 3;
    public static final int TYPE_OPEN = 1;
    public static final int TYPE_READ = 2;
    public final competently dataSpec;
    public final int type;

    @Deprecated
    public HttpDataSource$HttpDataSourceException(competently competentlyVar, int i) {
        this(competentlyVar, 2000, i);
    }

    public static int attabal(int i, int i2) {
        if (i == 2000 && i2 == 1) {
            return 2001;
        }
        return i;
    }

    public static HttpDataSource$HttpDataSourceException createForIOException(final IOException iOException, final competently competentlyVar, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else {
            i2 = (message == null || !com.google.common.base.attabal.beachfront(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i2 == 2007 ? new HttpDataSource$HttpDataSourceException(iOException, competentlyVar) { // from class: androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException
        } : new HttpDataSource$HttpDataSourceException(iOException, competentlyVar, i2, i);
    }

    public HttpDataSource$HttpDataSourceException(competently competentlyVar, int i, int i2) {
        super(attabal(i, i2));
        this.dataSpec = competentlyVar;
        this.type = i2;
    }

    @Deprecated
    public HttpDataSource$HttpDataSourceException(String str, competently competentlyVar, int i) {
        this(str, competentlyVar, 2000, i);
    }

    public HttpDataSource$HttpDataSourceException(String str, competently competentlyVar, int i, int i2) {
        super(str, attabal(i, i2));
        this.dataSpec = competentlyVar;
        this.type = i2;
    }

    @Deprecated
    public HttpDataSource$HttpDataSourceException(IOException iOException, competently competentlyVar, int i) {
        this(iOException, competentlyVar, 2000, i);
    }

    public HttpDataSource$HttpDataSourceException(IOException iOException, competently competentlyVar, int i, int i2) {
        super(iOException, attabal(i, i2));
        this.dataSpec = competentlyVar;
        this.type = i2;
    }

    @Deprecated
    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, competently competentlyVar, int i) {
        this(str, iOException, competentlyVar, 2000, i);
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, competently competentlyVar, int i, int i2) {
        super(str, iOException, attabal(i, i2));
        this.dataSpec = competentlyVar;
        this.type = i2;
    }
}
