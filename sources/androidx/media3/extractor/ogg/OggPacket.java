package androidx.media3.extractor.ogg;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.DefaultExtractorInput;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
final class OggPacket {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OggPageHeader f7178a = new OggPageHeader();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableByteArray f7179b = new ParsableByteArray(new byte[com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader.MAX_PAGE_PAYLOAD], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7180c = -1;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7181e;

    public final int a(int i2) {
        int i3;
        int i4 = 0;
        this.d = 0;
        do {
            int i5 = this.d;
            int i6 = i2 + i5;
            OggPageHeader oggPageHeader = this.f7178a;
            if (i6 >= oggPageHeader.f7184c) {
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
        Assertions.e(defaultExtractorInput != null);
        boolean z2 = this.f7181e;
        ParsableByteArray parsableByteArray = this.f7179b;
        if (z2) {
            this.f7181e = false;
            parsableByteArray.D(0);
        }
        while (!this.f7181e) {
            int i3 = this.f7180c;
            OggPageHeader oggPageHeader = this.f7178a;
            if (i3 < 0) {
                if (oggPageHeader.b(defaultExtractorInput, -1L) && oggPageHeader.a(defaultExtractorInput, true)) {
                    int iA = oggPageHeader.d;
                    if ((oggPageHeader.f7182a & 1) == 1 && parsableByteArray.f5669c == 0) {
                        iA += a(0);
                        i2 = this.d;
                    } else {
                        i2 = 0;
                    }
                    try {
                        defaultExtractorInput.skipFully(iA);
                        this.f7180c = i2;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(this.f7180c);
            int i4 = this.f7180c + this.d;
            if (iA2 > 0) {
                parsableByteArray.b(parsableByteArray.f5669c + iA2);
                defaultExtractorInput.readFully(parsableByteArray.f5667a, parsableByteArray.f5669c, iA2, false);
                parsableByteArray.F(parsableByteArray.f5669c + iA2);
                this.f7181e = oggPageHeader.f[i4 + (-1)] != 255;
            }
            if (i4 == oggPageHeader.f7184c) {
                i4 = -1;
            }
            this.f7180c = i4;
        }
        return true;
    }
}
