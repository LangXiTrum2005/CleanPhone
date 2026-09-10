package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.provider.Settings;

/* JADX INFO: compiled from: AnimatorDurationScaleProvider.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal {
    public float attabal(ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}
