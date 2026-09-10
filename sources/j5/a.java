package j5;

import m5.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f43710e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(k5.d dVar, int i10) {
        super(dVar);
        this.f43710e = i10;
    }

    @Override // j5.c
    public final boolean a(i iVar) {
        switch (this.f43710e) {
            case 0:
                return iVar.f45891j.f38677b;
            case 1:
                return iVar.f45891j.f38679d;
            case 2:
                return iVar.f45891j.f38676a == 2;
            case 3:
                int i10 = iVar.f45891j.f38676a;
                return i10 == 3 || i10 == 6;
            default:
                return iVar.f45891j.f38680e;
        }
    }

    @Override // j5.c
    public final boolean b(Object obj) {
        boolean zBooleanValue;
        switch (this.f43710e) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                i5.a aVar = (i5.a) obj;
                return (aVar.f42885a && aVar.f42886b) ? false : true;
            case 3:
                i5.a aVar2 = (i5.a) obj;
                return !aVar2.f42885a || aVar2.f42887c;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }
}
