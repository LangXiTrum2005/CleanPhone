package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class L4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f3336a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public /* synthetic */ L4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f3336a = obj;
        this.d = obj2;
        this.b = obj3;
        this.c = obj4;
        this.e = obj5;
    }

    public final void a(X7 x7) {
        Nd0 nd0 = new Nd0(8);
        Vd0 vd0 = (Vd0) this.e;
        L4 l4 = new L4();
        Sd0 sd0 = (Sd0) this.f3336a;
        if (sd0 == null) {
            throw new NullPointerException("Null transportContext");
        }
        l4.f3336a = sd0;
        l4.b = x7;
        String str = (String) this.d;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        l4.d = str;
        C2953a0 c2953a0 = (C2953a0) this.c;
        if (c2953a0 == null) {
            throw new NullPointerException("Null transformer");
        }
        l4.c = c2953a0;
        C3736ir c3736ir = (C3736ir) this.b;
        if (c3736ir == null) {
            throw new NullPointerException("Null encoding");
        }
        l4.e = c3736ir;
        if (!"".isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(""));
        }
        Sd0 sd1 = (Sd0) l4.f3336a;
        String str2 = (String) l4.d;
        X7 x8 = (X7) l4.b;
        C2953a0 c2953a1 = (C2953a0) l4.c;
        C3736ir c3736ir2 = (C3736ir) l4.e;
        Wd0 wd0 = (Wd0) vd0;
        wd0.getClass();
        x8.getClass();
        HV hv = HV.f3174a;
        sd1.getClass();
        C4201o8 c4201o8A = Sd0.a();
        C4289p8 c4289p8 = (C4289p8) sd1;
        c4201o8A.b(c4289p8.f4824a);
        c4201o8A.c(hv);
        c4201o8A.b = c4289p8.b;
        C4289p8 c4289p8A = c4201o8A.a();
        C4092mw c4092mw = new C4092mw();
        c4092mw.b = new HashMap();
        c4092mw.e = Long.valueOf(((C5211zg0) wd0.f3929a).a());
        c4092mw.f = Long.valueOf(((C5211zg0) wd0.b).a());
        if (str2 == null) {
            throw new NullPointerException("Null transportName");
        }
        c4092mw.f4722a = str2;
        c2953a1.getClass();
        C4396qP c4396qP = (C4396qP) x8.f3958a;
        c4396qP.getClass();
        C4568sM c4568sM = AbstractC4403qW.f4885a;
        c4568sM.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            c4568sM.k(c4396qP, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        c4092mw.e(new C3209cr(c3736ir2, byteArrayOutputStream.toByteArray()));
        c4092mw.c = null;
        Y7 y7B = c4092mw.b();
        C2653On c2653On = (C2653On) wd0.c;
        c2653On.getClass();
        c2653On.b.execute(new RunnableC5099yP(c2653On, c4289p8A, nd0, y7B, 1));
    }
}
