package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q50 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r50 f18936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f18937c;

    public /* synthetic */ q50(r50 r50Var, Runnable runnable, int i10) {
        this.f18935a = i10;
        this.f18936b = r50Var;
        this.f18937c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f18935a;
        Runnable runnable = this.f18937c;
        r50 r50Var = this.f18936b;
        switch (i10) {
            case 0:
                l00.f16613f.execute(new q50(r50Var, runnable, 1));
                return;
            default:
                k9.c0.d("Adapters must be initialized on the main thread.");
                HashMap map = zzt.zzh().g().zzi().f12959c;
                if (map.isEmpty()) {
                    return;
                }
                if (runnable != null) {
                    try {
                        runnable.run();
                    } catch (Throwable th2) {
                        int i11 = zze.zza;
                        zzo.zzj("Could not initialize rewarded ads.", th2);
                        return;
                    }
                    break;
                }
                if (((st) ((AtomicReference) r50Var.f19392c.f17826a.f21276d).get()) != null) {
                    HashMap map2 = new HashMap();
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        for (nt ntVar : ((ot) it.next()).f18356a) {
                            String str = ntVar.f17945b;
                            for (String str2 : ntVar.f17944a) {
                                if (!map2.containsKey(str2)) {
                                    map2.put(str2, new ArrayList());
                                }
                                if (str != null) {
                                    ((List) map2.get(str2)).add(str);
                                }
                            }
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : map2.entrySet()) {
                        String str3 = (String) entry.getKey();
                        try {
                            qm0 qm0VarA = r50Var.f19393d.a(str3, jSONObject);
                            if (qm0VarA != null) {
                                wu0 wu0Var = (wu0) qm0VarA.f19127b;
                                boolean zA = wu0Var.a();
                                ut utVar = wu0Var.f21609a;
                                if (!zA) {
                                    try {
                                        if (utVar.zzx()) {
                                            try {
                                                utVar.a0(new s9.b(r50Var.f19390a), (kn0) qm0VarA.f19128c, (List) entry.getValue());
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 45);
                                                sb2.append("Initialized rewarded video mediation adapter ");
                                                sb2.append(str3);
                                                String string = sb2.toString();
                                                int i12 = zze.zza;
                                                zzo.zzd(string);
                                            } catch (Throwable th3) {
                                                throw new qu0(th3);
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        throw new qu0(th4);
                                    }
                                }
                            }
                        } catch (qu0 e10) {
                            String strJ = q4.a.j(new StringBuilder(String.valueOf(str3).length() + 56), "Failed to initialize rewarded video mediation adapter \"", str3, "\"");
                            int i13 = zze.zza;
                            zzo.zzj(strJ, e10);
                        }
                    }
                    return;
                }
                return;
        }
    }
}
