package com.mbridge.msdk.foundation.feedback;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.dialog.MBFeedBackDialog;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import wi.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f33673d = -2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f33674e = -2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile boolean f33675f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RelativeLayout.LayoutParams f33676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, com.mbridge.msdk.foundation.feedback.bean.a> f33677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f33678c;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.feedback.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class C0122b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f33679a = new b();
    }

    public static b b() {
        return C0122b.f33679a;
    }

    private com.mbridge.msdk.foundation.feedback.bean.a c(String str) {
        if (TextUtils.isEmpty(str)) {
            str = c.n().b();
        }
        if (this.f33677b.containsKey(str)) {
            return this.f33677b.get(str);
        }
        return null;
    }

    public void a(String str, Context context, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams, com.mbridge.msdk.foundation.feedback.a aVar) {
        if (a()) {
            com.mbridge.msdk.foundation.feedback.bean.a aVarB = b(str);
            if (aVar != null) {
                aVarB.a(new com.mbridge.msdk.foundation.feedback.bean.a.g(str, aVar));
            }
            FeedBackButton feedBackButtonI = aVarB.i();
            if (feedBackButtonI != null) {
                if (layoutParams == null) {
                    int iC = f2.c(10.0f);
                    this.f33676a.setMargins(iC, iC, iC, iC);
                    layoutParams = this.f33676a;
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

    public void d(String str) {
        try {
            com.mbridge.msdk.foundation.feedback.bean.a aVarC = c(str);
            if (aVarC != null) {
                aVarC.f();
            }
            this.f33677b.remove(str);
            f33675f = false;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private b() {
        this.f33676a = new RelativeLayout.LayoutParams(f33674e, f33673d);
        this.f33677b = new ConcurrentHashMap<>();
    }

    public com.mbridge.msdk.foundation.feedback.bean.a b(String str) {
        com.mbridge.msdk.foundation.feedback.bean.a aVar;
        if (TextUtils.isEmpty(str)) {
            str = c.n().b();
        }
        if (this.f33677b.containsKey(str)) {
            aVar = this.f33677b.get(str);
        } else {
            aVar = new com.mbridge.msdk.foundation.feedback.bean.a(str);
            this.f33677b.put(str, aVar);
        }
        if (aVar != null) {
            return aVar;
        }
        com.mbridge.msdk.foundation.feedback.bean.a aVar2 = new com.mbridge.msdk.foundation.feedback.bean.a(str);
        this.f33677b.put(str, aVar2);
        return aVar2;
    }

    public void b(String str, int i10) {
        b(str).c(i10);
    }

    public boolean a() {
        g gVarI = f2.i(i.b());
        this.f33678c = gVarI;
        if (gVarI != null) {
            return false;
        }
        this.f33678c = i.b().a();
        return false;
    }

    public Activity a(Context context) {
        Activity activity;
        Context contextF = c.n().f();
        Activity activity2 = null;
        try {
            Activity activity3 = contextF instanceof Activity ? (Activity) contextF : null;
            try {
                if ((context instanceof Activity) && !((Activity) context).isDestroyed()) {
                    activity3 = (Activity) context;
                }
                WeakReference<Activity> weakReferenceA = c.n().a();
                if (weakReferenceA != null && (activity = weakReferenceA.get()) != null && !activity.isFinishing() && !activity.isDestroyed()) {
                    activity3 = activity;
                }
                if (activity3 == null || activity3.isFinishing() || activity3.isDestroyed()) {
                    return null;
                }
                return activity3;
            } catch (Exception e10) {
                activity2 = activity3;
                e = e10;
                e.printStackTrace();
                return activity2;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public void a(String str, int i10, ViewGroup viewGroup) {
        com.mbridge.msdk.foundation.feedback.bean.a aVarB = b(str);
        if (aVarB.i() != null) {
            aVarB.d(i10);
            if (i10 == 0) {
                a(str, c.n().d(), viewGroup, (ViewGroup.LayoutParams) null, (com.mbridge.msdk.foundation.feedback.a) null);
            }
        }
    }

    public void a(String str, int i10, int i11, int i12, float f10, float f11, float f12, String str2, String str3, float f13, JSONArray jSONArray) {
        com.mbridge.msdk.foundation.feedback.bean.a aVarB = b(str);
        Context contextD = c.n().d();
        aVarB.a(v0.a(contextD, f10), v0.a(contextD, f11), v0.a(contextD, i10), v0.a(contextD, i11), v0.a(contextD, i12), f12, str2, str3, f13, jSONArray);
    }

    public void a(String str, int i10, com.mbridge.msdk.foundation.feedback.a aVar) {
        com.mbridge.msdk.foundation.feedback.bean.a aVarB = b(str);
        aVarB.a(new com.mbridge.msdk.foundation.feedback.bean.a.g(str, aVar));
        if (i10 == 1) {
            aVarB.g();
        } else {
            aVarB.p();
        }
    }

    public FeedBackButton a(String str) {
        return b(str).i();
    }

    public void a(String str, int i10, int i11, String str2, String str3) {
        com.mbridge.msdk.foundation.feedback.bean.a aVarC = c(d.h(str, "_1"));
        if (aVarC == null) {
            aVarC = c(d.h(str, "_2"));
            if (aVarC == null && (aVarC = c(d.h(str, "_3"))) == null && (aVarC = c(d.h(str, "_4"))) == null) {
                aVarC = b(str);
            } else {
                aVarC.c(0);
            }
        }
        if (aVarC != null) {
            CampaignEx campaignExH = aVarC.h();
            j.a(campaignExH, campaignExH != null ? campaignExH.getCampaignUnitId() : "", aVarC.k(), aVarC.j(), !TextUtils.isEmpty(str2) ? str2 : "", i10, campaignExH != null ? campaignExH.getAdType() : 0, i11, str3);
        }
    }

    public void a(String str, CampaignEx campaignEx) {
        b(str).a(campaignEx);
    }

    public void a(String str, String str2) {
        b(str).b(str2);
    }

    public void a(String str, FeedBackButton feedBackButton) {
        b(str).a(feedBackButton);
    }

    public void a(String str, com.mbridge.msdk.foundation.feedback.a aVar) {
        com.mbridge.msdk.foundation.feedback.bean.a aVarB = b(str);
        if (aVar != null) {
            aVarB.a(new com.mbridge.msdk.foundation.feedback.bean.a.g(str, aVar));
        }
    }

    public void a(String str, int i10) {
        b(str).b(i10);
    }

    public boolean a(String str, Context context, MBFeedBackDialog mBFeedBackDialog) {
        if (mBFeedBackDialog == null) {
            q0.c("", "mbAlertDialog  is null");
            return false;
        }
        return a(context, mBFeedBackDialog);
    }

    private boolean a(Context context, MBFeedBackDialog mBFeedBackDialog) {
        Activity activityA = a(context);
        if (activityA == null || mBFeedBackDialog == null || activityA.isDestroyed()) {
            return false;
        }
        try {
            if (!mBFeedBackDialog.isShowing() && !activityA.isFinishing()) {
                mBFeedBackDialog.show();
                return true;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return false;
    }
}
