package okio.internal;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Path;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/internal/ZipEntry;", "", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ZipEntry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f45181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f45182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f45183c;
    public final Long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f45184e;
    public final ArrayList f;

    public /* synthetic */ ZipEntry(Path path) {
        this(path, true, "", -1L, -1L, -1, null, -1L);
    }

    public ZipEntry(Path path, boolean z2, String comment, long j, long j2, int i2, Long l2, long j3) {
        Intrinsics.f(comment, "comment");
        this.f45181a = path;
        this.f45182b = z2;
        this.f45183c = j2;
        this.d = l2;
        this.f45184e = j3;
        this.f = new ArrayList();
    }
}
