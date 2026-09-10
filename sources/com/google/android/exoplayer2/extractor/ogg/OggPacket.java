package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes3.dex */
final class OggPacket {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OggPageHeader f17869a = new OggPageHeader();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableByteArray f17870b = new ParsableByteArray(new byte[com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader.MAX_PAGE_PAYLOAD], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17871c = -1;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17872e;

    public final int a(int i2) {
        int i3;
        int i4 = 0;
        this.d = 0;
        do {
            int i5 = this.d;
            int i6 = i2 + i5;
            OggPageHeader oggPageHeader = this.f17869a;
            if (i6 >= oggPageHeader.f17875c) {
                break;
            }
            int[] iArr = oggPageHeader.f;
            this.d = i5 + 1;
            i3 = iArr[i5 + i2];
            i4 += i3;
        } while (i3 == 255);
        return i4;
    }

    public final boolean b(DefaultExtractorInput defaultExtractorInput) throws InterruptedIOException {
        int i2;
        Assertions.d(defaultExtractorInput != null);
        boolean z2 = this.f17872e;
        ParsableByteArray parsableByteArray = this.f17870b;
        if (z2) {
            this.f17872e = false;
            parsableByteArray.C(0);
        }
        while (!this.f17872e) {
            int i3 = this.f17871c;
            OggPageHeader oggPageHeader = this.f17869a;
            if (i3 < 0) {
                if (oggPageHeader.b(defaultExtractorInput, -1L) && oggPageHeader.a(defaultExtractorInput, true)) {
                    int iA = oggPageHeader.d;
                    if ((oggPageHeader.f17873a & 1) == 1 && parsableByteArray.f18958c == 0) {
                        iA += a(0);
                        i2 = this.d;
                    } else {
                        i2 = 0;
                    }
                    try {
                        defaultExtractorInput.skipFully(iA);
                        this.f17871c = i2;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(this.f17871c);
            int i4 = this.f17871c + this.d;
            if (iA2 > 0) {
                parsableByteArray.b(parsableByteArray.f18958c + iA2);
                defaultExtractorInput.readFully(parsableByteArray.f18956a, parsableByteArray.f18958c, iA2, false);
                parsableByteArray.E(parsableByteArray.f18958c + iA2);
                this.f17872e = oggPageHeader.f[i4 + (-1)] != 255;
            }
            if (i4 == oggPageHeader.f17875c) {
                i4 = -1;
            }
            this.f17871c = i4;
        }
        return true;
    }
}
