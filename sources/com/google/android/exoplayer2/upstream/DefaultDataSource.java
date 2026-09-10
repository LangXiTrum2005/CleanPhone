package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.p004ironsource.d9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultDataSource implements DataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f18772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DataSource f18773c;
    public FileDataSource d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AssetDataSource f18774e;
    public ContentDataSource f;
    public DataSource g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public UdpDataSource f18775h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DataSchemeDataSource f18776i;
    public RawResourceDataSource j;
    public DataSource k;

    public static final class Factory implements DataSource.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f18777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DefaultHttpDataSource.Factory f18778b;

        public Factory(Context context) {
            DefaultHttpDataSource.Factory factory = new DefaultHttpDataSource.Factory();
            this.f18777a = context.getApplicationContext();
            this.f18778b = factory;
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public final DataSource createDataSource() {
            return new DefaultDataSource(this.f18777a, this.f18778b.createDataSource());
        }
    }

    public DefaultDataSource(Context context, DataSource dataSource) {
        this.f18771a = context.getApplicationContext();
        dataSource.getClass();
        this.f18773c = dataSource;
        this.f18772b = new ArrayList();
    }

    public static void d(DataSource dataSource, TransferListener transferListener) {
        if (dataSource != null) {
            dataSource.b(transferListener);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long a(DataSpec dataSpec) {
        Assertions.d(this.k == null);
        String scheme = dataSpec.f18742a.getScheme();
        int i2 = Util.f18979a;
        Uri uri = dataSpec.f18742a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f18771a;
        if (zIsEmpty || d9.h.f24719b.equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    FileDataSource fileDataSource = new FileDataSource(false);
                    this.d = fileDataSource;
                    c(fileDataSource);
                }
                this.k = this.d;
            } else {
                if (this.f18774e == null) {
                    AssetDataSource assetDataSource = new AssetDataSource(context);
                    this.f18774e = assetDataSource;
                    c(assetDataSource);
                }
                this.k = this.f18774e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f18774e == null) {
                AssetDataSource assetDataSource2 = new AssetDataSource(context);
                this.f18774e = assetDataSource2;
                c(assetDataSource2);
            }
            this.k = this.f18774e;
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                ContentDataSource contentDataSource = new ContentDataSource(context);
                this.f = contentDataSource;
                c(contentDataSource);
            }
            this.k = this.f;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            DataSource dataSource = this.f18773c;
            if (zEquals) {
                if (this.g == null) {
                    try {
                        DataSource dataSource2 = (DataSource) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                        this.g = dataSource2;
                        c(dataSource2);
                    } catch (ClassNotFoundException unused) {
                        Log.g("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e2) {
                        throw new RuntimeException("Error instantiating RTMP extension", e2);
                    }
                    if (this.g == null) {
                        this.g = dataSource;
                    }
                }
                this.k = this.g;
            } else if ("udp".equals(scheme)) {
                if (this.f18775h == null) {
                    UdpDataSource udpDataSource = new UdpDataSource();
                    this.f18775h = udpDataSource;
                    c(udpDataSource);
                }
                this.k = this.f18775h;
            } else if ("data".equals(scheme)) {
                if (this.f18776i == null) {
                    DataSchemeDataSource dataSchemeDataSource = new DataSchemeDataSource(false);
                    this.f18776i = dataSchemeDataSource;
                    c(dataSchemeDataSource);
                }
                this.k = this.f18776i;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.j == null) {
                    RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(context);
                    this.j = rawResourceDataSource;
                    c(rawResourceDataSource);
                }
                this.k = this.j;
            } else {
                this.k = dataSource;
            }
        }
        return this.k.a(dataSpec);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void b(TransferListener transferListener) {
        transferListener.getClass();
        this.f18773c.b(transferListener);
        this.f18772b.add(transferListener);
        d(this.d, transferListener);
        d(this.f18774e, transferListener);
        d(this.f, transferListener);
        d(this.g, transferListener);
        d(this.f18775h, transferListener);
        d(this.f18776i, transferListener);
        d(this.j, transferListener);
    }

    public final void c(DataSource dataSource) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f18772b;
            if (i2 >= arrayList.size()) {
                return;
            }
            dataSource.b((TransferListener) arrayList.get(i2));
            i2++;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void close() {
        DataSource dataSource = this.k;
        if (dataSource != null) {
            try {
                dataSource.close();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Map getResponseHeaders() {
        DataSource dataSource = this.k;
        return dataSource == null ? Collections.EMPTY_MAP : dataSource.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri getUri() {
        DataSource dataSource = this.k;
        if (dataSource == null) {
            return null;
        }
        return dataSource.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public final int read(byte[] bArr, int i2, int i3) {
        DataSource dataSource = this.k;
        dataSource.getClass();
        return dataSource.read(bArr, i2, i3);
    }
}
