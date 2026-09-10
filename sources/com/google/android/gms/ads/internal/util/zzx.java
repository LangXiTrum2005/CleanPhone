package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.am;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Locale;
import l1.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE)
public class zzx extends zzv {
    @Override // com.google.android.gms.ads.internal.util.zzz
    public final void zzh(final Activity activity) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.W1)).booleanValue() && com.google.android.gms.ads.internal.zzt.zzh().g().zzu() == null && !activity.isInMultiWindowMode()) {
            Window window = activity.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (1 != attributes.layoutInDisplayCutoutMode) {
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.google.android.gms.ads.internal.util.zzw
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    if (com.google.android.gms.ads.internal.zzt.zzh().g().zzu() == null) {
                        DisplayCutout displayCutout = windowInsets.getDisplayCutout();
                        String strConcat = "";
                        if (displayCutout != null) {
                            zzj zzjVarG = com.google.android.gms.ads.internal.zzt.zzh().g();
                            for (Rect rect : displayCutout.getBoundingRects()) {
                                Locale locale = Locale.US;
                                int i10 = rect.left;
                                int i11 = rect.top;
                                int i12 = rect.right;
                                int i13 = rect.bottom;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(i10);
                                sb2.append(",");
                                sb2.append(i11);
                                sb2.append(",");
                                sb2.append(i12);
                                String strK = d.k(sb2, ",", i13);
                                if (!TextUtils.isEmpty(strConcat)) {
                                    strConcat = strConcat.concat("|");
                                }
                                strConcat = strConcat.concat(strK);
                            }
                            zzjVarG.zzv(strConcat);
                        } else {
                            com.google.android.gms.ads.internal.zzt.zzh().g().zzv("");
                        }
                    }
                    Window window2 = activity.getWindow();
                    WindowManager.LayoutParams attributes2 = window2.getAttributes();
                    if (2 != attributes2.layoutInDisplayCutoutMode) {
                        attributes2.layoutInDisplayCutoutMode = 2;
                        window2.setAttributes(attributes2);
                    }
                    return view.onApplyWindowInsets(windowInsets);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final int zzi(AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }
}
