package androidx.media3.datasource.cache;

import android.net.Uri;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class CacheDataSource implements DataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Uri f5789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DataSpec f5790b;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface CacheIgnoredReason {
    }

    public interface EventListener {
    }

    public static final class Factory implements DataSource.Factory {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @Override // androidx.media3.datasource.DataSource
    public final void a(TransferListener transferListener) {
        transferListener.getClass();
        throw null;
    }

    @Override // androidx.media3.datasource.DataSource
    public final long b(DataSpec dataSpec) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        throw null;
     */
    @Override // androidx.media3.datasource.DataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            r1 = this;
            r0 = 0
            r1.f5790b = r0
            r1.f5789a = r0
            throw r0     // Catch: java.lang.Throwable -> L6
        L6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.datasource.cache.CacheDataSource.close():void");
    }

    @Override // androidx.media3.datasource.DataSource
    public final Map getResponseHeaders() {
        throw null;
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        return this.f5789a;
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        if (0 == 0) {
            return -1;
        }
        this.f5790b.getClass();
        throw null;
    }
}
