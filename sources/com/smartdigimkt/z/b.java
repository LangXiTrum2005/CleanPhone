package com.smartdigimkt.z;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.smartdigimkt.expressad.widget.FeedBackButton;
import com.smartdigimkt.h3.c;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.x.d;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class b {
    public static int d = -2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f40278e = -2;
    public static volatile boolean f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, com.smartdigimkt.a0.a> f40279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RelativeLayout.LayoutParams f40280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.smartdigimkt.n1.a f40281c;

    /* JADX INFO: renamed from: com.smartdigimkt.z.b$b, reason: collision with other inner class name */
    public static class C0647b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f40282a = new b();
    }

    public static b b() {
        return C0647b.f40282a;
    }

    private com.smartdigimkt.a0.a c(String str) {
        if (TextUtils.isEmpty(str)) {
            str = com.smartdigimkt.u.a.f().a();
        }
        if (this.f40279a.containsKey(str)) {
            return this.f40279a.get(str);
        }
        return null;
    }

    public Activity a(Context context) {
        Context contextE = com.smartdigimkt.u.a.f().e();
        Activity activity = null;
        try {
            Activity activity2 = contextE instanceof Activity ? (Activity) contextE : null;
            try {
                if ((context instanceof Activity) && !((Activity) context).isDestroyed()) {
                    activity2 = (Activity) context;
                }
                if (activity2 == null || activity2.isFinishing() || activity2.isDestroyed()) {
                    return null;
                }
                return activity2;
            } catch (Exception e2) {
                e = e2;
                activity = activity2;
                e.printStackTrace();
                return activity;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public void d(String str) {
        try {
            com.smartdigimkt.a0.a aVarC = c(str);
            if (aVarC != null) {
                aVarC.f();
            }
            this.f40279a.remove(str);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private b() {
        this.f40279a = new ConcurrentHashMap<>();
        this.f40280b = new RelativeLayout.LayoutParams(d, f40278e);
    }

    public void b(String str, int i2) {
        b(str).b(i2);
    }

    public com.smartdigimkt.a0.a b(String str) {
        com.smartdigimkt.a0.a aVar;
        if (TextUtils.isEmpty(str)) {
            str = com.smartdigimkt.u.a.f().a();
        }
        if (!this.f40279a.containsKey(str)) {
            aVar = new com.smartdigimkt.a0.a(str);
            this.f40279a.put(str, aVar);
        } else {
            aVar = this.f40279a.get(str);
        }
        if (aVar != null) {
            return aVar;
        }
        com.smartdigimkt.a0.a aVar2 = new com.smartdigimkt.a0.a(str);
        this.f40279a.put(str, aVar2);
        return aVar2;
    }

    private boolean a(Context context, c cVar) {
        Activity activityA = a(context);
        if (activityA == null || cVar == null || activityA.isDestroyed()) {
            return false;
        }
        try {
            if (!cVar.isShowing() && !activityA.isFinishing()) {
                cVar.show();
                return true;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return false;
    }

    public boolean a(String str, Context context, c cVar) {
        if (cVar == null) {
            return false;
        }
        return a(context, cVar);
    }

    public void a(String str, int i2, ViewGroup viewGroup) {
        com.smartdigimkt.a0.a aVarB = b(str);
        if (aVarB.i() != null) {
            aVarB.c(i2);
            if (i2 == 0) {
                a(str, com.smartdigimkt.m6.b.p().k(), viewGroup, null, null);
            }
        }
    }

    public void a(String str, int i2, int i3, int i4, float f2, float f3, float f4, String str2, String str3, ViewGroup viewGroup) {
        com.smartdigimkt.a0.a aVarB = b(str);
        Context contextK = com.smartdigimkt.m6.b.p().k();
        aVarB.a(v.a(contextK, f2), v.a(contextK, f3), v.a(contextK, i2), v.a(contextK, i3), v.a(contextK, i4), f4, str2, str3);
    }

    public void a(String str, Context context, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        a(str, context, viewGroup, layoutParams, null);
    }

    public boolean a() {
        com.smartdigimkt.n1.a aVarA = com.smartdigimkt.n1.b.b().a();
        this.f40281c = aVarA;
        return aVarA.M() != 0;
    }

    public void a(String str, com.smartdigimkt.z.a aVar) {
        com.smartdigimkt.a0.a aVarB = b(str);
        if (aVar != null) {
            aVarB.a(new com.smartdigimkt.a0.a.f(str, aVar));
        }
    }

    public void a(String str, Context context, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams, com.smartdigimkt.z.a aVar) {
        if (a()) {
            com.smartdigimkt.a0.a aVarB = b(str);
            if (aVar != null) {
                aVarB.a(new com.smartdigimkt.a0.a.f(str, aVar));
            }
            FeedBackButton feedBackButtonI = aVarB.i();
            if (feedBackButtonI != null) {
                if (layoutParams == null) {
                    int iA = v.a(com.smartdigimkt.m6.b.p().k(), 10.0f);
                    this.f40280b.setMargins(iA, iA, iA, iA);
                    layoutParams = this.f40280b;
                }
                ViewGroup viewGroup2 = (ViewGroup) feedBackButtonI.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(feedBackButtonI);
                }
                Activity activityA = a(context);
                if (activityA != null && viewGroup == null) {
                    viewGroup = (ViewGroup) activityA.findViewById(R.id.content);
                }
                if (viewGroup != null) {
                    viewGroup.removeView(feedBackButtonI);
                    viewGroup.addView(feedBackButtonI, layoutParams);
                }
            }
        }
    }

    public void a(String str, int i2, com.smartdigimkt.z.a aVar) {
        com.smartdigimkt.a0.a aVarB = b(str);
        aVarB.a(new com.smartdigimkt.a0.a.f(str, aVar));
        if (i2 == 1) {
            aVarB.g();
        } else {
            aVarB.p();
        }
    }

    public void a(String str, d dVar) {
        b(str).a(dVar);
    }

    public void a(String str, int i2) {
        b(str).a(i2);
    }

    public void a(String str, FeedBackButton feedBackButton) {
        b(str).a(feedBackButton);
    }

    public FeedBackButton a(String str) {
        return b(str).i();
    }

    public void a(String str, int i2, int i3, String str2) {
        b(str).h();
    }
}
