package com.google.android.gms.internal.ads;

import android.provider.Settings;
import com.google.android.gms.ads.internal.client.zzba;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qg extends yg {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile Long f19052i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile String f19054k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile Long f19055m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile String f19057o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile Long f19059q;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f19061h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f19053j = new Object();
    public static final Object l = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Object f19056n = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f19058p = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Object f19060r = new Object();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qg(fg fgVar, String str, String str2, xd xdVar, int i10, int i11, int i12) {
        super(fgVar, str, str2, xdVar, i10, i11);
        this.f19061h = i12;
    }

    private final void b() {
        xd xdVar = this.f22234d;
        xdVar.b();
        ((je) xdVar.f19193b).F0(-1L);
        xdVar.b();
        ((je) xdVar.f19193b).G0(-1L);
        int[] iArr = (int[]) this.f22235e.invoke(null, this.f22231a.f14387a);
        synchronized (xdVar) {
            long j10 = iArr[0];
            xdVar.b();
            ((je) xdVar.f19193b).F0(j10);
            long j11 = iArr[1];
            xdVar.b();
            ((je) xdVar.f19193b).G0(j11);
            int i10 = iArr[2];
            if (i10 != Integer.MIN_VALUE) {
                xdVar.b();
                ((je) xdVar.f19193b).X(i10);
            }
        }
    }

    private final void c() {
        if (f19054k == null) {
            synchronized (l) {
                try {
                    if (f19054k == null) {
                        f19054k = (String) this.f22235e.invoke(null, null);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        xd xdVar = this.f22234d;
        synchronized (xdVar) {
            String str = f19054k;
            xdVar.b();
            ((je) xdVar.f19193b).f0(str);
        }
    }

    private final void d() {
        if (f19055m == null) {
            synchronized (f19056n) {
                try {
                    if (f19055m == null) {
                        f19055m = (Long) this.f22235e.invoke(null, null);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        xd xdVar = this.f22234d;
        synchronized (xdVar) {
            long jLongValue = f19055m.longValue();
            xdVar.b();
            ((je) xdVar.f19193b).O0(jLongValue);
        }
    }

    private final void e() {
        xd xdVar = this.f22234d;
        xdVar.b();
        ((je) xdVar.f19193b).C0("E");
        if (f19057o == null) {
            synchronized (f19058p) {
                try {
                    if (f19057o == null) {
                        f19057o = (String) this.f22235e.invoke(null, null);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        xd xdVar2 = this.f22234d;
        synchronized (xdVar2) {
            String str = f19057o;
            xdVar2.b();
            ((je) xdVar2.f19193b).C0(str);
        }
    }

    private final void f() {
        Boolean bool = (Boolean) zzba.zzc().a(am.U3);
        bool.getClass();
        String str = (String) this.f22235e.invoke(null, this.f22231a.f14387a, bool);
        xf xfVar = new xf(19);
        xfVar.S = -1L;
        xfVar.T = -1L;
        HashMap mapS = pi1.s(str);
        if (mapS != null) {
            xfVar.S = ((Long) mapS.get(0)).longValue();
            xfVar.T = ((Long) mapS.get(1)).longValue();
        }
        xd xdVar = this.f22234d;
        synchronized (xdVar) {
            long j10 = xfVar.S;
            xdVar.b();
            ((je) xdVar.f19193b).E0(j10);
            long j11 = xfVar.T;
            xdVar.b();
            ((je) xdVar.f19193b).Y(j11);
        }
    }

    private final void g() {
        xd xdVar = this.f22234d;
        synchronized (xdVar) {
            String str = (String) this.f22235e.invoke(null, null);
            cg cgVar = new cg(19);
            HashMap mapS = pi1.s(str);
            if (mapS != null) {
                cgVar.S = (Long) mapS.get(0);
                cgVar.T = (Long) mapS.get(1);
            }
            long jLongValue = cgVar.S.longValue();
            xdVar.b();
            ((je) xdVar.f19193b).P(jLongValue);
            long jLongValue2 = cgVar.T.longValue();
            xdVar.b();
            ((je) xdVar.f19193b).Q(jLongValue2);
        }
    }

    private final void h() {
        if (f19059q == null) {
            synchronized (f19060r) {
                try {
                    if (f19059q == null) {
                        f19059q = (Long) this.f22235e.invoke(null, null);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        xd xdVar = this.f22234d;
        synchronized (xdVar) {
            long jLongValue = f19059q.longValue();
            xdVar.b();
            ((je) xdVar.f19193b).C(jLongValue);
        }
    }

    @Override // com.google.android.gms.internal.ads.yg
    public final void a() throws InvocationTargetException {
        switch (this.f19061h) {
            case 0:
                if (f19052i == null) {
                    synchronized (f19053j) {
                        try {
                            if (f19052i == null) {
                                f19052i = (Long) this.f22235e.invoke(null, null);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                xd xdVar = this.f22234d;
                synchronized (xdVar) {
                    long jLongValue = f19052i.longValue();
                    xdVar.b();
                    ((je) xdVar.f19193b).L(jLongValue);
                    break;
                }
                return;
            case 1:
                c();
                return;
            case 2:
                d();
                return;
            case 3:
                e();
                return;
            case 4:
                h();
                return;
            case 5:
                String str = (String) this.f22235e.invoke(null, null);
                xd xdVar2 = this.f22234d;
                synchronized (xdVar2) {
                    xdVar2.b();
                    ((je) xdVar2.f19193b).k0(str);
                    break;
                }
                return;
            case 6:
                xd xdVar3 = this.f22234d;
                xdVar3.b();
                ((je) xdVar3.f19193b).p0(3);
                try {
                    int i10 = 1;
                    if (true == ((Boolean) this.f22235e.invoke(null, this.f22231a.f14387a)).booleanValue()) {
                        i10 = 2;
                    }
                    xdVar3.b();
                    ((je) xdVar3.f19193b).p0(i10);
                    return;
                } catch (InvocationTargetException e10) {
                    if (!(e10.getTargetException() instanceof Settings.SettingNotFoundException)) {
                        throw e10;
                    }
                    return;
                }
            case 7:
                b();
                return;
            case 8:
                int i11 = true == ((Boolean) this.f22235e.invoke(null, this.f22231a.f14387a)).booleanValue() ? 2 : 1;
                xd xdVar4 = this.f22234d;
                xdVar4.b();
                ((je) xdVar4.f19193b).s0(i11);
                return;
            case 9:
                xd xdVar5 = this.f22234d;
                xdVar5.b();
                ((je) xdVar5.f19193b).I0(-1L);
                long jLongValue2 = ((Long) this.f22235e.invoke(null, this.f22231a.f14387a)).longValue();
                xdVar5.b();
                ((je) xdVar5.f19193b).I0(jLongValue2);
                return;
            case 10:
                f();
                return;
            case 11:
                xd xdVar6 = this.f22234d;
                try {
                    int i12 = 1;
                    if (true == ((Boolean) this.f22235e.invoke(null, this.f22231a.f14387a)).booleanValue()) {
                        i12 = 2;
                    }
                    xdVar6.b();
                    ((je) xdVar6.f19193b).r0(i12);
                    return;
                } catch (InvocationTargetException unused) {
                    xdVar6.b();
                    ((je) xdVar6.f19193b).r0(3);
                    return;
                }
            case 12:
                g();
                return;
            default:
                xd xdVar7 = this.f22234d;
                xdVar7.h(3);
                boolean zBooleanValue = ((Boolean) this.f22235e.invoke(null, this.f22231a.f14387a)).booleanValue();
                synchronized (xdVar7) {
                    try {
                        if (zBooleanValue) {
                            xdVar7.h(2);
                        } else {
                            xdVar7.h(1);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg(fg fgVar, xd xdVar, int i10, int i11) {
        super(fgVar, "c2tDBlieP1HgAca8BbxZWeFItAa95IUNAJZ8eF9wTfwT8H+oJvTJgvb0TMn4OhPJ", "tm0zp+MQfD9mNSBt0r3mfYhq2ky3SeNyaSrFjHWQaT0=", xdVar, i10, 44);
        this.f19061h = i11;
        switch (i11) {
            case 2:
                super(fgVar, "AeJvLHy+YL60Equ2/UpZQs9Ok34RPgGTn80fnG3Dx4JfdgAW65En0T0IJD/U8yYs", "sawjrbkZQHxExWkkVyDhv0h3fWiUMmvl7E2YVLpKa+A=", xdVar, i10, 22);
                break;
            case 3:
                super(fgVar, "XQdLYJkQLpAC0Ie4wfLqMhdIIwn1qr11ViPPFEC485DwlLnjXHhmJUbAoJDOqgC4", "EiIklDudUBV1tLFQO3J+6veHT/B2kTFeB6bPUIAs1V0=", xdVar, i10, 1);
                break;
            case 4:
                super(fgVar, "9v14GmYq1mityfaROUYQVHNDWlAgc2TzwyjcWsJSVQ5o6aEyLVnDo4vbeNXmh2ew", "zGbmNDn+uB00oiAu0ISzPA2QynMDAioh3MLj5VQvTcg=", xdVar, i10, 33);
                break;
            case 5:
                super(fgVar, "PmZORt2h3FILlRchj3l8QFpH1b4WBi8LAKFq8qXvSXgGWHByOiAJxaqMK9WTkxzB", "Ox3joL3a7fFzYIlEQut3utwsOQDntBqHwHmTdzF1H8c=", xdVar, i10, 89);
                break;
            case 6:
                super(fgVar, "2JfLKOCWe20PaEte0oViJ9E/+ELRHfLHNO4trOuu7IQ3kQ71vgp9bwF5/QP32+2T", "LVYC8EvnYnoIGxefzdW+bkgnD7TMgzMx712oMyZcYTg=", xdVar, i10, 49);
                break;
            case 7:
                super(fgVar, "m7g/XX2t5caOhtOM/ogmEO9Vkwmhkxe5gTS2qje4vP8HJASoqVE/26NLNeDuMz/t", "+Weh9OuqHFyRkOD06GxXjljhJF/GsDXbBDxKrn8yplc=", xdVar, i10, 5);
                break;
            case 8:
            default:
                break;
            case 9:
                super(fgVar, "P28XMQKwxb7t4RJM54Abd563bFUm9uASQiuwtqttjr6XDpyPt/FmHs2sVrWjtmTo", "fagQaENWAKeTH7PQjt5vlJiCBcOZOOnM19vGSn9sDlA=", xdVar, i10, 12);
                break;
            case 10:
                super(fgVar, "IIcYtgV+jKyhXEWTRGryYoN4Hb3AaxkKFvJa61B8IsfExxFOrLfbygLFTq7UIHav", "0Td4x6cMqS7UG7AA2zcqm+bK2AW+gIwIgEtwqP1CguA=", xdVar, i10, 3);
                break;
            case 11:
                super(fgVar, "sg/K0s1GwOZuQX5eitJmxib+wj81rdd8azNpkdJxx1Al3KmlPY0wLfmj2TGTYSv2", "x4M1RpSRK9uX9iukrRpM6KxHxc9F29fR3cS53OKE4Bs=", xdVar, i10, 73);
                break;
            case 12:
                super(fgVar, "Qz9CKMoDCHphOXPELo049qp61nrfn738aUeATKOiX7hq+kw0ujtW3xI/vlQKBh37", "bze+wYBAHEMh8JSXqo0+D4B3Aq+R4fX2jHr7eo7ufbY=", xdVar, i10, 51);
                break;
            case 13:
                super(fgVar, "GkIdfnRezKvEfAeB5157D8Ci3lpp/e7Oge9xr/GzO3KjC7JXvYHgpg7VRCtGuOw4", "kXUmyuEurXcq5mqFokC5oFFCqidwlGAMD9JpJXYa0Mk=", xdVar, i10, 48);
                break;
        }
    }
}
