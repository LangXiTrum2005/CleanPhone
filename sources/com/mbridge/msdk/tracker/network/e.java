package com.mbridge.msdk.tracker.network;

import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class e implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f36913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f36915d;

    public e() {
        this(2500, 1);
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public long a() {
        return this.f36913b;
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public int b() {
        return this.f36912a;
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public int c() {
        return this.f36914c;
    }

    public e(int i10, int i11) {
        this(i10, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS, i11);
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public boolean a(b0 b0Var) {
        int i10 = this.f36914c + 1;
        this.f36914c = i10;
        return i10 <= this.f36915d;
    }

    public e(int i10, long j10, int i11) {
        this.f36913b = j10;
        this.f36912a = i10;
        this.f36915d = i11;
    }
}
