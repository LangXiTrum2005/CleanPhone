package com.ironsource;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class C3449c1 implements Parcelable {
    public static final Parcelable.Creator<C3449c1> CREATOR = new a();
    private String a;
    private String b;
    private String c;
    private boolean d;
    private int e;
    private ArrayList<String> f;
    private ArrayList<String> g;
    private ArrayList<String> h;
    private ArrayList<String> i;
    private String j;
    private String k;
    private Map<String, String> l;

    /* JADX INFO: renamed from: com.ironsource.c1$a */
    public class a implements Parcelable.Creator<C3449c1> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3449c1 createFromParcel(Parcel parcel) {
            return new C3449c1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3449c1[] newArray(int i) {
            return new C3449c1[i];
        }
    }

    private void i() {
        this.d = false;
        this.e = -1;
        this.f = new ArrayList<>();
        this.g = new ArrayList<>();
        this.h = new ArrayList<>();
        this.i = new ArrayList<>();
        this.k = "";
        this.j = "";
        this.l = new HashMap();
    }

    public void a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z) {
            this.g.remove(str);
        } else if (this.g.indexOf(str) == -1) {
            this.g.add(str);
        }
    }

    public boolean b(String str) {
        return !TextUtils.isEmpty(str) && this.g.indexOf(str) > -1;
    }

    public boolean c(String str) {
        return !TextUtils.isEmpty(str) && this.i.indexOf(str) > -1;
    }

    public String d() {
        return this.j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Map<String, String> e() {
        return this.l;
    }

    public String f() {
        return this.k;
    }

    public void g(String str) {
        this.j = str;
    }

    public void h(String str) {
        this.k = str;
    }

    public boolean j() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("shouldRestore:");
            sb.append(this.d);
            sb.append(", ");
            sb.append("displayedProduct:");
            sb.append(this.e);
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
            sb.append(this.l);
            sb.append(", ");
        } catch (Throwable th) {
            C3631m4.d().a(th);
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.e);
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.j);
            parcel.writeString(this.k);
            parcel.writeString(new JSONObject(this.l).toString());
        } catch (Throwable th) {
            C3631m4.d().a(th);
        }
    }

    public C3449c1() {
        i();
    }

    public boolean d(String str) {
        return !TextUtils.isEmpty(str) && this.f.indexOf(str) > -1;
    }

    public boolean e(String str) {
        return !TextUtils.isEmpty(str) && this.h.indexOf(str) > -1;
    }

    public void f(String str) {
        this.c = str;
    }

    public String g() {
        return this.a;
    }

    public String h() {
        return this.b;
    }

    public void j(String str) {
        this.b = str;
    }

    public String b() {
        return this.c;
    }

    public int c() {
        return this.e;
    }

    private C3449c1(Parcel parcel) {
        i();
        try {
            this.d = parcel.readByte() != 0;
            this.e = parcel.readInt();
            this.a = parcel.readString();
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.j = parcel.readString();
            this.k = parcel.readString();
            this.l = a(parcel.readString());
        } catch (Throwable th) {
            C3631m4.d().a(th);
            i();
        }
    }

    public void b(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z) {
            if (this.i.indexOf(str) == -1) {
                this.i.add(str);
                return;
            }
            return;
        }
        this.i.remove(str);
    }

    public void c(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z) {
            if (this.f.indexOf(str) == -1) {
                this.f.add(str);
                return;
            }
            return;
        }
        this.f.remove(str);
    }

    public void d(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z) {
            if (this.h.indexOf(str) == -1) {
                this.h.add(str);
                return;
            }
            return;
        }
        this.h.remove(str);
    }

    public void a(Map<String, String> map) {
        this.l = map;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public void a(int i) {
        this.e = i;
    }

    public void a() {
        this.e = -1;
    }

    private Map<String, String> a(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
        } catch (JSONException e) {
            C3631m4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        } catch (Throwable th) {
            C3631m4.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
        return map;
    }

    public void i(String str) {
        this.a = str;
    }
}
