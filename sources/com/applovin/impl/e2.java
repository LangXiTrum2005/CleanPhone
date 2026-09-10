package com.applovin.impl;

import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f7782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f7783b;

    public e2(Map map, com.applovin.impl.sdk.l lVar) {
        this.f7782a = map == null ? Collections.EMPTY_MAP : map;
        this.f7783b = lVar;
    }

    public Drawable a() {
        Object obj = this.f7782a.get("google_watermark");
        if (!a(obj)) {
            this.f7783b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f7783b.Q().b("GoogleWatermarkGenerator", "Unable to render invalid watermark: " + obj);
            }
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode((String) obj, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(com.applovin.impl.sdk.l.p().getResources(), BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            return bitmapDrawable;
        } catch (Throwable th2) {
            this.f7783b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f7783b.Q().a("GoogleWatermarkGenerator", "Failed to render watermark", th2);
            }
            return null;
        }
    }

    public String b() {
        return "google watermark";
    }

    public boolean c() {
        return a(this.f7782a.get("google_watermark"));
    }

    private boolean a(Object obj) {
        return (obj instanceof String) && StringUtils.isValidString((String) obj);
    }
}
