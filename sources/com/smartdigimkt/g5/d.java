package com.smartdigimkt.g5;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public class d implements com.smartdigimkt.s4.b {
    private e X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    g f35449Y;
    WeakReference<Activity> Z;

    public void a(Activity activity) {
        this.Z = new WeakReference<>(activity);
    }

    @Override // com.smartdigimkt.s4.b
    public void close() {
        e eVar = this.X;
        if (eVar != null) {
            eVar.close();
        }
    }

    @Override // com.smartdigimkt.s4.b
    public void expand(String str, boolean z2) {
        Activity activity;
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            bundle.putBoolean("shouldUseCustomClose", z2);
            WeakReference<Activity> weakReference = this.Z;
            if (weakReference == null || (activity = weakReference.get()) == null) {
                return;
            }
            g gVar = this.f35449Y;
            if (gVar == null || !gVar.isShowing()) {
                g gVar2 = new g(activity, bundle, this.X);
                this.f35449Y = gVar2;
                gVar2.show();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.s4.b
    public void open(String str) {
        e eVar = this.X;
        if (eVar != null) {
            eVar.open(str);
        }
    }

    @Override // com.smartdigimkt.s4.b
    public void unload() {
        close();
    }

    @Override // com.smartdigimkt.s4.b
    public void useCustomClose(boolean z2) {
        try {
            e eVar = this.X;
            if (eVar != null) {
                eVar.useCustomClose(z2);
            }
        } catch (Throwable unused) {
        }
    }

    public void a(e eVar) {
        if (eVar != null) {
            this.X = eVar;
        }
    }
}
