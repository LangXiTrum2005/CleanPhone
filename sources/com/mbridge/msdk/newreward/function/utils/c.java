package com.mbridge.msdk.newreward.function.utils;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.newreward.function.common.MBridgeTaskManager;
import com.mbridge.msdk.setting.h;
import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1724a;
        final /* synthetic */ int b;
        final /* synthetic */ int c;
        final /* synthetic */ String d;

        public a(int i, int i2, int i3, String str) {
            this.f1724a = i;
            this.b = i2;
            this.c = i3;
            this.d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ivRewardEnable", 1);
                jSONObject.put("ivRewardMode", this.f1724a == com.mbridge.msdk.foundation.same.a.H ? 0 : 1);
                jSONObject.put("ivRewardPlayValueMode", this.b == com.mbridge.msdk.foundation.same.a.J ? 0 : 1);
                jSONObject.put("ivRewardPlayValue", this.c);
                h.b().i(this.d, jSONObject.toString());
            } catch (Exception unused) {
            }
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String path = new URL(str).getPath();
            return path.substring(path.lastIndexOf(47) + 1);
        } catch (Exception unused) {
            return str;
        }
    }

    public static double b(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0.0d;
        }
        try {
            String[] strArrSplit = str.split("_");
            if (strArrSplit.length < 4) {
                return 0.0d;
            }
            String str2 = strArrSplit[3];
            if (TextUtils.isEmpty(str2)) {
                return 0.0d;
            }
            String[] strArrSplit2 = i0.a(str2).split("\\|");
            if (strArrSplit2.length > 0) {
                return Double.parseDouble(strArrSplit2[0]);
            }
        } catch (Exception unused) {
        }
        return 0.0d;
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return t0.i(str);
    }

    public static boolean d(String str) {
        String[] strArrSplit;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String[] strArrSplit2 = str.split("_");
            if (strArrSplit2.length < 4) {
                return false;
            }
            String str2 = strArrSplit2[3];
            return (TextUtils.isEmpty(str2) || (strArrSplit = i0.a(str2).split("\\|")) == null || strArrSplit.length == 0) ? false : true;
        } catch (Exception unused) {
            return true;
        }
    }

    public static String a(File file) throws Throwable {
        FileInputStream fileInputStream;
        StringBuilder sb = new StringBuilder();
        FileInputStream fileInputStream2 = null;
        try {
            try {
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[1024];
                        for (int i = fileInputStream.read(bArr); i > 0; i = fileInputStream.read(bArr)) {
                            sb.append(new String(bArr, 0, i));
                        }
                        fileInputStream.close();
                    } catch (Exception unused) {
                        fileInputStream2 = fileInputStream;
                        sb.setLength(0);
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        return sb.toString();
                    } catch (Throwable th) {
                        th = th;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                }
            } catch (Exception unused3) {
            }
        } catch (Exception unused4) {
        }
        return sb.toString();
    }

    public static void a(String str, int i, int i2, int i3) {
        MBridgeTaskManager.commonExecute(new a(i, i2, i3, str));
    }
}
