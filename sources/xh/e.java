package xh;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.Stack;
import org.json.JSONArray;
import org.json.JSONException;
import zl.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements OnUserEarnedRewardListener, t8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f53807a;

    public static boolean l(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String n(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public void a(zl.d dVar) {
        if (!dVar.q()) {
            if (!(dVar instanceof w)) {
                String strValueOf = String.valueOf(dVar.getClass());
                throw new IllegalArgumentException(defpackage.e.q("Has a new type of ByteString been created? Found ", strValueOf, new StringBuilder(strValueOf.length() + 49)));
            }
            w wVar = (w) dVar;
            a(wVar.f55083c);
            a(wVar.f55084d);
            return;
        }
        int size = dVar.size();
        int[] iArr = w.f55081h;
        int iBinarySearch = Arrays.binarySearch(iArr, size);
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int i10 = iArr[iBinarySearch + 1];
        Stack stack = (Stack) this.f53807a;
        if (stack.isEmpty() || ((zl.d) stack.peek()).size() >= i10) {
            stack.push(dVar);
            return;
        }
        int i11 = iArr[iBinarySearch];
        zl.d wVar2 = (zl.d) stack.pop();
        while (!stack.isEmpty() && ((zl.d) stack.peek()).size() < i11) {
            wVar2 = new w((zl.d) stack.pop(), wVar2);
        }
        w wVar3 = new w(wVar2, dVar);
        while (!stack.isEmpty()) {
            int[] iArr2 = w.f55081h;
            int iBinarySearch2 = Arrays.binarySearch(iArr2, wVar3.f55082b);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((zl.d) stack.peek()).size() >= iArr2[iBinarySearch2 + 1]) {
                break;
            } else {
                wVar3 = new w((zl.d) stack.pop(), wVar3);
            }
        }
        stack.push(wVar3);
    }

    public boolean b(String str) {
        String strJ = j(str);
        return "1".equals(strJ) || Boolean.parseBoolean(strJ);
    }

    public Integer c(String str) {
        String strJ = j(str);
        if (TextUtils.isEmpty(strJ)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strJ));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + n(str) + "(" + strJ + ") into an int");
            return null;
        }
    }

    public JSONArray d(String str) {
        String strJ = j(str);
        if (TextUtils.isEmpty(strJ)) {
            return null;
        }
        try {
            return new JSONArray(strJ);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + n(str) + ": " + strJ + ", falling back to default");
            return null;
        }
    }

    public int[] e() {
        JSONArray jSONArrayD = d("gcm.n.light_settings");
        if (jSONArrayD == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayD.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int color = Color.parseColor(jSONArrayD.optString(0));
            if (color == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayD.optInt(1);
            iArr[2] = jSONArrayD.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e10) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayD + ". " + e10.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayD + ". Skipping setting LightSettings");
            return null;
        }
    }

    public Object[] f(String str) {
        JSONArray jSONArrayD = d(str.concat("_loc_args"));
        if (jSONArrayD == null) {
            return null;
        }
        int length = jSONArrayD.length();
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = jSONArrayD.optString(i10);
        }
        return strArr;
    }

    public String g(String str) {
        return j(str.concat("_loc_key"));
    }

    @Override // vj.a
    public Object get() {
        String packageName = ((Context) ((vj.a) this.f53807a).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public Long h() {
        String strJ = j("gcm.n.event_time");
        if (TextUtils.isEmpty(strJ)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strJ));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + n("gcm.n.event_time") + "(" + strJ + ") into a long");
            return null;
        }
    }

    public String i(Resources resources, String str, String str2) {
        String strJ = j(str2);
        if (!TextUtils.isEmpty(strJ)) {
            return strJ;
        }
        String strG = g(str2);
        if (TextUtils.isEmpty(strG)) {
            return null;
        }
        int identifier = resources.getIdentifier(strG, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", n(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] objArrF = f(str2);
        if (objArrF == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrF);
        } catch (MissingFormatArgumentException e10) {
            Log.w("NotificationParams", "Missing format argument for " + n(str2) + ": " + Arrays.toString(objArrF) + " Default value will be used.", e10);
            return null;
        }
    }

    public String j(String str) {
        Bundle bundle = (Bundle) this.f53807a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public long[] k() {
        JSONArray jSONArrayD = d("gcm.n.vibrate_timings");
        if (jSONArrayD == null) {
            return null;
        }
        try {
            if (jSONArrayD.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayD.length();
            long[] jArr = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                jArr[i10] = jSONArrayD.optLong(i10);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayD + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    public Bundle m() {
        Bundle bundle = (Bundle) this.f53807a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public void onUserEarnedReward(RewardItem rewardItem) {
        ((f) this.f53807a).f53809c.onUserEarnedReward();
    }

    public e(Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("data");
        }
        this.f53807a = new Bundle(bundle);
    }

    public e() {
        this.f53807a = new Stack();
    }
}
