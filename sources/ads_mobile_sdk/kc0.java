package ads_mobile_sdk;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class kc0 extends Lambda implements Function0 {
    public final /* synthetic */ qc0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc0(qc0 qc0Var) {
        super(0);
        this.a = qc0Var;
    }

    @Override // p002kotlin.jvm.functions.Function0
    public final Object invoke() {
        PackageManager packageManager = this.a.c.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
        if (resolveInfoResolveActivity != null) {
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                if (resolveInfoResolveActivity.activityInfo.name.equals(it.next().activityInfo.name)) {
                    return Boolean.valueOf(resolveInfoResolveActivity.activityInfo.packageName.equals(arytenoidectomy.wireman.dern(this.a.c, null)));
                }
            }
        }
        return Boolean.FALSE;
    }
}
