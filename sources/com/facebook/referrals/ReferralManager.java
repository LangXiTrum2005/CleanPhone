package com.facebook.referrals;

import android.content.Intent;
import com.facebook.internal.CallbackManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class ReferralManager {

    /* JADX INFO: renamed from: com.facebook.referrals.ReferralManager$1, reason: invalid class name */
    class AnonymousClass1 implements CallbackManagerImpl.Callback {
        @Override // com.facebook.internal.CallbackManagerImpl.Callback
        public final boolean a(int i2, Intent intent) {
            throw null;
        }
    }

    public static class ActivityStartActivityDelegate implements StartActivityDelegate {
    }

    public static class FragmentStartActivityDelegate implements StartActivityDelegate {
    }
}
