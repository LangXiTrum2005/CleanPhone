package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstaller {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DiagnosticsCallback f7979a = new AnonymousClass1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DiagnosticsCallback f7980b = new AnonymousClass2();

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstaller$2, reason: invalid class name */
    public class AnonymousClass2 implements DiagnosticsCallback {
        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public final void a(int i2, Serializable serializable) {
            String str;
            switch (i2) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i2 == 6 || i2 == 7 || i2 == 8) {
                Log.e("ProfileInstaller", str, (Throwable) serializable);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public final void b() {
            Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface DiagnosticCode {
    }

    public interface DiagnosticsCallback {
        void a(int i2, Serializable serializable);

        void b();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ResultCode {
    }

    public static void a(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0180 A[Catch: all -> 0x017d, TRY_ENTER, TryCatch #12 {all -> 0x017d, blocks: (B:88:0x015c, B:90:0x0168, B:101:0x0180, B:102:0x0185), top: B:230:0x015c }] */
    /* JADX WARN: Code duplicated, block: B:108:0x018f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x0191 A[Catch: IllegalStateException -> 0x0177, IOException -> 0x0179, FileNotFoundException -> 0x017b, TRY_LEAVE, TryCatch #27 {FileNotFoundException -> 0x017b, IOException -> 0x0179, IllegalStateException -> 0x0177, blocks: (B:86:0x0154, B:91:0x0172, B:109:0x0191, B:107:0x018e, B:106:0x018b), top: B:252:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:127:0x01ca A[Catch: all -> 0x01d8, TRY_LEAVE, TryCatch #29 {all -> 0x01d8, blocks: (B:125:0x01be, B:127:0x01ca, B:136:0x01db), top: B:247:0x01be }] */
    /* JADX WARN: Code duplicated, block: B:136:0x01db A[Catch: all -> 0x01d8, TRY_ENTER, TRY_LEAVE, TryCatch #29 {all -> 0x01d8, blocks: (B:125:0x01be, B:127:0x01ca, B:136:0x01db), top: B:247:0x01be }] */
    /* JADX WARN: Code duplicated, block: B:147:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:151:0x0202  */
    /* JADX WARN: Code duplicated, block: B:152:0x0206  */
    /* JADX WARN: Code duplicated, block: B:160:0x0220 A[Catch: all -> 0x0242, TRY_LEAVE, TryCatch #16 {all -> 0x0242, blocks: (B:157:0x0218, B:158:0x021a, B:160:0x0220), top: B:229:0x0218 }] */
    /* JADX WARN: Code duplicated, block: B:201:0x026f  */
    /* JADX WARN: Code duplicated, block: B:206:0x0279  */
    /* JADX WARN: Code duplicated, block: B:211:0x0283  */
    /* JADX WARN: Code duplicated, block: B:230:0x015c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x020a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x01b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x0154 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x0225 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0168 A[Catch: all -> 0x017d, TRY_LEAVE, TryCatch #12 {all -> 0x017d, blocks: (B:88:0x015c, B:90:0x0168, B:101:0x0180, B:102:0x0185), top: B:230:0x015c }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static void b(Context context, Executor executor, DiagnosticsCallback diagnosticsCallback, boolean z2) {
        FileInputStream fileInputStreamA;
        DexProfileData[] dexProfileDataArrG;
        DiagnosticsCallback diagnosticsCallback2;
        DexProfileData[] dexProfileDataArr;
        byte[] bArr;
        ?? r7;
        boolean z3;
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        Throwable th;
        byte[] bArr2;
        int i2;
        ?? r8;
        boolean z4;
        byte[] bArr3;
        ?? byteArrayOutputStream;
        int i3;
        DeviceProfileWriter deviceProfileWriter;
        FileInputStream fileInputStreamA2;
        ?? r9;
        ?? r10;
        boolean z5;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z2) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j = dataInputStream.readLong();
                            dataInputStream.close();
                            z5 = j == packageInfo.lastUpdateTime;
                            if (z5) {
                                diagnosticsCallback.a(2, null);
                            }
                        } catch (Throwable th2) {
                            try {
                                dataInputStream.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (IOException unused) {
                        z5 = false;
                    }
                } else {
                    z5 = false;
                }
                if (z5) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    ProfileVerifier.c(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i4 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            DeviceProfileWriter deviceProfileWriter2 = new DeviceProfileWriter(assets, executor, diagnosticsCallback, name, file2);
            byte[] bArr4 = deviceProfileWriter2.f7968c;
            if (bArr4 != null) {
                if (file2.canWrite()) {
                    deviceProfileWriter2.f = true;
                    ?? r11 = ProfileTranscoder.f7981a;
                    try {
                        fileInputStreamA = deviceProfileWriter2.a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e2) {
                        diagnosticsCallback.a(6, e2);
                        fileInputStreamA = null;
                    } catch (IOException e3) {
                        diagnosticsCallback.a(7, e3);
                        fileInputStreamA = null;
                    }
                    try {
                        try {
                            if (fileInputStreamA != null) {
                                try {
                                    if (!Arrays.equals((byte[]) r11, Encoding.b(fileInputStreamA, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    dexProfileDataArrG = ProfileTranscoder.g(fileInputStreamA, Encoding.b(fileInputStreamA, 4), deviceProfileWriter2.f7969e);
                                    try {
                                        fileInputStreamA.close();
                                    } catch (IOException e4) {
                                        diagnosticsCallback.a(7, e4);
                                    }
                                    deviceProfileWriter2.g = dexProfileDataArrG;
                                } catch (IOException e5) {
                                    diagnosticsCallback.a(7, e5);
                                    fileInputStreamA.close();
                                    dexProfileDataArrG = null;
                                } catch (IllegalStateException e6) {
                                    diagnosticsCallback.a(8, e6);
                                    fileInputStreamA.close();
                                    dexProfileDataArrG = null;
                                }
                            }
                        } catch (IOException e7) {
                            diagnosticsCallback.a(7, e7);
                        }
                        DexProfileData[] dexProfileDataArr2 = deviceProfileWriter2.g;
                        if (dexProfileDataArr2 != null && (i3 = Build.VERSION.SDK_INT) <= 33) {
                            if (i3 != 24 && i3 != 25) {
                                switch (i3) {
                                    case 31:
                                    case 32:
                                    case 33:
                                        fileInputStreamA2 = deviceProfileWriter2.a(assets, "dexopt/baseline.profm");
                                        if (fileInputStreamA2 == null) {
                                            if (fileInputStreamA2 != null) {
                                                fileInputStreamA2.close();
                                            }
                                            deviceProfileWriter = null;
                                        } else {
                                            if (Arrays.equals(ProfileTranscoder.f7982b, Encoding.b(fileInputStreamA2, 4))) {
                                                throw new IllegalStateException("Invalid magic");
                                            }
                                            deviceProfileWriter2.g = ProfileTranscoder.d(fileInputStreamA2, Encoding.b(fileInputStreamA2, 4), bArr4, dexProfileDataArr2);
                                            fileInputStreamA2.close();
                                            deviceProfileWriter = deviceProfileWriter2;
                                        }
                                        if (deviceProfileWriter != null) {
                                            deviceProfileWriter2 = deviceProfileWriter;
                                            break;
                                        }
                                    default:
                                        diagnosticsCallback2 = deviceProfileWriter2.f7967b;
                                        dexProfileDataArr = deviceProfileWriter2.g;
                                        if (dexProfileDataArr != null && (bArr3 = deviceProfileWriter2.f7968c) != null) {
                                            if (deviceProfileWriter2.f) {
                                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                            }
                                            try {
                                                byteArrayOutputStream = new ByteArrayOutputStream();
                                                try {
                                                    byteArrayOutputStream.write(r11);
                                                    byteArrayOutputStream.write(bArr3);
                                                    if (ProfileTranscoder.i(byteArrayOutputStream, bArr3, dexProfileDataArr)) {
                                                        deviceProfileWriter2.f7970h = byteArrayOutputStream.toByteArray();
                                                        byteArrayOutputStream.close();
                                                        deviceProfileWriter2.g = null;
                                                    } else {
                                                        diagnosticsCallback2.a(5, null);
                                                        deviceProfileWriter2.g = null;
                                                        byteArrayOutputStream.close();
                                                    }
                                                } catch (Throwable th4) {
                                                    try {
                                                        byteArrayOutputStream.close();
                                                        throw th4;
                                                    } catch (Throwable th5) {
                                                        th4.addSuppressed(th5);
                                                        throw th4;
                                                    }
                                                }
                                            } catch (IOException e8) {
                                                diagnosticsCallback2.a(7, e8);
                                            } catch (IllegalStateException e9) {
                                                diagnosticsCallback2.a(8, e9);
                                            }
                                        }
                                        bArr = deviceProfileWriter2.f7970h;
                                        if (bArr != null) {
                                            z3 = false;
                                            r8 = 1;
                                        } else {
                                            try {
                                                if (deviceProfileWriter2.f) {
                                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                                }
                                                try {
                                                    try {
                                                        byteArrayInputStream = new ByteArrayInputStream(bArr);
                                                        try {
                                                            fileOutputStream = new FileOutputStream(deviceProfileWriter2.d);
                                                            try {
                                                                try {
                                                                    bArr2 = new byte[512];
                                                                    while (true) {
                                                                        i2 = byteArrayInputStream.read(bArr2);
                                                                        if (i2 > 0) {
                                                                            fileOutputStream.write(bArr2, 0, i2);
                                                                        } else {
                                                                            r8 = 1;
                                                                            try {
                                                                                deviceProfileWriter2.b(1, null);
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                deviceProfileWriter2.f7970h = null;
                                                                                deviceProfileWriter2.g = null;
                                                                                z3 = true;
                                                                            } catch (Throwable th6) {
                                                                                th = th6;
                                                                            }
                                                                        }
                                                                        th = th;
                                                                        try {
                                                                            fileOutputStream.close();
                                                                            throw th;
                                                                        } catch (Throwable th7) {
                                                                            th.addSuppressed(th7);
                                                                            throw th;
                                                                        }
                                                                    }
                                                                } catch (Throwable th8) {
                                                                    th = th8;
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                                Throwable th10 = th;
                                                                try {
                                                                    byteArrayInputStream.close();
                                                                    throw th10;
                                                                } catch (Throwable th11) {
                                                                    th10.addSuppressed(th11);
                                                                    throw th10;
                                                                }
                                                            }
                                                        } catch (Throwable th12) {
                                                            th = th12;
                                                        }
                                                    } catch (FileNotFoundException e10) {
                                                        e = e10;
                                                        r11 = 1;
                                                        deviceProfileWriter2.b(6, e);
                                                        r7 = r11;
                                                        deviceProfileWriter2.f7970h = null;
                                                        deviceProfileWriter2.g = null;
                                                        z3 = false;
                                                        r8 = r7;
                                                    } catch (IOException e11) {
                                                        e = e11;
                                                        r11 = 1;
                                                        deviceProfileWriter2.b(7, e);
                                                        r7 = r11;
                                                        deviceProfileWriter2.f7970h = null;
                                                        deviceProfileWriter2.g = null;
                                                        z3 = false;
                                                        r8 = r7;
                                                    }
                                                } catch (FileNotFoundException e12) {
                                                    e = e12;
                                                    deviceProfileWriter2.b(6, e);
                                                    r7 = r11;
                                                    deviceProfileWriter2.f7970h = null;
                                                    deviceProfileWriter2.g = null;
                                                    z3 = false;
                                                    r8 = r7;
                                                } catch (IOException e13) {
                                                    e = e13;
                                                    deviceProfileWriter2.b(7, e);
                                                    r7 = r11;
                                                    deviceProfileWriter2.f7970h = null;
                                                    deviceProfileWriter2.g = null;
                                                    z3 = false;
                                                    r8 = r7;
                                                }
                                            } catch (Throwable th13) {
                                                deviceProfileWriter2.f7970h = null;
                                                deviceProfileWriter2.g = null;
                                                throw th13;
                                            }
                                        }
                                        if (z3) {
                                            a(packageInfo, filesDir);
                                        }
                                        z4 = z3;
                                        r9 = r8;
                                        break;
                                }
                            } else {
                                try {
                                    fileInputStreamA2 = deviceProfileWriter2.a(assets, "dexopt/baseline.profm");
                                    if (fileInputStreamA2 == null) {
                                        try {
                                            if (Arrays.equals(ProfileTranscoder.f7982b, Encoding.b(fileInputStreamA2, 4))) {
                                                throw new IllegalStateException("Invalid magic");
                                            }
                                            deviceProfileWriter2.g = ProfileTranscoder.d(fileInputStreamA2, Encoding.b(fileInputStreamA2, 4), bArr4, dexProfileDataArr2);
                                            fileInputStreamA2.close();
                                            deviceProfileWriter = deviceProfileWriter2;
                                        } catch (Throwable th14) {
                                            try {
                                                fileInputStreamA2.close();
                                                throw th14;
                                            } catch (Throwable th15) {
                                                th14.addSuppressed(th15);
                                                throw th14;
                                            }
                                        }
                                    } else {
                                        if (fileInputStreamA2 != null) {
                                            fileInputStreamA2.close();
                                        }
                                        deviceProfileWriter = null;
                                    }
                                } catch (FileNotFoundException e14) {
                                    diagnosticsCallback.a(9, e14);
                                } catch (IOException e15) {
                                    diagnosticsCallback.a(7, e15);
                                } catch (IllegalStateException e16) {
                                    deviceProfileWriter2.g = null;
                                    diagnosticsCallback.a(8, e16);
                                }
                                if (deviceProfileWriter != null) {
                                    deviceProfileWriter2 = deviceProfileWriter;
                                }
                            }
                        }
                        diagnosticsCallback2 = deviceProfileWriter2.f7967b;
                        dexProfileDataArr = deviceProfileWriter2.g;
                        if (dexProfileDataArr != null) {
                            if (deviceProfileWriter2.f) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            byteArrayOutputStream.write(r11);
                            byteArrayOutputStream.write(bArr3);
                            if (ProfileTranscoder.i(byteArrayOutputStream, bArr3, dexProfileDataArr)) {
                                diagnosticsCallback2.a(5, null);
                                deviceProfileWriter2.g = null;
                                byteArrayOutputStream.close();
                            } else {
                                deviceProfileWriter2.f7970h = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                deviceProfileWriter2.g = null;
                            }
                        }
                        bArr = deviceProfileWriter2.f7970h;
                        if (bArr != null) {
                            if (deviceProfileWriter2.f) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            byteArrayInputStream = new ByteArrayInputStream(bArr);
                            fileOutputStream = new FileOutputStream(deviceProfileWriter2.d);
                            bArr2 = new byte[512];
                            while (true) {
                                i2 = byteArrayInputStream.read(bArr2);
                                if (i2 > 0) {
                                    fileOutputStream.write(bArr2, 0, i2);
                                } else {
                                    r8 = 1;
                                    deviceProfileWriter2.b(1, null);
                                    fileOutputStream.close();
                                    byteArrayInputStream.close();
                                    deviceProfileWriter2.f7970h = null;
                                    deviceProfileWriter2.g = null;
                                    z3 = true;
                                }
                                th = th;
                                fileOutputStream.close();
                                throw th;
                            }
                        }
                        z3 = false;
                        r8 = 1;
                        if (z3) {
                            a(packageInfo, filesDir);
                        }
                        z4 = z3;
                        r9 = r8;
                    } catch (Throwable th16) {
                        try {
                            fileInputStreamA.close();
                            throw th16;
                        } catch (IOException e17) {
                            diagnosticsCallback.a(7, e17);
                            throw th16;
                        }
                    }
                } else {
                    deviceProfileWriter2.b(4, null);
                }
                if (z4 || !z2) {
                    r10 = 0;
                } else {
                    r10 = r9;
                }
                ProfileVerifier.c(context, r10);
            }
            deviceProfileWriter2.b(3, Integer.valueOf(i4));
            z4 = false;
            r9 = 1;
            if (z4) {
                r10 = 0;
            } else {
                r10 = 0;
            }
            ProfileVerifier.c(context, r10);
        } catch (PackageManager.NameNotFoundException e18) {
            diagnosticsCallback.a(7, e18);
            ProfileVerifier.c(context, false);
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstaller$1, reason: invalid class name */
    public class AnonymousClass1 implements DiagnosticsCallback {
        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public final void b() {
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public final void a(int i2, Serializable serializable) {
        }
    }
}
