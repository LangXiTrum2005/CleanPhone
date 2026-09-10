package com.p004ironsource;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.p004ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class y2 implements Parcelable {
    public static final Parcelable.Creator<y2> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f27747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f27748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f27749c;
    private boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f27750e;
    private ArrayList<String> f;
    private ArrayList<String> g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList<String> f27751h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList<String> f27752i;
    private String j;
    private String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<String, String> f27753l;

    public class a implements Parcelable.Creator<y2> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public y2 createFromParcel(Parcel parcel) {
            return new y2(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public y2[] newArray(int i2) {
            return new y2[i2];
        }
    }

    public y2() {
        i();
    }

    private Map<String, String> a(String str) {
        IronLog ironLog;
        String string;
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
        } catch (JSONException e2) {
            q9.d().a(e2);
            ironLog = IronLog.INTERNAL;
            string = e2.toString();
            ironLog.error(string);
        } catch (Throwable th) {
            q9.d().a(th);
            ironLog = IronLog.INTERNAL;
            string = th.toString();
            ironLog.error(string);
        }
        return map;
    }

    private void i() {
        this.d = false;
        this.f27750e = -1;
        this.f = new ArrayList<>();
        this.g = new ArrayList<>();
        this.f27751h = new ArrayList<>();
        this.f27752i = new ArrayList<>();
        this.k = "";
        this.j = "";
        this.f27753l = new HashMap();
    }

    public String b() {
        return this.f27749c;
    }

    public int c() {
        return this.f27750e;
    }

    public String d() {
        return this.j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Map<String, String> e() {
        return this.f27753l;
    }

    public String f() {
        return this.k;
    }

    public String g() {
        return this.f27747a;
    }

    public String h() {
        return this.f27748b;
    }

    public void j(String str) {
        this.f27748b = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("shouldRestore:");
            sb.append(this.d);
            sb.append(", ");
            sb.append("displayedProduct:");
            sb.append(this.f27750e);
            sb.append(", ");
            sb.append("ISReportInit:");
            sb.append(this.f);
            sb.append(", ");
            sb.append("ISInitSuccess:");
            sb.append(this.g);
            sb.append(", ");
            sb.append("ISAppKey");
            sb.append(this.j);
            sb.append(", ");
            sb.append("ISUserId");
            sb.append(this.k);
            sb.append(", ");
            sb.append("ISExtraParams");
            sb.append(this.f27753l);
            sb.append(", ");
        } catch (Throwable th) {
            q9.d().a(th);
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        try {
            parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f27750e);
            parcel.writeString(this.f27747a);
            parcel.writeString(this.f27748b);
            parcel.writeString(this.f27749c);
            parcel.writeString(this.j);
            parcel.writeString(this.k);
            parcel.writeString(new JSONObject(this.f27753l).toString());
        } catch (Throwable th) {
            q9.d().a(th);
        }
    }

    private y2(Parcel parcel) {
        i();
        try {
            this.d = parcel.readByte() != 0;
            this.f27750e = parcel.readInt();
            this.f27747a = parcel.readString();
            this.f27748b = parcel.readString();
            this.f27749c = parcel.readString();
            this.j = parcel.readString();
            this.k = parcel.readString();
            this.f27753l = a(parcel.readString());
        } catch (Throwable th) {
            q9.d().a(th);
            i();
        }
    }

    public void a() {
        this.f27750e = -1;
    }

    public void b(String str, boolean z2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z2) {
            this.f27752i.remove(str);
        } else if (this.f27752i.indexOf(str) == -1) {
            this.f27752i.add(str);
        }
    }

    public void c(String str, boolean z2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z2) {
            this.f.remove(str);
        } else if (this.f.indexOf(str) == -1) {
            this.f.add(str);
        }
    }

    public void d(String str, boolean z2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z2) {
            this.f27751h.remove(str);
        } else if (this.f27751h.indexOf(str) == -1) {
            this.f27751h.add(str);
        }
    }

    public boolean e(String str) {
        return !TextUtils.isEmpty(str) && this.f27751h.indexOf(str) > -1;
    }

    public void f(String str) {
        this.f27749c = str;
    }

    public void g(String str) {
        this.j = str;
    }

    public void h(String str) {
        this.k = str;
    }

    public void i(String str) {
        this.f27747a = str;
    }

    public boolean j() {
        return this.d;
    }

    public /* synthetic */ y2(Parcel parcel, a aVar) {
        this(parcel);
    }

    public void a(int i2) {
        this.f27750e = i2;
    }

    public boolean b(String str) {
        return !TextUtils.isEmpty(str) && this.g.indexOf(str) > -1;
    }

    public boolean c(String str) {
        return !TextUtils.isEmpty(str) && this.f27752i.indexOf(str) > -1;
    }

    public boolean d(String str) {
        return !TextUtils.isEmpty(str) && this.f.indexOf(str) > -1;
    }

    public void a(String str, boolean z2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z2) {
            this.g.remove(str);
        } else if (this.g.indexOf(str) == -1) {
            this.g.add(str);
        }
    }

    public void a(Map<String, String> map) {
        this.f27753l = map;
    }

    public void a(boolean z2) {
        this.d = z2;
    }
}
