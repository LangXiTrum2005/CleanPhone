package com.mbridge.msdk.videocommon.download;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static d f38234h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<String> f38235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentMap<String, Object> f38236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i f38237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f f38238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f38239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f38240f = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f38241g = "down_type";

    private d() {
        this.f38239e = false;
        try {
            this.f38237c = i.a();
            this.f38238d = f.a();
            this.f38235a = new CopyOnWriteArrayList<>();
            this.f38236b = new ConcurrentHashMap();
            com.mbridge.msdk.setting.g gVarF = com.mbridge.msdk.setting.i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarF != null) {
                this.f38239e = gVarF.b(1);
            }
        } catch (Throwable th2) {
            q0.b("H5DownLoadManager", th2.getMessage(), th2);
        }
    }

    public static synchronized d a() {
        try {
            if (f38234h == null) {
                f38234h = new d();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f38234h;
    }

    private String b(String str) {
        f fVar = this.f38238d;
        return fVar != null ? fVar.b(str) : str;
    }

    public String c(String str) {
        i iVar = this.f38237c;
        if (iVar != null) {
            return iVar.a(str);
        }
        return null;
    }

    public String a(String str) {
        try {
            if (Patterns.WEB_URL.matcher(str).matches() || URLUtil.isValidUrl(str)) {
                Uri uri = Uri.parse(str);
                String path = uri.getPath();
                if (!TextUtils.isEmpty(path) && TextUtils.isEmpty(uri.getQueryParameter("urlDebug"))) {
                    if (path.toLowerCase().endsWith(".zip")) {
                        return c(str);
                    }
                    return b(str);
                }
            }
            return str;
        } catch (Exception e10) {
            e10.printStackTrace();
            return str;
        }
    }
}
