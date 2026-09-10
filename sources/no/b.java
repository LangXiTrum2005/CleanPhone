package no;

import an.h;
import an.p;
import android.content.SharedPreferences;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.datastore.preferences.protobuf.j;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.ads.y2;
import com.google.android.gms.internal.measurement.nf;
import com.google.android.gms.internal.play_billing.q1;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import go.k;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k5.g;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.n;
import l1.d;
import l7.b0;
import l7.d0;
import l7.e0;
import l7.g0;
import l7.q;
import na.s;
import na.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import pk.c;
import q7.x;
import qk.i0;
import s0.m;
import t9.e;
import tj.o;
import wj.r;
import xi.l;
import yl.f;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String[] f46875a;

    public static f C(f fVar, String str, String str2, int i10) {
        char cCharAt;
        char cCharAt2;
        Object next;
        boolean z10 = (i10 & 4) != 0;
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        if (!fVar.f54515b) {
            String strC = fVar.c();
            if (p.p0(strC, str, false) && strC.length() != str.length() && ('a' > (cCharAt = strC.charAt(str.length())) || cCharAt >= '{')) {
                if (str2 != null) {
                    return f.e(str2.concat(h.E0(strC, str)));
                }
                if (!z10) {
                    return fVar;
                }
                String strE0 = h.E0(strC, str);
                if (strE0.length() != 0 && android.support.v4.media.session.a.z(0, strE0)) {
                    if (strE0.length() != 1 && android.support.v4.media.session.a.z(1, strE0)) {
                        pk.b bVarB = new c(0, strE0.length() - 1, 1).iterator();
                        do {
                            if (!bVarB.f48398c) {
                                next = null;
                                break;
                            }
                            next = bVarB.next();
                        } while (android.support.v4.media.session.a.z(((Number) next).intValue(), strE0));
                        Integer num = (Integer) next;
                        if (num != null) {
                            int iIntValue = num.intValue() - 1;
                            String strSubstring = strE0.substring(0, iIntValue);
                            n.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                            String strJ = android.support.v4.media.session.a.J(strSubstring);
                            String strSubstring2 = strE0.substring(iIntValue);
                            n.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                            strE0 = strJ.concat(strSubstring2);
                        } else {
                            strE0 = android.support.v4.media.session.a.J(strE0);
                        }
                    } else if (strE0.length() != 0 && 'A' <= (cCharAt2 = strE0.charAt(0)) && cCharAt2 < '[') {
                        char lowerCase = Character.toLowerCase(cCharAt2);
                        String strSubstring3 = strE0.substring(1);
                        n.e(strSubstring3, "this as java.lang.String).substring(startIndex)");
                        strE0 = lowerCase + strSubstring3;
                    }
                }
                if (f.f(strE0)) {
                    return f.e(strE0);
                }
            }
        }
        return null;
    }

    public static void D(y2 y2Var, MediaExtractor mediaExtractor) {
        try {
            int trackCount = mediaExtractor.getTrackCount();
            for (int i10 = 0; i10 < trackCount; i10++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i10);
                String string = trackFormat.getString("mime");
                if (string != null && string.startsWith("image/")) {
                    int integer = trackFormat.containsKey("rotation-degrees") ? trackFormat.getInteger("rotation-degrees") : 0;
                    int i11 = y2Var.f22088g;
                    int i12 = y2Var.f22087f;
                    if (integer != 90 && integer != 270) {
                        i12 = i11;
                        i11 = i12;
                    }
                    y2Var.f22084c = i11;
                    y2Var.f22082a = i12;
                    y2Var.f22085d = integer;
                    return;
                }
            }
        } catch (Exception e10) {
            Log.e("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e10);
        }
    }

    public static final byte[] E(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(Segment.SIZE, inputStream.available()));
        g(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        n.e(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static void F(xi.f binaryMessenger, final o oVar) {
        nf nfVar;
        n.f(binaryMessenger, "binaryMessenger");
        l hVar = (oVar == null || (nfVar = oVar.f50873a) == null) ? new defpackage.h(10) : nfVar.e();
        Object obj = null;
        g gVar = new g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_defaultConstructor", hVar, obj);
        if (oVar != null) {
            final int i10 = 0;
            gVar.C(new xi.b() { // from class: tj.h0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i10) {
                        case 0:
                            o oVar2 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar2.f50873a.f23783c).a(((Long) obj3).longValue(), oVar2.a());
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
                            o oVar3 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                oVar3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                        case 2:
                            o oVar4 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar4.f50873a.f23783c).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            o oVar5 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            p0 p0Var = (p0) list3.get(1);
                            try {
                                oVar5.getClass();
                                webView3.setWebChromeClient(p0Var);
                                listQ4 = j1.f.C(null);
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
                        case 4:
                            o oVar6 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                oVar6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = j1.f.C(null);
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
                        case 5:
                            o oVar7 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                oVar7.getClass();
                                webView5.destroy();
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            o oVar8 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                oVar8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            o oVar9 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                oVar9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            o oVar10 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                oVar10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            o oVar11 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                oVar11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            o oVar12 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                oVar12.getClass();
                                listQ11 = j1.f.C(webView10.getUrl());
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            o oVar13 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                oVar13.getClass();
                                webView11.goForward();
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            o oVar14 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                oVar14.getClass();
                                listQ13 = j1.f.C(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            o oVar15 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                oVar15.getClass();
                                listQ14 = j1.f.C(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            o oVar16 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                oVar16.getClass();
                                webView14.goBack();
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            o oVar17 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                oVar17.getClass();
                                webView15.reload();
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        case 16:
                            o oVar18 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                oVar18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                        case 17:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.String");
                            hj.b bVar2 = new hj.b(bVar, 17);
                            oVar.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new k(bVar2, 1));
                            break;
                        case 18:
                            o oVar19 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                oVar19.getClass();
                                listQ18 = j1.f.C(webView17.getTitle());
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof a) {
                                    a aVar18 = th19;
                                    listQ18 = xj.o.Q(aVar18.f50793a, aVar18.f50794b, aVar18.f50795c);
                                } else {
                                    listQ18 = xj.o.Q(th19.getClass().getSimpleName(), th19.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            bVar.e(listQ18);
                            break;
                        case 19:
                            o oVar20 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                oVar20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = j1.f.C(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof a) {
                                    a aVar19 = th20;
                                    listQ19 = xj.o.Q(aVar19.f50793a, aVar19.f50794b, aVar19.f50795c);
                                } else {
                                    listQ19 = xj.o.Q(th20.getClass().getSimpleName(), th20.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            bVar.e(listQ19);
                            break;
                        case 20:
                            o oVar21 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                oVar21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = j1.f.C(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof a) {
                                    a aVar20 = th21;
                                    listQ20 = xj.o.Q(aVar20.f50793a, aVar20.f50794b, aVar20.f50795c);
                                } else {
                                    listQ20 = xj.o.Q(th21.getClass().getSimpleName(), th21.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            bVar.e(listQ20);
                            break;
                        case 21:
                            o oVar22 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            s sVar = (s) obj35;
                            try {
                                oVar22.getClass();
                                webView19.addJavascriptInterface(sVar, sVar.f50902a);
                                listQ21 = j1.f.C(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof a) {
                                    a aVar21 = th22;
                                    listQ21 = xj.o.Q(aVar21.f50793a, aVar21.f50794b, aVar21.f50795c);
                                } else {
                                    listQ21 = xj.o.Q(th22.getClass().getSimpleName(), th22.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            bVar.e(listQ21);
                            break;
                        default:
                            o oVar23 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                oVar23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = j1.f.C(null);
                                break;
                            } catch (Throwable th23) {
                                if (th23 instanceof a) {
                                    a aVar22 = th23;
                                    listQ22 = xj.o.Q(aVar22.f50793a, aVar22.f50794b, aVar22.f50795c);
                                } else {
                                    listQ22 = xj.o.Q(th23.getClass().getSimpleName(), th23.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th23), th23.getCause()));
                                }
                            }
                            bVar.e(listQ22);
                            break;
                    }
                }
            });
        } else {
            gVar.C(null);
        }
        g gVar2 = new g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.settings", hVar, obj);
        if (oVar != null) {
            final int i11 = 2;
            gVar2.C(new xi.b() { // from class: tj.h0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i11) {
                        case 0:
                            o oVar2 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar2.f50873a.f23783c).a(((Long) obj3).longValue(), oVar2.a());
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
                            o oVar3 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                oVar3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                        case 2:
                            o oVar4 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar4.f50873a.f23783c).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            o oVar5 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            p0 p0Var = (p0) list3.get(1);
                            try {
                                oVar5.getClass();
                                webView3.setWebChromeClient(p0Var);
                                listQ4 = j1.f.C(null);
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
                        case 4:
                            o oVar6 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                oVar6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = j1.f.C(null);
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
                        case 5:
                            o oVar7 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                oVar7.getClass();
                                webView5.destroy();
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            o oVar8 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                oVar8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            o oVar9 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                oVar9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            o oVar10 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                oVar10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            o oVar11 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                oVar11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            o oVar12 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                oVar12.getClass();
                                listQ11 = j1.f.C(webView10.getUrl());
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            o oVar13 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                oVar13.getClass();
                                webView11.goForward();
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            o oVar14 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                oVar14.getClass();
                                listQ13 = j1.f.C(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            o oVar15 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                oVar15.getClass();
                                listQ14 = j1.f.C(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            o oVar16 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                oVar16.getClass();
                                webView14.goBack();
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            o oVar17 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                oVar17.getClass();
                                webView15.reload();
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        case 16:
                            o oVar18 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                oVar18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                        case 17:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.String");
                            hj.b bVar2 = new hj.b(bVar, 17);
                            oVar.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new k(bVar2, 1));
                            break;
                        case 18:
                            o oVar19 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                oVar19.getClass();
                                listQ18 = j1.f.C(webView17.getTitle());
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof a) {
                                    a aVar18 = th19;
                                    listQ18 = xj.o.Q(aVar18.f50793a, aVar18.f50794b, aVar18.f50795c);
                                } else {
                                    listQ18 = xj.o.Q(th19.getClass().getSimpleName(), th19.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            bVar.e(listQ18);
                            break;
                        case 19:
                            o oVar20 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                oVar20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = j1.f.C(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof a) {
                                    a aVar19 = th20;
                                    listQ19 = xj.o.Q(aVar19.f50793a, aVar19.f50794b, aVar19.f50795c);
                                } else {
                                    listQ19 = xj.o.Q(th20.getClass().getSimpleName(), th20.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            bVar.e(listQ19);
                            break;
                        case 20:
                            o oVar21 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                oVar21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = j1.f.C(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof a) {
                                    a aVar20 = th21;
                                    listQ20 = xj.o.Q(aVar20.f50793a, aVar20.f50794b, aVar20.f50795c);
                                } else {
                                    listQ20 = xj.o.Q(th21.getClass().getSimpleName(), th21.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            bVar.e(listQ20);
                            break;
                        case 21:
                            o oVar22 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            s sVar = (s) obj35;
                            try {
                                oVar22.getClass();
                                webView19.addJavascriptInterface(sVar, sVar.f50902a);
                                listQ21 = j1.f.C(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof a) {
                                    a aVar21 = th22;
                                    listQ21 = xj.o.Q(aVar21.f50793a, aVar21.f50794b, aVar21.f50795c);
                                } else {
                                    listQ21 = xj.o.Q(th22.getClass().getSimpleName(), th22.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            bVar.e(listQ21);
                            break;
                        default:
                            o oVar23 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                oVar23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = j1.f.C(null);
                                break;
                            } catch (Throwable th23) {
                                if (th23 instanceof a) {
                                    a aVar22 = th23;
                                    listQ22 = xj.o.Q(aVar22.f50793a, aVar22.f50794b, aVar22.f50795c);
                                } else {
                                    listQ22 = xj.o.Q(th23.getClass().getSimpleName(), th23.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th23), th23.getCause()));
                                }
                            }
                            bVar.e(listQ22);
                            break;
                    }
                }
            });
        } else {
            gVar2.C(null);
        }
        g gVar3 = new g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.loadData", hVar, obj);
        if (oVar != null) {
            final int i12 = 6;
            gVar3.C(new xi.b() { // from class: tj.h0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i12) {
                        case 0:
                            o oVar2 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar2.f50873a.f23783c).a(((Long) obj3).longValue(), oVar2.a());
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
                            o oVar3 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                oVar3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                        case 2:
                            o oVar4 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar4.f50873a.f23783c).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            o oVar5 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            p0 p0Var = (p0) list3.get(1);
                            try {
                                oVar5.getClass();
                                webView3.setWebChromeClient(p0Var);
                                listQ4 = j1.f.C(null);
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
                        case 4:
                            o oVar6 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                oVar6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = j1.f.C(null);
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
                        case 5:
                            o oVar7 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                oVar7.getClass();
                                webView5.destroy();
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            o oVar8 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                oVar8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            o oVar9 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                oVar9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            o oVar10 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                oVar10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            o oVar11 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                oVar11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            o oVar12 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                oVar12.getClass();
                                listQ11 = j1.f.C(webView10.getUrl());
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            o oVar13 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                oVar13.getClass();
                                webView11.goForward();
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            o oVar14 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                oVar14.getClass();
                                listQ13 = j1.f.C(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            o oVar15 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                oVar15.getClass();
                                listQ14 = j1.f.C(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            o oVar16 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                oVar16.getClass();
                                webView14.goBack();
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            o oVar17 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                oVar17.getClass();
                                webView15.reload();
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        case 16:
                            o oVar18 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                oVar18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                        case 17:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.String");
                            hj.b bVar2 = new hj.b(bVar, 17);
                            oVar.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new k(bVar2, 1));
                            break;
                        case 18:
                            o oVar19 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                oVar19.getClass();
                                listQ18 = j1.f.C(webView17.getTitle());
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof a) {
                                    a aVar18 = th19;
                                    listQ18 = xj.o.Q(aVar18.f50793a, aVar18.f50794b, aVar18.f50795c);
                                } else {
                                    listQ18 = xj.o.Q(th19.getClass().getSimpleName(), th19.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            bVar.e(listQ18);
                            break;
                        case 19:
                            o oVar20 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                oVar20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = j1.f.C(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof a) {
                                    a aVar19 = th20;
                                    listQ19 = xj.o.Q(aVar19.f50793a, aVar19.f50794b, aVar19.f50795c);
                                } else {
                                    listQ19 = xj.o.Q(th20.getClass().getSimpleName(), th20.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            bVar.e(listQ19);
                            break;
                        case 20:
                            o oVar21 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                oVar21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = j1.f.C(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof a) {
                                    a aVar20 = th21;
                                    listQ20 = xj.o.Q(aVar20.f50793a, aVar20.f50794b, aVar20.f50795c);
                                } else {
                                    listQ20 = xj.o.Q(th21.getClass().getSimpleName(), th21.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            bVar.e(listQ20);
                            break;
                        case 21:
                            o oVar22 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            s sVar = (s) obj35;
                            try {
                                oVar22.getClass();
                                webView19.addJavascriptInterface(sVar, sVar.f50902a);
                                listQ21 = j1.f.C(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof a) {
                                    a aVar21 = th22;
                                    listQ21 = xj.o.Q(aVar21.f50793a, aVar21.f50794b, aVar21.f50795c);
                                } else {
                                    listQ21 = xj.o.Q(th22.getClass().getSimpleName(), th22.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            bVar.e(listQ21);
                            break;
                        default:
                            o oVar23 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                oVar23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = j1.f.C(null);
                                break;
                            } catch (Throwable th23) {
                                if (th23 instanceof a) {
                                    a aVar22 = th23;
                                    listQ22 = xj.o.Q(aVar22.f50793a, aVar22.f50794b, aVar22.f50795c);
                                } else {
                                    listQ22 = xj.o.Q(th23.getClass().getSimpleName(), th23.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th23), th23.getCause()));
                                }
                            }
                            bVar.e(listQ22);
                            break;
                    }
                }
            });
        } else {
            gVar3.C(null);
        }
        g gVar4 = new g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.loadDataWithBaseUrl", hVar, obj);
        if (oVar != null) {
            final int i13 = 7;
            gVar4.C(new xi.b() { // from class: tj.h0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i13) {
                        case 0:
                            o oVar2 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar2.f50873a.f23783c).a(((Long) obj3).longValue(), oVar2.a());
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
                            o oVar3 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                oVar3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                        case 2:
                            o oVar4 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar4.f50873a.f23783c).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            o oVar5 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            p0 p0Var = (p0) list3.get(1);
                            try {
                                oVar5.getClass();
                                webView3.setWebChromeClient(p0Var);
                                listQ4 = j1.f.C(null);
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
                        case 4:
                            o oVar6 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                oVar6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = j1.f.C(null);
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
                        case 5:
                            o oVar7 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                oVar7.getClass();
                                webView5.destroy();
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            o oVar8 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                oVar8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            o oVar9 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                oVar9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            o oVar10 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                oVar10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            o oVar11 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                oVar11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            o oVar12 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                oVar12.getClass();
                                listQ11 = j1.f.C(webView10.getUrl());
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            o oVar13 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                oVar13.getClass();
                                webView11.goForward();
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            o oVar14 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                oVar14.getClass();
                                listQ13 = j1.f.C(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            o oVar15 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                oVar15.getClass();
                                listQ14 = j1.f.C(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            o oVar16 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                oVar16.getClass();
                                webView14.goBack();
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            o oVar17 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                oVar17.getClass();
                                webView15.reload();
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        case 16:
                            o oVar18 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                oVar18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                        case 17:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.String");
                            hj.b bVar2 = new hj.b(bVar, 17);
                            oVar.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new k(bVar2, 1));
                            break;
                        case 18:
                            o oVar19 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                oVar19.getClass();
                                listQ18 = j1.f.C(webView17.getTitle());
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof a) {
                                    a aVar18 = th19;
                                    listQ18 = xj.o.Q(aVar18.f50793a, aVar18.f50794b, aVar18.f50795c);
                                } else {
                                    listQ18 = xj.o.Q(th19.getClass().getSimpleName(), th19.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            bVar.e(listQ18);
                            break;
                        case 19:
                            o oVar20 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                oVar20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = j1.f.C(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof a) {
                                    a aVar19 = th20;
                                    listQ19 = xj.o.Q(aVar19.f50793a, aVar19.f50794b, aVar19.f50795c);
                                } else {
                                    listQ19 = xj.o.Q(th20.getClass().getSimpleName(), th20.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            bVar.e(listQ19);
                            break;
                        case 20:
                            o oVar21 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                oVar21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = j1.f.C(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof a) {
                                    a aVar20 = th21;
                                    listQ20 = xj.o.Q(aVar20.f50793a, aVar20.f50794b, aVar20.f50795c);
                                } else {
                                    listQ20 = xj.o.Q(th21.getClass().getSimpleName(), th21.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            bVar.e(listQ20);
                            break;
                        case 21:
                            o oVar22 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            s sVar = (s) obj35;
                            try {
                                oVar22.getClass();
                                webView19.addJavascriptInterface(sVar, sVar.f50902a);
                                listQ21 = j1.f.C(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof a) {
                                    a aVar21 = th22;
                                    listQ21 = xj.o.Q(aVar21.f50793a, aVar21.f50794b, aVar21.f50795c);
                                } else {
                                    listQ21 = xj.o.Q(th22.getClass().getSimpleName(), th22.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            bVar.e(listQ21);
                            break;
                        default:
                            o oVar23 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                oVar23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = j1.f.C(null);
                                break;
                            } catch (Throwable th23) {
                                if (th23 instanceof a) {
                                    a aVar22 = th23;
                                    listQ22 = xj.o.Q(aVar22.f50793a, aVar22.f50794b, aVar22.f50795c);
                                } else {
                                    listQ22 = xj.o.Q(th23.getClass().getSimpleName(), th23.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th23), th23.getCause()));
                                }
                            }
                            bVar.e(listQ22);
                            break;
                    }
                }
            });
        } else {
            gVar4.C(null);
        }
        g gVar5 = new g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.loadUrl", hVar, obj);
        if (oVar != null) {
            final int i14 = 8;
            gVar5.C(new xi.b() { // from class: tj.h0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i14) {
                        case 0:
                            o oVar2 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar2.f50873a.f23783c).a(((Long) obj3).longValue(), oVar2.a());
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
                            o oVar3 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                oVar3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                        case 2:
                            o oVar4 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar4.f50873a.f23783c).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            o oVar5 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            p0 p0Var = (p0) list3.get(1);
                            try {
                                oVar5.getClass();
                                webView3.setWebChromeClient(p0Var);
                                listQ4 = j1.f.C(null);
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
                        case 4:
                            o oVar6 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                oVar6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = j1.f.C(null);
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
                        case 5:
                            o oVar7 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                oVar7.getClass();
                                webView5.destroy();
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            o oVar8 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                oVar8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            o oVar9 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                oVar9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            o oVar10 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                oVar10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            o oVar11 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                oVar11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            o oVar12 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                oVar12.getClass();
                                listQ11 = j1.f.C(webView10.getUrl());
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            o oVar13 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                oVar13.getClass();
                                webView11.goForward();
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            o oVar14 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                oVar14.getClass();
                                listQ13 = j1.f.C(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            o oVar15 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                oVar15.getClass();
                                listQ14 = j1.f.C(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            o oVar16 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                oVar16.getClass();
                                webView14.goBack();
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            o oVar17 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                oVar17.getClass();
                                webView15.reload();
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        case 16:
                            o oVar18 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                oVar18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                        case 17:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.String");
                            hj.b bVar2 = new hj.b(bVar, 17);
                            oVar.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new k(bVar2, 1));
                            break;
                        case 18:
                            o oVar19 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                oVar19.getClass();
                                listQ18 = j1.f.C(webView17.getTitle());
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof a) {
                                    a aVar18 = th19;
                                    listQ18 = xj.o.Q(aVar18.f50793a, aVar18.f50794b, aVar18.f50795c);
                                } else {
                                    listQ18 = xj.o.Q(th19.getClass().getSimpleName(), th19.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            bVar.e(listQ18);
                            break;
                        case 19:
                            o oVar20 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                oVar20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = j1.f.C(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof a) {
                                    a aVar19 = th20;
                                    listQ19 = xj.o.Q(aVar19.f50793a, aVar19.f50794b, aVar19.f50795c);
                                } else {
                                    listQ19 = xj.o.Q(th20.getClass().getSimpleName(), th20.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            bVar.e(listQ19);
                            break;
                        case 20:
                            o oVar21 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                oVar21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = j1.f.C(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof a) {
                                    a aVar20 = th21;
                                    listQ20 = xj.o.Q(aVar20.f50793a, aVar20.f50794b, aVar20.f50795c);
                                } else {
                                    listQ20 = xj.o.Q(th21.getClass().getSimpleName(), th21.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            bVar.e(listQ20);
                            break;
                        case 21:
                            o oVar22 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            s sVar = (s) obj35;
                            try {
                                oVar22.getClass();
                                webView19.addJavascriptInterface(sVar, sVar.f50902a);
                                listQ21 = j1.f.C(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof a) {
                                    a aVar21 = th22;
                                    listQ21 = xj.o.Q(aVar21.f50793a, aVar21.f50794b, aVar21.f50795c);
                                } else {
                                    listQ21 = xj.o.Q(th22.getClass().getSimpleName(), th22.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            bVar.e(listQ21);
                            break;
                        default:
                            o oVar23 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                oVar23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = j1.f.C(null);
                                break;
                            } catch (Throwable th23) {
                                if (th23 instanceof a) {
                                    a aVar22 = th23;
                                    listQ22 = xj.o.Q(aVar22.f50793a, aVar22.f50794b, aVar22.f50795c);
                                } else {
                                    listQ22 = xj.o.Q(th23.getClass().getSimpleName(), th23.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th23), th23.getCause()));
                                }
                            }
                            bVar.e(listQ22);
                            break;
                    }
                }
            });
        } else {
            gVar5.C(null);
        }
        g gVar6 = new g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.postUrl", hVar, obj);
        if (oVar != null) {
            final int i15 = 9;
            gVar6.C(new xi.b() { // from class: tj.h0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i15) {
                        case 0:
                            o oVar2 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar2.f50873a.f23783c).a(((Long) obj3).longValue(), oVar2.a());
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
                            o oVar3 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                oVar3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                        case 2:
                            o oVar4 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar4.f50873a.f23783c).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            o oVar5 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            p0 p0Var = (p0) list3.get(1);
                            try {
                                oVar5.getClass();
                                webView3.setWebChromeClient(p0Var);
                                listQ4 = j1.f.C(null);
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
                        case 4:
                            o oVar6 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                oVar6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = j1.f.C(null);
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
                        case 5:
                            o oVar7 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                oVar7.getClass();
                                webView5.destroy();
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            o oVar8 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                oVar8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            o oVar9 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                oVar9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            o oVar10 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                oVar10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            o oVar11 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                oVar11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            o oVar12 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                oVar12.getClass();
                                listQ11 = j1.f.C(webView10.getUrl());
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            o oVar13 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                oVar13.getClass();
                                webView11.goForward();
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            o oVar14 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                oVar14.getClass();
                                listQ13 = j1.f.C(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            o oVar15 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                oVar15.getClass();
                                listQ14 = j1.f.C(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            o oVar16 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                oVar16.getClass();
                                webView14.goBack();
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            o oVar17 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                oVar17.getClass();
                                webView15.reload();
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        case 16:
                            o oVar18 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                oVar18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                        case 17:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.String");
                            hj.b bVar2 = new hj.b(bVar, 17);
                            oVar.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new k(bVar2, 1));
                            break;
                        case 18:
                            o oVar19 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                oVar19.getClass();
                                listQ18 = j1.f.C(webView17.getTitle());
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof a) {
                                    a aVar18 = th19;
                                    listQ18 = xj.o.Q(aVar18.f50793a, aVar18.f50794b, aVar18.f50795c);
                                } else {
                                    listQ18 = xj.o.Q(th19.getClass().getSimpleName(), th19.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            bVar.e(listQ18);
                            break;
                        case 19:
                            o oVar20 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                oVar20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = j1.f.C(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof a) {
                                    a aVar19 = th20;
                                    listQ19 = xj.o.Q(aVar19.f50793a, aVar19.f50794b, aVar19.f50795c);
                                } else {
                                    listQ19 = xj.o.Q(th20.getClass().getSimpleName(), th20.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            bVar.e(listQ19);
                            break;
                        case 20:
                            o oVar21 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                oVar21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = j1.f.C(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof a) {
                                    a aVar20 = th21;
                                    listQ20 = xj.o.Q(aVar20.f50793a, aVar20.f50794b, aVar20.f50795c);
                                } else {
                                    listQ20 = xj.o.Q(th21.getClass().getSimpleName(), th21.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            bVar.e(listQ20);
                            break;
                        case 21:
                            o oVar22 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            s sVar = (s) obj35;
                            try {
                                oVar22.getClass();
                                webView19.addJavascriptInterface(sVar, sVar.f50902a);
                                listQ21 = j1.f.C(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof a) {
                                    a aVar21 = th22;
                                    listQ21 = xj.o.Q(aVar21.f50793a, aVar21.f50794b, aVar21.f50795c);
                                } else {
                                    listQ21 = xj.o.Q(th22.getClass().getSimpleName(), th22.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            bVar.e(listQ21);
                            break;
                        default:
                            o oVar23 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                oVar23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = j1.f.C(null);
                                break;
                            } catch (Throwable th23) {
                                if (th23 instanceof a) {
                                    a aVar22 = th23;
                                    listQ22 = xj.o.Q(aVar22.f50793a, aVar22.f50794b, aVar22.f50795c);
                                } else {
                                    listQ22 = xj.o.Q(th23.getClass().getSimpleName(), th23.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th23), th23.getCause()));
                                }
                            }
                            bVar.e(listQ22);
                            break;
                    }
                }
            });
        } else {
            gVar6.C(null);
        }
        g gVar7 = new g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.getUrl", hVar, obj);
        if (oVar != null) {
            final int i16 = 10;
            gVar7.C(new xi.b() { // from class: tj.h0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i16) {
                        case 0:
                            o oVar2 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar2.f50873a.f23783c).a(((Long) obj3).longValue(), oVar2.a());
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
                            o oVar3 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                oVar3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                        case 2:
                            o oVar4 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar4.f50873a.f23783c).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            o oVar5 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            p0 p0Var = (p0) list3.get(1);
                            try {
                                oVar5.getClass();
                                webView3.setWebChromeClient(p0Var);
                                listQ4 = j1.f.C(null);
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
                        case 4:
                            o oVar6 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                oVar6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = j1.f.C(null);
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
                        case 5:
                            o oVar7 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                oVar7.getClass();
                                webView5.destroy();
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            o oVar8 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                oVar8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            o oVar9 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                oVar9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            o oVar10 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                oVar10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            o oVar11 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                oVar11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            o oVar12 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                oVar12.getClass();
                                listQ11 = j1.f.C(webView10.getUrl());
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            o oVar13 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                oVar13.getClass();
                                webView11.goForward();
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            o oVar14 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                oVar14.getClass();
                                listQ13 = j1.f.C(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            o oVar15 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                oVar15.getClass();
                                listQ14 = j1.f.C(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            o oVar16 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                oVar16.getClass();
                                webView14.goBack();
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            o oVar17 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                oVar17.getClass();
                                webView15.reload();
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        case 16:
                            o oVar18 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                oVar18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                        case 17:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.String");
                            hj.b bVar2 = new hj.b(bVar, 17);
                            oVar.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new k(bVar2, 1));
                            break;
                        case 18:
                            o oVar19 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                oVar19.getClass();
                                listQ18 = j1.f.C(webView17.getTitle());
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof a) {
                                    a aVar18 = th19;
                                    listQ18 = xj.o.Q(aVar18.f50793a, aVar18.f50794b, aVar18.f50795c);
                                } else {
                                    listQ18 = xj.o.Q(th19.getClass().getSimpleName(), th19.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            bVar.e(listQ18);
                            break;
                        case 19:
                            o oVar20 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                oVar20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = j1.f.C(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof a) {
                                    a aVar19 = th20;
                                    listQ19 = xj.o.Q(aVar19.f50793a, aVar19.f50794b, aVar19.f50795c);
                                } else {
                                    listQ19 = xj.o.Q(th20.getClass().getSimpleName(), th20.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            bVar.e(listQ19);
                            break;
                        case 20:
                            o oVar21 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                oVar21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = j1.f.C(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof a) {
                                    a aVar20 = th21;
                                    listQ20 = xj.o.Q(aVar20.f50793a, aVar20.f50794b, aVar20.f50795c);
                                } else {
                                    listQ20 = xj.o.Q(th21.getClass().getSimpleName(), th21.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            bVar.e(listQ20);
                            break;
                        case 21:
                            o oVar22 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            s sVar = (s) obj35;
                            try {
                                oVar22.getClass();
                                webView19.addJavascriptInterface(sVar, sVar.f50902a);
                                listQ21 = j1.f.C(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof a) {
                                    a aVar21 = th22;
                                    listQ21 = xj.o.Q(aVar21.f50793a, aVar21.f50794b, aVar21.f50795c);
                                } else {
                                    listQ21 = xj.o.Q(th22.getClass().getSimpleName(), th22.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            bVar.e(listQ21);
                            break;
                        default:
                            o oVar23 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                oVar23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = j1.f.C(null);
                                break;
                            } catch (Throwable th23) {
                                if (th23 instanceof a) {
                                    a aVar22 = th23;
                                    listQ22 = xj.o.Q(aVar22.f50793a, aVar22.f50794b, aVar22.f50795c);
                                } else {
                                    listQ22 = xj.o.Q(th23.getClass().getSimpleName(), th23.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th23), th23.getCause()));
                                }
                            }
                            bVar.e(listQ22);
                            break;
                    }
                }
            });
        } else {
            gVar7.C(null);
        }
        g gVar8 = new g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoBack", hVar, obj);
        if (oVar != null) {
            final int i17 = 12;
            gVar8.C(new xi.b() { // from class: tj.h0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i17) {
                        case 0:
                            o oVar2 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar2.f50873a.f23783c).a(((Long) obj3).longValue(), oVar2.a());
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
                            o oVar3 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                oVar3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                        case 2:
                            o oVar4 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar4.f50873a.f23783c).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            o oVar5 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            p0 p0Var = (p0) list3.get(1);
                            try {
                                oVar5.getClass();
                                webView3.setWebChromeClient(p0Var);
                                listQ4 = j1.f.C(null);
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
                        case 4:
                            o oVar6 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                oVar6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = j1.f.C(null);
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
                        case 5:
                            o oVar7 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                oVar7.getClass();
                                webView5.destroy();
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            o oVar8 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                oVar8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            o oVar9 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                oVar9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            o oVar10 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                oVar10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            o oVar11 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                oVar11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            o oVar12 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                oVar12.getClass();
                                listQ11 = j1.f.C(webView10.getUrl());
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            o oVar13 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                oVar13.getClass();
                                webView11.goForward();
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            o oVar14 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                oVar14.getClass();
                                listQ13 = j1.f.C(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            o oVar15 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                oVar15.getClass();
                                listQ14 = j1.f.C(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            o oVar16 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                oVar16.getClass();
                                webView14.goBack();
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            o oVar17 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                oVar17.getClass();
                                webView15.reload();
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        case 16:
                            o oVar18 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                oVar18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                        case 17:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.String");
                            hj.b bVar2 = new hj.b(bVar, 17);
                            oVar.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new k(bVar2, 1));
                            break;
                        case 18:
                            o oVar19 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                oVar19.getClass();
                                listQ18 = j1.f.C(webView17.getTitle());
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof a) {
                                    a aVar18 = th19;
                                    listQ18 = xj.o.Q(aVar18.f50793a, aVar18.f50794b, aVar18.f50795c);
                                } else {
                                    listQ18 = xj.o.Q(th19.getClass().getSimpleName(), th19.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            bVar.e(listQ18);
                            break;
                        case 19:
                            o oVar20 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                oVar20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = j1.f.C(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof a) {
                                    a aVar19 = th20;
                                    listQ19 = xj.o.Q(aVar19.f50793a, aVar19.f50794b, aVar19.f50795c);
                                } else {
                                    listQ19 = xj.o.Q(th20.getClass().getSimpleName(), th20.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            bVar.e(listQ19);
                            break;
                        case 20:
                            o oVar21 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                oVar21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = j1.f.C(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof a) {
                                    a aVar20 = th21;
                                    listQ20 = xj.o.Q(aVar20.f50793a, aVar20.f50794b, aVar20.f50795c);
                                } else {
                                    listQ20 = xj.o.Q(th21.getClass().getSimpleName(), th21.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            bVar.e(listQ20);
                            break;
                        case 21:
                            o oVar22 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            s sVar = (s) obj35;
                            try {
                                oVar22.getClass();
                                webView19.addJavascriptInterface(sVar, sVar.f50902a);
                                listQ21 = j1.f.C(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof a) {
                                    a aVar21 = th22;
                                    listQ21 = xj.o.Q(aVar21.f50793a, aVar21.f50794b, aVar21.f50795c);
                                } else {
                                    listQ21 = xj.o.Q(th22.getClass().getSimpleName(), th22.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            bVar.e(listQ21);
                            break;
                        default:
                            o oVar23 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                oVar23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = j1.f.C(null);
                                break;
                            } catch (Throwable th23) {
                                if (th23 instanceof a) {
                                    a aVar22 = th23;
                                    listQ22 = xj.o.Q(aVar22.f50793a, aVar22.f50794b, aVar22.f50795c);
                                } else {
                                    listQ22 = xj.o.Q(th23.getClass().getSimpleName(), th23.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th23), th23.getCause()));
                                }
                            }
                            bVar.e(listQ22);
                            break;
                    }
                }
            });
        } else {
            gVar8.C(null);
        }
        g gVar9 = new g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoForward", hVar, obj);
        if (oVar != null) {
            final int i18 = 13;
            gVar9.C(new xi.b() { // from class: tj.h0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i18) {
                        case 0:
                            o oVar2 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar2.f50873a.f23783c).a(((Long) obj3).longValue(), oVar2.a());
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
                            o oVar3 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                oVar3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                        case 2:
                            o oVar4 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar4.f50873a.f23783c).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            o oVar5 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            p0 p0Var = (p0) list3.get(1);
                            try {
                                oVar5.getClass();
                                webView3.setWebChromeClient(p0Var);
                                listQ4 = j1.f.C(null);
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
                        case 4:
                            o oVar6 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                oVar6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = j1.f.C(null);
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
                        case 5:
                            o oVar7 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                oVar7.getClass();
                                webView5.destroy();
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            o oVar8 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                oVar8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            o oVar9 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                oVar9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            o oVar10 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                oVar10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            o oVar11 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                oVar11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            o oVar12 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                oVar12.getClass();
                                listQ11 = j1.f.C(webView10.getUrl());
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            o oVar13 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                oVar13.getClass();
                                webView11.goForward();
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            o oVar14 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                oVar14.getClass();
                                listQ13 = j1.f.C(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            o oVar15 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                oVar15.getClass();
                                listQ14 = j1.f.C(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            o oVar16 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                oVar16.getClass();
                                webView14.goBack();
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            o oVar17 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                oVar17.getClass();
                                webView15.reload();
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        case 16:
                            o oVar18 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                oVar18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                        case 17:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.String");
                            hj.b bVar2 = new hj.b(bVar, 17);
                            oVar.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new k(bVar2, 1));
                            break;
                        case 18:
                            o oVar19 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                oVar19.getClass();
                                listQ18 = j1.f.C(webView17.getTitle());
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof a) {
                                    a aVar18 = th19;
                                    listQ18 = xj.o.Q(aVar18.f50793a, aVar18.f50794b, aVar18.f50795c);
                                } else {
                                    listQ18 = xj.o.Q(th19.getClass().getSimpleName(), th19.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            bVar.e(listQ18);
                            break;
                        case 19:
                            o oVar20 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                oVar20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = j1.f.C(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof a) {
                                    a aVar19 = th20;
                                    listQ19 = xj.o.Q(aVar19.f50793a, aVar19.f50794b, aVar19.f50795c);
                                } else {
                                    listQ19 = xj.o.Q(th20.getClass().getSimpleName(), th20.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            bVar.e(listQ19);
                            break;
                        case 20:
                            o oVar21 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                oVar21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = j1.f.C(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof a) {
                                    a aVar20 = th21;
                                    listQ20 = xj.o.Q(aVar20.f50793a, aVar20.f50794b, aVar20.f50795c);
                                } else {
                                    listQ20 = xj.o.Q(th21.getClass().getSimpleName(), th21.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            bVar.e(listQ20);
                            break;
                        case 21:
                            o oVar22 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            s sVar = (s) obj35;
                            try {
                                oVar22.getClass();
                                webView19.addJavascriptInterface(sVar, sVar.f50902a);
                                listQ21 = j1.f.C(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof a) {
                                    a aVar21 = th22;
                                    listQ21 = xj.o.Q(aVar21.f50793a, aVar21.f50794b, aVar21.f50795c);
                                } else {
                                    listQ21 = xj.o.Q(th22.getClass().getSimpleName(), th22.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            bVar.e(listQ21);
                            break;
                        default:
                            o oVar23 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                oVar23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = j1.f.C(null);
                                break;
                            } catch (Throwable th23) {
                                if (th23 instanceof a) {
                                    a aVar22 = th23;
                                    listQ22 = xj.o.Q(aVar22.f50793a, aVar22.f50794b, aVar22.f50795c);
                                } else {
                                    listQ22 = xj.o.Q(th23.getClass().getSimpleName(), th23.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th23), th23.getCause()));
                                }
                            }
                            bVar.e(listQ22);
                            break;
                    }
                }
            });
        } else {
            gVar9.C(null);
        }
        g gVar10 = new g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.goBack", hVar, obj);
        if (oVar != null) {
            final int i19 = 14;
            gVar10.C(new xi.b() { // from class: tj.h0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i19) {
                        case 0:
                            o oVar2 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar2.f50873a.f23783c).a(((Long) obj3).longValue(), oVar2.a());
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
                            o oVar3 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                oVar3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                        case 2:
                            o oVar4 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar4.f50873a.f23783c).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            o oVar5 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            p0 p0Var = (p0) list3.get(1);
                            try {
                                oVar5.getClass();
                                webView3.setWebChromeClient(p0Var);
                                listQ4 = j1.f.C(null);
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
                        case 4:
                            o oVar6 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                oVar6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = j1.f.C(null);
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
                        case 5:
                            o oVar7 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                oVar7.getClass();
                                webView5.destroy();
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            o oVar8 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                oVar8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            o oVar9 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                oVar9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            o oVar10 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                oVar10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            o oVar11 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                oVar11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            o oVar12 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                oVar12.getClass();
                                listQ11 = j1.f.C(webView10.getUrl());
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            o oVar13 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                oVar13.getClass();
                                webView11.goForward();
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            o oVar14 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                oVar14.getClass();
                                listQ13 = j1.f.C(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            o oVar15 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                oVar15.getClass();
                                listQ14 = j1.f.C(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            o oVar16 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                oVar16.getClass();
                                webView14.goBack();
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            o oVar17 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                oVar17.getClass();
                                webView15.reload();
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        case 16:
                            o oVar18 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                oVar18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                        case 17:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.String");
                            hj.b bVar2 = new hj.b(bVar, 17);
                            oVar.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new k(bVar2, 1));
                            break;
                        case 18:
                            o oVar19 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                oVar19.getClass();
                                listQ18 = j1.f.C(webView17.getTitle());
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof a) {
                                    a aVar18 = th19;
                                    listQ18 = xj.o.Q(aVar18.f50793a, aVar18.f50794b, aVar18.f50795c);
                                } else {
                                    listQ18 = xj.o.Q(th19.getClass().getSimpleName(), th19.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            bVar.e(listQ18);
                            break;
                        case 19:
                            o oVar20 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                oVar20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = j1.f.C(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof a) {
                                    a aVar19 = th20;
                                    listQ19 = xj.o.Q(aVar19.f50793a, aVar19.f50794b, aVar19.f50795c);
                                } else {
                                    listQ19 = xj.o.Q(th20.getClass().getSimpleName(), th20.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            bVar.e(listQ19);
                            break;
                        case 20:
                            o oVar21 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                oVar21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = j1.f.C(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof a) {
                                    a aVar20 = th21;
                                    listQ20 = xj.o.Q(aVar20.f50793a, aVar20.f50794b, aVar20.f50795c);
                                } else {
                                    listQ20 = xj.o.Q(th21.getClass().getSimpleName(), th21.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            bVar.e(listQ20);
                            break;
                        case 21:
                            o oVar22 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            s sVar = (s) obj35;
                            try {
                                oVar22.getClass();
                                webView19.addJavascriptInterface(sVar, sVar.f50902a);
                                listQ21 = j1.f.C(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof a) {
                                    a aVar21 = th22;
                                    listQ21 = xj.o.Q(aVar21.f50793a, aVar21.f50794b, aVar21.f50795c);
                                } else {
                                    listQ21 = xj.o.Q(th22.getClass().getSimpleName(), th22.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            bVar.e(listQ21);
                            break;
                        default:
                            o oVar23 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                oVar23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = j1.f.C(null);
                                break;
                            } catch (Throwable th23) {
                                if (th23 instanceof a) {
                                    a aVar22 = th23;
                                    listQ22 = xj.o.Q(aVar22.f50793a, aVar22.f50794b, aVar22.f50795c);
                                } else {
                                    listQ22 = xj.o.Q(th23.getClass().getSimpleName(), th23.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th23), th23.getCause()));
                                }
                            }
                            bVar.e(listQ22);
                            break;
                    }
                }
            });
        } else {
            gVar10.C(null);
        }
        g gVar11 = new g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.goForward", hVar, obj);
        if (oVar != null) {
            final int i20 = 11;
            gVar11.C(new xi.b() { // from class: tj.h0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i20) {
                        case 0:
                            o oVar2 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar2.f50873a.f23783c).a(((Long) obj3).longValue(), oVar2.a());
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
                            o oVar3 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                oVar3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                        case 2:
                            o oVar4 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar4.f50873a.f23783c).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            o oVar5 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            p0 p0Var = (p0) list3.get(1);
                            try {
                                oVar5.getClass();
                                webView3.setWebChromeClient(p0Var);
                                listQ4 = j1.f.C(null);
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
                        case 4:
                            o oVar6 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                oVar6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = j1.f.C(null);
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
                        case 5:
                            o oVar7 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                oVar7.getClass();
                                webView5.destroy();
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            o oVar8 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                oVar8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            o oVar9 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                oVar9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            o oVar10 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                oVar10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            o oVar11 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                oVar11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            o oVar12 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                oVar12.getClass();
                                listQ11 = j1.f.C(webView10.getUrl());
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            o oVar13 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                oVar13.getClass();
                                webView11.goForward();
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            o oVar14 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                oVar14.getClass();
                                listQ13 = j1.f.C(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            o oVar15 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                oVar15.getClass();
                                listQ14 = j1.f.C(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            o oVar16 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                oVar16.getClass();
                                webView14.goBack();
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            o oVar17 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                oVar17.getClass();
                                webView15.reload();
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        case 16:
                            o oVar18 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                oVar18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                        case 17:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.String");
                            hj.b bVar2 = new hj.b(bVar, 17);
                            oVar.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new k(bVar2, 1));
                            break;
                        case 18:
                            o oVar19 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                oVar19.getClass();
                                listQ18 = j1.f.C(webView17.getTitle());
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof a) {
                                    a aVar18 = th19;
                                    listQ18 = xj.o.Q(aVar18.f50793a, aVar18.f50794b, aVar18.f50795c);
                                } else {
                                    listQ18 = xj.o.Q(th19.getClass().getSimpleName(), th19.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            bVar.e(listQ18);
                            break;
                        case 19:
                            o oVar20 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                oVar20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = j1.f.C(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof a) {
                                    a aVar19 = th20;
                                    listQ19 = xj.o.Q(aVar19.f50793a, aVar19.f50794b, aVar19.f50795c);
                                } else {
                                    listQ19 = xj.o.Q(th20.getClass().getSimpleName(), th20.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            bVar.e(listQ19);
                            break;
                        case 20:
                            o oVar21 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                oVar21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = j1.f.C(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof a) {
                                    a aVar20 = th21;
                                    listQ20 = xj.o.Q(aVar20.f50793a, aVar20.f50794b, aVar20.f50795c);
                                } else {
                                    listQ20 = xj.o.Q(th21.getClass().getSimpleName(), th21.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            bVar.e(listQ20);
                            break;
                        case 21:
                            o oVar22 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            s sVar = (s) obj35;
                            try {
                                oVar22.getClass();
                                webView19.addJavascriptInterface(sVar, sVar.f50902a);
                                listQ21 = j1.f.C(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof a) {
                                    a aVar21 = th22;
                                    listQ21 = xj.o.Q(aVar21.f50793a, aVar21.f50794b, aVar21.f50795c);
                                } else {
                                    listQ21 = xj.o.Q(th22.getClass().getSimpleName(), th22.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            bVar.e(listQ21);
                            break;
                        default:
                            o oVar23 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                oVar23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = j1.f.C(null);
                                break;
                            } catch (Throwable th23) {
                                if (th23 instanceof a) {
                                    a aVar22 = th23;
                                    listQ22 = xj.o.Q(aVar22.f50793a, aVar22.f50794b, aVar22.f50795c);
                                } else {
                                    listQ22 = xj.o.Q(th23.getClass().getSimpleName(), th23.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th23), th23.getCause()));
                                }
                            }
                            bVar.e(listQ22);
                            break;
                    }
                }
            });
        } else {
            gVar11.C(null);
        }
        g gVar12 = new g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.reload", hVar, obj);
        if (oVar != null) {
            final int i21 = 15;
            gVar12.C(new xi.b() { // from class: tj.h0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i21) {
                        case 0:
                            o oVar2 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar2.f50873a.f23783c).a(((Long) obj3).longValue(), oVar2.a());
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
                            o oVar3 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                oVar3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                        case 2:
                            o oVar4 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar4.f50873a.f23783c).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            o oVar5 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            p0 p0Var = (p0) list3.get(1);
                            try {
                                oVar5.getClass();
                                webView3.setWebChromeClient(p0Var);
                                listQ4 = j1.f.C(null);
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
                        case 4:
                            o oVar6 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                oVar6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = j1.f.C(null);
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
                        case 5:
                            o oVar7 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                oVar7.getClass();
                                webView5.destroy();
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            o oVar8 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                oVar8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            o oVar9 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                oVar9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            o oVar10 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                oVar10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            o oVar11 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                oVar11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            o oVar12 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                oVar12.getClass();
                                listQ11 = j1.f.C(webView10.getUrl());
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            o oVar13 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                oVar13.getClass();
                                webView11.goForward();
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            o oVar14 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                oVar14.getClass();
                                listQ13 = j1.f.C(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            o oVar15 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                oVar15.getClass();
                                listQ14 = j1.f.C(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            o oVar16 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                oVar16.getClass();
                                webView14.goBack();
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            o oVar17 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                oVar17.getClass();
                                webView15.reload();
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        case 16:
                            o oVar18 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                oVar18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                        case 17:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.String");
                            hj.b bVar2 = new hj.b(bVar, 17);
                            oVar.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new k(bVar2, 1));
                            break;
                        case 18:
                            o oVar19 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                oVar19.getClass();
                                listQ18 = j1.f.C(webView17.getTitle());
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof a) {
                                    a aVar18 = th19;
                                    listQ18 = xj.o.Q(aVar18.f50793a, aVar18.f50794b, aVar18.f50795c);
                                } else {
                                    listQ18 = xj.o.Q(th19.getClass().getSimpleName(), th19.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            bVar.e(listQ18);
                            break;
                        case 19:
                            o oVar20 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                oVar20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = j1.f.C(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof a) {
                                    a aVar19 = th20;
                                    listQ19 = xj.o.Q(aVar19.f50793a, aVar19.f50794b, aVar19.f50795c);
                                } else {
                                    listQ19 = xj.o.Q(th20.getClass().getSimpleName(), th20.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            bVar.e(listQ19);
                            break;
                        case 20:
                            o oVar21 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                oVar21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = j1.f.C(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof a) {
                                    a aVar20 = th21;
                                    listQ20 = xj.o.Q(aVar20.f50793a, aVar20.f50794b, aVar20.f50795c);
                                } else {
                                    listQ20 = xj.o.Q(th21.getClass().getSimpleName(), th21.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            bVar.e(listQ20);
                            break;
                        case 21:
                            o oVar22 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            s sVar = (s) obj35;
                            try {
                                oVar22.getClass();
                                webView19.addJavascriptInterface(sVar, sVar.f50902a);
                                listQ21 = j1.f.C(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof a) {
                                    a aVar21 = th22;
                                    listQ21 = xj.o.Q(aVar21.f50793a, aVar21.f50794b, aVar21.f50795c);
                                } else {
                                    listQ21 = xj.o.Q(th22.getClass().getSimpleName(), th22.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            bVar.e(listQ21);
                            break;
                        default:
                            o oVar23 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                oVar23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = j1.f.C(null);
                                break;
                            } catch (Throwable th23) {
                                if (th23 instanceof a) {
                                    a aVar22 = th23;
                                    listQ22 = xj.o.Q(aVar22.f50793a, aVar22.f50794b, aVar22.f50795c);
                                } else {
                                    listQ22 = xj.o.Q(th23.getClass().getSimpleName(), th23.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th23), th23.getCause()));
                                }
                            }
                            bVar.e(listQ22);
                            break;
                    }
                }
            });
        } else {
            gVar12.C(null);
        }
        g gVar13 = new g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.clearCache", hVar, obj);
        if (oVar != null) {
            final int i22 = 16;
            gVar13.C(new xi.b() { // from class: tj.h0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i22) {
                        case 0:
                            o oVar2 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar2.f50873a.f23783c).a(((Long) obj3).longValue(), oVar2.a());
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
                            o oVar3 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                oVar3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                        case 2:
                            o oVar4 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar4.f50873a.f23783c).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            o oVar5 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            p0 p0Var = (p0) list3.get(1);
                            try {
                                oVar5.getClass();
                                webView3.setWebChromeClient(p0Var);
                                listQ4 = j1.f.C(null);
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
                        case 4:
                            o oVar6 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                oVar6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = j1.f.C(null);
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
                        case 5:
                            o oVar7 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                oVar7.getClass();
                                webView5.destroy();
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            o oVar8 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                oVar8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            o oVar9 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                oVar9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            o oVar10 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                oVar10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            o oVar11 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                oVar11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            o oVar12 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                oVar12.getClass();
                                listQ11 = j1.f.C(webView10.getUrl());
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            o oVar13 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                oVar13.getClass();
                                webView11.goForward();
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            o oVar14 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                oVar14.getClass();
                                listQ13 = j1.f.C(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            o oVar15 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                oVar15.getClass();
                                listQ14 = j1.f.C(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            o oVar16 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                oVar16.getClass();
                                webView14.goBack();
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            o oVar17 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                oVar17.getClass();
                                webView15.reload();
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        case 16:
                            o oVar18 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                oVar18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                        case 17:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.String");
                            hj.b bVar2 = new hj.b(bVar, 17);
                            oVar.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new k(bVar2, 1));
                            break;
                        case 18:
                            o oVar19 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                oVar19.getClass();
                                listQ18 = j1.f.C(webView17.getTitle());
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof a) {
                                    a aVar18 = th19;
                                    listQ18 = xj.o.Q(aVar18.f50793a, aVar18.f50794b, aVar18.f50795c);
                                } else {
                                    listQ18 = xj.o.Q(th19.getClass().getSimpleName(), th19.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            bVar.e(listQ18);
                            break;
                        case 19:
                            o oVar20 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                oVar20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = j1.f.C(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof a) {
                                    a aVar19 = th20;
                                    listQ19 = xj.o.Q(aVar19.f50793a, aVar19.f50794b, aVar19.f50795c);
                                } else {
                                    listQ19 = xj.o.Q(th20.getClass().getSimpleName(), th20.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            bVar.e(listQ19);
                            break;
                        case 20:
                            o oVar21 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                oVar21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = j1.f.C(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof a) {
                                    a aVar20 = th21;
                                    listQ20 = xj.o.Q(aVar20.f50793a, aVar20.f50794b, aVar20.f50795c);
                                } else {
                                    listQ20 = xj.o.Q(th21.getClass().getSimpleName(), th21.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            bVar.e(listQ20);
                            break;
                        case 21:
                            o oVar22 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            s sVar = (s) obj35;
                            try {
                                oVar22.getClass();
                                webView19.addJavascriptInterface(sVar, sVar.f50902a);
                                listQ21 = j1.f.C(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof a) {
                                    a aVar21 = th22;
                                    listQ21 = xj.o.Q(aVar21.f50793a, aVar21.f50794b, aVar21.f50795c);
                                } else {
                                    listQ21 = xj.o.Q(th22.getClass().getSimpleName(), th22.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            bVar.e(listQ21);
                            break;
                        default:
                            o oVar23 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                oVar23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = j1.f.C(null);
                                break;
                            } catch (Throwable th23) {
                                if (th23 instanceof a) {
                                    a aVar22 = th23;
                                    listQ22 = xj.o.Q(aVar22.f50793a, aVar22.f50794b, aVar22.f50795c);
                                } else {
                                    listQ22 = xj.o.Q(th23.getClass().getSimpleName(), th23.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th23), th23.getCause()));
                                }
                            }
                            bVar.e(listQ22);
                            break;
                    }
                }
            });
        } else {
            gVar13.C(null);
        }
        g gVar14 = new g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.evaluateJavascript", hVar, obj);
        if (oVar != null) {
            final int i23 = 17;
            gVar14.C(new xi.b() { // from class: tj.h0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i23) {
                        case 0:
                            o oVar2 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar2.f50873a.f23783c).a(((Long) obj3).longValue(), oVar2.a());
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
                            o oVar3 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                oVar3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                        case 2:
                            o oVar4 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar4.f50873a.f23783c).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            o oVar5 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            p0 p0Var = (p0) list3.get(1);
                            try {
                                oVar5.getClass();
                                webView3.setWebChromeClient(p0Var);
                                listQ4 = j1.f.C(null);
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
                        case 4:
                            o oVar6 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                oVar6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = j1.f.C(null);
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
                        case 5:
                            o oVar7 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                oVar7.getClass();
                                webView5.destroy();
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            o oVar8 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                oVar8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            o oVar9 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                oVar9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            o oVar10 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                oVar10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            o oVar11 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                oVar11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            o oVar12 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                oVar12.getClass();
                                listQ11 = j1.f.C(webView10.getUrl());
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            o oVar13 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                oVar13.getClass();
                                webView11.goForward();
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            o oVar14 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                oVar14.getClass();
                                listQ13 = j1.f.C(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            o oVar15 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                oVar15.getClass();
                                listQ14 = j1.f.C(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            o oVar16 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                oVar16.getClass();
                                webView14.goBack();
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            o oVar17 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                oVar17.getClass();
                                webView15.reload();
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        case 16:
                            o oVar18 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                oVar18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                        case 17:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.String");
                            hj.b bVar2 = new hj.b(bVar, 17);
                            oVar.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new k(bVar2, 1));
                            break;
                        case 18:
                            o oVar19 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                oVar19.getClass();
                                listQ18 = j1.f.C(webView17.getTitle());
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof a) {
                                    a aVar18 = th19;
                                    listQ18 = xj.o.Q(aVar18.f50793a, aVar18.f50794b, aVar18.f50795c);
                                } else {
                                    listQ18 = xj.o.Q(th19.getClass().getSimpleName(), th19.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            bVar.e(listQ18);
                            break;
                        case 19:
                            o oVar20 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                oVar20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = j1.f.C(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof a) {
                                    a aVar19 = th20;
                                    listQ19 = xj.o.Q(aVar19.f50793a, aVar19.f50794b, aVar19.f50795c);
                                } else {
                                    listQ19 = xj.o.Q(th20.getClass().getSimpleName(), th20.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            bVar.e(listQ19);
                            break;
                        case 20:
                            o oVar21 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                oVar21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = j1.f.C(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof a) {
                                    a aVar20 = th21;
                                    listQ20 = xj.o.Q(aVar20.f50793a, aVar20.f50794b, aVar20.f50795c);
                                } else {
                                    listQ20 = xj.o.Q(th21.getClass().getSimpleName(), th21.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            bVar.e(listQ20);
                            break;
                        case 21:
                            o oVar22 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            s sVar = (s) obj35;
                            try {
                                oVar22.getClass();
                                webView19.addJavascriptInterface(sVar, sVar.f50902a);
                                listQ21 = j1.f.C(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof a) {
                                    a aVar21 = th22;
                                    listQ21 = xj.o.Q(aVar21.f50793a, aVar21.f50794b, aVar21.f50795c);
                                } else {
                                    listQ21 = xj.o.Q(th22.getClass().getSimpleName(), th22.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            bVar.e(listQ21);
                            break;
                        default:
                            o oVar23 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                oVar23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = j1.f.C(null);
                                break;
                            } catch (Throwable th23) {
                                if (th23 instanceof a) {
                                    a aVar22 = th23;
                                    listQ22 = xj.o.Q(aVar22.f50793a, aVar22.f50794b, aVar22.f50795c);
                                } else {
                                    listQ22 = xj.o.Q(th23.getClass().getSimpleName(), th23.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th23), th23.getCause()));
                                }
                            }
                            bVar.e(listQ22);
                            break;
                    }
                }
            });
        } else {
            gVar14.C(null);
        }
        g gVar15 = new g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.getTitle", hVar, obj);
        if (oVar != null) {
            final int i24 = 18;
            gVar15.C(new xi.b() { // from class: tj.h0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i24) {
                        case 0:
                            o oVar2 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar2.f50873a.f23783c).a(((Long) obj3).longValue(), oVar2.a());
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
                            o oVar3 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                oVar3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                        case 2:
                            o oVar4 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar4.f50873a.f23783c).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            o oVar5 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            p0 p0Var = (p0) list3.get(1);
                            try {
                                oVar5.getClass();
                                webView3.setWebChromeClient(p0Var);
                                listQ4 = j1.f.C(null);
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
                        case 4:
                            o oVar6 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                oVar6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = j1.f.C(null);
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
                        case 5:
                            o oVar7 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                oVar7.getClass();
                                webView5.destroy();
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            o oVar8 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                oVar8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            o oVar9 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                oVar9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            o oVar10 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                oVar10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            o oVar11 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                oVar11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            o oVar12 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                oVar12.getClass();
                                listQ11 = j1.f.C(webView10.getUrl());
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            o oVar13 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                oVar13.getClass();
                                webView11.goForward();
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            o oVar14 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                oVar14.getClass();
                                listQ13 = j1.f.C(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            o oVar15 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                oVar15.getClass();
                                listQ14 = j1.f.C(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            o oVar16 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                oVar16.getClass();
                                webView14.goBack();
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            o oVar17 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                oVar17.getClass();
                                webView15.reload();
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        case 16:
                            o oVar18 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                oVar18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                        case 17:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.String");
                            hj.b bVar2 = new hj.b(bVar, 17);
                            oVar.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new k(bVar2, 1));
                            break;
                        case 18:
                            o oVar19 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                oVar19.getClass();
                                listQ18 = j1.f.C(webView17.getTitle());
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof a) {
                                    a aVar18 = th19;
                                    listQ18 = xj.o.Q(aVar18.f50793a, aVar18.f50794b, aVar18.f50795c);
                                } else {
                                    listQ18 = xj.o.Q(th19.getClass().getSimpleName(), th19.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            bVar.e(listQ18);
                            break;
                        case 19:
                            o oVar20 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                oVar20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = j1.f.C(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof a) {
                                    a aVar19 = th20;
                                    listQ19 = xj.o.Q(aVar19.f50793a, aVar19.f50794b, aVar19.f50795c);
                                } else {
                                    listQ19 = xj.o.Q(th20.getClass().getSimpleName(), th20.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            bVar.e(listQ19);
                            break;
                        case 20:
                            o oVar21 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                oVar21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = j1.f.C(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof a) {
                                    a aVar20 = th21;
                                    listQ20 = xj.o.Q(aVar20.f50793a, aVar20.f50794b, aVar20.f50795c);
                                } else {
                                    listQ20 = xj.o.Q(th21.getClass().getSimpleName(), th21.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            bVar.e(listQ20);
                            break;
                        case 21:
                            o oVar22 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            s sVar = (s) obj35;
                            try {
                                oVar22.getClass();
                                webView19.addJavascriptInterface(sVar, sVar.f50902a);
                                listQ21 = j1.f.C(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof a) {
                                    a aVar21 = th22;
                                    listQ21 = xj.o.Q(aVar21.f50793a, aVar21.f50794b, aVar21.f50795c);
                                } else {
                                    listQ21 = xj.o.Q(th22.getClass().getSimpleName(), th22.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            bVar.e(listQ21);
                            break;
                        default:
                            o oVar23 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                oVar23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = j1.f.C(null);
                                break;
                            } catch (Throwable th23) {
                                if (th23 instanceof a) {
                                    a aVar22 = th23;
                                    listQ22 = xj.o.Q(aVar22.f50793a, aVar22.f50794b, aVar22.f50795c);
                                } else {
                                    listQ22 = xj.o.Q(th23.getClass().getSimpleName(), th23.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th23), th23.getCause()));
                                }
                            }
                            bVar.e(listQ22);
                            break;
                    }
                }
            });
        } else {
            gVar15.C(null);
        }
        g gVar16 = new g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebContentsDebuggingEnabled", hVar, obj);
        if (oVar != null) {
            final int i25 = 19;
            gVar16.C(new xi.b() { // from class: tj.h0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i25) {
                        case 0:
                            o oVar2 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar2.f50873a.f23783c).a(((Long) obj3).longValue(), oVar2.a());
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
                            o oVar3 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                oVar3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                        case 2:
                            o oVar4 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar4.f50873a.f23783c).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            o oVar5 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            p0 p0Var = (p0) list3.get(1);
                            try {
                                oVar5.getClass();
                                webView3.setWebChromeClient(p0Var);
                                listQ4 = j1.f.C(null);
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
                        case 4:
                            o oVar6 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                oVar6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = j1.f.C(null);
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
                        case 5:
                            o oVar7 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                oVar7.getClass();
                                webView5.destroy();
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            o oVar8 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                oVar8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            o oVar9 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                oVar9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            o oVar10 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                oVar10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            o oVar11 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                oVar11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            o oVar12 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                oVar12.getClass();
                                listQ11 = j1.f.C(webView10.getUrl());
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            o oVar13 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                oVar13.getClass();
                                webView11.goForward();
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            o oVar14 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                oVar14.getClass();
                                listQ13 = j1.f.C(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            o oVar15 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                oVar15.getClass();
                                listQ14 = j1.f.C(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            o oVar16 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                oVar16.getClass();
                                webView14.goBack();
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            o oVar17 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                oVar17.getClass();
                                webView15.reload();
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        case 16:
                            o oVar18 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                oVar18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                        case 17:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.String");
                            hj.b bVar2 = new hj.b(bVar, 17);
                            oVar.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new k(bVar2, 1));
                            break;
                        case 18:
                            o oVar19 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                oVar19.getClass();
                                listQ18 = j1.f.C(webView17.getTitle());
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof a) {
                                    a aVar18 = th19;
                                    listQ18 = xj.o.Q(aVar18.f50793a, aVar18.f50794b, aVar18.f50795c);
                                } else {
                                    listQ18 = xj.o.Q(th19.getClass().getSimpleName(), th19.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            bVar.e(listQ18);
                            break;
                        case 19:
                            o oVar20 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                oVar20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = j1.f.C(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof a) {
                                    a aVar19 = th20;
                                    listQ19 = xj.o.Q(aVar19.f50793a, aVar19.f50794b, aVar19.f50795c);
                                } else {
                                    listQ19 = xj.o.Q(th20.getClass().getSimpleName(), th20.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            bVar.e(listQ19);
                            break;
                        case 20:
                            o oVar21 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                oVar21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = j1.f.C(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof a) {
                                    a aVar20 = th21;
                                    listQ20 = xj.o.Q(aVar20.f50793a, aVar20.f50794b, aVar20.f50795c);
                                } else {
                                    listQ20 = xj.o.Q(th21.getClass().getSimpleName(), th21.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            bVar.e(listQ20);
                            break;
                        case 21:
                            o oVar22 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            s sVar = (s) obj35;
                            try {
                                oVar22.getClass();
                                webView19.addJavascriptInterface(sVar, sVar.f50902a);
                                listQ21 = j1.f.C(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof a) {
                                    a aVar21 = th22;
                                    listQ21 = xj.o.Q(aVar21.f50793a, aVar21.f50794b, aVar21.f50795c);
                                } else {
                                    listQ21 = xj.o.Q(th22.getClass().getSimpleName(), th22.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            bVar.e(listQ21);
                            break;
                        default:
                            o oVar23 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                oVar23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = j1.f.C(null);
                                break;
                            } catch (Throwable th23) {
                                if (th23 instanceof a) {
                                    a aVar22 = th23;
                                    listQ22 = xj.o.Q(aVar22.f50793a, aVar22.f50794b, aVar22.f50795c);
                                } else {
                                    listQ22 = xj.o.Q(th23.getClass().getSimpleName(), th23.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th23), th23.getCause()));
                                }
                            }
                            bVar.e(listQ22);
                            break;
                    }
                }
            });
        } else {
            gVar16.C(null);
        }
        g gVar17 = new g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebViewClient", hVar, obj);
        if (oVar != null) {
            final int i26 = 20;
            gVar17.C(new xi.b() { // from class: tj.h0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i26) {
                        case 0:
                            o oVar2 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar2.f50873a.f23783c).a(((Long) obj3).longValue(), oVar2.a());
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
                            o oVar3 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                oVar3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                        case 2:
                            o oVar4 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar4.f50873a.f23783c).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            o oVar5 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            p0 p0Var = (p0) list3.get(1);
                            try {
                                oVar5.getClass();
                                webView3.setWebChromeClient(p0Var);
                                listQ4 = j1.f.C(null);
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
                        case 4:
                            o oVar6 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                oVar6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = j1.f.C(null);
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
                        case 5:
                            o oVar7 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                oVar7.getClass();
                                webView5.destroy();
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            o oVar8 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                oVar8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            o oVar9 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                oVar9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            o oVar10 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                oVar10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            o oVar11 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                oVar11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            o oVar12 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                oVar12.getClass();
                                listQ11 = j1.f.C(webView10.getUrl());
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            o oVar13 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                oVar13.getClass();
                                webView11.goForward();
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            o oVar14 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                oVar14.getClass();
                                listQ13 = j1.f.C(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            o oVar15 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                oVar15.getClass();
                                listQ14 = j1.f.C(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            o oVar16 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                oVar16.getClass();
                                webView14.goBack();
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            o oVar17 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                oVar17.getClass();
                                webView15.reload();
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        case 16:
                            o oVar18 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                oVar18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                        case 17:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.String");
                            hj.b bVar2 = new hj.b(bVar, 17);
                            oVar.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new k(bVar2, 1));
                            break;
                        case 18:
                            o oVar19 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                oVar19.getClass();
                                listQ18 = j1.f.C(webView17.getTitle());
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof a) {
                                    a aVar18 = th19;
                                    listQ18 = xj.o.Q(aVar18.f50793a, aVar18.f50794b, aVar18.f50795c);
                                } else {
                                    listQ18 = xj.o.Q(th19.getClass().getSimpleName(), th19.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            bVar.e(listQ18);
                            break;
                        case 19:
                            o oVar20 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                oVar20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = j1.f.C(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof a) {
                                    a aVar19 = th20;
                                    listQ19 = xj.o.Q(aVar19.f50793a, aVar19.f50794b, aVar19.f50795c);
                                } else {
                                    listQ19 = xj.o.Q(th20.getClass().getSimpleName(), th20.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            bVar.e(listQ19);
                            break;
                        case 20:
                            o oVar21 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                oVar21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = j1.f.C(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof a) {
                                    a aVar20 = th21;
                                    listQ20 = xj.o.Q(aVar20.f50793a, aVar20.f50794b, aVar20.f50795c);
                                } else {
                                    listQ20 = xj.o.Q(th21.getClass().getSimpleName(), th21.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            bVar.e(listQ20);
                            break;
                        case 21:
                            o oVar22 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            s sVar = (s) obj35;
                            try {
                                oVar22.getClass();
                                webView19.addJavascriptInterface(sVar, sVar.f50902a);
                                listQ21 = j1.f.C(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof a) {
                                    a aVar21 = th22;
                                    listQ21 = xj.o.Q(aVar21.f50793a, aVar21.f50794b, aVar21.f50795c);
                                } else {
                                    listQ21 = xj.o.Q(th22.getClass().getSimpleName(), th22.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            bVar.e(listQ21);
                            break;
                        default:
                            o oVar23 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                oVar23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = j1.f.C(null);
                                break;
                            } catch (Throwable th23) {
                                if (th23 instanceof a) {
                                    a aVar22 = th23;
                                    listQ22 = xj.o.Q(aVar22.f50793a, aVar22.f50794b, aVar22.f50795c);
                                } else {
                                    listQ22 = xj.o.Q(th23.getClass().getSimpleName(), th23.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th23), th23.getCause()));
                                }
                            }
                            bVar.e(listQ22);
                            break;
                    }
                }
            });
        } else {
            gVar17.C(null);
        }
        g gVar18 = new g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.addJavaScriptChannel", hVar, obj);
        if (oVar != null) {
            final int i27 = 21;
            gVar18.C(new xi.b() { // from class: tj.h0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i27) {
                        case 0:
                            o oVar2 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar2.f50873a.f23783c).a(((Long) obj3).longValue(), oVar2.a());
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
                            o oVar3 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                oVar3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                        case 2:
                            o oVar4 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar4.f50873a.f23783c).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            o oVar5 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            p0 p0Var = (p0) list3.get(1);
                            try {
                                oVar5.getClass();
                                webView3.setWebChromeClient(p0Var);
                                listQ4 = j1.f.C(null);
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
                        case 4:
                            o oVar6 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                oVar6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = j1.f.C(null);
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
                        case 5:
                            o oVar7 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                oVar7.getClass();
                                webView5.destroy();
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            o oVar8 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                oVar8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            o oVar9 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                oVar9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            o oVar10 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                oVar10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            o oVar11 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                oVar11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            o oVar12 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                oVar12.getClass();
                                listQ11 = j1.f.C(webView10.getUrl());
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            o oVar13 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                oVar13.getClass();
                                webView11.goForward();
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            o oVar14 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                oVar14.getClass();
                                listQ13 = j1.f.C(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            o oVar15 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                oVar15.getClass();
                                listQ14 = j1.f.C(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            o oVar16 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                oVar16.getClass();
                                webView14.goBack();
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            o oVar17 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                oVar17.getClass();
                                webView15.reload();
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        case 16:
                            o oVar18 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                oVar18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                        case 17:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.String");
                            hj.b bVar2 = new hj.b(bVar, 17);
                            oVar.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new k(bVar2, 1));
                            break;
                        case 18:
                            o oVar19 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                oVar19.getClass();
                                listQ18 = j1.f.C(webView17.getTitle());
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof a) {
                                    a aVar18 = th19;
                                    listQ18 = xj.o.Q(aVar18.f50793a, aVar18.f50794b, aVar18.f50795c);
                                } else {
                                    listQ18 = xj.o.Q(th19.getClass().getSimpleName(), th19.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            bVar.e(listQ18);
                            break;
                        case 19:
                            o oVar20 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                oVar20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = j1.f.C(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof a) {
                                    a aVar19 = th20;
                                    listQ19 = xj.o.Q(aVar19.f50793a, aVar19.f50794b, aVar19.f50795c);
                                } else {
                                    listQ19 = xj.o.Q(th20.getClass().getSimpleName(), th20.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            bVar.e(listQ19);
                            break;
                        case 20:
                            o oVar21 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                oVar21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = j1.f.C(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof a) {
                                    a aVar20 = th21;
                                    listQ20 = xj.o.Q(aVar20.f50793a, aVar20.f50794b, aVar20.f50795c);
                                } else {
                                    listQ20 = xj.o.Q(th21.getClass().getSimpleName(), th21.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            bVar.e(listQ20);
                            break;
                        case 21:
                            o oVar22 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            s sVar = (s) obj35;
                            try {
                                oVar22.getClass();
                                webView19.addJavascriptInterface(sVar, sVar.f50902a);
                                listQ21 = j1.f.C(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof a) {
                                    a aVar21 = th22;
                                    listQ21 = xj.o.Q(aVar21.f50793a, aVar21.f50794b, aVar21.f50795c);
                                } else {
                                    listQ21 = xj.o.Q(th22.getClass().getSimpleName(), th22.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            bVar.e(listQ21);
                            break;
                        default:
                            o oVar23 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                oVar23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = j1.f.C(null);
                                break;
                            } catch (Throwable th23) {
                                if (th23 instanceof a) {
                                    a aVar22 = th23;
                                    listQ22 = xj.o.Q(aVar22.f50793a, aVar22.f50794b, aVar22.f50795c);
                                } else {
                                    listQ22 = xj.o.Q(th23.getClass().getSimpleName(), th23.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th23), th23.getCause()));
                                }
                            }
                            bVar.e(listQ22);
                            break;
                    }
                }
            });
        } else {
            gVar18.C(null);
        }
        g gVar19 = new g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.removeJavaScriptChannel", hVar, obj);
        if (oVar != null) {
            final int i28 = 22;
            gVar19.C(new xi.b() { // from class: tj.h0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i28) {
                        case 0:
                            o oVar2 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar2.f50873a.f23783c).a(((Long) obj3).longValue(), oVar2.a());
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
                            o oVar3 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                oVar3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                        case 2:
                            o oVar4 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar4.f50873a.f23783c).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            o oVar5 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            p0 p0Var = (p0) list3.get(1);
                            try {
                                oVar5.getClass();
                                webView3.setWebChromeClient(p0Var);
                                listQ4 = j1.f.C(null);
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
                        case 4:
                            o oVar6 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                oVar6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = j1.f.C(null);
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
                        case 5:
                            o oVar7 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                oVar7.getClass();
                                webView5.destroy();
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            o oVar8 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                oVar8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            o oVar9 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                oVar9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            o oVar10 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                oVar10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            o oVar11 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                oVar11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            o oVar12 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                oVar12.getClass();
                                listQ11 = j1.f.C(webView10.getUrl());
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            o oVar13 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                oVar13.getClass();
                                webView11.goForward();
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            o oVar14 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                oVar14.getClass();
                                listQ13 = j1.f.C(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            o oVar15 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                oVar15.getClass();
                                listQ14 = j1.f.C(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            o oVar16 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                oVar16.getClass();
                                webView14.goBack();
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            o oVar17 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                oVar17.getClass();
                                webView15.reload();
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        case 16:
                            o oVar18 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                oVar18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                        case 17:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.String");
                            hj.b bVar2 = new hj.b(bVar, 17);
                            oVar.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new k(bVar2, 1));
                            break;
                        case 18:
                            o oVar19 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                oVar19.getClass();
                                listQ18 = j1.f.C(webView17.getTitle());
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof a) {
                                    a aVar18 = th19;
                                    listQ18 = xj.o.Q(aVar18.f50793a, aVar18.f50794b, aVar18.f50795c);
                                } else {
                                    listQ18 = xj.o.Q(th19.getClass().getSimpleName(), th19.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            bVar.e(listQ18);
                            break;
                        case 19:
                            o oVar20 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                oVar20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = j1.f.C(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof a) {
                                    a aVar19 = th20;
                                    listQ19 = xj.o.Q(aVar19.f50793a, aVar19.f50794b, aVar19.f50795c);
                                } else {
                                    listQ19 = xj.o.Q(th20.getClass().getSimpleName(), th20.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            bVar.e(listQ19);
                            break;
                        case 20:
                            o oVar21 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                oVar21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = j1.f.C(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof a) {
                                    a aVar20 = th21;
                                    listQ20 = xj.o.Q(aVar20.f50793a, aVar20.f50794b, aVar20.f50795c);
                                } else {
                                    listQ20 = xj.o.Q(th21.getClass().getSimpleName(), th21.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            bVar.e(listQ20);
                            break;
                        case 21:
                            o oVar22 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            s sVar = (s) obj35;
                            try {
                                oVar22.getClass();
                                webView19.addJavascriptInterface(sVar, sVar.f50902a);
                                listQ21 = j1.f.C(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof a) {
                                    a aVar21 = th22;
                                    listQ21 = xj.o.Q(aVar21.f50793a, aVar21.f50794b, aVar21.f50795c);
                                } else {
                                    listQ21 = xj.o.Q(th22.getClass().getSimpleName(), th22.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            bVar.e(listQ21);
                            break;
                        default:
                            o oVar23 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                oVar23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = j1.f.C(null);
                                break;
                            } catch (Throwable th23) {
                                if (th23 instanceof a) {
                                    a aVar22 = th23;
                                    listQ22 = xj.o.Q(aVar22.f50793a, aVar22.f50794b, aVar22.f50795c);
                                } else {
                                    listQ22 = xj.o.Q(th23.getClass().getSimpleName(), th23.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th23), th23.getCause()));
                                }
                            }
                            bVar.e(listQ22);
                            break;
                    }
                }
            });
        } else {
            gVar19.C(null);
        }
        g gVar20 = new g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.setDownloadListener", hVar, obj);
        if (oVar != null) {
            final int i29 = 1;
            gVar20.C(new xi.b() { // from class: tj.h0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i29) {
                        case 0:
                            o oVar2 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar2.f50873a.f23783c).a(((Long) obj3).longValue(), oVar2.a());
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
                            o oVar3 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                oVar3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                        case 2:
                            o oVar4 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar4.f50873a.f23783c).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            o oVar5 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            p0 p0Var = (p0) list3.get(1);
                            try {
                                oVar5.getClass();
                                webView3.setWebChromeClient(p0Var);
                                listQ4 = j1.f.C(null);
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
                        case 4:
                            o oVar6 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                oVar6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = j1.f.C(null);
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
                        case 5:
                            o oVar7 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                oVar7.getClass();
                                webView5.destroy();
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            o oVar8 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                oVar8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            o oVar9 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                oVar9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            o oVar10 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                oVar10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            o oVar11 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                oVar11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            o oVar12 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                oVar12.getClass();
                                listQ11 = j1.f.C(webView10.getUrl());
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            o oVar13 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                oVar13.getClass();
                                webView11.goForward();
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            o oVar14 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                oVar14.getClass();
                                listQ13 = j1.f.C(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            o oVar15 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                oVar15.getClass();
                                listQ14 = j1.f.C(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            o oVar16 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                oVar16.getClass();
                                webView14.goBack();
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            o oVar17 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                oVar17.getClass();
                                webView15.reload();
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        case 16:
                            o oVar18 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                oVar18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                        case 17:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.String");
                            hj.b bVar2 = new hj.b(bVar, 17);
                            oVar.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new k(bVar2, 1));
                            break;
                        case 18:
                            o oVar19 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                oVar19.getClass();
                                listQ18 = j1.f.C(webView17.getTitle());
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof a) {
                                    a aVar18 = th19;
                                    listQ18 = xj.o.Q(aVar18.f50793a, aVar18.f50794b, aVar18.f50795c);
                                } else {
                                    listQ18 = xj.o.Q(th19.getClass().getSimpleName(), th19.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            bVar.e(listQ18);
                            break;
                        case 19:
                            o oVar20 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                oVar20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = j1.f.C(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof a) {
                                    a aVar19 = th20;
                                    listQ19 = xj.o.Q(aVar19.f50793a, aVar19.f50794b, aVar19.f50795c);
                                } else {
                                    listQ19 = xj.o.Q(th20.getClass().getSimpleName(), th20.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            bVar.e(listQ19);
                            break;
                        case 20:
                            o oVar21 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                oVar21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = j1.f.C(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof a) {
                                    a aVar20 = th21;
                                    listQ20 = xj.o.Q(aVar20.f50793a, aVar20.f50794b, aVar20.f50795c);
                                } else {
                                    listQ20 = xj.o.Q(th21.getClass().getSimpleName(), th21.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            bVar.e(listQ20);
                            break;
                        case 21:
                            o oVar22 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            s sVar = (s) obj35;
                            try {
                                oVar22.getClass();
                                webView19.addJavascriptInterface(sVar, sVar.f50902a);
                                listQ21 = j1.f.C(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof a) {
                                    a aVar21 = th22;
                                    listQ21 = xj.o.Q(aVar21.f50793a, aVar21.f50794b, aVar21.f50795c);
                                } else {
                                    listQ21 = xj.o.Q(th22.getClass().getSimpleName(), th22.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            bVar.e(listQ21);
                            break;
                        default:
                            o oVar23 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                oVar23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = j1.f.C(null);
                                break;
                            } catch (Throwable th23) {
                                if (th23 instanceof a) {
                                    a aVar22 = th23;
                                    listQ22 = xj.o.Q(aVar22.f50793a, aVar22.f50794b, aVar22.f50795c);
                                } else {
                                    listQ22 = xj.o.Q(th23.getClass().getSimpleName(), th23.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th23), th23.getCause()));
                                }
                            }
                            bVar.e(listQ22);
                            break;
                    }
                }
            });
        } else {
            gVar20.C(null);
        }
        g gVar21 = new g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebChromeClient", hVar, obj);
        if (oVar != null) {
            final int i30 = 3;
            gVar21.C(new xi.b() { // from class: tj.h0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i30) {
                        case 0:
                            o oVar2 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar2.f50873a.f23783c).a(((Long) obj3).longValue(), oVar2.a());
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
                            o oVar3 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                oVar3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                        case 2:
                            o oVar4 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar4.f50873a.f23783c).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            o oVar5 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            p0 p0Var = (p0) list3.get(1);
                            try {
                                oVar5.getClass();
                                webView3.setWebChromeClient(p0Var);
                                listQ4 = j1.f.C(null);
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
                        case 4:
                            o oVar6 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                oVar6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = j1.f.C(null);
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
                        case 5:
                            o oVar7 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                oVar7.getClass();
                                webView5.destroy();
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            o oVar8 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                oVar8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            o oVar9 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                oVar9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            o oVar10 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                oVar10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            o oVar11 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                oVar11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            o oVar12 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                oVar12.getClass();
                                listQ11 = j1.f.C(webView10.getUrl());
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            o oVar13 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                oVar13.getClass();
                                webView11.goForward();
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            o oVar14 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                oVar14.getClass();
                                listQ13 = j1.f.C(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            o oVar15 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                oVar15.getClass();
                                listQ14 = j1.f.C(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            o oVar16 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                oVar16.getClass();
                                webView14.goBack();
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            o oVar17 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                oVar17.getClass();
                                webView15.reload();
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        case 16:
                            o oVar18 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                oVar18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                        case 17:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.String");
                            hj.b bVar2 = new hj.b(bVar, 17);
                            oVar.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new k(bVar2, 1));
                            break;
                        case 18:
                            o oVar19 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                oVar19.getClass();
                                listQ18 = j1.f.C(webView17.getTitle());
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof a) {
                                    a aVar18 = th19;
                                    listQ18 = xj.o.Q(aVar18.f50793a, aVar18.f50794b, aVar18.f50795c);
                                } else {
                                    listQ18 = xj.o.Q(th19.getClass().getSimpleName(), th19.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            bVar.e(listQ18);
                            break;
                        case 19:
                            o oVar20 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                oVar20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = j1.f.C(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof a) {
                                    a aVar19 = th20;
                                    listQ19 = xj.o.Q(aVar19.f50793a, aVar19.f50794b, aVar19.f50795c);
                                } else {
                                    listQ19 = xj.o.Q(th20.getClass().getSimpleName(), th20.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            bVar.e(listQ19);
                            break;
                        case 20:
                            o oVar21 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                oVar21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = j1.f.C(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof a) {
                                    a aVar20 = th21;
                                    listQ20 = xj.o.Q(aVar20.f50793a, aVar20.f50794b, aVar20.f50795c);
                                } else {
                                    listQ20 = xj.o.Q(th21.getClass().getSimpleName(), th21.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            bVar.e(listQ20);
                            break;
                        case 21:
                            o oVar22 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            s sVar = (s) obj35;
                            try {
                                oVar22.getClass();
                                webView19.addJavascriptInterface(sVar, sVar.f50902a);
                                listQ21 = j1.f.C(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof a) {
                                    a aVar21 = th22;
                                    listQ21 = xj.o.Q(aVar21.f50793a, aVar21.f50794b, aVar21.f50795c);
                                } else {
                                    listQ21 = xj.o.Q(th22.getClass().getSimpleName(), th22.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            bVar.e(listQ21);
                            break;
                        default:
                            o oVar23 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                oVar23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = j1.f.C(null);
                                break;
                            } catch (Throwable th23) {
                                if (th23 instanceof a) {
                                    a aVar22 = th23;
                                    listQ22 = xj.o.Q(aVar22.f50793a, aVar22.f50794b, aVar22.f50795c);
                                } else {
                                    listQ22 = xj.o.Q(th23.getClass().getSimpleName(), th23.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th23), th23.getCause()));
                                }
                            }
                            bVar.e(listQ22);
                            break;
                    }
                }
            });
        } else {
            gVar21.C(null);
        }
        g gVar22 = new g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.setBackgroundColor", hVar, obj);
        if (oVar != null) {
            final int i31 = 4;
            gVar22.C(new xi.b() { // from class: tj.h0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i31) {
                        case 0:
                            o oVar2 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar2.f50873a.f23783c).a(((Long) obj3).longValue(), oVar2.a());
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
                            o oVar3 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                oVar3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                        case 2:
                            o oVar4 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar4.f50873a.f23783c).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            o oVar5 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            p0 p0Var = (p0) list3.get(1);
                            try {
                                oVar5.getClass();
                                webView3.setWebChromeClient(p0Var);
                                listQ4 = j1.f.C(null);
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
                        case 4:
                            o oVar6 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                oVar6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = j1.f.C(null);
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
                        case 5:
                            o oVar7 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                oVar7.getClass();
                                webView5.destroy();
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            o oVar8 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                oVar8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            o oVar9 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                oVar9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            o oVar10 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                oVar10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            o oVar11 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                oVar11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            o oVar12 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                oVar12.getClass();
                                listQ11 = j1.f.C(webView10.getUrl());
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            o oVar13 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                oVar13.getClass();
                                webView11.goForward();
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            o oVar14 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                oVar14.getClass();
                                listQ13 = j1.f.C(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            o oVar15 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                oVar15.getClass();
                                listQ14 = j1.f.C(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            o oVar16 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                oVar16.getClass();
                                webView14.goBack();
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            o oVar17 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                oVar17.getClass();
                                webView15.reload();
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        case 16:
                            o oVar18 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                oVar18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                        case 17:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.String");
                            hj.b bVar2 = new hj.b(bVar, 17);
                            oVar.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new k(bVar2, 1));
                            break;
                        case 18:
                            o oVar19 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                oVar19.getClass();
                                listQ18 = j1.f.C(webView17.getTitle());
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof a) {
                                    a aVar18 = th19;
                                    listQ18 = xj.o.Q(aVar18.f50793a, aVar18.f50794b, aVar18.f50795c);
                                } else {
                                    listQ18 = xj.o.Q(th19.getClass().getSimpleName(), th19.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            bVar.e(listQ18);
                            break;
                        case 19:
                            o oVar20 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                oVar20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = j1.f.C(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof a) {
                                    a aVar19 = th20;
                                    listQ19 = xj.o.Q(aVar19.f50793a, aVar19.f50794b, aVar19.f50795c);
                                } else {
                                    listQ19 = xj.o.Q(th20.getClass().getSimpleName(), th20.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            bVar.e(listQ19);
                            break;
                        case 20:
                            o oVar21 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                oVar21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = j1.f.C(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof a) {
                                    a aVar20 = th21;
                                    listQ20 = xj.o.Q(aVar20.f50793a, aVar20.f50794b, aVar20.f50795c);
                                } else {
                                    listQ20 = xj.o.Q(th21.getClass().getSimpleName(), th21.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            bVar.e(listQ20);
                            break;
                        case 21:
                            o oVar22 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            s sVar = (s) obj35;
                            try {
                                oVar22.getClass();
                                webView19.addJavascriptInterface(sVar, sVar.f50902a);
                                listQ21 = j1.f.C(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof a) {
                                    a aVar21 = th22;
                                    listQ21 = xj.o.Q(aVar21.f50793a, aVar21.f50794b, aVar21.f50795c);
                                } else {
                                    listQ21 = xj.o.Q(th22.getClass().getSimpleName(), th22.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            bVar.e(listQ21);
                            break;
                        default:
                            o oVar23 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                oVar23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = j1.f.C(null);
                                break;
                            } catch (Throwable th23) {
                                if (th23 instanceof a) {
                                    a aVar22 = th23;
                                    listQ22 = xj.o.Q(aVar22.f50793a, aVar22.f50794b, aVar22.f50795c);
                                } else {
                                    listQ22 = xj.o.Q(th23.getClass().getSimpleName(), th23.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th23), th23.getCause()));
                                }
                            }
                            bVar.e(listQ22);
                            break;
                    }
                }
            });
        } else {
            gVar22.C(null);
        }
        g gVar23 = new g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.destroy", hVar, obj);
        if (oVar == null) {
            gVar23.C(null);
        } else {
            final int i32 = 5;
            gVar23.C(new xi.b() { // from class: tj.h0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i32) {
                        case 0:
                            o oVar2 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar2.f50873a.f23783c).a(((Long) obj3).longValue(), oVar2.a());
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
                            o oVar3 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                oVar3.getClass();
                                webView.setDownloadListener(downloadListener);
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
                        case 2:
                            o oVar4 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) oVar4.f50873a.f23783c).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            o oVar5 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            p0 p0Var = (p0) list3.get(1);
                            try {
                                oVar5.getClass();
                                webView3.setWebChromeClient(p0Var);
                                listQ4 = j1.f.C(null);
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
                        case 4:
                            o oVar6 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                oVar6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = j1.f.C(null);
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
                        case 5:
                            o oVar7 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                oVar7.getClass();
                                webView5.destroy();
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            o oVar8 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                oVar8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            o oVar9 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                oVar9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            o oVar10 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                oVar10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            o oVar11 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                oVar11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            o oVar12 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                oVar12.getClass();
                                listQ11 = j1.f.C(webView10.getUrl());
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            o oVar13 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                oVar13.getClass();
                                webView11.goForward();
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            o oVar14 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                oVar14.getClass();
                                listQ13 = j1.f.C(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            o oVar15 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                oVar15.getClass();
                                listQ14 = j1.f.C(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            o oVar16 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                oVar16.getClass();
                                webView14.goBack();
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            o oVar17 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                oVar17.getClass();
                                webView15.reload();
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        case 16:
                            o oVar18 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                oVar18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                        case 17:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.String");
                            hj.b bVar2 = new hj.b(bVar, 17);
                            oVar.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new k(bVar2, 1));
                            break;
                        case 18:
                            o oVar19 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                oVar19.getClass();
                                listQ18 = j1.f.C(webView17.getTitle());
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof a) {
                                    a aVar18 = th19;
                                    listQ18 = xj.o.Q(aVar18.f50793a, aVar18.f50794b, aVar18.f50795c);
                                } else {
                                    listQ18 = xj.o.Q(th19.getClass().getSimpleName(), th19.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            bVar.e(listQ18);
                            break;
                        case 19:
                            o oVar20 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                oVar20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = j1.f.C(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof a) {
                                    a aVar19 = th20;
                                    listQ19 = xj.o.Q(aVar19.f50793a, aVar19.f50794b, aVar19.f50795c);
                                } else {
                                    listQ19 = xj.o.Q(th20.getClass().getSimpleName(), th20.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            bVar.e(listQ19);
                            break;
                        case 20:
                            o oVar21 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                oVar21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = j1.f.C(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof a) {
                                    a aVar20 = th21;
                                    listQ20 = xj.o.Q(aVar20.f50793a, aVar20.f50794b, aVar20.f50795c);
                                } else {
                                    listQ20 = xj.o.Q(th21.getClass().getSimpleName(), th21.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            bVar.e(listQ20);
                            break;
                        case 21:
                            o oVar22 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            s sVar = (s) obj35;
                            try {
                                oVar22.getClass();
                                webView19.addJavascriptInterface(sVar, sVar.f50902a);
                                listQ21 = j1.f.C(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof a) {
                                    a aVar21 = th22;
                                    listQ21 = xj.o.Q(aVar21.f50793a, aVar21.f50794b, aVar21.f50795c);
                                } else {
                                    listQ21 = xj.o.Q(th22.getClass().getSimpleName(), th22.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            bVar.e(listQ21);
                            break;
                        default:
                            o oVar23 = oVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                oVar23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = j1.f.C(null);
                                break;
                            } catch (Throwable th23) {
                                if (th23 instanceof a) {
                                    a aVar22 = th23;
                                    listQ22 = xj.o.Q(aVar22.f50793a, aVar22.f50794b, aVar22.f50795c);
                                } else {
                                    listQ22 = xj.o.Q(th23.getClass().getSimpleName(), th23.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th23), th23.getCause()));
                                }
                            }
                            bVar.e(listQ22);
                            break;
                    }
                }
            });
        }
    }

    public static final Class G(ClassLoader classLoader, String fqName) {
        n.f(fqName, "fqName");
        try {
            return Class.forName(fqName, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static void H(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void I(int i10, int i11) {
        String strQ0;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strQ0 = i0.q0("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(d.e(i11, "negative size: "));
                }
                strQ0 = i0.q0("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strQ0);
        }
    }

    public static void J(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(L(i10, i11, "index"));
        }
    }

    public static void K(int i10, int i11, int i12) {
        String strL;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strL = L(i10, i12, "start index");
            } else {
                strL = (i11 < 0 || i11 > i12) ? L(i11, i12, "end index") : i0.q0("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strL);
        }
    }

    public static String L(int i10, int i11, String str) {
        if (i10 < 0) {
            return i0.q0("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return i0.q0("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(d.e(i11, "negative size: "));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    /* JADX WARN: Code duplicated, block: B:39:0x0096  */
    /* JADX WARN: Code duplicated, block: B:43:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0067->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0084 -> B:25:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0087 -> B:25:0x0067). Please report as a decompilation issue!!! */
    public static final Object b(List list, m mVar, ck.c cVar) throws Throwable {
        s0.f fVar;
        List list2;
        c0 c0Var;
        Iterator it;
        Throwable th2;
        jk.b bVar;
        if (cVar instanceof s0.f) {
            fVar = (s0.f) cVar;
            int i10 = fVar.f49799i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f49799i = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new s0.f(cVar);
            }
        } else {
            fVar = new s0.f(cVar);
        }
        Object obj = fVar.f49798h;
        int i11 = fVar.f49799i;
        Object obj2 = bk.a.f5708a;
        if (i11 != 0) {
            if (i11 == 1) {
                list2 = (List) fVar.f49796f;
                e.z(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = fVar.f49797g;
                c0Var = (c0) fVar.f49796f;
                try {
                    e.z(obj);
                } catch (Throwable th3) {
                    Object obj3 = c0Var.f44760a;
                    if (obj3 == null) {
                        c0Var.f44760a = th3;
                    } else {
                        i0.c((Throwable) obj3, th3);
                    }
                }
            }
            while (it.hasNext()) {
                bVar = (jk.b) it.next();
                fVar.f49796f = c0Var;
                fVar.f49797g = it;
                fVar.f49799i = 2;
                if (bVar.invoke(fVar) == obj2) {
                    return obj2;
                }
            }
            th2 = (Throwable) c0Var.f44760a;
            if (th2 == null) {
                return r.f53297a;
            }
            throw th2;
        }
        e.z(obj);
        ArrayList arrayList = new ArrayList();
        s0.h hVar = new s0.h(list, arrayList, null);
        fVar.f49796f = arrayList;
        fVar.f49799i = 1;
        if (mVar.a(hVar, fVar) == obj2) {
            return obj2;
        }
        list2 = arrayList;
        c0Var = new c0();
        it = list2.iterator();
        while (it.hasNext()) {
            bVar = (jk.b) it.next();
            fVar.f49796f = c0Var;
            fVar.f49797g = it;
            fVar.f49799i = 2;
            if (bVar.invoke(fVar) == obj2) {
                return obj2;
            }
        }
        th2 = (Throwable) c0Var.f44760a;
        if (th2 == null) {
            return r.f53297a;
        }
        throw th2;
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, Object obj, int i10, int i11) {
        for (Object obj2 : spannableStringBuilder.getSpans(i10, i11, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i10 && spannableStringBuilder.getSpanEnd(obj2) == i11 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i10, i11, 33);
    }

    public static Object e(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static ArrayList f(AbstractList requests, HttpURLConnection httpURLConnection, l7.n nVar) {
        n.f(requests, "requests");
        ArrayList arrayList = new ArrayList(xj.p.W(requests, 10));
        Iterator it = requests.iterator();
        while (it.hasNext()) {
            arrayList.add(new e0((b0) it.next(), httpURLConnection, new q(nVar)));
        }
        return arrayList;
    }

    public static final long g(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[Segment.SIZE];
        int i10 = inputStream.read(bArr);
        long j10 = 0;
        while (i10 >= 0) {
            outputStream.write(bArr, 0, i10);
            j10 += (long) i10;
            i10 = inputStream.read(bArr);
        }
        return j10;
    }

    public static void i(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, v6.c cVar, ye.e eVar, String str) {
        SharedPreferences sharedPreferences3 = (SharedPreferences) cVar.f52487a;
        String string = sharedPreferences3.getString("FlutterSecureStorageBackupStatus", null);
        if (string == null) {
            string = ((SharedPreferences) cVar.f52488b).getString("FlutterSecureStorageBackupStatus", null);
        }
        if (CampaignEx.JSON_NATIVE_VIDEO_COMPLETE.equals(string) || "deleted".equals(string)) {
            Log.d("MigrationBackup", "Backup already exists (status: " + string + "), skipping");
            return;
        }
        if (X3.i.f27787d0.equals(string)) {
            Log.w("MigrationBackup", "Found incomplete backup (status: started), deleting and restarting");
            q(sharedPreferences, sharedPreferences2, str);
        }
        Log.i("MigrationBackup", "Starting backup creation (rename operation)...");
        if (eVar.f54382f) {
            sharedPreferences3.edit().putString("FlutterSecureStorageBackupStatus", X3.i.f27787d0).commit();
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        int i10 = 0;
        int i11 = 0;
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            if ((entry.getValue() instanceof String) && key.contains(str) && !key.endsWith("_BACKUP")) {
                editorEdit.putString(key.concat("_BACKUP"), (String) entry.getValue());
                i11++;
            }
        }
        if (!editorEdit.commit()) {
            throw new RuntimeException("Failed to copy encrypted data to backup");
        }
        SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
        for (Map.Entry<String, ?> entry2 : sharedPreferences2.getAll().entrySet()) {
            String key2 = entry2.getKey();
            if ((entry2.getValue() instanceof String) && !key2.endsWith("_BACKUP")) {
                editorEdit2.putString(key2.concat("_BACKUP"), (String) entry2.getValue());
                i10++;
            }
        }
        if (!editorEdit2.commit()) {
            throw new RuntimeException("Failed to copy wrapped keys to backup");
        }
        if (eVar.f54382f) {
            sharedPreferences3.edit().putString("FlutterSecureStorageBackupStatus", CampaignEx.JSON_NATIVE_VIDEO_COMPLETE).commit();
        }
        Log.i("MigrationBackup", d.f("Backup complete: ", i11, " data items, ", i10, " wrapped keys, 0 ESP items - originals preserved until migration succeeds"));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:54:0x0101 A[Catch: JSONException -> 0x011a, TryCatch #0 {JSONException -> 0x011a, blocks: (B:5:0x0017, B:7:0x001d, B:9:0x0027, B:11:0x002b, B:14:0x0038, B:16:0x0043, B:19:0x004d, B:22:0x0057, B:25:0x005f, B:27:0x0065, B:30:0x006f, B:33:0x0079, B:46:0x00e3, B:35:0x008c, B:38:0x0099, B:40:0x00a2, B:44:0x00b8, B:52:0x00f9, B:54:0x0101, B:55:0x0107), top: B:93:0x0017 }] */
    public static e0 j(b0 request, HttpURLConnection httpURLConnection, Object obj, Object obj2) {
        q qVar;
        l7.a aVar;
        l7.a aVar2;
        int iOptInt;
        String str;
        boolean zOptBoolean;
        int iOptInt2;
        String strOptString;
        String str2;
        String str3;
        Object NULL = obj;
        if (NULL instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) NULL;
            try {
                if (jSONObject.has("code")) {
                    int i10 = jSONObject.getInt("code");
                    Object objR = q7.e0.r(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                    if (objR != null && (objR instanceof JSONObject)) {
                        boolean z10 = false;
                        if (((JSONObject) objR).has("error")) {
                            JSONObject jSONObject2 = (JSONObject) q7.e0.r((JSONObject) objR, "error", null);
                            String strOptString2 = jSONObject2 != null ? jSONObject2.optString("type", null) : null;
                            String strOptString3 = jSONObject2 != null ? jSONObject2.optString("message", null) : null;
                            int iOptInt3 = jSONObject2 != null ? jSONObject2.optInt("code", -1) : -1;
                            int iOptInt4 = jSONObject2 != null ? jSONObject2.optInt("error_subcode", -1) : -1;
                            String strOptString4 = jSONObject2 != null ? jSONObject2.optString("error_user_msg", null) : null;
                            strOptString = jSONObject2 != null ? jSONObject2.optString("error_user_title", null) : null;
                            str = strOptString3;
                            str2 = strOptString4;
                            zOptBoolean = jSONObject2 != null ? jSONObject2.optBoolean("is_transient", false) : false;
                            iOptInt2 = iOptInt4;
                            z10 = true;
                            str3 = strOptString2;
                            iOptInt = iOptInt3;
                        } else if (((JSONObject) objR).has("error_code") || ((JSONObject) objR).has("error_msg") || ((JSONObject) objR).has("error_reason")) {
                            String strOptString5 = ((JSONObject) objR).optString("error_reason", null);
                            String strOptString6 = ((JSONObject) objR).optString("error_msg", null);
                            iOptInt = ((JSONObject) objR).optInt("error_code", -1);
                            str = strOptString6;
                            zOptBoolean = false;
                            iOptInt2 = ((JSONObject) objR).optInt("error_subcode", -1);
                            z10 = true;
                            strOptString = null;
                            str2 = null;
                            str3 = strOptString5;
                        } else {
                            zOptBoolean = false;
                            iOptInt2 = -1;
                            iOptInt = -1;
                            str3 = null;
                            str = null;
                            strOptString = null;
                            str2 = null;
                        }
                        if (z10) {
                            qVar = new q(i10, iOptInt, iOptInt2, str3, str, strOptString, str2, obj2, null, zOptBoolean);
                        } else {
                            if (i10 <= 299) {
                            }
                            if (jSONObject.has("body")) {
                            }
                            qVar = new q(i10, -1, -1, null, null, null, null, obj2, null, false);
                        }
                    } else if (i10 <= 299 || 200 > i10) {
                        if (jSONObject.has("body")) {
                        }
                        qVar = new q(i10, -1, -1, null, null, null, null, obj2, null, false);
                    } else {
                        qVar = null;
                    }
                } else {
                    qVar = null;
                }
            } catch (JSONException unused) {
            }
            if (qVar != null) {
                Log.e("l7.e0", qVar.toString());
                if (qVar.f45203b == 190 && (aVar = request.f45087a) != null) {
                    Date date = l7.a.l;
                    if (aVar.equals(k.D())) {
                        int i11 = qVar.f45204c;
                        j2.n nVar = l7.f.f45113f;
                        if (i11 != 493) {
                            nVar.t().c(null, true);
                        } else {
                            l7.a aVarD = k.D();
                            if (aVarD != null && !new Date().after(aVarD.f45071a) && (aVar2 = nVar.t().f45117c) != null) {
                                nVar.t().c(new l7.a(aVar2.f45075e, aVar2.f45078h, aVar2.f45079i, aVar2.f45072b, aVar2.f45073c, aVar2.f45074d, aVar2.f45076f, new Date(), new Date(), aVar2.f45080j, "facebook"), true);
                            }
                        }
                    }
                }
                return new e0(request, httpURLConnection, qVar);
            }
            Object objR2 = q7.e0.r(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
            if (objR2 instanceof JSONObject) {
                JSONObject jSONObject3 = (JSONObject) objR2;
                return new e0(request, httpURLConnection, jSONObject3.toString(), jSONObject3);
            }
            if (objR2 instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) objR2;
                String rawResponse = jSONArray.toString();
                n.f(request, "request");
                n.f(rawResponse, "rawResponse");
                return new e0(request, httpURLConnection, null, jSONArray, null);
            }
            NULL = JSONObject.NULL;
            n.e(NULL, "NULL");
        }
        if (NULL == JSONObject.NULL) {
            return new e0(request, httpURLConnection, NULL.toString(), null);
        }
        throw new l7.n("Got unexpected object type in response, class: ".concat(NULL.getClass().getSimpleName()));
    }

    public static ArrayList k(InputStream inputStream, HttpURLConnection httpURLConnection, d0 requests) throws JSONException {
        Object obj;
        n.f(requests, "requests");
        String strH = q7.e0.H(inputStream);
        x.f48792c.t(g0.f45135c, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(strH.length()), strH);
        Object resultObject = new JSONTokener(strH).nextValue();
        n.e(resultObject, "resultObject");
        int size = requests.f45106c.size();
        ArrayList arrayList = new ArrayList(size);
        if (size == 1) {
            b0 b0Var = (b0) requests.get(0);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("body", resultObject);
                jSONObject.put("code", httpURLConnection.getResponseCode());
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject);
                obj = jSONArray;
            } catch (IOException e10) {
                arrayList.add(new e0(b0Var, httpURLConnection, new q(e10)));
                obj = resultObject;
            } catch (JSONException e11) {
                arrayList.add(new e0(b0Var, httpURLConnection, new q(e11)));
                obj = resultObject;
            }
        } else {
            obj = resultObject;
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray2 = (JSONArray) obj;
            if (jSONArray2.length() == size) {
                int length = jSONArray2.length();
                for (int i10 = 0; i10 < length; i10++) {
                    b0 b0Var2 = (b0) requests.get(i10);
                    try {
                        Object obj2 = ((JSONArray) obj).get(i10);
                        n.e(obj2, "obj");
                        arrayList.add(j(b0Var2, httpURLConnection, obj2, resultObject));
                    } catch (l7.n e12) {
                        arrayList.add(new e0(b0Var2, httpURLConnection, new q(e12)));
                    } catch (JSONException e13) {
                        arrayList.add(new e0(b0Var2, httpURLConnection, new q(e13)));
                    }
                }
                x.f48792c.t(g0.f45133a, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", requests.f45105b, Integer.valueOf(strH.length()), arrayList);
                return arrayList;
            }
        }
        throw new l7.n("Unexpected number of results");
    }

    public static void l(String str, String str2, Object obj) {
        String strConcat = "TRuntime.".concat(str);
        if (Log.isLoggable(strConcat, 3)) {
            Log.d(strConcat, String.format(str2, obj));
        }
    }

    public static byte[] m(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i10 = 0; i10 < 16; i10++) {
            byte b10 = (byte) ((bArr[i10] << 1) & 254);
            bArr2[i10] = b10;
            if (i10 < 15) {
                bArr2[i10] = (byte) (((byte) ((bArr[i10 + 1] >> 7) & 1)) | b10);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & TsExtractor.TS_STREAM_TYPE_E_AC3)) ^ bArr2[15]);
        return bArr2;
    }

    public static void p(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, v6.c cVar, String str) {
        q(sharedPreferences, sharedPreferences2, str);
        ((SharedPreferences) cVar.f52487a).edit().remove("FlutterSecureStorageBackupStatus").commit();
        Log.d("MigrationBackup", "Backup deleted and status key removed");
    }

    public static void q(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, String str) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Iterator<Map.Entry<String, ?>> it = sharedPreferences.getAll().entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            String key = it.next().getKey();
            if (key.endsWith("_BACKUP") && key.contains(str)) {
                editorEdit.remove(key);
                i10++;
            }
        }
        editorEdit.commit();
        SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
        Iterator<Map.Entry<String, ?>> it2 = sharedPreferences2.getAll().entrySet().iterator();
        int i11 = 0;
        while (it2.hasNext()) {
            String key2 = it2.next().getKey();
            if (key2.endsWith("_BACKUP")) {
                editorEdit2.remove(key2);
                i11++;
            }
        }
        editorEdit2.commit();
        if (i10 > 0 || i11 > 0) {
            StringBuilder sbL = d.l("Deleted ", i10, " data _BACKUP entries, ", i11, " key _BACKUP entries, ");
            sbL.append(0);
            sbL.append(" ESP _BACKUP entries");
            Log.d("MigrationBackup", sbL.toString());
        }
    }

    public static void r(String str, v6.c cVar) {
        SharedPreferences sharedPreferences = (SharedPreferences) cVar.f52487a;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Iterator<Map.Entry<String, ?>> it = sharedPreferences.getAll().entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            String key = it.next().getKey();
            if (key.endsWith("_MIGRATED") && key.contains(str)) {
                editorEdit.remove(key);
                i10++;
            }
        }
        editorEdit.commit();
        if (i10 > 0) {
            Log.d("MigrationBackup", "Deleted " + i10 + " _MIGRATED marker entries from configSource");
        }
    }

    public static void s(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, v6.c cVar, String str) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Iterator<Map.Entry<String, ?>> it = sharedPreferences.getAll().entrySet().iterator();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (it.hasNext()) {
            String key = it.next().getKey();
            if (!key.endsWith("_BACKUP") && key.contains(str)) {
                String strConcat = key.concat("_MIGRATED");
                if (((SharedPreferences) cVar.f52487a).contains(strConcat) || ((SharedPreferences) cVar.f52488b).contains(strConcat)) {
                    Log.d("MigrationBackup", "Preserving already-migrated key in dataSource: ".concat(key));
                    i12++;
                } else {
                    editorEdit.remove(key);
                    i11++;
                }
            }
        }
        editorEdit.commit();
        if (w(str, cVar)) {
            Log.d("MigrationBackup", "Preserving keyStorage originals (new wrapped AES key) — already-migrated keys exist");
        } else {
            SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
            Iterator<Map.Entry<String, ?>> it2 = sharedPreferences2.getAll().entrySet().iterator();
            while (it2.hasNext()) {
                String key2 = it2.next().getKey();
                if (!key2.endsWith("_BACKUP")) {
                    editorEdit2.remove(key2);
                    i10++;
                }
            }
            editorEdit2.commit();
        }
        StringBuilder sbL = d.l("Deleted ", i11, " original data entries (preserved ", i12, " already-migrated), ");
        sbL.append(i10);
        sbL.append(" original key entries");
        Log.d("MigrationBackup", sbL.toString());
    }

    public static void t(String str, String str2, Exception exc) {
        String strConcat = "TRuntime.".concat(str);
        if (Log.isLoggable(strConcat, 6)) {
            Log.e(strConcat, str2, exc);
        }
    }

    public static String u(j jVar) {
        StringBuilder sb2 = new StringBuilder(jVar.size());
        for (int i10 = 0; i10 < jVar.size(); i10++) {
            byte b10 = jVar.b(i10);
            if (b10 == 34) {
                sb2.append("\\\"");
            } else if (b10 == 39) {
                sb2.append("\\'");
            } else if (b10 != 92) {
                switch (b10) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (b10 < 32 || b10 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((b10 >>> 6) & 3) + 48));
                            sb2.append((char) (((b10 >>> 3) & 7) + 48));
                            sb2.append((char) ((b10 & 7) + 48));
                        } else {
                            sb2.append((char) b10);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static final nn.a v(nn.a aVar) {
        n.f(aVar, "<this>");
        return aVar.d().b() ? aVar : new rn.j(aVar);
    }

    public static boolean w(String str, v6.c cVar) {
        Iterator<Map.Entry<String, ?>> it = ((SharedPreferences) cVar.f52487a).getAll().entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            if (key.endsWith("_MIGRATED") && key.contains(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean x(byte b10) {
        return b10 > -65;
    }

    public static zm.j y(jk.c cVar) {
        zm.j jVar = new zm.j();
        jVar.f55116c = q1.j(jVar, jVar, cVar);
        return jVar;
    }

    public static na.r z(na.r rVar) {
        if ((rVar instanceof t) || (rVar instanceof s)) {
            return rVar;
        }
        return rVar instanceof Serializable ? new s(rVar) : new t(rVar);
    }

    public i1.c0 n(w2.a aVar) {
        ByteBuffer byteBuffer = aVar.f47035e;
        byteBuffer.getClass();
        k.i(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return o(aVar, byteBuffer);
    }

    public abstract i1.c0 o(w2.a aVar, ByteBuffer byteBuffer);

    public void B() {
    }

    public void A(int i10) {
    }
}
