package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SeiReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TrackOutput[] f7621b;

    public SeiReader(List list) {
        this.f7620a = list;
        this.f7621b = new TrackOutput[list.size()];
    }

    public final void a(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        int i2 = 0;
        while (true) {
            TrackOutput[] trackOutputArr = this.f7621b;
            if (i2 >= trackOutputArr.length) {
                return;
            }
            trackIdGenerator.a();
            trackIdGenerator.b();
            TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.d, 3);
            Format format = (Format) this.f7620a.get(i2);
            String str = format.m;
            Assertions.a("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = format.f5406a;
            if (str2 == null) {
                trackIdGenerator.b();
                str2 = trackIdGenerator.f7653e;
            }
            Format.Builder builder = new Format.Builder();
            builder.f5423a = str2;
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
