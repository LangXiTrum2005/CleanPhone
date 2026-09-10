package com.bytedance.sdk.component;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.ArrayMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    private static ArrayMap<File, lr> aw = null;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private static ArrayMap<String, File> f18057co = null;
    private static boolean lr = false;
    protected static ri ri;
    private volatile boolean di;
    private Properties fi;
    private final Object ik;
    private long jbs;
    private final Object ka;
    private long mj;
    private final File qt;
    private final File sf;
    private int xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.lr$lr, reason: collision with other inner class name */
    public static class C0212lr {
        boolean fi;
        final CountDownLatch ik;
        volatile boolean ka;
        final Properties lr;
        final long ri;

        public void ri(boolean z, boolean z2) {
            this.fi = z;
            this.ka = z2;
            this.ik.countDown();
        }

        private C0212lr(long j, Properties properties) {
            this.ik = new CountDownLatch(1);
            this.ka = false;
            this.fi = false;
            this.ri = j;
            this.lr = properties;
        }
    }

    public interface ri {
        HandlerThread ri(String str, int i);

        ExecutorService ri();
    }

    private lr(File file) {
        Object obj = new Object();
        this.ik = obj;
        this.ka = new Object();
        this.fi = new Properties();
        this.di = false;
        this.xha = 0;
        this.qt = file;
        this.sf = ri(file);
        synchronized (obj) {
            this.di = false;
        }
        ri riVar = ri;
        if (riVar == null || riVar.ri() == null) {
            new Thread("TTPropHelper") { // from class: com.bytedance.sdk.component.lr.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    lr.this.ri();
                }
            }.start();
        } else {
            ri.ri().execute(new Runnable() { // from class: com.bytedance.sdk.component.lr.2
                @Override // java.lang.Runnable
                public void run() {
                    lr.this.ri();
                }
            });
        }
    }

    public static /* synthetic */ long di(lr lrVar) {
        long j = lrVar.mj;
        lrVar.mj = 1 + j;
        return j;
    }

    public static /* synthetic */ int fi(lr lrVar) {
        int i = lrVar.xha;
        lrVar.xha = i + 1;
        return i;
    }

    public static /* synthetic */ int jbs(lr lrVar) {
        int i = lrVar.xha;
        lrVar.xha = i - 1;
        return i;
    }

    private void ka() {
        while (!this.di) {
            try {
                this.ik.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public ik lr() {
        return new ik();
    }

    public class ik implements SharedPreferences.Editor {
        private final Object lr = new Object();
        private final Map<String, Object> ik = new HashMap();
        private boolean ka = false;

        public ik() {
        }

        private C0212lr lr() {
            Properties properties;
            long j;
            Object obj;
            boolean z;
            synchronized (lr.this.ik) {
                try {
                    if (lr.this.xha > 0) {
                        Properties properties2 = new Properties();
                        properties2.putAll(lr.this.fi);
                        lr.this.fi = properties2;
                    }
                    properties = lr.this.fi;
                    lr.fi(lr.this);
                    synchronized (this.lr) {
                        try {
                            boolean z2 = false;
                            if (this.ka) {
                                if (properties.isEmpty()) {
                                    z = false;
                                } else {
                                    properties.clear();
                                    z = true;
                                }
                                this.ka = false;
                                z2 = z;
                            }
                            for (Map.Entry<String, Object> entry : this.ik.entrySet()) {
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
                            this.ik.clear();
                            if (z2) {
                                lr.di(lr.this);
                            }
                            j = lr.this.mj;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return new C0212lr(j, properties);
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            lr.this.ri(lr(), false);
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            if (lr.lr) {
                System.currentTimeMillis();
            }
            C0212lr c0212lrLr = lr();
            lr.this.ri(c0212lrLr, true);
            try {
                c0212lrLr.ik.await();
                if (lr.lr) {
                    lr.this.qt.getName();
                    System.currentTimeMillis();
                }
                return c0212lrLr.ka;
            } catch (InterruptedException unused) {
                if (!lr.lr) {
                    return false;
                }
                lr.this.qt.getName();
                long j = c0212lrLr.ri;
                System.currentTimeMillis();
                return false;
            } catch (Throwable th) {
                if (lr.lr) {
                    lr.this.qt.getName();
                    long j2 = c0212lrLr.ri;
                    System.currentTimeMillis();
                }
                throw th;
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
            return ri(str, (Set<String>) set);
        }

        public ik ri(String str, Set<String> set) {
            synchronized (this.lr) {
                this.ik.put(str, set == null ? null : new HashSet(set));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public ik putInt(String str, int i) {
            synchronized (this.lr) {
                this.ik.put(str, Integer.valueOf(i));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public ik putLong(String str, long j) {
            synchronized (this.lr) {
                this.ik.put(str, Long.valueOf(j));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public ik putFloat(String str, float f) {
            synchronized (this.lr) {
                this.ik.put(str, Float.valueOf(f));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public ik putString(String str, String str2) {
            synchronized (this.lr) {
                this.ik.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public ik putBoolean(String str, boolean z) {
            synchronized (this.lr) {
                this.ik.put(str, Boolean.valueOf(z));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public ik remove(String str) {
            synchronized (this.lr) {
                this.ik.put(str, this);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public ik clear() {
            synchronized (this.lr) {
                this.ka = true;
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:66:0x00b0 A[Catch: all -> 0x00d4, TryCatch #1 {all -> 0x00d4, blocks: (B:38:0x006a, B:39:0x006c, B:64:0x00ac, B:66:0x00b0, B:67:0x00b3, B:69:0x00bc, B:70:0x00bf, B:78:0x00d2, B:79:0x00d3, B:51:0x0094, B:62:0x00a8, B:63:0x00ab, B:54:0x0099, B:77:0x00d1, B:76:0x00ce), top: B:88:0x006a, inners: #3, #5 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc A[Catch: all -> 0x00d4, TryCatch #1 {all -> 0x00d4, blocks: (B:38:0x006a, B:39:0x006c, B:64:0x00ac, B:66:0x00b0, B:67:0x00b3, B:69:0x00bc, B:70:0x00bf, B:78:0x00d2, B:79:0x00d3, B:51:0x0094, B:62:0x00a8, B:63:0x00ab, B:54:0x0099, B:77:0x00d1, B:76:0x00ce), top: B:88:0x006a, inners: #3, #5 }] */
    public void lr(C0212lr c0212lr, boolean z) {
        FileOutputStream fileOutputStream;
        Throwable th;
        boolean z2;
        if (lr) {
            System.currentTimeMillis();
        }
        boolean zExists = this.qt.exists();
        if (lr) {
            System.currentTimeMillis();
        }
        if (zExists) {
            if (this.jbs >= c0212lr.ri) {
                z2 = false;
            } else if (z) {
                z2 = true;
            } else {
                synchronized (this.ik) {
                    z2 = this.mj == c0212lr.ri;
                }
            }
            if (!z2) {
                c0212lr.ri(false, true);
                return;
            }
            boolean zExists2 = this.sf.exists();
            if (lr) {
                System.currentTimeMillis();
            }
            if (!zExists2) {
                if (!this.qt.renameTo(this.sf)) {
                    Objects.toString(this.qt);
                    Objects.toString(this.sf);
                    c0212lr.ri(false, false);
                    return;
                }
            } else {
                this.qt.delete();
            }
        }
        try {
            synchronized (this.ka) {
                FileOutputStream fileOutputStream2 = null;
                try {
                    try {
                        try {
                            fileOutputStream = new FileOutputStream(this.qt);
                            try {
                                if (lr) {
                                    System.currentTimeMillis();
                                }
                                c0212lr.lr.store(fileOutputStream, (String) null);
                                if (lr) {
                                    Objects.toString(c0212lr.lr);
                                    this.qt.getAbsolutePath();
                                }
                                fileOutputStream.close();
                            } catch (Exception unused) {
                                fileOutputStream2 = fileOutputStream;
                                c0212lr.ri(false, false);
                                if (fileOutputStream2 != null) {
                                    fileOutputStream2.close();
                                }
                                if (lr) {
                                    System.currentTimeMillis();
                                }
                                this.sf.delete();
                                if (lr) {
                                    System.currentTimeMillis();
                                }
                                this.jbs = c0212lr.ri;
                                c0212lr.ri(true, true);
                            } catch (Throwable th2) {
                                th = th2;
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Throwable th3) {
                                        th3.getMessage();
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            fileOutputStream = fileOutputStream2;
                            th = th4;
                        }
                    } catch (Exception unused2) {
                    }
                } catch (Throwable th5) {
                    th5.getMessage();
                }
            }
            if (lr) {
                System.currentTimeMillis();
            }
            this.sf.delete();
            if (lr) {
                System.currentTimeMillis();
            }
            this.jbs = c0212lr.ri;
            c0212lr.ri(true, true);
        } catch (Throwable unused3) {
            if (this.qt.exists() && !this.qt.delete()) {
                Objects.toString(this.qt);
            }
            c0212lr.ri(false, false);
        }
    }

    public static void ri(ri riVar) {
        ri = riVar;
    }

    public static lr ri(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_prop";
        }
        synchronized (lr.class) {
            try {
                if (f18057co == null) {
                    f18057co = new ArrayMap<>();
                }
                File file = f18057co.get(str);
                if (file == null) {
                    file = new File(context.getFilesDir(), str);
                    f18057co.put(str, file);
                }
                if (aw == null) {
                    aw = new ArrayMap<>();
                }
                lr lrVar = aw.get(file);
                if (lrVar != null) {
                    return lrVar;
                }
                lr lrVar2 = new lr(file);
                aw.put(file, lrVar2);
                return lrVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static File ri(File file) {
        return new File(file.getPath() + ".bak");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0070 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:36:0x006a, B:38:0x0070, B:41:0x0075, B:42:0x007d), top: B:49:0x006a }] */
    /* JADX WARN: Code duplicated, block: B:49:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void ri() {
        synchronized (this.ik) {
            try {
                if (this.di) {
                    return;
                }
                if (this.sf.exists()) {
                    this.qt.delete();
                    this.sf.renameTo(this.qt);
                }
                if (lr) {
                    this.qt.getAbsolutePath();
                    this.qt.exists();
                }
                Properties properties = null;
                FileInputStream fileInputStream = null;
                if (this.qt.exists()) {
                    Properties properties2 = new Properties();
                    try {
                        try {
                            FileInputStream fileInputStream2 = new FileInputStream(this.qt);
                            try {
                                properties2.load(fileInputStream2);
                                if (lr) {
                                    properties2.size();
                                    this.qt.getAbsolutePath();
                                }
                                fileInputStream2.close();
                            } catch (Throwable unused) {
                                fileInputStream = fileInputStream2;
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                properties = properties2;
                                synchronized (this.ik) {
                                    if (properties != null) {
                                        try {
                                            if (!properties.isEmpty()) {
                                                this.fi = properties;
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    this.di = true;
                                    this.ik.notifyAll();
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                    properties = properties2;
                }
                synchronized (this.ik) {
                    if (properties != null) {
                        if (!properties.isEmpty()) {
                            this.fi = properties;
                        }
                    }
                    this.di = true;
                    this.ik.notifyAll();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public String ri(String str, String str2) {
        String property;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        synchronized (this.ik) {
            ka();
            property = this.fi.getProperty(str, str2);
        }
        return property;
    }

    public int ri(String str, int i) {
        int i2;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.ik) {
                try {
                    try {
                        ka();
                        i2 = Integer.parseInt(this.fi.getProperty(str, String.valueOf(i)));
                    } catch (NumberFormatException e) {
                        e.getMessage();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i2;
        }
        return i;
    }

    public long ri(String str, long j) {
        long j2;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.ik) {
                try {
                    try {
                        ka();
                        j2 = Long.parseLong(this.fi.getProperty(str, String.valueOf(j)));
                    } catch (NumberFormatException e) {
                        e.getMessage();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return j2;
        }
        return j;
    }

    public boolean ri(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.ik) {
                try {
                    try {
                        ka();
                        z2 = Boolean.parseBoolean(this.fi.getProperty(str, String.valueOf(z)));
                    } catch (NumberFormatException e) {
                        e.getMessage();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z2;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(final C0212lr c0212lr, final boolean z) {
        boolean z2;
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.lr.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (lr.this.ka) {
                    try {
                        lr.this.lr(c0212lr, z);
                    } catch (OutOfMemoryError unused) {
                    }
                }
                synchronized (lr.this.ik) {
                    lr.jbs(lr.this);
                }
            }
        };
        if (z) {
            synchronized (this.ik) {
                z2 = this.xha == 1;
            }
            if (z2) {
                runnable.run();
                return;
            }
        }
        com.bytedance.sdk.component.ik.ri(runnable, true ^ z);
    }
}
