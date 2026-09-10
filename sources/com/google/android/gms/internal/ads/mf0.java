package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbl;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class mf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzbl f17423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p9.a f17424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f17425c;

    public mf0(zzbl zzblVar, p9.a aVar, k00 k00Var) {
        this.f17423a = zzblVar;
        this.f17424b = aVar;
        this.f17425c = k00Var;
    }

    public final Bitmap a(byte[] bArr, double d10, boolean z10) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d10 * 160.0d);
        if (!z10) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) zzba.zzc().a(am.f12210j7)).booleanValue()) {
            options.inJustDecodeBounds = true;
            b(bArr, options);
            options.inJustDecodeBounds = false;
            int i10 = options.outWidth * options.outHeight;
            if (i10 > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i10 - 1) / ((Integer) zzba.zzc().a(am.f12226k7)).intValue())) / 2);
            }
        }
        return b(bArr, options);
    }

    public final Bitmap b(byte[] bArr, BitmapFactory.Options options) {
        ((p9.b) this.f17424b).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        if (bitmapDecodeByteArray != null) {
            long j10 = jElapsedRealtime2 - jElapsedRealtime;
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            int allocationByteCount = bitmapDecodeByteArray.getAllocationByteCount();
            boolean z10 = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + String.valueOf(width).length() + 20 + String.valueOf(height).length() + 8 + String.valueOf(allocationByteCount).length() + 7 + 15 + String.valueOf(z10).length());
            l1.d.p(sb2, "Decoded image w: ", width, " h:", height);
            sb2.append(" bytes: ");
            sb2.append(allocationByteCount);
            sb2.append(" time: ");
            sb2.append(j10);
            sb2.append(" on ui thread: ");
            sb2.append(z10);
            zze.zza(sb2.toString());
        }
        return bitmapDecodeByteArray;
    }
}
