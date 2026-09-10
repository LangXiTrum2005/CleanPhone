package com.efs.sdk.launch;

import android.content.Context;
import android.content.SharedPreferences;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.samplingwhitelist.SamplingWhiteListUtil;
import com.efs.sdk.pa.config.ConfigManager;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public class LaunchConfigManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f434a = "LaunchConfigManager";
    private final int b = 0;
    private EfsReporter c;
    private int d;
    private int e;
    private boolean f;
    private Context g;

    public LaunchConfigManager(Context context, EfsReporter efsReporter) {
        boolean z;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorEdit2;
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor editorEdit3;
        SharedPreferences.Editor editorEdit4;
        SharedPreferences.Editor editorEdit5;
        this.d = 100;
        this.f = false;
        Context applicationContext = context.getApplicationContext();
        this.g = applicationContext;
        this.c = efsReporter;
        SharedPreferences sharedPreferences2 = applicationContext.getSharedPreferences("efs_launch", 0);
        if (sharedPreferences2 != null) {
            this.e = sharedPreferences2.getInt("apm_startperf_sampling_rate_last", 0);
        }
        SharedPreferences sharedPreferences3 = this.g.getSharedPreferences("efs_launch", 0);
        int i = sharedPreferences3 != null ? sharedPreferences3.getInt("apm_startperf_sampling_rate", -1) : -1;
        this.c.getAllSdkConfig(new String[]{"apm_startperf_sampling_rate"}, new IConfigCallback() { // from class: com.efs.sdk.launch.LaunchConfigManager.1
            @Override // com.efs.sdk.base.observer.IConfigCallback
            public final void onChange(Map<String, Object> map) {
                SharedPreferences sharedPreferences4;
                SharedPreferences.Editor editorEdit6;
                try {
                    Object obj = map.get("apm_startperf_sampling_rate");
                    if (obj == null || (sharedPreferences4 = LaunchConfigManager.this.g.getSharedPreferences("efs_launch", 0)) == null || (editorEdit6 = sharedPreferences4.edit()) == null) {
                        return;
                    }
                    editorEdit6.putInt("apm_startperf_sampling_rate", Integer.parseInt(obj.toString()));
                    editorEdit6.commit();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
        if (i != -1) {
            this.d = i;
        }
        SharedPreferences sharedPreferences4 = this.g.getSharedPreferences("efs_launch", 0);
        long j = sharedPreferences4 != null ? sharedPreferences4.getLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, 0L) : 0L;
        boolean z2 = sharedPreferences4 != null ? sharedPreferences4.getBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, false) : false;
        if (this.d != 0) {
            z = true;
            if (!SamplingWhiteListUtil.isHitWL()) {
                boolean z3 = this.d != this.e;
                int i2 = this.d;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j2 = jCurrentTimeMillis - j;
                if (!z2 || j2 >= 86400000 || z3) {
                    if (j2 >= 86400000 || z3) {
                        if (i2 == 0 || (i2 != 100 && new Random().nextInt(100) > i2)) {
                            z = false;
                        }
                        SharedPreferences sharedPreferences5 = this.g.getSharedPreferences("efs_launch", 0);
                        if (sharedPreferences5 != null && (editorEdit2 = sharedPreferences5.edit()) != null) {
                            editorEdit2.putBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, z);
                            editorEdit2.commit();
                        }
                        if (sharedPreferences5 != null && (editorEdit = sharedPreferences5.edit()) != null) {
                            editorEdit.putLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, jCurrentTimeMillis);
                            editorEdit.commit();
                        }
                    }
                }
            }
            this.f = z;
            sharedPreferences = this.g.getSharedPreferences("efs_launch", 0);
            if (sharedPreferences != null || (editorEdit3 = sharedPreferences.edit()) == null) {
            }
            editorEdit3.putInt("apm_startperf_sampling_rate_last", this.d);
            editorEdit3.commit();
            return;
        }
        if (z2 && sharedPreferences4 != null && (editorEdit5 = sharedPreferences4.edit()) != null) {
            editorEdit5.putBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, false);
            editorEdit5.commit();
        }
        if (j != 0 && sharedPreferences4 != null && (editorEdit4 = sharedPreferences4.edit()) != null) {
            editorEdit4.putLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, 0L);
            editorEdit4.commit();
        }
        z = false;
        this.f = z;
        sharedPreferences = this.g.getSharedPreferences("efs_launch", 0);
        if (sharedPreferences != null) {
        }
    }

    public boolean enableTracer() {
        return this.f;
    }
}
