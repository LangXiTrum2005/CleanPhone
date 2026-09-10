package k9;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends l9.a {

    @NonNull
    public static final Parcelable.Creator<h> CREATOR = new f9.d(27);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Scope[] f44438o = new Scope[0];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final i9.c[] f44439p = new i9.c[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f44443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IBinder f44444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Scope[] f44445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bundle f44446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Account f44447h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i9.c[] f44448i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i9.c[] f44449j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f44450k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f44451m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f44452n;

    public h(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, i9.c[] cVarArr, i9.c[] cVarArr2, boolean z10, int i13, boolean z11, String str2) {
        Account account2;
        Scope[] scopeArr2 = scopeArr == null ? f44438o : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        i9.c[] cVarArr3 = f44439p;
        i9.c[] cVarArr4 = cVarArr == null ? cVarArr3 : cVarArr;
        cVarArr3 = cVarArr2 != null ? cVarArr2 : cVarArr3;
        this.f44440a = i10;
        this.f44441b = i11;
        this.f44442c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f44443d = "com.google.android.gms";
        } else {
            this.f44443d = str;
        }
        if (i10 < 2) {
            account2 = null;
            if (iBinder != null) {
                int i14 = a.f44397b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface p0Var = iInterfaceQueryLocalInterface instanceof j ? (j) iInterfaceQueryLocalInterface : new p0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 5);
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        p0 p0Var2 = (p0) p0Var;
                        Parcel parcelR = p0Var2.r(p0Var2.u1(), 2);
                        Account account3 = (Account) z9.g.a(parcelR, Account.CREATOR);
                        parcelR.recycle();
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    }
                } catch (Throwable th2) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th2;
                }
            }
        } else {
            this.f44444e = iBinder;
            account2 = account;
        }
        this.f44447h = account2;
        this.f44445f = scopeArr2;
        this.f44446g = bundle2;
        this.f44448i = cVarArr4;
        this.f44449j = cVarArr3;
        this.f44450k = z10;
        this.l = i13;
        this.f44451m = z11;
        this.f44452n = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        f9.d.a(this, parcel, i10);
    }
}
