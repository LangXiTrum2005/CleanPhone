package androidx.media3.extractor.ogg;

import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.OpusUtil;
import androidx.media3.extractor.VorbisUtil;
import com.google.common.collect.ImmutableList;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class OpusReader extends StreamReader {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f7186p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7187n;

    public static boolean e(ParsableByteArray parsableByteArray, byte[] bArr) {
        if (parsableByteArray.a() < bArr.length) {
            return false;
        }
        int i2 = parsableByteArray.f5668b;
        byte[] bArr2 = new byte[bArr.length];
        parsableByteArray.e(bArr2, 0, bArr.length);
        parsableByteArray.G(i2);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public final long b(ParsableByteArray parsableByteArray) {
        byte[] bArr = parsableByteArray.f5667a;
        return (((long) this.f7193i) * OpusUtil.b(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public final boolean c(ParsableByteArray parsableByteArray, long j, StreamReader.SetupData setupData) {
        if (e(parsableByteArray, o)) {
            byte[] bArrCopyOf = Arrays.copyOf(parsableByteArray.f5667a, parsableByteArray.f5669c);
            int i2 = bArrCopyOf[9] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            ArrayList arrayListA = OpusUtil.a(bArrCopyOf);
            if (setupData.f7195a == null) {
                Format.Builder builder = new Format.Builder();
                builder.f5429l = MimeTypes.l("audio/opus");
                builder.f5434z = i2;
                builder.f5418A = 48000;
                builder.o = arrayListA;
                setupData.f7195a = new Format(builder);
                return true;
            }
        } else {
            if (!e(parsableByteArray, f7186p)) {
                Assertions.f(setupData.f7195a);
                return false;
            }
            Assertions.f(setupData.f7195a);
            if (!this.f7187n) {
                this.f7187n = true;
                parsableByteArray.H(8);
                Metadata metadataB = VorbisUtil.b(ImmutableList.v(VorbisUtil.c(parsableByteArray, false, false).f6815a));
                if (metadataB != null) {
                    Format.Builder builderA = setupData.f7195a.a();
                    builderA.j = metadataB.b(setupData.f7195a.k);
                    setupData.f7195a = new Format(builderA);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public final void d(boolean z2) {
        super.d(z2);
        if (z2) {
            this.f7187n = false;
        }
    }
}
