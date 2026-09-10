package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.util.zzj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class rl0 extends q00 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final SparseArray f19610h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f19611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s90 f19612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TelephonyManager f19613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pl0 f19614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ll f19615g;

    static {
        SparseArray sparseArray = new SparseArray();
        f19610h = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zj.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zj zjVar = zj.CONNECTING;
        sparseArray.put(iOrdinal, zjVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zjVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zjVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zj.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zj zjVar2 = zj.DISCONNECTED;
        sparseArray.put(iOrdinal2, zjVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zjVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zjVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zjVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zjVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zj.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zjVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zjVar);
    }

    public rl0(Context context, s90 s90Var, pl0 pl0Var, lj1 lj1Var, zzj zzjVar) {
        super(lj1Var, zzjVar);
        this.f19611c = context;
        this.f19612d = s90Var;
        this.f19614f = pl0Var;
        this.f19613e = (TelephonyManager) context.getSystemService("phone");
    }
}
