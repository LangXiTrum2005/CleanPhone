package com.adjust.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class PreinstallUtil {
    private static final long ALL_LOCATION_BITMASK = 511;
    private static final long CONTENT_PROVIDER_BITMASK = 16;
    private static final long CONTENT_PROVIDER_INTENT_ACTION_BITMASK = 32;
    private static final long CONTENT_PROVIDER_MAPS_BITMASK = 256;
    private static final long CONTENT_PROVIDER_NO_PERMISSION_BITMASK = 128;
    private static final long FILE_SYSTEM_BITMASK = 64;
    private static final long SYSTEM_PROPERTY_BITMASK = 1;
    private static final long SYSTEM_PROPERTY_PATH_BITMASK = 4;
    private static final long SYSTEM_PROPERTY_PATH_REFLECTION_BITMASK = 8;
    private static final long SYSTEM_PROPERTY_REFLECTION_BITMASK = 2;

    public static String getPayloadFromContentProviderDefault(Context context, String str, ILogger iLogger) {
        if (Util.resolveContentProvider(context, Constants.ADJUST_PREINSTALL_CONTENT_URI_AUTHORITY)) {
            return readContentProvider(context, Util.formatString("content://%s/%s", Constants.ADJUST_PREINSTALL_CONTENT_URI_AUTHORITY, Constants.ADJUST_PREINSTALL_CONTENT_URI_PATH), str, iLogger);
        }
        return null;
    }

    public static String getPayloadFromContentProviderSamsungMaps(Context context, String str, ILogger iLogger) {
        JSONObject samsungMapsAppTrackingInfo;
        if (!Util.resolveContentProvider(context, Constants.SAMSUNG_PREINSTALL_CONTENT_URI_AUTHORITY) || (samsungMapsAppTrackingInfo = getSamsungMapsAppTrackingInfo(context, str, iLogger)) == null || samsungMapsAppTrackingInfo.length() <= 0 || !Boolean.parseBoolean(samsungMapsAppTrackingInfo.optString("RESULT", "false"))) {
            return null;
        }
        try {
            String strEncodeToString = Base64.encodeToString(samsungMapsAppTrackingInfo.toString().getBytes(StandardCharsets.UTF_8), 2);
            if (strEncodeToString != null && !strEncodeToString.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, Constants.SAMSUNG_PREINSTALL_PAYLOAD_PROVIDER);
                jSONObject.put("details", strEncodeToString);
                return jSONObject.toString();
            }
            return null;
        } catch (Exception e10) {
            iLogger.error("Samsung MAPS Exception during payload json object creation from content provider Samsung maps [%s]", e10.getMessage());
            return null;
        }
    }

    public static String getPayloadFromFileSystem(String str, String str2, ILogger iLogger) {
        String fileContent = readFileContent(Constants.ADJUST_PREINSTALL_FILE_SYSTEM_PATH, iLogger);
        if (fileContent == null || fileContent.isEmpty()) {
            if (str2 != null && !str2.isEmpty()) {
                fileContent = readFileContent(str2, iLogger);
            }
            if (fileContent == null || fileContent.isEmpty()) {
                return null;
            }
        }
        return readPayloadFromJsonString(fileContent, str, iLogger);
    }

    public static String getPayloadFromSystemProperty(String str, ILogger iLogger) {
        return readSystemProperty(defpackage.e.n(Constants.ADJUST_PREINSTALL_SYSTEM_PROPERTY_PREFIX, str), iLogger);
    }

    public static String getPayloadFromSystemPropertyFilePath(String str, ILogger iLogger) {
        String fileContent;
        String systemProperty = readSystemProperty(Constants.ADJUST_PREINSTALL_SYSTEM_PROPERTY_PATH, iLogger);
        if (systemProperty == null || systemProperty.isEmpty() || (fileContent = readFileContent(systemProperty, iLogger)) == null || fileContent.isEmpty()) {
            return null;
        }
        return readPayloadFromJsonString(fileContent, str, iLogger);
    }

    public static String getPayloadFromSystemPropertyFilePathReflection(String str, ILogger iLogger) {
        String fileContent;
        String systemPropertyReflection = readSystemPropertyReflection(Constants.ADJUST_PREINSTALL_SYSTEM_PROPERTY_PATH, iLogger);
        if (systemPropertyReflection == null || systemPropertyReflection.isEmpty() || (fileContent = readFileContent(systemPropertyReflection, iLogger)) == null || fileContent.isEmpty()) {
            return null;
        }
        return readPayloadFromJsonString(fileContent, str, iLogger);
    }

    public static String getPayloadFromSystemPropertyReflection(String str, ILogger iLogger) {
        return readSystemPropertyReflection(defpackage.e.n(Constants.ADJUST_PREINSTALL_SYSTEM_PROPERTY_PREFIX, str), iLogger);
    }

    public static List<String> getPayloadsFromContentProviderIntentAction(Context context, String str, ILogger iLogger) {
        return readContentProviderIntentAction(context, str, "android.permission.INSTALL_PACKAGES", iLogger);
    }

    public static List<String> getPayloadsFromContentProviderNoPermission(Context context, String str, ILogger iLogger) {
        return readContentProviderIntentAction(context, str, null, iLogger);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0086  */
    /* JADX WARN: Code duplicated, block: B:42:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    private static JSONObject getSamsungMapsAppTrackingInfo(Context context, String str, ILogger iLogger) throws Throwable {
        Throwable th2;
        Exception exc;
        Cursor cursorQuery;
        ?? r2 = 0;
        try {
            try {
                cursorQuery = context.getContentResolver().query(Uri.parse(Util.formatString("content://%s/%s", Constants.SAMSUNG_PREINSTALL_CONTENT_URI_AUTHORITY, Constants.SAMSUNG_PREINSTALL_CONTENT_URI_PATH)), null, str, new String[]{Constants.SAMSUNG_PREINSTALL_APP_TRACKING_ID}, null);
                if (cursorQuery == null) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        cursorQuery.close();
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    for (int i10 = 0; i10 < cursorQuery.getColumnCount(); i10++) {
                        jSONObject.put(cursorQuery.getColumnName(i10), cursorQuery.getString(i10));
                    }
                    cursorQuery.close();
                    if (jSONObject.length() <= 0) {
                        cursorQuery.close();
                        return null;
                    }
                    cursorQuery.close();
                    return jSONObject;
                } catch (Exception e10) {
                    exc = e10;
                    iLogger.error("Samsung MAPS Exception read content provider error [%s]", exc.getMessage());
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Exception e11) {
                exc = e11;
                cursorQuery = null;
            } catch (Throwable th3) {
                th2 = th3;
                if (r2 != 0) {
                    throw th2;
                }
                r2.close();
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            r2 = context;
            if (r2 != 0) {
                throw th2;
            }
            r2.close();
            throw th2;
        }
    }

    public static boolean hasAllLocationsBeenRead(long j10) {
        return (j10 & ALL_LOCATION_BITMASK) == ALL_LOCATION_BITMASK;
    }

    public static boolean hasNotBeenRead(String str, long j10) {
        str.getClass();
        switch (str) {
            case "content_provider_intent_action":
                return (j10 & CONTENT_PROVIDER_INTENT_ACTION_BITMASK) != CONTENT_PROVIDER_INTENT_ACTION_BITMASK;
            case "system_properties_path_reflection":
                return (j10 & SYSTEM_PROPERTY_PATH_REFLECTION_BITMASK) != SYSTEM_PROPERTY_PATH_REFLECTION_BITMASK;
            case "content_provider":
                return (j10 & CONTENT_PROVIDER_BITMASK) != CONTENT_PROVIDER_BITMASK;
            case "system_properties_path":
                return (j10 & SYSTEM_PROPERTY_PATH_BITMASK) != SYSTEM_PROPERTY_PATH_BITMASK;
            case "system_properties_reflection":
                return (j10 & SYSTEM_PROPERTY_REFLECTION_BITMASK) != SYSTEM_PROPERTY_REFLECTION_BITMASK;
            case "system_properties":
                return (j10 & 1) != 1;
            case "content_provider_samsung_maps":
                return (j10 & CONTENT_PROVIDER_MAPS_BITMASK) != CONTENT_PROVIDER_MAPS_BITMASK;
            case "file_system":
                return (j10 & FILE_SYSTEM_BITMASK) != FILE_SYSTEM_BITMASK;
            case "content_provider_no_permission":
                return (j10 & CONTENT_PROVIDER_NO_PERMISSION_BITMASK) != CONTENT_PROVIDER_NO_PERMISSION_BITMASK;
            default:
                return false;
        }
    }

    public static long markAsRead(String str, long j10) {
        long j11;
        str.getClass();
        switch (str) {
            case "content_provider_intent_action":
                j11 = CONTENT_PROVIDER_INTENT_ACTION_BITMASK;
                break;
            case "system_properties_path_reflection":
                j11 = SYSTEM_PROPERTY_PATH_REFLECTION_BITMASK;
                break;
            case "content_provider":
                j11 = CONTENT_PROVIDER_BITMASK;
                break;
            case "system_properties_path":
                j11 = SYSTEM_PROPERTY_PATH_BITMASK;
                break;
            case "system_properties_reflection":
                j11 = SYSTEM_PROPERTY_REFLECTION_BITMASK;
                break;
            case "system_properties":
                j11 = 1;
                break;
            case "content_provider_samsung_maps":
                j11 = CONTENT_PROVIDER_MAPS_BITMASK;
                break;
            case "file_system":
                j11 = FILE_SYSTEM_BITMASK;
                break;
            case "content_provider_no_permission":
                j11 = CONTENT_PROVIDER_NO_PERMISSION_BITMASK;
                break;
            default:
                return j10;
        }
        return j10 | j11;
    }

    private static String readContentProvider(Context context, String str, String str2, ILogger iLogger) {
        try {
            Cursor cursorQuery = context.getContentResolver().query(Uri.parse(str), new String[]{"encrypted_data"}, "package_name=?", new String[]{str2}, null);
            if (cursorQuery == null) {
                iLogger.debug("Read content provider cursor null content uri [%s]", str);
                return null;
            }
            if (cursorQuery.moveToFirst()) {
                String string = cursorQuery.getString(0);
                cursorQuery.close();
                return string;
            }
            iLogger.debug("Read content provider cursor empty content uri [%s]", str);
            cursorQuery.close();
            return null;
        } catch (Exception e10) {
            iLogger.error("Exception read content provider uri [%s] error [%s]", str, e10.getMessage());
            return null;
        }
    }

    private static List<String> readContentProviderIntentAction(Context context, String str, String str2, ILogger iLogger) {
        String contentProvider;
        List<ResolveInfo> listQueryIntentContentProviders = Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().queryIntentContentProviders(new Intent(Constants.ADJUST_PREINSTALL_CONTENT_PROVIDER_INTENT_ACTION), PackageManager.ResolveInfoFlags.of(0L)) : context.getPackageManager().queryIntentContentProviders(new Intent(Constants.ADJUST_PREINSTALL_CONTENT_PROVIDER_INTENT_ACTION), 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : listQueryIntentContentProviders) {
            if (str2 == null || context.getPackageManager().checkPermission(str2, resolveInfo.providerInfo.packageName) == 0) {
                String str3 = resolveInfo.providerInfo.authority;
                if (str3 != null && !str3.isEmpty() && (contentProvider = readContentProvider(context, Util.formatString("content://%s/%s", str3, Constants.ADJUST_PREINSTALL_CONTENT_URI_PATH), str, iLogger)) != null && !contentProvider.isEmpty()) {
                    arrayList.add(contentProvider);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    private static String readFileContent(String str, ILogger iLogger) {
        File file = new File(str);
        if (file.exists() && file.isFile() && file.canRead()) {
            try {
                int length = (int) file.length();
                if (length <= 0) {
                    iLogger.debug("Read file content empty file", new Object[0]);
                    return null;
                }
                byte[] bArr = new byte[length];
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    try {
                        fileInputStream.read(bArr);
                        return new String(bArr);
                    } finally {
                        fileInputStream.close();
                    }
                } catch (Exception e10) {
                    iLogger.error("Exception read file input stream error [%s]", e10.getMessage());
                    fileInputStream.close();
                    return null;
                }
            } catch (Exception e11) {
                iLogger.error("Exception read file content error [%s]", e11.getMessage());
            }
        }
        return null;
    }

    private static String readPayloadFromJsonString(String str, String str2, ILogger iLogger) {
        try {
            return new JSONObject(str.trim()).optString(str2);
        } catch (Exception e10) {
            iLogger.error("Exception read payload from json string error [%s]", e10.getMessage());
            return null;
        }
    }

    private static String readSystemProperty(String str, ILogger iLogger) {
        try {
            return System.getProperty(str);
        } catch (Exception e10) {
            iLogger.error("Exception read system property key [%s] error [%s]", str, e10.getMessage());
            return null;
        }
    }

    private static String readSystemPropertyReflection(String str, ILogger iLogger) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            iLogger.error("Exception read system property using reflection key [%s] error [%s]", str, e10.getMessage());
            return null;
        }
    }
}
