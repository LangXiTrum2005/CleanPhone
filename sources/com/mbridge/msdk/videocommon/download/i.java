package com.mbridge.msdk.videocommon.download;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.o0;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f38244a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static i f38245a = new i(null);
    }

    public /* synthetic */ i(h hVar) {
        this();
    }

    public static i a() {
        return a.f38245a;
    }

    public void b() {
        this.f38244a = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_RES);
    }

    private i() {
        b();
    }

    public String a(String str) {
        String strSubstring;
        String str2 = "";
        try {
            String str3 = this.f38244a + "/" + SameMD5.getMD5(c1.b(str));
            List<String> queryParameters = Uri.parse(str).getQueryParameters(ResourceManager.KEY_INDEX_HTML);
            if (queryParameters == null || queryParameters.size() <= 0) {
                return null;
            }
            String str4 = queryParameters.get(0);
            if (TextUtils.isEmpty(str4)) {
                return null;
            }
            String str5 = str3 + "/" + str4 + "/" + str4 + ".html";
            if (!o0.e(str5)) {
                return null;
            }
            try {
                com.mbridge.msdk.setting.g gVarF = com.mbridge.msdk.setting.i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
                if (gVarF != null && !TextUtils.isEmpty(gVarF.V())) {
                    com.mbridge.msdk.foundation.same.d.a(str, new File(str5));
                }
                strSubstring = str.substring(str.indexOf("?") + 1);
            } catch (Exception unused) {
                strSubstring = "";
            }
            if (!TextUtils.isEmpty(strSubstring)) {
                str2 = "?" + strSubstring;
            }
            return "file://" + str5 + str2;
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            e10.printStackTrace();
            return null;
        }
    }
}
