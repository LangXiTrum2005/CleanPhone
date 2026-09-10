package g9;

import android.util.Log;
import b2.p;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f41748c = new p("RevokeAccessOperation", new String[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.internal.l f41750b;

    public c(String str) {
        c0.e(str);
        this.f41749a = str;
        this.f41750b = new com.google.android.gms.common.api.internal.l(null, 0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = f41748c;
        Status status = Status.f11651g;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f41749a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f11649e;
            } else {
                Log.e((String) pVar.f5364c, pVar.e("Unable to revoke access!", new Object[0]));
            }
            pVar.d("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e10) {
            Log.e((String) pVar.f5364c, pVar.e("IOException when revoking access: ".concat(String.valueOf(e10.toString())), new Object[0]));
        } catch (Exception e11) {
            Log.e((String) pVar.f5364c, pVar.e("Exception when revoking access: ".concat(String.valueOf(e11.toString())), new Object[0]));
        }
        this.f41750b.J(status);
    }
}
