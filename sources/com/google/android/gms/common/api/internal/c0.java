package com.google.android.gms.common.api.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.auth.j2;
import com.google.android.gms.internal.measurement.u6;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends ia.c implements j9.j, j9.k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j2 f11680i = ha.b.f42292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f11681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f11682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j2 f11683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f11684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.google.android.gms.internal.consent_sdk.x f11685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ia.a f11686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t f11687h;

    public c0(Context context, u6 u6Var, com.google.android.gms.internal.consent_sdk.x xVar) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 4);
        this.f11681b = context;
        this.f11682c = u6Var;
        this.f11685f = xVar;
        this.f11684e = (Set) xVar.f23260a;
        this.f11683d = f11680i;
    }

    @Override // j9.j
    public final void onConnected() {
        ia.a aVar = this.f11686g;
        aVar.getClass();
        try {
            aVar.H.getClass();
            Account account = new Account(k9.f.DEFAULT_ACCOUNT, "com.google");
            GoogleSignInAccount googleSignInAccountB = k9.f.DEFAULT_ACCOUNT.equals(account.name) ? g9.b.a(aVar.getContext()).b() : null;
            Integer num = aVar.J;
            k9.c0.h(num);
            k9.v vVar = new k9.v(2, account, num.intValue(), googleSignInAccountB);
            ia.d dVar = (ia.d) aVar.getService();
            dVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(dVar.f22790c);
            int i10 = x9.a.f53673a;
            parcelObtain.writeInt(1);
            int iR = r9.b.R(parcelObtain, 20293);
            r9.b.Q(parcelObtain, 1, 4);
            parcelObtain.writeInt(1);
            r9.b.I(parcelObtain, 2, vVar, 0);
            r9.b.S(parcelObtain, iR);
            parcelObtain.writeStrongBinder(this);
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                dVar.f22789b.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f11682c.post(new i0(this, new ia.f(1, new ConnectionResult(8, null, null), null), 3));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // j9.j
    public final void q(int i10) {
        t tVar = this.f11687h;
        r rVar = (r) ((e) tVar.f11770f).f11702j.get((a) tVar.f11767c);
        if (rVar != null) {
            if (rVar.f11759i) {
                rVar.k(new ConnectionResult(17, null, null));
            } else {
                rVar.q(i10);
            }
        }
    }

    @Override // j9.k
    public final void r(ConnectionResult connectionResult) {
        this.f11687h.g(connectionResult);
    }
}
