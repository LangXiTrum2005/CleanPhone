package androidx.media3.exoplayer.upstream;

import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes.dex */
public class DefaultLoadErrorHandlingPolicy implements LoadErrorHandlingPolicy {
    @Override // androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy
    public final int a(int i2) {
        return i2 == 7 ? 6 : 3;
    }

    @Override // androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy
    public final long b(LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo) {
        Throwable cause = loadErrorInfo.f6574a;
        if ((cause instanceof ParserException) || (cause instanceof FileNotFoundException) || (cause instanceof HttpDataSource.CleartextNotPermittedException) || (cause instanceof Loader.UnexpectedLoaderException)) {
            return -9223372036854775807L;
        }
        int i2 = DataSourceException.f5734Y;
        while (cause != null) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).X == 2008) {
                return -9223372036854775807L;
            }
            cause = cause.getCause();
        }
        return Math.min((loadErrorInfo.f6575b - 1) * 1000, 5000);
    }
}
