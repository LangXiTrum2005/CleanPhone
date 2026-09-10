package hc;

import ac.g;
import android.util.Log;
import com.mbridge.msdk.foundation.download.Command;
import eb.d0;
import fc.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import pd.j;
import qd.n;
import zb.l;
import zb.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42304b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f42303a = i10;
        this.f42304b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        qd.c cVarA;
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th2;
        int i10 = this.f42303a;
        Object obj = this.f42304b;
        switch (i10) {
            case 0:
                com.google.android.gms.internal.consent_sdk.d dVar = (com.google.android.gms.internal.consent_sdk.d) ((d0) obj).f39977c;
                a aVar = (a) dVar.f22986f;
                e eVar = (e) dVar.f22982b;
                String str = aVar.f42296a;
                g.b();
                try {
                    HashMap mapB = a.b(eVar);
                    v9.e eVar2 = new v9.e(str, mapB);
                    eVar2.E(Command.HTTP_HEADER_USER_AGENT, "Crashlytics Android SDK/20.1.0");
                    eVar2.E("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    a.a(eVar2, eVar);
                    String str2 = "Requesting settings from " + str;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str2, null);
                    }
                    String str3 = "Settings query params were: " + mapB;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str3, null);
                    }
                    return aVar.c(eVar2.B());
                } catch (IOException e10) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e10);
                    return null;
                }
            case 1:
                return ((j) obj).a("firebase");
            case 2:
                n nVar = (n) obj;
                synchronized (nVar) {
                    cVarA = null;
                    try {
                        try {
                            fileInputStreamOpenFileInput = nVar.f49012a.openFileInput(nVar.f49013b);
                            try {
                                int iAvailable = fileInputStreamOpenFileInput.available();
                                byte[] bArr = new byte[iAvailable];
                                fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                                cVarA = qd.c.a(new JSONObject(new String(bArr, "UTF-8")));
                                fileInputStreamOpenFileInput.close();
                            } catch (FileNotFoundException | JSONException unused) {
                                if (fileInputStreamOpenFileInput != null) {
                                    fileInputStreamOpenFileInput.close();
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                if (fileInputStreamOpenFileInput != null) {
                                    fileInputStreamOpenFileInput.close();
                                }
                                throw th2;
                            }
                        } catch (FileNotFoundException | JSONException unused2) {
                            fileInputStreamOpenFileInput = null;
                        } catch (Throwable th4) {
                            fileInputStreamOpenFileInput = null;
                            th2 = th4;
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                return cVarA;
            case 3:
                return new s4.e((JsReplyProxyBoundaryInterface) obj);
            default:
                l lVar = ((r) obj).f54743h;
                lVar.getClass();
                g.a();
                wi.b bVar = lVar.f54706c;
                f fVar = (f) bVar.f53212b;
                String str4 = (String) bVar.f53211a;
                fVar.getClass();
                boolean z10 = true;
                if (new File((File) fVar.f40782d, str4).exists()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    f fVar2 = (f) bVar.f53212b;
                    fVar2.getClass();
                    new File((File) fVar2.f40782d, str4).delete();
                } else {
                    String strG = lVar.g();
                    if (strG == null || !lVar.f54713j.c(strG)) {
                        z10 = false;
                    }
                }
                return Boolean.valueOf(z10);
        }
    }
}
