package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class tm implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fx1 f20443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx1 f20444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kx1 f20445d;

    public tm(fx1 fx1Var, fx1 fx1Var2, hx1 hx1Var) {
        this.f20442a = 2;
        this.f20444c = hx1Var;
        this.f20443b = fx1Var;
        this.f20445d = fx1Var2;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f20442a) {
            case 0:
                ((o40) this.f20444c).a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f20445d.zzb();
                return new sm(scheduledExecutorService);
            case 1:
                return new uh0((wh0) this.f20443b.zzb(), (ci0) this.f20444c.zzb(), ((o40) this.f20445d).a());
            case 2:
                Context context = (Context) this.f20444c.zzb();
                return new l51(context, context.getSharedPreferences("pcvmspf2", 0), fx1.b(this.f20443b), (a71) this.f20445d.zzb());
            case 3:
                File file = (File) this.f20443b.zzb();
                a31 a31Var = (a31) this.f20444c.zzb();
                final a71 a71Var = (a71) this.f20445d.zzb();
                l31 l31VarF = l31.F();
                final int i10 = 0;
                d81 d81Var = new d81() { // from class: com.google.android.gms.internal.ads.g61
                    @Override // com.google.android.gms.internal.ads.d81
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th2 = (Throwable) obj;
                        switch (i10) {
                            case 0:
                                a71Var.d(th2, 15308);
                                return l31.F();
                            case 1:
                                a71Var.d(th2, 15310);
                                return new byte[0];
                            case 2:
                                a71Var.d(th2, 15310);
                                return new byte[0];
                            case 3:
                                a71Var.d(th2, 15309);
                                return new byte[0];
                            case 4:
                                a71Var.d(th2, 15309);
                                return new byte[0];
                            case 5:
                                a71Var.d(th2, 15308);
                                return l31.F();
                            case 6:
                                a71Var.d(th2, 20310);
                                return new byte[0];
                            case 7:
                                a71Var.d(th2, 20309);
                                return new byte[0];
                            default:
                                a71Var.d(th2, 20308);
                                return l31.F();
                        }
                    }
                };
                a31Var.getClass();
                return new z21(file, a31Var.f11819a, new at0(l31VarF, 7), d81Var);
            case 4:
                File file2 = (File) this.f20443b.zzb();
                a31 a31Var2 = (a31) this.f20444c.zzb();
                final a71 a71Var2 = (a71) this.f20445d.zzb();
                final int i11 = 2;
                return a31Var2.a(file2, new byte[0], new d81() { // from class: com.google.android.gms.internal.ads.g61
                    @Override // com.google.android.gms.internal.ads.d81
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th2 = (Throwable) obj;
                        switch (i11) {
                            case 0:
                                a71Var2.d(th2, 15308);
                                return l31.F();
                            case 1:
                                a71Var2.d(th2, 15310);
                                return new byte[0];
                            case 2:
                                a71Var2.d(th2, 15310);
                                return new byte[0];
                            case 3:
                                a71Var2.d(th2, 15309);
                                return new byte[0];
                            case 4:
                                a71Var2.d(th2, 15309);
                                return new byte[0];
                            case 5:
                                a71Var2.d(th2, 15308);
                                return l31.F();
                            case 6:
                                a71Var2.d(th2, 20310);
                                return new byte[0];
                            case 7:
                                a71Var2.d(th2, 20309);
                                return new byte[0];
                            default:
                                a71Var2.d(th2, 20308);
                                return l31.F();
                        }
                    }
                });
            case 5:
                File file3 = (File) this.f20443b.zzb();
                a31 a31Var3 = (a31) this.f20444c.zzb();
                final a71 a71Var3 = (a71) this.f20445d.zzb();
                final int i12 = 4;
                return a31Var3.a(file3, new byte[0], new d81() { // from class: com.google.android.gms.internal.ads.g61
                    @Override // com.google.android.gms.internal.ads.d81
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th2 = (Throwable) obj;
                        switch (i12) {
                            case 0:
                                a71Var3.d(th2, 15308);
                                return l31.F();
                            case 1:
                                a71Var3.d(th2, 15310);
                                return new byte[0];
                            case 2:
                                a71Var3.d(th2, 15310);
                                return new byte[0];
                            case 3:
                                a71Var3.d(th2, 15309);
                                return new byte[0];
                            case 4:
                                a71Var3.d(th2, 15309);
                                return new byte[0];
                            case 5:
                                a71Var3.d(th2, 15308);
                                return l31.F();
                            case 6:
                                a71Var3.d(th2, 20310);
                                return new byte[0];
                            case 7:
                                a71Var3.d(th2, 20309);
                                return new byte[0];
                            default:
                                a71Var3.d(th2, 20308);
                                return l31.F();
                        }
                    }
                });
            case 6:
                File file4 = (File) this.f20443b.zzb();
                a31 a31Var4 = (a31) this.f20444c.zzb();
                final a71 a71Var4 = (a71) this.f20445d.zzb();
                l31 l31VarF2 = l31.F();
                final int i13 = 5;
                d81 d81Var2 = new d81() { // from class: com.google.android.gms.internal.ads.g61
                    @Override // com.google.android.gms.internal.ads.d81
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th2 = (Throwable) obj;
                        switch (i13) {
                            case 0:
                                a71Var4.d(th2, 15308);
                                return l31.F();
                            case 1:
                                a71Var4.d(th2, 15310);
                                return new byte[0];
                            case 2:
                                a71Var4.d(th2, 15310);
                                return new byte[0];
                            case 3:
                                a71Var4.d(th2, 15309);
                                return new byte[0];
                            case 4:
                                a71Var4.d(th2, 15309);
                                return new byte[0];
                            case 5:
                                a71Var4.d(th2, 15308);
                                return l31.F();
                            case 6:
                                a71Var4.d(th2, 20310);
                                return new byte[0];
                            case 7:
                                a71Var4.d(th2, 20309);
                                return new byte[0];
                            default:
                                a71Var4.d(th2, 20308);
                                return l31.F();
                        }
                    }
                };
                a31Var4.getClass();
                return new z21(file4, a31Var4.f11819a, new at0(l31VarF2, 7), d81Var2);
            case 7:
                File file5 = (File) this.f20443b.zzb();
                a31 a31Var5 = (a31) this.f20444c.zzb();
                final a71 a71Var5 = (a71) this.f20445d.zzb();
                final int i14 = 1;
                return a31Var5.a(file5, new byte[0], new d81() { // from class: com.google.android.gms.internal.ads.g61
                    @Override // com.google.android.gms.internal.ads.d81
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th2 = (Throwable) obj;
                        switch (i14) {
                            case 0:
                                a71Var5.d(th2, 15308);
                                return l31.F();
                            case 1:
                                a71Var5.d(th2, 15310);
                                return new byte[0];
                            case 2:
                                a71Var5.d(th2, 15310);
                                return new byte[0];
                            case 3:
                                a71Var5.d(th2, 15309);
                                return new byte[0];
                            case 4:
                                a71Var5.d(th2, 15309);
                                return new byte[0];
                            case 5:
                                a71Var5.d(th2, 15308);
                                return l31.F();
                            case 6:
                                a71Var5.d(th2, 20310);
                                return new byte[0];
                            case 7:
                                a71Var5.d(th2, 20309);
                                return new byte[0];
                            default:
                                a71Var5.d(th2, 20308);
                                return l31.F();
                        }
                    }
                });
            case 8:
                File file6 = (File) this.f20443b.zzb();
                a31 a31Var6 = (a31) this.f20444c.zzb();
                final a71 a71Var6 = (a71) this.f20445d.zzb();
                final int i15 = 3;
                return a31Var6.a(file6, new byte[0], new d81() { // from class: com.google.android.gms.internal.ads.g61
                    @Override // com.google.android.gms.internal.ads.d81
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th2 = (Throwable) obj;
                        switch (i15) {
                            case 0:
                                a71Var6.d(th2, 15308);
                                return l31.F();
                            case 1:
                                a71Var6.d(th2, 15310);
                                return new byte[0];
                            case 2:
                                a71Var6.d(th2, 15310);
                                return new byte[0];
                            case 3:
                                a71Var6.d(th2, 15309);
                                return new byte[0];
                            case 4:
                                a71Var6.d(th2, 15309);
                                return new byte[0];
                            case 5:
                                a71Var6.d(th2, 15308);
                                return l31.F();
                            case 6:
                                a71Var6.d(th2, 20310);
                                return new byte[0];
                            case 7:
                                a71Var6.d(th2, 20309);
                                return new byte[0];
                            default:
                                a71Var6.d(th2, 20308);
                                return l31.F();
                        }
                    }
                });
            case 9:
                return new i61((l51) this.f20443b.zzb(), (ExecutorService) this.f20444c.zzb(), (a71) this.f20445d.zzb());
            case 10:
                File file7 = (File) this.f20443b.zzb();
                a31 a31Var7 = (a31) this.f20444c.zzb();
                final a71 a71Var7 = (a71) this.f20445d.zzb();
                l31 l31VarF3 = l31.F();
                final int i16 = 8;
                d81 d81Var3 = new d81() { // from class: com.google.android.gms.internal.ads.g61
                    @Override // com.google.android.gms.internal.ads.d81
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th2 = (Throwable) obj;
                        switch (i16) {
                            case 0:
                                a71Var7.d(th2, 15308);
                                return l31.F();
                            case 1:
                                a71Var7.d(th2, 15310);
                                return new byte[0];
                            case 2:
                                a71Var7.d(th2, 15310);
                                return new byte[0];
                            case 3:
                                a71Var7.d(th2, 15309);
                                return new byte[0];
                            case 4:
                                a71Var7.d(th2, 15309);
                                return new byte[0];
                            case 5:
                                a71Var7.d(th2, 15308);
                                return l31.F();
                            case 6:
                                a71Var7.d(th2, 20310);
                                return new byte[0];
                            case 7:
                                a71Var7.d(th2, 20309);
                                return new byte[0];
                            default:
                                a71Var7.d(th2, 20308);
                                return l31.F();
                        }
                    }
                };
                a31Var7.getClass();
                return new z21(file7, a31Var7.f11819a, new at0(l31VarF3, 7), d81Var3);
            case 11:
                File file8 = (File) this.f20443b.zzb();
                a31 a31Var8 = (a31) this.f20444c.zzb();
                final a71 a71Var8 = (a71) this.f20445d.zzb();
                final int i17 = 6;
                return a31Var8.a(file8, new byte[0], new d81() { // from class: com.google.android.gms.internal.ads.g61
                    @Override // com.google.android.gms.internal.ads.d81
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th2 = (Throwable) obj;
                        switch (i17) {
                            case 0:
                                a71Var8.d(th2, 15308);
                                return l31.F();
                            case 1:
                                a71Var8.d(th2, 15310);
                                return new byte[0];
                            case 2:
                                a71Var8.d(th2, 15310);
                                return new byte[0];
                            case 3:
                                a71Var8.d(th2, 15309);
                                return new byte[0];
                            case 4:
                                a71Var8.d(th2, 15309);
                                return new byte[0];
                            case 5:
                                a71Var8.d(th2, 15308);
                                return l31.F();
                            case 6:
                                a71Var8.d(th2, 20310);
                                return new byte[0];
                            case 7:
                                a71Var8.d(th2, 20309);
                                return new byte[0];
                            default:
                                a71Var8.d(th2, 20308);
                                return l31.F();
                        }
                    }
                });
            default:
                File file9 = (File) this.f20443b.zzb();
                a31 a31Var9 = (a31) this.f20444c.zzb();
                final a71 a71Var9 = (a71) this.f20445d.zzb();
                final int i18 = 7;
                return a31Var9.a(file9, new byte[0], new d81() { // from class: com.google.android.gms.internal.ads.g61
                    @Override // com.google.android.gms.internal.ads.d81
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th2 = (Throwable) obj;
                        switch (i18) {
                            case 0:
                                a71Var9.d(th2, 15308);
                                return l31.F();
                            case 1:
                                a71Var9.d(th2, 15310);
                                return new byte[0];
                            case 2:
                                a71Var9.d(th2, 15310);
                                return new byte[0];
                            case 3:
                                a71Var9.d(th2, 15309);
                                return new byte[0];
                            case 4:
                                a71Var9.d(th2, 15309);
                                return new byte[0];
                            case 5:
                                a71Var9.d(th2, 15308);
                                return l31.F();
                            case 6:
                                a71Var9.d(th2, 20310);
                                return new byte[0];
                            case 7:
                                a71Var9.d(th2, 20309);
                                return new byte[0];
                            default:
                                a71Var9.d(th2, 20308);
                                return l31.F();
                        }
                    }
                });
        }
    }

    public /* synthetic */ tm(fx1 fx1Var, Object obj, kx1 kx1Var, int i10) {
        this.f20442a = i10;
        this.f20443b = fx1Var;
        this.f20444c = (kx1) obj;
        this.f20445d = kx1Var;
    }

    public tm(kx1 kx1Var, kx1 kx1Var2, fx1 fx1Var) {
        this.f20442a = 0;
        this.f20444c = kx1Var;
        this.f20445d = kx1Var2;
        this.f20443b = fx1Var;
    }
}
