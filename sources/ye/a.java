package ye;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.biometrics.BiometricPrompt;
import android.util.Log;
import com.google.android.gms.internal.measurement.nf;
import java.util.HashMap;
import javax.crypto.Cipher;
import zc.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Cipher f54358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f54359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f54360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v6.c f54361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u f54362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f54363g;

    public /* synthetic */ a(d dVar, Cipher cipher, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, v6.c cVar, u uVar, int i10) {
        this.f54357a = i10;
        this.f54363g = dVar;
        this.f54358b = cipher;
        this.f54359c = sharedPreferences;
        this.f54360d = sharedPreferences2;
        this.f54361e = cVar;
        this.f54362f = uVar;
    }

    @Override // ye.g
    public final void f(BiometricPrompt.AuthenticationResult authenticationResult) {
        switch (this.f54357a) {
            case 0:
                u uVar = this.f54362f;
                v6.c cVar = this.f54361e;
                SharedPreferences sharedPreferences = this.f54359c;
                d dVar = this.f54363g;
                try {
                    Log.d("FlutterSecureStorage", "Step 2/7: Decrypting all data from _BACKUP with saved biometric cipher...");
                    nf nfVar = dVar.f54376e;
                    Context context = dVar.f54373b;
                    ze.e eVarN = nfVar.n(context, this.f54358b);
                    HashMap mapC = dVar.c(sharedPreferences, eVarN);
                    Log.d("FlutterSecureStorage", "Step 3/7: Initializing current non-biometric cipher...");
                    ze.e eVarI = dVar.f54376e.i(context, null);
                    Log.d("FlutterSecureStorage", "Step 4/7: Encrypting all data with current cipher...");
                    d.e(mapC, sharedPreferences, eVarI);
                    Log.d("FlutterSecureStorage", "Step 5/7: Deleting backup after successful re-encryption...");
                    no.b.p(sharedPreferences, this.f54360d, cVar, dVar.f54372a.f54379c);
                    Log.d("FlutterSecureStorage", "Step 6/7: Updating algorithm markers to current...");
                    dVar.z(cVar);
                    Log.d("FlutterSecureStorage", "Step 7/7: Deleting old biometric AES key from Android KeyStore...");
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
                    dVar.f54375d = eVarI;
                    Log.i("FlutterSecureStorage", "Biometric→Non-biometric migration WITH BACKUP completed! Data no longer requires biometric authentication.");
                    uVar.f(null);
                    return;
                } catch (Exception e11) {
                    Log.e("FlutterSecureStorage", "Failed to complete migration after authentication", e11);
                    uVar.h(e11);
                    return;
                }
            default:
                d dVar2 = this.f54363g;
                try {
                    Log.d("FlutterSecureStorage", "Step 2/8: Decrypting all data from _BACKUP with saved biometric cipher...");
                    nf nfVar2 = dVar2.f54376e;
                    Context context2 = dVar2.f54373b;
                    ze.e eVarN2 = nfVar2.n(context2, this.f54358b);
                    HashMap mapC2 = dVar2.c(this.f54359c, eVarN2);
                    if (mapC2.isEmpty()) {
                        Log.i("FlutterSecureStorage", "No data found in _BACKUP keys to migrate");
                    } else {
                        Log.i("FlutterSecureStorage", "Found " + mapC2.size() + " items to migrate from _BACKUP keys");
                    }
                    Log.d("FlutterSecureStorage", "Step 3/8: Getting current biometric cipher...");
                    Cipher cipherD = dVar2.f54376e.g(context2).d(context2);
                    if (cipherD == null) {
                        throw new Exception("Failed to get current biometric cipher");
                    }
                    Log.i("FlutterSecureStorage", "Authenticating with NEW biometric cipher to encrypt data...");
                    k5.g gVar = new k5.g();
                    gVar.f44328d = this;
                    gVar.f44325a = cipherD;
                    gVar.f44326b = mapC2;
                    gVar.f44327c = eVarN2;
                    dVar2.a(cipherD, gVar);
                    return;
                } catch (Exception e12) {
                    Log.e("FlutterSecureStorage", "Failed after first authentication", e12);
                    this.f54362f.h(e12);
                    return;
                }
        }
    }

    @Override // ye.g
    public final void h(Exception exc) {
        switch (this.f54357a) {
            case 0:
                Log.e("FlutterSecureStorage", "Biometric authentication failed for migration", exc);
                this.f54362f.h(new Exception("Migration cancelled: Biometric authentication failed", exc));
                break;
            default:
                Log.e("FlutterSecureStorage", "First biometric authentication failed for migration", exc);
                this.f54362f.h(new Exception("Migration cancelled: First biometric authentication failed", exc));
                break;
        }
    }
}
