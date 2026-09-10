package com.efs.sdk.base.core.cache;

import android.os.Handler;
import android.os.Message;
import android.support.v4.media.session.PlaybackStateCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.FileUtil;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.concurrent.WorkThreadUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends Handler implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f390a;
    boolean b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f391a = new b(0);
    }

    public /* synthetic */ b(byte b) {
        this();
    }

    public static b a() {
        return a.f391a;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 2) {
            WorkThreadUtil.submit(this);
            return;
        }
        Log.w("efs.cache", "disk listener not support command: " + message.what);
    }

    @Override // java.lang.Runnable
    public final void run() {
        CacheManager.getInstance();
        File fileH = com.efs.sdk.base.core.util.a.h(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
        if (fileH.exists()) {
            for (File file : FileUtil.listFiles(fileH)) {
                if (CacheManager.a(file.getName())) {
                    CacheManager.a(file);
                }
            }
        }
        CacheManager.getInstance();
        File fileI = com.efs.sdk.base.core.util.a.i(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
        if (fileI.exists()) {
            for (File file2 : FileUtil.listFiles(fileI)) {
                if (CacheManager.a(file2.getName())) {
                    CacheManager.a(file2);
                }
            }
        }
        long j = Long.parseLong(com.efs.sdk.base.core.config.remote.b.a().a("disk_bytes", "4194304"));
        File fileH2 = com.efs.sdk.base.core.util.a.h(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
        long folderSize = FileUtil.getFolderSize(com.efs.sdk.base.core.util.a.d(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid())) + FileUtil.getFolderSize(fileH2);
        boolean z = folderSize < j;
        this.f390a = z;
        if (!z) {
            StringBuilder sbP = DM.p("Cache Limited! curr ", folderSize, "byte, max ");
            sbP.append(j);
            sbP.append(" byte.");
            Log.w("efs.cache", sbP.toString());
        }
        long j2 = Long.parseLong(com.efs.sdk.base.core.config.remote.b.a().a("apm_codelog_store_max", CampaignEx.CLICKMODE_ON)) * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        File fileI2 = com.efs.sdk.base.core.util.a.i(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
        long folderSize2 = FileUtil.getFolderSize(com.efs.sdk.base.core.util.a.e(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid())) + FileUtil.getFolderSize(fileI2);
        boolean z2 = folderSize2 < j2;
        this.b = z2;
        if (!z2) {
            StringBuilder sbP2 = DM.p("code log. Cache Limited! curr ", folderSize2, "byte, max ");
            sbP2.append(j2);
            sbP2.append(" byte.");
            Log.w("efs.cache", sbP2.toString());
        }
        sendEmptyMessageDelayed(2, TTAdConstant.AD_MAX_EVENT_TIME);
    }

    private b() {
        super(com.efs.sdk.base.core.util.concurrent.a.f427a.getLooper());
        this.f390a = true;
        this.b = true;
        sendEmptyMessageDelayed(2, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
    }
}
