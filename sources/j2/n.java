package j2;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.system.OsConstants;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.gms.internal.ads.k3;
import com.google.android.gms.internal.ads.p8;
import com.ironsource.C0526q2;
import com.ironsource.X3;
import com.ironsource.Z3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import l2.u;
import l7.b0;
import l7.d0;
import l7.f0;
import l7.g0;
import l7.i0;
import l7.j0;
import l7.v;
import l7.w;
import l7.x;
import l7.y;
import l7.z;
import m0.a0;
import n2.t;
import n6.c0;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q7.e0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements o, k3.k, kb.j, k6.s, l7.e, lg.a, a0, he.d, n2.d, n2.m, c0, ne.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43677a;

    public /* synthetic */ n(int i10) {
        this.f43677a = i10;
    }

    public static b0 A(l7.a aVar, String str, JSONObject jSONObject, w wVar) {
        b0 b0Var = new b0(aVar, str, null, f0.f45121b, wVar);
        b0Var.f45089c = jSONObject;
        return b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    public static void B(JSONObject jSONObject, String str, x xVar) {
        String strGroup;
        boolean z10;
        Matcher matcher = b0.f45086k.matcher(str);
        if (matcher.matches()) {
            strGroup = matcher.group(1);
            kotlin.jvm.internal.n.e(strGroup, "matcher.group(1)");
        } else {
            strGroup = str;
        }
        if (an.p.p0(strGroup, "me/", false) || an.p.p0(strGroup, "/me/", false)) {
            int iW0 = an.h.w0(str, ":", 0, false, 6);
            int iW1 = an.h.w0(str, "?", 0, false, 6);
            if (iW0 <= 3 || (iW1 != -1 && iW0 >= iW1)) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            z10 = false;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            Object value = jSONObject.opt(key);
            boolean z11 = z10 && an.p.i0(key, "image");
            kotlin.jvm.internal.n.e(key, "key");
            kotlin.jvm.internal.n.e(value, "value");
            C(key, value, xVar, z11);
        }
    }

    public static void C(String str, Object obj, x xVar, boolean z10) {
        Class<?> cls = obj.getClass();
        if (JSONObject.class.isAssignableFrom(cls)) {
            JSONObject jSONObject = (JSONObject) obj;
            if (z10) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String str2 = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                    Object objOpt = jSONObject.opt(next);
                    kotlin.jvm.internal.n.e(objOpt, "jsonObject.opt(propertyName)");
                    C(str2, objOpt, xVar, z10);
                }
                return;
            }
            if (jSONObject.has("id")) {
                String strOptString = jSONObject.optString("id");
                kotlin.jvm.internal.n.e(strOptString, "jsonObject.optString(\"id\")");
                C(str, strOptString, xVar, z10);
                return;
            } else if (jSONObject.has("url")) {
                String strOptString2 = jSONObject.optString("url");
                kotlin.jvm.internal.n.e(strOptString2, "jsonObject.optString(\"url\")");
                C(str, strOptString2, xVar, z10);
                return;
            } else {
                if (jSONObject.has("fbsdk:create_object")) {
                    String string = jSONObject.toString();
                    kotlin.jvm.internal.n.e(string, "jsonObject.toString()");
                    C(str, string, xVar, z10);
                    return;
                }
                return;
            }
        }
        if (JSONArray.class.isAssignableFrom(cls)) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                String str3 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i10)}, 2));
                Object objOpt2 = jSONArray.opt(i10);
                kotlin.jvm.internal.n.e(objOpt2, "jsonArray.opt(i)");
                C(str3, objOpt2, xVar, z10);
            }
            return;
        }
        if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
            xVar.a(str, obj.toString());
            return;
        }
        if (Date.class.isAssignableFrom(cls)) {
            String str4 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
            kotlin.jvm.internal.n.e(str4, "iso8601DateFormat.format(date)");
            xVar.a(str, str4);
            return;
        }
        String str5 = b0.f45085j;
        e0.B("b0", "The type of property " + str + " in the graph object is unknown. It won't be sent in the request.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    public static void D(d0 d0Var, q7.x xVar, int i10, URL url, FilterOutputStream filterOutputStream, boolean z10) throws JSONException {
        String strC;
        z zVar = new z();
        zVar.f45238c = filterOutputStream;
        zVar.f45239d = xVar;
        ?? r2 = 1;
        zVar.f45236a = true;
        zVar.f45237b = z10;
        if (i10 == 1) {
            b0 b0Var = (b0) d0Var.f45106c.get(0);
            HashMap map = new HashMap();
            for (String key : b0Var.f45090d.keySet()) {
                Object obj = b0Var.f45090d.get(key);
                if (x(obj)) {
                    kotlin.jvm.internal.n.e(key, "key");
                    map.put(key, new v(b0Var, obj));
                }
            }
            xVar.a("  Parameters:\n");
            Bundle bundle = b0Var.f45090d;
            for (String key2 : bundle.keySet()) {
                Object obj2 = bundle.get(key2);
                if (y(obj2)) {
                    kotlin.jvm.internal.n.e(key2, "key");
                    zVar.l(key2, obj2, b0Var);
                }
            }
            xVar.a("  Attachments:\n");
            F(map, zVar);
            JSONObject jSONObject = b0Var.f45089c;
            if (jSONObject != null) {
                String path = url.getPath();
                kotlin.jvm.internal.n.e(path, "url.path");
                B(jSONObject, path, zVar);
                return;
            }
            return;
        }
        d0Var.getClass();
        Iterator<E> it = d0Var.iterator();
        while (true) {
            if (it.hasNext()) {
                l7.a aVar = ((b0) it.next()).f45087a;
                if (aVar != null) {
                    strC = aVar.f45078h;
                    break;
                }
            } else {
                String str = b0.f45085j;
                strC = l7.s.c();
                break;
            }
        }
        if (strC.length() == 0) {
            throw new l7.n("App ID was not specified at the request or Settings.");
        }
        zVar.a("batch_app_id", strC);
        HashMap map2 = new HashMap();
        JSONArray jSONArray = new JSONArray();
        Iterator it2 = d0Var.iterator();
        while (it2.hasNext()) {
            b0 b0Var2 = (b0) it2.next();
            b0Var2.getClass();
            String str2 = b0.f45085j;
            JSONObject jSONObject2 = new JSONObject();
            String strH = b0Var2.h(String.format("https://graph.%s", Arrays.copyOf(new Object[]{l7.s.f()}, (int) r2)));
            b0Var2.a();
            Uri uri = Uri.parse(b0Var2.b(strH, r2));
            String str3 = String.format("%s?%s", Arrays.copyOf(new Object[]{uri.getPath(), uri.getQuery()}, 2));
            jSONObject2.put("relative_url", str3);
            jSONObject2.put("method", b0Var2.f45094h);
            l7.a aVar2 = b0Var2.f45087a;
            if (aVar2 != null) {
                q7.x.f48792c.u(aVar2.f45075e);
            }
            ArrayList arrayList = new ArrayList();
            Iterator<String> it3 = b0Var2.f45090d.keySet().iterator();
            while (it3.hasNext()) {
                Object obj3 = b0Var2.f45090d.get(it3.next());
                if (x(obj3)) {
                    String str4 = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{X3.i.f27782b, Integer.valueOf(map2.size())}, 2));
                    arrayList.add(str4);
                    map2.put(str4, new v(b0Var2, obj3));
                }
            }
            if (!arrayList.isEmpty()) {
                jSONObject2.put("attached_files", TextUtils.join(",", arrayList));
            }
            JSONObject jSONObject3 = b0Var2.f45089c;
            if (jSONObject3 != null) {
                ArrayList arrayList2 = new ArrayList();
                B(jSONObject3, str3, new l7.a0(arrayList2));
                jSONObject2.put("body", TextUtils.join(X3.j.f27832c, arrayList2));
            }
            jSONArray.put(jSONObject2);
            r2 = 1;
        }
        String string = jSONArray.toString();
        kotlin.jvm.internal.n.e(string, "requestJsonArray.toString()");
        zVar.a("batch", string);
        xVar.a("  Attachments:\n");
        F(map2, zVar);
    }

    public static void E(d0 requests, ArrayList arrayList) {
        kotlin.jvm.internal.n.f(requests, "requests");
        ArrayList arrayList2 = requests.f45106c;
        int size = arrayList2.size();
        ArrayList arrayList3 = new ArrayList();
        for (int i10 = 0; i10 < size; i10++) {
            b0 b0Var = (b0) arrayList2.get(i10);
            if (b0Var.f45093g != null) {
                arrayList3.add(new Pair(b0Var.f45093g, arrayList.get(i10)));
            }
        }
        if (arrayList3.size() > 0) {
            u uVar = new u(5, arrayList3, requests);
            Handler handler = requests.f45104a;
            if (handler != null) {
                handler.post(uVar);
            } else {
                uVar.run();
            }
        }
    }

    public static void F(HashMap map, z zVar) {
        for (Map.Entry entry : map.entrySet()) {
            String str = b0.f45085j;
            if (x(((v) entry.getValue()).f45233b)) {
                zVar.l((String) entry.getKey(), ((v) entry.getValue()).f45233b, ((v) entry.getValue()).f45232a);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x013e  */
    /* JADX WARN: Code duplicated, block: B:66:? A[SYNTHETIC] */
    public static void G(HttpURLConnection httpURLConnection, d0 requests) throws Throwable {
        boolean z10;
        Throwable th2;
        FilterOutputStream filterOutputStream;
        FilterOutputStream gZIPOutputStream;
        kotlin.jvm.internal.n.f(requests, "requests");
        q7.x xVar = new q7.x();
        ArrayList arrayList = requests.f45106c;
        int size = arrayList.size();
        Iterator<E> it = requests.iterator();
        loop0: while (true) {
            z10 = false;
            if (!it.hasNext()) {
                z10 = true;
                break;
            }
            b0 b0Var = (b0) it.next();
            Iterator<String> it2 = b0Var.f45090d.keySet().iterator();
            while (it2.hasNext()) {
                if (x(b0Var.f45090d.get(it2.next()))) {
                    break loop0;
                }
            }
        }
        f0 f0Var = size == 1 ? ((b0) arrayList.get(0)).f45094h : null;
        f0 f0Var2 = f0.f45121b;
        if (f0Var == null) {
            f0Var = f0Var2;
        }
        httpURLConnection.setRequestMethod(f0Var.name());
        if (z10) {
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        } else {
            httpURLConnection.setRequestProperty("Content-Type", String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{b0.f45085j}, 1)));
        }
        URL url = httpURLConnection.getURL();
        xVar.a("Request:\n");
        xVar.b(requests.f45105b, "Id");
        kotlin.jvm.internal.n.e(url, "url");
        xVar.b(url, "URL");
        String requestMethod = httpURLConnection.getRequestMethod();
        kotlin.jvm.internal.n.e(requestMethod, "connection.requestMethod");
        xVar.b(requestMethod, "Method");
        String requestProperty = httpURLConnection.getRequestProperty(Command.HTTP_HEADER_USER_AGENT);
        kotlin.jvm.internal.n.e(requestProperty, "connection.getRequestProperty(\"User-Agent\")");
        xVar.b(requestProperty, Command.HTTP_HEADER_USER_AGENT);
        String requestProperty2 = httpURLConnection.getRequestProperty("Content-Type");
        kotlin.jvm.internal.n.e(requestProperty2, "connection.getRequestProperty(\"Content-Type\")");
        xVar.b(requestProperty2, "Content-Type");
        httpURLConnection.setConnectTimeout(z10);
        httpURLConnection.setReadTimeout(z10);
        g0 g0Var = g0.f45133a;
        String str = xVar.f48794a;
        if (f0Var != f0Var2) {
            String string = xVar.f48795b.toString();
            kotlin.jvm.internal.n.e(string, "contents.toString()");
            q7.x.f48792c.r(g0Var, 3, str, string);
            xVar.f48795b = new StringBuilder();
            return;
        }
        httpURLConnection.setDoOutput(true);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            if (z10) {
                try {
                    gZIPOutputStream = new GZIPOutputStream(bufferedOutputStream);
                } catch (Throwable th3) {
                    th2 = th3;
                    filterOutputStream = bufferedOutputStream;
                    if (filterOutputStream != null) {
                        throw th2;
                    }
                    filterOutputStream.close();
                    throw th2;
                }
            } else {
                gZIPOutputStream = bufferedOutputStream;
            }
            try {
                for (l7.d dVar : requests.f45107d) {
                }
                Iterator<E> it3 = requests.iterator();
                while (it3.hasNext()) {
                    w wVar = ((b0) it3.next()).f45093g;
                }
                D(requests, xVar, size, url, gZIPOutputStream, z10);
                gZIPOutputStream.close();
                String string2 = xVar.f48795b.toString();
                kotlin.jvm.internal.n.e(string2, "contents.toString()");
                q7.x.f48792c.r(g0Var, 3, str, string2);
                xVar.f48795b = new StringBuilder();
            } catch (Throwable th4) {
                th2 = th4;
                filterOutputStream = gZIPOutputStream;
                if (filterOutputStream != null) {
                    throw th2;
                }
                filterOutputStream.close();
                throw th2;
            }
        } catch (Throwable th5) {
            th2 = th5;
            filterOutputStream = null;
        }
    }

    public static HttpURLConnection H(d0 requests) throws Throwable {
        kotlin.jvm.internal.n.f(requests, "requests");
        ArrayList arrayList = requests.f45106c;
        Iterator<E> it = requests.iterator();
        while (it.hasNext()) {
            b0 b0Var = (b0) it.next();
            if (f0.f45120a == b0Var.f45094h && e0.w(b0Var.f45090d.getString("fields"))) {
                ne.a aVar = q7.x.f48792c;
                StringBuilder sb2 = new StringBuilder("GET requests for /");
                String str = b0Var.f45088b;
                if (str == null) {
                    str = "";
                }
                aVar.r(g0.f45137e, 5, "Request", defpackage.e.q(str, " should contain an explicit \"fields\" parameter.", sb2));
            }
        }
        try {
            URL url = arrayList.size() == 1 ? new URL(((b0) arrayList.get(0)).g()) : new URL(String.format("https://graph.%s", Arrays.copyOf(new Object[]{l7.s.f()}, 1)));
            HttpURLConnection httpURLConnectionM = null;
            try {
                httpURLConnectionM = m(url);
                G(httpURLConnectionM, requests);
                return httpURLConnectionM;
            } catch (IOException e10) {
                e0.j(httpURLConnectionM);
                throw new l7.n("could not construct request body", e10);
            } catch (JSONException e11) {
                e0.j(httpURLConnectionM);
                throw new l7.n("could not construct request body", e11);
            }
        } catch (MalformedURLException e12) {
            throw new l7.n("could not construct URL for request", e12);
        }
    }

    public static final String d(byte[] bArr, byte[][] bArr2, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        byte[] bArr3 = PublicSuffixDatabase.f47557e;
        int length = bArr.length;
        int i14 = 0;
        while (i14 < length) {
            int i15 = (i14 + length) / 2;
            while (i15 > -1 && bArr[i15] != 10) {
                i15--;
            }
            int i16 = i15 + 1;
            int i17 = 1;
            while (true) {
                i11 = i16 + i17;
                if (bArr[i11] == 10) {
                    break;
                }
                i17++;
            }
            int i18 = i11 - i16;
            int i19 = i10;
            boolean z11 = false;
            int i20 = 0;
            int i21 = 0;
            while (true) {
                if (z11) {
                    i12 = 46;
                    z10 = false;
                } else {
                    byte b10 = bArr2[i19][i20];
                    byte[] bArr4 = yn.a.f54560a;
                    int i22 = b10 & 255;
                    z10 = z11;
                    i12 = i22;
                }
                byte b11 = bArr[i16 + i21];
                byte[] bArr5 = yn.a.f54560a;
                i13 = i12 - (b11 & 255);
                if (i13 != 0) {
                    break;
                }
                i21++;
                i20++;
                if (i21 == i18) {
                    break;
                }
                if (bArr2[i19].length != i20) {
                    z11 = z10;
                } else {
                    if (i19 == bArr2.length - 1) {
                        break;
                    }
                    i19++;
                    i20 = -1;
                    z11 = true;
                }
            }
            if (i13 >= 0) {
                if (i13 <= 0) {
                    int i23 = i18 - i21;
                    int length2 = bArr2[i19].length - i20;
                    int length3 = bArr2.length;
                    for (int i24 = i19 + 1; i24 < length3; i24++) {
                        length2 += bArr2[i24].length;
                    }
                    if (length2 >= i23) {
                        if (length2 <= i23) {
                            Charset UTF_8 = StandardCharsets.UTF_8;
                            kotlin.jvm.internal.n.e(UTF_8, "UTF_8");
                            return new String(bArr, i16, i18, UTF_8);
                        }
                    }
                }
                i14 = i11 + 1;
            }
            length = i15;
        }
        return null;
    }

    public static final String j(Object obj) {
        String str = b0.f45085j;
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number)) {
            return obj.toString();
        }
        if (!(obj instanceof Date)) {
            throw new IllegalArgumentException("Unsupported parameter type.");
        }
        String str2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
        kotlin.jvm.internal.n.e(str2, "iso8601DateFormat.format(value)");
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0301  */
    /* JADX WARN: Code duplicated, block: B:110:0x0307  */
    /* JADX WARN: Code duplicated, block: B:112:0x0318  */
    /* JADX WARN: Code duplicated, block: B:128:0x0348  */
    /* JADX WARN: Code duplicated, block: B:143:0x03ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:144:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:145:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:148:0x03f0 A[LOOP:3: B:146:0x03ed->B:148:0x03f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:151:0x040f A[LOOP:4: B:150:0x040d->B:151:0x040f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:153:0x0430  */
    /* JADX WARN: Code duplicated, block: B:156:0x0440 A[LOOP:5: B:154:0x043d->B:156:0x0440, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:159:0x0495 A[LOOP:6: B:158:0x0493->B:159:0x0495, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:162:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:165:0x04d1 A[LOOP:7: B:163:0x04ce->B:165:0x04d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:168:0x04f0 A[LOOP:8: B:167:0x04ee->B:168:0x04f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:170:0x0507  */
    /* JADX WARN: Code duplicated, block: B:173:0x051d A[LOOP:9: B:171:0x051a->B:173:0x051d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:175:0x055a  */
    /* JADX WARN: Code duplicated, block: B:178:0x056e A[LOOP:10: B:176:0x056b->B:178:0x056e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:180:0x0585  */
    /* JADX WARN: Code duplicated, block: B:183:0x0599 A[LOOP:11: B:181:0x0596->B:183:0x0599, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:185:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:186:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:278:0x0704 A[Catch: all -> 0x070d, Exception -> 0x0712, TryCatch #20 {Exception -> 0x0712, all -> 0x070d, blocks: (B:276:0x0700, B:278:0x0704, B:286:0x0726, B:285:0x0715), top: B:358:0x0700 }] */
    /* JADX WARN: Code duplicated, block: B:285:0x0715 A[Catch: all -> 0x070d, Exception -> 0x0712, TryCatch #20 {Exception -> 0x0712, all -> 0x070d, blocks: (B:276:0x0700, B:278:0x0704, B:286:0x0726, B:285:0x0715), top: B:358:0x0700 }] */
    /* JADX WARN: Code duplicated, block: B:305:0x076d  */
    /* JADX WARN: Code duplicated, block: B:95:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:98:0x02df  */
    /* JADX WARN: Instruction removed from duplicated block: B:144:0x03d0, please report this as an issue */
    public static void l(a1.h hVar, a1.h hVar2) throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        FileOutputStream fileOutputStream2;
        FileInputStream fileInputStream3;
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        boolean z10;
        boolean z11;
        FileInputStream fileInputStream4;
        FileOutputStream fileOutputStream3;
        FileOutputStream fileOutputStream4;
        String str;
        int i10;
        a1.e eVar;
        int i11;
        int i12;
        Pair pairS;
        int i13;
        String[] strArrSplit;
        int[] iArr;
        int i14;
        String[] strArrSplit2;
        long[] jArr;
        int i15;
        String str2;
        int i16;
        String[] strArrSplit3;
        a1.f[] fVarArr;
        int i17;
        String[] strArrSplit4;
        int length;
        int[] iArr2;
        int i18;
        ByteBuffer byteBufferWrap;
        int i19;
        int i20;
        String[] strArrSplit5;
        int length2;
        a1.f[] fVarArr2;
        int i21;
        a1.f[] fVarArr3;
        ByteBuffer byteBufferWrap2;
        int i22;
        String[] strArrSplit6;
        int length3;
        double[] dArr;
        int i23;
        ByteBuffer byteBufferWrap3;
        int i24;
        String str3;
        a1.f fVar;
        for (String str4 : Arrays.asList("ImageDescription", "Make", "Model", "Software", "DateTime", "Artist", "Copyright", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "ISOSpeedRatings", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ExifVersion", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "FocalLength", "MakerNote", "UserComment", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "FlashpixVersion", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "Orientation")) {
            if (hVar.c(str4) != null) {
                String strC = hVar.c(str4);
                int[] iArr3 = a1.h.U;
                boolean z12 = a1.h.f3344v;
                HashMap[] mapArr = hVar2.f3354f;
                String str5 = "ExifInterface";
                if ("ISOSpeedRatings".equals(str4)) {
                    if (z12) {
                        Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                    }
                    str4 = "PhotographicSensitivity";
                }
                if (strC != null) {
                    String str6 = "Invalid value for ";
                    if (!a1.h.f3337b0.contains(str4) || strC.contains("/")) {
                        str = "/";
                        if (str4.equals("GPSTimeStamp")) {
                            Matcher matcher = a1.h.g0.matcher(strC);
                            if (matcher.find()) {
                                strC = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
                            } else {
                                Log.w("ExifInterface", "Invalid value for " + str4 + " : " + strC);
                            }
                        } else if ("DateTime".equals(str4) || "DateTimeOriginal".equals(str4) || "DateTimeDigitized".equals(str4)) {
                            boolean zFind = a1.h.f3342h0.matcher(strC).find();
                            boolean zFind2 = a1.h.f3343i0.matcher(strC).find();
                            if (strC.length() != 19 || (!zFind && !zFind2)) {
                                Log.w("ExifInterface", "Invalid value for " + str4 + " : " + strC);
                            } else if (zFind2) {
                                strC = strC.replaceAll("-", ":");
                            }
                        }
                    } else {
                        try {
                            double d10 = Double.parseDouble(strC);
                            str = "/";
                            long j10 = 1;
                            if (d10 >= 9.223372036854776E18d || d10 <= -9.223372036854776E18d) {
                                fVar = new a1.f(d10 > 0.0d ? Long.MAX_VALUE : Long.MIN_VALUE, 1L);
                            } else {
                                double dAbs = Math.abs(d10);
                                long j11 = 1;
                                double d11 = dAbs;
                                long j12 = 0;
                                long j13 = 0;
                                while (true) {
                                    double d12 = d11 % 1.0d;
                                    long j14 = (long) (d11 - d12);
                                    str3 = str6;
                                    long j15 = (j14 * j10) + j12;
                                    long j16 = (j14 * j13) + j11;
                                    d11 = 1.0d / d12;
                                    j12 = j10;
                                    try {
                                        if (Math.abs(dAbs - (j15 / j16)) <= 1.0E-8d * dAbs) {
                                            if (d10 < 0.0d) {
                                                j15 = -j15;
                                            }
                                            fVar = new a1.f(j15, j16);
                                        } else {
                                            j10 = j15;
                                            j11 = j13;
                                            str6 = str3;
                                            j13 = j16;
                                        }
                                    } catch (NumberFormatException unused) {
                                        Log.w("ExifInterface", str3 + str4 + " : " + strC);
                                    }
                                }
                            }
                            strC = fVar.toString();
                        } catch (NumberFormatException unused2) {
                            str3 = "Invalid value for ";
                        }
                    }
                } else {
                    str = "/";
                }
                char c4 = '\f';
                int i25 = 9;
                if ("Xmp".equals(str4)) {
                    boolean z13 = mapArr[0].containsKey("Xmp") || mapArr[5].containsKey("Xmp");
                    int i26 = hVar2.f3352d;
                    char c5 = i26 != 4 ? (i26 == 9 || i26 == 15 || i26 == 12 || i26 == 13) ? (char) 2 : (char) 1 : (char) 3;
                    if ((c5 != 2 || (hVar2.f3367t == null && z13)) && (c5 != 3 || z13)) {
                        i10 = 0;
                        while (i10 < a1.h.X.length) {
                            if (i10 == 4) {
                                i11 = eVar.f3333d;
                                i12 = eVar.f3332c;
                                if (strC != null) {
                                    pairS = a1.h.s(strC);
                                    i13 = i25;
                                    if (i12 != ((Integer) pairS.first).intValue()) {
                                        i11 = i12;
                                        switch (i11) {
                                            case 1:
                                                i10 = i10;
                                                str5 = str5;
                                                mapArr[i10].put(str4, a1.d.a(strC));
                                                break;
                                            case 2:
                                            case 7:
                                                i10 = i10;
                                                str5 = str5;
                                                mapArr[i10].put(str4, a1.d.b(strC));
                                                break;
                                            case 3:
                                                i10 = i10;
                                                str5 = str5;
                                                strArrSplit = strC.split(",", -1);
                                                iArr = new int[strArrSplit.length];
                                                for (i14 = 0; i14 < strArrSplit.length; i14++) {
                                                    iArr[i14] = Integer.parseInt(strArrSplit[i14]);
                                                }
                                                mapArr[i10].put(str4, a1.d.g(iArr, hVar2.f3356h));
                                                break;
                                            case 4:
                                                i10 = i10;
                                                str5 = str5;
                                                strArrSplit2 = strC.split(",", -1);
                                                jArr = new long[strArrSplit2.length];
                                                for (i15 = 0; i15 < strArrSplit2.length; i15++) {
                                                    jArr[i15] = Long.parseLong(strArrSplit2[i15]);
                                                }
                                                mapArr[i10].put(str4, a1.d.d(jArr, hVar2.f3356h));
                                                break;
                                            case 5:
                                                i10 = i10;
                                                str5 = str5;
                                                str2 = str;
                                                i16 = -1;
                                                strArrSplit3 = strC.split(",", -1);
                                                fVarArr = new a1.f[strArrSplit3.length];
                                                i17 = 0;
                                                while (i17 < strArrSplit3.length) {
                                                    String[] strArrSplit7 = strArrSplit3[i17].split(str2, i16);
                                                    int i27 = i17;
                                                    fVarArr[i27] = new a1.f((long) Double.parseDouble(strArrSplit7[0]), (long) Double.parseDouble(strArrSplit7[1]));
                                                    i17 = i27 + 1;
                                                    str2 = str2;
                                                    i16 = -1;
                                                }
                                                str = str2;
                                                mapArr[i10].put(str4, a1.d.e(fVarArr, hVar2.f3356h));
                                                break;
                                            case 6:
                                            case 8:
                                            case 11:
                                            default:
                                                if (z12) {
                                                    Log.d(str5, "Data format isn't one of expected formats: " + i11);
                                                }
                                                break;
                                            case 9:
                                                i10 = i10;
                                                strArrSplit4 = strC.split(",", -1);
                                                length = strArrSplit4.length;
                                                iArr2 = new int[length];
                                                for (i18 = 0; i18 < strArrSplit4.length; i18++) {
                                                    iArr2[i18] = Integer.parseInt(strArrSplit4[i18]);
                                                }
                                                HashMap map = mapArr[i10];
                                                ByteOrder byteOrder = hVar2.f3356h;
                                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr3[i13] * length]);
                                                byteBufferWrap.order(byteOrder);
                                                for (i19 = 0; i19 < length; i19++) {
                                                    byteBufferWrap.putInt(iArr2[i19]);
                                                }
                                                map.put(str4, new a1.d(byteBufferWrap.array(), i13, length));
                                                str = str;
                                                break;
                                            case 10:
                                                i20 = -1;
                                                strArrSplit5 = strC.split(",", -1);
                                                length2 = strArrSplit5.length;
                                                fVarArr2 = new a1.f[length2];
                                                i21 = 0;
                                                while (i21 < strArrSplit5.length) {
                                                    String[] strArrSplit8 = strArrSplit5[i21].split(str, i20);
                                                    int i28 = i21;
                                                    a1.f[] fVarArr4 = fVarArr2;
                                                    fVarArr4[i28] = new a1.f((long) Double.parseDouble(strArrSplit8[0]), (long) Double.parseDouble(strArrSplit8[1]));
                                                    i21 = i28 + 1;
                                                    strArrSplit5 = strArrSplit5;
                                                    fVarArr2 = fVarArr4;
                                                    i10 = i10;
                                                    i20 = -1;
                                                }
                                                i10 = i10;
                                                fVarArr3 = fVarArr2;
                                                HashMap map2 = mapArr[i10];
                                                ByteOrder byteOrder2 = hVar2.f3356h;
                                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr3[10] * length2]);
                                                byteBufferWrap2.order(byteOrder2);
                                                i22 = 0;
                                                while (i22 < length2) {
                                                    a1.f fVar2 = fVarArr3[i22];
                                                    byteBufferWrap2.putInt((int) fVar2.f3334a);
                                                    byteBufferWrap2.putInt((int) fVar2.f3335b);
                                                    i22++;
                                                    length2 = length2;
                                                }
                                                map2.put(str4, new a1.d(byteBufferWrap2.array(), 10, length2));
                                                str = str;
                                                break;
                                            case 12:
                                                strArrSplit6 = strC.split(",", -1);
                                                length3 = strArrSplit6.length;
                                                dArr = new double[length3];
                                                for (i23 = 0; i23 < strArrSplit6.length; i23++) {
                                                    dArr[i23] = Double.parseDouble(strArrSplit6[i23]);
                                                }
                                                HashMap map3 = mapArr[i10];
                                                ByteOrder byteOrder3 = hVar2.f3356h;
                                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr3[c4] * length3]);
                                                byteBufferWrap3.order(byteOrder3);
                                                i24 = 0;
                                                while (i24 < length3) {
                                                    double[] dArr2 = dArr;
                                                    byteBufferWrap3.putDouble(dArr2[i24]);
                                                    i24++;
                                                    str5 = str5;
                                                    dArr = dArr2;
                                                }
                                                str5 = str5;
                                                map3.put(str4, new a1.d(byteBufferWrap3.array(), c4, length3));
                                                break;
                                        }
                                    } else {
                                        i11 = i12;
                                        switch (i11) {
                                            case 1:
                                                i10 = i10;
                                                str5 = str5;
                                                mapArr[i10].put(str4, a1.d.a(strC));
                                                break;
                                            case 2:
                                            case 7:
                                                i10 = i10;
                                                str5 = str5;
                                                mapArr[i10].put(str4, a1.d.b(strC));
                                                break;
                                            case 3:
                                                i10 = i10;
                                                str5 = str5;
                                                strArrSplit = strC.split(",", -1);
                                                iArr = new int[strArrSplit.length];
                                                while (i14 < strArrSplit.length) {
                                                    iArr[i14] = Integer.parseInt(strArrSplit[i14]);
                                                }
                                                mapArr[i10].put(str4, a1.d.g(iArr, hVar2.f3356h));
                                                break;
                                            case 4:
                                                i10 = i10;
                                                str5 = str5;
                                                strArrSplit2 = strC.split(",", -1);
                                                jArr = new long[strArrSplit2.length];
                                                while (i15 < strArrSplit2.length) {
                                                    jArr[i15] = Long.parseLong(strArrSplit2[i15]);
                                                }
                                                mapArr[i10].put(str4, a1.d.d(jArr, hVar2.f3356h));
                                                break;
                                            case 5:
                                                i10 = i10;
                                                str5 = str5;
                                                str2 = str;
                                                i16 = -1;
                                                strArrSplit3 = strC.split(",", -1);
                                                fVarArr = new a1.f[strArrSplit3.length];
                                                i17 = 0;
                                                while (i17 < strArrSplit3.length) {
                                                    String[] strArrSplit9 = strArrSplit3[i17].split(str2, i16);
                                                    int i29 = i17;
                                                    fVarArr[i29] = new a1.f((long) Double.parseDouble(strArrSplit9[0]), (long) Double.parseDouble(strArrSplit9[1]));
                                                    i17 = i29 + 1;
                                                    str2 = str2;
                                                    i16 = -1;
                                                }
                                                str = str2;
                                                mapArr[i10].put(str4, a1.d.e(fVarArr, hVar2.f3356h));
                                                break;
                                            case 6:
                                            case 8:
                                            case 11:
                                            default:
                                                if (z12) {
                                                    Log.d(str5, "Data format isn't one of expected formats: " + i11);
                                                }
                                                break;
                                            case 9:
                                                i10 = i10;
                                                strArrSplit4 = strC.split(",", -1);
                                                length = strArrSplit4.length;
                                                iArr2 = new int[length];
                                                while (i18 < strArrSplit4.length) {
                                                    iArr2[i18] = Integer.parseInt(strArrSplit4[i18]);
                                                }
                                                HashMap map4 = mapArr[i10];
                                                ByteOrder byteOrder4 = hVar2.f3356h;
                                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr3[i13] * length]);
                                                byteBufferWrap.order(byteOrder4);
                                                while (i19 < length) {
                                                    byteBufferWrap.putInt(iArr2[i19]);
                                                }
                                                map4.put(str4, new a1.d(byteBufferWrap.array(), i13, length));
                                                str = str;
                                                break;
                                            case 10:
                                                i20 = -1;
                                                strArrSplit5 = strC.split(",", -1);
                                                length2 = strArrSplit5.length;
                                                fVarArr2 = new a1.f[length2];
                                                i21 = 0;
                                                while (i21 < strArrSplit5.length) {
                                                    String[] strArrSplit10 = strArrSplit5[i21].split(str, i20);
                                                    int i210 = i21;
                                                    a1.f[] fVarArr5 = fVarArr2;
                                                    fVarArr5[i210] = new a1.f((long) Double.parseDouble(strArrSplit10[0]), (long) Double.parseDouble(strArrSplit10[1]));
                                                    i21 = i210 + 1;
                                                    strArrSplit5 = strArrSplit5;
                                                    fVarArr2 = fVarArr5;
                                                    i10 = i10;
                                                    i20 = -1;
                                                }
                                                i10 = i10;
                                                fVarArr3 = fVarArr2;
                                                HashMap map5 = mapArr[i10];
                                                ByteOrder byteOrder5 = hVar2.f3356h;
                                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr3[10] * length2]);
                                                byteBufferWrap2.order(byteOrder5);
                                                i22 = 0;
                                                while (i22 < length2) {
                                                    a1.f fVar3 = fVarArr3[i22];
                                                    byteBufferWrap2.putInt((int) fVar3.f3334a);
                                                    byteBufferWrap2.putInt((int) fVar3.f3335b);
                                                    i22++;
                                                    length2 = length2;
                                                }
                                                map5.put(str4, new a1.d(byteBufferWrap2.array(), 10, length2));
                                                str = str;
                                                break;
                                            case 12:
                                                strArrSplit6 = strC.split(",", -1);
                                                length3 = strArrSplit6.length;
                                                dArr = new double[length3];
                                                while (i23 < strArrSplit6.length) {
                                                    dArr[i23] = Double.parseDouble(strArrSplit6[i23]);
                                                }
                                                HashMap map6 = mapArr[i10];
                                                ByteOrder byteOrder6 = hVar2.f3356h;
                                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr3[c4] * length3]);
                                                byteBufferWrap3.order(byteOrder6);
                                                i24 = 0;
                                                while (i24 < length3) {
                                                    double[] dArr3 = dArr;
                                                    byteBufferWrap3.putDouble(dArr3[i24]);
                                                    i24++;
                                                    str5 = str5;
                                                    dArr = dArr3;
                                                }
                                                str5 = str5;
                                                map6.put(str4, new a1.d(byteBufferWrap3.array(), c4, length3));
                                                break;
                                        }
                                    }
                                } else {
                                    mapArr[i10].remove(str4);
                                }
                                str5 = str5;
                            } else {
                                i11 = eVar.f3333d;
                                i12 = eVar.f3332c;
                                if (strC != null) {
                                    pairS = a1.h.s(strC);
                                    i13 = i25;
                                    if (i12 != ((Integer) pairS.first).intValue()) {
                                        i11 = i12;
                                        switch (i11) {
                                            case 1:
                                                i10 = i10;
                                                str5 = str5;
                                                mapArr[i10].put(str4, a1.d.a(strC));
                                                break;
                                            case 2:
                                            case 7:
                                                i10 = i10;
                                                str5 = str5;
                                                mapArr[i10].put(str4, a1.d.b(strC));
                                                break;
                                            case 3:
                                                i10 = i10;
                                                str5 = str5;
                                                strArrSplit = strC.split(",", -1);
                                                iArr = new int[strArrSplit.length];
                                                while (i14 < strArrSplit.length) {
                                                    iArr[i14] = Integer.parseInt(strArrSplit[i14]);
                                                }
                                                mapArr[i10].put(str4, a1.d.g(iArr, hVar2.f3356h));
                                                break;
                                            case 4:
                                                i10 = i10;
                                                str5 = str5;
                                                strArrSplit2 = strC.split(",", -1);
                                                jArr = new long[strArrSplit2.length];
                                                while (i15 < strArrSplit2.length) {
                                                    jArr[i15] = Long.parseLong(strArrSplit2[i15]);
                                                }
                                                mapArr[i10].put(str4, a1.d.d(jArr, hVar2.f3356h));
                                                break;
                                            case 5:
                                                i10 = i10;
                                                str5 = str5;
                                                str2 = str;
                                                i16 = -1;
                                                strArrSplit3 = strC.split(",", -1);
                                                fVarArr = new a1.f[strArrSplit3.length];
                                                i17 = 0;
                                                while (i17 < strArrSplit3.length) {
                                                    String[] strArrSplit11 = strArrSplit3[i17].split(str2, i16);
                                                    int i211 = i17;
                                                    fVarArr[i211] = new a1.f((long) Double.parseDouble(strArrSplit11[0]), (long) Double.parseDouble(strArrSplit11[1]));
                                                    i17 = i211 + 1;
                                                    str2 = str2;
                                                    i16 = -1;
                                                }
                                                str = str2;
                                                mapArr[i10].put(str4, a1.d.e(fVarArr, hVar2.f3356h));
                                                break;
                                            case 6:
                                            case 8:
                                            case 11:
                                            default:
                                                if (z12) {
                                                    Log.d(str5, "Data format isn't one of expected formats: " + i11);
                                                }
                                                break;
                                            case 9:
                                                i10 = i10;
                                                strArrSplit4 = strC.split(",", -1);
                                                length = strArrSplit4.length;
                                                iArr2 = new int[length];
                                                while (i18 < strArrSplit4.length) {
                                                    iArr2[i18] = Integer.parseInt(strArrSplit4[i18]);
                                                }
                                                HashMap map7 = mapArr[i10];
                                                ByteOrder byteOrder7 = hVar2.f3356h;
                                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr3[i13] * length]);
                                                byteBufferWrap.order(byteOrder7);
                                                while (i19 < length) {
                                                    byteBufferWrap.putInt(iArr2[i19]);
                                                }
                                                map7.put(str4, new a1.d(byteBufferWrap.array(), i13, length));
                                                str = str;
                                                break;
                                            case 10:
                                                i20 = -1;
                                                strArrSplit5 = strC.split(",", -1);
                                                length2 = strArrSplit5.length;
                                                fVarArr2 = new a1.f[length2];
                                                i21 = 0;
                                                while (i21 < strArrSplit5.length) {
                                                    String[] strArrSplit12 = strArrSplit5[i21].split(str, i20);
                                                    int i212 = i21;
                                                    a1.f[] fVarArr6 = fVarArr2;
                                                    fVarArr6[i212] = new a1.f((long) Double.parseDouble(strArrSplit12[0]), (long) Double.parseDouble(strArrSplit12[1]));
                                                    i21 = i212 + 1;
                                                    strArrSplit5 = strArrSplit5;
                                                    fVarArr2 = fVarArr6;
                                                    i10 = i10;
                                                    i20 = -1;
                                                }
                                                i10 = i10;
                                                fVarArr3 = fVarArr2;
                                                HashMap map8 = mapArr[i10];
                                                ByteOrder byteOrder8 = hVar2.f3356h;
                                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr3[10] * length2]);
                                                byteBufferWrap2.order(byteOrder8);
                                                i22 = 0;
                                                while (i22 < length2) {
                                                    a1.f fVar4 = fVarArr3[i22];
                                                    byteBufferWrap2.putInt((int) fVar4.f3334a);
                                                    byteBufferWrap2.putInt((int) fVar4.f3335b);
                                                    i22++;
                                                    length2 = length2;
                                                }
                                                map8.put(str4, new a1.d(byteBufferWrap2.array(), 10, length2));
                                                str = str;
                                                break;
                                            case 12:
                                                strArrSplit6 = strC.split(",", -1);
                                                length3 = strArrSplit6.length;
                                                dArr = new double[length3];
                                                while (i23 < strArrSplit6.length) {
                                                    dArr[i23] = Double.parseDouble(strArrSplit6[i23]);
                                                }
                                                HashMap map9 = mapArr[i10];
                                                ByteOrder byteOrder9 = hVar2.f3356h;
                                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr3[c4] * length3]);
                                                byteBufferWrap3.order(byteOrder9);
                                                i24 = 0;
                                                while (i24 < length3) {
                                                    double[] dArr4 = dArr;
                                                    byteBufferWrap3.putDouble(dArr4[i24]);
                                                    i24++;
                                                    str5 = str5;
                                                    dArr = dArr4;
                                                }
                                                str5 = str5;
                                                map9.put(str4, new a1.d(byteBufferWrap3.array(), c4, length3));
                                                break;
                                        }
                                    } else {
                                        i11 = i12;
                                        switch (i11) {
                                            case 1:
                                                i10 = i10;
                                                str5 = str5;
                                                mapArr[i10].put(str4, a1.d.a(strC));
                                                break;
                                            case 2:
                                            case 7:
                                                i10 = i10;
                                                str5 = str5;
                                                mapArr[i10].put(str4, a1.d.b(strC));
                                                break;
                                            case 3:
                                                i10 = i10;
                                                str5 = str5;
                                                strArrSplit = strC.split(",", -1);
                                                iArr = new int[strArrSplit.length];
                                                while (i14 < strArrSplit.length) {
                                                    iArr[i14] = Integer.parseInt(strArrSplit[i14]);
                                                }
                                                mapArr[i10].put(str4, a1.d.g(iArr, hVar2.f3356h));
                                                break;
                                            case 4:
                                                i10 = i10;
                                                str5 = str5;
                                                strArrSplit2 = strC.split(",", -1);
                                                jArr = new long[strArrSplit2.length];
                                                while (i15 < strArrSplit2.length) {
                                                    jArr[i15] = Long.parseLong(strArrSplit2[i15]);
                                                }
                                                mapArr[i10].put(str4, a1.d.d(jArr, hVar2.f3356h));
                                                break;
                                            case 5:
                                                i10 = i10;
                                                str5 = str5;
                                                str2 = str;
                                                i16 = -1;
                                                strArrSplit3 = strC.split(",", -1);
                                                fVarArr = new a1.f[strArrSplit3.length];
                                                i17 = 0;
                                                while (i17 < strArrSplit3.length) {
                                                    String[] strArrSplit13 = strArrSplit3[i17].split(str2, i16);
                                                    int i213 = i17;
                                                    fVarArr[i213] = new a1.f((long) Double.parseDouble(strArrSplit13[0]), (long) Double.parseDouble(strArrSplit13[1]));
                                                    i17 = i213 + 1;
                                                    str2 = str2;
                                                    i16 = -1;
                                                }
                                                str = str2;
                                                mapArr[i10].put(str4, a1.d.e(fVarArr, hVar2.f3356h));
                                                break;
                                            case 6:
                                            case 8:
                                            case 11:
                                            default:
                                                if (z12) {
                                                    Log.d(str5, "Data format isn't one of expected formats: " + i11);
                                                }
                                                break;
                                            case 9:
                                                i10 = i10;
                                                strArrSplit4 = strC.split(",", -1);
                                                length = strArrSplit4.length;
                                                iArr2 = new int[length];
                                                while (i18 < strArrSplit4.length) {
                                                    iArr2[i18] = Integer.parseInt(strArrSplit4[i18]);
                                                }
                                                HashMap map10 = mapArr[i10];
                                                ByteOrder byteOrder10 = hVar2.f3356h;
                                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr3[i13] * length]);
                                                byteBufferWrap.order(byteOrder10);
                                                while (i19 < length) {
                                                    byteBufferWrap.putInt(iArr2[i19]);
                                                }
                                                map10.put(str4, new a1.d(byteBufferWrap.array(), i13, length));
                                                str = str;
                                                break;
                                            case 10:
                                                i20 = -1;
                                                strArrSplit5 = strC.split(",", -1);
                                                length2 = strArrSplit5.length;
                                                fVarArr2 = new a1.f[length2];
                                                i21 = 0;
                                                while (i21 < strArrSplit5.length) {
                                                    String[] strArrSplit14 = strArrSplit5[i21].split(str, i20);
                                                    int i214 = i21;
                                                    a1.f[] fVarArr7 = fVarArr2;
                                                    fVarArr7[i214] = new a1.f((long) Double.parseDouble(strArrSplit14[0]), (long) Double.parseDouble(strArrSplit14[1]));
                                                    i21 = i214 + 1;
                                                    strArrSplit5 = strArrSplit5;
                                                    fVarArr2 = fVarArr7;
                                                    i10 = i10;
                                                    i20 = -1;
                                                }
                                                i10 = i10;
                                                fVarArr3 = fVarArr2;
                                                HashMap map11 = mapArr[i10];
                                                ByteOrder byteOrder11 = hVar2.f3356h;
                                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr3[10] * length2]);
                                                byteBufferWrap2.order(byteOrder11);
                                                i22 = 0;
                                                while (i22 < length2) {
                                                    a1.f fVar5 = fVarArr3[i22];
                                                    byteBufferWrap2.putInt((int) fVar5.f3334a);
                                                    byteBufferWrap2.putInt((int) fVar5.f3335b);
                                                    i22++;
                                                    length2 = length2;
                                                }
                                                map11.put(str4, new a1.d(byteBufferWrap2.array(), 10, length2));
                                                str = str;
                                                break;
                                            case 12:
                                                strArrSplit6 = strC.split(",", -1);
                                                length3 = strArrSplit6.length;
                                                dArr = new double[length3];
                                                while (i23 < strArrSplit6.length) {
                                                    dArr[i23] = Double.parseDouble(strArrSplit6[i23]);
                                                }
                                                HashMap map12 = mapArr[i10];
                                                ByteOrder byteOrder12 = hVar2.f3356h;
                                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr3[c4] * length3]);
                                                byteBufferWrap3.order(byteOrder12);
                                                i24 = 0;
                                                while (i24 < length3) {
                                                    double[] dArr5 = dArr;
                                                    byteBufferWrap3.putDouble(dArr5[i24]);
                                                    i24++;
                                                    str5 = str5;
                                                    dArr = dArr5;
                                                }
                                                str5 = str5;
                                                map12.put(str4, new a1.d(byteBufferWrap3.array(), c4, length3));
                                                break;
                                        }
                                    }
                                } else {
                                    mapArr[i10].remove(str4);
                                }
                                str5 = str5;
                            }
                            i10++;
                            str5 = str5;
                            c4 = '\f';
                            i25 = 9;
                        }
                    } else {
                        hVar2.f3367t = strC != null ? a1.d.a(strC) : null;
                    }
                } else {
                    i10 = 0;
                    while (i10 < a1.h.X.length) {
                        if ((i10 == 4 || hVar2.f3357i) && (eVar = (a1.e) a1.h.f3336a0[i10].get(str4)) != null) {
                            i11 = eVar.f3333d;
                            i12 = eVar.f3332c;
                            if (strC != null) {
                                pairS = a1.h.s(strC);
                                i13 = i25;
                                if (i12 != ((Integer) pairS.first).intValue() || i12 == ((Integer) pairS.second).intValue()) {
                                    i11 = i12;
                                    switch (i11) {
                                        case 1:
                                            i10 = i10;
                                            str5 = str5;
                                            mapArr[i10].put(str4, a1.d.a(strC));
                                            break;
                                        case 2:
                                        case 7:
                                            i10 = i10;
                                            str5 = str5;
                                            mapArr[i10].put(str4, a1.d.b(strC));
                                            break;
                                        case 3:
                                            i10 = i10;
                                            str5 = str5;
                                            strArrSplit = strC.split(",", -1);
                                            iArr = new int[strArrSplit.length];
                                            while (i14 < strArrSplit.length) {
                                                iArr[i14] = Integer.parseInt(strArrSplit[i14]);
                                            }
                                            mapArr[i10].put(str4, a1.d.g(iArr, hVar2.f3356h));
                                            break;
                                        case 4:
                                            i10 = i10;
                                            str5 = str5;
                                            strArrSplit2 = strC.split(",", -1);
                                            jArr = new long[strArrSplit2.length];
                                            while (i15 < strArrSplit2.length) {
                                                jArr[i15] = Long.parseLong(strArrSplit2[i15]);
                                            }
                                            mapArr[i10].put(str4, a1.d.d(jArr, hVar2.f3356h));
                                            break;
                                        case 5:
                                            i10 = i10;
                                            str5 = str5;
                                            str2 = str;
                                            i16 = -1;
                                            strArrSplit3 = strC.split(",", -1);
                                            fVarArr = new a1.f[strArrSplit3.length];
                                            i17 = 0;
                                            while (i17 < strArrSplit3.length) {
                                                String[] strArrSplit15 = strArrSplit3[i17].split(str2, i16);
                                                int i215 = i17;
                                                fVarArr[i215] = new a1.f((long) Double.parseDouble(strArrSplit15[0]), (long) Double.parseDouble(strArrSplit15[1]));
                                                i17 = i215 + 1;
                                                str2 = str2;
                                                i16 = -1;
                                            }
                                            str = str2;
                                            mapArr[i10].put(str4, a1.d.e(fVarArr, hVar2.f3356h));
                                            break;
                                        case 6:
                                        case 8:
                                        case 11:
                                        default:
                                            if (z12) {
                                                Log.d(str5, "Data format isn't one of expected formats: " + i11);
                                            }
                                            break;
                                        case 9:
                                            i10 = i10;
                                            strArrSplit4 = strC.split(",", -1);
                                            length = strArrSplit4.length;
                                            iArr2 = new int[length];
                                            while (i18 < strArrSplit4.length) {
                                                iArr2[i18] = Integer.parseInt(strArrSplit4[i18]);
                                            }
                                            HashMap map13 = mapArr[i10];
                                            ByteOrder byteOrder13 = hVar2.f3356h;
                                            byteBufferWrap = ByteBuffer.wrap(new byte[iArr3[i13] * length]);
                                            byteBufferWrap.order(byteOrder13);
                                            while (i19 < length) {
                                                byteBufferWrap.putInt(iArr2[i19]);
                                            }
                                            map13.put(str4, new a1.d(byteBufferWrap.array(), i13, length));
                                            str = str;
                                            break;
                                        case 10:
                                            i20 = -1;
                                            strArrSplit5 = strC.split(",", -1);
                                            length2 = strArrSplit5.length;
                                            fVarArr2 = new a1.f[length2];
                                            i21 = 0;
                                            while (i21 < strArrSplit5.length) {
                                                String[] strArrSplit16 = strArrSplit5[i21].split(str, i20);
                                                int i216 = i21;
                                                a1.f[] fVarArr8 = fVarArr2;
                                                fVarArr8[i216] = new a1.f((long) Double.parseDouble(strArrSplit16[0]), (long) Double.parseDouble(strArrSplit16[1]));
                                                i21 = i216 + 1;
                                                strArrSplit5 = strArrSplit5;
                                                fVarArr2 = fVarArr8;
                                                i10 = i10;
                                                i20 = -1;
                                            }
                                            i10 = i10;
                                            fVarArr3 = fVarArr2;
                                            HashMap map14 = mapArr[i10];
                                            ByteOrder byteOrder14 = hVar2.f3356h;
                                            byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr3[10] * length2]);
                                            byteBufferWrap2.order(byteOrder14);
                                            i22 = 0;
                                            while (i22 < length2) {
                                                a1.f fVar6 = fVarArr3[i22];
                                                byteBufferWrap2.putInt((int) fVar6.f3334a);
                                                byteBufferWrap2.putInt((int) fVar6.f3335b);
                                                i22++;
                                                length2 = length2;
                                            }
                                            map14.put(str4, new a1.d(byteBufferWrap2.array(), 10, length2));
                                            str = str;
                                            break;
                                        case 12:
                                            strArrSplit6 = strC.split(",", -1);
                                            length3 = strArrSplit6.length;
                                            dArr = new double[length3];
                                            while (i23 < strArrSplit6.length) {
                                                dArr[i23] = Double.parseDouble(strArrSplit6[i23]);
                                            }
                                            HashMap map15 = mapArr[i10];
                                            ByteOrder byteOrder15 = hVar2.f3356h;
                                            byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr3[c4] * length3]);
                                            byteBufferWrap3.order(byteOrder15);
                                            i24 = 0;
                                            while (i24 < length3) {
                                                double[] dArr6 = dArr;
                                                byteBufferWrap3.putDouble(dArr6[i24]);
                                                i24++;
                                                str5 = str5;
                                                dArr = dArr6;
                                            }
                                            str5 = str5;
                                            map15.put(str4, new a1.d(byteBufferWrap3.array(), c4, length3));
                                            break;
                                    }
                                } else if (i11 != -1 && (i11 == ((Integer) pairS.first).intValue() || i11 == ((Integer) pairS.second).intValue())) {
                                    switch (i11) {
                                        case 1:
                                            i10 = i10;
                                            str5 = str5;
                                            mapArr[i10].put(str4, a1.d.a(strC));
                                            break;
                                        case 2:
                                        case 7:
                                            i10 = i10;
                                            str5 = str5;
                                            mapArr[i10].put(str4, a1.d.b(strC));
                                            break;
                                        case 3:
                                            i10 = i10;
                                            str5 = str5;
                                            strArrSplit = strC.split(",", -1);
                                            iArr = new int[strArrSplit.length];
                                            while (i14 < strArrSplit.length) {
                                                iArr[i14] = Integer.parseInt(strArrSplit[i14]);
                                            }
                                            mapArr[i10].put(str4, a1.d.g(iArr, hVar2.f3356h));
                                            break;
                                        case 4:
                                            i10 = i10;
                                            str5 = str5;
                                            strArrSplit2 = strC.split(",", -1);
                                            jArr = new long[strArrSplit2.length];
                                            while (i15 < strArrSplit2.length) {
                                                jArr[i15] = Long.parseLong(strArrSplit2[i15]);
                                            }
                                            mapArr[i10].put(str4, a1.d.d(jArr, hVar2.f3356h));
                                            break;
                                        case 5:
                                            i10 = i10;
                                            str5 = str5;
                                            str2 = str;
                                            i16 = -1;
                                            strArrSplit3 = strC.split(",", -1);
                                            fVarArr = new a1.f[strArrSplit3.length];
                                            i17 = 0;
                                            while (i17 < strArrSplit3.length) {
                                                String[] strArrSplit17 = strArrSplit3[i17].split(str2, i16);
                                                int i217 = i17;
                                                fVarArr[i217] = new a1.f((long) Double.parseDouble(strArrSplit17[0]), (long) Double.parseDouble(strArrSplit17[1]));
                                                i17 = i217 + 1;
                                                str2 = str2;
                                                i16 = -1;
                                            }
                                            str = str2;
                                            mapArr[i10].put(str4, a1.d.e(fVarArr, hVar2.f3356h));
                                            break;
                                        case 6:
                                        case 8:
                                        case 11:
                                        default:
                                            if (z12) {
                                                Log.d(str5, "Data format isn't one of expected formats: " + i11);
                                            }
                                            break;
                                        case 9:
                                            i10 = i10;
                                            strArrSplit4 = strC.split(",", -1);
                                            length = strArrSplit4.length;
                                            iArr2 = new int[length];
                                            while (i18 < strArrSplit4.length) {
                                                iArr2[i18] = Integer.parseInt(strArrSplit4[i18]);
                                            }
                                            HashMap map16 = mapArr[i10];
                                            ByteOrder byteOrder16 = hVar2.f3356h;
                                            byteBufferWrap = ByteBuffer.wrap(new byte[iArr3[i13] * length]);
                                            byteBufferWrap.order(byteOrder16);
                                            while (i19 < length) {
                                                byteBufferWrap.putInt(iArr2[i19]);
                                            }
                                            map16.put(str4, new a1.d(byteBufferWrap.array(), i13, length));
                                            str = str;
                                            break;
                                        case 10:
                                            i20 = -1;
                                            strArrSplit5 = strC.split(",", -1);
                                            length2 = strArrSplit5.length;
                                            fVarArr2 = new a1.f[length2];
                                            i21 = 0;
                                            while (i21 < strArrSplit5.length) {
                                                String[] strArrSplit18 = strArrSplit5[i21].split(str, i20);
                                                int i218 = i21;
                                                a1.f[] fVarArr9 = fVarArr2;
                                                fVarArr9[i218] = new a1.f((long) Double.parseDouble(strArrSplit18[0]), (long) Double.parseDouble(strArrSplit18[1]));
                                                i21 = i218 + 1;
                                                strArrSplit5 = strArrSplit5;
                                                fVarArr2 = fVarArr9;
                                                i10 = i10;
                                                i20 = -1;
                                            }
                                            i10 = i10;
                                            fVarArr3 = fVarArr2;
                                            HashMap map17 = mapArr[i10];
                                            ByteOrder byteOrder17 = hVar2.f3356h;
                                            byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr3[10] * length2]);
                                            byteBufferWrap2.order(byteOrder17);
                                            i22 = 0;
                                            while (i22 < length2) {
                                                a1.f fVar7 = fVarArr3[i22];
                                                byteBufferWrap2.putInt((int) fVar7.f3334a);
                                                byteBufferWrap2.putInt((int) fVar7.f3335b);
                                                i22++;
                                                length2 = length2;
                                            }
                                            map17.put(str4, new a1.d(byteBufferWrap2.array(), 10, length2));
                                            str = str;
                                            break;
                                        case 12:
                                            strArrSplit6 = strC.split(",", -1);
                                            length3 = strArrSplit6.length;
                                            dArr = new double[length3];
                                            while (i23 < strArrSplit6.length) {
                                                dArr[i23] = Double.parseDouble(strArrSplit6[i23]);
                                            }
                                            HashMap map18 = mapArr[i10];
                                            ByteOrder byteOrder18 = hVar2.f3356h;
                                            byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr3[c4] * length3]);
                                            byteBufferWrap3.order(byteOrder18);
                                            i24 = 0;
                                            while (i24 < length3) {
                                                double[] dArr7 = dArr;
                                                byteBufferWrap3.putDouble(dArr7[i24]);
                                                i24++;
                                                str5 = str5;
                                                dArr = dArr7;
                                            }
                                            str5 = str5;
                                            map18.put(str4, new a1.d(byteBufferWrap3.array(), c4, length3));
                                            break;
                                    }
                                } else if (i12 == 1 || i12 == 7 || i12 == 2) {
                                    i11 = i12;
                                    switch (i11) {
                                        case 1:
                                            i10 = i10;
                                            str5 = str5;
                                            mapArr[i10].put(str4, a1.d.a(strC));
                                            break;
                                        case 2:
                                        case 7:
                                            i10 = i10;
                                            str5 = str5;
                                            mapArr[i10].put(str4, a1.d.b(strC));
                                            break;
                                        case 3:
                                            i10 = i10;
                                            str5 = str5;
                                            strArrSplit = strC.split(",", -1);
                                            iArr = new int[strArrSplit.length];
                                            while (i14 < strArrSplit.length) {
                                                iArr[i14] = Integer.parseInt(strArrSplit[i14]);
                                            }
                                            mapArr[i10].put(str4, a1.d.g(iArr, hVar2.f3356h));
                                            break;
                                        case 4:
                                            i10 = i10;
                                            str5 = str5;
                                            strArrSplit2 = strC.split(",", -1);
                                            jArr = new long[strArrSplit2.length];
                                            while (i15 < strArrSplit2.length) {
                                                jArr[i15] = Long.parseLong(strArrSplit2[i15]);
                                            }
                                            mapArr[i10].put(str4, a1.d.d(jArr, hVar2.f3356h));
                                            break;
                                        case 5:
                                            i10 = i10;
                                            str5 = str5;
                                            str2 = str;
                                            i16 = -1;
                                            strArrSplit3 = strC.split(",", -1);
                                            fVarArr = new a1.f[strArrSplit3.length];
                                            i17 = 0;
                                            while (i17 < strArrSplit3.length) {
                                                String[] strArrSplit19 = strArrSplit3[i17].split(str2, i16);
                                                int i219 = i17;
                                                fVarArr[i219] = new a1.f((long) Double.parseDouble(strArrSplit19[0]), (long) Double.parseDouble(strArrSplit19[1]));
                                                i17 = i219 + 1;
                                                str2 = str2;
                                                i16 = -1;
                                            }
                                            str = str2;
                                            mapArr[i10].put(str4, a1.d.e(fVarArr, hVar2.f3356h));
                                            break;
                                        case 6:
                                        case 8:
                                        case 11:
                                        default:
                                            if (z12) {
                                                Log.d(str5, "Data format isn't one of expected formats: " + i11);
                                            }
                                            break;
                                        case 9:
                                            i10 = i10;
                                            strArrSplit4 = strC.split(",", -1);
                                            length = strArrSplit4.length;
                                            iArr2 = new int[length];
                                            while (i18 < strArrSplit4.length) {
                                                iArr2[i18] = Integer.parseInt(strArrSplit4[i18]);
                                            }
                                            HashMap map19 = mapArr[i10];
                                            ByteOrder byteOrder19 = hVar2.f3356h;
                                            byteBufferWrap = ByteBuffer.wrap(new byte[iArr3[i13] * length]);
                                            byteBufferWrap.order(byteOrder19);
                                            while (i19 < length) {
                                                byteBufferWrap.putInt(iArr2[i19]);
                                            }
                                            map19.put(str4, new a1.d(byteBufferWrap.array(), i13, length));
                                            str = str;
                                            break;
                                        case 10:
                                            i20 = -1;
                                            strArrSplit5 = strC.split(",", -1);
                                            length2 = strArrSplit5.length;
                                            fVarArr2 = new a1.f[length2];
                                            i21 = 0;
                                            while (i21 < strArrSplit5.length) {
                                                String[] strArrSplit110 = strArrSplit5[i21].split(str, i20);
                                                int i2110 = i21;
                                                a1.f[] fVarArr10 = fVarArr2;
                                                fVarArr10[i2110] = new a1.f((long) Double.parseDouble(strArrSplit110[0]), (long) Double.parseDouble(strArrSplit110[1]));
                                                i21 = i2110 + 1;
                                                strArrSplit5 = strArrSplit5;
                                                fVarArr2 = fVarArr10;
                                                i10 = i10;
                                                i20 = -1;
                                            }
                                            i10 = i10;
                                            fVarArr3 = fVarArr2;
                                            HashMap map110 = mapArr[i10];
                                            ByteOrder byteOrder110 = hVar2.f3356h;
                                            byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr3[10] * length2]);
                                            byteBufferWrap2.order(byteOrder110);
                                            i22 = 0;
                                            while (i22 < length2) {
                                                a1.f fVar8 = fVarArr3[i22];
                                                byteBufferWrap2.putInt((int) fVar8.f3334a);
                                                byteBufferWrap2.putInt((int) fVar8.f3335b);
                                                i22++;
                                                length2 = length2;
                                            }
                                            map110.put(str4, new a1.d(byteBufferWrap2.array(), 10, length2));
                                            str = str;
                                            break;
                                        case 12:
                                            strArrSplit6 = strC.split(",", -1);
                                            length3 = strArrSplit6.length;
                                            dArr = new double[length3];
                                            while (i23 < strArrSplit6.length) {
                                                dArr[i23] = Double.parseDouble(strArrSplit6[i23]);
                                            }
                                            HashMap map111 = mapArr[i10];
                                            ByteOrder byteOrder111 = hVar2.f3356h;
                                            byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr3[c4] * length3]);
                                            byteBufferWrap3.order(byteOrder111);
                                            i24 = 0;
                                            while (i24 < length3) {
                                                double[] dArr8 = dArr;
                                                byteBufferWrap3.putDouble(dArr8[i24]);
                                                i24++;
                                                str5 = str5;
                                                dArr = dArr8;
                                            }
                                            str5 = str5;
                                            map111.put(str4, new a1.d(byteBufferWrap3.array(), c4, length3));
                                            break;
                                    }
                                } else if (z12) {
                                    StringBuilder sbK = d5.u.k("Given tag (", str4, ") value didn't match with one of expected formats: ");
                                    String[] strArr = a1.h.T;
                                    sbK.append(strArr[i12]);
                                    sbK.append(i11 == -1 ? "" : ", " + strArr[i11]);
                                    sbK.append(" (guess: ");
                                    sbK.append(strArr[((Integer) pairS.first).intValue()]);
                                    sbK.append(((Integer) pairS.second).intValue() != -1 ? ", " + strArr[((Integer) pairS.second).intValue()] : "");
                                    sbK.append(")");
                                    Log.d(str5, sbK.toString());
                                } else {
                                    i10 = i10;
                                    str5 = str5;
                                }
                            } else {
                                mapArr[i10].remove(str4);
                            }
                            str5 = str5;
                        } else {
                            str5 = str5;
                        }
                        i10++;
                        str5 = str5;
                        c4 = '\f';
                        i25 = 9;
                    }
                }
            }
        }
        int i30 = hVar2.f3352d;
        if (i30 != 4 && i30 != 13 && i30 != 14) {
            throw new IOException("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
        }
        if (hVar2.f3350b == null && hVar2.f3349a == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        if (hVar2.f3357i && hVar2.f3358j && !hVar2.f3359k) {
            throw new IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
        }
        int i31 = hVar2.f3362o;
        hVar2.f3361n = (i31 == 6 || i31 == 7) ? hVar2.q() : null;
        try {
            File fileCreateTempFile = File.createTempFile(Z3.D, "tmp");
            if (hVar2.f3349a != null) {
                try {
                    fileInputStream2 = new FileInputStream(hVar2.f3349a);
                } catch (Exception e10) {
                    e = e10;
                    fileOutputStream = null;
                    fileInputStream = null;
                    try {
                        throw new IOException("Failed to copy original file to temp file", e);
                    } catch (Throwable th2) {
                        th = th2;
                        android.support.v4.media.session.a.e(fileInputStream);
                        android.support.v4.media.session.a.e(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                    fileInputStream = null;
                    android.support.v4.media.session.a.e(fileInputStream);
                    android.support.v4.media.session.a.e(fileOutputStream);
                    throw th;
                }
            } else {
                Os.lseek(hVar2.f3350b, 0L, OsConstants.SEEK_SET);
                fileInputStream2 = new FileInputStream(hVar2.f3350b);
            }
            FileInputStream fileInputStream5 = fileInputStream2;
            try {
                FileOutputStream fileOutputStream5 = new FileOutputStream(fileCreateTempFile);
                try {
                    android.support.v4.media.session.a.i(fileInputStream5, fileOutputStream5);
                    android.support.v4.media.session.a.e(fileInputStream5);
                    android.support.v4.media.session.a.e(fileOutputStream5);
                    try {
                        try {
                            FileInputStream fileInputStream6 = new FileInputStream(fileCreateTempFile);
                            try {
                                if (hVar2.f3349a != null) {
                                    try {
                                        fileOutputStream4 = new FileOutputStream(hVar2.f3349a);
                                    } catch (Exception e11) {
                                        e = e11;
                                        fileInputStream3 = fileInputStream6;
                                        fileOutputStream2 = null;
                                        bufferedOutputStream = null;
                                        bufferedInputStream = null;
                                        try {
                                            fileInputStream4 = new FileInputStream(fileCreateTempFile);
                                            try {
                                                if (hVar2.f3349a != null) {
                                                    fileOutputStream3 = new FileOutputStream(hVar2.f3349a);
                                                } else {
                                                    Os.lseek(hVar2.f3350b, 0L, OsConstants.SEEK_SET);
                                                    fileOutputStream3 = new FileOutputStream(hVar2.f3350b);
                                                }
                                                fileOutputStream2 = fileOutputStream3;
                                                android.support.v4.media.session.a.i(fileInputStream4, fileOutputStream2);
                                                try {
                                                    android.support.v4.media.session.a.e(fileInputStream4);
                                                    android.support.v4.media.session.a.e(fileOutputStream2);
                                                    throw new IOException("Failed to save new file", e);
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    z10 = false;
                                                    bufferedInputStream2 = bufferedInputStream;
                                                    android.support.v4.media.session.a.e(bufferedInputStream2);
                                                    android.support.v4.media.session.a.e(bufferedOutputStream);
                                                    if (!z10) {
                                                        fileCreateTempFile.delete();
                                                    }
                                                    throw th;
                                                }
                                            } catch (Exception e12) {
                                                e = e12;
                                                fileInputStream3 = fileInputStream4;
                                                try {
                                                    throw new IOException("Failed to save new file. Original file is stored in " + fileCreateTempFile.getAbsolutePath(), e);
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    z11 = true;
                                                    try {
                                                        android.support.v4.media.session.a.e(fileInputStream3);
                                                        android.support.v4.media.session.a.e(fileOutputStream2);
                                                        throw th;
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        z10 = z11;
                                                        bufferedInputStream2 = bufferedInputStream;
                                                        android.support.v4.media.session.a.e(bufferedInputStream2);
                                                        android.support.v4.media.session.a.e(bufferedOutputStream);
                                                        if (!z10) {
                                                            fileCreateTempFile.delete();
                                                        }
                                                        throw th;
                                                    }
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                fileInputStream3 = fileInputStream4;
                                                z11 = false;
                                                android.support.v4.media.session.a.e(fileInputStream3);
                                                android.support.v4.media.session.a.e(fileOutputStream2);
                                                throw th;
                                            }
                                        } catch (Exception e13) {
                                            e = e13;
                                        } catch (Throwable th8) {
                                            th = th8;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        z10 = false;
                                        bufferedOutputStream = null;
                                        bufferedInputStream2 = null;
                                        android.support.v4.media.session.a.e(bufferedInputStream2);
                                        android.support.v4.media.session.a.e(bufferedOutputStream);
                                        if (!z10) {
                                            fileCreateTempFile.delete();
                                        }
                                        throw th;
                                    }
                                } else {
                                    Os.lseek(hVar2.f3350b, 0L, OsConstants.SEEK_SET);
                                    fileOutputStream4 = new FileOutputStream(hVar2.f3350b);
                                }
                                FileOutputStream fileOutputStream6 = fileOutputStream4;
                                try {
                                    bufferedInputStream2 = new BufferedInputStream(fileInputStream6);
                                    try {
                                        bufferedOutputStream = new BufferedOutputStream(fileOutputStream6);
                                        try {
                                            int i32 = hVar2.f3352d;
                                            if (i32 == 4) {
                                                hVar2.D(bufferedInputStream2, bufferedOutputStream);
                                            } else if (i32 == 13) {
                                                hVar2.E(bufferedInputStream2, bufferedOutputStream);
                                            } else if (i32 == 14) {
                                                hVar2.F(bufferedInputStream2, bufferedOutputStream);
                                            }
                                            android.support.v4.media.session.a.e(bufferedInputStream2);
                                            android.support.v4.media.session.a.e(bufferedOutputStream);
                                            fileCreateTempFile.delete();
                                            hVar2.f3361n = null;
                                        } catch (Exception e14) {
                                            e = e14;
                                            fileOutputStream2 = fileOutputStream6;
                                            bufferedInputStream = bufferedInputStream2;
                                            fileInputStream3 = fileInputStream6;
                                            fileInputStream4 = new FileInputStream(fileCreateTempFile);
                                            if (hVar2.f3349a != null) {
                                                fileOutputStream3 = new FileOutputStream(hVar2.f3349a);
                                            } else {
                                                Os.lseek(hVar2.f3350b, 0L, OsConstants.SEEK_SET);
                                                fileOutputStream3 = new FileOutputStream(hVar2.f3350b);
                                            }
                                            fileOutputStream2 = fileOutputStream3;
                                            android.support.v4.media.session.a.i(fileInputStream4, fileOutputStream2);
                                            android.support.v4.media.session.a.e(fileInputStream4);
                                            android.support.v4.media.session.a.e(fileOutputStream2);
                                            throw new IOException("Failed to save new file", e);
                                        } catch (Throwable th10) {
                                            th = th10;
                                            bufferedOutputStream = bufferedOutputStream;
                                            z10 = false;
                                            android.support.v4.media.session.a.e(bufferedInputStream2);
                                            android.support.v4.media.session.a.e(bufferedOutputStream);
                                            if (!z10) {
                                                fileCreateTempFile.delete();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e15) {
                                        e = e15;
                                        bufferedOutputStream = null;
                                    } catch (Throwable th11) {
                                        th = th11;
                                        bufferedOutputStream = null;
                                    }
                                } catch (Exception e16) {
                                    e = e16;
                                    bufferedOutputStream = null;
                                    bufferedInputStream = null;
                                    fileInputStream3 = fileInputStream6;
                                    fileOutputStream2 = fileOutputStream6;
                                    fileInputStream4 = new FileInputStream(fileCreateTempFile);
                                    if (hVar2.f3349a != null) {
                                        fileOutputStream3 = new FileOutputStream(hVar2.f3349a);
                                    } else {
                                        Os.lseek(hVar2.f3350b, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream3 = new FileOutputStream(hVar2.f3350b);
                                    }
                                    fileOutputStream2 = fileOutputStream3;
                                    android.support.v4.media.session.a.i(fileInputStream4, fileOutputStream2);
                                    android.support.v4.media.session.a.e(fileInputStream4);
                                    android.support.v4.media.session.a.e(fileOutputStream2);
                                    throw new IOException("Failed to save new file", e);
                                }
                            } catch (Exception e17) {
                                e = e17;
                                fileOutputStream2 = null;
                                bufferedOutputStream = null;
                                bufferedInputStream = null;
                            }
                        } catch (Exception e18) {
                            e = e18;
                            fileOutputStream2 = null;
                            fileInputStream3 = null;
                            bufferedOutputStream = null;
                            bufferedInputStream = null;
                        }
                    } catch (Throwable th12) {
                        th = th12;
                        bufferedOutputStream = null;
                        bufferedInputStream2 = null;
                    }
                } catch (Exception e19) {
                    e = e19;
                    fileInputStream = fileInputStream5;
                    fileOutputStream = fileOutputStream5;
                    throw new IOException("Failed to copy original file to temp file", e);
                } catch (Throwable th13) {
                    th = th13;
                    fileInputStream = fileInputStream5;
                    fileOutputStream = fileOutputStream5;
                    android.support.v4.media.session.a.e(fileInputStream);
                    android.support.v4.media.session.a.e(fileOutputStream);
                    throw th;
                }
            } catch (Exception e20) {
                e = e20;
                fileOutputStream = null;
                fileInputStream = fileInputStream5;
            } catch (Throwable th14) {
                th = th14;
                fileOutputStream = null;
                fileInputStream = fileInputStream5;
            }
        } catch (Exception e21) {
            e = e21;
            fileOutputStream = null;
            fileInputStream = null;
        } catch (Throwable th15) {
            th = th15;
            fileOutputStream = null;
            fileInputStream = null;
        }
    }

    public static HttpURLConnection m(URL url) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        kotlin.jvm.internal.n.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        if (b0.l == null) {
            b0.l = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "18.3.0"}, 2));
        }
        httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, b0.l);
        httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
        httpURLConnection.setChunkedStreamingMode(0);
        return httpURLConnection;
    }

    public static ArrayList n(d0 requests) throws Throwable {
        Exception exc;
        HttpURLConnection httpURLConnectionH;
        ArrayList arrayListR;
        kotlin.jvm.internal.n.f(requests, "requests");
        q7.f.m(requests);
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnectionH = H(requests);
            exc = null;
        } catch (Exception e10) {
            exc = e10;
            httpURLConnectionH = null;
        } catch (Throwable th2) {
            th = th2;
            e0.j(httpURLConnection);
            throw th;
        }
        try {
            if (httpURLConnectionH != null) {
                arrayListR = r(httpURLConnectionH, requests);
            } else {
                ArrayList arrayListF = no.b.f(requests.f45106c, null, new l7.n(exc));
                E(requests, arrayListF);
                arrayListR = arrayListF;
            }
            e0.j(httpURLConnectionH);
            return arrayListR;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = httpURLConnectionH;
            e0.j(httpURLConnection);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0030 A[EXC_TOP_SPLITTER, PHI: r0 r3
  0x0030: PHI (r0v5 java.util.ArrayList) = (r0v3 java.util.ArrayList), (r0v4 java.util.ArrayList), (r0v11 java.util.ArrayList) binds: [B:23:0x0055, B:25:0x0063, B:16:0x002e] A[DONT_GENERATE, DONT_INLINE]
  0x0030: PHI (r3v1 java.io.InputStream) = (r3v0 java.io.InputStream), (r3v0 java.io.InputStream), (r3v11 java.io.InputStream) binds: [B:23:0x0055, B:25:0x0063, B:16:0x002e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static ArrayList r(HttpURLConnection httpURLConnection, d0 requests) {
        ArrayList arrayListF;
        kotlin.jvm.internal.n.f(requests, "requests");
        g0 g0Var = g0.f45133a;
        InputStream errorStream = null;
        try {
            try {
                if (!l7.s.h()) {
                    Log.e("l7.e0", "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                    throw new l7.n("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                }
                errorStream = httpURLConnection.getResponseCode() >= 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
                arrayListF = no.b.k(errorStream, httpURLConnection, requests);
                if (errorStream != null) {
                    try {
                        errorStream.close();
                    } catch (IOException unused) {
                    }
                }
                httpURLConnection.disconnect();
                int size = requests.f45106c.size();
                if (size != arrayListF.size()) {
                    throw new l7.n(String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(arrayListF.size()), Integer.valueOf(size)}, 2)));
                }
                E(requests, arrayListF);
                l7.f fVarT = l7.f.f45113f.t();
                l7.a aVar = fVarT.f45117c;
                if (aVar != null) {
                    long time = new Date().getTime();
                    if (aVar.f45076f.f45132a && time - fVarT.f45119e.getTime() > 3600000 && time - aVar.f45077g.getTime() > 86400000) {
                        if (kotlin.jvm.internal.n.a(Looper.getMainLooper(), Looper.myLooper())) {
                            fVarT.a();
                        } else {
                            new Handler(Looper.getMainLooper()).post(new com.mbridge.msdk.config.component.info.provider.subprovider.f(fVarT, 23));
                        }
                    }
                }
                return arrayListF;
            } catch (l7.n e10) {
                q7.x.f48792c.t(g0Var, "Response", "Response <Error>: %s", e10);
                arrayListF = no.b.f(requests, httpURLConnection, e10);
                if (0 != 0) {
                    errorStream.close();
                }
            } catch (Exception e11) {
                q7.x.f48792c.t(g0Var, "Response", "Response <Error>: %s", e11);
                arrayListF = no.b.f(requests, httpURLConnection, new l7.n(e11));
                if (0 != 0) {
                    errorStream.close();
                }
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    errorStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th2;
        }
    }

    public static JSONObject w(Context context, String str) throws JSONException, IOException {
        int iIntValue;
        kotlin.jvm.internal.n.f(context, "context");
        File file = new File(str);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(context, Uri.fromFile(file));
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(7);
        if (strExtractMetadata2 == null) {
            strExtractMetadata2 = "";
        }
        String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(3);
        String str2 = strExtractMetadata3 != null ? strExtractMetadata3 : "";
        String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(18);
        String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(19);
        long j10 = Long.parseLong(strExtractMetadata);
        long j11 = Long.parseLong(strExtractMetadata4);
        long j12 = Long.parseLong(strExtractMetadata5);
        long length = file.length();
        String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(24);
        Integer numE0 = strExtractMetadata6 != null ? an.o.e0(strExtractMetadata6) : null;
        if (numE0 != null && (iIntValue = numE0.intValue()) != 90 && iIntValue != 270) {
            j11 = j12;
            j12 = j11;
        }
        mediaMetadataRetriever.release();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("path", str);
        jSONObject.put("title", strExtractMetadata2);
        jSONObject.put("author", str2);
        jSONObject.put("width", j11);
        jSONObject.put("height", j12);
        jSONObject.put(IronSourceConstants.EVENTS_DURATION, j10);
        jSONObject.put("filesize", length);
        if (numE0 != null) {
            jSONObject.put("orientation", numE0.intValue());
        }
        return jSONObject;
    }

    public static boolean x(Object obj) {
        return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof y);
    }

    public static boolean y(Object obj) {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    public static b0 z(l7.a aVar, String str, w wVar) {
        return new b0(aVar, str, null, null, wVar);
    }

    @Override // k6.s
    public k6.r M(k6.x xVar) {
        return new k6.z(xVar.b(k6.h.class, InputStream.class), 1);
    }

    @Override // k3.k
    public boolean a(i1.p pVar) {
        String str = pVar.f42643n;
        return Objects.equals(str, MimeTypes.TEXT_SSA) || Objects.equals(str, MimeTypes.TEXT_VTT) || Objects.equals(str, MimeTypes.APPLICATION_MP4VTT) || Objects.equals(str, MimeTypes.APPLICATION_SUBRIP) || Objects.equals(str, MimeTypes.APPLICATION_TX3G) || Objects.equals(str, MimeTypes.APPLICATION_PGS) || Objects.equals(str, MimeTypes.APPLICATION_VOBSUB) || Objects.equals(str, MimeTypes.APPLICATION_DVBSUBS) || Objects.equals(str, MimeTypes.APPLICATION_TTML);
    }

    @Override // kb.j
    public Object c(String str, Provider provider) {
        switch (this.f43677a) {
            case 5:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            case 6:
                return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
            case 7:
                return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
            default:
                return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    @Override // lg.a
    public void e(ShortBuffer shortBuffer, ShortBuffer shortBuffer2, int i10) {
        if (shortBuffer.remaining() < shortBuffer2.remaining()) {
            lg.a.f45331r9.e(shortBuffer, shortBuffer2, i10);
            return;
        }
        if (shortBuffer.remaining() <= shortBuffer2.remaining()) {
            if (shortBuffer.remaining() > shortBuffer2.remaining()) {
                throw new IllegalArgumentException("Illegal use of PassThroughAudioStretcher");
            }
            shortBuffer2.put(shortBuffer);
        } else {
            if (shortBuffer.remaining() < shortBuffer2.remaining()) {
                throw new IllegalArgumentException("Illegal use of CutAudioStretcher");
            }
            int iRemaining = shortBuffer.remaining() - shortBuffer2.remaining();
            shortBuffer.limit(shortBuffer.limit() - iRemaining);
            shortBuffer2.put(shortBuffer);
            shortBuffer.limit(shortBuffer.limit() + iRemaining);
            shortBuffer.position(shortBuffer.limit());
        }
    }

    @Override // l7.e
    public String f() {
        return "ig_refresh_token";
    }

    @Override // k3.k
    public k3.m g(i1.p pVar) {
        String str = pVar.f42643n;
        List list = pVar.f42646q;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new m3.f(list);
                case "application/pgs":
                    return new k5.g(11);
                case "application/x-mp4-vtt":
                    return new rb.c(7);
                case "text/vtt":
                    return new m5.k(18);
                case "application/x-quicktime-tx3g":
                    return new p8(list, 1);
                case "text/x-ssa":
                    return new o3.a(list);
                case "application/vobsub":
                    return new zc.u(list);
                case "application/x-subrip":
                    return new p3.a();
                case "application/ttml+xml":
                    return new q3.d();
            }
        }
        throw new IllegalArgumentException(defpackage.e.n("Unsupported MIME type: ", str));
    }

    @Override // k3.k
    public int h(i1.p pVar) {
        String str = pVar.f42643n;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException(defpackage.e.n("Unsupported MIME type: ", str));
    }

    @Override // he.d
    public ke.b i(String str, int i10, EnumMap enumMap) {
        int i11;
        int i12;
        ke.b bVar;
        int i13;
        int i14;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i10 != 6) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(d5.u.A(i10)));
        }
        ne.g gVar = (ne.g) enumMap.get(he.a.f42326c);
        ne.g gVar2 = ne.g.f46728a;
        if (gVar == null) {
            gVar = gVar2;
        }
        if (enumMap.get(he.a.f42327d) != null) {
            throw new ClassCastException();
        }
        if (enumMap.get(he.a.f42328e) != null) {
            throw new ClassCastException();
        }
        int i15 = 29;
        int i16 = 0;
        int i17 = 1;
        int i18 = 2;
        ne.d[] dVarArr = {new n(i15), new ne.a(i16), new ne.h(i16), new ne.h(i17), new ne.c(i16), new jj.d(i15)};
        b0.n nVar = new b0.n();
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb2 = new StringBuilder(bytes.length);
        int length = bytes.length;
        int i19 = 0;
        while (i19 < length) {
            char c4 = (char) (bytes[i19] & 255);
            int i20 = i16;
            if (c4 == '?' && str.charAt(i19) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb2.append(c4);
            i19++;
            i16 = i20;
        }
        int i21 = i16;
        nVar.f5153a = sb2.toString();
        nVar.f5157e = gVar2;
        nVar.f5158f = new StringBuilder(str.length());
        nVar.f5155c = -1;
        StringBuilder sb3 = (StringBuilder) nVar.f5158f;
        nVar.f5157e = gVar;
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            nVar.e((char) 236);
            nVar.f5156d = 2;
            nVar.f5154b += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            nVar.e((char) 237);
            nVar.f5156d = 2;
            nVar.f5154b += 7;
        }
        int i22 = i21;
        while (nVar.b()) {
            dVarArr[i22].o(nVar);
            int i23 = nVar.f5155c;
            if (i23 >= 0) {
                nVar.f5155c = -1;
                i22 = i23;
            }
        }
        int length2 = sb3.length();
        nVar.d(sb3.length());
        int i24 = ((ne.f) nVar.f5159g).f46721b;
        if (length2 < i24 && i22 != 0 && i22 != 5 && i22 != 4) {
            nVar.e((char) 254);
        }
        if (sb3.length() < i24) {
            sb3.append((char) 129);
        }
        while (sb3.length() < i24) {
            int length3 = ((sb3.length() + 1) * 149) % 253;
            int i25 = length3 + TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
            if (i25 > 254) {
                i25 = length3 - 124;
            }
            sb3.append((char) i25);
        }
        String string = sb3.toString();
        ne.f fVarE = ne.f.e(string.length(), gVar);
        int i26 = fVarE.f46724e;
        int i27 = fVarE.f46723d;
        int[] iArr = ne.e.f46715a;
        int length4 = string.length();
        int i28 = fVarE.f46721b;
        int i29 = fVarE.f46722c;
        if (length4 != i28) {
            throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
        }
        StringBuilder sb4 = new StringBuilder(i28 + i29);
        sb4.append(string);
        int iC = fVarE.c();
        if (iC == 1) {
            sb4.append(ne.e.a(i29, string));
        } else {
            sb4.setLength(sb4.capacity());
            int[] iArr2 = new int[iC];
            int[] iArr3 = new int[iC];
            int[] iArr4 = new int[iC];
            int i30 = i21;
            while (i30 < iC) {
                int i31 = i30 + 1;
                iArr2[i30] = fVarE.a(i31);
                iArr3[i30] = fVarE.f46727h;
                iArr4[i30] = i21;
                if (i30 > 0) {
                    iArr4[i30] = iArr4[i30 - 1] + iArr2[i30];
                }
                i30 = i31;
            }
            for (int i32 = i21; i32 < iC; i32++) {
                StringBuilder sb5 = new StringBuilder(iArr2[i32]);
                for (int i33 = i32; i33 < i28; i33 += iC) {
                    sb5.append(string.charAt(i33));
                }
                String strA = ne.e.a(iArr3[i32], sb5.toString());
                int i34 = i21;
                int i35 = i32;
                while (i35 < iArr3[i32] * iC) {
                    sb4.setCharAt(i28 + i35, strA.charAt(i34));
                    i35 += iC;
                    i34++;
                }
            }
        }
        String string2 = sb4.toString();
        int iB = fVarE.b() * i27;
        int iD = fVarE.d() * i26;
        k3 k3Var = new k3(string2, iB, iD);
        int i36 = k3Var.f16294b;
        byte[] bArr = (byte[]) k3Var.f16296d;
        int i37 = i21;
        int i38 = i37;
        int i39 = 4;
        while (true) {
            if (i39 == iD && i38 == 0) {
                int i40 = iD - 1;
                int i41 = i21;
                k3Var.k(i40, i41, i37, i17);
                k3Var.k(i40, i17, i37, i18);
                k3Var.k(i40, i18, i37, 3);
                k3Var.k(i41, iB - 2, i37, 4);
                int i42 = iB - 1;
                k3Var.k(i41, i42, i37, 5);
                k3Var.k(1, i42, i37, 6);
                k3Var.k(i18, i42, i37, 7);
                k3Var.k(3, i42, i37, 8);
                i37++;
            }
            i11 = iD - 2;
            if (i39 == i11 && i38 == 0 && iB % 4 != 0) {
                k3Var.k(iD - 3, 0, i37, 1);
                k3Var.k(i11, 0, i37, i18);
                k3Var.k(iD - 1, 0, i37, 3);
                k3Var.k(0, iB - 4, i37, 4);
                k3Var.k(0, iB - 3, i37, 5);
                k3Var.k(0, iB - 2, i37, 6);
                int i43 = iB - 1;
                k3Var.k(0, i43, i37, 7);
                k3Var.k(1, i43, i37, 8);
                i37++;
            }
            if (i39 == i11 && i38 == 0 && iB % 8 == 4) {
                k3Var.k(iD - 3, 0, i37, 1);
                k3Var.k(i11, 0, i37, i18);
                k3Var.k(iD - 1, 0, i37, 3);
                k3Var.k(0, iB - 2, i37, 4);
                int i44 = iB - 1;
                k3Var.k(0, i44, i37, 5);
                k3Var.k(1, i44, i37, 6);
                i12 = 2;
                k3Var.k(2, i44, i37, 7);
                k3Var.k(3, i44, i37, 8);
                i37++;
            } else {
                i12 = i18;
            }
            if (i39 == iD + 4 && i38 == i12 && iB % 8 == 0) {
                int i45 = iD - 1;
                k3Var.k(i45, 0, i37, 1);
                int i46 = iB - 1;
                k3Var.k(i45, i46, i37, i12);
                int i47 = iB - 3;
                k3Var.k(0, i47, i37, 3);
                int i48 = iB - 2;
                k3Var.k(0, i48, i37, 4);
                k3Var.k(0, i46, i37, 5);
                k3Var.k(1, i47, i37, 6);
                k3Var.k(1, i48, i37, 7);
                k3Var.k(1, i46, i37, 8);
                i37++;
            }
            while (true) {
                if (i39 < iD && i38 >= 0 && bArr[(i39 * i36) + i38] < 0) {
                    k3Var.o(i39, i38, i37);
                    i37++;
                }
                int i49 = i39 - 2;
                int i50 = i38 + 2;
                if (i49 < 0 || i50 >= iB) {
                    break;
                }
                i39 = i49;
                i38 = i50;
            }
            int i51 = i39 - 1;
            int i52 = i38 + 5;
            while (true) {
                if (i51 >= 0 && i52 < iB && bArr[(i51 * i36) + i52] < 0) {
                    k3Var.o(i51, i52, i37);
                    i37++;
                }
                int i53 = i51 + 2;
                int i54 = i52 - 2;
                if (i53 >= iD || i54 < 0) {
                    break;
                }
                i51 = i53;
                i52 = i54;
            }
            i39 = i51 + 5;
            i38 = i52 - 1;
            if (i39 >= iD && i38 >= iB) {
                break;
            }
            i17 = 1;
            i21 = 0;
            i36 = i36;
            i18 = 2;
        }
        int i55 = iB - 1;
        int i56 = iD - 1;
        if (bArr[(i56 * i36) + i55] < 0) {
            int i57 = (i56 * i36) + i55;
            byte b10 = (byte) 1;
            bArr[i57] = b10;
            bArr[(i11 * i36) + (iB - 2)] = b10;
        }
        int iB2 = fVarE.b() * i27;
        int iD2 = fVarE.d() * i26;
        boolean z10 = true;
        a7.b bVar2 = new a7.b((fVarE.b() * i27) + (fVarE.b() << 1), (fVarE.d() * i26) + (fVarE.d() << 1), 5);
        int i58 = 0;
        int i59 = 0;
        while (i59 < iD2) {
            int i60 = i59 % i26;
            if (i60 == 0) {
                int i61 = 0;
                int i62 = 0;
                while (i61 < (fVarE.b() * i27) + (fVarE.b() << 1)) {
                    bVar2.d(i62, i58, i61 % 2 == 0 ? z10 : false);
                    i62++;
                    i61++;
                    z10 = true;
                }
                i58++;
            }
            int i63 = 0;
            for (int i64 = 0; i64 < iB2; i64++) {
                int i65 = i64 % i27;
                if (i65 == 0) {
                    bVar2.d(i63, i58, true);
                    i63++;
                }
                bVar2.d(i63, i58, bArr[(i59 * i36) + i64] == 1);
                int i66 = i63 + 1;
                if (i65 == i27 - 1) {
                    bVar2.d(i66, i58, i59 % 2 == 0);
                    i63 += 2;
                } else {
                    i63 = i66;
                }
            }
            int i67 = i58 + 1;
            if (i60 == i26 - 1) {
                int i68 = 0;
                for (int i69 = 0; i69 < (fVarE.b() * i27) + (fVarE.b() << 1); i69++) {
                    bVar2.d(i68, i67, true);
                    i68++;
                }
                i58 += 2;
            } else {
                i58 = i67;
            }
            i59++;
            z10 = true;
        }
        int i70 = bVar2.f3415b;
        int i71 = bVar2.f3416c;
        int iMax = Math.max(200, i70);
        int iMax2 = Math.max(200, i71);
        int iMin = Math.min(iMax / i70, iMax2 / i71);
        int i72 = (iMax - (i70 * iMin)) / 2;
        int i73 = (iMax2 - (i71 * iMin)) / 2;
        if (200 < i71 || 200 < i70) {
            bVar = new ke.b(i70, i71);
            i13 = 0;
            i14 = 0;
        } else {
            bVar = new ke.b(200, 200);
            i13 = i72;
            i14 = i73;
        }
        int[] iArr5 = bVar.f44617d;
        int length5 = iArr5.length;
        for (int i74 = 0; i74 < length5; i74++) {
            iArr5[i74] = 0;
        }
        int i75 = i14;
        int i76 = 0;
        while (i76 < i71) {
            int i77 = i13;
            int i78 = 0;
            while (i78 < i70) {
                if (bVar2.b(i78, i76) == 1) {
                    bVar.c(i77, i75, iMin, iMin);
                }
                i78++;
                i77 += iMin;
            }
            i76++;
            i75 += iMin;
        }
        return bVar;
    }

    @Override // n6.c0
    public void k(MediaExtractor mediaExtractor, Object obj) throws IOException {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // ne.d
    public void o(b0.n nVar) {
        int i10;
        String str = nVar.f5153a;
        int i11 = nVar.f5154b;
        int length = str.length();
        if (i11 < length) {
            char cCharAt = str.charAt(i11);
            i10 = 0;
            while (r9.b.o(cCharAt) && i11 < length) {
                i10++;
                i11++;
                if (i11 < length) {
                    cCharAt = str.charAt(i11);
                }
            }
        } else {
            i10 = 0;
        }
        if (i10 >= 2) {
            char cCharAt2 = str.charAt(nVar.f5154b);
            char cCharAt3 = str.charAt(nVar.f5154b + 1);
            if (r9.b.o(cCharAt2) && r9.b.o(cCharAt3)) {
                nVar.e((char) ((cCharAt3 - '0') + ((cCharAt2 - '0') * 10) + TsExtractor.TS_STREAM_TYPE_HDMV_DTS));
                nVar.f5154b += 2;
                return;
            } else {
                throw new IllegalArgumentException("not digits: " + cCharAt2 + cCharAt3);
            }
        }
        char cA = nVar.a();
        int iV = r9.b.v(str, nVar.f5154b, 0);
        if (iV == 0) {
            if (!r9.b.q(cA)) {
                nVar.e((char) (cA + 1));
                nVar.f5154b++;
                return;
            } else {
                nVar.e((char) 235);
                nVar.e((char) (cA - 127));
                nVar.f5154b++;
                return;
            }
        }
        if (iV == 1) {
            nVar.e((char) 230);
            nVar.f5155c = 1;
            return;
        }
        if (iV == 2) {
            nVar.e((char) 239);
            nVar.f5155c = 2;
            return;
        }
        if (iV == 3) {
            nVar.e((char) 238);
            nVar.f5155c = 3;
        } else if (iV == 4) {
            nVar.e((char) 240);
            nVar.f5155c = 4;
        } else {
            if (iV != 5) {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(iV)));
            }
            nVar.e((char) 231);
            nVar.f5155c = 5;
        }
    }

    @Override // l7.e
    public String p() {
        return "refresh_access_token";
    }

    @Override // n6.c0
    public void q(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    public Bitmap s(String str, long j10, wi.j jVar) throws IOException {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        Bitmap bitmapCreateScaledBitmap = null;
        try {
            try {
                mediaMetadataRetriever.setDataSource(str);
                Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(j10, 2);
                try {
                    mediaMetadataRetriever.release();
                } catch (RuntimeException unused) {
                    jVar.b("video_compress", "Ignore failures while cleaning up", null);
                }
                bitmapCreateScaledBitmap = frameAtTime;
            } catch (IllegalArgumentException unused2) {
                jVar.b("video_compress", "Assume this is a corrupt video file", null);
                try {
                    mediaMetadataRetriever.release();
                } catch (RuntimeException unused3) {
                    jVar.b("video_compress", "Ignore failures while cleaning up", null);
                }
            } catch (RuntimeException unused4) {
                jVar.b("video_compress", "Assume this is a corrupt video file", null);
                mediaMetadataRetriever.release();
            }
            if (bitmapCreateScaledBitmap == null) {
                jVar.a(new Integer[0]);
            }
            kotlin.jvm.internal.n.c(bitmapCreateScaledBitmap);
            int width = bitmapCreateScaledBitmap.getWidth();
            int height = bitmapCreateScaledBitmap.getHeight();
            int iMax = Math.max(width, height);
            if (iMax > 512) {
                float f10 = 512.0f / iMax;
                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, Math.round(width * f10), Math.round(f10 * height), true);
            }
            kotlin.jvm.internal.n.c(bitmapCreateScaledBitmap);
            return bitmapCreateScaledBitmap;
        } catch (Throwable th2) {
            try {
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused5) {
                jVar.b("video_compress", "Ignore failures while cleaning up", null);
            }
            throw th2;
        }
    }

    public l7.f t() {
        l7.f fVar;
        l7.f fVar2 = l7.f.f45114g;
        if (fVar2 != null) {
            return fVar2;
        }
        synchronized (this) {
            fVar = l7.f.f45114g;
            if (fVar == null) {
                LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(l7.s.b());
                kotlin.jvm.internal.n.e(localBroadcastManager, "getInstance(applicationContext)");
                l7.f fVar3 = new l7.f(localBroadcastManager, new s4.i(22));
                l7.f.f45114g = fVar3;
                fVar = fVar3;
            }
        }
        return fVar;
    }

    @Override // n2.m
    public n2.a0 track(int i10, int i11) {
        return new n2.j();
    }

    public synchronized j0 v() {
        j0 j0Var;
        try {
            if (j0.f45175e == null) {
                LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(l7.s.b());
                kotlin.jvm.internal.n.e(localBroadcastManager, "getInstance(applicationContext)");
                j0.f45175e = new j0(localBroadcastManager, new i0());
            }
            j0Var = j0.f45175e;
            if (j0Var == null) {
                kotlin.jvm.internal.n.l(C0526q2.f30050p);
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return j0Var;
    }

    public n(Context context) {
        this.f43677a = 11;
    }

    @Override // n2.m
    public void endTracks() {
    }

    @Override // j2.o
    public void maybeThrowError() {
    }

    @Override // n2.d
    public long b(long j10) {
        return j10;
    }

    @Override // n2.m
    public void u(t tVar) {
    }

    @Override // m0.a0
    public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
    }

    @Override // m0.a0
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
    }
}
