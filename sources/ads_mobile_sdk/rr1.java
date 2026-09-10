package ads_mobile_sdk;

import android.content.Context;
import android.media.AudioManager;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.ironsource.C3474d8;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class rr1 {
    public boolean a;
    public final boolean b;
    public final boolean c;
    public long d;
    public final String e;
    public m73 f;

    public /* synthetic */ rr1() {
        this(false, false, false, 0L, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x00b5  */
    public final JsonObject a(Context context, String afmaVersion, String adId, wf appSettings) {
        float f;
        JsonObject jsonObject;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(appSettings, "appSettings");
        JsonArray jsonArray = new JsonArray();
        PowerManager powerManager = (PowerManager) context.getSystemService(PowerManager.class);
        m73 m73Var = this.f;
        if (m73Var == null) {
            jsonObject = new JsonObject();
        } else {
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("afmaVersion", afmaVersion);
            jsonObject2.add("activeViewJSON", new JsonObject());
            jsonObject2.addProperty("timestamp", Long.valueOf(this.d));
            jsonObject2.addProperty("isNative", Boolean.TRUE);
            jsonObject2.addProperty("adFormat", "native");
            jsonObject2.addProperty("isMraid", Boolean.FALSE);
            jsonObject2.addProperty("hashCode", adId);
            jsonObject2.addProperty("isStopped", Boolean.valueOf(this.c));
            jsonObject2.addProperty("isPaused", Boolean.valueOf(this.b));
            jsonObject2.addProperty("isScreenOn", Boolean.valueOf(powerManager.isInteractive()));
            jsonObject2.addProperty("appMuted", Boolean.valueOf(appSettings.d));
            jsonObject2.addProperty("appVolume", Float.valueOf(appSettings.c));
            Intrinsics.checkNotNullParameter(context, "context");
            AudioManager audioManager = (AudioManager) context.getSystemService(AudioManager.class);
            if (audioManager == null) {
                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            } else {
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                int streamVolume = audioManager.getStreamVolume(3);
                if (streamMaxVolume == 0) {
                    f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                } else {
                    f = streamVolume / streamMaxVolume;
                }
            }
            jsonObject2.addProperty(X3.j.P, Float.valueOf(f));
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            jsonObject2.addProperty("windowVisibility", Integer.valueOf(m73Var.c));
            jsonObject2.addProperty("isAttachedToWindow", Boolean.valueOf(m73Var.e));
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty("top", Integer.valueOf(m73Var.f.top));
            jsonObject3.addProperty("bottom", Integer.valueOf(m73Var.f.bottom));
            jsonObject3.addProperty(TtmlNode.LEFT, Integer.valueOf(m73Var.f.left));
            jsonObject3.addProperty(TtmlNode.RIGHT, Integer.valueOf(m73Var.f.right));
            Unit unit = Unit.f29295attabal;
            jsonObject2.add("viewBox", jsonObject3);
            JsonObject jsonObject4 = new JsonObject();
            jsonObject4.addProperty("top", Integer.valueOf(m73Var.d.top));
            jsonObject4.addProperty("bottom", Integer.valueOf(m73Var.d.bottom));
            jsonObject4.addProperty(TtmlNode.LEFT, Integer.valueOf(m73Var.d.left));
            jsonObject4.addProperty(TtmlNode.RIGHT, Integer.valueOf(m73Var.d.right));
            jsonObject2.add("adBox", jsonObject4);
            JsonObject jsonObject5 = new JsonObject();
            jsonObject5.addProperty("top", Integer.valueOf(m73Var.g.top));
            jsonObject5.addProperty("bottom", Integer.valueOf(m73Var.g.bottom));
            jsonObject5.addProperty(TtmlNode.LEFT, Integer.valueOf(m73Var.g.left));
            jsonObject5.addProperty(TtmlNode.RIGHT, Integer.valueOf(m73Var.g.right));
            jsonObject2.add("globalVisibleBox", jsonObject5);
            jsonObject2.addProperty("globalVisibleBoxVisible", Boolean.valueOf(m73Var.h));
            JsonObject jsonObject6 = new JsonObject();
            jsonObject6.addProperty("top", Integer.valueOf(m73Var.i.top));
            jsonObject6.addProperty("bottom", Integer.valueOf(m73Var.i.bottom));
            jsonObject6.addProperty(TtmlNode.LEFT, Integer.valueOf(m73Var.i.left));
            jsonObject6.addProperty(TtmlNode.RIGHT, Integer.valueOf(m73Var.i.right));
            jsonObject2.add("localVisibleBox", jsonObject6);
            jsonObject2.addProperty("localVisibleBoxVisible", Boolean.valueOf(m73Var.j));
            JsonObject jsonObject7 = new JsonObject();
            jsonObject7.addProperty("top", Integer.valueOf(m73Var.k.top));
            jsonObject7.addProperty("bottom", Integer.valueOf(m73Var.k.bottom));
            jsonObject7.addProperty(TtmlNode.LEFT, Integer.valueOf(m73Var.k.left));
            jsonObject7.addProperty(TtmlNode.RIGHT, Integer.valueOf(m73Var.k.right));
            jsonObject2.add("hitBox", jsonObject7);
            jsonObject2.addProperty("screenDensity", Float.valueOf(displayMetrics.density));
            jsonObject2.addProperty(C3474d8.k, Boolean.valueOf(this.a));
            String str = this.e;
            if (str != null && str.length() != 0) {
                jsonObject2.addProperty("doneReasonCode", "u");
            }
            jsonObject = jsonObject2;
        }
        jsonArray.add(jsonObject);
        JsonObject jsonObject8 = new JsonObject();
        jsonObject8.add("units", jsonArray);
        return jsonObject8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr1)) {
            return false;
        }
        rr1 rr1Var = (rr1) obj;
        return this.a == rr1Var.a && this.b == rr1Var.b && this.c == rr1Var.c && this.d == rr1Var.d && Intrinsics.wireman(this.e, rr1Var.e) && Intrinsics.wireman(this.f, rr1Var.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    public final int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.b;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.c;
        int iHashCode = (Long.hashCode(this.d) + ((i2 + (z3 ? 1 : z3)) * 31)) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        m73 m73Var = this.f;
        return iHashCode2 + (m73Var != null ? m73Var.hashCode() : 0);
    }

    public final String toString() {
        return "NativeVideoViewabilityState(isVisible=" + this.a + ", isPaused=" + this.b + ", isStopped=" + this.c + ", timestamp=" + this.d + ", doneReason=" + this.e + ", viewabilityEvent=" + this.f + ")";
    }

    public rr1(boolean z, boolean z2, boolean z3, long j, String str, m73 m73Var) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = j;
        this.e = str;
        this.f = m73Var;
    }
}
