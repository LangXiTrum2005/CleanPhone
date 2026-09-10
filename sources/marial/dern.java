package marial;

import android.content.Context;
import android.content.Intent;
import com.ironsource.X3;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ActivityResultContracts.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lmarial/dern;", "Lmarial/attabal;", "", "", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "wireman", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "", X3.f.f, "intent", "beachfront", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "Lmarial/attabal$attabal;", "marial", "(Landroid/content/Context;Ljava/lang/String;)Lmarial/attabal$attabal;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class dern extends attabal<String, Boolean> {
    @Override // marial.attabal
    /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
    public Boolean dern(int resultCode, Intent intent) {
        if (intent == null || resultCode != -1) {
            return Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z = false;
        if (intArrayExtra != null) {
            for (int i : intArrayExtra) {
                if (i == 0) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // marial.attabal
    /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
    public attabal.C0727attabal<Boolean> saneness(Context context, String input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        if (picketboat.saneness.checkSelfPermission(context, input) == 0) {
            return new attabal.C0727attabal<>(Boolean.TRUE);
        }
        return null;
    }

    @Override // marial.attabal
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public Intent attabal(Context context, String input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return saneness.INSTANCE.attabal(new String[]{input});
    }
}
