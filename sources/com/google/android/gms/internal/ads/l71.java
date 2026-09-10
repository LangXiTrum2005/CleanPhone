package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l71 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final tf1 f16774c = new tf1("OverlayDisplayService");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Intent f16775d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ln0 f16776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16777b;

    public l71(Context context) {
        if (s71.a(context)) {
            this.f16776a = new ln0(context.getApplicationContext(), f16774c, f16775d);
        } else {
            this.f16776a = null;
        }
        this.f16777b = context.getPackageName();
    }

    public static boolean b(String str) {
        if (str == null) {
            str = "";
        }
        return str.trim().isEmpty();
    }

    public static boolean c(o71 o71Var, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!b((String) it.next())) {
                return true;
            }
        }
        f16774c.d(str, new Object[0]);
        byte b10 = (byte) (((byte) (((byte) (0 | 1)) | 2)) | 1);
        if (b10 == 3) {
            o71Var.zza(new i71(8160, null, 0, null));
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb2.append(" statusCode");
        }
        if ((b10 & 2) == 0) {
            sb2.append(" uiMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public final void a(j71 j71Var, o71 o71Var, int i10) {
        ln0 ln0Var = this.f16776a;
        if (ln0Var == null) {
            f16774c.d("error: %s", "Play Store not found.");
        } else if (c(o71Var, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(j71Var.f16007a, j71Var.f16008b))) {
            ln0Var.j(new r71(ln0Var, new c20(this, j71Var, i10, o71Var), 0));
        }
    }
}
