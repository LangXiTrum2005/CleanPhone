package androidx.activity.result;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0005*\u0001\u0001\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "androidx/activity/result/ActivityResultCallerLauncher$resultContract$2$1", "I", "O", "invoke", "()Landroidx/activity/result/ActivityResultCallerLauncher$resultContract$2$1;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class ActivityResultCallerLauncher$resultContract$2 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: androidx.activity.result.ActivityResultCallerLauncher$resultContract$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003"}, d2 = {"androidx/activity/result/ActivityResultCallerLauncher$resultContract$2$1", "Landroidx/activity/result/contract/ActivityResultContract;", "", "activity-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class AnonymousClass1 extends ActivityResultContract<Unit, Object> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent a(Context context, Object obj) {
            throw null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object c(int i2, Intent intent) {
            throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new AnonymousClass1();
    }
}
