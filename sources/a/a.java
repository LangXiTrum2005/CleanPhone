package a;

import ag.b;
import al.i;
import al.j;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.google.android.gms.internal.play_billing.f0;
import com.google.android.gms.internal.play_billing.k0;
import com.google.android.gms.internal.play_billing.l0;
import com.google.android.gms.internal.play_billing.u0;
import com.unity3d.services.UnityAdsConstants;
import dm.g;
import dm.k;
import io.flutter.plugins.firebase.crashlytics.FlutterError;
import j1.f;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import l7.m0;
import l7.s;
import nk.d;
import nk.e;
import org.json.JSONArray;
import pk.c;
import pm.c0;
import pm.q0;
import pm.y;
import qk.i0;
import wk.h;
import wk.l;
import wk.m;
import xj.b0;
import xj.n;
import xj.o;
import xj.p;
import xj.v;
import xj.w;
import zb.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f3311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f3312b;

    public static MappedByteBuffer A(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th4;
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                    throw th4;
                }
            }
        } catch (IOException unused) {
        }
    }

    public static final int B(c cVar) {
        d dVar = e.f46785a;
        int i10 = cVar.f48393a;
        if (cVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + cVar);
        }
        int i11 = cVar.f48394b;
        if (i11 < Integer.MAX_VALUE) {
            return e.f46786b.e(i10, i11 + 1);
        }
        if (i10 <= Integer.MIN_VALUE) {
            return e.f46786b.d();
        }
        return e.f46786b.e(i10 - 1, i11) + 1;
    }

    public static final cg.d C(b bVar, cg.a aVar) {
        return new cg.d(n.D0(f.C(bVar), aVar));
    }

    public static void F(FlutterError flutterError) {
        r rVar = vb.c.a().f52533a;
        StringBuilder sb2 = new StringBuilder("Recorded on-demand fatal events: ");
        v6.c cVar = rVar.f54738c;
        sb2.append(((AtomicInteger) cVar.f52487a).get());
        String string = sb2.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, null);
        }
        String str = "Dropped on-demand fatal events: " + ((AtomicInteger) cVar.f52488b).get();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        rVar.f54750p.f3462a.a(new zb.n(rVar, flutterError, 1));
    }

    public static int H(float f10) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f10);
    }

    public static final void a(ao.a aVar, ao.c cVar, String str) {
        ao.d.f5063h.getClass();
        ao.d.f5065j.fine(cVar.f5058b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f5051a);
    }

    public static final String b(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final int h(y yVar) {
        kotlin.jvm.internal.n.f(yVar, "<this>");
        al.c cVarD = yVar.getAnnotations().d(l.f53353q);
        if (cVarD == null) {
            return 0;
        }
        g gVar = (g) b0.M(m.f53366d, cVarD.d());
        kotlin.jvm.internal.n.d(gVar, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((k) gVar).f38953a).intValue();
    }

    public static final c0 i(h hVar, j jVar, y yVar, List list, ArrayList arrayList, y yVar2, boolean z10) {
        zk.e eVarJ;
        int i10 = 0;
        ArrayList arrayList2 = new ArrayList(list.size() + arrayList.size() + (yVar != null ? 1 : 0) + 1);
        List list2 = list;
        ArrayList arrayList3 = new ArrayList(p.W(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList3.add(i0.d((y) it.next()));
        }
        arrayList2.addAll(arrayList3);
        ym.l.a(arrayList2, yVar != null ? i0.d(yVar) : null);
        int i11 = 0;
        for (Object obj : arrayList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                o.V();
                throw null;
            }
            arrayList2.add(i0.d((y) obj));
            i11 = i12;
        }
        arrayList2.add(i0.d(yVar2));
        int size = list.size() + arrayList.size() + (yVar == null ? 0 : 1);
        if (z10) {
            eVarJ = hVar.v(size);
        } else {
            yl.f fVar = m.f53363a;
            eVarJ = hVar.j("Function" + size);
        }
        j kVar = i.f3645a;
        if (yVar != null) {
            yl.c cVar = l.f53352p;
            if (!jVar.c(cVar)) {
                ArrayList arrayListA0 = n.A0(jVar, new al.m(hVar, cVar, w.f53867a));
                jVar = arrayListA0.isEmpty() ? kVar : new al.k(arrayListA0, i10);
            }
        }
        if (!list.isEmpty()) {
            int size2 = list.size();
            yl.c cVar2 = l.f53353q;
            if (!jVar.c(cVar2)) {
                ArrayList arrayListA1 = n.A0(jVar, new al.m(hVar, cVar2, b0.P(new wj.f(m.f53366d, new k(size2)))));
                if (!arrayListA1.isEmpty()) {
                    kVar = new al.k(arrayListA1, i10);
                }
                jVar = kVar;
            }
        }
        return pm.f.q(pm.c.x(jVar), eVarJ, arrayList2);
    }

    public static String j(Object value, String str) {
        kotlin.jvm.internal.n.f(value, "value");
        return str + " value: " + value;
    }

    public static byte[] k(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            int iDigit = Character.digit(str.charAt(i11), 16);
            int iDigit2 = Character.digit(str.charAt(i11 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i10] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean l(Object obj, Object obj2) {
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
            c cVarQ0 = xj.k.q0(objArr);
            if ((cVarQ0 instanceof Collection) && ((Collection) cVarQ0).isEmpty()) {
                return true;
            }
            pk.b bVarB = cVarQ0.iterator();
            while (bVarB.f48398c) {
                int iNextInt = bVarB.nextInt();
                if (!l(objArr[iNextInt], objArr2[iNextInt])) {
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
            c cVarO = o.O((Collection) obj);
            if ((cVarO instanceof Collection) && ((Collection) cVarO).isEmpty()) {
                return true;
            }
            pk.b bVarB2 = cVarO.iterator();
            while (bVarB2.f48398c) {
                int iNextInt2 = bVarB2.nextInt();
                if (!l(list.get(iNextInt2), list2.get(iNextInt2))) {
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
            if (!map2.containsKey(entry.getKey()) || !l(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public static String m(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            int i10 = b10 & 255;
            sb2.append("0123456789abcdef".charAt(i10 / 16));
            sb2.append("0123456789abcdef".charAt(i10 % 16));
        }
        return sb2.toString();
    }

    public static final void n(Throwable th2) {
        HashMap map;
        q7.n feature;
        if (f3312b) {
            HashSet hashSet = new HashSet();
            StackTraceElement[] stackTrace = th2.getStackTrace();
            kotlin.jvm.internal.n.e(stackTrace, "e.stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                kotlin.jvm.internal.n.e(className, "it.className");
                synchronized (q7.p.f48749a) {
                    map = q7.p.f48750b;
                    if (map.isEmpty()) {
                        map.put(q7.n.AAM, new String[]{"com.facebook.appevents.aam."});
                        map.put(q7.n.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
                        map.put(q7.n.CloudBridge, new String[]{"com.facebook.appevents.cloudbridge."});
                        map.put(q7.n.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
                        map.put(q7.n.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
                        map.put(q7.n.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
                        map.put(q7.n.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
                        map.put(q7.n.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
                        map.put(q7.n.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
                        map.put(q7.n.ProtectedMode, new String[]{"com.facebook.appevents.integrity.ProtectedModeManager"});
                        map.put(q7.n.MACARuleMatching, new String[]{"com.facebook.appevents.integrity.MACARuleMatchingManager"});
                        map.put(q7.n.BlocklistEvents, new String[]{"com.facebook.appevents.integrity.BlocklistEventsManager"});
                        map.put(q7.n.FilterRedactedEvents, new String[]{"com.facebook.appevents.integrity.RedactedEventsManager"});
                        map.put(q7.n.FilterSensitiveParams, new String[]{"com.facebook.appevents.integrity.SensitiveParamsManager"});
                        map.put(q7.n.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
                        map.put(q7.n.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
                        map.put(q7.n.IapLogging, new String[]{"com.facebook.appevents.iap."});
                        map.put(q7.n.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
                        map.put(q7.n.GPSARATriggers, new String[]{"com.facebook.appevents.gps.ara.GpsARAManager"});
                        map.put(q7.n.GPSPACAProcessing, new String[]{"com.facebook.appevents.gps.pa.PACustomAudienceClient"});
                        map.put(q7.n.GPSTopicsObservation, new String[]{"com.facebook.appevents.gps.topics.GpsTopicsManager"});
                        map.put(q7.n.VVP, new String[]{"com.facebook.appevents.integrity.VVPManager"});
                    }
                }
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        feature = q7.n.Unknown;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    feature = (q7.n) entry.getKey();
                    for (String str : (String[]) entry.getValue()) {
                        if (an.p.p0(className, str, false)) {
                            break;
                        }
                    }
                }
                if (feature != q7.n.Unknown) {
                    kotlin.jvm.internal.n.f(feature, "feature");
                    s.b().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString("FBSDKFeature" + feature, "18.3.0").apply();
                    hashSet.add(feature.toString());
                }
            }
            s sVar = s.f45212a;
            if (!m0.c() || hashSet.isEmpty()) {
                return;
            }
            JSONArray jSONArray = new JSONArray((Collection) hashSet);
            s7.c cVar = new s7.c();
            cVar.f50204b = s7.a.f50196b;
            Long lValueOf = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
            cVar.f50209g = lValueOf;
            cVar.f50205c = jSONArray;
            StringBuffer stringBuffer = new StringBuffer("analysis_log_");
            stringBuffer.append(String.valueOf(lValueOf));
            stringBuffer.append(".json");
            String string = stringBuffer.toString();
            kotlin.jvm.internal.n.e(string, "StringBuffer()\n         …)\n            .toString()");
            cVar.f50203a = string;
            cVar.b();
        }
    }

    public static final yl.f o(y yVar) {
        String str;
        al.c cVarD = yVar.getAnnotations().d(l.f53354r);
        if (cVarD != null) {
            Object objG0 = n.G0(cVarD.d().values());
            dm.w wVar = objG0 instanceof dm.w ? (dm.w) objG0 : null;
            if (wVar != null && (str = (String) wVar.f38953a) != null) {
                if (!yl.f.f(str)) {
                    str = null;
                }
                if (str != null) {
                    return yl.f.e(str);
                }
            }
        }
        return null;
    }

    public static final String p(long j10) {
        String strR;
        if (j10 <= -999500000) {
            strR = defpackage.e.r(new StringBuilder(), (j10 - ((long) 500000000)) / ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS), " s ");
        } else if (j10 <= -999500) {
            strR = defpackage.e.r(new StringBuilder(), (j10 - ((long) 500000)) / ((long) 1000000), " ms");
        } else if (j10 <= 0) {
            strR = defpackage.e.r(new StringBuilder(), (j10 - ((long) UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE)) / ((long) 1000), " µs");
        } else if (j10 < 999500) {
            strR = defpackage.e.r(new StringBuilder(), (j10 + ((long) UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE)) / ((long) 1000), " µs");
        } else {
            strR = j10 < 999500000 ? defpackage.e.r(new StringBuilder(), (j10 + ((long) 500000)) / ((long) 1000000), " ms") : defpackage.e.r(new StringBuilder(), (j10 + ((long) 500000000)) / ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS), " s ");
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strR}, 1));
    }

    public static final List q(y yVar) {
        kotlin.jvm.internal.n.f(yVar, "<this>");
        w(yVar);
        int iH = h(yVar);
        if (iH == 0) {
            return v.f53866a;
        }
        List listSubList = yVar.t().subList(0, iH);
        ArrayList arrayList = new ArrayList(p.W(listSubList, 10));
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            y yVarB = ((q0) it.next()).b();
            kotlin.jvm.internal.n.e(yVarB, "it.type");
            arrayList.add(yVarB);
        }
        return arrayList;
    }

    public static /* synthetic */ Collection r(im.p pVar, im.f fVar, int i10) {
        if ((i10 & 1) != 0) {
            fVar = im.f.f43167m;
        }
        im.n.f43191a.getClass();
        return pVar.d(fVar, im.k.f43184f);
    }

    public static final xk.e s(zk.g gVar) {
        if (!(gVar instanceof zk.e) || !h.I(gVar)) {
            return null;
        }
        yl.e eVarH = fm.e.h(gVar);
        if (!eVarH.d() || eVarH.f54510a.isEmpty()) {
            return null;
        }
        un.a aVar = xk.e.f53887c;
        String strB = eVarH.f().b();
        kotlin.jvm.internal.n.e(strB, "shortName().asString()");
        yl.c cVarE = eVarH.g().e();
        aVar.getClass();
        xk.d dVarI = un.a.i(strB, cVarE);
        if (dVarI != null) {
            return dVarI.f53885a;
        }
        return null;
    }

    public static Object t(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return b6.d.h(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final y u(y yVar) {
        kotlin.jvm.internal.n.f(yVar, "<this>");
        w(yVar);
        if (yVar.getAnnotations().d(l.f53352p) == null) {
            return null;
        }
        return ((q0) yVar.t().get(h(yVar))).b();
    }

    public static final List v(y yVar) {
        kotlin.jvm.internal.n.f(yVar, "<this>");
        w(yVar);
        List listT = yVar.t();
        return listT.subList(((!w(yVar) || yVar.getAnnotations().d(l.f53352p) == null) ? 0 : 1) + h(yVar), listT.size() - 1);
    }

    public static final boolean w(y yVar) {
        kotlin.jvm.internal.n.f(yVar, "<this>");
        zk.g gVarE = yVar.P().e();
        if (gVarE == null) {
            return false;
        }
        xk.e eVarS = s(gVarE);
        return eVarS == xk.e.f53888d || eVarS == xk.e.f53889e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a A[SYNTHETIC] */
    public static boolean x(String str) {
        s4.b bVar;
        s4.b bVar2 = s4.m.f50115a;
        Set<s4.c> setUnmodifiableSet = Collections.unmodifiableSet(s4.b.f50100d);
        HashSet hashSet = new HashSet();
        for (s4.c cVar : setUnmodifiableSet) {
            if (((s4.b) cVar).f50101a.equals(str)) {
                hashSet.add(cVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        do {
            boolean z10 = false;
            if (!it.hasNext()) {
                return false;
            }
            bVar = (s4.b) ((s4.c) it.next());
            switch (bVar.f50103c) {
                case 0:
                case 1:
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                case 2:
                    if (!z10) {
                        break;
                    }
                    return true;
                default:
                    if (Build.VERSION.SDK_INT >= 33) {
                    }
                    if (!z10) {
                        break;
                    }
                    return true;
            }
            z10 = true;
            if (!z10) {
            }
            return true;
        } while (!bVar.a());
        return true;
    }

    public static final boolean y(y yVar) {
        kotlin.jvm.internal.n.f(yVar, "<this>");
        zk.g gVarE = yVar.P().e();
        return (gVarE != null ? s(gVarE) : null) == xk.e.f53889e;
    }

    public static String z(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb2.append(str2.charAt(i10));
            }
        }
        return sb2.toString();
    }

    public abstract void D(z.g gVar, z.g gVar2);

    public abstract void E(z.g gVar, Thread thread);

    public abstract a G(String str, jk.b bVar);

    public abstract f0 I(u0 u0Var);

    public abstract k0 J(u0 u0Var);

    public abstract void K(k0 k0Var, k0 k0Var2);

    public abstract void L(k0 k0Var, Thread thread);

    public abstract boolean M(u0 u0Var, f0 f0Var, f0 f0Var2);

    public abstract boolean N(l0 l0Var, Object obj, Object obj2);

    public abstract boolean O(l0 l0Var, k0 k0Var, k0 k0Var2);

    public abstract boolean c(z.h hVar, z.c cVar, z.c cVar2);

    public abstract boolean d(z.h hVar, Object obj, Object obj2);

    public abstract boolean e(z.h hVar, z.g gVar, z.g gVar2);

    public abstract Object g();
}
