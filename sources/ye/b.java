package ye;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.biometrics.BiometricPrompt;
import android.util.Log;
import java.util.HashMap;
import javax.crypto.Cipher;
import qd.i;
import zc.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Cipher f54365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f54366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v6.c f54367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f54368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f54369f;

    public /* synthetic */ b(d dVar, Cipher cipher, SharedPreferences sharedPreferences, v6.c cVar, u uVar, int i10) {
        this.f54364a = i10;
        this.f54369f = dVar;
        this.f54365b = cipher;
        this.f54366c = sharedPreferences;
        this.f54367d = cVar;
        this.f54368e = uVar;
    }

    @Override // ye.g
    public final void f(BiometricPrompt.AuthenticationResult authenticationResult) {
        switch (this.f54364a) {
            case 0:
                u uVar = this.f54368e;
                SharedPreferences sharedPreferences = this.f54366c;
                d dVar = this.f54369f;
                Context context = dVar.f54373b;
                try {
                    Log.d("FlutterSecureStorage", "Step 2/6: Decrypting all data with saved biometric cipher...");
                    ze.e eVarN = dVar.f54376e.n(context, this.f54365b);
                    HashMap mapB = dVar.b(sharedPreferences, eVarN);
                    Log.d("FlutterSecureStorage", "Step 3/6: Deleting old biometric AES key from Android KeyStore...");
                    if (dVar.f54376e.b()) {
                        try {
                            dVar.f54376e.m(context).c();
                            eVarN.d(context);
                            Log.d("FlutterSecureStorage", "Old key deleted from KeyStore");
                        } catch (Exception e10) {
                            Log.w("FlutterSecureStorage", "Failed to delete old key from KeyStore (may not exist)", e10);
                        }
                        break;
                    }
                    Log.d("FlutterSecureStorage", "Step 4/6: Updating algorithm markers to current...");
                    dVar.z(this.f54367d);
                    Log.d("FlutterSecureStorage", "Step 5/6: Initializing current non-biometric cipher...");
                    ze.e eVarI = dVar.f54376e.i(context, null);
                    Log.d("FlutterSecureStorage", "Step 6/6: Encrypting all data with current cipher...");
                    d.e(mapB, sharedPreferences, eVarI);
                    dVar.f54375d = eVarI;
                    Log.i("FlutterSecureStorage", "Biometric→Non-biometric migration completed! Data no longer requires biometric authentication.");
                    uVar.f(null);
                    return;
                } catch (Exception e11) {
                    Log.e("FlutterSecureStorage", "Failed to complete migration after authentication", e11);
                    uVar.h(e11);
                    return;
                }
            default:
                d dVar2 = this.f54369f;
                Context context2 = dVar2.f54373b;
                try {
                    Log.d("FlutterSecureStorage", "Step 2/7: Decrypting all data with saved biometric cipher...");
                    ze.e eVarN2 = dVar2.f54376e.n(context2, this.f54365b);
                    HashMap mapB2 = dVar2.b(this.f54366c, eVarN2);
                    Log.d("FlutterSecureStorage", "Step 3/7: Deleting old biometric AES key from Android KeyStore...");
                    if (dVar2.f54376e.b()) {
                        try {
                            dVar2.f54376e.m(context2).c();
                            eVarN2.d(context2);
                            Log.d("FlutterSecureStorage", "Old key deleted from KeyStore");
                        } catch (Exception e12) {
                            Log.w("FlutterSecureStorage", "Failed to delete old key from KeyStore (may not exist)", e12);
                        }
                        break;
                    }
                    Log.d("FlutterSecureStorage", "Step 4/7: Updating algorithm markers to current...");
                    dVar2.z(this.f54367d);
                    Log.d("FlutterSecureStorage", "Step 5/7: Getting current biometric cipher...");
                    Cipher cipherD = dVar2.f54376e.g(context2).d(context2);
                    if (cipherD == null) {
                        throw new Exception("Failed to get current biometric cipher");
                    }
                    Log.i("FlutterSecureStorage", "Authenticating with NEW biometric cipher to encrypt data...");
                    dVar2.a(cipherD, new i(this, cipherD, mapB2));
                    return;
                } catch (Exception e13) {
                    Log.e("FlutterSecureStorage", "Failed after first authentication", e13);
                    this.f54368e.h(e13);
                    return;
                }
        }
    }

    @Override // ye.g
    public final void h(Exception exc) {
        switch (this.f54364a) {
            case 0:
                Log.e("FlutterSecureStorage", "Biometric authentication failed for migration", exc);
                this.f54368e.h(new Exception("Migration cancelled: Biometric authentication failed", exc));
                break;
            default:
                Log.e("FlutterSecureStorage", "First biometric authentication failed for migration", exc);
                this.f54368e.h(new Exception("Migration cancelled: First biometric authentication failed", exc));
                break;
        }
    }
}
