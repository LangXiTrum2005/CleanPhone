package f9;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.firebase.perf.metrics.Trace;
import h.j;
import h9.e;
import i9.r;
import ia.f;
import java.util.ArrayList;
import k9.g;
import k9.h;
import k9.k;
import k9.k0;
import k9.o;
import k9.v;
import k9.w;
import kotlin.jvm.internal.n;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40713a;

    public /* synthetic */ d(int i10) {
        this.f40713a = i10;
    }

    public static void a(h hVar, Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        int i11 = hVar.f44440a;
        r9.b.Q(parcel, 1, 4);
        parcel.writeInt(i11);
        int i12 = hVar.f44441b;
        r9.b.Q(parcel, 2, 4);
        parcel.writeInt(i12);
        int i13 = hVar.f44442c;
        r9.b.Q(parcel, 3, 4);
        parcel.writeInt(i13);
        r9.b.J(parcel, 4, hVar.f44443d);
        r9.b.F(parcel, 5, hVar.f44444e);
        r9.b.N(parcel, 6, hVar.f44445f, i10);
        r9.b.C(parcel, 7, hVar.f44446g);
        r9.b.I(parcel, 8, hVar.f44447h, i10);
        r9.b.N(parcel, 10, hVar.f44448i, i10);
        r9.b.N(parcel, 11, hVar.f44449j, i10);
        boolean z10 = hVar.f44450k;
        r9.b.Q(parcel, 12, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i14 = hVar.l;
        r9.b.Q(parcel, 13, 4);
        parcel.writeInt(i14);
        boolean z11 = hVar.f44451m;
        r9.b.Q(parcel, 14, 4);
        parcel.writeInt(z11 ? 1 : 0);
        r9.b.J(parcel, 15, hVar.f44452n);
        r9.b.S(parcel, iR);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f40713a) {
            case 0:
                int iO0 = i0.o0(parcel);
                String strV = null;
                String strV2 = null;
                String strV3 = null;
                String strV4 = null;
                Uri uri = null;
                String strV5 = null;
                String strV6 = null;
                ArrayList arrayListZ = null;
                String strV7 = null;
                String strV8 = null;
                long jE0 = 0;
                while (parcel.dataPosition() < iO0) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 2:
                            strV = i0.v(parcel, i10);
                            break;
                        case 3:
                            strV2 = i0.v(parcel, i10);
                            break;
                        case 4:
                            strV3 = i0.v(parcel, i10);
                            break;
                        case 5:
                            strV4 = i0.v(parcel, i10);
                            break;
                        case 6:
                            uri = (Uri) i0.s(parcel, i10, Uri.CREATOR);
                            break;
                        case 7:
                            strV5 = i0.v(parcel, i10);
                            break;
                        case '\b':
                            jE0 = i0.e0(parcel, i10);
                            break;
                        case '\t':
                            strV6 = i0.v(parcel, i10);
                            break;
                        case '\n':
                            arrayListZ = i0.z(parcel, i10, Scope.CREATOR);
                            break;
                        case 11:
                            strV7 = i0.v(parcel, i10);
                            break;
                        case '\f':
                            strV8 = i0.v(parcel, i10);
                            break;
                        default:
                            i0.l0(parcel, i10);
                            break;
                    }
                }
                i0.D(parcel, iO0);
                return new GoogleSignInAccount(strV, strV2, strV3, strV4, uri, strV5, jE0, strV6, arrayListZ, strV7, strV8);
            case 1:
                int iO1 = i0.o0(parcel);
                ArrayList arrayListZ2 = null;
                ArrayList arrayListZ3 = null;
                Account account = null;
                String strV9 = null;
                String strV10 = null;
                String strV11 = null;
                int iD0 = 0;
                boolean zA0 = false;
                boolean zA1 = false;
                boolean zA2 = false;
                while (parcel.dataPosition() < iO1) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            iD0 = i0.d0(parcel, i11);
                            break;
                        case 2:
                            arrayListZ3 = i0.z(parcel, i11, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) i0.s(parcel, i11, Account.CREATOR);
                            break;
                        case 4:
                            zA0 = i0.a0(parcel, i11);
                            break;
                        case 5:
                            zA1 = i0.a0(parcel, i11);
                            break;
                        case 6:
                            zA2 = i0.a0(parcel, i11);
                            break;
                        case 7:
                            strV9 = i0.v(parcel, i11);
                            break;
                        case '\b':
                            strV10 = i0.v(parcel, i11);
                            break;
                        case '\t':
                            arrayListZ2 = i0.z(parcel, i11, g9.a.CREATOR);
                            break;
                        case '\n':
                            strV11 = i0.v(parcel, i11);
                            break;
                        default:
                            i0.l0(parcel, i11);
                            break;
                    }
                }
                i0.D(parcel, iO1);
                return new GoogleSignInOptions(iD0, arrayListZ3, account, zA0, zA1, zA2, strV9, strV10, GoogleSignInOptions.h(arrayListZ2), strV11);
            case 2:
                int iO2 = i0.o0(parcel);
                String strV12 = "";
                GoogleSignInAccount googleSignInAccount = null;
                String strV13 = "";
                while (parcel.dataPosition() < iO2) {
                    int i12 = parcel.readInt();
                    char c4 = (char) i12;
                    if (c4 == 4) {
                        strV12 = i0.v(parcel, i12);
                    } else if (c4 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) i0.s(parcel, i12, GoogleSignInAccount.CREATOR);
                    } else if (c4 != '\b') {
                        i0.l0(parcel, i12);
                    } else {
                        strV13 = i0.v(parcel, i12);
                    }
                }
                i0.D(parcel, iO2);
                return new SignInAccount(strV12, googleSignInAccount, strV13);
            case 3:
                int iO3 = i0.o0(parcel);
                Bundle bundleN = null;
                int iD1 = 0;
                int iD2 = 0;
                while (parcel.dataPosition() < iO3) {
                    int i13 = parcel.readInt();
                    char c5 = (char) i13;
                    if (c5 == 1) {
                        iD1 = i0.d0(parcel, i13);
                    } else if (c5 == 2) {
                        iD2 = i0.d0(parcel, i13);
                    } else if (c5 != 3) {
                        i0.l0(parcel, i13);
                    } else {
                        bundleN = i0.n(parcel, i13);
                    }
                }
                i0.D(parcel, iO3);
                return new g9.a(iD1, iD2, bundleN);
            case 4:
                int iO4 = i0.o0(parcel);
                String strV14 = null;
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iO4) {
                    int i14 = parcel.readInt();
                    char c10 = (char) i14;
                    if (c10 == 2) {
                        strV14 = i0.v(parcel, i14);
                    } else if (c10 != 5) {
                        i0.l0(parcel, i14);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) i0.s(parcel, i14, GoogleSignInOptions.CREATOR);
                    }
                }
                i0.D(parcel, iO4);
                return new SignInConfiguration(strV14, googleSignInOptions);
            case 5:
                return new gd.c(parcel);
            case 6:
                return new Trace(parcel, false);
            case 7:
                n.f(parcel, "parcel");
                return new h.a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 8:
                n.f(parcel, "inParcel");
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                n.c(parcelable);
                return new j((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 9:
                int iO5 = i0.o0(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < iO5) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 1) {
                        i0.l0(parcel, i15);
                    } else {
                        intent = (Intent) i0.s(parcel, i15, Intent.CREATOR);
                    }
                }
                i0.D(parcel, iO5);
                return new h9.a(intent);
            case 10:
                return new e(parcel.readStrongBinder());
            case 11:
                int iO6 = i0.o0(parcel);
                String strV15 = null;
                String strV16 = null;
                String strV17 = null;
                String strV18 = null;
                String strV19 = null;
                String strV20 = null;
                int iD3 = 0;
                while (parcel.dataPosition() < iO6) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            strV15 = i0.v(parcel, i16);
                            break;
                        case 2:
                            strV16 = i0.v(parcel, i16);
                            break;
                        case 3:
                            strV17 = i0.v(parcel, i16);
                            break;
                        case 4:
                            strV18 = i0.v(parcel, i16);
                            break;
                        case 5:
                            strV19 = i0.v(parcel, i16);
                            break;
                        case 6:
                            iD3 = i0.d0(parcel, i16);
                            break;
                        case 7:
                            strV20 = i0.v(parcel, i16);
                            break;
                        default:
                            i0.l0(parcel, i16);
                            break;
                    }
                }
                i0.D(parcel, iO6);
                return new h9.b(strV15, strV16, strV17, strV18, strV19, iD3, strV20);
            case 12:
                int iO7 = i0.o0(parcel);
                PendingIntent pendingIntent = null;
                String strV21 = null;
                Integer numValueOf = null;
                int iD4 = 0;
                int iD5 = 0;
                while (parcel.dataPosition() < iO7) {
                    int i17 = parcel.readInt();
                    char c11 = (char) i17;
                    if (c11 == 1) {
                        iD4 = i0.d0(parcel, i17);
                    } else if (c11 == 2) {
                        iD5 = i0.d0(parcel, i17);
                    } else if (c11 == 3) {
                        pendingIntent = (PendingIntent) i0.s(parcel, i17, PendingIntent.CREATOR);
                    } else if (c11 == 4) {
                        strV21 = i0.v(parcel, i17);
                    } else if (c11 != 5) {
                        i0.l0(parcel, i17);
                    } else {
                        int iF0 = i0.f0(parcel, i17);
                        if (iF0 == 0) {
                            numValueOf = null;
                        } else {
                            i0.s0(parcel, iF0, 4);
                            numValueOf = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                i0.D(parcel, iO7);
                return new ConnectionResult(iD4, iD5, pendingIntent, strV21, numValueOf);
            case 13:
                int iO8 = i0.o0(parcel);
                int iD6 = 0;
                boolean zA3 = false;
                long jE1 = -1;
                String strV22 = null;
                while (parcel.dataPosition() < iO8) {
                    int i18 = parcel.readInt();
                    char c12 = (char) i18;
                    if (c12 == 1) {
                        strV22 = i0.v(parcel, i18);
                    } else if (c12 == 2) {
                        iD6 = i0.d0(parcel, i18);
                    } else if (c12 == 3) {
                        jE1 = i0.e0(parcel, i18);
                    } else if (c12 != 4) {
                        i0.l0(parcel, i18);
                    } else {
                        zA3 = i0.a0(parcel, i18);
                    }
                }
                i0.D(parcel, iO8);
                return new i9.c(jE1, iD6, strV22, zA3);
            case 14:
                int iO9 = i0.o0(parcel);
                long jE2 = -1;
                int iD7 = 0;
                int iD8 = 0;
                boolean zA4 = false;
                String strV23 = null;
                while (parcel.dataPosition() < iO9) {
                    int i19 = parcel.readInt();
                    char c13 = (char) i19;
                    if (c13 == 1) {
                        zA4 = i0.a0(parcel, i19);
                    } else if (c13 == 2) {
                        strV23 = i0.v(parcel, i19);
                    } else if (c13 == 3) {
                        iD7 = i0.d0(parcel, i19);
                    } else if (c13 == 4) {
                        iD8 = i0.d0(parcel, i19);
                    } else if (c13 != 5) {
                        i0.l0(parcel, i19);
                    } else {
                        jE2 = i0.e0(parcel, i19);
                    }
                }
                i0.D(parcel, iO9);
                return new r(iD7, iD8, jE2, strV23, zA4);
            case 15:
                int iO10 = i0.o0(parcel);
                Intent intent2 = null;
                int iD9 = 0;
                int iD10 = 0;
                while (parcel.dataPosition() < iO10) {
                    int i20 = parcel.readInt();
                    char c14 = (char) i20;
                    if (c14 == 1) {
                        iD9 = i0.d0(parcel, i20);
                    } else if (c14 == 2) {
                        iD10 = i0.d0(parcel, i20);
                    } else if (c14 != 3) {
                        i0.l0(parcel, i20);
                    } else {
                        intent2 = (Intent) i0.s(parcel, i20, Intent.CREATOR);
                    }
                }
                i0.D(parcel, iO10);
                return new ia.b(iD9, iD10, intent2);
            case 16:
                int iO11 = i0.o0(parcel);
                ArrayList arrayListX = null;
                String strV24 = null;
                while (parcel.dataPosition() < iO11) {
                    int i21 = parcel.readInt();
                    char c15 = (char) i21;
                    if (c15 == 1) {
                        arrayListX = i0.x(parcel, i21);
                    } else if (c15 != 2) {
                        i0.l0(parcel, i21);
                    } else {
                        strV24 = i0.v(parcel, i21);
                    }
                }
                i0.D(parcel, iO11);
                return new ia.e(arrayListX, strV24);
            case 17:
                int iO12 = i0.o0(parcel);
                ConnectionResult connectionResult = null;
                int iD11 = 0;
                w wVar = null;
                while (parcel.dataPosition() < iO12) {
                    int i22 = parcel.readInt();
                    char c16 = (char) i22;
                    if (c16 == 1) {
                        iD11 = i0.d0(parcel, i22);
                    } else if (c16 == 2) {
                        connectionResult = (ConnectionResult) i0.s(parcel, i22, ConnectionResult.CREATOR);
                    } else if (c16 != 3) {
                        i0.l0(parcel, i22);
                    } else {
                        wVar = (w) i0.s(parcel, i22, w.CREATOR);
                    }
                }
                i0.D(parcel, iO12);
                return new f(iD11, connectionResult, wVar);
            case 18:
                return new jd.a(parcel);
            case 19:
                int iO13 = i0.o0(parcel);
                ArrayList arrayListZ4 = null;
                int iD12 = 0;
                while (parcel.dataPosition() < iO13) {
                    int i23 = parcel.readInt();
                    char c17 = (char) i23;
                    if (c17 == 1) {
                        iD12 = i0.d0(parcel, i23);
                    } else if (c17 != 2) {
                        i0.l0(parcel, i23);
                    } else {
                        arrayListZ4 = i0.z(parcel, i23, k.CREATOR);
                    }
                }
                i0.D(parcel, iO13);
                return new o(iD12, arrayListZ4);
            case 20:
                int iO14 = i0.o0(parcel);
                int iD13 = 0;
                int iD14 = 0;
                boolean zA5 = false;
                long jE3 = 0;
                String strV25 = null;
                while (parcel.dataPosition() < iO14) {
                    int i24 = parcel.readInt();
                    char c18 = (char) i24;
                    if (c18 == 1) {
                        iD13 = i0.d0(parcel, i24);
                    } else if (c18 == 2) {
                        strV25 = i0.v(parcel, i24);
                    } else if (c18 == 3) {
                        jE3 = i0.e0(parcel, i24);
                    } else if (c18 == 4) {
                        iD14 = i0.d0(parcel, i24);
                    } else if (c18 != 5) {
                        i0.l0(parcel, i24);
                    } else {
                        zA5 = i0.a0(parcel, i24);
                    }
                }
                i0.D(parcel, iO14);
                return new k9.r(iD13, iD14, jE3, strV25, zA5);
            case 21:
                int iO15 = i0.o0(parcel);
                int iD15 = -1;
                int iD16 = 0;
                int iD17 = 0;
                int iD18 = 0;
                int iD19 = 0;
                String strV26 = null;
                String strV27 = null;
                long jE4 = 0;
                long jE5 = 0;
                while (parcel.dataPosition() < iO15) {
                    int i25 = parcel.readInt();
                    switch ((char) i25) {
                        case 1:
                            iD16 = i0.d0(parcel, i25);
                            break;
                        case 2:
                            iD17 = i0.d0(parcel, i25);
                            break;
                        case 3:
                            iD18 = i0.d0(parcel, i25);
                            break;
                        case 4:
                            jE4 = i0.e0(parcel, i25);
                            break;
                        case 5:
                            jE5 = i0.e0(parcel, i25);
                            break;
                        case 6:
                            strV26 = i0.v(parcel, i25);
                            break;
                        case 7:
                            strV27 = i0.v(parcel, i25);
                            break;
                        case '\b':
                            iD19 = i0.d0(parcel, i25);
                            break;
                        case '\t':
                            iD15 = i0.d0(parcel, i25);
                            break;
                        default:
                            i0.l0(parcel, i25);
                            break;
                    }
                }
                i0.D(parcel, iO15);
                return new k(iD16, iD17, iD18, jE4, jE5, strV26, strV27, iD19, iD15);
            case 22:
                int iO16 = i0.o0(parcel);
                Account account2 = null;
                int iD20 = 0;
                int iD21 = 0;
                GoogleSignInAccount googleSignInAccount2 = null;
                while (parcel.dataPosition() < iO16) {
                    int i26 = parcel.readInt();
                    char c19 = (char) i26;
                    if (c19 == 1) {
                        iD20 = i0.d0(parcel, i26);
                    } else if (c19 == 2) {
                        account2 = (Account) i0.s(parcel, i26, Account.CREATOR);
                    } else if (c19 == 3) {
                        iD21 = i0.d0(parcel, i26);
                    } else if (c19 != 4) {
                        i0.l0(parcel, i26);
                    } else {
                        googleSignInAccount2 = (GoogleSignInAccount) i0.s(parcel, i26, GoogleSignInAccount.CREATOR);
                    }
                }
                i0.D(parcel, iO16);
                return new v(iD20, account2, iD21, googleSignInAccount2);
            case 23:
                int iO17 = i0.o0(parcel);
                int iD22 = 0;
                boolean zA6 = false;
                boolean zA7 = false;
                IBinder iBinderC0 = null;
                ConnectionResult connectionResult2 = null;
                while (parcel.dataPosition() < iO17) {
                    int i27 = parcel.readInt();
                    char c20 = (char) i27;
                    if (c20 == 1) {
                        iD22 = i0.d0(parcel, i27);
                    } else if (c20 == 2) {
                        iBinderC0 = i0.c0(parcel, i27);
                    } else if (c20 == 3) {
                        connectionResult2 = (ConnectionResult) i0.s(parcel, i27, ConnectionResult.CREATOR);
                    } else if (c20 == 4) {
                        zA6 = i0.a0(parcel, i27);
                    } else if (c20 != 5) {
                        i0.l0(parcel, i27);
                    } else {
                        zA7 = i0.a0(parcel, i27);
                    }
                }
                i0.D(parcel, iO17);
                return new w(iD22, iBinderC0, connectionResult2, zA6, zA7);
            case 24:
                int iO18 = i0.o0(parcel);
                int iD23 = 0;
                int iD24 = 0;
                int iD25 = 0;
                boolean zA8 = false;
                boolean zA9 = false;
                while (parcel.dataPosition() < iO18) {
                    int i28 = parcel.readInt();
                    char c21 = (char) i28;
                    if (c21 == 1) {
                        iD23 = i0.d0(parcel, i28);
                    } else if (c21 == 2) {
                        zA8 = i0.a0(parcel, i28);
                    } else if (c21 == 3) {
                        zA9 = i0.a0(parcel, i28);
                    } else if (c21 == 4) {
                        iD24 = i0.d0(parcel, i28);
                    } else if (c21 != 5) {
                        i0.l0(parcel, i28);
                    } else {
                        iD25 = i0.d0(parcel, i28);
                    }
                }
                i0.D(parcel, iO18);
                return new k9.n(iD23, iD24, iD25, zA8, zA9);
            case 25:
                int iO19 = i0.o0(parcel);
                Bundle bundleN2 = null;
                g gVar = null;
                int iD26 = 0;
                i9.c[] cVarArr = null;
                while (parcel.dataPosition() < iO19) {
                    int i29 = parcel.readInt();
                    char c22 = (char) i29;
                    if (c22 == 1) {
                        bundleN2 = i0.n(parcel, i29);
                    } else if (c22 == 2) {
                        cVarArr = (i9.c[]) i0.y(parcel, i29, i9.c.CREATOR);
                    } else if (c22 == 3) {
                        iD26 = i0.d0(parcel, i29);
                    } else if (c22 != 4) {
                        i0.l0(parcel, i29);
                    } else {
                        gVar = (g) i0.s(parcel, i29, g.CREATOR);
                    }
                }
                i0.D(parcel, iO19);
                k0 k0Var = new k0();
                k0Var.f44467a = bundleN2;
                k0Var.f44468b = cVarArr;
                k0Var.f44469c = iD26;
                k0Var.f44470d = gVar;
                return k0Var;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                int iO20 = i0.o0(parcel);
                k9.n nVar = null;
                int[] iArrQ = null;
                int[] iArrQ2 = null;
                boolean zA10 = false;
                boolean zA11 = false;
                int iD27 = 0;
                while (parcel.dataPosition() < iO20) {
                    int i30 = parcel.readInt();
                    switch ((char) i30) {
                        case 1:
                            nVar = (k9.n) i0.s(parcel, i30, k9.n.CREATOR);
                            break;
                        case 2:
                            zA10 = i0.a0(parcel, i30);
                            break;
                        case 3:
                            zA11 = i0.a0(parcel, i30);
                            break;
                        case 4:
                            iArrQ = i0.q(parcel, i30);
                            break;
                        case 5:
                            iD27 = i0.d0(parcel, i30);
                            break;
                        case 6:
                            iArrQ2 = i0.q(parcel, i30);
                            break;
                        default:
                            i0.l0(parcel, i30);
                            break;
                    }
                }
                i0.D(parcel, iO20);
                return new g(nVar, zA10, zA11, iArrQ, iD27, iArrQ2);
            case 27:
                int iO21 = i0.o0(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = h.f44438o;
                String strV28 = null;
                IBinder iBinderC1 = null;
                Account account3 = null;
                String strV29 = null;
                int iD28 = 0;
                int iD29 = 0;
                int iD30 = 0;
                boolean zA12 = false;
                int iD31 = 0;
                boolean zA13 = false;
                i9.c[] cVarArr2 = h.f44439p;
                i9.c[] cVarArr3 = cVarArr2;
                while (parcel.dataPosition() < iO21) {
                    int i31 = parcel.readInt();
                    switch ((char) i31) {
                        case 1:
                            iD28 = i0.d0(parcel, i31);
                            break;
                        case 2:
                            iD29 = i0.d0(parcel, i31);
                            break;
                        case 3:
                            iD30 = i0.d0(parcel, i31);
                            break;
                        case 4:
                            strV28 = i0.v(parcel, i31);
                            break;
                        case 5:
                            iBinderC1 = i0.c0(parcel, i31);
                            break;
                        case 6:
                            scopeArr = (Scope[]) i0.y(parcel, i31, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = i0.n(parcel, i31);
                            break;
                        case '\b':
                            account3 = (Account) i0.s(parcel, i31, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            i0.l0(parcel, i31);
                            break;
                        case '\n':
                            cVarArr2 = (i9.c[]) i0.y(parcel, i31, i9.c.CREATOR);
                            break;
                        case 11:
                            cVarArr3 = (i9.c[]) i0.y(parcel, i31, i9.c.CREATOR);
                            break;
                        case '\f':
                            zA12 = i0.a0(parcel, i31);
                            break;
                        case '\r':
                            iD31 = i0.d0(parcel, i31);
                            break;
                        case 14:
                            zA13 = i0.a0(parcel, i31);
                            break;
                        case 15:
                            strV29 = i0.v(parcel, i31);
                            break;
                    }
                }
                i0.D(parcel, iO21);
                return new h(iD28, iD29, iD30, strV28, iBinderC1, scopeArr, bundle, account3, cVarArr2, cVarArr3, zA12, iD31, zA13, strV29);
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                return new ka.b((PendingIntent) parcel.readParcelable(ka.a.class.getClassLoader()), parcel.readInt() != 0);
            default:
                n.f(parcel, "source");
                return new l7.a(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f40713a) {
            case 0:
                return new GoogleSignInAccount[i10];
            case 1:
                return new GoogleSignInOptions[i10];
            case 2:
                return new SignInAccount[i10];
            case 3:
                return new g9.a[i10];
            case 4:
                return new SignInConfiguration[i10];
            case 5:
                return new gd.c[i10];
            case 6:
                return new Trace[i10];
            case 7:
                return new h.a[i10];
            case 8:
                return new j[i10];
            case 9:
                return new h9.a[i10];
            case 10:
                return new e[i10];
            case 11:
                return new h9.b[i10];
            case 12:
                return new ConnectionResult[i10];
            case 13:
                return new i9.c[i10];
            case 14:
                return new r[i10];
            case 15:
                return new ia.b[i10];
            case 16:
                return new ia.e[i10];
            case 17:
                return new f[i10];
            case 18:
                return new jd.a[i10];
            case 19:
                return new o[i10];
            case 20:
                return new k9.r[i10];
            case 21:
                return new k[i10];
            case 22:
                return new v[i10];
            case 23:
                return new w[i10];
            case 24:
                return new k9.n[i10];
            case 25:
                return new k0[i10];
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                return new g[i10];
            case 27:
                return new h[i10];
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                return new ka.a[i10];
            default:
                return new l7.a[i10];
        }
    }
}
