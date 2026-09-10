package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2381Ea implements InterfaceC4230oZ {
    public static final VS b = VS.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");
    public static final VS c = new VS("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, VS.e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4391qK f3027a;

    public C2381Ea(C4391qK c4391qK) {
        this.f3027a = c4391qK;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4230oZ
    public final int n(YS ys) {
        return 2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3473fr
    public final boolean w(Object obj, File file, YS ys) throws Throwable {
        boolean z;
        Bitmap bitmap = (Bitmap) ((InterfaceC3616hZ) obj).get();
        VS vs = c;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) ys.c(vs);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = AbstractC4653tJ.f5029a;
        SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) ys.c(b)).intValue();
        OutputStream c2408Fb = null;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                C4391qK c4391qK = this.f3027a;
                if (c4391qK != null) {
                    try {
                        c2408Fb = new C2408Fb(fileOutputStream, c4391qK);
                    } catch (IOException unused) {
                        c2408Fb = fileOutputStream;
                        if (c2408Fb != null) {
                            try {
                                c2408Fb.close();
                            } catch (IOException unused2) {
                            }
                        }
                        z = false;
                    } catch (Throwable th) {
                        th = th;
                        c2408Fb = fileOutputStream;
                        if (c2408Fb != null) {
                            try {
                                c2408Fb.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } else {
                    c2408Fb = fileOutputStream;
                }
                bitmap.compress(compressFormat, iIntValue, c2408Fb);
                c2408Fb.close();
                try {
                    c2408Fb.close();
                } catch (IOException unused4) {
                }
                z = true;
            } catch (IOException unused5) {
            } catch (Throwable th2) {
                th = th2;
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Objects.toString(compressFormat);
                Tg0.c(bitmap);
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(ys.c(vs));
                bitmap.hasAlpha();
            }
            return z;
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
