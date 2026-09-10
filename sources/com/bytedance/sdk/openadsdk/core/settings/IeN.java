package com.bytedance.sdk.openadsdk.core.settings;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.utils.hg;
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
public abstract class IeN implements JXs {
    private final String ebl;
    private Lxb nBu;
    private final ConcurrentHashMap<String, Object> lk = new ConcurrentHashMap<>();
    private final Object ZU = new Object();
    private final Object JXs = new Object();
    private final CountDownLatch lc = new CountDownLatch(1);
    private Properties OY = new Properties();
    private volatile boolean QAg = false;

    public interface Lxb {
        void LD();

        void Lxb();
    }

    public IeN(String str, Lxb lxb) {
        this.ebl = str;
        this.nBu = lxb;
        hg.Lxb(new com.bytedance.sdk.component.OY.OY("SetL_".concat(String.valueOf(str))) { // from class: com.bytedance.sdk.openadsdk.core.settings.IeN.1
            @Override // java.lang.Runnable
            public void run() {
                IeN.this.Lxb(false);
            }
        });
    }

    private void JXs() {
        if (this.QAg) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            this.lc.await(hg.JXs() ? 4 : 8, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("SdkSettings.Prop", "awaitLoadedLocked: ", e);
        }
    }

    private File lc() {
        return new File(kqm.Lxb().getFilesDir(), this.ebl);
    }

    public void ZU() {
        Lxb lxb = this.nBu;
        if (lxb != null) {
            lxb.LD();
        }
    }

    public void lk() {
        File fileLc = lc();
        if (fileLc.exists()) {
            fileLc.delete();
        }
    }

    public boolean LD() {
        return this.QAg;
    }

    public String Lxb(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return str2;
        }
        JXs();
        return this.OY.getProperty(str, str2);
    }

    public int Lxb(String str, int i) {
        if (str != null && !str.isEmpty()) {
            JXs();
            try {
                return Integer.parseInt(this.OY.getProperty(str, String.valueOf(i)));
            } catch (NumberFormatException e) {
                com.bytedance.sdk.component.utils.sLN.Lxb("SdkSettings.Prop", "", e);
            }
        }
        return i;
    }

    public long Lxb(String str, long j) {
        if (str != null && !str.isEmpty()) {
            JXs();
            try {
                return Long.parseLong(this.OY.getProperty(str, String.valueOf(j)));
            } catch (NumberFormatException e) {
                com.bytedance.sdk.component.utils.sLN.Lxb("SdkSettings.Prop", "", e);
            }
        }
        return j;
    }

    public float Lxb(String str, float f) {
        if (str != null && !str.isEmpty()) {
            JXs();
            try {
                return Float.parseFloat(this.OY.getProperty(str, String.valueOf(f)));
            } catch (NumberFormatException e) {
                com.bytedance.sdk.component.utils.sLN.Lxb("SdkSettings.Prop", "", e);
            }
        }
        return f;
    }

    public class LD implements JXs.Lxb {
        private final Map<String, Object> LD = new HashMap();
        private final Object lk = new Object();

        public LD() {
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.JXs.Lxb
        public void Lxb() {
            Object obj;
            Properties properties = new Properties();
            synchronized (this.lk) {
                try {
                    properties.putAll(IeN.this.OY);
                    boolean z = false;
                    for (Map.Entry<String, Object> entry : this.LD.entrySet()) {
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
                    this.LD.clear();
                    if (z) {
                        IeN.this.Lxb(properties);
                        IeN.this.OY = properties;
                        IeN.this.lk.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.JXs.Lxb
        public JXs.Lxb Lxb(String str, String str2) {
            synchronized (this.lk) {
                this.LD.put(str, str2);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.JXs.Lxb
        public JXs.Lxb Lxb(String str, int i) {
            synchronized (this.lk) {
                this.LD.put(str, Integer.valueOf(i));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.JXs.Lxb
        public JXs.Lxb Lxb(String str, long j) {
            synchronized (this.lk) {
                this.LD.put(str, Long.valueOf(j));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.JXs.Lxb
        public JXs.Lxb Lxb(String str) {
            synchronized (this.lk) {
                this.LD.put(str, this);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.JXs.Lxb
        public JXs.Lxb Lxb(String str, float f) {
            synchronized (this.lk) {
                this.LD.put(str, Float.valueOf(f));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.JXs.Lxb
        public JXs.Lxb Lxb(String str, boolean z) {
            synchronized (this.lk) {
                this.LD.put(str, Boolean.valueOf(z));
            }
            return this;
        }
    }

    public boolean Lxb(String str, boolean z) {
        if (str != null && !str.isEmpty()) {
            JXs();
            try {
                return Boolean.parseBoolean(this.OY.getProperty(str, String.valueOf(z)));
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.sLN.Lxb("SdkSettings.Prop", "", e);
            }
        }
        return z;
    }

    public void Lxb(boolean z) {
        Lxb lxb;
        Object obj;
        synchronized (this.ZU) {
            try {
                if (!this.QAg || z) {
                    File fileLc = lc();
                    if (fileLc.exists()) {
                        Properties properties = new Properties();
                        FileInputStream fileInputStream = null;
                        try {
                            try {
                                FileInputStream fileInputStream2 = new FileInputStream(fileLc);
                                try {
                                    properties.load(fileInputStream2);
                                    properties.size();
                                    new StringBuilder("items from ").append(fileLc.getAbsolutePath());
                                    if (!properties.isEmpty()) {
                                        this.OY = properties;
                                        this.lk.clear();
                                    }
                                    com.bytedance.sdk.openadsdk.utils.JVA.Lxb(fileInputStream2);
                                    obj = this.ZU;
                                } catch (OutOfMemoryError unused) {
                                    fileInputStream = fileInputStream2;
                                    try {
                                        com.bytedance.sdk.component.utils.lc.lk(fileLc);
                                    } catch (Throwable th) {
                                        com.bytedance.sdk.component.utils.sLN.Lxb("SdkSettings.Prop", "delete: ", th);
                                    }
                                    if (fileInputStream != null) {
                                        com.bytedance.sdk.openadsdk.utils.JVA.Lxb(fileInputStream);
                                    }
                                    obj = this.ZU;
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileInputStream = fileInputStream2;
                                    com.bytedance.sdk.component.utils.sLN.Lxb("SdkSettings.Prop", "reload: ", th);
                                    if (fileInputStream != null) {
                                        com.bytedance.sdk.openadsdk.utils.JVA.Lxb(fileInputStream);
                                    }
                                    obj = this.ZU;
                                }
                            } catch (OutOfMemoryError unused2) {
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            obj.notifyAll();
                        } catch (Throwable th4) {
                            if (fileInputStream != null) {
                                com.bytedance.sdk.openadsdk.utils.JVA.Lxb(fileInputStream);
                            }
                            this.ZU.notifyAll();
                            throw th4;
                        }
                    } else if (com.bytedance.sdk.component.utils.kqm.Lxb(kqm.Lxb()) && "tt_sdk_settings.prop".equals(this.ebl)) {
                        try {
                            boolean z2 = false;
                            SharedPreferences sharedPreferences = kqm.Lxb().getSharedPreferences("tt_sdk_settings", 0);
                            if (!sharedPreferences.getAll().isEmpty()) {
                                JXs.Lxb Lxb2 = Lxb();
                                for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                                    String key = entry.getKey();
                                    Object value = entry.getValue();
                                    if (key != null && !key.isEmpty() && value != null) {
                                        Lxb2.Lxb(key, value.toString());
                                        z2 = true;
                                    }
                                }
                                if (z2) {
                                    Lxb2.Lxb();
                                }
                                sharedPreferences.edit().clear().commit();
                            }
                        } catch (Exception unused3) {
                        }
                    }
                    if (!this.QAg && (lxb = this.nBu) != null) {
                        lxb.Lxb();
                    }
                    this.QAg = true;
                    this.lc.countDown();
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    public JXs.Lxb Lxb() {
        return new LD();
    }

    public <T> T Lxb(String str, T t, JXs.LD<T> ld) {
        T tLD;
        if (str != null && !str.isEmpty()) {
            if (this.lk.containsKey(str)) {
                try {
                    return (T) this.lk.get(str);
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.sLN.Lxb("SdkSettings.Prop", "", e);
                    return t;
                }
            }
            JXs();
            String property = this.OY.getProperty(str, null);
            if (property != null && ld != null && (tLD = ld.LD(property)) != null) {
                this.lk.put(str, tLD);
                return tLD;
            }
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(Properties properties) {
        synchronized (this.JXs) {
            File fileLc = lc();
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(fileLc);
                    try {
                        properties.store(fileOutputStream2, (String) null);
                        fileLc.getAbsolutePath();
                        com.bytedance.sdk.openadsdk.utils.JVA.Lxb(fileOutputStream2);
                    } catch (Exception e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        com.bytedance.sdk.component.utils.sLN.Lxb("SdkSettings.Prop", "saveToLocal: ", e);
                        if (fileOutputStream != null) {
                            com.bytedance.sdk.openadsdk.utils.JVA.Lxb(fileOutputStream);
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            com.bytedance.sdk.openadsdk.utils.JVA.Lxb(fileOutputStream);
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
        VVE.owi();
    }
}
