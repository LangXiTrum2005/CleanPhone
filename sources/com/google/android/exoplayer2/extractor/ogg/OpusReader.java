package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.extractor.VorbisUtil;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.common.collect.ImmutableList;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class OpusReader extends StreamReader {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f17877p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f17878n;

    public static boolean e(ParsableByteArray parsableByteArray, byte[] bArr) {
        if (parsableByteArray.a() < bArr.length) {
            return false;
        }
        int i2 = parsableByteArray.f18957b;
        byte[] bArr2 = new byte[bArr.length];
        parsableByteArray.e(bArr2, 0, bArr.length);
        parsableByteArray.F(i2);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    public final long b(ParsableByteArray parsableByteArray) {
        byte[] bArr = parsableByteArray.f18956a;
        return (((long) this.f17884i) * OpusUtil.b(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    public final boolean c(ParsableByteArray parsableByteArray, long j, StreamReader.SetupData setupData) {
        if (e(parsableByteArray, o)) {
            byte[] bArrCopyOf = Arrays.copyOf(parsableByteArray.f18956a, parsableByteArray.f18958c);
            int i2 = bArrCopyOf[9] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            ArrayList arrayListA = OpusUtil.a(bArrCopyOf);
            if (setupData.f17886a == null) {
                Format.Builder builder = new Format.Builder();
                builder.k = "audio/opus";
                builder.x = i2;
                builder.y = 48000;
                builder.m = arrayListA;
                setupData.f17886a = new Format(builder);
                return true;
            }
        } else {
            if (!e(parsableByteArray, f17877p)) {
                Assertions.e(setupData.f17886a);
                return false;
            }
            Assertions.e(setupData.f17886a);
            if (!this.f17878n) {
                this.f17878n = true;
                parsableByteArray.G(8);
                Metadata metadataB = VorbisUtil.b(ImmutableList.v(VorbisUtil.c(parsableByteArray, false, false).f17572a));
                if (metadataB != null) {
                    Format.Builder builderA = setupData.f17886a.a();
                    Metadata metadata = setupData.f17886a.k0;
                    if (metadata != null) {
                        metadataB = metadataB.a(metadata.X);
                    }
                    builderA.f17086i = metadataB;
                    setupData.f17886a = new Format(builderA);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    public final void d(boolean z2) {
        super.d(z2);
        if (z2) {
            this.f17878n = false;
        }
    }
}
