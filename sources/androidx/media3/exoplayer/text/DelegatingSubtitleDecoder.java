package androidx.media3.exoplayer.text;

import androidx.media3.extractor.text.SimpleSubtitleDecoder;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleParser;

/* JADX INFO: loaded from: classes.dex */
final class DelegatingSubtitleDecoder extends SimpleSubtitleDecoder {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SubtitleParser f6498p;

    public DelegatingSubtitleDecoder(String str, SubtitleParser subtitleParser) {
        super(str);
        this.f6498p = subtitleParser;
    }

    @Override // androidx.media3.extractor.text.SimpleSubtitleDecoder
    public final Subtitle j(byte[] bArr, int i2, boolean z2) {
        SubtitleParser subtitleParser = this.f6498p;
        if (z2) {
            subtitleParser.reset();
        }
        return subtitleParser.b(0, i2, bArr);
    }
}
