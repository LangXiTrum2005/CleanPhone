package ads_mobile_sdk;

import android.content.Context;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.taiyuan;
import saneness.eyepiece;
import saneness.lampshade;

/* JADX INFO: loaded from: classes.dex */
public final class a02 {
    public final jk0 a;
    public final Context b;
    public final taiyuan c;
    public final taiyuan d;
    public final taiyuan e;

    public a02(Context context, jk0 flags) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = flags;
        this.b = context;
        this.c = p002kotlin.saneness.saneness(new yz1(this));
        this.d = p002kotlin.saneness.saneness(new zz1(this));
        this.e = p002kotlin.saneness.saneness(new xz1(this));
    }

    public final void a() {
        try {
            Object value = this.c.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            d02 d02Var = (d02) ((lampshade) value);
            d02Var.getClass();
            synchronized (d02.class) {
                d02Var.f.a(d02Var.c);
                d02Var.f.a(d02Var.a);
            }
        } catch (Exception e) {
            y13.a("Exception while clearing PAIDV1", e, 4);
        }
    }

    public final void b() {
        try {
            Object value = this.d.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            f02 f02Var = (f02) ((eyepiece) value);
            f02Var.getClass();
            synchronized (f02.class) {
                try {
                    lr0 lr0Var = f02Var.f;
                    if (lr0Var.b.contains(f02Var.a)) {
                        f02Var.f.a(f02Var.c);
                        f02Var.f.a(f02Var.a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e) {
            y13.a("Exception while clearing PAIDV2", e, 4);
        }
    }
}
