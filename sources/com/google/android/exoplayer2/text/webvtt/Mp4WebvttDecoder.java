package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Charsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class Mp4WebvttDecoder extends SimpleSubtitleDecoder {
    public final ParsableByteArray o;

    public Mp4WebvttDecoder() {
        super("Mp4WebvttDecoder");
        this.o = new ParsableByteArray();
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    public final Subtitle e(byte[] bArr, int i2, boolean z2) throws SubtitleDecoderException {
        Cue cueA;
        ParsableByteArray parsableByteArray = this.o;
        parsableByteArray.D(bArr, i2);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.a() > 0) {
            if (parsableByteArray.a() < 8) {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int iG = parsableByteArray.g();
            if (parsableByteArray.g() == 1987343459) {
                int i3 = iG - 8;
                CharSequence charSequenceF = null;
                Cue.Builder builderA = null;
                while (i3 > 0) {
                    if (i3 < 8) {
                        throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
                    }
                    int iG2 = parsableByteArray.g();
                    int iG3 = parsableByteArray.g();
                    int i4 = iG2 - 8;
                    byte[] bArr2 = parsableByteArray.f18956a;
                    int i5 = parsableByteArray.f18957b;
                    int i6 = Util.f18979a;
                    String str = new String(bArr2, i5, i4, Charsets.f19705c);
                    parsableByteArray.G(i4);
                    i3 = (i3 - 8) - i4;
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
                    builderA.f18454a = charSequenceF;
                    cueA = builderA.a();
                } else {
                    Pattern pattern = WebvttCueParser.f18644a;
                    WebvttCueParser.WebvttCueInfoBuilder webvttCueInfoBuilder2 = new WebvttCueParser.WebvttCueInfoBuilder();
                    webvttCueInfoBuilder2.f18656c = charSequenceF;
                    cueA = webvttCueInfoBuilder2.a().a();
                }
                arrayList.add(cueA);
            } else {
                parsableByteArray.G(iG - 8);
            }
        }
        return new Mp4WebvttSubtitle(arrayList);
    }
}
