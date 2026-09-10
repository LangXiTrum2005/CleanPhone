package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdc;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbp;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class gf0 implements me0, sb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eu f14838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ma0 f14839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eb0 f14840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ba0 f14841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pc0 f14842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f14843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final du0 f14844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final VersionInfoParcel f14845h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ou0 f14846i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f14847j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14848k = false;
    public boolean l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final au f14849m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final bu f14850n;

    public gf0(au auVar, bu buVar, eu euVar, ma0 ma0Var, eb0 eb0Var, ba0 ba0Var, pc0 pc0Var, Context context, du0 du0Var, VersionInfoParcel versionInfoParcel, ou0 ou0Var) {
        this.f14849m = auVar;
        this.f14850n = buVar;
        this.f14838a = euVar;
        this.f14839b = ma0Var;
        this.f14840c = eb0Var;
        this.f14841d = ba0Var;
        this.f14842e = pc0Var;
        this.f14843f = context;
        this.f14844g = du0Var;
        this.f14845h = versionInfoParcel;
        this.f14846i = ou0Var;
    }

    public static final HashMap t(Map map) {
        HashMap map2 = new HashMap();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        map2.put((String) entry.getKey(), view);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return map2;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00cf A[Catch: JSONException -> 0x004d, RemoteException -> 0x014f, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x014f, blocks: (B:2:0x0000, B:5:0x0022, B:9:0x002c, B:12:0x0036, B:14:0x003e, B:15:0x004d, B:17:0x0053, B:19:0x005f, B:22:0x006b, B:25:0x0072, B:27:0x0088, B:39:0x00a9, B:42:0x00b0, B:43:0x00b4, B:44:0x00c9, B:46:0x00cf, B:50:0x00e1, B:52:0x00ed, B:55:0x00ff, B:57:0x0128), top: B:65:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x004d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00c9 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.me0
    public final void a(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        ClassLoader classLoader;
        Iterator it;
        s9.a aVarZzq;
        try {
            s9.b bVar = new s9.b(view);
            JSONObject jSONObject = this.f14844g.f13693j0;
            boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.f12265n2)).booleanValue();
            bu buVar = this.f14850n;
            au auVar = this.f14849m;
            eu euVar = this.f14838a;
            boolean z10 = true;
            if (zBooleanValue && jSONObject.length() != 0) {
                Map map3 = map == null ? new HashMap() : map;
                Map map4 = map2 == null ? new HashMap() : map2;
                HashMap map5 = new HashMap();
                map5.putAll(map3);
                map5.putAll(map4);
                Iterator<String> itKeys = jSONObject.keys();
                loop0: while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null) {
                        WeakReference weakReference = (WeakReference) map5.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) zzba.zzc().a(am.f12280o2)).booleanValue() && next.equals("3010")) {
                                Object objY1 = null;
                                if (euVar != null) {
                                    try {
                                        aVarZzq = euVar.zzq();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else if (auVar != null) {
                                    aVarZzq = auVar.v1();
                                } else {
                                    aVarZzq = buVar != null ? buVar.zzu() : null;
                                }
                                if (aVarZzq != null) {
                                    objY1 = s9.b.y1(aVarZzq);
                                }
                                if (objY1 != null) {
                                    cls = objY1.getClass();
                                    ArrayList arrayList = new ArrayList();
                                    zzbp.zza(jSONArrayOptJSONArray, arrayList);
                                    zzt.zzc();
                                    classLoader = this.f14843f.getClassLoader();
                                    it = arrayList.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                try {
                                    ArrayList arrayList2 = new ArrayList();
                                    zzbp.zza(jSONArrayOptJSONArray, arrayList2);
                                    zzt.zzc();
                                    classLoader = this.f14843f.getClassLoader();
                                    it = arrayList2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                } catch (JSONException unused2) {
                                    continue;
                                }
                            }
                        }
                        z10 = false;
                        break;
                    }
                }
            }
            this.l = z10;
            HashMap mapT = t(map);
            HashMap mapT2 = t(map2);
            if (euVar != null) {
                euVar.f0(bVar, new s9.b(mapT), new s9.b(mapT2));
                return;
            }
            if (auVar != null) {
                s9.b bVar2 = new s9.b(mapT);
                s9.b bVar3 = new s9.b(mapT2);
                Parcel parcelQ = auVar.q();
                rh.e(parcelQ, bVar);
                rh.e(parcelQ, bVar2);
                rh.e(parcelQ, bVar3);
                auVar.m0(parcelQ, 22);
                Parcel parcelQ2 = auVar.q();
                rh.e(parcelQ2, bVar);
                auVar.m0(parcelQ2, 12);
                return;
            }
            if (buVar != null) {
                s9.b bVar4 = new s9.b(mapT);
                s9.b bVar5 = new s9.b(mapT2);
                Parcel parcelQ3 = buVar.q();
                rh.e(parcelQ3, bVar);
                rh.e(parcelQ3, bVar4);
                rh.e(parcelQ3, bVar5);
                buVar.m0(parcelQ3, 22);
                Parcel parcelQ4 = buVar.q();
                rh.e(parcelQ4, bVar);
                buVar.m0(parcelQ4, 10);
            }
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zzj("Failed to call trackView", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void d(View view) {
        try {
            s9.b bVar = new s9.b(view);
            eu euVar = this.f14838a;
            if (euVar != null) {
                euVar.S(bVar);
                return;
            }
            au auVar = this.f14849m;
            if (auVar != null) {
                Parcel parcelQ = auVar.q();
                rh.e(parcelQ, bVar);
                auVar.m0(parcelQ, 16);
            } else {
                bu buVar = this.f14850n;
                if (buVar != null) {
                    Parcel parcelQ2 = buVar.q();
                    rh.e(parcelQ2, bVar);
                    buVar.m0(parcelQ2, 14);
                }
            }
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zzj("Failed to call untrackView", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final JSONObject e(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void g(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType, int i10) {
        if (!this.f14848k) {
            int i11 = zze.zza;
            zzo.zzi("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.f14844g.L) {
            u(view2);
        } else {
            int i12 = zze.zza;
            zzo.zzi("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final boolean j(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void k(zzdg zzdgVar) {
        int i10 = zze.zza;
        zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final JSONObject m(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void o(zzdc zzdcVar) {
        int i10 = zze.zza;
        zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void q(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType) {
        if (this.f14848k && this.f14844g.L) {
            return;
        }
        u(view);
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void s(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            boolean z10 = this.f14847j;
            du0 du0Var = this.f14844g;
            if (!z10) {
                this.f14847j = zzt.zzo().zzg(this.f14843f, this.f14845h.afmaVersion, du0Var.C.toString(), this.f14846i.f18366g);
            }
            if (this.l) {
                eu euVar = this.f14838a;
                ma0 ma0Var = this.f14839b;
                if (euVar != null) {
                    if (du0Var.D0) {
                        if (euVar.zzt()) {
                            return;
                        }
                        euVar.zzv();
                        ma0Var.zza();
                        return;
                    }
                    if (euVar.zzt() && du0Var.f13683e == 4) {
                        this.f14840c.zza();
                        return;
                    } else {
                        euVar.zzv();
                        ma0Var.zza();
                        return;
                    }
                }
                au auVar = this.f14849m;
                if (auVar != null) {
                    Parcel parcelR = auVar.r(auVar.q(), 13);
                    ClassLoader classLoader = rh.f19590a;
                    boolean z11 = parcelR.readInt() != 0;
                    parcelR.recycle();
                    if (!z11) {
                        auVar.m0(auVar.q(), 10);
                        ma0Var.zza();
                        return;
                    }
                }
                bu buVar = this.f14850n;
                if (buVar != null) {
                    Parcel parcelR2 = buVar.r(buVar.q(), 11);
                    ClassLoader classLoader2 = rh.f19590a;
                    boolean z12 = parcelR2.readInt() != 0;
                    parcelR2.recycle();
                    if (z12) {
                        return;
                    }
                    buVar.m0(buVar.q(), 8);
                    ma0Var.zza();
                }
            }
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zzj("Failed to call recordImpression", e10);
        }
    }

    public final void u(View view) {
        try {
            eu euVar = this.f14838a;
            pc0 pc0Var = this.f14842e;
            ba0 ba0Var = this.f14841d;
            if (euVar != null && !euVar.zzu()) {
                euVar.k(new s9.b(view));
                ba0Var.onAdClicked();
                if (((Boolean) zzba.zzc().a(am.f12349sc)).booleanValue()) {
                    pc0Var.C();
                    return;
                }
                return;
            }
            au auVar = this.f14849m;
            if (auVar != null) {
                Parcel parcelR = auVar.r(auVar.q(), 14);
                ClassLoader classLoader = rh.f19590a;
                boolean z10 = parcelR.readInt() != 0;
                parcelR.recycle();
                if (!z10) {
                    s9.b bVar = new s9.b(view);
                    Parcel parcelQ = auVar.q();
                    rh.e(parcelQ, bVar);
                    auVar.m0(parcelQ, 11);
                    ba0Var.onAdClicked();
                    if (((Boolean) zzba.zzc().a(am.f12349sc)).booleanValue()) {
                        pc0Var.C();
                        return;
                    }
                    return;
                }
            }
            bu buVar = this.f14850n;
            if (buVar != null) {
                Parcel parcelR2 = buVar.r(buVar.q(), 12);
                ClassLoader classLoader2 = rh.f19590a;
                boolean z11 = parcelR2.readInt() != 0;
                parcelR2.recycle();
                if (z11) {
                    return;
                }
                s9.b bVar2 = new s9.b(view);
                Parcel parcelQ2 = buVar.q();
                rh.e(parcelQ2, bVar2);
                buVar.m0(parcelQ2, 9);
                ba0Var.onAdClicked();
                if (((Boolean) zzba.zzc().a(am.f12349sc)).booleanValue()) {
                    pc0Var.C();
                }
            }
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zzj("Failed to call handleClick", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.sb0
    public final void z() {
        try {
            eu euVar = this.f14838a;
            if (euVar == null || !euVar.zzt()) {
                return;
            }
            du0 du0Var = this.f14844g;
            if (du0Var.f13683e == 4 || du0Var.D0) {
                euVar.zzv();
                this.f14839b.zza();
            }
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zzj("Failed to report impression from an adapter", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void zzA() {
        try {
            eu euVar = this.f14838a;
            if (euVar != null) {
                euVar.zzC();
            }
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zzj("Failed to call destroy", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void zzg() {
        this.f14848k = true;
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final boolean zzh() {
        return this.f14844g.L;
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final int zzu() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final boolean zzv() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.sb0
    public final void C() {
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void p() {
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void b(View view) {
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void f(String str) {
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void h(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void i(up upVar) {
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void n(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void l(MotionEvent motionEvent, View view) {
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void r(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
    }
}
