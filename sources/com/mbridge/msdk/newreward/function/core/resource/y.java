package com.mbridge.msdk.newreward.function.core.resource;

import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.OnProgressStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class y extends q implements OnDownloadStateListener<com.mbridge.msdk.newreward.function.core.campaign.b>, OnProgressStateListener<com.mbridge.msdk.newreward.function.core.campaign.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.core.campaign.b f1686a;
    private final com.mbridge.msdk.newreward.function.core.campaign.a b;
    private final n c;
    private final String d;
    private final String e;
    private final String f;
    private final int h;
    private DownloadRequest i;
    private x j;
    private boolean g = false;
    private volatile boolean k = false;
    private boolean l = false;

    public y(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar, n nVar, int i) {
        this.f1686a = bVar;
        this.b = aVar;
        this.c = nVar;
        this.h = i;
        String strC = nVar.c();
        this.d = strC;
        String str = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_VC) + File.separator;
        this.e = str;
        String strA = com.mbridge.msdk.newreward.function.utils.c.a(strC);
        this.f = strA;
        String strH = DM.h(str, strA);
        nVar.a(new File(strH));
        nVar.b(true);
        File file = new File(strH);
        if (file.exists() && file.isFile()) {
            nVar.a(1);
            nVar.a(true);
            nVar.b(false);
        }
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.p
    public void a(int i, x xVar) {
        DownloadMessage<?> downloadMessage;
        int i2;
        this.j = xVar;
        if (TextUtils.isEmpty(this.d)) {
            if (this.c.j()) {
                x xVar2 = this.j;
                if (xVar2 != null) {
                    xVar2.a(this.f1686a, this.b, this);
                    this.j.b(this.f1686a, this.b, this);
                    return;
                }
                return;
            }
            x xVar3 = this.j;
            if (xVar3 != null) {
                xVar3.a(this.f1686a, this.b, this);
                this.j.a(this.f1686a, this.b, this, new MBridgeError(5, MBridgeError.ERROR_MESSAGE_DOWNLOAD_RESOURCE_URL_ERROR));
                return;
            }
            return;
        }
        if (this.l) {
            x xVar4 = this.j;
            if (xVar4 != null) {
                xVar4.b(this.f1686a, this.b, this);
                return;
            }
            return;
        }
        this.k = false;
        int iA = a();
        if (i == 1 || (i2 = this.h) == 100 || iA == 1) {
            this.g = false;
            downloadMessage = new DownloadMessage<>(this.f1686a, this.d, this.f, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
        } else {
            this.g = true;
            downloadMessage = new DownloadMessage<>(this.f1686a, this.d, this.f, i2, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
        }
        DownloadRequest downloadRequestBuild = MBDownloadManager.getInstance().download(downloadMessage).withReadTimeout(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS).withConnectTimeout(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS).withWriteTimeout(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS).withDownloadPriority(DownloadPriority.IMMEDIATE).withHttpRetryCounter(5).withDirectoryPathInternal(this.e).withDownloadStateListener(this).withProgressStateListener(this).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).with("download_scene", "download_video").with("do_us_fi_re", Boolean.toString(true)).build();
        this.i = downloadRequestBuild;
        downloadRequestBuild.start();
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onCancelDownload(DownloadMessage<com.mbridge.msdk.newreward.function.core.campaign.b> downloadMessage) {
        if (this.k) {
            x xVar = this.j;
            if (xVar != null) {
                xVar.b(this.f1686a, this.b, this, new MBridgeError(4, MBridgeError.ERROR_MESSAGE_DOWNLOAD_DOWNLOAD_TIMEOUT));
                return;
            }
            return;
        }
        x xVar2 = this.j;
        if (xVar2 != null) {
            xVar2.a(this.f1686a, this.b, this, new MBridgeError(2, MBridgeError.ERROR_MESSAGE_DOWNLOAD_NETWORK_ERROR));
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onDownloadComplete(DownloadMessage<com.mbridge.msdk.newreward.function.core.campaign.b> downloadMessage) {
        this.c.a(TextUtils.equals(this.i.get("cache", "2"), "2") ? 2 : 1);
        this.c.a(true);
        this.c.b(false);
        this.l = true;
        x xVar = this.j;
        if (xVar != null) {
            xVar.b(this.f1686a, this.b, this);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onDownloadError(DownloadMessage<com.mbridge.msdk.newreward.function.core.campaign.b> downloadMessage, DownloadError downloadError) {
        this.c.a(TextUtils.equals(this.i.get("cache", "2"), "2") ? 2 : 1);
        this.c.a(false);
        this.c.b(false);
        MBridgeError mBridgeError = new MBridgeError(2, MBridgeError.ERROR_MESSAGE_DOWNLOAD_VIDEO_ERROR);
        mBridgeError.setException(downloadError.getException());
        x xVar = this.j;
        if (xVar != null) {
            xVar.a(this.f1686a, this.b, this, mBridgeError);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onDownloadStart(DownloadMessage<com.mbridge.msdk.newreward.function.core.campaign.b> downloadMessage) {
        x xVar = this.j;
        if (xVar != null) {
            xVar.a(this.f1686a, this.b, this);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
    public void onProgress(DownloadMessage<com.mbridge.msdk.newreward.function.core.campaign.b> downloadMessage, DownloadProgress downloadProgress) {
        if (downloadProgress.getCurrentDownloadRate() >= this.h) {
            this.c.a(TextUtils.equals(this.i.get("cache", "2"), "2") ? 2 : 1);
            this.c.a(true);
            this.c.b(false);
            if (this.g) {
                this.i.cancel(downloadMessage);
            }
        }
    }

    private int a() {
        return this.b.a().getVideoCtnType();
    }
}
