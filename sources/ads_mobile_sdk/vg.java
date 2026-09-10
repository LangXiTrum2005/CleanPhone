package ads_mobile_sdk;

import formularization.beachfront;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p002kotlin.Unit;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vg {
    public final sj0 a;
    public final formularization.attabal b;
    public final LinkedHashMap c;
    public final AtomicInteger d;
    public final AtomicInteger e;
    public final AtomicReference f;
    public final AtomicBoolean g;

    public vg(sj0 flagDataStore) {
        Intrinsics.checkNotNullParameter(flagDataStore, "flagDataStore");
        this.a = flagDataStore;
        this.b = beachfront.saneness(false, 1, null);
        this.c = new LinkedHashMap();
        this.d = new AtomicInteger(0);
        this.e = new AtomicInteger(0);
        this.f = new AtomicReference("");
        this.g = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object a(vg vgVar, wretchedly.dern dernVar) {
        lg lgVar;
        vg vgVar2;
        formularization.attabal attabalVar;
        if (dernVar instanceof lg) {
            lgVar = (lg) dernVar;
            int i = lgVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                lgVar.e = i - Integer.MIN_VALUE;
            } else {
                lgVar = new lg(vgVar, dernVar);
            }
        } else {
            lgVar = new lg(vgVar, dernVar);
        }
        Object obj = lgVar.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = lgVar.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            formularization.attabal attabalVar2 = vgVar.b;
            lgVar.a = vgVar;
            lgVar.b = attabalVar2;
            lgVar.e = 1;
            if (attabalVar2.attabal(null, lgVar) == objBeachfront) {
                return objBeachfront;
            }
            vgVar2 = vgVar;
            attabalVar = attabalVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = lgVar.b;
            vgVar2 = lgVar.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            return seminary.rotuma(vgVar2.c);
        } finally {
            attabalVar.wireman(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object a(vg vgVar, String str, String str2, wretchedly.dern dernVar) {
        tg tgVar;
        formularization.attabal attabalVar;
        if (dernVar instanceof tg) {
            tgVar = (tg) dernVar;
            int i = tgVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                tgVar.g = i - Integer.MIN_VALUE;
            } else {
                tgVar = new tg(vgVar, dernVar);
            }
        } else {
            tgVar = new tg(vgVar, dernVar);
        }
        Object obj = tgVar.e;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = tgVar.g;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            attabalVar = vgVar.b;
            tgVar.a = vgVar;
            tgVar.b = str;
            tgVar.c = str2;
            tgVar.d = attabalVar;
            tgVar.g = 1;
            if (attabalVar.attabal(null, tgVar) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            formularization.attabal attabalVar2 = tgVar.d;
            str2 = tgVar.c;
            str = tgVar.b;
            vg vgVar2 = tgVar.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar2;
            vgVar = vgVar2;
        }
        if (str2 != null) {
            try {
                if (str2.length() != 0) {
                    vgVar.c.put(str, str2);
                    Unit unit = Unit.f29295attabal;
                } else {
                    vgVar.c.remove(str);
                }
            } finally {
                attabalVar.wireman(null);
            }
        } else {
            vgVar.c.remove(str);
        }
        return Unit.f29295attabal;
    }
}
