package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class dt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final jq f13670b = new jq(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ws f13671a;

    public dt(Context context, VersionInfoParcel versionInfoParcel, String str, kw0 kw0Var) {
        this.f13671a = new ws(context, versionInfoParcel, str, kw0Var);
    }

    public final ft a(String str, ct ctVar, bt btVar) {
        return new ft(this.f13671a, str, ctVar, btVar);
    }
}
