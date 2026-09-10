package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.CeaUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class UserDataReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TrackOutput[] f7655b;

    public UserDataReader(List list) {
        this.f7654a = list;
        this.f7655b = new TrackOutput[list.size()];
    }

    public final void a(long j, ParsableByteArray parsableByteArray) {
        if (parsableByteArray.a() < 9) {
            return;
        }
        int iG = parsableByteArray.g();
        int iG2 = parsableByteArray.g();
        int iU = parsableByteArray.u();
        if (iG == 434 && iG2 == 1195456820 && iU == 3) {
            CeaUtil.b(j, parsableByteArray, this.f7655b);
        }
    }

    public final void b(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        int i2 = 0;
        while (true) {
            TrackOutput[] trackOutputArr = this.f7655b;
            if (i2 >= trackOutputArr.length) {
                return;
            }
            trackIdGenerator.a();
            trackIdGenerator.b();
            TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.d, 3);
            Format format = (Format) this.f7654a.get(i2);
            String str = format.m;
            Assertions.a("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            Format.Builder builder = new Format.Builder();
            trackIdGenerator.b();
            builder.f5423a = trackIdGenerator.f7653e;
            builder.f5429l = MimeTypes.l(str);
            builder.f5426e = format.f5409e;
            builder.d = format.d;
            builder.f5420E = format.f5403F;
            builder.o = format.f5414p;
            trackOutputTrack.b(new Format(builder));
            trackOutputArr[i2] = trackOutputTrack;
            i2++;
        }
    }
}
