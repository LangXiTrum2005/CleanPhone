package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k50 implements x40 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z20 f16324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z20 f16325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z20 f16326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z20 f16327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f16328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f16329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16330h;

    public k50() {
        ByteBuffer byteBuffer = x40.f21739a;
        this.f16328f = byteBuffer;
        this.f16329g = byteBuffer;
        z20 z20Var = z20.f22471e;
        this.f16326d = z20Var;
        this.f16327e = z20Var;
        this.f16324b = z20Var;
        this.f16325c = z20Var;
    }

    @Override // com.google.android.gms.internal.ads.x40
    public final void b(a40 a40Var) {
        this.f16329g = x40.f21739a;
        this.f16330h = false;
        this.f16324b = this.f16326d;
        this.f16325c = this.f16327e;
        h();
    }

    @Override // com.google.android.gms.internal.ads.x40
    public final z20 d(z20 z20Var) {
        this.f16326d = z20Var;
        this.f16327e = f(z20Var);
        return zzc() ? this.f16327e : z20.f22471e;
    }

    public final ByteBuffer e(int i10) {
        if (this.f16328f.capacity() < i10) {
            this.f16328f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f16328f.clear();
        }
        ByteBuffer byteBuffer = this.f16328f;
        this.f16329g = byteBuffer;
        return byteBuffer;
    }

    public abstract z20 f(z20 z20Var);

    @Override // com.google.android.gms.internal.ads.x40
    public boolean zzc() {
        return this.f16327e != z20.f22471e;
    }

    @Override // com.google.android.gms.internal.ads.x40
    public final void zze() {
        this.f16330h = true;
        g();
    }

    @Override // com.google.android.gms.internal.ads.x40
    public ByteBuffer zzf() {
        ByteBuffer byteBuffer = this.f16329g;
        this.f16329g = x40.f21739a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.x40
    public boolean zzg() {
        return this.f16330h && this.f16329g == x40.f21739a;
    }

    @Override // com.google.android.gms.internal.ads.x40
    public final void zzj() {
        ByteBuffer byteBuffer = x40.f21739a;
        this.f16329g = byteBuffer;
        this.f16330h = false;
        this.f16328f = byteBuffer;
        z20 z20Var = z20.f22471e;
        this.f16326d = z20Var;
        this.f16327e = z20Var;
        this.f16324b = z20Var;
        this.f16325c = z20Var;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
