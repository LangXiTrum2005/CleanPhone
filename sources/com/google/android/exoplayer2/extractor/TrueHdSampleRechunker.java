package com.google.android.exoplayer2.extractor;

import com.inmobi.commons.core.configs.AdConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class TrueHdSampleRechunker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f17565a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17567c;
    public long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17568e;
    public int f;
    public int g;

    public final void a(TrackOutput trackOutput, TrackOutput.CryptoData cryptoData) {
        if (this.f17567c > 0) {
            trackOutput.f(this.d, this.f17568e, this.f, this.g, cryptoData);
            this.f17567c = 0;
        }
    }

    public final void b(TrackOutput trackOutput, long j, int i2, int i3, int i4, TrackOutput.CryptoData cryptoData) {
        if (!(this.g <= i3 + i4)) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.f17566b) {
            int i5 = this.f17567c;
            int i6 = i5 + 1;
            this.f17567c = i6;
            if (i5 == 0) {
                this.d = j;
                this.f17568e = i2;
                this.f = 0;
            }
            this.f += i3;
            this.g = i4;
            if (i6 >= 16) {
                a(trackOutput, cryptoData);
            }
        }
    }

    public final void c(ExtractorInput extractorInput) {
        if (this.f17566b) {
            return;
        }
        byte[] bArr = this.f17565a;
        int i2 = 0;
        extractorInput.peekFully(bArr, 0, 10);
        extractorInput.resetPeekPosition();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b2 = bArr[7];
            if ((b2 & 254) == 186) {
                i2 = 40 << ((bArr[(b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i2 == 0) {
            return;
        }
        this.f17566b = true;
    }
}
