package androidx.media3.common;

import android.content.Context;
import androidx.media3.exoplayer.video.a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface PreviewingVideoGraph extends VideoGraph {

    public interface Factory {
        PreviewingVideoGraph a(Context context, ColorInfo colorInfo, VideoGraph.Listener listener, a aVar, List list);
    }

    void a();
}
