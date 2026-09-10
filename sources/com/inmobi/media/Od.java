package com.inmobi.media;

import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class Od extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Od f23049a = new Od();

    public Od() {
        super(1);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C2978d2 it = (C2978d2) obj;
        Intrinsics.f(it, "it");
        int i2 = it.f23507a;
        if (i2 != 1 && i2 != 2) {
            switch (i2) {
                case 150:
                    Xd xd = Pd.f23082i;
                    if (xd != null) {
                        Map map = it.f23509c;
                        Object obj2 = map != null ? map.get("data") : null;
                        xd.a("CrashEventOccurred", obj2 instanceof C3124m3 ? (C3124m3) obj2 : null);
                    }
                    break;
                case 151:
                    Xd xd2 = Pd.f23082i;
                    if (xd2 != null) {
                        Map map2 = it.f23509c;
                        Object obj3 = map2 != null ? map2.get("data") : null;
                        mf mfVar = obj3 instanceof mf ? (mf) obj3 : null;
                        if (mfVar != null && Ie.a(mfVar) && !L3.f22938a.z()) {
                            xd2.a("MainThreadBlockedEvent", mfVar);
                        }
                    }
                    break;
                case 152:
                    Xd xd3 = Pd.f23082i;
                    if (xd3 != null) {
                        Map map3 = it.f23509c;
                        Object obj4 = map3 != null ? map3.get("data") : null;
                        xd3.a(obj4 instanceof C2977d1 ? (C2977d1) obj4 : null);
                    }
                    break;
                default:
                    Pd pd = Pd.f23077a;
                    break;
            }
        } else {
            Pd.d.set(false);
            C3236t4 c3236t4 = Pd.f;
            if (c3236t4 != null) {
                ScheduledExecutorService scheduledExecutorService = c3236t4.f24003h;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                }
                c3236t4.f24003h = null;
                c3236t4.f24002e.set(false);
                c3236t4.f.set(true);
                c3236t4.g.clear();
                c3236t4.f24004i = null;
            }
            Pd.f = null;
            Pd.f23082i = null;
            Uc.f().a(Pd.f23081h);
        }
        return Unit.f43263a;
    }
}
