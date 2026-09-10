package m6;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.util.Log;
import android.util.Size;
import e6.h;
import e6.i;
import e6.j;
import n6.l;
import n6.n;
import n6.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ImageDecoder.OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f45904a = s.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e6.a f45907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f45908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f45909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f45910g;

    public b(int i10, int i11, i iVar) {
        this.f45905b = i10;
        this.f45906c = i11;
        this.f45907d = (e6.a) iVar.c(n.f46594f);
        this.f45908e = (l) iVar.c(l.f46592c);
        h hVar = n.f46597i;
        this.f45909f = iVar.c(hVar) != null && ((Boolean) iVar.c(hVar)).booleanValue();
        this.f45910g = (j) iVar.c(n.f46595g);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        s sVar = this.f45904a;
        int width = this.f45905b;
        int height = this.f45906c;
        if (sVar.b(width, height, this.f45909f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f45907d == e6.a.f39138b) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size size = imageInfo.getSize();
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.f45908e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(size.getHeight() * fB);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fB);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        j jVar = this.f45910g;
        if (jVar != null) {
            imageDecoder.setTargetColorSpace(ColorSpace.get((jVar == j.f39149a && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
        }
    }
}
