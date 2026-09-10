package gb;

import ea.f2;
import eb.j0;
import eb.q;
import eb.s;
import fb.f;
import fb.h;
import fb.i;
import fb.j;
import java.util.Collections;
import java.util.HashMap;
import jb.o0;
import jb.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f2 f41814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f2 f41815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f41816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f41817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final eb.d f41818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final eb.b f41819f;

    static {
        lb.a aVarC = j0.c("type.googleapis.com/google.crypto.tink.HmacKey");
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        s1 s1Var = s1.RAW;
        i iVar = i.f40757e;
        map.put(s1Var, iVar);
        map2.put(iVar, s1Var);
        s1 s1Var2 = s1.TINK;
        i iVar2 = i.f40754b;
        map.put(s1Var2, iVar2);
        map2.put(iVar2, s1Var2);
        s1 s1Var3 = s1.LEGACY;
        i iVar3 = i.f40756d;
        map.put(s1Var3, iVar3);
        map2.put(iVar3, s1Var3);
        s1 s1Var4 = s1.CRUNCHY;
        i iVar4 = i.f40755c;
        map.put(s1Var4, iVar4);
        map2.put(iVar4, s1Var4);
        f41814a = new f2(Collections.unmodifiableMap(map), false, Collections.unmodifiableMap(map2), 12);
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        o0 o0Var = o0.SHA1;
        h hVar = h.f40748b;
        map3.put(o0Var, hVar);
        map4.put(hVar, o0Var);
        o0 o0Var2 = o0.SHA224;
        h hVar2 = h.f40749c;
        map3.put(o0Var2, hVar2);
        map4.put(hVar2, o0Var2);
        o0 o0Var3 = o0.SHA256;
        h hVar3 = h.f40750d;
        map3.put(o0Var3, hVar3);
        map4.put(hVar3, o0Var3);
        o0 o0Var4 = o0.SHA384;
        h hVar4 = h.f40751e;
        map3.put(o0Var4, hVar4);
        map4.put(hVar4, o0Var4);
        o0 o0Var5 = o0.SHA512;
        h hVar5 = h.f40752f;
        map3.put(o0Var5, hVar5);
        map4.put(hVar5, o0Var5);
        f41815b = new f2(Collections.unmodifiableMap(map3), false, Collections.unmodifiableMap(map4), 12);
        f41816c = new s(j.class, new com.unity3d.ads.adplayer.b(24));
        f41817d = new q(aVarC, new com.unity3d.ads.adplayer.b(25));
        f41818e = new eb.d(f.class, new com.unity3d.ads.adplayer.b(26));
        f41819f = new eb.b(aVarC, new com.unity3d.ads.adplayer.b(27));
    }
}
