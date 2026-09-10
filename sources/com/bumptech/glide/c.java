package com.bumptech.glide;

import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.util.Log;
import android.webkit.ClientCertRequest;
import com.google.android.gms.internal.ads.bq0;
import com.google.android.gms.internal.ads.ur1;
import com.google.android.gms.internal.measurement.nf;
import com.google.android.gms.internal.play_billing.b2;
import com.google.android.gms.internal.play_billing.i1;
import com.google.android.gms.internal.play_billing.m2;
import com.google.android.gms.internal.play_billing.q1;
import com.google.android.gms.internal.play_billing.s2;
import com.google.android.gms.internal.play_billing.t1;
import com.google.android.gms.internal.play_billing.u1;
import com.google.android.gms.internal.play_billing.w2;
import com.google.android.gms.internal.play_billing.y1;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.unity3d.services.UnityAdsConstants;
import i2.r;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.n;
import l7.b0;
import l7.f0;
import pm.a0;
import pm.j0;
import pm.q0;
import pm.r0;
import pm.t0;
import pm.u;
import pm.y;
import q7.h0;
import qk.i0;
import wk.m;
import xi.l;
import xj.p;
import xj.v;
import zk.m0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static void A(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + cls.getDeclaredConstructor(null).newInstance(null));
            } catch (IllegalAccessException e10) {
                G(cls, e10);
                throw null;
            } catch (InstantiationException e11) {
                G(cls, e11);
                throw null;
            } catch (NoSuchMethodException e12) {
                G(cls, e12);
                throw null;
            } catch (InvocationTargetException e13) {
                G(cls, e13);
                throw null;
            }
        } catch (ClassNotFoundException e14) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e14);
        }
    }

    public static Uri B(Uri uri) {
        if (!uri.isHierarchical() || uri.getQueryParameter("CMCD") == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (String str : uri.getQueryParameterNames()) {
            if (!str.equals("CMCD")) {
                Iterator<String> it = uri.getQueryParameters(str).iterator();
                while (it.hasNext()) {
                    builderBuildUpon.appendQueryParameter(str, it.next());
                }
            }
        }
        return builderBuildUpon.build();
    }

    public static final boolean C(y yVar) {
        zk.g gVarE = yVar.P().e();
        if (gVarE != null && bm.g.b(gVarE) && !fm.e.g((zk.e) gVarE).equals(m.f53369g)) {
            return true;
        }
        zk.g gVarE2 = yVar.P().e();
        m0 m0Var = gVarE2 instanceof m0 ? (m0) gVarE2 : null;
        return m0Var == null ? false : C(i0.O(m0Var));
    }

    public static int D(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static long E(long j10, long j11) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j11) + Long.numberOfLeadingZeros(j11) + Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10);
        if (iNumberOfLeadingZeros > 65) {
            return j10 * j11;
        }
        long j12 = ((j10 ^ j11) >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j11 == Long.MIN_VALUE) & (j10 < 0)))) {
            long j13 = j10 * j11;
            if (j10 == 0 || j13 / j10 == j11) {
                return j13;
            }
        }
        return j12;
    }

    public static void F(xi.f binaryMessenger, final tj.h hVar) {
        nf nfVar;
        n.f(binaryMessenger, "binaryMessenger");
        l hVar2 = (hVar == null || (nfVar = hVar.f50828a) == null) ? new defpackage.h(10) : nfVar.e();
        Object obj = null;
        k5.g gVar = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.cancel", hVar2, obj);
        if (hVar != null) {
            final int i10 = 0;
            gVar.C(new xi.b() { // from class: tj.w
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    int i11 = i10;
                    h hVar3 = hVar;
                    switch (i11) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest = (ClientCertRequest) obj3;
                            try {
                                hVar3.getClass();
                                clientCertRequest.cancel();
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) obj4;
                            try {
                                hVar3.getClass();
                                clientCertRequest2.ignore();
                                listQ2 = j1.f.C(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) obj5;
                            Object obj6 = list.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type java.security.PrivateKey");
                            PrivateKey privateKey = (PrivateKey) obj6;
                            Object obj7 = list.get(2);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
                            List list2 = (List) obj7;
                            try {
                                hVar3.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof a) {
                                    a aVar3 = th4;
                                    listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            break;
                    }
                }
            });
        } else {
            gVar.C(null);
        }
        k5.g gVar2 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.ignore", hVar2, obj);
        if (hVar != null) {
            final int i11 = 1;
            gVar2.C(new xi.b() { // from class: tj.w
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    int i12 = i11;
                    h hVar3 = hVar;
                    switch (i12) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest = (ClientCertRequest) obj3;
                            try {
                                hVar3.getClass();
                                clientCertRequest.cancel();
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) obj4;
                            try {
                                hVar3.getClass();
                                clientCertRequest2.ignore();
                                listQ2 = j1.f.C(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) obj5;
                            Object obj6 = list.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type java.security.PrivateKey");
                            PrivateKey privateKey = (PrivateKey) obj6;
                            Object obj7 = list.get(2);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
                            List list2 = (List) obj7;
                            try {
                                hVar3.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof a) {
                                    a aVar3 = th4;
                                    listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            break;
                    }
                }
            });
        } else {
            gVar2.C(null);
        }
        k5.g gVar3 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.proceed", hVar2, obj);
        if (hVar == null) {
            gVar3.C(null);
        } else {
            final int i12 = 2;
            gVar3.C(new xi.b() { // from class: tj.w
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    int i13 = i12;
                    h hVar3 = hVar;
                    switch (i13) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest = (ClientCertRequest) obj3;
                            try {
                                hVar3.getClass();
                                clientCertRequest.cancel();
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) obj4;
                            try {
                                hVar3.getClass();
                                clientCertRequest2.ignore();
                                listQ2 = j1.f.C(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) obj5;
                            Object obj6 = list.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type java.security.PrivateKey");
                            PrivateKey privateKey = (PrivateKey) obj6;
                            Object obj7 = list.get(2);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
                            List list2 = (List) obj7;
                            try {
                                hVar3.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof a) {
                                    a aVar3 = th4;
                                    listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            break;
                    }
                }
            });
        }
    }

    public static void G(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(defpackage.e.l(cls, "Unable to instantiate GlideModule implementation for "), reflectiveOperationException);
    }

    public static int[] H(Collection collection) {
        if (collection instanceof sa.b) {
            sa.b bVar = (sa.b) collection;
            return Arrays.copyOfRange(bVar.f50223a, bVar.f50224b, bVar.f50225c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = array[i10];
            obj.getClass();
            iArr[i10] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static final int J(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((dh.a) it.next()).f38871c.size();
        }
        return size;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000b  */
    /* JADX WARN: Multi-variable type inference failed */
    public static Integer K(String str) {
        byte b10;
        Integer num;
        Long l;
        Long lValueOf;
        Long lValueOf2;
        byte b11;
        str.getClass();
        if (str.isEmpty()) {
            l = 0;
            num = null;
        } else {
            int i10 = str.charAt(0) == '-' ? 1 : 0;
            if (i10 == str.length()) {
                l = 0;
                num = null;
            } else {
                int i11 = i10 + 1;
                char cCharAt = str.charAt(i10);
                if (cCharAt < 128) {
                    b10 = sa.c.f50226a[cCharAt];
                } else {
                    byte[] bArr = sa.c.f50226a;
                    b10 = -1;
                }
                if (b10 < 0 || b10 >= 10) {
                    num = null;
                    l = num;
                } else {
                    long j10 = -b10;
                    long j11 = 10;
                    long j12 = Long.MIN_VALUE / j11;
                    while (true) {
                        if (i11 < str.length()) {
                            int i12 = i11 + 1;
                            char cCharAt2 = str.charAt(i11);
                            if (cCharAt2 < 128) {
                                b11 = sa.c.f50226a[cCharAt2];
                            } else {
                                byte[] bArr2 = sa.c.f50226a;
                                b11 = -1;
                            }
                            if (b11 < 0 || b11 >= 10 || j10 < j12) {
                                num = null;
                            } else {
                                long j13 = j10 * j11;
                                num = null;
                                long j14 = b11;
                                if (j13 >= j14 - Long.MIN_VALUE) {
                                    j10 = j13 - j14;
                                    i11 = i12;
                                }
                            }
                        } else {
                            num = null;
                            if (i10 != 0) {
                                lValueOf2 = Long.valueOf(j10);
                            } else if (j10 != Long.MIN_VALUE) {
                                lValueOf = Long.valueOf(-j10);
                            }
                        }
                        l = num;
                    }
                }
            }
        }
        if (l != 0) {
            l = lValueOf;
            l = lValueOf2;
            if (l.longValue() == l.intValue()) {
                return Integer.valueOf(l.intValue());
            }
        }
        l = lValueOf;
        l = lValueOf2;
        return num;
    }

    public static t0 L(t0 t0Var) {
        if (!(t0Var instanceof u)) {
            return new cm.d(t0Var, 0);
        }
        u uVar = (u) t0Var;
        m0[] other = uVar.f48477b;
        q0[] q0VarArr = uVar.f48478c;
        n.f(q0VarArr, "<this>");
        n.f(other, "other");
        int iMin = Math.min(q0VarArr.length, other.length);
        ArrayList<wj.f> arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(new wj.f(q0VarArr[i10], other[i10]));
        }
        ArrayList arrayList2 = new ArrayList(p.W(arrayList, 10));
        for (wj.f fVar : arrayList) {
            arrayList2.add(f((q0) fVar.f53283a, (m0) fVar.f53284b));
        }
        return new u(other, (q0[]) arrayList2.toArray(new q0[0]), true);
    }

    public static int M(byte[] bArr, int i10, ur1 ur1Var) throws b2 {
        int iS = S(bArr, i10, ur1Var);
        int i11 = ur1Var.f20874a;
        if (i11 < 0) {
            throw new b2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iS) {
            throw new b2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            ur1Var.f20876c = i1.f24285c;
            return iS;
        }
        ur1Var.f20876c = i1.p(bArr, iS, i11);
        return iS + i11;
    }

    public static void N(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(l1.d.k(new StringBuilder(String.valueOf(i11).length() + 9), "at index ", i11));
            }
        }
    }

    public static int O(int i10, byte[] bArr) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public static int P(s2 s2Var, int i10, byte[] bArr, int i11, int i12, y1 y1Var, ur1 ur1Var) throws b2 {
        t1 t1VarZze = s2Var.zze();
        s2 s2Var2 = s2Var;
        byte[] bArr2 = bArr;
        int i13 = i12;
        ur1 ur1Var2 = ur1Var;
        int iX = X(t1VarZze, s2Var2, bArr2, i11, i13, ur1Var2);
        s2Var2.b(t1VarZze);
        ur1Var2.f20876c = t1VarZze;
        y1Var.add(t1VarZze);
        while (iX < i13) {
            ur1 ur1Var3 = ur1Var2;
            int i14 = i13;
            int iS = S(bArr2, iX, ur1Var3);
            if (i10 != ur1Var3.f20874a) {
                break;
            }
            byte[] bArr3 = bArr2;
            s2 s2Var3 = s2Var2;
            t1 t1VarZze2 = s2Var3.zze();
            iX = X(t1VarZze2, s2Var3, bArr3, iS, i14, ur1Var3);
            s2Var2 = s2Var3;
            bArr2 = bArr3;
            i13 = i14;
            ur1Var2 = ur1Var3;
            s2Var2.b(t1VarZze2);
            ur1Var2.f20876c = t1VarZze2;
            y1Var.add(t1VarZze2);
        }
        return iX;
    }

    public static int Q(byte[] bArr, int i10, y1 y1Var, ur1 ur1Var) throws b2 {
        u1 u1Var = (u1) y1Var;
        int iS = S(bArr, i10, ur1Var);
        int i11 = ur1Var.f20874a + iS;
        while (iS < i11) {
            iS = S(bArr, iS, ur1Var);
            u1Var.m(ur1Var.f20874a);
        }
        if (iS == i11) {
            return iS;
        }
        throw new b2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int R(int i10, byte[] bArr, int i11, int i12, w2 w2Var, ur1 ur1Var) throws b2 {
        if ((i10 >>> 3) == 0) {
            throw new b2("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iV = V(bArr, i11, ur1Var);
            w2Var.c(i10, Long.valueOf(ur1Var.f20875b));
            return iV;
        }
        if (i13 == 1) {
            w2Var.c(i10, Long.valueOf(Y(i11, bArr)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iS = S(bArr, i11, ur1Var);
            int i14 = ur1Var.f20874a;
            if (i14 < 0) {
                throw new b2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iS) {
                throw new b2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                w2Var.c(i10, i1.f24285c);
            } else {
                w2Var.c(i10, i1.p(bArr, iS, i14));
            }
            return iS + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new b2("Protocol message contained an invalid tag (zero).");
            }
            w2Var.c(i10, Integer.valueOf(O(i11, bArr)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        w2 w2VarB = w2.b();
        int i16 = ur1Var.f20877d + 1;
        ur1Var.f20877d = i16;
        if (i16 >= 100) {
            throw new b2("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i17 = 0;
        while (i11 < i12) {
            int iS2 = S(bArr, i11, ur1Var);
            int i18 = ur1Var.f20874a;
            if (i18 == i15) {
                i17 = i18;
                i11 = iS2;
                break;
            }
            i11 = R(i18, bArr, iS2, i12, w2VarB, ur1Var);
            i17 = i18;
        }
        ur1Var.f20877d--;
        if (i11 > i12 || i17 != i15) {
            throw new b2("Failed to parse the message.");
        }
        w2Var.c(i10, w2VarB);
        return i11;
    }

    public static int S(byte[] bArr, int i10, ur1 ur1Var) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return T(b10, bArr, i11, ur1Var);
        }
        ur1Var.f20874a = b10;
        return i11;
    }

    public static int T(int i10, byte[] bArr, int i11, ur1 ur1Var) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            ur1Var.f20874a = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            ur1Var.f20874a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            ur1Var.f20874a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            ur1Var.f20874a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                ur1Var.f20874a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int U(int i10, byte[] bArr, int i11, int i12, y1 y1Var, ur1 ur1Var) {
        u1 u1Var = (u1) y1Var;
        int iS = S(bArr, i11, ur1Var);
        u1Var.m(ur1Var.f20874a);
        while (iS < i12) {
            int iS2 = S(bArr, iS, ur1Var);
            if (i10 != ur1Var.f20874a) {
                break;
            }
            iS = S(bArr, iS2, ur1Var);
            u1Var.m(ur1Var.f20874a);
        }
        return iS;
    }

    public static int V(byte[] bArr, int i10, ur1 ur1Var) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            ur1Var.f20875b = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & 127)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & 127)) << i13;
            b10 = b11;
            i12 = i14;
        }
        ur1Var.f20875b = j11;
        return i12;
    }

    public static int W(Object obj, s2 s2Var, byte[] bArr, int i10, int i11, int i12, ur1 ur1Var) throws b2 {
        m2 m2Var = (m2) s2Var;
        int i13 = ur1Var.f20877d + 1;
        ur1Var.f20877d = i13;
        if (i13 >= 100) {
            throw new b2("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iS = m2Var.s(obj, bArr, i10, i11, i12, ur1Var);
        ur1Var.f20877d--;
        ur1Var.f20876c = obj;
        return iS;
    }

    public static int X(Object obj, s2 s2Var, byte[] bArr, int i10, int i11, ur1 ur1Var) throws b2 {
        int iT = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iT = T(i12, bArr, iT, ur1Var);
            i12 = ur1Var.f20874a;
        }
        int i13 = iT;
        if (i12 < 0 || i12 > i11 - i13) {
            throw new b2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = ur1Var.f20877d + 1;
        ur1Var.f20877d = i14;
        if (i14 >= 100) {
            throw new b2("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i15 = i13 + i12;
        s2Var.g(obj, bArr, i13, i15, ur1Var);
        ur1Var.f20877d--;
        ur1Var.f20876c = obj;
        return i15;
    }

    public static long Y(int i10, byte[] bArr) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    public static List a(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new sa.b(0, iArr.length, iArr);
    }

    public static long b(long j10, long j11) {
        long j12 = j10 + j11;
        if (((j10 ^ j11) < 0) || ((j10 ^ j12) >= 0)) {
            return j12;
        }
        throw new ArithmeticException(defpackage.e.r(wi.d.l(j10, "overflow: checkedAdd(", ", "), j11, ")"));
    }

    public static int c(long j10) {
        int i10 = (int) j10;
        go.k.f(j10, ((long) i10) == j10, "Out of range: %s");
        return i10;
    }

    public static final void d(jk.b bVar, kj.d dVar) {
        bVar.invoke(new wj.h(t9.e.c(dVar)));
    }

    public static final wj.f e(List list, Set toRemove) {
        n.f(toRemove, "toRemove");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dh.a aVar = (dh.a) it.next();
            ArrayList arrayList3 = aVar.f38871c;
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                dh.b bVar = (dh.b) it2.next();
                dh.b bVar2 = toRemove.contains(bVar.f38876a) ? null : bVar;
                if (bVar2 != null) {
                    arrayList4.add(bVar2);
                }
            }
            aVar.a(arrayList4);
            if (aVar.f38871c.size() < aVar.f38870b.d()) {
                if (!aVar.f38871c.isEmpty()) {
                    arrayList.addAll(aVar.f38871c);
                }
                aVar = null;
            }
            if (aVar != null) {
                arrayList2.add(aVar);
            }
        }
        return new wj.f(xj.n.O0(arrayList2), arrayList);
    }

    public static final q0 f(q0 q0Var, m0 m0Var) {
        if (m0Var == null || q0Var.a() == 1) {
            return q0Var;
        }
        if (m0Var.v() != q0Var.a()) {
            cm.c cVar = new cm.c(q0Var);
            j0.f48443b.getClass();
            return new r0(1, new cm.a(q0Var, cVar, false, j0.f48444c));
        }
        if (!q0Var.c()) {
            return new r0(q0Var.b());
        }
        om.b NO_LOCKS = om.l.f47582e;
        n.e(NO_LOCKS, "NO_LOCKS");
        return new r0(1, new a0(NO_LOCKS, new al.l(q0Var, 5)));
    }

    public static bq0 g(r rVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = rVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (rVar.a(i11, jElapsedRealtime)) {
                i10++;
            }
        }
        return new bq0(1, 0, length, i10);
    }

    public static boolean h(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj2 != null) {
            if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                return Arrays.equals((byte[]) obj, (byte[]) obj2);
            }
            if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                return Arrays.equals((int[]) obj, (int[]) obj2);
            }
            if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                return Arrays.equals((long[]) obj, (long[]) obj2);
            }
            if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                if (dArr.length == dArr2.length) {
                    int length = dArr.length;
                    for (int i10 = 0; i10 < length; i10++) {
                        if (k(dArr[i10], dArr2[i10])) {
                        }
                    }
                    return true;
                }
            } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                float[] fArr = (float[]) obj;
                float[] fArr2 = (float[]) obj2;
                if (fArr.length == fArr2.length) {
                    int length2 = fArr.length;
                    for (int i11 = 0; i11 < length2; i11++) {
                        if (l(fArr[i11], fArr2[i11])) {
                        }
                    }
                    return true;
                }
            } else if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                Object[] objArr = (Object[]) obj;
                Object[] objArr2 = (Object[]) obj2;
                if (objArr.length == objArr2.length) {
                    int length3 = objArr.length;
                    for (int i12 = 0; i12 < length3; i12++) {
                        if (h(objArr[i12], objArr2[i12])) {
                        }
                    }
                    return true;
                }
            } else if ((obj instanceof List) && (obj2 instanceof List)) {
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list.size() == list2.size()) {
                    Iterator it = list.iterator();
                    Iterator it2 = list2.iterator();
                    while (it.hasNext() && it2.hasNext()) {
                        if (!h(it.next(), it2.next())) {
                        }
                    }
                    return true;
                }
            } else {
                if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
                    if ((obj instanceof Double) && (obj2 instanceof Double)) {
                        return k(((Number) obj).doubleValue(), ((Number) obj2).doubleValue());
                    }
                    return ((obj instanceof Float) && (obj2 instanceof Float)) ? l(((Number) obj).floatValue(), ((Number) obj2).floatValue()) : obj.equals(obj2);
                }
                Map map = (Map) obj;
                Map map2 = (Map) obj2;
                if (map.size() == map2.size()) {
                    loop4: for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        for (Map.Entry entry2 : map2.entrySet()) {
                            if (h(key, entry2.getKey())) {
                                if (!h(entry.getValue(), entry2.getValue())) {
                                    break loop4;
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static int i(Object obj) {
        int i10 = 0;
        if (obj == null) {
            return 0;
        }
        if (obj instanceof byte[]) {
            return Arrays.hashCode((byte[]) obj);
        }
        if (obj instanceof int[]) {
            return Arrays.hashCode((int[]) obj);
        }
        if (obj instanceof long[]) {
            return Arrays.hashCode((long[]) obj);
        }
        int i11 = 1;
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length = dArr.length;
            while (i10 < length) {
                double d10 = dArr[i10];
                int i12 = i11 * 31;
                if (d10 == 0.0d) {
                    d10 = 0.0d;
                }
                long jDoubleToLongBits = Double.doubleToLongBits(d10);
                i11 = i12 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                i10++;
            }
            return i11;
        }
        boolean z10 = obj instanceof float[];
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z10) {
            float[] fArr = (float[]) obj;
            int length2 = fArr.length;
            while (i10 < length2) {
                float f11 = fArr[i10];
                int i13 = i11 * 31;
                if (f11 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f11 = 0.0f;
                }
                i11 = i13 + Float.floatToIntBits(f11);
                i10++;
            }
            return i11;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length3 = objArr.length;
            while (i10 < length3) {
                i11 = (i11 * 31) + i(objArr[i10]);
                i10++;
            }
            return i11;
        }
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                i11 = (i11 * 31) + i(it.next());
            }
            return i11;
        }
        if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                i10 += i(entry.getValue()) ^ (i(entry.getKey()) * 31);
            }
            return i10;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Number) obj).doubleValue();
            long jDoubleToLongBits2 = Double.doubleToLongBits(dDoubleValue != 0.0d ? dDoubleValue : 0.0d);
            return (int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32));
        }
        if (!(obj instanceof Float)) {
            return obj.hashCode();
        }
        float fFloatValue = ((Number) obj).floatValue();
        if (fFloatValue != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f10 = fFloatValue;
        }
        return Float.floatToIntBits(f10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static long j(long j10, long j11, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j12 = j10 / j11;
        long j13 = j10 - (j11 * j12);
        if (j13 == 0) {
            return j12;
        }
        int i10 = ((int) ((j10 ^ j11) >> 63)) | 1;
        switch (ra.e.f49519a[roundingMode.ordinal()]) {
            case 1:
                d.k(j13 == 0);
                return j12;
            case 2:
                return j12;
            case 3:
                if (i10 >= 0) {
                    return j12;
                }
                return j12 + ((long) i10);
            case 4:
                return j12 + ((long) i10);
            case 5:
                if (i10 <= 0) {
                    return j12;
                }
                return j12 + ((long) i10);
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j13);
                long jAbs2 = jAbs - (Math.abs(j11) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j12) == 0)) {
                        return j12;
                    }
                } else if (jAbs2 <= 0) {
                    return j12;
                }
                return j12 + ((long) i10);
            default:
                throw new AssertionError();
        }
    }

    public static boolean k(double d10, double d11) {
        if ((d10 == 0.0d ? 0.0d : d10) == (d11 != 0.0d ? d11 : 0.0d)) {
            return true;
        }
        return Double.isNaN(d10) && Double.isNaN(d11);
    }

    public static boolean l(float f10, float f11) {
        float f12 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f13 = f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : f10;
        if (f11 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f12 = f11;
        }
        if (f13 == f12) {
            return true;
        }
        return Float.isNaN(f10) && Float.isNaN(f11);
    }

    public static int m(byte b10, byte b11, byte b12, byte b13) {
        return (b10 << 24) | ((b11 & 255) << 16) | ((b12 & 255) << 8) | (b13 & 255);
    }

    public static long n(long j10, long j11) {
        d.i(j10, "a");
        d.i(j11, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
        if (j10 == 0) {
            return j11;
        }
        if (j11 == 0) {
            return j10;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
        long jNumberOfTrailingZeros = j10 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j11);
        long j12 = j11 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j12) {
            long j13 = jNumberOfTrailingZeros - j12;
            long j14 = (j13 >> 63) & j13;
            long j15 = (j13 - j14) - j14;
            j12 += j14;
            jNumberOfTrailingZeros = j15 >> Long.numberOfTrailingZeros(j15);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static xn.k o(SSLSession sSLSession) throws IOException {
        List listK;
        List listK2 = v.f53866a;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        xn.h hVarC = xn.h.f53946b.c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        xn.a0 a0VarO = q1.o(protocol);
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            listK = peerCertificates != null ? yn.a.k(Arrays.copyOf(peerCertificates, peerCertificates.length)) : listK2;
        } catch (SSLPeerUnverifiedException unused) {
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            listK2 = yn.a.k(Arrays.copyOf(localCertificates, localCertificates.length));
        }
        return new xn.k(a0VarO, hVarC, listK2, new uk.c(listK, 2));
    }

    public static final yl.b r(vl.f fVar, int i10) {
        n.f(fVar, "<this>");
        return yl.b.e(fVar.h(i10), fVar.b(i10));
    }

    public static final yl.f s(vl.f fVar, int i10) {
        n.f(fVar, "<this>");
        return yl.f.d(fVar.getString(i10));
    }

    public static String u(String str, String str2) {
        return l1.d.g("https://console.firebase.google.com/project/", str, "/performance/app/android:", str2);
    }

    public static int v(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static final b0 x(l7.a aVar, Uri uri, h0 h0Var) {
        String path = uri.getPath();
        boolean zEqualsIgnoreCase = X3.i.f27782b.equalsIgnoreCase(uri.getScheme());
        f0 f0Var = f0.f45121b;
        if (zEqualsIgnoreCase && path != null) {
            l7.y yVar = new l7.y(ParcelFileDescriptor.open(new File(path), 268435456));
            Bundle bundle = new Bundle(1);
            bundle.putParcelable(X3.i.f27782b, yVar);
            return new b0(aVar, "me/staging_resources", bundle, f0Var, h0Var);
        }
        if (!"content".equalsIgnoreCase(uri.getScheme())) {
            throw new l7.n("The image Uri must be either a file:// or content:// Uri");
        }
        l7.y yVar2 = new l7.y(uri);
        Bundle bundle2 = new Bundle(1);
        bundle2.putParcelable(X3.i.f27782b, yVar2);
        return new b0(aVar, "me/staging_resources", bundle2, f0Var, h0Var);
    }

    public abstract Object I(ck.c cVar);

    public abstract Method p(Class cls, Field field);

    public abstract Constructor q(Class cls);

    public abstract String[] t(Class cls);

    public abstract boolean w(Class cls);

    public abstract void y(Throwable th2);

    public abstract void z(zc.u uVar);
}
