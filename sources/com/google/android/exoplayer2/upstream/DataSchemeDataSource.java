package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Charsets;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes3.dex */
public final class DataSchemeDataSource extends BaseDataSource {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DataSpec f18738e;
    public byte[] f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18739h;

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long a(DataSpec dataSpec) throws DataSourceException, ParserException {
        e(dataSpec);
        this.f18738e = dataSpec;
        Uri uri = dataSpec.f18742a;
        String scheme = uri.getScheme();
        Assertions.a("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i2 = Util.f18979a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new ParserException(android.support.v4.media.a.k(uri, "Unexpected URI format: "), null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e2) {
                throw new ParserException(android.support.v4.media.a.C("Error while parsing Base64 encoded string: ", str), e2, true, 0);
            }
        } else {
            this.f = URLDecoder.decode(str, Charsets.f19703a.name()).getBytes(Charsets.f19705c);
        }
        byte[] bArr = this.f;
        long length = bArr.length;
        long j = dataSpec.f;
        if (j > length) {
            this.f = null;
            throw new DataSourceException(2008);
        }
        int i3 = (int) j;
        this.g = i3;
        int length2 = bArr.length - i3;
        this.f18739h = length2;
        long j2 = dataSpec.g;
        if (j2 != -1) {
            this.f18739h = (int) Math.min(length2, j2);
        }
        f(dataSpec);
        return j2 != -1 ? j2 : this.f18739h;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void close() {
        if (this.f != null) {
            this.f = null;
            d();
        }
        this.f18738e = null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri getUri() {
        DataSpec dataSpec = this.f18738e;
        if (dataSpec != null) {
            return dataSpec.f18742a;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public final int read(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i4 = this.f18739h;
        if (i4 == 0) {
            return -1;
        }
        int iMin = Math.min(i3, i4);
        byte[] bArr2 = this.f;
        int i5 = Util.f18979a;
        System.arraycopy(bArr2, this.g, bArr, i2, iMin);
        this.g += iMin;
        this.f18739h -= iMin;
        c(iMin);
        return iMin;
    }
}
