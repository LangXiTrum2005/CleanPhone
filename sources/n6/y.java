package n6;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements g6.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f46621b;

    public /* synthetic */ y(Object obj, int i10) {
        this.f46620a = i10;
        this.f46621b = obj;
    }

    @Override // g6.a0
    public final void b() {
        switch (this.f46620a) {
            case 2:
                AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) this.f46621b;
                animatedImageDrawable.stop();
                animatedImageDrawable.clearAnimationCallbacks();
                break;
        }
    }

    @Override // g6.a0
    public final Class c() {
        switch (this.f46620a) {
            case 0:
                return Bitmap.class;
            case 1:
                return byte[].class;
            case 2:
                return Drawable.class;
            default:
                return ((File) this.f46621b).getClass();
        }
    }

    @Override // g6.a0
    public final Object get() {
        switch (this.f46620a) {
            case 0:
                return (Bitmap) this.f46621b;
            case 1:
                return (byte[]) this.f46621b;
            case 2:
                return (AnimatedImageDrawable) this.f46621b;
            default:
                return (File) this.f46621b;
        }
    }

    @Override // g6.a0
    public final int getSize() {
        switch (this.f46620a) {
            case 0:
                return a7.p.c((Bitmap) this.f46621b);
            case 1:
                return ((byte[]) this.f46621b).length;
            case 2:
                AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) this.f46621b;
                return a7.p.d(Bitmap.Config.ARGB_8888) * animatedImageDrawable.getIntrinsicHeight() * animatedImageDrawable.getIntrinsicWidth() * 2;
            default:
                return 1;
        }
    }

    public y(byte[] bArr) {
        this.f46620a = 1;
        a7.h.c(bArr, "Argument must not be null");
        this.f46621b = bArr;
    }

    public y(File file) {
        this.f46620a = 3;
        a7.h.c(file, "Argument must not be null");
        this.f46621b = file;
    }

    private final void a() {
    }

    private final void d() {
    }

    private final void e() {
    }
}
