package androidx.media3.extractor.text;

import androidx.media3.decoder.DecoderOutputBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class SubtitleOutputBuffer extends DecoderOutputBuffer implements Subtitle {
    public Subtitle f0;
    public long g0;

    @Override // androidx.media3.decoder.DecoderOutputBuffer
    public final void d() {
        super.d();
        this.f0 = null;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final List getCues(long j) {
        Subtitle subtitle = this.f0;
        subtitle.getClass();
        return subtitle.getCues(j - this.g0);
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final long getEventTime(int i2) {
        Subtitle subtitle = this.f0;
        subtitle.getClass();
        return subtitle.getEventTime(i2) + this.g0;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final int getEventTimeCount() {
        Subtitle subtitle = this.f0;
        subtitle.getClass();
        return subtitle.getEventTimeCount();
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final int getNextEventTimeIndex(long j) {
        Subtitle subtitle = this.f0;
        subtitle.getClass();
        return subtitle.getNextEventTimeIndex(j - this.g0);
    }
}
