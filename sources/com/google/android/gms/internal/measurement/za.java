package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class za extends l6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24201a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f24202b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(bb bbVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
        this.f24202b = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.measurement.l6
    public final boolean q(int i10, Parcel parcel, Parcel parcel2) {
        switch (this.f24201a) {
            case 0:
                if (i10 != 2) {
                    return false;
                }
                Status status = (Status) m6.a(parcel, Status.CREATOR);
                byte[] bArrCreateByteArray = parcel.createByteArray();
                m6.d(parcel);
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f24202b;
                if (status.b()) {
                    try {
                        z0 z0Var = z0.f24189a;
                        int i11 = n0.f23760a;
                        com.google.android.gms.internal.play_billing.q1.x(status, yc.w(bArrCreateByteArray, z0.f24190b), taskCompletionSource);
                    } catch (u1 e10) {
                        taskCompletionSource.setException(e10);
                    }
                } else {
                    com.google.android.gms.internal.play_billing.q1.x(status, null, taskCompletionSource);
                }
                return true;
            case 1:
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f24202b;
                switch (i10) {
                    case 1:
                        Status status2 = (Status) m6.a(parcel, Status.CREATOR);
                        m6.d(parcel);
                        com.google.android.gms.internal.play_billing.q1.x(status2, null, taskCompletionSource2);
                        break;
                    case 2:
                        Status status3 = (Status) m6.a(parcel, Status.CREATOR);
                        m6.d(parcel);
                        com.google.android.gms.internal.play_billing.q1.x(status3, null, taskCompletionSource2);
                        break;
                    case 3:
                        Status status4 = (Status) m6.a(parcel, Status.CREATOR);
                        m6.d(parcel);
                        com.google.android.gms.internal.play_billing.q1.x(status4, null, taskCompletionSource2);
                        break;
                    case 4:
                        Status status5 = (Status) m6.a(parcel, Status.CREATOR);
                        sa saVar = (sa) m6.a(parcel, sa.CREATOR);
                        m6.d(parcel);
                        com.google.android.gms.internal.play_billing.q1.x(status5, saVar, taskCompletionSource2);
                        break;
                    case 5:
                        Status status6 = (Status) m6.a(parcel, Status.CREATOR);
                        m6.d(parcel);
                        com.google.android.gms.internal.play_billing.q1.x(status6, null, taskCompletionSource2);
                        break;
                    case 6:
                        Status status7 = (Status) m6.a(parcel, Status.CREATOR);
                        ua uaVar = (ua) m6.a(parcel, ua.CREATOR);
                        m6.d(parcel);
                        com.google.android.gms.internal.play_billing.q1.x(status7, uaVar, taskCompletionSource2);
                        break;
                    case 7:
                        Status status8 = (Status) m6.a(parcel, Status.CREATOR);
                        ta taVar = (ta) m6.a(parcel, ta.CREATOR);
                        m6.d(parcel);
                        com.google.android.gms.internal.play_billing.q1.x(status8, taVar, taskCompletionSource2);
                        break;
                    case 8:
                        Status status9 = (Status) m6.a(parcel, Status.CREATOR);
                        m6.d(parcel);
                        com.google.android.gms.internal.play_billing.q1.x(status9, null, taskCompletionSource2);
                        break;
                    case 9:
                        Status status10 = (Status) m6.a(parcel, Status.CREATOR);
                        va vaVar = (va) m6.a(parcel, va.CREATOR);
                        m6.d(parcel);
                        com.google.android.gms.internal.play_billing.q1.x(status10, vaVar, taskCompletionSource2);
                        break;
                    case 10:
                        Status status11 = (Status) m6.a(parcel, Status.CREATOR);
                        sa saVar2 = (sa) m6.a(parcel, sa.CREATOR);
                        m6.d(parcel);
                        com.google.android.gms.internal.play_billing.q1.x(status11, saVar2, taskCompletionSource2);
                        break;
                    case 11:
                        Status status12 = (Status) m6.a(parcel, Status.CREATOR);
                        parcel.readLong();
                        m6.d(parcel);
                        com.google.android.gms.internal.play_billing.q1.x(status12, null, taskCompletionSource2);
                        break;
                    case 12:
                        Status status13 = (Status) m6.a(parcel, Status.CREATOR);
                        m6.d(parcel);
                        com.google.android.gms.internal.play_billing.q1.x(status13, null, taskCompletionSource2);
                        break;
                    case 13:
                        Status status14 = (Status) m6.a(parcel, Status.CREATOR);
                        xa xaVar = (xa) m6.a(parcel, xa.CREATOR);
                        m6.d(parcel);
                        com.google.android.gms.internal.play_billing.q1.x(status14, xaVar, taskCompletionSource2);
                        break;
                    case 14:
                        Status status15 = (Status) m6.a(parcel, Status.CREATOR);
                        m6.d(parcel);
                        com.google.android.gms.internal.play_billing.q1.x(status15, null, taskCompletionSource2);
                        break;
                    case 15:
                        Status status16 = (Status) m6.a(parcel, Status.CREATOR);
                        m6.d(parcel);
                        com.google.android.gms.internal.play_billing.q1.x(status16, null, taskCompletionSource2);
                        break;
                    case 16:
                        Status status17 = (Status) m6.a(parcel, Status.CREATOR);
                        long j10 = parcel.readLong();
                        m6.d(parcel);
                        com.google.android.gms.internal.play_billing.q1.x(status17, Long.valueOf(j10), taskCompletionSource2);
                        break;
                    default:
                        return false;
                }
                return true;
            default:
                if (i10 != 2) {
                    return false;
                }
                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                m6.d(parcel);
                q6 q6Var = new q6(this, bArrCreateByteArray2);
                i9.i iVar = (i9.i) this.f24202b;
                ((ea.e2) iVar.f42938b).execute(new com.google.android.gms.common.api.internal.i0(iVar, q6Var));
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(bb bbVar, i9.i iVar) {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
        this.f24202b = iVar;
    }

    public za(TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.f24202b = taskCompletionSource;
    }
}
