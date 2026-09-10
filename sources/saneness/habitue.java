package saneness;

import ads_mobile_sdk.e0;
import ads_mobile_sdk.f0;
import ads_mobile_sdk.ff0;
import ads_mobile_sdk.g0;
import ads_mobile_sdk.h0;
import ads_mobile_sdk.i0;
import ads_mobile_sdk.j0;
import ads_mobile_sdk.k0;
import ads_mobile_sdk.l0;
import ads_mobile_sdk.x13;
import com.ironsource.X3;
import java.util.Map;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class habitue extends ff0 implements nestlike {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public habitue(kotlinx.coroutines.saran uiScope, Map listeners) {
        super(uiScope, listeners);
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(listeners, "listeners");
    }

    @Override // saneness.nestlike
    public final void a() {
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            kotlinx.coroutines.saran saranVar = this.a;
            k0 block = new k0("onStop", str, value, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlinx.coroutines.cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
    }

    @Override // saneness.nestlike
    public final void b() {
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            kotlinx.coroutines.saran saranVar = this.a;
            j0 block = new j0("onStart", str, value, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlinx.coroutines.cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
    }

    @Override // saneness.nestlike
    public final void c() {
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            kotlinx.coroutines.saran saranVar = this.a;
            l0 block = new l0("onUserLeaveHint", str, value, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlinx.coroutines.cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
    }

    @Override // saneness.nestlike
    public final void d() {
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            kotlinx.coroutines.saran saranVar = this.a;
            h0 block = new h0("onRestart", str, value, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlinx.coroutines.cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
    }

    @Override // saneness.nestlike
    public final void e() {
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            kotlinx.coroutines.saran saranVar = this.a;
            e0 block = new e0("onCreate", str, value, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlinx.coroutines.cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
    }

    @Override // saneness.nestlike
    public final void onDestroy() {
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            kotlinx.coroutines.saran saranVar = this.a;
            f0 block = new f0("onDestroy", str, value, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlinx.coroutines.cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
    }

    @Override // saneness.nestlike
    public final void onPause() {
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            kotlinx.coroutines.saran saranVar = this.a;
            g0 block = new g0(X3.i.t0, str, value, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlinx.coroutines.cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
    }

    @Override // saneness.nestlike
    public final void onResume() {
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            kotlinx.coroutines.saran saranVar = this.a;
            i0 block = new i0(X3.i.u0, str, value, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlinx.coroutines.cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
    }
}
