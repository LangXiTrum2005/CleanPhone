package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfvc {
    public static boolean zza(zzbbq zzbbqVar) {
        int iOrdinal = zzbbqVar.ordinal();
        return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5;
    }

    public static final zzbbq zzb(Context context, zzfuf zzfufVar) {
        zzbbq zzbbqVar;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles(new zzgwl(Pattern.compile(".*\\.so$", 2)));
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                if (zzfufVar != null) {
                    zzfufVar.zze(5017, "No .so");
                } else {
                    zzfufVar = null;
                }
                zzbbqVar = zzbbq.UNKNOWN;
            } else {
                try {
                    FileInputStream fileInputStream = new FileInputStream(fileArrListFiles[0]);
                    try {
                        byte[] bArr = new byte[20];
                        if (fileInputStream.read(bArr) == 20) {
                            byte[] bArr2 = {0, 0};
                            if (bArr[5] == 2) {
                                zzc(bArr, null, context, zzfufVar);
                                zzbbqVar = zzbbq.UNSUPPORTED;
                            } else {
                                bArr2[0] = bArr[19];
                                bArr2[1] = bArr[18];
                                short s = ByteBuffer.wrap(bArr2).getShort();
                                if (s == 3) {
                                    zzbbqVar = zzbbq.X86;
                                } else if (s == 40) {
                                    zzbbqVar = zzbbq.ARM7;
                                } else if (s == 62) {
                                    zzbbqVar = zzbbq.X86_64;
                                } else if (s == 183) {
                                    zzbbqVar = zzbbq.ARM64;
                                } else if (s != 243) {
                                    zzc(bArr, null, context, zzfufVar);
                                    zzbbqVar = zzbbq.UNSUPPORTED;
                                } else {
                                    zzbbqVar = zzbbq.RISCV64;
                                }
                            }
                            fileInputStream.close();
                        } else {
                            fileInputStream.close();
                            zzbbqVar = zzbbq.UNSUPPORTED;
                        }
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    zzc(null, e2.toString(), context, zzfufVar);
                }
            }
        } else {
            if (zzfufVar != null) {
                zzfufVar.zze(5017, "No lib/");
            } else {
                zzfufVar = null;
            }
            zzbbqVar = zzbbq.UNKNOWN;
        }
        if (zzbbqVar == zzbbq.UNKNOWN) {
            String strZzd = zzd(context, zzfufVar);
            if (TextUtils.isEmpty(strZzd)) {
                zzc(null, "Empty dev arch", context, zzfufVar);
                zzbbqVar = zzbbq.UNSUPPORTED;
            } else if (strZzd.equalsIgnoreCase("i686") || strZzd.equalsIgnoreCase("x86")) {
                zzbbqVar = zzbbq.X86;
            } else if (strZzd.equalsIgnoreCase("x86_64")) {
                zzbbqVar = zzbbq.X86_64;
            } else if (strZzd.equalsIgnoreCase("arm64-v8a")) {
                zzbbqVar = zzbbq.ARM64;
            } else if (strZzd.equalsIgnoreCase("armeabi-v7a") || strZzd.equalsIgnoreCase("armv71")) {
                zzbbqVar = zzbbq.ARM7;
            } else if (strZzd.equalsIgnoreCase("riscv64")) {
                zzbbqVar = zzbbq.RISCV64;
            } else {
                zzc(null, strZzd, context, zzfufVar);
                zzbbqVar = zzbbq.UNSUPPORTED;
            }
        }
        if (zzfufVar != null) {
            zzfufVar.zze(5018, zzbbqVar.name());
        }
        return zzbbqVar;
    }

    private static final void zzc(byte[] bArr, String str, Context context, zzfuf zzfufVar) {
        if (zzfufVar == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("os.arch:");
        sb.append(zzgqq.OS_ARCH.zza());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            android.support.v4.media.a.A(sb, "dbg:", str, ";");
        }
        zzfufVar.zze(4007, sb.toString());
    }

    private static final String zzd(Context context, zzfuf zzfufVar) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String strZza = zzgqq.OS_ARCH.zza();
        if (!TextUtils.isEmpty(strZza) && hashSet.contains(strZza)) {
            return strZza;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (IllegalAccessException e2) {
            if (zzfufVar != null) {
                zzfufVar.zzc(2024, 0L, e2);
            }
        } catch (NoSuchFieldException e3) {
            if (zzfufVar != null) {
                zzfufVar.zzc(2024, 0L, e3);
            }
        }
        String str = Build.CPU_ABI;
        return str != null ? str : Build.CPU_ABI2;
    }
}
