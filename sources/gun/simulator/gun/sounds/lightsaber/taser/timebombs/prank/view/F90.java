package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.TextUtils;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class F90 {
    public static final long d = TimeUnit.DAYS.toMillis(7);
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3056a;
    public final String b;
    public final long c;

    public F90(String str, String str2, long j) {
        this.f3056a = str;
        this.b = str2;
        this.c = j;
    }

    public static F90 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new F90(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new F90(jSONObject.getString(BidResponsed.KEY_TOKEN), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e2) {
            e2.toString();
            return null;
        }
    }
}
