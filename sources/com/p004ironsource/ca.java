package com.p004ironsource;

import android.content.Context;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/ironsource/ca;", "Lcom/ironsource/uf;", "Landroid/content/Context;", "context", "Lcom/ironsource/y9;", "source", "Lcom/ironsource/ea;", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ca implements uf {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24517a;

        static {
            int[] iArr = new int[y9.values().length];
            try {
                iArr[y9.IADS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y9.UADS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y9.SHARED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[y9.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f24517a = iArr;
        }
    }

    @Override // com.p004ironsource.uf
    public ea a(Context context, y9 source) {
        Intrinsics.f(context, "context");
        Intrinsics.f(source, "source");
        int i2 = a.f24517a[source.ordinal()];
        if (i2 == 1) {
            return new ba(context, "supersonic_shared_preferen");
        }
        if (i2 == 2) {
            return new ba(context, "unityads-installinfo");
        }
        if (i2 == 3) {
            return new ba(context, da.f24764c);
        }
        if (i2 == 4) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
