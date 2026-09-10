package sg.bigo.ads.controller.c;

import android.graphics.Rect;
import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Rect f47973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f47974b = 2;

    public g(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("start_coordinate");
        String strOptString2 = jSONObject.optString("end_coordinate");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return;
        }
        String[] strArrSplit = strOptString.split(",");
        String[] strArrSplit2 = strOptString2.split(",");
        if (strArrSplit.length == 2 && strArrSplit2.length == 2) {
            try {
                int i2 = (int) (Float.parseFloat(strArrSplit[0]) * 1000.0f);
                int i3 = (int) (Float.parseFloat(strArrSplit2[0]) * 1000.0f);
                int i4 = (int) (Float.parseFloat(strArrSplit[1]) * 1000.0f);
                int i5 = (int) (Float.parseFloat(strArrSplit2[1]) * 1000.0f);
                this.f47973a = new Rect(Math.min(i2, i3), Math.min(i4, i5), Math.max(i2, i3), Math.max(i4, i5));
            } catch (NumberFormatException unused) {
            }
        }
    }
}
