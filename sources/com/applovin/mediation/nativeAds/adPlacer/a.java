package com.applovin.mediation.nativeAds.adPlacer;

import android.content.Intent;
import android.content.IntentSender;
import com.unity3d.ads.InitializationListener;
import com.unity3d.services.core.properties.SdkProperties;
import f.j;
import f4.c;
import h.b;
import h.e;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.n;
import l1.k;
import l1.m;
import n5.f;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10422d;

    public /* synthetic */ a(int i10, int i11, Object obj, Object obj2) {
        this.f10419a = i11;
        this.f10421c = obj;
        this.f10420b = i10;
        this.f10422d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10419a) {
            case 0:
                ((MaxAdPlacer) this.f10421c).a(this.f10420b, (Collection) this.f10422d);
                break;
            case 1:
                SdkProperties.lambda$notifyInitializationFailed$3((InitializationListener) this.f10421c, this.f10420b, (String) this.f10422d);
                break;
            case 2:
                j jVar = (j) this.f10421c;
                Object obj = ((f) this.f10422d).f46523b;
                String str = (String) jVar.f42062a.get(Integer.valueOf(this.f10420b));
                if (str != null) {
                    e eVar = (e) jVar.f42066e.get(str);
                    if ((eVar != null ? eVar.f42054a : null) == null) {
                        jVar.f42068g.remove(str);
                        jVar.f42067f.put(str, obj);
                    } else {
                        b bVar = eVar.f42054a;
                        n.d(bVar, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
                        if (jVar.f42065d.remove(str)) {
                            bVar.onActivityResult(obj);
                        }
                    }
                    break;
                }
                break;
            case 3:
                ((j) this.f10421c).a(this.f10420b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f10422d));
                break;
            case 4:
                ((c) ((f4.a) this.f10421c).f40620d).g(this.f10420b, this.f10422d);
                break;
            default:
                CopyOnWriteArraySet<m> copyOnWriteArraySet = (CopyOnWriteArraySet) this.f10421c;
                k kVar = (k) this.f10422d;
                for (m mVar : copyOnWriteArraySet) {
                    if (!mVar.f44799d) {
                        int i10 = this.f10420b;
                        if (i10 != -1) {
                            mVar.f44797b.a(i10);
                        }
                        mVar.f44798c = true;
                        kVar.invoke(mVar.f44796a);
                    }
                }
                break;
        }
    }
}
