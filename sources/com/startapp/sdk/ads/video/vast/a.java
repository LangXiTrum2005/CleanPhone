package com.startapp.sdk.ads.video.vast;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.startapp.sdk.internal.bj;
import com.startapp.sdk.internal.cj;
import com.startapp.sdk.internal.dj;
import com.startapp.sdk.internal.tf;
import com.startapp.sdk.internal.vi;
import com.startapp.sdk.internal.wi;
import com.startapp.sdk.internal.xi;
import com.startapp.sdk.internal.yi;
import com.startapp.sdk.internal.zi;
import com.startapp.sdk.omsdk.VerificationDetails;
import java.io.BufferedInputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final List f40563i = Arrays.asList("video/mp4", "video/3gpp");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f40565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public cj f40566c;
    public VASTErrorCodes d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f40567e;
    public int f = 10;
    public final HashSet g = new HashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f40568h;

    public a(Context context, String str) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        float f = displayMetrics.density;
        f = f <= 0.0f ? 1.0f : f;
        float f2 = i2;
        this.f40565b = f2 / i3;
        this.f40564a = (int) (f2 / f);
        this.f40568h = str;
    }

    /* JADX WARN: Code duplicated, block: B:98:0x01cd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final xi a(String str, ArrayList arrayList, yi yiVar) throws Throwable {
        Iterator it;
        String str2;
        String strA;
        xi xiVarA;
        xi xiVar;
        bj bjVarA;
        Integer num;
        if (yiVar != null && str != null) {
            yiVar.f41722c.put(str);
        }
        xi xiVar2 = 0;
        try {
            bj bjVar = new bj(str);
            if ((bjVar.f40843b ? bjVar.f("Error") : null) != null) {
                arrayList.add(bjVar.f40843b ? bjVar.f("Error") : null);
            }
            ArrayList arrayListA = bjVar.a("Ad", null, null);
            if (arrayListA.isEmpty() && arrayList.size() > 0) {
                a(arrayList, this.f40567e > 0 ? VASTErrorCodes.WrapperNoReponse : VASTErrorCodes.FileNotFound);
                return null;
            }
            Iterator it2 = arrayListA.iterator();
            while (it2.hasNext()) {
                bj bjVar2 = (bj) it2.next();
                String strA2 = bjVar2.a("sequence");
                char c2 = 2;
                if (!TextUtils.isEmpty(strA2)) {
                    try {
                        if (Integer.parseInt(strA2) >= 2) {
                            continue;
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                bj bjVarA2 = bjVar2.a("InLine", xiVar2);
                String str3 = "Linear";
                if (bjVarA2 != 0) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = bjVarA2.a("Creative", "Creatives", xiVar2, xiVar2).iterator();
                    while (it3.hasNext()) {
                        bj bjVarA3 = ((bj) it3.next()).a("Linear", xiVar2);
                        if (bjVarA3 != null) {
                            arrayList2.add(bjVarA3);
                        }
                    }
                    Iterator it4 = arrayList2.iterator();
                    ?? r4 = xiVar2;
                    while (true) {
                        if (!it4.hasNext()) {
                            it = it2;
                            str2 = str3;
                            a(arrayList, VASTErrorCodes.FileNotFound);
                            xiVar = null;
                            break;
                        }
                        bj bjVar3 = (bj) it4.next();
                        char c3 = c2;
                        Iterator it5 = bjVar3.a("MediaFile", "MediaFiles", r4, r4).iterator();
                        float f = Float.NEGATIVE_INFINITY;
                        bj bjVar4 = r4;
                        while (true) {
                            it = it2;
                            Iterator it6 = it5;
                            if (!it5.hasNext()) {
                                break;
                            }
                            Iterator it7 = it4;
                            bj bjVar5 = (bj) it6.next();
                            float f2 = f;
                            String strA3 = bjVar5.a("type");
                            String strB = bjVar5.b();
                            String str4 = str3;
                            if (!f40563i.contains(strA3) || strB == null) {
                                it6.remove();
                            } else {
                                Integer numB = bjVar5.b("width");
                                Integer numB2 = bjVar5.b("height");
                                Integer numB3 = bjVar5.b("bitrate");
                                if (numB3 != null) {
                                    num = numB2;
                                } else {
                                    numB3 = bjVar5.b("minBitrate");
                                    num = numB2;
                                    Integer numB4 = bjVar5.b("maxBitrate");
                                    if (numB3 != null && numB4 != null) {
                                        numB3 = Integer.valueOf((numB4.intValue() + numB3.intValue()) / 2);
                                    } else if (numB3 == null) {
                                        numB3 = numB4;
                                    }
                                }
                                if (numB != null && numB.intValue() > 0 && num != null && num.intValue() > 0) {
                                    int iIntValue = numB.intValue();
                                    int iIntValue2 = num.intValue();
                                    Integer num2 = numB3;
                                    float fAbs = Math.abs(this.f40565b - (iIntValue / iIntValue2));
                                    int i2 = this.f40564a;
                                    float fAbs2 = fAbs + Math.abs((i2 - iIntValue) / i2);
                                    int iIntValue3 = (num2 == null || num2.intValue() < 0) ? 0 : num2.intValue();
                                    float fMin = (700 > iIntValue3 || iIntValue3 > 1500) ? Math.min(Math.abs(700 - iIntValue3) / 700.0f, Math.abs(1500 - iIntValue3) / 1500.0f) : 0.0f;
                                    if (strA3 == null) {
                                        strA3 = "";
                                    }
                                    int iHashCode = strA3.hashCode();
                                    float f3 = fMin;
                                    if (iHashCode != -1664118616) {
                                        float f4 = (iHashCode == 1331848029 && strA3.equals("video/mp4")) ? 1.5f : 1.0f;
                                        f = (1.0f / ((fAbs2 + 1.0f) + f3)) * f4;
                                        if (f > f2) {
                                            bjVar4 = bjVar5;
                                        }
                                    } else {
                                        strA3.equals("video/3gpp");
                                    }
                                    f = (1.0f / ((fAbs2 + 1.0f) + f3)) * f4;
                                    if (f > f2) {
                                        bjVar4 = bjVar5;
                                    }
                                }
                                it2 = it;
                                it5 = it6;
                                it4 = it7;
                                str3 = str4;
                                bjVar4 = bjVar4;
                            }
                            f = f2;
                            it2 = it;
                            it5 = it6;
                            it4 = it7;
                            str3 = str4;
                            bjVar4 = bjVar4;
                        }
                        str2 = str3;
                        Iterator it8 = it4;
                        if (bjVar4 != 0 && bjVar4.b() != null) {
                            xiVar = new xi();
                            xiVar.f41682b.addAll(bjVarA2.c("Impression"));
                            a(bjVar3, xiVar);
                            bj bjVarA4 = bjVar3.a("VideoClicks", null);
                            xiVar.s = (bjVarA4 == null || (bjVarA = bjVarA4.a("ClickThrough", null)) == null) ? null : bjVarA.b();
                            xiVar.f41689p = bjVar4.b();
                            xiVar.q = bjVar4.b("width");
                            xiVar.r = bjVar4.b("height");
                            this.g.addAll(a(bjVarA2.a()));
                            arrayList.addAll(bjVarA2.c("Error"));
                            xiVar.f41681a.addAll(arrayList);
                            break;
                        }
                        c2 = c3;
                        it2 = it;
                        it4 = it8;
                        str3 = str2;
                        r4 = 0;
                    }
                    if (xiVar != null) {
                        xiVar.t.addAll(a(bjVarA2));
                        return xiVar;
                    }
                } else {
                    it = it2;
                    str2 = "Linear";
                }
                bj bjVarA5 = bjVar2.a("Wrapper", null);
                if (bjVarA5 != null) {
                    ArrayList arrayList3 = new ArrayList(arrayList);
                    arrayList3.addAll(bjVarA5.c("Error"));
                    String strF = bjVarA5.f("VASTAdTagURI");
                    if (strF == null) {
                        strA = null;
                    } else {
                        try {
                            strA = a(strF);
                        } catch (SocketTimeoutException unused2) {
                            if (!arrayList3.isEmpty()) {
                                a(arrayList3, VASTErrorCodes.WrapperTimeout);
                            }
                            strA = null;
                        } catch (Exception unused3) {
                            if (!arrayList3.isEmpty()) {
                                a(arrayList3, VASTErrorCodes.WrapperNoReponse);
                            }
                            strA = null;
                        }
                    }
                    if (strA != null && (xiVarA = a(strA, arrayList3, yiVar)) != null) {
                        xiVarA.f41682b.addAll(bjVarA5.c("Impression"));
                        ArrayList arrayList4 = new ArrayList();
                        String str5 = null;
                        Iterator it9 = bjVarA5.a("Creative", "Creatives", null, null).iterator();
                        while (it9.hasNext()) {
                            String str6 = str2;
                            bj bjVarA6 = ((bj) it9.next()).a(str6, str5);
                            if (bjVarA6 != null) {
                                arrayList4.add(bjVarA6);
                            }
                            str2 = str6;
                            str5 = null;
                        }
                        Iterator it10 = arrayList4.iterator();
                        while (it10.hasNext()) {
                            a((bj) it10.next(), xiVarA);
                        }
                        if (this.g.isEmpty()) {
                            this.g.addAll(a(bjVarA5.a()));
                        } else {
                            for (wi wiVar : this.g) {
                                for (bj bjVar6 : bjVarA5.a()) {
                                    if (TextUtils.isEmpty(bjVar6.f("StaticResource")) && TextUtils.isEmpty(bjVar6.f("IFrameResource")) && TextUtils.isEmpty(bjVar6.f("HTMLResource"))) {
                                        wiVar.f41642e.addAll(bjVar6.c("CompanionClickTracking"));
                                        ArrayList arrayList5 = new ArrayList();
                                        Iterator it11 = bjVar6.d("creativeView").iterator();
                                        while (it11.hasNext()) {
                                            String strB2 = ((bj) it11.next()).b();
                                            if (!TextUtils.isEmpty(strB2)) {
                                                arrayList5.add(strB2);
                                            }
                                        }
                                        wiVar.f.addAll(arrayList5);
                                    }
                                }
                            }
                        }
                        xiVarA.t.addAll(a(bjVarA5));
                        return xiVarA;
                    }
                }
                it2 = it;
                xiVar2 = 0;
            }
            return xiVar2;
        } catch (Exception unused4) {
            a(arrayList, VASTErrorCodes.XMLParsingError);
            return null;
        }
    }

    public final xi a(String str, yi yiVar) throws Throwable {
        VASTErrorCodes vASTErrorCodes;
        this.g.clear();
        xi xiVarA = a(str, new ArrayList(), yiVar);
        if (xiVarA != null) {
            int i2 = (int) (this.f40564a / this.f40565b);
            wi wiVar = null;
            for (wi wiVar2 : this.g) {
                if (wiVar == null || wiVar2.a(this.f40564a, i2) > wiVar.a(this.f40564a, i2)) {
                    wiVar = wiVar2;
                }
            }
            xiVarA.o = wiVar;
            ArrayList arrayList = new ArrayList(xiVarA.f41681a);
            VASTErrorCodes vASTErrorCodes2 = VASTErrorCodes.SAProcessSuccess;
            a(arrayList, vASTErrorCodes2);
            if (yiVar != null) {
                yiVar.a(vASTErrorCodes2);
                return xiVarA;
            }
        } else if (yiVar != null && (vASTErrorCodes = this.d) != null) {
            yiVar.a(vASTErrorCodes);
        }
        return xiVarA;
    }

    public final String a(String str) throws Throwable {
        Throwable th;
        HttpURLConnection httpURLConnectionA;
        int i2 = this.f40567e;
        BufferedInputStream bufferedInputStream = null;
        if (i2 >= this.f) {
            return null;
        }
        this.f40567e = i2 + 1;
        try {
            httpURLConnectionA = tf.a(str, this.f40568h);
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(httpURLConnectionA.getInputStream());
                try {
                    String next = new Scanner(bufferedInputStream2).useDelimiter("\\A").next();
                    vi.a(bufferedInputStream2);
                    httpURLConnectionA.disconnect();
                    return next;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = bufferedInputStream2;
                    vi.a(bufferedInputStream);
                    if (httpURLConnectionA != null) {
                        httpURLConnectionA.disconnect();
                        throw th;
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            httpURLConnectionA = null;
        }
    }

    public static void a(bj bjVar, xi xiVar) {
        int i2;
        bj bjVarA;
        Integer numA;
        bjVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = bjVar.d("start").iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String strB = ((bj) it.next()).b();
            if (!TextUtils.isEmpty(strB)) {
                arrayList.add(new dj(strB, 0));
            }
        }
        for (bj bjVar2 : bjVar.d("progress")) {
            String strA = bjVar2.a("offset");
            if (!TextUtils.isEmpty(strA)) {
                String strTrim = strA.trim();
                if (dj.f40919c.matcher(strTrim).matches()) {
                    String strB2 = bjVar2.b();
                    Integer numA2 = dj.a(strTrim);
                    if (numA2 != null && numA2.intValue() >= 0 && !TextUtils.isEmpty(strB2)) {
                        arrayList.add(new dj(strB2, numA2));
                    }
                }
            }
        }
        Iterator it2 = bjVar.d("creativeView").iterator();
        while (it2.hasNext()) {
            String strB3 = ((bj) it2.next()).b();
            if (!TextUtils.isEmpty(strB3)) {
                arrayList.add(new dj(strB3, 0));
            }
        }
        xiVar.f41683c.addAll(arrayList);
        Collections.sort(xiVar.f41683c);
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = bjVar.d("firstQuartile").iterator();
        while (it3.hasNext()) {
            String strB4 = ((bj) it3.next()).b();
            if (!TextUtils.isEmpty(strB4)) {
                arrayList2.add(new dj(strB4, Float.valueOf(0.25f)));
            }
        }
        Iterator it4 = bjVar.d("midpoint").iterator();
        while (it4.hasNext()) {
            String strB5 = ((bj) it4.next()).b();
            if (!TextUtils.isEmpty(strB5)) {
                arrayList2.add(new dj(strB5, Float.valueOf(0.5f)));
            }
        }
        Iterator it5 = bjVar.d("thirdQuartile").iterator();
        while (it5.hasNext()) {
            String strB6 = ((bj) it5.next()).b();
            if (!TextUtils.isEmpty(strB6)) {
                arrayList2.add(new dj(strB6, Float.valueOf(0.75f)));
            }
        }
        for (bj bjVar3 : bjVar.d("progress")) {
            String strA2 = bjVar3.a("offset");
            if (!TextUtils.isEmpty(strA2)) {
                String strTrim2 = strA2.trim();
                if (dj.d.matcher(strTrim2).matches()) {
                    String strB7 = bjVar3.b();
                    try {
                        float f = Float.parseFloat(strTrim2.replace("%", "")) / 100.0f;
                        if (f >= 0.0f && !TextUtils.isEmpty(strB7)) {
                            arrayList2.add(new dj(strB7, Float.valueOf(f)));
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        xiVar.d.addAll(arrayList2);
        Collections.sort(xiVar.d);
        xiVar.f41684e.addAll(bjVar.e("pause"));
        xiVar.f.addAll(bjVar.e("resume"));
        xiVar.g.addAll(bjVar.e("complete"));
        ArrayList arrayListE = bjVar.e("close");
        arrayListE.addAll(bjVar.e("closeLinear"));
        xiVar.f41685h.addAll(arrayListE);
        xiVar.k.addAll(bjVar.e("skip"));
        ArrayList arrayList3 = new ArrayList();
        zi ziVar = null;
        Iterator it6 = bjVar.a("ClickTracking", "VideoClicks", null, null).iterator();
        while (it6.hasNext()) {
            String strB8 = ((bj) it6.next()).b();
            if (!TextUtils.isEmpty(strB8)) {
                arrayList3.add(strB8);
            }
        }
        xiVar.f41687l.addAll(arrayList3);
        xiVar.f41686i.addAll(bjVar.e("mute"));
        xiVar.j.addAll(bjVar.e("unmute"));
        if (xiVar.m == null) {
            String strA3 = bjVar.a("skipoffset");
            if (strA3 == null || TextUtils.isEmpty(strA3.trim()) || !dj.f40919c.matcher(strA3).matches() || (numA = dj.a(strA3)) == null || numA.intValue() < 0) {
                numA = null;
            }
            xiVar.m = numA;
        }
        if (xiVar.f41688n == null) {
            ArrayList<bj> arrayListA = bjVar.a("Icon", "Icons", null, null);
            loop8: for (VASTResource$Type vASTResource$Type : VASTResource$Type.values()) {
                if (vASTResource$Type != VASTResource$Type.IFRAME_RESOURCE && vASTResource$Type != VASTResource$Type.HTML_RESOURCE) {
                    for (bj bjVar4 : arrayListA) {
                        Integer numB = bjVar4.b("assetWidth");
                        if (numB == null) {
                            numB = bjVar4.b("width");
                        }
                        Integer numB2 = bjVar4.b("assetHeight");
                        if (numB2 == null) {
                            numB2 = bjVar4.b("height");
                        }
                        if (numB != null && numB.intValue() > 0 && numB.intValue() <= 300 && numB2 != null && numB2.intValue() > 0 && numB2.intValue() <= 300 && b.a(bjVar4, vASTResource$Type, numB.intValue(), numB2.intValue()) != null) {
                            String strA4 = bjVar4.a("offset");
                            if (strA4 != null && dj.f40919c.matcher(strA4).matches()) {
                                dj.a(strA4);
                            }
                            String strA5 = bjVar4.a("duration");
                            if (strA5 != null && dj.f40919c.matcher(strA5).matches()) {
                                dj.a(strA5);
                            }
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it7 = bjVar4.a("IconClickTracking", "IconClicks", null, null).iterator();
                            while (it7.hasNext()) {
                                String strB9 = ((bj) it7.next()).b();
                                if (!TextUtils.isEmpty(strB9)) {
                                    arrayList4.add(strB9);
                                }
                            }
                            bj bjVarA2 = bjVar4.a("IconClicks", null);
                            if (bjVarA2 != null && (bjVarA = bjVarA2.a("IconClickThrough", null)) != null) {
                                bjVarA.b();
                            }
                            bjVar4.c("IconViewTracking");
                            ziVar = new zi();
                            break loop8;
                        }
                    }
                }
            }
            xiVar.f41688n = ziVar;
        }
    }

    public final void a(ArrayList arrayList, VASTErrorCodes vASTErrorCodes) {
        this.d = vASTErrorCodes;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        cj cjVar = this.f40566c;
        if (cjVar != null) {
            cjVar.a(arrayList2, vASTErrorCodes);
        }
    }

    public final HashSet a(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        for (VASTResource$Type vASTResource$Type : VASTResource$Type.values()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                bj bjVar = (bj) it.next();
                Integer numB = bjVar.b("assetWidth");
                if (numB == null) {
                    numB = bjVar.b("width");
                }
                Integer numB2 = bjVar.b("assetHeight");
                if (numB2 == null) {
                    numB2 = bjVar.b("height");
                }
                if (numB != null && numB.intValue() >= 300 && numB2 != null && numB2.intValue() >= 250) {
                    int iIntValue = numB.intValue();
                    int iIntValue2 = numB2.intValue();
                    Point point = new Point(iIntValue, iIntValue2);
                    int i2 = this.f40564a;
                    float f = i2;
                    int i3 = (int) (f / this.f40565b);
                    if (iIntValue > i2 || iIntValue2 > i3) {
                        if (vASTResource$Type == VASTResource$Type.HTML_RESOURCE) {
                            point.x = Math.min(i2, iIntValue);
                            point.y = Math.min(i3, iIntValue2);
                        } else {
                            float f2 = iIntValue;
                            float f3 = f2 / f;
                            float f4 = iIntValue2;
                            float f5 = f4 / i3;
                            if (f3 > f5) {
                                point.x = i2;
                                point.y = (int) (f4 / f3);
                            } else {
                                point.x = (int) (f2 / f5);
                                point.y = i3;
                            }
                        }
                    }
                    b bVarA = b.a(bjVar, vASTResource$Type, point.x, point.y);
                    if (bVarA != null) {
                        int i4 = point.x;
                        int i5 = point.y;
                        String strF = bjVar.f("CompanionClickThrough");
                        ArrayList arrayListC = bjVar.c("CompanionClickTracking");
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = bjVar.d("creativeView").iterator();
                        while (it2.hasNext()) {
                            String strB = ((bj) it2.next()).b();
                            if (!TextUtils.isEmpty(strB)) {
                                arrayList2.add(strB);
                            }
                        }
                        hashSet.add(new wi(i4, i5, bVarA, strF, arrayListC, arrayList2));
                    }
                }
            }
        }
        return hashSet;
    }

    public static ArrayList a(bj bjVar) {
        String strF;
        String strF2;
        ArrayList<bj> arrayListA = bjVar.a("Verification", "AdVerifications", null, null);
        Iterator it = bjVar.a("Extension", "Extensions", "type", Collections.singletonList("AdVerifications")).iterator();
        while (it.hasNext()) {
            arrayListA.addAll(((bj) it.next()).a("Verification", "AdVerifications", null, null));
        }
        ArrayList arrayList = new ArrayList();
        for (bj bjVar2 : arrayListA) {
            String strA = bjVar2.a("vendor");
            if (strA != null && (strF = bjVar2.f("JavaScriptResource")) != null && (strF2 = bjVar2.f("VerificationParameters")) != null) {
                bj bjVarA = bjVar2.a("JavaScriptResource", "apiFramework");
                String strA2 = bjVarA == null ? null : bjVarA.a("apiFramework");
                if (strA2 != null && strA2.equalsIgnoreCase("omid")) {
                    arrayList.add(new VerificationDetails(strA, strF, strF2));
                }
            }
        }
        return arrayList;
    }
}
