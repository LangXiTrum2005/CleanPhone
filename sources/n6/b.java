package n6;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.dm0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements e6.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e6.h f46566b = e6.h.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e6.h f46567c = new e6.h("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, e6.h.f39143e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dm0 f46568a;

    public b(dm0 dm0Var) {
        this.f46568a = dm0Var;
    }

    @Override // e6.b
    public final boolean d(Object obj, File file, e6.i iVar) throws Throwable {
        boolean z10;
        Bitmap bitmap = (Bitmap) ((g6.a0) obj).get();
        e6.h hVar = f46567c;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) iVar.c(hVar);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i10 = a7.j.f3432b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) iVar.c(f46566b)).intValue();
        OutputStream cVar = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    dm0 dm0Var = this.f46568a;
                    if (dm0Var != null) {
                        try {
                            cVar = new com.bumptech.glide.load.data.c(fileOutputStream, dm0Var);
                        } catch (IOException e10) {
                            e = e10;
                            cVar = fileOutputStream;
                            if (Log.isLoggable("BitmapEncoder", 3)) {
                                Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                            }
                            if (cVar != null) {
                                try {
                                    cVar.close();
                                } catch (IOException unused) {
                                }
                            }
                            z10 = false;
                        } catch (Throwable th2) {
                            th = th2;
                            cVar = fileOutputStream;
                            if (cVar != null) {
                                try {
                                    cVar.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } else {
                        cVar = fileOutputStream;
                    }
                    bitmap.compress(compressFormat, iIntValue, cVar);
                    cVar.close();
                    try {
                        cVar.close();
                    } catch (IOException unused3) {
                    }
                    z10 = true;
                } catch (IOException e11) {
                    e = e11;
                }
                if (Log.isLoggable("BitmapEncoder", 2)) {
                    Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + a7.p.c(bitmap) + " in " + a7.j.a(jElapsedRealtimeNanos) + ", options format: " + iVar.c(hVar) + ", hasAlpha: " + bitmap.hasAlpha());
                }
                return z10;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    @Override // e6.l
    public final int e(e6.i iVar) {
        return 2;
    }
}
