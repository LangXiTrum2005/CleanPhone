package com.unity3d.services.core.misc;

import android.os.Handler;
import android.os.Looper;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.log.DeviceLog;
import d0.c;
import d5.u;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import wi.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class Utilities {
    public static String Sha256(String str) {
        return Sha256(str.getBytes());
    }

    public static Map<String, Object> combineJsonIntoMap(Map<String, Object> map, JSONObject jSONObject, String str) {
        HashMap map2 = new HashMap(map);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map2.put(d.h(str, next), jSONObject.opt(next));
        }
        return map2;
    }

    public static Map<String, Object> convertJsonToMap(JSONObject jSONObject) {
        return combineJsonIntoMap(new HashMap(), jSONObject);
    }

    public static <T> T getService(String str, Class cls) {
        return (T) ServiceProvider.INSTANCE.getRegistry().getService(str, c.s(cls));
    }

    public static JSONObject mergeJsonObjects(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (jSONObject == null) {
            return jSONObject2;
        }
        if (jSONObject2 == null) {
            return jSONObject;
        }
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            jSONObject3.put(next, jSONObject2.get(next));
        }
        Iterator<String> itKeys2 = jSONObject.keys();
        while (itKeys2.hasNext()) {
            String next2 = itKeys2.next();
            if (jSONObject3.has(next2) && (jSONObject3.get(next2) instanceof JSONObject) && (jSONObject.get(next2) instanceof JSONObject)) {
                jSONObject3.put(next2, mergeJsonObjects(jSONObject.getJSONObject(next2), jSONObject3.getJSONObject(next2)));
            } else {
                jSONObject3.put(next2, jSONObject.get(next2));
            }
        }
        return jSONObject3;
    }

    public static byte[] readFileBytes(File file) throws IOException {
        if (file == null || !file.exists()) {
            return null;
        }
        return Files.readAllBytes(file.toPath());
    }

    public static void runOnUiThread(Runnable runnable) {
        runOnUiThread(runnable, 0L);
    }

    public static String toHexString(byte[] bArr) {
        String string = "";
        for (byte b10 : bArr) {
            int i10 = b10 & 255;
            if (i10 <= 15) {
                string = d.h(string, "0");
            }
            StringBuilder sbI = u.i(string);
            sbI.append(Integer.toHexString(i10));
            string = sbI.toString();
        }
        return string;
    }

    public static void wrapCustomerListener(Runnable runnable) {
        try {
            runnable.run();
        } catch (Exception e10) {
            DeviceLog.error("An uncaught exception has occurred in the client application.  Exception: %s", e10.getMessage());
        }
    }

    public static boolean writeFile(File file, String str) {
        boolean z10 = false;
        if (file == null) {
            return false;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    fileOutputStream2.write(str.getBytes());
                    fileOutputStream2.flush();
                    try {
                        fileOutputStream2.close();
                    } catch (Exception e10) {
                        DeviceLog.exception("Error closing FileOutputStream", e10);
                    }
                    z10 = true;
                } catch (Exception e11) {
                    e = e11;
                    fileOutputStream = fileOutputStream2;
                    DeviceLog.exception("Could not write file", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e12) {
                            DeviceLog.exception("Error closing FileOutputStream", e12);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e13) {
                            DeviceLog.exception("Error closing FileOutputStream", e13);
                        }
                    }
                    throw th;
                }
            } catch (Exception e14) {
                e = e14;
            }
            if (z10) {
                DeviceLog.debug("Wrote file: " + file.getAbsolutePath());
            }
            return z10;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String Sha256(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr, 0, bArr.length);
            return toHexString(messageDigest.digest());
        } catch (NoSuchAlgorithmException e10) {
            DeviceLog.exception("SHA-256 algorithm not found", e10);
            return null;
        }
    }

    public static <T> T getService(Class cls) {
        return (T) getService("", cls);
    }

    public static void runOnUiThread(Runnable runnable, long j10) {
        Handler handler = new Handler(Looper.getMainLooper());
        if (j10 > 0) {
            handler.postDelayed(runnable, j10);
        } else {
            handler.post(runnable);
        }
    }

    public static String Sha256(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bArr = new byte[4096];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 != -1) {
                    messageDigest.update(bArr, 0, i10);
                } else {
                    return toHexString(messageDigest.digest());
                }
            }
        } catch (NoSuchAlgorithmException e10) {
            DeviceLog.exception("SHA-256 algorithm not found", e10);
            return null;
        }
    }

    public static Map<String, Object> combineJsonIntoMap(Map<String, Object> map, JSONObject jSONObject) {
        return combineJsonIntoMap(map, jSONObject, "");
    }
}
