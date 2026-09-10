package j$.time.format;

import com.p004ironsource.d9;
import java.util.ArrayList;

/* JADX INFO: renamed from: j$.time.format.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3554e implements InterfaceC3555f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3555f[] f43092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f43093b;

    C3554e(ArrayList arrayList, boolean z2) {
        this((InterfaceC3555f[]) arrayList.toArray(new InterfaceC3555f[arrayList.size()]), z2);
    }

    C3554e(InterfaceC3555f[] interfaceC3555fArr, boolean z2) {
        this.f43092a = interfaceC3555fArr;
        this.f43093b = z2;
    }

    public final C3554e a() {
        return !this.f43093b ? this : new C3554e(this.f43092a, false);
    }

    @Override // j$.time.format.InterfaceC3555f
    public final boolean p(z zVar, StringBuilder sb) {
        int length = sb.length();
        boolean z2 = this.f43093b;
        if (z2) {
            zVar.g();
        }
        try {
            for (InterfaceC3555f interfaceC3555f : this.f43092a) {
                if (!interfaceC3555f.p(zVar, sb)) {
                    sb.setLength(length);
                    if (z2) {
                        return true;
                    }
                    return true;
                }
            }
            return true;
        } finally {
            if (z2) {
                zVar.a();
            }
        }
    }

    @Override // j$.time.format.InterfaceC3555f
    public final int r(w wVar, CharSequence charSequence, int i2) {
        boolean z2 = this.f43093b;
        InterfaceC3555f[] interfaceC3555fArr = this.f43092a;
        if (z2) {
            wVar.r();
            int iR = i2;
            for (InterfaceC3555f interfaceC3555f : interfaceC3555fArr) {
                iR = interfaceC3555f.r(wVar, charSequence, iR);
                if (iR < 0) {
                    wVar.f(false);
                    return i2;
                }
            }
            wVar.f(true);
            return iR;
        }
        for (InterfaceC3555f interfaceC3555f2 : interfaceC3555fArr) {
            i2 = interfaceC3555f2.r(wVar, charSequence, i2);
            if (i2 < 0) {
                return i2;
            }
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        InterfaceC3555f[] interfaceC3555fArr = this.f43092a;
        if (interfaceC3555fArr != null) {
            boolean z2 = this.f43093b;
            sb.append(z2 ? d9.i.d : "(");
            for (InterfaceC3555f interfaceC3555f : interfaceC3555fArr) {
                sb.append(interfaceC3555f);
            }
            sb.append(z2 ? d9.i.f24752e : ")");
        }
        return sb.toString();
    }
}
