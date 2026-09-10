package ads_mobile_sdk;

import android.content.Context;
import android.view.ViewGroup;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.bonny;

/* JADX INFO: loaded from: classes.dex */
public final class f93 {
    public final ViewGroup.LayoutParams a;
    public final int b;
    public final ViewGroup c;
    public final Context d;

    public f93(ViewGroup.LayoutParams layoutParams, int i, ViewGroup parent, Context originalContext) {
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(originalContext, "originalContext");
        this.a = layoutParams;
        this.b = i;
        this.c = parent;
        this.d = originalContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f93)) {
            return false;
        }
        f93 f93Var = (f93) obj;
        return Intrinsics.wireman(this.a, f93Var.a) && this.b == f93Var.b && Intrinsics.wireman(this.c, f93Var.c) && Intrinsics.wireman(this.d, f93Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + bonny.attabal(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "WebViewParentLayoutInfo(layoutParams=" + this.a + ", index=" + this.b + ", parent=" + this.c + ", originalContext=" + this.d + ")";
    }
}
