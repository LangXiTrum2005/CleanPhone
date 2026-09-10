package com.google.android.libraries.ads.mobile.sdk.internal.util;

import android.os.Bundle;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/internal/util/BundleTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Landroid/os/Bundle;", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class BundleTypeAdapter extends TypeAdapter<Bundle> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Gson f19439attabal;

    public BundleTypeAdapter(Gson gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f19439attabal = gson;
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public final Bundle read2(JsonReader jsonReader) {
        return new Bundle();
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Bundle bundle) throws IOException {
        Bundle bundle2 = bundle;
        if (jsonWriter == null) {
            return;
        }
        if (bundle2 == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginObject();
        for (String str : bundle2.keySet()) {
            if (str != null) {
                jsonWriter.name(str);
                Object obj = bundle2.get(str);
                if (obj == null) {
                    jsonWriter.nullValue();
                } else {
                    this.f19439attabal.toJson(obj, obj.getClass(), jsonWriter);
                }
            }
        }
        jsonWriter.endObject();
    }
}
