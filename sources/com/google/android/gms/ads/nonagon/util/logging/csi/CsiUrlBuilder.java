package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.v71;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class CsiUrlBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11545a = (String) v71.f21087j.o();

    @NonNull
    public String generateUrl(@NonNull Map<String, String> map) {
        Uri.Builder builderBuildUpon = Uri.parse(this.f11545a).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }
}
