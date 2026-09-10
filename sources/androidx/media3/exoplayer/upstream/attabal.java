package androidx.media3.exoplayer.upstream;

import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: DefaultLoadErrorHandlingPolicy.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal implements saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f12798attabal;

    public attabal() {
        this(-1);
    }

    @Override // androidx.media3.exoplayer.upstream.saneness
    public long attabal(saneness.attabal attabalVar) {
        IOException iOException = attabalVar.f12800dern;
        return ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader.UnexpectedLoaderException) || DataSourceException.isCausedByPositionOutOfRange(iOException)) ? C.TIME_UNSET : Math.min((attabalVar.f12802wireman - 1) * 1000, 5000);
    }

    @Override // androidx.media3.exoplayer.upstream.saneness
    public int saneness(int i) {
        int i2 = this.f12798attabal;
        if (i2 == -1) {
            return i == 7 ? 6 : 3;
        }
        return i2;
    }

    public attabal(int i) {
        this.f12798attabal = i;
    }
}
