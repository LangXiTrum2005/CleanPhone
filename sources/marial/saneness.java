package marial;

import android.content.Context;
import android.content.Intent;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.polder;
import p002kotlin.collections.polloi;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.formularize;

/* JADX INFO: compiled from: ActivityResultContracts.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00162 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00040\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ9\u0010\u000f\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lmarial/saneness;", "Lmarial/attabal;", "", "", "", "", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "wireman", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "Lmarial/attabal$attabal;", "marial", "(Landroid/content/Context;[Ljava/lang/String;)Lmarial/attabal$attabal;", "", X3.f.f, "intent", "beachfront", "(ILandroid/content/Intent;)Ljava/util/Map;", "attabal", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class saneness extends attabal<String[], Map<String, Boolean>> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: marial.saneness$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lmarial/saneness$attabal;", "", "<init>", "()V", "", "", "input", "Landroid/content/Intent;", "attabal", "([Ljava/lang/String;)Landroid/content/Intent;", "ACTION_REQUEST_PERMISSIONS", "Ljava/lang/String;", "EXTRA_PERMISSIONS", "EXTRA_PERMISSION_GRANT_RESULTS", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent attabal(String[] input) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return intentPutExtra;
        }

        public Companion() {
        }
    }

    @Override // marial.attabal
    /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
    public Map<String, Boolean> dern(int resultCode, Intent intent) {
        if (resultCode != -1) {
            return seminary.taiyuan();
        }
        if (intent == null) {
            return seminary.taiyuan();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return seminary.taiyuan();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i == 0));
        }
        return seminary.dovishness(CollectionsKt.fastrack(polloi.saran(stringArrayExtra), arrayList));
    }

    @Override // marial.attabal
    /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
    public attabal.C0727attabal<Map<String, Boolean>> saneness(Context context, String[] input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.length == 0) {
            return new attabal.C0727attabal<>(seminary.taiyuan());
        }
        for (String str : input) {
            if (picketboat.saneness.checkSelfPermission(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(p002kotlin.ranges.wireman.wireman(polder.marial(input.length), 16));
        for (String str2 : input) {
            Pair pairAttabal = formularize.attabal(str2, Boolean.TRUE);
            linkedHashMap.put(pairAttabal.getFirst(), pairAttabal.getSecond());
        }
        return new attabal.C0727attabal<>(linkedHashMap);
    }

    @Override // marial.attabal
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public Intent attabal(Context context, String[] input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return INSTANCE.attabal(input);
    }
}
