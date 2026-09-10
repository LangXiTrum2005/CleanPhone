package y7;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import q7.y;
import q7.z;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends u {
    public static final Parcelable.Creator<l> CREATOR = new l7.h(14);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f54262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l7.g f54263f;

    public l(p pVar) {
        super(pVar);
        this.f54262e = "instagram_login";
        this.f54263f = l7.g.f45128g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // y7.t
    public final String e() {
        return this.f54262e;
    }

    @Override // y7.t
    public final int k(n request) {
        Object obj;
        kotlin.jvm.internal.n.f(request, "request");
        String strE = go.k.E();
        Context contextE = d().e();
        if (contextE == null) {
            contextE = l7.s.b();
        }
        String applicationId = request.f54268d;
        HashSet permissions = request.f54266b;
        boolean zA = request.a();
        int i10 = request.f54267c;
        if (i10 == 0) {
            i10 = 1;
        }
        String strC = c(request.f54271g);
        String authType = request.f54274j;
        String str = request.l;
        boolean z10 = request.f54276m;
        boolean z11 = request.f54278o;
        boolean z12 = request.f54279p;
        z zVar = z.f48798a;
        Intent intent = null;
        if (!v7.a.b(z.class)) {
            try {
                kotlin.jvm.internal.n.f(applicationId, "applicationId");
                kotlin.jvm.internal.n.f(permissions, "permissions");
                kotlin.jvm.internal.n.f(authType, "authType");
                try {
                    Intent intentD = z.d(new y(1), applicationId, permissions, strE, zA, i10, strC, authType, false, str, z10, 2, z11, z12, "", null, null, false, null, 3670016);
                    if (!v7.a.b(z.class) && intentD != null) {
                        try {
                            ResolveInfo resolveInfoResolveActivity = contextE.getPackageManager().resolveActivity(intentD, 0);
                            if (resolveInfoResolveActivity != null) {
                                String str2 = resolveInfoResolveActivity.activityInfo.packageName;
                                kotlin.jvm.internal.n.e(str2, "resolveInfo.activityInfo.packageName");
                                if (q7.k.a(contextE, str2)) {
                                    intent = intentD;
                                }
                            }
                        } catch (Throwable th2) {
                            obj = z.class;
                            try {
                                v7.a.a(obj, th2);
                            } catch (Throwable th3) {
                                th = th3;
                                v7.a.a(obj, th);
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    obj = z.class;
                }
            } catch (Throwable th5) {
                th = th5;
                obj = z.class;
            }
        }
        Intent intent2 = intent;
        a("e2e", strE);
        l7.s sVar = l7.s.f45212a;
        q7.f.o();
        return t(intent2) ? 1 : 0;
    }

    @Override // y7.u
    public final l7.g p() {
        return this.f54263f;
    }

    @Override // y7.t, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.n.f(dest, "dest");
        super.writeToParcel(dest, i10);
    }

    public l(Parcel parcel) {
        super(parcel, 0);
        this.f54262e = "instagram_login";
        this.f54263f = l7.g.f45128g;
    }
}
