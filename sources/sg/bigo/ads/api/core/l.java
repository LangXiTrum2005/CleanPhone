package sg.bigo.ads.api.core;

import android.os.Parcel;
import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements sg.bigo.ads.api.a.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f47050a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f47051b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f47052c = 5;

    @Override // sg.bigo.ads.common.f
    public final void a(Parcel parcel) {
        parcel.writeString(this.f47050a + "," + this.f47051b + "," + this.f47052c);
    }

    @Override // sg.bigo.ads.api.a.g
    public final int b() {
        return this.f47051b;
    }

    @Override // sg.bigo.ads.api.a.g
    public final int c() {
        return this.f47052c;
    }

    @Override // sg.bigo.ads.api.a.g
    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f47050a = jSONObject.optInt("id_show_loading", 2);
            this.f47051b = jSONObject.optInt("loading_timeout", 3);
            this.f47052c = jSONObject.optInt("material_show_close_button", 5);
        }
    }

    @Override // sg.bigo.ads.common.f
    public final void b(Parcel parcel) {
        String[] strArrSplit;
        if (parcel.dataAvail() > 0) {
            String string = parcel.readString();
            if (TextUtils.isEmpty(string) || (strArrSplit = string.split(",")) == null || strArrSplit.length != 3) {
                return;
            }
            this.f47050a = sg.bigo.ads.common.utils.q.a(strArrSplit[0], 2);
            this.f47051b = sg.bigo.ads.common.utils.q.a(strArrSplit[1], 3);
            this.f47052c = sg.bigo.ads.common.utils.q.a(strArrSplit[2], 5);
        }
    }

    @Override // sg.bigo.ads.api.a.g
    public final boolean a() {
        return this.f47050a == 2;
    }
}
