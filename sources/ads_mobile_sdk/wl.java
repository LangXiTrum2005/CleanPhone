package ads_mobile_sdk;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Base64;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.net.URL;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import p002kotlin.text.dovishness;
import saneness.hobby;
import saneness.loun;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class wl {
    public final hobby a;
    public final jk0 b;
    public final loun c;

    public wl(hobby httpClient, jk0 flags, loun traceLogger) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        this.a = httpClient;
        this.b = flags;
        this.c = traceLogger;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public static Object a(wl wlVar, String str, double d, boolean z, wretchedly.dern dernVar) {
        vl vlVar;
        double d2;
        Object rn0Var;
        Object on0Var;
        byte[] bArr;
        wl wlVar2 = wlVar;
        boolean z2 = z;
        if (dernVar instanceof vl) {
            vlVar = (vl) dernVar;
            int i = vlVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                vlVar.f = i - Integer.MIN_VALUE;
            } else {
                vlVar = new vl(wlVar2, dernVar);
            }
        } else {
            vlVar = new vl(wlVar2, dernVar);
        }
        Object objAttabal = vlVar.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = vlVar.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objAttabal);
            jk0 jk0Var = wlVar2.b;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:native_bitmap_loader_supports_data_url", X3.i.W);
            if (((Boolean) jk0Var.a("gads:native_bitmap_loader_supports_data_url", Boolean.TRUE, zk.b)).booleanValue() && dovishness.starveling(str, "data:", false, 2, null)) {
                int iLotta = StringsKt.lotta(str, ",", 0, false, 6, null);
                if (iLotta == -1) {
                    rn0Var = new rn0("Bad data URL: no ',' found for base64 data", k41.INVALID_DATA_URL);
                } else {
                    String strSubstring = str.substring(0, iLotta);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    if (dovishness.cuirassed(strSubstring, ";base64", false, 2, null)) {
                        int iLotta2 = StringsKt.lotta(str, ":", 0, false, 6, null);
                        int iLotta3 = StringsKt.lotta(str, ";", 0, false, 6, null);
                        if (iLotta2 != -1) {
                            String strSubstring2 = str.substring(iLotta2 + 1, iLotta3);
                            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                            if (dovishness.starveling(strSubstring2, "image/", false, 2, null)) {
                                String strSubstring3 = str.substring(iLotta + 1);
                                Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                                try {
                                    on0Var = new tn0(Base64.decode(strSubstring3, 0));
                                } catch (IllegalArgumentException e) {
                                    on0Var = new on0(e, k41.INVALID_DATA_URL, "Bad data URL: could not decode base64");
                                }
                                rn0Var = on0Var;
                            } else {
                                rn0Var = new rn0("Bad data URL: only image media is supported", k41.INVALID_DATA_URL);
                            }
                        } else {
                            rn0Var = new rn0("Bad data URL: only image media is supported", k41.INVALID_DATA_URL);
                        }
                    } else {
                        rn0Var = new rn0("Bad data URL: only base64 is supported", k41.INVALID_DATA_URL);
                    }
                }
                if (rn0Var instanceof nn0) {
                    return (nn0) rn0Var;
                }
                Intrinsics.competently(rn0Var, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                return wlVar2.a((byte[]) ((tn0) rn0Var).b, d, z2);
            }
            hobby hobbyVar = wlVar2.a;
            URL url = new URL(Uri.parse(str).toString());
            vlVar.a = wlVar2;
            vlVar.b = d;
            vlVar.c = z2;
            vlVar.f = 1;
            objAttabal = hobby.attabal(hobbyVar, url, null, vlVar, 14);
            if (objAttabal == objBeachfront) {
                return objBeachfront;
            }
            d2 = d;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z3 = vlVar.c;
            d2 = vlVar.b;
            wl wlVar3 = vlVar.a;
            p002kotlin.dern.saneness(objAttabal);
            z2 = z3;
            wlVar2 = wlVar3;
        }
        spartacist spartacistVar = (spartacist) objAttabal;
        if (spartacistVar instanceof nn0) {
            return (nn0) spartacistVar;
        }
        Intrinsics.competently(spartacistVar, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
        try {
            dg2 dg2Var = ((zt0) ((tn0) spartacistVar).b).d;
            return (dg2Var == null || (bArr = dg2Var.a) == null) ? new rn0("HTTP response body is null", k41.INTERNAL_ERROR) : wlVar2.a(bArr, d2, z2);
        } catch (Exception e2) {
            ((d13) wlVar2.c).a("Error downloading bitmap from url.", e2);
            return new on0(e2, k41.NETWORK_ERROR, null, 4);
        }
    }

    public final spartacist a(byte[] bArr, double d, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (((double) 160) * d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        options.inJustDecodeBounds = false;
        int i = options.outWidth * options.outHeight;
        if (i > 0) {
            jk0 jk0Var = this.b;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:nativeads:image:sample:pixels", X3.i.W);
            options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Number) jk0Var.a("gads:nativeads:image:sample:pixels", Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES), zk.f)).intValue())) / 2);
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        if (bitmapDecodeByteArray == null) {
            return new rn0("Cannot decode image", k41.INTERNAL_ERROR);
        }
        return new tn0(bitmapDecodeByteArray);
    }
}
