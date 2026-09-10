package com.mbridge.msdk.newreward.function.core.resource;

import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.OnProgressStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.z0;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes2.dex */
public class v extends q implements OnDownloadStateListener<com.mbridge.msdk.newreward.function.core.campaign.b>, OnProgressStateListener<com.mbridge.msdk.newreward.function.core.campaign.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1684a;
    private final String b;
    private final String c;
    private final com.mbridge.msdk.newreward.function.core.campaign.b d;
    private final com.mbridge.msdk.newreward.function.core.campaign.a e;
    private final c f;
    private final String g;
    private DownloadRequest<?> h;
    private x i;
    private boolean j;
    private String k;
    private boolean l;

    public v(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar, c cVar) {
        this.j = false;
        this.l = false;
        this.d = bVar;
        this.e = aVar;
        this.f = cVar;
        String strC = cVar.c();
        this.g = strC;
        if (!TextUtils.isEmpty(strC)) {
            this.l = strC.contains(".zip") && strC.contains(ResourceManager.KEY_MD5FILENAME);
        }
        String strB = com.mbridge.msdk.foundation.same.directory.e.b(this.l ? com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_RES : com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_HTML);
        String md5 = SameMD5.getMD5(z0.b(strC));
        this.f1684a = md5;
        this.b = DM.h(strB, "/");
        this.c = DM.i(strB, "/", md5);
        cVar.b(true);
        String resDirFromCampaign = this.l ? ResourceManager.getinstance().getResDirFromCampaign(strC) : HTMLResourceManager.getInstance().getHtmlContentFromUrl(strC);
        if (TextUtils.isEmpty(resDirFromCampaign)) {
            return;
        }
        this.j = true;
        cVar.a(1);
        cVar.a(resDirFromCampaign);
        cVar.a(true);
        cVar.b(false);
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.p
    public void a(int i, x xVar) {
        StringBuilder sb;
        String str;
        String str2;
        this.i = xVar;
        if (xVar != null) {
            xVar.a(this.d, this.e, this);
        }
        if (this.j) {
            x xVar2 = this.i;
            if (xVar2 != null) {
                xVar2.b(this.d, this.e, this);
                return;
            }
            return;
        }
        if (this.l) {
            sb = new StringBuilder();
            str = this.f1684a;
            str2 = ".zip";
        } else {
            sb = new StringBuilder();
            str = this.f1684a;
            str2 = ".html";
        }
        String strM = DM.m(sb, str, str2);
        this.k = DM.m(new StringBuilder(), this.b, strM);
        DownloadRequest<?> downloadRequestBuild = MBDownloadManager.getInstance().download(new DownloadMessage<>(this.d, this.g, strM, 100, this.l ? DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_ZIP : DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_HTML)).withReadTimeout(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS).withConnectTimeout(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS).withWriteTimeout(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS).withDownloadPriority(DownloadPriority.IMMEDIATE).withHttpRetryCounter(5).withDirectoryPathInternal(this.b).withDownloadStateListener(this).withProgressStateListener(this).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).with("download_scene", a()).with("do_us_fi_re", Boolean.toString(true)).build();
        this.h = downloadRequestBuild;
        downloadRequestBuild.start();
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onCancelDownload(DownloadMessage<com.mbridge.msdk.newreward.function.core.campaign.b> downloadMessage) {
        this.f.a(TextUtils.equals(this.h.get("cache", "2"), "2") ? 2 : 1);
        this.f.a(false);
        this.f.b(false);
        if (this.f.j()) {
            x xVar = this.i;
            if (xVar != null) {
                xVar.b(this.d, this.e, this);
                return;
            }
            return;
        }
        x xVar2 = this.i;
        if (xVar2 != null) {
            xVar2.a(this.d, this.e, this, new MBridgeError(4, MBridgeError.ERROR_MESSAGE_DOWNLOAD_DOWNLOAD_TIMEOUT));
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onDownloadComplete(DownloadMessage<com.mbridge.msdk.newreward.function.core.campaign.b> downloadMessage) {
        x xVar;
        String str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR;
        Exception exc = null;
        try {
            try {
                if (this.l) {
                    MBResourceManager.getInstance().unZip(this.k, this.c);
                }
                String resDirFromCampaign = this.l ? ResourceManager.getinstance().getResDirFromCampaign(this.g) : HTMLResourceManager.getInstance().getHtmlContentFromUrl(this.g);
                this.f.a(true);
                this.f.b(false);
                this.f.a(TextUtils.equals(this.h.get("cache", "2"), "2") ? 2 : 1);
                this.f.a(resDirFromCampaign);
                if (this.f.j()) {
                    xVar = this.i;
                    if (xVar == null) {
                        return;
                    }
                    xVar.b(this.d, this.e, this);
                    return;
                }
                x xVar2 = this.i;
                if (xVar2 != null) {
                    xVar2.a(this.d, this.e, this, new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR));
                }
            } catch (Exception e) {
                exc = e;
                if (MBridgeConstans.DEBUG) {
                    o0.a("MBridgeDownloader", "onDownloadComplete.unZip: " + exc.getMessage());
                }
                if (!this.f.j()) {
                    if (this.i != null) {
                        this.i.a(this.d, this.e, this, new MBridgeError(6, "unzip error:" + exc.getMessage()));
                        return;
                    }
                    return;
                }
                xVar = this.i;
                if (xVar == null) {
                }
            }
        } catch (Throwable th) {
            if (this.f.j()) {
                x xVar3 = this.i;
                if (xVar3 != null) {
                    xVar3.b(this.d, this.e, this);
                }
            } else if (this.i != null) {
                if (exc != null) {
                    str = "unzip error:" + exc.getMessage();
                }
                this.i.a(this.d, this.e, this, new MBridgeError(6, str));
            }
            throw th;
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onDownloadError(DownloadMessage<com.mbridge.msdk.newreward.function.core.campaign.b> downloadMessage, DownloadError downloadError) {
        this.f.a(TextUtils.equals(this.h.get("cache", "2"), "2") ? 2 : 1);
        this.f.a(false);
        this.f.b(false);
        if (!this.f.j()) {
            if (this.i != null) {
                this.i.a(this.d, this.e, this, a(downloadError));
            }
        } else {
            x xVar = this.i;
            if (xVar != null) {
                xVar.b(this.d, this.e, this);
            }
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onDownloadStart(DownloadMessage<com.mbridge.msdk.newreward.function.core.campaign.b> downloadMessage) {
    }

    @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
    public void onProgress(DownloadMessage<com.mbridge.msdk.newreward.function.core.campaign.b> downloadMessage, DownloadProgress downloadProgress) {
    }

    private String a() {
        c cVar = this.f;
        if (cVar == null) {
            return "un_known";
        }
        int iA = cVar.a();
        if (iA == 2) {
            return "download_template";
        }
        if (iA != 3) {
            return iA != 4 ? "un_known" : "download_end_card";
        }
        return "download_big_template";
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    private MBridgeError a(DownloadError downloadError) {
        String str;
        c cVar = this.f;
        if (cVar != null) {
            int iA = cVar.a();
            if (iA == 2) {
                str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_VIDEO_TEMPLATE_ERROR;
            } else if (iA == 3) {
                str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_BIG_TEMPLATE_ERROR;
            } else if (iA == 4) {
                str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_EC_TEMPLATE_ERROR;
            } else {
                str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_NETWORK_ERROR;
            }
        } else {
            str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_NETWORK_ERROR;
        }
        MBridgeError mBridgeError = new MBridgeError(2, str);
        mBridgeError.setException(downloadError.getException());
        return mBridgeError;
    }
}
