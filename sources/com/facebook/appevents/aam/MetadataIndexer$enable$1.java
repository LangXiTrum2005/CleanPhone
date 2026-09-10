package com.facebook.appevents.aam;

import android.content.Context;
import com.facebook.FacebookSdk;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
final class MetadataIndexer$enable$1 implements Runnable {
    public static final MetadataIndexer$enable$1 X = new MetadataIndexer$enable$1();

    /* JADX WARN: Code duplicated, block: B:42:0x0055 A[ExcSplitCross -> B:27:0x0055, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            Context context = FacebookSdk.b();
            Intrinsics.f(context, "context");
            AttributionIdentifiers attributionIdentifiersA = AttributionIdentifiers.Companion.a(context);
            if (attributionIdentifiersA == null || !attributionIdentifiersA.f16258e) {
                MetadataIndexer metadataIndexer = MetadataIndexer.f16038b;
                if (!CrashShieldHandler.b(MetadataIndexer.class)) {
                    try {
                        if (!CrashShieldHandler.b(metadataIndexer)) {
                            try {
                                FetchedAppSettings fetchedAppSettingsF = FetchedAppSettingsManager.f(FacebookSdk.c(), false);
                                if (fetchedAppSettingsF != null && (str = fetchedAppSettingsF.m) != null) {
                                    try {
                                        MetadataRule.a().clear();
                                        MetadataRule.Companion.a(new JSONObject(str));
                                    } catch (JSONException unused) {
                                    }
                                }
                            } catch (Throwable th) {
                                CrashShieldHandler.a(metadataIndexer, th);
                            }
                        }
                    } catch (Throwable th2) {
                        CrashShieldHandler.a(MetadataIndexer.class, th2);
                    }
                }
                if (CrashShieldHandler.b(MetadataIndexer.class)) {
                    return;
                }
                try {
                    MetadataIndexer.f16037a = true;
                } catch (Throwable th3) {
                    CrashShieldHandler.a(MetadataIndexer.class, th3);
                }
            }
        } catch (Throwable th4) {
            CrashShieldHandler.a(this, th4);
        }
    }
}
