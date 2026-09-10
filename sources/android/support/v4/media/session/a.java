package android.support.v4.media.session;

import al.j;
import an.p;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.datastore.preferences.protobuf.i1;
import cc.a2;
import cl.t0;
import cn.d0;
import cn.n0;
import cn.y1;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.Utf8;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.internal.measurement.nf;
import com.google.android.gms.internal.play_billing.l0;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import d5.u;
import ea.f2;
import hb.c;
import hn.o;
import im.m;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import jn.d;
import jn.e;
import kotlin.jvm.internal.n;
import mb.g;
import ml.g0;
import om.l;
import org.json.JSONArray;
import org.json.JSONObject;
import pm.y;
import qk.i0;
import tl.e0;
import u4.h;
import ud.c1;
import ud.i;
import ud.r;
import xj.k;
import zc.s;
import zc.t;
import zk.f;
import zk.w;
import zl.q;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c1 f3833a;

    public static final void A(jk.c cVar) {
        d0.w(d0.b(n0.f6748a), null, new ch.a(cVar, null, 0), 3);
    }

    public static final y1 B(jk.c cVar) {
        e eVar = n0.f6748a;
        return d0.w(d0.b(o.f42451a), null, new ch.a(cVar, null, 1), 3);
    }

    public static final s7.c C(File file) {
        s7.a aVar;
        n.f(file, "file");
        s7.c cVar = new s7.c();
        String name = file.getName();
        n.e(name, "file.name");
        cVar.f50203a = name;
        if (p.p0(name, "crash_log_", false)) {
            aVar = s7.a.f50198d;
        } else if (p.p0(name, "shield_log_", false)) {
            aVar = s7.a.f50199e;
        } else if (p.p0(name, "thread_check_log_", false)) {
            aVar = s7.a.f50200f;
        } else if (p.p0(name, "analysis_log_", false)) {
            aVar = s7.a.f50196b;
        } else {
            aVar = p.p0(name, "anr_log_", false) ? s7.a.f50197c : s7.a.f50195a;
        }
        cVar.f50204b = aVar;
        JSONObject jSONObjectG = a2.G(name);
        if (jSONObjectG != null) {
            cVar.f50209g = Long.valueOf(jSONObjectG.optLong("timestamp", 0L));
            cVar.f50206d = jSONObjectG.optString("app_version", null);
            cVar.f50207e = jSONObjectG.optString("reason", null);
            cVar.f50208f = jSONObjectG.optString("callstack", null);
            cVar.f50205c = jSONObjectG.optJSONArray("feature_names");
        }
        return cVar;
    }

    public static final void D() {
        try {
            if (f3833a == null) {
                c1 c1Var = (c1) ((i) ((r) g.e().c(r.class))).f52103o.get();
                n.f(c1Var, "<set-?>");
                f3833a = c1Var;
            }
            c1 c1Var2 = f3833a;
            if (c1Var2 == null) {
                n.l("sharedSessionRepository");
                throw null;
            }
            if (c1Var2.f52045i) {
                if (c1Var2 != null) {
                    c1Var2.b();
                } else {
                    n.l("sharedSessionRepository");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }

    public static h E(String str) {
        String strGroup;
        if (str == null || an.h.y0(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
        if (!matcher.matches() || (strGroup = matcher.group(1)) == null) {
            return null;
        }
        int i10 = Integer.parseInt(strGroup);
        String strGroup2 = matcher.group(2);
        if (strGroup2 == null) {
            return null;
        }
        int i11 = Integer.parseInt(strGroup2);
        String strGroup3 = matcher.group(3);
        if (strGroup3 == null) {
            return null;
        }
        int i12 = Integer.parseInt(strGroup3);
        String description = matcher.group(4) != null ? matcher.group(4) : "";
        n.e(description, "description");
        return new h(description, i10, i11, i12);
    }

    public static String F(X509Certificate x509Certificate) {
        StringBuilder sb2 = new StringBuilder("sha256/");
        lo.h hVar = lo.h.f45638d;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        n.e(encoded, "publicKey.encoded");
        int length = encoded.length;
        int i10 = 0;
        com.google.android.gms.internal.auth.i.b(encoded.length, 0, length);
        byte[] bArr = new lo.h(k.i0(encoded, 0, length)).a("SHA-256").f45639a;
        byte[] map = lo.a.f45622a;
        n.f(bArr, "<this>");
        n.f(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length2 = bArr.length - (bArr.length % 3);
        int i11 = 0;
        while (i10 < length2) {
            byte b10 = bArr[i10];
            int i12 = i10 + 2;
            byte b11 = bArr[i10 + 1];
            i10 += 3;
            byte b12 = bArr[i12];
            bArr2[i11] = map[(b10 & 255) >> 2];
            bArr2[i11 + 1] = map[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i13 = i11 + 3;
            bArr2[i11 + 2] = map[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i11 += 4;
            bArr2[i13] = map[b12 & Utf8.REPLACEMENT_BYTE];
        }
        int length3 = bArr.length - length2;
        if (length3 == 1) {
            byte b13 = bArr[i10];
            bArr2[i11] = map[(b13 & 255) >> 2];
            bArr2[i11 + 1] = map[(b13 & 3) << 4];
            bArr2[i11 + 2] = 61;
            bArr2[i11 + 3] = 61;
        } else if (length3 == 2) {
            int i14 = i10 + 1;
            byte b14 = bArr[i10];
            byte b15 = bArr[i14];
            bArr2[i11] = map[(b14 & 255) >> 2];
            bArr2[i11 + 1] = map[((b14 & 3) << 4) | ((b15 & 255) >> 4)];
            bArr2[i11 + 2] = map[(b15 & 15) << 2];
            bArr2[i11 + 3] = 61;
        }
        sb2.append(new String(bArr2, an.a.f3768a));
        return sb2.toString();
    }

    public static HashMap G(t tVar) {
        int iIntValue;
        long jLongValue;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        String string = tVar.f54874a.getString("collapse_key");
        Bundle bundle = tVar.f54874a;
        if (string != null) {
            map.put("collapseKey", bundle.getString("collapse_key"));
        }
        if (bundle.getString("from") != null) {
            map.put("from", bundle.getString("from"));
        }
        if (bundle.getString("google.to") != null) {
            map.put("to", bundle.getString("google.to"));
        }
        if (tVar.h() != null) {
            map.put("messageId", tVar.h());
        }
        if (bundle.getString("message_type") != null) {
            map.put("messageType", bundle.getString("message_type"));
        }
        if (!tVar.b().isEmpty()) {
            for (Map.Entry entry : tVar.b().entrySet()) {
                map2.put((String) entry.getKey(), entry.getValue());
            }
        }
        map.put("data", map2);
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            iIntValue = ((Integer) obj).intValue();
        } else if (obj instanceof String) {
            try {
                iIntValue = Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                iIntValue = 0;
            }
        } else {
            iIntValue = 0;
        }
        map.put("ttl", Integer.valueOf(iIntValue));
        Object obj2 = bundle.get("google.sent_time");
        if (obj2 instanceof Long) {
            jLongValue = ((Long) obj2).longValue();
        } else if (obj2 instanceof String) {
            try {
                jLongValue = Long.parseLong((String) obj2);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseMessaging", "Invalid sent time: " + obj2);
                jLongValue = 0;
            }
        } else {
            jLongValue = 0;
        }
        map.put("sentTime", Long.valueOf(jLongValue));
        if (tVar.m() != null) {
            s sVarM = tVar.m();
            HashMap map3 = new HashMap();
            HashMap map4 = new HashMap();
            String str = sVarM.f54857a;
            String str2 = sVarM.f54864h;
            if (str != null) {
                map3.put("title", str);
            }
            String str3 = sVarM.f54858b;
            if (str3 != null) {
                map3.put("titleLocKey", str3);
            }
            String[] strArr = sVarM.f54859c;
            if (strArr != null) {
                map3.put("titleLocArgs", Arrays.asList(strArr));
            }
            String str4 = sVarM.f54860d;
            if (str4 != null) {
                map3.put("body", str4);
            }
            String str5 = sVarM.f54861e;
            if (str5 != null) {
                map3.put("bodyLocKey", str5);
            }
            String[] strArr2 = sVarM.f54862f;
            if (strArr2 != null) {
                map3.put("bodyLocArgs", Arrays.asList(strArr2));
            }
            String str6 = sVarM.f54868m;
            if (str6 != null) {
                map4.put("channelId", str6);
            }
            String str7 = sVarM.l;
            if (str7 != null) {
                map4.put("clickAction", str7);
            }
            String str8 = sVarM.f54867k;
            if (str8 != null) {
                map4.put("color", str8);
            }
            String str9 = sVarM.f54863g;
            if (str9 != null) {
                map4.put("smallIcon", str9);
            }
            if ((str2 != null ? Uri.parse(str2) : null) != null) {
                map4.put("imageUrl", (str2 != null ? Uri.parse(str2) : null).toString());
            }
            Uri uri = sVarM.f54869n;
            if (uri != null) {
                map4.put("link", uri.toString());
            }
            Integer num = sVarM.f54873r;
            if (num != null) {
                map4.put("count", num);
            }
            Integer num2 = sVarM.f54871p;
            if (num2 != null) {
                map4.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, num2);
            }
            String str10 = sVarM.f54865i;
            if (str10 != null) {
                map4.put("sound", str10);
            }
            String str11 = sVarM.f54870o;
            if (str11 != null) {
                map4.put("ticker", str11);
            }
            Integer num3 = sVarM.f54872q;
            if (num3 != null) {
                map4.put(ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, num3);
            }
            String str12 = sVarM.f54866j;
            if (str12 != null) {
                map4.put(ViewHierarchyConstants.TAG_KEY, str12);
            }
            map3.put("android", map4);
            map.put("notification", map3);
        }
        return map;
    }

    public static boolean H(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i10 = 0; i10 < bArr2.length; i10++) {
                if (bArr[i10] == bArr2[i10]) {
                }
            }
            return true;
        }
        return false;
    }

    public static nl.a I(int i10, boolean z10, g0 g0Var, int i11) {
        boolean z11 = (i11 & 1) != 0 ? false : z10;
        boolean z12 = (i11 & 2) == 0;
        if ((i11 & 4) != 0) {
            g0Var = null;
        }
        u.n(i10, "<this>");
        return new nl.a(i10, z12, z11, g0Var != null ? i0.k0(g0Var) : null, 34);
    }

    public static final String J(String str) {
        n.f(str, "<this>");
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb2.append(cCharAt);
        }
        String string = sb2.toString();
        n.e(string, "builder.toString()");
        return string;
    }

    public static /* synthetic */ boolean K(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, l0 l0Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(l0Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(l0Var) != obj && atomicReferenceFieldUpdater.get(l0Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static final s7.c a(String str, String str2) {
        s7.c cVar = new s7.c();
        cVar.f50204b = s7.a.f50197c;
        Context contextB = l7.s.b();
        String str3 = null;
        try {
            PackageInfo packageInfo = contextB.getPackageManager().getPackageInfo(contextB.getPackageName(), 0);
            if (packageInfo != null) {
                str3 = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        cVar.f50206d = str3;
        cVar.f50207e = str;
        cVar.f50208f = str2;
        Long lValueOf = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        cVar.f50209g = lValueOf;
        StringBuffer stringBuffer = new StringBuffer("anr_log_");
        stringBuffer.append(String.valueOf(lValueOf));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        n.e(string, "StringBuffer()\n         …)\n            .toString()");
        cVar.f50203a = string;
        return cVar;
    }

    public static final s7.c b(Throwable th2, s7.a aVar) {
        String str;
        String str2;
        s7.c cVar = new s7.c();
        cVar.f50204b = aVar;
        Context contextB = l7.s.b();
        Throwable th3 = null;
        try {
            PackageInfo packageInfo = contextB.getPackageManager().getPackageInfo(contextB.getPackageName(), 0);
            str = packageInfo == null ? null : packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        cVar.f50206d = str;
        cVar.f50207e = th2.getCause() == null ? th2.toString() : String.valueOf(th2.getCause());
        JSONArray jSONArray = new JSONArray();
        while (th2 != null && th2 != th3) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            n.e(stackTrace, "t.stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                jSONArray.put(stackTraceElement.toString());
            }
            th3 = th2;
            th2 = th2.getCause();
        }
        cVar.f50208f = jSONArray.toString();
        Long lValueOf = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        cVar.f50209g = lValueOf;
        StringBuffer stringBuffer = new StringBuffer();
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 1) {
            str2 = "analysis_log_";
        } else if (iOrdinal == 2) {
            str2 = "anr_log_";
        } else if (iOrdinal == 3) {
            str2 = "crash_log_";
        } else if (iOrdinal != 4) {
            str2 = iOrdinal != 5 ? "Unknown" : "thread_check_log_";
        } else {
            str2 = "shield_log_";
        }
        stringBuffer.append(str2);
        stringBuffer.append(String.valueOf(lValueOf));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        n.e(string, "StringBuffer().append(t.…ppend(\".json\").toString()");
        cVar.f50203a = string;
        return cVar;
    }

    public static final String c(String str) {
        char cCharAt;
        n.f(str, "<this>");
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        char upperCase = Character.toUpperCase(cCharAt);
        String strSubstring = str.substring(1);
        n.e(strSubstring, "this as java.lang.String).substring(startIndex)");
        return upperCase + strSubstring;
    }

    public static nf d(nf nfVar, f fVar, fl.n nVar, int i10) {
        if ((i10 & 2) != 0) {
            nVar = null;
        }
        n.f(nfVar, "<this>");
        return new nf((ll.a) nfVar.f23782b, nVar != null ? new i3.f(nfVar, fVar, nVar, 0) : (ll.e) nfVar.f23783c, r9.b.t(wj.e.f53281b, new t0(2, nfVar, fVar)));
    }

    public static void e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static final Object f(jk.c cVar, ak.f fVar) {
        e eVar = n0.f6748a;
        return d0.J(d.f44017b, cVar, fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] g(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            jArr[i10] = iArr[i10];
        }
        return jArr;
    }

    public static void h(a1.b bVar, a1.c cVar, int i10) throws IOException {
        byte[] bArr = new byte[Segment.SIZE];
        while (i10 > 0) {
            int iMin = Math.min(i10, Segment.SIZE);
            int i11 = bVar.read(bArr, 0, iMin);
            if (i11 != iMin) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i10 -= i11;
            cVar.write(bArr, 0, i11);
        }
    }

    public static void i(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[Segment.SIZE];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i10);
            }
        }
    }

    public static final nf j(nf nfVar, j additionalAnnotations) {
        n.f(nfVar, "<this>");
        n.f(additionalAnnotations, "additionalAnnotations");
        if (additionalAnnotations.isEmpty()) {
            return nfVar;
        }
        return new nf((ll.a) nfVar.f23782b, (ll.e) nfVar.f23783c, r9.b.t(wj.e.f53281b, new t0(3, nfVar, additionalAnnotations)));
    }

    public static c k(hb.a aVar) {
        s4.i iVar = aVar.f42294c;
        ib.a aVar2 = new ib.a(((lb.a) iVar.f50111a).b());
        try {
            Provider providerA = eb.j.a();
            if (providerA == null) {
                throw new GeneralSecurityException("Conscrypt not available");
            }
            Mac.getInstance("AESCMAC", providerA);
            return new eb.d0((Object) aVar2, false, (Object) new f2(((lb.a) iVar.f50111a).b(), providerA), 26);
        } catch (GeneralSecurityException unused) {
            return aVar2;
        }
    }

    public static im.n l(String message, Collection types) {
        im.n aVar;
        n.f(message, "message");
        n.f(types, "types");
        Collection collection = types;
        ArrayList arrayList = new ArrayList(xj.p.W(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((y) it.next()).A());
        }
        ym.f fVarE = x7.a.E(arrayList);
        int i10 = fVarE.f54549a;
        if (i10 != 0) {
            aVar = i10 != 1 ? new im.a(message, (im.n[]) fVarE.toArray(new im.n[0])) : (im.n) fVarE.get(0);
        } else {
            aVar = m.f43190b;
        }
        return fVarE.f54549a <= 1 ? aVar : new im.j(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004c A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:3:0x000a, B:10:0x002a, B:12:0x0043, B:13:0x0046, B:15:0x004c, B:17:0x0050, B:18:0x0060, B:20:0x0062, B:21:0x0065), top: B:35:0x000a, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0050 A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:3:0x000a, B:10:0x002a, B:12:0x0043, B:13:0x0046, B:15:0x004c, B:17:0x0050, B:18:0x0060, B:20:0x0062, B:21:0x0065), top: B:35:0x000a, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    public static mm.c m(yl.c fqName, l lVar, w module, InputStream inputStream) throws IOException {
        e0 e0Var;
        zl.a aVar;
        n.f(fqName, "fqName");
        n.f(module, "module");
        try {
            ul.a aVar2 = ul.a.f52255f;
            ul.a aVarA = go.c.A(inputStream);
            ul.a ourVersion = ul.a.f52255f;
            int i10 = aVarA.f52624c;
            n.f(ourVersion, "ourVersion");
            int i11 = ourVersion.f52624c;
            int i12 = ourVersion.f52623b;
            int i13 = aVarA.f52623b;
            if (i13 == 0) {
                if (i12 == 0 && i10 == i11) {
                    zl.g gVar = new zl.g();
                    ul.b.a(gVar);
                    tl.a aVar3 = e0.f51199k;
                    aVar3.getClass();
                    zl.e eVar = new zl.e(inputStream);
                    aVar = (zl.a) aVar3.a(eVar, gVar);
                    try {
                        eVar.a(0);
                        if (aVar.isInitialized()) {
                            q qVar = new q(new aa.b().getMessage());
                            qVar.f55076a = aVar;
                            throw qVar;
                        }
                        e0Var = (e0) aVar;
                    } catch (q e10) {
                        e10.f55076a = aVar;
                        throw e10;
                    }
                } else {
                    e0Var = null;
                }
            } else if (i13 != i12 || i10 > i11) {
                e0Var = null;
            } else {
                zl.g gVar2 = new zl.g();
                ul.b.a(gVar2);
                tl.a aVar4 = e0.f51199k;
                aVar4.getClass();
                zl.e eVar2 = new zl.e(inputStream);
                aVar = (zl.a) aVar4.a(eVar2, gVar2);
                eVar2.a(0);
                if (aVar.isInitialized()) {
                    q qVar2 = new q(new aa.b().getMessage());
                    qVar2.f55076a = aVar;
                    throw qVar2;
                }
                e0Var = (e0) aVar;
            }
            e0 e0Var2 = e0Var;
            inputStream.close();
            if (e0Var2 != null) {
                return new mm.c(fqName, lVar, module, e0Var2, aVarA);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + ourVersion + ", actual " + aVarA + ". Please update Kotlin");
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                i0.j(inputStream, th2);
                throw th3;
            }
        }
    }

    public static final FloatBuffer n(int i10) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i10 * 4).order(ByteOrder.nativeOrder());
        byteBufferOrder.limit(byteBufferOrder.capacity());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferOrder.asFloatBuffer();
        n.e(floatBufferAsFloatBuffer, "byteBuffer(size * Egloo.SIZE_OF_FLOAT).asFloatBuffer()");
        return floatBufferAsFloatBuffer;
    }

    public static void o(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(str, 3).setKeySize(NotificationCompat.FLAG_LOCAL_ONLY).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build();
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(keyGenParameterSpecBuild);
        keyGenerator.generateKey();
    }

    public static z.l p(z.j jVar) {
        z.i iVar = new z.i();
        iVar.f54592c = new z.m();
        z.l lVar = new z.l(iVar);
        iVar.f54591b = lVar;
        iVar.f54590a = jVar.getClass();
        try {
            Object objC = jVar.c(iVar);
            if (objC == null) {
                return lVar;
            }
            iVar.f54590a = objC;
            return lVar;
        } catch (Exception e10) {
            lVar.f54596b.j(e10);
            return lVar;
        }
    }

    public static n1.k r(int i10) {
        String str = l1.y.f44830a;
        Locale locale = Locale.US;
        return new n1.k(Uri.parse("rtp://0.0.0.0:" + i10), 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 0);
    }

    public static t s(Map map) {
        Object obj = map.get("message");
        Objects.requireNonNull(obj);
        Map map2 = (Map) obj;
        Object obj2 = map2.get("to");
        Objects.requireNonNull(obj2);
        String str = (String) obj2;
        Bundle bundle = new Bundle();
        x.e eVar = new x.e(0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Invalid to: ".concat(str));
        }
        bundle.putString("google.to", str);
        String str2 = (String) map2.get("collapseKey");
        String str3 = (String) map2.get("messageId");
        String str4 = (String) map2.get("messageType");
        Integer num = (Integer) map2.get("ttl");
        Map map3 = (Map) map2.get("data");
        if (str2 != null) {
            bundle.putString("collapse_key", str2);
        }
        if (str4 != null) {
            bundle.putString("message_type", str4);
        }
        if (str3 != null) {
            bundle.putString("google.message_id", str3);
        }
        if (num != null) {
            bundle.putString("google.ttl", String.valueOf(num.intValue()));
        }
        if (map3 != null) {
            eVar.clear();
            eVar.putAll(map3);
        }
        Bundle bundle2 = new Bundle();
        Iterator it = ((i1) eVar.entrySet()).iterator();
        while (true) {
            x.c cVar = (x.c) it;
            if (!cVar.hasNext()) {
                bundle2.putAll(bundle);
                bundle.remove("from");
                return new t(bundle2);
            }
            cVar.next();
            x.c cVar2 = cVar;
            bundle2.putString((String) cVar2.getKey(), (String) cVar2.getValue());
        }
    }

    public static long t(double d10) {
        go.k.h("not a normal value", x(d10));
        int exponent = Math.getExponent(d10);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static int u(String str) {
        if (str == null) {
            return -1;
        }
        String strN = i1.d0.n(str);
        strN.getClass();
        switch (strN) {
            case "audio/eac3-joc":
            case "audio/ac3":
            case "audio/eac3":
                return 0;
            case "video/mp2p":
                return 10;
            case "video/mp2t":
                return 11;
            case "video/webm":
            case "audio/x-matroska":
            case "application/webm":
            case "audio/webm":
            case "video/x-matroska":
                return 6;
            case "audio/amr-wb":
            case "audio/amr":
            case "audio/3gpp":
                return 3;
            case "image/avif":
                return 21;
            case "image/heic":
            case "image/heif":
                return 20;
            case "image/jpeg":
                return 14;
            case "image/webp":
                return 18;
            case "application/mp4":
            case "audio/mp4":
            case "video/mp4":
                return 8;
            case "video/x-msvideo":
                return 16;
            case "text/vtt":
                return 13;
            case "image/bmp":
                return 19;
            case "image/png":
                return 17;
            case "video/x-flv":
                return 5;
            case "audio/ac4":
                return 1;
            case "audio/ogg":
                return 9;
            case "audio/wav":
                return 12;
            case "audio/flac":
                return 4;
            case "audio/midi":
                return 15;
            case "audio/mpeg":
                return 7;
            default:
                return -1;
        }
    }

    public static int v(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    public static boolean w(Context context) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        if ((keyguardManager != null && keyguardManager.isKeyguardLocked()) || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        String packageName = context.getPackageName();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(packageName)) {
                return true;
            }
        }
        return false;
    }

    public static boolean x(double d10) {
        return Math.getExponent(d10) <= 1023;
    }

    public static boolean y(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && X3.i.I0.equals(uri.getAuthority());
    }

    public static final boolean z(int i10, String str) {
        char cCharAt = str.charAt(i10);
        return 'A' <= cCharAt && cCharAt < '[';
    }
}
