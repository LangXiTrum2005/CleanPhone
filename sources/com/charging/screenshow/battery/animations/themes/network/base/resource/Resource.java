package com.charging.screenshow.battery.animations.themes.network.base.resource;

import com.charging.screenshow.battery.animations.themes.network.base.model.ApiBaseResponse;
import com.charging.screenshow.battery.animations.themes.network.base.model.ApiError;
import com.charging.screenshow.battery.animations.themes.network.base.util.ApiCodeError;
import com.charging.screenshow.battery.animations.themes.network.base.util.Error;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/network/base/resource/Resource;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Resource<T> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Headers f13284i = new Headers.Builder().build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Headers f13287c;
    public final Error d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ApiError f13288e;
    public final List f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f13289h;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/network/base/resource/Resource$Companion;", "", "Lokhttp3/Headers;", "defaultHeaders", "Lokhttp3/Headers;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static Resource a(Object obj, Headers headers) {
            Headers headers2 = Resource.f13284i;
            return new Resource(true, obj, headers, null, null, 1008);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Error.values().length];
            try {
                Error.Companion companion = Error.X;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Error.Companion companion2 = Error.X;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Error.Companion companion3 = Error.X;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Error.Companion companion4 = Error.X;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Error.Companion companion5 = Error.X;
                iArr[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Error.Companion companion6 = Error.X;
                iArr[7] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Error.Companion companion7 = Error.X;
                iArr[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                Error.Companion companion8 = Error.X;
                iArr[6] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public Resource(boolean z2, Object obj, Integer num, Headers headers, Error error, ApiError apiError, List list, String str, String str2, ApiCodeError apiCodeError) {
        this.f13285a = z2;
        this.f13286b = obj;
        this.f13287c = headers;
        this.d = error;
        this.f13288e = apiError;
        this.f = list;
        this.g = str;
        this.f13289h = str2;
    }

    public static Resource a(Resource resource, boolean z2, ApiBaseResponse apiBaseResponse, Integer num, List list, String str, String str2, ApiCodeError apiCodeError, int i2) {
        List list2 = (i2 & 64) != 0 ? resource.f : list;
        String str3 = (i2 & 128) != 0 ? resource.g : str;
        String str4 = (i2 & 256) != 0 ? resource.f13289h : str2;
        Headers headers = resource.f13287c;
        Intrinsics.f(headers, "headers");
        Error error = resource.d;
        Intrinsics.f(error, "error");
        return new Resource(z2, apiBaseResponse, num, headers, error, resource.f13288e, list2, str3, str4, apiCodeError);
    }

    public /* synthetic */ Resource(boolean z2, Object obj, Headers headers, Error error, ApiError apiError, int i2) {
        this(z2, (i2 & 2) != 0 ? null : obj, null, (i2 & 8) != 0 ? f13284i : headers, (i2 & 16) != 0 ? Error.h0 : error, (i2 & 32) != 0 ? null : apiError, null, null, null, null);
    }
}
