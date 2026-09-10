package n6;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements e6.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e6.m f46606b;

    public q(e6.m mVar) {
        this.f46606b = mVar;
    }

    @Override // e6.m
    public final g6.a0 a(Context context, g6.a0 a0Var, int i10, int i11) {
        h6.a aVar = com.bumptech.glide.b.a(context).f10458b;
        Drawable drawable = (Drawable) a0Var.get();
        d dVarA = p.a(aVar, drawable, i10, i11);
        if (dVarA == null) {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
        g6.a0 a0VarA = this.f46606b.a(context, dVarA, i10, i11);
        if (!a0VarA.equals(dVarA)) {
            return new d(context.getResources(), a0VarA);
        }
        a0VarA.b();
        return a0Var;
    }

    @Override // e6.f
    public final void b(MessageDigest messageDigest) {
        this.f46606b.b(messageDigest);
    }

    @Override // e6.f
    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f46606b.equals(((q) obj).f46606b);
        }
        return false;
    }

    @Override // e6.f
    public final int hashCode() {
        return this.f46606b.hashCode();
    }
}
