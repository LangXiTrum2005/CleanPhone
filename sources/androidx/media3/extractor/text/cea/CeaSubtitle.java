package androidx.media3.extractor.text.cea;

import androidx.media3.common.util.Assertions;
import androidx.media3.extractor.text.Subtitle;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class CeaSubtitle implements Subtitle {
    public final List X;

    public CeaSubtitle(List list) {
        this.X = list;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final List getCues(long j) {
        return j >= 0 ? this.X : Collections.EMPTY_LIST;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final long getEventTime(int i2) {
        Assertions.b(i2 == 0);
        return 0L;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final int getEventTimeCount() {
        return 1;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final int getNextEventTimeIndex(long j) {
        return j < 0 ? 0 : -1;
    }
}
