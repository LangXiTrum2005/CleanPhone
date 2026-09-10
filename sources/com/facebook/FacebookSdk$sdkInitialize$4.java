package com.facebook;

import com.facebook.internal.FeatureManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "enabled", "", "onCompleted"}, k = 3, mv = {1, 5, 1})
final class FacebookSdk$sdkInitialize$4 implements FeatureManager.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FacebookSdk$sdkInitialize$4 f15929a = new FacebookSdk$sdkInitialize$4();

    @Override // com.facebook.internal.FeatureManager.Callback
    public final void a(boolean z2) {
        if (z2) {
            FacebookSdk.m = true;
        }
    }
}
