package stonecrop;

import com.appsflyer.AppsFlyerLib;
import com.codejoy.boom.clap.BoomClapApplication;
import java.util.LinkedHashMap;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UserActionEvent.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lstonecrop/wireman;", "", "<init>", "()V", "", "action", "category", "label", "entrance", "value", "", "attabal", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "label1", "label2", "dern", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final wireman f38163attabal = new wireman();

    public static /* synthetic */ void saneness(wireman wiremanVar, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            str5 = null;
        }
        wiremanVar.attabal(str, str2, str3, str4, str5);
    }

    public final void attabal(String action, String category, String label, String entrance, String value) {
        Intrinsics.checkNotNullParameter(action, "action");
        try {
            Result.Companion companion = Result.INSTANCE;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("e_action", action);
            if (category != null) {
                linkedHashMap.put("e_category", category);
            }
            if (label != null) {
                linkedHashMap.put("e_label", label);
            }
            if (entrance != null) {
                linkedHashMap.put("e_entrance", entrance);
            }
            if (value != null) {
                linkedHashMap.put("e_value", value);
            }
            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("user_action_event", "eventParams: " + linkedHashMap);
            AppsFlyerLib.getInstance().logEvent(BoomClapApplication.INSTANCE.attabal(), "user_action_event", linkedHashMap);
            Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
    }

    public final void dern(String action, String label1, String label2) {
        Intrinsics.checkNotNullParameter(action, "action");
        try {
            Result.Companion companion = Result.INSTANCE;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("e_action", action);
            if (label1 != null) {
                linkedHashMap.put("e_label1", label1);
            }
            if (label2 != null) {
                linkedHashMap.put("e_label2", label2);
            }
            AppsFlyerLib.getInstance().logEvent(BoomClapApplication.INSTANCE.attabal(), "user_action_event", linkedHashMap);
            Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
    }
}
