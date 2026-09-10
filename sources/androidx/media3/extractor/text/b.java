package androidx.media3.extractor.text;

import androidx.media3.common.util.Consumer;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Consumer {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f7228Y;

    public /* synthetic */ b(Object obj, int i2) {
        this.X = i2;
        this.f7228Y = obj;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj) {
        switch (this.X) {
            case 0:
                CuesWithTiming cuesWithTiming = (CuesWithTiming) obj;
                SubtitleExtractor subtitleExtractor = (SubtitleExtractor) this.f7228Y;
                subtitleExtractor.getClass();
                SubtitleExtractor.Sample sample = new SubtitleExtractor.Sample(cuesWithTiming.f7205b, CueEncoder.a(cuesWithTiming.f7206c, cuesWithTiming.f7204a));
                subtitleExtractor.f7210c.add(sample);
                long j = subtitleExtractor.j;
                if (j == -9223372036854775807L || cuesWithTiming.f7205b >= j) {
                    subtitleExtractor.a(sample);
                }
                break;
            default:
                ((ImmutableList.Builder) this.f7228Y).h((CuesWithTiming) obj);
                break;
        }
    }
}
