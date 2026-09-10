package l7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import java.util.HashMap;
import p.o0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45141a;

    public /* synthetic */ h(int i10) {
        this.f45141a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel source) {
        switch (this.f45141a) {
            case 0:
                kotlin.jvm.internal.n.f(source, "source");
                return new i(source);
            case 1:
                kotlin.jvm.internal.n.f(source, "source");
                return new j(source);
            case 2:
                kotlin.jvm.internal.n.f(source, "source");
                return new k(source);
            case 3:
                kotlin.jvm.internal.n.f(source, "parcel");
                return new q(source.readInt(), source.readInt(), source.readInt(), source.readString(), source.readString(), source.readString(), source.readString(), null, null, false);
            case 4:
                kotlin.jvm.internal.n.f(source, "source");
                return new y(source);
            case 5:
                kotlin.jvm.internal.n.f(source, "source");
                return new h0(source);
            case 6:
                return new md.h(source.readLong(), source.readLong());
            case 7:
                o0 o0Var = new o0(source);
                o0Var.f47753a = source.readByte() != 0;
                return o0Var;
            case 8:
                p0.f fVar = new p0.f(source);
                fVar.f47904a = source.readInt();
                return fVar;
            case 9:
                return new ParcelImpl(source);
            case 10:
                kotlin.jvm.internal.n.f(source, "source");
                return new y7.a(source);
            case 11:
                kotlin.jvm.internal.n.f(source, "parcel");
                y7.f fVar2 = new y7.f();
                fVar2.f54230a = source.readString();
                fVar2.f54231b = source.readString();
                fVar2.f54232c = source.readString();
                fVar2.f54233d = source.readLong();
                fVar2.f54234e = source.readLong();
                return fVar2;
            case 12:
                kotlin.jvm.internal.n.f(source, "source");
                return new y7.i(source);
            case 13:
                kotlin.jvm.internal.n.f(source, "source");
                return new y7.k(source);
            case 14:
                kotlin.jvm.internal.n.f(source, "source");
                return new y7.l(source);
            case 15:
                kotlin.jvm.internal.n.f(source, "source");
                return new y7.m(source);
            case 16:
                kotlin.jvm.internal.n.f(source, "source");
                y7.p pVar = new y7.p();
                pVar.f54295b = -1;
                Parcelable[] parcelableArray = source.readParcelableArray(y7.t.class.getClassLoader());
                if (parcelableArray == null) {
                    parcelableArray = new Parcelable[0];
                }
                ArrayList arrayList = new ArrayList();
                int length = parcelableArray.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        pVar.f54294a = (y7.t[]) arrayList.toArray(new y7.t[0]);
                        pVar.f54295b = source.readInt();
                        pVar.f54300g = (y7.n) source.readParcelable(y7.n.class.getClassLoader());
                        HashMap mapG = q7.e0.G(source);
                        pVar.f54301h = mapG != null ? xj.b0.Y(mapG) : null;
                        HashMap mapG2 = q7.e0.G(source);
                        pVar.f54302i = mapG2 != null ? xj.b0.Y(mapG2) : null;
                        return pVar;
                    }
                    Parcelable parcelable = parcelableArray[i10];
                    y7.t tVar = parcelable instanceof y7.t ? (y7.t) parcelable : null;
                    if (tVar != null) {
                        tVar.f54315b = pVar;
                    }
                    if (tVar != null) {
                        arrayList.add(tVar);
                    }
                    i10++;
                }
                break;
            case 17:
                kotlin.jvm.internal.n.f(source, "source");
                return new y7.n(source);
            case 18:
                kotlin.jvm.internal.n.f(source, "source");
                return new y7.o(source);
            case 19:
                kotlin.jvm.internal.n.f(source, "source");
                return new y7.x(source);
            default:
                int iO0 = qk.i0.o0(source);
                Bundle bundleN = null;
                while (source.dataPosition() < iO0) {
                    int i11 = source.readInt();
                    if (((char) i11) != 2) {
                        qk.i0.l0(source, i11);
                    } else {
                        bundleN = qk.i0.n(source, i11);
                    }
                }
                qk.i0.D(source, iO0);
                return new zc.t(bundleN);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f45141a) {
            case 0:
                return new i[i10];
            case 1:
                return new j[i10];
            case 2:
                return new k[i10];
            case 3:
                return new q[i10];
            case 4:
                return new y[i10];
            case 5:
                return new h0[i10];
            case 6:
                return new md.h[i10];
            case 7:
                return new o0[i10];
            case 8:
                return new p0.f[i10];
            case 9:
                return new ParcelImpl[i10];
            case 10:
                return new y7.a[i10];
            case 11:
                return new y7.f[i10];
            case 12:
                return new y7.i[i10];
            case 13:
                return new y7.k[i10];
            case 14:
                return new y7.l[i10];
            case 15:
                return new y7.m[i10];
            case 16:
                return new y7.p[i10];
            case 17:
                return new y7.n[i10];
            case 18:
                return new y7.o[i10];
            case 19:
                return new y7.x[i10];
            default:
                return new zc.t[i10];
        }
    }
}
