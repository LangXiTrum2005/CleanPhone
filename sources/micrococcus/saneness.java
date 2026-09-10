package micrococcus;

import android.os.Process;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: FileCache.java */
/* JADX INFO: loaded from: classes3.dex */
public class saneness {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static Map<String, saneness> f33405saneness = new HashMap();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public C0730saneness f33406attabal;

    /* JADX INFO: compiled from: FileCache.java */
    public static class dern {
        public static boolean beachfront(byte[] bArr) {
            return bArr != null && bArr.length > 15 && bArr[13] == 45 && competently(bArr, ' ') > 14;
        }

        public static int competently(byte[] bArr, char c) {
            for (int i = 0; i < bArr.length; i++) {
                if (bArr[i] == c) {
                    return i;
                }
            }
            return -1;
        }

        public static String dern(String str) {
            return (str == null || !beachfront(str.getBytes())) ? str : str.substring(str.indexOf(32) + 1, str.length());
        }

        public static boolean impromptu(String str) {
            return taiyuan(str.getBytes());
        }

        public static String[] marial(byte[] bArr) {
            if (beachfront(bArr)) {
                return new String[]{new String(wireman(bArr, 0, 13)), new String(wireman(bArr, 14, competently(bArr, ' ')))};
            }
            return null;
        }

        public static boolean taiyuan(byte[] bArr) {
            String[] strArrMarial = marial(bArr);
            if (strArrMarial != null && strArrMarial.length == 2) {
                String strSubstring = strArrMarial[0];
                while (strSubstring.startsWith("0")) {
                    strSubstring = strSubstring.substring(1, strSubstring.length());
                }
                if (System.currentTimeMillis() > Long.valueOf(strSubstring).longValue() + (Long.valueOf(strArrMarial[1]).longValue() * 1000)) {
                    return true;
                }
            }
            return false;
        }

        public static byte[] wireman(byte[] bArr, int i, int i2) {
            int i3 = i2 - i;
            if (i3 >= 0) {
                byte[] bArr2 = new byte[i3];
                System.arraycopy(bArr, i, bArr2, 0, Math.min(bArr.length - i, i3));
                return bArr2;
            }
            throw new IllegalArgumentException(i + " > " + i2);
        }
    }

    /* JADX INFO: renamed from: micrococcus.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FileCache.java */
    public class C0730saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final AtomicLong f33407attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public File f33408beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final long f33410dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final Map<File, Long> f33411marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final AtomicInteger f33412saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final int f33413wireman;

        /* JADX INFO: renamed from: micrococcus.saneness$saneness$attabal */
        /* JADX INFO: compiled from: FileCache.java */
        public class attabal implements Runnable {
            public attabal() {
            }

            @Override // java.lang.Runnable
            public void run() {
                File[] fileArrListFiles = C0730saneness.this.f33408beachfront.listFiles();
                if (fileArrListFiles != null) {
                    int iCutely = 0;
                    int i = 0;
                    for (File file : fileArrListFiles) {
                        iCutely = (int) (((long) iCutely) + C0730saneness.this.cutely(file));
                        i++;
                        C0730saneness.this.f33411marial.put(file, Long.valueOf(file.lastModified()));
                    }
                    C0730saneness.this.f33407attabal.set(iCutely);
                    C0730saneness.this.f33412saneness.set(i);
                }
            }
        }

        public final File apical(String str) {
            File fileFormularize = formularize(str);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long lValueOf = Long.valueOf(jCurrentTimeMillis);
            fileFormularize.setLastModified(jCurrentTimeMillis);
            this.f33411marial.put(fileFormularize, lValueOf);
            return fileFormularize;
        }

        public final long cutely(File file) {
            return file.length();
        }

        public final File formularize(String str) {
            return new File(this.f33408beachfront, str.hashCode() + "");
        }

        public final void impassible(File file) {
            int iAddAndGet = this.f33412saneness.get();
            while (iAddAndGet + 1 > this.f33413wireman) {
                this.f33407attabal.addAndGet(-kowloon());
                iAddAndGet = this.f33412saneness.addAndGet(-1);
            }
            this.f33412saneness.addAndGet(1);
            long jCutely = cutely(file);
            long jAddAndGet = this.f33407attabal.get();
            while (jAddAndGet + jCutely > this.f33410dern) {
                jAddAndGet = this.f33407attabal.addAndGet(-kowloon());
            }
            this.f33407attabal.addAndGet(jCutely);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long lValueOf = Long.valueOf(jCurrentTimeMillis);
            file.setLastModified(jCurrentTimeMillis);
            this.f33411marial.put(file, lValueOf);
        }

        public final long kowloon() {
            File key;
            if (this.f33411marial.isEmpty()) {
                return 0L;
            }
            Set<Map.Entry<File, Long>> setEntrySet = this.f33411marial.entrySet();
            synchronized (this.f33411marial) {
                try {
                    key = null;
                    Long value = null;
                    for (Map.Entry<File, Long> entry : setEntrySet) {
                        if (key == null) {
                            key = entry.getKey();
                            value = entry.getValue();
                        } else {
                            Long value2 = entry.getValue();
                            if (value2.longValue() < value.longValue()) {
                                key = entry.getKey();
                                value = value2;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            long jCutely = cutely(key);
            if (key.delete()) {
                this.f33411marial.remove(key);
            }
            return jCutely;
        }

        public final void taiyuan() {
            new Thread(new attabal()).start();
        }

        public final boolean triweekly(String str) {
            return apical(str).delete();
        }

        public C0730saneness(File file, long j, int i) {
            this.f33411marial = Collections.synchronizedMap(new HashMap());
            this.f33408beachfront = file;
            this.f33410dern = j;
            this.f33413wireman = i;
            this.f33407attabal = new AtomicLong();
            this.f33412saneness = new AtomicInteger();
            taiyuan();
        }
    }

    public saneness(File file, long j, int i) {
        if (file.exists() || file.mkdirs()) {
            this.f33406attabal = new C0730saneness(file, j, i);
            return;
        }
        throw new RuntimeException("can't make dirs in " + file.getAbsolutePath());
    }

    public static saneness attabal(File file, long j, int i) {
        saneness sanenessVar = f33405saneness.get(file.getAbsoluteFile() + dern());
        if (sanenessVar != null) {
            return sanenessVar;
        }
        saneness sanenessVar2 = new saneness(file, j, i);
        f33405saneness.put(file.getAbsolutePath() + dern(), sanenessVar2);
        return sanenessVar2;
    }

    public static String dern() {
        return "_" + Process.myPid();
    }

    public boolean marial(String str) {
        return this.f33406attabal.triweekly(str);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public String saneness(String str) throws Throwable {
        BufferedReader bufferedReader;
        File fileApical = this.f33406attabal.apical(str);
        BufferedReader bufferedReader2 = null;
        if (!fileApical.exists()) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(fileApical));
            try {
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                        th = th;
                        bufferedReader2 = bufferedReader;
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        throw th;
                    }
                    if (dern.impromptu(sb.toString())) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                        marial(str);
                        return null;
                    }
                    String strDern = dern.dern(sb.toString());
                    try {
                        bufferedReader.close();
                        return strDern;
                    } catch (IOException e3) {
                        e3.printStackTrace();
                        return strDern;
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                }
            } catch (IOException e4) {
                e = e4;
                e.printStackTrace();
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                return null;
            }
        } catch (IOException e6) {
            e = e6;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
        th = th;
        bufferedReader2 = bufferedReader;
        if (bufferedReader2 != null) {
            bufferedReader2.close();
        }
        throw th;
    }

    public boolean wireman(String str, String str2) throws Throwable {
        File fileFormularize = this.f33406attabal.formularize(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(fileFormularize), 1024);
                try {
                    bufferedWriter2.write(str2);
                    try {
                        bufferedWriter2.flush();
                        bufferedWriter2.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    this.f33406attabal.impassible(fileFormularize);
                    return true;
                } catch (IOException e2) {
                    e = e2;
                    bufferedWriter = bufferedWriter2;
                    e.printStackTrace();
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.flush();
                            bufferedWriter.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    this.f33406attabal.impassible(fileFormularize);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.flush();
                            bufferedWriter.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    this.f33406attabal.impassible(fileFormularize);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e5) {
            e = e5;
        }
    }
}
