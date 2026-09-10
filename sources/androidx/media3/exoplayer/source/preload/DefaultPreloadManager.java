package androidx.media3.exoplayer.source.preload;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultPreloadManager extends BasePreloadManager<Integer> {

    public static final class RankingDataComparator implements Comparator<Integer> {
        @Override // java.util.Comparator
        public final int compare(Integer num, Integer num2) {
            return Integer.compare(Math.abs(num.intValue()), Math.abs(num2.intValue()));
        }
    }

    public final class SourcePreloadControl implements PreloadMediaSource.PreloadControl {
    }

    public static class Status implements TargetPreloadStatusControl.PreloadStatus {

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Stage {
        }
    }
}
