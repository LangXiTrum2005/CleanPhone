package androidx.media3.exoplayer.offline;

import android.util.SparseArray;
import androidx.media3.common.MediaItem;
import androidx.media3.datasource.cache.CacheDataSource;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class DefaultDownloaderFactory implements DownloaderFactory {
    static {
        SparseArray sparseArray = new SparseArray();
        try {
            sparseArray.put(0, a(Class.forName("androidx.media3.exoplayer.dash.offline.DashDownloader")));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, a(Class.forName("androidx.media3.exoplayer.hls.offline.HlsDownloader")));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, a(Class.forName("androidx.media3.exoplayer.smoothstreaming.offline.SsDownloader")));
        } catch (ClassNotFoundException unused3) {
        }
    }

    public static Constructor a(Class cls) {
        try {
            return cls.asSubclass(Downloader.class).getConstructor(MediaItem.class, CacheDataSource.Factory.class, Executor.class);
        } catch (NoSuchMethodException e2) {
            throw new IllegalStateException("Downloader constructor missing", e2);
        }
    }
}
