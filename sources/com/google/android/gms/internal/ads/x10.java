package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Display;
import androidx.core.app.NotificationCompat;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.Utf8;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x10 implements p2 {
    public static UiModeManager A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AudioManager f21675a;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ei f21685k;
    public static final ei l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final qd0 f21687n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final qd0 f21689p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static Task f21690q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static AppSetIdClient f21691r;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f21696w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f21697x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f21698y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f21699z = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f21676b = {1, 2, 3, 6};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f21677c = {48000, 44100, 32000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f21678d = {24000, 22050, 16000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f21679e = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f21680f = {32, 40, 48, 56, 64, 80, 96, InterfaceC0435l1.d.b.f29113j, 128, 160, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f21681g = {69, 87, InterfaceC0435l1.d.b.f29108e, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f21682h = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f21683i = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final jq f21684j = new jq(4);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final qd0 f21686m = new qd0(7);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final qd0 f21688o = new qd0(20);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Object f21692s = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final lr0 f21693t = new lr0(12);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final lr0 f21694u = new lr0(17);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final tt0 f21695v = new tt0(0, 8);

    static {
        int i10 = 14;
        f21685k = new ei(i10);
        int i11 = 27;
        l = new ei(i11);
        f21687n = new qd0(i10);
        f21689p = new qd0(i11);
    }

    public static int A(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 >= 3 || i11 < 0 || (i12 = i11 >> 1) >= 19) {
            return -1;
        }
        int i13 = f21677c[i10];
        if (i13 == 44100) {
            int i14 = f21681g[i12] + (i11 & 1);
            return i14 + i14;
        }
        int i15 = f21680f[i12];
        return i13 == 32000 ? i15 * 6 : i15 * 4;
    }

    public static int B(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(AppLovinMediationProvider.ADMOB, 0);
        if (sharedPreferences == null) {
            return 0;
        }
        try {
            return sharedPreferences.getInt(str, 0);
        } catch (ClassCastException unused) {
            return 0;
        }
    }

    public static boolean C(String str) throws ih0 {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        x("No EGL display.", !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        x("Error in eglInitialize.", EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0));
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            String strEglQueryString = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373);
            return strEglQueryString != null && strEglQueryString.contains(str);
        }
        throw new ih0("Error in getDefaultEglDisplay, error code: 0x".concat(String.valueOf(Integer.toHexString(iEglGetError))), ca1.u(Integer.valueOf(iEglGetError)));
    }

    public static long D(byte b10, byte b11) {
        int i10;
        int i11;
        int i12 = b10 & 255;
        int i13 = b10 & 3;
        if (i13 != 0) {
            i10 = 2;
            if (i13 != 1 && i13 != 2) {
                i10 = b11 & Utf8.REPLACEMENT_BYTE;
            }
        } else {
            i10 = 1;
        }
        int i14 = i12 >> 3;
        int i15 = i14 & 3;
        if (i14 >= 16) {
            i11 = 2500 << i15;
        } else if (i14 >= 12) {
            i11 = 10000 << (i14 & 1);
        } else {
            i11 = i15 == 3 ? 60000 : 10000 << i15;
        }
        return ((long) i10) * ((long) i11);
    }

    public static long a(ByteBuffer byteBuffer) {
        long j10 = byteBuffer.getInt();
        return j10 < 0 ? j10 + 4294967296L : j10;
    }

    public static synchronized AudioManager b(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                f21675a = null;
            }
            AudioManager audioManager = f21675a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                qf0 qf0Var = new qf0();
                rb0.g().execute(new zd1(13, applicationContext, qf0Var));
                qf0Var.b();
                AudioManager audioManager2 = f21675a;
                if (audioManager2 != null) {
                    return audioManager2;
                }
                throw null;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
            f21675a = audioManager3;
            if (audioManager3 != null) {
                return audioManager3;
            }
            throw null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static zzr c(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            eu0 eu0Var = (eu0) it.next();
            if (eu0Var.f14081c) {
                arrayList.add(AdSize.FLUID);
            } else {
                arrayList.add(new AdSize(eu0Var.f14079a, eu0Var.f14080b));
            }
        }
        return new zzr(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    public static q81 d(q81 q81Var) {
        if ((q81Var instanceof s81) || (q81Var instanceof r81)) {
            return q81Var;
        }
        return q81Var instanceof Serializable ? new r81(q81Var) : new s81(q81Var);
    }

    public static String e(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (u(str.charAt(i10))) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c4 = charArray[i10];
                    if (u(c4)) {
                        charArray[i10] = (char) (c4 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static ArrayList f(byte[] bArr) {
        long j10 = ((bArr[11] & 255) << 8) | (bArr[10] & 255);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((j10 * C.NANOS_PER_SECOND) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static void g(Context context, boolean z10) {
        synchronized (f21692s) {
            try {
                if (f21691r == null) {
                    f21691r = AppSet.getClient(context);
                }
                Task task = f21690q;
                if (task == null || ((task.isComplete() && !f21690q.isSuccessful()) || (z10 && f21690q.isComplete()))) {
                    try {
                        AppSetIdClient appSetIdClient = f21691r;
                        k9.c0.i(appSetIdClient, "the appSetIdClient shouldn't be null");
                        f21690q = appSetIdClient.getAppSetIdInfo();
                    } catch (ArrayIndexOutOfBoundsException e10) {
                        String message = e10.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 31);
                        sb2.append("Failed to get app set ID info: ");
                        sb2.append(message);
                        zze.zza(sb2.toString());
                        f21690q = Tasks.forException(e10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void i(File file, byte[] bArr) throws IOException {
        file.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file, ia1.w(new wb1[0]).contains(wb1.f21483a));
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static void j(String str) {
        if (((Boolean) on.f18306a.o()).booleanValue()) {
            int i10 = zze.zza;
            zzo.zzd(str);
        }
    }

    public static boolean k(Context context) {
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService(X3.i.f27786d);
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null || !display.isHdr() || (hdrCapabilities = display.getHdrCapabilities()) == null) {
            return false;
        }
        for (int i10 : hdrCapabilities.getSupportedHdrTypes()) {
            if (i10 == 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean l(n2 n2Var) {
        np0 np0Var = new np0(8);
        int i10 = a0.c(n2Var, np0Var).f11791a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        n2Var.v(np0Var.f17880a, 0, 4);
        np0Var.E(0);
        int iB = np0Var.b();
        if (iB == 1463899717) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iB).length() + 23);
        sb2.append("Unsupported form type: ");
        sb2.append(iB);
        v71.F("WavHeaderReader", sb2.toString());
        return false;
    }

    public static boolean m(hh hhVar) {
        int iOrdinal = hhVar.ordinal();
        return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0032  */
    public static final hh n(Context context, qz0 qz0Var) {
        hh hhVar;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        boolean zExists = file.exists();
        hh hhVar2 = hh.X86;
        hh hhVar3 = hh.ARM7;
        hh hhVar4 = hh.X86_64;
        hh hhVar5 = hh.ARM64;
        hh hhVar6 = hh.RISCV64;
        hh hhVar7 = hh.UNKNOWN;
        hh hhVar8 = hh.UNSUPPORTED;
        if (zExists) {
            File[] fileArrListFiles = file.listFiles(new yb1(Pattern.compile(".*\\.so$", 2)));
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                if (qz0Var != null) {
                    qz0Var.d(5017, "No .so");
                } else {
                    qz0Var = null;
                }
                hhVar = hhVar7;
            } else {
                try {
                    FileInputStream fileInputStream = new FileInputStream(fileArrListFiles[0]);
                    try {
                        byte[] bArr = new byte[20];
                        if (fileInputStream.read(bArr) == 20) {
                            byte[] bArr2 = {0, 0};
                            if (bArr[5] == 2) {
                                r(bArr, null, qz0Var);
                            } else {
                                bArr2[0] = bArr[19];
                                bArr2[1] = bArr[18];
                                short s10 = ByteBuffer.wrap(bArr2).getShort();
                                if (s10 == 3) {
                                    hhVar = hhVar2;
                                } else if (s10 == 40) {
                                    hhVar = hhVar3;
                                } else if (s10 == 62) {
                                    hhVar = hhVar4;
                                } else if (s10 == 183) {
                                    hhVar = hhVar5;
                                } else if (s10 != 243) {
                                    r(bArr, null, qz0Var);
                                    hhVar = hhVar8;
                                } else {
                                    hhVar = hhVar6;
                                }
                                fileInputStream.close();
                            }
                        }
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (IOException e10) {
                    r(null, e10.toString(), qz0Var);
                }
                hhVar = hhVar8;
            }
        } else {
            if (qz0Var != null) {
                qz0Var.d(5017, "No lib/");
            } else {
                qz0Var = null;
            }
            hhVar = hhVar7;
        }
        if (hhVar == hhVar7) {
            HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
            String property = System.getProperty("os.arch");
            if (TextUtils.isEmpty(property) || !hashSet.contains(property)) {
                try {
                    String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                    if (strArr == null || strArr.length <= 0) {
                        property = Build.CPU_ABI;
                        if (property == null) {
                            property = Build.CPU_ABI2;
                        }
                    } else {
                        property = strArr[0];
                    }
                } catch (IllegalAccessException e11) {
                    if (qz0Var != null) {
                        qz0Var.c(2024, 0L, e11);
                    }
                } catch (NoSuchFieldException e12) {
                    if (qz0Var != null) {
                        qz0Var.c(2024, 0L, e12);
                    }
                }
            }
            if (TextUtils.isEmpty(property)) {
                r(null, "Empty dev arch", qz0Var);
            } else if (!property.equalsIgnoreCase("i686") && !property.equalsIgnoreCase("x86")) {
                if (property.equalsIgnoreCase("x86_64")) {
                    hhVar2 = hhVar4;
                } else if (property.equalsIgnoreCase("arm64-v8a")) {
                    hhVar2 = hhVar5;
                } else if (property.equalsIgnoreCase("armeabi-v7a") || property.equalsIgnoreCase("armv71")) {
                    hhVar2 = hhVar3;
                } else if (property.equalsIgnoreCase("riscv64")) {
                    hhVar2 = hhVar6;
                } else {
                    r(null, property, qz0Var);
                }
            }
            hhVar2 = hhVar8;
        } else {
            hhVar2 = hhVar;
        }
        if (qz0Var != null) {
            qz0Var.d(5018, hhVar2.name());
        }
        return hhVar2;
    }

    public static String o(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c4 = charArray[i10];
                    if (c4 >= 'a' && c4 <= 'z') {
                        charArray[i10] = (char) (c4 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static void p(File file) throws IOException {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException("Unable to create parent directories of ".concat(file.toString()));
        }
    }

    public static void q(File file, File file2) throws Throwable {
        file.getClass();
        file2.getClass();
        if (file.equals(file2)) {
            throw new IllegalArgumentException(dv.B("Source %s and destination %s must be different", file, file2));
        }
        if (file.renameTo(file2)) {
            return;
        }
        if (file.equals(file2)) {
            throw new IllegalArgumentException(dv.B("Source %s and destination %s must be different", file, file2));
        }
        ia1 ia1VarW = ia1.w(new wb1[0]);
        vb1 vb1Var = new vb1();
        ArrayDeque arrayDeque = vb1Var.f21146a;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            arrayDeque.addFirst(fileInputStream);
            FileOutputStream fileOutputStream = new FileOutputStream(file2, ia1VarW.contains(wb1.f21483a));
            arrayDeque.addFirst(fileOutputStream);
            int i10 = tb1.f20283a;
            byte[] bArr = new byte[Segment.SIZE];
            while (true) {
                int i11 = fileInputStream.read(bArr);
                if (i11 == -1) {
                    break;
                } else {
                    fileOutputStream.write(bArr, 0, i11);
                }
            }
            vb1Var.close();
            if (file.delete()) {
                return;
            }
            if (!file2.delete()) {
                throw new IOException("Unable to delete ".concat(file2.toString()));
            }
            throw new IOException("Unable to delete ".concat(file.toString()));
        } catch (Throwable th2) {
            try {
                vb1Var.f21147b = th2;
                Object obj = t81.f20241a;
                if (IOException.class.isInstance(th2)) {
                    throw ((Throwable) IOException.class.cast(th2));
                }
                if (th2 instanceof RuntimeException) {
                    throw ((RuntimeException) th2);
                }
                if (!(th2 instanceof Error)) {
                    throw new RuntimeException(th2);
                }
                throw ((Error) th2);
            } catch (Throwable th3) {
                vb1Var.close();
                throw th3;
            }
        }
    }

    public static final void r(byte[] bArr, String str, qz0 qz0Var) {
        if (qz0Var == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("os.arch:");
        sb2.append(System.getProperty("os.arch"));
        sb2.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb2.append("supported_abis:");
                sb2.append(Arrays.toString(strArr));
                sb2.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb2.append("CPU_ABI:");
        sb2.append(Build.CPU_ABI);
        sb2.append(";CPU_ABI2:");
        sb2.append(Build.CPU_ABI2);
        sb2.append(";");
        if (bArr != null) {
            sb2.append("ELF:");
            sb2.append(Arrays.toString(bArr));
            sb2.append(";");
        }
        if (str != null) {
            wi.d.m(sb2, "dbg:", str, ";");
        }
        qz0Var.d(4007, sb2.toString());
    }

    public static long s(ByteBuffer byteBuffer) {
        long jA = a(byteBuffer) << 32;
        if (jA >= 0) {
            return a(byteBuffer) + jA;
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static a0 t(int i10, n2 n2Var, np0 np0Var) throws ab {
        a0 a0VarC = a0.c(n2Var, np0Var);
        while (true) {
            int i11 = a0VarC.f11791a;
            if (i11 == i10) {
                return a0VarC;
            }
            com.applovin.impl.ca.r(new StringBuilder(String.valueOf(i11).length() + 28), "Ignoring unknown WAV chunk: ", i11, "WavHeaderReader");
            long j10 = a0VarC.f11792b;
            long j11 = 8 + j10;
            if ((1 & j10) != 0) {
                j11 = 9 + j10;
            }
            if (j11 > 2147483647L) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 40);
                sb2.append("Chunk is too large (~2GB+) to skip; id: ");
                sb2.append(i11);
                throw ab.b(sb2.toString());
            }
            n2Var.zzf((int) j11);
            a0VarC = a0.c(n2Var, np0Var);
        }
    }

    public static boolean u(char c4) {
        return c4 >= 'A' && c4 <= 'Z';
    }

    public static double v(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((double) (((((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680)) | (65280 & (bArr[2] << 8))) | (bArr[3] & 255))) / 65536.0d;
    }

    public static void w(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(AppLovinMediationProvider.ADMOB, 0);
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putInt("init_without_write", 0).putInt("crash_without_write", 0).commit();
    }

    public static void x(String str, boolean z10) throws ih0 {
        if (z10) {
            return;
        }
        aa1 aa1Var = ca1.f13122b;
        throw new ih0(str, ya1.f22208e);
    }

    public static boolean y(String str, CharSequence charSequence) {
        char c4;
        int length = str.length();
        if (str == charSequence) {
            return true;
        }
        if (length == charSequence.length()) {
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                char cCharAt2 = charSequence.charAt(i10);
                if (cCharAt == cCharAt2 || ((c4 = (char) ((cCharAt | ' ') - 97)) < 26 && c4 == ((char) ((cCharAt2 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static double z(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((double) (((((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680)) | (65280 & (bArr[2] << 8))) | (bArr[3] & 255))) / 1.073741824E9d;
    }
}
