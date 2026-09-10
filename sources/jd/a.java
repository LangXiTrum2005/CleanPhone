package jd;

import android.os.Parcel;
import android.os.Parcelable;
import dd.p;
import dd.s;
import f9.d;
import java.util.List;
import java.util.concurrent.TimeUnit;
import md.h;
import nd.j0;
import nd.k0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new d(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f43817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f43818c;

    public a(String str, jj.d dVar) {
        this.f43818c = false;
        this.f43816a = str;
        this.f43817b = new h();
    }

    public static k0[] b(List list) {
        if (list.isEmpty()) {
            return null;
        }
        k0[] k0VarArr = new k0[list.size()];
        k0 k0VarA = ((a) list.get(0)).a();
        boolean z10 = false;
        for (int i10 = 1; i10 < list.size(); i10++) {
            k0 k0VarA2 = ((a) list.get(i10)).a();
            if (z10 || !((a) list.get(i10)).f43818c) {
                k0VarArr[i10] = k0VarA2;
            } else {
                k0VarArr[0] = k0VarA2;
                k0VarArr[i10] = k0VarA;
                z10 = true;
            }
        }
        if (!z10) {
            k0VarArr[0] = k0VarA;
        }
        return k0VarArr;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:25:0x009a  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d0  */
    public static a c(String str) {
        boolean z10;
        s sVar;
        md.d dVar;
        md.d dVarB;
        double dDoubleValue;
        a aVar = new a(str.replace("-", ""), new jj.d(23));
        dd.a aVarE = dd.a.e();
        if (aVarE.o()) {
            double dRandom = Math.random();
            synchronized (s.class) {
                try {
                    if (s.f38826a == null) {
                        s.f38826a = new s();
                    }
                    sVar = s.f38826a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            md.d dVarI = aVarE.i(sVar);
            if (dVarI.b()) {
                dDoubleValue = ((Double) dVarI.a()).doubleValue() / 100.0d;
                if (!dd.a.p(dDoubleValue)) {
                    dVar = aVarE.f38806a.getDouble("fpr_vc_session_sampling_rate");
                    if (dVar.b() || !dd.a.p(((Double) dVar.a()).doubleValue())) {
                        dVarB = aVarE.b(sVar);
                        if (!dVarB.b() && dd.a.p(((Double) dVarB.a()).doubleValue())) {
                            dDoubleValue = ((Double) dVarB.a()).doubleValue();
                        } else if (aVarE.f38806a.isLastFetchFailed()) {
                            dDoubleValue = 1.0E-5d;
                        } else {
                            dDoubleValue = 0.01d;
                        }
                    } else {
                        aVarE.f38808c.e("com.google.firebase.perf.SessionSamplingRate", ((Double) dVar.a()).doubleValue());
                        dDoubleValue = ((Double) dVar.a()).doubleValue();
                    }
                }
            } else {
                dVar = aVarE.f38806a.getDouble("fpr_vc_session_sampling_rate");
                if (dVar.b()) {
                    dVarB = aVarE.b(sVar);
                    if (!dVarB.b()) {
                        if (aVarE.f38806a.isLastFetchFailed()) {
                            dDoubleValue = 1.0E-5d;
                        } else {
                            dDoubleValue = 0.01d;
                        }
                    } else if (aVarE.f38806a.isLastFetchFailed()) {
                        dDoubleValue = 1.0E-5d;
                    } else {
                        dDoubleValue = 0.01d;
                    }
                } else {
                    dVarB = aVarE.b(sVar);
                    if (!dVarB.b()) {
                        if (aVarE.f38806a.isLastFetchFailed()) {
                            dDoubleValue = 1.0E-5d;
                        } else {
                            dDoubleValue = 0.01d;
                        }
                    } else if (aVarE.f38806a.isLastFetchFailed()) {
                        dDoubleValue = 1.0E-5d;
                    } else {
                        dDoubleValue = 0.01d;
                    }
                }
            }
            if (dRandom < dDoubleValue) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        aVar.f43818c = z10;
        return aVar;
    }

    public final k0 a() {
        j0 j0VarL = k0.l();
        j0VarL.j(this.f43816a);
        if (this.f43818c) {
            j0VarL.i();
        }
        return (k0) j0VarL.build();
    }

    public final boolean d() {
        p pVar;
        long jLongValue;
        long minutes = TimeUnit.MICROSECONDS.toMinutes(this.f43817b.b());
        dd.a aVarE = dd.a.e();
        aVarE.getClass();
        synchronized (p.class) {
            try {
                if (p.f38823a == null) {
                    p.f38823a = new p();
                }
                pVar = p.f38823a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        md.d dVarJ = aVarE.j(pVar);
        if (!dVarJ.b() || ((Long) dVarJ.a()).longValue() <= 0) {
            md.d dVar = aVarE.f38806a.getLong("fpr_session_max_duration_min");
            if (!dVar.b() || ((Long) dVar.a()).longValue() <= 0) {
                md.d dVarC = aVarE.c(pVar);
                jLongValue = (!dVarC.b() || ((Long) dVarC.a()).longValue() <= 0) ? 240L : ((Long) dVarC.a()).longValue();
            } else {
                aVarE.f38808c.d(((Long) dVar.a()).longValue(), "com.google.firebase.perf.SessionsMaxDurationMinutes");
                jLongValue = ((Long) dVar.a()).longValue();
            }
        } else {
            jLongValue = ((Long) dVarJ.a()).longValue();
        }
        return minutes > jLongValue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f43816a);
        parcel.writeByte(this.f43818c ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f43817b, 0);
    }

    public a(Parcel parcel) {
        this.f43818c = false;
        this.f43816a = parcel.readString();
        this.f43818c = parcel.readByte() != 0;
        this.f43817b = (h) parcel.readParcelable(h.class.getClassLoader());
    }
}
