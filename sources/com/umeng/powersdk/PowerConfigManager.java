package com.umeng.powersdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.samplingwhitelist.SamplingWhiteListUtil;
import com.efs.sdk.pa.config.ConfigManager;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public class PowerConfigManager {
    private Context b;
    private EfsReporter c;
    private int d;
    private int f;
    private boolean g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2742a = "PageConfigManager";
    private final int e = 0;

    public PowerConfigManager(Context context, EfsReporter efsReporter) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorEdit2;
        SharedPreferences.Editor editorEdit3;
        SharedPreferences.Editor editorEdit4;
        SharedPreferences.Editor editorEdit5;
        this.d = 100;
        this.g = false;
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = efsReporter;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("efs_power", 0);
        if (sharedPreferences != null) {
            this.f = sharedPreferences.getInt("apm_powerperf_sampling_rate_last", 0);
        }
        SharedPreferences sharedPreferences2 = this.b.getSharedPreferences("efs_power", 0);
        int i = sharedPreferences2 != null ? sharedPreferences2.getInt("apm_powerperf_sampling_rate", -1) : -1;
        this.c.getAllSdkConfig(new String[]{"apm_powerperf_sampling_rate", "apm_powerperf_collect_interval", "apm_powerperf_collect_max_period_sec"}, new IConfigCallback() { // from class: com.umeng.powersdk.PowerConfigManager.1
            @Override // com.efs.sdk.base.observer.IConfigCallback
            public final void onChange(Map<String, Object> map) {
                SharedPreferences.Editor editorEdit6;
                try {
                    SharedPreferences sharedPreferences3 = PowerConfigManager.this.b.getSharedPreferences("efs_power", 0);
                    if (sharedPreferences3 == null || (editorEdit6 = sharedPreferences3.edit()) == null || map == null) {
                        return;
                    }
                    Object obj = map.get("apm_powerperf_sampling_rate");
                    if (obj != null) {
                        editorEdit6.putInt("apm_powerperf_sampling_rate", Integer.parseInt(obj.toString()));
                    }
                    Object obj2 = map.get("apm_powerperf_collect_interval");
                    if (obj2 != null) {
                        editorEdit6.putInt("apm_powerperf_collect_interval", Integer.parseInt(obj2.toString()));
                    }
                    Object obj3 = map.get("apm_powerperf_collect_max_period_sec");
                    if (obj3 != null) {
                        editorEdit6.putInt("apm_powerperf_collect_max_period_sec", Integer.parseInt(obj3.toString()));
                    }
                    editorEdit6.apply();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
        if (i != -1) {
            this.d = i;
        }
        boolean z = true;
        if (!SamplingWhiteListUtil.isHitWL()) {
            SharedPreferences sharedPreferences3 = this.b.getSharedPreferences("efs_power", 0);
            long j = sharedPreferences3 != null ? sharedPreferences3.getLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, 0L) : 0L;
            boolean z2 = sharedPreferences3 != null ? sharedPreferences3.getBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, false) : false;
            int i2 = this.d;
            if (i2 == 0) {
                if (z2 && sharedPreferences3 != null && (editorEdit5 = sharedPreferences3.edit()) != null) {
                    editorEdit5.putBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, false);
                    editorEdit5.commit();
                }
                if (j != 0 && sharedPreferences3 != null && (editorEdit4 = sharedPreferences3.edit()) != null) {
                    editorEdit4.putLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, 0L);
                    editorEdit4.commit();
                }
            } else {
                boolean z3 = i2 != this.f;
                int i3 = this.d;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j2 = jCurrentTimeMillis - j;
                if (!z2 || j2 >= 86400000 || z3) {
                    if (j2 >= 86400000 || z3) {
                        if (i3 == 0 || (i3 != 100 && new Random().nextInt(100) > i3)) {
                            z = false;
                        }
                        SharedPreferences sharedPreferences4 = this.b.getSharedPreferences("efs_power", 0);
                        if (sharedPreferences4 != null && (editorEdit3 = sharedPreferences4.edit()) != null) {
                            editorEdit3.putBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, z);
                            editorEdit3.apply();
                        }
                        if (sharedPreferences4 != null && (editorEdit2 = sharedPreferences4.edit()) != null) {
                            editorEdit2.putLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, jCurrentTimeMillis);
                            editorEdit2.apply();
                        }
                    }
                }
            }
            z = false;
        }
        this.g = z;
        SharedPreferences sharedPreferences5 = this.b.getSharedPreferences("efs_power", 0);
        if (sharedPreferences5 == null || (editorEdit = sharedPreferences5.edit()) == null) {
            return;
        }
        editorEdit.putInt("apm_powerperf_sampling_rate_last", this.d);
        editorEdit.apply();
    }

    public boolean enableTracer() {
        return this.g;
    }
}
