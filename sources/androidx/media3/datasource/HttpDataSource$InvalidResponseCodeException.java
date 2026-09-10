package androidx.media3.datasource;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import vir.competently;

/* JADX INFO: loaded from: classes.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {
    public final Map<String, List<String>> headerFields;
    public final byte[] responseBody;
    public final int responseCode;
    public final String responseMessage;

    public HttpDataSource$InvalidResponseCodeException(int i, String str, IOException iOException, Map<String, List<String>> map, competently competentlyVar, byte[] bArr) {
        super("Response code: " + i, iOException, competentlyVar, 2004, 1);
        this.responseCode = i;
        this.responseMessage = str;
        this.headerFields = map;
        this.responseBody = bArr;
    }
}
