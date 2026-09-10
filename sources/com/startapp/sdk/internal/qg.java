package com.startapp.sdk.internal;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public abstract class qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f41408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f41409b = new AtomicBoolean(true);

    public static String a(Context context) {
        if (f41409b.getAndSet(false)) {
            try {
                AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new com.google.common.net.a(17));
            } catch (GooglePlayServicesMissingManifestValueException | NoClassDefFoundError unused) {
            }
        }
        return f41408a;
    }
}
