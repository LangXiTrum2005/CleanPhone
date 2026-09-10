package ballistician;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PreloadInfoMap.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR&\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lballistician/saneness;", "", "<init>", "()V", "", "preloadId", "Lballistician/attabal;", "attabal", "(Ljava/lang/String;)Lballistician/attabal;", "", "Ljava/util/Queue;", "Ljava/util/Map;", "preloadInfoMap", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Map<String, Queue<PreloadInfo>> preloadInfoMap = new LinkedHashMap();

    public final PreloadInfo attabal(String preloadId) {
        Intrinsics.checkNotNullParameter(preloadId, "preloadId");
        Queue<PreloadInfo> queue = this.preloadInfoMap.get(preloadId);
        if (queue == null) {
            return null;
        }
        return queue.poll();
    }
}
