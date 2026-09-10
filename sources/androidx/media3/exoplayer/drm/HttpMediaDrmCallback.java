package androidx.media3.exoplayer.drm;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.C;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSourceInputStream;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.datasource.StatsDataSource;
import com.google.common.collect.ImmutableMap;
import com.google.common.io.ByteStreams;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class HttpMediaDrmCallback implements MediaDrmCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefaultHttpDataSource.Factory f6241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f6243c = new HashMap();

    public HttpMediaDrmCallback(String str, DefaultHttpDataSource.Factory factory) {
        this.f6241a = factory;
        this.f6242b = str;
    }

    public static byte[] b(DefaultHttpDataSource.Factory factory, String str, byte[] bArr, Map map) throws MediaDrmCallbackException {
        Map map2;
        List list;
        StatsDataSource statsDataSource = new StatsDataSource(factory.a());
        DataSpec.Builder builder = new DataSpec.Builder();
        builder.f5741a = Uri.parse(str);
        builder.d = map;
        builder.f5742b = 2;
        builder.f5743c = bArr;
        builder.f5745h = 1;
        DataSpec dataSpecA = builder.a();
        int i2 = 0;
        int i3 = 0;
        DataSpec dataSpecA2 = dataSpecA;
        while (true) {
            try {
                DataSourceInputStream dataSourceInputStream = new DataSourceInputStream(statsDataSource, dataSpecA2);
                try {
                    byte[] bArrC = ByteStreams.c(dataSourceInputStream);
                    Util.g(dataSourceInputStream);
                    return bArrC;
                } catch (HttpDataSource.InvalidResponseCodeException e2) {
                    try {
                        int i4 = e2.e0;
                        String str2 = null;
                        if ((i4 == 307 || i4 == 308) && i3 < 5 && (map2 = e2.f0) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                            str2 = (String) list.get(i2);
                        }
                        if (str2 == null) {
                            throw e2;
                        }
                        i3++;
                        DataSpec.Builder builderA = dataSpecA2.a();
                        builderA.f5741a = Uri.parse(str2);
                        dataSpecA2 = builderA.a();
                        Util.g(dataSourceInputStream);
                    } catch (Throwable th) {
                        Util.g(dataSourceInputStream);
                        throw th;
                    }
                }
            } catch (Exception e3) {
                Uri uri = statsDataSource.f5784c;
                uri.getClass();
                throw new MediaDrmCallbackException(dataSpecA, uri, statsDataSource.f5782a.getResponseHeaders(), statsDataSource.f5783b, e3);
            }
        }
    }

    public final byte[] a(UUID uuid, ExoMediaDrm.KeyRequest keyRequest) throws MediaDrmCallbackException {
        String str;
        String str2 = keyRequest.f6232b;
        if (TextUtils.isEmpty(str2)) {
            str2 = this.f6242b;
        }
        if (TextUtils.isEmpty(str2)) {
            DataSpec.Builder builder = new DataSpec.Builder();
            Uri uri = Uri.EMPTY;
            builder.f5741a = uri;
            throw new MediaDrmCallbackException(builder.a(), uri, ImmutableMap.o(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = C.f5381e;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = C.f5380c.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f6243c) {
            map.putAll(this.f6243c);
        }
        return b(this.f6241a, str2, keyRequest.f6231a, map);
    }

    public final byte[] c(ExoMediaDrm.ProvisionRequest provisionRequest) {
        return b(this.f6241a, provisionRequest.f6234b + "&signedRequest=" + Util.n(provisionRequest.f6233a), null, Collections.EMPTY_MAP);
    }
}
