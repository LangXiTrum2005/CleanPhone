package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.hjq.permissions.Permission;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes.dex */
public final class NW implements InterfaceC3551gl {
    public static final String[] k = {"_data"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3459a;
    public final FP b;
    public final FP c;
    public final Uri d;
    public final int e;
    public final int f;
    public final YS g;
    public final Class h;
    public volatile boolean i;
    public volatile InterfaceC3551gl j;

    public NW(Context context, FP fp, FP fp2, Uri uri, int i, int i2, YS ys, Class cls) {
        this.f3459a = context.getApplicationContext();
        this.b = fp;
        this.c = fp2;
        this.d = uri;
        this.e = i;
        this.f = i2;
        this.g = ys;
        this.h = cls;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final Class a() {
        return this.h;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final void b() {
        InterfaceC3551gl interfaceC3551gl = this.j;
        if (interfaceC3551gl != null) {
            interfaceC3551gl.b();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final void c(IV iv, InterfaceC3463fl interfaceC3463fl) throws Throwable {
        try {
            InterfaceC3551gl interfaceC3551glD = d();
            if (interfaceC3551glD == null) {
                interfaceC3463fl.d(new IllegalArgumentException("Failed to build fetcher for: " + this.d));
            } else {
                this.j = interfaceC3551glD;
                if (this.i) {
                    cancel();
                } else {
                    interfaceC3551glD.c(iv, interfaceC3463fl);
                }
            }
        } catch (FileNotFoundException e) {
            interfaceC3463fl.d(e);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final void cancel() {
        this.i = true;
        InterfaceC3551gl interfaceC3551gl = this.j;
        if (interfaceC3551gl != null) {
            interfaceC3551gl.cancel();
        }
    }

    public final InterfaceC3551gl d() throws Throwable {
        EP epB;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.f3459a;
        YS ys = this.g;
        int i = this.f;
        int i2 = this.e;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.d;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, k, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            epB = this.b.b(file, i2, i, ys);
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            Uri requireOriginal = this.d;
            boolean zG = AbstractC2340Cl.G(requireOriginal);
            FP fp = this.c;
            if (zG && requireOriginal.getPathSegments().contains("picker")) {
                epB = fp.b(requireOriginal, i2, i, ys);
            } else {
                if (context.checkSelfPermission(Permission.ACCESS_MEDIA_LOCATION) == 0) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                epB = fp.b(requireOriginal, i2, i, ys);
            }
        }
        if (epB != null) {
            return epB.c;
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final EnumC4516rl e() {
        return EnumC4516rl.f4942a;
    }
}
