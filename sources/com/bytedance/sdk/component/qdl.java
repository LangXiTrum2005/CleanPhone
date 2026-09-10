package com.bytedance.sdk.component;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class qdl {
    private static ArrayMap<File, qdl> exu = null;
    private static ArrayMap<String, File> fs = null;
    protected static InterfaceC0090qdl qdl = null;
    private static boolean ud = false;
    private long jpc;
    private final Object lnr;
    private final Object mml;
    private volatile boolean mo;
    private Properties mzz;
    private final File rq;
    private final File to;
    private long tvp;
    private int wd;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.qdl$qdl, reason: collision with other inner class name */
    public interface InterfaceC0090qdl {
        ExecutorService getExecutorService();

        HandlerThread getSafeHandlerThread(String str, int i2);
    }

    public static class ud {
        final CountDownLatch lnr;
        volatile boolean mml;
        boolean mzz;
        final long qdl;
        final Properties ud;

        public void qdl(boolean z2, boolean z3) {
            this.mzz = z2;
            this.mml = z3;
            this.lnr.countDown();
        }

        private ud(long j, Properties properties) {
            this.lnr = new CountDownLatch(1);
            this.mml = false;
            this.mzz = false;
            this.qdl = j;
            this.ud = properties;
        }
    }

    private qdl(File file) {
        Object obj = new Object();
        this.lnr = obj;
        this.mml = new Object();
        this.mzz = new Properties();
        this.mo = false;
        this.wd = 0;
        this.to = file;
        this.rq = qdl(file);
        synchronized (obj) {
            this.mo = false;
        }
        InterfaceC0090qdl interfaceC0090qdl = qdl;
        if (interfaceC0090qdl == null || interfaceC0090qdl.getExecutorService() == null) {
            new Thread("TTPropHelper") { // from class: com.bytedance.sdk.component.qdl.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    qdl.this.qdl();
                }
            }.start();
        } else {
            qdl.getExecutorService().execute(new Runnable() { // from class: com.bytedance.sdk.component.qdl.2
                @Override // java.lang.Runnable
                public void run() {
                    qdl.this.qdl();
                }
            });
        }
    }

    public static /* synthetic */ long mo(qdl qdlVar) {
        long j = qdlVar.jpc;
        qdlVar.jpc = 1 + j;
        return j;
    }

    public static /* synthetic */ int mzz(qdl qdlVar) {
        int i2 = qdlVar.wd;
        qdlVar.wd = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int tvp(qdl qdlVar) {
        int i2 = qdlVar.wd;
        qdlVar.wd = i2 - 1;
        return i2;
    }

    private void mml() {
        while (!this.mo) {
            try {
                this.lnr.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public lnr ud() {
        return new lnr();
    }

    public class lnr implements SharedPreferences.Editor {
        private final Object ud = new Object();
        private final Map<String, Object> lnr = new HashMap();
        private boolean mml = false;

        public lnr() {
        }

        private ud ud() {
            Properties properties;
            long j;
            Object obj;
            boolean z2;
            synchronized (qdl.this.lnr) {
                try {
                    if (qdl.this.wd > 0) {
                        Properties properties2 = new Properties();
                        properties2.putAll(qdl.this.mzz);
                        qdl.this.mzz = properties2;
                    }
                    properties = qdl.this.mzz;
                    qdl.mzz(qdl.this);
                    synchronized (this.ud) {
                        try {
                            boolean z3 = false;
                            if (this.mml) {
                                if (properties.isEmpty()) {
                                    z2 = false;
                                } else {
                                    properties.clear();
                                    z2 = true;
                                }
                                this.mml = false;
                                z3 = z2;
                            }
                            for (Map.Entry<String, Object> entry : this.lnr.entrySet()) {
                                String key = entry.getKey();
                                Object value = entry.getValue();
                                if (value == this || value == null) {
                                    if (properties.containsKey(key)) {
                                        properties.remove(key);
                                        z3 = true;
                                    }
                                } else if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(String.valueOf(value))) {
                                    properties.put(key, String.valueOf(value));
                                    z3 = true;
                                }
                            }
                            this.lnr.clear();
                            if (z3) {
                                qdl.mo(qdl.this);
                            }
                            j = qdl.this.jpc;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return new ud(j, properties);
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            qdl.this.qdl(ud(), false);
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            long jCurrentTimeMillis = qdl.ud ? System.currentTimeMillis() : 0L;
            ud udVarUd = ud();
            qdl.this.qdl(udVarUd, true);
            try {
                udVarUd.lnr.await();
                return udVarUd.mml;
            } catch (InterruptedException unused) {
            } finally {
                if (qdl.ud) {
                    Log.d("TTPropHelper", qdl.this.to.getName() + ":" + udVarUd.qdl + " committed after " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                }
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
            return qdl(str, (Set<String>) set);
        }

        public lnr qdl(String str, Set<String> set) {
            synchronized (this.ud) {
                this.lnr.put(str, set == null ? null : new HashSet(set));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public lnr putInt(String str, int i2) {
            synchronized (this.ud) {
                this.lnr.put(str, Integer.valueOf(i2));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public lnr putLong(String str, long j) {
            synchronized (this.ud) {
                this.lnr.put(str, Long.valueOf(j));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public lnr putFloat(String str, float f) {
            synchronized (this.ud) {
                this.lnr.put(str, Float.valueOf(f));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public lnr putString(String str, String str2) {
            synchronized (this.ud) {
                this.lnr.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public lnr putBoolean(String str, boolean z2) {
            synchronized (this.ud) {
                this.lnr.put(str, Boolean.valueOf(z2));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public lnr remove(String str) {
            synchronized (this.ud) {
                this.lnr.put(str, this);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public lnr clear() {
            synchronized (this.ud) {
                this.mml = true;
            }
            return this;
        }
    }

    public static void qdl(InterfaceC0090qdl interfaceC0090qdl) {
        qdl = interfaceC0090qdl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:118:0x0115 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0126 A[Catch: all -> 0x012b, TryCatch #8 {all -> 0x012b, blocks: (B:39:0x0090, B:40:0x0092, B:78:0x0122, B:80:0x0126, B:84:0x012f, B:86:0x0138, B:88:0x0140, B:90:0x014c, B:98:0x0197, B:99:0x0198, B:59:0x00f0, B:77:0x0121, B:62:0x00f5, B:63:0x00fb, B:76:0x011a, B:97:0x0196, B:96:0x018d), top: B:121:0x0090, inners: #3, #10 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x012d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0138 A[Catch: all -> 0x012b, TryCatch #8 {all -> 0x012b, blocks: (B:39:0x0090, B:40:0x0092, B:78:0x0122, B:80:0x0126, B:84:0x012f, B:86:0x0138, B:88:0x0140, B:90:0x014c, B:98:0x0197, B:99:0x0198, B:59:0x00f0, B:77:0x0121, B:62:0x00f5, B:63:0x00fb, B:76:0x011a, B:97:0x0196, B:96:0x018d), top: B:121:0x0090, inners: #3, #10 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x013e  */
    /* JADX WARN: Code duplicated, block: B:90:0x014c A[Catch: all -> 0x012b, TRY_LEAVE, TryCatch #8 {all -> 0x012b, blocks: (B:39:0x0090, B:40:0x0092, B:78:0x0122, B:80:0x0126, B:84:0x012f, B:86:0x0138, B:88:0x0140, B:90:0x014c, B:98:0x0197, B:99:0x0198, B:59:0x00f0, B:77:0x0121, B:62:0x00f5, B:63:0x00fb, B:76:0x011a, B:97:0x0196, B:96:0x018d), top: B:121:0x0090, inners: #3, #10 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:90:0x014c, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.io.FileOutputStream] */
    public void ud(ud udVar, boolean z2) {
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        Throwable th;
        long jCurrentTimeMillis3;
        ?? r11;
        FileOutputStream fileOutputStream;
        String str;
        String message;
        long jCurrentTimeMillis4;
        long jCurrentTimeMillis5;
        boolean z3;
        long jCurrentTimeMillis6 = ud ? System.currentTimeMillis() : 0L;
        boolean zExists = this.to.exists();
        if (ud) {
            jCurrentTimeMillis = System.currentTimeMillis();
            jCurrentTimeMillis2 = jCurrentTimeMillis;
        } else {
            jCurrentTimeMillis = 0;
            jCurrentTimeMillis2 = 0;
        }
        if (zExists) {
            if (this.tvp >= udVar.qdl) {
                z3 = false;
            } else if (z2) {
                z3 = true;
            } else {
                synchronized (this.lnr) {
                    z3 = this.jpc == udVar.qdl;
                }
            }
            if (!z3) {
                udVar.qdl(false, true);
                return;
            }
            boolean zExists2 = this.rq.exists();
            if (ud) {
                jCurrentTimeMillis2 = System.currentTimeMillis();
            }
            if (!zExists2) {
                if (!this.to.renameTo(this.rq)) {
                    Log.e("TTPropHelper", "Couldn't rename file " + this.to + " to backup file " + this.rq);
                    udVar.qdl(false, false);
                    return;
                }
            } else {
                this.to.delete();
            }
        }
        try {
            synchronized (this.mml) {
                Object obj = null;
                String str2 = null;
                FileOutputStream fileOutputStream2 = null;
                try {
                    try {
                        FileOutputStream fileOutputStream3 = new FileOutputStream(this.to);
                        try {
                            try {
                                jCurrentTimeMillis3 = ud ? System.currentTimeMillis() : 0L;
                                try {
                                    udVar.ud.store(fileOutputStream3, (String) null);
                                    if (ud) {
                                        Log.d("TTPropHelper", "save: " + udVar.ud);
                                        Log.d("TTPropHelper", "saveToLocal: save to" + this.to.getAbsolutePath() + "success");
                                        str2 = "success";
                                    }
                                    try {
                                        fileOutputStream3.close();
                                        obj = str2;
                                    } catch (Throwable th2) {
                                        str = "TTPropHelper";
                                        message = th2.getMessage();
                                        Log.w(str, message);
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    fileOutputStream = fileOutputStream3;
                                    Log.e("TTPropHelper", "saveToLocal: ", e);
                                    udVar.qdl(false, false);
                                    obj = fileOutputStream;
                                    if (fileOutputStream != null) {
                                        try {
                                            fileOutputStream.close();
                                            obj = fileOutputStream;
                                        } catch (Throwable th3) {
                                            str = "TTPropHelper";
                                            message = th3.getMessage();
                                            Log.w(str, message);
                                        }
                                    }
                                }
                            } catch (Exception e3) {
                                e = e3;
                                fileOutputStream2 = fileOutputStream3;
                                jCurrentTimeMillis3 = 0;
                                fileOutputStream = fileOutputStream2;
                                Log.e("TTPropHelper", "saveToLocal: ", e);
                                udVar.qdl(false, false);
                                obj = fileOutputStream;
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                    obj = fileOutputStream;
                                }
                                if (ud) {
                                    jCurrentTimeMillis4 = System.currentTimeMillis();
                                } else {
                                    jCurrentTimeMillis4 = 0;
                                }
                                this.rq.delete();
                                if (ud) {
                                    jCurrentTimeMillis5 = System.currentTimeMillis();
                                } else {
                                    jCurrentTimeMillis5 = 0;
                                }
                                this.tvp = udVar.qdl;
                                udVar.qdl(true, true);
                                if (ud) {
                                    Log.d("TTPropHelper", "write: " + (jCurrentTimeMillis - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis2 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis3 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis4 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis5 - jCurrentTimeMillis6));
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r11 = fileOutputStream3;
                            if (r11 != 0) {
                                try {
                                    r11.close();
                                    throw th;
                                } catch (Throwable th5) {
                                    Log.w("TTPropHelper", th5.getMessage());
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e4) {
                        e = e4;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    r11 = obj;
                }
            }
            if (ud) {
                jCurrentTimeMillis4 = System.currentTimeMillis();
            } else {
                jCurrentTimeMillis4 = 0;
            }
            this.rq.delete();
            if (ud) {
                jCurrentTimeMillis5 = System.currentTimeMillis();
            } else {
                jCurrentTimeMillis5 = 0;
            }
            this.tvp = udVar.qdl;
            udVar.qdl(true, true);
            if (ud) {
                Log.d("TTPropHelper", "write: " + (jCurrentTimeMillis - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis2 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis3 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis4 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis5 - jCurrentTimeMillis6));
            }
        } catch (Throwable th7) {
            Log.w("TTPropHelper", "writeToFile: Got exception:", th7);
            if (this.to.exists() && !this.to.delete()) {
                Log.e("TTPropHelper", "Couldn't clean up partially-written file " + this.to);
            }
            udVar.qdl(false, false);
        }
    }

    public static qdl qdl(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_prop";
        }
        synchronized (qdl.class) {
            try {
                if (fs == null) {
                    fs = new ArrayMap<>();
                }
                File file = fs.get(str);
                if (file == null) {
                    file = new File(context.getFilesDir(), str);
                    fs.put(str, file);
                }
                if (exu == null) {
                    exu = new ArrayMap<>();
                }
                qdl qdlVar = exu.get(file);
                if (qdlVar != null) {
                    return qdlVar;
                }
                qdl qdlVar2 = new qdl(file);
                exu.put(file, qdlVar2);
                return qdlVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static File qdl(File file) {
        return new File(file.getPath() + ".bak");
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00da A[Catch: all -> 0x00dd, TryCatch #5 {all -> 0x00dd, blocks: (B:50:0x00d4, B:52:0x00da, B:55:0x00df, B:56:0x00e7), top: B:71:0x00d4 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void qdl() {
        FileInputStream fileInputStream;
        Throwable th;
        synchronized (this.lnr) {
            try {
                if (this.mo) {
                    if (ud) {
                        Log.d("TTPropHelper", "reload: already loaded, ignore");
                    }
                    return;
                }
                if (this.rq.exists()) {
                    this.to.delete();
                    this.rq.renameTo(this.to);
                }
                if (ud) {
                    Log.d("TTPropHelper", "reload: " + this.to.getAbsolutePath() + ", exist? " + this.to.exists());
                }
                Properties properties = null;
                if (this.to.exists()) {
                    Properties properties2 = new Properties();
                    try {
                        try {
                            fileInputStream = new FileInputStream(this.to);
                            try {
                                properties2.load(fileInputStream);
                                if (ud) {
                                    Log.d("TTPropHelper", "reload: find " + properties2.size() + " ,items from " + this.to.getAbsolutePath());
                                }
                                fileInputStream.close();
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    Log.e("TTPropHelper", "reload: ", th);
                                    if (fileInputStream != null) {
                                        fileInputStream.close();
                                    }
                                    properties = properties2;
                                    synchronized (this.lnr) {
                                        if (properties != null) {
                                            try {
                                                if (!properties.isEmpty()) {
                                                    this.mzz = properties;
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                        this.mo = true;
                                        this.lnr.notifyAll();
                                    }
                                } catch (Throwable th4) {
                                    if (fileInputStream != null) {
                                        try {
                                            fileInputStream.close();
                                        } catch (Throwable th5) {
                                            Log.w("TTPropHelper", th5.getMessage());
                                        }
                                    }
                                    throw th4;
                                }
                            }
                        } catch (Throwable th6) {
                            fileInputStream = null;
                            th = th6;
                        }
                    } catch (Throwable th7) {
                        Log.w("TTPropHelper", th7.getMessage());
                    }
                    properties = properties2;
                }
                synchronized (this.lnr) {
                    if (properties != null) {
                        if (!properties.isEmpty()) {
                            this.mzz = properties;
                        }
                    }
                    this.mo = true;
                    this.lnr.notifyAll();
                }
            } catch (Throwable th8) {
                throw th8;
            }
        }
    }

    public String qdl(String str, String str2) {
        String property;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        synchronized (this.lnr) {
            mml();
            property = this.mzz.getProperty(str, str2);
        }
        return property;
    }

    public int qdl(String str, int i2) {
        int i3;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.lnr) {
                try {
                    try {
                        mml();
                        i3 = Integer.parseInt(this.mzz.getProperty(str, String.valueOf(i2)));
                    } catch (NumberFormatException e2) {
                        Log.e("TTPropHelper", e2.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i3;
        }
        return i2;
    }

    public long qdl(String str, long j) {
        long j2;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.lnr) {
                try {
                    try {
                        mml();
                        j2 = Long.parseLong(this.mzz.getProperty(str, String.valueOf(j)));
                    } catch (NumberFormatException e2) {
                        Log.e("TTPropHelper", e2.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return j2;
        }
        return j;
    }

    public float qdl(String str, float f) {
        float f2;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.lnr) {
                try {
                    try {
                        mml();
                        f2 = Float.parseFloat(this.mzz.getProperty(str, String.valueOf(f)));
                    } catch (NumberFormatException e2) {
                        Log.e("TTPropHelper", e2.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return f2;
        }
        return f;
    }

    public boolean qdl(String str, boolean z2) {
        boolean z3;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.lnr) {
                try {
                    try {
                        mml();
                        z3 = Boolean.parseBoolean(this.mzz.getProperty(str, String.valueOf(z2)));
                    } catch (NumberFormatException e2) {
                        Log.e("TTPropHelper", e2.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z3;
        }
        return z2;
    }

    public boolean qdl(String str) {
        boolean zContainsKey;
        synchronized (this.lnr) {
            try {
                try {
                    mml();
                    zContainsKey = this.mzz.containsKey(str);
                } catch (NumberFormatException e2) {
                    Log.e("TTPropHelper", e2.getMessage());
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zContainsKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(final ud udVar, final boolean z2) {
        boolean z3;
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.qdl.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (qdl.this.mml) {
                    try {
                        qdl.this.ud(udVar, z2);
                    } catch (OutOfMemoryError unused) {
                    }
                }
                synchronized (qdl.this.lnr) {
                    qdl.tvp(qdl.this);
                }
            }
        };
        if (z2) {
            synchronized (this.lnr) {
                z3 = this.wd == 1;
            }
            if (z3) {
                runnable.run();
                return;
            }
        }
        com.bytedance.sdk.component.ud.qdl(runnable, true ^ z2);
    }
}
