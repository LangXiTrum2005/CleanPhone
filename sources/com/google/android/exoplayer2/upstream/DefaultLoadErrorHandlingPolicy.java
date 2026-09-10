package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.ParserException;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultLoadErrorHandlingPolicy implements LoadErrorHandlingPolicy {
    @Override // com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy
    public final int a(int i2) {
        return i2 == 7 ? 6 : 3;
    }

    @Override // com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy
    public final long b(LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo) {
        Throwable cause = loadErrorInfo.f18793a;
        if ((cause instanceof ParserException) || (cause instanceof FileNotFoundException) || (cause instanceof HttpDataSource.CleartextNotPermittedException) || (cause instanceof Loader.UnexpectedLoaderException)) {
            return -9223372036854775807L;
        }
        int i2 = DataSourceException.f18740Y;
        while (cause != null) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).X == 2008) {
                return -9223372036854775807L;
            }
            cause = cause.getCause();
        }
        return Math.min((loadErrorInfo.f18794b - 1) * 1000, 5000);
    }
}
