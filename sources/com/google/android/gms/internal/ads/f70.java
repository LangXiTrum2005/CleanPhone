package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f70 implements ai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b30 f14297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f14298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z60 f14299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p9.a f14300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14301e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14302f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c70 f14303g = new c70();

    public f70(Executor executor, z60 z60Var, p9.a aVar) {
        this.f14298b = executor;
        this.f14299c = z60Var;
        this.f14300d = aVar;
    }

    public final void a() {
        try {
            JSONObject jSONObjectZzb = this.f14299c.zzb(this.f14303g);
            if (this.f14297a != null) {
                this.f14298b.execute(new zd1(19, this, jSONObjectZzb));
            }
        } catch (JSONException e10) {
            zze.zzb("Failed to call video active view js", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.ai
    public final void v(zh zhVar) {
        boolean z10 = this.f14302f ? false : zhVar.f22617j;
        c70 c70Var = this.f14303g;
        c70Var.f13074a = z10;
        ((p9.b) this.f14300d).getClass();
        c70Var.f13076c = SystemClock.elapsedRealtime();
        c70Var.f13078e = zhVar;
        if (this.f14301e) {
            a();
        }
    }
}
