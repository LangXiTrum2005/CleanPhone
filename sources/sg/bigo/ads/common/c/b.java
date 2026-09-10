package sg.bigo.ads.common.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f47119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RenderScript f47120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ScriptIntrinsicBlur f47121c;
    private Allocation d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Allocation f47122e;

    public b(Context context) {
        this.f47119a = context;
    }

    private boolean b() {
        return (this.f47120b == null || this.f47121c == null) ? false : true;
    }

    @Override // sg.bigo.ads.common.c.a
    public final void a() {
        ScriptIntrinsicBlur scriptIntrinsicBlur = this.f47121c;
        if (scriptIntrinsicBlur != null) {
            scriptIntrinsicBlur.destroy();
            this.f47121c = null;
        }
        RenderScript renderScript = this.f47120b;
        if (renderScript != null) {
            renderScript.destroy();
            this.f47120b = null;
        }
        Allocation allocation = this.d;
        if (allocation != null) {
            allocation.destroy();
            this.d = null;
        }
        Allocation allocation2 = this.f47122e;
        if (allocation2 != null) {
            allocation2.destroy();
            this.f47122e = null;
        }
    }

    @Override // sg.bigo.ads.common.c.a
    public final void a(Bitmap bitmap, Bitmap bitmap2) {
        if (b()) {
            if (this.d == null) {
                this.d = Allocation.createFromBitmap(this.f47120b, bitmap);
            }
            if (this.f47122e == null) {
                this.f47122e = Allocation.createFromBitmap(this.f47120b, bitmap2);
            }
            this.d.copyFrom(bitmap);
            this.f47121c.setInput(this.d);
            this.f47121c.forEach(this.f47122e);
            this.f47122e.copyTo(bitmap2);
        }
    }

    public final boolean a(float f) {
        if (!b()) {
            try {
                RenderScript renderScriptCreate = RenderScript.create(this.f47119a);
                this.f47120b = renderScriptCreate;
                this.f47121c = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            } catch (Exception unused) {
                a();
                return false;
            }
        }
        this.f47121c.setRadius(f);
        return true;
    }

    @Override // sg.bigo.ads.common.c.a
    public final boolean a(Bitmap bitmap, float f) {
        if (!a(f)) {
            return false;
        }
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(this.f47120b, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
        this.d = allocationCreateFromBitmap;
        this.f47122e = Allocation.createTyped(this.f47120b, allocationCreateFromBitmap.getType());
        return true;
    }
}
