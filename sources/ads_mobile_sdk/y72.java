package ads_mobile_sdk;

import java.util.concurrent.ConcurrentHashMap;
import saneness.archipelagic;
import saneness.attraction;
import saneness.bubbles;
import saneness.extensively;
import saneness.ferrovanadium;
import saneness.imparkation;
import saneness.impromptu;
import saneness.iridectome;
import saneness.odille;
import saneness.salmi;
import saneness.tdb;
import saneness.utwa;

/* JADX INFO: loaded from: classes.dex */
public final class y72 {
    public static final y72 c = new y72();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final xc1 a = new xc1();

    public final attraction a(Class cls) {
        jf1 jf1VarA;
        attraction kf1Var;
        Class cls2;
        Object obj = this.b.get(cls);
        if (obj != null) {
            return (attraction) obj;
        }
        xc1 xc1Var = this.a;
        xc1Var.getClass();
        Class cls3 = yk2.a;
        if (!xm0.class.isAssignableFrom(cls) && !sb.b && (cls2 = yk2.a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        utwa utwaVarB = xc1Var.a.b(cls);
        mc2 mc2Var = (mc2) utwaVarB;
        if ((mc2Var.d & 2) != 2) {
            archipelagic archipelagicVar = null;
            if (sb.b || xm0.class.isAssignableFrom(cls)) {
                extensively extensivelyVar = saneness.f3291saneness;
                iridectome iridectomeVar = dern.f3284saneness;
                impromptu impromptuVar = yk2.c;
                archipelagicVar = tdb.attabal(mc2Var.d()) != 1 ? wireman.f3292attabal : null;
                ferrovanadium ferrovanadiumVar = attabal.f3281saneness;
                int[] iArr = jf1.n;
                if (!(utwaVarB instanceof mc2)) {
                    utwaVarB.getClass();
                    throw new ClassCastException();
                }
                jf1VarA = jf1.a((mc2) utwaVarB, extensivelyVar, iridectomeVar, impromptuVar, archipelagicVar, ferrovanadiumVar);
            } else {
                bubbles bubblesVar = saneness.f3290attabal;
                salmi salmiVar = dern.f3283attabal;
                odille odilleVar = yk2.b;
                if (tdb.attabal(mc2Var.d()) != 1 && (archipelagicVar = wireman.f3293saneness) == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                archipelagic archipelagicVar2 = archipelagicVar;
                imparkation imparkationVar = attabal.f3280attabal;
                int[] iArr2 = jf1.n;
                if (!(utwaVarB instanceof mc2)) {
                    utwaVarB.getClass();
                    throw new ClassCastException();
                }
                jf1VarA = jf1.a((mc2) utwaVarB, bubblesVar, salmiVar, odilleVar, archipelagicVar2, imparkationVar);
            }
            kf1Var = jf1VarA;
        } else if (sb.b || xm0.class.isAssignableFrom(cls)) {
            kf1Var = new kf1(yk2.c, wireman.f3292attabal, mc2Var.a);
        } else {
            odille odilleVar2 = yk2.b;
            archipelagic archipelagicVar3 = wireman.f3293saneness;
            if (archipelagicVar3 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            kf1Var = new kf1(odilleVar2, archipelagicVar3, mc2Var.a);
        }
        byte[] bArr = r21.a;
        attraction attractionVar = (attraction) this.b.putIfAbsent(cls, kf1Var);
        return attractionVar != null ? attractionVar : kf1Var;
    }
}
