package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzr;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j90 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16023a = 6;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx1 f16024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx1 f16025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kx1 f16026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kx1 f16027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kx1 f16028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kx1 f16029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kx1 f16030h;

    public j90(o40 o40Var, fx1 fx1Var, fx1 fx1Var2, t80 t80Var, t80 t80Var2, fx1 fx1Var3, gx1 gx1Var) {
        this.f16024b = o40Var;
        this.f16025c = fx1Var;
        this.f16026d = fx1Var2;
        this.f16028f = t80Var;
        this.f16029g = t80Var2;
        this.f16027e = fx1Var3;
        this.f16030h = gx1Var;
    }

    public dn0 a() {
        return new dn0((y70) ((hx1) this.f16025c).f15424a, (Context) ((fx1) this.f16026d).zzb(), (Executor) this.f16024b.zzb(), (eh0) ((fx1) this.f16027e).zzb(), ((z90) this.f16030h).a(), (d81) ((fx1) this.f16028f).zzb(), (wh0) ((fx1) this.f16029g).zzb());
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f16023a) {
            case 0:
                return new i90(((o40) this.f16024b).a(), ((z90) this.f16030h).a(), ((u40) this.f16025c).a(), ((k40) this.f16026d).zzb(), (yi0) this.f16027e.zzb(), (kw0) this.f16028f.zzb(), (lj0) this.f16029g.zzb());
            case 1:
                return new th0(((o40) this.f16024b).a(), (tu0) this.f16025c.zzb(), (yh0) this.f16026d.zzb(), ((t80) this.f16028f).b(), ((t80) this.f16029g).a(), (ul0) this.f16027e.zzb(), (String) ((gx1) this.f16030h).zzb());
            case 2:
                return a();
            case 3:
                pd0 pd0Var = (pd0) ((hx1) this.f16026d).f15424a;
                k00 k00Var = l00.f16608a;
                ic1.h(k00Var);
                return new rn0(pd0Var, k00Var, ((fz) this.f16027e).a(), (xu0) this.f16024b.zzb(), (rg0) ((fx1) this.f16028f).zzb(), (wh0) ((fx1) this.f16029g).zzb(), ((u40) this.f16025c).a(), (Context) ((fx1) this.f16030h).zzb(), new jq(13));
            case 4:
                return new xs0((a50) this.f16024b.zzb(), (Context) ((hx1) this.f16027e).f15424a, (String) ((hx1) this.f16028f).f15424a, (us0) ((fx1) this.f16029g).zzb(), (ts0) ((fx1) this.f16030h).zzb(), ((u40) this.f16025c).a(), (yh0) this.f16026d.zzb());
            case 5:
                return new zs0((Context) ((hx1) this.f16026d).f15424a, (Executor) this.f16024b.zzb(), (zzr) ((hx1) this.f16027e).f15424a, (a50) this.f16025c.zzb(), (hp0) ((fx1) this.f16028f).zzb(), (jp0) ((fx1) this.f16029g).zzb(), new nu0(), (ub0) ((fx1) this.f16030h).zzb());
            case 6:
                return new f21((c31) ((fx1) this.f16024b).zzb(), (q31) ((fx1) this.f16025c).zzb(), (o61) ((fx1) this.f16026d).zzb(), (a71) ((fx1) this.f16027e).zzb(), (t21) ((fx1) this.f16028f).zzb(), fx1.b((fx1) this.f16029g), (h21) ((hx1) this.f16030h).f15424a);
            case 7:
                return new r31((ExecutorService) this.f16024b.zzb(), fx1.b((fx1) this.f16028f), fx1.b(this.f16025c), (o61) this.f16026d.zzb(), fx1.b((fx1) this.f16029g), (i21) this.f16030h, (h21) this.f16027e.zzb());
            case 8:
                Context context = (Context) this.f16024b.zzb();
                ExecutorService executorService = (ExecutorService) this.f16025c.zzb();
                y31 y31Var = (y31) this.f16026d.zzb();
                g41 g41Var = (g41) ((fx1) this.f16030h).zzb();
                File file = (File) this.f16027e.zzb();
                a71 a71Var = (a71) this.f16028f.zzb();
                h21 h21Var = (h21) this.f16029g.zzb();
                ia1 ia1VarT = ia1.t(new i41("oMAI9M+rfpAXD2NxGp+nC5qJwKDENlbYG7lXxNGFquSBEXZr9ZbCp8YKXYADPdQS", "GTycQamaBLKET6mxwzojHIa3a0Qk/f4p0jfnV7pjl+o=", Context.class), new i41("StEAvb/iigDIlQhq4PghExfp73gHg8IUtO74V2AuLhqk3CKzmFDPWKX0qTLgtCrl", "a0akqO7gmy+q2qeS0xD9lQHxt87lQ1nAIIevL4sq6Y8=", new Class[0]), new i41("YG+UUJxJEVSGG6jfg3qjLnMxlQFUVyMMjgzEbZMK/+kyZ0C5+m/L80+lYQbH4OQO", "6dR3aiNoBR9E5efHnflEq0hfvoZwKGjGgWyKk1r6EjY=", NetworkCapabilities.class, Long.class, Long.class), new i41("4x2Hh5iTg/qW5xffP7XUVyyhNVEHgfMgXZN24VVA9KHUAzifkbImBn58u0wzbVSZ", "gKocIG5D8c3aRlaOl/4axnWoyxTZtkz2guMC88wPwLk=", String.class), new i41("MB4NRPoKbszEsZs50F7mJwzu+33Ub7A+OagrfmieGdBjZs38LvzcQgcwQTLr3PB3", "U7Z7WtTc2NEgeomO+YkeOiOPYLQ8ra19osxSo/kBqLE=", View.class, Activity.class), new i41("jfdrT3YDVcDOM9UB5LzDpqcbuDp5keVZHqGcg+MV5UCB23uYRRp2NQL5QwO7s7yD", "z81VgQq8DV/RpboX+za4HXvceA1wD9mZ3Lv8nuAqQVE=", DisplayMetrics.class, View.class), new i41("0llJphW+1AJxnxbH/gLXWqExBUUJf0DQ3WuxUSKByDNRS1LORshIg0jq004o4mzE", "HgFzVQOFBY50xlS1g5v9F7L61Tt5netYE+jncsHeWeQ=", Long[].class, Integer.class), new i41("yqnoA3qkrpGdV0UDHfD7DkNdKz4CD4Omw8LwQ+mqDfnJnY5wPxLFUyGI2UEZc+9I", "QVM5zcLU6Zl19Cag2KVJanZ3HUWi7v3pEqNBU6r5voo=", new Class[0]), new i41("6uD00qi6mV8zu6AkyeC5bCv3568B2wPeNuQXCAqDKxVcHdQxA+KxNWLV41zFPdNB", "4KiYmGZMrZQiVkw5xeVvBXbdnWwWVS3sMp2EDvInOL8=", Context.class, Integer.class), new i41("3At8eFbAjAqsz9p03G/poStdLmldcsHDf7hwtHq+b9glp6N8klzSrT8HZ4GJjVN5", "mjdtNA0QQNNvx7gc0+BIhw0NZpaH3AMuijVtb9zt66I=", Integer.class, Context.class, Boolean.class), new i41("I4xYlccqZe8KvMWrizW1s/OekBI2YfU7UNZwq9dr0dp7B5I0B1zvHWlOnn7y8ubq", "k7BIphhpl3j5W4f9W8N9gMUD+i5xBlP2tWz8eVUQlQQ=", Context.class), new i41("i8dIMUuFazx2QmSkfzNlM975x3JumPrUee1RASXGMNDJH8RWJsPNqbpEpnJFa4Hi", "5davCcWMx5wzne2F0dLFbMr5/cylOtU7FK3CcX7bJPU=", Context.class), new i41("O/IhSczWkqH+q2aziu5mnePClwI2VInt8+rK2r5DAzxhVznO7DMyVuowa8d0HFxQ", "c/euB7bpmuTDKGTS9kQ/O7Lr64QuDKreUuxk5moaYNc=", MotionEvent.class, DisplayMetrics.class), new i41("8cUAbwpt6SKUQHhtSwuMmdGkTrID2QvHq2LA27x2GE3ivBr88edu7HCA+XurISAj", "khOZexiJY4Vla3osCKZbCsXRCvuYnTPcWDFUfUGsZNQ=", MotionEvent.class, DisplayMetrics.class));
                ic1.h(ia1VarT);
                return new h41(context, executorService, y31Var, g41Var, file, a71Var, h21Var.c0(), ia1VarT);
            case 9:
                return new n41((xd) ((hx1) this.f16028f).f15424a, (h41) this.f16024b.zzb(), (Map) ((hx1) this.f16029g).f15424a, (Context) this.f16025c.zzb(), (p21) ((hx1) this.f16030h).f15424a, (h21) this.f16026d.zzb(), (a71) this.f16027e.zzb());
            case 10:
                return new u51((n31) this.f16024b.zzb(), (l61) ((fx1) this.f16029g).zzb(), (k61) ((fx1) this.f16030h).zzb(), (o61) this.f16025c.zzb(), (a71) this.f16026d.zzb(), (h21) this.f16027e.zzb(), (ExecutorService) this.f16028f.zzb());
            default:
                return new y51((Context) this.f16024b.zzb(), fx1.b((fx1) this.f16027e), (c61) ((fx1) this.f16028f).zzb(), (a71) this.f16025c.zzb(), (ExecutorService) this.f16026d.zzb(), (m51) ((fx1) this.f16029g).zzb(), (qz0) ((fx1) this.f16030h).zzb());
        }
    }

    public j90(fx1 fx1Var, fx1 fx1Var2, fx1 fx1Var3, fx1 fx1Var4, fx1 fx1Var5, fx1 fx1Var6, hx1 hx1Var) {
        this.f16024b = fx1Var;
        this.f16025c = fx1Var2;
        this.f16026d = fx1Var3;
        this.f16027e = fx1Var4;
        this.f16028f = fx1Var5;
        this.f16029g = fx1Var6;
        this.f16030h = hx1Var;
    }

    public j90(fx1 fx1Var, fx1 fx1Var2, fx1 fx1Var3, fx1 fx1Var4, fx1 fx1Var5, hx1 hx1Var, hx1 hx1Var2) {
        this.f16024b = fx1Var;
        this.f16029g = fx1Var2;
        this.f16030h = fx1Var3;
        this.f16025c = fx1Var4;
        this.f16026d = fx1Var5;
        this.f16027e = hx1Var;
        this.f16028f = hx1Var2;
    }

    public j90(hx1 hx1Var, fz fzVar, kx1 kx1Var, fx1 fx1Var, fx1 fx1Var2, kx1 kx1Var2, fx1 fx1Var3) {
        this.f16026d = hx1Var;
        this.f16027e = fzVar;
        this.f16024b = kx1Var;
        this.f16028f = fx1Var;
        this.f16029g = fx1Var2;
        this.f16025c = kx1Var2;
        this.f16030h = fx1Var3;
    }

    public j90(hx1 hx1Var, fx1 fx1Var, fx1 fx1Var2, fx1 fx1Var3, fx1 fx1Var4, i21 i21Var, hx1 hx1Var2) {
        this.f16024b = hx1Var;
        this.f16028f = fx1Var;
        this.f16025c = fx1Var2;
        this.f16026d = fx1Var3;
        this.f16029g = fx1Var4;
        this.f16030h = i21Var;
        this.f16027e = hx1Var2;
    }

    public j90(hx1 hx1Var, fx1 fx1Var, fx1 fx1Var2, fx1 fx1Var3, hx1 hx1Var2, fx1 fx1Var4, fx1 fx1Var5) {
        this.f16024b = hx1Var;
        this.f16027e = fx1Var;
        this.f16028f = fx1Var2;
        this.f16025c = fx1Var3;
        this.f16026d = hx1Var2;
        this.f16029g = fx1Var4;
        this.f16030h = fx1Var5;
    }

    public j90(hx1 hx1Var, fx1 fx1Var, hx1 hx1Var2, hx1 hx1Var3, fx1 fx1Var2, fx1 fx1Var3, fx1 fx1Var4) {
        this.f16026d = hx1Var;
        this.f16024b = fx1Var;
        this.f16027e = hx1Var2;
        this.f16025c = hx1Var3;
        this.f16028f = fx1Var2;
        this.f16029g = fx1Var3;
        this.f16030h = fx1Var4;
    }

    public j90(hx1 hx1Var, fx1 fx1Var, hx1 hx1Var2, hx1 hx1Var3, hx1 hx1Var4, hx1 hx1Var5, fx1 fx1Var2) {
        this.f16028f = hx1Var;
        this.f16024b = fx1Var;
        this.f16029g = hx1Var2;
        this.f16025c = hx1Var3;
        this.f16030h = hx1Var4;
        this.f16026d = hx1Var5;
        this.f16027e = fx1Var2;
    }

    public j90(hx1 hx1Var, fx1 fx1Var, kx1 kx1Var, fx1 fx1Var2, z90 z90Var, fx1 fx1Var3, fx1 fx1Var4) {
        this.f16025c = hx1Var;
        this.f16026d = fx1Var;
        this.f16024b = kx1Var;
        this.f16027e = fx1Var2;
        this.f16030h = z90Var;
        this.f16028f = fx1Var3;
        this.f16029g = fx1Var4;
    }

    public j90(hx1 hx1Var, hx1 hx1Var2, fx1 fx1Var, fx1 fx1Var2, fx1 fx1Var3, fx1 fx1Var4, hx1 hx1Var3) {
        this.f16024b = hx1Var;
        this.f16025c = hx1Var2;
        this.f16026d = fx1Var;
        this.f16030h = fx1Var2;
        this.f16027e = fx1Var3;
        this.f16028f = fx1Var4;
        this.f16029g = hx1Var3;
    }

    public j90(hx1 hx1Var, hx1 hx1Var2, hx1 hx1Var3, fx1 fx1Var, fx1 fx1Var2, u40 u40Var, fx1 fx1Var3) {
        this.f16024b = hx1Var;
        this.f16027e = hx1Var2;
        this.f16028f = hx1Var3;
        this.f16029g = fx1Var;
        this.f16030h = fx1Var2;
        this.f16025c = u40Var;
        this.f16026d = fx1Var3;
    }

    public j90(kx1 kx1Var, z90 z90Var, kx1 kx1Var2, kx1 kx1Var3, kx1 kx1Var4, kx1 kx1Var5, kx1 kx1Var6) {
        this.f16024b = kx1Var;
        this.f16030h = z90Var;
        this.f16025c = kx1Var2;
        this.f16026d = kx1Var3;
        this.f16027e = kx1Var4;
        this.f16028f = kx1Var5;
        this.f16029g = kx1Var6;
    }
}
