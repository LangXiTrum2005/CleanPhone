package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzt;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s70 implements ta0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f19886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VersionInfoParcel f19887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du0 f19888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ou0 f19889e;

    public /* synthetic */ s70(Context context, VersionInfoParcel versionInfoParcel, du0 du0Var, ou0 ou0Var, int i10) {
        this.f19885a = i10;
        this.f19886b = context;
        this.f19887c = versionInfoParcel;
        this.f19888d = du0Var;
        this.f19889e = ou0Var;
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final /* synthetic */ void zzg() {
        switch (this.f19885a) {
            case 0:
                JSONObject jSONObject = this.f19888d.C;
                zzt.zzo().zzg(this.f19886b, this.f19887c.afmaVersion, jSONObject.toString(), this.f19889e.f18366g);
                break;
            default:
                JSONObject jSONObject2 = this.f19888d.C;
                zzt.zzo().zzg(this.f19886b, this.f19887c.afmaVersion, jSONObject2.toString(), this.f19889e.f18366g);
                break;
        }
    }
}
