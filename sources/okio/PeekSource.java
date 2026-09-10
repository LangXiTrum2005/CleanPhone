package okio;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/PeekSource;", "Lokio/Source;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PeekSource implements Source {
    public final BufferedSource X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Buffer f45154Y;
    public Segment Z;
    public int e0;
    public boolean f0;
    public long g0;

    public PeekSource(BufferedSource bufferedSource) {
        this.X = bufferedSource;
        Buffer f45155y = bufferedSource.getF45155Y();
        this.f45154Y = f45155y;
        Segment segment = f45155y.X;
        this.Z = segment;
        this.e0 = segment != null ? segment.f45158b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f0 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r5.f45158b) goto L15;
     */
    @Override // okio.Source
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long read(okio.Buffer r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.f(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L6b
            boolean r3 = r8.f0
            if (r3 != 0) goto L63
            okio.Segment r3 = r8.Z
            okio.Buffer r4 = r8.f45154Y
            if (r3 == 0) goto L2b
            okio.Segment r5 = r4.X
            if (r3 != r5) goto L23
            int r3 = r8.e0
            kotlin.jvm.internal.Intrinsics.c(r5)
            int r5 = r5.f45158b
            if (r3 != r5) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            long r0 = r8.g0
            r2 = 1
            long r0 = r0 + r2
            okio.BufferedSource r2 = r8.X
            boolean r0 = r2.request(r0)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            okio.Segment r0 = r8.Z
            if (r0 != 0) goto L4c
            okio.Segment r0 = r4.X
            if (r0 == 0) goto L4c
            r8.Z = r0
            int r0 = r0.f45158b
            r8.e0 = r0
        L4c:
            long r0 = r4.f45132Y
            long r2 = r8.g0
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            okio.Buffer r2 = r8.f45154Y
            long r3 = r8.g0
            r5 = r9
            r2.q(r3, r5, r6)
            long r9 = r8.g0
            long r9 = r9 + r6
            r8.g0 = r9
            return r6
        L63:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L6b:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = androidx.datastore.preferences.protobuf.a.i(r10, r9)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.PeekSource.read(okio.Buffer, long):long");
    }

    @Override // okio.Source
    /* JADX INFO: renamed from: timeout */
    public final Timeout getF45149Y() {
        return this.X.getF45149Y();
    }
}
