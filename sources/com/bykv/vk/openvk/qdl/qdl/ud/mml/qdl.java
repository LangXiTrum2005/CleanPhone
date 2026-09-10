package com.bykv.vk.openvk.qdl.qdl.ud.mml;

import android.os.Build;
import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.thinkup.core.common.om.n;

/* JADX INFO: loaded from: classes.dex */
public class qdl {
    private static final int qdl = Build.VERSION.SDK_INT;

    public static int qdl(long j, long j2) {
        return Math.min(Math.max(0, j2 > 0 ? (int) (((j * 1.0d) / j2) * 100.0d) : 0), 100);
    }

    public static String qdl(long j) {
        StringBuilder sb = new StringBuilder();
        long j2 = j / ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        long j3 = ((j % n.m) % ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) / 1000;
        if (j2 >= 10) {
            sb.append(j2);
        } else if (j2 > 0) {
            sb.append(0);
            sb.append(j2);
        } else {
            sb.append("00");
        }
        sb.append(":");
        if (j3 >= 10) {
            sb.append(j3);
        } else if (j3 > 0) {
            sb.append(0);
            sb.append(j3);
        } else {
            sb.append("00");
        }
        return sb.toString();
    }

    public static void qdl(View view, boolean z2) {
        if (view == null) {
            return;
        }
        if (z2) {
            view.setSystemUiVisibility(0);
            return;
        }
        int i2 = qdl;
        if (i2 >= 19) {
            view.setSystemUiVisibility(3846);
        } else if (i2 >= 16) {
            view.setSystemUiVisibility(5);
        } else {
            view.setSystemUiVisibility(1);
        }
    }
}
