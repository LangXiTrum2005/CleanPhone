package com.google.android.gms.internal.ads;

import android.app.sdksandbox.sdkprovider.SdkSandboxController;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qa extends rb0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f19007q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Context f19008r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f19009s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public uh f19010t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public pa f19011u;

    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    public qa(Context context) {
        String packageName;
        this.f19008r = context.getApplicationContext();
        int i10 = i0.c.f42485a;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            packageName = (SdkExtensions.getExtensionVersion(34) >= 8 || !Process.isSdkSandbox()) ? context.getPackageName() : ((SdkSandboxController) context.getSystemService(SdkSandboxController.class)).getClientPackageName();
        } else {
            if (i11 >= 33) {
                String CODENAME = Build.VERSION.CODENAME;
                kotlin.jvm.internal.n.e(CODENAME, "CODENAME");
                if (i0.c.a("UpsideDownCake")) {
                    if (SdkExtensions.getExtensionVersion(34) >= 8) {
                    }
                }
            }
            packageName = context.getPackageName();
        }
        this.f19009s = packageName;
    }

    public final boolean I() {
        return (this.f19007q != 2 || this.f19010t == null || this.f19011u == null) ? false : true;
    }

    public final so0 J() throws RemoteException {
        if (!I()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.f19009s);
        try {
            sh shVar = (sh) this.f19010t;
            Parcel parcelQ = shVar.q();
            rh.c(parcelQ, bundle);
            Parcel parcelR = shVar.r(parcelQ, 1);
            Bundle bundle2 = (Bundle) rh.b(parcelR, Bundle.CREATOR);
            parcelR.recycle();
            return new so0(bundle2, 5);
        } catch (RemoteException e10) {
            v71.q("RemoteException getting install referrer information");
            this.f19007q = 0;
            throw e10;
        }
    }
}
