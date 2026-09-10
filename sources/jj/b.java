package jj;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import b2.p;
import com.applovin.impl.z8;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.consent_sdk.x;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import k9.c0;
import xi.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f43929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f43930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f9.a f43931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f43932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x f43933e;

    public b(Context context, d dVar) {
        this.f43929a = context;
    }

    public static boolean e(String str) {
        return str == null || str.isEmpty();
    }

    public static void h(xi.f fVar, b bVar) {
        ne.c cVarH = fVar.h(new xi.k());
        i iVar = i.f43952d;
        k5.g gVar = new k5.g(fVar, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.init", iVar, (Object) null);
        if (bVar != null) {
            gVar.C(new a(bVar, 3));
        } else {
            gVar.C(null);
        }
        k5.g gVar2 = new k5.g(fVar, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.signInSilently", iVar, (Object) null);
        if (bVar != null) {
            gVar2.C(new a(bVar, 4));
        } else {
            gVar2.C(null);
        }
        k5.g gVar3 = new k5.g(fVar, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.signIn", iVar, (Object) null);
        if (bVar != null) {
            gVar3.C(new a(bVar, 5));
        } else {
            gVar3.C(null);
        }
        k5.g gVar4 = new k5.g(fVar, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.getAccessToken", iVar, cVarH);
        if (bVar != null) {
            gVar4.C(new a(bVar, 6));
        } else {
            gVar4.C(null);
        }
        k5.g gVar5 = new k5.g(fVar, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.signOut", iVar, (Object) null);
        if (bVar != null) {
            gVar5.C(new a(bVar, 7));
        } else {
            gVar5.C(null);
        }
        k5.g gVar6 = new k5.g(fVar, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.disconnect", iVar, (Object) null);
        if (bVar != null) {
            gVar6.C(new a(bVar, 8));
        } else {
            gVar6.C(null);
        }
        k5.g gVar7 = new k5.g(fVar, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.isSignedIn", iVar, (Object) null);
        if (bVar != null) {
            gVar7.C(new a(bVar, 9));
        } else {
            gVar7.C(null);
        }
        k5.g gVar8 = new k5.g(fVar, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.clearAuthCache", iVar, cVarH);
        if (bVar != null) {
            gVar8.C(new a(bVar, 10));
        } else {
            gVar8.C(null);
        }
        k5.g gVar9 = new k5.g(fVar, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.requestScopes", iVar, (Object) null);
        if (bVar != null) {
            gVar9.C(new a(bVar, 11));
        } else {
            gVar9.C(null);
        }
    }

    public final void a(String str, j jVar, m mVar, g gVar, j jVar2, Object obj) {
        if (this.f43933e != null) {
            throw new IllegalStateException(q4.a.j(new StringBuilder("Concurrent operations detected: "), (String) this.f43933e.f23260a, ", ", str));
        }
        this.f43933e = new x(str, jVar, mVar, gVar, jVar2, obj);
    }

    public final void b(String str, String str2) {
        x xVar = this.f43933e;
        m mVar = (m) xVar.f23262c;
        if (mVar != null) {
            mVar.b(new e(str, str2));
        } else {
            j jVar = (j) xVar.f23261b;
            if (jVar == null && (jVar = (j) xVar.f23263d) == null) {
                jVar = (j) xVar.f23264e;
            }
            Objects.requireNonNull(jVar);
            jVar.b(new e(str, str2));
        }
        this.f43933e = null;
    }

    public final void c(String str, Boolean bool, j jVar) {
        try {
            jVar.a(d9.a.b(this.f43929a, new Account(str, "com.google"), "oauth2:" + String.join(" ", this.f43932d)));
        } catch (UserRecoverableAuthException e10) {
            new Handler(Looper.getMainLooper()).post(new z8(this, bool, jVar, e10, str, 7));
        } catch (Exception e11) {
            jVar.b(new e("exception", e11.getMessage()));
        }
    }

    public final void d(h hVar) {
        f9.b bVar;
        int identifier;
        try {
            int iOrdinal = hVar.f43946b.ordinal();
            if (iOrdinal == 0) {
                bVar = new f9.b(GoogleSignInOptions.f11613k);
                bVar.f40702a.add(GoogleSignInOptions.f11614m);
            } else {
                if (iOrdinal != 1) {
                    throw new IllegalStateException("Unknown signInOption");
                }
                bVar = new f9.b(GoogleSignInOptions.l);
            }
            String string = hVar.f43949e;
            if (!e(hVar.f43948d) && e(string)) {
                Log.w("google_sign_in", "clientId is not supported on Android and is interpreted as serverClientId. Use serverClientId instead to suppress this warning.");
                string = hVar.f43948d;
            }
            boolean zE = e(string);
            Context context = this.f43929a;
            if (zE && (identifier = context.getResources().getIdentifier("default_web_client_id", "string", context.getPackageName())) != 0) {
                string = context.getString(identifier);
            }
            if (!e(string)) {
                bVar.f40705d = true;
                c0.e(string);
                String str = bVar.f40706e;
                c0.a("two different server client ids provided", str == null || str.equals(string));
                bVar.f40706e = string;
                boolean zBooleanValue = hVar.f43950f.booleanValue();
                bVar.f40703b = true;
                c0.e(string);
                String str2 = bVar.f40706e;
                c0.a("two different server client ids provided", str2 == null || str2.equals(string));
                bVar.f40706e = string;
                bVar.f40704c = zBooleanValue;
            }
            List list = hVar.f43945a;
            this.f43932d = list;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Scope scope = new Scope(1, (String) it.next());
                HashSet hashSet = bVar.f40702a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
            if (!e(hVar.f43947c)) {
                String str3 = hVar.f43947c;
                c0.e(str3);
                bVar.f40708g = str3;
            }
            String str4 = hVar.f43951g;
            if (!e(str4)) {
                c0.e(str4);
                bVar.f40707f = new Account(str4, "com.google");
            }
            this.f43931c = new f9.a(context, null, e9.a.f39182a, bVar.a(), new j9.h(new fd.b(8), Looper.getMainLooper()));
        } catch (Exception e10) {
            throw new e("exception", e10.getMessage());
        }
    }

    public final void f(GoogleSignInAccount googleSignInAccount) {
        String str = googleSignInAccount.f11604c;
        String str2 = googleSignInAccount.f11602a;
        String str3 = googleSignInAccount.f11603b;
        String str4 = googleSignInAccount.f11607f;
        String str5 = googleSignInAccount.f11605d;
        Uri uri = googleSignInAccount.f11606e;
        String string = uri != null ? uri.toString() : null;
        l lVar = new l();
        lVar.f43955a = str5;
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"email\" is null.");
        }
        lVar.f43956b = str;
        if (str2 == null) {
            throw new IllegalStateException("Nonnull field \"id\" is null.");
        }
        lVar.f43957c = str2;
        lVar.f43958d = string;
        lVar.f43959e = str3;
        lVar.f43960f = str4;
        j jVar = (j) this.f43933e.f23261b;
        Objects.requireNonNull(jVar);
        jVar.a(lVar);
        this.f43933e = null;
    }

    public final void g(Task task) {
        String str;
        try {
            f((GoogleSignInAccount) task.getResult(j9.e.class));
        } catch (RuntimeExecutionException e10) {
            b("exception", e10.toString());
        } catch (j9.e e11) {
            int i10 = e11.f43728a.f11654a;
            if (i10 == 4) {
                str = "sign_in_required";
            } else if (i10 != 7) {
                str = i10 != 12501 ? "sign_in_failed" : "sign_in_canceled";
            } else {
                str = "network_error";
            }
            b(str, e11.toString());
        }
    }

    @Override // xi.r
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        f9.c cVar;
        GoogleSignInAccount googleSignInAccount;
        x xVar = this.f43933e;
        if (xVar != null) {
            switch (i10) {
                case 53293:
                    if (intent == null) {
                        b("sign_in_failed", "Signin failed");
                        return true;
                    }
                    p pVar = g9.j.f41766a;
                    Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
                    GoogleSignInAccount googleSignInAccount2 = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
                    if (googleSignInAccount2 == null) {
                        if (status == null) {
                            status = Status.f11651g;
                        }
                        cVar = new f9.c(null, status);
                    } else {
                        cVar = new f9.c(googleSignInAccount2, Status.f11649e);
                    }
                    Status status2 = cVar.f40711a;
                    g((!status2.b() || (googleSignInAccount = cVar.f40712b) == null) ? Tasks.forException(c0.m(status2)) : Tasks.forResult(googleSignInAccount));
                    return true;
                case 53294:
                    if (i11 != -1) {
                        b("failed_to_recover_auth", "Failed attempt to recover authentication");
                        return true;
                    }
                    j jVar = (j) xVar.f23264e;
                    Objects.requireNonNull(jVar);
                    Object obj = this.f43933e.f23265f;
                    Objects.requireNonNull(obj);
                    this.f43933e = null;
                    c((String) obj, Boolean.FALSE, jVar);
                    return true;
                case 53295:
                    Boolean boolValueOf = Boolean.valueOf(i11 == -1);
                    j jVar2 = (j) this.f43933e.f23263d;
                    Objects.requireNonNull(jVar2);
                    jVar2.a(boolValueOf);
                    this.f43933e = null;
                    return true;
            }
        }
        return false;
    }
}
