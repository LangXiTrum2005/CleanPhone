package com.facebook.login;

import androidx.media3.extractor.text.ttml.a;
import com.google.android.gms.common.Scopes;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/login/LoginConfiguration;", "", "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class LoginConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f16479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16480b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/login/LoginConfiguration$Companion;", "", "", "OPENID", "Ljava/lang/String;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
    }

    public LoginConfiguration(Collection collection) {
        String strM = a.m("UUID.randomUUID().toString()");
        boolean z2 = false;
        if (strM.length() != 0) {
            z2 = !(StringsKt.u(strM, ' ', 0, 6) >= 0);
        }
        if (!z2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        HashSet hashSet = collection != null ? new HashSet(collection) : new HashSet();
        hashSet.add(Scopes.OPEN_ID);
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        Intrinsics.e(setUnmodifiableSet, "Collections.unmodifiableSet(permissions)");
        this.f16479a = setUnmodifiableSet;
        this.f16480b = strM;
    }
}
