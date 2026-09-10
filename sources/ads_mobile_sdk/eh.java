package ads_mobile_sdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.base.StandardSystemProperty;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;
import kaif.impromptu;
import saneness.psalmodic;

/* JADX INFO: loaded from: classes.dex */
public final class eh {
    public final Context a;
    public final psalmodic b;

    public eh(Context context, psalmodic psalmodicVar) {
        this.a = context;
        this.b = psalmodicVar;
    }

    public final void a(String str, byte[] bArr) {
        if (this.b == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("os.arch:");
        sb.append(StandardSystemProperty.OS_ARCH.value());
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
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        psalmodic psalmodicVar = this.b;
        ((kc1) ((x4) psalmodicVar).a).a(4007, -1L, null, sb.toString());
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(Boolean.TRUE);
        taskCompletionSource.getTask();
    }

    public final dh a() {
        dh dhVar;
        File file = new File(new File(this.a.getApplicationInfo().dataDir), "lib");
        if (!file.exists()) {
            psalmodic psalmodicVar = this.b;
            if (psalmodicVar != null) {
                ((kc1) ((x4) psalmodicVar).a).a(5017, -1L, null, "No lib/");
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                taskCompletionSource.setResult(Boolean.TRUE);
                taskCompletionSource.getTask();
            }
            dhVar = dh.UNKNOWN;
        } else {
            File[] fileArrListFiles = file.listFiles(new impromptu(Pattern.compile(".*\\.so$", 2)));
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(fileArrListFiles[0]);
                    try {
                        byte[] bArr = new byte[20];
                        if (fileInputStream.read(bArr) == 20) {
                            byte[] bArr2 = {0, 0};
                            if (bArr[5] == 2) {
                                a(null, bArr);
                                dhVar = dh.UNSUPPORTED;
                                fileInputStream.close();
                            } else {
                                bArr2[0] = bArr[19];
                                bArr2[1] = bArr[18];
                                short s = ByteBuffer.wrap(bArr2).getShort();
                                if (s == 3) {
                                    dhVar = dh.X86;
                                } else if (s == 40) {
                                    dhVar = dh.ARM7;
                                } else if (s == 62) {
                                    dhVar = dh.X86_64;
                                } else if (s == 183) {
                                    dhVar = dh.ARM64;
                                } else if (s != 243) {
                                    a(null, bArr);
                                    dhVar = dh.UNSUPPORTED;
                                } else {
                                    dhVar = dh.RISCV64;
                                }
                                fileInputStream.close();
                            }
                        } else {
                            fileInputStream.close();
                            dhVar = dh.UNSUPPORTED;
                        }
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException e) {
                    a(e.toString(), null);
                }
            } else {
                psalmodic psalmodicVar2 = this.b;
                if (psalmodicVar2 != null) {
                    ((kc1) ((x4) psalmodicVar2).a).a(5017, -1L, null, "No .so");
                    TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                    taskCompletionSource2.setResult(Boolean.TRUE);
                    taskCompletionSource2.getTask();
                }
                dhVar = dh.UNKNOWN;
            }
        }
        if (dhVar == dh.UNKNOWN) {
            HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
            String strValue = StandardSystemProperty.OS_ARCH.value();
            if (TextUtils.isEmpty(strValue) || !hashSet.contains(strValue)) {
                try {
                    String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                    if (strArr != null && strArr.length > 0) {
                        strValue = strArr[0];
                    } else {
                        strValue = Build.CPU_ABI;
                        if (strValue == null) {
                            strValue = Build.CPU_ABI2;
                        }
                    }
                } catch (IllegalAccessException e2) {
                    psalmodic psalmodicVar3 = this.b;
                    if (psalmodicVar3 != null) {
                        psalmodicVar3.a(2024, 0L, e2);
                    }
                } catch (NoSuchFieldException e3) {
                    psalmodic psalmodicVar4 = this.b;
                    if (psalmodicVar4 != null) {
                        psalmodicVar4.a(2024, 0L, e3);
                    }
                }
            }
            if (TextUtils.isEmpty(strValue)) {
                a("Empty dev arch", null);
                dhVar = dh.UNSUPPORTED;
            } else if (!strValue.equalsIgnoreCase("i686") && !strValue.equalsIgnoreCase("x86")) {
                if (strValue.equalsIgnoreCase("x86_64")) {
                    dhVar = dh.X86_64;
                } else if (strValue.equalsIgnoreCase("arm64-v8a")) {
                    dhVar = dh.ARM64;
                } else if (!strValue.equalsIgnoreCase("armeabi-v7a") && !strValue.equalsIgnoreCase("armv71")) {
                    if (strValue.equalsIgnoreCase("riscv64")) {
                        dhVar = dh.RISCV64;
                    } else {
                        a(strValue, null);
                        dhVar = dh.UNSUPPORTED;
                    }
                } else {
                    dhVar = dh.ARM7;
                }
            } else {
                dhVar = dh.X86;
            }
        }
        psalmodic psalmodicVar5 = this.b;
        if (psalmodicVar5 != null) {
            ((kc1) ((x4) psalmodicVar5).a).a(5018, -1L, null, dhVar.name());
            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
            taskCompletionSource3.setResult(Boolean.TRUE);
            taskCompletionSource3.getTask();
        }
        return dhVar;
    }
}
