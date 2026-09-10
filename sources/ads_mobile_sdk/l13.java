package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l13 {
    public final xb2 a;
    public j71 b;
    public le2 c;
    public o6 d;

    public l13(xb2 publisherRequestTraceMeta, j71 internalRequestTraceMeta, le2 renderTraceMeta, o6 adTraceMeta) {
        Intrinsics.checkNotNullParameter(publisherRequestTraceMeta, "publisherRequestTraceMeta");
        Intrinsics.checkNotNullParameter(internalRequestTraceMeta, "internalRequestTraceMeta");
        Intrinsics.checkNotNullParameter(renderTraceMeta, "renderTraceMeta");
        Intrinsics.checkNotNullParameter(adTraceMeta, "adTraceMeta");
        this.a = publisherRequestTraceMeta;
        this.b = internalRequestTraceMeta;
        this.c = renderTraceMeta;
        this.d = adTraceMeta;
    }

    public final void a(l13 traceMetaSet) {
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        j71 j71Var = traceMetaSet.b;
        j71 j71Var2 = this.b;
        j71Var2.b = j71Var.b;
        j71Var2.a = j71Var.a;
        j71Var2.e = j71Var.e;
        j71Var2.d = j71Var.d;
        j71Var2.c = j71Var.c;
        le2 le2Var = traceMetaSet.c;
        le2 le2Var2 = this.c;
        le2Var2.b = le2Var.b;
        le2Var2.d = le2Var.d;
        le2Var2.e = le2Var.e;
        le2Var2.a = le2Var.a;
        le2Var2.c = le2Var.c;
        le2Var2.f = le2Var.f;
        o6 o6Var = traceMetaSet.d;
        o6 o6Var2 = this.d;
        o6Var2.b = o6Var.b;
        o6Var2.c = o6Var.c;
        o6Var2.a = o6Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l13)) {
            return false;
        }
        l13 l13Var = (l13) obj;
        return Intrinsics.wireman(this.a, l13Var.a) && Intrinsics.wireman(this.b, l13Var.b) && Intrinsics.wireman(this.c, l13Var.c) && Intrinsics.wireman(this.d, l13Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TraceMetaSet(publisherRequestTraceMeta=" + this.a + ", internalRequestTraceMeta=" + this.b + ", renderTraceMeta=" + this.c + ", adTraceMeta=" + this.d + ")";
    }
}
