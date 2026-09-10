package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ey1 implements q81, li0, xi0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ey1 f14111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ey1 f14112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ey1 f14113d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14114a;

    static {
        byte b10 = 0;
        f14111b = new ey1(b10, 0);
        f14112c = new ey1(b10, 2);
        f14113d = new ey1(b10, 7);
    }

    public /* synthetic */ ey1(byte b10, int i10) {
        this.f14114a = i10;
    }

    @Override // com.google.android.gms.internal.ads.xi0
    public /* synthetic */ void a(Object obj, z02 z02Var) {
        ((oe) obj).zza();
    }

    @Override // com.google.android.gms.internal.ads.q81
    public /* synthetic */ Object zza() {
        return new by1();
    }

    public /* synthetic */ ey1(float f10) {
        this.f14114a = 8;
    }

    @Override // com.google.android.gms.internal.ads.li0
    /* JADX INFO: renamed from: zza */
    public void mo161zza(Object obj) {
        switch (this.f14114a) {
            case 1:
                ((oe) obj).zzs();
                break;
            case 2:
                break;
            case 3:
                int i10 = ry1.f19707e0;
                ((oe) obj).zze();
                break;
            case 4:
                ((oe) obj).zzg();
                break;
            case 5:
                int i11 = ry1.f19707e0;
                ((oe) obj).zzu();
                break;
            case 6:
                int i12 = ry1.f19707e0;
                ((oe) obj).zzq();
                break;
            case 7:
                int i13 = ry1.f19707e0;
                ((oe) obj).m(new dy1(2, new aa.b("Player release timed out.", 8), 1003));
                break;
            case 8:
                int i14 = ry1.f19707e0;
                ((oe) obj).zzr();
                break;
            case 9:
                int i15 = ry1.f19707e0;
                ((oe) obj).zzc();
                break;
            case 10:
            default:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                break;
            case 27:
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                break;
        }
    }

    public /* synthetic */ ey1(int i10) {
        this.f14114a = 6;
    }

    public /* synthetic */ ey1(int i10, int i11) {
        this.f14114a = 5;
    }

    public /* synthetic */ ey1(f5 f5Var, int i10) {
        this.f14114a = 9;
    }

    public /* synthetic */ ey1(Object obj, int i10) {
        this.f14114a = i10;
    }

    public /* synthetic */ ey1(boolean z10) {
        this.f14114a = 1;
    }
}
