package com.startapp.sdk.internal;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import com.startapp.sdk.adsbase.remoteconfig.AdDebuggerMetadata;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.simple.bloomfilter.codec.IOUtils;

/* JADX INFO: loaded from: classes6.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f41380b;

    public q(Context context, lb lbVar, k5 k5Var) {
        this.f41379a = context;
        this.f41380b = lbVar;
    }

    public final void a(String str, String str2) {
        boolean z2;
        AdDebuggerMetadata adDebuggerMetadataD = MetaData.E().d();
        if (adDebuggerMetadataD != null && adDebuggerMetadataD.b()) {
            g9 g9Var = new g9(h9.d);
            g9Var.d = "adDebugInfo";
            g9Var.f41002e = str;
            g9Var.g = str2;
            g9Var.a();
        }
        if (str == null && str2 == null) {
            Toast.makeText(this.f41379a, "Ad debug info not available", 0).show();
            return;
        }
        StringBuilder sb = new StringBuilder("Ad debug info");
        String str3 = IOUtils.LINE_SEPARATOR_UNIX;
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        if (str != null) {
            sb.append("url: ");
            sb.append(str);
        } else {
            str3 = "";
        }
        if (str2 != null) {
            android.support.v4.media.a.A(sb, str3, "d: ", str2);
        }
        try {
            Object systemService = this.f41379a.getSystemService("clipboard");
            if (systemService instanceof ClipboardManager) {
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("Ad debug info", sb));
                z2 = true;
            } else {
                z2 = false;
            }
        } catch (Throwable unused) {
        }
        try {
            Toast.makeText(this.f41379a, "Ad debug info".concat(z2 ? " copied to clipboard" : " printed to logcat"), 0).show();
        } catch (Throwable unused2) {
        }
    }
}
