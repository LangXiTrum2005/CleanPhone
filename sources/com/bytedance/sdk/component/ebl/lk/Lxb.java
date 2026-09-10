package com.bytedance.sdk.component.ebl.lk;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Address;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.aH;
import com.bytedance.sdk.component.utils.kqm;
import com.unity3d.services.UnityAdsConstants;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb implements aH.Lxb {
    private static boolean OY;
    private static lk QAg;
    private static ThreadPoolExecutor nBu;
    private int IeN;
    private final boolean LD;
    private com.bytedance.sdk.component.ebl.Lxb STP;
    private final Context sLN;
    private volatile boolean lk = false;
    private boolean ZU = true;
    private boolean JXs = false;
    private long lc = 0;
    private long ebl = 0;
    private AtomicBoolean JVA = new AtomicBoolean(false);
    private volatile boolean NXR = false;
    final aH Lxb = com.bytedance.sdk.component.OY.Lxb.Lxb.Lxb().Lxb(this, "tt-net");

    public Lxb(Context context, int i) {
        this.sLN = context;
        this.LD = kqm.Lxb(context);
        this.IeN = i;
    }

    private boolean OY() {
        String[] strArrLc = lc();
        if (strArrLc != null && strArrLc.length != 0) {
            Lxb(0);
        }
        return false;
    }

    private com.bytedance.sdk.component.ebl.Lxb QAg() {
        if (this.STP == null) {
            com.bytedance.sdk.component.ebl.Lxb.C0062Lxb c0062Lxb = new com.bytedance.sdk.component.ebl.Lxb.C0062Lxb();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.STP = c0062Lxb.Lxb(10L, timeUnit).LD(10L, timeUnit).lk(10L, timeUnit).Lxb();
        }
        return this.STP;
    }

    private void ZU(boolean z) {
        if (this.JXs) {
            return;
        }
        if (this.ZU) {
            this.ZU = false;
            this.lc = 0L;
            this.ebl = 0L;
        }
        long j = z ? 360000L : 43200000L;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.lc > j) {
            if (jCurrentTimeMillis - this.ebl > UnityAdsConstants.Timeout.INIT_TIMEOUT_MS || !this.NXR) {
                lk();
            }
        }
    }

    public static ExecutorService ebl() {
        lk lkVar = QAg;
        ExecutorService threadPool = lkVar != null ? lkVar.getThreadPool() : null;
        if (threadPool != null) {
            return threadPool;
        }
        if (nBu == null) {
            synchronized (Lxb.class) {
                try {
                    if (nBu == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                        nBu = threadPoolExecutor;
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return nBu;
    }

    public void JXs() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        try {
            if (this.LD) {
                ZU();
            } else {
                LD();
            }
        } catch (Throwable unused) {
        }
    }

    public String[] lc() {
        String[] strArrLc = OY.Lxb().Lxb(this.IeN).ZU() != null ? OY.Lxb().Lxb(this.IeN).ZU().lc() : null;
        return (strArrLc == null || strArrLc.length <= 0) ? new String[0] : strArrLc;
    }

    public boolean lk() {
        this.JVA.get();
        ebl().execute(new Runnable() { // from class: com.bytedance.sdk.component.ebl.lk.Lxb.2
            @Override // java.lang.Runnable
            public void run() {
                boolean zLxb = com.bytedance.sdk.component.ebl.ZU.JXs.Lxb(Lxb.this.sLN);
                if (zLxb) {
                    Lxb.this.ebl = System.currentTimeMillis();
                    if (Lxb.this.JVA.compareAndSet(false, true)) {
                        Lxb.this.lk(zLxb);
                    }
                }
            }
        });
        return true;
    }

    public static void LD(boolean z) {
        OY = z;
    }

    public void lk(boolean z) {
        ZU();
        this.JXs = true;
        if (!z) {
            this.Lxb.sendEmptyMessage(102);
            return;
        }
        try {
            OY();
        } catch (Exception unused) {
            this.JVA.set(false);
        }
    }

    public synchronized void LD() {
        if (System.currentTimeMillis() - this.lc > 3600000) {
            this.lc = System.currentTimeMillis();
            try {
                if (OY.Lxb().Lxb(this.IeN).OY() != null) {
                    OY.Lxb().Lxb(this.IeN).OY().LD();
                }
            } catch (Exception unused) {
            }
        }
    }

    public void Lxb() {
        Lxb(false);
    }

    public synchronized void Lxb(boolean z) {
        if (this.LD) {
            ZU(z);
            return;
        }
        if (this.lc <= 0) {
            try {
                ebl().execute(new Runnable() { // from class: com.bytedance.sdk.component.ebl.lk.Lxb.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Lxb.this.LD();
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    public synchronized void ZU() {
        if (this.NXR) {
            return;
        }
        this.NXR = true;
        long j = this.sLN.getSharedPreferences("ss_app_config", 0).getLong("last_refresh_time", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j > jCurrentTimeMillis) {
            j = jCurrentTimeMillis;
        }
        this.lc = j;
        try {
            if (OY.Lxb().Lxb(this.IeN).OY() != null) {
                OY.Lxb().Lxb(this.IeN).OY().Lxb();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD(int i) {
        aH aHVar = this.Lxb;
        if (aHVar != null) {
            aHVar.sendEmptyMessage(i);
        }
    }

    @Override // com.bytedance.sdk.component.utils.aH.Lxb
    public void Lxb(Message message) {
        int i = message.what;
        if (i == 101) {
            this.JXs = false;
            this.lc = System.currentTimeMillis();
            if (this.ZU) {
                Lxb();
            }
            this.JVA.set(false);
            return;
        }
        if (i != 102) {
            return;
        }
        this.JXs = false;
        if (this.ZU) {
            Lxb();
        }
        this.JVA.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Lxb(Object obj) throws Exception {
        JSONObject jSONObject;
        if (obj instanceof String) {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            jSONObject = new JSONObject(str);
            if (!"success".equals(jSONObject.getString(PglCryptUtils.KEY_MESSAGE))) {
                return false;
            }
        } else {
            jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
        }
        if (jSONObject == null) {
            return false;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        synchronized (this) {
            SharedPreferences.Editor editorEdit = this.sLN.getSharedPreferences("ss_app_config", 0).edit();
            editorEdit.putLong("last_refresh_time", System.currentTimeMillis());
            editorEdit.apply();
        }
        if (OY.Lxb().Lxb(this.IeN).OY() == null) {
            return true;
        }
        OY.Lxb().Lxb(this.IeN).OY().Lxb(jSONObject2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(final int i) {
        String[] strArrLc = lc();
        if (strArrLc != null && strArrLc.length > i) {
            String str = strArrLc[i];
            if (TextUtils.isEmpty(str)) {
                LD(102);
                return;
            }
            try {
                String strLxb = Lxb(str);
                if (TextUtils.isEmpty(strLxb)) {
                    LD(102);
                    return;
                }
                com.bytedance.sdk.component.ebl.LD.LD ldLk = QAg().lk();
                ldLk.LD(strLxb);
                Lxb(ldLk);
                ldLk.Lxb(new com.bytedance.sdk.component.ebl.Lxb.Lxb() { // from class: com.bytedance.sdk.component.ebl.lk.Lxb.3
                    @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
                    public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, com.bytedance.sdk.component.ebl.LD ld) {
                        JSONObject jSONObject;
                        if (ld == null || !ld.lc()) {
                            Lxb.this.Lxb(i + 1);
                            return;
                        }
                        String string = null;
                        try {
                            jSONObject = new JSONObject(ld.ZU());
                        } catch (Exception unused) {
                            jSONObject = null;
                        }
                        if (jSONObject == null) {
                            Lxb.this.Lxb(i + 1);
                            return;
                        }
                        try {
                            string = jSONObject.getString(PglCryptUtils.KEY_MESSAGE);
                        } catch (Exception unused2) {
                        }
                        if (!"success".equals(string)) {
                            Lxb.this.Lxb(i + 1);
                            return;
                        }
                        try {
                            if (Lxb.this.Lxb(jSONObject)) {
                                Lxb.this.LD(101);
                            } else {
                                Lxb.this.Lxb(i + 1);
                            }
                        } catch (Exception unused3) {
                        }
                    }

                    @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
                    public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, IOException iOException) {
                        Lxb.this.Lxb(i + 1);
                    }
                });
                return;
            } catch (Throwable th) {
                th.toString();
                return;
            }
        }
        LD(102);
    }

    private String Lxb(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return DM.B("https://", str, "/get_domains/v4/");
    }

    private void Lxb(com.bytedance.sdk.component.ebl.LD.LD ld) {
        if (ld == null) {
            return;
        }
        Address addressLxb = OY.Lxb().Lxb(this.IeN).ZU() != null ? OY.Lxb().Lxb(this.IeN).ZU().Lxb(this.sLN) : null;
        if (addressLxb != null && addressLxb.hasLatitude() && addressLxb.hasLongitude()) {
            StringBuilder sb = new StringBuilder();
            sb.append(addressLxb.getLatitude());
            ld.Lxb("latitude", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(addressLxb.getLongitude());
            ld.Lxb("longitude", sb2.toString());
            String locality = addressLxb.getLocality();
            if (!TextUtils.isEmpty(locality)) {
                ld.Lxb("city", Uri.encode(locality));
            }
        }
        if (this.lk) {
            ld.Lxb("force", "1");
        }
        try {
            ld.Lxb("abi", Build.SUPPORTED_ABIS[0]);
        } catch (Throwable unused) {
        }
        if (OY.Lxb().Lxb(this.IeN).ZU() != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(OY.Lxb().Lxb(this.IeN).ZU().Lxb());
            ld.Lxb("aid", sb3.toString());
            ld.Lxb("device_platform", OY.Lxb().Lxb(this.IeN).ZU().lk());
            ld.Lxb("channel", OY.Lxb().Lxb(this.IeN).ZU().LD());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(OY.Lxb().Lxb(this.IeN).ZU().ZU());
            ld.Lxb("version_code", sb4.toString());
            ld.Lxb("custom_info_1", OY.Lxb().Lxb(this.IeN).ZU().JXs());
        }
    }

    public static void Lxb(lk lkVar) {
        QAg = lkVar;
    }
}
