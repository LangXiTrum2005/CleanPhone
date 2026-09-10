package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class sa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f19922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f19923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f19924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f19925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f19926e;

    public /* synthetic */ sa(ByteBuffer byteBuffer, long j10, long j11, long j12, ByteBuffer byteBuffer2) {
        this.f19925d = byteBuffer;
        this.f19922a = j10;
        this.f19923b = j11;
        this.f19924c = j12;
        this.f19926e = byteBuffer2;
    }

    public sa(AudioTrack audioTrack) {
        this.f19925d = audioTrack;
        this.f19926e = new AudioTimestamp();
    }
}
