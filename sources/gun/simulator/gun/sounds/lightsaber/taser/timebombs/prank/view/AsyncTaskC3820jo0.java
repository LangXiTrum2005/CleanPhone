package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class AsyncTaskC3820jo0 extends Nm0 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AsyncTaskC3820jo0(C3491g4 c3491g4, HashSet hashSet, JSONObject jSONObject, long j, int i) {
        super(c3491g4, hashSet, jSONObject, j);
        this.f = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractAsyncTaskC3906kn0
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        Hn0 hn0;
        HashSet hashSet = this.c;
        int i = this.f;
        long j = this.e;
        switch (i) {
            case 0:
                Hn0 hn1 = Hn0.c;
                if (hn1 != null) {
                    for (Jm0 jm0 : Collections.unmodifiableCollection(hn1.f3186a)) {
                        if (hashSet.contains(jm0.h)) {
                            jm0.e.g(str, j);
                        }
                    }
                }
                super.onPostExecute(str);
                break;
            default:
                if (!TextUtils.isEmpty(str) && (hn0 = Hn0.c) != null) {
                    for (Jm0 jm1 : Collections.unmodifiableCollection(hn0.f3186a)) {
                        if (hashSet.contains(jm1.h)) {
                            jm1.e.l(str, j);
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
                        if (In0.f(jSONObject, c3491g4.j())) {
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
                        if (In0.f(jSONObject, c3491g4.j())) {
                            return null;
                        }
                        c3491g4.m(jSONObject);
                        return jSONObject.toString();
                }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractAsyncTaskC3906kn0, android.os.AsyncTask
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
