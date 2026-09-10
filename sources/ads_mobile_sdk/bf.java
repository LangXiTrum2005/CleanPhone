package ads_mobile_sdk;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.polloi;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.laky;

/* JADX INFO: loaded from: classes.dex */
public final class bf extends hv2 {
    public final Context d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(Context context) {
        super(no0.CUI_NAME_SDKINIT_INIT_APP_PERMISSIONS);
        Intrinsics.checkNotNullParameter(context, "context");
        this.d = context;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.APP_PERMISSIONS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        ?? Formularize;
        List listUnconsolidated;
        laky lakyVar = ip0.f;
        Context context = this.d;
        Intrinsics.checkNotNullParameter(context, "<this>");
        String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
        if (strArr == null || (listUnconsolidated = polloi.unconsolidated(strArr)) == null) {
            Formularize = adultoid.formularize();
        } else {
            Formularize = new ArrayList();
            for (Object obj : listUnconsolidated) {
                String str = (String) obj;
                laky lakyVar2 = ip0.f;
                Intrinsics.beachfront(str);
                if (laky.competently(context, str)) {
                    Formularize.add(obj);
                }
            }
        }
        return new tn0(new af(Formularize));
    }
}
