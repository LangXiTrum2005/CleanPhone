package i9;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import k9.c0;
import k9.q0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m extends com.google.android.gms.internal.auth.c implements q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42947b;

    public m(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 5);
        c0.b(bArr.length == 25);
        this.f42947b = Arrays.hashCode(bArr);
    }

    public static byte[] y1(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        s9.a aVarZzd;
        if (obj instanceof q0) {
            try {
                q0 q0Var = (q0) obj;
                if (q0Var.zze() == this.f42947b && (aVarZzd = q0Var.zzd()) != null) {
                    return Arrays.equals(x1(), (byte[]) s9.b.y1(aVarZzd));
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f42947b;
    }

    @Override // com.google.android.gms.internal.auth.c
    public final boolean v1(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            s9.a aVarZzd = zzd();
            parcel2.writeNoException();
            z9.g.b(parcel2, aVarZzd);
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f42947b);
        return true;
    }

    public abstract byte[] x1();

    @Override // k9.q0
    public final s9.a zzd() {
        return new s9.b(x1());
    }

    @Override // k9.q0
    public final int zze() {
        return this.f42947b;
    }
}
