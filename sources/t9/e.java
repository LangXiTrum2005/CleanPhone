package t9;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.InputEvent;
import android.widget.TextView;
import cc.a2;
import cn.d0;
import com.applovin.shadow.okio.Segment;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.gms.internal.ads.xd1;
import com.unity3d.services.UnityAdsConstants;
import ea.f2;
import en.k;
import en.l;
import en.u;
import im.m;
import im.n;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import jb.f1;
import jb.j1;
import jb.m0;
import jb.n0;
import qk.i0;
import t5.i;
import t5.j;
import ta.c0;
import ta.f0;
import wj.r;
import xj.g0;
import xj.p;
import xj.t;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e implements sg.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ClassLoader f50577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Thread f50578c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50579a;

    public /* synthetic */ e(int i10) {
        this.f50579a = i10;
    }

    public static int A(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i10});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final void B(u uVar, Object obj) {
        Object objI = uVar.i(obj);
        if (!(objI instanceof k)) {
            return;
        }
        Object obj2 = ((l) d0.C(ak.l.f3620a, new b4.b(uVar, obj, (ak.f) null, 3))).f40169a;
    }

    public static ArrayList C(Throwable th2) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th2.toString());
        arrayList.add(th2.getClass().getSimpleName());
        arrayList.add("Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
        return arrayList;
    }

    public static int D(int i10) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i10) * (-862048943)), 15)) * 461845907);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00b7 A[Catch: all -> 0x00b3, PHI: r2
  0x00b7: PHI (r2v1 java.lang.Thread) = (r2v0 java.lang.Thread), (r2v11 java.lang.Thread) binds: [B:7:0x000c, B:47:0x00b0] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000e, B:46:0x00ae, B:61:0x00e5, B:12:0x0023, B:52:0x00b6, B:53:0x00b7, B:64:0x00e9, B:65:0x00ea, B:13:0x0024, B:15:0x0031, B:25:0x004b, B:26:0x0052, B:28:0x005d, B:34:0x0072, B:35:0x0079, B:43:0x008a, B:44:0x00ac, B:18:0x0040, B:54:0x00b8, B:60:0x00e4, B:59:0x00c2), top: B:76:0x0003, inners: #2, #6 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static synchronized ClassLoader E() {
        SecurityException e10;
        Thread thread;
        ThreadGroup threadGroup;
        if (f50577b == null) {
            Thread thread2 = f50578c;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = f50578c.getContextClassLoader();
                    } catch (SecurityException e11) {
                        String message = e11.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 41);
                        sb2.append("Failed to get thread context classloader ");
                        sb2.append(message);
                        Log.w("DynamiteLoaderV2CL", sb2.toString());
                    }
                }
                f50577b = contextClassLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i10 = 0;
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i11];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i11++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i10 >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i10];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i10++;
                                }
                                if (thread == null) {
                                    try {
                                        j6.a aVar = new j6.a(threadGroup, "GmsDynamite");
                                        try {
                                            aVar.setContextClassLoader(null);
                                            aVar.start();
                                            thread = aVar;
                                        } catch (SecurityException e12) {
                                            e10 = e12;
                                            thread = aVar;
                                            String message2 = e10.getMessage();
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 39);
                                            sb3.append("Failed to enumerate thread/threadgroup ");
                                            sb3.append(message2);
                                            Log.w("DynamiteLoaderV2CL", sb3.toString());
                                        }
                                    } catch (SecurityException e13) {
                                        e10 = e13;
                                    }
                                }
                            } catch (SecurityException e14) {
                                e10 = e14;
                                thread = null;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    thread2 = thread;
                }
                f50578c = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = f50578c.getContextClassLoader();
                    }
                }
                f50577b = contextClassLoader;
            }
        }
        return f50577b;
    }

    public static n b(String debugName, Iterable iterable) {
        m mVar;
        kotlin.jvm.internal.n.f(debugName, "debugName");
        ym.f fVar = new ym.f();
        Iterator it = iterable.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            mVar = m.f43190b;
            if (!zHasNext) {
                break;
            }
            n nVar = (n) it.next();
            if (nVar != mVar) {
                if (nVar instanceof im.a) {
                    t.b0(fVar, ((im.a) nVar).f43152c);
                } else {
                    fVar.add(nVar);
                }
            }
        }
        int i10 = fVar.f54549a;
        if (i10 != 0) {
            return i10 != 1 ? new im.a(debugName, (n[]) fVar.toArray(new n[0])) : (n) fVar.get(0);
        }
        return mVar;
    }

    public static final wj.g c(Throwable exception) {
        kotlin.jvm.internal.n.f(exception, "exception");
        return new wj.g(exception);
    }

    public static boolean d(Object obj, Object obj2) {
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
                        if (g(dArr[i10], dArr2[i10])) {
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
                        if (i(fArr[i11], fArr2[i11])) {
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
                        if (d(objArr[i12], objArr2[i12])) {
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
                        if (!d(it.next(), it2.next())) {
                        }
                    }
                    return true;
                }
            } else {
                if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
                    if ((obj instanceof Double) && (obj2 instanceof Double)) {
                        return g(((Number) obj).doubleValue(), ((Number) obj2).doubleValue());
                    }
                    return ((obj instanceof Float) && (obj2 instanceof Float)) ? i(((Number) obj).floatValue(), ((Number) obj2).floatValue()) : obj.equals(obj2);
                }
                Map map = (Map) obj;
                Map map2 = (Map) obj2;
                if (map.size() == map2.size()) {
                    loop4: for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        for (Map.Entry entry2 : map2.entrySet()) {
                            if (d(key, entry2.getKey())) {
                                if (!d(entry.getValue(), entry2.getValue())) {
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

    public static int e(Object obj) {
        int iE = 0;
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
        int iE2 = 1;
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length = dArr.length;
            while (iE < length) {
                double d10 = dArr[iE];
                int i10 = iE2 * 31;
                if (d10 == 0.0d) {
                    d10 = 0.0d;
                }
                long jDoubleToLongBits = Double.doubleToLongBits(d10);
                iE2 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                iE++;
            }
            return iE2;
        }
        boolean z10 = obj instanceof float[];
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z10) {
            float[] fArr = (float[]) obj;
            int length2 = fArr.length;
            while (iE < length2) {
                float f11 = fArr[iE];
                int i11 = iE2 * 31;
                if (f11 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f11 = 0.0f;
                }
                iE2 = i11 + Float.floatToIntBits(f11);
                iE++;
            }
            return iE2;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length3 = objArr.length;
            while (iE < length3) {
                iE2 = (iE2 * 31) + e(objArr[iE]);
                iE++;
            }
            return iE2;
        }
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iE2 = (iE2 * 31) + e(it.next());
            }
            return iE2;
        }
        if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                iE += e(entry.getValue()) ^ (e(entry.getKey()) * 31);
            }
            return iE;
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

    public static Object f(gh.d dVar) {
        try {
            File file = new File(dVar.a());
            if (file.exists()) {
                if (file.isDirectory()) {
                    hk.k.U(file);
                } else {
                    file.delete();
                }
            }
            return r.f53297a;
        } catch (IOException e10) {
            return c(e10);
        }
    }

    public static boolean g(double d10, double d11) {
        if ((d10 == 0.0d ? 0.0d : d10) == (d11 != 0.0d ? d11 : 0.0d)) {
            return true;
        }
        return Double.isNaN(d10) && Double.isNaN(d11);
    }

    public static boolean i(float f10, float f11) {
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

    public static final void j(BufferedReader bufferedReader, jk.b bVar) throws IOException {
        try {
            Iterator it = new zm.a(new an.r(bufferedReader, 1)).iterator();
            while (it.hasNext()) {
                bVar.invoke(it.next());
            }
            bufferedReader.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                i0.j(bufferedReader, th2);
                throw th3;
            }
        }
    }

    public static final e k(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        z3.b bVar = z3.b.f54634a;
        if ((i10 >= 33 ? bVar.a() : 0) >= 11) {
            kotlin.jvm.internal.n.e(context.getSystemService(b.c.class), "context.getSystemService…opicsManager::class.java)");
            throw new ClassCastException();
        }
        if ((i10 >= 33 ? bVar.a() : 0) >= 5) {
            kotlin.jvm.internal.n.e(context.getSystemService(b.c.class), "context.getSystemService…opicsManager::class.java)");
            throw new ClassCastException();
        }
        if ((i10 >= 33 ? bVar.a() : 0) == 4) {
            kotlin.jvm.internal.n.e(context.getSystemService(b.c.class), "context.getSystemService…opicsManager::class.java)");
            throw new ClassCastException();
        }
        z3.a aVar = z3.a.f54633a;
        if (((i10 == 31 || i10 == 32) ? aVar.a() : 0) < 11) {
            if (((i10 == 31 || i10 == 32) ? aVar.a() : 0) >= 9) {
                try {
                    new cl.e(context, 2).invoke(context);
                    throw null;
                } catch (NoClassDefFoundError unused) {
                    StringBuilder sb2 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                    int i11 = Build.VERSION.SDK_INT;
                    sb2.append((i11 == 31 || i11 == 32) ? aVar.a() : 0);
                    Log.d("TopicsManager", sb2.toString());
                }
            }
        } else {
            try {
                new cl.e(context, 1).invoke(context);
                throw null;
            } catch (NoClassDefFoundError unused2) {
                StringBuilder sb3 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                int i12 = Build.VERSION.SDK_INT;
                sb3.append((i12 == 31 || i12 == 32) ? aVar.a() : 0);
                Log.d("TopicsManager", sb3.toString());
            }
        }
        return null;
    }

    public static s5.a l(Map m7) {
        String str;
        kotlin.jvm.internal.n.f(m7, "m");
        Object obj = m7.get("id");
        kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) obj;
        Object obj2 = m7.get("displayName");
        kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) obj2;
        Object obj3 = m7.get("thumbnail");
        byte[] bArr = obj3 instanceof byte[] ? (byte[]) obj3 : null;
        Object obj4 = m7.get("photo");
        byte[] bArr2 = obj4 instanceof byte[] ? (byte[]) obj4 : null;
        Object obj5 = m7.get("isStarred");
        kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Boolean");
        boolean zBooleanValue = ((Boolean) obj5).booleanValue();
        Object obj6 = m7.get("name");
        kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        Map map = (Map) obj6;
        Object obj7 = map.get("first");
        kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.String");
        Object obj8 = map.get("last");
        kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.String");
        Object obj9 = map.get("middle");
        kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.String");
        byte[] bArr3 = bArr;
        Object obj10 = map.get("prefix");
        kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type kotlin.String");
        String str4 = (String) obj10;
        Object obj11 = map.get("suffix");
        kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.String");
        String str5 = (String) obj11;
        Object obj12 = map.get("nickname");
        kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
        String str6 = (String) obj12;
        Object obj13 = map.get("firstPhonetic");
        kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.String");
        String str7 = (String) obj13;
        Object obj14 = map.get("lastPhonetic");
        kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
        String str8 = (String) obj14;
        Object obj15 = map.get("middlePhonetic");
        kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type kotlin.String");
        t5.f fVar = new t5.f((String) obj7, (String) obj8, (String) obj9, str4, str5, str6, str7, str8, (String) obj15);
        Object obj16 = m7.get("phones");
        kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>");
        List list = (List) obj16;
        ArrayList arrayList = new ArrayList(p.W(list, 10));
        Iterator it = list.iterator();
        while (true) {
            Iterator it2 = it;
            str = str2;
            if (!it.hasNext()) {
                break;
            }
            Map m10 = (Map) it2.next();
            kotlin.jvm.internal.n.f(m10, "m");
            String str9 = str3;
            Object obj17 = m10.get("number");
            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.String");
            String str10 = (String) obj17;
            Object obj18 = m10.get("normalizedNumber");
            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type kotlin.String");
            Object obj19 = m10.get("label");
            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
            Object obj20 = m10.get("customLabel");
            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type kotlin.String");
            String str11 = (String) obj20;
            Object obj21 = m10.get("isPrimary");
            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.Boolean");
            arrayList.add(new i(str10, (String) obj18, (String) obj19, str11, ((Boolean) obj21).booleanValue()));
            it = it2;
            str2 = str;
            str3 = str9;
        }
        String str12 = str3;
        Object obj22 = m7.get("emails");
        kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>");
        List list2 = (List) obj22;
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(p.W(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            Map m11 = (Map) it3.next();
            kotlin.jvm.internal.n.f(m11, "m");
            Object obj23 = m11.get(IntegrityManager.INTEGRITY_TYPE_ADDRESS);
            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type kotlin.String");
            t5.f fVar2 = fVar;
            Object obj24 = m11.get("label");
            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type kotlin.String");
            ArrayList arrayList4 = arrayList2;
            Object obj25 = m11.get("customLabel");
            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type kotlin.String");
            Object obj26 = m11.get("isPrimary");
            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type kotlin.Boolean");
            arrayList3.add(new t5.c((String) obj23, (String) obj24, (String) obj25, ((Boolean) obj26).booleanValue()));
            it3 = it3;
            fVar = fVar2;
            arrayList2 = arrayList4;
        }
        t5.f fVar3 = fVar;
        ArrayList arrayList5 = arrayList2;
        Object obj27 = m7.get("addresses");
        kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>");
        List<Map> list3 = (List) obj27;
        ArrayList arrayList6 = new ArrayList(p.W(list3, 10));
        for (Map m12 : list3) {
            kotlin.jvm.internal.n.f(m12, "m");
            Object obj28 = m12.get(IntegrityManager.INTEGRITY_TYPE_ADDRESS);
            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type kotlin.String");
            String str13 = (String) obj28;
            Object obj29 = m12.get("label");
            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type kotlin.String");
            String str14 = (String) obj29;
            Object obj30 = m12.get("customLabel");
            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.String");
            String str15 = (String) obj30;
            Object obj31 = m12.get("street");
            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type kotlin.String");
            String str16 = (String) obj31;
            Object obj32 = m12.get("pobox");
            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.String");
            String str17 = (String) obj32;
            Object obj33 = m12.get("neighborhood");
            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type kotlin.String");
            String str18 = (String) obj33;
            Object obj34 = m12.get("city");
            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type kotlin.String");
            String str19 = (String) obj34;
            Object obj35 = m12.get("state");
            kotlin.jvm.internal.n.d(obj35, "null cannot be cast to non-null type kotlin.String");
            String str20 = (String) obj35;
            Object obj36 = m12.get("postalCode");
            kotlin.jvm.internal.n.d(obj36, "null cannot be cast to non-null type kotlin.String");
            String str21 = (String) obj36;
            Object obj37 = m12.get("country");
            kotlin.jvm.internal.n.d(obj37, "null cannot be cast to non-null type kotlin.String");
            String str22 = (String) obj37;
            Object obj38 = m12.get("isoCountry");
            kotlin.jvm.internal.n.d(obj38, "null cannot be cast to non-null type kotlin.String");
            String str23 = (String) obj38;
            Object obj39 = m12.get("subAdminArea");
            kotlin.jvm.internal.n.d(obj39, "null cannot be cast to non-null type kotlin.String");
            Object obj40 = m12.get("subLocality");
            kotlin.jvm.internal.n.d(obj40, "null cannot be cast to non-null type kotlin.String");
            arrayList6.add(new t5.b(str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, (String) obj39, (String) obj40));
        }
        Object obj41 = m7.get("organizations");
        kotlin.jvm.internal.n.d(obj41, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>");
        List<Map> list4 = (List) obj41;
        ArrayList arrayList7 = new ArrayList(p.W(list4, 10));
        for (Map m13 : list4) {
            kotlin.jvm.internal.n.f(m13, "m");
            Object obj42 = m13.get("company");
            kotlin.jvm.internal.n.d(obj42, "null cannot be cast to non-null type kotlin.String");
            String str24 = (String) obj42;
            Object obj43 = m13.get("title");
            kotlin.jvm.internal.n.d(obj43, "null cannot be cast to non-null type kotlin.String");
            String str25 = (String) obj43;
            Object obj44 = m13.get("department");
            kotlin.jvm.internal.n.d(obj44, "null cannot be cast to non-null type kotlin.String");
            String str26 = (String) obj44;
            Object obj45 = m13.get("jobDescription");
            kotlin.jvm.internal.n.d(obj45, "null cannot be cast to non-null type kotlin.String");
            String str27 = (String) obj45;
            Object obj46 = m13.get("symbol");
            kotlin.jvm.internal.n.d(obj46, "null cannot be cast to non-null type kotlin.String");
            String str28 = (String) obj46;
            Object obj47 = m13.get("phoneticName");
            kotlin.jvm.internal.n.d(obj47, "null cannot be cast to non-null type kotlin.String");
            Object obj48 = m13.get("officeLocation");
            kotlin.jvm.internal.n.d(obj48, "null cannot be cast to non-null type kotlin.String");
            arrayList7.add(new t5.h(str24, str25, str26, str27, str28, (String) obj47, (String) obj48));
        }
        Object obj49 = m7.get("websites");
        kotlin.jvm.internal.n.d(obj49, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>");
        List list5 = (List) obj49;
        ArrayList arrayList8 = new ArrayList(p.W(list5, 10));
        Iterator it4 = list5.iterator();
        while (it4.hasNext()) {
            Map m14 = (Map) it4.next();
            kotlin.jvm.internal.n.f(m14, "m");
            Object obj50 = m14.get("url");
            kotlin.jvm.internal.n.d(obj50, "null cannot be cast to non-null type kotlin.String");
            Iterator it5 = it4;
            Object obj51 = m14.get("label");
            kotlin.jvm.internal.n.d(obj51, "null cannot be cast to non-null type kotlin.String");
            Object obj52 = m14.get("customLabel");
            kotlin.jvm.internal.n.d(obj52, "null cannot be cast to non-null type kotlin.String");
            arrayList8.add(new t5.k((String) obj50, (String) obj51, (String) obj52));
            it4 = it5;
        }
        Object obj53 = m7.get("socialMedias");
        kotlin.jvm.internal.n.d(obj53, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>");
        List list6 = (List) obj53;
        ArrayList arrayList9 = new ArrayList(p.W(list6, 10));
        Iterator it6 = list6.iterator();
        while (it6.hasNext()) {
            Map m15 = (Map) it6.next();
            kotlin.jvm.internal.n.f(m15, "m");
            Iterator it7 = it6;
            Object obj54 = m15.get("userName");
            kotlin.jvm.internal.n.d(obj54, "null cannot be cast to non-null type kotlin.String");
            ArrayList arrayList10 = arrayList8;
            Object obj55 = m15.get("label");
            kotlin.jvm.internal.n.d(obj55, "null cannot be cast to non-null type kotlin.String");
            Object obj56 = m15.get("customLabel");
            kotlin.jvm.internal.n.d(obj56, "null cannot be cast to non-null type kotlin.String");
            arrayList9.add(new j((String) obj54, (String) obj55, (String) obj56));
            it6 = it7;
            arrayList8 = arrayList10;
        }
        ArrayList arrayList11 = arrayList8;
        Object obj57 = m7.get("events");
        kotlin.jvm.internal.n.d(obj57, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any?>>");
        List list7 = (List) obj57;
        ArrayList arrayList12 = new ArrayList(p.W(list7, 10));
        Iterator it8 = list7.iterator();
        while (it8.hasNext()) {
            Map m16 = (Map) it8.next();
            kotlin.jvm.internal.n.f(m16, "m");
            Integer num = (Integer) m16.get("year");
            Object obj58 = m16.get("month");
            Iterator it9 = it8;
            kotlin.jvm.internal.n.d(obj58, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj58).intValue();
            Object obj59 = m16.get("day");
            kotlin.jvm.internal.n.d(obj59, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue2 = ((Integer) obj59).intValue();
            Object obj60 = m16.get("label");
            kotlin.jvm.internal.n.d(obj60, "null cannot be cast to non-null type kotlin.String");
            String str29 = (String) obj60;
            Object obj61 = m16.get("customLabel");
            kotlin.jvm.internal.n.d(obj61, "null cannot be cast to non-null type kotlin.String");
            arrayList12.add(new t5.d(num, iIntValue, iIntValue2, str29, (String) obj61));
            it8 = it9;
        }
        Object obj62 = m7.get("notes");
        kotlin.jvm.internal.n.d(obj62, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>");
        List<Map> list8 = (List) obj62;
        ArrayList arrayList13 = new ArrayList(p.W(list8, 10));
        for (Map m17 : list8) {
            kotlin.jvm.internal.n.f(m17, "m");
            Object obj63 = m17.get("note");
            kotlin.jvm.internal.n.d(obj63, "null cannot be cast to non-null type kotlin.String");
            t5.g gVar = new t5.g();
            gVar.f50517a = (String) obj63;
            arrayList13.add(gVar);
        }
        Object obj64 = m7.get("accounts");
        kotlin.jvm.internal.n.d(obj64, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>");
        List list9 = (List) obj64;
        ArrayList arrayList14 = new ArrayList(p.W(list9, 10));
        Iterator it10 = list9.iterator();
        while (it10.hasNext()) {
            Map m18 = (Map) it10.next();
            kotlin.jvm.internal.n.f(m18, "m");
            Iterator it11 = it10;
            Object obj65 = m18.get("rawId");
            kotlin.jvm.internal.n.d(obj65, "null cannot be cast to non-null type kotlin.String");
            ArrayList arrayList15 = arrayList13;
            Object obj66 = m18.get("type");
            kotlin.jvm.internal.n.d(obj66, "null cannot be cast to non-null type kotlin.String");
            ArrayList arrayList16 = arrayList12;
            Object obj67 = m18.get("name");
            kotlin.jvm.internal.n.d(obj67, "null cannot be cast to non-null type kotlin.String");
            ArrayList arrayList17 = arrayList9;
            Object obj68 = m18.get("mimetypes");
            kotlin.jvm.internal.n.d(obj68, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            arrayList14.add(new t5.a((String) obj65, (String) obj66, (String) obj67, (List) obj68));
            it10 = it11;
            arrayList13 = arrayList15;
            arrayList12 = arrayList16;
            arrayList9 = arrayList17;
        }
        ArrayList arrayList18 = arrayList13;
        ArrayList arrayList19 = arrayList12;
        ArrayList arrayList20 = arrayList9;
        Object obj69 = m7.get("groups");
        kotlin.jvm.internal.n.d(obj69, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>");
        List<Map> list10 = (List) obj69;
        ArrayList arrayList21 = new ArrayList(p.W(list10, 10));
        for (Map m19 : list10) {
            kotlin.jvm.internal.n.f(m19, "m");
            Object obj70 = m19.get("id");
            kotlin.jvm.internal.n.d(obj70, "null cannot be cast to non-null type kotlin.String");
            Object obj71 = m19.get("name");
            kotlin.jvm.internal.n.d(obj71, "null cannot be cast to non-null type kotlin.String");
            t5.e eVar = new t5.e();
            eVar.f50506a = (String) obj70;
            eVar.f50507b = (String) obj71;
            arrayList21.add(eVar);
        }
        return new s5.a(str, str12, bArr3, bArr2, zBooleanValue, fVar3, arrayList5, arrayList3, arrayList6, arrayList7, arrayList11, arrayList20, arrayList19, arrayList18, arrayList14, arrayList21);
    }

    public static m5.k n(va.c cVar, db.b bVar, byte[] bArr) throws GeneralSecurityException, IOException {
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) cVar.f52514b;
        try {
            n0 n0VarC = n0.C(byteArrayInputStream, com.google.crypto.tink.shaded.protobuf.p.a());
            byteArrayInputStream.close();
            if (n0VarC.A().size() == 0) {
                throw new GeneralSecurityException("empty keyset");
            }
            try {
                f1 f1VarG = f1.G(bVar.b(n0VarC.A().q(), bArr), com.google.crypto.tink.shaded.protobuf.p.a());
                if (f1VarG == null || f1VarG.B() <= 0) {
                    throw new GeneralSecurityException("empty keyset");
                }
                return m5.k.o(f1VarG);
            } catch (com.google.crypto.tink.shaded.protobuf.d0 unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        } catch (Throwable th2) {
            byteArrayInputStream.close();
            throw th2;
        }
    }

    public static int o(xd1 xd1Var, int i10, int i11, int i12) {
        go.k.i(Math.max(Math.max(i10, i11), i12) <= 31);
        int i13 = (1 << i10) - 1;
        int i14 = (1 << i11) - 1;
        a2.c(a2.c(i13, i14), 1 << i12);
        if (xd1Var.b() < i10) {
            return -1;
        }
        int i15 = xd1Var.i(i10);
        if (i15 == i13) {
            if (xd1Var.b() < i11) {
                return -1;
            }
            int i16 = xd1Var.i(i11);
            i15 += i16;
            if (i16 == i14) {
                if (xd1Var.b() < i12) {
                    return -1;
                }
                return xd1Var.i(i12) + i15;
            }
        }
        return i15;
    }

    public static final String p(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[Segment.SIZE];
        int i10 = reader.read(cArr);
        while (i10 >= 0) {
            stringWriter.write(cArr, 0, i10);
            i10 = reader.read(cArr);
        }
        String string = stringWriter.toString();
        kotlin.jvm.internal.n.e(string, "toString(...)");
        return string;
    }

    public static Executor s(Executor executor, f0 f0Var) {
        executor.getClass();
        return executor == c0.f50592a ? executor : new k2.a(executor, f0Var, 1);
    }

    public static final Object t(Set set, Enum r2, Enum r3, Enum r10, boolean z10) {
        Enum r11;
        if (!z10) {
            if (r10 != null) {
                set = xj.n.R0(g0.w0(set, r10));
            }
            return xj.n.G0(set);
        }
        if (set.contains(r2)) {
            r11 = r2;
        } else {
            r11 = set.contains(r3) ? r3 : null;
        }
        if (kotlin.jvm.internal.n.a(r11, r2) && kotlin.jvm.internal.n.a(r10, r3)) {
            return null;
        }
        return r10 == null ? r11 : r10;
    }

    public static void u(m5.k kVar, f2 f2Var, db.b bVar, byte[] bArr) throws IOException {
        f1 f1VarU = kVar.u();
        byte[] bArrA = bVar.a(f1VarU.d(), bArr);
        m0 m0VarB = n0.B();
        com.google.crypto.tink.shaded.protobuf.h hVarM = com.google.crypto.tink.shaded.protobuf.i.m(bArrA, 0, bArrA.length);
        m0VarB.e();
        n0.y((n0) m0VarB.f24645b, hVarM);
        j1 j1VarA = va.j.a(f1VarU);
        m0VarB.e();
        n0.z((n0) m0VarB.f24645b, j1VarA);
        if (!((SharedPreferences.Editor) f2Var.f39409b).putString((String) f2Var.f39410c, a.a.m(((n0) m0VarB.a()).d())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    public static void v(TextView textView, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i10 != fontMetricsInt) {
            textView.setLineSpacing(i10 - fontMetricsInt, 1.0f);
        }
    }

    public static void w(xd1 xd1Var) {
        xd1Var.t(3);
        xd1Var.t(8);
        boolean zH = xd1Var.h();
        boolean zH2 = xd1Var.h();
        if (zH) {
            xd1Var.t(5);
        }
        if (zH2) {
            xd1Var.t(6);
        }
    }

    public static void x(xd1 xd1Var) {
        int i10;
        int i11 = xd1Var.i(2);
        if (i11 == 0) {
            xd1Var.t(6);
            return;
        }
        int iO = o(xd1Var, 5, 8, 16) + 1;
        if (i11 == 1) {
            xd1Var.t(iO * 7);
            return;
        }
        if (i11 == 2) {
            boolean zH = xd1Var.h();
            int i12 = zH ? 1 : 5;
            int i13 = zH ? 7 : 5;
            int i14 = zH ? 8 : 6;
            int i15 = 0;
            while (i15 < iO) {
                if (xd1Var.h()) {
                    xd1Var.t(7);
                    i10 = 0;
                } else {
                    if (xd1Var.i(2) == 3 && xd1Var.i(i13) * i12 != 0) {
                        xd1Var.s();
                    }
                    i10 = xd1Var.i(i14) * i12;
                    if (i10 != 0 && i10 != 180) {
                        xd1Var.s();
                    }
                    xd1Var.s();
                }
                if (i10 != 0 && i10 != 180 && xd1Var.h()) {
                    i15++;
                }
                i15++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0040  */
    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    public static final yl.c y(yl.c cVar, yl.c prefix) {
        kotlin.jvm.internal.n.f(cVar, "<this>");
        kotlin.jvm.internal.n.f(prefix, "prefix");
        if (!cVar.equals(prefix) && !prefix.d()) {
            String strB = cVar.b();
            String strB2 = prefix.b();
            if (an.p.p0(strB, strB2, false) && strB.charAt(strB2.length()) == '.') {
                if (!prefix.d()) {
                    if (cVar.equals(prefix)) {
                        yl.c ROOT = yl.c.f54504c;
                        kotlin.jvm.internal.n.e(ROOT, "ROOT");
                        return ROOT;
                    }
                    String strSubstring = cVar.b().substring(prefix.b().length() + 1);
                    kotlin.jvm.internal.n.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                    return new yl.c(strSubstring);
                }
            }
        } else if (!prefix.d()) {
            if (cVar.equals(prefix)) {
                yl.c ROOT2 = yl.c.f54504c;
                kotlin.jvm.internal.n.e(ROOT2, "ROOT");
                return ROOT2;
            }
            String strSubstring2 = cVar.b().substring(prefix.b().length() + 1);
            kotlin.jvm.internal.n.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
            return new yl.c(strSubstring2);
        }
        return cVar;
    }

    public static final void z(Object obj) {
        if (obj instanceof wj.g) {
            throw ((wj.g) obj).f53285a;
        }
    }

    public abstract String a();

    public abstract Object m(ak.f fVar);

    public abstract Object q(Uri uri, InputEvent inputEvent, ak.f fVar);

    public abstract Object r(Uri uri, ak.f fVar);

    public String toString() {
        switch (this.f50579a) {
            case 20:
                return a();
            default:
                return super.toString();
        }
    }
}
