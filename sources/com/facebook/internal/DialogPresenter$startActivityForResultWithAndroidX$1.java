package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import androidx.activity.result.contract.ActivityResultContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\b\n\u0018\u00002\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0001¨\u0006\u0005"}, d2 = {"com/facebook/internal/DialogPresenter$startActivityForResultWithAndroidX$1", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/content/Intent;", "Landroid/util/Pair;", "", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class DialogPresenter$startActivityForResultWithAndroidX$1 extends ActivityResultContract<Intent, Pair<Integer, Intent>> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent a(Context context, Object obj) {
        Intent input = (Intent) obj;
        Intrinsics.f(input, "input");
        return input;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object c(int i2, Intent intent) {
        Pair pairCreate = Pair.create(Integer.valueOf(i2), intent);
        Intrinsics.e(pairCreate, "Pair.create(resultCode, intent)");
        return pairCreate;
    }
}
