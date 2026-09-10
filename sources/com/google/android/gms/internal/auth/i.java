package com.google.android.gms.internal.auth;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.UserManager;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.em0;
import com.google.android.gms.internal.measurement.nf;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.lang.reflect.Proxy;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static UserManager f22841a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f22842b = false;

    public static b2.p A(String statusLine) throws ProtocolException {
        int i10;
        String strSubstring;
        kotlin.jvm.internal.n.f(statusLine, "statusLine");
        boolean zP0 = an.p.p0(statusLine, "HTTP/1.", false);
        xn.r rVar = xn.r.HTTP_1_0;
        if (zP0) {
            i10 = 9;
            if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            int iCharAt = statusLine.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                rVar = xn.r.HTTP_1_1;
            }
        } else {
            if (!an.p.p0(statusLine, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            i10 = 4;
        }
        int i11 = i10 + 3;
        if (statusLine.length() < i11) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
        try {
            String strSubstring2 = statusLine.substring(i10, i11);
            kotlin.jvm.internal.n.e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            int i12 = Integer.parseInt(strSubstring2);
            if (statusLine.length() <= i11) {
                strSubstring = "";
            } else {
                if (statusLine.charAt(i11) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                strSubstring = statusLine.substring(i10 + 4);
                kotlin.jvm.internal.n.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            }
            return new b2.p(strSubstring, i12, 2, rVar);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
    }

    public static xn.o B(String str) {
        kotlin.jvm.internal.n.f(str, "<this>");
        try {
            return s(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static Long C(Object obj) {
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).longValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return null;
    }

    public static ak.k D(ak.i iVar, ak.k context) {
        kotlin.jvm.internal.n.f(context, "context");
        return context == ak.l.f3620a ? iVar : (ak.k) context.fold(iVar, new ak.c(1));
    }

    public static y0.b E(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j10;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i10 = byteBufferDuplicate.getShort() & 65535;
        if (i10 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                j10 = -1;
                break;
            }
            int i12 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j10 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i12) {
                break;
            }
            i11++;
        }
        if (j10 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j10 - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j11 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i13 = 0; i13 < j11; i13++) {
                int i14 = byteBufferDuplicate.getInt();
                long j12 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i14 || 1701669481 == i14) {
                    byteBufferDuplicate.position((int) (j12 + j10));
                    y0.b bVar = new y0.b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.f45720d = byteBufferDuplicate;
                    bVar.f45717a = iPosition;
                    int i15 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.f45718b = i15;
                    bVar.f45719c = ((ByteBuffer) bVar.f45720d).getShort(i15);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static void F(xi.f binaryMessenger, final tj.r rVar) {
        nf nfVar;
        kotlin.jvm.internal.n.f(binaryMessenger, "binaryMessenger");
        xi.l hVar = (rVar == null || (nfVar = rVar.f50897a) == null) ? new defpackage.h(10) : nfVar.e();
        Object obj = null;
        k5.g gVar = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.instance", hVar, obj);
        if (rVar != null) {
            final int i10 = 0;
            gVar.C(new xi.b() { // from class: tj.y
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    int i11 = i10;
                    r rVar2 = rVar;
                    switch (i11) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            try {
                                nf nfVar2 = rVar2.f50897a;
                                ((c) nfVar2.f23783c).a(jLongValue, (q) nfVar2.f23786f);
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
                            return;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            q qVar = (q) obj4;
                            Object obj5 = list.get(1);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            try {
                                rVar2.getClass();
                                try {
                                    String[] list2 = qVar.f50891a.list(str);
                                    listQ2 = j1.f.C(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                } catch (IOException e10) {
                                    throw new RuntimeException(e10.getMessage());
                                }
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            return;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            q qVar2 = (q) obj6;
                            Object obj7 = list3.get(1);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                rVar2.getClass();
                                listQ3 = j1.f.C(((ri.d) qVar2.f50892b.f50111a).b(str2));
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
                            return;
                    }
                }
            });
        } else {
            gVar.C(null);
        }
        k5.g gVar2 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.list", hVar, obj);
        if (rVar != null) {
            final int i11 = 1;
            gVar2.C(new xi.b() { // from class: tj.y
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    int i12 = i11;
                    r rVar2 = rVar;
                    switch (i12) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            try {
                                nf nfVar2 = rVar2.f50897a;
                                ((c) nfVar2.f23783c).a(jLongValue, (q) nfVar2.f23786f);
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
                            return;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            q qVar = (q) obj4;
                            Object obj5 = list.get(1);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            try {
                                rVar2.getClass();
                                try {
                                    String[] list2 = qVar.f50891a.list(str);
                                    listQ2 = j1.f.C(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                } catch (IOException e10) {
                                    throw new RuntimeException(e10.getMessage());
                                }
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            return;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            q qVar2 = (q) obj6;
                            Object obj7 = list3.get(1);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                rVar2.getClass();
                                listQ3 = j1.f.C(((ri.d) qVar2.f50892b.f50111a).b(str2));
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
                            return;
                    }
                }
            });
        } else {
            gVar2.C(null);
        }
        k5.g gVar3 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.getAssetFilePathByName", hVar, obj);
        if (rVar == null) {
            gVar3.C(null);
        } else {
            final int i12 = 2;
            gVar3.C(new xi.b() { // from class: tj.y
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    int i13 = i12;
                    r rVar2 = rVar;
                    switch (i13) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            try {
                                nf nfVar2 = rVar2.f50897a;
                                ((c) nfVar2.f23783c).a(jLongValue, (q) nfVar2.f23786f);
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
                            return;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            q qVar = (q) obj4;
                            Object obj5 = list.get(1);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            try {
                                rVar2.getClass();
                                try {
                                    String[] list2 = qVar.f50891a.list(str);
                                    listQ2 = j1.f.C(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                } catch (IOException e10) {
                                    throw new RuntimeException(e10.getMessage());
                                }
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            return;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            q qVar2 = (q) obj6;
                            Object obj7 = list3.get(1);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                rVar2.getClass();
                                listQ3 = j1.f.C(((ri.d) qVar2.f50892b.f50111a).b(str2));
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
                            return;
                    }
                }
            });
        }
    }

    public static final dh.h G(Bitmap bitmap, ah.d type) {
        dh.h hVar;
        double[][] dArr;
        Bitmap bitmap2;
        kotlin.jvm.internal.n.f(type, "type");
        long jA = com.storage.androidcleaner.flutter.services.scan.service.a.a(bitmap);
        if (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            hVar = null;
            dArr = null;
        } else {
            Bitmap.Config config = bitmap.getConfig();
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
            int i10 = 0;
            if (config == config2) {
                bitmap2 = bitmap;
            } else {
                Bitmap bitmapCopy = bitmap.copy(config2, false);
                if (bitmapCopy == null) {
                    dArr = null;
                    hVar = null;
                } else {
                    bitmap2 = bitmapCopy;
                }
            }
            int width = bitmap2.getWidth();
            int height = bitmap2.getHeight();
            int i11 = width * height;
            int[] iArr = new int[i11];
            bitmap2.getPixels(iArr, 0, width, 0, 0, width, height);
            int[] iArr2 = new int[NotificationCompat.FLAG_LOCAL_ONLY];
            int[] iArr3 = new int[NotificationCompat.FLAG_LOCAL_ONLY];
            int[] iArr4 = new int[NotificationCompat.FLAG_LOCAL_ONLY];
            int[] iArr5 = new int[NotificationCompat.FLAG_LOCAL_ONLY];
            int i12 = 0;
            while (i12 < i11) {
                int i13 = iArr[i12];
                int i14 = (i13 >>> 24) & 255;
                int i15 = i10;
                int i16 = (i13 >>> 16) & 255;
                int i17 = (i13 >>> 8) & 255;
                int i18 = i13 & 255;
                iArr2[i14] = iArr2[i14] + 1;
                iArr3[i16] = iArr3[i16] + 1;
                iArr4[i17] = iArr4[i17] + 1;
                iArr5[i18] = iArr5[i18] + 1;
                i12++;
                i10 = i15;
            }
            int i19 = i10;
            hVar = null;
            double d10 = (((double) width) * ((double) height)) / 16.0d;
            dArr = new double[8][];
            for (int i20 = i19; i20 < 8; i20++) {
                dArr[i20] = new double[3];
            }
            int i21 = i19;
            for (int i22 = 8; i21 < i22; i22 = 8) {
                int i23 = i21 * 32;
                int i24 = i23 + 32;
                while (i23 < i24) {
                    double[] dArr2 = dArr[i21];
                    dArr2[i19] = dArr2[i19] + ((double) iArr3[i23]);
                    dArr2[1] = dArr2[1] + ((double) iArr4[i23]);
                    dArr2[2] = dArr2[2] + ((double) iArr5[i23]);
                    i23++;
                    dArr = dArr;
                }
                double[] dArr3 = dArr[i21];
                dArr3[i19] = dArr3[i19] / d10;
                dArr3[1] = dArr3[1] / d10;
                dArr3[2] = dArr3[2] / d10;
                i21++;
            }
        }
        return dArr == null ? hVar : new dh.h(new dh.c(jA, dArr), type);
    }

    public static int H(int i10) {
        int[] iArr = {1, 2, 3};
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = iArr[i11];
            int i13 = i12 - 1;
            if (i12 == 0) {
                throw null;
            }
            if (i13 == i10) {
                return i12;
            }
        }
        return 1;
    }

    public static String I(com.google.android.gms.internal.play_billing.i1 i1Var) {
        StringBuilder sb2 = new StringBuilder(i1Var.m());
        for (int i10 = 0; i10 < i1Var.m(); i10++) {
            byte b10 = i1Var.b(i10);
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

    public static void J(int i10, int i11) {
        String strC;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strC = o.C("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(l1.d.k(new StringBuilder(String.valueOf(i11).length() + 15), "negative size: ", i11));
                }
                strC = o.C("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strC);
        }
    }

    public static void K(int i10, int i11, int i12) {
        String strL;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strL = L(i10, i12, "start index");
            } else {
                strL = (i11 < 0 || i11 > i12) ? L(i11, i12, "end index") : o.C("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strL);
        }
    }

    public static String L(int i10, int i11, String str) {
        if (i10 < 0) {
            return o.C("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return o.C("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(l1.d.k(new StringBuilder(String.valueOf(i11).length() + 15), "negative size: ", i11));
    }

    public static final boolean a(byte[] a8, int i10, byte[] b10, int i11, int i12) {
        kotlin.jvm.internal.n.f(a8, "a");
        kotlin.jvm.internal.n.f(b10, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (a8[i13 + i10] != b10[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            StringBuilder sbL = wi.d.l(j10, "size=", " offset=");
            sbL.append(j11);
            throw new ArrayIndexOutOfBoundsException(defpackage.e.s(sbL, " byteCount=", j12));
        }
    }

    public static byte c(long j10) {
        go.k.f(j10, (j10 >> 8) == 0, "out of range: %s");
        return (byte) j10;
    }

    public static void e(n1.h hVar) {
        if (hVar != null) {
            try {
                hVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static tb.a f(String str, String str2) {
        od.a aVar = new od.a(str, str2);
        em0 em0VarA = tb.a.a(od.a.class);
        em0VarA.f14012c = 1;
        em0VarA.f14015f = new q1.e(aVar);
        return em0VarA.b();
    }

    public static final Object g(Class annotationClass, Map map, List methods) {
        kotlin.jvm.internal.n.f(annotationClass, "annotationClass");
        kotlin.jvm.internal.n.f(methods, "methods");
        wj.j jVarU = r9.b.u(new uk.c(map, 0));
        Object objNewProxyInstance = Proxy.newProxyInstance(annotationClass.getClassLoader(), new Class[]{annotationClass}, new uk.b(annotationClass, map, r9.b.u(new cl.t0(13, annotationClass, map)), jVarU, methods));
        kotlin.jvm.internal.n.d(objNewProxyInstance, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return objNewProxyInstance;
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
                        if (n(fArr[i11], fArr2[i11])) {
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
                        return l(((Number) obj).doubleValue(), ((Number) obj2).doubleValue());
                    }
                    return ((obj instanceof Float) && (obj2 instanceof Float)) ? n(((Number) obj).floatValue(), ((Number) obj2).floatValue()) : obj.equals(obj2);
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

    public static boolean i(Object obj, Object obj2) {
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
                        if (i(objArr[i12], objArr2[i12])) {
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
                        if (!i(it.next(), it2.next())) {
                        }
                    }
                    return true;
                }
            } else {
                if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
                    if ((obj instanceof Double) && (obj2 instanceof Double)) {
                        return m(((Number) obj).doubleValue(), ((Number) obj2).doubleValue());
                    }
                    return ((obj instanceof Float) && (obj2 instanceof Float)) ? o(((Number) obj).floatValue(), ((Number) obj2).floatValue()) : obj.equals(obj2);
                }
                Map map = (Map) obj;
                Map map2 = (Map) obj2;
                if (map.size() == map2.size()) {
                    loop4: for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        for (Map.Entry entry2 : map2.entrySet()) {
                            if (i(key, entry2.getKey())) {
                                if (!i(entry.getValue(), entry2.getValue())) {
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

    public static int j(Object obj) {
        int iJ = 0;
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
        int iJ2 = 1;
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length = dArr.length;
            while (iJ < length) {
                double d10 = dArr[iJ];
                int i10 = iJ2 * 31;
                if (d10 == 0.0d) {
                    d10 = 0.0d;
                }
                long jDoubleToLongBits = Double.doubleToLongBits(d10);
                iJ2 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                iJ++;
            }
            return iJ2;
        }
        boolean z10 = obj instanceof float[];
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z10) {
            float[] fArr = (float[]) obj;
            int length2 = fArr.length;
            while (iJ < length2) {
                float f11 = fArr[iJ];
                int i11 = iJ2 * 31;
                if (f11 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f11 = 0.0f;
                }
                iJ2 = i11 + Float.floatToIntBits(f11);
                iJ++;
            }
            return iJ2;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length3 = objArr.length;
            while (iJ < length3) {
                iJ2 = (iJ2 * 31) + j(objArr[iJ]);
                iJ++;
            }
            return iJ2;
        }
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iJ2 = (iJ2 * 31) + j(it.next());
            }
            return iJ2;
        }
        if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                iJ += j(entry.getValue()) ^ (j(entry.getKey()) * 31);
            }
            return iJ;
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

    public static int k(Object obj) {
        int iK = 0;
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
        int iK2 = 1;
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length = dArr.length;
            while (iK < length) {
                double d10 = dArr[iK];
                int i10 = iK2 * 31;
                if (d10 == 0.0d) {
                    d10 = 0.0d;
                }
                long jDoubleToLongBits = Double.doubleToLongBits(d10);
                iK2 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                iK++;
            }
            return iK2;
        }
        boolean z10 = obj instanceof float[];
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z10) {
            float[] fArr = (float[]) obj;
            int length2 = fArr.length;
            while (iK < length2) {
                float f11 = fArr[iK];
                int i11 = iK2 * 31;
                if (f11 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f11 = 0.0f;
                }
                iK2 = i11 + Float.floatToIntBits(f11);
                iK++;
            }
            return iK2;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length3 = objArr.length;
            while (iK < length3) {
                iK2 = (iK2 * 31) + k(objArr[iK]);
                iK++;
            }
            return iK2;
        }
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iK2 = (iK2 * 31) + k(it.next());
            }
            return iK2;
        }
        if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                iK += k(entry.getValue()) ^ (k(entry.getKey()) * 31);
            }
            return iK;
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

    public static boolean n(float f10, float f11) {
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

    public static Object p(ak.i iVar, Object obj, jk.c operation) {
        kotlin.jvm.internal.n.f(operation, "operation");
        return operation.invoke(obj, iVar);
    }

    public static tb.a q(String str, i0.a aVar) {
        em0 em0VarA = tb.a.a(od.a.class);
        em0VarA.f14012c = 1;
        em0VarA.a(tb.h.b(Context.class));
        em0VarA.f14015f = new cj.h(22, str, aVar);
        return em0VarA.b();
    }

    public static ak.i r(ak.i iVar, ak.j key) {
        kotlin.jvm.internal.n.f(key, "key");
        if (kotlin.jvm.internal.n.a(iVar.getKey(), key)) {
            return iVar;
        }
        return null;
    }

    public static xn.o s(String str) {
        kotlin.jvm.internal.n.f(str, "<this>");
        Matcher matcher = xn.o.f53998c.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(defpackage.e.f('\"', "No subtype found for: \"", str).toString());
        }
        String strGroup = matcher.group(1);
        kotlin.jvm.internal.n.e(strGroup, "typeSubtype.group(1)");
        Locale US = Locale.US;
        kotlin.jvm.internal.n.e(US, "US");
        kotlin.jvm.internal.n.e(strGroup.toLowerCase(US), "this as java.lang.String).toLowerCase(locale)");
        String strGroup2 = matcher.group(2);
        kotlin.jvm.internal.n.e(strGroup2, "typeSubtype.group(2)");
        kotlin.jvm.internal.n.e(strGroup2.toLowerCase(US), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = xn.o.f53999d.matcher(str);
        int iEnd = matcher.end();
        while (iEnd < str.length()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb2 = new StringBuilder("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(iEnd);
                kotlin.jvm.internal.n.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring);
                sb2.append("\" for: \"");
                throw new IllegalArgumentException(wi.d.k(sb2, str, '\"').toString());
            }
            String strGroup3 = matcher2.group(1);
            if (strGroup3 == null) {
                iEnd = matcher2.end();
            } else {
                String strGroup4 = matcher2.group(2);
                if (strGroup4 == null) {
                    strGroup4 = matcher2.group(3);
                } else if (an.p.p0(strGroup4, "'", false) && an.p.h0(strGroup4, "'", false) && strGroup4.length() > 2) {
                    strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                    kotlin.jvm.internal.n.e(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(strGroup3);
                arrayList.add(strGroup4);
                iEnd = matcher2.end();
            }
        }
        return new xn.o(str, (String[]) arrayList.toArray(new String[0]));
    }

    public static final qk.d t(pn.d dVar) {
        kotlin.jvm.internal.n.f(dVar, "<this>");
        if (dVar instanceof rn.o) {
            return t(((rn.o) dVar).f49739a);
        }
        return null;
    }

    public static final Object u(zl.k kVar, zl.m extension) {
        kotlin.jvm.internal.n.f(kVar, "<this>");
        kotlin.jvm.internal.n.f(extension, "extension");
        if (kVar.o(extension)) {
            return kVar.n(extension);
        }
        return null;
    }

    public static final Object v(zl.k kVar, zl.m extension, int i10) {
        kotlin.jvm.internal.n.f(kVar, "<this>");
        kotlin.jvm.internal.n.f(extension, "extension");
        kVar.r(extension);
        zl.h hVar = kVar.f55066a;
        zl.l lVar = extension.f55073d;
        hVar.getClass();
        zl.x xVar = hVar.f55042a;
        if (!lVar.f55069c) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object obj = xVar.get(lVar);
        if (i10 >= (obj == null ? 0 : ((List) obj).size())) {
            return null;
        }
        kVar.r(extension);
        if (!lVar.f55069c) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object obj2 = xVar.get(lVar);
        if (obj2 != null) {
            return extension.a(((List) obj2).get(i10));
        }
        throw new IndexOutOfBoundsException();
    }

    public static final rl.o w(tl.g0 proto, vl.f nameResolver, l3.i iVar, boolean z10, boolean z11, boolean z12) {
        kotlin.jvm.internal.n.f(proto, "proto");
        kotlin.jvm.internal.n.f(nameResolver, "nameResolver");
        zl.m propertySignature = wl.k.f53469d;
        kotlin.jvm.internal.n.e(propertySignature, "propertySignature");
        wl.e eVar = (wl.e) u(proto, propertySignature);
        if (eVar != null) {
            if (z10) {
                zl.g gVar = xl.h.f53909a;
                xl.d dVarB = xl.h.b(proto, nameResolver, iVar, z12);
                if (dVarB != null) {
                    return d0.c.k(dVarB);
                }
            } else if (z11 && (eVar.f53422b & 2) == 2) {
                wl.c cVar = eVar.f53424d;
                kotlin.jvm.internal.n.e(cVar, "signature.syntheticMethod");
                return new rl.o(nameResolver.getString(cVar.f53409c).concat(nameResolver.getString(cVar.f53410d)));
            }
        }
        return null;
    }

    public static String y(int i10) {
        switch (i10) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return l1.d.k(new StringBuilder(String.valueOf(i10).length() + 21), "unknown status code: ", i10);
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static ak.k z(ak.i iVar, ak.j key) {
        kotlin.jvm.internal.n.f(key, "key");
        return kotlin.jvm.internal.n.a(iVar.getKey(), key) ? ak.l.f3620a : iVar;
    }

    public abstract List d(List list, String str);
}
