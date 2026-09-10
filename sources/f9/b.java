package f9;

import android.accounts.Account;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f40702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f40703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f40704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f40705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f40706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Account f40707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f40708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f40709h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f40710i;

    public b() {
        this.f40702a = new HashSet();
        this.f40709h = new HashMap();
    }

    public final GoogleSignInOptions a() {
        Scope scope = GoogleSignInOptions.f11617p;
        HashSet hashSet = this.f40702a;
        if (hashSet.contains(scope)) {
            Scope scope2 = GoogleSignInOptions.f11616o;
            if (hashSet.contains(scope2)) {
                hashSet.remove(scope2);
            }
        }
        if (this.f40705d && (this.f40707f == null || !hashSet.isEmpty())) {
            hashSet.add(GoogleSignInOptions.f11615n);
        }
        return new GoogleSignInOptions(3, new ArrayList(hashSet), this.f40707f, this.f40705d, this.f40703b, this.f40704c, this.f40706e, this.f40708g, this.f40709h, this.f40710i);
    }

    public b(GoogleSignInOptions googleSignInOptions) {
        this.f40702a = new HashSet();
        this.f40709h = new HashMap();
        c0.h(googleSignInOptions);
        this.f40702a = new HashSet(googleSignInOptions.f11620b);
        this.f40703b = googleSignInOptions.f11623e;
        this.f40704c = googleSignInOptions.f11624f;
        this.f40705d = googleSignInOptions.f11622d;
        this.f40706e = googleSignInOptions.f11625g;
        this.f40707f = googleSignInOptions.f11621c;
        this.f40708g = googleSignInOptions.f11626h;
        this.f40709h = GoogleSignInOptions.h(googleSignInOptions.f11627i);
        this.f40710i = googleSignInOptions.f11628j;
    }
}
