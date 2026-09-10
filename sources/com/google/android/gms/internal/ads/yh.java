package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f22250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f22253e;

    public yh(String str, VersionInfoParcel versionInfoParcel, String str2, JSONObject jSONObject, boolean z10) {
        this.f22252d = versionInfoParcel.afmaVersion;
        this.f22250b = jSONObject;
        this.f22251c = str;
        this.f22249a = str2;
        this.f22253e = z10;
    }
}
