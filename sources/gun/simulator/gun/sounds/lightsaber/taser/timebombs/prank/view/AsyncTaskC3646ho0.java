package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ho0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class AsyncTaskC3646ho0 extends Zm0 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AsyncTaskC3646ho0(C3491g4 c3491g4, HashSet hashSet, JSONObject jSONObject, long j, int i) {
        super(c3491g4, hashSet, jSONObject, j);
        this.f = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractAsyncTaskC4521rn0
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        Cn0 cn0;
        CD cd = CD.b;
        HashSet hashSet = this.c;
        int i = this.f;
        long j = this.e;
        switch (i) {
            case 0:
                Cn0 cn1 = Cn0.c;
                if (cn1 != null) {
                    for (C3203cn0 c3203cn0 : Collections.unmodifiableCollection(cn1.f2942a)) {
                        if (hashSet.contains(c3203cn0.h)) {
                            W2 w2 = c3203cn0.e;
                            if (j >= w2.f && w2.e != 3) {
                                w2.e = 3;
                                cd.a(w2.f(), "setNativeViewHierarchy", str, w2.f3906a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
            default:
                if (!TextUtils.isEmpty(str) && (cn0 = Cn0.c) != null) {
                    for (C3203cn0 c3203cn1 : Collections.unmodifiableCollection(cn0.f2942a)) {
                        if (hashSet.contains(c3203cn1.h)) {
                            W2 w3 = c3203cn1.e;
                            if (j >= w3.f) {
                                w3.e = 2;
                                cd.a(w3.f(), "setNativeViewHierarchy", str, w3.f3906a);
                            }
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
                        if (En0.f(jSONObject, c3491g4.j())) {
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
                        if (En0.f(jSONObject, c3491g4.j())) {
                            return null;
                        }
                        c3491g4.m(jSONObject);
                        return jSONObject.toString();
                }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractAsyncTaskC4521rn0, android.os.AsyncTask
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
