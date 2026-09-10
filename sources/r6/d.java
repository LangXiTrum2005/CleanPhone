package r6;

import android.content.Context;
import android.graphics.Bitmap;
import e6.m;
import g6.a0;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f49429b;

    public d(m mVar) {
        a7.h.c(mVar, "Argument must not be null");
        this.f49429b = mVar;
    }

    @Override // e6.m
    public final a0 a(Context context, a0 a0Var, int i10, int i11) {
        c cVar = (c) a0Var.get();
        a0 dVar = new n6.d(cVar.f49419a.f49418a.l, com.bumptech.glide.b.a(context).f10458b);
        m mVar = this.f49429b;
        a0 a0VarA = mVar.a(context, dVar, i10, i11);
        if (!dVar.equals(a0VarA)) {
            dVar.b();
        }
        cVar.f49419a.f49418a.c(mVar, (Bitmap) a0VarA.get());
        return a0Var;
    }

    @Override // e6.f
    public final void b(MessageDigest messageDigest) {
        this.f49429b.b(messageDigest);
    }

    @Override // e6.f
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f49429b.equals(((d) obj).f49429b);
        }
        return false;
    }

    @Override // e6.f
    public final int hashCode() {
        return this.f49429b.hashCode();
    }
}
