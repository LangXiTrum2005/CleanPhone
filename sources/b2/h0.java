package b2;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5292b;

    public /* synthetic */ h0(String str, String str2) {
        this.f5291a = str;
        this.f5292b = str2;
    }

    public h0(v6.c cVar) {
        Context context = (Context) cVar.f52487a;
        int iE = zb.f.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (iE != 0) {
            this.f5291a = "Unity";
            String string = context.getResources().getString(iE);
            this.f5292b = string;
            String strN = defpackage.e.n("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strN, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                this.f5291a = "Flutter";
                this.f5292b = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
            }
        }
        this.f5291a = null;
        this.f5292b = null;
    }
}
