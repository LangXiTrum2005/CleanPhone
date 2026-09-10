package sg.bigo.ads.api.core;

import android.os.Parcel;
import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements sg.bigo.ads.api.a.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f47068a = 0;

    @Override // sg.bigo.ads.common.f
    public final void a(Parcel parcel) {
        parcel.writeString(String.valueOf(this.f47068a));
    }

    @Override // sg.bigo.ads.common.f
    public final void b(Parcel parcel) {
        if (parcel.dataAvail() > 0) {
            String string = parcel.readString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            String[] strArrSplit = string.split(",");
            if (strArrSplit.length > 0) {
                this.f47068a = sg.bigo.ads.common.utils.q.a(strArrSplit[0], 0);
            }
        }
    }

    @Override // sg.bigo.ads.api.a.o
    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f47068a = jSONObject.optInt("ll_on", 0);
        }
    }
}
