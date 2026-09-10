package com.google.android.gms.ads.internal.client;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import r9.c;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzev extends ContentProvider {
    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        Bundle bundle = null;
        try {
            bundle = c.a(context).d(128, context.getPackageName()).metaData;
        } catch (PackageManager.NameNotFoundException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to load metadata: Package name not found.", e10);
        } catch (NullPointerException e11) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to load metadata: Null pointer exception.", e11);
        }
        if (bundle == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Metadata was null.");
        } else {
            try {
                String str = (String) bundle.get("com.google.android.gms.ads.APPLICATION_ID");
                try {
                    String str2 = (String) bundle.get("com.google.android.gms.ads.INTEGRATION_MANAGER");
                    if (str != null) {
                        if (!str.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$")) {
                            throw new IllegalStateException("\n\n******************************************************************************\n* Invalid application ID. Follow instructions here:                          *\n* https://goo.gle/admob-android-update-manifest                              *\n* to find your app ID.                                                       *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://goo.gle/ad-manager-android-update-manifest.                        *\n******************************************************************************\n\n");
                        }
                        com.google.android.gms.ads.internal.util.client.zzo.zzd("Publisher provided Google AdMob App ID in manifest: ".concat(str));
                    } else {
                        if (TextUtils.isEmpty(str2)) {
                            throw new IllegalStateException("\n\n******************************************************************************\n* Missing application ID. AdMob publishers should follow the instructions    *\n* here:                                                                      *\n* https://goo.gle/admob-android-update-manifest.                             *\n* to add a valid App ID inside the AndroidManifest.                          *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://goo.gle/ad-manager-android-update-manifest.                        *\n******************************************************************************\n\n");
                        }
                        com.google.android.gms.ads.internal.util.client.zzo.zzd("The Google Mobile Ads SDK is integrated by ".concat(String.valueOf(str2)));
                    }
                } catch (ClassCastException e12) {
                    throw new IllegalStateException("The com.google.android.gms.ads.INTEGRATION_MANAGER metadata must have a String value.", e12);
                }
            } catch (ClassCastException e13) {
                throw new IllegalStateException("The com.google.android.gms.ads.APPLICATION_ID metadata must have a String value.", e13);
            }
        }
        if (bundle != null) {
            boolean z10 = bundle.getBoolean("com.google.android.gms.ads.flag.OPTIMIZE_INITIALIZATION", false);
            boolean z11 = bundle.getBoolean("com.google.android.gms.ads.flag.OPTIMIZE_AD_LOADING", false);
            if (z10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzd("com.google.android.gms.ads.flag.OPTIMIZE_INITIALIZATION is enabled");
            }
            if (z11) {
                com.google.android.gms.ads.internal.util.client.zzo.zzd("com.google.android.gms.ads.flag.OPTIMIZE_AD_LOADING is enabled");
            }
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final int delete(@NonNull Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final Uri insert(@NonNull Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final Cursor query(@NonNull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(@NonNull Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
