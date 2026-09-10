package demented;

import android.content.Context;
import canephora.UserAttributesConfig;
import com.blankj.utilcode.util.impromptu;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReferrerInit.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Ldemented/saneness;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcanephora/beachfront;", "userAttributesConfig", "", "saneness", "(Landroid/content/Context;Lcanephora/beachfront;)V", "attabal", "referrerlibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class saneness {
    public static final void dern(Context context, gutturalization.attabal referrerModel) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(referrerModel, "$referrerModel");
        gerenuk.saneness.formularize(context, referrerModel.getAppsflyerKey());
    }

    public final void saneness(final Context context, UserAttributesConfig userAttributesConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        final gutturalization.attabal attabalVarAttabal = bto.saneness.INSTANCE.attabal(context);
        if (attabalVarAttabal.getAppsflyerKey().length() == 0) {
            throw new IllegalStateException("未配置 appsflyerKey");
        }
        if (userAttributesConfig == null) {
            String strAttabal = new bto.attabal().attabal(context, "user_attribute_config.json");
            if (strAttabal.length() > 0) {
                hawkthorn.attabal attabalVar = hawkthorn.attabal.f27589attabal;
                Object objWireman = impromptu.wireman(strAttabal, UserAttributesConfig.class);
                Intrinsics.checkNotNullExpressionValue(objWireman, "fromJson(jsonString, Use…ibutesConfig::class.java)");
                attabalVar.attabal(context, (UserAttributesConfig) objWireman);
            }
        } else {
            hawkthorn.attabal.f27589attabal.attabal(context, userAttributesConfig);
        }
        new Thread(new Runnable() { // from class: demented.attabal
            @Override // java.lang.Runnable
            public final void run() {
                saneness.dern(context, attabalVarAttabal);
            }
        }).start();
    }
}
