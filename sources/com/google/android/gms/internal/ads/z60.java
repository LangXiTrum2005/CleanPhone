package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzaa;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.C0335f8;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z60 implements ct {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yh f22521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PowerManager f22522c;

    public z60(Context context, yh yhVar) {
        this.f22520a = context;
        this.f22521b = yhVar;
        this.f22522c = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.ct
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(c70 c70Var) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zh zhVar = c70Var.f13078e;
        if (zhVar == null) {
            jSONObject = new JSONObject();
        } else {
            yh yhVar = this.f22521b;
            if (yhVar.f22250b == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z10 = zhVar.f22608a;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObjectPut = jSONObject3.put("afmaVersion", yhVar.f22252d).put("activeViewJSON", yhVar.f22250b).put("timestamp", c70Var.f13076c).put("adFormat", yhVar.f22249a).put("hashCode", yhVar.f22251c).put("isMraid", false).put("isStopped", false).put("isPaused", c70Var.f13075b).put("isNative", yhVar.f22253e).put("isScreenOn", this.f22522c.isInteractive()).put("appMuted", zzt.zzi().zzd()).put("appVolume", zzt.zzi().zzb());
            Context context = this.f22520a;
            jSONObjectPut.put(X3.j.P, zzaa.zze(context.getApplicationContext()));
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            JSONObject jSONObjectPut2 = jSONObject3.put("windowVisibility", zhVar.f22609b).put("isAttachedToWindow", z10);
            JSONObject jSONObject4 = new JSONObject();
            Rect rect = zhVar.f22610c;
            JSONObject jSONObjectPut3 = jSONObjectPut2.put("viewBox", jSONObject4.put(ViewHierarchyConstants.DIMENSION_TOP_KEY, rect.top).put("bottom", rect.bottom).put("left", rect.left).put(TtmlNode.RIGHT, rect.right));
            JSONObject jSONObject5 = new JSONObject();
            Rect rect2 = zhVar.f22611d;
            JSONObject jSONObjectPut4 = jSONObjectPut3.put("adBox", jSONObject5.put(ViewHierarchyConstants.DIMENSION_TOP_KEY, rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put(TtmlNode.RIGHT, rect2.right));
            JSONObject jSONObject6 = new JSONObject();
            Rect rect3 = zhVar.f22612e;
            JSONObject jSONObjectPut5 = jSONObjectPut4.put("globalVisibleBox", jSONObject6.put(ViewHierarchyConstants.DIMENSION_TOP_KEY, rect3.top).put("bottom", rect3.bottom).put("left", rect3.left).put(TtmlNode.RIGHT, rect3.right)).put("globalVisibleBoxVisible", zhVar.f22613f);
            JSONObject jSONObject7 = new JSONObject();
            Rect rect4 = zhVar.f22614g;
            JSONObject jSONObjectPut6 = jSONObjectPut5.put("localVisibleBox", jSONObject7.put(ViewHierarchyConstants.DIMENSION_TOP_KEY, rect4.top).put("bottom", rect4.bottom).put("left", rect4.left).put(TtmlNode.RIGHT, rect4.right)).put("localVisibleBoxVisible", zhVar.f22615h);
            JSONObject jSONObject8 = new JSONObject();
            Rect rect5 = zhVar.f22616i;
            jSONObjectPut6.put("hitBox", jSONObject8.put(ViewHierarchyConstants.DIMENSION_TOP_KEY, rect5.top).put("bottom", rect5.bottom).put("left", rect5.left).put(TtmlNode.RIGHT, rect5.right)).put("screenDensity", displayMetrics.density);
            jSONObject3.put(C0335f8.f28653k, c70Var.f13074a);
            if (((Boolean) zzba.zzc().a(am.f12160g2)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zhVar.f22618k;
                if (list != null) {
                    for (Rect rect6 : list) {
                        jSONArray2.put(new JSONObject().put(ViewHierarchyConstants.DIMENSION_TOP_KEY, rect6.top).put("bottom", rect6.bottom).put("left", rect6.left).put(TtmlNode.RIGHT, rect6.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(c70Var.f13077d)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
