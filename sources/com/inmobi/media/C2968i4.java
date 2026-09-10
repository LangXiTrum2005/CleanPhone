package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import kotlinx.coroutines.cutely;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.dern;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.i4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2968i4 {
    public final C3017k4 a;
    public final C2992j4 b;

    public C2968i4(C3017k4 configManagerState, C2992j4 configManagerDI) {
        Intrinsics.checkNotNullParameter(configManagerState, "configManagerState");
        Intrinsics.checkNotNullParameter(configManagerDI, "configManagerDI");
        this.a = configManagerState;
        this.b = configManagerDI;
    }

    public final Config a(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        String strA = AbstractC3241t4.a(clazz);
        Config config = (Config) this.a.b.get(strA);
        if (config == null) {
            String[] strArr = C3191r4.a;
            for (int i = 0; i < 5; i++) {
                String str = strArr[i];
                if (this.a.b.get(str) == null) {
                    this.a.b.put(str, AbstractC3068m5.a(str));
                }
            }
            config = (Config) this.a.b.get(strA);
            cutely.wireman(this.b.a, null, null, new C2892f4(this, null), 3, null);
        }
        Intrinsics.competently(config, "null cannot be cast to non-null type T of com.inmobi.media.core.config.manager.ConfigManager.getConfig");
        return config;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ContinuationImpl continuationImpl) {
        C2918g4 c2918g4;
        if (continuationImpl instanceof C2918g4) {
            c2918g4 = (C2918g4) continuationImpl;
            int i = c2918g4.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2918g4.c = i - Integer.MIN_VALUE;
            } else {
                c2918g4 = new C2918g4(this, continuationImpl);
            }
        } else {
            c2918g4 = new C2918g4(this, continuationImpl);
        }
        Object obj = c2918g4.a;
        Object objBeachfront = attabal.beachfront();
        int i2 = c2918g4.c;
        if (i2 == 0) {
            dern.saneness(obj);
            if (this.a.a.getAndSet(true)) {
                return Unit.f29295attabal;
            }
            c2918g4.c = 1;
            if (a(c2918g4) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dern.saneness(obj);
        }
        String[] strArr = C3191r4.a;
        for (int i3 = 0; i3 < 5; i3++) {
            String str = strArr[i3];
            if (this.a.b.get(str) == null) {
                this.a.b.put(str, AbstractC3068m5.a(str));
            }
        }
        cutely.wireman(this.b.a, null, null, new C2943h4(this, null), 3, null);
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        C2841d4 c2841d4;
        if (continuationImpl instanceof C2841d4) {
            c2841d4 = (C2841d4) continuationImpl;
            int i = c2841d4.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2841d4.c = i - Integer.MIN_VALUE;
            } else {
                c2841d4 = new C2841d4(this, continuationImpl);
            }
        } else {
            c2841d4 = new C2841d4(this, continuationImpl);
        }
        Object objA = c2841d4.a;
        Object objBeachfront = attabal.beachfront();
        int i2 = c2841d4.c;
        if (i2 == 0) {
            dern.saneness(objA);
            C2763a4 c2763a4 = (C2763a4) this.b.b.getValue();
            c2841d4.c = 1;
            objA = c2763a4.a(c2841d4);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dern.saneness(objA);
        }
        for (Config config : (Iterable) objA) {
            config.getType();
            this.a.b.put(config.getType(), config);
        }
        return Unit.f29295attabal;
    }
}
