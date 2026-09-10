package sg.bigo.ads.common.aa;

import com.thinkup.core.common.n.mo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileReader;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f47094a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f47095b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f47096c = 1;
    private static long d;

    /* JADX INFO: renamed from: sg.bigo.ads.common.aa.a$a, reason: collision with other inner class name */
    public final class C0833a implements FileFilter {
        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i2 = 3; i2 < name.length(); i2++) {
                if (!Character.isDigit(name.charAt(i2))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static int a() {
        if (f47094a) {
            return f47096c;
        }
        int iA = sg.bigo.ads.common.x.a.a();
        f47096c = iA;
        if (iA != 0) {
            f47094a = true;
            return iA;
        }
        try {
            f47096c = new File("/sys/devices/system/cpu/").listFiles(new C0833a()).length;
        } catch (Throwable unused) {
        }
        if (f47096c <= 1) {
            f47096c = Runtime.getRuntime().availableProcessors();
        }
        f47094a = true;
        sg.bigo.ads.common.x.a.a(f47096c);
        return f47096c;
    }

    public static long b() {
        if (f47095b) {
            long j = d;
            if (j != 0) {
                return j;
            }
        }
        long jB = sg.bigo.ads.common.x.a.b();
        d = jB;
        if (jB != 0) {
            f47095b = true;
            return jB;
        }
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < a(); i4++) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i4 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists() && file.canRead()) {
                    byte[] bArr = new byte[128];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        fileInputStream.read(bArr);
                        int i5 = 0;
                        while (Character.isDigit(bArr[i5]) && i5 < 128) {
                            i5++;
                        }
                        int i6 = Integer.parseInt(new String(bArr, 0, i5));
                        if (i6 > i3) {
                            i3 = i6;
                        }
                    } catch (NumberFormatException unused) {
                    } catch (Throwable th) {
                        fileInputStream.close();
                        throw th;
                    }
                    fileInputStream.close();
                }
            } catch (Exception unused2) {
            }
        }
        if (i3 == -1) {
            FileReader fileReader = new FileReader("/proc/cpuinfo");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    String[] strArrSplit = line.split(":", 2);
                    if ("cpu MHz".equals(strArrSplit[0].replaceAll("[\\t\\n\\r]", ""))) {
                        int i7 = (strArrSplit[1].contains(mo.ono) ? (int) Double.parseDouble(strArrSplit[1]) : Integer.parseInt(strArrSplit[1])) * 1000;
                        if (i7 > i3) {
                            i3 = i7;
                        }
                    }
                } catch (Exception unused3) {
                } catch (Throwable th2) {
                    fileReader.close();
                    bufferedReader.close();
                    throw th2;
                }
            }
            fileReader.close();
            bufferedReader.close();
        }
        i2 = i3;
        f47095b = true;
        long j2 = i2 / 1000;
        d = j2;
        sg.bigo.ads.common.x.a.a(j2);
        return d;
    }
}
