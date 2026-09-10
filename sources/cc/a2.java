package cc;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.Log;
import com.google.android.gms.internal.measurement.nf;
import com.google.android.gms.internal.play_billing.h4;
import com.google.android.gms.internal.play_billing.i4;
import com.google.android.gms.tasks.Task;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a2 {
    public static int A(int i10) {
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i10 <= 0) {
            throw new IllegalArgumentException(defpackage.e.h(i10, "x (", ") must be > 0"));
        }
        switch (ra.d.f49518a[roundingMode.ordinal()]) {
            case 1:
                com.bumptech.glide.d.k((i10 > 0) & (((i10 + (-1)) & i10) == 0));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i10 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i10);
                return (31 - iNumberOfLeadingZeros) + ((~(~(((-1257966797) >>> iNumberOfLeadingZeros) - i10))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i10);
    }

    public static final float[] C(float[] matrix) {
        kotlin.jvm.internal.n.f(matrix, "matrix");
        return (float[]) matrix.clone();
    }

    public static int D(int i10) {
        int i11 = i10 % C.DEFAULT_BUFFER_SEGMENT_SIZE;
        return i11 >= 0 ? i11 : i11 + C.DEFAULT_BUFFER_SEGMENT_SIZE;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a6  */
    public static long F(int i10, String str) {
        int iE = e(str, 0, i10, false);
        Matcher matcher = xn.j.f53973m.matcher(str);
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int iW0 = -1;
        int i14 = -1;
        int i15 = -1;
        while (iE < i10) {
            int iE2 = e(str, iE + 1, i10, true);
            matcher.region(iE, iE2);
            if (i12 == -1 && matcher.usePattern(xn.j.f53973m).matches()) {
                String strGroup = matcher.group(1);
                kotlin.jvm.internal.n.e(strGroup, "matcher.group(1)");
                i12 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                kotlin.jvm.internal.n.e(strGroup2, "matcher.group(2)");
                i14 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                kotlin.jvm.internal.n.e(strGroup3, "matcher.group(3)");
                i15 = Integer.parseInt(strGroup3);
            } else if (i13 == -1 && matcher.usePattern(xn.j.l).matches()) {
                String strGroup4 = matcher.group(1);
                kotlin.jvm.internal.n.e(strGroup4, "matcher.group(1)");
                i13 = Integer.parseInt(strGroup4);
            } else if (iW0 == -1) {
                Pattern pattern = xn.j.f53972k;
                if (matcher.usePattern(pattern).matches()) {
                    String strGroup5 = matcher.group(1);
                    kotlin.jvm.internal.n.e(strGroup5, "matcher.group(1)");
                    Locale US = Locale.US;
                    kotlin.jvm.internal.n.e(US, "US");
                    String lowerCase = strGroup5.toLowerCase(US);
                    kotlin.jvm.internal.n.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = pattern.pattern();
                    kotlin.jvm.internal.n.e(strPattern, "MONTH_PATTERN.pattern()");
                    iW0 = an.h.w0(strPattern, lowerCase, 0, false, 6) / 4;
                } else if (i11 != -1 && matcher.usePattern(xn.j.f53971j).matches()) {
                    String strGroup6 = matcher.group(1);
                    kotlin.jvm.internal.n.e(strGroup6, "matcher.group(1)");
                    i11 = Integer.parseInt(strGroup6);
                }
            } else if (i11 != -1) {
            }
            iE = e(str, iE2 + 1, i10, false);
        }
        if (70 <= i11 && i11 < 100) {
            i11 += 1900;
        }
        if (i11 >= 0 && i11 < 70) {
            i11 += 2000;
        }
        if (i11 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (iW0 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i13 || i13 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i12 < 0 || i12 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i14 < 0 || i14 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i15 < 0 || i15 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(yn.a.f54563d);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i11);
        gregorianCalendar.set(2, iW0 - 1);
        gregorianCalendar.set(5, i13);
        gregorianCalendar.set(11, i12);
        gregorianCalendar.set(12, i14);
        gregorianCalendar.set(13, i15);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static final JSONObject G(String str) {
        File fileT = t();
        if (fileT != null) {
            try {
                return new JSONObject(q7.e0.H(new FileInputStream(new File(fileT, str))));
            } catch (Exception unused) {
                j(str);
            }
        }
        return null;
    }

    public static final void H(hl.a aVar, hl.b from, zk.b0 scopeOwner, yl.f name) {
        kotlin.jvm.internal.n.f(aVar, "<this>");
        kotlin.jvm.internal.n.f(from, "from");
        kotlin.jvm.internal.n.f(scopeOwner, "scopeOwner");
        kotlin.jvm.internal.n.f(name, "name");
        ((cl.h0) scopeOwner).f6518e.b();
        kotlin.jvm.internal.n.e(name.b(), "name.asString()");
    }

    public static final ll.c I(nf nfVar, pl.b annotationsOwner) {
        kotlin.jvm.internal.n.f(nfVar, "<this>");
        kotlin.jvm.internal.n.f(annotationsOwner, "annotationsOwner");
        return new ll.c(nfVar, annotationsOwner, false);
    }

    public static final void J(String str, JSONArray jSONArray, l7.w wVar) {
        if (jSONArray.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, jSONArray.toString());
            JSONObject jSONObjectN = q7.e0.n();
            if (jSONObjectN != null) {
                Iterator<String> itKeys = jSONObjectN.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectN.get(next));
                }
            }
            String str2 = l7.b0.f45085j;
            j2.n.A(null, String.format("%s/instruments", Arrays.copyOf(new Object[]{l7.s.c()}, 1)), jSONObject, wVar).d();
        } catch (JSONException unused) {
        }
    }

    public static void M(xi.f binaryMessenger, final tj.c cVar) {
        kotlin.jvm.internal.n.f(binaryMessenger, "binaryMessenger");
        wj.j jVar = tj.e.f50818b;
        Object obj = null;
        k5.g gVar = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", (xi.l) jVar.getValue(), obj);
        if (cVar != null) {
            final int i10 = 0;
            gVar.C(new xi.b() { // from class: tj.d
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    int i11 = i10;
                    c cVar2 = cVar;
                    switch (i11) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            Long l = (Long) obj3;
                            long jLongValue = l.longValue();
                            try {
                                cVar2.f();
                                Object objE = cVar2.e(jLongValue);
                                if (objE instanceof w0) {
                                    ((w0) objE).destroy();
                                }
                                cVar2.f50804d.remove(l);
                                listQ2 = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ2 = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        default:
                            try {
                                cVar2.f50802b.clear();
                                cVar2.f50803c.clear();
                                cVar2.f50804d.clear();
                                cVar2.f50806f.clear();
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                    }
                }
            });
        } else {
            gVar.C(null);
        }
        k5.g gVar2 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.clear", (xi.l) jVar.getValue(), obj);
        if (cVar == null) {
            gVar2.C(null);
        } else {
            final int i11 = 1;
            gVar2.C(new xi.b() { // from class: tj.d
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    int i12 = i11;
                    c cVar2 = cVar;
                    switch (i12) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            Long l = (Long) obj3;
                            long jLongValue = l.longValue();
                            try {
                                cVar2.f();
                                Object objE = cVar2.e(jLongValue);
                                if (objE instanceof w0) {
                                    ((w0) objE).destroy();
                                }
                                cVar2.f50804d.remove(l);
                                listQ2 = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ2 = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        default:
                            try {
                                cVar2.f50802b.clear();
                                cVar2.f50803c.clear();
                                cVar2.f50804d.clear();
                                cVar2.f50806f.clear();
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                    }
                }
            });
        }
    }

    public static final Object N(hn.r rVar, boolean z10, hn.r rVar2, jk.c cVar) throws Throwable {
        Object uVar;
        Object objP;
        try {
            if (cVar instanceof ck.a) {
                kotlin.jvm.internal.h0.d(2, cVar);
                uVar = cVar.invoke(rVar2, rVar);
            } else {
                uVar = com.google.android.gms.internal.play_billing.q1.I(cVar, rVar2, rVar);
            }
        } catch (cn.j0 e10) {
            Throwable th2 = e10.f6722a;
            rVar.O(new cn.u(th2, false));
            throw th2;
        } catch (Throwable th3) {
            uVar = new cn.u(th3, false);
        }
        bk.a aVar = bk.a.f5708a;
        if (uVar == aVar || (objP = rVar.P(uVar)) == cn.d0.f6692e) {
            return aVar;
        }
        rVar.e0();
        if (!(objP instanceof cn.u)) {
            return cn.d0.H(objP);
        }
        if (!z10) {
            Throwable th4 = ((cn.u) objP).f6771a;
            if ((th4 instanceof cn.d2) && ((cn.d2) th4).f6700a == rVar) {
                if (uVar instanceof cn.u) {
                    throw ((cn.u) uVar).f6771a;
                }
                return uVar;
            }
        }
        throw ((cn.u) objP).f6771a;
    }

    public static final void P(String str, String str2) {
        File fileT = t();
        if (fileT == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileT, str));
            byte[] bytes = str2.getBytes(an.a.f3768a);
            kotlin.jvm.internal.n.e(bytes, "this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }

    public static z.l a(cn.h0 h0Var) {
        return android.support.v4.media.session.a.p(new a4.a(h0Var, 0));
    }

    public static final Object b(Task task, ud.v vVar) throws Exception {
        if (!task.isComplete()) {
            cn.l lVar = new cn.l(1, com.google.android.gms.internal.play_billing.q1.t(vVar));
            lVar.t();
            task.addOnCompleteListener(mn.a.f46261a, new od.c(lVar, 21));
            return lVar.s();
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }

    public static int c(int i10, int i11) {
        long j10 = ((long) i10) + ((long) i11);
        int i12 = (int) j10;
        if (j10 == ((long) i12)) {
            return i12;
        }
        throw new ArithmeticException(l1.d.f("overflow: checkedAdd(", i10, ", ", i11, ")"));
    }

    public static x0.m d(Context context) {
        ProviderInfo providerInfo;
        j0.c cVar;
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        com.google.android.gms.internal.play_billing.q1.e(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            cVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArr = packageManager.getPackageInfo(str2, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                cVar = new j0.c(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e10);
                cVar = null;
            }
        }
        if (cVar == null) {
            return null;
        }
        return new x0.m(new x0.l(context, cVar));
    }

    public static int e(String str, int i10, int i11, boolean z10) {
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z10)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static boolean f(Object obj, Object obj2) {
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
                        if (l(dArr[i10], dArr2[i10])) {
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
                        if (o(fArr[i11], fArr2[i11])) {
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
                        if (f(objArr[i12], objArr2[i12])) {
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
                        if (!f(it.next(), it2.next())) {
                        }
                    }
                    return true;
                }
            } else {
                if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
                    if ((obj instanceof Double) && (obj2 instanceof Double)) {
                        return l(((Number) obj).doubleValue(), ((Number) obj2).doubleValue());
                    }
                    return ((obj instanceof Float) && (obj2 instanceof Float)) ? o(((Number) obj).floatValue(), ((Number) obj2).floatValue()) : obj.equals(obj2);
                }
                Map map = (Map) obj;
                Map map2 = (Map) obj2;
                if (map.size() == map2.size()) {
                    loop4: for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        for (Map.Entry entry2 : map2.entrySet()) {
                            if (f(key, entry2.getKey())) {
                                if (!f(entry.getValue(), entry2.getValue())) {
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

    public static boolean g(Object obj, Object obj2) {
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
                        if (m(dArr[i10], dArr2[i10])) {
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
                        if (p(fArr[i11], fArr2[i11])) {
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
                        if (g(objArr[i12], objArr2[i12])) {
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
                        if (!g(it.next(), it2.next())) {
                        }
                    }
                    return true;
                }
            } else {
                if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
                    if ((obj instanceof Double) && (obj2 instanceof Double)) {
                        return m(((Number) obj).doubleValue(), ((Number) obj2).doubleValue());
                    }
                    return ((obj instanceof Float) && (obj2 instanceof Float)) ? p(((Number) obj).floatValue(), ((Number) obj2).floatValue()) : obj.equals(obj2);
                }
                Map map = (Map) obj;
                Map map2 = (Map) obj2;
                if (map.size() == map2.size()) {
                    loop4: for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        for (Map.Entry entry2 : map2.entrySet()) {
                            if (g(key, entry2.getKey())) {
                                if (!g(entry.getValue(), entry2.getValue())) {
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

    public static int h(Object obj) {
        int iH = 0;
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
        int iH2 = 1;
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length = dArr.length;
            while (iH < length) {
                double d10 = dArr[iH];
                int i10 = iH2 * 31;
                if (d10 == 0.0d) {
                    d10 = 0.0d;
                }
                long jDoubleToLongBits = Double.doubleToLongBits(d10);
                iH2 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                iH++;
            }
            return iH2;
        }
        boolean z10 = obj instanceof float[];
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z10) {
            float[] fArr = (float[]) obj;
            int length2 = fArr.length;
            while (iH < length2) {
                float f11 = fArr[iH];
                int i11 = iH2 * 31;
                if (f11 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f11 = 0.0f;
                }
                iH2 = i11 + Float.floatToIntBits(f11);
                iH++;
            }
            return iH2;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length3 = objArr.length;
            while (iH < length3) {
                iH2 = (iH2 * 31) + h(objArr[iH]);
                iH++;
            }
            return iH2;
        }
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iH2 = (iH2 * 31) + h(it.next());
            }
            return iH2;
        }
        if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                iH += h(entry.getValue()) ^ (h(entry.getKey()) * 31);
            }
            return iH;
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

    public static final void j(String str) {
        File fileT = t();
        if (fileT == null || str == null) {
            return;
        }
        new File(fileT, str).delete();
    }

    public static int k(int i10, int i11) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i11 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i12 = i10 / i11;
        int i13 = i10 - (i11 * i12);
        if (i13 == 0) {
            return i12;
        }
        int i14 = ((i10 ^ i11) >> 31) | 1;
        switch (ra.d.f49518a[roundingMode.ordinal()]) {
            case 1:
                com.bumptech.glide.d.k(i13 == 0);
                return i12;
            case 2:
                return i12;
            case 3:
                if (i14 >= 0) {
                    return i12;
                }
                break;
            case 4:
                break;
            case 5:
                if (i14 <= 0) {
                    return i12;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i13);
                int iAbs2 = iAbs - (Math.abs(i11) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i12;
                }
                if (iAbs2 <= 0) {
                    return i12;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i12 + i14;
    }

    public static boolean l(double d10, double d11) {
        if ((d10 == 0.0d ? 0.0d : d10) == (d11 != 0.0d ? d11 : 0.0d)) {
            return true;
        }
        return Double.isNaN(d10) && Double.isNaN(d11);
    }

    public static boolean m(double d10, double d11) {
        if ((d10 == 0.0d ? 0.0d : d10) == (d11 != 0.0d ? d11 : 0.0d)) {
            return true;
        }
        return Double.isNaN(d10) && Double.isNaN(d11);
    }

    public static MediaFormat n(MediaCodec mediaCodec, MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
        if (iDequeueOutputBuffer == -3) {
            return n(mediaCodec, bufferInfo);
        }
        if (iDequeueOutputBuffer == -2) {
            return mediaCodec.getOutputFormat();
        }
        if (iDequeueOutputBuffer != -1) {
            mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
        }
        return null;
    }

    public static boolean o(float f10, float f11) {
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

    public static boolean p(float f10, float f11) {
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

    public static final File t() {
        File file = new File(l7.s.b().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static final vf.c v(MediaFormat mediaFormat) {
        kotlin.jvm.internal.n.f(mediaFormat, "<this>");
        String string = mediaFormat.getString("mime");
        kotlin.jvm.internal.n.c(string);
        if (an.p.p0(string, "audio/", false)) {
            return vf.c.AUDIO;
        }
        String string2 = mediaFormat.getString("mime");
        kotlin.jvm.internal.n.c(string2);
        if (an.p.p0(string2, "video/", false)) {
            return vf.c.VIDEO;
        }
        return null;
    }

    public static boolean w(vf.c cVar, MediaFormat mediaFormat) {
        if (cVar == vf.c.VIDEO && !mediaFormat.containsKey("frame-rate")) {
            mediaFormat.setInteger("frame-rate", 24);
        }
        int iOrdinal = cVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new RuntimeException("Unexpected type: " + cVar);
            }
            if (!mediaFormat.containsKey("mime") || !mediaFormat.containsKey("height") || !mediaFormat.containsKey("width") || !mediaFormat.containsKey("frame-rate")) {
                return false;
            }
        } else if (!mediaFormat.containsKey("mime") || !mediaFormat.containsKey("channel-count") || !mediaFormat.containsKey("sample-rate")) {
            return false;
        }
        return true;
    }

    public static final boolean y(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        kotlin.jvm.internal.n.e(className, "element.className");
        if (an.p.p0(className, "com.facebook", false)) {
            return true;
        }
        String className2 = stackTraceElement.getClassName();
        kotlin.jvm.internal.n.e(className2, "element.className");
        return an.p.p0(className2, "com.meta", false);
    }

    public static final boolean z(Thread thread) {
        StackTraceElement[] stackTrace = thread.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement element : stackTrace) {
                kotlin.jvm.internal.n.e(element, "element");
                if (y(element)) {
                    String className = element.getClassName();
                    kotlin.jvm.internal.n.e(className, "element.className");
                    if (!an.p.p0(className, "com.facebook.appevents.codeless", false)) {
                        String className2 = element.getClassName();
                        kotlin.jvm.internal.n.e(className2, "element.className");
                        if (!an.p.p0(className2, "com.facebook.appevents.suggestedevents", false)) {
                            return true;
                        }
                    }
                    String methodName = element.getMethodName();
                    kotlin.jvm.internal.n.e(methodName, "element.methodName");
                    if (an.p.p0(methodName, "onClick", false)) {
                        continue;
                    } else {
                        String methodName2 = element.getMethodName();
                        kotlin.jvm.internal.n.e(methodName2, "element.methodName");
                        if (an.p.p0(methodName2, "onItemClick", false)) {
                            continue;
                        } else {
                            String methodName3 = element.getMethodName();
                            kotlin.jvm.internal.n.e(methodName3, "element.methodName");
                            if (!an.p.p0(methodName3, "onTouch", false)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public abstract String B(int i10, ArrayList arrayList, boolean z10);

    public abstract String E();

    public abstract void K(boolean z10);

    public abstract void L(boolean z10);

    public abstract TransformationMethod O(TransformationMethod transformationMethod);

    public abstract void Q(h4 h4Var, h4 h4Var2);

    public abstract void R(h4 h4Var, Thread thread);

    public abstract boolean S(i4 i4Var, com.google.android.gms.internal.play_billing.u2 u2Var, com.google.android.gms.internal.play_billing.u2 u2Var2);

    public abstract boolean T(i4 i4Var, Object obj, Object obj2);

    public abstract boolean U(i4 i4Var, h4 h4Var, h4 h4Var2);

    public abstract boolean q();

    public String r() {
        return null;
    }

    public abstract InputFilter[] s(InputFilter[] inputFilterArr);

    public String u() {
        return null;
    }

    public abstract boolean x();
}
