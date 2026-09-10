package com.efs.sdk.base.core.d;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.NonNull;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ControllerCenter f409a;

    public a() {
        super(com.efs.sdk.base.core.util.concurrent.a.f427a.getLooper());
        sendEmptyMessageDelayed(0, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
    }

    public abstract void a();

    @Override // android.os.Handler
    public void handleMessage(@NonNull Message message) {
        super.handleMessage(message);
        a();
        sendEmptyMessageDelayed(0, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
    }
}
