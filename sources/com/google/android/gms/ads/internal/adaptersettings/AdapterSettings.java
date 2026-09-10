package com.google.android.gms.ads.internal.adaptersettings;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.tl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
class AdapterSettings {

    @Nullable
    private static volatile AdapterSettings instance;
    private final tl adapterSettingsInternal = zzba.zzd();

    private boolean getBoolean(String str, boolean z10) {
        tl tlVar = this.adapterSettingsInternal;
        tlVar.getClass();
        return !str.startsWith("adapter:") ? z10 : tlVar.f20437c.optBoolean(str, z10);
    }

    private float getFloat(String str, float f10) {
        tl tlVar = this.adapterSettingsInternal;
        tlVar.getClass();
        return !str.startsWith("adapter:") ? f10 : (float) tlVar.f20437c.optDouble(str, f10);
    }

    public static AdapterSettings getInstance() {
        if (instance == null) {
            synchronized (AdapterSettings.class) {
                try {
                    if (instance == null) {
                        instance = new AdapterSettings();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return instance;
    }

    private int getInt(String str, int i10) {
        tl tlVar = this.adapterSettingsInternal;
        tlVar.getClass();
        return !str.startsWith("adapter:") ? i10 : tlVar.f20437c.optInt(str, i10);
    }

    private long getLong(String str, long j10) {
        tl tlVar = this.adapterSettingsInternal;
        tlVar.getClass();
        return !str.startsWith("adapter:") ? j10 : tlVar.f20437c.optLong(str, j10);
    }

    private String getString(String str, String str2) {
        tl tlVar = this.adapterSettingsInternal;
        tlVar.getClass();
        return !str.startsWith("adapter:") ? str2 : tlVar.f20437c.optString(str, str2);
    }
}
