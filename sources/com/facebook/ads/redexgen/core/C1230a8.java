package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.google.android.exoplayer2.StreamKey;
import com.google.android.exoplayer2.offline.DownloadRequest;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1230a8 {
    public String A00;
    public String A01;
    public List<StreamKey> A02;
    public byte[] A03;
    public byte[] A04;
    public final Uri A05;
    public final String A06;

    public C1230a8(String str, Uri uri) {
        this.A06 = str;
        this.A05 = uri;
    }

    public final C1230a8 A00(String str) {
        this.A00 = str;
        return this;
    }

    public final C1230a8 A01(String str) {
        this.A01 = str;
        return this;
    }

    public final C1230a8 A02(List<StreamKey> streamKeys) {
        this.A02 = streamKeys;
        return this;
    }

    public final C1230a8 A03(byte[] bArr) {
        this.A03 = bArr;
        return this;
    }

    public final C1230a8 A04(byte[] bArr) {
        this.A04 = bArr;
        return this;
    }

    public final DownloadRequest A05() {
        return new DownloadRequest(this.A06, this.A05, this.A01, this.A02 != null ? this.A02 : OI.A03(), this.A04, this.A00, this.A03, (C1229a7) null);
    }
}
