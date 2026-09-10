package androidx.media3.datasource;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import com.p004ironsource.d9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultDataSource implements DataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DataSource f5748c;
    public FileDataSource d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AssetDataSource f5749e;
    public ContentDataSource f;
    public DataSource g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public UdpDataSource f5750h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DataSchemeDataSource f5751i;
    public RawResourceDataSource j;
    public DataSource k;

    public static final class Factory implements DataSource.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f5752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DefaultHttpDataSource.Factory f5753b;

        public Factory(Context context) {
            DefaultHttpDataSource.Factory factory = new DefaultHttpDataSource.Factory();
            this.f5752a = context.getApplicationContext();
            this.f5753b = factory;
        }

        public final DataSource a() {
            return new DefaultDataSource(this.f5752a, this.f5753b.a());
        }
    }

    public DefaultDataSource(Context context, DataSource dataSource) {
        this.f5746a = context.getApplicationContext();
        dataSource.getClass();
        this.f5748c = dataSource;
        this.f5747b = new ArrayList();
    }

    public static void d(DataSource dataSource, TransferListener transferListener) {
        if (dataSource != null) {
            dataSource.a(transferListener);
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final void a(TransferListener transferListener) {
        transferListener.getClass();
        this.f5748c.a(transferListener);
        this.f5747b.add(transferListener);
        d(this.d, transferListener);
        d(this.f5749e, transferListener);
        d(this.f, transferListener);
        d(this.g, transferListener);
        d(this.f5750h, transferListener);
        d(this.f5751i, transferListener);
        d(this.j, transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public final long b(DataSpec dataSpec) {
        Assertions.e(this.k == null);
        String scheme = dataSpec.f5736a.getScheme();
        int i2 = Util.f5683a;
        Uri uri = dataSpec.f5736a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f5746a;
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
                if (this.f5749e == null) {
                    AssetDataSource assetDataSource = new AssetDataSource(context);
                    this.f5749e = assetDataSource;
                    c(assetDataSource);
                }
                this.k = this.f5749e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f5749e == null) {
                AssetDataSource assetDataSource2 = new AssetDataSource(context);
                this.f5749e = assetDataSource2;
                c(assetDataSource2);
            }
            this.k = this.f5749e;
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                ContentDataSource contentDataSource = new ContentDataSource(context);
                this.f = contentDataSource;
                c(contentDataSource);
            }
            this.k = this.f;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            DataSource dataSource = this.f5748c;
            if (zEquals) {
                if (this.g == null) {
                    try {
                        DataSource dataSource2 = (DataSource) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
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
                if (this.f5750h == null) {
                    UdpDataSource udpDataSource = new UdpDataSource();
                    this.f5750h = udpDataSource;
                    c(udpDataSource);
                }
                this.k = this.f5750h;
            } else if ("data".equals(scheme)) {
                if (this.f5751i == null) {
                    DataSchemeDataSource dataSchemeDataSource = new DataSchemeDataSource(false);
                    this.f5751i = dataSchemeDataSource;
                    c(dataSchemeDataSource);
                }
                this.k = this.f5751i;
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
        return this.k.b(dataSpec);
    }

    public final void c(DataSource dataSource) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f5747b;
            if (i2 >= arrayList.size()) {
                return;
            }
            dataSource.a((TransferListener) arrayList.get(i2));
            i2++;
        }
    }

    @Override // androidx.media3.datasource.DataSource
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

    @Override // androidx.media3.datasource.DataSource
    public final Map getResponseHeaders() {
        DataSource dataSource = this.k;
        return dataSource == null ? Collections.EMPTY_MAP : dataSource.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        DataSource dataSource = this.k;
        if (dataSource == null) {
            return null;
        }
        return dataSource.getUri();
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i2, int i3) {
        DataSource dataSource = this.k;
        dataSource.getClass();
        return dataSource.read(bArr, i2, i3);
    }
}
