package k6;

import android.content.res.Resources;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements com.bumptech.glide.load.data.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources.Theme f44342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f44343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f44344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f44346e;

    public e(Resources.Theme theme, Resources resources, f fVar, int i10) {
        this.f44342a = theme;
        this.f44343b = resources;
        this.f44344c = fVar;
        this.f44345d = i10;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return this.f44344c.a();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        Object obj = this.f44346e;
        if (obj != null) {
            try {
                this.f44344c.e(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final int c() {
        return 1;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void d(com.bumptech.glide.f fVar, com.bumptech.glide.load.data.d dVar) {
        try {
            Object objB = this.f44344c.b(this.f44342a, this.f44343b, this.f44345d);
            this.f44346e = objB;
            dVar.z0(objB);
        } catch (Resources.NotFoundException e10) {
            dVar.h(e10);
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }
}
