package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.common.base.Charsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class Mp4WebvttParser implements SubtitleParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f7395a = new ParsableByteArray();

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final void a(byte[] bArr, int i2, int i3, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        Cue cueA;
        ParsableByteArray parsableByteArray = this.f7395a;
        parsableByteArray.E(bArr, i2 + i3);
        parsableByteArray.G(i2);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.a() > 0) {
            Assertions.a("Incomplete Mp4Webvtt Top Level box header found.", parsableByteArray.a() >= 8);
            int iG = parsableByteArray.g();
            if (parsableByteArray.g() == 1987343459) {
                int i4 = iG - 8;
                CharSequence charSequenceF = null;
                Cue.Builder builderA = null;
                while (i4 > 0) {
                    Assertions.a("Incomplete vtt cue box header found.", i4 >= 8);
                    int iG2 = parsableByteArray.g();
                    int iG3 = parsableByteArray.g();
                    int i5 = iG2 - 8;
                    byte[] bArr2 = parsableByteArray.f5667a;
                    int i6 = parsableByteArray.f5668b;
                    int i7 = Util.f5683a;
                    String str = new String(bArr2, i6, i5, Charsets.f19705c);
                    parsableByteArray.H(i5);
                    i4 = (i4 - 8) - i5;
                    if (iG3 == 1937011815) {
                        WebvttCueParser.WebvttCueInfoBuilder webvttCueInfoBuilder = new WebvttCueParser.WebvttCueInfoBuilder();
                        WebvttCueParser.e(str, webvttCueInfoBuilder);
                        builderA = webvttCueInfoBuilder.a();
                    } else if (iG3 == 1885436268) {
                        charSequenceF = WebvttCueParser.f(null, str.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceF == null) {
                    charSequenceF = "";
                }
                if (builderA != null) {
                    builderA.f5604a = charSequenceF;
                    cueA = builderA.a();
                } else {
                    Pattern pattern = WebvttCueParser.f7411a;
                    WebvttCueParser.WebvttCueInfoBuilder webvttCueInfoBuilder2 = new WebvttCueParser.WebvttCueInfoBuilder();
                    webvttCueInfoBuilder2.f7423c = charSequenceF;
                    cueA = webvttCueInfoBuilder2.a().a();
                }
                arrayList.add(cueA);
            } else {
                parsableByteArray.H(iG - 8);
            }
        }
        consumer.accept(new CuesWithTiming(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final int c() {
        return 2;
    }
}
