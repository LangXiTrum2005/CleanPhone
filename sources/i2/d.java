package i2;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements na.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f42748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f42749b;

    public /* synthetic */ d(p pVar, i iVar) {
        this.f42748a = pVar;
        this.f42749b = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x006b A[FALL_THROUGH] */
    @Override // na.i
    public final boolean apply(Object obj) {
        Boolean bool;
        k kVar;
        k kVar2;
        i1.p pVar = (i1.p) obj;
        p pVar2 = this.f42748a;
        pVar2.getClass();
        if (this.f42749b.A && ((bool = pVar2.f42826j) == null || !bool.booleanValue())) {
            int i10 = pVar.F;
            if (i10 != -1 && i10 > 2) {
                String str = pVar.f42643n;
                if (str != null) {
                    switch (str) {
                        case "audio/eac3-joc":
                        case "audio/ac3":
                        case "audio/ac4":
                        case "audio/eac3":
                            if (Build.VERSION.SDK_INT >= 32 && (kVar2 = pVar2.f42824h) != null && kVar2.f42784b) {
                            }
                        default:
                            if (Build.VERSION.SDK_INT >= 32) {
                                break;
                            }
                            return false;
                    }
                } else if (Build.VERSION.SDK_INT >= 32 || (kVar = pVar2.f42824h) == null || !kVar.f42784b || !kVar.b() || !pVar2.f42824h.c() || !pVar2.f42824h.a(pVar2.f42825i, pVar)) {
                    return false;
                }
            }
        }
        return true;
    }
}
