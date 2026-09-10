package com.unity3d.ads.injection;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.Ad;
import com.ironsource.C0526q2;
import com.ironsource.X3;
import fn.a1;
import fn.g;
import fn.n0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import jk.a;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.d;
import wj.f;
import xj.b0;
import xj.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\n\u001a\u00020\t\"\u0006\b\u0000\u0010\u0004\u0018\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\f\u001a\u00020\t\"\u0006\b\u0000\u0010\u0004\u0018\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJ)\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u00042\u0006\u0010\r\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0012\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0004\u0018\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0004\u0018\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\u0014\u0010\u0013R*\u0010\u0017\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R!\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u00168F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"Lcom/unity3d/ads/injection/Registry;", "", "<init>", "()V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "named", "Lkotlin/Function0;", C0526q2.f30050p, "Lcom/unity3d/ads/injection/EntryKey;", Ad.f25646d, "(Ljava/lang/String;Ljk/a;)Lcom/unity3d/ads/injection/EntryKey;", "factory", X3.i.W, "Lwj/d;", "Lwj/r;", "add", "(Lcom/unity3d/ads/injection/EntryKey;Lwj/d;)V", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "getOrNull", "Lfn/n0;", "", "_services", "Lfn/n0;", "getServices", "()Ljava/util/Map;", "services", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class Registry {
    private final n0 _services = g.c(w.f53867a);

    public static EntryKey factory$default(Registry registry, String named, a instance, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        n.f(named, "named");
        n.f(instance, "instance");
        n.k();
        throw null;
    }

    public static Object get$default(Registry registry, String named, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        n.f(named, "named");
        n.k();
        throw null;
    }

    public static Object getOrNull$default(Registry registry, String named, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        n.f(named, "named");
        n.k();
        throw null;
    }

    public static EntryKey single$default(Registry registry, String named, a instance, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        n.f(named, "named");
        n.f(instance, "instance");
        n.k();
        throw null;
    }

    public final <T> void add(EntryKey key, d instance) {
        a1 a1Var;
        Object value;
        n.f(key, "key");
        n.f(instance, "instance");
        if (getServices().containsKey(key)) {
            throw new IllegalStateException("Cannot have identical entries.");
        }
        n0 n0Var = this._services;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
        } while (!a1Var.c0(value, b0.T((Map) value, b0.P(new f(key, instance)))));
    }

    public final <T> EntryKey factory(String named, a instance) {
        n.f(named, "named");
        n.f(instance, "instance");
        n.k();
        throw null;
    }

    public final <T> T get(String named) {
        n.f(named, "named");
        n.k();
        throw null;
    }

    public final <T> T getOrNull(String named) {
        n.f(named, "named");
        n.k();
        throw null;
    }

    public final Map<EntryKey, d> getServices() {
        return (Map) ((a1) this._services).getValue();
    }

    public final <T> EntryKey single(String named, a instance) {
        n.f(named, "named");
        n.f(instance, "instance");
        n.k();
        throw null;
    }
}
