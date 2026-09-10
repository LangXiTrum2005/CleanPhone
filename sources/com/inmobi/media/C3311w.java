package com.inmobi.media;

import android.content.Context;
import android.webkit.URLUtil;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.UUID;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.impromptu;
import kotlinx.coroutines.premeiotic;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.dern;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3311w {
    public final Context a;
    public final Image b;
    public final AdConfig.AdChoiceConfig c;
    public final C3097n9 d;
    public final String e;

    public C3311w(Context context, Image image, AdConfig.AdChoiceConfig adChoiceConfig, C3097n9 c3097n9) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adChoiceConfig, "adChoiceConfig");
        this.a = context;
        this.b = image;
        this.c = adChoiceConfig;
        this.d = c3097n9;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.e = "AdChoice-Image-" + string;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(C3311w c3311w, Cj cj, String str, int i, ContinuationImpl continuationImpl) {
        C3211s c3211s;
        c3311w.getClass();
        if (continuationImpl instanceof C3211s) {
            c3211s = (C3211s) continuationImpl;
            int i2 = c3211s.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3211s.c = i2 - Integer.MIN_VALUE;
            } else {
                c3211s = new C3211s(c3311w, continuationImpl);
            }
        } else {
            c3211s = new C3211s(c3311w, continuationImpl);
        }
        Object objMarial = c3211s.a;
        Object objBeachfront = attabal.beachfront();
        int i3 = c3211s.c;
        if (i3 == 0) {
            dern.saneness(objMarial);
            C3286v c3286v = new C3286v(c3311w, str, cj, null);
            c3211s.c = 1;
            objMarial = TimeoutKt.marial(i, c3286v, c3211s);
            if (objMarial == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dern.saneness(objMarial);
        }
        Boolean bool = (Boolean) objMarial;
        return igo.attabal.attabal(bool != null ? bool.booleanValue() : false);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0018  */
    /* JADX WARN: Code duplicated, block: B:23:0x0037  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    public final Object a(C3375yd c3375yd) {
        String url;
        int width;
        int height;
        Image image = this.b;
        if (image == null || (url = image.getUrl()) == null) {
            url = this.c.getUrl();
        } else {
            if (!URLUtil.isNetworkUrl(url)) {
                url = null;
            }
            if (url == null) {
                url = this.c.getUrl();
            }
        }
        String str = url;
        Image image2 = this.b;
        if (image2 != null) {
            int width2 = image2.getWidth();
            Integer numValueOf = Integer.valueOf(width2);
            if (width2 <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                width = numValueOf.intValue();
            } else {
                width = this.c.getWidth();
            }
        } else {
            width = this.c.getWidth();
        }
        int i = width;
        Image image3 = this.b;
        if (image3 != null) {
            int height2 = image3.getHeight();
            Integer numValueOf2 = height2 > 0 ? Integer.valueOf(height2) : null;
            if (numValueOf2 != null) {
                height = numValueOf2.intValue();
            } else {
                height = this.c.getHeight();
            }
        } else {
            height = this.c.getHeight();
        }
        int i2 = height;
        int loadTimeout = this.c.getLoadTimeout();
        if (!URLUtil.isNetworkUrl(str)) {
            C3097n9 c3097n9 = this.d;
            if (c3097n9 != null) {
                c3097n9.b("AdChoiceViewManager", "Invalid URL: " + str);
            }
            throw new C2849dc();
        }
        return impromptu.competently(premeiotic.dern(), new r(this, str, loadTimeout, i, i2, null), c3375yd);
    }
}
