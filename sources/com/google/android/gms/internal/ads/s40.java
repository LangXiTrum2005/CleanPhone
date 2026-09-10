package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.ads.internal.util.client.zzu;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s40 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o40 f19831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fx1 f19832c;

    public s40(o40 o40Var, fx1 fx1Var) {
        this.f19830a = 2;
        this.f19832c = fx1Var;
        this.f19831b = o40Var;
    }

    public uo0 a() {
        yh0 yh0Var = (yh0) this.f19832c.zzb();
        this.f19831b.a();
        return new uo0(yh0Var, 6);
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f19830a) {
            case 0:
                try {
                    return r9.c.a(this.f19831b.a()).f(0, ((ApplicationInfo) this.f19832c.zzb()).packageName);
                } catch (PackageManager.NameNotFoundException unused) {
                    return null;
                }
            case 1:
                return new zzu(this.f19831b.a(), (String) this.f19832c.zzb());
            default:
                return a();
        }
    }

    public /* synthetic */ s40(o40 o40Var, fx1 fx1Var, int i10) {
        this.f19830a = i10;
        this.f19831b = o40Var;
        this.f19832c = fx1Var;
    }
}
