package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.media3.common.PlaybackException;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3609l0 {
    public static final C3609l0 a = new C3609l0();

    private C3609l0() {
    }

    public static final int a() {
        if (Build.VERSION.SDK_INT < 30) {
            return 0;
        }
        try {
            return SdkExtensions.getExtensionVersion(PlaybackException.CUSTOM_ERROR_CODE_BASE);
        } catch (Exception e) {
            C3631m4.d().a(e);
            return 0;
        }
    }

    public static final MeasurementManager a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 30 && a() >= 4) {
            try {
                return androidx.privacysandbox.ads.adservices.measurement.marial.attabal(context.getSystemService(androidx.privacysandbox.ads.adservices.measurement.wireman.attabal()));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static /* synthetic */ void b() {
    }
}
