package androidx.media3.datasource;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class DataSourceUtil {
    public static void a(DataSource dataSource) {
        if (dataSource != null) {
            try {
                dataSource.close();
            } catch (IOException unused) {
            }
        }
    }
}
