package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import com.p004ironsource.d9;

/* JADX INFO: loaded from: classes4.dex */
final class zzabt {
    public static boolean zza(Context context) {
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService(d9.h.d);
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null && display.isHdr() && (hdrCapabilities = display.getHdrCapabilities()) != null) {
            for (int i2 : hdrCapabilities.getSupportedHdrTypes()) {
                if (i2 == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
