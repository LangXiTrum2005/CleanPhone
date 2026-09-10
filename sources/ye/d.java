package ye;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.CancellationSignal;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.j30;
import com.google.android.gms.internal.measurement.nf;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import m5.k;
import r1.s;
import zc.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f54371f = StandardCharsets.UTF_8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f54372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f54373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f54374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ze.e f54375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public nf f54376e;

    public d(Context context) {
        this.f54373b = context.getApplicationContext();
    }

    public static void e(HashMap map, SharedPreferences sharedPreferences, ze.e eVar) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        int i10 = 0;
        for (Map.Entry entry : map.entrySet()) {
            try {
                editorEdit.putString((String) entry.getKey(), Base64.encodeToString(eVar.a(((String) entry.getValue()).getBytes(f54371f)), 0));
                i10++;
            } catch (Exception e10) {
                Log.e("FlutterSecureStorage", "Failed to encrypt key: " + ((String) entry.getKey()), e10);
                throw new Exception("Failed to encrypt data with current cipher for key: " + ((String) entry.getKey()), e10);
            }
        }
        if (!editorEdit.commit()) {
            throw new Exception("Failed to commit encrypted data to disk - storage may be full or unavailable");
        }
        Log.d("FlutterSecureStorage", "Successfully encrypted and committed " + i10 + " items with current cipher to disk");
    }

    public static void f(HashMap map, SharedPreferences sharedPreferences, v6.c cVar, ze.e eVar) throws Exception {
        SharedPreferences sharedPreferences2 = (SharedPreferences) cVar.f52487a;
        int i10 = 0;
        int i11 = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String strH = wi.d.h(str, "_MIGRATED");
            if (sharedPreferences2.contains(strH) || ((SharedPreferences) cVar.f52488b).contains(strH)) {
                i11++;
                Log.d("FlutterSecureStorage", "Skipping already-migrated key: " + str);
            } else {
                try {
                    String strEncodeToString = Base64.encodeToString(eVar.a(((String) entry.getValue()).getBytes(f54371f)), 0);
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putString(str, strEncodeToString);
                    if (!editorEdit.commit()) {
                        throw new Exception("Failed to commit encrypted data for key: " + str);
                    }
                    sharedPreferences2.edit().putBoolean(strH, true).commit();
                    i10++;
                } catch (Exception e10) {
                    Log.e("FlutterSecureStorage", "Failed to encrypt key: " + str, e10);
                    throw new Exception(defpackage.e.n("Failed to encrypt data with current cipher for key: ", str), e10);
                }
            }
        }
        Log.d("FlutterSecureStorage", l1.d.f("Encrypted ", i10, " items (skipped ", i11, " already-migrated) with current cipher"));
    }

    public static void y(v6.c cVar) {
        SharedPreferences.Editor editorEdit = ((SharedPreferences) cVar.f52487a).edit();
        editorEdit.putBoolean("ENCRYPTED_PREFERENCES_MIGRATED", true);
        editorEdit.commit();
    }

    public final void A(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.f54374c.edit();
        e eVar = this.f54372a;
        if (!eVar.f54383g || eVar.f54381e) {
            editorEdit.putString(str, Base64.encodeToString(this.f54375d.a(str2.getBytes(f54371f)), 0));
        } else {
            editorEdit.putString(str, str2);
        }
        editorEdit.apply();
    }

    public final void a(Cipher cipher, g gVar) throws Exception {
        boolean z10 = this.f54372a.f54384h;
        boolean zM = m();
        Context context = this.f54373b;
        if (zM) {
            BiometricManager biometricManager = (BiometricManager) context.getSystemService(BiometricManager.class);
            if (biometricManager != null) {
                int iCanAuthenticate = biometricManager.canAuthenticate(this.f54372a.f54385i ? 15 : 32783);
                if (iCanAuthenticate != 0) {
                    if (iCanAuthenticate != 1) {
                        if (iCanAuthenticate != 11) {
                            if (iCanAuthenticate != 12) {
                                if (iCanAuthenticate != 15) {
                                    if (z10) {
                                        throw new Exception(defpackage.e.h(iCanAuthenticate, "BIOMETRIC_UNAVAILABLE: Unknown biometric status (code: ", ")"));
                                    }
                                } else if (z10) {
                                    throw new Exception("BIOMETRIC_UNAVAILABLE: Security update required for biometric authentication");
                                }
                            } else if (z10) {
                                throw new Exception("BIOMETRIC_UNAVAILABLE: No biometric hardware detected on this device");
                            }
                        } else if (z10) {
                            throw new Exception("BIOMETRIC_UNAVAILABLE: No fingerprint or face enrolled. Please enroll in Settings.");
                        }
                    } else if (z10) {
                        throw new Exception("BIOMETRIC_UNAVAILABLE: Biometric hardware temporarily unavailable");
                    }
                    Log.w("FlutterSecureStorage", "Biometric check failed with code " + iCanAuthenticate + ", but continuing (enforceBiometrics=false)");
                }
            } else if (z10) {
                throw new Exception("BIOMETRIC_UNAVAILABLE: BiometricManager not available on this device");
            }
        } else {
            if (z10) {
                throw new Exception("BIOMETRIC_UNAVAILABLE: Device has no PIN, pattern, password, or biometric enrolled. Please secure your device in Settings.");
            }
            Log.w("FlutterSecureStorage", "Device has no security. Biometric authentication will be skipped (enforceBiometrics=false).");
        }
        BiometricPrompt.CryptoObject cryptoObject = new BiometricPrompt.CryptoObject(cipher);
        CancellationSignal cancellationSignal = new CancellationSignal();
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        BiometricPrompt.Builder subtitle = new BiometricPrompt.Builder(context).setTitle(this.f54372a.f54386j).setSubtitle(this.f54372a.f54387k);
        subtitle.setAllowedAuthenticators(this.f54372a.f54385i ? 15 : 32783);
        e eVar = this.f54372a;
        if (eVar.f54385i) {
            subtitle.setNegativeButton(eVar.l, executorServiceNewSingleThreadExecutor, new y7.e(cancellationSignal, 1));
        }
        subtitle.build().authenticate(cryptoObject, cancellationSignal, executorServiceNewSingleThreadExecutor, new c(gVar));
    }

    public final HashMap b(SharedPreferences sharedPreferences, ze.e eVar) throws Exception {
        HashMap map = new HashMap();
        int i10 = 0;
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if ((value instanceof String) && key.contains(this.f54372a.f54379c)) {
                try {
                    map.put(key, new String(eVar.c(Base64.decode((String) value, 0)), f54371f));
                    i10++;
                } catch (Exception e10) {
                    Log.e("FlutterSecureStorage", "Failed to decrypt key: ".concat(key), e10);
                    throw new Exception("Failed to decrypt existing data with saved cipher for key: ".concat(key), e10);
                }
            }
        }
        Log.d("FlutterSecureStorage", "Successfully decrypted " + i10 + " items with saved cipher");
        return map;
    }

    public final HashMap c(SharedPreferences sharedPreferences, ze.e eVar) {
        HashMap map = new HashMap();
        int i10 = 0;
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if ((value instanceof String) && key.contains(this.f54372a.f54379c) && key.endsWith("_BACKUP")) {
                try {
                    map.put(key.substring(0, key.length() - 7), new String(eVar.c(Base64.decode((String) value, 0)), f54371f));
                    i10++;
                } catch (Exception e10) {
                    Log.e("FlutterSecureStorage", "Failed to decrypt _BACKUP key (skipping): ".concat(key), e10);
                }
            }
        }
        StringBuilder sbL = l1.d.l("Successfully processed ", i10, " items from _BACKUP keys (", i10, " encrypted, ");
        sbL.append(0);
        sbL.append(" ESP)");
        Log.d("FlutterSecureStorage", sbL.toString());
        return map;
    }

    public final void d(v6.c cVar, g gVar) {
        Context context = this.f54373b;
        try {
            try {
                this.f54376e.g(context).c();
                Log.i("FlutterSecureStorage", "Deleted key from AndroidKeyStore");
            } catch (Exception e10) {
                Log.w("FlutterSecureStorage", "Failed to delete key from AndroidKeyStore (may not exist)", e10);
            }
            e eVar = this.f54372a;
            String str = eVar.f54378b;
            if (str == null) {
                str = eVar.f54377a;
            }
            context.getSharedPreferences(str, 0).edit().clear().apply();
            Log.d("FlutterSecureStorage", "Deleted all encrypted data");
            context.getSharedPreferences(this.f54372a.b(), 0).edit().clear().apply();
            Log.d("FlutterSecureStorage", "Deleted wrapped keys from SharedPreferences");
            SharedPreferences.Editor editorEdit = ((SharedPreferences) cVar.f52487a).edit();
            this.f54376e.A(editorEdit);
            editorEdit.apply();
            Log.d("FlutterSecureStorage", "Updated algorithm markers to current");
            Log.w("FlutterSecureStorage", "All data deleted. Reinitializing with new algorithm...");
            l(cVar, gVar);
        } catch (Exception e11) {
            Log.e("FlutterSecureStorage", "Failed to clean up after key mismatch", e11);
            gVar.h(e11);
        }
    }

    public final void g(v6.c cVar, g gVar, GeneralSecurityException generalSecurityException, String str) {
        Log.e("FlutterSecureStorage", "Key mismatch detected during cipher initialization: ".concat(str), generalSecurityException);
        Log.e("FlutterSecureStorage", "This typically occurs after an algorithm change.");
        Log.e("FlutterSecureStorage", "Stored key cannot be decrypted with current algorithm.");
        if (!this.f54372a.f54381e) {
            Log.w("FlutterSecureStorage", "migrateOnAlgorithmChange is disabled. Skipping data migration.");
            if (this.f54372a.f54380d) {
                Log.w("FlutterSecureStorage", "resetOnError is enabled. Deleting all data and keys to recover.");
                d(cVar, gVar);
                return;
            } else {
                Log.e("FlutterSecureStorage", "Set resetOnError=true to automatically delete data and recover.");
                Log.e("FlutterSecureStorage", "Or set migrateOnAlgorithmChange=true to preserve data during algorithm changes.");
                gVar.h(new Exception(defpackage.e.q(str, "). Enable migrateOnAlgorithmChange=true to preserve data, or resetOnError=true to delete.", new StringBuilder("Key mismatch after algorithm change (")), generalSecurityException));
                return;
            }
        }
        Log.i("FlutterSecureStorage", "migrateOnAlgorithmChange is enabled. Attempting data migration...");
        e eVar = this.f54372a;
        String str2 = eVar.f54378b;
        if (str2 == null) {
            str2 = eVar.f54377a;
        }
        Context context = this.f54373b;
        SharedPreferences sharedPreferences = context.getSharedPreferences(str2, 0);
        u uVar = new u(this, cVar, gVar, str);
        Log.i("FlutterSecureStorage", "Starting data migration from saved to current cipher algorithms...");
        try {
            String string = this.f54376e.m(context).toString();
            String str3 = this.f54372a.f54389n;
            boolean z10 = string != null && string.contains("BIOMETRIC");
            boolean z11 = str3 != null && str3.contains("BIOMETRIC");
            if (z10 || z11) {
                Log.i("FlutterSecureStorage", "Detected biometric migration: FROM=" + string + ", TO=" + str3);
                n(cVar, sharedPreferences, z10, z11, uVar);
                return;
            }
            Log.i("FlutterSecureStorage", "Detected non-biometric migration: FROM=" + string + ", TO=" + str3);
            if (!this.f54372a.f54382f) {
                v(cVar, sharedPreferences, uVar);
            } else {
                Log.i("FlutterSecureStorage", "Using migration WITH BACKUP protection");
                w(cVar, sharedPreferences, uVar);
            }
        } catch (Exception e10) {
            Log.e("FlutterSecureStorage", "Failed to start migration", e10);
            uVar.h(new Exception("Migration initialization failed", e10));
        }
    }

    public final boolean h(String str, String str2, Exception exc) {
        boolean z10 = this.f54372a.f54380d;
        String strO = str2 != null ? defpackage.e.o("key '", str2, "'") : "all data";
        String str3 = z10 ? "Attempting to delete corrupted data and retry..." : "Set resetOnError=true to automatically delete corrupted data.";
        StringBuilder sbV = defpackage.e.v("Storage operation '", str, "' failed for ", strO, ". ");
        sbV.append(str3);
        Log.e("FlutterSecureStorage", sbV.toString(), exc);
        if (!z10) {
            return false;
        }
        try {
            if (str2 != null) {
                SharedPreferences.Editor editorEdit = this.f54374c.edit();
                editorEdit.remove(str2);
                editorEdit.apply();
            } else {
                SharedPreferences.Editor editorEdit2 = this.f54374c.edit();
                editorEdit2.clear();
                editorEdit2.apply();
            }
            Log.w("FlutterSecureStorage", (str2 != null ? "Data for key has been deleted" : "All data has been deleted").concat(" completed. Retrying operation..."));
            return true;
        } catch (Exception e10) {
            Log.e("FlutterSecureStorage", "Failed to " + (str2 != null ? "delete data for key" : "delete all data") + " during error handling.", e10);
            return false;
        }
    }

    public final boolean i(af.b bVar) {
        Iterator it = ((HashMap) bVar.getAll()).keySet().iterator();
        while (it.hasNext()) {
            if (((String) it.next()).contains(this.f54372a.f54379c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, ye.d] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2, types: [v6.c] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final void j(e eVar, s sVar) {
        ?? r10;
        Object obj;
        Object obj2;
        Object obj3;
        v6.c cVar;
        SharedPreferences sharedPreferences;
        s sVar2 = sVar;
        String str = eVar.f54377a;
        String str2 = eVar.f54378b;
        if (this.f54374c != null) {
            sVar.f(null);
            return;
        }
        this.f54372a = eVar;
        String str3 = str2 != null ? str2 : str;
        boolean z10 = eVar.f54381e;
        boolean z11 = eVar.f54383g;
        Context context = this.f54373b;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(str3, 0);
        if (str2 != null) {
            str = str2;
        }
        v6.c cVar2 = new v6.c();
        cVar2.f52487a = context.getSharedPreferences("FlutterSecureStorageConfiguration:" + str, 0);
        cVar2.f52488b = context.getSharedPreferences("FlutterSecureStorageConfiguration", 0);
        SharedPreferences sharedPreferences3 = (SharedPreferences) cVar2.f52487a;
        boolean z12 = sharedPreferences3.contains("ENCRYPTED_PREFERENCES_MIGRATED") ? sharedPreferences3.getBoolean("ENCRYPTED_PREFERENCES_MIGRATED", false) : ((SharedPreferences) cVar2.f52488b).getBoolean("ENCRYPTED_PREFERENCES_MIGRATED", false);
        if (z12 || eVar.f54382f) {
            r10 = cVar2;
            obj = sharedPreferences2;
        } else {
            try {
                af.b bVarK = k(context);
                try {
                    if (i(bVarK)) {
                        Log.w("FlutterSecureStorage", "Found data in EncryptedSharedPreferences (deprecated)");
                        Log.w("FlutterSecureStorage", "EncryptedSharedPreferences is DEPRECATED and will be removed in a later version");
                        Log.w("FlutterSecureStorage", "The Jetpack Security library has been deprecated by Google.");
                        if (!z10) {
                            Log.w("FlutterSecureStorage", "Data found in EncryptedSharedPreferences, but migrateOnAlgorithmChange is set to false.");
                            Log.w("FlutterSecureStorage", "Set migrateOnAlgorithmChange=true to migrate to custom cipher storage.");
                            if (z11) {
                                Log.i("FlutterSecureStorage", "Using EncryptedSharedPreferences (migration disabled).");
                                this.f54374c = bVarK;
                                sVar.f(null);
                                return;
                            } else {
                                Log.e("FlutterSecureStorage", "Data exists in EncryptedSharedPreferences but encryptedSharedPreferences=false and migrateOnAlgorithmChange=false.");
                                Log.e("FlutterSecureStorage", "Either set encryptedSharedPreferences=true to use the old data, or set migrateOnAlgorithmChange=true to migrate it.");
                                sVar.h(new Exception("EncryptedSharedPreferences data found but migration is disabled. Set migrateOnAlgorithmChange=true to migrate."));
                                return;
                            }
                        }
                        Log.i("FlutterSecureStorage", "Migrating data from EncryptedSharedPreferences to custom cipher storage...");
                        if (z11) {
                            Log.w("FlutterSecureStorage", "Your data will be automatically migrated. You can safely remove encryptedSharedPreferences from your config after migration.");
                        }
                        Log.i("FlutterSecureStorage", "Migrating data from EncryptedSharedPreferences to selected custom cipher storage...");
                        try {
                            l(cVar2, new nf((d) this, bVarK, sharedPreferences2, cVar2, sVar2));
                            return;
                        } catch (Exception e10) {
                            e = e10;
                            obj3 = sharedPreferences2;
                            obj2 = cVar2;
                            sVar2 = sVar2;
                            Log.e("FlutterSecureStorage", "EncryptedSharedPreferences initialization failed. Falling back to custom ciphers.", e);
                            obj = obj3;
                            r10 = obj2;
                            obj = sharedPreferences;
                            obj = sharedPreferences;
                            r10 = cVar;
                            r10 = cVar;
                            if (this.f54374c == null) {
                                if (z11) {
                                    Log.i("FlutterSecureStorage", "Data already migrated, encryptedSharedPreferences ignored and can be safely removed.");
                                }
                                l(r10, new s(this, obj, sVar2, false, 13));
                            }
                        }
                    }
                    cVar = cVar2;
                    sharedPreferences = sharedPreferences2;
                    Log.d("FlutterSecureStorage", "No data found in EncryptedSharedPreferences.");
                    if (z11 && !z10) {
                        Log.w("FlutterSecureStorage", "Using EncryptedSharedPreferences (deprecated). Consider migrating to custom ciphers.");
                        this.f54374c = bVarK;
                        sVar.f(null);
                        return;
                    }
                } catch (Exception e11) {
                    e = e11;
                    obj3 = bVarK;
                    obj2 = context;
                }
            } catch (Exception e12) {
                e = e12;
                obj2 = cVar2;
                obj3 = sharedPreferences2;
            }
        }
        obj = sharedPreferences;
        obj = sharedPreferences;
        r10 = cVar;
        r10 = cVar;
        if (this.f54374c == null) {
            if (z11 && z12) {
                Log.i("FlutterSecureStorage", "Data already migrated, encryptedSharedPreferences ignored and can be safely removed.");
            }
            l(r10, new s(this, obj, sVar2, false, 13));
        }
    }

    public final af.b k(Context context) {
        context.getApplicationContext();
        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setEncryptionPaddings("NoPadding").setBlockModes("GCM").setKeySize(NotificationCompat.FLAG_LOCAL_ONLY).build();
        if (!"_androidx_security_master_key_".equals(af.c.a(keyGenParameterSpecBuild))) {
            throw new IllegalArgumentException("KeyGenParamSpec's key alias does not match provided alias (_androidx_security_master_key_ vs " + af.c.a(keyGenParameterSpecBuild));
        }
        if (keyGenParameterSpecBuild == null) {
            throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
        }
        if (keyGenParameterSpecBuild.getKeySize() != 256) {
            throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpecBuild.getKeySize() + " bits");
        }
        if (!Arrays.equals(keyGenParameterSpecBuild.getBlockModes(), new String[]{"GCM"})) {
            throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(keyGenParameterSpecBuild.getBlockModes()));
        }
        if (keyGenParameterSpecBuild.getPurposes() != 3) {
            throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + keyGenParameterSpecBuild.getPurposes());
        }
        if (!Arrays.equals(keyGenParameterSpecBuild.getEncryptionPaddings(), new String[]{"NoPadding"})) {
            throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(keyGenParameterSpecBuild.getEncryptionPaddings()));
        }
        if (keyGenParameterSpecBuild.isUserAuthenticationRequired() && keyGenParameterSpecBuild.getUserAuthenticationValidityDurationSeconds() < 1) {
            throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
        }
        synchronized (af.d.f3559a) {
            String keystoreAlias = keyGenParameterSpecBuild.getKeystoreAlias();
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (!keyStore.containsAlias(keystoreAlias)) {
                try {
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    keyGenerator.init(keyGenParameterSpecBuild);
                    keyGenerator.generateKey();
                } catch (ProviderException e10) {
                    throw new GeneralSecurityException(e10.getMessage(), e10);
                }
            }
        }
        String keystoreAlias2 = keyGenParameterSpecBuild.getKeystoreAlias();
        e eVar = this.f54372a;
        String str = eVar.f54378b;
        if (str == null) {
            str = eVar.f54377a;
        }
        bb.f.a();
        wa.a.a();
        Context applicationContext = context.getApplicationContext();
        fc.f fVar = new fc.f(4);
        fVar.f40785g = r9.b.k("AES256_SIV");
        if (applicationContext == null) {
            throw new IllegalArgumentException("need an Android context");
        }
        fVar.f40781c = applicationContext;
        fVar.f40780b = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
        fVar.f40782d = str;
        String strN = defpackage.e.n("android-keystore://", keystoreAlias2);
        if (!strN.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        fVar.f40783e = strN;
        k kVarA = fVar.g().a();
        fc.f fVar2 = new fc.f(4);
        fVar2.f40785g = r9.b.k("AES256_GCM");
        fVar2.f40781c = applicationContext;
        fVar2.f40780b = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
        fVar2.f40782d = str;
        String strN2 = defpackage.e.n("android-keystore://", keystoreAlias2);
        if (!strN2.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        fVar2.f40783e = strN2;
        k kVarA2 = fVar2.g().a();
        return new af.b(str, applicationContext.getSharedPreferences(str, 0), (va.a) kVarA2.x(va.a.class), (va.b) kVarA.x(va.b.class));
    }

    public final void l(v6.c cVar, g gVar) {
        Context context = this.f54373b;
        try {
            e eVar = this.f54372a;
            nf nfVar = new nf(cVar, eVar.f54388m, eVar.f54389n, eVar);
            this.f54376e = nfVar;
            if (nfVar.v()) {
                Log.w("FlutterSecureStorage", "Algorithm changed detected.");
                g(cVar, gVar, null, "Algorithm changed detected");
                return;
            }
            Cipher cipherD = this.f54376e.g(context).d(context);
            boolean z10 = this.f54372a.f54384h;
            boolean zM = m();
            if (cipherD != null && (z10 || zM)) {
                a(cipherD, new wi.b(this, gVar));
                return;
            }
            this.f54375d = this.f54376e.i(context, cipherD);
            gVar.f(null);
        } catch (InvalidKeyException e10) {
            g(cVar, gVar, e10, "Invalid key, key type incompatible with cipher");
        } catch (NoSuchAlgorithmException e11) {
            Log.e("FlutterSecureStorage", "Cryptographic algorithm not available on this device", e11);
            gVar.h(new Exception("Required cryptographic algorithm not supported by device.", e11));
        } catch (BadPaddingException e12) {
            g(cVar, gVar, e12, "Bad padding, wrong key for cipher algorithm");
        } catch (IllegalBlockSizeException e13) {
            g(cVar, gVar, e13, "Illegal block size, wrong cipher configuration");
        } catch (Exception e14) {
            Log.e("FlutterSecureStorage", "Failed to initialize storage cipher", e14);
            gVar.h(e14);
        }
    }

    public final boolean m() {
        KeyguardManager keyguardManager = (KeyguardManager) this.f54373b.getSystemService("keyguard");
        return keyguardManager != null && keyguardManager.isDeviceSecure();
    }

    public final void n(v6.c cVar, SharedPreferences sharedPreferences, boolean z10, boolean z11, u uVar) {
        Log.i("FlutterSecureStorage", "Starting biometric migration (authentication required)...");
        Log.i("FlutterSecureStorage", "Migration direction: FROM biometric=" + z10 + ", TO biometric=" + z11);
        try {
            boolean z12 = this.f54372a.f54382f;
            if (z12) {
                Log.i("FlutterSecureStorage", "Using biometric migration WITH BACKUP protection");
            }
            if (z10 && !z11) {
                Log.i("FlutterSecureStorage", "You will be prompted to authenticate with your OLD biometric settings to decrypt existing data.");
                if (z12) {
                    r(cVar, sharedPreferences, uVar);
                    return;
                } else {
                    q(cVar, sharedPreferences, uVar);
                    return;
                }
            }
            if (z10 || !z11) {
                Log.i("FlutterSecureStorage", "You will be prompted to authenticate twice (once for decrypt, once for encrypt).");
                if (z12) {
                    p(cVar, sharedPreferences, uVar);
                    return;
                } else {
                    o(cVar, sharedPreferences, uVar);
                    return;
                }
            }
            Log.i("FlutterSecureStorage", "You will be prompted to authenticate with your NEW biometric settings to encrypt data.");
            if (z12) {
                u(cVar, sharedPreferences, uVar);
            } else {
                t(cVar, sharedPreferences, uVar);
            }
        } catch (Exception e10) {
            Log.e("FlutterSecureStorage", "Biometric migration failed", e10);
            uVar.h(new Exception("Biometric migration failed", e10));
        }
    }

    public final void o(v6.c cVar, SharedPreferences sharedPreferences, u uVar) {
        Context context = this.f54373b;
        try {
            Log.d("FlutterSecureStorage", "Step 1/7: Getting saved biometric cipher...");
            Cipher cipherD = this.f54376e.m(context).d(context);
            try {
                if (cipherD == null) {
                    throw new Exception("Failed to get saved biometric cipher");
                }
                Log.i("FlutterSecureStorage", "Authenticating with OLD biometric cipher to decrypt data...");
                a(cipherD, new b(this, cipherD, sharedPreferences, cVar, uVar, 1));
                return;
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
        }
        Exception exc = e;
        Log.e("FlutterSecureStorage", "Failed to initialize biometric-to-biometric migration", exc);
        uVar.h(exc);
    }

    public final void p(v6.c cVar, SharedPreferences sharedPreferences, u uVar) {
        Exception exc;
        Context context = this.f54373b;
        try {
            SharedPreferences sharedPreferences2 = context.getSharedPreferences("FlutterSecureKeyStorage", 0);
            String string = ((SharedPreferences) cVar.f52487a).getString("FlutterSecureStorageBackupStatus", null);
            if (string == null) {
                string = ((SharedPreferences) cVar.f52488b).getString("FlutterSecureStorageBackupStatus", null);
            }
            if (!CampaignEx.JSON_NATIVE_VIDEO_COMPLETE.equals(string)) {
                try {
                    Log.i("FlutterSecureStorage", "Creating backup before biometric→biometric migration...");
                    e eVar = this.f54372a;
                    no.b.i(sharedPreferences, sharedPreferences2, cVar, eVar, eVar.f54379c);
                    Log.i("FlutterSecureStorage", "Backup created successfully");
                } catch (Exception e10) {
                    exc = e10;
                }
            }
            Log.d("FlutterSecureStorage", "Step 1/8: Getting saved biometric cipher...");
            Cipher cipherD = this.f54376e.m(context).d(context);
            try {
                if (cipherD == null) {
                    throw new Exception("Failed to get saved biometric cipher");
                }
                Log.i("FlutterSecureStorage", "Authenticating with OLD biometric cipher to decrypt data...");
                a(cipherD, new a(this, cipherD, sharedPreferences, sharedPreferences2, cVar, uVar, 1));
                return;
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
        }
        exc = e;
        Log.e("FlutterSecureStorage", "Failed to initialize biometric-to-biometric migration with backup", exc);
        uVar.h(exc);
    }

    public final void q(v6.c cVar, SharedPreferences sharedPreferences, u uVar) {
        Context context = this.f54373b;
        try {
            Log.d("FlutterSecureStorage", "Step 1/6: Getting saved biometric cipher...");
            Cipher cipherD = this.f54376e.m(context).d(context);
            try {
                if (cipherD == null) {
                    throw new Exception("Failed to get saved biometric cipher");
                }
                Log.i("FlutterSecureStorage", "Authenticating with OLD biometric cipher to decrypt data...");
                a(cipherD, new b(this, cipherD, sharedPreferences, cVar, uVar, 0));
                return;
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
        }
        Exception exc = e;
        Log.e("FlutterSecureStorage", "Failed to initialize biometric migration", exc);
        uVar.h(exc);
    }

    public final void r(v6.c cVar, SharedPreferences sharedPreferences, u uVar) {
        Exception exc;
        Context context = this.f54373b;
        try {
            SharedPreferences sharedPreferences2 = context.getSharedPreferences("FlutterSecureKeyStorage", 0);
            String string = ((SharedPreferences) cVar.f52487a).getString("FlutterSecureStorageBackupStatus", null);
            if (string == null) {
                string = ((SharedPreferences) cVar.f52488b).getString("FlutterSecureStorageBackupStatus", null);
            }
            if (!CampaignEx.JSON_NATIVE_VIDEO_COMPLETE.equals(string)) {
                try {
                    Log.i("FlutterSecureStorage", "Creating backup before biometric→non-biometric migration...");
                    e eVar = this.f54372a;
                    no.b.i(sharedPreferences, sharedPreferences2, cVar, eVar, eVar.f54379c);
                    Log.i("FlutterSecureStorage", "Backup created successfully");
                } catch (Exception e10) {
                    exc = e10;
                }
            }
            Log.d("FlutterSecureStorage", "Step 1/7: Getting saved biometric cipher...");
            Cipher cipherD = this.f54376e.m(context).d(context);
            try {
                if (cipherD == null) {
                    throw new Exception("Failed to get saved biometric cipher");
                }
                Log.i("FlutterSecureStorage", "Authenticating with OLD biometric cipher to decrypt data...");
                a(cipherD, new a(this, cipherD, sharedPreferences, sharedPreferences2, cVar, uVar, 0));
                return;
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
        }
        exc = e;
        Log.e("FlutterSecureStorage", "Failed to initialize biometric migration with backup", exc);
        uVar.h(exc);
    }

    public final void s(af.b bVar, SharedPreferences sharedPreferences, ze.e eVar) {
        int i10 = 0;
        for (Map.Entry entry : ((HashMap) bVar.getAll()).entrySet()) {
            Object value = entry.getValue();
            String str = (String) entry.getKey();
            if (value instanceof String) {
                String str2 = (String) value;
                if (str.contains(this.f54372a.f54379c)) {
                    sharedPreferences.edit().putString(str, Base64.encodeToString(eVar.a(str2.getBytes(f54371f)), 0)).apply();
                    af.a aVar = (af.a) bVar.edit();
                    aVar.remove(str);
                    aVar.apply();
                    i10++;
                    StringBuilder sb2 = new StringBuilder("Migrated key: ");
                    sb2.append(str.replaceFirst(this.f54372a.f54379c + '_', ""));
                    Log.d("FlutterSecureStorage", sb2.toString());
                }
            }
        }
        Log.i("FlutterSecureStorage", "Migration complete: " + i10 + " items migrated from EncryptedSharedPreferences to custom cipher storage");
    }

    public final void t(v6.c cVar, SharedPreferences sharedPreferences, u uVar) {
        Exception exc;
        Context context = this.f54373b;
        try {
            Log.d("FlutterSecureStorage", "Step 1/6: Decrypting all data with saved non-biometric cipher...");
            ze.e eVarN = this.f54376e.n(context, null);
            HashMap mapB = b(sharedPreferences, eVarN);
            Log.d("FlutterSecureStorage", "Step 2/6: Deleting old RSA key from Android KeyStore...");
            if (this.f54376e.b()) {
                try {
                    this.f54376e.m(context).c();
                    eVarN.d(context);
                    Log.d("FlutterSecureStorage", "Old key deleted from KeyStore");
                } catch (Exception e10) {
                    try {
                        Log.w("FlutterSecureStorage", "Failed to delete old key from KeyStore (may not exist)", e10);
                    } catch (Exception e11) {
                        exc = e11;
                    }
                }
            }
            Log.d("FlutterSecureStorage", "Step 3/6: Updating algorithm markers to current...");
            z(cVar);
            Log.d("FlutterSecureStorage", "Step 4/6: Getting current biometric cipher...");
            Cipher cipherD = this.f54376e.g(context).d(context);
            try {
                if (cipherD == null) {
                    throw new Exception("Failed to get current biometric cipher");
                }
                Log.i("FlutterSecureStorage", "Authenticating with NEW biometric cipher to encrypt data...");
                a(cipherD, new nf(this, cipherD, mapB, sharedPreferences, uVar));
                return;
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Exception e13) {
            e = e13;
        }
        exc = e;
        Log.e("FlutterSecureStorage", "Failed to initialize biometric migration", exc);
        uVar.h(exc);
    }

    public final void u(v6.c cVar, SharedPreferences sharedPreferences, u uVar) {
        Context context = this.f54373b;
        try {
            SharedPreferences sharedPreferences2 = context.getSharedPreferences("FlutterSecureKeyStorage", 0);
            String string = ((SharedPreferences) cVar.f52487a).getString("FlutterSecureStorageBackupStatus", null);
            if (string == null) {
                string = ((SharedPreferences) cVar.f52488b).getString("FlutterSecureStorageBackupStatus", null);
            }
            if (!CampaignEx.JSON_NATIVE_VIDEO_COMPLETE.equals(string)) {
                Log.i("FlutterSecureStorage", "Creating backup before non-biometric→biometric migration...");
                e eVar = this.f54372a;
                no.b.i(sharedPreferences, sharedPreferences2, cVar, eVar, eVar.f54379c);
                Log.i("FlutterSecureStorage", "Backup created successfully");
            }
            Log.d("FlutterSecureStorage", "Step 1/7: Decrypting all data from _BACKUP with saved non-biometric cipher...");
            ze.e eVarN = this.f54376e.n(context, null);
            HashMap mapC = c(sharedPreferences, eVarN);
            Log.d("FlutterSecureStorage", "Step 2/7: Getting current biometric cipher...");
            Cipher cipherD = this.f54376e.g(context).d(context);
            if (cipherD == null) {
                throw new Exception("Failed to get current biometric cipher");
            }
            Log.i("FlutterSecureStorage", "Authenticating with NEW biometric cipher to encrypt data...");
            a(cipherD, new j30(this, cipherD, mapC, sharedPreferences, sharedPreferences2, cVar, eVarN, uVar, false));
        } catch (Exception e10) {
            Log.e("FlutterSecureStorage", "Failed to initialize biometric migration with backup", e10);
            uVar.h(e10);
        }
    }

    public final void v(v6.c cVar, SharedPreferences sharedPreferences, u uVar) {
        Context context = this.f54373b;
        Log.i("FlutterSecureStorage", "Starting non-biometric migration (no authentication required)...");
        try {
            Log.d("FlutterSecureStorage", "Step 1/6: Initializing saved cipher...");
            ze.e eVarN = this.f54376e.n(context, null);
            Log.d("FlutterSecureStorage", "Step 2/6: Decrypting all data with saved cipher...");
            HashMap mapB = b(sharedPreferences, eVarN);
            Log.d("FlutterSecureStorage", "Step 3/6: Deleting old RSA key from Android KeyStore...");
            if (this.f54376e.b()) {
                try {
                    this.f54376e.m(context).c();
                    eVarN.d(context);
                    Log.d("FlutterSecureStorage", "Old key deleted from KeyStore");
                } catch (Exception e10) {
                    Log.w("FlutterSecureStorage", "Failed to delete old key from KeyStore (may not exist)", e10);
                }
            }
            Log.d("FlutterSecureStorage", "Step 4/6: Updating algorithm markers to current...");
            z(cVar);
            Log.d("FlutterSecureStorage", "Step 5/6: Initializing current cipher with fresh AES key...");
            ze.e eVarI = this.f54376e.i(context, null);
            if (mapB.isEmpty()) {
                Log.i("FlutterSecureStorage", "Step 6/6: No data to migrate, continuing...");
            } else {
                Log.d("FlutterSecureStorage", "Step 6/6: Encrypting all data with current cipher...");
                e(mapB, sharedPreferences, eVarI);
            }
            this.f54375d = eVarI;
            Log.i("FlutterSecureStorage", "Non-biometric migration completed successfully! Migrated " + mapB.size() + " items.");
            uVar.f(null);
        } catch (Exception e11) {
            Log.e("FlutterSecureStorage", "Non-biometric migration failed", e11);
            uVar.h(new Exception("Non-biometric migration failed", e11));
        }
    }

    public final void w(v6.c cVar, SharedPreferences sharedPreferences, u uVar) {
        Context context = this.f54373b;
        Log.i("FlutterSecureStorage", "Starting non-biometric migration WITH BACKUP (rename operation)...");
        try {
            SharedPreferences sharedPreferences2 = context.getSharedPreferences("FlutterSecureKeyStorage", 0);
            Log.d("FlutterSecureStorage", "Step 1/8: Creating backup (copy originals to _BACKUP, keep originals)...");
            if (this.f54376e.b()) {
                e eVar = this.f54372a;
                no.b.i(sharedPreferences, sharedPreferences2, cVar, eVar, eVar.f54379c);
                Log.i("FlutterSecureStorage", "Backup step complete - originals preserved alongside _BACKUP copies");
            } else {
                Log.i("FlutterSecureStorage", "No algorithm change detected, skipping backup");
            }
            Log.d("FlutterSecureStorage", "Step 2/8: Restoring wrapped keys from _BACKUP and initializing saved cipher...");
            boolean zW = no.b.w(this.f54372a.f54379c, cVar);
            HashMap map = new HashMap();
            if (zW) {
                for (Map.Entry<String, ?> entry : sharedPreferences2.getAll().entrySet()) {
                    String key = entry.getKey();
                    if (!key.endsWith("_BACKUP") && (entry.getValue() instanceof String)) {
                        map.put(key, (String) entry.getValue());
                    }
                }
                Log.d("FlutterSecureStorage", "Step 2/8: _MIGRATED markers found — saved " + map.size() + " new key entries; temporarily restoring _BACKUP blobs for savedCipher init");
            }
            SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
            for (Map.Entry<String, ?> entry2 : sharedPreferences2.getAll().entrySet()) {
                String key2 = entry2.getKey();
                if (key2.endsWith("_BACKUP") && (entry2.getValue() instanceof String)) {
                    editorEdit.putString(key2.substring(0, key2.length() - 7), (String) entry2.getValue());
                }
            }
            editorEdit.commit();
            ze.e eVarN = this.f54376e.n(context, null);
            if (zW && !map.isEmpty()) {
                SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                for (Map.Entry entry3 : map.entrySet()) {
                    editorEdit2.putString((String) entry3.getKey(), (String) entry3.getValue());
                }
                editorEdit2.commit();
                Log.d("FlutterSecureStorage", "Step 2/8: New wrapped key restored to keyStorage after savedCipher init");
            }
            Log.d("FlutterSecureStorage", "Step 3/8: Decrypting all data from _BACKUP keys...");
            HashMap mapC = c(sharedPreferences, eVarN);
            Log.d("FlutterSecureStorage", "Successfully decrypted " + mapC.size() + " items from _BACKUP keys");
            Log.d("FlutterSecureStorage", "Step 4/8: Deleting original encrypted entries (preserving already-migrated)...");
            no.b.s(sharedPreferences, sharedPreferences2, cVar, this.f54372a.f54379c);
            if (mapC.isEmpty()) {
                Log.i("FlutterSecureStorage", "No data found to migrate");
            } else {
                Log.i("FlutterSecureStorage", "Found " + mapC.size() + " items to migrate");
            }
            Log.d("FlutterSecureStorage", "Step 5/8: Initializing current cipher with new algorithm...");
            ze.e eVarI = this.f54376e.i(context, null);
            if (mapC.isEmpty()) {
                Log.i("FlutterSecureStorage", "Step 6/8: No data to encrypt, skipping...");
            } else {
                Log.d("FlutterSecureStorage", "Step 6/8: Encrypting all data with current cipher (per-key tracking)...");
                String str = this.f54372a.f54379c;
                f(mapC, sharedPreferences, cVar, eVarI);
            }
            Log.d("FlutterSecureStorage", "Step 7/8: Checking for ESP data to migrate...");
            SharedPreferences sharedPreferences3 = (SharedPreferences) cVar.f52487a;
            if (!(sharedPreferences3.contains("ENCRYPTED_PREFERENCES_MIGRATED") ? sharedPreferences3.getBoolean("ENCRYPTED_PREFERENCES_MIGRATED", false) : ((SharedPreferences) cVar.f52488b).getBoolean("ENCRYPTED_PREFERENCES_MIGRATED", false))) {
                try {
                    af.b bVarK = k(context);
                    if (i(bVarK)) {
                        Log.i("FlutterSecureStorage", "Found ESP data - migrating to custom cipher storage...");
                        s(bVarK, sharedPreferences, eVarI);
                        y(cVar);
                        Log.i("FlutterSecureStorage", "ESP migration completed successfully");
                    } else {
                        Log.d("FlutterSecureStorage", "No ESP data found");
                    }
                } catch (Exception e10) {
                    Log.w("FlutterSecureStorage", "ESP migration failed or ESP not available: " + e10.getMessage());
                }
            }
            Log.d("FlutterSecureStorage", "Step 8/8: Cleaning up - deleting _BACKUP, _MIGRATED markers, updating markers, deleting old keys...");
            no.b.p(sharedPreferences, sharedPreferences2, cVar, this.f54372a.f54379c);
            no.b.r(this.f54372a.f54379c, cVar);
            z(cVar);
            if (this.f54376e.b()) {
                try {
                    this.f54376e.m(context).c();
                    eVarN.d(context);
                    Log.d("FlutterSecureStorage", "Old RSA keys deleted from KeyStore");
                } catch (Exception e11) {
                    Log.w("FlutterSecureStorage", "Failed to delete old key from KeyStore (may not exist)", e11);
                }
            }
            this.f54375d = eVarI;
            Log.i("FlutterSecureStorage", "Non-biometric migration WITH BACKUP completed successfully!");
            Log.i("FlutterSecureStorage", "Migrated " + mapC.size() + " data items with new algorithm.");
            uVar.f(null);
        } catch (Exception e12) {
            Log.e("FlutterSecureStorage", "Non-biometric migration with backup failed", e12);
            uVar.h(new Exception("Non-biometric migration with backup failed", e12));
        }
    }

    public final HashMap x() {
        Map<String, ?> all = this.f54374c.getAll();
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (entry.getKey().contains(this.f54372a.f54379c)) {
                String strReplaceFirst = entry.getKey().replaceFirst(this.f54372a.f54379c + '_', "");
                e eVar = this.f54372a;
                if (!eVar.f54383g || eVar.f54381e) {
                    String str = (String) entry.getValue();
                    map.put(strReplaceFirst, str == null ? null : new String(this.f54375d.c(Base64.decode(str, 0)), f54371f));
                } else {
                    map.put(strReplaceFirst, (String) entry.getValue());
                }
            }
        }
        return map;
    }

    public final void z(v6.c cVar) {
        SharedPreferences.Editor editorEdit = ((SharedPreferences) cVar.f52487a).edit();
        this.f54376e.A(editorEdit);
        editorEdit.commit();
        Log.d("FlutterSecureStorage", "Algorithm markers updated to current");
    }
}
