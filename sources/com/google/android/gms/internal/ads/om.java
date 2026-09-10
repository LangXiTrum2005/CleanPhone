package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzv;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class om extends u.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f18299c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f18300d = Arrays.asList(((String) zzba.zzc().a(am.f12457zb)).split(","));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qm f18301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u.a f18302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ci0 f18303g;

    public om(qm qmVar, u.a aVar, ci0 ci0Var) {
        this.f18302f = aVar;
        this.f18301e = qmVar;
        this.f18303g = ci0Var;
    }

    @Override // u.a
    public final void extraCallback(String str, Bundle bundle) {
        u.a aVar = this.f18302f;
        if (aVar != null) {
            aVar.extraCallback(str, bundle);
        }
    }

    @Override // u.a
    public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
        u.a aVar = this.f18302f;
        if (aVar != null) {
            return aVar.extraCallbackWithResult(str, bundle);
        }
        return null;
    }

    @Override // u.a
    public final void onActivityResized(int i10, int i11, Bundle bundle) {
        u.a aVar = this.f18302f;
        if (aVar != null) {
            aVar.onActivityResized(i10, i11, bundle);
        }
    }

    @Override // u.a
    public final void onMessageChannelReady(Bundle bundle) {
        this.f18299c.set(false);
        u.a aVar = this.f18302f;
        if (aVar != null) {
            aVar.onMessageChannelReady(bundle);
        }
    }

    @Override // u.a
    public final void onNavigationEvent(int i10, Bundle bundle) {
        this.f18299c.set(false);
        u.a aVar = this.f18302f;
        if (aVar != null) {
            aVar.onNavigationEvent(i10, bundle);
        }
        ((p9.b) zzt.zzk()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        qm qmVar = this.f18301e;
        qmVar.f19124j = jCurrentTimeMillis;
        List list = this.f18300d;
        if (list == null || !list.contains(String.valueOf(i10))) {
            return;
        }
        ((p9.b) zzt.zzk()).getClass();
        qmVar.f19123i = SystemClock.elapsedRealtime() + ((long) ((Integer) zzba.zzc().a(am.f12408wb)).intValue());
        if (qmVar.f19119e == null) {
            qmVar.f19119e = new d(qmVar, 14);
        }
        qmVar.d();
        zzv.zze(this.f18303g, null, "pact_action", new Pair("pe", "pact_reqpmc"));
    }

    @Override // u.a
    public final void onPostMessage(String str, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.f18299c.set(true);
                zzv.zze(this.f18303g, null, "pact_action", new Pair("pe", "pact_con"));
                this.f18301e.a(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e10) {
            zze.zzb("Message is not in JSON format: ", e10);
        }
        u.a aVar = this.f18302f;
        if (aVar != null) {
            aVar.onPostMessage(str, bundle);
        }
    }

    @Override // u.a
    public final void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
        u.a aVar = this.f18302f;
        if (aVar != null) {
            aVar.onRelationshipValidationResult(i10, uri, z10, bundle);
        }
    }
}
