package com.google.android.exoplayer2.drm;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.upstream.DataSourceInputStream;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableMap;
import java.io.ByteArrayOutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class HttpMediaDrmCallback implements MediaDrmCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefaultHttpDataSource.Factory f17493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f17495c = new HashMap();

    public HttpMediaDrmCallback(String str, DefaultHttpDataSource.Factory factory) {
        this.f17493a = factory;
        this.f17494b = str;
    }

    public static byte[] b(DefaultHttpDataSource.Factory factory, String str, byte[] bArr, Map map) throws MediaDrmCallbackException {
        Map map2;
        List list;
        StatsDataSource statsDataSource = new StatsDataSource(factory.createDataSource());
        DataSpec.Builder builder = new DataSpec.Builder();
        builder.f18748a = Uri.parse(str);
        builder.f18751e = map;
        builder.f18750c = 2;
        builder.d = bArr;
        builder.f18753i = 1;
        DataSpec dataSpecA = builder.a();
        int i2 = 0;
        int i3 = 0;
        DataSpec dataSpecA2 = dataSpecA;
        while (true) {
            try {
                DataSourceInputStream dataSourceInputStream = new DataSourceInputStream(statsDataSource, dataSpecA2);
                try {
                    try {
                        int i4 = Util.f18979a;
                        byte[] bArr2 = new byte[4096];
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            int i5 = dataSourceInputStream.read(bArr2);
                            if (i5 == -1) {
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                Util.h(dataSourceInputStream);
                                return byteArray;
                            }
                            byteArrayOutputStream.write(bArr2, i2, i5);
                            Util.h(dataSourceInputStream);
                            throw th;
                        }
                    } catch (Throwable th) {
                        Util.h(dataSourceInputStream);
                        throw th;
                    }
                } catch (HttpDataSource.InvalidResponseCodeException e2) {
                    int i6 = e2.e0;
                    String str2 = null;
                    if ((i6 == 307 || i6 == 308) && i3 < 5 && (map2 = e2.f0) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                        str2 = (String) list.get(i2);
                    }
                    if (str2 == null) {
                        throw e2;
                    }
                    i3++;
                    DataSpec.Builder builderA = dataSpecA2.a();
                    builderA.f18748a = Uri.parse(str2);
                    dataSpecA2 = builderA.a();
                    Util.h(dataSourceInputStream);
                }
            } catch (Exception e3) {
                Uri uri = statsDataSource.f18818c;
                uri.getClass();
                throw new MediaDrmCallbackException(dataSpecA, uri, statsDataSource.f18816a.getResponseHeaders(), statsDataSource.f18817b, e3);
            }
        }
    }

    public final byte[] a(UUID uuid, ExoMediaDrm.KeyRequest keyRequest) throws MediaDrmCallbackException {
        String str;
        String str2 = keyRequest.f17484b;
        if (TextUtils.isEmpty(str2)) {
            str2 = this.f17494b;
        }
        if (TextUtils.isEmpty(str2)) {
            DataSpec.Builder builder = new DataSpec.Builder();
            Uri uri = Uri.EMPTY;
            builder.f18748a = uri;
            throw new MediaDrmCallbackException(builder.a(), uri, ImmutableMap.o(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = C.f17000e;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = C.f16999c.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f17495c) {
            map.putAll(this.f17495c);
        }
        return b(this.f17493a, str2, keyRequest.f17483a, map);
    }

    public final byte[] c(ExoMediaDrm.ProvisionRequest provisionRequest) {
        StringBuilder sb = new StringBuilder();
        sb.append(provisionRequest.f17486b);
        sb.append("&signedRequest=");
        int i2 = Util.f18979a;
        sb.append(new String(provisionRequest.f17485a, Charsets.f19705c));
        return b(this.f17493a, sb.toString(), null, Collections.EMPTY_MAP);
    }
}
