package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.smartdigimkt.b0.a;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/internal/ImageRequest;", "", "Builder", "Callback", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class ImageRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f16337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Callback f16338c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f16339e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/ImageRequest$Builder;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Callback f16340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f16341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Uri f16342c;

        public Builder(Context context, Uri uri) {
            Intrinsics.f(context, "context");
            this.f16341b = context;
            this.f16342c = uri;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) obj;
            return Intrinsics.a(this.f16341b, builder.f16341b) && Intrinsics.a(this.f16342c, builder.f16342c);
        }

        public final int hashCode() {
            Context context = this.f16341b;
            int iHashCode = (context != null ? context.hashCode() : 0) * 31;
            Uri uri = this.f16342c;
            return iHashCode + (uri != null ? uri.hashCode() : 0);
        }

        public final String toString() {
            return "Builder(context=" + this.f16341b + ", imageUri=" + this.f16342c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/ImageRequest$Callback;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface Callback {
        void a(ImageResponse imageResponse);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004¨\u0006\r"}, d2 = {"Lcom/facebook/internal/ImageRequest$Companion;", "", "", "ACCESS_TOKEN_PARAM", "Ljava/lang/String;", "HEIGHT_PARAM", "MIGRATION_PARAM", "MIGRATION_VALUE", AndroidStaticDeviceInfoDataSource.ENVIRONMENT_VARIABLE_PATH, "", "UNSPECIFIED_DIMENSION", "I", "WIDTH_PARAM", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static Uri a(int i2, int i3, String str, String str2) {
            Validate.g(str, "userId");
            int iMax = Math.max(i2, 0);
            int iMax2 = Math.max(i3, 0);
            if (iMax == 0 && iMax2 == 0) {
                throw new IllegalArgumentException("Either width or height must be greater than 0");
            }
            Collection collection = ServerProtocol.f16370a;
            Uri.Builder builderPath = Uri.parse(String.format("https://graph.%s", Arrays.copyOf(new Object[]{FacebookSdk.g()}, 1))).buildUpon().path(String.format(Locale.US, "%s/%s/picture", Arrays.copyOf(new Object[]{FacebookSdk.f(), str}, 2)));
            if (iMax2 != 0) {
                builderPath.appendQueryParameter("height", String.valueOf(iMax2));
            }
            if (iMax != 0) {
                builderPath.appendQueryParameter("width", String.valueOf(iMax));
            }
            builderPath.appendQueryParameter("migration_overrides", "{october_2012:true}");
            if (Utility.C(str2)) {
                Validate.h();
                if (Utility.C(FacebookSdk.f15918e) || Utility.C(FacebookSdk.c())) {
                    Log.d("ImageRequest", "Needs access token to fetch profile picture. Without an access token a default silhoutte picture is returned");
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(FacebookSdk.c());
                    sb.append(a.U1);
                    Validate.h();
                    sb.append(FacebookSdk.f15918e);
                    builderPath.appendQueryParameter("access_token", sb.toString());
                }
            } else {
                builderPath.appendQueryParameter("access_token", str2);
            }
            Uri uriBuild = builderPath.build();
            Intrinsics.e(uriBuild, "builder.build()");
            return uriBuild;
        }
    }

    public ImageRequest(Context context, Uri uri, Callback callback, boolean z2, Object obj) {
        this.f16336a = context;
        this.f16337b = uri;
        this.f16338c = callback;
        this.d = z2;
        this.f16339e = obj;
    }
}
