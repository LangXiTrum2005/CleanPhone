package a7;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.lang.reflect.Array;
import java.util.List;
import l1.q;
import l1.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements h3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3417d;

    public b(Context context) {
        this.f3414a = 3;
        this.f3416c = 0;
        this.f3417d = context;
    }

    @Override // h3.a
    public int a() {
        return this.f3415b;
    }

    public byte b(int i10, int i11) {
        return ((byte[][]) this.f3417d)[i11][i10];
    }

    public void c(int i10, int i11, int i12) {
        ((byte[][]) this.f3417d)[i11][i10] = (byte) i12;
    }

    public void d(int i10, int i11, boolean z10) {
        ((byte[][]) this.f3417d)[i11][i10] = z10 ? (byte) 1 : (byte) 0;
    }

    public synchronized int e() {
        int i10 = this.f3416c;
        if (i10 != 0) {
            return i10;
        }
        Context context = (Context) this.f3417d;
        PackageManager packageManager = context.getPackageManager();
        if (r9.c.a(context).f40681b.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers != null && !listQueryBroadcastReceivers.isEmpty()) {
            this.f3416c = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        this.f3416c = 2;
        return 2;
    }

    public synchronized int f() {
        PackageInfo packageInfoF;
        if (this.f3415b == 0) {
            try {
                packageInfoF = r9.c.a((Context) this.f3417d).f(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("Metadata", "Failed to find package ".concat(e10.toString()));
                packageInfoF = null;
            }
            if (packageInfoF != null) {
                this.f3415b = packageInfoF.versionCode;
            }
        }
        return this.f3415b;
    }

    @Override // h3.a
    public int getSampleCount() {
        return this.f3416c;
    }

    @Override // h3.a
    public int readNextSampleSize() {
        int i10 = this.f3415b;
        return i10 == -1 ? ((q) this.f3417d).D() : i10;
    }

    public String toString() {
        switch (this.f3414a) {
            case 5:
                int i10 = this.f3415b;
                int i11 = this.f3416c;
                StringBuilder sb2 = new StringBuilder((i10 * 2 * i11) + 2);
                for (int i12 = 0; i12 < i11; i12++) {
                    byte[] bArr = ((byte[][]) this.f3417d)[i12];
                    for (int i13 = 0; i13 < i10; i13++) {
                        byte b10 = bArr[i13];
                        if (b10 == 0) {
                            sb2.append(" 0");
                        } else if (b10 != 1) {
                            sb2.append("  ");
                        } else {
                            sb2.append(" 1");
                        }
                    }
                    sb2.append('\n');
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public b(byte[] bArr, int i10, int i11) {
        this.f3414a = 0;
        this.f3417d = bArr;
        this.f3415b = i10;
        this.f3416c = i11;
    }

    public b() {
        this.f3414a = 1;
        this.f3417d = new b[NotificationCompat.FLAG_LOCAL_ONLY];
        this.f3415b = 0;
        this.f3416c = 0;
    }

    public b(int i10, int i11, int i12) {
        this.f3414a = i12;
        switch (i12) {
            case 5:
                this.f3417d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11, i10);
                this.f3415b = i10;
                this.f3416c = i11;
                break;
            default:
                this.f3417d = null;
                this.f3415b = i10;
                int i13 = i11 & 7;
                this.f3416c = i13 == 0 ? 8 : i13;
                break;
        }
    }

    public b(int i10, int i11, SparseArray sparseArray) {
        this.f3414a = 4;
        this.f3415b = i10;
        this.f3416c = i11;
        this.f3417d = sparseArray;
    }

    public b(m1.d dVar, i1.p pVar) {
        this.f3414a = 2;
        q qVar = dVar.f45776c;
        this.f3417d = qVar;
        qVar.M(12);
        int iD = qVar.D();
        if (MimeTypes.AUDIO_RAW.equals(pVar.f42643n)) {
            int iT = y.t(pVar.H) * pVar.F;
            if (iD % iT != 0) {
                l1.a.s("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iT + ", stsz sample size: " + iD);
                iD = iT;
            }
        }
        this.f3415b = iD == 0 ? -1 : iD;
        this.f3416c = qVar.D();
    }
}
