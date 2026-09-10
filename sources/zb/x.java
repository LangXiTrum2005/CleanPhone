package zb;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.Xa;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f54775g = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f54776h = Pattern.quote("/");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final la.e f54777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f54778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f54779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uc.d f54780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f54781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f54782f;

    public x(Context context, String str, uc.d dVar, u uVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f54778b = context;
        this.f54779c = str;
        this.f54780d = dVar;
        this.f54781e = uVar;
        this.f54777a = new la.e();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = f54775g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final w b(boolean z10) {
        String str;
        String str2 = null;
        if (!((Boolean) new ac.e(0, ac.g.f3461d, ac.f.class, "isNotMainThread", "isNotMainThread()Z", 0, 2).invoke()).booleanValue()) {
            String str3 = "Must not be called on a main thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
        }
        uc.d dVar = this.f54780d;
        if (z10) {
            try {
                str = ((uc.a) Tasks.await(((uc.c) dVar).d(), Xa.f27908s, TimeUnit.MILLISECONDS)).f51979a;
            } catch (Exception e10) {
                Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", e10);
                str = null;
            }
        } else {
            str = null;
        }
        try {
            str2 = (String) Tasks.await(((uc.c) dVar).c(), Xa.f27908s, TimeUnit.MILLISECONDS);
        } catch (Exception e11) {
            Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", e11);
        }
        return new w(str2, str);
    }

    public final synchronized b c() {
        String str;
        b bVar = this.f54782f;
        if (bVar != null && (bVar.f54673b != null || !this.f54781e.a())) {
            return this.f54782f;
        }
        wb.c cVar = wb.c.f53149a;
        cVar.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f54778b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        cVar.c("Cached Firebase Installation ID: " + string);
        if (this.f54781e.a()) {
            w wVarB = b(false);
            cVar.c("Fetched Firebase Installation ID: " + wVarB.f54773a);
            if (wVarB.f54773a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                wVarB = new w(str, null);
            }
            if (Objects.equals(wVarB.f54773a, string)) {
                this.f54782f = new b(sharedPreferences.getString("crashlytics.installation.id", null), wVarB.f54773a, wVarB.f54774b);
            } else {
                this.f54782f = new b(a(sharedPreferences, wVarB.f54773a), wVarB.f54773a, wVarB.f54774b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f54782f = new b(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f54782f = new b(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        cVar.c("Install IDs: " + this.f54782f);
        return this.f54782f;
    }

    public final String d() {
        String str;
        la.e eVar = this.f54777a;
        Context context = this.f54778b;
        synchronized (eVar) {
            try {
                if (eVar.f45249a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    eVar.f45249a = installerPackageName;
                }
                str = "".equals(eVar.f45249a) ? null : eVar.f45249a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
