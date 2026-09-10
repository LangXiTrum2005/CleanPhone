package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.initialization.AdapterStatus;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p002kotlin.Pair;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.portwide;
import svd.AdapterVersionData;

/* JADX INFO: loaded from: classes.dex */
public final class e9 implements portwide {
    public final v8 a;
    public final List b;

    public e9(jk0 flags, v8 adapterInitializer) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(adapterInitializer, "adapterInitializer");
        this.a = adapterInitializer;
        this.b = flags.M();
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.ADAPTER_VERSIONS;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        d9 d9Var;
        Boolean boolAttabal;
        e9 e9Var;
        AdapterStatus.InitializationState initializationState;
        AdapterStatus adapterStatus;
        if (dernVar instanceof d9) {
            d9Var = (d9) dernVar;
            int i = d9Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                d9Var.d = i - Integer.MIN_VALUE;
            } else {
                d9Var = new d9(this, dernVar);
            }
        } else {
            d9Var = new d9(this, dernVar);
        }
        Object obj = d9Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = d9Var.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            if (!this.b.isEmpty()) {
                v8 v8Var = this.a;
                d9Var.a = this;
                d9Var.d = 1;
                synchronized (v8Var) {
                    boolAttabal = igo.attabal.attabal(v8Var.m);
                }
                if (boolAttabal == objBeachfront) {
                    return objBeachfront;
                }
                obj = boolAttabal;
                e9Var = this;
            }
            return new tn0(new c9(seminary.taiyuan()));
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e9Var = d9Var.a;
        p002kotlin.dern.saneness(obj);
        if (((Boolean) obj).booleanValue()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map mapA = e9Var.a.a();
            for (String str : e9Var.b) {
                Pair pair = (Pair) mapA.get(str);
                if (pair == null || (adapterStatus = (AdapterStatus) pair.getFirst()) == null || (initializationState = adapterStatus.getInitializationState()) == null) {
                    initializationState = AdapterStatus.InitializationState.NOT_STARTED;
                }
                Pair pair2 = (Pair) mapA.get(str);
                AdapterVersionData adapterVersionData = pair2 != null ? (AdapterVersionData) pair2.getSecond() : null;
                if (initializationState == AdapterStatus.InitializationState.COMPLETE && adapterVersionData != null) {
                    linkedHashMap.put(str, adapterVersionData);
                }
            }
            return new tn0(new c9(linkedHashMap));
        }
        return new tn0(new c9(seminary.taiyuan()));
    }
}
