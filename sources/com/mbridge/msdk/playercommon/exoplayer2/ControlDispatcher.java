package com.mbridge.msdk.playercommon.exoplayer2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface ControlDispatcher {
    boolean dispatchSeekTo(Player player, int i10, long j10);

    boolean dispatchSetPlayWhenReady(Player player, boolean z10);

    boolean dispatchSetRepeatMode(Player player, int i10);

    boolean dispatchSetShuffleModeEnabled(Player player, boolean z10);

    boolean dispatchStop(Player player, boolean z10);
}
