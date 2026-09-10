package com.bytedance.sdk.component;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.ArrayMap;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class LD {

    @GuardedBy("TTPropHelper.class")
    private static ArrayMap<String, File> JVA = null;
    private static boolean Lxb = false;
    private static Lxb NXR;
    private static ArrayMap<File, LD> sLN;
    private volatile boolean JXs;
    private final Object LD;

    @GuardedBy("mWriteLock")
    private long OY;
    private final File QAg;

    @GuardedBy("mLoadLock")
    private Properties ZU;

    @GuardedBy("this")
    private long ebl;

    @GuardedBy("mLoadLock")
    private int lc;
    private final Object lk;
    private final File nBu;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.LD$LD, reason: collision with other inner class name */
    public static class C0046LD {
        boolean JXs;
        final Properties LD;
        final long Lxb;

        @GuardedBy("mWritingToDiskLock")
        volatile boolean ZU;
        final CountDownLatch lk;

        public void Lxb(boolean z, boolean z2) {
            this.JXs = z;
            this.ZU = z2;
            this.lk.countDown();
        }

        private C0046LD(long j, Properties properties) {
            this.lk = new CountDownLatch(1);
            this.ZU = false;
            this.JXs = false;
            this.Lxb = j;
            this.LD = properties;
        }
    }

    public interface Lxb {
        ExecutorService getExecutorService();
    }

    private LD(File file) {
        Object obj = new Object();
        this.LD = obj;
        this.lk = new Object();
        this.ZU = new Properties();
        this.JXs = false;
        this.lc = 0;
        this.QAg = file;
        this.nBu = Lxb(file);
        synchronized (obj) {
            this.JXs = false;
        }
        Lxb lxb = NXR;
        if (lxb == null || lxb.getExecutorService() == null) {
            new Thread("TTPropHelper") { // from class: com.bytedance.sdk.component.LD.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    LD.this.Lxb();
                }
            }.start();
        } else {
            NXR.getExecutorService().execute(new Runnable() { // from class: com.bytedance.sdk.component.LD.2
                @Override // java.lang.Runnable
                public void run() {
                    LD.this.Lxb();
                }
            });
        }
    }

    public static /* synthetic */ int JXs(LD ld) {
        int i = ld.lc;
        ld.lc = i + 1;
        return i;
    }

    public static /* synthetic */ int QAg(LD ld) {
        int i = ld.lc;
        ld.lc = i - 1;
        return i;
    }

    public static /* synthetic */ long lc(LD ld) {
        long j = ld.ebl;
        ld.ebl = 1 + j;
        return j;
    }

    private void ZU() {
        while (!this.JXs) {
            try {
                this.LD.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public lk LD() {
        return new lk();
    }

    public class lk implements SharedPreferences.Editor {
        private final Object LD = new Object();

        @GuardedBy("mEditorLock")
        private final Map<String, Object> lk = new HashMap();

        @GuardedBy("mEditorLock")
        private boolean ZU = false;

        public lk() {
        }

        private C0046LD LD() {
            Properties properties;
            long j;
            Object obj;
            boolean z;
            synchronized (LD.this.LD) {
                try {
                    if (LD.this.lc > 0) {
                        Properties properties2 = new Properties();
                        properties2.putAll(LD.this.ZU);
                        LD.this.ZU = properties2;
                    }
                    properties = LD.this.ZU;
                    LD.JXs(LD.this);
                    synchronized (this.LD) {
                        try {
                            boolean z2 = false;
                            if (this.ZU) {
                                if (properties.isEmpty()) {
                                    z = false;
                                } else {
                                    properties.clear();
                                    z = true;
                                }
                                this.ZU = false;
                                z2 = z;
                            }
                            for (Map.Entry<String, Object> entry : this.lk.entrySet()) {
                                String key = entry.getKey();
                                Object value = entry.getValue();
                                if (value == this || value == null) {
                                    if (properties.containsKey(key)) {
                                        properties.remove(key);
                                        z2 = true;
                                    }
                                } else if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(String.valueOf(value))) {
                                    properties.put(key, String.valueOf(value));
                                    z2 = true;
                                }
                            }
                            this.lk.clear();
                            if (z2) {
                                LD.lc(LD.this);
                            }
                            j = LD.this.ebl;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return new C0046LD(j, properties);
        }

        public lk Lxb(String str, Set<String> set) {
            synchronized (this.LD) {
                this.lk.put(str, set == null ? null : new HashSet(set));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            LD.this.Lxb(LD(), false);
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            if (LD.Lxb) {
                System.currentTimeMillis();
            }
            C0046LD c0046ldLD = LD();
            LD.this.Lxb(c0046ldLD, true);
            try {
                c0046ldLD.lk.await();
                if (LD.Lxb) {
                    LD.this.QAg.getName();
                    System.currentTimeMillis();
                }
                return c0046ldLD.ZU;
            } catch (InterruptedException unused) {
                if (!LD.Lxb) {
                    return false;
                }
                LD.this.QAg.getName();
                long j = c0046ldLD.Lxb;
                System.currentTimeMillis();
                return false;
            } catch (Throwable th) {
                if (LD.Lxb) {
                    LD.this.QAg.getName();
                    long j2 = c0046ldLD.Lxb;
                    System.currentTimeMillis();
                }
                throw th;
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
            return Lxb(str, (Set<String>) set);
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
        public lk putInt(String str, int i) {
            synchronized (this.LD) {
                this.lk.put(str, Integer.valueOf(i));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
        public lk putLong(String str, long j) {
            synchronized (this.LD) {
                this.lk.put(str, Long.valueOf(j));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
        public lk putFloat(String str, float f) {
            synchronized (this.LD) {
                this.lk.put(str, Float.valueOf(f));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
        public lk putString(String str, String str2) {
            synchronized (this.LD) {
                this.lk.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
        public lk putBoolean(String str, boolean z) {
            synchronized (this.LD) {
                this.lk.put(str, Boolean.valueOf(z));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
        public lk remove(String str) {
            synchronized (this.LD) {
                this.lk.put(str, this);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
        public lk clear() {
            synchronized (this.LD) {
                this.ZU = true;
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:
    
        if (r0 == false) goto L35;
     */
    @androidx.annotation.GuardedBy("mWriteLock")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void LD(com.bytedance.sdk.component.LD.C0046LD r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.LD.LD(com.bytedance.sdk.component.LD$LD, boolean):void");
    }

    public static void Lxb(Lxb lxb) {
        NXR = lxb;
    }

    @RequiresApi(api = 19)
    public static LD Lxb(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_prop";
        }
        synchronized (LD.class) {
            try {
                if (JVA == null) {
                    JVA = new ArrayMap<>();
                }
                File file = JVA.get(str);
                if (file == null) {
                    file = new File(context.getFilesDir(), str);
                    JVA.put(str, file);
                }
                if (sLN == null) {
                    sLN = new ArrayMap<>();
                }
                LD ld = sLN.get(file);
                if (ld != null) {
                    return ld;
                }
                LD ld2 = new LD(file);
                sLN.put(file, ld2);
                return ld2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static File Lxb(File file) {
        return new File(file.getPath() + ".bak");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0072 A[Catch: all -> 0x0075, TryCatch #2 {all -> 0x0075, blocks: (B:37:0x006c, B:39:0x0072, B:42:0x0077, B:43:0x007f), top: B:53:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:53:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void Lxb() {
        synchronized (this.LD) {
            try {
                if (this.JXs) {
                    return;
                }
                if (this.nBu.exists()) {
                    this.QAg.delete();
                    this.nBu.renameTo(this.QAg);
                }
                if (Lxb) {
                    this.QAg.getAbsolutePath();
                    this.QAg.exists();
                }
                Properties properties = null;
                FileInputStream fileInputStream = null;
                if (this.QAg.exists()) {
                    Properties properties2 = new Properties();
                    try {
                        try {
                            FileInputStream fileInputStream2 = new FileInputStream(this.QAg);
                            try {
                                properties2.load(fileInputStream2);
                                if (Lxb) {
                                    properties2.size();
                                    this.QAg.getAbsolutePath();
                                }
                                fileInputStream2.close();
                            } catch (Throwable unused) {
                                fileInputStream = fileInputStream2;
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                properties = properties2;
                                synchronized (this.LD) {
                                    if (properties != null) {
                                        try {
                                            if (!properties.isEmpty()) {
                                                this.ZU = properties;
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    this.JXs = true;
                                    this.LD.notifyAll();
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                    properties = properties2;
                }
                synchronized (this.LD) {
                    if (properties != null) {
                        if (!properties.isEmpty()) {
                            this.ZU = properties;
                        }
                    }
                    this.JXs = true;
                    this.LD.notifyAll();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public String Lxb(String str, String str2) {
        String property;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        synchronized (this.LD) {
            ZU();
            property = this.ZU.getProperty(str, str2);
        }
        return property;
    }

    public int Lxb(String str, int i) {
        int i2;
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        synchronized (this.LD) {
            try {
                try {
                    ZU();
                    i2 = Integer.parseInt(this.ZU.getProperty(str, String.valueOf(i)));
                } catch (NumberFormatException e) {
                    e.getMessage();
                    return i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i2;
    }

    public long Lxb(String str, long j) {
        long j2;
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        synchronized (this.LD) {
            try {
                try {
                    ZU();
                    j2 = Long.parseLong(this.ZU.getProperty(str, String.valueOf(j)));
                } catch (NumberFormatException e) {
                    e.getMessage();
                    return j;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j2;
    }

    public float Lxb(String str, float f) {
        float f2;
        if (TextUtils.isEmpty(str)) {
            return f;
        }
        synchronized (this.LD) {
            try {
                try {
                    ZU();
                    f2 = Float.parseFloat(this.ZU.getProperty(str, String.valueOf(f)));
                } catch (NumberFormatException e) {
                    e.getMessage();
                    return f;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2;
    }

    public boolean Lxb(String str, boolean z) {
        boolean z2;
        if (TextUtils.isEmpty(str)) {
            return z;
        }
        synchronized (this.LD) {
            try {
                try {
                    ZU();
                    z2 = Boolean.parseBoolean(this.ZU.getProperty(str, String.valueOf(z)));
                } catch (NumberFormatException e) {
                    e.getMessage();
                    return z;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public boolean Lxb(String str) {
        boolean zContainsKey;
        synchronized (this.LD) {
            try {
                try {
                    ZU();
                    zContainsKey = this.ZU.containsKey(str);
                } catch (NumberFormatException e) {
                    e.getMessage();
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zContainsKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(final C0046LD c0046ld, final boolean z) {
        boolean z2;
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.LD.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (LD.this.lk) {
                    try {
                        LD.this.LD(c0046ld, z);
                    } catch (OutOfMemoryError unused) {
                    }
                }
                synchronized (LD.this.LD) {
                    LD.QAg(LD.this);
                }
            }
        };
        if (z) {
            synchronized (this.LD) {
                z2 = this.lc == 1;
            }
            if (z2) {
                runnable.run();
                return;
            }
        }
        com.bytedance.sdk.component.lk.Lxb(runnable, true ^ z);
    }
}
