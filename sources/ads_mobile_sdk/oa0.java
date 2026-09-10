package ads_mobile_sdk;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.gson.JsonObject;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.saran;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.concur;

/* JADX INFO: loaded from: classes.dex */
public final class oa0 implements concur {
    public final saran a;
    public final ja0 b;
    public final jk0 c;
    public final String d;
    public final String e;
    public final JsonObject f;
    public final l13 g;
    public PointF h;
    public PointF i;
    public la0 j;
    public final int k;
    public monroe l;

    public oa0(Context context, saran backgroundScope, ja0 debugDialogManager, jk0 flags, String str, String str2, JsonObject jsonObject, l13 traceMetaSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(debugDialogManager, "debugDialogManager");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        this.a = backgroundScope;
        this.b = debugDialogManager;
        this.c = flags;
        this.d = str;
        this.e = str2;
        this.f = jsonObject;
        this.g = traceMetaSet;
        this.h = new PointF(-1.0f, -1.0f);
        this.i = new PointF(-1.0f, -1.0f);
        this.j = la0.NOT_DEBUG_GESTURE;
        this.k = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        if (ads_mobile_sdk.ja0.a(r1, r2, r3, r4, r5, r6) == r0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ads_mobile_sdk.oa0 r7, wretchedly.dern r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof ads_mobile_sdk.na0
            if (r0 == 0) goto L17
            r0 = r8
            ads_mobile_sdk.na0 r0 = (ads_mobile_sdk.na0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.d = r1
        L15:
            r6 = r0
            goto L1d
        L17:
            ads_mobile_sdk.na0 r0 = new ads_mobile_sdk.na0
            r0.<init>(r7, r8)
            goto L15
        L1d:
            java.lang.Object r8 = r6.b
            java.lang.Object r0 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r1 = r6.d
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L3f
            if (r1 == r2) goto L39
            if (r1 != r3) goto L31
            p002kotlin.dern.saneness(r8)
            goto L88
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            ads_mobile_sdk.oa0 r7 = r6.a
            p002kotlin.dern.saneness(r8)
            goto L6a
        L3f:
            p002kotlin.dern.saneness(r8)
            ads_mobile_sdk.jk0 r8 = r7.c
            r8.getClass()
            kotlin.time.saneness$attabal r1 = p002kotlin.time.saneness.INSTANCE
            kotlin.time.DurationUnit r1 = p002kotlin.time.DurationUnit.SECONDS
            java.lang.String r4 = "key"
            java.lang.String r5 = "gads:debug_hold_gesture:time_millis"
            kotlin.time.saneness r1 = saneness.juju.attabal(r3, r1, r5, r4)
            ads_mobile_sdk.tk r4 = ads_mobile_sdk.zk.j
            java.lang.Object r8 = r8.a(r5, r1, r4)
            kotlin.time.saneness r8 = (p002kotlin.time.saneness) r8
            long r4 = r8.getRawValue()
            r6.a = r7
            r6.d = r2
            java.lang.Object r8 = kotlinx.coroutines.splinterproof.saneness(r4, r6)
            if (r8 != r0) goto L6a
            goto L87
        L6a:
            ads_mobile_sdk.la0 r8 = ads_mobile_sdk.la0.COMPLETE
            r7.j = r8
            ads_mobile_sdk.ja0 r1 = r7.b
            java.lang.String r2 = r7.d
            r8 = r3
            java.lang.String r3 = r7.e
            com.google.gson.JsonObject r4 = r7.f
            ads_mobile_sdk.l13 r5 = r7.g
            r7 = 0
            r6.a = r7
            r6.d = r8
            r1.getClass()
            java.lang.Object r7 = ads_mobile_sdk.ja0.a(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L88
        L87:
            return r0
        L88:
            kotlin.Unit r7 = p002kotlin.Unit.f29295attabal
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.oa0.a(ads_mobile_sdk.oa0, wretchedly.dern):java.lang.Object");
    }

    public final boolean a(float f, float f2, float f3, float f4) {
        return Math.abs(this.h.x - f) < ((float) this.k) && Math.abs(this.h.y - f2) < ((float) this.k) && Math.abs(this.i.x - f3) < ((float) this.k) && Math.abs(this.i.y - f4) < ((float) this.k);
    }

    public final void a(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        int historySize = event.getHistorySize();
        int pointerCount = event.getPointerCount();
        if (actionMasked == 0) {
            this.j = la0.START;
            this.h = new PointF(event.getX(), event.getY());
            return;
        }
        la0 la0Var = this.j;
        if (la0Var == la0.NOT_DEBUG_GESTURE) {
            return;
        }
        if (la0Var == la0.START && actionMasked == 5) {
            this.j = la0.HOLDING;
            this.i = new PointF(event.getX(1), event.getY(1));
            saran saranVar = this.a;
            ma0 block = new ma0(this, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            this.l = cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
            return;
        }
        if (la0Var == la0.HOLDING) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z = false;
                for (int i = 0; i < historySize; i++) {
                    if (!a(event.getHistoricalX(0, i), event.getHistoricalY(0, i), event.getHistoricalX(1, i), event.getHistoricalY(1, i))) {
                        z = true;
                        break;
                    }
                }
                if (a(event.getX(), event.getY(), event.getX(1), event.getY(1)) && !z) {
                    return;
                }
            }
            monroe monroeVar = this.l;
            if (monroeVar != null) {
                monroe.attabal.attabal(monroeVar, null, 1, null);
            }
            this.j = la0.NOT_DEBUG_GESTURE;
        }
    }
}
