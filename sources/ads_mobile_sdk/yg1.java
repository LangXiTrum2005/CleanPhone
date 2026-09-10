package ads_mobile_sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import java.util.Map;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.hemolysin;
import saneness.imari;

/* JADX INFO: loaded from: classes.dex */
public final class yg1 implements hemolysin {
    public final Context a;
    public final x b;
    public final ag1 c;
    public final String d;
    public final saran e;
    public final qc0 f;

    public yg1(Context context, x activityTracker, ag1 dispatcher, String afmaVersion, saran uiScope, qc0 deviceProperties) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(deviceProperties, "deviceProperties");
        this.a = context;
        this.b = activityTracker;
        this.c = dispatcher;
        this.d = afmaVersion;
        this.e = uiScope;
        this.f = deviceProperties;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0195  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        wg1 wg1Var;
        yg1 yg1Var;
        yg1 yg1Var2;
        gq0 gq0Var2;
        yg1 yg1Var3;
        gq0 gq0Var3;
        gq0 gq0Var4 = gq0Var;
        if (dernVar instanceof wg1) {
            wg1Var = (wg1) dernVar;
            int i = wg1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                wg1Var.e = i - Integer.MIN_VALUE;
            } else {
                wg1Var = new wg1(this, dernVar);
            }
        } else {
            wg1Var = new wg1(this, dernVar);
        }
        Object obj = wg1Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = wg1Var.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            wg1Var.a = this;
            wg1Var.b = gq0Var4;
            wg1Var.e = 1;
            cutely.wireman(this.e, null, null, new vg1(this, gq0Var4, null), 3, null);
            if (Unit.f29295attabal != objBeachfront) {
                yg1Var = this;
            }
            return objBeachfront;
        }
        if (i2 == 1) {
            gq0Var4 = wg1Var.b;
            yg1 yg1Var4 = wg1Var.a;
            p002kotlin.dern.saneness(obj);
            yg1Var = yg1Var4;
        } else {
            if (i2 == 2) {
                gq0 gq0Var5 = wg1Var.b;
                yg1 yg1Var5 = wg1Var.a;
                p002kotlin.dern.saneness(obj);
                gq0Var2 = gq0Var5;
                yg1Var2 = yg1Var5;
                wg1Var.a = yg1Var2;
                wg1Var.b = gq0Var2;
                wg1Var.e = 3;
                qc0 qc0Var = yg1Var2.f;
                qc0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:"));
                boolean zA = qc0Var.a(intent);
                qc0 qc0Var2 = yg1Var2.f;
                qc0Var2.getClass();
                Intent intent2 = new Intent("android.intent.action.DIAL");
                intent2.setData(Uri.parse("tel:"));
                boolean zA2 = qc0Var2.a(intent2);
                qc0 qc0Var3 = yg1Var2.f;
                qc0Var3.getClass();
                Intent type = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event");
                Intrinsics.checkNotNullExpressionValue(type, "setType(...)");
                cutely.wireman(yg1Var2.e, null, null, new ug1(yg1Var2, gq0Var2, zA, zA2, qc0Var3.a(type), yg1Var2.f.c(), null), 3, null);
                if (Unit.f29295attabal != objBeachfront) {
                    yg1Var3 = yg1Var2;
                    gq0Var3 = gq0Var2;
                }
                return objBeachfront;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gq0Var3 = wg1Var.b;
            yg1Var3 = wg1Var.a;
            p002kotlin.dern.saneness(obj);
        }
        cutely.wireman(yg1Var3.e, null, null, new xg1(yg1Var3, gq0Var3, null), 3, null);
        return Unit.f29295attabal;
        gq0 gq0Var6 = gq0Var4;
        wg1Var.a = yg1Var;
        wg1Var.b = gq0Var6;
        wg1Var.e = 2;
        yg1Var.getClass();
        int[] iArr = new int[2];
        gq0Var6.getLocationOnScreen(iArr);
        Activity activityB = yg1Var.b.b();
        int iIntValue = activityB != null ? ((Number) imari.wireman(activityB).getFirst()).intValue() : 0;
        int i3 = iArr[0];
        int i4 = iArr[1] - iIntValue;
        Context context = yg1Var.a;
        int width = gq0Var6.getWidth();
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        Integer numWireman = igo.attabal.wireman(pastie.dern.wireman(width / displayMetrics.density));
        Context context2 = yg1Var.a;
        int height = gq0Var6.getHeight();
        Intrinsics.checkNotNullParameter(context2, "<this>");
        Intrinsics.checkNotNullParameter(context2, "<this>");
        DisplayMetrics displayMetrics2 = context2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "getDisplayMetrics(...)");
        Pair pair = new Pair(numWireman, igo.attabal.wireman(pastie.dern.wireman(height / displayMetrics2.density)));
        cutely.wireman(yg1Var.e, null, null, new tg1(yg1Var, gq0Var6, i3, i4, ((Number) pair.component1()).intValue(), ((Number) pair.component2()).intValue(), null), 3, null);
        if (Unit.f29295attabal != objBeachfront) {
            yg1Var2 = yg1Var;
            gq0Var2 = gq0Var6;
            wg1Var.a = yg1Var2;
            wg1Var.b = gq0Var2;
            wg1Var.e = 3;
            qc0 qc0Var4 = yg1Var2.f;
            qc0Var4.getClass();
            Intent intent3 = new Intent("android.intent.action.VIEW");
            intent3.setData(Uri.parse("sms:"));
            boolean zA3 = qc0Var4.a(intent3);
            qc0 qc0Var5 = yg1Var2.f;
            qc0Var5.getClass();
            Intent intent4 = new Intent("android.intent.action.DIAL");
            intent4.setData(Uri.parse("tel:"));
            boolean zA4 = qc0Var5.a(intent4);
            qc0 qc0Var6 = yg1Var2.f;
            qc0Var6.getClass();
            Intent type2 = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event");
            Intrinsics.checkNotNullExpressionValue(type2, "setType(...)");
            cutely.wireman(yg1Var2.e, null, null, new ug1(yg1Var2, gq0Var2, zA3, zA4, qc0Var6.a(type2), yg1Var2.f.c(), null), 3, null);
            if (Unit.f29295attabal != objBeachfront) {
                yg1Var3 = yg1Var2;
                gq0Var3 = gq0Var2;
                cutely.wireman(yg1Var3.e, null, null, new xg1(yg1Var3, gq0Var3, null), 3, null);
                return Unit.f29295attabal;
            }
        }
        return objBeachfront;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_MRAID_LOADED;
    }
}
