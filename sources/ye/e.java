package ye;

import android.util.Log;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f54379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f54380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f54381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f54382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f54383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f54384h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f54385i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f54386j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f54387k;
    public final String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f54388m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f54389n;

    /* JADX WARN: Code duplicated, block: B:54:0x00e3  */
    public e(Map map) {
        String str;
        String strD = d("sharedPreferencesName", map);
        strD = strD == null ? "FlutterSecureStorage" : strD;
        this.f54377a = strD;
        String strD2 = d("preferencesKeyPrefix", map);
        this.f54379c = strD2 == null ? "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIHNlY3VyZSBzdG9yYWdlCg" : strD2;
        this.f54380d = a("resetOnError", map, false);
        this.f54381e = a("migrateOnAlgorithmChange", map, true);
        this.f54382f = a("migrateWithBackup", map, false);
        this.f54383g = a("encryptedSharedPreferences", map, false);
        this.f54384h = a("enforceBiometrics", map, false);
        String strD3 = d("biometricType", map);
        strD3 = strD3 == null ? "biometricOrDeviceCredential" : strD3;
        if (!"strongBiometricOnly".equals(strD3) && !"biometricOrDeviceCredential".equals(strD3)) {
            throw new IllegalArgumentException(defpackage.e.o("Unknown biometricType: '", strD3, "'. Expected one of: strongBiometricOnly, biometricOrDeviceCredential"));
        }
        this.f54385i = "strongBiometricOnly".equals(strD3);
        String strD4 = d("biometricPromptTitle", map);
        if (strD4 == null && (strD4 = d("prefOptionBiometricPromptTitle", map)) == null) {
            strD4 = "Authenticate to access";
        }
        this.f54386j = strD4;
        String strD5 = d("biometricPromptSubtitle", map);
        if (strD5 == null && (strD5 = d("prefOptionBiometricPromptSubtitle", map)) == null) {
            strD5 = "Use biometrics or device credentials";
        }
        this.f54387k = strD5;
        String strD6 = d("biometricPromptNegativeButton", map);
        this.l = strD6 == null ? "Cancel" : strD6;
        String strD7 = d("storageCipherAlgorithm", map);
        this.f54389n = strD7 == null ? "AES_GCM_NoPadding" : strD7;
        String strD8 = d("keyCipherAlgorithm", map);
        this.f54388m = strD8 == null ? "RSA_ECB_OAEPwithSHA_256andMGF1Padding" : strD8;
        if (map.containsKey("storageNamespace")) {
            Object obj = map.get("storageNamespace");
            if (obj instanceof String) {
                str = (String) obj;
                str = str.isEmpty() ? null : str;
            }
        }
        this.f54378b = str;
        if (str == null || "FlutterSecureStorage".equals(strD)) {
            return;
        }
        Log.w("FlutterSecureStorageConfig", l1.d.h("Both storageNamespace ('", str, "') and sharedPreferencesName ('", strD, "') are set. storageNamespace takes precedence for data prefs, config, KeyStore aliases, and key storage."));
    }

    public static boolean a(String str, Map map, boolean z10) {
        Object obj = map.get(str);
        return obj instanceof String ? Boolean.parseBoolean((String) obj) : z10;
    }

    public static String d(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof String)) {
            return null;
        }
        String str2 = (String) obj;
        if (str2.isEmpty()) {
            return null;
        }
        return str2;
    }

    public final String b() {
        String str = this.f54378b;
        if (str == null) {
            return "FlutterSecureKeyStorage";
        }
        return "FlutterSecureKeyStorage:" + str;
    }

    public final String c() {
        String str = this.f54378b;
        if (str == null) {
            return "";
        }
        return "." + str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlutterSecureStorageConfig{sharedPreferencesName='");
        sb2.append(this.f54377a);
        sb2.append("', sharedPreferencesKeyPrefix='");
        sb2.append(this.f54379c);
        sb2.append("', deleteOnFailure=");
        sb2.append(this.f54380d);
        sb2.append(", migrateOnAlgorithmChange=");
        sb2.append(this.f54381e);
        sb2.append(", migrateWithBackup=");
        sb2.append(this.f54382f);
        sb2.append(", enforceBiometrics=");
        sb2.append(this.f54384h);
        sb2.append(", storageNamespace='");
        return defpackage.e.q(this.f54378b, "'}", sb2);
    }
}
