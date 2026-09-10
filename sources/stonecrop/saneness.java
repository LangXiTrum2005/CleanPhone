package stonecrop;

import com.codejoy.boom.clap.data.bean.FcmDataNotification;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NotifyActionEvent.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lstonecrop/saneness;", "", "<init>", "()V", "", "action", "entrance", "", "attabal", "(Ljava/lang/String;Ljava/lang/String;)V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final saneness f38162attabal = new saneness();

    public final void attabal(String action, String entrance) {
        int i;
        Intrinsics.checkNotNullParameter(action, "action");
        int iHashCode = action.hashCode();
        if (iHashCode != -1469830126) {
            if (iHashCode != 1135979299) {
                if (iHashCode != 1151289338 || !action.equals("21a_recall_show_notify")) {
                    return;
                } else {
                    i = 1;
                }
            } else if (!action.equals("21c_recall_close_notify")) {
                return;
            } else {
                i = 3;
            }
        } else if (!action.equals("21b_recall_click_notify")) {
            return;
        } else {
            i = 2;
        }
        int i2 = i;
        com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("RecallNotify", "触发召回埋点：action=" + action + "，entrance=" + (entrance == null ? "" : entrance));
        wireman.saneness(wireman.f38163attabal, action, null, null, entrance, null, 22, null);
        dern.f38161attabal.saneness(i2, new FcmDataNotification(null, null, null, null, "recall_notify", null, null, null, null, null, null, null, entrance == null ? "" : entrance, 4079, null));
    }
}
