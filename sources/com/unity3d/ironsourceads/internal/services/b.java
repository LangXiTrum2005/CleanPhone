package com.unity3d.ironsourceads.internal.services;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C0407j9;
import com.ironsource.C0474n4;
import com.ironsource.C0654x5;
import com.ironsource.EnumC0443l9;
import com.ironsource.EnumC0672y5;
import com.ironsource.InterfaceC0344g;
import com.ironsource.InterfaceC0362h;
import com.ironsource.Kb;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.k;
import defpackage.e;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.n;
import org.json.JSONException;
import org.json.JSONObject;
import wj.f;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements com.unity3d.ironsourceads.internal.services.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0344g f38463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0362h f38464b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38465a;

        static {
            int[] iArr = new int[EnumC0443l9.values().length];
            try {
                iArr[EnumC0443l9.DIRECT_INTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0443l9.APP_ACTIVITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f38465a = iArr;
        }
    }

    public b(InterfaceC0344g actionIntentFactory, InterfaceC0362h activityIntentFactory) {
        n.f(actionIntentFactory, "actionIntentFactory");
        n.f(activityIntentFactory, "activityIntentFactory");
        this.f38463a = actionIntentFactory;
        this.f38464b = activityIntentFactory;
    }

    private final com.unity3d.ironsourceads.internal.services.a.AbstractC0221a b(Activity activity, Intent intent) {
        activity.startActivityForResult(intent, 794006778);
        a(this, EnumC0672y5.INLINE_STORE_LAUNCHED, EnumC0443l9.DIRECT_INTENT, null, 4, null);
        return com.unity3d.ironsourceads.internal.services.a.AbstractC0221a.b.f38462a;
    }

    @Override // com.unity3d.ironsourceads.internal.services.a
    public com.unity3d.ironsourceads.internal.services.a.AbstractC0221a a(Context context, C0407j9 request) {
        b bVar;
        n.f(context, "context");
        n.f(request, "request");
        try {
            bVar = this;
            try {
                a(bVar, EnumC0672y5.INLINE_STORE_REQUESTED, request.g(), null, 4, null);
                if (TextUtils.isEmpty(request.h())) {
                    bVar.a(EnumC0672y5.INLINE_STORE_FAILED, request.g(), b0.R(new f("reason", "storeUrl is empty")));
                    return new com.unity3d.ironsourceads.internal.services.a.AbstractC0221a.C0222a("storeUrl is empty");
                }
                if (!(context instanceof Activity)) {
                    bVar.a(EnumC0672y5.INLINE_STORE_FAILED, request.g(), b0.R(new f("reason", "context is not an Activity")));
                    return new com.unity3d.ironsourceads.internal.services.a.AbstractC0221a.C0222a("context is not an Activity");
                }
                Intent intentA = bVar.a(request);
                if (!bVar.a(context, intentA)) {
                    bVar.a(EnumC0672y5.INLINE_STORE_FAILED, request.g(), b0.R(new f("reason", "Failed to resolve for packageManager")));
                    return new com.unity3d.ironsourceads.internal.services.a.AbstractC0221a.C0222a("Failed to resolve for packageManager");
                }
                int i10 = a.f38465a[request.g().ordinal()];
                if (i10 == 1) {
                    return bVar.b((Activity) context, intentA);
                }
                if (i10 == 2) {
                    return bVar.a((Activity) context, intentA);
                }
                throw new aa.b((byte) 0, 20);
            } catch (Exception e10) {
                e = e10;
                Exception exc = e;
                C0474n4.d().a(exc);
                String strN = e.n("Failed to open inline store: ", exc.getMessage());
                IronLog.INTERNAL.error(exc.toString());
                bVar.a(EnumC0672y5.INLINE_STORE_FAILED, request.g(), b0.R(new f("reason", strN)));
                return new com.unity3d.ironsourceads.internal.services.a.AbstractC0221a.C0222a(strN);
            }
        } catch (Exception e11) {
            e = e11;
            bVar = this;
        }
    }

    public b() {
        this(new k.a(), new k.b());
    }

    private final Intent a(C0407j9 c0407j9) throws JSONException {
        Intent intentA = this.f38463a.a();
        intentA.setPackage(c0407j9.f());
        intentA.setData(Uri.parse(c0407j9.h()));
        JSONObject jSONObjectE = c0407j9.e();
        if (jSONObjectE != null) {
            Iterator<String> itKeys = jSONObjectE.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObjectE.get(next);
                if (obj instanceof String) {
                    intentA.putExtra(next, (String) obj);
                } else if (obj instanceof Boolean) {
                    intentA.putExtra(next, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Integer) {
                    intentA.putExtra(next, ((Number) obj).intValue());
                } else if (obj instanceof Long) {
                    intentA.putExtra(next, ((Number) obj).longValue());
                } else if (obj instanceof Float) {
                    intentA.putExtra(next, ((Number) obj).floatValue());
                } else if (obj instanceof Double) {
                    intentA.putExtra(next, ((Number) obj).doubleValue());
                } else {
                    intentA.putExtra(next, obj.toString());
                }
            }
        }
        return intentA;
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    private final boolean a(Context context, Intent intent) {
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    private final com.unity3d.ironsourceads.internal.services.a.AbstractC0221a a(Activity activity, Intent intent) {
        activity.startActivity(new InlineStoreActivity.b(this.f38464b).a(intent).a(activity));
        a(this, EnumC0672y5.INLINE_STORE_ACTIVITY_LAUNCHED, EnumC0443l9.APP_ACTIVITY, null, 4, null);
        return com.unity3d.ironsourceads.internal.services.a.AbstractC0221a.b.f38462a;
    }

    @Override // com.unity3d.ironsourceads.internal.services.a
    public com.unity3d.ironsourceads.internal.services.a.AbstractC0221a a(Context context, EnumC0443l9 strategy) {
        Intent intent;
        n.f(context, "context");
        n.f(strategy, "strategy");
        try {
            a(this, EnumC0672y5.INLINE_STORE_DESTROY_REQUESTED, strategy, null, 4, null);
            if (!(context instanceof Activity)) {
                a(EnumC0672y5.INLINE_STORE_DESTROY_FAILED, strategy, b0.R(new f("reason", "context is not an Activity")));
                return new com.unity3d.ironsourceads.internal.services.a.AbstractC0221a.C0222a("context is not an Activity");
            }
            int i10 = a.f38465a[strategy.ordinal()];
            if (i10 == 1) {
                intent = new Intent(context, (Class<?>) ControllerActivity.class);
            } else if (i10 == 2) {
                intent = new Intent(context, (Class<?>) InlineStoreActivity.class);
            } else {
                throw new aa.b((byte) 0, 20);
            }
            intent.addFlags(603979776);
            intent.putExtra("destroy_inline_store", true);
            context.startActivity(intent);
            a(this, EnumC0672y5.INLINE_STORE_DESTROY_LAUNCHED, strategy, null, 4, null);
            return com.unity3d.ironsourceads.internal.services.a.AbstractC0221a.b.f38462a;
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            String strN = e.n("Failed to destroy inline store: ", e10.getMessage());
            IronLog.INTERNAL.error(e10.toString());
            a(EnumC0672y5.INLINE_STORE_DESTROY_FAILED, strategy, b0.R(new f("reason", strN)));
            return new com.unity3d.ironsourceads.internal.services.a.AbstractC0221a.C0222a(strN);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(b bVar, EnumC0672y5 enumC0672y5, EnumC0443l9 enumC0443l9, Map map, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            map = new LinkedHashMap();
        }
        bVar.a(enumC0672y5, enumC0443l9, map);
    }

    private final void a(EnumC0672y5 enumC0672y5, EnumC0443l9 enumC0443l9, Map<String, Object> map) {
        try {
            map.put(IronSourceConstants.EVENTS_EXT1, "strategy:" + enumC0443l9.b());
            Kb.f26413u.d().q().a(new C0654x5(enumC0672y5, new JSONObject(b0.X(map))));
        } catch (Exception e10) {
            C0474n4.d().a(e10);
        }
    }
}
