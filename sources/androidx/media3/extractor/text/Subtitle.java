package androidx.media3.extractor.text;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface Subtitle {
    List getCues(long j);

    long getEventTime(int i2);

    int getEventTimeCount();

    int getNextEventTimeIndex(long j);
}
