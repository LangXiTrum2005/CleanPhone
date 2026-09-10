package cb;

import bb.e;
import eb.j0;
import eb.q;
import eb.s;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import jb.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f5965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f5966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final eb.d f5967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final eb.b f5968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map f5969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Map f5970f;

    static {
        lb.a aVarC = j0.c("type.googleapis.com/google.crypto.tink.AesSivKey");
        f5965a = new s(e.class, new ae.b(14));
        f5966b = new q(aVarC, new ae.b(15));
        f5967c = new eb.d(bb.a.class, new ae.b(16));
        f5968d = new eb.b(aVarC, new ae.b(17));
        HashMap map = new HashMap();
        bb.d dVar = bb.d.f5522d;
        s1 s1Var = s1.RAW;
        map.put(dVar, s1Var);
        bb.d dVar2 = bb.d.f5520b;
        s1 s1Var2 = s1.TINK;
        map.put(dVar2, s1Var2);
        bb.d dVar3 = bb.d.f5521c;
        s1 s1Var3 = s1.CRUNCHY;
        map.put(dVar3, s1Var3);
        f5969e = Collections.unmodifiableMap(map);
        EnumMap enumMap = new EnumMap(s1.class);
        enumMap.put(s1Var, dVar);
        enumMap.put(s1Var2, dVar2);
        enumMap.put(s1Var3, dVar3);
        enumMap.put(s1.LEGACY, dVar3);
        f5970f = Collections.unmodifiableMap(enumMap);
    }

    public static s1 a(bb.d dVar) {
        Map map = f5969e;
        if (map.containsKey(dVar)) {
            return (s1) map.get(dVar);
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + dVar);
    }

    public static bb.d b(s1 s1Var) throws GeneralSecurityException {
        Map map = f5970f;
        if (map.containsKey(s1Var)) {
            return (bb.d) map.get(s1Var);
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + s1Var.getNumber());
    }
}
