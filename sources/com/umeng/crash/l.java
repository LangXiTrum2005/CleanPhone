package com.umeng.crash;

import android.content.Context;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.utils.UMUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes3.dex */
final class l {
    public static void a(Context context, String str) {
        for (File file : k.b()) {
            a(context, str, file, false);
        }
    }

    public static void a(Context context, String str, File file, boolean z) {
        try {
            if (!j.a(context, file)) {
                UCrash.a().b("UCrash.Upload", "not send. limit skipped!");
                return;
            }
            if (z && !UMFrUtils.isOnline(context)) {
                UCrash.a().b("UCrash.Upload", "not send. no network!");
                return;
            }
            UCrash.a().a("UCrash.Upload", "send file: " + file.getName());
            if (a(str, file, z)) {
                j.b(context, file);
                file.delete();
            }
        } catch (Throwable th) {
            UCrash.a().a("UCrash.Upload", "upload failed", th);
        }
    }

    private static boolean a(String str, File file, boolean z) throws Exception {
        int i;
        int i2;
        FileInputStream fileInputStream;
        long jCurrentTimeMillis = System.currentTimeMillis();
        g gVarA = UCrash.a();
        StringBuilder sbU = AbstractC3950lJ.u("upload to ", str, "\n");
        sbU.append(file.getName());
        sbU.append(", file size: ");
        sbU.append(file.length());
        gVarA.b("UCrash.Upload", sbU.toString());
        if (file.length() < 256) {
            UCrash.a().d("UCrash.Upload", "file length < 256B, ignored");
            file.delete();
            return false;
        }
        if (file.length() > 819200) {
            UCrash.a().d("UCrash.Upload", "file length > 800K, ignored");
            file.delete();
            return false;
        }
        String str2 = c.a().b;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        try {
            httpURLConnection.setDoInput(false);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setUseCaches(false);
            if (z) {
                i = 1000;
                i2 = PathInterpolatorCompat.MAX_NUM_POINTS;
            } else {
                i = 10000;
                i2 = 30000;
            }
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Connection", "close");
            httpURLConnection.setRequestProperty("ak", str2);
            httpURLConnection.setRequestProperty("ts", String.valueOf(jCurrentTimeMillis));
            httpURLConnection.setRequestProperty("sign", UMUtils.MD5(str2 + "7EC2papS9acZxgIb" + jCurrentTimeMillis));
            httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=".concat("----WebKitFormBoundaryP0Rfzlf32iRoMhmb"));
            DataOutputStream dataOutputStream = null;
            try {
                DataOutputStream dataOutputStream2 = new DataOutputStream(httpURLConnection.getOutputStream());
                try {
                    dataOutputStream2.writeBytes("------WebKitFormBoundaryP0Rfzlf32iRoMhmb\r\n");
                    dataOutputStream2.writeBytes("Content-Disposition: form-data; name=\"file\";filename=\"" + file.getName() + "\"\r\n");
                    dataOutputStream2.writeBytes("\r\n");
                    fileInputStream = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int i3 = fileInputStream.read(bArr);
                            if (i3 <= 0) {
                                break;
                            }
                            dataOutputStream2.write(bArr, 0, i3);
                        }
                        dataOutputStream2.writeBytes("\r\n");
                        dataOutputStream2.writeBytes("------WebKitFormBoundaryP0Rfzlf32iRoMhmb--\r\n");
                        dataOutputStream2.flush();
                        k.a((Closeable) dataOutputStream2);
                        k.a(fileInputStream);
                        int responseCode = httpURLConnection.getResponseCode();
                        UCrash.a().b("UCrash.Upload", "resp code: ".concat(String.valueOf(responseCode)));
                        boolean z2 = responseCode == 200;
                        try {
                            httpURLConnection.disconnect();
                        } catch (Throwable th) {
                            UCrash.a().a("UCrash.Upload", "disconnect failed", th);
                        }
                        UCrash.a().a("UCrash.Upload", "upload cost: " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                        return z2;
                    } catch (Throwable th2) {
                        th = th2;
                        dataOutputStream = dataOutputStream2;
                        k.a((Closeable) dataOutputStream);
                        k.a(fileInputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
                fileInputStream = null;
            }
        } catch (Throwable th5) {
            try {
                httpURLConnection.disconnect();
            } catch (Throwable th6) {
                UCrash.a().a("UCrash.Upload", "disconnect failed", th6);
            }
            UCrash.a().a("UCrash.Upload", "upload cost: " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
            throw th5;
        }
    }

    public static File a(File file) {
        FileInputStream fileInputStream;
        Throwable th;
        GZIPOutputStream gZIPOutputStream;
        k.a(file.getPath());
        File file2 = new File(file.getParent(), file.getName() + ".gz");
        try {
            fileInputStream = new FileInputStream(file);
            try {
                gZIPOutputStream = new GZIPOutputStream(new FileOutputStream(file2, false));
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i <= 0) {
                            break;
                        }
                        gZIPOutputStream.write(bArr, 0, i);
                    }
                    gZIPOutputStream.finish();
                    UCrash.a().b("UCrash.Upload", "zip success, file: " + file2.getName());
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        UCrash.a().a("UCrash.Upload", "zip failed, file: " + file2.getName(), th);
                    } finally {
                        k.a((Closeable) gZIPOutputStream);
                        k.a(fileInputStream);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                gZIPOutputStream = null;
            }
        } catch (Throwable th4) {
            fileInputStream = null;
            th = th4;
            gZIPOutputStream = null;
        }
        return file2;
    }
}
