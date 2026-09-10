package com.google.android.gms.internal.ads;

import android.content.Context;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zze;
import com.ironsource.B5;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ws {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f21594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f21596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f21597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f21598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f21599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f21600h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f21601i;

    public ws(Context context, VersionInfoParcel versionInfoParcel, String str, kw0 kw0Var) {
        this.f21593a = 0;
        this.f21596d = new Object();
        this.f21595c = 1;
        this.f21594b = str;
        this.f21597e = context.getApplicationContext();
        this.f21598f = versionInfoParcel;
        this.f21599g = kw0Var;
        this.f21600h = dt.f13670b;
    }

    public xn.m a() {
        ArrayList arrayList;
        String str = this.f21594b;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strE = xn.b.e((String) this.f21596d, 0, 0, 7);
        String strE2 = xn.b.e((String) this.f21597e, 0, 0, 7);
        String str2 = (String) this.f21598f;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iB = b();
        ArrayList arrayList2 = (ArrayList) this.f21599g;
        ArrayList arrayList3 = new ArrayList(xj.p.W(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(xn.b.e((String) it.next(), 0, 0, 7));
        }
        ArrayList<String> arrayList4 = (ArrayList) this.f21600h;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(xj.p.W(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList5.add(str3 != null ? xn.b.e(str3, 0, 0, 3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = (String) this.f21601i;
        return new xn.m(str, strE, strE2, str2, iB, arrayList3, arrayList, str4 != null ? xn.b.e(str4, 0, 0, 7) : null, toString());
    }

    public int b() {
        int i10 = this.f21595c;
        if (i10 != -1) {
            return i10;
        }
        String str = this.f21594b;
        kotlin.jvm.internal.n.c(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0081  */
    public void c(xn.m mVar, String input) {
        int i10;
        int iG;
        int i11;
        char cCharAt;
        ArrayList arrayList = (ArrayList) this.f21599g;
        kotlin.jvm.internal.n.f(input, "input");
        byte[] bArr = yn.a.f54560a;
        int iM = yn.a.m(input, 0, input.length());
        int iN = yn.a.n(input, iM, input.length());
        if (iN - iM < 2) {
            i10 = -1;
            break;
        }
        char cCharAt2 = input.charAt(iM);
        if ((kotlin.jvm.internal.n.h(cCharAt2, 97) < 0 || kotlin.jvm.internal.n.h(cCharAt2, 122) > 0) && (kotlin.jvm.internal.n.h(cCharAt2, 65) < 0 || kotlin.jvm.internal.n.h(cCharAt2, 90) > 0)) {
            i10 = -1;
            break;
        }
        i10 = iM + 1;
        while (true) {
            if (i10 < iN) {
                char cCharAt3 = input.charAt(i10);
                if (('a' > cCharAt3 || cCharAt3 >= '{') && (('A' > cCharAt3 || cCharAt3 >= '[') && !(('0' <= cCharAt3 && cCharAt3 < ':') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                    if (cCharAt3 != ':') {
                        break;
                    } else {
                        break;
                    }
                }
                i10++;
            }
            i10 = -1;
            break;
        }
        if (i10 == -1) {
            if (mVar == null) {
                throw new IllegalArgumentException(defpackage.e.n("Expected URL scheme 'http' or 'https' but no scheme was found for ", input.length() > 6 ? an.h.S0(6, input).concat("...") : input));
            }
            this.f21594b = mVar.f53989a;
        } else if (an.p.o0(input, iM, "https:", true)) {
            this.f21594b = "https";
            iM += 6;
        } else {
            if (!an.p.o0(input, iM, "http:", true)) {
                StringBuilder sb2 = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                String strSubstring = input.substring(0, i10);
                kotlin.jvm.internal.n.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(strSubstring);
                sb2.append('\'');
                throw new IllegalArgumentException(sb2.toString());
            }
            this.f21594b = "http";
            iM += 5;
        }
        int i12 = 0;
        for (int i13 = iM; i13 < iN && ((cCharAt = input.charAt(i13)) == '\\' || cCharAt == '/'); i13++) {
            i12++;
        }
        char c4 = '#';
        if (i12 >= 2 || mVar == null || !kotlin.jvm.internal.n.a(mVar.f53989a, this.f21594b)) {
            int i14 = iM + i12;
            boolean z10 = false;
            boolean z11 = false;
            while (true) {
                iG = yn.a.g(input, "@/\\?#", i14, iN);
                byte bCharAt = iG != iN ? input.charAt(iG) : (byte) -1;
                if (bCharAt == -1 || bCharAt == c4 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                    break;
                }
                if (bCharAt == 64) {
                    if (z10) {
                        this.f21597e = ((String) this.f21597e) + "%40" + xn.b.b(input, i14, iG, PsExtractor.VIDEO_STREAM_MASK, " \"':;<=>@[]^`{}|/\\?#");
                        z10 = z10;
                    } else {
                        boolean z12 = z10;
                        int iF = yn.a.f(input, ':', i14, iG);
                        String strB = xn.b.b(input, i14, iF, PsExtractor.VIDEO_STREAM_MASK, " \"':;<=>@[]^`{}|/\\?#");
                        if (z11) {
                            strB = q4.a.j(new StringBuilder(), (String) this.f21596d, "%40", strB);
                        }
                        this.f21596d = strB;
                        if (iF != iG) {
                            this.f21597e = xn.b.b(input, iF + 1, iG, PsExtractor.VIDEO_STREAM_MASK, " \"':;<=>@[]^`{}|/\\?#");
                            z10 = true;
                        } else {
                            z10 = z12;
                        }
                        z11 = true;
                    }
                    i14 = iG + 1;
                    c4 = '#';
                }
            }
            int i15 = i14;
            while (true) {
                if (i15 >= iG) {
                    i15 = iG;
                    break;
                }
                char cCharAt4 = input.charAt(i15);
                if (cCharAt4 != '[') {
                    if (cCharAt4 == ':') {
                        break;
                    }
                } else {
                    do {
                        i15++;
                        if (i15 >= iG) {
                            break;
                        }
                    } while (input.charAt(i15) != ']');
                }
                i15++;
            }
            int i16 = i15 + 1;
            if (i16 < iG) {
                this.f21598f = x7.a.O(xn.b.e(input, i14, i15, 4));
                try {
                    i11 = Integer.parseInt(xn.b.b(input, i16, iG, 248, ""));
                    if (1 > i11 || i11 >= 65536) {
                        i11 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.f21595c = i11;
                if (i11 == -1) {
                    StringBuilder sb3 = new StringBuilder("Invalid URL port: \"");
                    String strSubstring2 = input.substring(i16, iG);
                    kotlin.jvm.internal.n.e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb3.append(strSubstring2);
                    sb3.append('\"');
                    throw new IllegalArgumentException(sb3.toString().toString());
                }
            } else {
                this.f21598f = x7.a.O(xn.b.e(input, i14, i15, 4));
                String str = this.f21594b;
                kotlin.jvm.internal.n.c(str);
                this.f21595c = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
            }
            if (((String) this.f21598f) == null) {
                StringBuilder sb4 = new StringBuilder("Invalid URL host: \"");
                String strSubstring3 = input.substring(i14, i15);
                kotlin.jvm.internal.n.e(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                sb4.append(strSubstring3);
                sb4.append('\"');
                throw new IllegalArgumentException(sb4.toString().toString());
            }
            iM = iG;
        } else {
            this.f21596d = mVar.e();
            this.f21597e = mVar.a();
            this.f21598f = mVar.f53992d;
            this.f21595c = mVar.f53993e;
            arrayList.clear();
            arrayList.addAll(mVar.c());
            if (iM == iN || input.charAt(iM) == '#') {
                String strD = mVar.d();
                this.f21600h = strD != null ? xn.b.f(xn.b.b(strD, 0, 0, 211, HttpUrl.QUERY_ENCODE_SET)) : null;
            }
        }
        int iG2 = yn.a.g(input, "?#", iM, iN);
        if (iM != iG2) {
            char cCharAt5 = input.charAt(iM);
            if (cCharAt5 == '/' || cCharAt5 == '\\') {
                arrayList.clear();
                arrayList.add("");
                iM++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            while (iM < iG2) {
                int iG3 = yn.a.g(input, "/\\", iM, iG2);
                boolean z13 = iG3 < iG2;
                String strB2 = xn.b.b(input, iM, iG3, PsExtractor.VIDEO_STREAM_MASK, HttpUrl.PATH_SEGMENT_ENCODE_SET);
                if (!strB2.equals(".") && !strB2.equalsIgnoreCase("%2e")) {
                    if (!strB2.equals("..") && !strB2.equalsIgnoreCase("%2e.") && !strB2.equalsIgnoreCase(".%2e") && !strB2.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) l1.d.d(arrayList, 1)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, strB2);
                        } else {
                            arrayList.add(strB2);
                        }
                        if (z13) {
                            arrayList.add("");
                        }
                    } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                        arrayList.add("");
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                }
                iM = z13 ? iG3 + 1 : iG3;
            }
        }
        if (iG2 < iN && input.charAt(iG2) == '?') {
            int iF2 = yn.a.f(input, '#', iG2, iN);
            this.f21600h = xn.b.f(xn.b.b(input, iG2 + 1, iF2, 208, HttpUrl.QUERY_ENCODE_SET));
            iG2 = iF2;
        }
        if (iG2 >= iN || input.charAt(iG2) != '#') {
            return;
        }
        this.f21601i = xn.b.b(input, iG2 + 1, iN, 176, "");
    }

    public vs d() {
        fw0 fw0VarF = fw0.f((Context) this.f21597e, 6);
        fw0VarF.zza();
        vs vsVar = new vs((jq) this.f21600h);
        zze.zza("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        l00.f16613f.execute(new zd1(8, this, vsVar));
        zze.zza("loadNewJavascriptEngine: Promise created");
        vsVar.q(new ss(this, vsVar, fw0VarF), new ss(this, vsVar, fw0VarF));
        return vsVar;
    }

    public us e() {
        zze.zza("getEngine: Trying to acquire lock");
        Object obj = this.f21596d;
        synchronized (obj) {
            try {
                zze.zza("getEngine: Lock acquired");
                zze.zza("refreshIfDestroyed: Trying to acquire lock");
                synchronized (obj) {
                    try {
                        zze.zza("refreshIfDestroyed: Lock acquired");
                        vs vsVar = (vs) this.f21601i;
                        if (vsVar != null && this.f21595c == 0) {
                            vsVar.q(new b21(this, 7), jq.f16132b);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        zze.zza("refreshIfDestroyed: Lock released");
        vs vsVar2 = (vs) this.f21601i;
        if (vsVar2 != null && ((AtomicInteger) vsVar2.f18848b).get() != -1) {
            int i10 = this.f21595c;
            if (i10 == 0) {
                zze.zza("getEngine (NO_UPDATE): Lock released");
                return ((vs) this.f21601i).t();
            }
            if (i10 != 1) {
                zze.zza("getEngine (UPDATING): Lock released");
                return ((vs) this.f21601i).t();
            }
            this.f21595c = 2;
            d();
            zze.zza("getEngine (PENDING_UPDATE): Lock released");
            return ((vs) this.f21601i).t();
        }
        this.f21595c = 2;
        this.f21601i = d();
        zze.zza("getEngine (NULL or REJECTED): Lock released");
        return ((vs) this.f21601i).t();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    public String toString() {
        switch (this.f21593a) {
            case 1:
                StringBuilder sb2 = new StringBuilder();
                String str = this.f21594b;
                if (str != null) {
                    sb2.append(str);
                    sb2.append("://");
                } else {
                    sb2.append("//");
                }
                if (((String) this.f21596d).length() > 0 || ((String) this.f21597e).length() > 0) {
                    sb2.append((String) this.f21596d);
                    if (((String) this.f21597e).length() > 0) {
                        sb2.append(':');
                        sb2.append((String) this.f21597e);
                    }
                    sb2.append('@');
                }
                String str2 = (String) this.f21598f;
                if (str2 != null) {
                    if (an.h.r0(str2, ':')) {
                        sb2.append('[');
                        sb2.append((String) this.f21598f);
                        sb2.append(']');
                    } else {
                        sb2.append((String) this.f21598f);
                    }
                }
                int i10 = -1;
                if (this.f21595c != -1 || this.f21594b != null) {
                    int iB = b();
                    String str3 = this.f21594b;
                    if (str3 == null) {
                        sb2.append(':');
                        sb2.append(iB);
                    } else {
                        if (str3.equals("http")) {
                            i10 = 80;
                        } else if (str3.equals("https")) {
                            i10 = 443;
                        }
                        if (iB != i10) {
                            sb2.append(':');
                            sb2.append(iB);
                        }
                    }
                }
                ArrayList arrayList = (ArrayList) this.f21599g;
                kotlin.jvm.internal.n.f(arrayList, "<this>");
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    sb2.append('/');
                    sb2.append((String) arrayList.get(i11));
                }
                if (((ArrayList) this.f21600h) != null) {
                    sb2.append('?');
                    ArrayList arrayList2 = (ArrayList) this.f21600h;
                    kotlin.jvm.internal.n.c(arrayList2);
                    pk.a aVarM = com.bumptech.glide.d.M(com.bumptech.glide.d.O(0, arrayList2.size()), 2);
                    int i12 = aVarM.f48393a;
                    int i13 = aVarM.f48394b;
                    int i14 = aVarM.f48395c;
                    if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                        while (true) {
                            String str4 = (String) arrayList2.get(i12);
                            String str5 = (String) arrayList2.get(i12 + 1);
                            if (i12 > 0) {
                                sb2.append('&');
                            }
                            sb2.append(str4);
                            if (str5 != null) {
                                sb2.append(B5.U);
                                sb2.append(str5);
                            }
                            if (i12 != i13) {
                                i12 += i14;
                            }
                        }
                    }
                }
                if (((String) this.f21601i) != null) {
                    sb2.append('#');
                    sb2.append((String) this.f21601i);
                }
                String string = sb2.toString();
                kotlin.jvm.internal.n.e(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            default:
                return super.toString();
        }
    }

    public ws() {
        this.f21593a = 1;
        this.f21596d = "";
        this.f21597e = "";
        this.f21595c = -1;
        ArrayList arrayList = new ArrayList();
        this.f21599g = arrayList;
        arrayList.add("");
    }
}
