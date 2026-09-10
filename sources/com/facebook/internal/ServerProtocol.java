package com.facebook.internal;

import com.facebook.FacebookSdk;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/ServerProtocol;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class ServerProtocol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Collection f16370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Collection f16371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f16372c;

    static {
        Collection collectionUnmodifiableCollection = Collections.unmodifiableCollection(Arrays.asList(Arrays.copyOf(new String[]{"service_disabled", "AndroidAuthKillSwitchException"}, 2)));
        Intrinsics.e(collectionUnmodifiableCollection, "Collections.unmodifiable…ction(Arrays.asList(*ts))");
        f16370a = collectionUnmodifiableCollection;
        Collection collectionUnmodifiableCollection2 = Collections.unmodifiableCollection(Arrays.asList(Arrays.copyOf(new String[]{"access_denied", "OAuthAccessDeniedException"}, 2)));
        Intrinsics.e(collectionUnmodifiableCollection2, "Collections.unmodifiable…ction(Arrays.asList(*ts))");
        f16371b = collectionUnmodifiableCollection2;
        f16372c = "CONNECTION_FAILURE";
    }

    public static final String a() {
        return String.format("m.%s", Arrays.copyOf(new Object[]{FacebookSdk.r}, 1));
    }
}
