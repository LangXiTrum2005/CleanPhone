package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class KG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3307a;
    public int b;
    public long c;
    public double d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public int k;
    public int l;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;
    public int q = 307200;
    public int r = 1;

    public final int a() {
        if (this.q < 0) {
            this.q = 307200;
        }
        long j = this.q;
        long j2 = this.c;
        if (j > j2) {
            this.q = (int) j2;
        }
        return this.q;
    }

    public final String b() {
        if (TextUtils.isEmpty(this.j)) {
            this.j = SG.a(this.g);
        }
        return this.j;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cover_height", this.f3307a);
            jSONObject.put("cover_url", this.f);
            jSONObject.put("cover_width", this.b);
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, this.h);
            jSONObject.put("file_hash", b());
            jSONObject.put(com.umeng.analytics.pro.bc.z, this.e);
            jSONObject.put("size", this.c);
            jSONObject.put("video_duration", this.d);
            jSONObject.put(CampaignEx.JSON_KEY_VIDEO_URL, this.g);
            jSONObject.put("playable_download_url", this.i);
            jSONObject.put("if_playable_loading_show", this.m);
            jSONObject.put("remove_loading_page_type", this.n);
            jSONObject.put("fallback_endcard_judge", this.k);
            jSONObject.put("video_preload_size", a());
            jSONObject.put("reward_video_cached_type", this.o);
            jSONObject.put("execute_cached_type", this.p);
            jSONObject.put("endcard_render", this.l);
            jSONObject.put("replay_time", this.r);
            jSONObject.put("play_speed_ratio", -1.0f);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
