package com.mbridge.msdk.foundation.download.download;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.d;
import com.mbridge.msdk.foundation.same.directory.e;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.n0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class ResourceManager {
    public static final int EXPIRE_TIME = 259200000;
    public static final String KEY_INDEX_HTML = "foldername";
    public static final String KEY_MD5CHECK = "nc";
    public static final String KEY_MD5FILENAME = "md5filename";
    private static String TAG = "ResourceManager";
    private String mFileSaveSDDir;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class ResourceManagerHolder {
        public static ResourceManager instance = new ResourceManager();

        private ResourceManagerHolder() {
        }
    }

    public static ResourceManager getinstance() {
        return ResourceManagerHolder.instance;
    }

    private String save(String str, String str2, File file) throws Throwable {
        String strB = o0.b(str2, this.mFileSaveSDDir + "/" + SameMD5.getMD5(c1.b(str)));
        return TextUtils.isEmpty(strB) ? o0.a(file) : strB;
    }

    public void cleanZipRes() {
        try {
            if (TextUtils.isEmpty(this.mFileSaveSDDir)) {
                return;
            }
            DownloadTask.getInstance().runTask(new a() { // from class: com.mbridge.msdk.foundation.download.download.ResourceManager.1
                @Override // com.mbridge.msdk.foundation.same.task.a
                public void runTask() {
                    o0.a(ResourceManager.this.mFileSaveSDDir);
                }

                @Override // com.mbridge.msdk.foundation.same.task.a
                public void cancelTask() {
                }

                @Override // com.mbridge.msdk.foundation.same.task.a
                public void pauseTask(boolean z10) {
                }
            });
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public String getResDirFromCampaign(String str) {
        String strSubstring;
        String str2 = "";
        try {
            String str3 = this.mFileSaveSDDir + "/" + SameMD5.getMD5(c1.b(str));
            List<String> queryParameters = Uri.parse(str).getQueryParameters(KEY_INDEX_HTML);
            q0.a(TAG, "check zip 下载情况：url:" + str);
            q0.a(TAG, "check zip 下载情况：indexHtml:" + queryParameters);
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
            g gVarF = i.b().f(c.n().b());
            if (gVarF != null && !TextUtils.isEmpty(gVarF.V())) {
                d.a(str, new File(str5));
            }
            try {
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

    public void init() {
        this.mFileSaveSDDir = e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_RES);
    }

    public synchronized String saveResFile(String str, byte[] bArr) {
        String message;
        String strSave = "unknow exception ";
        if (bArr != null) {
            try {
                try {
                    if (bArr.length > 0) {
                        String str2 = this.mFileSaveSDDir + "/" + SameMD5.getMD5(c1.b(str)) + ".zip";
                        File file = new File(str2);
                        if (o0.a(bArr, file)) {
                            Uri uri = Uri.parse(str);
                            List<String> queryParameters = uri.getQueryParameters(KEY_MD5CHECK);
                            if (queryParameters == null || queryParameters.size() == 0) {
                                List<String> queryParameters2 = uri.getQueryParameters(KEY_MD5FILENAME);
                                if (queryParameters2 != null && queryParameters2.size() > 0) {
                                    String str3 = queryParameters2.get(0);
                                    if (!TextUtils.isEmpty(str3) && str3.equals(n0.a(file))) {
                                        strSave = save(str, str2, file);
                                    }
                                }
                            } else {
                                strSave = save(str, str2, file);
                            }
                        }
                        if (!TextUtils.isEmpty(strSave)) {
                            o0.a(file);
                        }
                    }
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                    }
                    message = e10.getMessage();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        message = strSave;
        return message;
    }

    private ResourceManager() {
        init();
    }
}
