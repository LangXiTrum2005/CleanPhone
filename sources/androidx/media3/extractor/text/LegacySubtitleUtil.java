package androidx.media3.extractor.text;

import androidx.media3.common.util.Consumer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LegacySubtitleUtil {
    public static void a(Subtitle subtitle, int i2, Consumer consumer) {
        long eventTime = subtitle.getEventTime(i2);
        List cues = subtitle.getCues(eventTime);
        if (cues.isEmpty()) {
            return;
        }
        if (i2 == subtitle.getEventTimeCount() - 1) {
            throw new IllegalStateException();
        }
        long eventTime2 = subtitle.getEventTime(i2 + 1) - subtitle.getEventTime(i2);
        if (eventTime2 > 0) {
            consumer.accept(new CuesWithTiming(cues, eventTime, eventTime2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    public static void b(Subtitle subtitle, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        int nextEventTimeIndex;
        boolean z2;
        long j = outputOptions.f7217a;
        if (j == -9223372036854775807L) {
            nextEventTimeIndex = 0;
        } else {
            nextEventTimeIndex = subtitle.getNextEventTimeIndex(j);
            if (nextEventTimeIndex == -1) {
                nextEventTimeIndex = subtitle.getEventTimeCount();
            }
            if (nextEventTimeIndex > 0 && subtitle.getEventTime(nextEventTimeIndex - 1) == j) {
                nextEventTimeIndex--;
            }
        }
        if (j == -9223372036854775807L || nextEventTimeIndex >= subtitle.getEventTimeCount()) {
            z2 = false;
        } else {
            List cues = subtitle.getCues(j);
            long eventTime = subtitle.getEventTime(nextEventTimeIndex);
            if (cues.isEmpty()) {
                z2 = false;
            } else {
                long j2 = outputOptions.f7217a;
                if (j2 < eventTime) {
                    consumer.accept(new CuesWithTiming(cues, j2, eventTime - j2));
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
        }
        for (int i2 = nextEventTimeIndex; i2 < subtitle.getEventTimeCount(); i2++) {
            a(subtitle, i2, consumer);
        }
        if (outputOptions.f7218b) {
            if (z2) {
                nextEventTimeIndex--;
            }
            for (int i3 = 0; i3 < nextEventTimeIndex; i3++) {
                a(subtitle, i3, consumer);
            }
            if (z2) {
                consumer.accept(new CuesWithTiming(subtitle.getCues(j), subtitle.getEventTime(nextEventTimeIndex), j - subtitle.getEventTime(nextEventTimeIndex)));
            }
        }
    }
}
