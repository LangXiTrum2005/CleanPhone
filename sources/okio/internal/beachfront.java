package okio.internal;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: ZipFiles.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lokio/internal/beachfront;", "", "", "entryCount", "centralDirectoryOffset", "", "commentByteCount", "<init>", "(JJI)V", "attabal", "J", "dern", "()J", "saneness", "I", "()I", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final long entryCount;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final int commentByteCount;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final long centralDirectoryOffset;

    public beachfront(long j, long j2, int i) {
        this.entryCount = j;
        this.centralDirectoryOffset = j2;
        this.commentByteCount = i;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final long getCentralDirectoryOffset() {
        return this.centralDirectoryOffset;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final long getEntryCount() {
        return this.entryCount;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final int getCommentByteCount() {
        return this.commentByteCount;
    }
}
