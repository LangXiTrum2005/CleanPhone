package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.utils.aw;
import com.bytedance.sdk.openadsdk.utils.dzy;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qt implements fi {
    private final ri qt;
    private boolean sf;
    private final String xha;
    private final ConcurrentHashMap<String, Object> ik = new ConcurrentHashMap<>();
    private final Object ka = new Object();
    private final Object fi = new Object();
    private final CountDownLatch di = new CountDownLatch(1);
    private Properties mj = new Properties();
    private volatile boolean jbs = false;

    public interface ri {
        void lr();

        void ri();
    }

    public qt(ri riVar) {
        String strRi = ri();
        this.xha = strRi;
        this.qt = riVar;
        dzy.ri(new com.bytedance.sdk.component.mj.lr.ik("SetL_" + strRi) { // from class: com.bytedance.sdk.openadsdk.core.settings.qt.1
            @Override // java.lang.Runnable
            public void run() {
                qt.this.ri(false);
            }
        });
    }

    private void di() {
        if (this.sf && nr.ri() != null) {
            ri(true);
        }
        if (this.jbs) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            this.di.await(dzy.di() ? 4 : 8, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            ac.ri("SdkSettings.Prop", "awaitLoadedLocked: ", e);
        }
    }

    private File xha() {
        Context contextRi = nr.ri();
        if (contextRi != null) {
            return new File(contextRi.getFilesDir(), this.xha);
        }
        return null;
    }

    public void fi() {
        ri riVar = this.qt;
        if (riVar != null) {
            riVar.lr();
        }
    }

    public boolean ik() {
        return this.jbs;
    }

    public void ka() {
        File fileXha = xha();
        if (fileXha == null || !fileXha.exists()) {
            return;
        }
        fileXha.delete();
    }

    public abstract String ri();

    public fi.ri lr() {
        return new lr();
    }

    public String ri(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return str2;
        }
        di();
        return this.mj.getProperty(str, str2);
    }

    public int ri(String str, int i) {
        if (str != null && !str.isEmpty()) {
            di();
            try {
                return Integer.parseInt(this.mj.getProperty(str, String.valueOf(i)));
            } catch (NumberFormatException e) {
                ac.ri("SdkSettings.Prop", "", e);
            }
        }
        return i;
    }

    public long ri(String str, long j) {
        if (str != null && !str.isEmpty()) {
            di();
            try {
                return Long.parseLong(this.mj.getProperty(str, String.valueOf(j)));
            } catch (NumberFormatException e) {
                ac.ri("SdkSettings.Prop", "", e);
            }
        }
        return j;
    }

    public float ri(String str, float f) {
        if (str != null && !str.isEmpty()) {
            di();
            try {
                return Float.parseFloat(this.mj.getProperty(str, String.valueOf(f)));
            } catch (NumberFormatException e) {
                ac.ri("SdkSettings.Prop", "", e);
            }
        }
        return f;
    }

    public class lr implements fi.ri {
        private final Map<String, Object> lr = new HashMap();
        private final Object ik = new Object();

        public lr() {
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.fi.ri
        public void ri() {
            Object obj;
            Properties properties = new Properties();
            synchronized (this.ik) {
                try {
                    properties.putAll(qt.this.mj);
                    boolean z = false;
                    for (Map.Entry<String, Object> entry : this.lr.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value == this || value == null) {
                            if (properties.containsKey(key)) {
                                properties.remove(key);
                                z = true;
                            }
                        } else if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(value)) {
                            properties.put(key, String.valueOf(value));
                            z = true;
                        }
                    }
                    this.lr.clear();
                    if (z) {
                        qt.this.ri(properties);
                        qt.this.mj = properties;
                        qt.this.ik.clear();
                        qt.this.sf = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.fi.ri
        public fi.ri ri(String str, String str2) {
            synchronized (this.ik) {
                this.lr.put(str, str2);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.fi.ri
        public fi.ri ri(String str, int i) {
            synchronized (this.ik) {
                this.lr.put(str, Integer.valueOf(i));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.fi.ri
        public fi.ri ri(String str, long j) {
            synchronized (this.ik) {
                this.lr.put(str, Long.valueOf(j));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.fi.ri
        public fi.ri ri(String str) {
            synchronized (this.ik) {
                this.lr.put(str, this);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.fi.ri
        public fi.ri ri(String str, float f) {
            synchronized (this.ik) {
                this.lr.put(str, Float.valueOf(f));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.fi.ri
        public fi.ri ri(String str, boolean z) {
            synchronized (this.ik) {
                this.lr.put(str, Boolean.valueOf(z));
            }
            return this;
        }
    }

    public boolean ri(String str, boolean z) {
        if (str != null && !str.isEmpty()) {
            di();
            try {
                return Boolean.parseBoolean(this.mj.getProperty(str, String.valueOf(z)));
            } catch (Exception e) {
                ac.ri("SdkSettings.Prop", "", e);
            }
        }
        return z;
    }

    public void ri(boolean z) {
        ri riVar;
        synchronized (this.ka) {
            try {
                if (!this.jbs || z) {
                    if (nr.ri() != null) {
                        this.sf = false;
                        File fileXha = xha();
                        if (fileXha != null && fileXha.exists()) {
                            Properties properties = new Properties();
                            FileInputStream fileInputStream = null;
                            try {
                                try {
                                    FileInputStream fileInputStream2 = new FileInputStream(fileXha);
                                    try {
                                        properties.load(fileInputStream2);
                                        properties.size();
                                        new StringBuilder("items from ").append(fileXha.getAbsolutePath());
                                        if (!properties.isEmpty()) {
                                            this.mj = properties;
                                            this.ik.clear();
                                        }
                                        aw.ri(fileInputStream2);
                                    } catch (OutOfMemoryError unused) {
                                        fileInputStream = fileInputStream2;
                                        try {
                                            com.bytedance.sdk.component.utils.xha.ik(fileXha);
                                        } catch (Throwable th) {
                                            ac.ri("SdkSettings.Prop", "delete: ", th);
                                        }
                                        if (fileInputStream != null) {
                                            aw.ri(fileInputStream);
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fileInputStream = fileInputStream2;
                                        ac.ri("SdkSettings.Prop", "reload: ", th);
                                        if (fileInputStream != null) {
                                            aw.ri(fileInputStream);
                                        }
                                    }
                                } catch (OutOfMemoryError unused2) {
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                this.ka.notifyAll();
                            } catch (Throwable th4) {
                                if (fileInputStream != null) {
                                    aw.ri(fileInputStream);
                                }
                                this.ka.notifyAll();
                                throw th4;
                            }
                        }
                    } else {
                        this.sf = true;
                    }
                    boolean z2 = this.jbs;
                    this.di.countDown();
                    this.jbs = true;
                    if (!z2 && (riVar = this.qt) != null) {
                        riVar.ri();
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    public <T> T ri(String str, T t, fi.lr<T> lrVar) {
        T tLr;
        if (str != null && !str.isEmpty()) {
            T t2 = (T) this.ik.get(str);
            if (t2 != null) {
                return t2;
            }
            di();
            String property = this.mj.getProperty(str, null);
            if (property != null && lrVar != null && (tLr = lrVar.lr(property)) != null) {
                this.ik.put(str, tLr);
                return tLr;
            }
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(Properties properties) {
        synchronized (this.fi) {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(xha());
                    try {
                        properties.store(fileOutputStream2, (String) null);
                        aw.ri(fileOutputStream2);
                    } catch (Exception e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        ac.ri("SdkSettings.Prop", "saveToLocal: ", e);
                        if (fileOutputStream != null) {
                            aw.ri(fileOutputStream);
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            aw.ri(fileOutputStream);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
    }
}
