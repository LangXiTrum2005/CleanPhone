package okio;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/FileMetadata;", "", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FileMetadata {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f45139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f45140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f45141c;
    public final Long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f45142e;
    public final Long f;
    public final Long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f45143h;

    public FileMetadata(boolean z2, boolean z3, Path path, Long l2, Long l3, Long l4, Long l5) {
        Map map = EmptyMap.X;
        this.f45139a = z2;
        this.f45140b = z3;
        this.f45141c = path;
        this.d = l2;
        this.f45142e = l3;
        this.f = l4;
        this.g = l5;
        this.f45143h = MapsKt.q(map);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f45139a) {
            arrayList.add("isRegularFile");
        }
        if (this.f45140b) {
            arrayList.add("isDirectory");
        }
        Long l2 = this.d;
        if (l2 != null) {
            arrayList.add("byteCount=" + l2);
        }
        Long l3 = this.f45142e;
        if (l3 != null) {
            arrayList.add("createdAt=" + l3);
        }
        Long l4 = this.f;
        if (l4 != null) {
            arrayList.add("lastModifiedAt=" + l4);
        }
        Long l5 = this.g;
        if (l5 != null) {
            arrayList.add("lastAccessedAt=" + l5);
        }
        Map map = this.f45143h;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return CollectionsKt.D(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }
}
