package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.ads.internal.util.zzbc;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class jq implements o00, p00, bt, ct, zzbc, ax, zzq, p2, yd1, zb0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ jq f16132b = new jq(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ jq f16133c = new jq(5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ jq f16134d = new jq(12);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ jq f16135e = new jq(15);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ jq f16136f = new jq(16);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ jq f16137g = new jq(19);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ jq f16138h = new jq(20);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ jq f16139i = new jq(21);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ jq f16140j = new jq(22);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ jq f16141k = new jq(23);
    public static final /* synthetic */ jq l = new jq(24);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ jq f16142m = new jq(25);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ jq f16143n = new jq(26);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ jq f16144o = new jq(27);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ jq f16145p = new jq(28);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ jq f16146q = new jq(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16147a;

    public /* synthetic */ jq(int i10) {
        this.f16147a = i10;
    }

    @Override // com.google.android.gms.internal.ads.bt
    public /* synthetic */ Object c(JSONObject jSONObject) {
        switch (this.f16147a) {
            case 4:
                return jSONObject;
            default:
                return new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8));
        }
    }

    @Override // com.google.android.gms.internal.ads.o00, com.google.android.gms.internal.ads.z30
    /* JADX INFO: renamed from: zza */
    public void mo163zza() {
        int i10 = this.f16147a;
    }

    @Override // com.google.android.gms.internal.ads.ct
    public /* bridge */ /* synthetic */ JSONObject zzb(Object obj) {
        return (JSONObject) obj;
    }

    @Override // com.google.android.gms.internal.ads.yd1
    public void zza(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.yd1
    /* JADX INFO: renamed from: zzb, reason: collision with other method in class */
    public /* synthetic */ void mo164zzb(Object obj) {
        ((m80) obj).zzm();
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    public Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
        if (iInterfaceQueryLocalInterface instanceof my) {
            return (my) iInterfaceQueryLocalInterface;
        }
        return new my(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    @Override // com.google.android.gms.internal.ads.p00, com.google.android.gms.internal.ads.zb0
    /* JADX INFO: renamed from: zza */
    public void mo160zza(Object obj) {
        switch (this.f16147a) {
            case 2:
                zze.zza("Ending javascript session.");
                ys ysVar = (ys) ((xs) obj);
                HashSet<AbstractMap.SimpleEntry> hashSet = ysVar.f22360b;
                for (AbstractMap.SimpleEntry simpleEntry : hashSet) {
                    zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((oq) simpleEntry.getValue()).toString())));
                    ysVar.f22359a.k((String) simpleEntry.getKey(), (oq) simpleEntry.getValue());
                }
                hashSet.clear();
                break;
            case 3:
                l00.f16613f.execute(new qs((ms) obj, 2));
                break;
            case 19:
                ((zza) obj).onAdClicked();
                break;
            case 20:
                ((ia0) obj).zze();
                break;
            case 21:
                ((la0) obj).e(pi1.C(11, null, null));
                break;
            case 22:
                ((na0) obj).k();
                break;
            case 23:
                ((da0) obj).Z();
                break;
            case 24:
                ((da0) obj).Q();
                break;
            case 25:
                ((da0) obj).zze();
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                ((da0) obj).zzf();
                break;
            case 27:
                ((da0) obj).J();
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                ((ta0) obj).zzg();
                break;
            default:
                ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
                break;
        }
    }

    private final /* synthetic */ void d() {
    }

    private final void e() {
    }

    @Override // com.google.android.gms.internal.ads.p2
    public m2[] zza() {
        switch (this.f16147a) {
            case 15:
                AtomicInteger atomicInteger = r20.f19281u;
                return new m2[]{new r6(), new p5()};
            default:
                AtomicInteger atomicInteger2 = r20.f19281u;
                return new m2[]{new r6(), new p5(), new m6(p7.R8, 32, ya1.f22208e)};
        }
    }

    @Override // com.google.android.gms.internal.ads.ax
    public void a(String str, Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.ax
    public void b(Throwable th2, String str, float f10) {
    }
}
