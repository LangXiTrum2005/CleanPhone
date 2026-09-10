package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.io0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class AsyncTaskC3733io0 extends Hm0 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AsyncTaskC3733io0(C3491g4 c3491g4, HashSet hashSet, JSONObject jSONObject, long j, int i) {
        super(c3491g4, hashSet, jSONObject, j);
        this.f = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractAsyncTaskC4785un0
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        Fn0 fn0;
        HashSet hashSet = this.c;
        int i = this.f;
        long j = this.e;
        switch (i) {
            case 0:
                Fn0 fn1 = Fn0.c;
                if (fn1 != null) {
                    for (C3026an0 c3026an0 : Collections.unmodifiableCollection(fn1.f3088a)) {
                        if (hashSet.contains(c3026an0.h)) {
                            c3026an0.e.g(str, j);
                        }
                    }
                }
                super.onPostExecute(str);
                break;
            default:
                if (!TextUtils.isEmpty(str) && (fn0 = Fn0.c) != null) {
                    for (C3026an0 c3026an1 : Collections.unmodifiableCollection(fn0.f3088a)) {
                        if (hashSet.contains(c3026an1.h)) {
                            c3026an1.e.l(str, j);
                        }
                    }
                }
                super.onPostExecute(str);
                break;
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        C3491g4 c3491g4 = this.b;
        JSONObject jSONObject = this.d;
        int i = this.f;
        switch (i) {
            case 0:
                switch (i) {
                    case 0:
                        return jSONObject.toString();
                    default:
                        if (Gn0.f(jSONObject, c3491g4.j())) {
                            return null;
                        }
                        c3491g4.m(jSONObject);
                        return jSONObject.toString();
                }
            default:
                switch (i) {
                    case 0:
                        return jSONObject.toString();
                    default:
                        if (Gn0.f(jSONObject, c3491g4.j())) {
                            return null;
                        }
                        c3491g4.m(jSONObject);
                        return jSONObject.toString();
                }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractAsyncTaskC4785un0, android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        switch (this.f) {
            case 0:
                onPostExecute((String) obj);
                break;
            default:
                onPostExecute((String) obj);
                break;
        }
    }
}
