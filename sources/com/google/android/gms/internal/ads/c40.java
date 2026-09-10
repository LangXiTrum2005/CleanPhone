package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c40 extends MutableContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f13031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f13032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f13033c;

    public final void a(Intent intent) {
        if (this.f13031a == null) {
            intent.setFlags(268435456);
            this.f13032b.startActivity(intent);
            return;
        }
        String strValueOf = String.valueOf(intent.getData());
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 63);
        sb2.append("Starting activity for result with intent: ");
        sb2.append(strValueOf);
        sb2.append(" and requestCode: 236");
        zze.zza(sb2.toString());
        this.f13031a.startActivityForResult(intent, 236);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.f13033c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f13032b = applicationContext;
        this.f13031a = context instanceof Activity ? (Activity) context : null;
        this.f13033c = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f13031a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.f13032b.startActivity(intent);
        }
    }
}
