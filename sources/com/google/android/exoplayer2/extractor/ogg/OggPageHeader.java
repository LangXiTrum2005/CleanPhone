package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes3.dex */
final class OggPageHeader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f17874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17875c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17876e;
    public final int[] f = new int[255];
    public final ParsableByteArray g = new ParsableByteArray(255);

    public final boolean a(DefaultExtractorInput defaultExtractorInput, boolean z2) throws ParserException, EOFException {
        boolean zPeekFully;
        boolean zPeekFully2;
        this.f17873a = 0;
        this.f17874b = 0L;
        this.f17875c = 0;
        this.d = 0;
        this.f17876e = 0;
        ParsableByteArray parsableByteArray = this.g;
        parsableByteArray.C(27);
        try {
            zPeekFully = defaultExtractorInput.peekFully(parsableByteArray.f18956a, 0, 27, z2);
        } catch (EOFException e2) {
            if (!z2) {
                throw e2;
            }
            zPeekFully = false;
        }
        if (zPeekFully && parsableByteArray.v() == 1332176723) {
            if (parsableByteArray.u() == 0) {
                this.f17873a = parsableByteArray.u();
                this.f17874b = parsableByteArray.j();
                parsableByteArray.l();
                parsableByteArray.l();
                parsableByteArray.l();
                int iU = parsableByteArray.u();
                this.f17875c = iU;
                this.d = iU + 27;
                parsableByteArray.C(iU);
                try {
                    zPeekFully2 = defaultExtractorInput.peekFully(parsableByteArray.f18956a, 0, this.f17875c, z2);
                } catch (EOFException e3) {
                    if (!z2) {
                        throw e3;
                    }
                    zPeekFully2 = false;
                }
                if (zPeekFully2) {
                    for (int i2 = 0; i2 < this.f17875c; i2++) {
                        int iU2 = parsableByteArray.u();
                        this.f[i2] = iU2;
                        this.f17876e += iU2;
                    }
                    return true;
                }
            } else if (!z2) {
                throw ParserException.b("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean b(DefaultExtractorInput defaultExtractorInput, long j) throws EOFException, InterruptedIOException {
        boolean zPeekFully;
        Assertions.b(defaultExtractorInput.d == defaultExtractorInput.getPeekPosition());
        ParsableByteArray parsableByteArray = this.g;
        parsableByteArray.C(4);
        while (true) {
            if (j != -1 && defaultExtractorInput.d + 4 >= j) {
                break;
            }
            try {
                zPeekFully = defaultExtractorInput.peekFully(parsableByteArray.f18956a, 0, 4, true);
            } catch (EOFException unused) {
                zPeekFully = false;
            }
            if (!zPeekFully) {
                break;
            }
            parsableByteArray.F(0);
            if (parsableByteArray.v() == 1332176723) {
                defaultExtractorInput.f = 0;
                return true;
            }
            defaultExtractorInput.skipFully(1);
        }
        do {
            if (j != -1 && defaultExtractorInput.d >= j) {
                break;
            }
        } while (defaultExtractorInput.g(1) != -1);
        return false;
    }
}
