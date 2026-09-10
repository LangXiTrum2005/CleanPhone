package com.google.android.gms.internal.ads;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.ironsource.C0375hc;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s6 implements e3, nt1, q81, c2, i2, o2, i7, p7, kc, zzq, xs1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Cipher f19859c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s6 f19858b = new s6(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f19860d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f19861e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s6 f19862f = new s6(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s6 f19863g = new s6(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final s6 f19864h = new s6(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final s6 f19865i = new s6(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final s6 f19866j = new s6(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final s6 f19867k = new s6(8);
    public static final /* synthetic */ s6 l = new s6(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ s6 f19868m = new s6(12);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ s6 f19869n = new s6(13);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ s6 f19870o = new s6(16);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ s6 f19871p = new s6(25);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ s6 f19872q = new s6(29);

    public /* synthetic */ s6(int i10) {
        this.f19873a = i10;
    }

    public static k3 l(hb hbVar, Map map) throws Throwable {
        String strZzh = hbVar.zzh();
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(hbVar.zzm());
        URL url = new URL(strZzh);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int iZzo = hbVar.zzo();
        httpURLConnection.setConnectTimeout(iZzo);
        httpURLConnection.setReadTimeout(iZzo);
        boolean z10 = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        url.getProtocol();
        try {
            for (String str : map2.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) map2.get(str));
            }
            if (hbVar.zza() != 0) {
                httpURLConnection.setRequestMethod(C0375hc.f28789b);
                byte[] bArrZzn = hbVar.zzn();
                if (bArrZzn != null) {
                    httpURLConnection.setDoOutput(true);
                    if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(bArrZzn);
                    dataOutputStream.close();
                }
            } else {
                httpURLConnection.setRequestMethod(C0375hc.f28788a);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            hbVar.zza();
            if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                k3 k3Var = new k3(responseCode, q(httpURLConnection.getHeaderFields()), -1, (ub) null);
                httpURLConnection.disconnect();
                return k3Var;
            }
            try {
                return new k3(responseCode, q(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new ub(httpURLConnection));
            } catch (Throwable th2) {
                th = th2;
                z10 = true;
                if (!z10) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static id m(final long j10) {
        return id.f(new cd() { // from class: com.google.android.gms.internal.ads.nc
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                try {
                    ((ed) obj).f13933a.e(id.b(j10));
                    return Optional.empty();
                } catch (bd unused) {
                    return Optional.of(gc.f14810b);
                }
            }
        });
    }

    public static String n(byte[] bArr, byte[] bArr2) throws wf {
        byte[] bArrDoFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f19860d) {
                t().init(1, secretKeySpec, (SecureRandom) null);
                bArrDoFinal = t().doFinal(bArr2);
                iv = t().getIV();
            }
            int length2 = bArrDoFinal.length + iv.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(iv).put(bArrDoFinal);
            byteBufferAllocate.flip();
            byte[] bArr3 = new byte[length2];
            byteBufferAllocate.get(bArr3);
            return Base64.encodeToString(bArr3, 2);
        } catch (InvalidKeyException e10) {
            throw new wf(e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new wf(e11);
        } catch (BadPaddingException e12) {
            throw new wf(e12);
        } catch (IllegalBlockSizeException e13) {
            throw new wf(e13);
        } catch (NoSuchPaddingException e14) {
            throw new wf(e14);
        }
    }

    public static ArrayList q(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new bb((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public static void r(long j10, x11 x11Var, boolean z10) throws IOException {
        long[] jArr = {2000490107, 1476547902, 1834034217, 268849430, 1839467528, 4368198174L, 449620248, 1652701270, 1629190168};
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        long j17 = jArr[6];
        long j18 = jArr[7];
        long j19 = (((((~j11) & j12) | j13) + ((j11 & j14) | j15)) - j16) + j17;
        long j20 = j18 % 1629190168;
        long j21 = z10 ? (j10 + j10) ^ (j10 >> 63) : j10;
        int i10 = 1;
        while (true) {
            long j22 = j19 ^ j20;
            long j23 = j21 >>> 7;
            boolean z11 = j23 != 0 || i10 < 0;
            int i11 = (int) (j21 & j22);
            if (z11) {
                i11 = ((i11 | 128) << 24) >> 24;
            }
            ((ByteArrayOutputStream) x11Var.f21703b).write((byte) i11);
            if (!z11) {
                return;
            }
            i10++;
            j21 = j23;
        }
    }

    public static byte[] s(String str, byte[] bArr) throws wf {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrDecode = Base64.decode(str, 2);
            if (bArrDecode.length == 0 && str.length() > 0) {
                throw new IllegalArgumentException("Unable to decode ".concat(str));
            }
            int length2 = bArrDecode.length;
            if (length2 <= 16) {
                throw new wf();
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrDecode);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f19860d) {
                t().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = t().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException e10) {
            throw new wf(e10);
        } catch (InvalidAlgorithmParameterException e11) {
            throw new wf(e11);
        } catch (InvalidKeyException e12) {
            throw new wf(e12);
        } catch (NoSuchAlgorithmException e13) {
            throw new wf(e13);
        } catch (BadPaddingException e14) {
            throw new wf(e14);
        } catch (IllegalBlockSizeException e15) {
            throw new wf(e15);
        } catch (NoSuchPaddingException e16) {
            throw new wf(e16);
        }
    }

    public static final Cipher t() {
        Cipher cipher;
        synchronized (f19861e) {
            try {
                if (f19859c == null) {
                    f19859c = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = f19859c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cipher;
    }

    public static /* bridge */ iu1 v(Object obj) {
        ss1 ss1Var = (ss1) obj;
        iu1 iu1Var = ss1Var.zzt;
        if (iu1Var != iu1.f15848f) {
            return iu1Var;
        }
        iu1 iu1VarA = iu1.a();
        ss1Var.zzt = iu1VarA;
        return iu1VarA;
    }

    public static final void x(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            try {
                webView.evaluateJavascript(str, null);
            } catch (IllegalStateException unused) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12);
                sb2.append("javascript: ");
                sb2.append(str);
                webView.loadUrl(sb2.toString());
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    public static boolean y(int i10, androidx.datastore.preferences.protobuf.n nVar, Object obj) throws et1 {
        fs1 fs1Var = (fs1) nVar.f4137e;
        int i11 = nVar.f4134b;
        int i12 = i11 >>> 3;
        int i13 = i11 & 7;
        if (i13 == 0) {
            nVar.F0(0);
            ((iu1) obj).d(i12 << 3, Long.valueOf(fs1Var.G()));
            return true;
        }
        if (i13 == 1) {
            nVar.F0(1);
            ((iu1) obj).d((i12 << 3) | 1, Long.valueOf(fs1Var.I()));
            return true;
        }
        if (i13 == 2) {
            ((iu1) obj).d((i12 << 3) | 2, nVar.T0());
            return true;
        }
        if (i13 != 3) {
            if (i13 == 4) {
                if (i10 != 0) {
                    return false;
                }
                throw new et1("Protocol message end-group tag did not match expected tag.");
            }
            if (i13 != 5) {
                throw new dt1();
            }
            nVar.F0(5);
            ((iu1) obj).d(5 | (i12 << 3), Integer.valueOf(fs1Var.J()));
            return true;
        }
        iu1 iu1VarA = iu1.a();
        int i14 = i12 << 3;
        int i15 = i10 + 1;
        if (i15 >= 100) {
            throw new et1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (nVar.R0() != Integer.MAX_VALUE && y(i15, nVar, iu1VarA)) {
        }
        if ((i14 | 4) != nVar.f4134b) {
            throw new et1("Protocol message end-group tag did not match expected tag.");
        }
        if (iu1VarA.f15853e) {
            iu1VarA.f15853e = false;
        }
        ((iu1) obj).d(i14 | 3, iu1VarA);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.nt1
    public boolean a(Class cls) {
        return ss1.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.nt1
    public xt1 b(Class cls) {
        if (!ss1.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (xt1) ss1.s(cls.asSubclass(ss1.class)).v(3, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.i7
    public long d(n2 n2Var) {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public h3 e(int i10, int i11) {
        switch (this.f19873a) {
            case 14:
                throw new UnsupportedOperationException();
            default:
                return new k2();
        }
    }

    @Override // com.google.android.gms.internal.ads.p7
    public boolean g(g22 g22Var) {
        switch (this.f19873a) {
            case 18:
                String str = g22Var.f14678o;
                return Objects.equals(str, MimeTypes.TEXT_SSA) || Objects.equals(str, MimeTypes.TEXT_VTT) || Objects.equals(str, MimeTypes.APPLICATION_MP4VTT) || Objects.equals(str, MimeTypes.APPLICATION_SUBRIP) || Objects.equals(str, MimeTypes.APPLICATION_TX3G) || Objects.equals(str, MimeTypes.APPLICATION_PGS) || Objects.equals(str, MimeTypes.APPLICATION_VOBSUB) || Objects.equals(str, MimeTypes.APPLICATION_DVBSUBS) || Objects.equals(str, MimeTypes.APPLICATION_TTML);
            default:
                return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        if (r2.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_VOBSUB) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
    
        if (r2.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_TX3G) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        if (r2.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_MP4VTT) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005b, code lost:
    
        if (r2.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_PGS) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0064, code lost:
    
        if (r2.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_DVBSUBS) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0067, code lost:
    
        return 2;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.p7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int h(com.google.android.gms.internal.ads.g22 r3) {
        /*
            r2 = this;
            int r2 = r2.f19873a
            switch(r2) {
                case 18: goto L7;
                default: goto L5;
            }
        L5:
            r2 = 1
            return r2
        L7:
            java.lang.String r2 = r3.f14678o
            if (r2 == 0) goto L68
            int r3 = r2.hashCode()
            r0 = 1
            r1 = 2
            switch(r3) {
                case -1351681404: goto L5e;
                case -1248334819: goto L55;
                case -1026075066: goto L4c;
                case -1004728940: goto L43;
                case 691401887: goto L3a;
                case 822864842: goto L31;
                case 1157994102: goto L27;
                case 1668750253: goto L1e;
                case 1693976202: goto L15;
                default: goto L14;
            }
        L14:
            goto L68
        L15:
            java.lang.String r3 = "application/ttml+xml"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L68
            goto L67
        L1e:
            java.lang.String r3 = "application/x-subrip"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L68
            goto L67
        L27:
            java.lang.String r3 = "application/vobsub"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L68
        L2f:
            r0 = r1
            goto L67
        L31:
            java.lang.String r3 = "text/x-ssa"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L68
            goto L67
        L3a:
            java.lang.String r3 = "application/x-quicktime-tx3g"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L68
            goto L2f
        L43:
            java.lang.String r3 = "text/vtt"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L68
            goto L67
        L4c:
            java.lang.String r3 = "application/x-mp4-vtt"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L68
            goto L2f
        L55:
            java.lang.String r3 = "application/pgs"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L68
            goto L2f
        L5e:
            java.lang.String r3 = "application/dvbsubs"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L68
            goto L2f
        L67:
            return r0
        L68:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported MIME type: "
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r0.concat(r2)
            r3.<init>(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s6.h(com.google.android.gms.internal.ads.g22):int");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.p7
    public q7 i(g22 g22Var) {
        switch (this.f19873a) {
            case 18:
                String str = g22Var.f14678o;
                List list = g22Var.f14681r;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1351681404:
                            if (str.equals(MimeTypes.APPLICATION_DVBSUBS)) {
                                a8 a8Var = new a8();
                                np0 np0Var = new np0((byte[]) list.get(0));
                                int iL = np0Var.L();
                                int iL2 = np0Var.L();
                                Paint paint = new Paint();
                                a8Var.f11925a = paint;
                                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                                paint.setPathEffect(null);
                                Paint paint2 = new Paint();
                                a8Var.f11926b = paint2;
                                paint2.setStyle(Paint.Style.FILL);
                                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
                                paint2.setPathEffect(null);
                                a8Var.f11927c = new Canvas();
                                int i10 = 719;
                                a8Var.f11928d = new t7(i10, 575, 0, i10, 0, 575);
                                a8Var.f11929e = new s7(0, new int[]{0, -1, -16777216, -8421505}, a8.f(), a8.i());
                                a8Var.f11930f = new z7(iL, iL2, 0);
                                return a8Var;
                            }
                            break;
                        case -1248334819:
                            if (str.equals(MimeTypes.APPLICATION_PGS)) {
                                return new uw(2);
                            }
                            break;
                        case -1026075066:
                            if (str.equals(MimeTypes.APPLICATION_MP4VTT)) {
                                return new so0(4);
                            }
                            break;
                        case -1004728940:
                            if (str.equals(MimeTypes.TEXT_VTT)) {
                                return new lj1(4);
                            }
                            break;
                        case 691401887:
                            if (str.equals(MimeTypes.APPLICATION_TX3G)) {
                                return new p8(list, 0);
                            }
                            break;
                        case 822864842:
                            if (str.equals(MimeTypes.TEXT_SSA)) {
                                return new c8(list);
                            }
                            break;
                        case 1157994102:
                            if (str.equals(MimeTypes.APPLICATION_VOBSUB)) {
                                return new r8(list);
                            }
                            break;
                        case 1668750253:
                            if (str.equals(MimeTypes.APPLICATION_SUBRIP)) {
                                return new g8();
                            }
                            break;
                        case 1693976202:
                            if (str.equals(MimeTypes.APPLICATION_TTML)) {
                                return new l8();
                            }
                            break;
                    }
                }
                throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
            default:
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
        }
    }

    @Override // com.google.android.gms.internal.ads.kc
    public byte j(qc qcVar, int i10) {
        return qcVar.b(i10);
    }

    @Override // com.google.android.gms.internal.ads.kc
    public qc k(qc qcVar, int i10, int i11) {
        byte[] bArr;
        int length;
        byte[] bArr2;
        if (i10 < 0 || i10 > i11 || i11 > (length = (bArr = qcVar.f19023a).length) || i10 > i11 || i11 > length) {
            throw new IndexOutOfBoundsException();
        }
        int i12 = i11 - i10;
        if (i12 == 0) {
            bArr2 = new byte[0];
        } else {
            byte[] bArr3 = new byte[i12];
            System.arraycopy(bArr, i10, bArr3, 0, i12);
            bArr2 = bArr3;
        }
        return new qc(bArr2);
    }

    @Override // com.google.android.gms.internal.ads.o2
    public void o(a3 a3Var) {
        switch (this.f19873a) {
            case 14:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    public long p() {
        return SystemClock.elapsedRealtime();
    }

    public String toString() {
        switch (this.f19873a) {
            case 0:
                return "NoDeclaredBrand";
            default:
                return super.toString();
        }
    }

    public ys0 u(Looper looper, Handler.Callback callback) {
        return new ys0(new Handler(looper, callback));
    }

    public void w(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("if(window.omidBridge!==undefined){omidBridge.");
            sb2.append(str);
            sb2.append("(");
            for (Object obj : objArr) {
                if (obj == null) {
                    sb2.append("null");
                } else if (obj instanceof String) {
                    String string = obj.toString();
                    if (string.startsWith("{")) {
                        sb2.append(string);
                    } else {
                        sb2.append('\"');
                        sb2.append(string);
                        sb2.append('\"');
                    }
                } else {
                    sb2.append(obj);
                }
                sb2.append(",");
            }
            sb2.setLength(sb2.length() - 1);
            sb2.append(")}");
            String string2 = sb2.toString();
            Handler handler = webView.getHandler();
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            if (Looper.myLooper() == handler.getLooper()) {
                x(webView, string2);
            } else {
                handler.post(new gm0(this, webView, string2));
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    public Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        switch (this.f19873a) {
            case 25:
                int i10 = wh.f21513a;
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
                return iInterfaceQueryLocalInterface instanceof xh ? (xh) iInterfaceQueryLocalInterface : new vh(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                return iInterfaceQueryLocalInterface2 instanceof vn ? (vn) iInterfaceQueryLocalInterface2 : new vn(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
        }
    }

    @Override // com.google.android.gms.internal.ads.kc
    /* JADX INFO: renamed from: zzc, reason: collision with other method in class */
    public kc mo167zzc() {
        return new s6(false);
    }

    @Override // com.google.android.gms.internal.ads.o2
    public void zzv() {
        switch (this.f19873a) {
            case 14:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    public /* synthetic */ s6(boolean z10) {
        this.f19873a = 21;
    }

    @Override // com.google.android.gms.internal.ads.i7
    public a3 zzc() {
        return new r2(C.TIME_UNSET, 0L);
    }

    public s6(mf mfVar, pz0 pz0Var) {
        this.f19873a = 24;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public /* synthetic */ Constructor zza() throws IllegalAccessException, InvocationTargetException {
        switch (this.f19873a) {
            case 12:
                int[] iArr = j2.f15930c;
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(m2.class).getConstructor(null);
            default:
                int[] iArr2 = j2.f15930c;
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(m2.class).getConstructor(Integer.TYPE);
                }
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.q81
    public /* synthetic */ Object zza() {
        int i10 = z0.f22440a;
        try {
            return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    private final void z() {
    }

    private final void A(a3 a3Var) {
    }

    @Override // com.google.android.gms.internal.ads.c2
    public long c(long j10) {
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.i7
    public void f(long j10) {
    }
}
