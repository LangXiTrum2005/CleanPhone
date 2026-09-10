package com.google.android.gms.internal.play_billing;

import android.graphics.Bitmap;
import android.net.http.SslCertificate;
import android.util.Log;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.rb;
import com.google.android.gms.internal.measurement.nf;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q1 implements he.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static zc.u f24451a;

    public static final lo.b A(Socket socket) throws IOException {
        Logger logger = lo.l.f45652a;
        lo.s sVar = new lo.s(socket);
        OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.n.e(outputStream, "getOutputStream(...)");
        return new lo.b(0, sVar, new lo.b(1, outputStream, sVar));
    }

    public static final lo.c B(InputStream inputStream) {
        Logger logger = lo.l.f45652a;
        return new lo.c(1, inputStream, new lo.v());
    }

    public static final lo.c C(Socket socket) throws IOException {
        Logger logger = lo.l.f45652a;
        lo.s sVar = new lo.s(socket);
        InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.n.e(inputStream, "getInputStream(...)");
        return new lo.c(0, sVar, new lo.c(1, inputStream, sVar));
    }

    public static byte[] D(rb rbVar) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(Segment.SIZE, Math.max(128, Integer.highestOneBit(0) * 2));
        int i10 = 0;
        while (i10 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i10);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i11 = 0;
            while (i11 < iMin2) {
                int i12 = rbVar.read(bArr, i11, iMin2 - i11);
                if (i12 == -1) {
                    return f(arrayDeque, i10);
                }
                i11 += i12;
                i10 += i12;
            }
            long j10 = ((long) iMin) * ((long) (iMin < 4096 ? 4 : 2));
            if (j10 > 2147483647L) {
                iMin = Integer.MAX_VALUE;
            } else {
                iMin = j10 < -2147483648L ? Integer.MIN_VALUE : (int) j10;
            }
        }
        if (rbVar.read() == -1) {
            return f(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static final ArrayList E(JSONArray jSONArray) throws JSONException {
        pk.c cVarO = com.bumptech.glide.d.O(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(xj.p.W(cVarO, 10));
        pk.b bVarB = cVarO.iterator();
        while (bVarB.f48398c) {
            Object objE = jSONArray.get(bVarB.nextInt());
            if (objE instanceof JSONObject) {
                objE = G((JSONObject) objE);
            } else if (objE instanceof JSONArray) {
                objE = E((JSONArray) objE);
            } else if (kotlin.jvm.internal.n.a(objE, JSONObject.NULL)) {
                objE = null;
            }
            arrayList.add(objE);
        }
        return arrayList;
    }

    public static String F(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (w(str.charAt(i10))) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c4 = charArray[i10];
                    if (w(c4)) {
                        charArray[i10] = (char) (c4 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static final LinkedHashMap G(JSONObject jSONObject) throws JSONException {
        Iterator<String> itKeys = jSONObject.keys();
        kotlin.jvm.internal.n.e(itKeys, "keys(...)");
        zm.i iVarM = zm.l.M(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : (zm.a) iVarM) {
            Object objE = jSONObject.get((String) obj);
            if (objE instanceof JSONObject) {
                objE = G((JSONObject) objE);
            } else if (objE instanceof JSONArray) {
                objE = E((JSONArray) objE);
            } else if (kotlin.jvm.internal.n.a(objE, JSONObject.NULL)) {
                objE = null;
            }
            linkedHashMap.put(obj, objE);
        }
        return linkedHashMap;
    }

    public static String H(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c4 = charArray[i10];
                    if (c4 >= 'a' && c4 <= 'z') {
                        charArray[i10] = (char) (c4 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static Object I(jk.c cVar, Object obj, ak.f fVar) {
        kotlin.jvm.internal.n.f(cVar, "<this>");
        ak.k context = fVar.getContext();
        Object dVar = context == ak.l.f3620a ? new bk.d(fVar) : new bk.e(fVar, context);
        kotlin.jvm.internal.h0.d(2, cVar);
        return cVar.invoke(obj, dVar);
    }

    public static /* synthetic */ boolean J(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, i4 i4Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(i4Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(i4Var) != obj && atomicReferenceFieldUpdater.get(i4Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static l1 K() {
        String strI;
        ClassLoader classLoader = q1.class.getClassLoader();
        if (l1.class.equals(l1.class)) {
            strI = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!l1.class.getPackage().equals(q1.class.getPackage())) {
                throw new IllegalArgumentException(l1.class.getName());
            }
            strI = q4.a.i(l1.class.getPackage().getName(), ".BlazeGenerated", l1.class.getSimpleName(), "Loader");
        }
        try {
            try {
                try {
                    defpackage.e.z(Class.forName(strI, true, classLoader).getConstructor(null).newInstance(null));
                    throw null;
                } catch (IllegalAccessException e10) {
                    throw new IllegalStateException(e10);
                } catch (NoSuchMethodException e11) {
                    throw new IllegalStateException(e11);
                }
            } catch (InstantiationException e12) {
                throw new IllegalStateException(e12);
            } catch (InvocationTargetException e13) {
                throw new IllegalStateException(e13);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new q1[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    } catch (ServiceConfigurationError e14) {
                        Logger.getLogger(j1.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(l1.class.getSimpleName()), (Throwable) e14);
                    }
                }
                if (arrayList.size() == 1) {
                    return (l1) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (l1) l1.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e15) {
                    throw new IllegalStateException(e15);
                } catch (NoSuchMethodException e16) {
                    throw new IllegalStateException(e16);
                } catch (InvocationTargetException e17) {
                    throw new IllegalStateException(e17);
                }
            } catch (Throwable th2) {
                throw new ServiceConfigurationError(th2.getMessage(), th2);
            }
        }
    }

    public static int a(boolean[] zArr, int i10, int[] iArr, boolean z10) {
        int i11 = 0;
        for (int i12 : iArr) {
            int i13 = 0;
            while (i13 < i12) {
                zArr[i10] = z10;
                i13++;
                i10++;
            }
            i11 += i12;
            z10 = !z10;
        }
        return i11;
    }

    public static final lo.m b(lo.r rVar) {
        kotlin.jvm.internal.n.f(rVar, "<this>");
        return new lo.m(rVar);
    }

    public static void c(String str, float f10) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException(str.concat(" must not be NaN"));
        }
        if (Float.isInfinite(f10)) {
            throw new IllegalArgumentException(str.concat(" must not be infinite"));
        }
    }

    public static final void d(String str) {
        File file = new File(str);
        File parentFile = file.getParentFile();
        kotlin.jvm.internal.n.c(parentFile);
        if (parentFile.exists()) {
            return;
        }
        File parentFile2 = file.getParentFile();
        kotlin.jvm.internal.n.c(parentFile2);
        parentFile2.mkdirs();
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static byte[] f(ArrayDeque arrayDeque, int i10) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i10) {
            return bArr;
        }
        int length = i10 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i10 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static final al.j g(al.j first, al.j second) {
        kotlin.jvm.internal.n.f(first, "first");
        kotlin.jvm.internal.n.f(second, "second");
        if (first.isEmpty()) {
            return second;
        }
        return second.isEmpty() ? first : new al.k(new al.j[]{first, second});
    }

    public static vl.g h(tl.d1 table) {
        kotlin.jvm.internal.n.f(table, "table");
        if (table.f51187b.size() == 0) {
            return vl.g.f52655b;
        }
        List list = table.f51187b;
        kotlin.jvm.internal.n.e(list, "table.requirementList");
        return new vl.g(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ak.f j(ak.f fVar, ak.f fVar2, jk.c cVar) {
        kotlin.jvm.internal.n.f(cVar, "<this>");
        if (cVar instanceof ck.a) {
            return ((ck.a) cVar).create(fVar, fVar2);
        }
        ak.k context = fVar2.getContext();
        return context == ak.l.f3620a ? new bk.b(fVar2, fVar, cVar) : new bk.c(fVar2, context, cVar, fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean k(Object obj, Object obj2) {
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
            return Arrays.equals((double[]) obj, (double[]) obj2);
        }
        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) obj2;
            if (objArr.length != objArr2.length) {
                return false;
            }
            pk.c cVarQ0 = xj.k.q0(objArr);
            if ((cVarQ0 instanceof Collection) && ((Collection) cVarQ0).isEmpty()) {
                return true;
            }
            pk.b bVarB = cVarQ0.iterator();
            while (bVarB.f48398c) {
                int iNextInt = bVarB.nextInt();
                if (!k(objArr[iNextInt], objArr2[iNextInt])) {
                    return false;
                }
            }
            return true;
        }
        if ((obj instanceof List) && (obj2 instanceof List)) {
            List list = (List) obj;
            List list2 = (List) obj2;
            if (list.size() != list2.size()) {
                return false;
            }
            pk.c cVarO = xj.o.O((Collection) obj);
            if ((cVarO instanceof Collection) && ((Collection) cVarO).isEmpty()) {
                return true;
            }
            pk.b bVarB2 = cVarO.iterator();
            while (bVarB2.f48398c) {
                int iNextInt2 = bVarB2.nextInt();
                if (!k(list.get(iNextInt2), list2.get(iNextInt2))) {
                    return false;
                }
            }
            return true;
        }
        if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
            return kotlin.jvm.internal.n.a(obj, obj2);
        }
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        if (map.size() != map2.size()) {
            return false;
        }
        if (map.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !k(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public static boolean m(String str, String str2) {
        char c4;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                char cCharAt2 = str2.charAt(i10);
                if (cCharAt == cCharAt2 || ((c4 = (char) ((cCharAt | ' ') - 97)) < 26 && c4 == ((char) ((cCharAt2 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final el.b n(el.c cVar, yl.b classId, xl.f jvmMetadataVersion) {
        kotlin.jvm.internal.n.f(cVar, "<this>");
        kotlin.jvm.internal.n.f(classId, "classId");
        kotlin.jvm.internal.n.f(jvmMetadataVersion, "jvmMetadataVersion");
        qj.x xVarB = cVar.b(classId, jvmMetadataVersion);
        if (xVarB != null) {
            return (el.b) xVarB.f49096b;
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static xn.a0 o(String javaName) {
        kotlin.jvm.internal.n.f(javaName, "javaName");
        int iHashCode = javaName.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (javaName.equals("TLSv1.1")) {
                            return xn.a0.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (javaName.equals("TLSv1.2")) {
                            return xn.a0.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (javaName.equals("TLSv1.3")) {
                            return xn.a0.TLS_1_3;
                        }
                        break;
                }
            } else if (javaName.equals("TLSv1")) {
                return xn.a0.TLS_1_0;
            }
        } else if (javaName.equals("SSLv3")) {
            return xn.a0.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(javaName));
    }

    public static e8.d p(Map map) {
        Object obj = map.get("width");
        kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj).intValue();
        Object obj2 = map.get("height");
        kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue2 = ((Integer) obj2).intValue();
        Object obj3 = map.get("format");
        kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue3 = ((Integer) obj3).intValue();
        Object obj4 = map.get("quality");
        kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue4 = ((Integer) obj4).intValue();
        Object obj5 = map.get("frame");
        kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Int");
        return new e8.d(iIntValue, iIntValue2, iIntValue3 == 0 ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.PNG, iIntValue4, ((Integer) obj5).intValue());
    }

    public static final int q(uk.f fVar) {
        kotlin.jvm.internal.n.f(fVar, "<this>");
        return fVar.a().size();
    }

    public static final Object s(w0.b bVar, w0.d key, Serializable serializable) {
        kotlin.jvm.internal.n.f(bVar, "<this>");
        kotlin.jvm.internal.n.f(key, "key");
        Object objC = bVar.c(key);
        return objC == null ? serializable : objC;
    }

    public static ak.f t(ak.f fVar) {
        ak.f fVarIntercepted;
        kotlin.jvm.internal.n.f(fVar, "<this>");
        ck.c cVar = fVar instanceof ck.c ? (ck.c) fVar : null;
        return (cVar == null || (fVarIntercepted = cVar.intercepted()) == null) ? fVar : fVarIntercepted;
    }

    public static final boolean u(AssertionError assertionError) {
        Logger logger = lo.l.f45652a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? an.h.q0(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }

    public static boolean v(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.n.e(lowerCase, "toLowerCase(...)");
        return an.h.q0(lowerCase, "screen_recording", false) || an.h.q0(lowerCase, "screen-recording", false) || an.h.q0(lowerCase, "screenrecord", false) || an.h.q0(lowerCase, "screen_record", false) || an.h.q0(lowerCase, "screen-record", false) || an.p.p0(lowerCase, "screen_recording_", false) || an.p.p0(lowerCase, "screenrecord_", false) || an.p.p0(lowerCase, "screen_record_", false) || an.p.p0(lowerCase, "recording_", false) || an.h.q0(lowerCase, "recording", false) || an.h.q0(lowerCase, "capture", false) || an.h.q0(lowerCase, "mirror", false) || an.h.q0(lowerCase, "cast", false);
    }

    public static boolean w(char c4) {
        return c4 >= 'A' && c4 <= 'Z';
    }

    public static void x(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.b()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(k9.c0.m(status));
        }
    }

    public static void y(xi.f binaryMessenger, final tj.r rVar) {
        nf nfVar;
        kotlin.jvm.internal.n.f(binaryMessenger, "binaryMessenger");
        xi.l hVar = (rVar == null || (nfVar = rVar.f50897a) == null) ? new defpackage.h(10) : nfVar.e();
        Object obj = null;
        k5.g gVar = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedBy", hVar, obj);
        if (rVar != null) {
            final int i10 = 0;
            gVar.C(new xi.b() { // from class: tj.a0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    int i11 = i10;
                    r rVar2 = rVar;
                    switch (i11) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                rVar2.getClass();
                                listQ = j1.f.C(sslCertificate.getIssuedBy());
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
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                rVar2.getClass();
                                listQ2 = j1.f.C(sslCertificate2.getIssuedTo());
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
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                rVar2.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listQ3 = j1.f.C(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
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
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                rVar2.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listQ4 = j1.f.C(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof a) {
                                    a aVar4 = th5;
                                    listQ4 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                rVar2.f50897a.getClass();
                                listQ5 = j1.f.C(sslCertificate5.getX509Certificate());
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof a) {
                                    a aVar5 = th6;
                                    listQ5 = xj.o.Q(aVar5.f50793a, aVar5.f50794b, aVar5.f50795c);
                                } else {
                                    listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            bVar.e(listQ5);
                            break;
                    }
                }
            });
        } else {
            gVar.C(null);
        }
        k5.g gVar2 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedTo", hVar, obj);
        if (rVar != null) {
            final int i11 = 1;
            gVar2.C(new xi.b() { // from class: tj.a0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    int i12 = i11;
                    r rVar2 = rVar;
                    switch (i12) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                rVar2.getClass();
                                listQ = j1.f.C(sslCertificate.getIssuedBy());
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
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                rVar2.getClass();
                                listQ2 = j1.f.C(sslCertificate2.getIssuedTo());
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
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                rVar2.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listQ3 = j1.f.C(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
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
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                rVar2.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listQ4 = j1.f.C(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof a) {
                                    a aVar4 = th5;
                                    listQ4 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                rVar2.f50897a.getClass();
                                listQ5 = j1.f.C(sslCertificate5.getX509Certificate());
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof a) {
                                    a aVar5 = th6;
                                    listQ5 = xj.o.Q(aVar5.f50793a, aVar5.f50794b, aVar5.f50795c);
                                } else {
                                    listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            bVar.e(listQ5);
                            break;
                    }
                }
            });
        } else {
            gVar2.C(null);
        }
        k5.g gVar3 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotAfterMsSinceEpoch", hVar, obj);
        if (rVar != null) {
            final int i12 = 2;
            gVar3.C(new xi.b() { // from class: tj.a0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    int i13 = i12;
                    r rVar2 = rVar;
                    switch (i13) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                rVar2.getClass();
                                listQ = j1.f.C(sslCertificate.getIssuedBy());
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
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                rVar2.getClass();
                                listQ2 = j1.f.C(sslCertificate2.getIssuedTo());
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
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                rVar2.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listQ3 = j1.f.C(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
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
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                rVar2.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listQ4 = j1.f.C(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof a) {
                                    a aVar4 = th5;
                                    listQ4 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                rVar2.f50897a.getClass();
                                listQ5 = j1.f.C(sslCertificate5.getX509Certificate());
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof a) {
                                    a aVar5 = th6;
                                    listQ5 = xj.o.Q(aVar5.f50793a, aVar5.f50794b, aVar5.f50795c);
                                } else {
                                    listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            bVar.e(listQ5);
                            break;
                    }
                }
            });
        } else {
            gVar3.C(null);
        }
        k5.g gVar4 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotBeforeMsSinceEpoch", hVar, obj);
        if (rVar != null) {
            final int i13 = 3;
            gVar4.C(new xi.b() { // from class: tj.a0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    int i14 = i13;
                    r rVar2 = rVar;
                    switch (i14) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                rVar2.getClass();
                                listQ = j1.f.C(sslCertificate.getIssuedBy());
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
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                rVar2.getClass();
                                listQ2 = j1.f.C(sslCertificate2.getIssuedTo());
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
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                rVar2.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listQ3 = j1.f.C(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
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
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                rVar2.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listQ4 = j1.f.C(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof a) {
                                    a aVar4 = th5;
                                    listQ4 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                rVar2.f50897a.getClass();
                                listQ5 = j1.f.C(sslCertificate5.getX509Certificate());
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof a) {
                                    a aVar5 = th6;
                                    listQ5 = xj.o.Q(aVar5.f50793a, aVar5.f50794b, aVar5.f50795c);
                                } else {
                                    listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            bVar.e(listQ5);
                            break;
                    }
                }
            });
        } else {
            gVar4.C(null);
        }
        k5.g gVar5 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getX509Certificate", hVar, obj);
        if (rVar == null) {
            gVar5.C(null);
        } else {
            final int i14 = 4;
            gVar5.C(new xi.b() { // from class: tj.a0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    int i15 = i14;
                    r rVar2 = rVar;
                    switch (i15) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                rVar2.getClass();
                                listQ = j1.f.C(sslCertificate.getIssuedBy());
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
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                rVar2.getClass();
                                listQ2 = j1.f.C(sslCertificate2.getIssuedTo());
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
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                rVar2.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listQ3 = j1.f.C(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
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
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                rVar2.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listQ4 = j1.f.C(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof a) {
                                    a aVar4 = th5;
                                    listQ4 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                rVar2.f50897a.getClass();
                                listQ5 = j1.f.C(sslCertificate5.getX509Certificate());
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof a) {
                                    a aVar5 = th6;
                                    listQ5 = xj.o.Q(aVar5.f50793a, aVar5.f50794b, aVar5.f50795c);
                                } else {
                                    listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            bVar.e(listQ5);
                            break;
                    }
                }
            });
        }
    }

    public static final lo.b z(FileOutputStream fileOutputStream) {
        Logger logger = lo.l.f45652a;
        return new lo.b(1, fileOutputStream, new lo.v());
    }

    @Override // he.d
    public ke.b i(String str, int i10, EnumMap enumMap) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        int iR = r();
        he.a aVar = he.a.f42329f;
        if (enumMap.containsKey(aVar)) {
            iR = Integer.parseInt(enumMap.get(aVar).toString());
        }
        boolean[] zArrL = l(str);
        int length = zArrL.length;
        int i11 = iR + length;
        int iMax = Math.max(200, i11);
        int iMax2 = Math.max(1, 200);
        int i12 = iMax / i11;
        int i13 = (iMax - (length * i12)) / 2;
        ke.b bVar = new ke.b(iMax, iMax2);
        int i14 = 0;
        while (i14 < length) {
            if (zArrL[i14]) {
                bVar.c(i13, 0, i12, iMax2);
            }
            i14++;
            i13 += i12;
        }
        return bVar;
    }

    public abstract boolean[] l(String str);

    public int r() {
        return 10;
    }
}
