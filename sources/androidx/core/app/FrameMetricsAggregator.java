package androidx.core.app;

import android.view.FrameMetrics;
import android.view.Window;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public class FrameMetricsAggregator {

    public static class FrameMetricsApi24Impl extends FrameMetricsBaseImpl {

        /* JADX INFO: renamed from: androidx.core.app.FrameMetricsAggregator$FrameMetricsApi24Impl$1, reason: invalid class name */
        public class AnonymousClass1 implements Window.OnFrameMetricsAvailableListener {
            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i2) {
                throw null;
            }
        }
    }

    public static class FrameMetricsBaseImpl {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MetricType {
    }
}
