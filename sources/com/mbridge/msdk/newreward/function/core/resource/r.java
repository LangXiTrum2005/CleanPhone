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
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
abstract class r extends q implements OnDownloadStateListener<com.mbridge.msdk.newreward.function.core.campaign.b>, OnProgressStateListener<com.mbridge.msdk.newreward.function.core.campaign.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.core.campaign.b f1683a;
    private final com.mbridge.msdk.newreward.function.core.campaign.a b;
    private final b c;
    private final String d;
    private final String e;
    private DownloadRequest<?> f;
    private final String g;
    private x h;
    private final String i;
    private boolean j;

    public r(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar, b bVar2) {
        this.j = false;
        this.f1683a = bVar;
        this.b = aVar;
        this.c = bVar2;
        String strC = bVar2.c();
        this.d = strC;
        String str = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_XML) + File.separator;
        this.i = str;
        String strA = com.mbridge.msdk.newreward.function.utils.c.a(strC);
        this.e = strA;
        String strH = DM.h(str, strA.replace(".zip", "").replace(".xml", ""));
        this.g = strH;
        bVar2.b(true);
        File fileB = b(strH);
        if (fileB == null || !fileB.exists()) {
            return;
        }
        this.j = true;
        bVar2.a(1);
        bVar2.a(fileB);
        bVar2.a(true);
        bVar2.b(false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    private MBridgeError e() {
        String str;
        b bVar = this.c;
        if (bVar == null) {
            str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_NETWORK_ERROR;
        } else {
            int iA = bVar.a();
            if (iA == 2) {
                str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_VIDEO_TEMPLATE_ERROR;
            } else if (iA == 3) {
                str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_BIG_TEMPLATE_ERROR;
            } else if (iA != 4) {
                str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_NETWORK_ERROR;
            } else {
                str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_EC_TEMPLATE_ERROR;
            }
        }
        return new MBridgeError(2, str);
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.p
    public void a(int i, x xVar) {
        this.h = xVar;
        if (xVar != null) {
            xVar.a(this.f1683a, this.b, this);
        }
        if (f()) {
            if (xVar != null) {
                xVar.b(this.f1683a, this.b, this);
                return;
            }
            return;
        }
        if (this.j) {
            if (xVar != null) {
                xVar.b(this.f1683a, this.b, this);
            }
        } else {
            if (!TextUtils.isEmpty(this.d)) {
                DownloadRequest<?> downloadRequestBuild = MBDownloadManager.getInstance().download(new DownloadMessage<>(this.f1683a, this.d, this.e, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_ZIP)).withReadTimeout(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS).withConnectTimeout(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS).withWriteTimeout(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(5).withDirectoryPathInternal(this.i).withDownloadStateListener(this).withProgressStateListener(this).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).with("download_scene", "download_dynamic_view").with("do_us_fi_re", Boolean.toString(true)).build();
                this.f = downloadRequestBuild;
                downloadRequestBuild.start();
                return;
            }
            if (this.c.j()) {
                if (xVar != null) {
                    xVar.b(this.f1683a, this.b, this);
                }
            } else if (xVar != null) {
                xVar.a(this.f1683a, this.b, this, new MBridgeError(5, MBridgeError.ERROR_MESSAGE_DOWNLOAD_RESOURCE_URL_ERROR));
            }
        }
    }

    public a<?> b() {
        return this.c;
    }

    public com.mbridge.msdk.newreward.function.core.campaign.b c() {
        return this.f1683a;
    }

    public abstract String d();

    public abstract boolean f();

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onCancelDownload(DownloadMessage<com.mbridge.msdk.newreward.function.core.campaign.b> downloadMessage) {
        this.c.a(TextUtils.equals(this.f.get("cache", "2"), "2") ? 2 : 1);
        this.c.a(false);
        this.c.b(false);
        if (this.c.j()) {
            x xVar = this.h;
            if (xVar != null) {
                xVar.b(this.f1683a, this.b, this);
                return;
            }
            return;
        }
        x xVar2 = this.h;
        if (xVar2 != null) {
            xVar2.a(this.f1683a, this.b, this, new MBridgeError(4, MBridgeError.ERROR_MESSAGE_DOWNLOAD_DOWNLOAD_TIMEOUT));
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onDownloadComplete(DownloadMessage<com.mbridge.msdk.newreward.function.core.campaign.b> downloadMessage) {
        x xVar;
        try {
            try {
                MBResourceManager.getInstance().unZip(downloadMessage.getSaveFilePath(), this.i);
                this.c.a(TextUtils.equals(this.f.get("cache", "2"), "2") ? 2 : 1);
                this.c.a(true);
                this.c.b(false);
                this.c.a(b(this.g));
                this.c.a(2);
                com.mbridge.msdk.newreward.function.command.c cVarA = com.mbridge.msdk.newreward.function.command.d.b().a();
                if (cVarA != null) {
                    cVarA.a(cVarA.a("metrics_config_path", this.g + File.separator + "metrics_config.json", "resource_type", Integer.valueOf(b().a())), "SharePreReceiver");
                }
                if (this.c.j()) {
                    xVar = this.h;
                    if (xVar == null) {
                        return;
                    }
                    xVar.b(this.f1683a, this.b, this);
                    return;
                }
                x xVar2 = this.h;
                if (xVar2 != null) {
                    xVar2.a(this.f1683a, this.b, this, new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR));
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    o0.a("MBridgeDownloader", "onDownloadComplete.unZip: " + e.getMessage());
                }
                if (!this.c.j()) {
                    x xVar3 = this.h;
                    if (xVar3 != null) {
                        xVar3.a(this.f1683a, this.b, this, new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR));
                        return;
                    }
                    return;
                }
                xVar = this.h;
                if (xVar == null) {
                }
            }
        } catch (Throwable th) {
            if (this.c.j()) {
                x xVar4 = this.h;
                if (xVar4 != null) {
                    xVar4.b(this.f1683a, this.b, this);
                }
            } else {
                x xVar5 = this.h;
                if (xVar5 != null) {
                    xVar5.a(this.f1683a, this.b, this, new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR));
                }
            }
            throw th;
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onDownloadError(DownloadMessage<com.mbridge.msdk.newreward.function.core.campaign.b> downloadMessage, DownloadError downloadError) {
        this.c.a(TextUtils.equals(this.f.get("cache", "2"), "2") ? 2 : 1);
        this.c.a(false);
        this.c.b(false);
        if (this.h != null) {
            MBridgeError mBridgeErrorE = e();
            mBridgeErrorE.setException(downloadError.getException());
            this.h.a(this.f1683a, this.b, this, mBridgeErrorE);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onDownloadStart(DownloadMessage<com.mbridge.msdk.newreward.function.core.campaign.b> downloadMessage) {
    }

    @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
    public void onProgress(DownloadMessage<com.mbridge.msdk.newreward.function.core.campaign.b> downloadMessage, DownloadProgress downloadProgress) {
    }

    private File b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(DM.h(str, ".xml"));
        return (file.isFile() && file.exists()) ? file : a(str);
    }

    public com.mbridge.msdk.newreward.function.core.campaign.a a() {
        return this.b;
    }

    private File a(String str) throws Throwable {
        String strA = com.mbridge.msdk.newreward.function.utils.c.a(new File(DM.m(DM.o(str), File.separator, "template_config.json")));
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(strA);
            if (jSONArray.length() == 0) {
                return null;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("xml_type", "");
                    if (!TextUtils.isEmpty(strOptString) && TextUtils.equals(strOptString, d())) {
                        File file = new File(str + File.separator + jSONObjectOptJSONObject.optString("name", ""));
                        if (file.exists()) {
                            return file;
                        }
                    }
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.a("MBridgeDownloader", "findTemplateFile: " + e.getMessage());
            }
        }
        return null;
    }
}
